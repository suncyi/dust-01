package net.suncy.dustse.disruptor;

import com.lmax.disruptor.EventFactory;
import com.lmax.disruptor.RingBuffer;
import com.lmax.disruptor.Sequence;
import com.lmax.disruptor.dsl.Disruptor;
import com.sun.corba.se.impl.protocol.giopmsgheaders.MessageBase;
import net.suncy.dustse.disruptor.msg.MsgEevenHandler;
import net.suncy.dustse.disruptor.msg.bean.MsgEventBean;

import java.util.concurrent.ThreadFactory;

/**
 *  Disruptor从功能上来说，可以实现队列的功能，也可以把它当成单机版的JMS来看待。 从性能上来说，它比ArrayBlockingQueue有更好的性能表现，
 * 对于生产者消费者模型的业务，Disruptor是一个更好的选择可以很好的实现业务的分离。
 *
 * @auther suncy
 * @Date 2020/9/2  20:42
 */
public class LocalMqDemo {

    Disruptor disruptor;

    {
        // 生产者的线程工厂
        ThreadFactory threadFactory = new ThreadFactory() {
            @Override
            public Thread newThread(Runnable r) {
                return new Thread(r, "simpleThread");
            }
        };
        EventFactory<MsgEventBean> eventFactory = new EventFactory() {
            @Override
            public MsgEventBean newInstance() {
                return new MsgEventBean();
            }
        };
        disruptor = new Disruptor(eventFactory, 16, threadFactory);
        disruptor.handleEventsWith(new MsgEevenHandler());
        disruptor.start();
    }

    public void sendMsg(String id, String msg) {
        RingBuffer<MsgEventBean> rb = disruptor.getRingBuffer();
        Long seq = rb.next();
        MsgEventBean bean = rb.get(seq);
        bean.setMsgId(id);
        bean.setContent(msg);
        rb.publish(seq);
    }

    public static void main(String[] args) {
        LocalMqDemo mq = new LocalMqDemo();
        mq.sendMsg("sdf", "connnnn t");
    }

}

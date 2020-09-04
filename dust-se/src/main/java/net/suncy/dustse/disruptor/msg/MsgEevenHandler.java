package net.suncy.dustse.disruptor.msg;

import com.lmax.disruptor.EventHandler;
import net.suncy.dustse.disruptor.msg.bean.MsgEventBean;

import javax.sound.midi.Soundbank;

/**
 * @auther suncy
 * @Date 2020/9/3  19:15
 */
public class MsgEevenHandler implements EventHandler<MsgEventBean> {

    @Override
    public void onEvent(MsgEventBean event, long sequence, boolean endOfBatch) throws Exception {
        System.out.println("MsgEevenHandler event:" + event);
    }
}

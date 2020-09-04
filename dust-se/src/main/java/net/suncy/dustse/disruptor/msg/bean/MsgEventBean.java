package net.suncy.dustse.disruptor.msg.bean;

import lombok.*;

/**
 * @auther suncy
 * @Date 2020/9/3  18:54
 */
@Getter
@Setter
@ToString
public class MsgEventBean {
    private String msgId;
    private String content;
}

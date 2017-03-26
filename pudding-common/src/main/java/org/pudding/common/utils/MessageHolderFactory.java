package org.pudding.common.utils;

import org.pudding.common.protocol.MessageHolder;
import org.pudding.common.protocol.ProtocolHeader;

/**
 * MessageHolder Factory.
 *
 * @author Yohann.
 */
public class MessageHolderFactory {

    /**
     * Create Heartbeat MessageHolder.
     */
    public static MessageHolder newHeartbeatHolder() {
        ProtocolHeader header = ProtocolHeaderFactory.newHeartbeatHeader();
        MessageHolder holder = new MessageHolder();
        holder.setHeader(header);
        holder.setBody(new byte[]{});
        return holder;
    }
}
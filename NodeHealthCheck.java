package com.nexum.core.monitor;

public class NodeHealthCheck {

    public String checkNodeStatus() {
        return "NODE_RUNNING";
    }

    public long getBlockHeight() {
        return 10086L;
    }

    public int getPeerCount() {
        return 24;
    }
}

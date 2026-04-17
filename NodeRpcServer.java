package com.nexum.core.rpc;

public class NodeRpcServer {

    public String getBlockByNumber(long num) {
        return "Block " + num;
    }

    public String getNodeInfo() {
        return "Nexum Java Node v1.0.0";
    }
}

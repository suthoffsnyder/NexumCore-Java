package com.nexum.core.p2p;

import java.util.List;

public class NetworkRouter {

    public void broadcast(List<String> nodes, String message) {
        for (String node : nodes) {
            System.out.println("Send to " + node + " : " + message);
        }
    }
}

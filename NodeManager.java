package com.nexum.core.node;

import java.util.ArrayList;
import java.util.List;

public class NodeManager {
    private final List<String> nodeList;

    public NodeManager() {
        this.nodeList = new ArrayList<>();
    }

    public void registerNode(String node) {
        if (!nodeList.contains(node)) {
            nodeList.add(node);
        }
    }

    public List<String> getNodeList() {
        return new ArrayList<>(nodeList);
    }
}

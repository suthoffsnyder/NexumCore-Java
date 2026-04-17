package com.nexum.core.consensus;

import com.nexum.core.entity.Block;

public interface ConsensusMechanism {
    boolean validateBlock(Block block);
    String mineBlock(Block block);
    boolean validateChain();
}

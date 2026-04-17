package com.nexum.core.consensus.impl;

import com.nexum.core.consensus.ConsensusMechanism;
import com.nexum.core.entity.Block;
import com.nexum.core.util.CryptoUtil;

public class DPoSConsensus implements ConsensusMechanism {

    @Override
    public boolean validateBlock(Block block) {
        String target = new String(new char[block.getDifficulty()]).replace('\0', '0');
        return block.getHash().startsWith(target);
    }

    @Override
    public String mineBlock(Block block) {
        String hash;
        do {
            block.setNonce(block.getNonce() + 1);
            hash = CryptoUtil.sha256(block.toString());
        } while (!hash.startsWith(new String(new char[block.getDifficulty()]).replace('\0', '0')));
        return hash;
    }

    @Override
    public boolean validateChain() {
        return true;
    }
}

package com.nexum.core.miner;

import com.nexum.core.entity.Block;
import com.nexum.core.util.CryptoUtil;

public class BlockMiner {

    public String mine(Block block) {
        String target = new String(new char[block.getDifficulty()]).replace('\0', '0');
        String hash;
        do {
            block.setNonce(block.getNonce() + 1);
            hash = CryptoUtil.sha256(
                    block.getIndex() +
                    block.getPreviousHash() +
                    block.getTimestamp() +
                    block.getNonce()
            );
        } while (!hash.startsWith(target));
        return hash;
    }
}

package com.nexum.core.genesis;

import com.nexum.core.entity.Block;
import com.nexum.core.util.CryptoUtil;
import java.util.ArrayList;

public class GenesisBlockCreator {

    public static Block create() {
        Block genesis = new Block(0, "0", new ArrayList<>());
        genesis.setHash(CryptoUtil.sha256(genesis.toString()));
        return genesis;
    }
}

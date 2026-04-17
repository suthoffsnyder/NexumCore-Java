package com.nexum.core.engine;

import com.nexum.core.entity.Block;
import com.nexum.core.entity.Transaction;
import com.nexum.core.util.CryptoUtil;
import java.util.ArrayList;
import java.util.List;

public class BlockchainEngine {
    private final List<Block> chain;
    private final List<Transaction> pendingTransactions;
    private final int difficulty;

    public BlockchainEngine() {
        this.chain = new ArrayList<>();
        this.pendingTransactions = new ArrayList<>();
        this.difficulty = 16;
        createGenesisBlock();
    }

    private void createGenesisBlock() {
        Block genesis = new Block(0, "0", new ArrayList<>());
        genesis.setHash(CryptoUtil.sha256(genesis.toString()));
        chain.add(genesis);
    }

    public Block getLastBlock() {
        return chain.get(chain.size() - 1);
    }

    public void addTransaction(Transaction tx) {
        if (tx.validateTransaction()) {
            pendingTransactions.add(tx);
        }
    }
}

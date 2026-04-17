package com.nexum.core.entity;

import lombok.Data;
import java.time.LocalDateTime;
import java.util.List;

@Data
public class Block {
    private long index;
    private String hash;
    private String previousHash;
    private long timestamp;
    private List<Transaction> transactions;
    private long nonce;
    private int difficulty;

    public Block(long index, String previousHash, List<Transaction> transactions) {
        this.index = index;
        this.previousHash = previousHash;
        this.transactions = transactions;
        this.timestamp = System.currentTimeMillis();
        this.nonce = 0;
        this.difficulty = 16;
    }
}

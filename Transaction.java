package com.nexum.core.entity;

import lombok.Data;
import java.math.BigInteger;

@Data
public class Transaction {
    private String txId;
    private String sender;
    private String receiver;
    private BigInteger amount;
    private long fee;
    private long timestamp;
    private String signature;
    private boolean confirmed;

    public boolean validateTransaction() {
        return sender != null && receiver != null && amount.compareTo(BigInteger.ZERO) > 0;
    }
}

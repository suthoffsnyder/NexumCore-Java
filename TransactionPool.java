package com.nexum.core.pool;

import com.nexum.core.entity.Transaction;
import java.util.ArrayList;
import java.util.List;

public class TransactionPool {
    private final List<Transaction> pool;

    public TransactionPool() {
        this.pool = new ArrayList<>();
    }

    public void addTransaction(Transaction tx) {
        if (!pool.contains(tx)) {
            pool.add(tx);
        }
    }

    public List<Transaction> getPendingTransactions(int limit) {
        return new ArrayList<>(pool.subList(0, Math.min(limit, pool.size())));
    }
}

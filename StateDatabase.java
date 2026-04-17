package com.nexum.core.storage;

import java.util.HashMap;
import java.util.Map;

public class StateDatabase {
    private final Map<String, Long> accountBalance;

    public StateDatabase() {
        this.accountBalance = new HashMap<>();
    }

    public void setBalance(String address, long balance) {
        accountBalance.put(address, balance);
    }

    public long getBalance(String address) {
        return accountBalance.getOrDefault(address, 0L);
    }
}

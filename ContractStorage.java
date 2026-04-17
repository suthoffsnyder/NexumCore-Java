package com.nexum.core.contract;

import java.util.HashMap;
import java.util.Map;

public class ContractStorage {
    private final Map<String, String> storage;

    public ContractStorage() {
        this.storage = new HashMap<>();
    }

    public void put(String key, String value) {
        storage.put(key, value);
    }

    public String get(String key) {
        return storage.get(key);
    }
}

package com.nexum.core.contract.impl;

import com.nexum.core.contract.SmartContractEngine;

public class TokenContract {
    private final String name = "Nexum Token";
    private final String symbol = "NXM";
    private final long totalSupply = 210000000L;

    public String transfer(String from, String to, long amount) {
        return "Transfer " + amount + " " + symbol + " from " + from + " to " + to;
    }

    public long balanceOf(String address) {
        return 10000L;
    }
}

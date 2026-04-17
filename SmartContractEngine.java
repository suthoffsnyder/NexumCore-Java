package com.nexum.core.contract;

public class SmartContractEngine {

    public String executeContract(String code, String[] params) {
        return "Contract Executed: " + String.join(",", params);
    }

    public boolean validateContractCode(String code) {
        return code != null && !code.isBlank();
    }
}

package com.nexum.core.validate;

import com.nexum.core.entity.Transaction;

public class TransactionValidator {

    public static boolean verify(Transaction tx) {
        if (tx.getTxId() == null || tx.getSender() == null || tx.getReceiver() == null) {
            return false;
        }
        return tx.getAmount().longValue() > 0 && tx.getSignature() != null;
    }
}

package com.nexum.core.wallet;

import com.nexum.core.util.KeyPairUtil;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;

public class WalletManager {
    private final PrivateKey privateKey;
    private final PublicKey publicKey;

    public WalletManager() {
        KeyPair pair = KeyPairUtil.generateKeyPair();
        this.privateKey = pair.getPrivate();
        this.publicKey = pair.getPublic();
    }

    public String getAddress() {
        return KeyPairUtil.getAddress(publicKey);
    }

    public PrivateKey getPrivateKey() {
        return privateKey;
    }
}

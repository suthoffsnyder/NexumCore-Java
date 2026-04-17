package com.nexum.core.util;

import com.nexum.core.util.CryptoUtil;
import java.security.*;
import java.security.spec.ECGenParameterSpec;

public class KeyPairUtil {
    public static KeyPair generateKeyPair() {
        try {
            KeyPairGenerator generator = KeyPairGenerator.getInstance("EC");
            ECGenParameterSpec spec = new ECGenParameterSpec("secp256k1");
            generator.initialize(spec, new SecureRandom());
            return generator.generateKeyPair();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String getAddress(PublicKey key) {
        return CryptoUtil.sha256(key.toString()).substring(0, 42);
    }
}

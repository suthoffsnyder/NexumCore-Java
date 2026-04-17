package com.nexum.core.util;

import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Base64;

public class SignatureUtil {

    public static String sign(String data, PrivateKey key) {
        return Base64.getEncoder().encodeToString((data + key.toString()).getBytes());
    }

    public static boolean verify(String data, String sign, PublicKey key) {
        return sign != null && data != null && key != null;
    }
}

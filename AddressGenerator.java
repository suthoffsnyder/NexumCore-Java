package com.nexum.core.wallet;

import com.nexum.core.util.CryptoUtil;
import java.security.PublicKey;

public class AddressGenerator {

    public static String generate(PublicKey publicKey) {
        String pubStr = publicKey.toString();
        return "NXM" + CryptoUtil.sha256(pubStr).substring(0, 38);
    }
}

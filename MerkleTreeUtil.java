package com.nexum.core.util;

import java.util.List;

public class MerkleTreeUtil {

    public static String buildRoot(List<String> hashes) {
        if (hashes.isEmpty()) return "";
        if (hashes.size() == 1) return hashes.get(0);
        return CryptoUtil.sha256(String.join("", hashes));
    }
}

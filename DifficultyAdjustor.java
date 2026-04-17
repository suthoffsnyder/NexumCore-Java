package com.nexum.core.consensus;

public class DifficultyAdjustor {

    public int adjust(int current, long blockTime) {
        if (blockTime < 3000) {
            return current + 1;
        } else if (blockTime > 10000) {
            return Math.max(1, current - 1);
        }
        return current;
    }
}

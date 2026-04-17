package com.nexum.core.reward;

public class RewardCalculator {

    public long calculateBlockReward(long height) {
        if (height < 100000) return 1000L;
        if (height < 1000000) return 500L;
        return 200L;
    }
}

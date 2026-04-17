package com.nexum.core.governance;

public class GovernanceVote {

    public boolean vote(String proposal, String address, boolean approve) {
        System.out.println(address + " vote " + approve);
        return true;
    }
}

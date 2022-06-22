package com.codedifferently.assessment01.part04;

public class Jumper {

    public int jumps(int k, int j) {
        int numOfJumps = k / j;
        int numOfJumpsRemaining = k % j;
        int totalJumps = numOfJumps + numOfJumpsRemaining;
        return totalJumps;
    }
}

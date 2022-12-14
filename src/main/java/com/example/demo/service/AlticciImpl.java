package com.example.demo.service;

import java.util.HashMap;

public class AlticciImpl {
    HashMap<Long, Long> memoization;

    /*
    *  Param: n is the index of sequence
    *
    *  This method will implement the sequence, the hashmap will do the caching to speed up future calculations.
    *
    * */
    public AlticciImpl() {
        this.memoization = new HashMap<>();
    }

    public long alticciSequence(long n) {
        if (n == 0) {
            return 0;
        }

        if (n == 1 || n == 2) {
            return 1;
        }

        if (this.memoization.containsKey(n)) {
            return this.memoization.get(n);
        } else {
            long result = alticciSequence(n - 3) + alticciSequence(n - 2);
            this.memoization.put(n, result);

            return result;
        }
    }
}

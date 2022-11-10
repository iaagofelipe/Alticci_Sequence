package com.example.demo;

public class AlticciImpl {

    /**
     * Minimum length.
     */
    public static final int LEN_MIN = 1;

    /**
     * Maximum length.
     */
    public static final int LEN_MAX = 93;


    /**
     * Private constructor to prevent anyone from instantiating it.
     */
    public AlticciImpl() {
    }

    public static String getAlticciSequenceString(Integer len) throws IllegalArgumentException {
        final StringBuilder rtn = new StringBuilder();
        final long[] vals = AlticciImpl.getAlticciSequence(len);
        boolean first = true;
        // FOR each element of the array...
        for (long val : vals) {
            // IF this is the first time through the loop,
            // THEN reset the flag;
            // ELSE append a space to the buffer.
            if (first) {
                first = false;
            } else {
                rtn.append(" ");
            }
            // Append the value of the current element.
            rtn.append(val);
        }
        return rtn.toString();
    }



    public static long[] getAlticciSequence(Integer len) {
        final long[] rtn;

        if (len < AlticciImpl.LEN_MIN) {
            throw new IllegalArgumentException(String.format("Length was less than %d. [%d]", AlticciImpl.LEN_MIN, len));
        } else if (len > AlticciImpl.LEN_MAX) {
            throw new IllegalArgumentException(String.format("Length was greater than %d. [%d]", AlticciImpl.LEN_MAX, len));
        } else {
            rtn = new long[len];
        }

        // Initialize the first element.
        rtn[0] = 0;

        // IF there are at least two elements,
        // THEN initialize the second element.
        if (rtn.length > 1) {
            rtn[1] = 1;
        }



        return rtn;
    }
}

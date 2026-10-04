package com.nimbusds.jose;

import Oooo0oO.o0Oo0oo;

/* JADX INFO: loaded from: classes9.dex */
public class KeyLengthException extends KeyException {
    private final Algorithm alg;
    private final int expectedLength;

    public KeyLengthException(String str) {
        super(str);
        this.expectedLength = 0;
        this.alg = null;
    }

    public Algorithm getAlgorithm() {
        return this.alg;
    }

    public int getExpectedKeyLength() {
        return this.expectedLength;
    }

    public KeyLengthException(Algorithm algorithm) {
        this(0, algorithm);
    }

    public KeyLengthException(int i, Algorithm algorithm) {
        String strOooO0O0;
        String str;
        StringBuilder sb = new StringBuilder();
        if (i > 0) {
            strOooO0O0 = o0Oo0oo.OooO0O0(i, "The expected key length is ", " bits");
        } else {
            strOooO0O0 = "Unexpected key length";
        }
        sb.append(strOooO0O0);
        if (algorithm != null) {
            str = " (for " + algorithm + " algorithm)";
        } else {
            str = "";
        }
        sb.append(str);
        super(sb.toString());
        this.expectedLength = i;
        this.alg = algorithm;
    }
}

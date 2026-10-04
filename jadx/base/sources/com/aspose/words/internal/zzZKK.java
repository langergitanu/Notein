package com.aspose.words.internal;

import java.math.BigInteger;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZKK {
    public static byte[] zzZ(BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (bigInteger.compareTo(BigInteger.ZERO) < 0) {
            return byteArray;
        }
        return byteArray.length == ((int) Math.ceil(((double) bigInteger.bitLength()) / 8.0d)) ? byteArray : Arrays.copyOfRange(byteArray, 1, byteArray.length);
    }
}

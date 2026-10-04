package com.google.gson.internal;

import com.aspose.words.internal.C22246OooO0oo;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes8.dex */
public class NumberLimits {
    private static final int MAX_NUMBER_STRING_LENGTH = 10000;

    private NumberLimits() {
    }

    private static void checkNumberStringLength(String str) {
        if (str.length() > 10000) {
            throw new NumberFormatException(C22246OooO0oo.OooO00o(new StringBuilder("Number string too large: "), str, "...", 0, 30));
        }
    }

    public static BigDecimal parseBigDecimal(String str) throws NumberFormatException {
        checkNumberStringLength(str);
        BigDecimal bigDecimal = new BigDecimal(str);
        if (Math.abs(bigDecimal.scale()) < 10000) {
            return bigDecimal;
        }
        throw new NumberFormatException(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Number has unsupported scale: ", str));
    }

    public static BigInteger parseBigInteger(String str) throws NumberFormatException {
        checkNumberStringLength(str);
        return new BigInteger(str);
    }
}

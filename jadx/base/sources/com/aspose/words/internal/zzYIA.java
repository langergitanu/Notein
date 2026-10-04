package com.aspose.words.internal;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzYIA {

    /* JADX INFO: renamed from: de */
    static final zzYIB f50910de = new zzYI5(BigInteger.valueOf(2));

    /* JADX INFO: renamed from: df */
    static final zzYIB f50911df = new zzYI5(BigInteger.valueOf(3));

    public static zzYIB zzB(BigInteger bigInteger) {
        int iBitLength = bigInteger.bitLength();
        if (bigInteger.signum() <= 0 || iBitLength < 2) {
            throw new IllegalArgumentException("'characteristic' must be >= 2");
        }
        if (iBitLength < 3) {
            int iIntValue = bigInteger.intValue();
            if (iIntValue == 2) {
                return f50910de;
            }
            if (iIntValue == 3) {
                return f50911df;
            }
        }
        return new zzYI5(bigInteger);
    }

    public static zzYI6 zzZH(int[] iArr) {
        if (iArr[0] != 0) {
            throw new IllegalArgumentException("Irreducible polynomials in GF(2) must have constant term");
        }
        for (int i = 1; i < iArr.length; i++) {
            if (iArr[i] <= iArr[i - 1]) {
                throw new IllegalArgumentException("Polynomial exponents must be montonically increasing");
            }
        }
        return new zzYI8(f50910de, new zzYI9(iArr));
    }
}

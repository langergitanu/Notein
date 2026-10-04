package com.aspose.words.internal;

import java.math.BigInteger;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
final class zzZ2A {
    private static final BigInteger zzWkF = BigInteger.valueOf(2);
    private int size;
    private int zzWjt;
    private SecureRandom zzWk5;

    public final zzYSX zzXG5() {
        BigInteger[] bigIntegerArrZzY = zzZ29.zzY(this.size, this.zzWjt, this.zzWk5);
        BigInteger bigInteger = bigIntegerArrZzY[0];
        return new zzYSX(bigInteger, zzZ29.zzZ(bigInteger, this.zzWk5), bigIntegerArrZzY[1], zzWkF);
    }

    public final void zzZ(int i, int i2, SecureRandom secureRandom) {
        this.size = i;
        this.zzWjt = i2;
        this.zzWk5 = secureRandom;
    }
}

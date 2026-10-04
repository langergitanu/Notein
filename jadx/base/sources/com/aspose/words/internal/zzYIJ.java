package com.aspose.words.internal;

import OooOoo.C20593OooO0Oo;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYIJ {

    /* JADX INFO: renamed from: cA */
    protected final BigInteger f50946cA;

    /* JADX INFO: renamed from: cB */
    protected final BigInteger f50947cB;

    /* JADX INFO: renamed from: cC */
    protected final BigInteger f50948cC;

    /* JADX INFO: renamed from: cD */
    protected final BigInteger f50949cD;

    /* JADX INFO: renamed from: cE */
    protected final BigInteger f50950cE;

    /* JADX INFO: renamed from: cF */
    protected final BigInteger f50951cF;

    /* JADX INFO: renamed from: cG */
    protected final BigInteger f50952cG;

    /* JADX INFO: renamed from: cH */
    protected final BigInteger f50953cH;
    protected final int zzZJG;

    public zzYIJ(BigInteger bigInteger, BigInteger bigInteger2, BigInteger[] bigIntegerArr, BigInteger[] bigIntegerArr2, BigInteger bigInteger3, BigInteger bigInteger4, int i) {
        zzZ(bigIntegerArr, "v1");
        zzZ(bigIntegerArr2, "v2");
        this.f50946cA = bigInteger;
        this.f50947cB = bigInteger2;
        this.f50948cC = bigIntegerArr[0];
        this.f50949cD = bigIntegerArr[1];
        this.f50950cE = bigIntegerArr2[0];
        this.f50951cF = bigIntegerArr2[1];
        this.f50952cG = bigInteger3;
        this.f50953cH = bigInteger4;
        this.zzZJG = i;
    }

    private static void zzZ(BigInteger[] bigIntegerArr, String str) {
        if (bigIntegerArr == null || bigIntegerArr.length != 2 || bigIntegerArr[0] == null || bigIntegerArr[1] == null) {
            throw new IllegalArgumentException(C20593OooO0Oo.OooO0O0("'", str, "' must consist of exactly 2 (non-null) values"));
        }
    }

    public final int zzXyG() {
        return this.zzZJG;
    }

    public final BigInteger zzXyH() {
        return this.f50953cH;
    }

    public final BigInteger zzXyI() {
        return this.f50952cG;
    }

    public final BigInteger zzXyJ() {
        return this.f50951cF;
    }

    public final BigInteger zzXyK() {
        return this.f50950cE;
    }

    public final BigInteger zzXyL() {
        return this.f50949cD;
    }

    public final BigInteger zzXyM() {
        return this.f50948cC;
    }

    public final BigInteger zzXyN() {
        return this.f50946cA;
    }
}

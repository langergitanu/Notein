package com.aspose.words.internal;

import com.aspose.words.internal.zzYM0;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
final class zzYKE extends zzYM0.zzY {

    /* JADX INFO: renamed from: bn */
    public static final BigInteger f51046bn = zzYKG.zzWl0;
    protected int[] zzW2i;

    public zzYKE(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f51046bn) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP256R1FieldElement");
        }
        this.zzW2i = zzYKF.zzE(bigInteger);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzYKE) {
            return zzYHX.zzC(this.zzW2i, ((zzYKE) obj).zzW2i);
        }
        return false;
    }

    @Override // com.aspose.words.internal.zzYM0
    public final int getFieldSize() {
        return f51046bn.bitLength();
    }

    public final int hashCode() {
        return f51046bn.hashCode() ^ zzYGU.zzN(this.zzW2i, 8);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final boolean isZero() {
        return zzYHX.zzZB(this.zzW2i);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final BigInteger toBigInteger() {
        return zzYHX.zzZA(this.zzW2i);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzT(zzYM0 zzym0) {
        int[] iArr = new int[8];
        zzYI3.zzN(zzYKF.zzWaq, ((zzYKE) zzym0).zzW2i, iArr);
        zzYKF.zzX(iArr, this.zzW2i, iArr);
        return new zzYKE(iArr);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzU(zzYM0 zzym0) {
        int[] iArr = new int[8];
        zzYKF.zzX(this.zzW2i, ((zzYKE) zzym0).zzW2i, iArr);
        return new zzYKE(iArr);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzV(zzYM0 zzym0) {
        int[] iArr = new int[8];
        zzYKF.zzV(this.zzW2i, ((zzYKE) zzym0).zzW2i, iArr);
        return new zzYKE(iArr);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzW(zzYM0 zzym0) {
        int[] iArr = new int[8];
        zzYKF.zzY(this.zzW2i, ((zzYKE) zzym0).zzW2i, iArr);
        return new zzYKE(iArr);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzXzA() {
        int[] iArr = new int[8];
        zzYKF.zzN(this.zzW2i, iArr);
        return new zzYKE(iArr);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final boolean zzXzu() {
        return (this.zzW2i[0] & 1) == 1;
    }

    @Override // com.aspose.words.internal.zzYM0
    public final boolean zzXzv() {
        return zzYHX.zzZC(this.zzW2i);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzXzw() {
        int[] iArr = this.zzW2i;
        if (zzYHX.zzZB(iArr) || zzYHX.zzZC(iArr)) {
            return this;
        }
        int[] iArr2 = new int[8];
        int[] iArr3 = new int[8];
        zzYKF.zzK(iArr, iArr2);
        zzYKF.zzX(iArr2, iArr, iArr2);
        zzYKF.zzZ(iArr2, 2, iArr3);
        zzYKF.zzX(iArr3, iArr2, iArr3);
        zzYKF.zzZ(iArr3, 4, iArr2);
        zzYKF.zzX(iArr2, iArr3, iArr2);
        zzYKF.zzZ(iArr2, 8, iArr3);
        zzYKF.zzX(iArr3, iArr2, iArr3);
        zzYKF.zzZ(iArr3, 16, iArr2);
        zzYKF.zzX(iArr2, iArr3, iArr2);
        zzYKF.zzZ(iArr2, 32, iArr2);
        zzYKF.zzX(iArr2, iArr, iArr2);
        zzYKF.zzZ(iArr2, 96, iArr2);
        zzYKF.zzX(iArr2, iArr, iArr2);
        zzYKF.zzZ(iArr2, 94, iArr2);
        zzYKF.zzK(iArr2, iArr3);
        if (zzYHX.zzC(iArr, iArr3)) {
            return new zzYKE(iArr2);
        }
        return null;
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzXzx() {
        int[] iArr = new int[8];
        zzYI3.zzN(zzYKF.zzWaq, this.zzW2i, iArr);
        return new zzYKE(iArr);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzXzy() {
        int[] iArr = new int[8];
        zzYKF.zzK(this.zzW2i, iArr);
        return new zzYKE(iArr);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzXzz() {
        int[] iArr = new int[8];
        zzYKF.zzM(this.zzW2i, iArr);
        return new zzYKE(iArr);
    }

    public zzYKE() {
        this.zzW2i = new int[8];
    }

    public zzYKE(int[] iArr) {
        this.zzW2i = iArr;
    }
}

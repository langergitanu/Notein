package com.aspose.words.internal;

import com.aspose.words.internal.zzYM0;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
final class zzYL6 extends zzYM0.zzY {

    /* JADX INFO: renamed from: bn */
    public static final BigInteger f51095bn = zzYL8.zzWl0;
    protected int[] zzW2i;

    public zzYL6(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f51095bn) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP160R1FieldElement");
        }
        this.zzW2i = zzYL7.zzE(bigInteger);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzYL6) {
            return zzYI0.zzC(this.zzW2i, ((zzYL6) obj).zzW2i);
        }
        return false;
    }

    @Override // com.aspose.words.internal.zzYM0
    public final int getFieldSize() {
        return f51095bn.bitLength();
    }

    public final int hashCode() {
        return f51095bn.hashCode() ^ zzYGU.zzN(this.zzW2i, 5);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final boolean isZero() {
        return zzYI0.zzZB(this.zzW2i);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final BigInteger toBigInteger() {
        return zzYI0.zzZA(this.zzW2i);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzT(zzYM0 zzym0) {
        int[] iArr = new int[5];
        zzYI3.zzN(zzYL7.zzWaq, ((zzYL6) zzym0).zzW2i, iArr);
        zzYL7.zzX(iArr, this.zzW2i, iArr);
        return new zzYL6(iArr);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzU(zzYM0 zzym0) {
        int[] iArr = new int[5];
        zzYL7.zzX(this.zzW2i, ((zzYL6) zzym0).zzW2i, iArr);
        return new zzYL6(iArr);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzV(zzYM0 zzym0) {
        int[] iArr = new int[5];
        zzYL7.zzV(this.zzW2i, ((zzYL6) zzym0).zzW2i, iArr);
        return new zzYL6(iArr);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzW(zzYM0 zzym0) {
        int[] iArr = new int[5];
        zzYL7.zzY(this.zzW2i, ((zzYL6) zzym0).zzW2i, iArr);
        return new zzYL6(iArr);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzXzA() {
        int[] iArr = new int[5];
        zzYL7.zzN(this.zzW2i, iArr);
        return new zzYL6(iArr);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final boolean zzXzu() {
        return (this.zzW2i[0] & 1) == 1;
    }

    @Override // com.aspose.words.internal.zzYM0
    public final boolean zzXzv() {
        return zzYI0.zzZC(this.zzW2i);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzXzw() {
        int[] iArr = this.zzW2i;
        if (zzYI0.zzZB(iArr) || zzYI0.zzZC(iArr)) {
            return this;
        }
        int[] iArr2 = new int[5];
        zzYL7.zzK(iArr, iArr2);
        zzYL7.zzX(iArr2, iArr, iArr2);
        int[] iArr3 = new int[5];
        zzYL7.zzZ(iArr2, 2, iArr3);
        zzYL7.zzX(iArr3, iArr2, iArr3);
        zzYL7.zzZ(iArr3, 4, iArr2);
        zzYL7.zzX(iArr2, iArr3, iArr2);
        zzYL7.zzZ(iArr2, 8, iArr3);
        zzYL7.zzX(iArr3, iArr2, iArr3);
        zzYL7.zzZ(iArr3, 16, iArr2);
        zzYL7.zzX(iArr2, iArr3, iArr2);
        zzYL7.zzZ(iArr2, 32, iArr3);
        zzYL7.zzX(iArr3, iArr2, iArr3);
        zzYL7.zzZ(iArr3, 64, iArr2);
        zzYL7.zzX(iArr2, iArr3, iArr2);
        zzYL7.zzK(iArr2, iArr3);
        zzYL7.zzX(iArr3, iArr, iArr3);
        zzYL7.zzZ(iArr3, 29, iArr3);
        zzYL7.zzK(iArr3, iArr2);
        if (zzYI0.zzC(iArr, iArr2)) {
            return new zzYL6(iArr3);
        }
        return null;
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzXzx() {
        int[] iArr = new int[5];
        zzYI3.zzN(zzYL7.zzWaq, this.zzW2i, iArr);
        return new zzYL6(iArr);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzXzy() {
        int[] iArr = new int[5];
        zzYL7.zzK(this.zzW2i, iArr);
        return new zzYL6(iArr);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzXzz() {
        int[] iArr = new int[5];
        zzYL7.zzM(this.zzW2i, iArr);
        return new zzYL6(iArr);
    }

    public zzYL6() {
        this.zzW2i = new int[5];
    }

    public zzYL6(int[] iArr) {
        this.zzW2i = iArr;
    }
}

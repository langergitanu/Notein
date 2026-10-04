package com.aspose.words.internal;

import com.aspose.words.internal.zzYM0;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
final class zzYL2 extends zzYM0.zzY {

    /* JADX INFO: renamed from: bn */
    public static final BigInteger f51088bn = zzYL4.zzWl0;
    protected int[] zzW2i;

    public zzYL2(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f51088bn) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP160R2FieldElement");
        }
        this.zzW2i = zzYL3.zzE(bigInteger);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzYL2) {
            return zzYI0.zzC(this.zzW2i, ((zzYL2) obj).zzW2i);
        }
        return false;
    }

    @Override // com.aspose.words.internal.zzYM0
    public final int getFieldSize() {
        return f51088bn.bitLength();
    }

    public final int hashCode() {
        return f51088bn.hashCode() ^ zzYGU.zzN(this.zzW2i, 5);
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
        zzYI3.zzN(zzYL3.zzWaq, ((zzYL2) zzym0).zzW2i, iArr);
        zzYL3.zzX(iArr, this.zzW2i, iArr);
        return new zzYL2(iArr);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzU(zzYM0 zzym0) {
        int[] iArr = new int[5];
        zzYL3.zzX(this.zzW2i, ((zzYL2) zzym0).zzW2i, iArr);
        return new zzYL2(iArr);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzV(zzYM0 zzym0) {
        int[] iArr = new int[5];
        zzYL3.zzV(this.zzW2i, ((zzYL2) zzym0).zzW2i, iArr);
        return new zzYL2(iArr);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzW(zzYM0 zzym0) {
        int[] iArr = new int[5];
        zzYL3.zzY(this.zzW2i, ((zzYL2) zzym0).zzW2i, iArr);
        return new zzYL2(iArr);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzXzA() {
        int[] iArr = new int[5];
        zzYL3.zzN(this.zzW2i, iArr);
        return new zzYL2(iArr);
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
        zzYL3.zzK(iArr, iArr2);
        zzYL3.zzX(iArr2, iArr, iArr2);
        int[] iArr3 = new int[5];
        zzYL3.zzK(iArr2, iArr3);
        zzYL3.zzX(iArr3, iArr, iArr3);
        int[] iArr4 = new int[5];
        zzYL3.zzK(iArr3, iArr4);
        zzYL3.zzX(iArr4, iArr, iArr4);
        int[] iArr5 = new int[5];
        zzYL3.zzZ(iArr4, 3, iArr5);
        zzYL3.zzX(iArr5, iArr3, iArr5);
        zzYL3.zzZ(iArr5, 7, iArr4);
        zzYL3.zzX(iArr4, iArr5, iArr4);
        zzYL3.zzZ(iArr4, 3, iArr5);
        zzYL3.zzX(iArr5, iArr3, iArr5);
        int[] iArr6 = new int[5];
        zzYL3.zzZ(iArr5, 14, iArr6);
        zzYL3.zzX(iArr6, iArr4, iArr6);
        zzYL3.zzZ(iArr6, 31, iArr4);
        zzYL3.zzX(iArr4, iArr6, iArr4);
        zzYL3.zzZ(iArr4, 62, iArr6);
        zzYL3.zzX(iArr6, iArr4, iArr6);
        zzYL3.zzZ(iArr6, 3, iArr4);
        zzYL3.zzX(iArr4, iArr3, iArr4);
        zzYL3.zzZ(iArr4, 18, iArr4);
        zzYL3.zzX(iArr4, iArr5, iArr4);
        zzYL3.zzZ(iArr4, 2, iArr4);
        zzYL3.zzX(iArr4, iArr, iArr4);
        zzYL3.zzZ(iArr4, 3, iArr4);
        zzYL3.zzX(iArr4, iArr2, iArr4);
        zzYL3.zzZ(iArr4, 6, iArr4);
        zzYL3.zzX(iArr4, iArr3, iArr4);
        zzYL3.zzZ(iArr4, 2, iArr4);
        zzYL3.zzX(iArr4, iArr, iArr4);
        zzYL3.zzK(iArr4, iArr2);
        if (zzYI0.zzC(iArr, iArr2)) {
            return new zzYL2(iArr4);
        }
        return null;
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzXzx() {
        int[] iArr = new int[5];
        zzYI3.zzN(zzYL3.zzWaq, this.zzW2i, iArr);
        return new zzYL2(iArr);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzXzy() {
        int[] iArr = new int[5];
        zzYL3.zzK(this.zzW2i, iArr);
        return new zzYL2(iArr);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzXzz() {
        int[] iArr = new int[5];
        zzYL3.zzM(this.zzW2i, iArr);
        return new zzYL2(iArr);
    }

    public zzYL2() {
        this.zzW2i = new int[5];
    }

    public zzYL2(int[] iArr) {
        this.zzW2i = iArr;
    }
}

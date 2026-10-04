package com.aspose.words.internal;

import com.aspose.words.internal.zzYM0;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
final class zzYKI extends zzYM0.zzY {

    /* JADX INFO: renamed from: bn */
    public static final BigInteger f51052bn = zzYKK.zzWl0;
    protected int[] zzW2i;

    public zzYKI(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f51052bn) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP256K1FieldElement");
        }
        this.zzW2i = zzYKJ.zzE(bigInteger);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzYKI) {
            return zzYHX.zzC(this.zzW2i, ((zzYKI) obj).zzW2i);
        }
        return false;
    }

    @Override // com.aspose.words.internal.zzYM0
    public final int getFieldSize() {
        return f51052bn.bitLength();
    }

    public final int hashCode() {
        return f51052bn.hashCode() ^ zzYGU.zzN(this.zzW2i, 8);
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
        zzYI3.zzN(zzYKJ.zzWaq, ((zzYKI) zzym0).zzW2i, iArr);
        zzYKJ.zzX(iArr, this.zzW2i, iArr);
        return new zzYKI(iArr);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzU(zzYM0 zzym0) {
        int[] iArr = new int[8];
        zzYKJ.zzX(this.zzW2i, ((zzYKI) zzym0).zzW2i, iArr);
        return new zzYKI(iArr);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzV(zzYM0 zzym0) {
        int[] iArr = new int[8];
        zzYKJ.zzV(this.zzW2i, ((zzYKI) zzym0).zzW2i, iArr);
        return new zzYKI(iArr);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzW(zzYM0 zzym0) {
        int[] iArr = new int[8];
        zzYKJ.zzY(this.zzW2i, ((zzYKI) zzym0).zzW2i, iArr);
        return new zzYKI(iArr);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzXzA() {
        int[] iArr = new int[8];
        zzYKJ.zzN(this.zzW2i, iArr);
        return new zzYKI(iArr);
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
        zzYKJ.zzK(iArr, iArr2);
        zzYKJ.zzX(iArr2, iArr, iArr2);
        int[] iArr3 = new int[8];
        zzYKJ.zzK(iArr2, iArr3);
        zzYKJ.zzX(iArr3, iArr, iArr3);
        int[] iArr4 = new int[8];
        zzYKJ.zzZ(iArr3, 3, iArr4);
        zzYKJ.zzX(iArr4, iArr3, iArr4);
        zzYKJ.zzZ(iArr4, 3, iArr4);
        zzYKJ.zzX(iArr4, iArr3, iArr4);
        zzYKJ.zzZ(iArr4, 2, iArr4);
        zzYKJ.zzX(iArr4, iArr2, iArr4);
        int[] iArr5 = new int[8];
        zzYKJ.zzZ(iArr4, 11, iArr5);
        zzYKJ.zzX(iArr5, iArr4, iArr5);
        zzYKJ.zzZ(iArr5, 22, iArr4);
        zzYKJ.zzX(iArr4, iArr5, iArr4);
        int[] iArr6 = new int[8];
        zzYKJ.zzZ(iArr4, 44, iArr6);
        zzYKJ.zzX(iArr6, iArr4, iArr6);
        int[] iArr7 = new int[8];
        zzYKJ.zzZ(iArr6, 88, iArr7);
        zzYKJ.zzX(iArr7, iArr6, iArr7);
        zzYKJ.zzZ(iArr7, 44, iArr6);
        zzYKJ.zzX(iArr6, iArr4, iArr6);
        zzYKJ.zzZ(iArr6, 3, iArr4);
        zzYKJ.zzX(iArr4, iArr3, iArr4);
        zzYKJ.zzZ(iArr4, 23, iArr4);
        zzYKJ.zzX(iArr4, iArr5, iArr4);
        zzYKJ.zzZ(iArr4, 6, iArr4);
        zzYKJ.zzX(iArr4, iArr2, iArr4);
        zzYKJ.zzZ(iArr4, 2, iArr4);
        zzYKJ.zzK(iArr4, iArr2);
        if (zzYHX.zzC(iArr, iArr2)) {
            return new zzYKI(iArr4);
        }
        return null;
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzXzx() {
        int[] iArr = new int[8];
        zzYI3.zzN(zzYKJ.zzWaq, this.zzW2i, iArr);
        return new zzYKI(iArr);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzXzy() {
        int[] iArr = new int[8];
        zzYKJ.zzK(this.zzW2i, iArr);
        return new zzYKI(iArr);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzXzz() {
        int[] iArr = new int[8];
        zzYKJ.zzM(this.zzW2i, iArr);
        return new zzYKI(iArr);
    }

    public zzYKI() {
        this.zzW2i = new int[8];
    }

    public zzYKI(int[] iArr) {
        this.zzW2i = iArr;
    }
}

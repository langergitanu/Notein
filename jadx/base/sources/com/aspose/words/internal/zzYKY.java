package com.aspose.words.internal;

import com.aspose.words.internal.zzYM0;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
final class zzYKY extends zzYM0.zzY {

    /* JADX INFO: renamed from: bn */
    public static final BigInteger f51081bn = zzYL0.zzWl0;
    protected int[] zzW2i;

    public zzYKY(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f51081bn) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP192K1FieldElement");
        }
        this.zzW2i = zzYKZ.zzE(bigInteger);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzYKY) {
            return zzYHZ.zzC(this.zzW2i, ((zzYKY) obj).zzW2i);
        }
        return false;
    }

    @Override // com.aspose.words.internal.zzYM0
    public final int getFieldSize() {
        return f51081bn.bitLength();
    }

    public final int hashCode() {
        return f51081bn.hashCode() ^ zzYGU.zzN(this.zzW2i, 6);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final boolean isZero() {
        return zzYHZ.zzZB(this.zzW2i);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final BigInteger toBigInteger() {
        return zzYHZ.zzZA(this.zzW2i);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzT(zzYM0 zzym0) {
        int[] iArr = new int[6];
        zzYI3.zzN(zzYKZ.zzWaq, ((zzYKY) zzym0).zzW2i, iArr);
        zzYKZ.zzX(iArr, this.zzW2i, iArr);
        return new zzYKY(iArr);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzU(zzYM0 zzym0) {
        int[] iArr = new int[6];
        zzYKZ.zzX(this.zzW2i, ((zzYKY) zzym0).zzW2i, iArr);
        return new zzYKY(iArr);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzV(zzYM0 zzym0) {
        int[] iArr = new int[6];
        zzYKZ.zzV(this.zzW2i, ((zzYKY) zzym0).zzW2i, iArr);
        return new zzYKY(iArr);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzW(zzYM0 zzym0) {
        int[] iArr = new int[6];
        zzYKZ.zzY(this.zzW2i, ((zzYKY) zzym0).zzW2i, iArr);
        return new zzYKY(iArr);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzXzA() {
        int[] iArr = new int[6];
        zzYKZ.zzN(this.zzW2i, iArr);
        return new zzYKY(iArr);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final boolean zzXzu() {
        return (this.zzW2i[0] & 1) == 1;
    }

    @Override // com.aspose.words.internal.zzYM0
    public final boolean zzXzv() {
        return zzYHZ.zzZC(this.zzW2i);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzXzw() {
        int[] iArr = this.zzW2i;
        if (zzYHZ.zzZB(iArr) || zzYHZ.zzZC(iArr)) {
            return this;
        }
        int[] iArr2 = new int[6];
        zzYKZ.zzK(iArr, iArr2);
        zzYKZ.zzX(iArr2, iArr, iArr2);
        int[] iArr3 = new int[6];
        zzYKZ.zzK(iArr2, iArr3);
        zzYKZ.zzX(iArr3, iArr, iArr3);
        int[] iArr4 = new int[6];
        zzYKZ.zzZ(iArr3, 3, iArr4);
        zzYKZ.zzX(iArr4, iArr3, iArr4);
        zzYKZ.zzZ(iArr4, 2, iArr4);
        zzYKZ.zzX(iArr4, iArr2, iArr4);
        zzYKZ.zzZ(iArr4, 8, iArr2);
        zzYKZ.zzX(iArr2, iArr4, iArr2);
        zzYKZ.zzZ(iArr2, 3, iArr4);
        zzYKZ.zzX(iArr4, iArr3, iArr4);
        int[] iArr5 = new int[6];
        zzYKZ.zzZ(iArr4, 16, iArr5);
        zzYKZ.zzX(iArr5, iArr2, iArr5);
        zzYKZ.zzZ(iArr5, 35, iArr2);
        zzYKZ.zzX(iArr2, iArr5, iArr2);
        zzYKZ.zzZ(iArr2, 70, iArr5);
        zzYKZ.zzX(iArr5, iArr2, iArr5);
        zzYKZ.zzZ(iArr5, 19, iArr2);
        zzYKZ.zzX(iArr2, iArr4, iArr2);
        zzYKZ.zzZ(iArr2, 20, iArr2);
        zzYKZ.zzX(iArr2, iArr4, iArr2);
        zzYKZ.zzZ(iArr2, 4, iArr2);
        zzYKZ.zzX(iArr2, iArr3, iArr2);
        zzYKZ.zzZ(iArr2, 6, iArr2);
        zzYKZ.zzX(iArr2, iArr3, iArr2);
        zzYKZ.zzK(iArr2, iArr2);
        zzYKZ.zzK(iArr2, iArr3);
        if (zzYHZ.zzC(iArr, iArr3)) {
            return new zzYKY(iArr2);
        }
        return null;
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzXzx() {
        int[] iArr = new int[6];
        zzYI3.zzN(zzYKZ.zzWaq, this.zzW2i, iArr);
        return new zzYKY(iArr);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzXzy() {
        int[] iArr = new int[6];
        zzYKZ.zzK(this.zzW2i, iArr);
        return new zzYKY(iArr);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzXzz() {
        int[] iArr = new int[6];
        zzYKZ.zzM(this.zzW2i, iArr);
        return new zzYKY(iArr);
    }

    public zzYKY() {
        this.zzW2i = new int[6];
    }

    public zzYKY(int[] iArr) {
        this.zzW2i = iArr;
    }
}

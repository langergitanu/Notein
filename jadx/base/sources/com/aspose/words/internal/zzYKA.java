package com.aspose.words.internal;

import com.aspose.words.internal.zzYM0;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
final class zzYKA extends zzYM0.zzY {

    /* JADX INFO: renamed from: bn */
    public static final BigInteger f51039bn = zzYKC.zzWl0;
    protected int[] zzW2i;

    public zzYKA(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f51039bn) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP384R1FieldElement");
        }
        this.zzW2i = zzYKB.zzE(bigInteger);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzYKA) {
            return zzYI2.zzV(12, this.zzW2i, ((zzYKA) obj).zzW2i);
        }
        return false;
    }

    @Override // com.aspose.words.internal.zzYM0
    public final int getFieldSize() {
        return f51039bn.bitLength();
    }

    public final int hashCode() {
        return f51039bn.hashCode() ^ zzYGU.zzN(this.zzW2i, 12);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final boolean isZero() {
        return zzYI2.zzH(12, this.zzW2i);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final BigInteger toBigInteger() {
        return zzYI2.zzG(12, this.zzW2i);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzT(zzYM0 zzym0) {
        int[] iArr = new int[12];
        zzYI3.zzN(zzYKB.zzWaq, ((zzYKA) zzym0).zzW2i, iArr);
        zzYKB.zzX(iArr, this.zzW2i, iArr);
        return new zzYKA(iArr);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzU(zzYM0 zzym0) {
        int[] iArr = new int[12];
        zzYKB.zzX(this.zzW2i, ((zzYKA) zzym0).zzW2i, iArr);
        return new zzYKA(iArr);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzV(zzYM0 zzym0) {
        int[] iArr = new int[12];
        zzYKB.zzV(this.zzW2i, ((zzYKA) zzym0).zzW2i, iArr);
        return new zzYKA(iArr);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzW(zzYM0 zzym0) {
        int[] iArr = new int[12];
        zzYKB.zzY(this.zzW2i, ((zzYKA) zzym0).zzW2i, iArr);
        return new zzYKA(iArr);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzXzA() {
        int[] iArr = new int[12];
        zzYKB.zzN(this.zzW2i, iArr);
        return new zzYKA(iArr);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final boolean zzXzu() {
        return zzYI2.zzO(this.zzW2i, 0) == 1;
    }

    @Override // com.aspose.words.internal.zzYM0
    public final boolean zzXzv() {
        return zzYI2.zzI(12, this.zzW2i);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzXzw() {
        int[] iArr = this.zzW2i;
        if (zzYI2.zzH(12, iArr) || zzYI2.zzI(12, iArr)) {
            return this;
        }
        int[] iArr2 = new int[12];
        int[] iArr3 = new int[12];
        int[] iArr4 = new int[12];
        int[] iArr5 = new int[12];
        zzYKB.zzK(iArr, iArr2);
        zzYKB.zzX(iArr2, iArr, iArr2);
        zzYKB.zzZ(iArr2, 2, iArr3);
        zzYKB.zzX(iArr3, iArr2, iArr3);
        zzYKB.zzK(iArr3, iArr3);
        zzYKB.zzX(iArr3, iArr, iArr3);
        zzYKB.zzZ(iArr3, 5, iArr4);
        zzYKB.zzX(iArr4, iArr3, iArr4);
        zzYKB.zzZ(iArr4, 5, iArr5);
        zzYKB.zzX(iArr5, iArr3, iArr5);
        zzYKB.zzZ(iArr5, 15, iArr3);
        zzYKB.zzX(iArr3, iArr5, iArr3);
        zzYKB.zzZ(iArr3, 2, iArr4);
        zzYKB.zzX(iArr2, iArr4, iArr2);
        zzYKB.zzZ(iArr4, 28, iArr4);
        zzYKB.zzX(iArr3, iArr4, iArr3);
        zzYKB.zzZ(iArr3, 60, iArr4);
        zzYKB.zzX(iArr4, iArr3, iArr4);
        zzYKB.zzZ(iArr4, 120, iArr3);
        zzYKB.zzX(iArr3, iArr4, iArr3);
        zzYKB.zzZ(iArr3, 15, iArr3);
        zzYKB.zzX(iArr3, iArr5, iArr3);
        zzYKB.zzZ(iArr3, 33, iArr3);
        zzYKB.zzX(iArr3, iArr2, iArr3);
        zzYKB.zzZ(iArr3, 64, iArr3);
        zzYKB.zzX(iArr3, iArr, iArr3);
        zzYKB.zzZ(iArr3, 30, iArr2);
        zzYKB.zzK(iArr2, iArr3);
        if (zzYI2.zzV(12, iArr, iArr3)) {
            return new zzYKA(iArr2);
        }
        return null;
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzXzx() {
        int[] iArr = new int[12];
        zzYI3.zzN(zzYKB.zzWaq, this.zzW2i, iArr);
        return new zzYKA(iArr);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzXzy() {
        int[] iArr = new int[12];
        zzYKB.zzK(this.zzW2i, iArr);
        return new zzYKA(iArr);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzXzz() {
        int[] iArr = new int[12];
        zzYKB.zzM(this.zzW2i, iArr);
        return new zzYKA(iArr);
    }

    public zzYKA() {
        this.zzW2i = new int[12];
    }

    public zzYKA(int[] iArr) {
        this.zzW2i = iArr;
    }
}

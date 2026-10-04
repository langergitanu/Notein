package com.aspose.words.internal;

import com.aspose.words.internal.zzYM0;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
final class zzYKU extends zzYM0.zzY {

    /* JADX INFO: renamed from: bn */
    public static final BigInteger f51074bn = zzYKW.zzWl0;
    protected int[] zzW2i;

    public zzYKU(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f51074bn) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP192R1FieldElement");
        }
        this.zzW2i = zzYKV.zzE(bigInteger);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzYKU) {
            return zzYHZ.zzC(this.zzW2i, ((zzYKU) obj).zzW2i);
        }
        return false;
    }

    @Override // com.aspose.words.internal.zzYM0
    public final int getFieldSize() {
        return f51074bn.bitLength();
    }

    public final int hashCode() {
        return f51074bn.hashCode() ^ zzYGU.zzN(this.zzW2i, 6);
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
        zzYI3.zzN(zzYKV.zzWaq, ((zzYKU) zzym0).zzW2i, iArr);
        zzYKV.zzX(iArr, this.zzW2i, iArr);
        return new zzYKU(iArr);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzU(zzYM0 zzym0) {
        int[] iArr = new int[6];
        zzYKV.zzX(this.zzW2i, ((zzYKU) zzym0).zzW2i, iArr);
        return new zzYKU(iArr);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzV(zzYM0 zzym0) {
        int[] iArr = new int[6];
        zzYKV.zzV(this.zzW2i, ((zzYKU) zzym0).zzW2i, iArr);
        return new zzYKU(iArr);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzW(zzYM0 zzym0) {
        int[] iArr = new int[6];
        zzYKV.zzY(this.zzW2i, ((zzYKU) zzym0).zzW2i, iArr);
        return new zzYKU(iArr);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzXzA() {
        int[] iArr = new int[6];
        zzYKV.zzN(this.zzW2i, iArr);
        return new zzYKU(iArr);
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
        int[] iArr3 = new int[6];
        zzYKV.zzK(iArr, iArr2);
        zzYKV.zzX(iArr2, iArr, iArr2);
        zzYKV.zzZ(iArr2, 2, iArr3);
        zzYKV.zzX(iArr3, iArr2, iArr3);
        zzYKV.zzZ(iArr3, 4, iArr2);
        zzYKV.zzX(iArr2, iArr3, iArr2);
        zzYKV.zzZ(iArr2, 8, iArr3);
        zzYKV.zzX(iArr3, iArr2, iArr3);
        zzYKV.zzZ(iArr3, 16, iArr2);
        zzYKV.zzX(iArr2, iArr3, iArr2);
        zzYKV.zzZ(iArr2, 32, iArr3);
        zzYKV.zzX(iArr3, iArr2, iArr3);
        zzYKV.zzZ(iArr3, 64, iArr2);
        zzYKV.zzX(iArr2, iArr3, iArr2);
        zzYKV.zzZ(iArr2, 62, iArr2);
        zzYKV.zzK(iArr2, iArr3);
        if (zzYHZ.zzC(iArr, iArr3)) {
            return new zzYKU(iArr2);
        }
        return null;
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzXzx() {
        int[] iArr = new int[6];
        zzYI3.zzN(zzYKV.zzWaq, this.zzW2i, iArr);
        return new zzYKU(iArr);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzXzy() {
        int[] iArr = new int[6];
        zzYKV.zzK(this.zzW2i, iArr);
        return new zzYKU(iArr);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzXzz() {
        int[] iArr = new int[6];
        zzYKV.zzM(this.zzW2i, iArr);
        return new zzYKU(iArr);
    }

    public zzYKU() {
        this.zzW2i = new int[6];
    }

    public zzYKU(int[] iArr) {
        this.zzW2i = iArr;
    }
}

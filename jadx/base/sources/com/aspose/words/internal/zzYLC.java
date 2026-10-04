package com.aspose.words.internal;

import com.aspose.words.internal.zzYM0;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
final class zzYLC extends zzYM0.zzY {

    /* JADX INFO: renamed from: bn */
    public static final BigInteger f51106bn = zzYLE.zzWl0;
    protected int[] zzW2i;

    public zzYLC(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f51106bn) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP128R1FieldElement");
        }
        this.zzW2i = zzYLD.zzE(bigInteger);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzYLC) {
            return zzYI1.zzC(this.zzW2i, ((zzYLC) obj).zzW2i);
        }
        return false;
    }

    @Override // com.aspose.words.internal.zzYM0
    public final int getFieldSize() {
        return f51106bn.bitLength();
    }

    public final int hashCode() {
        return f51106bn.hashCode() ^ zzYGU.zzN(this.zzW2i, 4);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final boolean isZero() {
        return zzYI1.zzZB(this.zzW2i);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final BigInteger toBigInteger() {
        return zzYI1.zzZA(this.zzW2i);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzT(zzYM0 zzym0) {
        int[] iArr = new int[4];
        zzYI3.zzN(zzYLD.zzWaq, ((zzYLC) zzym0).zzW2i, iArr);
        zzYLD.zzX(iArr, this.zzW2i, iArr);
        return new zzYLC(iArr);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzU(zzYM0 zzym0) {
        int[] iArr = new int[4];
        zzYLD.zzX(this.zzW2i, ((zzYLC) zzym0).zzW2i, iArr);
        return new zzYLC(iArr);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzV(zzYM0 zzym0) {
        int[] iArr = new int[4];
        zzYLD.zzV(this.zzW2i, ((zzYLC) zzym0).zzW2i, iArr);
        return new zzYLC(iArr);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzW(zzYM0 zzym0) {
        int[] iArr = new int[4];
        zzYLD.zzY(this.zzW2i, ((zzYLC) zzym0).zzW2i, iArr);
        return new zzYLC(iArr);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzXzA() {
        int[] iArr = new int[4];
        zzYLD.zzN(this.zzW2i, iArr);
        return new zzYLC(iArr);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final boolean zzXzu() {
        return (this.zzW2i[0] & 1) == 1;
    }

    @Override // com.aspose.words.internal.zzYM0
    public final boolean zzXzv() {
        return zzYI1.zzZC(this.zzW2i);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzXzw() {
        int[] iArr = this.zzW2i;
        if (zzYI1.zzZB(iArr) || zzYI1.zzZC(iArr)) {
            return this;
        }
        int[] iArr2 = new int[4];
        zzYLD.zzK(iArr, iArr2);
        zzYLD.zzX(iArr2, iArr, iArr2);
        int[] iArr3 = new int[4];
        zzYLD.zzZ(iArr2, 2, iArr3);
        zzYLD.zzX(iArr3, iArr2, iArr3);
        int[] iArr4 = new int[4];
        zzYLD.zzZ(iArr3, 4, iArr4);
        zzYLD.zzX(iArr4, iArr3, iArr4);
        zzYLD.zzZ(iArr4, 2, iArr3);
        zzYLD.zzX(iArr3, iArr2, iArr3);
        zzYLD.zzZ(iArr3, 10, iArr2);
        zzYLD.zzX(iArr2, iArr3, iArr2);
        zzYLD.zzZ(iArr2, 10, iArr4);
        zzYLD.zzX(iArr4, iArr3, iArr4);
        zzYLD.zzK(iArr4, iArr3);
        zzYLD.zzX(iArr3, iArr, iArr3);
        zzYLD.zzZ(iArr3, 95, iArr3);
        zzYLD.zzK(iArr3, iArr4);
        if (zzYI1.zzC(iArr, iArr4)) {
            return new zzYLC(iArr3);
        }
        return null;
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzXzx() {
        int[] iArr = new int[4];
        zzYI3.zzN(zzYLD.zzWaq, this.zzW2i, iArr);
        return new zzYLC(iArr);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzXzy() {
        int[] iArr = new int[4];
        zzYLD.zzK(this.zzW2i, iArr);
        return new zzYLC(iArr);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzXzz() {
        int[] iArr = new int[4];
        zzYLD.zzM(this.zzW2i, iArr);
        return new zzYLC(iArr);
    }

    public zzYLC() {
        this.zzW2i = new int[4];
    }

    public zzYLC(int[] iArr) {
        this.zzW2i = iArr;
    }
}

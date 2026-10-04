package com.aspose.words.internal;

import com.aspose.words.internal.zzYM0;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
final class zzYK6 extends zzYM0.zzY {

    /* JADX INFO: renamed from: bn */
    public static final BigInteger f51034bn = zzYK8.zzWl0;
    protected int[] zzW2i;

    public zzYK6(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f51034bn) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP521R1FieldElement");
        }
        this.zzW2i = zzYK7.zzE(bigInteger);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzYK6) {
            return zzYI2.zzV(17, this.zzW2i, ((zzYK6) obj).zzW2i);
        }
        return false;
    }

    @Override // com.aspose.words.internal.zzYM0
    public final int getFieldSize() {
        return f51034bn.bitLength();
    }

    public final int hashCode() {
        return f51034bn.hashCode() ^ zzYGU.zzN(this.zzW2i, 17);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final boolean isZero() {
        return zzYI2.zzH(17, this.zzW2i);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final BigInteger toBigInteger() {
        return zzYI2.zzG(17, this.zzW2i);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzT(zzYM0 zzym0) {
        int[] iArr = new int[17];
        zzYI3.zzN(zzYK7.zzWaq, ((zzYK6) zzym0).zzW2i, iArr);
        zzYK7.zzX(iArr, this.zzW2i, iArr);
        return new zzYK6(iArr);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzU(zzYM0 zzym0) {
        int[] iArr = new int[17];
        zzYK7.zzX(this.zzW2i, ((zzYK6) zzym0).zzW2i, iArr);
        return new zzYK6(iArr);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzV(zzYM0 zzym0) {
        int[] iArr = new int[17];
        zzYK7.zzV(this.zzW2i, ((zzYK6) zzym0).zzW2i, iArr);
        return new zzYK6(iArr);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzW(zzYM0 zzym0) {
        int[] iArr = new int[17];
        zzYK7.zzY(this.zzW2i, ((zzYK6) zzym0).zzW2i, iArr);
        return new zzYK6(iArr);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzXzA() {
        int[] iArr = new int[17];
        zzYK7.zzN(this.zzW2i, iArr);
        return new zzYK6(iArr);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final boolean zzXzu() {
        return zzYI2.zzO(this.zzW2i, 0) == 1;
    }

    @Override // com.aspose.words.internal.zzYM0
    public final boolean zzXzv() {
        return zzYI2.zzI(17, this.zzW2i);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzXzw() {
        int[] iArr = this.zzW2i;
        if (zzYI2.zzH(17, iArr) || zzYI2.zzI(17, iArr)) {
            return this;
        }
        int[] iArr2 = new int[17];
        int[] iArr3 = new int[17];
        zzYK7.zzZ(iArr, 519, iArr2);
        zzYK7.zzK(iArr2, iArr3);
        if (zzYI2.zzV(17, iArr, iArr3)) {
            return new zzYK6(iArr2);
        }
        return null;
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzXzx() {
        int[] iArr = new int[17];
        zzYI3.zzN(zzYK7.zzWaq, this.zzW2i, iArr);
        return new zzYK6(iArr);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzXzy() {
        int[] iArr = new int[17];
        zzYK7.zzK(this.zzW2i, iArr);
        return new zzYK6(iArr);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzXzz() {
        int[] iArr = new int[17];
        zzYK7.zzM(this.zzW2i, iArr);
        return new zzYK6(iArr);
    }

    public zzYK6() {
        this.zzW2i = new int[17];
    }

    public zzYK6(int[] iArr) {
        this.zzW2i = iArr;
    }
}

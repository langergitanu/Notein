package com.aspose.words.internal;

import com.aspose.words.internal.zzYM0;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
final class zzYKQ extends zzYM0.zzY {
    protected int[] zzW2i;

    /* JADX INFO: renamed from: bn */
    public static final BigInteger f51067bn = zzYKS.zzWl0;

    /* JADX INFO: renamed from: bA */
    private static final int[] f51066bA = {868209154, -587542221, 579297866, -1014948952, -1470801668, 514782679, -1897982644};

    public zzYKQ(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f51067bn) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP224K1FieldElement");
        }
        this.zzW2i = zzYKR.zzE(bigInteger);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzYKQ) {
            return zzYHY.zzC(this.zzW2i, ((zzYKQ) obj).zzW2i);
        }
        return false;
    }

    @Override // com.aspose.words.internal.zzYM0
    public final int getFieldSize() {
        return f51067bn.bitLength();
    }

    public final int hashCode() {
        return f51067bn.hashCode() ^ zzYGU.zzN(this.zzW2i, 7);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final boolean isZero() {
        return zzYHY.zzZB(this.zzW2i);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final BigInteger toBigInteger() {
        return zzYHY.zzZA(this.zzW2i);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzT(zzYM0 zzym0) {
        int[] iArr = new int[7];
        zzYI3.zzN(zzYKR.zzWaq, ((zzYKQ) zzym0).zzW2i, iArr);
        zzYKR.zzX(iArr, this.zzW2i, iArr);
        return new zzYKQ(iArr);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzU(zzYM0 zzym0) {
        int[] iArr = new int[7];
        zzYKR.zzX(this.zzW2i, ((zzYKQ) zzym0).zzW2i, iArr);
        return new zzYKQ(iArr);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzV(zzYM0 zzym0) {
        int[] iArr = new int[7];
        zzYKR.zzV(this.zzW2i, ((zzYKQ) zzym0).zzW2i, iArr);
        return new zzYKQ(iArr);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzW(zzYM0 zzym0) {
        int[] iArr = new int[7];
        zzYKR.zzY(this.zzW2i, ((zzYKQ) zzym0).zzW2i, iArr);
        return new zzYKQ(iArr);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzXzA() {
        int[] iArr = new int[7];
        zzYKR.zzN(this.zzW2i, iArr);
        return new zzYKQ(iArr);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final boolean zzXzu() {
        return (this.zzW2i[0] & 1) == 1;
    }

    @Override // com.aspose.words.internal.zzYM0
    public final boolean zzXzv() {
        return zzYHY.zzZC(this.zzW2i);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzXzw() {
        int[] iArr = this.zzW2i;
        if (zzYHY.zzZB(iArr) || zzYHY.zzZC(iArr)) {
            return this;
        }
        int[] iArr2 = new int[7];
        zzYKR.zzK(iArr, iArr2);
        zzYKR.zzX(iArr2, iArr, iArr2);
        zzYKR.zzK(iArr2, iArr2);
        zzYKR.zzX(iArr2, iArr, iArr2);
        int[] iArr3 = new int[7];
        zzYKR.zzK(iArr2, iArr3);
        zzYKR.zzX(iArr3, iArr, iArr3);
        int[] iArr4 = new int[7];
        zzYKR.zzZ(iArr3, 4, iArr4);
        zzYKR.zzX(iArr4, iArr3, iArr4);
        int[] iArr5 = new int[7];
        zzYKR.zzZ(iArr4, 3, iArr5);
        zzYKR.zzX(iArr5, iArr2, iArr5);
        zzYKR.zzZ(iArr5, 8, iArr5);
        zzYKR.zzX(iArr5, iArr4, iArr5);
        zzYKR.zzZ(iArr5, 4, iArr4);
        zzYKR.zzX(iArr4, iArr3, iArr4);
        zzYKR.zzZ(iArr4, 19, iArr3);
        zzYKR.zzX(iArr3, iArr5, iArr3);
        int[] iArr6 = new int[7];
        zzYKR.zzZ(iArr3, 42, iArr6);
        zzYKR.zzX(iArr6, iArr3, iArr6);
        zzYKR.zzZ(iArr6, 23, iArr3);
        zzYKR.zzX(iArr3, iArr4, iArr3);
        zzYKR.zzZ(iArr3, 84, iArr4);
        zzYKR.zzX(iArr4, iArr6, iArr4);
        zzYKR.zzZ(iArr4, 20, iArr4);
        zzYKR.zzX(iArr4, iArr5, iArr4);
        zzYKR.zzZ(iArr4, 3, iArr4);
        zzYKR.zzX(iArr4, iArr, iArr4);
        zzYKR.zzZ(iArr4, 2, iArr4);
        zzYKR.zzX(iArr4, iArr, iArr4);
        zzYKR.zzZ(iArr4, 4, iArr4);
        zzYKR.zzX(iArr4, iArr2, iArr4);
        zzYKR.zzK(iArr4, iArr4);
        zzYKR.zzK(iArr4, iArr6);
        if (zzYHY.zzC(iArr, iArr6)) {
            return new zzYKQ(iArr4);
        }
        zzYKR.zzX(iArr4, f51066bA, iArr4);
        zzYKR.zzK(iArr4, iArr6);
        if (zzYHY.zzC(iArr, iArr6)) {
            return new zzYKQ(iArr4);
        }
        return null;
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzXzx() {
        int[] iArr = new int[7];
        zzYI3.zzN(zzYKR.zzWaq, this.zzW2i, iArr);
        return new zzYKQ(iArr);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzXzy() {
        int[] iArr = new int[7];
        zzYKR.zzK(this.zzW2i, iArr);
        return new zzYKQ(iArr);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzXzz() {
        int[] iArr = new int[7];
        zzYKR.zzM(this.zzW2i, iArr);
        return new zzYKQ(iArr);
    }

    public zzYKQ() {
        this.zzW2i = new int[7];
    }

    public zzYKQ(int[] iArr) {
        this.zzW2i = iArr;
    }
}

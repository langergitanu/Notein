package com.aspose.words.internal;

import com.aspose.words.internal.zzYM0;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
final class zzYKM extends zzYM0.zzY {

    /* JADX INFO: renamed from: bn */
    public static final BigInteger f51059bn = zzYKO.zzWl0;
    protected int[] zzW2i;

    public zzYKM(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f51059bn) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP224R1FieldElement");
        }
        this.zzW2i = zzYKN.zzE(bigInteger);
    }

    private static void zzZ(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int[] iArr6, int[] iArr7) {
        zzYKN.zzX(iArr5, iArr3, iArr7);
        zzYKN.zzX(iArr7, iArr, iArr7);
        zzYKN.zzX(iArr4, iArr2, iArr6);
        zzYKN.zzY(iArr6, iArr7, iArr6);
        zzYKN.zzX(iArr4, iArr3, iArr7);
        zzYHY.zzx(iArr6, iArr4);
        zzYKN.zzX(iArr5, iArr2, iArr5);
        zzYKN.zzY(iArr5, iArr7, iArr5);
        zzYKN.zzK(iArr5, iArr6);
        zzYKN.zzX(iArr6, iArr, iArr6);
    }

    private static boolean zzZQ(int[] iArr) {
        int[] iArr2 = new int[7];
        int[] iArr3 = new int[7];
        zzYHY.zzx(iArr, iArr2);
        for (int i = 0; i < 7; i++) {
            zzYHY.zzx(iArr2, iArr3);
            zzYKN.zzZ(iArr2, 1 << i, iArr2);
            zzYKN.zzX(iArr2, iArr3, iArr2);
        }
        zzYKN.zzZ(iArr2, 95, iArr2);
        return zzYHY.zzZC(iArr2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzYKM) {
            return zzYHY.zzC(this.zzW2i, ((zzYKM) obj).zzW2i);
        }
        return false;
    }

    @Override // com.aspose.words.internal.zzYM0
    public final int getFieldSize() {
        return f51059bn.bitLength();
    }

    public final int hashCode() {
        return f51059bn.hashCode() ^ zzYGU.zzN(this.zzW2i, 7);
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
        zzYI3.zzN(zzYKN.zzWaq, ((zzYKM) zzym0).zzW2i, iArr);
        zzYKN.zzX(iArr, this.zzW2i, iArr);
        return new zzYKM(iArr);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzU(zzYM0 zzym0) {
        int[] iArr = new int[7];
        zzYKN.zzX(this.zzW2i, ((zzYKM) zzym0).zzW2i, iArr);
        return new zzYKM(iArr);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzV(zzYM0 zzym0) {
        int[] iArr = new int[7];
        zzYKN.zzV(this.zzW2i, ((zzYKM) zzym0).zzW2i, iArr);
        return new zzYKM(iArr);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzW(zzYM0 zzym0) {
        int[] iArr = new int[7];
        zzYKN.zzY(this.zzW2i, ((zzYKM) zzym0).zzW2i, iArr);
        return new zzYKM(iArr);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzXzA() {
        int[] iArr = new int[7];
        zzYKN.zzN(this.zzW2i, iArr);
        return new zzYKM(iArr);
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
        zzYKN.zzM(iArr, iArr2);
        int[] iArrZzZG = zzYI3.zzZG(zzYKN.zzWaq);
        int[] iArr3 = new int[7];
        if (!zzZQ(iArr)) {
            return null;
        }
        while (!zzU(iArr2, iArrZzZG, iArr3)) {
            zzYKN.zzN(iArrZzZG, iArrZzZG);
        }
        zzYKN.zzK(iArr3, iArrZzZG);
        if (zzYHY.zzC(iArr, iArrZzZG)) {
            return new zzYKM(iArr3);
        }
        return null;
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzXzx() {
        int[] iArr = new int[7];
        zzYI3.zzN(zzYKN.zzWaq, this.zzW2i, iArr);
        return new zzYKM(iArr);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzXzy() {
        int[] iArr = new int[7];
        zzYKN.zzK(this.zzW2i, iArr);
        return new zzYKM(iArr);
    }

    @Override // com.aspose.words.internal.zzYM0
    public final zzYM0 zzXzz() {
        int[] iArr = new int[7];
        zzYKN.zzM(this.zzW2i, iArr);
        return new zzYKM(iArr);
    }

    private static boolean zzU(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[7];
        zzYHY.zzx(iArr2, iArr4);
        int[] iArr5 = new int[7];
        iArr5[0] = 1;
        int[] iArr6 = new int[7];
        zzZ(iArr, iArr4, iArr5, iArr6, iArr3);
        int[] iArr7 = new int[7];
        int[] iArr8 = new int[7];
        for (int i = 1; i < 96; i++) {
            zzYHY.zzx(iArr4, iArr7);
            zzYHY.zzx(iArr5, iArr8);
            zzZ(iArr4, iArr5, iArr6, iArr3);
            if (zzYHY.zzZB(iArr4)) {
                zzYI3.zzN(zzYKN.zzWaq, iArr8, iArr3);
                zzYKN.zzX(iArr3, iArr7, iArr3);
                return true;
            }
        }
        return false;
    }

    public zzYKM() {
        this.zzW2i = new int[7];
    }

    public zzYKM(int[] iArr) {
        this.zzW2i = iArr;
    }

    private static void zzZ(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5) {
        zzYHY.zzx(iArr, iArr4);
        int[] iArr6 = new int[7];
        int[] iArr7 = new int[7];
        for (int i = 0; i < 7; i++) {
            zzYHY.zzx(iArr2, iArr6);
            zzYHY.zzx(iArr3, iArr7);
            int i2 = 1 << i;
            while (true) {
                i2--;
                if (i2 >= 0) {
                    zzZ(iArr2, iArr3, iArr4, iArr5);
                }
            }
            zzZ(iArr, iArr6, iArr7, iArr2, iArr3, iArr4, iArr5);
        }
    }

    private static void zzZ(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        zzYKN.zzX(iArr2, iArr, iArr2);
        zzYKN.zzJ(iArr2, iArr2);
        zzYKN.zzK(iArr, iArr4);
        zzYKN.zzY(iArr3, iArr4, iArr);
        zzYKN.zzX(iArr3, iArr4, iArr3);
        zzYKN.zzL(zzYI2.zzT(7, iArr3, 0), iArr3);
    }
}

package com.aspose.words.internal;

import com.aspose.words.internal.zzYLX;

/* JADX INFO: loaded from: classes5.dex */
final class zzYK9 extends zzYLX.zzY {
    public zzYK9(zzYM1 zzym1, zzYM0 zzym0, zzYM0 zzym02) {
        super(zzym1, zzym0, zzym02);
    }

    @Override // com.aspose.words.internal.zzYLX
    public final zzYLX zzR(zzYLX zzylx) {
        return this == zzylx ? zzXza() : zzXzd() ? zzylx : zzylx.zzXzd() ? zzXzb() : this.f51158ao.isZero() ? zzylx : zzXzb().zzT(zzylx);
    }

    @Override // com.aspose.words.internal.zzYLX
    public final zzYLX zzT(zzYLX zzylx) {
        int[] iArr;
        int[] iArr2;
        char c;
        int[] iArr3;
        int[] iArr4;
        if (zzXzd()) {
            return zzylx;
        }
        if (zzylx.zzXzd()) {
            return this;
        }
        if (this == zzylx) {
            return zzXzb();
        }
        zzYM1 zzym1ZzXHv = zzXHv();
        zzYKA zzyka = (zzYKA) this.f51157an;
        zzYKA zzyka2 = (zzYKA) this.f51158ao;
        zzYKA zzyka3 = (zzYKA) zzylx.zzXzl();
        zzYKA zzyka4 = (zzYKA) zzylx.zzXzk();
        zzYKA zzyka5 = (zzYKA) this.f51159ap[0];
        zzYKA zzyka6 = (zzYKA) zzylx.zzeQ(0);
        int[] iArr5 = new int[24];
        int[] iArr6 = new int[24];
        int[] iArr7 = new int[12];
        int[] iArr8 = new int[12];
        boolean zZzXzv = zzyka5.zzXzv();
        if (zZzXzv) {
            iArr = zzyka3.zzW2i;
            iArr2 = zzyka4.zzW2i;
        } else {
            zzYKB.zzK(zzyka5.zzW2i, iArr7);
            zzYKB.zzX(iArr7, zzyka3.zzW2i, iArr6);
            zzYKB.zzX(iArr7, zzyka5.zzW2i, iArr7);
            zzYKB.zzX(iArr7, zzyka4.zzW2i, iArr7);
            iArr = iArr6;
            iArr2 = iArr7;
        }
        boolean zZzXzv2 = zzyka6.zzXzv();
        if (zZzXzv2) {
            iArr3 = zzyka.zzW2i;
            iArr4 = zzyka2.zzW2i;
            c = 0;
        } else {
            c = 0;
            zzYKB.zzK(zzyka6.zzW2i, iArr8);
            zzYKB.zzX(iArr8, zzyka.zzW2i, iArr5);
            zzYKB.zzX(iArr8, zzyka6.zzW2i, iArr8);
            zzYKB.zzX(iArr8, zzyka2.zzW2i, iArr8);
            iArr3 = iArr5;
            iArr4 = iArr8;
        }
        int[] iArr9 = new int[12];
        zzYKB.zzV(iArr3, iArr, iArr9);
        int[] iArr10 = new int[12];
        zzYKB.zzV(iArr4, iArr2, iArr10);
        if (zzYI2.zzH(12, iArr9)) {
            return zzYI2.zzH(12, iArr10) ? zzXzb() : zzym1ZzXHv.zzXzM();
        }
        zzYKB.zzK(iArr9, iArr7);
        int[] iArr11 = new int[12];
        zzYKB.zzX(iArr7, iArr9, iArr11);
        zzYKB.zzX(iArr7, iArr3, iArr7);
        zzYKB.zzM(iArr11, iArr11);
        zzYHV.zzR(iArr4, iArr11, iArr5);
        zzYKB.zzL(zzYI2.zzY(12, iArr7, iArr7, iArr11), iArr11);
        zzYKA zzyka7 = new zzYKA(iArr8);
        zzYKB.zzK(iArr10, zzyka7.zzW2i);
        int[] iArr12 = zzyka7.zzW2i;
        zzYKB.zzV(iArr12, iArr11, iArr12);
        zzYKA zzyka8 = new zzYKA(iArr11);
        zzYKB.zzV(iArr7, zzyka7.zzW2i, zzyka8.zzW2i);
        zzYHV.zzR(zzyka8.zzW2i, iArr10, iArr6);
        zzYKB.zzT(iArr5, iArr6, iArr5);
        zzYKB.zzL(iArr5, zzyka8.zzW2i);
        zzYKA zzyka9 = new zzYKA(iArr9);
        if (!zZzXzv) {
            int[] iArr13 = zzyka9.zzW2i;
            zzYKB.zzX(iArr13, zzyka5.zzW2i, iArr13);
        }
        if (!zZzXzv2) {
            int[] iArr14 = zzyka9.zzW2i;
            zzYKB.zzX(iArr14, zzyka6.zzW2i, iArr14);
        }
        zzYM0[] zzym0Arr = new zzYM0[1];
        zzym0Arr[c] = zzyka9;
        return new zzYK9(zzym1ZzXHv, zzyka7, zzyka8, zzym0Arr);
    }

    @Override // com.aspose.words.internal.zzYLX
    public final zzYLX zzXza() {
        return (zzXzd() || this.f51158ao.isZero()) ? this : zzXzb().zzT(this);
    }

    @Override // com.aspose.words.internal.zzYLX
    public final zzYLX zzXzb() {
        if (zzXzd()) {
            return this;
        }
        zzYM1 zzym1ZzXHv = zzXHv();
        zzYKA zzyka = (zzYKA) this.f51158ao;
        if (zzyka.isZero()) {
            return zzym1ZzXHv.zzXzM();
        }
        zzYKA zzyka2 = (zzYKA) this.f51157an;
        zzYKA zzyka3 = (zzYKA) this.f51159ap[0];
        int[] iArr = new int[12];
        int[] iArr2 = new int[12];
        int[] iArr3 = new int[12];
        zzYKB.zzK(zzyka.zzW2i, iArr3);
        int[] iArr4 = new int[12];
        zzYKB.zzK(iArr3, iArr4);
        boolean zZzXzv = zzyka3.zzXzv();
        int[] iArr5 = zzyka3.zzW2i;
        if (!zZzXzv) {
            zzYKB.zzK(iArr5, iArr2);
            iArr5 = iArr2;
        }
        zzYKB.zzV(zzyka2.zzW2i, iArr5, iArr);
        zzYKB.zzY(zzyka2.zzW2i, iArr5, iArr2);
        zzYKB.zzX(iArr2, iArr, iArr2);
        zzYKB.zzL(zzYI2.zzY(12, iArr2, iArr2, iArr2), iArr2);
        zzYKB.zzX(iArr3, zzyka2.zzW2i, iArr3);
        zzYKB.zzL(zzYI2.zzT(12, iArr3, 0), iArr3);
        zzYKB.zzL(zzYI2.zzY(12, iArr4, 0, iArr), iArr);
        zzYKA zzyka4 = new zzYKA(iArr4);
        zzYKB.zzK(iArr2, zzyka4.zzW2i);
        int[] iArr6 = zzyka4.zzW2i;
        zzYKB.zzV(iArr6, iArr3, iArr6);
        int[] iArr7 = zzyka4.zzW2i;
        zzYKB.zzV(iArr7, iArr3, iArr7);
        zzYKA zzyka5 = new zzYKA(iArr3);
        zzYKB.zzV(iArr3, zzyka4.zzW2i, zzyka5.zzW2i);
        int[] iArr8 = zzyka5.zzW2i;
        zzYKB.zzX(iArr8, iArr2, iArr8);
        int[] iArr9 = zzyka5.zzW2i;
        zzYKB.zzV(iArr9, iArr, iArr9);
        zzYKA zzyka6 = new zzYKA(iArr2);
        zzYKB.zzJ(zzyka.zzW2i, zzyka6.zzW2i);
        if (!zZzXzv) {
            int[] iArr10 = zzyka6.zzW2i;
            zzYKB.zzX(iArr10, zzyka3.zzW2i, iArr10);
        }
        return new zzYK9(zzym1ZzXHv, zzyka4, zzyka5, new zzYM0[]{zzyka6});
    }

    @Override // com.aspose.words.internal.zzYLX
    public final zzYLX zzXzc() {
        return zzXzd() ? this : new zzYK9(this.zzWoB, this.f51157an, this.f51158ao.zzXzz(), this.f51159ap);
    }

    public zzYK9(zzYM1 zzym1, zzYM0 zzym0, zzYM0 zzym02, zzYM0[] zzym0Arr) {
        super(zzym1, zzym0, zzym02, zzym0Arr);
    }
}

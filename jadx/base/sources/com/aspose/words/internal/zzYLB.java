package com.aspose.words.internal;

import com.aspose.words.internal.zzYLX;

/* JADX INFO: loaded from: classes5.dex */
final class zzYLB extends zzYLX.zzY {
    public zzYLB(zzYM1 zzym1, zzYM0 zzym0, zzYM0 zzym02) {
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
        zzYLC zzylc = (zzYLC) this.f51157an;
        zzYLC zzylc2 = (zzYLC) this.f51158ao;
        zzYLC zzylc3 = (zzYLC) zzylx.zzXzl();
        zzYLC zzylc4 = (zzYLC) zzylx.zzXzk();
        zzYLC zzylc5 = (zzYLC) this.f51159ap[0];
        zzYLC zzylc6 = (zzYLC) zzylx.zzeQ(0);
        int[] iArr5 = new int[8];
        int[] iArr6 = new int[4];
        int[] iArr7 = new int[4];
        int[] iArr8 = new int[4];
        boolean zZzXzv = zzylc5.zzXzv();
        if (zZzXzv) {
            iArr = zzylc3.zzW2i;
            iArr2 = zzylc4.zzW2i;
        } else {
            zzYLD.zzK(zzylc5.zzW2i, iArr7);
            zzYLD.zzX(iArr7, zzylc3.zzW2i, iArr6);
            zzYLD.zzX(iArr7, zzylc5.zzW2i, iArr7);
            zzYLD.zzX(iArr7, zzylc4.zzW2i, iArr7);
            iArr = iArr6;
            iArr2 = iArr7;
        }
        boolean zZzXzv2 = zzylc6.zzXzv();
        if (zZzXzv2) {
            iArr3 = zzylc.zzW2i;
            iArr4 = zzylc2.zzW2i;
            c = 0;
        } else {
            c = 0;
            zzYLD.zzK(zzylc6.zzW2i, iArr8);
            zzYLD.zzX(iArr8, zzylc.zzW2i, iArr5);
            zzYLD.zzX(iArr8, zzylc6.zzW2i, iArr8);
            zzYLD.zzX(iArr8, zzylc2.zzW2i, iArr8);
            iArr3 = iArr5;
            iArr4 = iArr8;
        }
        int[] iArr9 = new int[4];
        zzYLD.zzV(iArr3, iArr, iArr9);
        zzYLD.zzV(iArr4, iArr2, iArr6);
        if (zzYI1.zzZB(iArr9)) {
            return zzYI1.zzZB(iArr6) ? zzXzb() : zzym1ZzXHv.zzXzM();
        }
        zzYLD.zzK(iArr9, iArr7);
        int[] iArr10 = new int[4];
        zzYLD.zzX(iArr7, iArr9, iArr10);
        zzYLD.zzX(iArr7, iArr3, iArr7);
        zzYLD.zzM(iArr10, iArr10);
        zzYI1.zzR(iArr4, iArr10, iArr5);
        zzYLD.zzL(zzYI1.zzL(iArr7, iArr7, iArr10), iArr10);
        zzYLC zzylc7 = new zzYLC(iArr8);
        zzYLD.zzK(iArr6, zzylc7.zzW2i);
        int[] iArr11 = zzylc7.zzW2i;
        zzYLD.zzV(iArr11, iArr10, iArr11);
        zzYLC zzylc8 = new zzYLC(iArr10);
        zzYLD.zzV(iArr7, zzylc7.zzW2i, zzylc8.zzW2i);
        zzYLD.zzW(zzylc8.zzW2i, iArr6, iArr5);
        zzYLD.zzL(iArr5, zzylc8.zzW2i);
        zzYLC zzylc9 = new zzYLC(iArr9);
        if (!zZzXzv) {
            int[] iArr12 = zzylc9.zzW2i;
            zzYLD.zzX(iArr12, zzylc5.zzW2i, iArr12);
        }
        if (!zZzXzv2) {
            int[] iArr13 = zzylc9.zzW2i;
            zzYLD.zzX(iArr13, zzylc6.zzW2i, iArr13);
        }
        zzYM0[] zzym0Arr = new zzYM0[1];
        zzym0Arr[c] = zzylc9;
        return new zzYLB(zzym1ZzXHv, zzylc7, zzylc8, zzym0Arr);
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
        zzYLC zzylc = (zzYLC) this.f51158ao;
        if (zzylc.isZero()) {
            return zzym1ZzXHv.zzXzM();
        }
        zzYLC zzylc2 = (zzYLC) this.f51157an;
        zzYLC zzylc3 = (zzYLC) this.f51159ap[0];
        int[] iArr = new int[4];
        int[] iArr2 = new int[4];
        int[] iArr3 = new int[4];
        zzYLD.zzK(zzylc.zzW2i, iArr3);
        int[] iArr4 = new int[4];
        zzYLD.zzK(iArr3, iArr4);
        boolean zZzXzv = zzylc3.zzXzv();
        int[] iArr5 = zzylc3.zzW2i;
        if (!zZzXzv) {
            zzYLD.zzK(iArr5, iArr2);
            iArr5 = iArr2;
        }
        zzYLD.zzV(zzylc2.zzW2i, iArr5, iArr);
        zzYLD.zzY(zzylc2.zzW2i, iArr5, iArr2);
        zzYLD.zzX(iArr2, iArr, iArr2);
        zzYLD.zzL(zzYI1.zzL(iArr2, iArr2, iArr2), iArr2);
        zzYLD.zzX(iArr3, zzylc2.zzW2i, iArr3);
        zzYLD.zzL(zzYI2.zzT(4, iArr3, 0), iArr3);
        zzYLD.zzL(zzYI2.zzY(4, iArr4, 0, iArr), iArr);
        zzYLC zzylc4 = new zzYLC(iArr4);
        zzYLD.zzK(iArr2, zzylc4.zzW2i);
        int[] iArr6 = zzylc4.zzW2i;
        zzYLD.zzV(iArr6, iArr3, iArr6);
        int[] iArr7 = zzylc4.zzW2i;
        zzYLD.zzV(iArr7, iArr3, iArr7);
        zzYLC zzylc5 = new zzYLC(iArr3);
        zzYLD.zzV(iArr3, zzylc4.zzW2i, zzylc5.zzW2i);
        int[] iArr8 = zzylc5.zzW2i;
        zzYLD.zzX(iArr8, iArr2, iArr8);
        int[] iArr9 = zzylc5.zzW2i;
        zzYLD.zzV(iArr9, iArr, iArr9);
        zzYLC zzylc6 = new zzYLC(iArr2);
        zzYLD.zzJ(zzylc.zzW2i, zzylc6.zzW2i);
        if (!zZzXzv) {
            int[] iArr10 = zzylc6.zzW2i;
            zzYLD.zzX(iArr10, zzylc3.zzW2i, iArr10);
        }
        return new zzYLB(zzym1ZzXHv, zzylc4, zzylc5, new zzYM0[]{zzylc6});
    }

    @Override // com.aspose.words.internal.zzYLX
    public final zzYLX zzXzc() {
        return zzXzd() ? this : new zzYLB(this.zzWoB, this.f51157an, this.f51158ao.zzXzz(), this.f51159ap);
    }

    public zzYLB(zzYM1 zzym1, zzYM0 zzym0, zzYM0 zzym02, zzYM0[] zzym0Arr) {
        super(zzym1, zzym0, zzym02, zzym0Arr);
    }
}

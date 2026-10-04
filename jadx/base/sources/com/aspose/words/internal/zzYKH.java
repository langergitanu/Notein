package com.aspose.words.internal;

import com.aspose.words.internal.zzYLX;

/* JADX INFO: loaded from: classes5.dex */
final class zzYKH extends zzYLX.zzY {
    public zzYKH(zzYM1 zzym1, zzYM0 zzym0, zzYM0 zzym02) {
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
        zzYKI zzyki = (zzYKI) this.f51157an;
        zzYKI zzyki2 = (zzYKI) this.f51158ao;
        zzYKI zzyki3 = (zzYKI) zzylx.zzXzl();
        zzYKI zzyki4 = (zzYKI) zzylx.zzXzk();
        zzYKI zzyki5 = (zzYKI) this.f51159ap[0];
        zzYKI zzyki6 = (zzYKI) zzylx.zzeQ(0);
        int[] iArr5 = new int[16];
        int[] iArr6 = new int[8];
        int[] iArr7 = new int[8];
        int[] iArr8 = new int[8];
        boolean zZzXzv = zzyki5.zzXzv();
        if (zZzXzv) {
            iArr = zzyki3.zzW2i;
            iArr2 = zzyki4.zzW2i;
        } else {
            zzYKJ.zzK(zzyki5.zzW2i, iArr7);
            zzYKJ.zzX(iArr7, zzyki3.zzW2i, iArr6);
            zzYKJ.zzX(iArr7, zzyki5.zzW2i, iArr7);
            zzYKJ.zzX(iArr7, zzyki4.zzW2i, iArr7);
            iArr = iArr6;
            iArr2 = iArr7;
        }
        boolean zZzXzv2 = zzyki6.zzXzv();
        if (zZzXzv2) {
            iArr3 = zzyki.zzW2i;
            iArr4 = zzyki2.zzW2i;
            c = 0;
        } else {
            c = 0;
            zzYKJ.zzK(zzyki6.zzW2i, iArr8);
            zzYKJ.zzX(iArr8, zzyki.zzW2i, iArr5);
            zzYKJ.zzX(iArr8, zzyki6.zzW2i, iArr8);
            zzYKJ.zzX(iArr8, zzyki2.zzW2i, iArr8);
            iArr3 = iArr5;
            iArr4 = iArr8;
        }
        int[] iArr9 = new int[8];
        zzYKJ.zzV(iArr3, iArr, iArr9);
        zzYKJ.zzV(iArr4, iArr2, iArr6);
        if (zzYHX.zzZB(iArr9)) {
            return zzYHX.zzZB(iArr6) ? zzXzb() : zzym1ZzXHv.zzXzM();
        }
        zzYKJ.zzK(iArr9, iArr7);
        int[] iArr10 = new int[8];
        zzYKJ.zzX(iArr7, iArr9, iArr10);
        zzYKJ.zzX(iArr7, iArr3, iArr7);
        zzYKJ.zzM(iArr10, iArr10);
        zzYHX.zzR(iArr4, iArr10, iArr5);
        zzYKJ.zzL(zzYHX.zzL(iArr7, iArr7, iArr10), iArr10);
        zzYKI zzyki7 = new zzYKI(iArr8);
        zzYKJ.zzK(iArr6, zzyki7.zzW2i);
        int[] iArr11 = zzyki7.zzW2i;
        zzYKJ.zzV(iArr11, iArr10, iArr11);
        zzYKI zzyki8 = new zzYKI(iArr10);
        zzYKJ.zzV(iArr7, zzyki7.zzW2i, zzyki8.zzW2i);
        zzYKJ.zzW(zzyki8.zzW2i, iArr6, iArr5);
        zzYKJ.zzL(iArr5, zzyki8.zzW2i);
        zzYKI zzyki9 = new zzYKI(iArr9);
        if (!zZzXzv) {
            int[] iArr12 = zzyki9.zzW2i;
            zzYKJ.zzX(iArr12, zzyki5.zzW2i, iArr12);
        }
        if (!zZzXzv2) {
            int[] iArr13 = zzyki9.zzW2i;
            zzYKJ.zzX(iArr13, zzyki6.zzW2i, iArr13);
        }
        zzYM0[] zzym0Arr = new zzYM0[1];
        zzym0Arr[c] = zzyki9;
        return new zzYKH(zzym1ZzXHv, zzyki7, zzyki8, zzym0Arr);
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
        zzYKI zzyki = (zzYKI) this.f51158ao;
        if (zzyki.isZero()) {
            return zzym1ZzXHv.zzXzM();
        }
        zzYKI zzyki2 = (zzYKI) this.f51157an;
        zzYKI zzyki3 = (zzYKI) this.f51159ap[0];
        int[] iArr = new int[8];
        zzYKJ.zzK(zzyki.zzW2i, iArr);
        int[] iArr2 = new int[8];
        zzYKJ.zzK(iArr, iArr2);
        int[] iArr3 = new int[8];
        zzYKJ.zzK(zzyki2.zzW2i, iArr3);
        zzYKJ.zzL(zzYHX.zzL(iArr3, iArr3, iArr3), iArr3);
        zzYKJ.zzX(iArr, zzyki2.zzW2i, iArr);
        zzYKJ.zzL(zzYI2.zzT(8, iArr, 0), iArr);
        int[] iArr4 = new int[8];
        zzYKJ.zzL(zzYI2.zzY(8, iArr2, 0, iArr4), iArr4);
        zzYKI zzyki4 = new zzYKI(iArr2);
        zzYKJ.zzK(iArr3, zzyki4.zzW2i);
        int[] iArr5 = zzyki4.zzW2i;
        zzYKJ.zzV(iArr5, iArr, iArr5);
        int[] iArr6 = zzyki4.zzW2i;
        zzYKJ.zzV(iArr6, iArr, iArr6);
        zzYKI zzyki5 = new zzYKI(iArr);
        zzYKJ.zzV(iArr, zzyki4.zzW2i, zzyki5.zzW2i);
        int[] iArr7 = zzyki5.zzW2i;
        zzYKJ.zzX(iArr7, iArr3, iArr7);
        int[] iArr8 = zzyki5.zzW2i;
        zzYKJ.zzV(iArr8, iArr4, iArr8);
        zzYKI zzyki6 = new zzYKI(iArr3);
        zzYKJ.zzJ(zzyki.zzW2i, zzyki6.zzW2i);
        if (!zzyki3.zzXzv()) {
            int[] iArr9 = zzyki6.zzW2i;
            zzYKJ.zzX(iArr9, zzyki3.zzW2i, iArr9);
        }
        return new zzYKH(zzym1ZzXHv, zzyki4, zzyki5, new zzYM0[]{zzyki6});
    }

    @Override // com.aspose.words.internal.zzYLX
    public final zzYLX zzXzc() {
        return zzXzd() ? this : new zzYKH(this.zzWoB, this.f51157an, this.f51158ao.zzXzz(), this.f51159ap);
    }

    public zzYKH(zzYM1 zzym1, zzYM0 zzym0, zzYM0 zzym02, zzYM0[] zzym0Arr) {
        super(zzym1, zzym0, zzym02, zzym0Arr);
    }
}

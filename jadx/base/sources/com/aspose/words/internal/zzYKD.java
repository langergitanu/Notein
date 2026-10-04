package com.aspose.words.internal;

import com.aspose.words.internal.zzYLX;

/* JADX INFO: loaded from: classes5.dex */
final class zzYKD extends zzYLX.zzY {
    public zzYKD(zzYM1 zzym1, zzYM0 zzym0, zzYM0 zzym02) {
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
        zzYKE zzyke = (zzYKE) this.f51157an;
        zzYKE zzyke2 = (zzYKE) this.f51158ao;
        zzYKE zzyke3 = (zzYKE) zzylx.zzXzl();
        zzYKE zzyke4 = (zzYKE) zzylx.zzXzk();
        zzYKE zzyke5 = (zzYKE) this.f51159ap[0];
        zzYKE zzyke6 = (zzYKE) zzylx.zzeQ(0);
        int[] iArr5 = new int[16];
        int[] iArr6 = new int[8];
        int[] iArr7 = new int[8];
        int[] iArr8 = new int[8];
        boolean zZzXzv = zzyke5.zzXzv();
        if (zZzXzv) {
            iArr = zzyke3.zzW2i;
            iArr2 = zzyke4.zzW2i;
        } else {
            zzYKF.zzK(zzyke5.zzW2i, iArr7);
            zzYKF.zzX(iArr7, zzyke3.zzW2i, iArr6);
            zzYKF.zzX(iArr7, zzyke5.zzW2i, iArr7);
            zzYKF.zzX(iArr7, zzyke4.zzW2i, iArr7);
            iArr = iArr6;
            iArr2 = iArr7;
        }
        boolean zZzXzv2 = zzyke6.zzXzv();
        if (zZzXzv2) {
            iArr3 = zzyke.zzW2i;
            iArr4 = zzyke2.zzW2i;
            c = 0;
        } else {
            c = 0;
            zzYKF.zzK(zzyke6.zzW2i, iArr8);
            zzYKF.zzX(iArr8, zzyke.zzW2i, iArr5);
            zzYKF.zzX(iArr8, zzyke6.zzW2i, iArr8);
            zzYKF.zzX(iArr8, zzyke2.zzW2i, iArr8);
            iArr3 = iArr5;
            iArr4 = iArr8;
        }
        int[] iArr9 = new int[8];
        zzYKF.zzV(iArr3, iArr, iArr9);
        zzYKF.zzV(iArr4, iArr2, iArr6);
        if (zzYHX.zzZB(iArr9)) {
            return zzYHX.zzZB(iArr6) ? zzXzb() : zzym1ZzXHv.zzXzM();
        }
        zzYKF.zzK(iArr9, iArr7);
        int[] iArr10 = new int[8];
        zzYKF.zzX(iArr7, iArr9, iArr10);
        zzYKF.zzX(iArr7, iArr3, iArr7);
        zzYKF.zzM(iArr10, iArr10);
        zzYHX.zzR(iArr4, iArr10, iArr5);
        zzYKF.zzL(zzYHX.zzL(iArr7, iArr7, iArr10), iArr10);
        zzYKE zzyke7 = new zzYKE(iArr8);
        zzYKF.zzK(iArr6, zzyke7.zzW2i);
        int[] iArr11 = zzyke7.zzW2i;
        zzYKF.zzV(iArr11, iArr10, iArr11);
        zzYKE zzyke8 = new zzYKE(iArr10);
        zzYKF.zzV(iArr7, zzyke7.zzW2i, zzyke8.zzW2i);
        zzYKF.zzW(zzyke8.zzW2i, iArr6, iArr5);
        zzYKF.zzL(iArr5, zzyke8.zzW2i);
        zzYKE zzyke9 = new zzYKE(iArr9);
        if (!zZzXzv) {
            int[] iArr12 = zzyke9.zzW2i;
            zzYKF.zzX(iArr12, zzyke5.zzW2i, iArr12);
        }
        if (!zZzXzv2) {
            int[] iArr13 = zzyke9.zzW2i;
            zzYKF.zzX(iArr13, zzyke6.zzW2i, iArr13);
        }
        zzYM0[] zzym0Arr = new zzYM0[1];
        zzym0Arr[c] = zzyke9;
        return new zzYKD(zzym1ZzXHv, zzyke7, zzyke8, zzym0Arr);
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
        zzYKE zzyke = (zzYKE) this.f51158ao;
        if (zzyke.isZero()) {
            return zzym1ZzXHv.zzXzM();
        }
        zzYKE zzyke2 = (zzYKE) this.f51157an;
        zzYKE zzyke3 = (zzYKE) this.f51159ap[0];
        int[] iArr = new int[8];
        int[] iArr2 = new int[8];
        int[] iArr3 = new int[8];
        zzYKF.zzK(zzyke.zzW2i, iArr3);
        int[] iArr4 = new int[8];
        zzYKF.zzK(iArr3, iArr4);
        boolean zZzXzv = zzyke3.zzXzv();
        int[] iArr5 = zzyke3.zzW2i;
        if (!zZzXzv) {
            zzYKF.zzK(iArr5, iArr2);
            iArr5 = iArr2;
        }
        zzYKF.zzV(zzyke2.zzW2i, iArr5, iArr);
        zzYKF.zzY(zzyke2.zzW2i, iArr5, iArr2);
        zzYKF.zzX(iArr2, iArr, iArr2);
        zzYKF.zzL(zzYHX.zzL(iArr2, iArr2, iArr2), iArr2);
        zzYKF.zzX(iArr3, zzyke2.zzW2i, iArr3);
        zzYKF.zzL(zzYI2.zzT(8, iArr3, 0), iArr3);
        zzYKF.zzL(zzYI2.zzY(8, iArr4, 0, iArr), iArr);
        zzYKE zzyke4 = new zzYKE(iArr4);
        zzYKF.zzK(iArr2, zzyke4.zzW2i);
        int[] iArr6 = zzyke4.zzW2i;
        zzYKF.zzV(iArr6, iArr3, iArr6);
        int[] iArr7 = zzyke4.zzW2i;
        zzYKF.zzV(iArr7, iArr3, iArr7);
        zzYKE zzyke5 = new zzYKE(iArr3);
        zzYKF.zzV(iArr3, zzyke4.zzW2i, zzyke5.zzW2i);
        int[] iArr8 = zzyke5.zzW2i;
        zzYKF.zzX(iArr8, iArr2, iArr8);
        int[] iArr9 = zzyke5.zzW2i;
        zzYKF.zzV(iArr9, iArr, iArr9);
        zzYKE zzyke6 = new zzYKE(iArr2);
        zzYKF.zzJ(zzyke.zzW2i, zzyke6.zzW2i);
        if (!zZzXzv) {
            int[] iArr10 = zzyke6.zzW2i;
            zzYKF.zzX(iArr10, zzyke3.zzW2i, iArr10);
        }
        return new zzYKD(zzym1ZzXHv, zzyke4, zzyke5, new zzYM0[]{zzyke6});
    }

    @Override // com.aspose.words.internal.zzYLX
    public final zzYLX zzXzc() {
        return zzXzd() ? this : new zzYKD(this.zzWoB, this.f51157an, this.f51158ao.zzXzz(), this.f51159ap);
    }

    public zzYKD(zzYM1 zzym1, zzYM0 zzym0, zzYM0 zzym02, zzYM0[] zzym0Arr) {
        super(zzym1, zzym0, zzym02, zzym0Arr);
    }
}

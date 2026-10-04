package com.aspose.words.internal;

import com.aspose.words.internal.zzYLX;

/* JADX INFO: loaded from: classes5.dex */
final class zzYKL extends zzYLX.zzY {
    public zzYKL(zzYM1 zzym1, zzYM0 zzym0, zzYM0 zzym02) {
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
        zzYKM zzykm = (zzYKM) this.f51157an;
        zzYKM zzykm2 = (zzYKM) this.f51158ao;
        zzYKM zzykm3 = (zzYKM) zzylx.zzXzl();
        zzYKM zzykm4 = (zzYKM) zzylx.zzXzk();
        zzYKM zzykm5 = (zzYKM) this.f51159ap[0];
        zzYKM zzykm6 = (zzYKM) zzylx.zzeQ(0);
        int[] iArr5 = new int[14];
        int[] iArr6 = new int[7];
        int[] iArr7 = new int[7];
        int[] iArr8 = new int[7];
        boolean zZzXzv = zzykm5.zzXzv();
        if (zZzXzv) {
            iArr = zzykm3.zzW2i;
            iArr2 = zzykm4.zzW2i;
        } else {
            zzYKN.zzK(zzykm5.zzW2i, iArr7);
            zzYKN.zzX(iArr7, zzykm3.zzW2i, iArr6);
            zzYKN.zzX(iArr7, zzykm5.zzW2i, iArr7);
            zzYKN.zzX(iArr7, zzykm4.zzW2i, iArr7);
            iArr = iArr6;
            iArr2 = iArr7;
        }
        boolean zZzXzv2 = zzykm6.zzXzv();
        if (zZzXzv2) {
            iArr3 = zzykm.zzW2i;
            iArr4 = zzykm2.zzW2i;
            c = 0;
        } else {
            c = 0;
            zzYKN.zzK(zzykm6.zzW2i, iArr8);
            zzYKN.zzX(iArr8, zzykm.zzW2i, iArr5);
            zzYKN.zzX(iArr8, zzykm6.zzW2i, iArr8);
            zzYKN.zzX(iArr8, zzykm2.zzW2i, iArr8);
            iArr3 = iArr5;
            iArr4 = iArr8;
        }
        int[] iArr9 = new int[7];
        zzYKN.zzV(iArr3, iArr, iArr9);
        zzYKN.zzV(iArr4, iArr2, iArr6);
        if (zzYHY.zzZB(iArr9)) {
            return zzYHY.zzZB(iArr6) ? zzXzb() : zzym1ZzXHv.zzXzM();
        }
        zzYKN.zzK(iArr9, iArr7);
        int[] iArr10 = new int[7];
        zzYKN.zzX(iArr7, iArr9, iArr10);
        zzYKN.zzX(iArr7, iArr3, iArr7);
        zzYKN.zzM(iArr10, iArr10);
        zzYHY.zzR(iArr4, iArr10, iArr5);
        zzYKN.zzL(zzYHY.zzL(iArr7, iArr7, iArr10), iArr10);
        zzYKM zzykm7 = new zzYKM(iArr8);
        zzYKN.zzK(iArr6, zzykm7.zzW2i);
        int[] iArr11 = zzykm7.zzW2i;
        zzYKN.zzV(iArr11, iArr10, iArr11);
        zzYKM zzykm8 = new zzYKM(iArr10);
        zzYKN.zzV(iArr7, zzykm7.zzW2i, zzykm8.zzW2i);
        zzYKN.zzW(zzykm8.zzW2i, iArr6, iArr5);
        zzYKN.zzL(iArr5, zzykm8.zzW2i);
        zzYKM zzykm9 = new zzYKM(iArr9);
        if (!zZzXzv) {
            int[] iArr12 = zzykm9.zzW2i;
            zzYKN.zzX(iArr12, zzykm5.zzW2i, iArr12);
        }
        if (!zZzXzv2) {
            int[] iArr13 = zzykm9.zzW2i;
            zzYKN.zzX(iArr13, zzykm6.zzW2i, iArr13);
        }
        zzYM0[] zzym0Arr = new zzYM0[1];
        zzym0Arr[c] = zzykm9;
        return new zzYKL(zzym1ZzXHv, zzykm7, zzykm8, zzym0Arr);
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
        zzYKM zzykm = (zzYKM) this.f51158ao;
        if (zzykm.isZero()) {
            return zzym1ZzXHv.zzXzM();
        }
        zzYKM zzykm2 = (zzYKM) this.f51157an;
        zzYKM zzykm3 = (zzYKM) this.f51159ap[0];
        int[] iArr = new int[7];
        int[] iArr2 = new int[7];
        int[] iArr3 = new int[7];
        zzYKN.zzK(zzykm.zzW2i, iArr3);
        int[] iArr4 = new int[7];
        zzYKN.zzK(iArr3, iArr4);
        boolean zZzXzv = zzykm3.zzXzv();
        int[] iArr5 = zzykm3.zzW2i;
        if (!zZzXzv) {
            zzYKN.zzK(iArr5, iArr2);
            iArr5 = iArr2;
        }
        zzYKN.zzV(zzykm2.zzW2i, iArr5, iArr);
        zzYKN.zzY(zzykm2.zzW2i, iArr5, iArr2);
        zzYKN.zzX(iArr2, iArr, iArr2);
        zzYKN.zzL(zzYHY.zzL(iArr2, iArr2, iArr2), iArr2);
        zzYKN.zzX(iArr3, zzykm2.zzW2i, iArr3);
        zzYKN.zzL(zzYI2.zzT(7, iArr3, 0), iArr3);
        zzYKN.zzL(zzYI2.zzY(7, iArr4, 0, iArr), iArr);
        zzYKM zzykm4 = new zzYKM(iArr4);
        zzYKN.zzK(iArr2, zzykm4.zzW2i);
        int[] iArr6 = zzykm4.zzW2i;
        zzYKN.zzV(iArr6, iArr3, iArr6);
        int[] iArr7 = zzykm4.zzW2i;
        zzYKN.zzV(iArr7, iArr3, iArr7);
        zzYKM zzykm5 = new zzYKM(iArr3);
        zzYKN.zzV(iArr3, zzykm4.zzW2i, zzykm5.zzW2i);
        int[] iArr8 = zzykm5.zzW2i;
        zzYKN.zzX(iArr8, iArr2, iArr8);
        int[] iArr9 = zzykm5.zzW2i;
        zzYKN.zzV(iArr9, iArr, iArr9);
        zzYKM zzykm6 = new zzYKM(iArr2);
        zzYKN.zzJ(zzykm.zzW2i, zzykm6.zzW2i);
        if (!zZzXzv) {
            int[] iArr10 = zzykm6.zzW2i;
            zzYKN.zzX(iArr10, zzykm3.zzW2i, iArr10);
        }
        return new zzYKL(zzym1ZzXHv, zzykm4, zzykm5, new zzYM0[]{zzykm6});
    }

    @Override // com.aspose.words.internal.zzYLX
    public final zzYLX zzXzc() {
        return zzXzd() ? this : new zzYKL(this.zzWoB, this.f51157an, this.f51158ao.zzXzz(), this.f51159ap);
    }

    public zzYKL(zzYM1 zzym1, zzYM0 zzym0, zzYM0 zzym02, zzYM0[] zzym0Arr) {
        super(zzym1, zzym0, zzym02, zzym0Arr);
    }
}

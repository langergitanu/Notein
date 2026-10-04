package com.aspose.words.internal;

import com.aspose.words.internal.zzYLX;

/* JADX INFO: loaded from: classes5.dex */
final class zzYKX extends zzYLX.zzY {
    public zzYKX(zzYM1 zzym1, zzYM0 zzym0, zzYM0 zzym02) {
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
        zzYKY zzyky = (zzYKY) this.f51157an;
        zzYKY zzyky2 = (zzYKY) this.f51158ao;
        zzYKY zzyky3 = (zzYKY) zzylx.zzXzl();
        zzYKY zzyky4 = (zzYKY) zzylx.zzXzk();
        zzYKY zzyky5 = (zzYKY) this.f51159ap[0];
        zzYKY zzyky6 = (zzYKY) zzylx.zzeQ(0);
        int[] iArr5 = new int[12];
        int[] iArr6 = new int[6];
        int[] iArr7 = new int[6];
        int[] iArr8 = new int[6];
        boolean zZzXzv = zzyky5.zzXzv();
        if (zZzXzv) {
            iArr = zzyky3.zzW2i;
            iArr2 = zzyky4.zzW2i;
        } else {
            zzYKZ.zzK(zzyky5.zzW2i, iArr7);
            zzYKZ.zzX(iArr7, zzyky3.zzW2i, iArr6);
            zzYKZ.zzX(iArr7, zzyky5.zzW2i, iArr7);
            zzYKZ.zzX(iArr7, zzyky4.zzW2i, iArr7);
            iArr = iArr6;
            iArr2 = iArr7;
        }
        boolean zZzXzv2 = zzyky6.zzXzv();
        if (zZzXzv2) {
            iArr3 = zzyky.zzW2i;
            iArr4 = zzyky2.zzW2i;
            c = 0;
        } else {
            c = 0;
            zzYKZ.zzK(zzyky6.zzW2i, iArr8);
            zzYKZ.zzX(iArr8, zzyky.zzW2i, iArr5);
            zzYKZ.zzX(iArr8, zzyky6.zzW2i, iArr8);
            zzYKZ.zzX(iArr8, zzyky2.zzW2i, iArr8);
            iArr3 = iArr5;
            iArr4 = iArr8;
        }
        int[] iArr9 = new int[6];
        zzYKZ.zzV(iArr3, iArr, iArr9);
        zzYKZ.zzV(iArr4, iArr2, iArr6);
        if (zzYHZ.zzZB(iArr9)) {
            return zzYHZ.zzZB(iArr6) ? zzXzb() : zzym1ZzXHv.zzXzM();
        }
        zzYKZ.zzK(iArr9, iArr7);
        int[] iArr10 = new int[6];
        zzYKZ.zzX(iArr7, iArr9, iArr10);
        zzYKZ.zzX(iArr7, iArr3, iArr7);
        zzYKZ.zzM(iArr10, iArr10);
        zzYHZ.zzR(iArr4, iArr10, iArr5);
        zzYKZ.zzL(zzYHZ.zzL(iArr7, iArr7, iArr10), iArr10);
        zzYKY zzyky7 = new zzYKY(iArr8);
        zzYKZ.zzK(iArr6, zzyky7.zzW2i);
        int[] iArr11 = zzyky7.zzW2i;
        zzYKZ.zzV(iArr11, iArr10, iArr11);
        zzYKY zzyky8 = new zzYKY(iArr10);
        zzYKZ.zzV(iArr7, zzyky7.zzW2i, zzyky8.zzW2i);
        zzYKZ.zzW(zzyky8.zzW2i, iArr6, iArr5);
        zzYKZ.zzL(iArr5, zzyky8.zzW2i);
        zzYKY zzyky9 = new zzYKY(iArr9);
        if (!zZzXzv) {
            int[] iArr12 = zzyky9.zzW2i;
            zzYKZ.zzX(iArr12, zzyky5.zzW2i, iArr12);
        }
        if (!zZzXzv2) {
            int[] iArr13 = zzyky9.zzW2i;
            zzYKZ.zzX(iArr13, zzyky6.zzW2i, iArr13);
        }
        zzYM0[] zzym0Arr = new zzYM0[1];
        zzym0Arr[c] = zzyky9;
        return new zzYKX(zzym1ZzXHv, zzyky7, zzyky8, zzym0Arr);
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
        zzYKY zzyky = (zzYKY) this.f51158ao;
        if (zzyky.isZero()) {
            return zzym1ZzXHv.zzXzM();
        }
        zzYKY zzyky2 = (zzYKY) this.f51157an;
        zzYKY zzyky3 = (zzYKY) this.f51159ap[0];
        int[] iArr = new int[6];
        zzYKZ.zzK(zzyky.zzW2i, iArr);
        int[] iArr2 = new int[6];
        zzYKZ.zzK(iArr, iArr2);
        int[] iArr3 = new int[6];
        zzYKZ.zzK(zzyky2.zzW2i, iArr3);
        zzYKZ.zzL(zzYHZ.zzL(iArr3, iArr3, iArr3), iArr3);
        zzYKZ.zzX(iArr, zzyky2.zzW2i, iArr);
        zzYKZ.zzL(zzYI2.zzT(6, iArr, 0), iArr);
        int[] iArr4 = new int[6];
        zzYKZ.zzL(zzYI2.zzY(6, iArr2, 0, iArr4), iArr4);
        zzYKY zzyky4 = new zzYKY(iArr2);
        zzYKZ.zzK(iArr3, zzyky4.zzW2i);
        int[] iArr5 = zzyky4.zzW2i;
        zzYKZ.zzV(iArr5, iArr, iArr5);
        int[] iArr6 = zzyky4.zzW2i;
        zzYKZ.zzV(iArr6, iArr, iArr6);
        zzYKY zzyky5 = new zzYKY(iArr);
        zzYKZ.zzV(iArr, zzyky4.zzW2i, zzyky5.zzW2i);
        int[] iArr7 = zzyky5.zzW2i;
        zzYKZ.zzX(iArr7, iArr3, iArr7);
        int[] iArr8 = zzyky5.zzW2i;
        zzYKZ.zzV(iArr8, iArr4, iArr8);
        zzYKY zzyky6 = new zzYKY(iArr3);
        zzYKZ.zzJ(zzyky.zzW2i, zzyky6.zzW2i);
        if (!zzyky3.zzXzv()) {
            int[] iArr9 = zzyky6.zzW2i;
            zzYKZ.zzX(iArr9, zzyky3.zzW2i, iArr9);
        }
        return new zzYKX(zzym1ZzXHv, zzyky4, zzyky5, new zzYM0[]{zzyky6});
    }

    @Override // com.aspose.words.internal.zzYLX
    public final zzYLX zzXzc() {
        return zzXzd() ? this : new zzYKX(this.zzWoB, this.f51157an, this.f51158ao.zzXzz(), this.f51159ap);
    }

    public zzYKX(zzYM1 zzym1, zzYM0 zzym0, zzYM0 zzym02, zzYM0[] zzym0Arr) {
        super(zzym1, zzym0, zzym02, zzym0Arr);
    }
}

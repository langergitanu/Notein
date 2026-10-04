package com.aspose.words.internal;

import com.aspose.words.internal.zzYLX;

/* JADX INFO: loaded from: classes5.dex */
final class zzYKT extends zzYLX.zzY {
    public zzYKT(zzYM1 zzym1, zzYM0 zzym0, zzYM0 zzym02) {
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
        zzYKU zzyku = (zzYKU) this.f51157an;
        zzYKU zzyku2 = (zzYKU) this.f51158ao;
        zzYKU zzyku3 = (zzYKU) zzylx.zzXzl();
        zzYKU zzyku4 = (zzYKU) zzylx.zzXzk();
        zzYKU zzyku5 = (zzYKU) this.f51159ap[0];
        zzYKU zzyku6 = (zzYKU) zzylx.zzeQ(0);
        int[] iArr5 = new int[12];
        int[] iArr6 = new int[6];
        int[] iArr7 = new int[6];
        int[] iArr8 = new int[6];
        boolean zZzXzv = zzyku5.zzXzv();
        if (zZzXzv) {
            iArr = zzyku3.zzW2i;
            iArr2 = zzyku4.zzW2i;
        } else {
            zzYKV.zzK(zzyku5.zzW2i, iArr7);
            zzYKV.zzX(iArr7, zzyku3.zzW2i, iArr6);
            zzYKV.zzX(iArr7, zzyku5.zzW2i, iArr7);
            zzYKV.zzX(iArr7, zzyku4.zzW2i, iArr7);
            iArr = iArr6;
            iArr2 = iArr7;
        }
        boolean zZzXzv2 = zzyku6.zzXzv();
        if (zZzXzv2) {
            iArr3 = zzyku.zzW2i;
            iArr4 = zzyku2.zzW2i;
            c = 0;
        } else {
            c = 0;
            zzYKV.zzK(zzyku6.zzW2i, iArr8);
            zzYKV.zzX(iArr8, zzyku.zzW2i, iArr5);
            zzYKV.zzX(iArr8, zzyku6.zzW2i, iArr8);
            zzYKV.zzX(iArr8, zzyku2.zzW2i, iArr8);
            iArr3 = iArr5;
            iArr4 = iArr8;
        }
        int[] iArr9 = new int[6];
        zzYKV.zzV(iArr3, iArr, iArr9);
        zzYKV.zzV(iArr4, iArr2, iArr6);
        if (zzYHZ.zzZB(iArr9)) {
            return zzYHZ.zzZB(iArr6) ? zzXzb() : zzym1ZzXHv.zzXzM();
        }
        zzYKV.zzK(iArr9, iArr7);
        int[] iArr10 = new int[6];
        zzYKV.zzX(iArr7, iArr9, iArr10);
        zzYKV.zzX(iArr7, iArr3, iArr7);
        zzYKV.zzM(iArr10, iArr10);
        zzYHZ.zzR(iArr4, iArr10, iArr5);
        zzYKV.zzL(zzYHZ.zzL(iArr7, iArr7, iArr10), iArr10);
        zzYKU zzyku7 = new zzYKU(iArr8);
        zzYKV.zzK(iArr6, zzyku7.zzW2i);
        int[] iArr11 = zzyku7.zzW2i;
        zzYKV.zzV(iArr11, iArr10, iArr11);
        zzYKU zzyku8 = new zzYKU(iArr10);
        zzYKV.zzV(iArr7, zzyku7.zzW2i, zzyku8.zzW2i);
        zzYKV.zzW(zzyku8.zzW2i, iArr6, iArr5);
        zzYKV.zzL(iArr5, zzyku8.zzW2i);
        zzYKU zzyku9 = new zzYKU(iArr9);
        if (!zZzXzv) {
            int[] iArr12 = zzyku9.zzW2i;
            zzYKV.zzX(iArr12, zzyku5.zzW2i, iArr12);
        }
        if (!zZzXzv2) {
            int[] iArr13 = zzyku9.zzW2i;
            zzYKV.zzX(iArr13, zzyku6.zzW2i, iArr13);
        }
        zzYM0[] zzym0Arr = new zzYM0[1];
        zzym0Arr[c] = zzyku9;
        return new zzYKT(zzym1ZzXHv, zzyku7, zzyku8, zzym0Arr);
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
        zzYKU zzyku = (zzYKU) this.f51158ao;
        if (zzyku.isZero()) {
            return zzym1ZzXHv.zzXzM();
        }
        zzYKU zzyku2 = (zzYKU) this.f51157an;
        zzYKU zzyku3 = (zzYKU) this.f51159ap[0];
        int[] iArr = new int[6];
        int[] iArr2 = new int[6];
        int[] iArr3 = new int[6];
        zzYKV.zzK(zzyku.zzW2i, iArr3);
        int[] iArr4 = new int[6];
        zzYKV.zzK(iArr3, iArr4);
        boolean zZzXzv = zzyku3.zzXzv();
        int[] iArr5 = zzyku3.zzW2i;
        if (!zZzXzv) {
            zzYKV.zzK(iArr5, iArr2);
            iArr5 = iArr2;
        }
        zzYKV.zzV(zzyku2.zzW2i, iArr5, iArr);
        zzYKV.zzY(zzyku2.zzW2i, iArr5, iArr2);
        zzYKV.zzX(iArr2, iArr, iArr2);
        zzYKV.zzL(zzYHZ.zzL(iArr2, iArr2, iArr2), iArr2);
        zzYKV.zzX(iArr3, zzyku2.zzW2i, iArr3);
        zzYKV.zzL(zzYI2.zzT(6, iArr3, 0), iArr3);
        zzYKV.zzL(zzYI2.zzY(6, iArr4, 0, iArr), iArr);
        zzYKU zzyku4 = new zzYKU(iArr4);
        zzYKV.zzK(iArr2, zzyku4.zzW2i);
        int[] iArr6 = zzyku4.zzW2i;
        zzYKV.zzV(iArr6, iArr3, iArr6);
        int[] iArr7 = zzyku4.zzW2i;
        zzYKV.zzV(iArr7, iArr3, iArr7);
        zzYKU zzyku5 = new zzYKU(iArr3);
        zzYKV.zzV(iArr3, zzyku4.zzW2i, zzyku5.zzW2i);
        int[] iArr8 = zzyku5.zzW2i;
        zzYKV.zzX(iArr8, iArr2, iArr8);
        int[] iArr9 = zzyku5.zzW2i;
        zzYKV.zzV(iArr9, iArr, iArr9);
        zzYKU zzyku6 = new zzYKU(iArr2);
        zzYKV.zzJ(zzyku.zzW2i, zzyku6.zzW2i);
        if (!zZzXzv) {
            int[] iArr10 = zzyku6.zzW2i;
            zzYKV.zzX(iArr10, zzyku3.zzW2i, iArr10);
        }
        return new zzYKT(zzym1ZzXHv, zzyku4, zzyku5, new zzYM0[]{zzyku6});
    }

    @Override // com.aspose.words.internal.zzYLX
    public final zzYLX zzXzc() {
        return zzXzd() ? this : new zzYKT(this.zzWoB, this.f51157an, this.f51158ao.zzXzz(), this.f51159ap);
    }

    public zzYKT(zzYM1 zzym1, zzYM0 zzym0, zzYM0 zzym02, zzYM0[] zzym0Arr) {
        super(zzym1, zzym0, zzym02, zzym0Arr);
    }
}

package com.aspose.words.internal;

import com.aspose.words.internal.zzYLX;

/* JADX INFO: loaded from: classes5.dex */
final class zzYKP extends zzYLX.zzY {
    public zzYKP(zzYM1 zzym1, zzYM0 zzym0, zzYM0 zzym02) {
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
        zzYKQ zzykq = (zzYKQ) this.f51157an;
        zzYKQ zzykq2 = (zzYKQ) this.f51158ao;
        zzYKQ zzykq3 = (zzYKQ) zzylx.zzXzl();
        zzYKQ zzykq4 = (zzYKQ) zzylx.zzXzk();
        zzYKQ zzykq5 = (zzYKQ) this.f51159ap[0];
        zzYKQ zzykq6 = (zzYKQ) zzylx.zzeQ(0);
        int[] iArr5 = new int[14];
        int[] iArr6 = new int[7];
        int[] iArr7 = new int[7];
        int[] iArr8 = new int[7];
        boolean zZzXzv = zzykq5.zzXzv();
        if (zZzXzv) {
            iArr = zzykq3.zzW2i;
            iArr2 = zzykq4.zzW2i;
        } else {
            zzYKR.zzK(zzykq5.zzW2i, iArr7);
            zzYKR.zzX(iArr7, zzykq3.zzW2i, iArr6);
            zzYKR.zzX(iArr7, zzykq5.zzW2i, iArr7);
            zzYKR.zzX(iArr7, zzykq4.zzW2i, iArr7);
            iArr = iArr6;
            iArr2 = iArr7;
        }
        boolean zZzXzv2 = zzykq6.zzXzv();
        if (zZzXzv2) {
            iArr3 = zzykq.zzW2i;
            iArr4 = zzykq2.zzW2i;
            c = 0;
        } else {
            c = 0;
            zzYKR.zzK(zzykq6.zzW2i, iArr8);
            zzYKR.zzX(iArr8, zzykq.zzW2i, iArr5);
            zzYKR.zzX(iArr8, zzykq6.zzW2i, iArr8);
            zzYKR.zzX(iArr8, zzykq2.zzW2i, iArr8);
            iArr3 = iArr5;
            iArr4 = iArr8;
        }
        int[] iArr9 = new int[7];
        zzYKR.zzV(iArr3, iArr, iArr9);
        zzYKR.zzV(iArr4, iArr2, iArr6);
        if (zzYHY.zzZB(iArr9)) {
            return zzYHY.zzZB(iArr6) ? zzXzb() : zzym1ZzXHv.zzXzM();
        }
        zzYKR.zzK(iArr9, iArr7);
        int[] iArr10 = new int[7];
        zzYKR.zzX(iArr7, iArr9, iArr10);
        zzYKR.zzX(iArr7, iArr3, iArr7);
        zzYKR.zzM(iArr10, iArr10);
        zzYHY.zzR(iArr4, iArr10, iArr5);
        zzYKR.zzL(zzYHY.zzL(iArr7, iArr7, iArr10), iArr10);
        zzYKQ zzykq7 = new zzYKQ(iArr8);
        zzYKR.zzK(iArr6, zzykq7.zzW2i);
        int[] iArr11 = zzykq7.zzW2i;
        zzYKR.zzV(iArr11, iArr10, iArr11);
        zzYKQ zzykq8 = new zzYKQ(iArr10);
        zzYKR.zzV(iArr7, zzykq7.zzW2i, zzykq8.zzW2i);
        zzYKR.zzW(zzykq8.zzW2i, iArr6, iArr5);
        zzYKR.zzL(iArr5, zzykq8.zzW2i);
        zzYKQ zzykq9 = new zzYKQ(iArr9);
        if (!zZzXzv) {
            int[] iArr12 = zzykq9.zzW2i;
            zzYKR.zzX(iArr12, zzykq5.zzW2i, iArr12);
        }
        if (!zZzXzv2) {
            int[] iArr13 = zzykq9.zzW2i;
            zzYKR.zzX(iArr13, zzykq6.zzW2i, iArr13);
        }
        zzYM0[] zzym0Arr = new zzYM0[1];
        zzym0Arr[c] = zzykq9;
        return new zzYKP(zzym1ZzXHv, zzykq7, zzykq8, zzym0Arr);
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
        zzYKQ zzykq = (zzYKQ) this.f51158ao;
        if (zzykq.isZero()) {
            return zzym1ZzXHv.zzXzM();
        }
        zzYKQ zzykq2 = (zzYKQ) this.f51157an;
        zzYKQ zzykq3 = (zzYKQ) this.f51159ap[0];
        int[] iArr = new int[7];
        zzYKR.zzK(zzykq.zzW2i, iArr);
        int[] iArr2 = new int[7];
        zzYKR.zzK(iArr, iArr2);
        int[] iArr3 = new int[7];
        zzYKR.zzK(zzykq2.zzW2i, iArr3);
        zzYKR.zzL(zzYHY.zzL(iArr3, iArr3, iArr3), iArr3);
        zzYKR.zzX(iArr, zzykq2.zzW2i, iArr);
        zzYKR.zzL(zzYI2.zzT(7, iArr, 0), iArr);
        int[] iArr4 = new int[7];
        zzYKR.zzL(zzYI2.zzY(7, iArr2, 0, iArr4), iArr4);
        zzYKQ zzykq4 = new zzYKQ(iArr2);
        zzYKR.zzK(iArr3, zzykq4.zzW2i);
        int[] iArr5 = zzykq4.zzW2i;
        zzYKR.zzV(iArr5, iArr, iArr5);
        int[] iArr6 = zzykq4.zzW2i;
        zzYKR.zzV(iArr6, iArr, iArr6);
        zzYKQ zzykq5 = new zzYKQ(iArr);
        zzYKR.zzV(iArr, zzykq4.zzW2i, zzykq5.zzW2i);
        int[] iArr7 = zzykq5.zzW2i;
        zzYKR.zzX(iArr7, iArr3, iArr7);
        int[] iArr8 = zzykq5.zzW2i;
        zzYKR.zzV(iArr8, iArr4, iArr8);
        zzYKQ zzykq6 = new zzYKQ(iArr3);
        zzYKR.zzJ(zzykq.zzW2i, zzykq6.zzW2i);
        if (!zzykq3.zzXzv()) {
            int[] iArr9 = zzykq6.zzW2i;
            zzYKR.zzX(iArr9, zzykq3.zzW2i, iArr9);
        }
        return new zzYKP(zzym1ZzXHv, zzykq4, zzykq5, new zzYM0[]{zzykq6});
    }

    @Override // com.aspose.words.internal.zzYLX
    public final zzYLX zzXzc() {
        return zzXzd() ? this : new zzYKP(this.zzWoB, this.f51157an, this.f51158ao.zzXzz(), this.f51159ap);
    }

    public zzYKP(zzYM1 zzym1, zzYM0 zzym0, zzYM0 zzym02, zzYM0[] zzym0Arr) {
        super(zzym1, zzym0, zzym02, zzym0Arr);
    }
}

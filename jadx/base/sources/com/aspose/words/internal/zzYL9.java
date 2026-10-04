package com.aspose.words.internal;

import com.aspose.words.internal.zzYLX;

/* JADX INFO: loaded from: classes5.dex */
final class zzYL9 extends zzYLX.zzY {
    public zzYL9(zzYM1 zzym1, zzYM0 zzym0, zzYM0 zzym02) {
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
        zzYL2 zzyl2 = (zzYL2) this.f51157an;
        zzYL2 zzyl22 = (zzYL2) this.f51158ao;
        zzYL2 zzyl23 = (zzYL2) zzylx.zzXzl();
        zzYL2 zzyl24 = (zzYL2) zzylx.zzXzk();
        zzYL2 zzyl25 = (zzYL2) this.f51159ap[0];
        zzYL2 zzyl26 = (zzYL2) zzylx.zzeQ(0);
        int[] iArr5 = new int[10];
        int[] iArr6 = new int[5];
        int[] iArr7 = new int[5];
        int[] iArr8 = new int[5];
        boolean zZzXzv = zzyl25.zzXzv();
        if (zZzXzv) {
            iArr = zzyl23.zzW2i;
            iArr2 = zzyl24.zzW2i;
        } else {
            zzYL3.zzK(zzyl25.zzW2i, iArr7);
            zzYL3.zzX(iArr7, zzyl23.zzW2i, iArr6);
            zzYL3.zzX(iArr7, zzyl25.zzW2i, iArr7);
            zzYL3.zzX(iArr7, zzyl24.zzW2i, iArr7);
            iArr = iArr6;
            iArr2 = iArr7;
        }
        boolean zZzXzv2 = zzyl26.zzXzv();
        if (zZzXzv2) {
            iArr3 = zzyl2.zzW2i;
            iArr4 = zzyl22.zzW2i;
            c = 0;
        } else {
            c = 0;
            zzYL3.zzK(zzyl26.zzW2i, iArr8);
            zzYL3.zzX(iArr8, zzyl2.zzW2i, iArr5);
            zzYL3.zzX(iArr8, zzyl26.zzW2i, iArr8);
            zzYL3.zzX(iArr8, zzyl22.zzW2i, iArr8);
            iArr3 = iArr5;
            iArr4 = iArr8;
        }
        int[] iArr9 = new int[5];
        zzYL3.zzV(iArr3, iArr, iArr9);
        zzYL3.zzV(iArr4, iArr2, iArr6);
        if (zzYI0.zzZB(iArr9)) {
            return zzYI0.zzZB(iArr6) ? zzXzb() : zzym1ZzXHv.zzXzM();
        }
        zzYL3.zzK(iArr9, iArr7);
        int[] iArr10 = new int[5];
        zzYL3.zzX(iArr7, iArr9, iArr10);
        zzYL3.zzX(iArr7, iArr3, iArr7);
        zzYL3.zzM(iArr10, iArr10);
        zzYI0.zzR(iArr4, iArr10, iArr5);
        zzYL3.zzL(zzYI0.zzL(iArr7, iArr7, iArr10), iArr10);
        zzYL2 zzyl27 = new zzYL2(iArr8);
        zzYL3.zzK(iArr6, zzyl27.zzW2i);
        int[] iArr11 = zzyl27.zzW2i;
        zzYL3.zzV(iArr11, iArr10, iArr11);
        zzYL2 zzyl28 = new zzYL2(iArr10);
        zzYL3.zzV(iArr7, zzyl27.zzW2i, zzyl28.zzW2i);
        zzYL3.zzW(zzyl28.zzW2i, iArr6, iArr5);
        zzYL3.zzL(iArr5, zzyl28.zzW2i);
        zzYL2 zzyl29 = new zzYL2(iArr9);
        if (!zZzXzv) {
            int[] iArr12 = zzyl29.zzW2i;
            zzYL3.zzX(iArr12, zzyl25.zzW2i, iArr12);
        }
        if (!zZzXzv2) {
            int[] iArr13 = zzyl29.zzW2i;
            zzYL3.zzX(iArr13, zzyl26.zzW2i, iArr13);
        }
        zzYM0[] zzym0Arr = new zzYM0[1];
        zzym0Arr[c] = zzyl29;
        return new zzYL9(zzym1ZzXHv, zzyl27, zzyl28, zzym0Arr);
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
        zzYL2 zzyl2 = (zzYL2) this.f51158ao;
        if (zzyl2.isZero()) {
            return zzym1ZzXHv.zzXzM();
        }
        zzYL2 zzyl22 = (zzYL2) this.f51157an;
        zzYL2 zzyl23 = (zzYL2) this.f51159ap[0];
        int[] iArr = new int[5];
        zzYL3.zzK(zzyl2.zzW2i, iArr);
        int[] iArr2 = new int[5];
        zzYL3.zzK(iArr, iArr2);
        int[] iArr3 = new int[5];
        zzYL3.zzK(zzyl22.zzW2i, iArr3);
        zzYL3.zzL(zzYI0.zzL(iArr3, iArr3, iArr3), iArr3);
        zzYL3.zzX(iArr, zzyl22.zzW2i, iArr);
        zzYL3.zzL(zzYI2.zzT(5, iArr, 0), iArr);
        int[] iArr4 = new int[5];
        zzYL3.zzL(zzYI2.zzY(5, iArr2, 0, iArr4), iArr4);
        zzYL2 zzyl24 = new zzYL2(iArr2);
        zzYL3.zzK(iArr3, zzyl24.zzW2i);
        int[] iArr5 = zzyl24.zzW2i;
        zzYL3.zzV(iArr5, iArr, iArr5);
        int[] iArr6 = zzyl24.zzW2i;
        zzYL3.zzV(iArr6, iArr, iArr6);
        zzYL2 zzyl25 = new zzYL2(iArr);
        zzYL3.zzV(iArr, zzyl24.zzW2i, zzyl25.zzW2i);
        int[] iArr7 = zzyl25.zzW2i;
        zzYL3.zzX(iArr7, iArr3, iArr7);
        int[] iArr8 = zzyl25.zzW2i;
        zzYL3.zzV(iArr8, iArr4, iArr8);
        zzYL2 zzyl26 = new zzYL2(iArr3);
        zzYL3.zzJ(zzyl2.zzW2i, zzyl26.zzW2i);
        if (!zzyl23.zzXzv()) {
            int[] iArr9 = zzyl26.zzW2i;
            zzYL3.zzX(iArr9, zzyl23.zzW2i, iArr9);
        }
        return new zzYL9(zzym1ZzXHv, zzyl24, zzyl25, new zzYM0[]{zzyl26});
    }

    @Override // com.aspose.words.internal.zzYLX
    public final zzYLX zzXzc() {
        return zzXzd() ? this : new zzYL9(this.zzWoB, this.f51157an, this.f51158ao.zzXzz(), this.f51159ap);
    }

    public zzYL9(zzYM1 zzym1, zzYM0 zzym0, zzYM0 zzym02, zzYM0[] zzym0Arr) {
        super(zzym1, zzym0, zzym02, zzym0Arr);
    }
}

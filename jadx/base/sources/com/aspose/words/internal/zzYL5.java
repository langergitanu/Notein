package com.aspose.words.internal;

import com.aspose.words.internal.zzYLX;

/* JADX INFO: loaded from: classes5.dex */
final class zzYL5 extends zzYLX.zzY {
    public zzYL5(zzYM1 zzym1, zzYM0 zzym0, zzYM0 zzym02) {
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
        zzYL6 zzyl6 = (zzYL6) this.f51157an;
        zzYL6 zzyl62 = (zzYL6) this.f51158ao;
        zzYL6 zzyl63 = (zzYL6) zzylx.zzXzl();
        zzYL6 zzyl64 = (zzYL6) zzylx.zzXzk();
        zzYL6 zzyl65 = (zzYL6) this.f51159ap[0];
        zzYL6 zzyl66 = (zzYL6) zzylx.zzeQ(0);
        int[] iArr5 = new int[10];
        int[] iArr6 = new int[5];
        int[] iArr7 = new int[5];
        int[] iArr8 = new int[5];
        boolean zZzXzv = zzyl65.zzXzv();
        if (zZzXzv) {
            iArr = zzyl63.zzW2i;
            iArr2 = zzyl64.zzW2i;
        } else {
            zzYL7.zzK(zzyl65.zzW2i, iArr7);
            zzYL7.zzX(iArr7, zzyl63.zzW2i, iArr6);
            zzYL7.zzX(iArr7, zzyl65.zzW2i, iArr7);
            zzYL7.zzX(iArr7, zzyl64.zzW2i, iArr7);
            iArr = iArr6;
            iArr2 = iArr7;
        }
        boolean zZzXzv2 = zzyl66.zzXzv();
        if (zZzXzv2) {
            iArr3 = zzyl6.zzW2i;
            iArr4 = zzyl62.zzW2i;
            c = 0;
        } else {
            c = 0;
            zzYL7.zzK(zzyl66.zzW2i, iArr8);
            zzYL7.zzX(iArr8, zzyl6.zzW2i, iArr5);
            zzYL7.zzX(iArr8, zzyl66.zzW2i, iArr8);
            zzYL7.zzX(iArr8, zzyl62.zzW2i, iArr8);
            iArr3 = iArr5;
            iArr4 = iArr8;
        }
        int[] iArr9 = new int[5];
        zzYL7.zzV(iArr3, iArr, iArr9);
        zzYL7.zzV(iArr4, iArr2, iArr6);
        if (zzYI0.zzZB(iArr9)) {
            return zzYI0.zzZB(iArr6) ? zzXzb() : zzym1ZzXHv.zzXzM();
        }
        zzYL7.zzK(iArr9, iArr7);
        int[] iArr10 = new int[5];
        zzYL7.zzX(iArr7, iArr9, iArr10);
        zzYL7.zzX(iArr7, iArr3, iArr7);
        zzYL7.zzM(iArr10, iArr10);
        zzYI0.zzR(iArr4, iArr10, iArr5);
        zzYL7.zzL(zzYI0.zzL(iArr7, iArr7, iArr10), iArr10);
        zzYL6 zzyl67 = new zzYL6(iArr8);
        zzYL7.zzK(iArr6, zzyl67.zzW2i);
        int[] iArr11 = zzyl67.zzW2i;
        zzYL7.zzV(iArr11, iArr10, iArr11);
        zzYL6 zzyl68 = new zzYL6(iArr10);
        zzYL7.zzV(iArr7, zzyl67.zzW2i, zzyl68.zzW2i);
        zzYL7.zzW(zzyl68.zzW2i, iArr6, iArr5);
        zzYL7.zzL(iArr5, zzyl68.zzW2i);
        zzYL6 zzyl69 = new zzYL6(iArr9);
        if (!zZzXzv) {
            int[] iArr12 = zzyl69.zzW2i;
            zzYL7.zzX(iArr12, zzyl65.zzW2i, iArr12);
        }
        if (!zZzXzv2) {
            int[] iArr13 = zzyl69.zzW2i;
            zzYL7.zzX(iArr13, zzyl66.zzW2i, iArr13);
        }
        zzYM0[] zzym0Arr = new zzYM0[1];
        zzym0Arr[c] = zzyl69;
        return new zzYL5(zzym1ZzXHv, zzyl67, zzyl68, zzym0Arr);
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
        zzYL6 zzyl6 = (zzYL6) this.f51158ao;
        if (zzyl6.isZero()) {
            return zzym1ZzXHv.zzXzM();
        }
        zzYL6 zzyl62 = (zzYL6) this.f51157an;
        zzYL6 zzyl63 = (zzYL6) this.f51159ap[0];
        int[] iArr = new int[5];
        int[] iArr2 = new int[5];
        int[] iArr3 = new int[5];
        zzYL7.zzK(zzyl6.zzW2i, iArr3);
        int[] iArr4 = new int[5];
        zzYL7.zzK(iArr3, iArr4);
        boolean zZzXzv = zzyl63.zzXzv();
        int[] iArr5 = zzyl63.zzW2i;
        if (!zZzXzv) {
            zzYL7.zzK(iArr5, iArr2);
            iArr5 = iArr2;
        }
        zzYL7.zzV(zzyl62.zzW2i, iArr5, iArr);
        zzYL7.zzY(zzyl62.zzW2i, iArr5, iArr2);
        zzYL7.zzX(iArr2, iArr, iArr2);
        zzYL7.zzL(zzYI0.zzL(iArr2, iArr2, iArr2), iArr2);
        zzYL7.zzX(iArr3, zzyl62.zzW2i, iArr3);
        zzYL7.zzL(zzYI2.zzT(5, iArr3, 0), iArr3);
        zzYL7.zzL(zzYI2.zzY(5, iArr4, 0, iArr), iArr);
        zzYL6 zzyl64 = new zzYL6(iArr4);
        zzYL7.zzK(iArr2, zzyl64.zzW2i);
        int[] iArr6 = zzyl64.zzW2i;
        zzYL7.zzV(iArr6, iArr3, iArr6);
        int[] iArr7 = zzyl64.zzW2i;
        zzYL7.zzV(iArr7, iArr3, iArr7);
        zzYL6 zzyl65 = new zzYL6(iArr3);
        zzYL7.zzV(iArr3, zzyl64.zzW2i, zzyl65.zzW2i);
        int[] iArr8 = zzyl65.zzW2i;
        zzYL7.zzX(iArr8, iArr2, iArr8);
        int[] iArr9 = zzyl65.zzW2i;
        zzYL7.zzV(iArr9, iArr, iArr9);
        zzYL6 zzyl66 = new zzYL6(iArr2);
        zzYL7.zzJ(zzyl6.zzW2i, zzyl66.zzW2i);
        if (!zZzXzv) {
            int[] iArr10 = zzyl66.zzW2i;
            zzYL7.zzX(iArr10, zzyl63.zzW2i, iArr10);
        }
        return new zzYL5(zzym1ZzXHv, zzyl64, zzyl65, new zzYM0[]{zzyl66});
    }

    @Override // com.aspose.words.internal.zzYLX
    public final zzYLX zzXzc() {
        return zzXzd() ? this : new zzYL5(this.zzWoB, this.f51157an, this.f51158ao.zzXzz(), this.f51159ap);
    }

    public zzYL5(zzYM1 zzym1, zzYM0 zzym0, zzYM0 zzym02, zzYM0[] zzym0Arr) {
        super(zzym1, zzym0, zzym02, zzym0Arr);
    }
}

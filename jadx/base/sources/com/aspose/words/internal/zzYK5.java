package com.aspose.words.internal;

import com.aspose.words.internal.zzYLX;

/* JADX INFO: loaded from: classes5.dex */
final class zzYK5 extends zzYLX.zzY {
    public zzYK5(zzYM1 zzym1, zzYM0 zzym0, zzYM0 zzym02) {
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
        zzYK6 zzyk6 = (zzYK6) this.f51157an;
        zzYK6 zzyk62 = (zzYK6) this.f51158ao;
        zzYK6 zzyk63 = (zzYK6) zzylx.zzXzl();
        zzYK6 zzyk64 = (zzYK6) zzylx.zzXzk();
        zzYK6 zzyk65 = (zzYK6) this.f51159ap[0];
        zzYK6 zzyk66 = (zzYK6) zzylx.zzeQ(0);
        int[] iArr5 = new int[17];
        int[] iArr6 = new int[17];
        int[] iArr7 = new int[17];
        int[] iArr8 = new int[17];
        boolean zZzXzv = zzyk65.zzXzv();
        if (zZzXzv) {
            iArr = zzyk63.zzW2i;
            iArr2 = zzyk64.zzW2i;
        } else {
            zzYK7.zzK(zzyk65.zzW2i, iArr7);
            zzYK7.zzX(iArr7, zzyk63.zzW2i, iArr6);
            zzYK7.zzX(iArr7, zzyk65.zzW2i, iArr7);
            zzYK7.zzX(iArr7, zzyk64.zzW2i, iArr7);
            iArr = iArr6;
            iArr2 = iArr7;
        }
        boolean zZzXzv2 = zzyk66.zzXzv();
        if (zZzXzv2) {
            iArr3 = zzyk6.zzW2i;
            iArr4 = zzyk62.zzW2i;
            c = 0;
        } else {
            c = 0;
            zzYK7.zzK(zzyk66.zzW2i, iArr8);
            zzYK7.zzX(iArr8, zzyk6.zzW2i, iArr5);
            zzYK7.zzX(iArr8, zzyk66.zzW2i, iArr8);
            zzYK7.zzX(iArr8, zzyk62.zzW2i, iArr8);
            iArr3 = iArr5;
            iArr4 = iArr8;
        }
        int[] iArr9 = new int[17];
        zzYK7.zzV(iArr3, iArr, iArr9);
        zzYK7.zzV(iArr4, iArr2, iArr6);
        if (zzYI2.zzH(17, iArr9)) {
            return zzYI2.zzH(17, iArr6) ? zzXzb() : zzym1ZzXHv.zzXzM();
        }
        zzYK7.zzK(iArr9, iArr7);
        int[] iArr10 = new int[17];
        zzYK7.zzX(iArr7, iArr9, iArr10);
        zzYK7.zzX(iArr7, iArr3, iArr7);
        zzYK7.zzX(iArr4, iArr10, iArr5);
        zzYK6 zzyk67 = new zzYK6(iArr8);
        zzYK7.zzK(iArr6, zzyk67.zzW2i);
        int[] iArr11 = zzyk67.zzW2i;
        zzYK7.zzY(iArr11, iArr10, iArr11);
        int[] iArr12 = zzyk67.zzW2i;
        zzYK7.zzV(iArr12, iArr7, iArr12);
        int[] iArr13 = zzyk67.zzW2i;
        zzYK7.zzV(iArr13, iArr7, iArr13);
        zzYK6 zzyk68 = new zzYK6(iArr10);
        zzYK7.zzV(iArr7, zzyk67.zzW2i, zzyk68.zzW2i);
        zzYK7.zzX(zzyk68.zzW2i, iArr6, iArr6);
        zzYK7.zzV(iArr6, iArr5, zzyk68.zzW2i);
        zzYK6 zzyk69 = new zzYK6(iArr9);
        if (!zZzXzv) {
            int[] iArr14 = zzyk69.zzW2i;
            zzYK7.zzX(iArr14, zzyk65.zzW2i, iArr14);
        }
        if (!zZzXzv2) {
            int[] iArr15 = zzyk69.zzW2i;
            zzYK7.zzX(iArr15, zzyk66.zzW2i, iArr15);
        }
        zzYM0[] zzym0Arr = new zzYM0[1];
        zzym0Arr[c] = zzyk69;
        return new zzYK5(zzym1ZzXHv, zzyk67, zzyk68, zzym0Arr);
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
        zzYK6 zzyk6 = (zzYK6) this.f51158ao;
        if (zzyk6.isZero()) {
            return zzym1ZzXHv.zzXzM();
        }
        zzYK6 zzyk62 = (zzYK6) this.f51157an;
        zzYK6 zzyk63 = (zzYK6) this.f51159ap[0];
        int[] iArr = new int[17];
        int[] iArr2 = new int[17];
        int[] iArr3 = new int[17];
        zzYK7.zzK(zzyk6.zzW2i, iArr3);
        int[] iArr4 = new int[17];
        zzYK7.zzK(iArr3, iArr4);
        boolean zZzXzv = zzyk63.zzXzv();
        int[] iArr5 = zzyk63.zzW2i;
        if (!zZzXzv) {
            zzYK7.zzK(iArr5, iArr2);
            iArr5 = iArr2;
        }
        zzYK7.zzV(zzyk62.zzW2i, iArr5, iArr);
        zzYK7.zzY(zzyk62.zzW2i, iArr5, iArr2);
        zzYK7.zzX(iArr2, iArr, iArr2);
        zzYI2.zzY(17, iArr2, iArr2, iArr2);
        zzYK7.zzZP(iArr2);
        zzYK7.zzX(iArr3, zzyk62.zzW2i, iArr3);
        zzYI2.zzT(17, iArr3, 0);
        zzYK7.zzZP(iArr3);
        zzYI2.zzY(17, iArr4, 0, iArr);
        zzYK7.zzZP(iArr);
        zzYK6 zzyk64 = new zzYK6(iArr4);
        zzYK7.zzK(iArr2, zzyk64.zzW2i);
        int[] iArr6 = zzyk64.zzW2i;
        zzYK7.zzV(iArr6, iArr3, iArr6);
        int[] iArr7 = zzyk64.zzW2i;
        zzYK7.zzV(iArr7, iArr3, iArr7);
        zzYK6 zzyk65 = new zzYK6(iArr3);
        zzYK7.zzV(iArr3, zzyk64.zzW2i, zzyk65.zzW2i);
        int[] iArr8 = zzyk65.zzW2i;
        zzYK7.zzX(iArr8, iArr2, iArr8);
        int[] iArr9 = zzyk65.zzW2i;
        zzYK7.zzV(iArr9, iArr, iArr9);
        zzYK6 zzyk66 = new zzYK6(iArr2);
        zzYK7.zzJ(zzyk6.zzW2i, zzyk66.zzW2i);
        if (!zZzXzv) {
            int[] iArr10 = zzyk66.zzW2i;
            zzYK7.zzX(iArr10, zzyk63.zzW2i, iArr10);
        }
        return new zzYK5(zzym1ZzXHv, zzyk64, zzyk65, new zzYM0[]{zzyk66});
    }

    @Override // com.aspose.words.internal.zzYLX
    public final zzYLX zzXzc() {
        return zzXzd() ? this : new zzYK5(this.zzWoB, this.f51157an, this.f51158ao.zzXzz(), this.f51159ap);
    }

    public zzYK5(zzYM1 zzym1, zzYM0 zzym0, zzYM0 zzym02, zzYM0[] zzym0Arr) {
        super(zzym1, zzym0, zzym02, zzym0Arr);
    }
}

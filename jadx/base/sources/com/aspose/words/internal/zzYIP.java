package com.aspose.words.internal;

import com.aspose.words.internal.zzYLX;

/* JADX INFO: loaded from: classes5.dex */
final class zzYIP extends zzYLX.zzZ {
    public zzYIP(zzYM1 zzym1, zzYM0 zzym0, zzYM0 zzym02) {
        super(zzym1, zzym0, zzym02);
    }

    @Override // com.aspose.words.internal.zzYLX
    public final zzYLX zzR(zzYLX zzylx) {
        if (zzXzd()) {
            return zzylx;
        }
        if (zzylx.zzXzd()) {
            return zzXzb();
        }
        zzYM1 zzym1ZzXHv = zzXHv();
        zzYM0 zzym0 = this.f51157an;
        if (zzym0.isZero()) {
            return zzylx;
        }
        zzYM0 zzym0ZzXzj = zzylx.zzXzj();
        zzYM0 zzym0ZzeQ = zzylx.zzeQ(0);
        if (zzym0ZzXzj.isZero() || !zzym0ZzeQ.zzXzv()) {
            return zzXzb().zzT(zzylx);
        }
        zzYM0 zzym02 = this.f51158ao;
        zzYM0 zzym03 = this.f51159ap[0];
        zzYM0 zzym0ZzXzi = zzylx.zzXzi();
        zzYM0 zzym0ZzXzy = zzym0.zzXzy();
        zzYM0 zzym0ZzXzy2 = zzym02.zzXzy();
        zzYM0 zzym0ZzXzy3 = zzym03.zzXzy();
        zzYM0 zzym0ZzW = zzym0ZzXzy2.zzW(zzym02.zzU(zzym03));
        zzYM0 zzym0ZzXzA = zzym0ZzXzi.zzXzA();
        zzYM0 zzym0ZzY = zzym0ZzXzA.zzU(zzym0ZzXzy3).zzW(zzym0ZzXzy2).zzY(zzym0ZzW, zzym0ZzXzy, zzym0ZzXzy3);
        zzYM0 zzym0ZzU = zzym0ZzXzj.zzU(zzym0ZzXzy3);
        zzYM0 zzym0ZzXzy4 = zzym0ZzU.zzW(zzym0ZzW).zzXzy();
        if (zzym0ZzXzy4.isZero()) {
            return zzym0ZzY.isZero() ? zzylx.zzXzb() : zzym1ZzXHv.zzXzM();
        }
        if (zzym0ZzY.isZero()) {
            return new zzYIP(zzym1ZzXHv, zzym0ZzY, zzym1ZzXHv.zzXzJ());
        }
        zzYM0 zzym0ZzU2 = zzym0ZzY.zzXzy().zzU(zzym0ZzU);
        zzYM0 zzym0ZzU3 = zzym0ZzY.zzU(zzym0ZzXzy4).zzU(zzym0ZzXzy3);
        return new zzYIP(zzym1ZzXHv, zzym0ZzU2, zzym0ZzY.zzW(zzym0ZzXzy4).zzXzy().zzY(zzym0ZzW, zzym0ZzXzA, zzym0ZzU3), new zzYM0[]{zzym0ZzU3});
    }

    @Override // com.aspose.words.internal.zzYLX
    public final zzYLX zzT(zzYLX zzylx) {
        char c;
        long[] jArr;
        long[] jArr2;
        long[] jArr3;
        long[] jArr4;
        zzYIR zzyir;
        zzYIR zzyir2;
        zzYIR zzyir3;
        if (zzXzd()) {
            return zzylx;
        }
        if (zzylx.zzXzd()) {
            return this;
        }
        zzYM1 zzym1ZzXHv = zzXHv();
        zzYIR zzyir4 = (zzYIR) this.f51157an;
        zzYIR zzyir5 = (zzYIR) zzylx.zzXzj();
        if (zzyir4.isZero()) {
            return zzyir5.isZero() ? zzym1ZzXHv.zzXzM() : zzylx.zzT(this);
        }
        zzYIR zzyir6 = (zzYIR) this.f51158ao;
        zzYIR zzyir7 = (zzYIR) this.f51159ap[0];
        zzYIR zzyir8 = (zzYIR) zzylx.zzXzi();
        zzYIR zzyir9 = (zzYIR) zzylx.zzeQ(0);
        long[] jArr5 = new long[9];
        long[] jArr6 = new long[9];
        long[] jArr7 = new long[9];
        long[] jArr8 = new long[9];
        long[] jArrZze = zzyir7.zzXzv() ? null : zzYIS.zze(zzyir7.zzW0L);
        if (jArrZze == null) {
            jArr2 = zzyir5.zzW0L;
            c = 0;
            jArr = zzyir8.zzW0L;
        } else {
            c = 0;
            zzYIS.zzS(zzyir5.zzW0L, jArrZze, jArr6);
            zzYIS.zzS(zzyir8.zzW0L, jArrZze, jArr8);
            jArr = jArr8;
            jArr2 = jArr6;
        }
        long[] jArrZze2 = zzyir9.zzXzv() ? null : zzYIS.zze(zzyir9.zzW0L);
        if (jArrZze2 == null) {
            jArr3 = zzyir4.zzW0L;
            jArr4 = zzyir6.zzW0L;
        } else {
            zzYIS.zzS(zzyir4.zzW0L, jArrZze2, jArr5);
            zzYIS.zzS(zzyir6.zzW0L, jArrZze2, jArr7);
            jArr3 = jArr5;
            jArr4 = jArr7;
        }
        zzYIS.zzY(jArr4, jArr, jArr7);
        zzYIS.zzY(jArr3, jArr2, jArr8);
        if (zzYHS.zzb(jArr8)) {
            return zzYHS.zzb(jArr7) ? zzXzb() : zzym1ZzXHv.zzXzM();
        }
        if (zzyir5.isZero()) {
            zzYLX zzylxZzXze = zzXze();
            zzYIR zzyir10 = (zzYIR) zzylxZzXze.zzXzl();
            zzYM0 zzym0ZzXzk = zzylxZzXze.zzXzk();
            zzYM0 zzym0ZzT = zzym0ZzXzk.zzW(zzyir8).zzT(zzyir10);
            zzyir = (zzYIR) zzym0ZzT.zzXzy().zzW(zzym0ZzT).zzW(zzyir10);
            if (zzyir.isZero()) {
                return new zzYIP(zzym1ZzXHv, zzyir, zzym1ZzXHv.zzXzJ());
            }
            zzyir3 = (zzYIR) zzym0ZzT.zzU(zzyir10.zzW(zzyir)).zzW(zzyir).zzW(zzym0ZzXzk).zzT(zzyir).zzW(zzyir);
            zzyir2 = (zzYIR) zzym1ZzXHv.zzP(zzYM2.ONE);
        } else {
            zzYIS.zzT(jArr8, jArr8);
            long[] jArrZze3 = zzYIS.zze(jArr7);
            zzYIS.zzS(jArr3, jArrZze3, jArr5);
            zzYIS.zzS(jArr2, jArrZze3, jArr6);
            zzyir = new zzYIR(jArr5);
            zzYIS.zzW(jArr5, jArr6, zzyir.zzW0L);
            if (zzyir.isZero()) {
                return new zzYIP(zzym1ZzXHv, zzyir, zzym1ZzXHv.zzXzJ());
            }
            zzYIR zzyir11 = new zzYIR(jArr7);
            zzYIS.zzS(jArr8, jArrZze3, zzyir11.zzW0L);
            if (jArrZze2 != null) {
                long[] jArr9 = zzyir11.zzW0L;
                zzYIS.zzS(jArr9, jArrZze2, jArr9);
            }
            long[] jArr10 = new long[18];
            zzYIS.zzY(jArr6, jArr8, jArr8);
            zzYIS.zzS(jArr8, jArr10);
            zzYIS.zzY(zzyir6.zzW0L, zzyir7.zzW0L, jArr8);
            zzYIS.zzV(jArr8, zzyir11.zzW0L, jArr10);
            zzYIR zzyir12 = new zzYIR(jArr8);
            zzYIS.zzV(jArr10, zzyir12.zzW0L);
            if (jArrZze != null) {
                long[] jArr11 = zzyir11.zzW0L;
                zzYIS.zzS(jArr11, jArrZze, jArr11);
            }
            zzyir2 = zzyir11;
            zzyir3 = zzyir12;
        }
        zzYM0[] zzym0Arr = new zzYM0[1];
        zzym0Arr[c] = zzyir2;
        return new zzYIP(zzym1ZzXHv, zzyir, zzyir3, zzym0Arr);
    }

    @Override // com.aspose.words.internal.zzYLX
    public final zzYLX zzXzb() {
        if (zzXzd()) {
            return this;
        }
        zzYM1 zzym1ZzXHv = zzXHv();
        zzYM0 zzym0 = this.f51157an;
        if (zzym0.isZero()) {
            return zzym1ZzXHv.zzXzM();
        }
        zzYM0 zzym02 = this.f51158ao;
        zzYM0 zzym0ZzXzy = this.f51159ap[0];
        boolean zZzXzv = zzym0ZzXzy.zzXzv();
        zzYM0 zzym0ZzXzy2 = zZzXzv ? zzym0ZzXzy : zzym0ZzXzy.zzXzy();
        zzYM0 zzym0ZzW = zZzXzv ? zzym02.zzXzy().zzW(zzym02) : zzym02.zzW(zzym0ZzXzy).zzU(zzym02);
        if (zzym0ZzW.isZero()) {
            return new zzYIP(zzym1ZzXHv, zzym0ZzW, zzym1ZzXHv.zzXzJ());
        }
        zzYM0 zzym0ZzXzy3 = zzym0ZzW.zzXzy();
        zzYM0 zzym0ZzU = zZzXzv ? zzym0ZzW : zzym0ZzW.zzU(zzym0ZzXzy2);
        zzYM0 zzym0ZzXzy4 = zzym02.zzW(zzym0).zzXzy();
        if (!zZzXzv) {
            zzym0ZzXzy = zzym0ZzXzy2.zzXzy();
        }
        return new zzYIP(zzym1ZzXHv, zzym0ZzXzy3, zzym0ZzXzy4.zzW(zzym0ZzW).zzW(zzym0ZzXzy2).zzU(zzym0ZzXzy4).zzW(zzym0ZzXzy).zzW(zzym0ZzXzy3).zzW(zzym0ZzU), new zzYM0[]{zzym0ZzU});
    }

    @Override // com.aspose.words.internal.zzYLX
    public final zzYLX zzXzc() {
        if (!zzXzd()) {
            zzYM0 zzym0 = this.f51157an;
            if (!zzym0.isZero()) {
                zzYM0 zzym02 = this.f51158ao;
                zzYM0 zzym03 = this.f51159ap[0];
                return new zzYIP(this.zzWoB, zzym0, zzym02.zzW(zzym03), new zzYM0[]{zzym03});
            }
        }
        return this;
    }

    @Override // com.aspose.words.internal.zzYLX
    public final zzYM0 zzXzk() {
        zzYM0 zzym0 = this.f51157an;
        zzYM0 zzym02 = this.f51158ao;
        if (zzXzd() || zzym0.isZero()) {
            return zzym02;
        }
        zzYM0 zzym0ZzU = zzym02.zzW(zzym0).zzU(zzym0);
        zzYM0 zzym03 = this.f51159ap[0];
        return !zzym03.zzXzv() ? zzym0ZzU.zzT(zzym03) : zzym0ZzU;
    }

    public zzYIP(zzYM1 zzym1, zzYM0 zzym0, zzYM0 zzym02, zzYM0[] zzym0Arr) {
        super(zzym1, zzym0, zzym02, zzym0Arr);
    }
}

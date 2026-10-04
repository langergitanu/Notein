package com.aspose.words.internal;

import com.aspose.words.internal.zzYLX;

/* JADX INFO: loaded from: classes5.dex */
final class zzYIN extends zzYLX.zzZ {
    public zzYIN(zzYM1 zzym1, zzYM0 zzym0, zzYM0 zzym02) {
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
        zzYIR zzyir = (zzYIR) this.f51157an;
        if (zzyir.isZero()) {
            return zzylx;
        }
        zzYIR zzyir2 = (zzYIR) zzylx.zzXzj();
        zzYIR zzyir3 = (zzYIR) zzylx.zzeQ(0);
        if (zzyir2.isZero() || !zzyir3.zzXzv()) {
            return zzXzb().zzT(zzylx);
        }
        zzYIR zzyir4 = (zzYIR) this.f51158ao;
        zzYIR zzyir5 = (zzYIR) this.f51159ap[0];
        zzYIR zzyir6 = (zzYIR) zzylx.zzXzi();
        long[] jArr = new long[9];
        long[] jArr2 = new long[9];
        long[] jArr3 = new long[9];
        long[] jArr4 = new long[9];
        zzYIS.zzT(zzyir.zzW0L, jArr);
        zzYIS.zzT(zzyir4.zzW0L, jArr2);
        zzYIS.zzT(zzyir5.zzW0L, jArr3);
        zzYIS.zzW(zzyir4.zzW0L, zzyir5.zzW0L, jArr4);
        zzYIS.zzT(jArr3, jArr2, jArr4);
        long[] jArrZze = zzYIS.zze(jArr3);
        zzYIS.zzS(zzyir6.zzW0L, jArrZze, jArr3);
        zzYIS.zzY(jArr3, jArr2, jArr3);
        long[] jArr5 = new long[18];
        zzYIS.zzV(jArr3, jArr4, jArr5);
        zzYIS.zzR(jArr, jArrZze, jArr5);
        zzYIS.zzV(jArr5, jArr3);
        zzYIS.zzS(zzyir2.zzW0L, jArrZze, jArr);
        zzYIS.zzY(jArr, jArr4, jArr2);
        zzYIS.zzT(jArr2, jArr2);
        if (zzYHS.zzb(jArr2)) {
            return zzYHS.zzb(jArr3) ? zzylx.zzXzb() : zzym1ZzXHv.zzXzM();
        }
        if (zzYHS.zzb(jArr3)) {
            return new zzYIN(zzym1ZzXHv, new zzYIR(jArr3), zzYIO.f50957cw);
        }
        zzYIR zzyir7 = new zzYIR();
        zzYIS.zzT(jArr3, zzyir7.zzW0L);
        long[] jArr6 = zzyir7.zzW0L;
        zzYIS.zzW(jArr6, jArr, jArr6);
        zzYIR zzyir8 = new zzYIR(jArr);
        zzYIS.zzW(jArr3, jArr2, zzyir8.zzW0L);
        long[] jArr7 = zzyir8.zzW0L;
        zzYIS.zzS(jArr7, jArrZze, jArr7);
        zzYIR zzyir9 = new zzYIR(jArr2);
        zzYIS.zzY(jArr3, jArr2, zzyir9.zzW0L);
        long[] jArr8 = zzyir9.zzW0L;
        zzYIS.zzT(jArr8, jArr8);
        zzYI2.zzd(jArr5);
        zzYIS.zzV(zzyir9.zzW0L, jArr4, jArr5);
        zzYIS.zzX(zzyir6.zzW0L, jArr4);
        zzYIS.zzV(jArr4, zzyir8.zzW0L, jArr5);
        zzYIS.zzV(jArr5, zzyir9.zzW0L);
        return new zzYIN(zzym1ZzXHv, zzyir7, zzyir9, new zzYM0[]{zzyir8});
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
            zzyir = (zzYIR) zzym0ZzT.zzXzy().zzW(zzym0ZzT).zzW(zzyir10).zzXzA();
            if (zzyir.isZero()) {
                return new zzYIN(zzym1ZzXHv, zzyir, zzYIO.f50957cw);
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
                return new zzYIN(zzym1ZzXHv, zzyir, zzYIO.f50957cw);
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
        return new zzYIN(zzym1ZzXHv, zzyir, zzyir3, zzym0Arr);
    }

    @Override // com.aspose.words.internal.zzYLX
    public final zzYLX zzXzb() {
        long[] jArr;
        long[] jArr2;
        long[] jArr3;
        if (zzXzd()) {
            return this;
        }
        zzYM1 zzym1ZzXHv = zzXHv();
        zzYIR zzyir = (zzYIR) this.f51157an;
        if (zzyir.isZero()) {
            return zzym1ZzXHv.zzXzM();
        }
        zzYIR zzyir2 = (zzYIR) this.f51158ao;
        zzYIR zzyir3 = (zzYIR) this.f51159ap[0];
        long[] jArr4 = new long[9];
        long[] jArr5 = new long[9];
        long[] jArrZze = zzyir3.zzXzv() ? null : zzYIS.zze(zzyir3.zzW0L);
        if (jArrZze == null) {
            jArr = zzyir2.zzW0L;
            jArr2 = zzyir3.zzW0L;
        } else {
            zzYIS.zzS(zzyir2.zzW0L, jArrZze, jArr4);
            zzYIS.zzT(zzyir3.zzW0L, jArr5);
            jArr = jArr4;
            jArr2 = jArr5;
        }
        long[] jArr6 = new long[9];
        zzYIS.zzT(zzyir2.zzW0L, jArr6);
        zzYIS.zzT(jArr, jArr2, jArr6);
        if (zzYHS.zzb(jArr6)) {
            return new zzYIN(zzym1ZzXHv, new zzYIR(jArr6), zzYIO.f50957cw);
        }
        long[] jArr7 = new long[18];
        zzYIS.zzV(jArr6, jArr, jArr7);
        zzYIR zzyir4 = new zzYIR(jArr4);
        zzYIS.zzT(jArr6, zzyir4.zzW0L);
        zzYIR zzyir5 = new zzYIR(jArr6);
        if (jArrZze != null) {
            long[] jArr8 = zzyir5.zzW0L;
            zzYIS.zzW(jArr8, jArr2, jArr8);
        }
        if (jArrZze == null) {
            jArr3 = zzyir.zzW0L;
        } else {
            zzYIS.zzS(zzyir.zzW0L, jArrZze, jArr5);
            jArr3 = jArr5;
        }
        zzYIS.zzS(jArr3, jArr7);
        zzYIS.zzV(jArr7, jArr5);
        zzYIS.zzT(zzyir4.zzW0L, zzyir5.zzW0L, jArr5);
        return new zzYIN(zzym1ZzXHv, zzyir4, new zzYIR(jArr5), new zzYM0[]{zzyir5});
    }

    @Override // com.aspose.words.internal.zzYLX
    public final zzYLX zzXzc() {
        if (!zzXzd()) {
            zzYM0 zzym0 = this.f51157an;
            if (!zzym0.isZero()) {
                zzYM0 zzym02 = this.f51158ao;
                zzYM0 zzym03 = this.f51159ap[0];
                return new zzYIN(this.zzWoB, zzym0, zzym02.zzW(zzym03), new zzYM0[]{zzym03});
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

    public zzYIN(zzYM1 zzym1, zzYM0 zzym0, zzYM0 zzym02, zzYM0[] zzym0Arr) {
        super(zzym1, zzym0, zzym02, zzym0Arr);
    }
}

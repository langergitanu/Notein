package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz8U implements zzGB {
    private int zzDB;
    private byte[] zzP;
    private int[] zzpA;
    private boolean zzqD;
    private int zzAr = 0;
    private int zzpB = 1;
    private float zzHi = 1.0f;
    private zzPV zzZf = zzPV.zzKa;
    private int zzpC = 0;
    private boolean zzpz = false;

    public zz8U(boolean z) {
        this.zzqD = z;
    }

    private zzOU zzU(zzPV zzpv, zzPV zzpv2) {
        int i = this.zzpB;
        if (i == 0) {
            return null;
        }
        zzOU zzou = i != 2 ? i != 3 ? new zzOU(zzpv, this.zzHi) : new zzOU(new zzOH(this.zzP, 0), this.zzHi) : new zzOU(new zzPK(this.zzpC, zzpv, zzpv2), this.zzHi);
        zzY(zzou, this.zzAr & 15, this.zzpA);
        zzZ(zzou, this.zzAr & 3840);
        zzY(zzou, this.zzAr & 61440);
        return zzou;
    }

    private static float[] zzV(int[] iArr) {
        float[] fArr = new float[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            fArr[i] = iArr[i] * 3;
        }
        return zzOU.zzU(fArr) ? fArr : new float[0];
    }

    private static long zzW(zz9G zz9g) {
        zzP9 zzp9ZzOh = zz9g.zzzV().zzMq().zzOh();
        zzp9ZzOh.zzZ(zzP9.zzZ(zzZQ4.zzN(zz9g.zzA8().zzyQ()), new zzZQ4(0L, zzZPX.zzYA(zz9g.zzzS().zzAc()))), 0);
        float[] fArrZzOs = zzp9ZzOh.zzOs();
        return zzZPY.zzG(fArrZzOs[0], fArrZzOs[1]);
    }

    private zzOU zzZ(zz9G zz9g, zzPV zzpv) {
        float fIntBitsToFloat = this.zzHi;
        if (Float.intBitsToFloat((int) zzZ(zz9g, fIntBitsToFloat)) < 1.0f) {
            fIntBitsToFloat = Float.intBitsToFloat((int) zzX(zz9g));
        }
        zzOU zzou = new zzOU(zzpv, fIntBitsToFloat);
        zzZ(zzou, this.zzAr, this.zzpA);
        zzZ(zzou, this.zzAr & 3840);
        zzY(zzou, this.zzAr & 61440);
        return zzou;
    }

    public static zz8U zzz(zzPV zzpv) {
        zz8U zz8u = new zz8U(true);
        zz8u.zzZf = zzpv;
        return zz8u;
    }

    private void zzz4() {
        if ((this.zzAr & 15) == 5) {
            this.zzpB = 0;
        }
    }

    public static zz8U zzz5() {
        zz8U zz8u = new zz8U(true);
        zz8u.zzAr = 5;
        zz8u.zzpB = 0;
        return zz8u;
    }

    @Override // com.aspose.words.internal.zzGB
    public final int getHandle() {
        return this.zzDB;
    }

    @Override // com.aspose.words.internal.zzGB
    public final int getType() {
        return 2;
    }

    public final void zzS(zzO8 zzo8) throws Exception {
        this.zzDB = zzo8.zzXc();
        zzo8.zzXc();
        int iZzXc = zzo8.zzXc();
        zzo8.zzXc();
        int iZzXc2 = zzo8.zzXc();
        this.zzAr = (int) (((long) zzo8.zzXc()) & 4294967295L);
        this.zzHi = Math.max(zzo8.zzXc(), 1);
        int iZzXc3 = (int) (4294967295L & ((long) zzo8.zzXc()));
        if (iZzXc3 == 0 || iZzXc3 == 2) {
            this.zzZf = zzo8.zzMW();
        } else {
            zzo8.zzXc();
        }
        this.zzpC = zzo8.zzXc();
        if ((iZzXc3 & 2) == 2) {
            this.zzpB = 2;
        }
        this.zzpA = zzo8.zzN2();
        if (iZzXc3 == 6) {
            this.zzpB = 3;
            zzo8.zzXc();
            this.zzP = zzEF.zzZ(zzo8, iZzXc, iZzXc2);
        }
        zzz4();
        this.zzqD = true;
        this.zzpz = true;
    }

    public final void zzT(zzO8 zzo8) throws Exception {
        this.zzDB = zzo8.zzXc();
        this.zzAr = zzo8.zzXc();
        this.zzHi = Math.max(zzo8.zzXc(), 1);
        zzo8.zzXc();
        this.zzZf = zzo8.zzMW();
        zzz4();
        this.zzqD = true;
        this.zzpz = false;
    }

    @Override // com.aspose.words.internal.zzGB
    public final void zzWe(int i) {
        this.zzDB = i;
    }

    public final void zzX(zzZV1 zzzv1) throws Exception {
        this.zzAr = zzzv1.zzXa();
        this.zzHi = zzZKQ.max(zzzv1.zzXa(), (short) 1);
        zzzv1.zzXa();
        this.zzZf = zzzv1.zzMW();
        zzz4();
        this.zzqD = false;
        this.zzpz = false;
    }

    public final zzOU zzY(zz9G zz9g) {
        if (this.zzpB == 0 || zz9g.zzFq() == 11) {
            return null;
        }
        zzPV zzpv = this.zzZf;
        int iZzFq = zz9g.zzFq();
        int i = 0;
        if (iZzFq == 1) {
            zzpv = zzPV.zzKa;
        } else if (iZzFq == 7) {
            i = 7;
        } else if (iZzFq == 16) {
            zzpv = zzPV.zzI5;
        }
        zzOU zzouZzY = this.zzqD ? zzz3() ? zzY(zz9g, zzpv) : zzU(zzpv, zz9g.zzOK()) : zzZ(zz9g, zzpv);
        if (zzouZzY != null) {
            zzouZzY.zzXU(i);
        }
        return zzouZzY;
    }

    public final boolean zzz3() {
        return this.zzqD && this.zzpz && (this.zzAr & 65536) == 0;
    }

    private static long zzX(zz9G zz9g) {
        long jZzW = zzW(zz9g);
        return zzZPY.zzG(1.0f / Float.intBitsToFloat((int) jZzW), 1.0f / zzZPY.zzYC(jZzW));
    }

    private static long zzZ(zz9G zz9g, float f) {
        long jZzW = zzW(zz9g);
        return zzZPY.zzG(Float.intBitsToFloat((int) jZzW) * f, zzZPY.zzYC(jZzW) * f);
    }

    private zzOU zzY(zz9G zz9g, zzPV zzpv) {
        zzOU zzou = new zzOU(zzpv, Float.intBitsToFloat((int) zzX(zz9g)));
        zzZ(zzou, this.zzAr, this.zzpA);
        return zzou;
    }

    private static void zzZ(zzOU zzou, int i, int[] iArr) {
        int i2 = i & 15;
        if (i2 == 0) {
            zzou.setDashStyle(0);
            return;
        }
        if (i2 == 1) {
            zzou.setDashStyle(5);
            zzou.zzW(new float[]{18.0f, 6.0f});
            return;
        }
        if (i2 == 2) {
            zzou.setDashStyle(5);
            zzou.zzW(new float[]{3.0f, 3.0f});
            return;
        }
        if (i2 == 3) {
            zzou.setDashStyle(5);
            zzou.zzW(new float[]{9.0f, 6.0f, 3.0f, 6.0f});
            return;
        }
        if (i2 == 4) {
            zzou.setDashStyle(5);
            zzou.zzW(new float[]{9.0f, 3.0f, 3.0f, 3.0f, 3.0f, 3.0f});
        } else if (i2 == 7) {
            zzou.setDashStyle(5);
            zzou.zzW(zzV(iArr));
        } else {
            if (i2 != 8) {
                return;
            }
            zzou.setDashStyle(5);
            zzou.zzW(new float[]{1.0f, 1.0f});
        }
    }

    private static void zzY(zzOU zzou, int i, int[] iArr) {
        if (i == 0) {
            zzou.setDashStyle(0);
            return;
        }
        if (i == 1) {
            zzou.setDashStyle(1);
            return;
        }
        if (i == 2) {
            zzou.setDashStyle(2);
            return;
        }
        if (i == 3) {
            zzou.setDashStyle(3);
            return;
        }
        if (i == 4) {
            zzou.setDashStyle(4);
        } else {
            if (i != 7) {
                return;
            }
            zzou.setDashStyle(5);
            zzou.zzW(zzZ(iArr, zzou.getWidth()));
        }
    }

    private static void zzY(zzOU zzou, int i) {
        if (i == 0) {
            zzou.zzXW(2);
        } else if (i == 4096) {
            zzou.zzXW(1);
        } else {
            if (i == 8192) {
                zzou.zzXW(0);
                return;
            }
            throw new IllegalStateException("Unknown pen join style.");
        }
    }

    private static float[] zzZ(int[] iArr, float f) {
        float[] fArr = new float[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            fArr[i] = iArr[i] / f;
        }
        return zzOU.zzU(fArr) ? fArr : new float[0];
    }

    private static void zzZ(zzOU zzou, int i) {
        int i2;
        if (i == 0) {
            i2 = 2;
        } else if (i == 256) {
            i2 = 1;
        } else {
            if (i != 512) {
                throw new IllegalStateException("Unknown pen end cap style.");
            }
            i2 = 0;
        }
        zzou.zzXX(i2);
        zzou.setEndCap(i2);
    }
}

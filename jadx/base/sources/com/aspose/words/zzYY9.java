package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYY9 {
    private com.aspose.words.internal.zzZO0 zzMW;
    private int zzVz;
    private zzYYD[] zzXY3;
    private int zzXY4;
    private int zzXY5;
    private int zzXY6;
    private boolean zzXY7;
    private int zzXY8;
    private int zzXY9;
    private int zzXYa;
    private int zzXYb;
    private int zzXYc;
    private int zzXYd;
    private int zzXYe;
    private int zzXYf;

    public zzYY9(zzYYL zzyyl, int i) throws Exception {
        zzW(zzyyl);
        zzV(zzyyl);
        if (this.zzXY7) {
            zzU(zzyyl);
        }
        this.zzXYb = i;
    }

    private void zzU(zzYYL zzyyl) throws Exception {
        zzyyl.zzua(1163416648);
        zzyyl.zzQk(4);
        int iZzYD0 = zzyyl.zzYD0();
        this.zzXY3 = new zzYYD[iZzYD0];
        for (int i = 0; i < iZzYD0; i++) {
            this.zzXY3[i] = new zzYYD(zzyyl);
        }
    }

    private void zzV(zzYYL zzyyl) throws Exception {
        long position = zzyyl.zzq().getPosition();
        zzyyl.zzua(1297039945);
        long jZzXb = ((long) zzyyl.zzXb()) & 4294967295L;
        zzyyl.zzQk(4);
        this.zzMW = com.aspose.words.internal.zzZO0.zzQz(zzyyl.zzYD0());
        zzyyl.zzQk(72);
        this.zzXYd = zzyyl.zzYD0();
        this.zzXYa = zzyyl.zzYCZ();
        this.zzXY9 = zzyyl.zzYCZ();
        this.zzXY8 = zzyyl.zzYD0();
        zzyyl.zzQk(8);
        this.zzXY7 = (((long) zzyyl.zzXb()) & 64) != 0;
        zzyyl.zzQk(60);
        this.zzXY6 = zzyyl.zzYCZ();
        if (jZzXb >= 228) {
            zzyyl.zzq().zzH(224 + position);
            this.zzXYc = zzyyl.zzXb();
        } else {
            this.zzXYc = 0;
        }
        if (jZzXb >= 240) {
            zzyyl.zzq().zzH(232 + position);
            this.zzXY5 = zzyyl.zzYCZ();
            this.zzXY4 = zzyyl.zzYCZ();
        } else {
            this.zzXY5 = -1;
            this.zzXY4 = -1;
        }
        zzyyl.zzq().zzH(position + jZzXb);
    }

    private void zzW(zzYYL zzyyl) throws Exception {
        this.zzVz = zzyyl.zzX9() & 65535;
        zzyyl.zzQk(6);
        this.zzXYf = zzyyl.zzX9() & 65535;
        zzyyl.zzQk(2);
        this.zzXYe = 65535 & zzyyl.zzX9();
        zzyyl.zzQk(2);
    }

    private zzYYD zzu6(int i) {
        for (zzYYD zzyyd : this.zzXY3) {
            if (zzyyd.zzu9(i)) {
                return zzyyd;
            }
        }
        return null;
    }

    private int zzu7(int i) {
        if (i >= 0) {
            return this.zzXYb + i;
        }
        return -1;
    }

    public final String zzM(com.aspose.words.internal.zzZO0 zzzo0) {
        if (this.zzXY3 == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (zzYYD zzyyd : this.zzXY3) {
            if (zzyyd.zzu9(105)) {
                if (sb.length() > 0) {
                    sb.append('\n');
                }
                com.aspose.words.internal.zzZNH.zzU(sb, zzyyd.zzO(zzzo0));
            }
        }
        return sb.toString();
    }

    public final String zzN(com.aspose.words.internal.zzZO0 zzzo0) {
        zzYYD zzyydZzu6;
        return (this.zzXY3 == null || (zzyydZzu6 = zzu6(100)) == null) ? "" : zzyydZzu6.zzO(zzzo0);
    }

    public final com.aspose.words.internal.zzZO0 zzQZ() {
        return this.zzMW;
    }

    public final int zzWL() {
        return this.zzVz;
    }

    public final int zzYCG() {
        return this.zzXYb + 1;
    }

    public final int zzYCH() {
        return zzu7(this.zzXY4);
    }

    public final int zzYCI() {
        return zzu7(this.zzXY5);
    }

    public final int zzYCJ() {
        return this.zzXYc;
    }

    public final int zzYCK() {
        return zzu7(this.zzXY6);
    }

    public final int zzYCL() {
        return this.zzXY8;
    }

    public final int zzYCM() {
        return zzu7(this.zzXY9);
    }

    public final int zzYCN() {
        return this.zzXYd;
    }

    public final int zzYCO() {
        return this.zzXYe;
    }

    public final int zzYCP() {
        return this.zzXYf;
    }

    public final int zzYCQ() {
        zzYYD zzyydZzu6;
        int iZzYCS;
        if (this.zzXY3 == null || (zzyydZzu6 = zzu6(201)) == null || (iZzYCS = zzyydZzu6.zzYCS()) < 0) {
            return -1;
        }
        return iZzYCS;
    }

    public final int zzYCR() {
        zzYYD zzyydZzu6;
        int iZzYCS;
        if (this.zzXY3 == null || (zzyydZzu6 = zzu6(121)) == null || (iZzYCS = zzyydZzu6.zzYCS()) < 0) {
            return -1;
        }
        return iZzYCS - 1;
    }

    public final int zzu8(int i) {
        int iZzu7 = zzu7(this.zzXYa);
        if (iZzu7 >= 0) {
            return iZzu7 + i;
        }
        return -1;
    }
}

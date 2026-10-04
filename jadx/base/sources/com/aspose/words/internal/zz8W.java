package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz8W implements zzGB {
    private int zzDB;
    private int zzVL;
    private zz9O zzpE;
    private boolean zzpJ;
    private boolean zzqD;
    private int zzVN = 0;
    private float zzpL = 0.0f;
    private int zzzX = 0;
    private int zzF4 = 0;
    private boolean zzpG = false;
    private boolean zzpI = false;
    private boolean zzpH = false;
    private byte zzpF = 0;
    private String zzpK = "Microsoft Sans Serif";

    public zz8W(boolean z) {
        this.zzqD = z;
    }

    private static boolean zzR(zzPM zzpm) {
        return zzZKN.zzS(zzpm.zzPh(), "Gill Sans MT", zzZOF.ORDINAL$4894b8c8);
    }

    public static float zzS(zzPM zzpm) {
        int iZzHU = zzpm.zzPl().zzpu().zzHU();
        if (zzR(zzpm)) {
            iZzHU /= 2;
        }
        return zzpm.zzY4(iZzHU);
    }

    private float zzW(zzZXH zzzxh) {
        int i = this.zzVN;
        if (i == 0) {
            return 12.0f;
        }
        return i < 0 ? -i : (zzzxh.zzpO() * i) / zzzxh.zzps().zzHS();
    }

    private void zzYo(String str) {
        String strZzWI = zzZVS.zzWI(str);
        if (zzZKN.zzS(strZzWI, "@", zzZOF.ORDINAL$4894b8c8)) {
            strZzWI = zzZKN.zzU(strZzWI, '@');
            this.zzpJ = true;
        }
        this.zzpK = zzJF.zzZJ(strZzWI);
    }

    private int zzza() {
        int i = this.zzF4;
        if (i != 0) {
            return i;
        }
        if (this.zzzX >= 700) {
            this.zzF4 = i | 1;
        }
        if (this.zzpG) {
            this.zzF4 |= 2;
        }
        return this.zzF4;
    }

    @Override // com.aspose.words.internal.zzGB
    public final int getHandle() {
        return this.zzDB;
    }

    @Override // com.aspose.words.internal.zzGB
    public final int getType() {
        return 6;
    }

    public final boolean getUnderline() {
        return this.zzpI;
    }

    public final int getWidth() {
        return this.zzVL;
    }

    public final zz9O zzQ(zzPM zzpm) {
        zz9O zz9o = this.zzpE;
        if (zz9o != null) {
            return zz9o;
        }
        zz9O zz9oZzX = zz9O.zzX(this.zzpF & 255, zzpm.zzPl());
        this.zzpE = zz9oZzX;
        return zz9oZzX;
    }

    public final void zzT(zzO8 zzo8) throws Exception {
        this.zzDB = zzo8.zzXc();
        this.zzVN = zzo8.zzXc();
        this.zzVL = zzo8.zzXc();
        this.zzpL = zzo8.zzXc();
        zzo8.zzXc();
        this.zzzX = zzo8.zzXc();
        this.zzpG = zzo8.readBoolean();
        this.zzpI = zzo8.readBoolean();
        this.zzpH = zzo8.readBoolean();
        this.zzpF = zzo8.zzX6();
        zzo8.zzX6();
        zzo8.zzX6();
        zzo8.zzX6();
        zzo8.zzX6();
        zzYo(zzo8.zzXN(32));
    }

    public final float zzU(zzPM zzpm) {
        if (this.zzVL == 0) {
            return 1.0f;
        }
        return Math.abs(this.zzVL) / ((zzpm.zzPg() * zzpm.zzPl().zzpF()) / zzpm.zzPl().zzpO());
    }

    @Override // com.aspose.words.internal.zzGB
    public final void zzWe(int i) {
        this.zzDB = i;
    }

    public final void zzX(zzZV1 zzzv1) throws Exception {
        this.zzVN = zzzv1.zzXa();
        this.zzVL = zzzv1.zzXa();
        this.zzpL = zzzv1.zzXa();
        zzzv1.zzXa();
        this.zzzX = zzzv1.zzXa();
        this.zzpG = zzzv1.readBoolean();
        this.zzpI = zzzv1.readBoolean();
        this.zzpH = zzzv1.readBoolean();
        this.zzpF = zzzv1.zzX6();
        zzzv1.zzX6();
        zzzv1.zzX6();
        zzzv1.zzX6();
        zzzv1.zzX6();
        zzYo(zz9O.zzX(this.zzpF & 255, null).zzZo(zzzv1.zzn(32)));
    }

    public final float zzY(zzA1 zza1, zz8T zz8t) {
        if (!zzz9()) {
            return 1.0f;
        }
        float fZzAc = (((int) (zza1.zzAc() >>> 32)) / ((int) zza1.zzAc())) / (((int) (zz8t.zzyQ().getSize() >>> 32)) / ((int) zz8t.zzyQ().getSize()));
        if (zzAN.zzY(1.0f, fZzAc, 0.05f)) {
            return 1.0f;
        }
        return fZzAc;
    }

    public final void zzYn(String str) {
        this.zzpK = str;
    }

    public final zzPM zzZ(zzA1 zza1, zz8T zz8t) throws Exception {
        int iZzza = zzza();
        zzZXH zzzxhZzO = zza1.zzMk().zzO(this.zzpK, iZzza);
        if (zzzxhZzO == null) {
            zzzxhZzO = zza1.zzMk().zzO(this.zzpK.replace("_GB2312", ""), iZzza);
        }
        if (zzzxhZzO == null) {
            zzzxhZzO = zza1.zzMk().zzN("Microsoft Sans Serif", iZzza);
        }
        zzZXH zzzxh = zzzxhZzO;
        float fZzW = zzW(zzzxh);
        if (zzz9()) {
            fZzW *= zzY(zza1, zz8t);
        }
        return new zzPM(fZzW, iZzza, zzzxh, false, false, false);
    }

    public final boolean zzz6() {
        return this.zzpH;
    }

    public final boolean zzz7() {
        return this.zzpJ;
    }

    public final float zzz8() {
        return this.zzpL;
    }

    public final boolean zzz9() {
        return !this.zzqD && this.zzVL == 0;
    }

    public static float zzT(zzPM zzpm) {
        int iZzHV = zzpm.zzPl().zzpu().zzHV();
        if (zzR(zzpm)) {
            iZzHV += zzpm.zzPl().zzpu().zzHU() / 2;
        }
        return zzpm.zzY4(iZzHV);
    }
}

package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzCK {
    private com.aspose.words.internal.zzZQ4 zzZ9h;
    private com.aspose.words.internal.zzG zzZ9i;
    private float zzZ9j;
    private boolean zzZ9k;

    private zzCK(com.aspose.words.internal.zzG zzg, com.aspose.words.internal.zzZQ4 zzzq4) {
        this(zzg, zzzq4, false, 0.0f);
    }

    private static zz0J zzY(zzCM zzcm, zzCV zzcv) {
        zz0J zz0j = new zz0J();
        zz0j.zzX(zzcm.zzZGw());
        zz0j.zzZCZ().zzZtK().zzGI(2);
        zzZ(zz0j.zzZCZ(), zzcv);
        return zz0j;
    }

    public static zzCK zzZ(zzCM zzcm, zzCV zzcv, zzDI zzdi, boolean z, boolean z2) throws Exception {
        zzCM zzcmZzZ = zzZ(zzcm, zzcv);
        zzZ(zzdi, zzcmZzZ, zzcv);
        if (zzcmZzZ.zzZGz() == 0) {
            return zzZ(zzDG.zzRk(zzcmZzZ.getText()), zzcv, zzdi, z);
        }
        zz0J zz0jZzY = zzY(zzcmZzZ, zzcv);
        com.aspose.words.internal.zzG zzgZzZ = zzZ(zz0jZzY, com.aspose.words.internal.zzZQ4.zz2T, zzcv, zzdi);
        zzCJ.zzE(zzgZzZ);
        com.aspose.words.internal.zzZQ4 zzzq4ZzZ = zzZ(zzgZzZ, zz0jZzY.zzZCZ(), zzcv, zzdi);
        float fZzZQQ = (float) zz0jZzY.zzZCZ().zzZtK().zzZCC().zzZQQ();
        double d = fZzZQQ;
        com.aspose.words.internal.zzZG zzzgZzZ = zzZ(zzzq4ZzZ, zzdi, zzcv, z, d, z2);
        com.aspose.words.internal.zzG zzg = new com.aspose.words.internal.zzG();
        zzZ(zzzgZzZ, zzcv, zzdi.zzZIC().zzZdM, zzg, d, z2);
        zzg.zzX((com.aspose.words.internal.zzZL) zzgZzZ);
        zzg.zzW(new com.aspose.words.internal.zzP9());
        zzg.zzZO().zzY(-zzzq4ZzZ.getX(), -zzzq4ZzZ.getY(), 0);
        return new zzCK(zzg, new com.aspose.words.internal.zzZQ4(0.0f, 0.0f, zzzq4ZzZ.getWidth(), zzzq4ZzZ.getHeight()), false, fZzZQQ);
    }

    public static zzCK zzZGo() {
        return new zzCK(new com.aspose.words.internal.zzG(), com.aspose.words.internal.zzZQ4.zz2T);
    }

    public final boolean isEmpty() {
        return this.zzZ9h.isEmpty();
    }

    public final float zzZGk() {
        return this.zzZ9j;
    }

    public final boolean zzZGl() {
        return this.zzZ9k;
    }

    public final com.aspose.words.internal.zzZQ4 zzZGm() {
        return this.zzZ9h;
    }

    public final com.aspose.words.internal.zzG zzZGn() {
        return this.zzZ9i;
    }

    private zzCK(com.aspose.words.internal.zzG zzg, com.aspose.words.internal.zzZQ4 zzzq4, boolean z) {
        this(zzg, zzzq4, z, 0.0f);
    }

    private zzCK(com.aspose.words.internal.zzG zzg, com.aspose.words.internal.zzZQ4 zzzq4, boolean z, float f) {
        this.zzZ9i = zzg;
        this.zzZ9h = zzzq4;
        this.zzZ9k = z;
        this.zzZ9j = f;
    }

    public static zzCK zzZ(zzCM zzcm, zzCV zzcv, zzDI zzdi, com.aspose.words.internal.zzZQ4 zzzq4, float f, float f2, float f3, float f4) throws Exception {
        zzCM zzcmZzZ = zzZ(zzcm, zzcv);
        zzZ(zzdi, zzcmZzZ, zzcv);
        if (zzcmZzZ.zzZGz() == 0) {
            zzcmZzZ = zzDG.zzRk(zzcmZzZ.getText());
        }
        zzCM zzcm2 = zzcmZzZ;
        return zzZ(zzcm2, zzcv, zzY(zzcm2, zzcv), zzdi, zzzq4, f, f2, f3, f4);
    }

    private static zzCK zzZ(zzCM zzcm, zzCV zzcv, zz0J zz0j, zzDI zzdi, com.aspose.words.internal.zzZQ4 zzzq4, float f, float f2, float f3, float f4) throws Exception {
        com.aspose.words.internal.zzZQ4 zzzq42;
        zzHK zzhkZzZCC = zz0j.zzZCZ().zzZtK().zzZCC();
        zz0j.zzZCZ().zzZtK().zzX(new zzHK(0.0d));
        com.aspose.words.internal.zzG zzgZzZ = zzZ(zz0j, zzzq4, zzcv, zzdi);
        com.aspose.words.internal.zzZQ4 zzzq4ZzZ = zzZ(zzgZzZ, zz0j.zzZCZ(), zzcv, zzdi);
        if (zzgZzZ.zzZO() == null) {
            com.aspose.words.internal.OooO0O0.OooO00o(zzgZzZ);
        }
        zzgZzZ.zzZO().zzY(-zzzq4ZzZ.getX(), -zzzq4ZzZ.getY(), 0);
        if (zzzq4.isEmpty()) {
            float fMax = Math.max(zzZ(zzcv, zzcm, zzdi), zzzq4ZzZ.getHeight());
            zzgZzZ.zzZO().zzY(f, f3, 0);
            zzzq42 = new com.aspose.words.internal.zzZQ4(0.0f, 0.0f, zzzq4ZzZ.getWidth() + f + f2, fMax + f3 + f4);
        } else {
            zzgZzZ.zzZO().zzY((zzzq4.getWidth() - zzzq4ZzZ.getWidth()) / 2.0f, (zzzq4.getHeight() - zzzq4ZzZ.getHeight()) / 2.0f, 0);
            zzzq42 = new com.aspose.words.internal.zzZQ4(0.0f, 0.0f, zzzq4.getWidth(), zzzq4.getHeight());
        }
        com.aspose.words.internal.zzZG zzzgZzZ = zzZ(zzzq42, zzcv.zzaQ(), zzcv.zzZHg(), true);
        com.aspose.words.internal.zzG zzg = new com.aspose.words.internal.zzG();
        com.aspose.words.internal.OooO0O0.OooO00o(zzg);
        zzZ(zzzgZzZ, zzcv, zzdi.zzZIC().zzZdM, zzg, 0.0d, false);
        zzg.zzX((com.aspose.words.internal.zzZL) zzgZzZ);
        zz0j.zzZCZ().zzZtK().zzX(zzhkZzZCC);
        return zzZ(zzg, (float) zzhkZzZCC.zzZQQ(), zzzq42, zzDG.zzz(zzzgZzZ));
    }

    public static zzCK zzZ(zzCM zzcm, zzCV zzcv, zzDI zzdi, boolean z) throws Exception {
        return zzZ(zzcm, zzcv, zzdi, z, false);
    }

    private static com.aspose.words.internal.zzZG zzZ(com.aspose.words.internal.zzZQ4 zzzq4, zzDI zzdi, zzCV zzcv, boolean z, double d, boolean z2) throws Exception {
        if (z2) {
            return zzZ(zzzq4, zzdi, zzcv, d, z);
        }
        return zzZ(zzzq4, zzcv.zzaQ(), zzcv.zzZHg(), z);
    }

    private static void zzZ(zzDI zzdi, zzCM zzcm, zzCV zzcv) {
        if (zzdi.getChartSpace().zzZHM() == null) {
            return;
        }
        if (zzcm.zzZGt() != null && zzcm.zzZGt().zzZxp().zzZHc().getFill() != null) {
            zzcm.zzZGt().zzZxp().zzZHc().getFill().zzV(zzdi.getChartSpace().zzZHM());
        }
        if (zzcv.zzZHj().getFill() != null) {
            zzcv.zzZHj().getFill().zzV(zzdi.getChartSpace().zzZHM());
        }
    }

    private static zzCM zzZ(zzCM zzcm, zzCV zzcv) {
        zzZ(zzcm.zzZGw(), zzcv);
        return zzcm.zzZGB();
    }

    private static void zzZ(zz11 zz11Var, zzCV zzcv) {
        if (zz11Var == null) {
            return;
        }
        if (zzcv.zzZHh() != null) {
            zz11Var.zzZtK().zzV(zzcv.zzZHh());
        }
        for (zz4A zz4a : zz11Var.zzMi()) {
            zz4a.zzZxp().zzZ(zzcv.zzZHi());
            zz4a.zzZxp().zzZHc().zzU(zzcv.zzZHj());
        }
    }

    private static float zzZ(zzCV zzcv, zzCM zzcm, zzDI zzdi) throws Exception {
        float fZzS = zzDG.zzS(zzcv.zzaR(), zzdi);
        return Math.min(Math.min(fZzS, zzcm.zzZGu() ? zzDG.zzZ(zzcm.zzZGt().zzZxp().zzZHc(), zzdi) : fZzS), (zzcm.zzZGw() == null || zzcm.zzZGw().zzMi().size() <= 0 || zzcm.zzZGw().zzMi().get(0).zzMf().size() <= 0) ? fZzS : zzDG.zzZ(zzcm.zzZGw().zzMi().get(0).zzMf().get(0).zzZx5(), zzdi));
    }

    private static com.aspose.words.internal.zzG zzZ(zz0J zz0j, com.aspose.words.internal.zzZQ4 zzzq4, zzCV zzcv, zzDI zzdi) throws Exception {
        if (zzzq4.isEmpty()) {
            zzzq4 = new com.aspose.words.internal.zzZQ4(0.0f, 0.0f, zzcv.zzZHk(), com.aspose.words.internal.zzZPW.zzYz(zzdi.zzZIz()));
        }
        return zz0H.zzZ(zz0j, zzzq4, zzdi.zzZIB().getDocument());
    }

    private static zzCK zzZ(com.aspose.words.internal.zzG zzg, float f, com.aspose.words.internal.zzZQ4 zzzq4, boolean z) {
        if (com.aspose.words.internal.zzAN.zzf(f)) {
            return new zzCK(zzg, zzzq4, z);
        }
        com.aspose.words.internal.zzZQ4 zzzq4ZzY = com.aspose.words.internal.zzJ6.zzY(zzzq4, f);
        zzg.zzZO().zzZ(f, com.aspose.words.internal.zzJ6.zzB(zzzq4), 0);
        com.aspose.words.internal.zzG zzg2 = new com.aspose.words.internal.zzG();
        zzg2.zzX((com.aspose.words.internal.zzZL) zzg);
        zzg2.zzW(new com.aspose.words.internal.zzP9());
        zzg2.zzZO().zzY(-zzzq4ZzY.getX(), -zzzq4ZzY.getY(), 0);
        return new zzCK(zzg2, new com.aspose.words.internal.zzZQ4(0.0f, 0.0f, zzzq4ZzY.getWidth(), zzzq4ZzY.getHeight()), z, f);
    }

    private static com.aspose.words.internal.zzZG zzZ(com.aspose.words.internal.zzZQ4 zzzq4, zzDI zzdi, zzCV zzcv, double d, boolean z) throws Exception {
        return zzZ(zzZ(zzzq4, zzcv.zzaR(), d, zzdi), zzcv.zzaQ(), zzcv.zzZHg(), z);
    }

    private static com.aspose.words.internal.zzZG zzZ(com.aspose.words.internal.zzZQ4 zzzq4, zzD9 zzd9, zzFI zzfi, boolean z) throws Exception {
        com.aspose.words.internal.zzZG zzzgZzW = com.aspose.words.internal.zzZG.zzW(zzzq4);
        com.aspose.words.internal.zzZQ4 zzzq4ZzZPK = zzfi.zzZMW().zzZPK();
        zzfi.zzZMW().zzZK(zzzq4);
        zzzgZzW.zzY(zzDG.zzZ(zzd9, zzfi, 0, zzzgZzW));
        if (!z) {
            zzd9 = new zzD9();
        }
        zzzgZzW.zzX(zzDG.zzZ(zzd9, zzfi, 0));
        zzfi.zzZMW().zzZK(zzzq4ZzZPK);
        return zzzgZzW;
    }

    private static com.aspose.words.internal.zzZQ4 zzZ(com.aspose.words.internal.zzZL zzzl, zz11 zz11Var, zzCV zzcv, zzDI zzdi) throws Exception {
        int i;
        float fZzS = zzDG.zzS(zzcv.zzaR(), zzdi);
        Iterator<zz4A> it = zz11Var.zzMi().iterator();
        loop0: while (true) {
            i = 0;
            while (it.hasNext()) {
                if (it.next().zzMf().size() == 0) {
                    i++;
                }
            }
        }
        float f = i > 0 ? i * fZzS : 0.0f;
        com.aspose.words.internal.zzZQ4 zzzq4ZzZ = new com.aspose.words.internal.zzH().zzZ(zzzl);
        return new com.aspose.words.internal.zzZQ4(zzzq4ZzZ.getX(), zzzq4ZzZ.getY(), zzzq4ZzZ.getWidth(), zzzq4ZzZ.getHeight() + f);
    }

    private static void zzZ(com.aspose.words.internal.zzZG zzzg, zzCV zzcv, float f, com.aspose.words.internal.zzG zzg, double d, boolean z) throws Exception {
        if (zzDG.zzz(zzzg)) {
            if (com.aspose.words.internal.zzAN.zzL(Math.abs(d), 90.0d)) {
                zzzg.zzW(new com.aspose.words.internal.zzP9());
                zzzg.zzZO().zzY(0.0f, z ? 0.0f : (-f) / 2.0f, 0);
            }
            zzDG.zzZ(zzzg, zzg, zzcv.zzaQ(), zzcv.zzZHg());
        }
    }

    private static com.aspose.words.internal.zzZQ4 zzZ(com.aspose.words.internal.zzZQ4 zzzq4, zzCL zzcl, double d, zzDI zzdi) throws Exception {
        float fZzV = zzDG.zzV(zzcl, zzdi);
        float f = com.aspose.words.internal.zzAN.zzL(Math.abs(d), 90.0d) ? fZzV : 0.0f;
        if (com.aspose.words.internal.zzAN.zzL(Math.abs(d), 90.0d)) {
            fZzV = 0.0f;
        }
        return new com.aspose.words.internal.zzZQ4(zzzq4.getX(), zzzq4.getY(), zzzq4.getWidth() + f, zzzq4.getHeight() + fZzV);
    }
}

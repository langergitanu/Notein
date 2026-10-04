package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz0Q extends com.aspose.words.internal.zz6 {
    private boolean zzYXA;
    private com.aspose.words.internal.zzPY zzYXB;
    private com.aspose.words.internal.zzOU zzYXC;
    private boolean zzYXz;

    private zz0Q(com.aspose.words.internal.zzOU zzou, com.aspose.words.internal.zzPY zzpy, boolean z, boolean z2) {
        this.zzYXC = zzou;
        this.zzYXB = zzpy;
        this.zzYXA = z;
        this.zzYXz = z2;
    }

    public static com.aspose.words.internal.zzG zzZ(com.aspose.words.internal.zzG zzg, zz50 zz50Var, zz2O zz2o) throws Exception {
        Run run = (Run) zz2o.zzZyb().getChild(21, 0, true);
        if (run == null) {
            return zzg;
        }
        com.aspose.words.internal.zzPM zzpm = new com.aspose.words.internal.zzPM((float) run.getFont().getSize(), run.getFont().zzza(), run.getDocument().zzZqy().zzN(run.getFont().getName(), run.getFont().zzza()));
        zz4G zz4g = (zz4G) com.aspose.words.internal.zzZKW.zzZ(run.zzZYh().zzPj(825), zz4G.class);
        zz7X zz7x = (zz7X) com.aspose.words.internal.zzZKW.zzZ(run.zzZYh().zzPj(830), zz7X.class);
        zz21 zz21Var = (zz21) com.aspose.words.internal.zzZKW.zzZ(run.zzZYh().zzPj(815), zz21.class);
        zz27 zz27Var = (zz27) com.aspose.words.internal.zzZKW.zzZ(run.zzZYh().zzPj(810), zz27.class);
        zz1R zz1r = (zz1R) com.aspose.words.internal.zzZKW.zzZ(run.zzZYh().zzPj(820), zz1R.class);
        zz2C zz2c = new zz2C();
        zz2c.zzZ(zz0R.zzZ(zz21Var, zzpm, false));
        zz2c.zzZ(zz0R.zzZ(zz27Var, zzpm, false));
        zz2c.zzZ(zz0R.zzZ(zz1r, zzpm, false));
        zzZ(zzg, zz50Var, zz4g, zz7x);
        return (com.aspose.words.internal.zzG) zz2B.zzZ(zz2c, zzg, zz50Var.zzZIB(), false);
    }

    private static void zzZ(com.aspose.words.internal.zzG zzg, zz50 zz50Var, zz4G zz4g, zz7X zz7x) throws Exception {
        zzGR zzgr = new zzGR(new zz2O(0), zz50Var.zzZIB(), new zz1K());
        zzgr.zzZK(new com.aspose.words.internal.zzH().zzZ((com.aspose.words.internal.zzZL) zzg));
        zzgr.zzC(com.aspose.words.internal.zzZG.zzW(zzgr.zzZPK()));
        boolean z = zz4g != null;
        boolean z2 = zz7x != null;
        zzg.zzZ(new zz0Q(z ? zz0R.zzY(zz4g, false).zzZ(zzgr, true) : null, z2 ? zz0R.zzV(zz7x).zzZ(zzgr) : null, z, z2));
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(com.aspose.words.internal.zzZG zzzg) {
        zzzg.zzY(this.zzYXz ? this.zzYXB : zzzg.zzZ1());
        zzzg.zzX(this.zzYXA ? this.zzYXC : zzzg.zzZ2());
    }
}

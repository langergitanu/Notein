package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz64 {
    private zz69 zzls;

    public zz64(zz69 zz69Var) {
        this.zzls = zz69Var;
    }

    private void zzwz() throws Exception {
        this.zzls.zzL((byte) 2);
        this.zzls.zzK((byte) 3);
        this.zzls.zzM((byte) 106);
    }

    public final void zzS(zzZP zzzp) throws Exception {
        zz65 zz65Var = new zz65(this.zzls);
        zz65Var.zzZ(zzzp.getImageBytes(), zzzp.zzZd(), zzzp.getSize());
        zzwz();
        zz65Var.zzwC();
        this.zzls.zzM((byte) -80);
        zz65Var.zzwB();
        this.zzls.zzM((byte) -79);
        zz65Var.zzwA();
        this.zzls.zzM((byte) -78);
    }
}

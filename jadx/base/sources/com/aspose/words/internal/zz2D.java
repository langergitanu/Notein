package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz2D extends zz2F {
    private zz1J zzgg;

    public zz2D(zz4W zz4w, String str, zzPK zzpk, zz3A zz3a) throws Exception {
        super(zz4w, str);
        float fPixelToPoint = (float) zzSA.pixelToPoint(1.0d);
        zzP9 zzp9 = new zzP9(fPixelToPoint, 0.0f, 0.0f, fPixelToPoint, 0.0f, 0.0f);
        if (zz3a.zzu2() != null) {
            zzp9.zzZ(zz3a.zzu2(), 1);
        }
        zz1J zz1j = new zz1J(zz4w, zzp9, zzZPX.zzZm(8, 8));
        this.zzgg = zz1j;
        zz1j.zzvj().zzZ(zzIK.zzZ(zzpk), new zzP9(8.0f, 0.0f, 0.0f, 8.0f, 0.0f, 0.0f), null, this.zzgg.zzNb());
    }

    @Override // com.aspose.words.internal.zzFW
    public final String zzF0() {
        return this.zzgg.zzF0();
    }

    @Override // com.aspose.words.internal.zz2F
    public final void zzY(zzFX zzfx) throws Exception {
        this.zzgg.zzY(zzfx);
    }

    @Override // com.aspose.words.internal.zz2F
    public final boolean zzZ(zzPY zzpy, zz3A zz3a) {
        return false;
    }

    @Override // com.aspose.words.internal.zz2F
    public final zz3D zzu1() {
        return null;
    }
}

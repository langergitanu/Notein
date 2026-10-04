package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz2E extends zz2F {
    private zzPA zzgh;
    private zz28 zzgi;
    private zz3D zzir;

    public zz2E(zz4W zz4w, String str, zzPA zzpa, zzZQ4 zzzq4, zz3A zz3a) throws Exception {
        super(zz4w, str);
        this.zzgh = zzpa;
        this.zzgi = zzZ(zz4w, zzpa, zz3a);
        this.zzir = zzY(zz4w, zzpa, zzzq4);
    }

    private static boolean zzS(zzPA zzpa) {
        if (zzpa.zzOP() == null) {
            return (zzpa.zzOv().zzPD() == 255 && zzpa.zzOu().zzPD() == 255) ? false : true;
        }
        for (zzPI zzpi : zzpa.zzOP()) {
            if (zzpi.zzZy().zzPD() != 255) {
                return true;
            }
        }
        return false;
    }

    private static zz3D zzY(zz4W zz4w, zzPA zzpa, zzZQ4 zzzq4) throws Exception {
        if (zzS(zzpa)) {
            return zz3D.zzZ(zz4w, zzpa, zzzq4);
        }
        return null;
    }

    private static zz28 zzZ(zz4W zz4w, zzPA zzpa, zz3A zz3a) throws Exception {
        return new zz28(zz4w, zz29.zzY(zz4w, zzpa), zzT.zzX(zzpa)[0], zzT.zzX(zzpa)[1], zz57.zzvK(), zz2F.zzZ((zzOG) zzpa, zz3a), null);
    }

    @Override // com.aspose.words.internal.zzFW
    public final String zzF0() {
        return this.zzgi.zzF0();
    }

    @Override // com.aspose.words.internal.zz2F
    public final zz3D zzu1() {
        return this.zzir;
    }

    @Override // com.aspose.words.internal.zz2F
    public final void zzY(zzFX zzfx) throws Exception {
        this.zzgi.zzY(zzfx);
        zz3D zz3d = this.zzir;
        if (zz3d != null) {
            zz3d.zzY(zzfx);
        }
    }

    @Override // com.aspose.words.internal.zz2F
    public final boolean zzZ(zzPY zzpy, zz3A zz3a) {
        zzPA zzpa;
        if (this.zzir == null && (zzpa = (zzPA) zzZKW.zzZ(zzpy, zzPA.class)) != null && zzP9.zzY(zz2F.zzZ((zzOG) zzpa, zz3a), this.zzgi.zzNb())) {
            return zzPX.zzZ(this.zzgh, zzpa, false);
        }
        return false;
    }
}

package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz3D extends zz3C {
    private zz33 zzhP;

    private zz3D(zz4W zz4w, zz28 zz28Var) throws Exception {
        super(zz4w);
        this.zzhP = zz28Var;
        zzvk().zzZ(zz28Var);
    }

    public static zz3D zzZ(zz4W zz4w, zzPA zzpa, zzZQ4 zzzq4) throws Exception {
        zz3D zz3d = new zz3D(zz4w, zzZ(zz4w, zzpa));
        zz3d.zzX(zzzq4);
        zz3d.zzvl().zzo("/Pattern cs {0} scn", "/P1");
        zz3d.zzvl().zzn(zz3d.zzZv().zzZm());
        zz3d.zzvl().zzFh();
        zz3d.zzvl().zzn(zz3d.zzZv().zzZo());
        zz3d.zzvl().zzFh();
        zz3d.zzvl().zzn(zz3d.zzZv().getWidth());
        zz3d.zzvl().zzFh();
        zz3d.zzvl().zzn(zz3d.zzZv().getHeight());
        zz3d.zzvl().zzFh();
        zz3d.zzvl().zzXW("re f*");
        return zz3d;
    }

    @Override // com.aspose.words.internal.zz3C, com.aspose.words.internal.zz21
    public final void zzN(zzFY zzfy) throws Exception {
        super.zzN(zzfy);
        zzfy.zzYY("/Group");
        zzfy.zzFd();
        zzfy.zzH("/CS", "/DeviceRGB");
        zzfy.zzH("/S", "/Transparency");
        zzfy.zzFc();
    }

    private static zz28 zzZ(zz4W zz4w, zzPA zzpa) throws Exception {
        return new zz28(zz4w, zz29.zzX(zz4w, zzpa), zzT.zzX(zzpa)[0], zzT.zzX(zzpa)[1], zz57.zzvL(), zzpa.zzNb(), "/P1");
    }

    @Override // com.aspose.words.internal.zz21, com.aspose.words.internal.zz33
    public final void zzZ(zzFX zzfx) throws Exception {
        super.zzZ(zzfx);
        this.zzhP.zzY(zzfx);
    }
}

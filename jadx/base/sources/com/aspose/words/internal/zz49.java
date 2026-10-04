package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz49 extends zz4B {
    private zz3D zzir;

    public zz49(zz4W zz4w, String str, zz3D zz3d) {
        super(zz4w, str);
        this.zzir = zz3d;
    }

    @Override // com.aspose.words.internal.zz4B
    public final void zzN(zzFY zzfy) throws Exception {
        zzfy.zzYY("/SMask");
        zzfy.zzFd();
        zzfy.zzH("/Type", "/Mask");
        zzfy.zzH("/S", "/Luminosity");
        zzfy.zzZ("/BC", new int[]{0, 0, 0});
        zzfy.zzZ("/G", this.zzir);
        zzfy.zzFc();
        zzfy.zzM("/CA", 1);
        zzfy.zzM("/ca", 1);
    }

    @Override // com.aspose.words.internal.zz4B
    public final void zzZ(zz3A zz3a) {
        zz3a.zzY(this.zzir);
        zz3a.zz5(1.0f);
        zz3a.zz4(1.0f);
    }
}

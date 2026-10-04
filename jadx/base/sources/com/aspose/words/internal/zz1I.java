package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz1I {
    private zz47 zzfF;
    private zz4G zzfG;
    private zz32 zzfH;
    private zz5C zzj5;
    private zz4U zzjz;

    public zz1I(zz32 zz32Var, zz5C zz5c, zz4G zz4g, zz47 zz47Var, zz4U zz4u) {
        this.zzfH = zz32Var;
        this.zzj5 = zz5c;
        this.zzfG = zz4g;
        this.zzfF = zz47Var;
        this.zzjz = zz4u;
    }

    public final void zzZ(zzFY zzfy, int i) throws Exception {
        zzfy.zzF5();
        zzfy.zzFd();
        zzv(zzfy);
        zzfy.zzFc();
        zzfy.zzFg();
        zzfy.zzWb(i);
    }

    public final void zzv(zzFY zzfy) throws Exception {
        zzfy.zzM("/Size", this.zzjz.zzv0().getCount());
        zz32 zz32Var = this.zzfH;
        if (zz32Var != null) {
            zzfy.zzZ("/Info", zz32Var);
        }
        zzfy.zzZ("/Root", this.zzj5);
        zz4G zz4g = this.zzfG;
        if (zz4g != null) {
            zzfy.zzZ("/Encrypt", zz4g);
        }
        zzfy.zzYY("/ID");
        zzfy.zzZ(this.zzfF);
    }
}

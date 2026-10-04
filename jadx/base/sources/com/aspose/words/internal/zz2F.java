package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
abstract class zz2F implements zzFW {
    protected zz4W zzgj;
    private String zzkn;

    public zz2F(zz4W zz4w, String str) {
        this.zzgj = zz4w;
        this.zzkn = str;
    }

    public static zzP9 zzZ(zzOG zzog, zz3A zz3a) {
        zzP9 zzp9ZzOh = zzog.zzNb().zzOh();
        zzp9ZzOh.zzZ(zz3a.zzua(), 1);
        return zzp9ZzOh;
    }

    @Override // com.aspose.words.internal.zzFW
    public final String zzF1() {
        return this.zzkn;
    }

    public abstract void zzY(zzFX zzfx) throws Exception;

    public abstract boolean zzZ(zzPY zzpy, zz3A zz3a);

    public abstract zz3D zzu1();
}

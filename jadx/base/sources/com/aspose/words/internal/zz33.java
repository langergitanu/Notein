package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zz33 {
    private int zzhp;
    private zz4W zzkV;

    public zz33(zz4W zz4w) {
        this.zzkV = zz4w;
        this.zzhp = zz4w.zzvd();
    }

    public final String zzF0() {
        return zzJB.zzWD(this.zzhp) + " 0 R";
    }

    public final void zzY(zzFX zzfx) throws Exception {
        zzfx.zzY(zztQ());
        zzfx.zzY(this);
        zzZ(zzfx.zzF2());
        zzfx.zzF3();
        zzfx.zzY((zz2V) null);
        zzZ(zzfx);
    }

    public void zzZ(zzFX zzfx) throws Exception {
    }

    public abstract void zzZ(zzFY zzfy) throws Exception;

    public final zz2V zztQ() {
        if (this.zzkV.zzv8() != null) {
            return this.zzkV.zzv8().zzU7(this.zzhp);
        }
        return null;
    }

    public final int zztR() {
        return this.zzhp;
    }

    public final zz4W zzuN() {
        return this.zzkV;
    }
}

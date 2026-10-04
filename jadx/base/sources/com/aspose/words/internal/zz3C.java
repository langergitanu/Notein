package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
class zz3C extends zz50 {
    private zzP9 zzFW;
    private zzZQ4 zzhO;

    public zz3C(zz4W zz4w) throws Exception {
        this(zz4w, new zz4Y(zz4w));
    }

    @Override // com.aspose.words.internal.zz21
    public void zzN(zzFY zzfy) throws Exception {
        zzfy.zzH("/Type", "/XObject");
        zzfy.zzH("/Subtype", "/Form");
        zzfy.zzM("/FormType", 1);
        zzfy.zzZ("/BBox", this.zzhO);
        zzP9 zzp9 = this.zzFW;
        if (zzp9 != null) {
            zzfy.zzZ("/Matrix", zzp9);
        }
        if (zzvk().zzvf()) {
            zzfy.zzYY("/Resources");
            zzvk().zzL(zzfy);
        }
    }

    public final void zzX(zzZQ4 zzzq4) {
        this.zzhO = zzzq4;
    }

    public final zzZQ4 zzZv() {
        return this.zzhO;
    }

    public zz3C(zz4W zz4w, zz4Y zz4y) throws Exception {
        super(zz4w, zz4y);
        this.zzhO = zzZQ4.zz2T;
    }
}

package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
class zz4A extends zz4B {
    private float zzis;
    private float zzit;

    public zz4A(zz4W zz4w, String str, float f, float f2) {
        super(zz4w, str);
        this.zzit = f;
        this.zzis = f2;
        if (zzuN().zzv7().zzvH()) {
            return;
        }
        if (this.zzit < 1.0f || this.zzis < 1.0f) {
            this.zzit = 1.0f;
            this.zzis = 1.0f;
            zzuN().zz2("Transparency does not conform to PDF/A standard and has been removed.");
        }
    }

    public final boolean equals(float f, float f2) {
        return zzAN.zzS(this.zzit, f) && zzAN.zzS(this.zzis, f2);
    }

    @Override // com.aspose.words.internal.zz4B
    public final void zzN(zzFY zzfy) throws Exception {
        zzfy.zzY("/CA", this.zzit);
        zzfy.zzY("/ca", this.zzis);
    }

    @Override // com.aspose.words.internal.zz4B
    public final void zzZ(zz3A zz3a) {
        zz3a.zz5(this.zzit);
        zz3a.zz4(this.zzis);
    }
}

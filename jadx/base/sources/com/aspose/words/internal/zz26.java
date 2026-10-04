package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz26 extends zz5J {
    private zz25 zzg7;

    public zz26(zz4W zz4w, zz4Q zz4q) {
        super(zz4w, zzZQ4.zz2T, null);
        this.zzg7 = new zz25(zz4w, zz4q);
    }

    @Override // com.aspose.words.internal.zz5J
    public final String getSubType() {
        return "/Widget";
    }

    @Override // com.aspose.words.internal.zz5J
    public final void zzU(zzFY zzfy) throws Exception {
        zzfy.zzH("/FT", "/Sig");
        zzfy.zzC("/T", "AsposeDigitalSignature");
        if (zzuN().zzv7().zzvy()) {
            zzfy.zzC("/TU", "Digital Signature Field");
        }
        zzfy.zzM("/F", (!zzuN().zzv7().zzvy() || zzuN().zzv7().zzvz()) ? 132 : 134);
        zzfy.zzZ("/V", this.zzg7);
    }

    @Override // com.aspose.words.internal.zz5J
    public final void zzZ(zzFX zzfx, zzZYG<zz4R> zzzyg) throws Exception {
        zzY(zzfx);
    }

    public final zz25 zzth() {
        return this.zzg7;
    }

    @Override // com.aspose.words.internal.zz33
    public final void zzZ(zzFX zzfx) throws Exception {
        this.zzg7.zzY(zzfx);
    }
}

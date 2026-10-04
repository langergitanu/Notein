package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz1W extends zz1Y {
    private zzB2 zzfV;

    public zz1W(zz4W zz4w, zzB2 zzb2) {
        super(zz4w, zz2Z.zzX(zzb2), "");
        this.zzfV = zzb2;
    }

    private String zztf() {
        if (this.zzfV.zzBz() && this.zzfV.zzBy()) {
            return "/Both";
        }
        if (this.zzfV.zzBz()) {
            return "/Column";
        }
        if (this.zzfV.zzBy()) {
            return "/Row";
        }
        return null;
    }

    @Override // com.aspose.words.internal.zz1Y
    public final void zzz(zzFY zzfy) throws Exception {
        String strZztf = zztf();
        if (strZztf == null && this.zzfV.zzBx() == 1 && this.zzfV.getRowSpan() == 1) {
            return;
        }
        zzfy.zzYY("/A");
        zzfy.zzFd();
        zzfy.zzH("/O", "/Table");
        if (strZztf != null) {
            zzfy.zzH("/Scope", strZztf);
        }
        if (this.zzfV.zzBx() != 1) {
            zzfy.zzM("/ColSpan", this.zzfV.zzBx());
        }
        if (this.zzfV.getRowSpan() != 1) {
            zzfy.zzM("/RowSpan", this.zzfV.getRowSpan());
        }
        zzfy.zzFc();
    }
}

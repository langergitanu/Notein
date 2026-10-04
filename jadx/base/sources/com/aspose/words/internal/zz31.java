package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz31 extends zz5J {
    private String zzYL;
    private boolean zzYM;
    private zz5O zzhn;
    private zz4R zzkD;

    public zz31(zz4W zz4w, zzZQ4 zzzq4, String str, boolean z, String str2) {
        super(zz4w, zzzq4, str2);
        this.zzYL = str;
        this.zzYM = z;
        zzZ(str, zz4w);
    }

    @Override // com.aspose.words.internal.zz5J
    public final String getSubType() {
        return "/Link";
    }

    @Override // com.aspose.words.internal.zz5J
    public final void zzU(zzFY zzfy) throws Exception {
        if (zzuN().zzv7().zzvz()) {
            zzfy.zzM("/F", 4);
        }
        if (!zzuN().zzvc().zztD()) {
            zzfy.zzYY("/BS");
            zzfy.zzFd();
            zzfy.zzH("/Type", "/Border");
            zzfy.zzH("/S", "/S");
            zzfy.zzM("/W", 0);
            zzfy.zzFc();
        }
        if (!this.zzYM) {
            zzfy.zzYY("/A");
            this.zzhn.zzW(zzfy);
        } else if (this.zzkD != null) {
            zzfy.zzYY("/Dest");
            this.zzkD.zzW(zzfy);
        }
        if (zzw7() > 0) {
            zzfy.zzM("/StructParent", zzw7());
        }
    }

    @Override // com.aspose.words.internal.zz5J
    public final void zzZ(zzFX zzfx, zzZYG<zz4R> zzzyg) throws Exception {
        zzZ(zzzyg);
        zzY(zzfx);
    }

    private void zzZ(zzZYG<zz4R> zzzyg) {
        if (this.zzYM) {
            zz4R zz4r = zzzyg.get(this.zzYL);
            this.zzkD = zz4r;
            if (zz4r == null) {
                this.zzkD = zzzyg.get("#" + this.zzYL);
            }
        }
    }

    private void zzZ(String str, zz4W zz4w) {
        if (this.zzYM) {
            return;
        }
        this.zzhn = zz4w.zzvc().getOpenHyperlinksInNewWindow() ? new zz5L(str) : new zz5K(str);
    }
}

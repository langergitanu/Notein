package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz5C extends zz33 {
    private zz1O zzkb;
    private String zzkc;
    private zz5U zzkd;
    private zz2W zzke;
    private zz37 zzkf;
    private zz2Q zzkg;
    private zz2I zzkh;
    private zz1F zzki;

    public zz5C(zz4W zz4w) throws Exception {
        super(zz4w);
        this.zzkc = "";
        this.zzkh = new zz2I(zz4w);
        this.zzkg = new zz2Q(zz4w);
        if (zzuN().zzv7().zzvz()) {
            this.zzkf = new zz37(zzuN());
        }
        this.zzke = new zz2W(zz4w);
    }

    private void zzO(zzFY zzfy) throws Exception {
        if (zzuN().zzvc().zztA()) {
            zzfy.zzYY("/OpenAction");
            zzfy.zzFh();
            new zz5N(zzuN().zzvc().zzty() == 0 ? zz4R.zzZ(this.zzkh.zztl(), 0.0f, zzuN().zzv4(), zzuN().zzvc().zztx()) : new zz4R(this.zzkh.zztl(), zzuN().zzvc().zzty(), zzuN().zzv4())).zzW(zzfy);
        }
    }

    private void zzP(zzFY zzfy) throws Exception {
        if (this.zzkf != null) {
            zzfy.zzYY("/OutputIntents");
            zzfy.zzFf();
            zzfy.zzFd();
            zzfy.zzH("/Type", "/OutputIntent");
            zzfy.zzD("/Info", "sRGB IEC61966-2.1");
            zzfy.zzH("/S", "/GTS_PDFA1");
            zzfy.zzD("/OutputConditionIdentifier", "Custom");
            zzfy.zzZ("/DestOutputProfile", this.zzkf);
            zzfy.zzFc();
            zzfy.zzFe();
        }
    }

    private void zzQ(zzFY zzfy) throws Exception {
        int iZzvX = zzvX();
        if (iZzvX != 0) {
            zzfy.zzH("/PageMode", zz4C.zzU5(iZzvX));
        }
        if (iZzvX != 3 || this.zzki == null) {
            return;
        }
        zzvS().zzt7();
    }

    private void zzR(zzFY zzfy) throws Exception {
        int pageLayout = zzuN().zzvc().getPageLayout();
        if (pageLayout != 0) {
            zzfy.zzH("/PageLayout", zz4C.zzU4(pageLayout));
        }
    }

    private void zzS(zzFY zzfy) throws Exception {
        if (zzuN().zzv6()) {
            zzfy.zzZ("/StructTreeRoot", this.zzkb);
            zzfy.zzYY("/MarkInfo");
            zzfy.zzFd();
            zzfy.zzT("/Marked", true);
            zzfy.zzFc();
        }
    }

    private void zzT(zzFY zzfy) throws Exception {
        if (!this.zzkg.isEmpty()) {
            this.zzkg.zztu();
            zzfy.zzB("/Outlines", this.zzkg.zztt());
        }
        zz1F zz1f = this.zzki;
        if (zz1f != null) {
            zzfy.zzZ("/ViewerPreferences", zz1f);
        }
        zzR(zzfy);
        zzQ(zzfy);
        if (zzvT()) {
            zzfy.zzZ("/AcroForm", zzvU());
        }
        if (zzZYD.zzXk(this.zzkc)) {
            zzfy.zzD("/Lang", this.zzkc);
        }
        zz2W zz2w = this.zzke;
        if (zz2w != null) {
            zzfy.zzZ("/Metadata", zz2w);
        }
    }

    private void zzX(zzFX zzfx) throws Exception {
        if (zzuN().zzv6()) {
            if (!zzuN().zzv7().zzvF()) {
                this.zzkb.zzY(zzfx);
                return;
            }
            zz2T zz2t = new zz2T(zzuN(), zzfx);
            this.zzkb.zzY(zz2t);
            zz2t.zztG();
        }
    }

    private boolean zzvT() {
        return this.zzkd != null;
    }

    private int zzvX() {
        if (zzuN().zzvc().getPageMode() == 1 && this.zzkg.isEmpty()) {
            return 0;
        }
        return zzuN().zzvc().getPageMode();
    }

    public final void zzXX(String str) {
        this.zzkc = str;
    }

    @Override // com.aspose.words.internal.zz33
    public final void zzZ(zzFY zzfy) throws Exception {
        zzfy.zzFd();
        zzfy.zzH("/Type", "/Catalog");
        zzfy.zzZ("/Pages", this.zzkh);
        zzT(zzfy);
        zzS(zzfy);
        zzP(zzfy);
        zzO(zzfy);
        zzfy.zzFc();
    }

    public final String zzvR() {
        return this.zzkc;
    }

    public final zz1F zzvS() {
        if (this.zzki == null) {
            this.zzki = new zz1F(zzuN());
        }
        return this.zzki;
    }

    public final zz5U zzvU() {
        if (this.zzkd == null) {
            this.zzkd = new zz5U(zzuN());
        }
        return this.zzkd;
    }

    public final zz2Q zzvV() {
        return this.zzkg;
    }

    public final zz2I zzvW() {
        return this.zzkh;
    }

    @Override // com.aspose.words.internal.zz33
    public final void zzZ(zzFX zzfx) throws Exception {
        zz1F zz1f = this.zzki;
        if (zz1f != null) {
            zz1f.zzY(zzfx);
        }
        if (zzvT()) {
            zzvU().zzY(zzfx);
        }
        this.zzkh.zzY(zzfx);
        if (!this.zzkg.isEmpty()) {
            this.zzkg.zzY(zzfx);
        }
        zz37 zz37Var = this.zzkf;
        if (zz37Var != null) {
            zz37Var.zzY(zzfx);
        }
        zz2W zz2w = this.zzke;
        if (zz2w != null) {
            zz2w.zzY(zzfx);
        }
        zzX(zzfx);
    }

    public final void zzZ(zz1O zz1o) {
        this.zzkb = zz1o;
    }
}

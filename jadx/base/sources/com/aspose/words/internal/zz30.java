package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz30 extends zzAX {
    private zz1O zzhm;
    private zz4W zzkV;
    private zzZQC<zz1X> zzhl = new zzZQC<>();
    private zz36 zzhk = new zz36();

    public zz30(zz4W zz4w) {
        this.zzkV = zz4w;
    }

    private void zzS(zzGH zzgh) {
        zz1O zz1o = new zz1O(this.zzkV);
        this.zzhm = zz1o;
        this.zzhl.push(zz1o);
        zzgh.zzZ(this);
    }

    private void zzXP(String str) {
        this.zzhk.zzZ(zzn(str, ""));
    }

    private void zzY(zz1Y zz1y) {
        zztO().zzX(zz1y);
        this.zzhl.push(zz1y);
    }

    private zz1Y zzn(String str, String str2) {
        zz1Y zz1y = new zz1Y(this.zzkV, str, str2);
        zzY(zz1y);
        return zz1y;
    }

    private void zztN() {
        this.zzhl.pop();
    }

    private zz1X zztO() {
        return this.zzhl.peek();
    }

    private zz2H zztP() {
        zz2H zz2h = new zz2H(this.zzkV);
        zz2h.zzTI(this.zzkV.zzv5().zzuJ());
        for (zz2K zz2k : this.zzkV.zzv5().zzuK()) {
            zz2J zz2j = new zz2J(zz2k.zzw7());
            for (zz2X zz2x : zz2k.zztm()) {
                zz2j.zzZ(zz2x.zztM(), zz2x.zzw3());
            }
            zz2h.zzZ(zz2j);
        }
        for (zz5I zz5i : this.zzkV.zzv5().zzuI().zzCJ()) {
            if (zz5i.zzw6().zzw7() >= 0 && zz5i.zzw3() != null) {
                zz2h.zzZ(new zz2S(zz5i.zzw3(), zz5i.zzw6().zzw7()));
            }
        }
        return zz2h;
    }

    @Override // com.aspose.words.internal.zzAX
    public final void zzB3() {
        zztN();
    }

    @Override // com.aspose.words.internal.zzAX
    public final void zzB4() {
        zztN();
    }

    @Override // com.aspose.words.internal.zzAX
    public final void zzB5() {
        zzn("/TOCI", "");
    }

    @Override // com.aspose.words.internal.zzAX
    public final void zzB6() {
        zztN();
    }

    @Override // com.aspose.words.internal.zzAX
    public final void zzB7() {
        zzn("/TOC", "");
    }

    @Override // com.aspose.words.internal.zzAX
    public final void zzB8() {
        zztN();
    }

    @Override // com.aspose.words.internal.zzAX
    public final void zzB9() {
        zztN();
    }

    @Override // com.aspose.words.internal.zzAX
    public final void zzBa() {
        zztN();
    }

    @Override // com.aspose.words.internal.zzAX
    public final void zzBb() {
        zzn("/Textbox", "");
    }

    @Override // com.aspose.words.internal.zzAX
    public final void zzBc() {
        zztN();
    }

    @Override // com.aspose.words.internal.zzAX
    public final void zzBd() {
        zzn("/Annotation", "");
    }

    @Override // com.aspose.words.internal.zzAX
    public final void zzBe() {
        zztN();
    }

    @Override // com.aspose.words.internal.zzAX
    public final void zzBf() {
        zzXP("/Endnote");
    }

    @Override // com.aspose.words.internal.zzAX
    public final void zzBg() {
        zztN();
    }

    @Override // com.aspose.words.internal.zzAX
    public final void zzBh() {
        zzXP("/Footnote");
    }

    @Override // com.aspose.words.internal.zzAX
    public final void zzBi() {
        zztN();
    }

    @Override // com.aspose.words.internal.zzAX
    public final void zzBj() {
        zztN();
    }

    @Override // com.aspose.words.internal.zzAX
    public final void zzBk() {
        zzn("/TR", "");
    }

    @Override // com.aspose.words.internal.zzAX
    public final void zzBl() {
        zztN();
    }

    @Override // com.aspose.words.internal.zzAX
    public final void zzBm() {
        zztN();
    }

    @Override // com.aspose.words.internal.zzAX
    public final void zzBn() {
        zzn("/LBody", "");
    }

    @Override // com.aspose.words.internal.zzAX
    public final void zzBo() {
        zztN();
    }

    @Override // com.aspose.words.internal.zzAX
    public final void zzBp() {
        zzn("/Lbl", "");
    }

    @Override // com.aspose.words.internal.zzAX
    public final void zzBq() {
        zztN();
    }

    @Override // com.aspose.words.internal.zzAX
    public final void zzBr() {
        zzn("/LI", "");
    }

    @Override // com.aspose.words.internal.zzAX
    public final void zzBs() {
        zztN();
    }

    @Override // com.aspose.words.internal.zzAX
    public final void zzBt() {
        zztN();
    }

    @Override // com.aspose.words.internal.zzAX
    public final void zzBu() {
        zztN();
    }

    @Override // com.aspose.words.internal.zzAX
    public final void zzBv() {
        zztN();
    }

    @Override // com.aspose.words.internal.zzAX
    public final void zzBw() {
        zzn("/Document", "");
    }

    public final zz1O zzT(zzGH zzgh) {
        zzS(zzgh);
        this.zzhm.zzZ(this.zzhk);
        this.zzhm.zzZ(zztP());
        return this.zzhm;
    }

    @Override // com.aspose.words.internal.zzAX
    public final void zzZ(zzB6 zzb6) {
        zzn(zzY(zzb6), "");
    }

    private void zzY(zzBD zzbd) {
        zzY(new zz1R(this.zzkV, zz2Z.zzX(zzbd), zzbd.zzBC(), zzbd.zzZV()));
    }

    @Override // com.aspose.words.internal.zzAX
    public final void zzZ(zzBD zzbd) {
        zzY(zzbd);
    }

    @Override // com.aspose.words.internal.zzAX
    public final void zzZ(zzBA zzba) {
        zzY(zzba);
    }

    @Override // com.aspose.words.internal.zzAX
    public final void zzZ(zzB3 zzb3) {
        zzn("/Table", zzb3.zzBC());
    }

    private void zzY(zzB2 zzb2) {
        zzY(new zz1W(this.zzkV, zzb2));
    }

    @Override // com.aspose.words.internal.zzAX
    public final void zzZ(zzB2 zzb2) {
        zzY(zzb2);
    }

    @Override // com.aspose.words.internal.zzAX
    public final void zzZ(zzB4 zzb4) {
        zzY(new zz1P(this.zzkV, zzb4.zzBA()));
    }

    private void zzY(zzBA zzba) {
        zzY(new zz1Q(this.zzkV, zzba.zzBB()));
    }

    private static String zzY(zzB6 zzb6) {
        if (zzb6.getOutlineLevel() >= 6) {
            return "/P";
        }
        return zz2Z.zzTN(zzb6.getOutlineLevel() + 1);
    }

    @Override // com.aspose.words.internal.zzAX
    public final void zzZ(zzBJ zzbj) {
        zz2X zz2xZzU9 = this.zzkV.zzv5().zzU9(zzbj.zzBG());
        if (zz2xZzU9 == null) {
            return;
        }
        zz1X zz1xZztO = zztO();
        zz1xZztO.zzS(zz2xZzU9.zztM(), zz2xZzU9.zzw4());
        zz2xZzU9.zzZ(zz1xZztO);
    }

    @Override // com.aspose.words.internal.zzAX
    public final void zzZ(zzBB zzbb) {
        zzZ(zzn("/Link", zzbb.zzBC()), zzbb);
    }

    @Override // com.aspose.words.internal.zzAX
    public final void zzZ(zzBL zzbl) {
        zzZ(zzn("/Annot", null), zzbl);
    }

    private void zzZ(zz1Y zz1y, zzBK zzbk) {
        zz5I zz5iZzU8;
        if (zzbk.zzZY() < 0 || (zz5iZzU8 = this.zzkV.zzv5().zzU8(zzbk.zzZY())) == null) {
            return;
        }
        zz1y.zzZ(zz5iZzU8.zzw6(), zz5iZzU8.zzw4());
        zz5iZzU8.zzZ(zz1y);
    }
}

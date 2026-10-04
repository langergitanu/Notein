package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ3U implements zzZAI {
    private zzZAH zzYbh;
    private zzZAH zzYbi;
    private zzZ3M zzYbj;
    private zzZ3O zzYbk;
    private com.aspose.words.internal.zzBG zzYbl;
    private zzZ3T zzZFQ;

    public zzZ3U(boolean z, String str, boolean z2) {
        zzZ3T zzz3t = new zzZ3T();
        this.zzZFQ = zzz3t;
        zzz3t.zzUE(z);
        this.zzZFQ.zzJ1(str);
        this.zzZFQ.zzUD(z2);
        com.aspose.words.internal.zzBF zzbf = new com.aspose.words.internal.zzBF();
        this.zzYbl = zzbf;
        zzZ3O zzz3o = new zzZ3O(this.zzZFQ, zzbf);
        this.zzYbk = zzz3o;
        this.zzYbi = zzz3o;
        this.zzYbh = zzz3o;
    }

    private zzZAH zzV(zzZ6S zzz6s) throws Exception {
        int storyType = zzz6s.getStoryType();
        if (storyType == 2) {
            com.aspose.words.internal.zzBC zzbc = new com.aspose.words.internal.zzBC();
            this.zzYbl.zzX(zzbc);
            return new zzZ3O(this.zzZFQ, zzbc);
        }
        if (storyType == 3) {
            com.aspose.words.internal.zzBE zzbe = new com.aspose.words.internal.zzBE();
            this.zzYbl.zzX(zzbe);
            return new zzZ3O(this.zzZFQ, zzbe);
        }
        switch (storyType) {
            case 6:
            case 7:
            case 10:
                return new zzZ3N(this.zzZFQ, 0, 1, new com.aspose.words.internal.zzBI(zzz6s.zzJH(), this.zzZFQ.zzYNy()));
            case 8:
            case 9:
            case 11:
                return new zzZ3N(this.zzZFQ, 0, 2, new com.aspose.words.internal.zzBI(zzz6s.zzJH(), this.zzZFQ.zzYNy()));
            default:
                return this.zzYbk;
        }
    }

    private zzZ3M zzYNA() {
        zzZ3M zzz3m = this.zzYbj;
        if (zzz3m != null) {
            return zzz3m;
        }
        zzZ3M zzz3m2 = new zzZ3M(this.zzZFQ);
        this.zzYbj = zzz3m2;
        this.zzYbl.zzX(zzz3m2.zzYNn());
        return this.zzYbj;
    }

    @Override // com.aspose.words.zzZAI
    public final void endDocument() {
        this.zzYbi.endDocument();
    }

    @Override // com.aspose.words.zzZAI
    public final void zzG3() {
        this.zzZFQ.zzT(null);
    }

    @Override // com.aspose.words.zzZAI
    public final void zzW(com.aspose.words.internal.zzZR zzzr) {
        this.zzYbi.zzW(zzzr);
    }

    @Override // com.aspose.words.zzZAI
    public final void zzY(zzZ6N zzz6n) throws Exception {
        this.zzYbi.zzY(zzz6n);
    }

    @Override // com.aspose.words.zzZAI
    public final void zzZ(long j, zzZ71 zzz71) {
        this.zzZFQ.zzXA(j);
        this.zzZFQ.zzT(zzz71);
        this.zzYbj = null;
    }

    @Override // com.aspose.words.zzZAI
    public final boolean zzZ2c() {
        return true;
    }

    @Override // com.aspose.words.zzZAI
    public final com.aspose.words.internal.zzGH zzZ2d() {
        return this.zzYbl;
    }

    @Override // com.aspose.words.zzZAI
    public final void zzZ2e() throws Exception {
        this.zzYbi.zzZ2e();
    }

    @Override // com.aspose.words.zzZAI
    public final void zzZ2f() {
        this.zzYbi.zzZ2f();
    }

    @Override // com.aspose.words.zzZAI
    public final com.aspose.words.internal.zz7 zzZ2g() {
        return this.zzYbi.zzYWi();
    }

    @Override // com.aspose.words.zzZAI
    public final com.aspose.words.internal.zz7 zzZ2h() {
        return zzYNA().zzYWj();
    }

    @Override // com.aspose.words.zzZAI
    public final void zzZ2i() {
        zzZ2m();
    }

    @Override // com.aspose.words.zzZAI
    public final void zzZ2j() {
        this.zzYbi = zzYNA();
    }

    @Override // com.aspose.words.zzZAI
    public final void zzZ2k() {
        this.zzYbi.zzYWk();
        this.zzYbi = this.zzYbh;
    }

    @Override // com.aspose.words.zzZAI
    public final void zzZ2l() {
        this.zzYbi.zzZ2l();
    }

    @Override // com.aspose.words.zzZAI
    public final void zzZ2m() {
        zzZAH zzzah = this.zzYbi;
        if (zzzah != this.zzYbk) {
            zzzah.zzYWk();
            this.zzYbi = this.zzYbk;
        }
    }

    @Override // com.aspose.words.zzZAI
    public final void zzZ2n() {
        this.zzYbi.zzZ2n();
    }

    @Override // com.aspose.words.zzZAI
    public final void zzZ2o() {
        zzZ2m();
    }

    @Override // com.aspose.words.zzZAI
    public final zzZD9 zzY(zzZ68 zzz68) throws Exception {
        return this.zzYbi.zzY(zzz68);
    }

    @Override // com.aspose.words.zzZAI
    public final void zzY(zzZ63 zzz63) {
        this.zzYbi.zzY(zzz63);
    }

    @Override // com.aspose.words.zzZAI
    public final void zzY(zzZ70 zzz70) {
        this.zzYbi.zzY(zzz70);
    }

    @Override // com.aspose.words.zzZAI
    public final void zzZ(zzZ6V zzz6v) throws Exception {
        zzZ((zzZ6S) zzz6v);
    }

    @Override // com.aspose.words.zzZAI
    public final void zzY(zzZ6S zzz6s) throws Exception {
        this.zzYbh = this.zzYbi;
        zzZ3N zzz3n = new zzZ3N(this.zzZFQ, 1, 0, new com.aspose.words.internal.zzBI(zzz6s.zzJH(), this.zzZFQ.zzYNy()));
        this.zzYbi = zzz3n;
        zzz3n.zzYWl();
    }

    @Override // com.aspose.words.zzZAI
    public final void zzZ(zzZ6S zzz6s) throws Exception {
        zzZAH zzzahZzV = zzV(zzz6s);
        if (zzzahZzV != this.zzYbk) {
            zzzahZzV.zzYWl();
            this.zzYbi = zzzahZzV;
        }
    }

    @Override // com.aspose.words.zzZAI
    public final void zzZ(zzZ6N zzz6n) throws Exception {
        this.zzYbi.zzZ(zzz6n);
    }

    @Override // com.aspose.words.zzZAI
    public final void zzZ(com.aspose.words.internal.zzZL zzzl, zzZD9 zzzd9) throws Exception {
        zzD zzd = (zzD) com.aspose.words.internal.zzZKW.zzZ(zzzd9, zzD.class);
        if (zzd == null) {
            return;
        }
        for (com.aspose.words.internal.zzZR zzzr : com.aspose.words.internal.zzZQ.zzU(zzzl)) {
            if (zzzr.zzZY() == 0 || !zzZ3J.zzZ(zzd.zzbG(), zzzr.zzZY())) {
                com.aspose.words.internal.zzBB zzbb = new com.aspose.words.internal.zzBB(zzzr.getScreenTip());
                zzd.zzbG().zzX(zzbb);
                zzzr.zzO(this.zzZFQ.zzYNx());
                zzbb.zzO(zzzr.zzZY());
            }
        }
    }

    @Override // com.aspose.words.zzZAI
    public final void zzZ(zzZ6H zzz6h) throws Exception {
        this.zzYbi.zzZ(zzz6h);
    }

    @Override // com.aspose.words.zzZAI
    public final void zzZ(zzZ63 zzz63) {
        this.zzYbi.zzZ(zzz63);
    }

    @Override // com.aspose.words.zzZAI
    public final void zzZ(zzZ6M zzz6m) {
        this.zzYbi.zzZ(zzz6m);
    }

    @Override // com.aspose.words.zzZAI
    public final void zzZ(zzZ70 zzz70) throws Exception {
        this.zzYbi.zzZ(zzz70);
    }

    @Override // com.aspose.words.zzZAI
    public final void zzZ(com.aspose.words.internal.zz8 zz8Var) {
        zzYNA().zzZ(zz8Var);
    }
}

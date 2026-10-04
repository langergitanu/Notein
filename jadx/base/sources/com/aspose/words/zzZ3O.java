package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzZ3O implements zzZAH {
    private com.aspose.words.internal.zzD3<zzZ3Q> zzYaV = new com.aspose.words.internal.zzD3<>();
    private zzZ3Q zzYaW;
    private zzZ3Q zzYaX;
    private zzZ3K zzYaY;
    private zzZ3L zzYaZ;
    private zzZ3S zzYb0;
    protected zzZ3T zzYb4;
    private com.aspose.words.internal.zzBG zzYb8;

    public zzZ3O(zzZ3T zzz3t, com.aspose.words.internal.zzBG zzbg) {
        this.zzYb4 = zzz3t;
        this.zzYb8 = zzbg;
        this.zzYb0 = new zzZ3S(zzbg);
        this.zzYaZ = new zzZ3L(this.zzYb4, this.zzYb8);
        this.zzYaY = new zzZ3K(this.zzYb8);
        zzZ3R zzz3r = new zzZ3R(this.zzYb4, this.zzYb8);
        this.zzYaW = zzz3r;
        this.zzYaX = zzz3r;
    }

    private zzZ3Q zzQ(zzZ6N zzz6n) throws Exception {
        this.zzYaY.zzP(zzz6n);
        if (this.zzYaY.zzYNc()) {
            this.zzYb0.zzYNt();
            return new zzZ3R(this.zzYb4, this.zzYaY.zzYNb());
        }
        this.zzYb0.zzT(zzz6n);
        if (this.zzYb0.zzYNr()) {
            return new zzZ3P(this.zzYb4, this.zzYb0.zzYNq());
        }
        com.aspose.words.internal.zzB6 zzb6 = new com.aspose.words.internal.zzB6(zzz6n.getOutlineLevel());
        this.zzYb8.zzX(zzb6);
        return new zzZ3R(this.zzYb4, zzb6);
    }

    @Override // com.aspose.words.zzZAH
    public final void endDocument() {
        this.zzYb0.zzYNt();
    }

    @Override // com.aspose.words.zzZAH
    public final void zzW(com.aspose.words.internal.zzZR zzzr) {
        if (this.zzYaZ.zzYNg()) {
            this.zzYaZ.zzYNf().zzW(zzzr);
        } else {
            this.zzYaX.zzW(zzzr);
        }
    }

    @Override // com.aspose.words.zzZAH
    public final void zzY(zzZ63 zzz63) {
        this.zzYaZ.zzY(zzz63);
    }

    public final com.aspose.words.internal.zzBG zzYNn() {
        return this.zzYb8;
    }

    @Override // com.aspose.words.zzZAH
    public final com.aspose.words.internal.zz7 zzYWi() {
        return zzZ3J.zzYNa();
    }

    @Override // com.aspose.words.zzZAH
    public final com.aspose.words.internal.zz7 zzYWj() {
        if (this.zzYaZ.zzYNg()) {
            this.zzYaZ.zzYNf().zzYWj();
        }
        return this.zzYaX.zzYWj();
    }

    @Override // com.aspose.words.zzZAH
    public final void zzYWk() {
    }

    @Override // com.aspose.words.zzZAH
    public final void zzYWl() {
    }

    @Override // com.aspose.words.zzZAH
    public final void zzZ(zzZ63 zzz63) {
        this.zzYb0.zzYNt();
        this.zzYaY.zzYNd();
        this.zzYaZ.zzZ(zzz63);
    }

    @Override // com.aspose.words.zzZAH
    public final void zzZ2e() throws Exception {
        if (this.zzYaZ.zzYNg()) {
            this.zzYaZ.zzYNf().zzZ2e();
        } else {
            this.zzYaX.zzYNl();
        }
    }

    @Override // com.aspose.words.zzZAH
    public final void zzZ2f() {
        if (this.zzYaZ.zzYNg()) {
            this.zzYaZ.zzYNf().zzZ2f();
        } else {
            this.zzYaX.zzYNm();
        }
    }

    @Override // com.aspose.words.zzZAH
    public final void zzZ2l() {
        if (this.zzYaZ.zzYNg()) {
            this.zzYaZ.zzYNf().zzZ2l();
        } else {
            this.zzYaX.zzZ2l();
        }
    }

    @Override // com.aspose.words.zzZAH
    public final void zzZ2n() {
        if (this.zzYaZ.zzYNg() && this.zzYaZ.zzYNe()) {
            this.zzYaZ.zzYNf().zzZ2n();
        } else {
            this.zzYaX.zzYNk();
        }
    }

    @Override // com.aspose.words.zzZAH
    public final void zzY(zzZ70 zzz70) {
        this.zzYaZ.zzY(zzz70);
    }

    @Override // com.aspose.words.zzZAH
    public final zzZD9 zzY(zzZ68 zzz68) throws Exception {
        if (this.zzYaZ.zzYNg()) {
            return this.zzYaZ.zzYNf().zzY(zzz68);
        }
        return this.zzYaX.zzY(zzz68);
    }

    @Override // com.aspose.words.zzZAH
    public final void zzZ(zzZ6M zzz6m) {
        this.zzYaZ.zzZ(zzz6m);
    }

    @Override // com.aspose.words.zzZAH
    public final void zzZ(zzZ70 zzz70) throws Exception {
        this.zzYaZ.zzZ(zzz70);
    }

    @Override // com.aspose.words.zzZAH
    public final void zzY(zzZ6N zzz6n) throws Exception {
        if (zzz6n.zzYSe().zzZXP()) {
            return;
        }
        if (this.zzYaZ.zzYNg()) {
            this.zzYaZ.zzYNf().zzY(zzz6n);
        } else {
            this.zzYaX = this.zzYaW;
        }
    }

    @Override // com.aspose.words.zzZAH
    public final void zzZ(zzZ6H zzz6h) throws Exception {
        if (this.zzYaZ.zzYNg()) {
            this.zzYaZ.zzYNf().zzZ(zzz6h);
        } else {
            this.zzYaX.zzZ(zzz6h);
        }
    }

    @Override // com.aspose.words.zzZAH
    public final void zzZ(zzZ6N zzz6n) throws Exception {
        if (zzz6n.zzYSe().zzZXP()) {
            return;
        }
        if (this.zzYaZ.zzYNg()) {
            this.zzYaZ.zzYNf().zzZ(zzz6n);
            return;
        }
        zzZ3Q zzz3qZzQ = this.zzYaV.get(zzz6n.zzYSh());
        if (zzz3qZzQ == null) {
            zzz3qZzQ = zzQ(zzz6n);
            this.zzYaV.add(zzz6n.zzYSh(), zzz3qZzQ);
        }
        this.zzYaX = zzz3qZzQ;
    }
}

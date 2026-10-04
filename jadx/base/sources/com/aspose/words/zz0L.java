package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz0L extends zz39 implements zzZ9Z {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("oMath", "oMathPara", "rPr");
    private zz0M zzYXq;
    private com.aspose.words.internal.zzZQC<zz0M> zzYXr = new com.aspose.words.internal.zzZQC<>();
    private zzYVB zzYXs;

    private zz0L(zzYVB zzyvb) {
        this.zzYXs = zzyvb;
    }

    public static zz0M zzZ(zzYVB zzyvb) throws Exception {
        zz0L zz0l = new zz0L(zzyvb);
        zz0l.zzZsI();
        zz0M zz0m = zz0l.zzYXq;
        if (zz0m == null) {
            zz0m = new zz0M(new zzZ02());
        }
        zz0m.zzZsJ();
        return zz0m;
    }

    private zz0M zzZsC() {
        if (this.zzYXr.size() == 0) {
            return null;
        }
        return this.zzYXr.peek();
    }

    private void zzZsI() throws Exception {
        while (this.zzYXs.zzZsD().zzQ("m")) {
            int iZzTP = zzUR.zzTP(this.zzYXs.zzZsD().getLocalName());
            if (iZzTP == 0) {
                zzYUX.zzY(this);
            } else if (iZzTP != 1) {
                zz39.zzK(this.zzYXs.zzZsD());
            } else {
                zzYUX.zzZ(this);
            }
        }
    }

    @Override // com.aspose.words.zzZ9Z
    public final zzYU4 zzZsD() {
        return this.zzYXs.zzZsD();
    }

    @Override // com.aspose.words.zzZ9Z
    public final zzYVB zzZsE() {
        return this.zzYXs;
    }

    @Override // com.aspose.words.zzZ9Z
    public final void zzZsF() throws Exception {
        zz47 zz47VarZz0 = zz0I.zz0((zzZXT) this.zzYXs);
        if (zz47VarZz0 != null) {
            zzZsC().zzY(zz47VarZz0);
        }
    }

    @Override // com.aspose.words.zzZ9Z
    public final zzZAB zzZsG() {
        return new zz30();
    }

    @Override // com.aspose.words.zzZ9Z
    public final void zzZsH() {
        this.zzYXr.pop();
    }

    @Override // com.aspose.words.zzZ9Z
    public final void zzZ(zzZ0J zzz0j) {
        zzZ(zzz0j, new zz30());
    }

    @Override // com.aspose.words.zzZ9Z
    public final void zzZ(zzZ0J zzz0j, zzZAB zzzab) {
        zz0M zz0m = new zz0M(zzz0j, (zz30) zzzab);
        if (zzZsC() == null) {
            this.zzYXq = zz0m;
        } else {
            zzZsC().zzY(zz0m);
        }
        this.zzYXr.push(zz0m);
    }

    @Override // com.aspose.words.zzZ9Z
    public final void zzZ(zzZAB zzzab) throws Exception {
        while (this.zzYXs.zzZsD().zzQ("ctrlPr")) {
            if (zzUR.zzTP(this.zzYXs.zzZsD().getLocalName()) != 2) {
                this.zzYXs.zzZsD().zzk();
            } else {
                zz0I.zzZ((zz30) zzzab, (zzZXT) this.zzYXs);
            }
        }
    }
}

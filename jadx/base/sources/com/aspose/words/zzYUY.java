package com.aspose.words;

import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzYUY implements zzZ9Z {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("rPr", "annotation", FirebaseAnalytics.Param.CONTENT);
    private zzYV1 zzXTJ;
    private zzYUP zzXUr;
    private zzYVB zzYXs;

    public zzYUY(zzYVB zzyvb, zzYUP zzyup, zzYV1 zzyv1) {
        this.zzYXs = zzyvb;
        this.zzXUr = zzyup;
        this.zzXTJ = zzyv1;
    }

    @Override // com.aspose.words.zzZ9Z
    public final void zzZ(zzZ0J zzz0j, zzZAB zzzab) {
        zzYEF zzyef = (zzYEF) com.aspose.words.internal.zzZKW.zzZ(zzzab, zzYEF.class);
        if (zzyef != null) {
            OfficeMath officeMath = new OfficeMath(this.zzYXs.getDocument(), zzz0j, zzyef);
            this.zzYXs.zzT(officeMath);
            this.zzYXs.zzXUm.zzZ(zzyef, officeMath);
        }
    }

    public abstract boolean zzZ(String str, zzZAB zzzab) throws Exception;

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
        this.zzXTJ.zzF(this.zzYXs);
    }

    @Override // com.aspose.words.zzZ9Z
    public final zzZAB zzZsG() {
        return new zzYEF();
    }

    @Override // com.aspose.words.zzZ9Z
    public final void zzZsH() {
        this.zzYXs.zztj(35);
    }

    @Override // com.aspose.words.zzZ9Z
    public final void zzZ(zzZ0J zzz0j) {
        zzYVB zzyvb = this.zzYXs;
        zzyvb.zzT(new OfficeMath(zzyvb.getDocument(), zzz0j));
    }

    @Override // com.aspose.words.zzZ9Z
    public final void zzZ(zzZAB zzzab) throws Exception {
        while (this.zzYXs.zzZsD().zzQ("ctrlPr")) {
            int iZzTP = zzUR.zzTP(this.zzYXs.zzZsD().getLocalName());
            if (iZzTP != 0) {
                if (iZzTP != 1 && iZzTP != 2 && !zzZ(this.zzYXs.zzZsD().getLocalName(), zzzab)) {
                    this.zzYXs.zzZsD().zzk();
                }
            } else {
                this.zzXUr.zzW(this.zzYXs, (zzYEF) zzzab);
            }
        }
    }
}

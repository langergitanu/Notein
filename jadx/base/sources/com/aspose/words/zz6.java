package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz6 extends zzB {
    private zzZBP zzZFB;
    protected com.aspose.words.internal.zzQ8 zzZFC;
    private zzZVW zzZFD;
    private com.aspose.words.internal.zzQB zzZFq;
    private zzZBQ zzZFr;
    private zzZVR zzZFs;

    public zz6(float f, float f2) {
        super(f, f2);
        this.zzZFC = new com.aspose.words.internal.zzQ8();
    }

    public final void zzW(com.aspose.words.internal.zzQB zzqb) {
        this.zzZFq = zzqb;
    }

    public final void zzZ(zzZBP zzzbp) {
        this.zzZFB = zzzbp;
    }

    public final void zzZ(zzZVW zzzvw) {
        this.zzZFD = zzzvw;
    }

    public final void zzZ(zzZVR zzzvr) {
        this.zzZFs = zzzvr;
    }

    public final void zzZ(zzZBQ zzzbq) {
        this.zzZFr = zzzbq;
    }

    public final com.aspose.words.internal.zzZL[] zzZ(com.aspose.words.internal.zzQB zzqb, float f, float f2) throws Exception {
        if (this.zzZFr == null) {
            return new com.aspose.words.internal.zzZL[0];
        }
        com.aspose.words.internal.zzQG[] zzqgArrZzQ9 = zzQ9();
        if (zzqgArrZzQ9.length > 0) {
            this.zzZFC.zzZ(zzqgArrZzQ9);
        }
        this.zzZFr.zzQ(this.zzZFL);
        this.zzZFr.zzX(this.zzYs);
        zzZBP zzzbp = this.zzZFB;
        if (zzzbp != null) {
            int iZzV = zzzbp.zzV(zzqgArrZzQ9);
            com.aspose.words.internal.zzQ8 zzq8 = this.zzZFC;
            zzq8.zzZ(this.zzZFB.zzZ(zzq8.zzQ9(), this.zzZFJ, null, null, iZzV));
        }
        if (this.zzZFD != null) {
            com.aspose.words.internal.zzQ8 zzq82 = this.zzZFC;
            zzq82.zzZ(zzZVW.zzZ(zzq82.zzQ9(), this.zzZFK + this.zzZFJ));
        }
        com.aspose.words.internal.zzQB zzqb2 = this.zzZFq;
        if (zzqb2 != null) {
            com.aspose.words.internal.zzQ7 zzq7 = new com.aspose.words.internal.zzQ7(zzqb2);
            this.zzZFC.zzZ(zzq7);
            this.zzZFC = zzq7.zzPZ();
        }
        if (this.zzZFL instanceof com.aspose.words.internal.zzOI) {
            com.aspose.words.internal.zzQ8 zzq83 = this.zzZFC;
            zzq83.zzZ(zzZVU.zzZ(zzq83.zzQ7(), this.zzZFC.zzQ1(), this.zzZFC.zzQ0()));
        }
        zzZVR zzzvr = this.zzZFs;
        if (zzzvr != null) {
            this.zzZFC.zzZ(zzzvr);
            this.zzZFC = this.zzZFs.zzPZ();
        }
        zzZVN zzzvn = new zzZVN(zzqb, this.zzZFq, f, f2, this.zzZFr);
        this.zzZFC.zzZ(zzzvn);
        this.zzZFC = new com.aspose.words.internal.zzQ8();
        return (com.aspose.words.internal.zzZL[]) zzzvn.zzZjV().toArray(new com.aspose.words.internal.zzZL[0]);
    }
}

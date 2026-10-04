package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZVR extends com.aspose.words.internal.zzQA {
    private com.aspose.words.internal.zzQ8 zzKx;
    private com.aspose.words.internal.zzQG zzYMA;
    private int zzYMu;
    private boolean zzYMv;
    private com.aspose.words.internal.zzQ6 zzYMw;
    private com.aspose.words.internal.zzQ9 zzYMx;
    private boolean zzYMy;
    private boolean zzYMz;

    public zzZVR(boolean z, com.aspose.words.internal.zzQ6 zzq6, com.aspose.words.internal.zzQ9 zzq9, int i) {
        this.zzYMv = z;
        this.zzYMw = zzq6;
        zzq6.normalize();
        this.zzYMx = zzq9;
        this.zzYMu = i;
    }

    private boolean zzQ(com.aspose.words.internal.zzQG zzqg) {
        if (this.zzYMu != 1) {
            return zzqg.zzQv().zzY(this.zzYMw);
        }
        com.aspose.words.internal.zzQ6 zzq6 = new com.aspose.words.internal.zzQ6(this.zzYMx, zzqg.zzYi(0).zzYi(0));
        zzq6.normalize();
        return zzq6.zzY(zzqg.zzQv());
    }

    private boolean zzR(com.aspose.words.internal.zzQG zzqg) {
        if (zzqg.getCount() != 0 && zzqg.zzYi(0).getCount() != 0) {
            int type = zzqg.getType();
            if (type != 5) {
                return type != 6 ? !zzQ(zzqg) : !this.zzYMy;
            }
            if (!this.zzYMz) {
                return true;
            }
        }
        return false;
    }

    public final com.aspose.words.internal.zzQ8 zzPZ() {
        return this.zzKx;
    }

    @Override // com.aspose.words.internal.zzQA
    public final void zzQd() throws Exception {
        this.zzKx.zzW(this.zzYMx);
    }

    @Override // com.aspose.words.internal.zzQA
    public final void zzX(com.aspose.words.internal.zzQG zzqg) throws Exception {
        com.aspose.words.internal.zzQG zzqg2 = this.zzYMA;
        if (zzqg2 == null) {
            return;
        }
        this.zzKx.zzZ(zzqg2);
    }

    @Override // com.aspose.words.internal.zzQA
    public final void zzY(com.aspose.words.internal.zzQG zzqg) throws Exception {
        if (!this.zzYMv || zzR(zzqg)) {
            this.zzYMA = new com.aspose.words.internal.zzQG(zzqg.zzQv(), zzqg.getType(), zzqg.getOrder(), zzqg.zzZ2(), zzqg.zzZ1());
        } else {
            this.zzYMA = null;
        }
    }

    @Override // com.aspose.words.internal.zzQA
    public final void zzZ(com.aspose.words.internal.zzQ8 zzq8) throws Exception {
        this.zzKx = new com.aspose.words.internal.zzQ8();
        this.zzYMz = true;
        this.zzYMy = true;
        for (int i = 0; i < zzq8.zzQ9().length && this.zzYMz; i++) {
            this.zzYMz = zzQ(zzq8.zzQ9()[i]);
        }
        for (int i2 = 0; i2 < zzq8.zzQ8().length && this.zzYMy; i2++) {
            this.zzYMy = zzQ(zzq8.zzQ8()[i2]);
        }
    }

    @Override // com.aspose.words.internal.zzQA
    public final void zzX(com.aspose.words.internal.zzQ9 zzq9) throws Exception {
        com.aspose.words.internal.zzQG zzqg = this.zzYMA;
        if (zzqg == null) {
            return;
        }
        zzqg.zzYi(zzqg.getCount() - 1).zzZ(zzq9);
    }

    @Override // com.aspose.words.internal.zzQA
    public final void zzZ(com.aspose.words.internal.zzQD zzqd) throws Exception {
        com.aspose.words.internal.zzQG zzqg = this.zzYMA;
        if (zzqg != null) {
            zzqg.zzZ(new com.aspose.words.internal.zzQD());
        }
    }
}

package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYES extends zzYEQ {
    private int zzKF;
    private zzYET zzXr1;
    private zzYET zzXr2;
    private zzYET zzXtf;

    public zzYES(com.aspose.words.internal.zzZOP zzzop) {
        super(zzzop);
        this.zzXtf = new zzYET();
    }

    private void zzYeO() {
        int i = this.zzKF;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("Unexpected state.");
            }
            this.zzXr1 = this.zzXr2;
            this.zzXr2 = this.zzXtf;
            this.zzKF = 2;
        }
    }

    private void zzYeP() throws Exception {
        int i = this.zzKF;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("Unexpected state.");
            }
            this.zzXtf.zzBG(this.zzXr2.zzYR());
        } else {
            this.zzXtf.reset(4);
            this.zzXtf.zzBG(this.zzXr2.zzYR());
            this.zzKF = 1;
        }
    }

    private void zzYeQ() throws Exception {
        while (true) {
            super.zzYeR();
            zzYET zzyetZzYeN = super.zzYeN();
            this.zzXr2 = zzyetZzYeN;
            if (zzyetZzYeN.zzYb() != 4) {
                zzYeO();
                return;
            }
            zzYeP();
        }
    }

    @Override // com.aspose.words.zzYER
    public final zzYET zzYeN() {
        return this.zzXr2;
    }

    @Override // com.aspose.words.zzYEQ, com.aspose.words.zzYER
    public final void zzYeR() throws Exception {
        int i = this.zzKF;
        if (i == 0 || i == 1) {
            zzYeQ();
        } else {
            if (i != 2) {
                throw new IllegalStateException("Unknown state.");
            }
            this.zzXr2 = this.zzXr1;
            this.zzXr1 = null;
            this.zzKF = 0;
        }
    }
}

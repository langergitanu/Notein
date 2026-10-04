package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzLN extends zzMO {
    private boolean zzD7;
    private zzON zzD8;
    private int zzD9;

    public final boolean isEmpty() {
        return this.zzD7;
    }

    public final zzON zzJi() {
        return this.zzD8;
    }

    public final int zzJj() {
        return this.zzD9;
    }

    @Override // com.aspose.words.internal.zzMO
    public final void zzK0() throws Exception {
        int iZzXc = zzJJ().zzXc();
        this.zzD9 = zzJJ().zzXc();
        if (iZzXc == 0) {
            this.zzD7 = true;
            return;
        }
        int iZzXc2 = zzJJ().zzXc();
        int iZzXc3 = zzJJ().zzXc();
        if (iZzXc2 != 32 || iZzXc3 != 1) {
            this.zzD7 = true;
            return;
        }
        int iZzXc4 = zzJJ().zzXc();
        zzJJ().zzXc();
        zzJJ().zzMY();
        this.zzD8 = zzOL.zzNh();
        for (int i = 0; i < (((long) iZzXc4) & 4294967295L); i++) {
            this.zzD8 = this.zzD8.zzF(zzJJ().zzMY());
        }
    }
}

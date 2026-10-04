package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzMW extends zzMO implements zzG5 {
    private zzZQ5 zzDE;
    private zzZQ5 zzDF;
    private int zzDG;
    private int zzDH;
    private int zzDI;
    private long zzDN;
    private byte[] zzDO;
    private boolean zzDP;
    private zzP9 zzDU;
    private int zzL4;

    public zzMW(int i) {
        this.zzL4 = i;
    }

    private void zzJQ() throws Exception {
        zzJJ().zzMY();
        int iZzXc = zzJJ().zzXc();
        int iZzXc2 = zzJJ().zzXc();
        int iZzXc3 = zzJJ().zzXc();
        int iZzXc4 = zzJJ().zzXc();
        int iZzXc5 = zzJJ().zzXc();
        int iZzXc6 = zzJJ().zzXc();
        zzJJ().zzXc();
        this.zzDI = zzJJ().zzXc();
        zzJJ().zzXc();
        this.zzDH = zzJJ().zzXc();
        zzJJ().zzXc();
        this.zzDG = zzJJ().zzXc();
        int iZzXc7 = zzJJ().zzXc();
        int iZzXc8 = zzJJ().zzXc();
        this.zzDF = new zzZQ5(iZzXc3, iZzXc4, iZzXc5, iZzXc6);
        this.zzDE = new zzZQ5(iZzXc, iZzXc2, iZzXc7, iZzXc8);
        this.zzDU = new zzP9();
    }

    private byte[] zzJY() throws Exception {
        zzJJ().zzq().zzH(this.zzDN);
        return zzEF.zzZ(zzJJ(), this.zzDI, this.zzDH);
    }

    private void zza(boolean z) throws Exception {
        int iZzXc;
        int iZzXc2;
        zzJJ().zzMY();
        int iZzXc3 = zzJJ().zzXc();
        int iZzXc4 = zzJJ().zzXc();
        int iZzXc5 = zzJJ().zzXc();
        int iZzXc6 = zzJJ().zzXc();
        this.zzDG = zzJJ().zzXc();
        int iZzXc7 = zzJJ().zzXc();
        int iZzXc8 = zzJJ().zzXc();
        this.zzDU = zzJJ().zzMQ();
        zzJJ().zzMW();
        zzJJ().zzXc();
        zzJJ().zzXc();
        this.zzDI = zzJJ().zzXc();
        zzJJ().zzXc();
        this.zzDH = zzJJ().zzXc();
        if (z) {
            iZzXc = zzJJ().zzXc();
            iZzXc2 = zzJJ().zzXc();
        } else {
            iZzXc = iZzXc5;
            iZzXc2 = iZzXc6;
        }
        this.zzDF = new zzZQ5(iZzXc7, iZzXc8, iZzXc, iZzXc2);
        this.zzDE = new zzZQ5(iZzXc3, iZzXc4, iZzXc5, iZzXc6);
    }

    @Override // com.aspose.words.internal.zzG5
    public final boolean zzJM() {
        return this.zzDH > 0;
    }

    @Override // com.aspose.words.internal.zzG5
    public final zzZQ5 zzJN() {
        return this.zzDE;
    }

    @Override // com.aspose.words.internal.zzG5
    public final zzZQ5 zzJO() {
        return this.zzDF;
    }

    @Override // com.aspose.words.internal.zzG5
    public final int zzJP() {
        return this.zzDG;
    }

    public final byte[] zzJZ() throws Exception {
        if (!zzJM()) {
            return null;
        }
        if (!this.zzDP) {
            this.zzDO = zzJY();
            this.zzDP = true;
        }
        return this.zzDO;
    }

    @Override // com.aspose.words.internal.zzMO
    public final void zzK0() throws Exception {
        int i = this.zzL4;
        if (i == 81) {
            zzJQ();
        } else if (i == 77) {
            zza(true);
        } else {
            zza(false);
        }
        this.zzDN = zzJJ().zzq().getPosition();
    }
}

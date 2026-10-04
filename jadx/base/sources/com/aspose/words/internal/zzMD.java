package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzMD extends zzMO {
    private zz95 zzDv;
    private long[] zzDw;
    private zzPV[] zzDx;

    public final zzG zzJE() throws Exception {
        return this.zzDv.zzZ(this.zzDw, this.zzDx);
    }

    @Override // com.aspose.words.internal.zzMO
    public final void zzK0() throws Exception {
        zzJJ().zzMY();
        int iZzXc = zzJJ().zzXc();
        int iZzXc2 = zzJJ().zzXc();
        int iZzXc3 = zzJJ().zzXc();
        this.zzDw = new long[iZzXc];
        this.zzDx = new zzPV[iZzXc];
        for (int i = 0; i < iZzXc; i++) {
            this.zzDw[i] = zzJJ().zzN1();
            int iZzXa = zzJJ().zzXa() & 65535;
            int iZzXa2 = zzJJ().zzXa() & 65535;
            int iZzXa3 = 65535 & zzJJ().zzXa();
            zzJJ().zzXa();
            this.zzDx[i] = new zzPV(iZzXa / 255, iZzXa2 / 255, iZzXa3 / 255);
        }
        zz95 zz95VarZzUN = zz95.zzUN(iZzXc3);
        this.zzDv = zz95VarZzUN;
        zz95VarZzUN.zzY(zzJJ(), iZzXc2);
    }
}

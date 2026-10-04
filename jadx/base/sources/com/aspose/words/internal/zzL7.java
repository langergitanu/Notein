package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzL7 extends zzL6 {
    @Override // com.aspose.words.internal.zzMO
    public final void zzK0() throws Exception {
        int[] iArrZzXP;
        long jZzN1 = zzJJ().zzN1();
        int iZzXc = zzJJ().zzXc();
        int iZzXc2 = zzJJ().zzXc();
        zzX5(zzJJ().zzXc());
        zzw(Float.intBitsToFloat(zzJJ().zzXc()));
        zzv(Float.intBitsToFloat(zzJJ().zzXc()));
        zzZQ4 zzzq4 = new zzZQ4();
        if ((iZzXc2 & 256) == 0) {
            zzzq4 = zzJJ().zzMY();
        }
        zzZQ4 zzzq42 = zzzq4;
        boolean z = (iZzXc2 & 16) != 0;
        boolean z2 = (iZzXc2 & 512) != 0;
        String str = null;
        if (z) {
            iArrZzXP = zzJJ().zzXP(iZzXc);
        } else {
            String strZzXM = z2 ? zzJJ().zzXM(iZzXc) : zzJJ().zzXN(iZzXc);
            iArrZzXP = null;
            str = strZzXM;
        }
        zzZ(iZzXc == 0 ? zzL1.zzIW() : new zzL1(jZzN1, zzzq42, iZzXc2, iArrZzXP, str));
    }
}

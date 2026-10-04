package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zz1V extends zz2D {
    private zz1W zzYYI;

    public zz1V(zz1W zz1w, zz89 zz89Var) {
        super(zz89Var);
        this.zzYYI = zz1w;
    }

    private zzBW zzZuC() throws Exception {
        com.aspose.words.internal.zzPV zzpvZzZ = this.zzYYI.zzZQX().zzZ(zzZuZ().getThemeProvider(), (zzZCM) null);
        int iMin = Math.min(255, zzpvZzZ.zzPC() + 102);
        int iMin2 = Math.min(255, zzpvZzZ.zzPB() + 102);
        int iMin3 = Math.min(255, zzpvZzZ.zzPA() + 102);
        zz3Y zz3y = new zz3Y();
        zz3y.zzXD(((double) iMin) / 255.0d);
        zz3y.zzXC(((double) iMin2) / 255.0d);
        zz3y.zzXB(((double) iMin3) / 255.0d);
        Iterator<zzZCM> it = this.zzYYI.zzZQX().zzZNX().iterator();
        while (it.hasNext()) {
            com.aspose.words.internal.zzZQG.zzZ(zz3y.zzZNX(), it.next());
        }
        return zz3y;
    }

    private com.aspose.words.internal.zzZQC<zz21> zzZuD() throws Exception {
        zz21 zz21Var = new zz21();
        zz21Var.zzZ(this.zzYYI.zzZQX());
        zz21Var.zzQ(this.zzYYI.zzZuM());
        zz21Var.zzXo(this.zzYYI.zzZuL());
        com.aspose.words.internal.zzZQC<zz21> zzzqc = new com.aspose.words.internal.zzZQC<>();
        zzzqc.push(zz21Var);
        switch (this.zzYYI.zzZuE()) {
            case 1:
                zz21Var.setAlignment(8);
                zz21Var.zzXn(1.25d);
                zz21Var.zzXm(1.25d);
                break;
            case 2:
            case 13:
                zz21Var.setAlignment(7);
                zz21Var.zzP(zzHK.zzYR(40.89d));
                zz21Var.zzXm(0.5d);
                break;
            case 3:
            case 14:
                zz21Var.setAlignment(7);
                zz21Var.zzP(zzHK.zzYR(-40.89d));
                zz21Var.zzXm(0.5d);
                break;
            case 4:
                zz21 zz21Var2 = new zz21();
                zzzqc.push(zz21Var2);
                zz21Var2.zzZ(zzZuC());
                zz21Var2.zzQ(this.zzYYI.zzZuM());
                zz21Var2.zzXo(this.zzYYI.zzZuL() * 2.0d);
                break;
            case 6:
            case 17:
                zz21Var.setAlignment(7);
                zz21Var.zzP(zzHK.zzYR(40.89d));
                zz21Var.zzXm(-0.5d);
                break;
            case 7:
            case 18:
                zz21Var.setAlignment(7);
                zz21Var.zzP(zzHK.zzYR(-40.89d));
                zz21Var.zzXm(-0.5d);
                break;
            case 8:
            case 9:
                zz21 zz21Var3 = new zz21();
                zzzqc.push(zz21Var3);
                zz21Var3.zzZ(zzZuC());
                zz21Var3.zzQ(zzHK.zzYR(this.zzYYI.zzZuM().zzZQQ() + 180.0d));
                zz21Var3.zzXo(this.zzYYI.zzZuL());
                break;
            case 10:
                zz21Var.setAlignment(7);
                zz21Var.zzXm(0.5d);
                break;
            case 12:
                zz21Var.setAlignment(7);
                zz21Var.zzXm(-1.0d);
                break;
            case 19:
                zz21Var.setAlignment(0);
                zz21Var.zzXn(0.75d);
                zz21Var.zzXm(0.75d);
                break;
        }
        return zzzqc;
    }

    @Override // com.aspose.words.zz2D, com.aspose.words.zzZC1
    public final com.aspose.words.internal.zzG zzv(com.aspose.words.internal.zzG zzg) throws Exception {
        com.aspose.words.internal.zzZQC<zz21> zzzqcZzZuD = zzZuD();
        com.aspose.words.internal.zzG zzg2 = new com.aspose.words.internal.zzG();
        while (zzzqcZzZuD.size() > 0) {
            zzg2.zzX((com.aspose.words.internal.zzZL) new zz20(zzzqcZzZuD.pop(), zzZuZ()).zzv(zzg));
        }
        return zzg2;
    }
}

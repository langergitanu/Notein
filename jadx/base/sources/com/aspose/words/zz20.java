package com.aspose.words;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zz20 extends zz2D {
    private zz21 zzYYO;

    public zz20(zz21 zz21Var, zz89 zz89Var) {
        super(zz89Var);
        this.zzYYO = zz21Var;
    }

    private com.aspose.words.internal.zzG zzZ(Collection<com.aspose.words.internal.zzZG> collection, com.aspose.words.internal.zzPV zzpv) throws Exception {
        com.aspose.words.internal.zzG zzg = new com.aspose.words.internal.zzG();
        for (com.aspose.words.internal.zzZG zzzg : collection) {
            if (!zzZuY()) {
                if (zzzg.zzZ2() == null) {
                    zzzg.zzX(new com.aspose.words.internal.zzOU(zzpv, ((float) this.zzYYO.zzZuN()) / 4.0f));
                } else {
                    zzzg.zzZ2().zzY(new com.aspose.words.internal.zzOI(zzpv));
                }
                zzzg.zzZ2().zzXW(2);
            }
            zzg.zzX(zzzg);
        }
        int iZzXq = zzXq(this.zzYYO.zzZuN());
        zz2I zz2i = new zz2I();
        zz2i.zzYL(iZzXq);
        return new zz2H(zz2i, zzZuZ()).zzv(zzg);
    }

    @Override // com.aspose.words.zz2D, com.aspose.words.zzZC1
    public final com.aspose.words.internal.zzG zzv(com.aspose.words.internal.zzG zzg) throws Exception {
        com.aspose.words.internal.zzPV zzpvZzZ = this.zzYYO.zzZQX().zzZ(zzZuZ().getThemeProvider(), (zzZCM) null);
        zz1Z zz1z = new zz1Z(this.zzYYO, zzZuZ().getThemeProvider());
        if (zzZuZ().zzZFk() || (zzZuZ().zzZC2() && zzZuZ().zzZQ4() == 3)) {
            com.aspose.words.internal.zzJ8 zzj8 = new com.aspose.words.internal.zzJ8(zzZuZ().zzwx().zzFE());
            zzj8.zzGZ();
            com.aspose.words.internal.zzG zzgZzZ = zz03.zzZ(zzZuZ(), zzZ(zzg, zzj8), zzXq(this.zzYYO.zzZuN()), zzpvZzZ, zzZuY());
            zzgZzZ.zzZO().zzZ(zz1z.zzZt(zzZuZ().zzZC6()), 1);
            return zzgZzZ;
        }
        Collection<com.aspose.words.internal.zzZG> collectionZzZ = new com.aspose.words.internal.zzYD(zz1z).zzZ(zzg, false);
        if (!com.aspose.words.internal.zzAN.zzZD(this.zzYYO.zzZuN())) {
            return (!zzZuY() || this.zzYYO.zzZv8()) ? zzZ(collectionZzZ, zzpvZzZ) : zzZ(zzpvZzZ, collectionZzZ);
        }
        com.aspose.words.internal.zzG zzg2 = new com.aspose.words.internal.zzG();
        Iterator<com.aspose.words.internal.zzZG> it = collectionZzZ.iterator();
        while (it.hasNext()) {
            zzg2.zzX(it.next());
        }
        return zzg2;
    }

    private com.aspose.words.internal.zzG zzZ(com.aspose.words.internal.zzPV zzpv, Collection<com.aspose.words.internal.zzZG> collection) throws Exception {
        com.aspose.words.internal.zzG zzg = new com.aspose.words.internal.zzG();
        int iZzPD = zzpv.zzPD();
        com.aspose.words.internal.zzPV zzpv2 = new com.aspose.words.internal.zzPV(255, zzpv);
        Iterator<com.aspose.words.internal.zzZG> it = collection.iterator();
        while (it.hasNext()) {
            zzg.zzX((com.aspose.words.internal.zzZL) zz1E.zzZ(it.next(), this.zzYYO.zzZuN(), zzpv2, 12700, false, zzZuZ().getDocument()));
        }
        return iZzPD == 255 ? zzg : zz1E.zzZ(zzg, iZzPD, 12700, zzZuZ().getDocument());
    }
}

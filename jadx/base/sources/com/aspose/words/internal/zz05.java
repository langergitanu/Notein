package com.aspose.words.internal;

import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
final class zz05 {
    private StringBuilder zzdC = new StringBuilder();
    private zz07 zzdD;
    private zzJO zzdJ;

    public zz05(zzZXH zzzxh) {
        zzJO zzjoZzZ = zzzxh.zzZ(false, true, false);
        this.zzdJ = zzjoZzZ;
        this.zzdD = new zz07(zzjoZzZ);
        this.zzdJ.zzWP(32);
    }

    public final String getName() {
        return this.zzdJ.zzPl().zzpQ();
    }

    public final void zz0(zzZOP zzzop) throws Exception {
        this.zzdJ.zzF(zzzop);
        this.zzdD.zzZ(zzzop, zzZKN.format("AWCMap{0}", getName()));
        new zzZZX(zzzop).zzm("/AW{0} /AWCMap{0} [/{0}] composefont pop", getName());
    }

    public final String zzXD(String str) {
        this.zzdC.setLength(0);
        Iterator<Integer> it = new zzZYE(str).iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            if (this.zzdJ.zzWP(iIntValue) >= 0) {
                zzZNH.zzU(this.zzdC, zzZVS.zzS7(iIntValue));
            }
        }
        return this.zzdC.toString();
    }
}

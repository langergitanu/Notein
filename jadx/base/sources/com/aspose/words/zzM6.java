package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzM6 extends zzMS {
    public zzM6(String str, boolean z) {
        super(str, z);
    }

    public final boolean zzS(zzPS zzps) {
        boolean z = false;
        for (zzYBI zzybi : zzZXv()) {
            if (zzps.zzSx(zzybi.getPropertyName()) != null) {
                z = true;
            } else if (zzybi.zzY84()) {
                return false;
            }
        }
        return z;
    }

    @Override // com.aspose.words.zzMS
    public final zzPS zzY(zzL2 zzl2, boolean z, boolean z2) {
        zzPS zzpsZzZ;
        if (zzl2.getCount() == 0) {
            return null;
        }
        int i = 0;
        if (zzl2.getCount() == 1 && zzl2.zzMl(0).zzP(zzL4.zzZnn)) {
            zzPR zzpr = new zzPR();
            zzYBI[] zzybiArrZzZXv = zzZXv();
            int length = zzybiArrZzZXv.length;
            while (i < length) {
                zzpr.zzO(zzybiArrZzZXv[i].zzQM(z));
                i++;
            }
            zzpsZzZ = zzpr.zzZWe();
        } else if (zzl2.getCount() == 1 && zzl2.zzMl(0).zzP(zzL4.zzZnm)) {
            zzPR zzpr2 = new zzPR();
            zzYBI[] zzybiArrZzZXv2 = zzZXv();
            int length2 = zzybiArrZzZXv2.length;
            while (i < length2) {
                zzPS zzpsZzQL = zzybiArrZzZXv2[i].zzQL(z);
                if (zzpsZzQL != null) {
                    zzpr2.zzO(zzpsZzQL);
                }
                i++;
            }
            zzpsZzZ = zzpr2.zzZWe();
        } else {
            zzpsZzZ = zzZ(zzl2, z, z2);
        }
        if (zzpsZzZ == null || zzpsZzZ.getCount() == 0) {
            return null;
        }
        return zzpsZzZ;
    }

    public abstract zzMP zzZ(zzPS zzps);

    public abstract zzPS zzZ(zzL2 zzl2, boolean z, boolean z2);

    public void zzZ(zzPR zzpr) {
        zzYBI[] zzybiArrZzZXv = zzZXv();
        ArrayList arrayList = new ArrayList(zzybiArrZzZXv.length);
        int i = 0;
        int i2 = 0;
        for (zzYBI zzybi : zzybiArrZzZXv) {
            zzPT zzptZzSx = zzpr.zzSx(zzybi.getPropertyName());
            if (zzptZzSx == null) {
                return;
            }
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzPT>) arrayList, zzptZzSx);
            if (zzptZzSx.zzZWi()) {
                i++;
            }
            if (zzptZzSx.zzZWj().zzZVz()) {
                i2++;
            }
        }
        if (arrayList.size() > 1) {
            if (i == 0 || i == arrayList.size()) {
                if (i2 == 0 || i2 == arrayList.size()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        zzpr.remove(((zzPT) it.next()).zzZWo());
                    }
                    zzpr.zzV(new zzM3(getName(), zzZ(new zzPS(arrayList)), i != 0));
                }
            }
        }
    }

    public abstract zzYBI[] zzZXv();
}

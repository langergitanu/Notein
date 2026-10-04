package com.aspose.words;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zz88 implements zzZCI {
    @Override // com.aspose.words.zzZCI
    public final void zzZ(com.aspose.words.internal.zzOH zzoh, zzGR zzgr, ArrayList<zz8E> arrayList) throws Exception {
        Collection<zz8D> collectionZzZ = zz87.zzZ(arrayList, zzgr.getThemeProvider());
        if (collectionZzZ.size() == 0) {
            return;
        }
        int iZzZU = com.aspose.words.internal.zzEF.zzZU(zzoh.getImageBytes());
        zzZCM zzzcmZzZPL = zzgr.zzZPL();
        try {
            com.aspose.words.internal.zzXN zzxn = new com.aspose.words.internal.zzXN(zzoh);
            com.aspose.words.internal.zzEI zzei = new com.aspose.words.internal.zzEI(zzxn);
            try {
                zzZCJ[] zzzcjArr = new zzZCJ[collectionZzZ.size()];
                Iterator<zz8D> it = collectionZzZ.iterator();
                int i = 0;
                while (it.hasNext()) {
                    zzzcjArr[i] = it.next();
                    i++;
                }
                zzoh.setImageBytes(zzZ(zzei, zzzcjArr, iZzZU, zzzcmZzZPL));
                zzei.dispose();
                zzxn.dispose();
            } catch (Throwable th) {
                zzei.dispose();
                throw th;
            }
        } catch (Exception unused) {
        }
    }

    private byte[] zzZ(com.aspose.words.internal.zzEI zzei, zzZCJ[] zzzcjArr, int i, zzZCM zzzcm) throws Exception {
        if (zzZ(zzzcjArr)) {
            zzzcjArr[0].zzZ(zzei, i, zzzcm);
            zzei.zzDU();
            com.aspose.words.internal.zzEI zzei2 = new com.aspose.words.internal.zzEI(zzei.getImageBytes());
            try {
                zzZCJ[] zzzcjArr2 = new zzZCJ[zzzcjArr.length - 1];
                for (int i2 = 1; i2 < zzzcjArr.length; i2++) {
                    zzzcjArr2[i2 - 1] = zzzcjArr[i2];
                }
                byte[] bArrZzZ = zzZ(zzei2, zzzcjArr2, i, zzzcm);
                zzei2.dispose();
                return bArrZzZ;
            } catch (Throwable th) {
                zzei2.dispose();
                throw th;
            }
        }
        for (zzZCJ zzzcj : zzzcjArr) {
            zzzcj.zzZ(zzei, i, zzzcm);
        }
        zzei.zzDU();
        return zzei.getImageBytes();
    }

    private static boolean zzZ(zzZCJ[] zzzcjArr) {
        if (zzzcjArr.length < 2 || zzzcjArr[0].getOrder() != 1) {
            return false;
        }
        for (int i = 1; i < zzzcjArr.length; i++) {
            if (zzzcjArr[i].getOrder() == 2) {
                return false;
            }
        }
        return true;
    }
}

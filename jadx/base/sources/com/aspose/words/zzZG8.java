package com.aspose.words;

import com.aspose.words.ref.Ref;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
final class zzZG8 {
    private HashMap<Integer, ArrayList<zzZGB>> zzYnX = new HashMap<>();
    private Document zzZEY;

    public zzZG8(Document document) {
        this.zzZEY = document;
    }

    private zzZGB zzY(int i, zzZGR zzzgr) {
        Ref ref = new Ref(null);
        boolean zZzZ = com.aspose.words.internal.zzZQF.zzZ(this.zzYnX, Integer.valueOf(zzzgr.zzZ1u().zzZ1g()), ref);
        ArrayList arrayList = (ArrayList) ref.get();
        if (!zZzZ) {
            arrayList = new ArrayList();
            com.aspose.words.internal.zzZQF.zzY(this.zzYnX, Integer.valueOf(zzzgr.zzZ1u().zzZ1g()), arrayList);
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            zzZGB zzzgb = (zzZGB) arrayList.get(size);
            if (zzzgr.zzZ1u().getListLevelNumber() >= zzzgb.zzZ0z() && zzzgr.zzY(zzzgb)) {
                return zzzgb;
            }
        }
        zzZGB zzzgb2 = new zzZGB(this.zzZEY.getLists().add(i), zzzgr.zzZ1u().getListLevelNumber());
        com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzZGB>) arrayList, zzzgb2);
        return zzzgb2;
    }

    public final zzZGB zzZ(int i, zzZGR zzzgr) throws Exception {
        zzZGB zzzgbZzY = zzY(i, zzzgr);
        zzzgr.zzX(zzzgbZzY);
        return zzzgbZzY;
    }

    public final void zzZ0n() {
        this.zzYnX.clear();
    }
}

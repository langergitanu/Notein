package com.aspose.words;

import androidx.appcompat.view.menu.C21505OooO0Oo;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzYXN {
    private zzYXQ zzZ(zzYWR zzywr, com.aspose.words.internal.zzZO0 zzzo0) {
        String strOooO0OO = androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder("id=\""), zzywr.zzXWf, "\"");
        for (int i = 0; i < zzaf(); i++) {
            String strZzP1 = zzP1(i);
            int i2 = com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8;
            int iZzT = com.aspose.words.internal.zzZKN.zzT(strZzP1, strOooO0OO, i2);
            if (iZzT >= 0) {
                int iZzY = com.aspose.words.internal.zzZKN.zzY(strZzP1, "<", iZzT, i2);
                if (iZzY >= 0) {
                    return zzY(i, zzzo0.zzV4(strZzP1.substring(0, iZzY)), zzywr.zzXWe, zzywr.zzXWd);
                }
                return null;
            }
        }
        return null;
    }

    public abstract String zzP1(int i);

    public abstract zzYXQ zzY(int i, int i2, int i3, String str);

    public final ArrayList<zzYXQ> zzY(ArrayList<zzYWR> arrayList, com.aspose.words.internal.zzZO0 zzzo0) {
        zzYXQ zzyxqZzZ;
        ArrayList<zzYXQ> arrayList2 = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            zzYWR zzywr = arrayList.get(i);
            if (com.aspose.words.internal.zzZYD.zzXk(zzywr.zzXWf)) {
                zzyxqZzZ = zzZ(zzywr, zzzo0);
            } else if (com.aspose.words.internal.zzZYD.zzXk(zzywr.zzXWc)) {
                zzyxqZzZ = zzZ(zzywr, i);
            }
            for (int level = (arrayList2.size() > 0 ? ((zzYXQ) C21505OooO0Oo.OooO00o(1, arrayList2)).getLevel() : 0) + 1; level < zzyxqZzZ.getLevel(); level++) {
                com.aspose.words.internal.zzZQG.zzZ(arrayList2, new zzYXQ(zzyxqZzZ.getRawOffset(), zzyxqZzZ.zzaL(), zzyxqZzZ.zzYCD(), level, com.aspose.words.internal.zzZKN.zzS('*', level)));
            }
            com.aspose.words.internal.zzZQG.zzZ(arrayList2, zzyxqZzZ);
        }
        return arrayList2;
    }

    public abstract zzYXQ zzZ(zzYWR zzywr, int i);

    public abstract int zzaf();
}

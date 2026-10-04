package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZDD {
    private String zzYL;
    private ArrayList<com.aspose.words.internal.zzZQ4> zzYk8;

    public zzZDD(String str, com.aspose.words.internal.zzZQ4 zzzq4) {
        this.zzYL = str;
        ArrayList<com.aspose.words.internal.zzZQ4> arrayList = new ArrayList<>();
        this.zzYk8 = arrayList;
        com.aspose.words.internal.zzZQG.zzZ(arrayList, zzzq4);
    }

    public final String getTarget() {
        return this.zzYL;
    }

    public final ArrayList<com.aspose.words.internal.zzZQ4> zzYX8() {
        return this.zzYk8;
    }

    public final void zzZa(com.aspose.words.internal.zzZQ4 zzzq4) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (com.aspose.words.internal.zzZQ4 zzzq42 : this.zzYk8) {
            com.aspose.words.internal.zzZQ4[] zzzq4ArrZzC = zzYK1.zzC(zzzq42, zzzq4);
            if (zzzq4ArrZzC != null) {
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<com.aspose.words.internal.zzZQ4>) arrayList, zzzq42);
                if (zzzq4ArrZzC.length > 0) {
                    com.aspose.words.internal.zzZQG.zzZ(arrayList2, (Object[]) zzzq4ArrZzC);
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.zzYk8.remove((com.aspose.words.internal.zzZQ4) it.next());
        }
        com.aspose.words.internal.zzZQG.zzZ((ArrayList) this.zzYk8, (Iterable) arrayList2);
    }
}

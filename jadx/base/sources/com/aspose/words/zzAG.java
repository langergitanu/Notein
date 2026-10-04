package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzAG extends zzAK {
    public zzAG(zzAL zzal, boolean z) {
        super(zzal, z);
    }

    @Override // com.aspose.words.zzAK
    public final ArrayList<zz93> zzR(zz93 zz93Var) {
        ArrayList<zz93> arrayListZzZ = zzZ(2, zz93Var);
        ArrayList<zz93> arrayList = new ArrayList<>();
        for (zz93 zz93Var2 : arrayListZzZ) {
            com.aspose.words.internal.zzZQG.zzZ(arrayList, zz93Var2);
            if (zz93Var2.getType() == 2) {
                com.aspose.words.internal.zzZQG.zzZ((ArrayList) arrayList, (Iterable) zzZ(3, zz93Var2));
            }
        }
        return arrayList;
    }
}

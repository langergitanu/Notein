package com.aspose.words;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes6.dex */
final class zzAJ extends zzAK {
    public zzAJ(zzAL zzal, boolean z) {
        super(zzal, z);
    }

    @Override // com.aspose.words.zzAK
    public final ArrayList<zz93> zzR(zz93 zz93Var) {
        ArrayList<zz93> arrayList = new ArrayList<>();
        while (true) {
            zz93Var = zzQ(zz93Var);
            if (zz93Var == null) {
                Collections.reverse(arrayList);
                return arrayList;
            }
            com.aspose.words.internal.zzZQG.zzZ(arrayList, zz93Var);
        }
    }
}

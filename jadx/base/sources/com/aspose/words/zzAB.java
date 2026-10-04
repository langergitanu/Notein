package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzAB extends zzAK {
    public zzAB(zzAL zzal, boolean z) {
        super(zzal, z);
    }

    @Override // com.aspose.words.zzAK
    public final ArrayList<zz93> zzR(zz93 zz93Var) {
        zzAN zzanZzT;
        ArrayList<zz93> arrayList = new ArrayList<>();
        int type = zz93Var.getType();
        if (type != 2) {
            if (type == 3 || type == 5) {
                zzanZzT = zzZEk().zzR(zz93Var.zzZD0());
            }
            return arrayList;
        }
        zzanZzT = zzZEk().zzT(zz93Var.zzZEC());
        if (zzanZzT != null) {
            zzY(arrayList, zzanZzT);
            return arrayList;
        }
        return arrayList;
    }
}

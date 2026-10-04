package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzAH extends zzAK {
    public zzAH(zzAL zzal, boolean z) {
        super(zzal, z);
    }

    @Override // com.aspose.words.zzAK
    public final ArrayList<zz93> zzR(zz93 zz93Var) {
        ArrayList<zz93> arrayList = new ArrayList<>();
        int type = zz93Var.getType();
        if (type == 1 || type == 2) {
            ArrayList<zzAN> arrayListZzU = zzZEk().zzU(zz93Var.zzZEC());
            int i = 0;
            while (i < arrayListZzU.size()) {
                zzAN zzan = arrayListZzU.get(i);
                zzZ(arrayList, zzan);
                zzX(arrayList, zzan);
                zzZ(arrayList, zzan, i == arrayListZzU.size() - 1);
                i++;
            }
        }
        return arrayList;
    }
}

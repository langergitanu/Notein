package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzAD extends zzAK {
    public zzAD(zzAL zzal, boolean z) {
        super(zzal, z);
    }

    @Override // com.aspose.words.zzAK
    public final ArrayList<zz93> zzR(zz93 zz93Var) {
        zz93 zz93VarZzQ = zzQ(zz93Var);
        if (zz93VarZzQ == null) {
            return new ArrayList<>();
        }
        ArrayList<zz93> arrayListZzZ = zzZ(2, zz93VarZzQ);
        if (!arrayListZzZ.contains(zz93Var)) {
            return new ArrayList<>();
        }
        return com.aspose.words.internal.zzZQG.zzW(arrayListZzZ, arrayListZzZ.indexOf(zz93Var) + 1, (arrayListZzZ.size() - r4) - 1);
    }
}

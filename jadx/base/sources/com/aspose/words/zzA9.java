package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzA9 extends zzAK {
    public zzA9(zzAL zzal, boolean z) {
        super(zzal, z);
    }

    @Override // com.aspose.words.zzAK
    public final ArrayList<zz93> zzR(zz93 zz93Var) {
        zz93 zz93VarZzQ = zzQ(zz93Var);
        if (zz93VarZzQ == null) {
            return new ArrayList<>();
        }
        ArrayList<zz93> arrayListZzZ = zzZ(2, zz93VarZzQ);
        return !arrayListZzZ.contains(zz93Var) ? arrayListZzZ : com.aspose.words.internal.zzZQG.zzW(arrayListZzZ, 0, arrayListZzZ.indexOf(zz93Var));
    }
}

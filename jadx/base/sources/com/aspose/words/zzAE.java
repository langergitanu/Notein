package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzAE extends zzAK {
    public zzAE(zzAL zzal, boolean z) {
        super(zzal, z);
    }

    @Override // com.aspose.words.zzAK
    public final ArrayList<zz93> zzR(zz93 zz93Var) {
        int type;
        int iIndexOf;
        zz93 zz93VarZzQ = zzQ(zz93Var);
        if (zz93VarZzQ == null) {
            return new ArrayList<>();
        }
        ArrayList<zz93> arrayListZzZ = zzZ(3, zz93VarZzQ);
        if (arrayListZzZ.contains(zz93Var) && (type = zz93Var.getType()) != 1) {
            if (type == 2) {
                iIndexOf = arrayListZzZ.indexOf(zzZEk().zzS(zzZEk().zzT(zz93Var.zzZEC()).zzZEw()));
            } else {
                if (type != 3 && type != 5) {
                    return new ArrayList<>();
                }
                iIndexOf = arrayListZzZ.indexOf(zz93Var) + 1;
            }
            return com.aspose.words.internal.zzZQG.zzW(arrayListZzZ, iIndexOf, arrayListZzZ.size() - iIndexOf);
        }
        return new ArrayList<>();
    }
}

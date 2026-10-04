package com.aspose.words;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzA6 {
    private HashMap<zz5A, zz93> zzZ71 = new HashMap<>();
    private ArrayList<zz93> zzEG = new ArrayList<>();

    public final void zz7(ArrayList<zz93> arrayList) {
        Iterator<zz93> it = arrayList.iterator();
        while (it.hasNext()) {
            zzP(it.next());
        }
    }

    public final ArrayList<zz93> zzLy() {
        return this.zzEG;
    }

    public final void zzP(zz93 zz93Var) {
        if (this.zzZ71.containsKey(zz93Var.zzZEC())) {
            return;
        }
        com.aspose.words.internal.zzZQF.zzY(this.zzZ71, zz93Var.zzZEC(), zz93Var);
        com.aspose.words.internal.zzZQG.zzZ(this.zzEG, zz93Var);
    }
}

package com.aspose.words;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
final class zzX9 {
    private ArrayList<zzXA> zzZm = new ArrayList<>();
    private HashMap<Integer, zzXA> zzZAN = new HashMap<>();

    public final int getCount() {
        return this.zzZm.size();
    }

    public final zzXA zzOG(int i) {
        return this.zzZAN.get(Integer.valueOf(i));
    }

    public final zzXA zzOH(int i) {
        return this.zzZm.get(i);
    }

    public final void zzZ(zzXA zzxa) {
        com.aspose.words.internal.zzZQG.zzZ(this.zzZm, zzxa);
        if (this.zzZAN.containsKey(Integer.valueOf(zzxa.zze0))) {
            return;
        }
        com.aspose.words.internal.zzZQF.zzY(this.zzZAN, Integer.valueOf(zzxa.zze0), zzxa);
    }
}

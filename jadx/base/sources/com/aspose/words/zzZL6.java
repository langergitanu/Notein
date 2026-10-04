package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzZL6 {
    private ArrayList<zzZL9> zzZe5 = new ArrayList<>();

    public final zzZL9 zzAn(int i) {
        if (i >= 0) {
            return this.zzZe5.get(i);
        }
        for (int i2 = 0; i2 < this.zzZe5.size(); i2++) {
            zzZL9 zzzl9 = this.zzZe5.get(i2);
            if (i == 0) {
                return zzzl9;
            }
            i += zzzl9.zzYut;
            if (i > 0) {
                return null;
            }
        }
        return null;
    }

    public final void zzY(zzZL9 zzzl9) {
        com.aspose.words.internal.zzZQG.zzZ(this.zzZe5, zzzl9);
    }
}

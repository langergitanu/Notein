package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzYHV {
    private ArrayList<com.aspose.words.internal.zzPV> zzWZ = new ArrayList<>();
    private ArrayList<zzY5M> zzXwk = new ArrayList<>();
    private com.aspose.words.internal.zz7D<com.aspose.words.internal.zzPV> zzXwj = new com.aspose.words.internal.zz7D<>();

    public zzYHV(boolean z) {
        if (z) {
            zzZ(com.aspose.words.internal.zzPV.zzHZ, null);
        }
    }

    public final int getCount() {
        return this.zzWZ.size();
    }

    public final int zzZ(com.aspose.words.internal.zzPV zzpv, zzY5M zzy5m) {
        com.aspose.words.internal.zzZQG.zzZ(this.zzWZ, zzpv);
        int size = this.zzWZ.size() - 1;
        this.zzXwj.set(zzpv, size);
        com.aspose.words.internal.zzZQG.zzZ(this.zzXwk, zzy5m);
        return size;
    }

    public final int zzZL(com.aspose.words.internal.zzPV zzpv) {
        return zzZ(zzpv, null);
    }

    public final int zzZM(com.aspose.words.internal.zzPV zzpv) {
        int i = this.zzXwj.get(zzpv);
        return !com.aspose.words.internal.zz7D.zzWm(i) ? i : zzZ(zzpv, null);
    }

    public final zzY5M zzoZ(int i) {
        if (i < 0 || i >= this.zzWZ.size()) {
            return null;
        }
        return this.zzXwk.get(i);
    }

    public final com.aspose.words.internal.zzPV zzp0(int i) {
        return (i < 0 || i >= this.zzWZ.size()) ? com.aspose.words.internal.zzPV.zzHZ : this.zzWZ.get(i);
    }
}

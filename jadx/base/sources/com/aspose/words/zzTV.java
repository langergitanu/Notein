package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzTV implements zzZB0 {
    private ArrayList<zzZB0> zzZt1 = new ArrayList<>();

    private boolean zzX(zzZB0 zzzb0) {
        Class<?> cls = zzzb0.getClass();
        Iterator<zzZB0> it = this.zzZt1.iterator();
        while (it.hasNext()) {
            if (it.next().getClass() == cls) {
                return true;
            }
        }
        return false;
    }

    @Override // com.aspose.words.zzZB0
    public final zzZB1 getFormatApplier() throws Exception {
        zzTW zztw = new zzTW();
        Iterator<zzZB0> it = this.zzZt1.iterator();
        while (it.hasNext()) {
            zztw.zzZ(it.next().getFormatApplier());
        }
        return zztw;
    }

    @Override // com.aspose.words.zzZB0
    public final Inline getSourceNode() {
        if (isEmpty()) {
            return null;
        }
        for (int size = this.zzZt1.size() - 1; size >= 0; size--) {
            Inline sourceNode = this.zzZt1.get(size).getSourceNode();
            if (sourceNode != null) {
                return sourceNode;
            }
        }
        return null;
    }

    public final boolean isEmpty() {
        return this.zzZt1.size() == 0;
    }

    public final void zzY(zzZB0 zzzb0) {
        if (zzX(zzzb0)) {
            return;
        }
        com.aspose.words.internal.zzZQG.zzZ(this.zzZt1, zzzb0);
    }

    public final void zzZ(zzZB0 zzzb0) {
        if (zzX(zzzb0)) {
            return;
        }
        this.zzZt1.add(0, zzzb0);
    }
}

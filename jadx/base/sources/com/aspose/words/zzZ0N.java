package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ0N {
    private ArrayList<zzZ0O> zzZc = new ArrayList<>();

    private void removeAt(int i) {
        this.zzZc.remove(i);
    }

    private void zzYFq() {
        removeAt(this.zzZc.size() - 1);
    }

    public final int getCount() {
        return this.zzZc.size();
    }

    public final zzZ0N zzYFr() {
        zzZ0N zzz0n = new zzZ0N();
        for (int i = 0; i < this.zzZc.size(); i++) {
            zzz0n.zzZ(zzuI(i).zzYFs(), 1);
        }
        return zzz0n;
    }

    public final void zzZ(zzZ0O zzz0o) {
        zzZ(zzz0o, 1);
    }

    public final zzZ0O zzuI(int i) {
        return this.zzZc.get(i);
    }

    public final void zzuJ(int i) {
        int size = this.zzZc.size() - i;
        if (size > 0) {
            for (int i2 = 0; i2 < size; i2++) {
                zzYFq();
            }
            return;
        }
        if (size < 0) {
            while (size < 0) {
                zzZ(new zzZ0O(), 1);
                size++;
            }
        }
    }

    public final void zzZ(zzZ0O zzz0o, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            com.aspose.words.internal.zzZQG.zzZ(this.zzZc, zzz0o.zzYFs());
        }
    }
}

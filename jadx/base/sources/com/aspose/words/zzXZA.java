package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzXZA {
    private zzXZC zzWSn = new zzXZC();

    public final zzXZD zzXQR() {
        if (this.zzWSn.getCount() <= 0) {
            return null;
        }
        return this.zzWSn.zzhi(r0.getCount() - 1);
    }

    public final zzXZD zzXQS() {
        if (this.zzWSn.getCount() > 0) {
            return this.zzWSn.zzhi(0);
        }
        return null;
    }

    public final zzXZC zzXQT() {
        return this.zzWSn;
    }

    public final void zzv(StringBuilder sb) {
        Iterator<zzXZD> it = this.zzWSn.iterator();
        while (it.hasNext()) {
            com.aspose.words.internal.zzZNH.zzU(sb, it.next().getText());
        }
    }
}

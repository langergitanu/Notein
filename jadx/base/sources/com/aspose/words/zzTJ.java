package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzTJ {
    private com.aspose.words.internal.zzZQC<zzTL> zzE8 = new com.aspose.words.internal.zzZQC<>();

    public final int getCount() {
        return this.zzE8.size();
    }

    public final void zzX(zzTL zztl) {
        this.zzE8.push(zztl);
    }

    public final zzTL zzZY5() {
        return this.zzE8.size() == 0 ? zzZU3.zzZiV() : this.zzE8.pop();
    }
}

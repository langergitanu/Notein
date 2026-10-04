package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYJT {
    private com.aspose.words.internal.zz7D<Object> zzXCq = new com.aspose.words.internal.zz7D<>();

    public final void reset() {
        this.zzXCq.clear();
    }

    public final Iterable<Object> zzYlY() {
        return this.zzXCq.zzxs();
    }

    public final boolean zzZ2(Object obj) {
        return this.zzXCq.containsKey(obj);
    }

    public final void zzZ3(Object obj) {
        int i = this.zzXCq.get(obj);
        if (com.aspose.words.internal.zz7D.zzWm(i)) {
            this.zzXCq.zzP(obj, 1);
        } else {
            this.zzXCq.set(obj, i + 1);
        }
    }
}

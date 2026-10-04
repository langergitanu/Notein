package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzZ3M implements zzZ5V {
    private final boolean zzWlB = zzZ5L.zzXH0();
    private zzZ5W zzWlz;

    public zzZ3M(zzZ5W zzz5w) {
        this.zzWlz = zzz5w;
    }

    public final void zzXGE() {
        if (this.zzWlB != zzZ5L.zzXH0()) {
            throw new zzZ0H("No access to key in current thread.");
        }
    }

    public final void zzXGG() {
        this.zzWlz = null;
    }

    @Override // com.aspose.words.internal.zzZ58
    public final zzZ5W zzXGV() {
        return this.zzWlz;
    }
}

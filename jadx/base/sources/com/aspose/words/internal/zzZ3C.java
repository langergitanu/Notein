package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzZ3C implements zzZ5V {
    private final boolean zzWlB = zzZ5L.zzXH0();
    private zzZ5W zzWlz;

    public zzZ3C(zzZ5W zzz5w) {
        this.zzWlz = zzz5w;
    }

    public final void zzXGE() {
        if (this.zzWlB != zzZ5L.zzXH0()) {
            throw new zzZ0H("No access to key in current thread.");
        }
    }

    @Override // com.aspose.words.internal.zzZ58
    public final zzZ5W zzXGV() {
        return this.zzWlz;
    }
}

package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzZ3P implements zzZ5V {
    private final boolean zzWlB;
    private zzZ33 zzWlm;
    private zzZ5W zzWlz;

    public zzZ3P(zzZ5W zzz5w, zzZ33 zzz33) {
        this.zzWlB = zzZ5L.zzXH0();
        this.zzWlz = zzz5w;
        this.zzWlm = zzz33;
    }

    public final void zzXGE() {
        if (this.zzWlB != zzZ5L.zzXH0()) {
            throw new zzZ0H("No access to key in current thread.");
        }
    }

    public final void zzXGG() {
        this.zzWlz = null;
        this.zzWlm = null;
    }

    @Override // com.aspose.words.internal.zzZ58
    public zzZ5W zzXGV() {
        return this.zzWlz;
    }

    public zzZ33 zzXGy() {
        return this.zzWlm;
    }

    public zzZ3P(zzZ5W zzz5w, zzZ86 zzz86) {
        this(zzz5w, zzZ33.zzU(zzz86));
    }
}

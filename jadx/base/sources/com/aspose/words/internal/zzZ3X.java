package com.aspose.words.internal;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzZ3X implements zzZ5V {
    private static final Set<zzZDA> zzWlt;
    private final boolean zzWlB = zzZ5L.zzXH0();
    private zzZ36 zzWls;
    private zzZ5W zzWlz;

    static {
        HashSet hashSet = new HashSet(3);
        zzWlt = hashSet;
        hashSet.add(zzZ6W.zzWnD);
        hashSet.add(zzZ6W.zzWnC);
        hashSet.add(zzZ9K.zzWyV);
    }

    public zzZ3X(zzZ5W zzz5w, zzZ36 zzz36) {
        this.zzWlz = zzz5w;
        this.zzWls = zzz36;
    }

    private static zzZ36 zzX(zzZ86 zzz86) {
        if (!zzWlt.contains(zzz86.zzXJk())) {
            throw new IllegalArgumentException("Unknown algorithm type: " + zzz86.zzXJk());
        }
        if (!zzZ2X.zzU(zzz86.zzXJj())) {
            return null;
        }
        zzZ7Y zzz7yZzXf = zzZ7Y.zzXf(zzz86.zzXJj());
        return new zzZ36(zzz7yZzXf.getP(), zzz7yZzXf.getQ(), zzz7yZzXf.getG());
    }

    public zzZ36 zzXGC() {
        return this.zzWls;
    }

    public final void zzXGE() {
        if (this.zzWlB != zzZ5L.zzXH0()) {
            throw new zzZ0H("No access to key in current thread.");
        }
    }

    public final void zzXGG() {
        this.zzWlz = null;
        this.zzWls = null;
    }

    @Override // com.aspose.words.internal.zzZ58
    public zzZ5W zzXGV() {
        return this.zzWlz;
    }

    public zzZ3X(zzZ5W zzz5w, zzZ86 zzz86) {
        this.zzWlz = zzz5w;
        this.zzWls = zzX(zzz86);
    }
}

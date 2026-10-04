package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzZ3J<T> implements zzZ5V {
    private zzZ2Y<T> zzWle;
    private zzZ5W zzWlz;

    public zzZ3J(zzZ5W zzz5w, zzZ2Y<T> zzz2y) {
        this.zzWlz = zzz5w;
        this.zzWle = zzz2y;
    }

    private static zzZ2Y zzV(zzZ86 zzz86) {
        if (!zzZ2X.zzU(zzz86.zzXJj())) {
            return null;
        }
        zzZA9 zzza9ZzY3 = zzZA9.zzY3(zzz86.zzXJj());
        return new zzZ2Y(zzza9ZzY3.zzXJw(), zzza9ZzY3.zzXJv(), zzza9ZzY3.zzXJv());
    }

    public static void zzXGE() {
        if (zzZ5L.zzXH0()) {
            throw new zzZ0H("No access to key in current thread.");
        }
    }

    public final void zzXGG() {
        this.zzWlz = null;
        this.zzWle = null;
    }

    @Override // com.aspose.words.internal.zzZ58
    public zzZ5W zzXGV() {
        return this.zzWlz;
    }

    public zzZ2Y<T> zzXGz() {
        return this.zzWle;
    }

    public zzZ3J(zzZ5W zzz5w, zzZDA zzzda, zzZ86 zzz86) {
        if (zzzda.equals(zzz86.zzXJk())) {
            this.zzWlz = zzz5w;
            this.zzWle = zzV(zzz86);
        } else {
            throw new IllegalArgumentException("Unknown algorithm type: " + zzz86.zzXJk());
        }
    }
}

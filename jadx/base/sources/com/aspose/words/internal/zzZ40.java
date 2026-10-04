package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzZ40 implements zzZ5V {
    private final boolean zzWlB = zzZ5L.zzXH0();
    private zzZ38 zzWly;
    private zzZ5W zzWlz;

    public zzZ40(zzZ5W zzz5w, zzZ38 zzz38) {
        this.zzWlz = zzz5w;
        this.zzWly = zzz38;
    }

    private static zzZ38 zzY(zzZ86 zzz86) {
        zzZDA zzzdaZzXJk = zzz86.zzXJk();
        zzZDK zzzdkZzXJj = zzz86.zzXJj();
        if (zzzdkZzXJj == null) {
            throw new NullPointerException("AlgorithmIdentifier parameters cannot be empty");
        }
        if (zzzdaZzXJk.equals(zzZ9K.zzWyT)) {
            zzZ9L zzz9lZzXV = zzZ9L.zzXV(zzzdkZzXJj);
            return new zzZ38(zzz9lZzXV.getP(), zzz9lZzXV.getG());
        }
        if (zzzdaZzXJk.equals(zzZ96.zzWyk) || zzZ2X.zzT(zzzdkZzXJj)) {
            zzZ9G zzz9gZzXR = zzZ9G.zzXR(zzzdkZzXJj);
            return zzz9gZzXR.zzXJm() != null ? new zzZ38(zzz9gZzXR.getP(), null, zzz9gZzXR.getG(), zzz9gZzXR.zzXJm().intValue()) : new zzZ38(zzz9gZzXR.getP(), zzz9gZzXR.getG());
        }
        if (zzzdaZzXJk.equals(zzZ6W.zzWnw)) {
            zzZ78 zzz78ZzWU = zzZ78.zzWU(zzzdkZzXJj);
            return zzz78ZzWU.zzXHA() != null ? new zzZ38(zzz78ZzWU.getP(), zzz78ZzWU.getQ(), zzz78ZzWU.getG(), zzz78ZzWU.zzXHB(), new zzZ37(zzz78ZzWU.zzXHA().getSeed(), zzz78ZzWU.zzXHA().zzXHz().intValue())) : new zzZ38(zzz78ZzWU.getP(), zzz78ZzWU.getQ(), zzz78ZzWU.getG(), zzz78ZzWU.zzXHB(), null);
        }
        throw new IllegalArgumentException("Unknown algorithm type: " + zzzdaZzXJk);
    }

    public zzZ38 zzXGD() {
        return this.zzWly;
    }

    public final void zzXGE() {
        if (this.zzWlB != zzZ5L.zzXH0()) {
            throw new zzZ0H("No access to key in current thread.");
        }
    }

    public final void zzXGG() {
        this.zzWlz = null;
        this.zzWly = null;
    }

    @Override // com.aspose.words.internal.zzZ58
    public zzZ5W zzXGV() {
        return this.zzWlz;
    }

    public zzZ40(zzZ5W zzz5w, zzZ86 zzz86) {
        this.zzWlz = zzz5w;
        this.zzWly = zzY(zzz86);
    }
}

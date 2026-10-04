package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ2Y<T> {
    private final zzZDA zzWEk;
    private final zzZDA zzWEl;
    private final zzZDA zzWEm;
    private final T zzWkG;

    public zzZ2Y(zzZDA zzzda) {
        this(zzzda, zzZAE.zzWEN, null, zzM(zzzda));
    }

    private static Object zzM(zzZDA zzzda) {
        zzZAA zzzaaZzT = zzZAB.zzT(zzzda);
        if (zzzaaZzT != null) {
            return new zzZ2Z(zzzaaZzT.getKeySize(), zzzaaZzT.getP(), zzzaaZzT.getQ(), zzzaaZzT.getA());
        }
        zzZ33 zzz33ZzU = zzZAD.zzU(zzzda);
        return new zzZ2W(zzzda, zzz33ZzU.zzXHv(), zzz33ZzU.zzXHu(), zzz33ZzU.zzXIz(), zzz33ZzU.zzXHt());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzZ2Y)) {
            return false;
        }
        zzZ2Y zzz2y = (zzZ2Y) obj;
        zzZDA zzzda = this.zzWEl;
        if (zzzda == null ? zzz2y.zzWEl != null : !zzzda.equals(zzz2y.zzWEl)) {
            return false;
        }
        T t = this.zzWkG;
        if (t == null ? zzz2y.zzWkG != null : !t.equals(zzz2y.zzWkG)) {
            return false;
        }
        zzZDA zzzda2 = this.zzWEk;
        if (zzzda2 == null ? zzz2y.zzWEk != null : !zzzda2.equals(zzz2y.zzWEk)) {
            return false;
        }
        zzZDA zzzda3 = this.zzWEm;
        zzZDA zzzda4 = zzz2y.zzWEm;
        return zzzda3 == null ? zzzda4 == null : zzzda3.equals(zzzda4);
    }

    public final int hashCode() {
        zzZDA zzzda = this.zzWEm;
        int iHashCode = (zzzda != null ? zzzda.hashCode() : 0) * 31;
        zzZDA zzzda2 = this.zzWEl;
        int iHashCode2 = (iHashCode + (zzzda2 != null ? zzzda2.hashCode() : 0)) * 31;
        zzZDA zzzda3 = this.zzWEk;
        int iHashCode3 = (iHashCode2 + (zzzda3 != null ? zzzda3.hashCode() : 0)) * 31;
        T t = this.zzWkG;
        return iHashCode3 + (t != null ? t.hashCode() : 0);
    }

    public final T zzXGk() {
        return this.zzWkG;
    }

    public final zzZDA zzXJv() {
        return this.zzWEl;
    }

    public final zzZDA zzXJw() {
        return this.zzWEm;
    }

    public final zzZDA zzXJx() {
        return this.zzWEk;
    }

    public zzZ2Y(zzZDA zzzda, zzZDA zzzda2) {
        this(zzzda, zzzda2, null, zzM(zzzda));
    }

    public zzZ2Y(zzZDA zzzda, zzZDA zzzda2, zzZDA zzzda3) {
        this(zzzda, zzzda2, zzzda3, zzM(zzzda));
    }

    public zzZ2Y(zzZDA zzzda, zzZDA zzzda2, zzZDA zzzda3, T t) {
        this.zzWEm = zzzda;
        this.zzWEl = zzzda2;
        this.zzWEk = zzzda3;
        this.zzWkG = t;
    }
}

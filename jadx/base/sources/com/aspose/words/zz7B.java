package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz7B implements Comparable<zz7B> {
    private int zzZ3h;
    private double zzZ3i;
    private zzBW zzZh4;

    public zz7B() {
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!com.aspose.words.internal.zzZ4.zzW(this, obj)) {
            return false;
        }
        zz7B zz7b = (zz7B) obj;
        return com.aspose.words.internal.zzZKO.equals(zz7b.zzZQX(), zzZQX()) && com.aspose.words.internal.zzAN.zzL(zz7b.zzZ3i, this.zzZ3i);
    }

    public final double getPosition() {
        return this.zzZ3i;
    }

    public final int hashCode() {
        return zzZQX().hashCode() ^ com.aspose.words.internal.zzZKP.zzZ9(this.zzZ3i);
    }

    public final void setPosition(double d) {
        this.zzZ3i = d;
    }

    public final void zzI7(int i) {
        this.zzZ3h = i;
    }

    public final com.aspose.words.internal.zzPI zzY(zzZ90 zzz90, zzZCM zzzcm) {
        return new com.aspose.words.internal.zzPI(zzZQX().zzZ(zzz90, zzzcm), (float) this.zzZ3i);
    }

    public final com.aspose.words.internal.zzPI zzZ(float f, zzZ90 zzz90, zzZCM zzzcm) {
        return new com.aspose.words.internal.zzPI(zzZQX().zzZ(zzz90, zzzcm), f);
    }

    public final zz7B zzZAp() {
        zz7B zz7b = new zz7B();
        zz7b.zzZh4 = zzZQX().zzZHt();
        zz7b.zzZ3i = this.zzZ3i;
        return zz7b;
    }

    public final zzBW zzZQX() {
        if (this.zzZh4 == null) {
            this.zzZh4 = new zz6S();
        }
        return this.zzZh4;
    }

    public zz7B(double d, zzBW zzbw) {
        this.zzZ3i = d;
        this.zzZh4 = zzbw;
    }

    public final void zzZ(zzBW zzbw) {
        this.zzZh4 = zzbw;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: zzZ, reason: merged with bridge method [inline-methods] */
    public int compareTo(zz7B zz7b) {
        if (zz7b != null) {
            int iZzF = com.aspose.words.internal.zzZKT.zzF(this.zzZ3i, zz7b.zzZ3i);
            return iZzF == 0 ? com.aspose.words.internal.zzZKR.zzZ7(this.zzZ3h, zz7b.zzZ3h) : iZzF;
        }
        throw new NullPointerException("Value cannot be null.\r\nParameter name: obj");
    }
}

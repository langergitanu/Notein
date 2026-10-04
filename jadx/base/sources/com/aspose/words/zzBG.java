package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzBG implements Cloneable {
    private zzJH zzZ7W;
    private zzJJ zzZ7X;

    public zzBG(String str) {
        this.zzZ7X = new zzJJ(str);
    }

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final void zzZ(zzJH zzjh) {
        this.zzZ7W = zzjh;
    }

    public final zzJH zzZFb() {
        return this.zzZ7W;
    }

    public final zzJJ zzZFc() {
        return this.zzZ7X;
    }

    public final zzBG zzZFd() {
        zzBG zzbg = (zzBG) memberwiseClone();
        zzJH zzjh = this.zzZ7W;
        if (zzjh != null) {
            zzbg.zzZ7W = zzjh.zzZSq();
        }
        return zzbg;
    }
}

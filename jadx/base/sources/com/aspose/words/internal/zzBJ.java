package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzBJ implements zzGH {
    private int zzsF;
    private zzGH zzsG;

    public zzBJ(int i) {
        this.zzsF = i;
    }

    public final zzGH zzBF() {
        return this.zzsG;
    }

    public final int zzBG() {
        return this.zzsF;
    }

    @Override // com.aspose.words.internal.zzGH
    public final void zzZ(zzAX zzax) {
        zzax.zzZ(this);
    }

    @Override // com.aspose.words.internal.zzGH
    public final void zzZ(zzGH zzgh) {
        this.zzsG = zzgh;
    }
}

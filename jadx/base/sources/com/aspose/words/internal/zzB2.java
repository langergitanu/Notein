package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public class zzB2 extends zzBG {
    private int zzU7;
    private int zzsw;
    private boolean zzsx;
    private boolean zzsy;

    public zzB2(boolean z, boolean z2, int i, int i2) {
        this.zzsy = z;
        this.zzsx = z2;
        this.zzsw = i;
        this.zzU7 = i2;
    }

    public final int getRowSpan() {
        return this.zzU7;
    }

    public final int zzBx() {
        return this.zzsw;
    }

    public final boolean zzBy() {
        return this.zzsx;
    }

    public final boolean zzBz() {
        return this.zzsy;
    }

    @Override // com.aspose.words.internal.zzBG, com.aspose.words.internal.zzGH
    public final void zzZ(zzAX zzax) {
        zzax.zzZ(this);
        super.zzZ(zzax);
        zzax.zzBi();
    }
}

package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzWO extends zzWP {
    private zzD4 zzTG;
    private int zzTH;

    private zzWO(int i, zzD4 zzd4) {
        this.zzTH = i;
        this.zzTG = zzd4;
    }

    public static zzWO zzV(zzWK zzwk, int i) throws Exception {
        zzD4 zzd4 = new zzD4(i);
        for (int i2 = 0; i2 < i; i2++) {
            zzd4.set(i2, zzwk.zzUU());
        }
        return new zzWO(i, zzd4);
    }

    @Override // com.aspose.words.internal.zzWP
    public final int getSize() {
        return this.zzTH + 1;
    }

    @Override // com.aspose.words.internal.zzWP
    public final void zzZ(zzWJ zzwj) throws Exception {
        zzwj.zzV((short) 0);
        for (int i = 0; i < this.zzTH; i++) {
            zzwj.zzV((short) this.zzTG.get(i));
        }
    }

    @Override // com.aspose.words.internal.zzWP
    public final int zzZt(int i) {
        return this.zzTG.get(i);
    }
}

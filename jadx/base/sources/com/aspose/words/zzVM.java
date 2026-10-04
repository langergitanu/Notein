package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzVM {
    private int zzZwo;
    private int zzZwp;

    private zzVM(int i, int i2) {
        this.zzZwp = i;
        this.zzZwo = i2;
    }

    public static zzVM zzL(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        int iZzXc = zzzox.zzXc();
        zzzox.zzq().zzH(zzzox.zzq().getPosition() + 8);
        return new zzVM(iZzXc, zzzox.zzXc());
    }

    public final int zz1d() {
        return this.zzZwo;
    }

    public final int zz1e() {
        return this.zzZwp;
    }
}

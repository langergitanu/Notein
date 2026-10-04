package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzZXY {
    private int zzVL;
    private int zzVN;
    private int zzbr;

    public final int getHeight() {
        return this.zzVN;
    }

    public final int getWidth() {
        return this.zzVL;
    }

    public final void zzZ(zzZXX zzzxx) throws Exception {
        zzzxx.zzn(6);
        zzZXW zzzxw = new zzZXW();
        zzzxw.zzZ(zzzxx);
        int position = (int) zzzxx.zzq().getPosition();
        zzzxx.zzXc();
        zzzxx.zzqj();
        this.zzVL = zzzxx.zzXc();
        this.zzVN = zzzxx.zzXc();
        this.zzbr = zzzxx.zzXc();
        zzzxx.zzZA((int) (((long) zzzxw.getLength()) & 4294967295L), position);
    }

    public final int zzqM() {
        return this.zzbr;
    }
}

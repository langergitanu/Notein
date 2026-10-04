package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzZRZ {
    private com.aspose.words.internal.zzZOX zzW6;
    private int zzYI1;
    private long zzYI2;

    public zzZRZ(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        this.zzW6 = zzzox;
        this.zzYI2 = zzzox.zzq().getPosition();
        zzzox.zzq().zzU(511L, 1);
        this.zzYI1 = zzzox.readByte() & 255;
        zzzox.zzq().zzU(this.zzYI2, 0);
    }

    public final com.aspose.words.internal.zzZOX zzZhh() {
        return this.zzW6;
    }

    public final int zzZhi() {
        return this.zzYI1;
    }

    public final long zzZhj() {
        return this.zzYI2;
    }
}

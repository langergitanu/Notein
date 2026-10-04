package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
abstract class zzXX {
    protected int zzVS;
    protected byte zzVT;
    protected boolean zzVU;

    public zzXX(boolean z) {
        this.zzVU = z;
        zzX2();
    }

    public final byte zzX1() {
        return (byte) (this.zzVU ? 128 >> this.zzVS : 1 << this.zzVS);
    }

    public final void zzX2() {
        this.zzVT = (byte) 0;
        this.zzVS = 0;
    }
}

package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzE4 extends zzE6 {
    private float[] zzvK;

    public zzE4(int i) {
        this.zzvK = new float[i];
    }

    public final float get(int i) {
        return this.zzvK[i];
    }

    public final int getCount() {
        return this.zzvK.length;
    }

    public final void zzX(int i, float f) {
        this.zzvK[i] = f;
    }
}

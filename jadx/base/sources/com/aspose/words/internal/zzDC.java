package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzDC {
    private int mLength = 65536;
    private int[][] zzuW = new int[64][];

    public zzDC() {
        for (int i = 0; i < 63; i++) {
            this.zzuW[i] = new int[1024];
        }
        this.zzuW[63] = new int[1024];
    }

    public final int get(int i) {
        return this.zzuW[i >> 10][i & 1023];
    }

    public final void set(int i, int i2) {
        this.zzuW[i >> 10][i & 1023] = i2;
    }
}

package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZNN {
    private int zzYxZ;
    private int zzYy0 = Integer.MIN_VALUE;
    private zzZNO zzZsr;

    public zzZNN(zzZNO zzzno, int i) {
        this.zzZsr = zzzno;
        this.zzYxZ = i;
    }

    public final int getBottom() throws Exception {
        return this.zzZsr.zzZ8R().getBottom() - this.zzYxZ;
    }

    public final int getY() throws Exception {
        return this.zzZsr.zzZ8R().getY() - this.zzYxZ;
    }

    public final void zzBB(int i) {
        this.zzYy0 = i;
    }

    public final boolean zzZ8f() {
        return this.zzYy0 == Integer.MIN_VALUE;
    }

    public final int zzZ8g() {
        return this.zzYy0;
    }

    public final zzZNO zzZXN() {
        return this.zzZsr;
    }
}

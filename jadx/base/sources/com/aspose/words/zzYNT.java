package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYNT implements zzZ9T {
    private long zzXIh;
    private boolean zzXIk;
    private float zzYMC;
    private zzZS8 zzZ50;
    private IWarningCallback zzZG0;
    private float[] zzXIj = {1.0f, 1.0f, 1.0f, 1.0f};
    private float[] zzXIi = {0.0f, 0.0f, 0.0f, 1.0f};

    public zzYNT(zzZS8 zzzs8, float f, boolean z, IWarningCallback iWarningCallback) {
        this.zzXIh = 0L;
        this.zzZ50 = zzzs8;
        this.zzXIh = zzzs8.zzZT();
        this.zzXIk = z;
        this.zzYMC = f;
        if (f < 500000.0f) {
            this.zzYMC = f + 300000.0f;
        }
        this.zzZG0 = iWarningCallback;
    }
}

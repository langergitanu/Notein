package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZIG extends zzZIR {
    private float[] zzZIn;
    private float[] zzZIo;
    private final boolean zzZIp;
    private boolean zzZJ9;

    public zzZIG(int i, int i2) {
        this(i, i2, false);
    }

    @Override // com.aspose.words.internal.zzZIR
    public final float[] zzM(float[] fArr) {
        throw new UnsupportedOperationException();
    }

    public zzZIG(int i, int i2, boolean z) {
        super(i, i2);
        this.zzZIo = new float[i2];
        this.zzZIn = new float[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            this.zzZIo[i3] = 0.0f;
            this.zzZIn[i3] = 1.0f;
        }
        this.zzZJ9 = i == 5 || i == 6;
        this.zzZIp = z;
    }
}

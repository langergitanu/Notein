package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzP2 extends zzJ5 {
    private float zzGO = 0.0f;
    private float zzGN = 0.0f;

    public final float zzNW() {
        return this.zzGN;
    }

    public final float zzNX() {
        return this.zzGO;
    }

    @Override // com.aspose.words.internal.zzJ5
    public boolean zzP(long j, long j2) {
        float fZzO = zzJ6.zzO(j, j2);
        this.zzGN = fZzO;
        this.zzGO += fZzO;
        return super.zzP(j, j2);
    }

    @Override // com.aspose.words.internal.zzJ5
    public boolean zzQ(long j, long j2, long j3, long j4) {
        float fZzO = (float) zzJ6.zzO(j, j2, j3, j4);
        this.zzGN = fZzO;
        this.zzGO += fZzO;
        return super.zzQ(j, j2, j3, j4);
    }
}

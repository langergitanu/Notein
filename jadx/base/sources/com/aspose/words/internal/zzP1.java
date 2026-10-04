package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzP1 extends zzP2 {
    private float zzGM;
    private boolean zzGL = false;
    private long zzGK = 0;

    private zzP1(float f) {
        this.zzGM = f;
    }

    public static long zzZ(zzP5 zzp5, float f) throws Exception {
        zzP1 zzp1 = new zzP1(f);
        zzP4.zzZ(zzp5, zzp1);
        return zzp1.zzGK;
    }

    @Override // com.aspose.words.internal.zzP2, com.aspose.words.internal.zzJ5
    public final boolean zzP(long j, long j2) {
        super.zzP(j, j2);
        if (zzNX() < this.zzGM) {
            return true;
        }
        this.zzGK = zzJ6.zzV(j, j2, zzNW() - (zzNX() - this.zzGM));
        this.zzGL = true;
        return false;
    }

    @Override // com.aspose.words.internal.zzP2, com.aspose.words.internal.zzJ5
    public final boolean zzQ(long j, long j2, long j3, long j4) {
        super.zzQ(j, j2, j3, j4);
        if (zzNX() < this.zzGM) {
            return true;
        }
        this.zzGK = zzJ6.zzZ(j, j2, j3, j4, (zzNW() - (zzNX() - this.zzGM)) / zzNW());
        this.zzGL = true;
        return false;
    }
}

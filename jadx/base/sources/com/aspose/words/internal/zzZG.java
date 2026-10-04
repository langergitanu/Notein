package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public class zzZG extends zzZL implements zzHR, zzHT, zzHU {
    private zzPY zzYr;
    private zzOU zzYs;
    private zzP8 zzYt;
    private zzP8 zzZC;
    private zzP9 zzZD;

    public zzZG() {
        this(new zzP8(), null);
    }

    public final boolean isEmpty() {
        zzOU zzou = this.zzYs;
        boolean z = zzou == null || zzAN.zzf(zzou.getWidth());
        if (!z) {
            z = this.zzYs.zzZ1() == null || this.zzYs.zzZ1().isEmpty();
        }
        if (!z) {
            return z;
        }
        zzPY zzpy = this.zzYr;
        return zzpy == null || zzpy.isEmpty();
    }

    @Override // com.aspose.words.internal.zzZL
    public final zzZL zz1() {
        return zzYZ();
    }

    public final zzZG zzU(zzP8 zzp8) {
        zzZG zzzg = new zzZG(zzp8);
        zzOU zzou = this.zzYs;
        if (zzou != null) {
            zzzg.zzYs = zzou.zzNQ();
        }
        zzPY zzpy = this.zzYr;
        if (zzpy != null) {
            zzzg.zzYr = zzpy.zzPI();
        }
        zzP8 zzp82 = this.zzZC;
        if (zzp82 != null) {
            zzzg.zzZC = zzp82.zzO8();
        }
        zzP9 zzp9 = this.zzZD;
        if (zzp9 != null) {
            zzzg.zzZD = zzp9.zzOh();
        }
        return zzzg;
    }

    @Override // com.aspose.words.internal.zzHR
    public final void zzW(zzP9 zzp9) {
        this.zzZD = zzp9;
    }

    public final void zzX(zzOU zzou) {
        this.zzYs = zzou;
    }

    public final void zzY(zzPY zzpy) {
        this.zzYr = zzpy;
    }

    public final zzZG zzYZ() {
        return zzU(this.zzYt.zzO8());
    }

    @Override // com.aspose.words.internal.zzHT
    public final void zzZ(zzP8 zzp8) {
        this.zzZC = zzp8;
    }

    public final zzP8 zzZ0() {
        return this.zzYt;
    }

    public final zzPY zzZ1() {
        return this.zzYr;
    }

    public final zzOU zzZ2() {
        return this.zzYs;
    }

    @Override // com.aspose.words.internal.zzHU
    public final zzP8 zzZN() {
        return this.zzZC;
    }

    @Override // com.aspose.words.internal.zzHR, com.aspose.words.internal.zzHU
    public final zzP9 zzZO() {
        return this.zzZD;
    }

    public zzZG(zzP8 zzp8) {
        this(zzp8, null);
    }

    public static zzZG zzW(zzZQ4 zzzq4) {
        return new zzZG(zzP8.zzM(zzzq4));
    }

    public final void zzY(zzP9 zzp9) {
        this.zzYt.zzY(zzp9);
    }

    @Override // com.aspose.words.internal.zzZL
    public final void zzZ(zz6 zz6Var) throws Exception {
        zz6Var.zzZ(this);
    }

    public zzZG(zzOU zzou) {
        this(new zzP8(), zzou);
    }

    public static zzZG zzZ(zz0Q zz0q, boolean z, boolean z2) {
        return new zzZG(zzP8.zzY(zz0q, z, z2));
    }

    private zzZG(zzP8 zzp8, zzOU zzou) {
        this.zzYt = zzp8;
        this.zzYs = zzou;
    }

    public static zzZG zzZ(long[] jArr, boolean z, boolean z2) {
        return new zzZG(zzP8.zzY(jArr, z, z2));
    }

    public static zzZG zzZ(zzZQ4 zzzq4, zzOU zzou) {
        return new zzZG(zzP8.zzM(zzzq4), zzou);
    }

    public static zzZG zzZ(long j, long j2) {
        return new zzZG(zzP8.zzT(j, j2));
    }

    public static zzZG zzZ(long j, long j2, zzOU zzou) {
        return new zzZG(zzP8.zzT(j, j2), zzou);
    }

    public static zzZG zzZ(long j, zzOU zzou) {
        zzZG zzzgZzW = zzW(new zzZQ4(Float.intBitsToFloat((int) j) - 1.0f, zzZPY.zzYC(j) - 1.0f, 2.0f, 2.0f));
        zzzgZzW.zzYs = zzou;
        return zzzgZzW;
    }
}

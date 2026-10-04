package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzPB extends zzPG {
    private float zzHg;
    private long zzKj;
    private long zzKm;

    public zzPB(long j, long j2) {
        super(j, j2);
        this.zzKm = j;
        this.zzKj = j2;
        this.zzHg = -1.0f;
    }

    public static boolean zzZ(zzPB zzpb, zzPB zzpb2, long[] jArr, boolean z) {
        return zzPG.zzZ(zzpb, zzpb2, jArr, z) && zzpb.zzp(jArr[0]) && zzpb2.zzp(jArr[0]);
    }

    public final float getLength() {
        if (this.zzHg < 0.0f) {
            this.zzHg = zzJ6.zzO(this.zzKm, this.zzKj);
        }
        return this.zzHg;
    }

    public final long zzL(float f) {
        if (f < 0.0f || f > getLength()) {
            return 0L;
        }
        if (f == 0.0f) {
            return this.zzKm;
        }
        if (zzAN.zzY(f, getLength(), 0.001f)) {
            return this.zzKj;
        }
        long[] jArr = {0};
        zzZ(this.zzKm, f * (((zzOE() > 0.0f ? 1 : (zzOE() == 0.0f ? 0 : -1)) >= 0 && (Float.intBitsToFloat((int) this.zzKm) > Float.intBitsToFloat((int) this.zzKj) ? 1 : (Float.intBitsToFloat((int) this.zzKm) == Float.intBitsToFloat((int) this.zzKj) ? 0 : -1)) > 0) || (((zzOE() > 0.0f ? 1 : (zzOE() == 0.0f ? 0 : -1)) < 0 && (Float.intBitsToFloat((int) this.zzKm) > Float.intBitsToFloat((int) this.zzKj) ? 1 : (Float.intBitsToFloat((int) this.zzKm) == Float.intBitsToFloat((int) this.zzKj) ? 0 : -1)) < 0) || (zzOD() && (zzZPY.zzYC(this.zzKm) > zzZPY.zzYC(this.zzKj) ? 1 : (zzZPY.zzYC(this.zzKm) == zzZPY.zzYC(this.zzKj) ? 0 : -1)) > 0)) ? -1 : 1), jArr);
        return jArr[0];
    }

    public final long zzPW() {
        return this.zzKj;
    }

    public final long zzPX() {
        return this.zzKm;
    }

    public final boolean zzp(long j) {
        if (zzJ6.zzN(this.zzKm, j) || zzJ6.zzN(this.zzKj, j)) {
            return true;
        }
        if (!zzq(j) || zzJ6.zzO(this.zzKm, j) > getLength()) {
            return false;
        }
        if (zzOD()) {
            return (((zzZPY.zzYC(this.zzKj) - zzZPY.zzYC(this.zzKm)) > 0.0f ? 1 : ((zzZPY.zzYC(this.zzKj) - zzZPY.zzYC(this.zzKm)) == 0.0f ? 0 : -1)) > 0) == (((zzZPY.zzYC(j) - zzZPY.zzYC(this.zzKm)) > 0.0f ? 1 : ((zzZPY.zzYC(j) - zzZPY.zzYC(this.zzKm)) == 0.0f ? 0 : -1)) > 0);
        }
        return (((Float.intBitsToFloat((int) this.zzKj) - Float.intBitsToFloat((int) this.zzKm)) > 0.0f ? 1 : ((Float.intBitsToFloat((int) this.zzKj) - Float.intBitsToFloat((int) this.zzKm)) == 0.0f ? 0 : -1)) > 0) == (((Float.intBitsToFloat((int) j) - Float.intBitsToFloat((int) this.zzKm)) > 0.0f ? 1 : ((Float.intBitsToFloat((int) j) - Float.intBitsToFloat((int) this.zzKm)) == 0.0f ? 0 : -1)) > 0);
    }

    private static boolean zzZ(zzPB zzpb, zzPB zzpb2, long[] jArr) {
        return zzPG.zzY(zzpb, zzpb2, jArr) && zzpb.zzp(jArr[0]) && zzpb2.zzp(jArr[0]);
    }

    public static boolean zzZ(zzPB zzpb, zzPB zzpb2) {
        return zzZ(zzpb, zzpb2, new long[]{0});
    }
}

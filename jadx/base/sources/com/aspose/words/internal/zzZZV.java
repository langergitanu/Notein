package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzZZV {
    private long zzKj;
    private long zzKm;
    private long zzdr;
    private long zzds;
    private long zzdt;

    public zzZZV(zzOQ zzoq, int i) {
        this.zzKm = 0L;
        this.zzdt = 0L;
        this.zzKj = 0L;
        this.zzds = 0L;
        this.zzdr = 0L;
        this.zzKm = zzoq.zzYd(i);
        this.zzdt = zzoq.zzXT(i);
        this.zzKj = zzoq.zzYa(i);
        this.zzds = zzZPY.zzG(zzZD(true), zzZD(false));
        this.zzdr = zzZPY.zzG(zzZC(true), zzZC(false));
    }

    private float zzY(float f, boolean z) {
        long j = this.zzds;
        float fIntBitsToFloat = z ? Float.intBitsToFloat((int) j) : zzZPY.zzYC(j);
        long j2 = this.zzdr;
        float fIntBitsToFloat2 = z ? Float.intBitsToFloat((int) j2) : zzZPY.zzYC(j2);
        long j3 = this.zzKm;
        return OooOO0.OooO0O0.OooO00o(f, fIntBitsToFloat2, zzAN.zzg(f) * fIntBitsToFloat, z ? Float.intBitsToFloat((int) j3) : zzZPY.zzYC(j3));
    }

    private float zzZC(boolean z) {
        long j = this.zzKm;
        float fIntBitsToFloat = z ? Float.intBitsToFloat((int) j) : zzZPY.zzYC(j);
        long j2 = this.zzdt;
        return ((z ? Float.intBitsToFloat((int) j2) : zzZPY.zzYC(j2)) * 2.0f) + (fIntBitsToFloat * (-2.0f));
    }

    private float zzZD(boolean z) {
        long j = this.zzKm;
        float fIntBitsToFloat = z ? Float.intBitsToFloat((int) j) : zzZPY.zzYC(j);
        long j2 = this.zzdt;
        float fIntBitsToFloat2 = z ? Float.intBitsToFloat((int) j2) : zzZPY.zzYC(j2);
        long j3 = this.zzKj;
        return (fIntBitsToFloat - (fIntBitsToFloat2 * 2.0f)) + (z ? Float.intBitsToFloat((int) j3) : zzZPY.zzYC(j3));
    }

    public final long zzZS(float f) {
        if (f < 0.0f || f > 1.0f) {
            return 0L;
        }
        return f == 0.0f ? this.zzKm : f == 1.0f ? this.zzKj : zzZPY.zzG(zzY(f, true), zzY(f, false));
    }

    public final long zzrS() {
        return this.zzKm;
    }

    public final long zzrT() {
        return this.zzdr;
    }

    public final long zzrU() {
        return this.zzds;
    }
}

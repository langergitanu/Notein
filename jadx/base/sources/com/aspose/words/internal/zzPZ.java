package com.aspose.words.internal;

import Oooo0o0.C21009OooOooO;

/* JADX INFO: loaded from: classes5.dex */
public class zzPZ extends zzOW {
    private long zzKj;
    private long zzKk;
    private long zzKl;
    private long zzKm;

    public zzPZ(zzQ2 zzq2, int i) {
        zzZ(zzq2, i);
    }

    private static float zzY(float f, float f2) {
        return C21009OooOooO.OooO00o(f2, 2.0f, f, 3.0f);
    }

    private void zzZ(zzQ2 zzq2, int i) {
        zzR(zzq2.zzYd(i), zzq2.zzYc(i), zzq2.zzYb(i), zzq2.zzYa(i));
    }

    public final long zzPK() {
        return this.zzKk;
    }

    public final long zzPL() {
        return this.zzKl;
    }

    @Override // com.aspose.words.internal.zzOW
    public final zzOW zzPM() {
        return new zzPZ(this);
    }

    @Override // com.aspose.words.internal.zzOW
    public final void zzPN() {
        long j = this.zzKm;
        this.zzKm = this.zzKj;
        this.zzKj = j;
        long j2 = this.zzKl;
        this.zzKk = j2;
        this.zzKl = j2;
    }

    public final double zzPO() {
        return zzJ6.zzO(this.zzKm, this.zzKl, this.zzKk, this.zzKj);
    }

    public final zzOQ zzPP() {
        return zzQ0.zzT(this.zzKm, this.zzKl, this.zzKk, this.zzKj);
    }

    @Override // com.aspose.words.internal.zzOW
    public final long zzPQ() {
        return this.zzKj;
    }

    @Override // com.aspose.words.internal.zzOW
    public final long zzPR() {
        return this.zzKm;
    }

    public final long zzPW() {
        return this.zzKj;
    }

    public final long zzPX() {
        return this.zzKm;
    }

    public final void zzR(long j, long j2, long j3, long j4) {
        this.zzKm = j;
        this.zzKl = j2;
        this.zzKk = j3;
        this.zzKj = j4;
    }

    public final double zzT(float f) {
        return zzJ6.zzY(this.zzKm, this.zzKl, this.zzKk, this.zzKj, f);
    }

    public final long zzU(float f) {
        return zzJ6.zzZ(this.zzKm, this.zzKl, this.zzKk, this.zzKj, f);
    }

    public final void zzv(long j) {
        this.zzKj = j;
    }

    public final void zzw(long j) {
        this.zzKk = j;
    }

    public final void zzx(long j) {
        this.zzKl = j;
    }

    public final void zzy(long j) {
        this.zzKm = j;
    }

    public final void zzY(long j, long j2, long j3) {
        this.zzKm = j;
        int i = (int) j2;
        this.zzKl = zzZPY.zzG(zzY(Float.intBitsToFloat((int) j), Float.intBitsToFloat(i)), zzY(zzZPY.zzYC(j), zzZPY.zzYC(j2)));
        this.zzKk = zzZPY.zzG(zzY(Float.intBitsToFloat((int) j3), Float.intBitsToFloat(i)), zzY(zzZPY.zzYC(j3), zzZPY.zzYC(j2)));
        this.zzKj = j3;
    }

    public zzPZ(zzOQ zzoq, int i) {
        zzZ(zzoq, i);
    }

    public zzPZ(long j, long j2, long j3, long j4) {
        zzR(j, j2, j3, j4);
    }

    public final void zzZ(zzOQ zzoq, int i) {
        zzY(zzoq.zzYd(i), zzoq.zzXT(i), zzoq.zzYa(i));
    }

    public zzPZ(long[] jArr) {
        this(jArr[0], jArr[1], jArr[2], jArr[3]);
    }

    @Override // com.aspose.words.internal.zzOW
    public final boolean zzZ(zzH2 zzh2) throws Exception {
        return zzh2.zzZ(this);
    }

    public zzPZ(long j, long j2, long j3) {
        zzY(j, j2, j3);
    }

    @Override // com.aspose.words.internal.zzOW
    public final boolean zzZ(zzOW zzow) {
        zzPZ zzpz;
        if (zzZKO.zzA(this, zzow)) {
            return true;
        }
        return !zzZKO.zzA(null, zzow) && (zzpz = (zzPZ) zzZKW.zzZ(zzow, zzPZ.class)) != null && zzJ6.zzN(zzpz.zzKm, this.zzKm) && zzJ6.zzN(zzpz.zzKj, this.zzKj) && zzJ6.zzN(zzpz.zzKl, this.zzKl) && zzJ6.zzN(zzpz.zzKk, this.zzKk);
    }

    private zzPZ(zzPZ zzpz) {
        this(zzpz.zzKm, zzpz.zzKl, zzpz.zzKk, zzpz.zzKj);
    }

    @Override // com.aspose.words.internal.zzOW
    public final void zzY(zzP9 zzp9) {
        this.zzKm = zzp9.zzR(this.zzKm);
        this.zzKl = zzp9.zzR(this.zzKl);
        this.zzKk = zzp9.zzR(this.zzKk);
        this.zzKj = zzp9.zzR(this.zzKj);
    }
}

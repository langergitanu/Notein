package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz96 extends zz99 {
    private float zzq9;
    private float zzqa;
    private long zzqj;

    public zz96(long j, long j2, long j3, float f, float f2) {
        this.zzqp = 8;
        this.zzqn = j3;
        this.zzql = j3;
        this.zzqo = j2;
        this.zzqm = j2;
        this.zzqj = j;
        this.zzqa = f;
        this.zzq9 = f2;
    }

    private void zzX(zz82 zz82Var) {
        this.zzql = zz82Var.zzZw(this.zzql);
        zzZz(this.zzqn);
    }

    private void zzZz(long j) {
        long jZzG;
        int i = (int) j;
        float fAbs = Math.abs(Float.intBitsToFloat(i) / zzZPW.zzYz(j));
        float fAbs2 = Math.abs(Float.intBitsToFloat((int) this.zzql) / zzZPW.zzYz(this.zzql));
        if (fAbs2 < fAbs) {
            jZzG = zzZPW.zzG(Float.intBitsToFloat(i), (Math.abs(Float.intBitsToFloat(i)) * zzZKQ.zzZN(zzZPW.zzYz(j))) / fAbs2);
        } else {
            jZzG = zzZPW.zzG(Math.abs(zzZPW.zzYz(j)) * zzZKQ.zzZN(Float.intBitsToFloat(i)) * fAbs2, zzZPW.zzYz(j));
        }
        this.zzqn = jZzG;
    }

    private void zze(float f) {
        this.zzql = zzZPW.zzG(Float.intBitsToFloat((int) this.zzqj), -zzZPW.zzYz(this.zzqj));
        this.zzqn = zzZPW.zzG(Float.intBitsToFloat((int) this.zzqj) / f, zzZPW.zzYz(this.zzqj) / f);
        zzzj();
    }

    private void zzzj() {
        this.zzql = zzZPW.zzG(Float.intBitsToFloat((int) this.zzql) * this.zzqa, zzZPW.zzYz(this.zzql) * this.zzq9);
    }

    @Override // com.aspose.words.internal.zz99
    public final void zzY(zz82 zz82Var) {
        switch (this.zzqp) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                break;
            case 7:
                zzX(zz82Var);
                break;
            case 8:
                this.zzql = zz82Var.zzZw(this.zzql);
                break;
            default:
                throw new IllegalStateException("Unexpected map mode.");
        }
        onChanged();
    }

    @Override // com.aspose.words.internal.zz99
    public final void zzZD(long j) {
    }

    @Override // com.aspose.words.internal.zz99
    public final void zzZE(long j) {
        this.zzqo = j;
        onChanged();
    }

    @Override // com.aspose.words.internal.zz99
    public final void zzZF(long j) {
    }

    @Override // com.aspose.words.internal.zz99
    public final void zzZG(long j) {
        switch (this.zzqp) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                break;
            case 7:
                zzZz(j);
                break;
            case 8:
                this.zzqn = j;
                break;
            default:
                throw new IllegalStateException("Unexpected map mode.");
        }
        onChanged();
    }

    @Override // com.aspose.words.internal.zz99
    public final void zzzr() {
        zze(0.28346458f);
    }

    @Override // com.aspose.words.internal.zz99
    public final void zzzs() {
        this.zzql = zzZPW.zzG(1.0f, 1.0f);
        this.zzqn = zzZPW.zzG(1.0f, 1.0f);
        zzzj();
    }

    @Override // com.aspose.words.internal.zz99
    public final void zzzt() {
        zze(0.28346458f);
    }

    @Override // com.aspose.words.internal.zz99
    public final void zzzu() {
        zze(0.028346457f);
    }

    @Override // com.aspose.words.internal.zz99
    public final void zzzv() {
        zze(0.71999997f);
    }

    @Override // com.aspose.words.internal.zz99
    public final void zzzw() {
        zze(0.072000004f);
    }

    @Override // com.aspose.words.internal.zz99
    public final void zzzx() {
        zze(0.05f);
    }
}

package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz98 extends zz99 {
    private static long zzqg = zzZPW.zzG(1.0f, 1.0f);
    private long zzqh;
    private long zzqi;
    private long zzqj;

    public zz98(long j, long j2, long j3) {
        this.zzqj = j;
        this.zzqi = j2;
        this.zzqh = j3;
        this.zzqp = 1;
        long j4 = zzqg;
        this.zzql = j4;
        this.zzqn = j4;
    }

    private static float zzZA(long j) {
        return Math.abs(Float.intBitsToFloat((int) j) / zzZPW.zzYz(j));
    }

    private void zzZy(long j) {
        float fZzZA = zzZA(this.zzql);
        this.zzql = j;
        zzd(fZzZA);
    }

    private void zzZz(long j) {
        float fZzZA = (zzZA(this.zzql) * zzZA(j)) / zzZA(this.zzqn);
        this.zzqn = j;
        zzd(fZzZA);
    }

    private void zzd(float f) {
        if (Math.abs(zzZPW.zzYz(this.zzql)) * f < Math.abs(Float.intBitsToFloat((int) this.zzql))) {
            this.zzql = zzZPW.zzG(zzAN.zzZG(Math.abs(zzZPW.zzYz(this.zzql)) * zzZKQ.zzZN(Float.intBitsToFloat((int) this.zzql)) * f), zzZPW.zzYz(this.zzql));
        } else {
            this.zzql = zzZPW.zzG(Float.intBitsToFloat((int) this.zzql), zzAN.zzZG((Math.abs(Float.intBitsToFloat((int) this.zzql)) * zzZKQ.zzZN(zzZPW.zzYz(this.zzql))) / f));
        }
    }

    private void zze(float f) {
        long j = this.zzqj;
        this.zzql = zzZPW.zzG((int) j, -((int) (j >>> 32)));
        long j2 = this.zzqi;
        this.zzqn = zzZPW.zzG(zzAN.zzZG(((int) j2) / f), zzAN.zzZG(((int) (j2 >>> 32)) / f));
    }

    @Override // com.aspose.words.internal.zz99
    public final void zzZD(long j) {
        this.zzqm = j;
        onChanged();
    }

    @Override // com.aspose.words.internal.zz99
    public final void zzZE(long j) {
        this.zzqo = j;
        onChanged();
    }

    @Override // com.aspose.words.internal.zz99
    public final void zzZF(long j) {
        switch (this.zzqp) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                break;
            case 7:
                zzZy(j);
                break;
            case 8:
                this.zzql = j;
                break;
            default:
                throw new IllegalStateException("Unexpected map mode.");
        }
        onChanged();
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
        long j = this.zzqi;
        this.zzqn = zzZPW.zzG(((int) j) * 10, ((int) (j >>> 32)) * 10);
        float fZzZA = (zzZA(zzZPX.zzYA(this.zzqj)) / zzZA(zzZPX.zzYA(this.zzqh))) * zzZA(zzZPX.zzYA(this.zzqi));
        long j2 = this.zzqj;
        this.zzql = zzZPW.zzG((int) j2, -((int) (j2 >>> 32)));
        zzd(fZzZA);
    }

    @Override // com.aspose.words.internal.zz99
    public final void zzzs() {
        long j = zzqg;
        this.zzql = j;
        this.zzqn = j;
    }

    @Override // com.aspose.words.internal.zz99
    public final void zzzt() {
        zze(0.1f);
    }

    @Override // com.aspose.words.internal.zz99
    public final void zzzu() {
        zze(0.01f);
    }

    @Override // com.aspose.words.internal.zz99
    public final void zzzv() {
        zze(0.254f);
    }

    @Override // com.aspose.words.internal.zz99
    public final void zzzw() {
        zze(0.0254f);
    }

    @Override // com.aspose.words.internal.zz99
    public final void zzzx() {
        zze(0.017638888f);
    }
}

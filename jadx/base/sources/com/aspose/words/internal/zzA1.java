package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzA1 {
    private long zzr3;
    private zz8T zzr4;
    private boolean zzrf;
    private zzH6 zzrj;

    public zzA1(zz8T zz8t, zzH6 zzh6, boolean z, long j) {
        this.zzr4 = zz8t;
        this.zzrj = zzh6;
        this.zzrf = z;
        this.zzr3 = j;
        if (zzZPX.zzYF(j)) {
            this.zzr3 = this.zzr4.zzyQ().getSize();
        }
    }

    public final boolean getEmulateRasterOperations() {
        return this.zzrf;
    }

    public final long zzAc() {
        return this.zzr3;
    }

    public final zz8T zzAg() {
        return this.zzr4;
    }

    public final zzH6 zzAt() {
        return this.zzrj;
    }

    public final zzF4 zzI() {
        return this.zzrj.zzHq();
    }

    public final zzGQ zzMk() {
        return this.zzrj.zzFG();
    }

    public zzA1(zz8T zz8t, zzA1 zza1) {
        this(zz8t, zza1.zzrj, zza1.zzrf, zza1.zzr3);
    }
}

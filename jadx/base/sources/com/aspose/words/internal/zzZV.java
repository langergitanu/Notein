package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzZV extends zzZL {
    private static zzPV zzYY = zzPV.zzI5;
    private String mName;
    private zzPV zzYZ;
    private zzPV zzZ0;
    private boolean zzZ1 = true;
    private zzZQ4 zzZL;

    public zzZV(zzZQ4 zzzq4, String str, zzPV zzpv, zzPV zzpv2) {
        this.zzZL = zzzq4;
        this.mName = str;
        this.zzYZ = zzpv;
        this.zzZ0 = zzpv2.isEmpty() ? zzYY : zzpv2;
    }

    public final String getName() {
        return this.mName;
    }

    public final boolean isEnabled() {
        return this.zzZ1;
    }

    public final void zzN(boolean z) {
        this.zzZ1 = z;
    }

    public final void zzX(zzZQ4 zzzq4) {
        this.zzZL = zzzq4;
    }

    public final long zzZT() {
        return zzZPY.zzG(this.zzZL.zzZm(), this.zzZL.zzZn());
    }

    public final zzPV zzZt() {
        return this.zzZ0;
    }

    public final zzPV zzZu() {
        return this.zzYZ;
    }

    public final zzZQ4 zzZv() {
        return this.zzZL;
    }
}

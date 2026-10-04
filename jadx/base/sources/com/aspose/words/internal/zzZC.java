package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZC extends zzZV {
    private zzPM zzYX;
    private int zzYa;
    private String zzYb;
    private float zzYc;
    private float zzYd;

    public zzZC(String str, zzZQ4 zzzq4, zzPM zzpm, float f, float f2, String str2, zzPV zzpv, int i) {
        super(zzzq4, str, zzpv, zzPV.zzHZ);
        this.zzYX = zzpm;
        this.zzYd = f;
        this.zzYc = f2;
        this.zzYb = str2;
        this.zzYa = i;
    }

    public final int getMaxLength() {
        return this.zzYa;
    }

    public final String zzYR() {
        return this.zzYb;
    }

    public final float zzYS() {
        return this.zzYc;
    }

    public final float zzYT() {
        return this.zzYd;
    }

    @Override // com.aspose.words.internal.zzZL
    public final void zzZ(zz6 zz6Var) throws Exception {
        zz6Var.zzZ(this);
    }

    public final zzPM zzZr() {
        return this.zzYX;
    }
}

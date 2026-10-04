package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzIL {
    private float zzZhB;
    private zzII zzZhC;

    public zzIL(long j, int i, int i2, float f) {
        this.zzZhB = f;
        zzII zzii = new zzII(j, 1.0f, i, i2, f);
        this.zzZhC = zzii;
        zzii.zzZRz();
    }

    public abstract void zzZ(zzIE zzie);

    public final void zzZ(zzII zzii) {
        this.zzZhC = zzii;
    }

    public final boolean zzZRC() {
        return this.zzZhC.getScale() < 1.0f;
    }

    public final float zzZRD() {
        return this.zzZhB;
    }

    public final zzII zzZRE() {
        return this.zzZhC;
    }
}

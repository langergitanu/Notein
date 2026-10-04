package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzPJ {
    private zzTM zzHr;
    private zzPT zzHs;
    private float zzHt = -1.0f;
    private zzPU[] zzZ5;

    public final float getThreshold() {
        return this.zzHt;
    }

    public final void setThreshold(float f) {
        this.zzHt = f;
    }

    public final zzTM zzOH() {
        return this.zzHr;
    }

    public final zzPT zzOI() {
        if (this.zzHs == null) {
            this.zzHs = new zzPT();
        }
        return this.zzHs;
    }

    public final zzPU[] zzOJ() {
        if (this.zzZ5 == null) {
            this.zzZ5 = new zzPU[0];
        }
        return this.zzZ5;
    }

    public final void zzY(zzTM zztm) {
        this.zzHr = zztm;
    }

    public final void zzZ(zzPU[] zzpuArr) {
        if (zzpuArr == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: colorMaps");
        }
        if (zzpuArr.length == 0) {
            return;
        }
        if (zzOJ().length == 0) {
            this.zzZ5 = zzpuArr;
            return;
        }
        zzPU[] zzpuArr2 = new zzPU[zzOJ().length + zzpuArr.length];
        System.arraycopy(zzOJ(), 0, zzpuArr2, 0, zzOJ().length);
        System.arraycopy(zzpuArr, 0, zzpuArr2, zzOJ().length, zzpuArr.length);
        this.zzZ5 = zzpuArr2;
    }

    public final void zzZ(zzPT zzpt) {
        if (zzpt != null) {
            this.zzHs = zzPT.zzZ(zzOI(), zzpt);
            return;
        }
        throw new NullPointerException("Value cannot be null.\r\nParameter name: colorMatrix");
    }
}

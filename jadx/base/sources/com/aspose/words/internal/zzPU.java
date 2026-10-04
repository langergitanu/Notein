package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzPU {
    private zzPV zzZ6;
    private zzPV zzZ7;

    public zzPU(zzPV zzpv, zzPV zzpv2) {
        zzR(zzpv);
        zzQ(zzpv2);
    }

    private void zzQ(zzPV zzpv) {
        if (zzpv == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: value");
        }
        this.zzZ6 = zzpv;
    }

    private void zzR(zzPV zzpv) {
        if (zzpv == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: value");
        }
        this.zzZ7 = zzpv;
    }

    public final zzPV zzPx() {
        return this.zzZ6;
    }

    public final zzPV zzPy() {
        return this.zzZ7;
    }
}

package com.aspose.words;

import java.math.BigDecimal;

/* JADX INFO: loaded from: classes6.dex */
final class zzYYZ {
    private long zzXYZ;
    private long zzXZ0;

    public zzYYZ() {
    }

    public final void zzXy(long j) {
        this.zzXYZ = j - this.zzXZ0;
        zzYZ6.zzYDx().zzZ(new BigDecimal(this.zzXYZ / 1048576.0d));
    }

    public final int zzYDt() {
        return ((int) (this.zzXYZ / 2.097152E7d)) + 1;
    }

    public zzYYZ(long j) {
        this.zzXZ0 = j;
    }
}

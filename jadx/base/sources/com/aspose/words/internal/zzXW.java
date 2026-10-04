package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzXW extends zzXX implements zzZOY {
    private zzZOX zzW6;

    public zzXW(zzZOP zzzop, boolean z) throws Exception {
        super(z);
        this.zzW6 = new zzZOX(zzzop);
    }

    private boolean zzWZ() {
        return zzXU.zzZ(this.zzVT, zzX1());
    }

    @Override // com.aspose.words.internal.zzZOY
    public final void dispose() throws Exception {
        this.zzW6.close();
    }

    public final boolean zzX0() throws Exception {
        if (this.zzVS == 0) {
            this.zzVT = this.zzW6.zzX6();
        }
        boolean zZzWZ = zzWZ();
        int i = this.zzVS + 1;
        this.zzVS = i;
        if (i == 8) {
            this.zzVS = 0;
        }
        return zZzWZ;
    }

    public final long zza(int i) throws Exception {
        if (!this.zzVU) {
            throw new UnsupportedOperationException("Reading LSB ordered values is not supported.");
        }
        if (i < 0 || i > 63) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: length");
        }
        if (i == 0) {
            return 0L;
        }
        long j = 1 << (i - 1);
        long j2 = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j2 += zzX0() ? j : 0L;
            j >>= 1;
        }
        return j2;
    }
}

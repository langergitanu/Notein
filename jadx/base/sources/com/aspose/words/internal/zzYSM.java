package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYSM {
    private int zzWI2;
    private int zzWkM;
    private byte[] zzWoA;

    public zzYSM(byte[] bArr, int i) {
        this(bArr, i, -1);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzYSM)) {
            return false;
        }
        zzYSM zzysm = (zzYSM) obj;
        if (zzysm.zzWI2 != this.zzWI2) {
            return false;
        }
        return zzYGU.zzp(this.zzWoA, zzysm.zzWoA);
    }

    public final byte[] getSeed() {
        return this.zzWoA;
    }

    public final int hashCode() {
        return this.zzWI2 ^ zzYGU.hashCode(this.zzWoA);
    }

    public final int zzXGn() {
        return this.zzWkM;
    }

    public final int zzXGp() {
        return this.zzWI2;
    }

    public zzYSM(byte[] bArr, int i, int i2) {
        this.zzWoA = bArr;
        this.zzWI2 = i;
        this.zzWkM = i2;
    }
}

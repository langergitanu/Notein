package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ35 {
    private int zzWI2;
    private int zzWkM;
    private byte[] zzWoA;

    public zzZ35(byte[] bArr, int i) {
        this(bArr, i, -1);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzZ35)) {
            return false;
        }
        zzZ35 zzz35 = (zzZ35) obj;
        if (zzz35.zzWI2 == this.zzWI2 && zzz35.zzWkM == this.zzWkM) {
            return zzYGU.zzp(this.zzWoA, zzz35.zzWoA);
        }
        return false;
    }

    public final byte[] getSeed() {
        return zzYGU.zzVI(this.zzWoA);
    }

    public final int hashCode() {
        return (this.zzWkM * 37) + (zzYGU.hashCode(this.zzWoA) * 37) + this.zzWI2;
    }

    public final int zzXGn() {
        return this.zzWkM;
    }

    public final int zzXGp() {
        return this.zzWI2;
    }

    public zzZ35(byte[] bArr, int i, int i2) {
        this.zzWoA = zzYGU.zzVI(bArr);
        this.zzWI2 = i;
        this.zzWkM = i2;
    }
}

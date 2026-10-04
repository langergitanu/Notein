package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ37 {
    private int zzWI2;
    private int zzWkM;
    private byte[] zzWoA;

    public zzZ37(byte[] bArr, int i) {
        this(bArr, i, -1);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzZ37)) {
            return false;
        }
        zzZ37 zzz37 = (zzZ37) obj;
        if (zzz37.zzWI2 == this.zzWI2 && zzz37.zzWkM == this.zzWkM) {
            return zzYGU.zzp(this.zzWoA, zzz37.zzWoA);
        }
        return false;
    }

    public final byte[] getSeed() {
        return zzYGU.zzVI(this.zzWoA);
    }

    public final int hashCode() {
        return (this.zzWkM * 37) + (zzYGU.hashCode(this.zzWoA) * 37) + this.zzWI2;
    }

    public final int zzXGp() {
        return this.zzWI2;
    }

    public zzZ37(byte[] bArr, int i, int i2) {
        this.zzWoA = zzYGU.zzVI(bArr);
        this.zzWI2 = i;
        this.zzWkM = i2;
    }
}

package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYSB implements zzYUY {
    private final byte[] zzVXR;
    private final int zzWcg;
    private final boolean zzWci;
    private final byte[] zzWcj;
    private final int zzWgn;

    private zzYSB(int i, byte[] bArr, byte[] bArr2, int i2) {
        if (bArr == null) {
            throw new IllegalArgumentException("A KDF requires Ki (a seed) as input");
        }
        this.zzWcg = 0;
        this.zzVXR = zzYGU.zzVI(bArr);
        if (bArr2 == null) {
            this.zzWcj = new byte[0];
        } else {
            this.zzWcj = zzYGU.zzVI(bArr2);
        }
        this.zzWgn = 8;
        this.zzWci = true;
    }

    public static zzYSB zzv(byte[] bArr, byte[] bArr2) {
        return new zzYSB(0, bArr, bArr2, 8);
    }

    public final int zzPC() {
        return this.zzWgn;
    }

    public final byte[] zzXC8() {
        return zzYGU.zzVI(this.zzWcj);
    }

    public final boolean zzXC9() {
        return this.zzWci;
    }

    public final int zzXCa() {
        return this.zzWcg;
    }

    public final byte[] zzXCd() {
        return this.zzVXR;
    }
}

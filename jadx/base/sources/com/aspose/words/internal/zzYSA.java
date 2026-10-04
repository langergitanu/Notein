package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYSA implements zzYUY {

    /* JADX INFO: renamed from: iv */
    private final byte[] f51259iv;
    private final byte[] zzVXR;
    private final int zzWcg;
    private final boolean zzWci;
    private final byte[] zzWcj;
    private final int zzWgn;

    private zzYSA(int i, byte[] bArr, byte[] bArr2, byte[] bArr3, int i2) {
        if (bArr == null) {
            throw new IllegalArgumentException("A KDF requires Ki (a seed) as input");
        }
        this.zzWcg = 2;
        this.zzVXR = zzYGU.zzVI(bArr);
        if (bArr3 == null) {
            this.zzWcj = new byte[0];
        } else {
            this.zzWcj = zzYGU.zzVI(bArr3);
        }
        this.zzWgn = 8;
        if (bArr2 == null) {
            this.f51259iv = new byte[0];
        } else {
            this.f51259iv = zzYGU.zzVI(bArr2);
        }
        this.zzWci = true;
    }

    public static zzYSA zzX(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return new zzYSA(2, bArr, bArr2, bArr3, 8);
    }

    public final byte[] getIV() {
        return this.f51259iv;
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

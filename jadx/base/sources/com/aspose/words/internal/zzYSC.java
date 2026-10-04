package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYSC implements zzYUY {
    private byte[] zzVXP;
    private byte[] zzVXQ;
    private byte[] zzVXR;
    private int zzWgn;

    public zzYSC(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr == null) {
            throw new IllegalArgumentException("A KDF requires Ki (a seed) as input");
        }
        this.zzVXR = zzYGU.zzVI(bArr);
        if (bArr2 == null) {
            this.zzVXQ = new byte[0];
        } else {
            this.zzVXQ = zzYGU.zzVI(bArr2);
        }
        if (bArr3 == null) {
            this.zzVXP = new byte[0];
        } else {
            this.zzVXP = zzYGU.zzVI(bArr3);
        }
        this.zzWgn = 8;
    }

    public final int zzPC() {
        return this.zzWgn;
    }

    public final byte[] zzXCb() {
        return zzYGU.zzVI(this.zzVXP);
    }

    public final byte[] zzXCc() {
        return zzYGU.zzVI(this.zzVXQ);
    }

    public final byte[] zzXCd() {
        return this.zzVXR;
    }
}

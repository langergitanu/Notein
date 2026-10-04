package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzOT {
    private int zzGg;
    private boolean zzGh;
    private byte[] zzGi;
    private byte[] zzGj;
    private int zzJ;
    private zzPV[] zzL;

    public zzOT(byte[] bArr, byte[] bArr2, boolean z, int i, int i2) {
        this.zzGj = bArr;
        this.zzGi = bArr2;
        this.zzGh = z;
        this.zzGg = i;
        if (i == 1 && i2 != 1 && i2 != 4 && i2 != 8) {
            throw new IllegalArgumentException("Wrong bitsPerComponent value with indexed color model");
        }
        this.zzJ = i2;
        this.zzL = null;
    }

    private zzOT zzNx() {
        int i = 8 / this.zzJ;
        byte[] bArr = new byte[this.zzGj.length * i * 4];
        int i2 = 0;
        for (int i3 = 0; i3 < this.zzGj.length; i3++) {
            for (int i4 = 0; i4 < i; i4++) {
                zzPV zzpvZzq = zzq(i3, i4);
                zzZ((byte) zzpvZzq.zzPC(), (byte) zzpvZzq.zzPB(), (byte) zzpvZzq.zzPA(), bArr, i2);
                i2 += 4;
            }
        }
        return new zzOT(bArr, this.zzGi, this.zzGh, 3, 8);
    }

    private zzOT zzNy() {
        byte[] bArr = new byte[(this.zzGj.length / 3) * 4];
        int i = 0;
        while (true) {
            byte[] bArr2 = this.zzGj;
            if (i >= bArr2.length) {
                return new zzOT(bArr, this.zzGi, this.zzGh, 3, 8);
            }
            zzZ(bArr2[i], bArr2[i + 1], bArr2[i + 2], bArr, (i / 3) * 4);
            i += 3;
        }
    }

    private static void zzZ(byte b, byte b2, byte b3, byte[] bArr, int i) {
        byte[] bArrZzZ = zzPS.zzZ(b, b2, b3);
        bArr[i] = bArrZzZ[0];
        bArr[i + 1] = bArrZzZ[1];
        bArr[i + 2] = bArrZzZ[2];
        bArr[i + 3] = bArrZzZ[3];
    }

    private zzPV zzq(int i, int i2) {
        return this.zzL[zzPS.zzY(this.zzGj[i], i2, this.zzJ)];
    }

    public final boolean zzNA() {
        int i = this.zzGg;
        return i == 0 || i == 1 || i == 3;
    }

    public final int zzNB() {
        return this.zzGg;
    }

    public final void zzNC() {
        this.zzGh = false;
    }

    public final boolean zzND() {
        return this.zzGh;
    }

    public final byte[] zzNE() {
        return this.zzGi;
    }

    public final byte[] zzNF() {
        return this.zzGj;
    }

    public final zzOT zzNz() {
        int i = this.zzGg;
        return i == 0 ? zzNy() : i == 1 ? zzNx() : this;
    }

    public final int zzO() {
        return this.zzJ;
    }

    public final zzPV[] zzS() {
        return this.zzL;
    }

    public final void zzn(byte[] bArr) {
        this.zzGi = bArr;
    }
}

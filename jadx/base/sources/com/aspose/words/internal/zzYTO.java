package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYTO implements zzYTS {
    private boolean zzVYO;
    private byte[] zzVYP;
    private byte[] zzVYQ;
    private byte[] zzVYR;
    private zzYTG zzVYS;
    private byte[] zzVYX;
    private byte[] zzVYZ;
    private zzYUR zzVZk;
    private int zzW6m;
    private int zzW6n;
    private boolean zzWkw;
    private int zzZNm;

    public zzYTO(zzYV8 zzyv8) {
        this.zzZNm = zzyv8.getBlockSize();
        zzYTX zzytx = new zzYTX(zzyv8);
        this.zzVZk = zzytx;
        this.zzVYX = new byte[this.zzZNm];
        this.zzVYQ = new byte[zzytx.zzXDn()];
        this.zzVYR = new byte[this.zzVZk.zzXDn()];
        this.zzVYS = new zzYTG(zzyv8);
    }

    private void zzOG(boolean z) {
        this.zzVYS.reset();
        this.zzVZk.reset();
        this.zzW6m = 0;
        zzYGU.fill(this.zzVYP, (byte) 0);
        if (z) {
            zzYGU.fill(this.zzVYX, (byte) 0);
        }
        int i = this.zzZNm;
        byte[] bArr = new byte[i];
        bArr[i - 1] = 1;
        this.zzVZk.update(bArr, 0, i);
        this.zzVYO = false;
        byte[] bArr2 = this.zzVYZ;
        if (bArr2 != null) {
            zzq(bArr2, 0, bArr2.length);
        }
    }

    private void zzXCC() {
        byte[] bArr = new byte[this.zzZNm];
        int i = 0;
        this.zzVZk.doFinal(bArr, 0);
        while (true) {
            byte[] bArr2 = this.zzVYX;
            if (i >= bArr2.length) {
                return;
            }
            bArr2[i] = (byte) ((this.zzVYR[i] ^ this.zzVYQ[i]) ^ bArr[i]);
            i++;
        }
    }

    private void zzXCD() {
        if (this.zzVYO) {
            return;
        }
        this.zzVYO = true;
        this.zzVZk.doFinal(this.zzVYQ, 0);
        int i = this.zzZNm;
        byte[] bArr = new byte[i];
        bArr[i - 1] = 2;
        this.zzVZk.update(bArr, 0, i);
    }

    private boolean zzZZ(byte[] bArr, int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < this.zzW6n; i3++) {
            i2 |= this.zzVYX[i3] ^ bArr[i + i3];
        }
        return i2 == 0;
    }

    @Override // com.aspose.words.internal.zzYTS
    public final int doFinal(byte[] bArr, int i) throws IllegalStateException, zzYUT {
        zzXCD();
        int i2 = this.zzW6m;
        byte[] bArr2 = this.zzVYP;
        byte[] bArr3 = new byte[bArr2.length];
        this.zzW6m = 0;
        if (this.zzWkw) {
            int i3 = i + i2;
            if (bArr.length < this.zzW6n + i3) {
                throw new zzYUO("Output buffer too short");
            }
            this.zzVYS.zzY(bArr2, 0, bArr3, 0);
            System.arraycopy(bArr3, 0, bArr, i, i2);
            this.zzVZk.update(bArr3, 0, i2);
            zzXCC();
            System.arraycopy(this.zzVYX, 0, bArr, i3, this.zzW6n);
            zzOG(false);
            return i2 + this.zzW6n;
        }
        int length = bArr.length;
        int i4 = this.zzW6n;
        if (length < (i + i2) - i4) {
            throw new zzYUO("Output buffer too short");
        }
        if (i2 < i4) {
            throw new zzYUT("data too short");
        }
        if (i2 > i4) {
            this.zzVZk.update(bArr2, 0, i2 - i4);
            this.zzVYS.zzY(this.zzVYP, 0, bArr3, 0);
            System.arraycopy(bArr3, 0, bArr, i, i2 - this.zzW6n);
        }
        zzXCC();
        if (!zzZZ(this.zzVYP, i2 - this.zzW6n)) {
            throw new zzYUT("mac check in EAX failed");
        }
        zzOG(false);
        return i2 - this.zzW6n;
    }

    @Override // com.aspose.words.internal.zzYTS
    public final int getOutputSize(int i) {
        int i2 = i + this.zzW6m;
        if (this.zzWkw) {
            return i2 + this.zzW6n;
        }
        int i3 = this.zzW6n;
        if (i2 < i3) {
            return 0;
        }
        return i2 - i3;
    }

    @Override // com.aspose.words.internal.zzYTS
    public final void reset() {
        zzOG(true);
    }

    @Override // com.aspose.words.internal.zzYTS
    public final zzYV8 zzXCK() {
        return this.zzVYS.zzXCK();
    }

    @Override // com.aspose.words.internal.zzYTS
    public final String zzXGi() {
        return this.zzVYS.zzXCK().zzXGi() + "/EAX";
    }

    @Override // com.aspose.words.internal.zzYTS
    public final int zzY(byte[] bArr, int i, int i2, byte[] bArr2) throws zzYV0 {
        zzXCD();
        if (bArr.length < i + i2) {
            throw new zzYV0("Input buffer too short");
        }
        int iZzZ = 0;
        for (int i3 = 0; i3 != i2; i3++) {
            iZzZ += zzZ(bArr[i + i3], bArr2, iZzZ);
        }
        return iZzZ;
    }

    @Override // com.aspose.words.internal.zzYTS
    public final void zzZ(boolean z, zzYV3 zzyv3) throws IllegalArgumentException {
        byte[] iv;
        zzYV3 zzyv3ZzXC6;
        this.zzWkw = z;
        if (zzyv3 instanceof zzYT3) {
            zzYT3 zzyt3 = (zzYT3) zzyv3;
            iv = zzyt3.zzXJY();
            this.zzVYZ = zzyt3.zzXCu();
            this.zzW6n = zzyt3.zzXDn() / 8;
            zzyv3ZzXC6 = zzyt3.zzXCv();
        } else {
            if (!(zzyv3 instanceof zzYS4)) {
                throw new IllegalArgumentException("invalid parameters passed to EAX");
            }
            zzYS4 zzys4 = (zzYS4) zzyv3;
            iv = zzys4.getIV();
            this.zzVYZ = null;
            this.zzW6n = this.zzVZk.zzXDn() / 2;
            zzyv3ZzXC6 = zzys4.zzXC6();
        }
        this.zzVYP = new byte[z ? this.zzZNm : this.zzZNm + this.zzW6n];
        byte[] bArr = new byte[this.zzZNm];
        this.zzVZk.zzZ(zzyv3ZzXC6);
        int i = this.zzZNm;
        bArr[i - 1] = 0;
        this.zzVZk.update(bArr, 0, i);
        this.zzVZk.update(iv, 0, iv.length);
        this.zzVZk.doFinal(this.zzVYR, 0);
        this.zzVYS.zzZ(true, new zzYS4(null, this.zzVYR));
        zzOG(true);
    }

    @Override // com.aspose.words.internal.zzYTS
    public final void zzc(byte b) {
        if (this.zzVYO) {
            throw new IllegalStateException("AAD data cannot be added after encryption/decription processing has begun.");
        }
        this.zzVZk.update(b);
    }

    @Override // com.aspose.words.internal.zzYTS
    public final int zzfY(int i) {
        int i2 = i + this.zzW6m;
        if (!this.zzWkw) {
            int i3 = this.zzW6n;
            if (i2 < i3) {
                return 0;
            }
            i2 -= i3;
        }
        return i2 - (i2 % this.zzZNm);
    }

    @Override // com.aspose.words.internal.zzYTS
    public final void zzq(byte[] bArr, int i, int i2) {
        if (this.zzVYO) {
            throw new IllegalStateException("AAD data cannot be added after encryption/decryption processing has begun.");
        }
        this.zzVZk.update(bArr, i, i2);
    }

    private int zzZ(byte b, byte[] bArr, int i) {
        int iZzY;
        byte[] bArr2 = this.zzVYP;
        int i2 = this.zzW6m;
        int i3 = i2 + 1;
        this.zzW6m = i3;
        bArr2[i2] = b;
        if (i3 != bArr2.length) {
            return 0;
        }
        int length = bArr.length;
        int i4 = this.zzZNm;
        if (length >= i + i4) {
            if (this.zzWkw) {
                iZzY = this.zzVYS.zzY(bArr2, 0, bArr, i);
                this.zzVZk.update(bArr, i, this.zzZNm);
            } else {
                this.zzVZk.update(bArr2, 0, i4);
                iZzY = this.zzVYS.zzY(this.zzVYP, 0, bArr, i);
            }
            this.zzW6m = 0;
            if (!this.zzWkw) {
                byte[] bArr3 = this.zzVYP;
                System.arraycopy(bArr3, this.zzZNm, bArr3, 0, this.zzW6n);
                this.zzW6m = this.zzW6n;
            }
            return iZzY;
        }
        throw new zzYUO("Output buffer is too short");
    }
}

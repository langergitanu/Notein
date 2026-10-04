package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzYWW implements zzYUR {
    private byte[] buf;
    private zzYS8 zzW5g;
    private zzYS8 zzW5h;
    private zzYTA zzW5i;
    private zzYV8 zzW67;
    private byte[] zzW6l;
    private int zzW6m;
    private int zzW6n;

    public zzYWW(zzYV8 zzyv8) {
        this(zzyv8, zzyv8.getBlockSize() * 8, null);
    }

    @Override // com.aspose.words.internal.zzYUR
    public final int doFinal(byte[] bArr, int i) {
        int blockSize = this.zzW67.getBlockSize();
        if (this.zzW5i == null) {
            while (true) {
                int i2 = this.zzW6m;
                if (i2 >= blockSize) {
                    break;
                }
                this.buf[i2] = 0;
                this.zzW6m = i2 + 1;
            }
        } else {
            if (this.zzW6m == blockSize) {
                this.zzW67.zzY(this.buf, 0, this.zzW6l, 0);
                this.zzW6m = 0;
            }
            this.zzW5i.zzZV(this.buf, this.zzW6m);
        }
        this.zzW67.zzY(this.buf, 0, this.zzW6l, 0);
        zzYYP zzyyp = new zzYYP();
        zzyyp.zzZ(false, (zzYV3) this.zzW5h);
        byte[] bArr2 = this.zzW6l;
        zzyyp.zzY(bArr2, 0, bArr2, 0);
        zzyyp.zzZ(true, (zzYV3) this.zzW5g);
        byte[] bArr3 = this.zzW6l;
        zzyyp.zzY(bArr3, 0, bArr3, 0);
        System.arraycopy(this.zzW6l, 0, bArr, 0, this.zzW6n);
        reset();
        return this.zzW6n;
    }

    @Override // com.aspose.words.internal.zzYUR
    public final void reset() {
        int i = 0;
        while (true) {
            byte[] bArr = this.buf;
            if (i >= bArr.length) {
                this.zzW6m = 0;
                this.zzW67.reset();
                return;
            } else {
                bArr[i] = 0;
                i++;
            }
        }
    }

    @Override // com.aspose.words.internal.zzYUR
    public final void update(byte b) {
        int i = this.zzW6m;
        byte[] bArr = this.buf;
        if (i == bArr.length) {
            this.zzW67.zzY(bArr, 0, this.zzW6l, 0);
            this.zzW6m = 0;
        }
        byte[] bArr2 = this.buf;
        int i2 = this.zzW6m;
        this.zzW6m = i2 + 1;
        bArr2[i2] = b;
    }

    @Override // com.aspose.words.internal.zzYUR
    public final int zzXDn() {
        return this.zzW6n;
    }

    @Override // com.aspose.words.internal.zzYUR
    public final String zzXGi() {
        return "ISO9797Alg3";
    }

    @Override // com.aspose.words.internal.zzYUR
    public final void zzZ(zzYV3 zzyv3) {
        zzYS7 zzys7;
        reset();
        boolean z = zzyv3 instanceof zzYS8;
        if (!z && !(zzyv3 instanceof zzYS4)) {
            throw new IllegalArgumentException("params must be an instance of KeyParameter or ParametersWithIV");
        }
        byte[] key = (z ? (zzYS8) zzyv3 : (zzYS8) ((zzYS4) zzyv3).zzXC6()).getKey();
        if (key.length == 16) {
            zzys7 = new zzYS7(key, 0, 8);
            this.zzW5h = new zzYS7(key, 8, 8);
            this.zzW5g = zzys7;
        } else {
            if (key.length != 24) {
                throw new IllegalArgumentException("Key must be either 112 or 168 bit long");
            }
            zzys7 = new zzYS7(key, 0, 8);
            this.zzW5h = new zzYS7(key, 8, 8);
            this.zzW5g = new zzYS7(key, 16, 8);
        }
        if (zzyv3 instanceof zzYS4) {
            this.zzW67.zzZ(true, new zzYS4(zzys7, ((zzYS4) zzyv3).getIV()));
        } else {
            this.zzW67.zzZ(true, zzys7);
        }
    }

    public zzYWW(zzYV8 zzyv8, int i, zzYTA zzyta) {
        if (i % 8 != 0) {
            throw new IllegalArgumentException("MAC size must be multiple of 8");
        }
        if (!zzyv8.zzXGi().startsWith("DES")) {
            throw new IllegalArgumentException("cipher must be instance of DESEngine");
        }
        this.zzW67 = new zzYTR(zzyv8);
        this.zzW5i = zzyta;
        this.zzW6n = i / 8;
        this.zzW6l = new byte[zzyv8.getBlockSize()];
        this.buf = new byte[zzyv8.getBlockSize()];
        this.zzW6m = 0;
    }

    @Override // com.aspose.words.internal.zzYUR
    public final void update(byte[] bArr, int i, int i2) {
        if (i2 >= 0) {
            int blockSize = this.zzW67.getBlockSize();
            int i3 = this.zzW6m;
            int i4 = blockSize - i3;
            if (i2 > i4) {
                System.arraycopy(bArr, i, this.buf, i3, i4);
                this.zzW67.zzY(this.buf, 0, this.zzW6l, 0);
                this.zzW6m = 0;
                i2 -= i4;
                i += i4;
                while (i2 > blockSize) {
                    this.zzW67.zzY(bArr, i, this.zzW6l, 0);
                    i2 -= blockSize;
                    i += blockSize;
                }
            }
            System.arraycopy(bArr, i, this.buf, this.zzW6m, i2);
            this.zzW6m += i2;
            return;
        }
        throw new IllegalArgumentException("Can't have a negative input length!");
    }
}

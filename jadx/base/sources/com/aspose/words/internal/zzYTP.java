package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYTP extends zzYUF {
    private int zzVYT;
    private byte[] zzVYU;
    private byte[] zzVZ2;
    private byte[] zzVZ3;
    private zzYV8 zzW67;
    private boolean zzWap;
    private byte[] zzWg5;
    private int zzZNm;

    public zzYTP(zzYV8 zzyv8, int i) {
        super(zzyv8);
        this.zzW67 = zzyv8;
        this.zzZNm = i / 8;
        this.zzWg5 = new byte[zzyv8.getBlockSize()];
        this.zzVZ3 = new byte[zzyv8.getBlockSize()];
        this.zzVZ2 = new byte[zzyv8.getBlockSize()];
        this.zzVYU = new byte[this.zzZNm];
    }

    private byte zza(byte b) {
        if (this.zzVYT == 0) {
            this.zzW67.zzY(this.zzVZ3, 0, this.zzVZ2, 0);
        }
        byte[] bArr = this.zzVYU;
        int i = this.zzVYT;
        bArr[i] = b;
        byte[] bArr2 = this.zzVZ2;
        int i2 = i + 1;
        this.zzVYT = i2;
        byte b2 = (byte) (b ^ bArr2[i]);
        int i3 = this.zzZNm;
        if (i2 == i3) {
            this.zzVYT = 0;
            byte[] bArr3 = this.zzVZ3;
            System.arraycopy(bArr3, i3, bArr3, 0, bArr3.length - i3);
            byte[] bArr4 = this.zzVYU;
            byte[] bArr5 = this.zzVZ3;
            int length = bArr5.length;
            int i4 = this.zzZNm;
            System.arraycopy(bArr4, 0, bArr5, length - i4, i4);
        }
        return b2;
    }

    private byte zzb(byte b) {
        if (this.zzVYT == 0) {
            this.zzW67.zzY(this.zzVZ3, 0, this.zzVZ2, 0);
        }
        byte[] bArr = this.zzVZ2;
        int i = this.zzVYT;
        byte b2 = (byte) (b ^ bArr[i]);
        byte[] bArr2 = this.zzVYU;
        int i2 = i + 1;
        this.zzVYT = i2;
        bArr2[i] = b2;
        int i3 = this.zzZNm;
        if (i2 == i3) {
            this.zzVYT = 0;
            byte[] bArr3 = this.zzVZ3;
            System.arraycopy(bArr3, i3, bArr3, 0, bArr3.length - i3);
            byte[] bArr4 = this.zzVYU;
            byte[] bArr5 = this.zzVZ3;
            int length = bArr5.length;
            int i4 = this.zzZNm;
            System.arraycopy(bArr4, 0, bArr5, length - i4, i4);
        }
        return b2;
    }

    @Override // com.aspose.words.internal.zzYV8
    public final int getBlockSize() {
        return this.zzZNm;
    }

    @Override // com.aspose.words.internal.zzYUE, com.aspose.words.internal.zzYV8
    public final void reset() {
        byte[] bArr = this.zzWg5;
        System.arraycopy(bArr, 0, this.zzVZ3, 0, bArr.length);
        zzYGU.fill(this.zzVYU, (byte) 0);
        this.zzVYT = 0;
        this.zzW67.reset();
    }

    public final byte[] zzXCE() {
        return zzYGU.zzVI(this.zzVZ3);
    }

    @Override // com.aspose.words.internal.zzYUE, com.aspose.words.internal.zzYV8
    public final String zzXGi() {
        return this.zzW67.zzXGi() + "/CFB" + (this.zzZNm * 8);
    }

    @Override // com.aspose.words.internal.zzYV8
    public final int zzY(byte[] bArr, int i, byte[] bArr2, int i2) throws IllegalStateException, zzYV0 {
        zzY(bArr, i, this.zzZNm, bArr2, i2);
        return this.zzZNm;
    }

    @Override // com.aspose.words.internal.zzYUE, com.aspose.words.internal.zzYV8
    public final void zzZ(boolean z, zzYV3 zzyv3) throws IllegalArgumentException {
        this.zzWap = z;
        if (!(zzyv3 instanceof zzYS4)) {
            reset();
            if (zzyv3 != null) {
                this.zzW67.zzZ(true, zzyv3);
                return;
            }
            return;
        }
        zzYS4 zzys4 = (zzYS4) zzyv3;
        byte[] iv = zzys4.getIV();
        int length = iv.length;
        byte[] bArr = this.zzWg5;
        if (length < bArr.length) {
            System.arraycopy(iv, 0, bArr, bArr.length - iv.length, iv.length);
            int i = 0;
            while (true) {
                byte[] bArr2 = this.zzWg5;
                if (i >= bArr2.length - iv.length) {
                    break;
                }
                bArr2[i] = 0;
                i++;
            }
        } else {
            System.arraycopy(iv, 0, bArr, 0, bArr.length);
        }
        reset();
        if (zzys4.zzXC6() != null) {
            this.zzW67.zzZ(true, zzys4.zzXC6());
        }
    }

    @Override // com.aspose.words.internal.zzYUF
    public final byte zzd(byte b) throws IllegalStateException, zzYV0 {
        return this.zzWap ? zzb(b) : zza(b);
    }
}

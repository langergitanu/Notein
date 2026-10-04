package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYTI extends zzYUF {
    private int zzVYT;
    private byte[] zzVYw;
    private byte[] zzVYx;
    private final zzYV8 zzW67;
    private byte[] zzWg5;
    private final int zzZNm;

    public zzYTI(zzYV8 zzyv8, int i) {
        super(zzyv8);
        this.zzW67 = zzyv8;
        this.zzZNm = i / 8;
        this.zzWg5 = new byte[zzyv8.getBlockSize()];
        this.zzVYx = new byte[zzyv8.getBlockSize()];
        this.zzVYw = new byte[zzyv8.getBlockSize()];
    }

    @Override // com.aspose.words.internal.zzYV8
    public final int getBlockSize() {
        return this.zzZNm;
    }

    @Override // com.aspose.words.internal.zzYUE, com.aspose.words.internal.zzYV8
    public final void reset() {
        byte[] bArr = this.zzWg5;
        System.arraycopy(bArr, 0, this.zzVYx, 0, bArr.length);
        this.zzVYT = 0;
        this.zzW67.reset();
    }

    @Override // com.aspose.words.internal.zzYUE, com.aspose.words.internal.zzYV8
    public final String zzXGi() {
        return this.zzW67.zzXGi() + "/OFB" + (this.zzZNm * 8);
    }

    @Override // com.aspose.words.internal.zzYV8
    public final int zzY(byte[] bArr, int i, byte[] bArr2, int i2) throws IllegalStateException, zzYV0 {
        zzY(bArr, i, this.zzZNm, bArr2, i2);
        return this.zzZNm;
    }

    @Override // com.aspose.words.internal.zzYUE, com.aspose.words.internal.zzYV8
    public final void zzZ(boolean z, zzYV3 zzyv3) throws IllegalArgumentException {
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
        if (this.zzVYT == 0) {
            this.zzW67.zzY(this.zzVYx, 0, this.zzVYw, 0);
        }
        byte[] bArr = this.zzVYw;
        int i = this.zzVYT;
        int i2 = i + 1;
        this.zzVYT = i2;
        byte b2 = (byte) (b ^ bArr[i]);
        int i3 = this.zzZNm;
        if (i2 == i3) {
            this.zzVYT = 0;
            byte[] bArr2 = this.zzVYx;
            System.arraycopy(bArr2, i3, bArr2, 0, bArr2.length - i3);
            byte[] bArr3 = this.zzVYw;
            byte[] bArr4 = this.zzVYx;
            int length = bArr4.length;
            int i4 = this.zzZNm;
            System.arraycopy(bArr3, 0, bArr4, length - i4, i4);
        }
        return b2;
    }
}

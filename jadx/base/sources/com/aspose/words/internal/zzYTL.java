package com.aspose.words.internal;

import android.R;
import androidx.core.view.ViewCompat;
import com.aspose.words.WarningType;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYTL extends zzYUF {
    private int zzVYT;
    int zzVYu;
    int zzVYv;
    private byte[] zzVYw;
    private byte[] zzVYx;
    private final zzYV8 zzW67;
    boolean zzW6k;
    private byte[] zzWg5;
    private final int zzZNm;

    public zzYTL(zzYV8 zzyv8) {
        super(zzyv8);
        this.zzW6k = true;
        this.zzW67 = zzyv8;
        int blockSize = zzyv8.getBlockSize();
        this.zzZNm = blockSize;
        if (blockSize != 8) {
            throw new IllegalArgumentException("GCTR only for 64 bit block ciphers");
        }
        this.zzWg5 = new byte[zzyv8.getBlockSize()];
        this.zzVYx = new byte[zzyv8.getBlockSize()];
        this.zzVYw = new byte[zzyv8.getBlockSize()];
    }

    private static int zz6(byte[] bArr, int i) {
        return ((bArr[i + 3] << 24) & ViewCompat.MEASURED_STATE_MASK) + ((bArr[i + 2] << 16) & WarningType.MINOR_FORMATTING_LOSS_CATEGORY) + ((bArr[i + 1] << 8) & 65280) + (bArr[i] & 255);
    }

    private static void zzR(int i, byte[] bArr, int i2) {
        bArr[i2 + 3] = (byte) (i >>> 24);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2] = (byte) i;
    }

    @Override // com.aspose.words.internal.zzYV8
    public final int getBlockSize() {
        return this.zzZNm;
    }

    @Override // com.aspose.words.internal.zzYUE, com.aspose.words.internal.zzYV8
    public final void reset() {
        this.zzW6k = true;
        this.zzVYv = 0;
        this.zzVYu = 0;
        byte[] bArr = this.zzWg5;
        System.arraycopy(bArr, 0, this.zzVYx, 0, bArr.length);
        this.zzVYT = 0;
        this.zzW67.reset();
    }

    @Override // com.aspose.words.internal.zzYUE, com.aspose.words.internal.zzYV8
    public final String zzXGi() {
        return this.zzW67.zzXGi() + "/GCTR";
    }

    @Override // com.aspose.words.internal.zzYV8
    public final int zzY(byte[] bArr, int i, byte[] bArr2, int i2) throws IllegalStateException, zzYV0 {
        zzY(bArr, i, this.zzZNm, bArr2, i2);
        return this.zzZNm;
    }

    @Override // com.aspose.words.internal.zzYUE, com.aspose.words.internal.zzYV8
    public final void zzZ(boolean z, zzYV3 zzyv3) throws IllegalArgumentException {
        this.zzW6k = true;
        this.zzVYv = 0;
        this.zzVYu = 0;
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
    public final byte zzd(byte b) {
        if (this.zzVYT == 0) {
            if (this.zzW6k) {
                this.zzW6k = false;
                this.zzW67.zzY(this.zzVYx, 0, this.zzVYw, 0);
                this.zzVYv = zz6(this.zzVYw, 0);
                this.zzVYu = zz6(this.zzVYw, 4);
            }
            int i = this.zzVYv + R.attr.cacheColorHint;
            this.zzVYv = i;
            int i2 = this.zzVYu;
            int i3 = i2 + R.attr.hand_minute;
            this.zzVYu = i3;
            if (i3 < 16843012 && i3 > 0) {
                this.zzVYu = i2 + R.attr.format;
            }
            zzR(i, this.zzVYx, 0);
            zzR(this.zzVYu, this.zzVYx, 4);
            this.zzW67.zzY(this.zzVYx, 0, this.zzVYw, 0);
        }
        byte[] bArr = this.zzVYw;
        int i4 = this.zzVYT;
        int i5 = i4 + 1;
        this.zzVYT = i5;
        byte b2 = (byte) (b ^ bArr[i4]);
        int i6 = this.zzZNm;
        if (i5 == i6) {
            this.zzVYT = 0;
            byte[] bArr2 = this.zzVYx;
            System.arraycopy(bArr2, i6, bArr2, 0, bArr2.length - i6);
            byte[] bArr3 = this.zzVYw;
            byte[] bArr4 = this.zzVYx;
            int length = bArr4.length;
            int i7 = this.zzZNm;
            System.arraycopy(bArr3, 0, bArr4, length - i7, i7);
        }
        return b2;
    }
}

package com.aspose.words.internal;

import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzYUA implements zzYGP, zzYUU {
    private long zzWnf;
    private int zzWng;
    private byte[] zzWnh;

    public zzYUA() {
        this.zzWnh = new byte[4];
        this.zzWng = 0;
    }

    public final void finish() {
        long j = this.zzWnf << 3;
        update(UnsignedBytes.MAX_POWER_OF_TWO);
        while (this.zzWng != 0) {
            update((byte) 0);
        }
        zzX8(j);
        zzXHo();
    }

    public void reset() {
        this.zzWnf = 0L;
        this.zzWng = 0;
        int i = 0;
        while (true) {
            byte[] bArr = this.zzWnh;
            if (i >= bArr.length) {
                return;
            }
            bArr[i] = 0;
            i++;
        }
    }

    @Override // com.aspose.words.internal.zzYUX
    public final void update(byte b) {
        byte[] bArr = this.zzWnh;
        int i = this.zzWng;
        int i2 = i + 1;
        this.zzWng = i2;
        bArr[i] = b;
        if (i2 == bArr.length) {
            zzk(bArr, 0);
            this.zzWng = 0;
        }
        this.zzWnf++;
    }

    public abstract void zzX8(long j);

    @Override // com.aspose.words.internal.zzYUU, com.aspose.words.internal.zzYUX
    public final int zzXE6() {
        return 64;
    }

    public abstract void zzXHo();

    public final void zzZ(zzYUA zzyua) {
        byte[] bArr = zzyua.zzWnh;
        System.arraycopy(bArr, 0, this.zzWnh, 0, bArr.length);
        this.zzWng = zzyua.zzWng;
        this.zzWnf = zzyua.zzWnf;
    }

    public abstract void zzk(byte[] bArr, int i);

    public zzYUA(zzYUA zzyua) {
        this.zzWnh = new byte[zzyua.zzWnh.length];
        zzZ(zzyua);
    }

    @Override // com.aspose.words.internal.zzYUX
    public final void update(byte[] bArr, int i, int i2) {
        int i3 = 0;
        int iMax = Math.max(0, i2);
        if (this.zzWng != 0) {
            int i4 = 0;
            while (true) {
                if (i4 >= iMax) {
                    i3 = i4;
                    break;
                }
                byte[] bArr2 = this.zzWnh;
                int i5 = this.zzWng;
                int i6 = i5 + 1;
                this.zzWng = i6;
                int i7 = i4 + 1;
                bArr2[i5] = bArr[i4 + i];
                if (i6 == 4) {
                    zzk(bArr2, 0);
                    this.zzWng = 0;
                    i3 = i7;
                    break;
                }
                i4 = i7;
            }
        }
        int i8 = ((iMax - i3) & (-4)) + i3;
        while (i3 < i8) {
            zzk(bArr, i + i3);
            i3 += 4;
        }
        while (i3 < iMax) {
            byte[] bArr3 = this.zzWnh;
            int i9 = this.zzWng;
            this.zzWng = i9 + 1;
            bArr3[i9] = bArr[i3 + i];
            i3++;
        }
        this.zzWnf += (long) iMax;
    }
}

package com.aspose.words;

import com.aspose.slides.PatternStyle;

/* JADX INFO: loaded from: classes6.dex */
final class zzYB3 {
    private int[] zzXe5;
    private byte[] zzXe6;
    private boolean zzXe7;

    public zzYB3(byte[] bArr) {
        int i = 0;
        this.zzXe7 = false;
        while (true) {
            if (i >= bArr.length) {
                break;
            }
            byte b = bArr[i];
            if ((b & 255) > 128 && (b & 255) < 192) {
                this.zzXe7 = true;
                break;
            }
            i++;
        }
        this.zzXe6 = bArr;
    }

    public final void zzVJ(int i, int i2) {
        byte[] bArr = this.zzXe6;
        if (bArr.length < 16) {
            return;
        }
        if ((bArr[3] & 255) == i) {
            bArr[15] = (byte) ((i2 * i2) + 10);
        }
        for (int i3 = 0; i3 < 10; i3++) {
            this.zzXe6[i3] = PatternStyle.DiagonalCross;
        }
    }

    public final int[] zzY7R() {
        return this.zzXe5;
    }

    public final void zzY7S() {
        this.zzXe7 = true;
    }

    public final boolean zzY7T() {
        return this.zzXe7;
    }

    public final boolean zzZ(com.aspose.words.internal.zzZOR zzzor, byte[] bArr, int i) throws Exception {
        if (i > 100) {
            this.zzXe7 = !this.zzXe7;
        }
        if (zzzor.canWrite()) {
            zzzor.write(bArr, 0, bArr.length);
        }
        this.zzXe5 = new int[bArr.length];
        for (int i2 = 0; i2 < bArr.length; i2++) {
            this.zzXe5[i2] = 255 & bArr[i2];
        }
        if (zzY3F.zzXTP() == 48) {
            zzY3F.zzjd(255);
        }
        return bArr.length == 65535;
    }
}

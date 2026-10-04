package com.aspose.slides.internal.p077d8;

import com.aspose.slides.PatternStyle;
import java.io.ByteArrayOutputStream;

/* JADX INFO: renamed from: com.aspose.slides.internal.d8.m4 */
/* JADX INFO: loaded from: classes3.dex */
class C3071m4 {

    /* JADX INFO: renamed from: k4 */
    private boolean f9122k4;

    /* JADX INFO: renamed from: kk */
    private int[] f9123kk;

    /* JADX INFO: renamed from: x1 */
    private byte[] f9124x1;

    public C3071m4(byte[] bArr) {
        int i = 0;
        this.f9122k4 = false;
        while (true) {
            if (i >= bArr.length) {
                break;
            }
            byte b = bArr[i];
            if ((b & 255) > 128 && (b & 255) < 192) {
                this.f9122k4 = true;
                break;
            }
            i++;
        }
        this.f9124x1 = bArr;
    }

    /* JADX INFO: renamed from: k4 */
    public static int m12977k4(int i) {
        return (i * i) + 10;
    }

    /* JADX INFO: renamed from: x1 */
    public int[] m12982x1() {
        return this.f9123kk;
    }

    /* JADX INFO: renamed from: k4 */
    public void m12978k4(int i, int i2, boolean z) {
        byte[] bArr = this.f9124x1;
        if (bArr.length < 16) {
            return;
        }
        if ((bArr[3] & 255) == i) {
            bArr[15] = (byte) m12977k4(i2);
        }
        for (int i3 = 0; i3 < 10; i3++) {
            this.f9124x1[i3] = z ? (byte) 3 : PatternStyle.DiagonalCross;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m12979k4(boolean z) {
        this.f9122k4 = z;
    }

    /* JADX INFO: renamed from: k4 */
    public boolean m12980k4() {
        return this.f9122k4;
    }

    /* JADX INFO: renamed from: k4 */
    public boolean m12981k4(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, int i) throws Exception {
        if (i > 100) {
            this.f9122k4 = !this.f9122k4;
        }
        if (byteArrayOutputStream != null) {
            byteArrayOutputStream.write(bArr, 0, bArr.length);
        }
        this.f9123kk = new int[bArr.length];
        for (int i2 = 0; i2 < bArr.length; i2++) {
            this.f9123kk[i2] = 255 & bArr[i2];
        }
        if (C3102wz.m13205kk() == 48) {
            C3102wz.m13207x1(255);
        }
        return bArr.length == 65535;
    }
}

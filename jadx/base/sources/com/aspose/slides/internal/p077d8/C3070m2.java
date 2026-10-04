package com.aspose.slides.internal.p077d8;

import com.google.common.primitives.UnsignedBytes;
import java.io.ByteArrayOutputStream;

/* JADX INFO: renamed from: com.aspose.slides.internal.d8.m2 */
/* JADX INFO: loaded from: classes3.dex */
class C3070m2 {

    /* JADX INFO: renamed from: du */
    private int f9114du;

    /* JADX INFO: renamed from: dy */
    private C3071m4 f9115dy;

    /* JADX INFO: renamed from: kk */
    private byte f9118kk;

    /* JADX INFO: renamed from: m9 */
    private C3071m4 f9119m9;

    /* JADX INFO: renamed from: to */
    private byte[] f9120to;

    /* JADX INFO: renamed from: x1 */
    private byte f9121x1;

    /* JADX INFO: renamed from: k4 */
    private ByteArrayOutputStream f9117k4 = new ByteArrayOutputStream();

    /* JADX INFO: renamed from: h4 */
    private ByteArrayOutputStream f9116h4 = new ByteArrayOutputStream();

    public C3070m2(C3071m4 c3071m4, byte[] bArr, boolean z, boolean z2) throws Exception {
        this.f9121x1 = (byte) 0;
        this.f9118kk = (byte) -1;
        this.f9114du = 0;
        if (z != z2) {
            this.f9121x1 = bArr[0];
            this.f9118kk = bArr[1];
        }
        this.f9117k4.write(bArr, 0, bArr.length);
        if (m12974k4(bArr)) {
            this.f9114du = 10;
        }
        if (!c3071m4.m12980k4()) {
            C3071m4.m12977k4(0);
        }
        this.f9119m9 = c3071m4;
    }

    /* JADX INFO: renamed from: kk */
    private void m12969kk() {
        int i = this.f9114du;
        if (i != 10) {
            this.f9114du = i + 5;
        }
        this.f9121x1 = (byte) (this.f9121x1 - 1);
    }

    /* JADX INFO: renamed from: k4 */
    public C3071m4 m12970k4(int[] iArr, C3071m4 c3071m4) {
        this.f9115dy = c3071m4;
        return this.f9119m9;
    }

    /* JADX INFO: renamed from: x1 */
    public C3071m4 m12976x1() {
        return this.f9115dy;
    }

    /* JADX INFO: renamed from: k4 */
    public ByteArrayOutputStream m12971k4() {
        return this.f9117k4;
    }

    /* JADX INFO: renamed from: k4 */
    public void m12972k4(String str, boolean z) throws Exception {
        int[] iArrM12957k4 = new C3062j5(this).m12957k4(5, 5);
        if (iArrM12957k4.length >= 10) {
            this.f9118kk = (byte) iArrM12957k4[9];
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m12973k4(boolean z) throws Exception {
        if (z) {
            this.f9121x1 = (byte) 0;
        }
        if (this.f9117k4.size() > 0) {
            int size = (this.f9117k4.size() / 2) + 1;
            byte[] byteArray = this.f9117k4.toByteArray();
            if (C3102wz.m13205kk() == 255) {
                C3102wz.m13207x1(128);
            }
            int length = byteArray.length - 1;
            for (int i = 0; i < size; i++) {
                byte b = byteArray[length];
                if ((b & 255) == 255) {
                    this.f9114du++;
                }
                if (b != ((byte) this.f9115dy.m12982x1()[length])) {
                    C3102wz.m13203k4(128);
                }
                length--;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public boolean m12974k4(byte[] bArr) {
        this.f9120to = new byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            byte[] bArr2 = this.f9120to;
            byte b = (byte) (bArr[i] & UnsignedBytes.MAX_POWER_OF_TWO);
            bArr2[i] = b;
            bArr2[i] = (byte) (b | 2);
        }
        return (this.f9120to[0] & 8) == 8;
    }

    /* JADX INFO: renamed from: k4 */
    public boolean m12975k4(byte[] bArr, String str) throws Exception {
        byte[] bytes = str.getBytes();
        this.f9116h4.write(bytes, 0, bytes.length);
        m12969kk();
        return this.f9116h4.size() < 16;
    }
}

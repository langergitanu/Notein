package com.aspose.slides.internal.p519y5;

import com.aspose.slides.internal.p135fp.C4095jd;

/* JADX INFO: renamed from: com.aspose.slides.internal.y5.to */
/* JADX INFO: loaded from: classes5.dex */
public class C12800to implements InterfaceC12796h4 {

    /* JADX INFO: renamed from: k4 */
    private final C4095jd f42562k4;

    /* JADX INFO: renamed from: x1 */
    private final int f42563x1;

    public C12800to(C4095jd c4095jd, int i) {
        this.f42562k4 = c4095jd;
        this.f42563x1 = i;
    }

    @Override // com.aspose.slides.internal.p519y5.InterfaceC12796h4
    /* JADX INFO: renamed from: k4 */
    public void mo24374k4(byte[][][] bArr) {
        int i = this.f42562k4.f11197k4 * 16;
        int length = bArr[0][this.f42563x1].length / i;
        byte[] bArr2 = new byte[i * length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = 0;
            for (int i5 = 0; i5 < this.f42562k4.f11197k4 * 8; i5++) {
                byte b = bArr[0][this.f42563x1][(i * i3) + i5];
                int i6 = (i * i2) + i4;
                bArr2[i6] = b;
                bArr2[i6 + 1] = b;
                i4 += 2;
            }
            i2++;
            i3++;
        }
        bArr[0][this.f42563x1] = bArr2;
    }
}

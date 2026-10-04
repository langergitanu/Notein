package com.aspose.slides.internal.p279mr;

import com.aspose.slides.internal.p299ni.InterfaceC6901du;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p550zi.C13609qq;

/* JADX INFO: renamed from: com.aspose.slides.internal.mr.zj */
/* JADX INFO: loaded from: classes4.dex */
public class C6489zj extends AbstractC6413bs {

    /* JADX INFO: renamed from: wl */
    private byte f18280wl;

    public C6489zj(int i, int i2, int i3, C13609qq c13609qq, C12014ne c12014ne, C13609qq c13609qq2, int i4, InterfaceC6901du interfaceC6901du, int i5) {
        super(i, i2, i3, c13609qq, c12014ne.Clone(), c13609qq2, i4, interfaceC6901du, i5);
    }

    @Override // com.aspose.slides.internal.p279mr.AbstractC6413bs
    /* JADX INFO: renamed from: k4 */
    public void mo26309k4(byte[] bArr, int i, int i2, int i3, int i4, byte[] bArr2, int i5, int i6, int i7) {
        for (int i8 = 0; i8 < i4; i8++) {
            int i9 = (this.f18224jd * i8) + i;
            int i10 = (i8 * i6) + i5;
            int i11 = i7;
            for (int i12 = 0; i12 < i3; i12++) {
                int i13 = (this.f18213u4 * i12) + i9;
                byte b = bArr[i13];
                int iMo27030k4 = this.f18212rv.mo27030k4(((bArr[i13 + 3] & 255) << 24) | ((bArr[i13 + 2] & 255) << 16) | ((bArr[i13 + 1] & 255) << 8) | (b & 255));
                if (iMo27030k4 > ((AbstractC6413bs) this).f18210ks) {
                    iMo27030k4 = this.f18215x6;
                }
                byte b2 = (byte) ((((byte) (iMo27030k4 << i11)) & 255) | (this.f18280wl & 255));
                this.f18280wl = b2;
                i11 -= this.f18223h4;
                if (i11 < 0 || i12 + 1 == i3) {
                    i11 = this.f18211ne;
                    bArr2[i10] = b2;
                    this.f18280wl = (byte) 0;
                    i10++;
                }
            }
        }
    }
}

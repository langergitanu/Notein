package com.aspose.slides.internal.p279mr;

import androidx.core.view.ViewCompat;
import com.aspose.slides.internal.p299ni.InterfaceC6901du;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p550zi.C13609qq;

/* JADX INFO: renamed from: com.aspose.slides.internal.mr.e0 */
/* JADX INFO: loaded from: classes4.dex */
public class C6423e0 extends AbstractC6413bs {

    /* JADX INFO: renamed from: wl */
    private byte f18238wl;

    public C6423e0(int i, int i2, int i3, C13609qq c13609qq, C12014ne c12014ne, C13609qq c13609qq2, int i4, InterfaceC6901du interfaceC6901du, int i5) {
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
                int i14 = ((bArr[i13 + 1] & 255) << 8) | (bArr[i13] & 255);
                int iMo27030k4 = this.f18212rv.mo27030k4(((int) ((((double) (i14 & 31)) * 8.225806451612904d) + 0.5d)) | (((int) ((((double) ((i14 & 31744) >> 10)) * 8.225806451612904d) + 0.5d)) << 16) | ViewCompat.MEASURED_STATE_MASK | (((int) ((((double) ((i14 & 992) >> 5)) * 8.225806451612904d) + 0.5d)) << 8));
                if (iMo27030k4 > ((AbstractC6413bs) this).f18210ks) {
                    iMo27030k4 = this.f18215x6;
                }
                byte b = (byte) ((((byte) (iMo27030k4 << i11)) & 255) | (this.f18238wl & 255));
                this.f18238wl = b;
                i11 -= this.f18223h4;
                if (i11 < 0 || i12 + 1 == i3) {
                    i11 = this.f18211ne;
                    bArr2[i10] = b;
                    this.f18238wl = (byte) 0;
                    i10++;
                }
            }
        }
    }
}

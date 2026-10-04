package com.aspose.slides.internal.p495x7;

import com.aspose.slides.internal.p016a8.C1304h4;
import com.aspose.slides.internal.p016a8.C1307to;
import com.aspose.slides.internal.p016a8.C1308x1;
import com.aspose.slides.internal.p066cl.InterfaceC2623jd;
import com.aspose.slides.internal.p129fe.C3983k4;
import com.aspose.slides.internal.p129fe.C3988to;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p477wk.C12083kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.x7.xk */
/* JADX INFO: loaded from: classes5.dex */
public class C12491xk extends AbstractC12480to {
    public C12491xk(C12009k4 c12009k4, C12083kk c12083kk, C3983k4 c3983k4) {
        super(c12009k4, c12083kk, c3983k4);
    }

    @Override // com.aspose.slides.internal.p495x7.AbstractC12480to
    /* JADX INFO: renamed from: k4 */
    public void mo19869k4() {
        byte[] bArrM58038up = m58038up();
        if (this.f40616du % 2 == 0) {
            m58043k4(bArrM58038up);
            return;
        }
        final InterfaceC2623jd interfaceC2623jdM56945du = m56945du();
        new C1308x1(this.f40616du, this.f40618h4, this.f40621m9, this.f40617dy, mo56952kk(bArrM58038up)).m7793k4(new C1308x1.k4() { // from class: com.aspose.slides.internal.x7.xk.1
            @Override // com.aspose.slides.internal.p016a8.C1308x1.k4
            /* JADX INFO: renamed from: k4 */
            public void mo7794k4(int i, int i2, int i3, int i4, C1307to c1307to) {
                interfaceC2623jdM56945du.mo11969k4(i3, i4, 0, c1307to.mo7783k4());
            }
        });
    }

    @Override // com.aspose.slides.internal.p495x7.AbstractC12480to
    /* JADX INFO: renamed from: kk */
    public int mo58022kk(int i) {
        return C3988to.f10878k4[i];
    }

    /* JADX INFO: renamed from: k4 */
    private void m58043k4(byte[] bArr) {
        byte[] bArrM56953m9 = m56953m9();
        int iCeil = (int) Math.ceil(m56954to().mo11975du() / 2.0f);
        int iCeil2 = (int) Math.ceil(this.f40621m9 / 2.0f);
        int i = this.f40621m9;
        boolean z = i % 2 != 0;
        boolean z2 = this.f40616du + i >= m56954to().mo11975du();
        int i2 = (this.f40618h4 * iCeil) + (this.f40616du / 2);
        int i3 = 0;
        for (int i4 = 0; i4 < this.f40617dy; i4++) {
            if (!z || z2) {
                System.arraycopy(bArr, i3, bArrM56953m9, i2, iCeil2);
            } else {
                System.arraycopy(bArr, i3, bArrM56953m9, i2, iCeil2 - 1);
                int i5 = (i2 + iCeil2) - 1;
                bArrM56953m9[i5] = (byte) (((byte) (bArr[(i3 + iCeil2) - 1] & 240)) | bArrM56953m9[i5]);
            }
            i2 += iCeil;
            i3 += this.f40620kk + iCeil2;
        }
    }

    @Override // com.aspose.slides.internal.p477wk.AbstractC12082k4
    /* JADX INFO: renamed from: kk */
    public C1307to mo56952kk(byte[] bArr) {
        return new C1304h4(this.f40621m9, this.f40620kk, bArr);
    }
}

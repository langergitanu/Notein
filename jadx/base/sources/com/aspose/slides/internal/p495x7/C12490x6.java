package com.aspose.slides.internal.p495x7;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p016a8.C1305k4;
import com.aspose.slides.internal.p016a8.C1307to;
import com.aspose.slides.internal.p066cl.InterfaceC2624k4;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p477wk.C12083kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.x7.x6 */
/* JADX INFO: loaded from: classes5.dex */
public class C12490x6 extends AbstractC12489x1 {
    public C12490x6(C12009k4 c12009k4, C12083kk c12083kk) {
        super(c12009k4, c12083kk);
    }

    @Override // com.aspose.slides.internal.p495x7.AbstractC12489x1
    /* JADX INFO: renamed from: k4 */
    public C1305k4.k4 mo19866k4() {
        throw new InvalidOperationException("This method must not be called!");
    }

    @Override // com.aspose.slides.internal.p495x7.AbstractC12472k4
    /* JADX INFO: renamed from: kk */
    public int mo58020kk(int i) {
        return i;
    }

    @Override // com.aspose.slides.internal.p495x7.AbstractC12472k4
    /* JADX INFO: renamed from: k4 */
    public void mo58019k4(int i, C1307to c1307to) {
        c1307to.mo7784k4((byte) (i & 255));
        c1307to.mo7784k4((byte) ((i >> 8) & 255));
        c1307to.mo7784k4((byte) ((i >> 16) & 255));
    }

    @Override // com.aspose.slides.internal.p495x7.AbstractC12489x1, com.aspose.slides.internal.p495x7.AbstractC12472k4
    /* JADX INFO: renamed from: k4 */
    public void mo19867k4(byte[] bArr) {
        byte[] bArrM56953m9 = m56953m9();
        InterfaceC2624k4 interfaceC2624k4M56954to = m56954to();
        if (this.f40616du == 0 && this.f40618h4 == 0 && this.f40621m9 == interfaceC2624k4M56954to.mo11975du() && this.f40617dy == interfaceC2624k4M56954to.mo11978h4() && this.f40620kk == 0 && bArrM56953m9.length == bArr.length) {
            System.arraycopy(bArrM56953m9, 0, bArr, 0, bArrM56953m9.length);
            return;
        }
        int iMo11975du = interfaceC2624k4M56954to.mo11975du() * 3;
        int i = this.f40621m9 * 3;
        int i2 = (this.f40618h4 * iMo11975du) + (this.f40616du * 3);
        int i3 = 0;
        for (int i4 = 0; i4 < this.f40617dy; i4++) {
            System.arraycopy(bArrM56953m9, i2, bArr, i3, i);
            i2 += iMo11975du;
            i3 += this.f40620kk + i;
        }
    }
}

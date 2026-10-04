package com.aspose.slides.internal.p495x7;

import com.aspose.slides.internal.p129fe.C3983k4;
import com.aspose.slides.internal.p129fe.C3988to;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p477wk.C12083kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.x7.e0 */
/* JADX INFO: loaded from: classes5.dex */
public class C12467e0 extends AbstractC12480to {
    public C12467e0(C12009k4 c12009k4, C12083kk c12083kk, C3983k4 c3983k4) {
        super(c12009k4, c12083kk, c3983k4);
    }

    @Override // com.aspose.slides.internal.p495x7.AbstractC12480to
    /* JADX INFO: renamed from: k4 */
    public void mo19869k4() {
        byte[] bArrM58038up = m58038up();
        byte[] bArrM56953m9 = m56953m9();
        int iMo11975du = m56954to().mo11975du();
        int i = this.f40621m9;
        int i2 = (this.f40618h4 * iMo11975du) + this.f40616du;
        int i3 = 0;
        for (int i4 = 0; i4 < this.f40617dy; i4++) {
            System.arraycopy(bArrM58038up, i3, bArrM56953m9, i2, i);
            i2 += iMo11975du;
            i3 += this.f40620kk + i;
        }
    }

    @Override // com.aspose.slides.internal.p495x7.AbstractC12480to
    /* JADX INFO: renamed from: kk */
    public int mo58022kk(int i) {
        return C3988to.f10879x1[i & 255];
    }
}

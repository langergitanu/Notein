package com.aspose.slides.internal.p495x7;

import androidx.core.view.ViewCompat;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p016a8.C1305k4;
import com.aspose.slides.internal.p016a8.C1307to;
import com.aspose.slides.internal.p066cl.InterfaceC2624k4;
import com.aspose.slides.internal.p129fe.C3983k4;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p477wk.C12083kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.x7.b3 */
/* JADX INFO: loaded from: classes5.dex */
public class C12459b3 extends AbstractC12473kk {
    public C12459b3(C12009k4 c12009k4, C12083kk c12083kk, C3983k4 c3983k4) {
        super(c12009k4, c12083kk, c3983k4);
    }

    @Override // com.aspose.slides.internal.p495x7.AbstractC12480to
    /* JADX INFO: renamed from: k4 */
    public int mo58021k4(C1307to c1307to) {
        return ((c1307to.mo7783k4() & 255) << 16) | ViewCompat.MEASURED_STATE_MASK | ((c1307to.mo7783k4() & 255) << 8) | (c1307to.mo7783k4() & 255);
    }

    @Override // com.aspose.slides.internal.p495x7.AbstractC12473kk
    /* JADX INFO: renamed from: x1 */
    public C1305k4.k4 mo19870x1() {
        throw new InvalidOperationException("This method must not be called!");
    }

    @Override // com.aspose.slides.internal.p495x7.AbstractC12473kk, com.aspose.slides.internal.p495x7.AbstractC12480to
    /* JADX INFO: renamed from: k4 */
    public void mo19869k4() {
        byte[] bArrM58038up = m58038up();
        byte[] bArrM56953m9 = m56953m9();
        InterfaceC2624k4 interfaceC2624k4M56954to = m56954to();
        if (this.f40616du == 0 && this.f40618h4 == 0 && this.f40621m9 == interfaceC2624k4M56954to.mo11975du() && this.f40617dy == interfaceC2624k4M56954to.mo11978h4() && this.f40620kk == 0 && bArrM56953m9.length == bArrM58038up.length) {
            System.arraycopy(bArrM58038up, 0, bArrM56953m9, 0, bArrM56953m9.length);
            return;
        }
        int iMo11975du = interfaceC2624k4M56954to.mo11975du() * 3;
        int i = this.f40621m9 * 3;
        int i2 = (this.f40618h4 * iMo11975du) + (this.f40616du * 3);
        int i3 = 0;
        for (int i4 = 0; i4 < this.f40617dy; i4++) {
            System.arraycopy(bArrM58038up, i3, bArrM56953m9, i2, i);
            i2 += iMo11975du;
            i3 += this.f40620kk + i;
        }
    }
}

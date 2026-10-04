package com.aspose.slides.internal.p495x7;

import com.aspose.slides.internal.p016a8.C1305k4;
import com.aspose.slides.internal.p016a8.C1306kk;
import com.aspose.slides.internal.p016a8.C1307to;
import com.aspose.slides.internal.p129fe.C3983k4;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p477wk.C12083kk;
import com.aspose.slides.internal.p556zr.C13633x1;

/* JADX INFO: renamed from: com.aspose.slides.internal.x7.c5 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC12461c5 extends AbstractC12473kk {
    public AbstractC12461c5(C12009k4 c12009k4, C12083kk c12083kk, C3983k4 c3983k4) {
        super(c12009k4, c12083kk, c3983k4);
    }

    /* JADX INFO: renamed from: k4 */
    public int m58023k4(int i, int i2) {
        int i3 = (i2 * 255) + i;
        int i4 = i3 >> 5;
        return i4 > 255 ? C13633x1.m62947k4(i3) & 255 : i4 & 255;
    }

    @Override // com.aspose.slides.internal.p495x7.AbstractC12473kk
    /* JADX INFO: renamed from: x1 */
    public C1305k4.k4 mo19870x1() {
        return new C1305k4.k4() { // from class: com.aspose.slides.internal.x7.c5.1
            @Override // com.aspose.slides.internal.p016a8.C1305k4.k4
            /* JADX INFO: renamed from: k4 */
            public void mo7787k4(C1306kk c1306kk, C1307to c1307to) {
                int iMo7783k4 = c1307to.mo7783k4() & 255;
                int iMo7783k42 = c1307to.mo7783k4() & 255;
                int iMo7783k43 = c1307to.mo7783k4() & 255;
                int iMo7783k44 = c1307to.mo7783k4() & 255;
                int iMo7783k45 = c1307to.mo7783k4() & 255;
                int iMo7783k46 = c1307to.mo7783k4() & 255;
                int i = iMo7783k4 | (iMo7783k42 << 8);
                int iMo7783k47 = ((c1307to.mo7783k4() & 255) << 8) | (c1307to.mo7783k4() & 255);
                c1306kk.m7791k4((iMo7783k46 << 8) | iMo7783k45);
                c1306kk.m7791k4((iMo7783k44 << 8) | iMo7783k43);
                c1306kk.m7791k4(i);
                c1306kk.m7791k4(iMo7783k47);
            }
        };
    }
}

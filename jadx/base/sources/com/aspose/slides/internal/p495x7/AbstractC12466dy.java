package com.aspose.slides.internal.p495x7;

import com.aspose.slides.internal.p016a8.C1305k4;
import com.aspose.slides.internal.p016a8.C1306kk;
import com.aspose.slides.internal.p016a8.C1307to;
import com.aspose.slides.internal.p129fe.C3983k4;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p477wk.C12083kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.x7.dy */
/* JADX INFO: loaded from: classes5.dex */
abstract class AbstractC12466dy extends AbstractC12473kk {
    public AbstractC12466dy(C12009k4 c12009k4, C12083kk c12083kk, C3983k4 c3983k4) {
        super(c12009k4, c12083kk, c3983k4);
    }

    @Override // com.aspose.slides.internal.p495x7.AbstractC12480to
    /* JADX INFO: renamed from: k4 */
    public int mo58021k4(C1307to c1307to) {
        return ((c1307to.mo7783k4() & 255) << 8) | (c1307to.mo7783k4() & 255);
    }

    @Override // com.aspose.slides.internal.p495x7.AbstractC12473kk
    /* JADX INFO: renamed from: x1 */
    public C1305k4.k4 mo19870x1() {
        return new C1305k4.k4() { // from class: com.aspose.slides.internal.x7.dy.1
            @Override // com.aspose.slides.internal.p016a8.C1305k4.k4
            /* JADX INFO: renamed from: k4 */
            public void mo7787k4(C1306kk c1306kk, C1307to c1307to) {
                c1306kk.m7791k4(AbstractC12466dy.this.mo58021k4(c1307to));
            }
        };
    }
}

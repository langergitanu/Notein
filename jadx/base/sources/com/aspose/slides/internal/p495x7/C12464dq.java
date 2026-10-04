package com.aspose.slides.internal.p495x7;

import androidx.core.view.ViewCompat;
import com.aspose.slides.internal.p016a8.C1305k4;
import com.aspose.slides.internal.p016a8.C1306kk;
import com.aspose.slides.internal.p016a8.C1307to;
import com.aspose.slides.internal.p129fe.C3983k4;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p477wk.C12083kk;
import com.aspose.slides.internal.p556zr.C13633x1;

/* JADX INFO: renamed from: com.aspose.slides.internal.x7.dq */
/* JADX INFO: loaded from: classes5.dex */
public class C12464dq extends AbstractC12473kk {
    public C12464dq(C12009k4 c12009k4, C12083kk c12083kk, C3983k4 c3983k4) {
        super(c12009k4, c12083kk, c3983k4);
    }

    @Override // com.aspose.slides.internal.p495x7.AbstractC12480to
    /* JADX INFO: renamed from: k4 */
    public int mo58021k4(C1307to c1307to) {
        int iMo7783k4 = c1307to.mo7783k4() & 255;
        int iMo7783k42 = c1307to.mo7783k4() & 255;
        int iMo7783k43 = c1307to.mo7783k4() & 255;
        int iMo7783k44 = c1307to.mo7783k4() & 255;
        int iMo7783k45 = c1307to.mo7783k4() & 255;
        int iMo7783k46 = c1307to.mo7783k4() & 255;
        return ((C13633x1.m62947k4((iMo7783k46 << 8) | iMo7783k45) & 255) << 16) | ViewCompat.MEASURED_STATE_MASK | ((C13633x1.m62947k4((iMo7783k44 << 8) | iMo7783k43) & 255) << 8) | (C13633x1.m62947k4(iMo7783k4 | (iMo7783k42 << 8)) & 255);
    }

    @Override // com.aspose.slides.internal.p495x7.AbstractC12473kk
    /* JADX INFO: renamed from: x1 */
    public C1305k4.k4 mo19870x1() {
        return new C1305k4.k4() { // from class: com.aspose.slides.internal.x7.dq.1
            @Override // com.aspose.slides.internal.p016a8.C1305k4.k4
            /* JADX INFO: renamed from: k4 */
            public void mo7787k4(C1306kk c1306kk, C1307to c1307to) {
                int iMo7783k4 = c1307to.mo7783k4() & 255;
                int iMo7783k42 = c1307to.mo7783k4() & 255;
                int iMo7783k43 = c1307to.mo7783k4() & 255;
                int iMo7783k44 = c1307to.mo7783k4() & 255;
                c1306kk.m7791k4(((c1307to.mo7783k4() & 255) << 8) | (c1307to.mo7783k4() & 255));
                c1306kk.m7791k4((iMo7783k44 << 8) | iMo7783k43);
                c1306kk.m7791k4(iMo7783k4 | (iMo7783k42 << 8));
            }
        };
    }
}

package com.aspose.slides.internal.p495x7;

import com.aspose.slides.internal.p016a8.C1307to;
import com.aspose.slides.internal.p129fe.C3983k4;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p477wk.C12083kk;
import com.aspose.slides.internal.p556zr.C13633x1;

/* JADX INFO: renamed from: com.aspose.slides.internal.x7.ts */
/* JADX INFO: loaded from: classes5.dex */
public class C12481ts extends AbstractC12461c5 {
    public C12481ts(C12009k4 c12009k4, C12083kk c12083kk, C3983k4 c3983k4) {
        super(c12009k4, c12083kk, c3983k4);
    }

    @Override // com.aspose.slides.internal.p495x7.AbstractC12480to
    /* JADX INFO: renamed from: k4 */
    public int mo58021k4(C1307to c1307to) {
        int iM62947k4;
        int i;
        int iM62947k42;
        int iM62947k43;
        int iMo7783k4 = c1307to.mo7783k4() & 255;
        int iMo7783k42 = c1307to.mo7783k4() & 255;
        int iMo7783k43 = c1307to.mo7783k4() & 255;
        int iMo7783k44 = c1307to.mo7783k4() & 255;
        int iMo7783k45 = c1307to.mo7783k4() & 255;
        int iMo7783k46 = c1307to.mo7783k4() & 255;
        int iMo7783k47 = c1307to.mo7783k4() & 255;
        int iMo7783k48 = c1307to.mo7783k4() & 255;
        int iM58023k4 = m58023k4(iMo7783k47, iMo7783k48);
        int i2 = (iMo7783k48 << 24) | (iMo7783k47 << 16);
        int i3 = iMo7783k46 << 8;
        try {
            int iM62949k4 = C13633x1.m62949k4(i2 | i3 | iMo7783k45);
            i = (iM62949k4 >> 8) & 255;
            iM62947k4 = iM62949k4 & 255;
        } catch (IllegalStateException unused) {
            iM62947k4 = C13633x1.m62947k4(iMo7783k45 | i3) & 255;
            if (iM58023k4 != 0) {
                iM62947k4 = (iM62947k4 * 255) / iM58023k4;
            }
            i = iM58023k4;
        }
        try {
            iM62947k42 = C13633x1.m62949k4(i2 | r3 | iMo7783k43) & 255;
        } catch (IllegalStateException unused2) {
            iM62947k42 = C13633x1.m62947k4(iMo7783k43 | (iMo7783k44 << 8)) & 255;
            if (iM58023k4 != 0) {
                iM62947k42 = (iM62947k42 * 255) / iM58023k4;
            }
            i = iM58023k4;
        }
        try {
            iM62947k43 = C13633x1.m62949k4(i2 | r1 | iMo7783k4) & 255;
            iM58023k4 = i;
        } catch (IllegalStateException unused3) {
            iM62947k43 = C13633x1.m62947k4((iMo7783k42 << 8) | iMo7783k4) & 255;
            if (iM58023k4 != 0) {
                iM62947k43 = (iM62947k43 * 255) / iM58023k4;
            }
        }
        return iM62947k43 | (iM58023k4 << 24) | (iM62947k4 << 16) | (iM62947k42 << 8);
    }
}

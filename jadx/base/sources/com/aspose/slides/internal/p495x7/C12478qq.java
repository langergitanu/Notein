package com.aspose.slides.internal.p495x7;

import com.aspose.slides.internal.p016a8.C1307to;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p477wk.C12083kk;
import com.aspose.slides.internal.p556zr.C13633x1;

/* JADX INFO: renamed from: com.aspose.slides.internal.x7.qq */
/* JADX INFO: loaded from: classes5.dex */
public class C12478qq extends AbstractC12476m9 {
    public C12478qq(C12009k4 c12009k4, C12083kk c12083kk) {
        super(c12009k4, c12083kk);
    }

    @Override // com.aspose.slides.internal.p495x7.AbstractC12472k4
    /* JADX INFO: renamed from: k4 */
    public void mo58019k4(int i, C1307to c1307to) {
        int i2 = i >> 24;
        int i3 = i2 & 255;
        m58031k4(c1307to, i & 255, i3);
        m58031k4(c1307to, (i >> 8) & 255, i3);
        m58031k4(c1307to, (i >> 16) & 255, i3);
        int i4 = (i2 & 255) << 5;
        c1307to.mo7784k4((byte) (i4 % 255));
        c1307to.mo7784k4((byte) ((i4 / 255) & 255));
    }

    /* JADX INFO: renamed from: k4 */
    private void m58031k4(C1307to c1307to, int i, int i2) {
        int i3 = C13633x1.m62951k4()[((i << 8) | i2) & 65535];
        c1307to.mo7784k4((byte) ((i3 >> 8) & 255));
        c1307to.mo7784k4((byte) (i3 & 255));
    }
}

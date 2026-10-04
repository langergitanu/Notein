package com.aspose.slides.internal.p495x7;

import com.aspose.slides.internal.p016a8.C1307to;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p477wk.C12083kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.x7.wl */
/* JADX INFO: loaded from: classes5.dex */
public class C12487wl extends AbstractC12476m9 {
    public C12487wl(C12009k4 c12009k4, C12083kk c12083kk) {
        super(c12009k4, c12083kk);
    }

    @Override // com.aspose.slides.internal.p495x7.AbstractC12472k4
    /* JADX INFO: renamed from: k4 */
    public void mo58019k4(int i, C1307to c1307to) {
        m58042k4(c1307to, (byte) (i & 255));
        m58042k4(c1307to, (byte) ((i >> 8) & 255));
        m58042k4(c1307to, (byte) ((i >> 16) & 255));
        int i2 = (((byte) ((i >> 24) & 255)) & 255) << 5;
        c1307to.mo7784k4((byte) (i2 % 255));
        c1307to.mo7784k4((byte) ((i2 / 255) & 255));
    }

    /* JADX INFO: renamed from: k4 */
    private void m58042k4(C1307to c1307to, byte b) {
        for (byte b2 : m58025k4(b)) {
            c1307to.mo7784k4(b2);
        }
    }
}

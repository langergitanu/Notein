package com.aspose.slides.internal.p495x7;

import com.aspose.slides.internal.p016a8.C1305k4;
import com.aspose.slides.internal.p016a8.C1306kk;
import com.aspose.slides.internal.p016a8.C1307to;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p477wk.C12083kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.x7.u4 */
/* JADX INFO: loaded from: classes5.dex */
public class C12482u4 extends AbstractC12469h4 {
    public C12482u4(C12009k4 c12009k4, C12083kk c12083kk) {
        super(c12009k4, c12083kk);
    }

    @Override // com.aspose.slides.internal.p495x7.AbstractC12489x1
    /* JADX INFO: renamed from: k4 */
    public C1305k4.k4 mo19866k4() {
        return new C1305k4.k4() { // from class: com.aspose.slides.internal.x7.u4.1
            @Override // com.aspose.slides.internal.p016a8.C1305k4.k4
            /* JADX INFO: renamed from: k4 */
            public void mo7787k4(C1306kk c1306kk, C1307to c1307to) {
                int iM7790k4 = c1306kk.m7790k4();
                int iM7790k42 = c1306kk.m7790k4();
                int iM7790k43 = c1306kk.m7790k4();
                c1307to.mo7784k4((byte) (iM7790k43 & 255));
                c1307to.mo7784k4((byte) ((iM7790k43 >> 8) & 255));
                c1307to.mo7784k4((byte) (iM7790k42 & 255));
                c1307to.mo7784k4((byte) ((iM7790k42 >> 8) & 255));
                c1307to.mo7784k4((byte) (iM7790k4 & 255));
                c1307to.mo7784k4((byte) ((iM7790k4 >> 8) & 255));
            }
        };
    }

    @Override // com.aspose.slides.internal.p495x7.AbstractC12472k4
    /* JADX INFO: renamed from: k4 */
    public void mo58019k4(int i, C1307to c1307to) {
        byte b = (byte) ((i >> 16) & 255);
        byte b2 = (byte) ((i >> 8) & 255);
        for (byte b3 : m58025k4((byte) (i & 255))) {
            c1307to.mo7784k4(b3);
        }
        for (byte b4 : m58025k4(b2)) {
            c1307to.mo7784k4(b4);
        }
        for (byte b5 : m58025k4(b)) {
            c1307to.mo7784k4(b5);
        }
    }
}

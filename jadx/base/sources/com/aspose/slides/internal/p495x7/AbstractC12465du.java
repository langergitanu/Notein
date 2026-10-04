package com.aspose.slides.internal.p495x7;

import com.aspose.slides.internal.p016a8.C1305k4;
import com.aspose.slides.internal.p016a8.C1306kk;
import com.aspose.slides.internal.p016a8.C1307to;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p477wk.C12083kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.x7.du */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC12465du extends AbstractC12489x1 {
    public AbstractC12465du(C12009k4 c12009k4, C12083kk c12083kk) {
        super(c12009k4, c12083kk);
    }

    @Override // com.aspose.slides.internal.p495x7.AbstractC12489x1
    /* JADX INFO: renamed from: k4 */
    public C1305k4.k4 mo19866k4() {
        return new C1305k4.k4() { // from class: com.aspose.slides.internal.x7.du.1
            @Override // com.aspose.slides.internal.p016a8.C1305k4.k4
            /* JADX INFO: renamed from: k4 */
            public void mo7787k4(C1306kk c1306kk, C1307to c1307to) {
                AbstractC12465du.this.mo58019k4((short) c1306kk.m7790k4(), c1307to);
            }
        };
    }

    @Override // com.aspose.slides.internal.p495x7.AbstractC12472k4
    /* JADX INFO: renamed from: kk */
    public abstract int mo58020kk(int i);

    @Override // com.aspose.slides.internal.p495x7.AbstractC12472k4
    /* JADX INFO: renamed from: k4 */
    public void mo58019k4(int i, C1307to c1307to) {
        c1307to.mo7784k4((byte) (i & 255));
        c1307to.mo7784k4((byte) ((i >> 8) & 255));
    }
}

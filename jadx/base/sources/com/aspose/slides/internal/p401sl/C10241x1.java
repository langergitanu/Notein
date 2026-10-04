package com.aspose.slides.internal.p401sl;

import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p129fe.C3977ck;
import com.aspose.slides.internal.p333p8.C9427jd;
import com.aspose.slides.internal.p475wh.C12009k4;

/* JADX INFO: renamed from: com.aspose.slides.internal.sl.x1 */
/* JADX INFO: loaded from: classes4.dex */
public class C10241x1 extends AbstractC10240to {

    /* JADX INFO: renamed from: x1 */
    private static final C3977ck f36698x1 = C3977ck.m15676ck();

    /* JADX INFO: renamed from: k4 */
    private C12009k4 f36699k4;

    public C10241x1(C9427jd c9427jd) {
        super(c9427jd, "tiff");
    }

    @Override // com.aspose.slides.internal.p401sl.AbstractC10240to
    /* JADX INFO: renamed from: k4 */
    public C12009k4 mo50124k4() {
        C12009k4 c12009k4 = this.f36699k4;
        if (c12009k4 != null) {
            return c12009k4;
        }
        try {
            C3152yj c3152yj = new C3152yj(m50132ks().m46154k4());
            try {
                C12009k4 c12009k42 = new C12009k4(c3152yj);
                this.f36699k4 = c12009k42;
                return c12009k42;
            } finally {
                c3152yj.dispose();
            }
        } catch (RuntimeException unused) {
            return null;
        }
    }

    @Override // com.aspose.slides.internal.p401sl.AbstractC10240to
    /* JADX INFO: renamed from: k4 */
    public void mo50125k4(AbstractC3150x6 abstractC3150x6) {
        mo50124k4();
        C12009k4 c12009k4 = this.f36699k4;
        if (c12009k4 != null) {
            c12009k4.m56333k4(abstractC3150x6, f36698x1);
        }
    }
}

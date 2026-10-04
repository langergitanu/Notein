package com.aspose.slides.internal.p401sl;

import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p129fe.C3977ck;
import com.aspose.slides.internal.p333p8.C9427jd;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.C12009k4;

/* JADX INFO: renamed from: com.aspose.slides.internal.sl.du */
/* JADX INFO: loaded from: classes4.dex */
public class C10234du extends AbstractC10240to {

    /* JADX INFO: renamed from: kk */
    private static final C3977ck f36680kk = C3977ck.m15678dy();

    /* JADX INFO: renamed from: k4 */
    private C12009k4 f36681k4;

    /* JADX INFO: renamed from: x1 */
    private byte[] f36682x1;

    public C10234du(C9427jd c9427jd) {
        super(c9427jd, "jpg");
    }

    @Override // com.aspose.slides.internal.p401sl.AbstractC10240to
    /* JADX INFO: renamed from: k4 */
    public C12009k4 mo50124k4() {
        C12009k4 c12009k4 = this.f36681k4;
        if (c12009k4 != null) {
            return c12009k4;
        }
        try {
            byte[] bArrM46154k4 = m50132ks().m46154k4();
            this.f36682x1 = bArrM46154k4;
            if (bArrM46154k4.length == 0) {
                return null;
            }
            C3152yj c3152yj = new C3152yj(this.f36682x1);
            try {
                AbstractC12002ck abstractC12002ckM56312k4 = AbstractC12002ck.m56312k4(c3152yj);
                if (abstractC12002ckM56312k4 != null) {
                    try {
                        C3152yj c3152yj2 = new C3152yj();
                        try {
                            abstractC12002ckM56312k4.m56333k4(c3152yj2, f36680kk);
                            this.f36681k4 = new C12009k4(abstractC12002ckM56312k4);
                            c3152yj2.dispose();
                        } catch (Throwable th) {
                            c3152yj2.dispose();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        abstractC12002ckM56312k4.dispose();
                        throw th2;
                    }
                }
                if (abstractC12002ckM56312k4 != null) {
                    abstractC12002ckM56312k4.dispose();
                }
                c3152yj.dispose();
                return this.f36681k4;
            } catch (Throwable th3) {
                c3152yj.dispose();
                throw th3;
            }
        } catch (RuntimeException unused) {
            return null;
        }
    }

    @Override // com.aspose.slides.internal.p401sl.AbstractC10240to
    /* JADX INFO: renamed from: k4 */
    public void mo50125k4(AbstractC3150x6 abstractC3150x6) {
        mo50124k4();
        C12009k4 c12009k4 = this.f36681k4;
        if (c12009k4 != null) {
            c12009k4.m56333k4(abstractC3150x6, f36680kk);
        }
    }
}

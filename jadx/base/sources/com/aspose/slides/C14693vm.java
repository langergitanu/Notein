package com.aspose.slides;

import com.aspose.slides.internal.p159h0.C4443em;
import com.aspose.slides.internal.p159h0.C4459os;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C12009k4;

/* JADX INFO: renamed from: com.aspose.slides.vm */
/* JADX INFO: loaded from: classes3.dex */
class C14693vm {

    /* JADX INFO: renamed from: du */
    private final float f49598du = 1.0f;

    /* JADX INFO: renamed from: h4 */
    private C12009k4 f49599h4;

    /* JADX INFO: renamed from: k4 */
    private C14365qy f49600k4;

    /* JADX INFO: renamed from: kk */
    private final float f49601kk;

    /* JADX INFO: renamed from: m9 */
    private AbstractC12008jd f49602m9;

    /* JADX INFO: renamed from: to */
    private final float f49603to;

    /* JADX INFO: renamed from: x1 */
    private boolean f49604x1;

    /* JADX WARN: Type inference failed for: r0v4, types: [double, int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int, java.lang.StringBuffer] */
    /* JADX WARN: Type inference failed for: r3v4, types: [double, int] */
    /* JADX WARN: Type inference failed for: r7v2, types: [int, java.lang.StringBuffer] */
    public C14693vm(C14365qy c14365qy, float f, boolean z) {
        this.f49601kk = f;
        m72354k4(z);
        float f2 = c14365qy.m69870wy().m74608ar() != null ? c14365qy.m69870wy().m74608ar().mo17577u4().m55776k4()[0] : 1.0f;
        this.f49603to = f2;
        if (z) {
            float f3 = f * f2;
            C12009k4 c12009k4 = new C12009k4((int) StringBuffer.append((int) ((c14365qy.m69834fa().getWidth() + c14365qy.m69834fa().getX()) * f3)), (int) StringBuffer.append((int) ((c14365qy.m69834fa().getHeight() + c14365qy.m69834fa().getY()) * f3)), 2498570);
            this.f49599h4 = c12009k4;
            AbstractC12008jd abstractC12008jdM56582k4 = AbstractC12008jd.m56582k4((AbstractC12002ck) c12009k4);
            this.f49602m9 = abstractC12008jdM56582k4;
            abstractC12008jdM56582k4.mo17481h4(4);
        }
        m72353k4(c14365qy);
    }

    /* JADX INFO: renamed from: du */
    public final float m72355du() {
        return this.f49603to;
    }

    /* JADX INFO: renamed from: h4 */
    public final float m72356h4() {
        return 1.0f;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m72357k4() {
        if (m72359kk()) {
            float f = this.f49601kk * this.f49603to;
            m72361x1().m69870wy().mo64341k4((AbstractC12002ck) this.f49599h4, 0, 0, C7019kk.m27462to(Float.valueOf(r3.mo15760yj() / f), 13), C7019kk.m27462to(Float.valueOf(this.f49599h4.mo15757m9() / f), 13));
            this.f49602m9.dispose();
            this.f49599h4.dispose();
        }
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m72359kk() {
        return this.f49604x1;
    }

    /* JADX INFO: renamed from: to */
    public final float m72360to() {
        return this.f49601kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final C14365qy m72361x1() {
        return this.f49600k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m72358k4(AbstractC12002ck abstractC12002ck, C4459os c4459os, C4443em c4443em, float f) {
        if (m72359kk()) {
            this.f49602m9.mo17502k4(abstractC12002ck, C7019kk.m27462to(Float.valueOf(c4459os.m18285k4() - (c4443em.m18173k4() / 2.0f)), 13) * f, C7019kk.m27462to(Float.valueOf(c4459os.m18290x1() - (c4443em.m18177x1() / 2.0f)), 13) * f, c4443em.m18173k4() * f, c4443em.m18177x1() * f);
        } else {
            m72361x1().m69870wy().mo64341k4(abstractC12002ck, C7019kk.m27462to(Float.valueOf(c4459os.m18285k4() - (c4443em.m18173k4() / 2.0f)), 13), C7019kk.m27462to(Float.valueOf(c4459os.m18290x1() - (c4443em.m18177x1() / 2.0f)), 13), c4443em.m18173k4(), c4443em.m18177x1());
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m72353k4(C14365qy c14365qy) {
        this.f49600k4 = c14365qy;
    }

    /* JADX INFO: renamed from: k4 */
    private void m72354k4(boolean z) {
        this.f49604x1 = z;
    }
}

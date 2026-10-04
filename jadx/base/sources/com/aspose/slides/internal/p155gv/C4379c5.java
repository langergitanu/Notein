package com.aspose.slides.internal.p155gv;

import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p138fu.C4122du;
import com.aspose.slides.internal.p138fu.C4127k4;
import com.aspose.slides.internal.p151gj.C4316du;
import com.aspose.slides.internal.p151gj.C4317dy;
import com.aspose.slides.internal.p151gj.C4327up;
import com.aspose.slides.internal.p302nm.C6922h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p416tb.C10898dy;
import com.aspose.slides.internal.p416tb.C10922yj;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p505xn.C12565ks;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.gv.c5 */
/* JADX INFO: loaded from: classes.dex */
public class C4379c5 extends AbstractC4385m9 {

    /* JADX INFO: renamed from: c5 */
    private int f11891c5;

    /* JADX INFO: renamed from: du */
    private int f11892du;

    /* JADX INFO: renamed from: dy */
    private C4317dy f11893dy;

    /* JADX INFO: renamed from: h4 */
    private int f11894h4;

    /* JADX INFO: renamed from: jd */
    private int f11895jd;

    /* JADX INFO: renamed from: m9 */
    private boolean f11896m9;

    /* JADX INFO: renamed from: to */
    private byte[] f11897to;

    public C4379c5(C10898dy c10898dy, C4316du c4316du) {
        super(c10898dy);
        this.f11897to = m17689k4(C6922h4.m27133k4(c4316du));
        this.f11892du = 8;
        this.f11891c5 = 8;
        this.f11894h4 = 8;
        this.f11895jd = 8;
    }

    @Override // com.aspose.slides.internal.p155gv.AbstractC4385m9
    /* JADX INFO: renamed from: du */
    public int mo17690du() {
        return 1;
    }

    @Override // com.aspose.slides.internal.p155gv.AbstractC4385m9
    /* JADX INFO: renamed from: h4 */
    public C4317dy mo17691h4() {
        return this.f11893dy;
    }

    @Override // com.aspose.slides.internal.p416tb.C10894bv, com.aspose.slides.internal.p416tb.AbstractC10914up
    /* JADX INFO: renamed from: k4 */
    public void mo9082k4(C10922yj c10922yj) {
        ((AbstractC4385m9) this).f11938kk.m17701k4(this.f11897to, null, new C12007ix(0.0f, 0.0f, this.f11892du, this.f11894h4), null, this.f11896m9);
        super.mo9082k4(c10922yj);
    }

    @Override // com.aspose.slides.internal.p155gv.AbstractC4385m9, com.aspose.slides.internal.p416tb.C10894bv
    /* JADX INFO: renamed from: x1 */
    public void mo9084x1(C10922yj c10922yj) {
        super.mo9084x1(c10922yj);
        c10922yj.m52652k4("/PaintType", 1);
        c10922yj.m52652k4("/TilingType", 3);
        c10922yj.m52654k4("/BBox", new C12007ix(0.0f, 0.0f, this.f11892du, this.f11894h4));
        c10922yj.m52652k4("/XStep", this.f11891c5);
        c10922yj.m52652k4("/YStep", this.f11895jd);
        c10922yj.m52650k4("/Resources");
        c10922yj.m52643dy();
        ((AbstractC4385m9) this).f11937k4.m52563k4(c10922yj);
        c10922yj.m52640c5();
        m17756kk(c10922yj);
    }

    public C4379c5(C10898dy c10898dy, C4327up c4327up) {
        int iM27462to;
        super(c10898dy);
        C4127k4 c4122du = m52569m9().m52458k4(c4327up.m17416x1(), new C12009k4[]{null}) ? new C4122du(c4327up) : new C4127k4(c4327up);
        try {
            if (c4122du.m16536h4() == 4 || c4122du.m16536h4() == 5) {
                this.f11897to = c4327up.m17416x1();
            } else {
                C3152yj c3152yj = new C3152yj();
                c4122du.m16541k4(c3152yj, 5);
                this.f11897to = C12565ks.m58632x1(c3152yj);
            }
            if (C4127k4.m16529x1(c4122du.m16534dy())) {
                this.f11897to = m17689k4(this.f11897to);
            }
            this.f11892du = c4122du.m16549x1();
            this.f11894h4 = c4122du.m16546kk();
            this.f11896m9 = true;
            this.f11893dy = c4327up.m17385fa();
            if (c4327up.m17388up() == 4) {
                this.f11891c5 = C7019kk.m27462to(Float.valueOf(C14116yg.m67481k4(c10898dy.m52463up().m52493m9().m52546x1(), this.f11892du) * 2.0f), 13);
                iM27462to = C7019kk.m27462to(Float.valueOf(C14116yg.m67481k4(c10898dy.m52463up().m52493m9().m52545kk(), this.f11894h4) * 2.0f), 13);
            } else {
                this.f11891c5 = this.f11892du;
                iM27462to = this.f11894h4;
            }
            this.f11895jd = iM27462to;
            c4122du.dispose();
        } catch (Throwable th) {
            c4122du.dispose();
            throw th;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private byte[] m17689k4(byte[] bArr) {
        if (!m52569m9().m52464x1().m52634x6() && m52569m9().m52464x1().m52624rv() != null) {
            return bArr;
        }
        C4127k4 c4127k4 = new C4127k4(bArr);
        try {
            c4127k4.m16542k4(m52569m9().m52464x1().m52624rv());
            C3152yj c3152yj = new C3152yj();
            try {
                if (c4127k4.m16536h4() == 4) {
                    c4127k4.m16541k4(c3152yj, 4);
                } else {
                    c4127k4.m16541k4(c3152yj, 5);
                }
                byte[] array = c3152yj.toArray();
                c3152yj.dispose();
                return array;
            } catch (Throwable th) {
                c3152yj.dispose();
                throw th;
            }
        } finally {
            c4127k4.dispose();
        }
    }
}

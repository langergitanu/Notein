package com.aspose.slides.internal.p168hj;

import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p151gj.C4317dy;
import com.aspose.slides.internal.p416tb.C10893b3;
import com.aspose.slides.internal.p416tb.C10898dy;
import com.aspose.slides.internal.p416tb.C10922yj;
import com.aspose.slides.internal.p475wh.C12007ix;

/* JADX INFO: renamed from: com.aspose.slides.internal.hj.h4 */
/* JADX INFO: loaded from: classes.dex */
public class C4589h4 extends C10893b3 {

    /* JADX INFO: renamed from: k4 */
    private C3152yj f12819k4;

    /* JADX INFO: renamed from: kk */
    private C12007ix f12820kk;

    /* JADX INFO: renamed from: to */
    private C4317dy f12821to;

    public C4589h4(C10898dy c10898dy) {
        super(c10898dy);
        this.f12820kk = C12007ix.f40519k4.Clone();
    }

    /* JADX INFO: renamed from: du */
    public final C12007ix m18958du() {
        return this.f12820kk;
    }

    /* JADX INFO: renamed from: h4 */
    public final C3152yj m18959h4() {
        return this.f12819k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m18960k4(C3152yj c3152yj) {
        this.f12819k4 = c3152yj;
    }

    @Override // com.aspose.slides.internal.p416tb.C10894bv
    /* JADX INFO: renamed from: x1 */
    public void mo9084x1(C10922yj c10922yj) {
        super.mo9084x1(c10922yj);
        c10922yj.m52666kk("/Type", "/XObject");
        c10922yj.m52666kk("/Subtype", "/Form");
        c10922yj.m52652k4("/FormType", 1);
        c10922yj.m52654k4("/BBox", this.f12820kk.Clone());
        C4317dy c4317dy = this.f12821to;
        if (c4317dy != null) {
            c10922yj.m52653k4("/Matrix", c4317dy);
        }
        this.f37962x1.m52453dy().m18965k4(c10922yj, "/Resources");
    }

    @Override // com.aspose.slides.internal.p416tb.C10894bv, com.aspose.slides.internal.p416tb.AbstractC10914up
    /* JADX INFO: renamed from: k4 */
    public void mo9082k4(C10922yj c10922yj) {
        m52427k4(this.f12819k4.getBuffer(), 0, (int) this.f12819k4.getLength());
        super.mo9082k4(c10922yj);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m18961k4(C12007ix c12007ix) {
        c12007ix.CloneTo(this.f12820kk);
    }
}

package com.aspose.slides.internal.p039be;

import com.aspose.slides.internal.p173hx.C4693m9;
import com.aspose.slides.internal.p416tb.C10898dy;
import com.aspose.slides.internal.p416tb.C10922yj;

/* JADX INFO: renamed from: com.aspose.slides.internal.be.du */
/* JADX INFO: loaded from: classes3.dex */
public class C1681du extends AbstractC1688to {

    /* JADX INFO: renamed from: k4 */
    private C4693m9 f6387k4;

    public C1681du(C10898dy c10898dy) {
        super(c10898dy);
    }

    @Override // com.aspose.slides.internal.p039be.AbstractC1688to
    /* JADX INFO: renamed from: du */
    public String mo9083du() {
        return "/FontFile2";
    }

    @Override // com.aspose.slides.internal.p416tb.C10894bv, com.aspose.slides.internal.p416tb.AbstractC10914up
    /* JADX INFO: renamed from: k4 */
    public void mo9082k4(C10922yj c10922yj) {
        C4693m9 c4693m9 = new C4693m9(m52569m9());
        this.f6387k4 = c4693m9;
        c4693m9.m19550k4((int) m52421k4().getLength());
        super.mo9082k4(c10922yj);
        this.f6387k4.mo9082k4(c10922yj);
    }

    @Override // com.aspose.slides.internal.p416tb.C10894bv
    /* JADX INFO: renamed from: x1 */
    public void mo9084x1(C10922yj c10922yj) {
        c10922yj.m52666kk("/Length1", this.f6387k4.m52565c5());
    }
}

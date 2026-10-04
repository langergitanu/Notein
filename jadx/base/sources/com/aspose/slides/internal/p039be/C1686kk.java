package com.aspose.slides.internal.p039be;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p416tb.AbstractC10914up;
import com.aspose.slides.internal.p416tb.C10894bv;
import com.aspose.slides.internal.p416tb.C10898dy;
import com.aspose.slides.internal.p416tb.C10922yj;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.be.kk */
/* JADX INFO: loaded from: classes3.dex */
public class C1686kk extends AbstractC10914up {

    /* JADX INFO: renamed from: k4 */
    private AbstractC1689x1 f6394k4;

    /* JADX INFO: renamed from: kk */
    private AbstractC1688to f6395kk;

    /* JADX INFO: renamed from: to */
    private C10894bv f6396to;

    public C1686kk(C10898dy c10898dy, AbstractC1689x1 abstractC1689x1) {
        AbstractC1688to c1683h4;
        super(c10898dy);
        this.f6394k4 = abstractC1689x1;
        int iM9120ix = abstractC1689x1.m9120ix();
        if (iM9120ix == 0 || iM9120ix == 1) {
            c1683h4 = new C1683h4(c10898dy, "/CIDFontType0C");
        } else {
            if (iM9120ix != 2 && iM9120ix != 3) {
                throw new InvalidOperationException("Unexpected font type.");
            }
            c1683h4 = new C1681du(c10898dy);
        }
        this.f6395kk = c1683h4;
        if (this.f37962x1.m52454fa()) {
            this.f6396to = new C10894bv(c10898dy);
        }
    }

    /* JADX INFO: renamed from: x1 */
    private void m9102x1(C10922yj c10922yj) {
        c10922yj.m52676k4(this);
        c10922yj.m52643dy();
        c10922yj.m52666kk("/Type", "/FontDescriptor");
        c10922yj.m52666kk("/FontName", C14113y2.m67402k4("/{0}", this.f6394k4.m9127to()));
        c10922yj.m52652k4("/StemV", 80);
        c10922yj.m52652k4("/Descent", this.f6394k4.m9117du());
        c10922yj.m52652k4("/Ascent", this.f6394k4.m9119h4());
        c10922yj.m52652k4("/CapHeight", this.f6394k4.m9124ks());
        c10922yj.m52652k4("/Flags", this.f6394k4.m9126rv());
        c10922yj.m52651k4("/ItalicAngle", this.f6394k4.m9125ne());
        c10922yj.m52654k4("/FontBBox", this.f6394k4.m9133x6().Clone());
        if (this.f37962x1.m52454fa() && (this.f37962x1.m52464x1().m52604ck() == 3 || this.f37962x1.m52464x1().m52604ck() == 4)) {
            c10922yj.m52666kk("/CIDSet", this.f6396to.m52565c5());
        }
        AbstractC1688to abstractC1688to = this.f6395kk;
        if (abstractC1688to != null) {
            c10922yj.m52666kk(abstractC1688to.mo9083du(), this.f6395kk.m52565c5());
        }
        c10922yj.m52640c5();
        c10922yj.m52678x1();
    }

    @Override // com.aspose.slides.internal.p416tb.AbstractC10914up
    /* JADX INFO: renamed from: k4 */
    public void mo9082k4(C10922yj c10922yj) {
        m9102x1(c10922yj);
        AbstractC1688to abstractC1688to = this.f6395kk;
        if (abstractC1688to != null) {
            this.f6394k4.mo9087k4(abstractC1688to.m52421k4());
            this.f6395kk.mo9082k4(c10922yj);
        }
        if (this.f37962x1.m52454fa()) {
            for (byte b : this.f6394k4.mo9089k4()) {
                this.f6396to.m52422k4(b);
            }
            this.f6396to.mo9082k4(c10922yj);
        }
    }
}

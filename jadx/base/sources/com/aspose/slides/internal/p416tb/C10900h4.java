package com.aspose.slides.internal.p416tb;

import com.aspose.slides.internal.p168hj.C4590k4;
import com.aspose.slides.internal.p357qc.C9830c5;
import com.aspose.slides.internal.p357qc.C9834k4;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.tb.h4 */
/* JADX INFO: loaded from: classes4.dex */
public class C10900h4 extends AbstractC10914up {

    /* JADX INFO: renamed from: c5 */
    private C9834k4 f37885c5;

    /* JADX INFO: renamed from: ck */
    private String f37886ck;

    /* JADX INFO: renamed from: du */
    private final C10915uz f37887du;

    /* JADX INFO: renamed from: dy */
    private C10910rv f37888dy;

    /* JADX INFO: renamed from: fa */
    private C4590k4 f37889fa;

    /* JADX INFO: renamed from: h4 */
    private final C10908ne f37890h4;

    /* JADX INFO: renamed from: jd */
    private C9830c5 f37891jd;

    /* JADX INFO: renamed from: k4 */
    private C10906lr f37892k4;

    /* JADX INFO: renamed from: kk */
    private int f37893kk;

    /* JADX INFO: renamed from: m9 */
    private C10899fa f37894m9;

    /* JADX INFO: renamed from: to */
    private int f37895to;

    public C10900h4(C10898dy c10898dy) {
        super(c10898dy);
        this.f37893kk = 0;
        this.f37895to = 0;
        this.f37887du = new C10915uz(c10898dy);
        this.f37890h4 = new C10908ne(c10898dy);
        if (this.f37962x1.m52451ck()) {
            this.f37885c5 = new C9834k4();
            this.f37891jd = new C9830c5(this.f37962x1);
            m52467du().m52502k4(true);
        }
        if (this.f37962x1.m52454fa()) {
            this.f37894m9 = new C10899fa(this.f37962x1);
        }
        if (this.f37962x1.m52451ck() || this.f37962x1.m52454fa()) {
            this.f37888dy = new C10910rv(this.f37962x1);
        }
    }

    /* JADX INFO: renamed from: ks */
    private boolean m52466ks() {
        return this.f37889fa != null;
    }

    /* JADX INFO: renamed from: du */
    public final C10906lr m52467du() {
        if (this.f37892k4 == null) {
            this.f37892k4 = new C10906lr(this.f37962x1);
        }
        return this.f37892k4;
    }

    /* JADX INFO: renamed from: h4 */
    public final int m52468h4() {
        return this.f37895to;
    }

    /* JADX INFO: renamed from: k4 */
    public final C10915uz m52469k4() {
        return this.f37887du;
    }

    /* JADX INFO: renamed from: kk */
    public final C9830c5 m52471kk() {
        return this.f37891jd;
    }

    /* JADX INFO: renamed from: to */
    public final C4590k4 m52472to() {
        if (this.f37889fa == null) {
            this.f37889fa = new C4590k4(this.f37962x1);
        }
        return this.f37889fa;
    }

    /* JADX INFO: renamed from: x1 */
    public final C10908ne m52473x1() {
        return this.f37890h4;
    }

    @Override // com.aspose.slides.internal.p416tb.AbstractC10914up
    /* JADX INFO: renamed from: k4 */
    public void mo9082k4(C10922yj c10922yj) {
        c10922yj.m52649k4(m52570yj());
        c10922yj.m52676k4(this);
        c10922yj.m52643dy();
        c10922yj.m52666kk("/Type", "/Catalog");
        c10922yj.m52666kk("/Pages", this.f37887du.m52565c5());
        if (this.f37962x1.m52451ck()) {
            c10922yj.m52666kk("/StructTreeRoot", this.f37891jd.m52565c5());
            if (!C14113y2.m67411k4(this.f37886ck)) {
                c10922yj.m52670to("/Lang", this.f37886ck);
            }
            this.f37885c5.m48506k4(c10922yj);
        }
        c10922yj.m52650k4("/MarkInfo");
        c10922yj.m52643dy();
        c10922yj.m52660k4("/Marked", true);
        c10922yj.m52640c5();
        c10922yj.m52666kk("/Outlines", this.f37890h4.m52508x1());
        if (!this.f37890h4.m52507k4()) {
            c10922yj.m52666kk("/PageMode", "/UseOutlines");
        }
        C10906lr c10906lr = this.f37892k4;
        if (c10906lr != null) {
            c10922yj.m52666kk("/ViewerPreferences", c10906lr.m52565c5());
        }
        int i = this.f37893kk;
        if (i != 0) {
            c10922yj.m52666kk("/PageLayout", C10896ck.m52440kk(i));
        }
        int i2 = this.f37895to;
        if (i2 != 0) {
            c10922yj.m52666kk("/PageMode", C10896ck.m52444x1(i2));
            if (m52468h4() == 3) {
                m52467du().m52503x1(true);
            }
        }
        if (m52466ks()) {
            c10922yj.m52666kk("/AcroForm", m52472to().m52565c5());
        }
        if (this.f37962x1.m52451ck() || this.f37962x1.m52454fa()) {
            c10922yj.m52666kk("/Metadata", this.f37888dy.m52565c5());
        }
        if (this.f37962x1.m52454fa()) {
            c10922yj.m52666kk("/OutputIntents", " ");
            c10922yj.m52650k4("[");
            c10922yj.m52643dy();
            c10922yj.m52666kk("/Type", "/OutputIntent");
            c10922yj.m52659k4("/Info", "sRGB IEC61966-2.1", true);
            c10922yj.m52666kk("/S", "/GTS_PDFA1");
            c10922yj.m52659k4("/OutputConditionIdentifier", "Custom", true);
            c10922yj.m52666kk("/DestOutputProfile", this.f37894m9.m52565c5());
            c10922yj.m52640c5();
            c10922yj.m52650k4("]");
        }
        c10922yj.m52640c5();
        c10922yj.m52678x1();
        C10906lr c10906lr2 = this.f37892k4;
        if (c10906lr2 != null) {
            c10906lr2.mo9082k4(c10922yj);
        }
        if (m52466ks()) {
            m52472to().mo9082k4(c10922yj);
        }
        this.f37887du.mo9082k4(c10922yj);
        this.f37890h4.m52505k4(c10922yj);
        if (this.f37962x1.m52454fa()) {
            this.f37894m9.mo9082k4(c10922yj);
        }
        if (this.f37962x1.m52451ck() || this.f37962x1.m52454fa()) {
            this.f37888dy.mo9082k4(c10922yj);
        }
        if (this.f37962x1.m52451ck()) {
            this.f37891jd.mo9082k4(c10922yj);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m52470k4(String str) {
        this.f37886ck = str;
    }
}

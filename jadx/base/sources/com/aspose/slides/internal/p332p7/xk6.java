package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.facebook.common.callercontext.ContextChain;

/* JADX INFO: loaded from: classes4.dex */
public class xk6 extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private boolean f32908du;

    /* JADX INFO: renamed from: dy */
    private ltr f32909dy;

    /* JADX INFO: renamed from: h4 */
    private boolean f32910h4;

    /* JADX INFO: renamed from: kk */
    private int f32911kk;

    /* JADX INFO: renamed from: m9 */
    private boolean f32912m9;

    /* JADX INFO: renamed from: to */
    private int f32913to;

    /* JADX INFO: renamed from: k4 */
    public static final int f32906k4 = ctl.m29804k4("slides");

    /* JADX INFO: renamed from: x1 */
    public static final int f32907x1 = t9l.m41606k4("clr");

    /* JADX INFO: renamed from: c5 */
    private static final C7017h4 f32905c5 = new C7017h4("prnWhat", "clrMode", "hiddenSlides", "scaleToFitPaper", "frameSlides", "extLst");

    public xk6() {
        m44465x1();
    }

    public xk6(final AbstractC13912i5 abstractC13912i5) {
        m44465x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.xk6.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = xk6.f32905c5.m27428k4(str);
                if (iM27428k4 == 0) {
                    xk6.this.f32911kk = ctl.m29804k4(str2);
                    return true;
                }
                if (iM27428k4 == 1) {
                    xk6.this.f32913to = t9l.m41606k4(str2);
                    return true;
                }
                if (iM27428k4 == 2) {
                    xk6.this.f32908du = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 == 3) {
                    xk6.this.f32910h4 = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 != 4) {
                    return false;
                }
                xk6.this.f32912m9 = C13850af.m65068c5(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.xk6.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (xk6.f32905c5.m27428k4(abstractC13912i5.mo65023fa()) != 5) {
                    return false;
                }
                xk6.this.f32909dy = new ltr(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    private void m44465x1() {
        this.f32911kk = f32906k4;
        this.f32913to = f32907x1;
        this.f32908du = false;
        this.f32910h4 = false;
        this.f32912m9 = false;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        int i = this.f32911kk;
        if (i != f32906k4) {
            c3059ii.m12955x1("prnWhat", ctl.m29805k4(i));
        }
        int i2 = this.f32913to;
        if (i2 != f32907x1) {
            c3059ii.m12955x1("clrMode", t9l.m41607k4(i2));
        }
        boolean z = this.f32908du;
        if (z) {
            c3059ii.m12955x1("hiddenSlides", z ? "1" : "0");
        }
        boolean z2 = this.f32910h4;
        if (z2) {
            c3059ii.m12955x1("scaleToFitPaper", z2 ? "1" : "0");
        }
        boolean z3 = this.f32912m9;
        if (z3) {
            c3059ii.m12955x1("frameSlides", z3 ? "1" : "0");
        }
        ltr ltrVar = this.f32909dy;
        if (ltrVar != null) {
            ltrVar.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}

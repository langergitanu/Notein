package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.wn */
/* JADX INFO: loaded from: classes4.dex */
public class C9124wn extends AbstractC7361bz {

    /* JADX INFO: renamed from: m9 */
    private static final C7017h4 f32424m9 = new C7017h4("l", "r", "t", "b", "header", "footer");

    /* JADX INFO: renamed from: du */
    private double f32425du;

    /* JADX INFO: renamed from: h4 */
    private double f32426h4;

    /* JADX INFO: renamed from: k4 */
    private double f32427k4;

    /* JADX INFO: renamed from: kk */
    private double f32428kk;

    /* JADX INFO: renamed from: to */
    private double f32429to;

    /* JADX INFO: renamed from: x1 */
    private double f32430x1;

    public C9124wn() {
        m43830x1();
    }

    public C9124wn(AbstractC13912i5 abstractC13912i5) {
        m43830x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.wn.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C9124wn.f32424m9.m27428k4(str);
                if (iM27428k4 == 0) {
                    C9124wn.this.f32427k4 = AbstractC7361bz.m29300yj(str2);
                    return true;
                }
                if (iM27428k4 == 1) {
                    C9124wn.this.f32430x1 = AbstractC7361bz.m29300yj(str2);
                    return true;
                }
                if (iM27428k4 == 2) {
                    C9124wn.this.f32428kk = AbstractC7361bz.m29300yj(str2);
                    return true;
                }
                if (iM27428k4 == 3) {
                    C9124wn.this.f32429to = AbstractC7361bz.m29300yj(str2);
                    return true;
                }
                if (iM27428k4 == 4) {
                    C9124wn.this.f32425du = AbstractC7361bz.m29300yj(str2);
                    return true;
                }
                if (iM27428k4 != 5) {
                    return false;
                }
                C9124wn.this.f32426h4 = AbstractC7361bz.m29300yj(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: x1 */
    private void m43830x1() {
        this.f32427k4 = Double.NaN;
        this.f32430x1 = Double.NaN;
        this.f32428kk = Double.NaN;
        this.f32429to = Double.NaN;
        this.f32425du = Double.NaN;
        this.f32426h4 = Double.NaN;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("l", C13850af.m65101k4(this.f32427k4));
        c3059ii.m12955x1("r", C13850af.m65101k4(this.f32430x1));
        c3059ii.m12955x1("t", C13850af.m65101k4(this.f32428kk));
        c3059ii.m12955x1("b", C13850af.m65101k4(this.f32429to));
        c3059ii.m12955x1("header", C13850af.m65101k4(this.f32425du));
        c3059ii.m12955x1("footer", C13850af.m65101k4(this.f32426h4));
        c3059ii.mo21898jd();
    }
}

package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes4.dex */
public class adk extends AbstractC7361bz {

    /* JADX INFO: renamed from: m9 */
    private static final C7017h4 f19972m9 = new C7017h4("left", "right", "top", "bottom", "header", "footer");

    /* JADX INFO: renamed from: du */
    private double f19973du;

    /* JADX INFO: renamed from: h4 */
    private double f19974h4;

    /* JADX INFO: renamed from: k4 */
    private double f19975k4;

    /* JADX INFO: renamed from: kk */
    private double f19976kk;

    /* JADX INFO: renamed from: to */
    private double f19977to;

    /* JADX INFO: renamed from: x1 */
    private double f19978x1;

    public adk() {
        m28143x1();
    }

    public adk(AbstractC13912i5 abstractC13912i5) {
        m28143x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.adk.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = adk.f19972m9.m27428k4(str);
                if (iM27428k4 == 0) {
                    adk.this.f19975k4 = AbstractC7361bz.m29300yj(str2);
                    return true;
                }
                if (iM27428k4 == 1) {
                    adk.this.f19978x1 = AbstractC7361bz.m29300yj(str2);
                    return true;
                }
                if (iM27428k4 == 2) {
                    adk.this.f19976kk = AbstractC7361bz.m29300yj(str2);
                    return true;
                }
                if (iM27428k4 == 3) {
                    adk.this.f19977to = AbstractC7361bz.m29300yj(str2);
                    return true;
                }
                if (iM27428k4 == 4) {
                    adk.this.f19973du = AbstractC7361bz.m29300yj(str2);
                    return true;
                }
                if (iM27428k4 != 5) {
                    return false;
                }
                adk.this.f19974h4 = AbstractC7361bz.m29300yj(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: x1 */
    private void m28143x1() {
        this.f19975k4 = Double.NaN;
        this.f19978x1 = Double.NaN;
        this.f19976kk = Double.NaN;
        this.f19977to = Double.NaN;
        this.f19973du = Double.NaN;
        this.f19974h4 = Double.NaN;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("left", C13850af.m65101k4(this.f19975k4));
        c3059ii.m12955x1("right", C13850af.m65101k4(this.f19978x1));
        c3059ii.m12955x1("top", C13850af.m65101k4(this.f19976kk));
        c3059ii.m12955x1("bottom", C13850af.m65101k4(this.f19977to));
        c3059ii.m12955x1("header", C13850af.m65101k4(this.f19973du));
        c3059ii.m12955x1("footer", C13850af.m65101k4(this.f19974h4));
        c3059ii.mo21898jd();
    }
}

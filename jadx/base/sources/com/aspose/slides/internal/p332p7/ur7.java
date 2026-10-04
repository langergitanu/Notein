package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes4.dex */
public class ur7 extends AbstractC7361bz {

    /* JADX INFO: renamed from: k4 */
    public static final int f31395k4 = oaj.m38121k4("sum");

    /* JADX INFO: renamed from: m9 */
    private static final C7017h4 f31396m9 = new C7017h4("function", "leftLabels", "topLabels", "link", "dataRefs");

    /* JADX INFO: renamed from: du */
    private boolean f31397du;

    /* JADX INFO: renamed from: h4 */
    private xqj f31398h4;

    /* JADX INFO: renamed from: kk */
    private boolean f31399kk;

    /* JADX INFO: renamed from: to */
    private boolean f31400to;

    /* JADX INFO: renamed from: x1 */
    private int f31401x1;

    public ur7() {
        m42539x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m42539x1() {
        this.f31401x1 = f31395k4;
        this.f31399kk = false;
        this.f31400to = false;
        this.f31397du = false;
    }

    public ur7(final AbstractC13912i5 abstractC13912i5) {
        m42539x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.ur7.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = ur7.f31396m9.m27428k4(str);
                if (iM27428k4 == 0) {
                    ur7.this.f31401x1 = oaj.m38121k4(str2);
                    return true;
                }
                if (iM27428k4 == 1) {
                    ur7.this.f31399kk = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 == 2) {
                    ur7.this.f31400to = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 != 3) {
                    return false;
                }
                ur7.this.f31397du = C13850af.m65068c5(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.ur7.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (ur7.f31396m9.m27428k4(abstractC13912i5.mo65023fa()) != 4) {
                    return false;
                }
                ur7.this.f31398h4 = new xqj(abstractC13912i5);
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        int i = this.f31401x1;
        if (i != f31395k4) {
            c3059ii.m12955x1("function", oaj.m38122k4(i));
        }
        boolean z = this.f31399kk;
        if (z) {
            c3059ii.m12955x1("leftLabels", z ? "1" : "0");
        }
        boolean z2 = this.f31400to;
        if (z2) {
            c3059ii.m12955x1("topLabels", z2 ? "1" : "0");
        }
        boolean z3 = this.f31397du;
        if (z3) {
            c3059ii.m12955x1("link", z3 ? "1" : "0");
        }
        xqj xqjVar = this.f31398h4;
        if (xqjVar != null) {
            xqjVar.mo6846k4("ssml", c3059ii, "dataRefs");
        }
        c3059ii.mo21898jd();
    }
}

package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.l2 */
/* JADX INFO: loaded from: classes4.dex */
public class C8153l2 extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f26050to = new C7017h4("xml:id", "invertible", "mapping");

    /* JADX INFO: renamed from: k4 */
    private String f26051k4;

    /* JADX INFO: renamed from: kk */
    private C8743s6 f26052kk;

    /* JADX INFO: renamed from: x1 */
    private boolean f26053x1;

    public C8153l2() {
        m35828x1();
        this.f26052kk = new C8743s6();
    }

    /* JADX INFO: renamed from: x1 */
    private void m35828x1() {
        this.f26053x1 = false;
    }

    public C8153l2(final AbstractC13912i5 abstractC13912i5) {
        m35828x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.l2.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C8153l2.f26050to.m27428k4(str);
                if (iM27428k4 == 0) {
                    C8153l2.this.f26051k4 = str2;
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                C8153l2.this.f26053x1 = C13850af.m65068c5(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.l2.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (C8153l2.f26050to.m27428k4(abstractC13912i5.mo65023fa()) != 2) {
                    return false;
                }
                C8153l2.this.f26052kk = new C8743s6(abstractC13912i5);
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f26051k4;
        if (str3 != null) {
            c3059ii.m12955x1("xml:id", str3);
        }
        boolean z = this.f26053x1;
        if (z) {
            c3059ii.m12955x1("invertible", z ? "1" : "0");
        }
        this.f26052kk.mo6846k4("inkml", c3059ii, "mapping");
        c3059ii.mo21898jd();
    }
}

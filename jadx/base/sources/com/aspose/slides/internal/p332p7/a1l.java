package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes4.dex */
public class a1l extends AbstractC7361bz {

    /* JADX INFO: renamed from: h4 */
    private static final C7017h4 f19797h4 = new C7017h4("table:field-number", "table:value", "table:operator", "table:case-sensitive", "table:data-type");

    /* JADX INFO: renamed from: du */
    private int f19798du;

    /* JADX INFO: renamed from: k4 */
    private long f19799k4;

    /* JADX INFO: renamed from: kk */
    private String f19800kk;

    /* JADX INFO: renamed from: to */
    private String f19801to;

    /* JADX INFO: renamed from: x1 */
    private String f19802x1;

    public a1l() {
        m27899x1();
    }

    public a1l(AbstractC13912i5 abstractC13912i5) {
        m27899x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.a1l.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = a1l.f19797h4.m27428k4(str);
                if (iM27428k4 == 0) {
                    a1l.this.f19799k4 = AbstractC7361bz.m29295ne(str2);
                    return true;
                }
                if (iM27428k4 == 1) {
                    a1l.this.f19802x1 = str2;
                    return true;
                }
                if (iM27428k4 == 2) {
                    a1l.this.f19800kk = str2;
                    return true;
                }
                if (iM27428k4 == 3) {
                    a1l.this.f19801to = str2;
                    return true;
                }
                if (iM27428k4 != 4) {
                    return false;
                }
                a1l.this.f19798du = cqn.m29722k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: x1 */
    private void m27899x1() {
        this.f19798du = 0;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("table:field-number", C13850af.m65147x1(this.f19799k4));
        c3059ii.m12955x1("table:value", this.f19802x1);
        c3059ii.m12955x1("table:operator", this.f19800kk);
        c3059ii.m12955x1("table:case-sensitive", this.f19801to);
        c3059ii.m12955x1("table:data-type", cqn.m29723k4(this.f19798du));
        c3059ii.mo21898jd();
    }
}

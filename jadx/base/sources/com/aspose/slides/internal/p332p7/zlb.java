package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class zlb extends AbstractC7361bz {

    /* JADX INFO: renamed from: h4 */
    private static final C7017h4 f33935h4 = new C7017h4("presentation:object", "svg:x", "svg:y", "svg:width", "svg:height");

    /* JADX INFO: renamed from: du */
    private String f33936du;

    /* JADX INFO: renamed from: k4 */
    private int f33937k4;

    /* JADX INFO: renamed from: kk */
    private String f33938kk;

    /* JADX INFO: renamed from: to */
    private String f33939to;

    /* JADX INFO: renamed from: x1 */
    private String f33940x1;

    public zlb() {
        m45652x1();
    }

    public zlb(AbstractC13912i5 abstractC13912i5) {
        m45652x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.zlb.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = zlb.f33935h4.m27428k4(str);
                if (iM27428k4 == 0) {
                    zlb.this.f33937k4 = xky.m44467k4(str2);
                    return true;
                }
                if (iM27428k4 == 1) {
                    zlb.this.f33940x1 = str2;
                    return true;
                }
                if (iM27428k4 == 2) {
                    zlb.this.f33938kk = str2;
                    return true;
                }
                if (iM27428k4 == 3) {
                    zlb.this.f33939to = str2;
                    return true;
                }
                if (iM27428k4 != 4) {
                    return false;
                }
                zlb.this.f33936du = str2;
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: x1 */
    private void m45652x1() {
        this.f33937k4 = 0;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("presentation:object", xky.m44468k4(this.f33937k4));
        c3059ii.m12955x1("svg:x", this.f33940x1);
        c3059ii.m12955x1("svg:y", this.f33938kk);
        c3059ii.m12955x1("svg:width", this.f33939to);
        c3059ii.m12955x1("svg:height", this.f33936du);
        c3059ii.mo21898jd();
    }
}

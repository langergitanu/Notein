package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class tx9 extends AbstractC7361bz {

    /* JADX INFO: renamed from: h4 */
    private static final C7017h4 f30953h4 = new C7017h4("style:rel-width", "fo:start-indent", "fo:end-indent", "fo:space-before", "fo:space-after");

    /* JADX INFO: renamed from: du */
    private String f30954du;

    /* JADX INFO: renamed from: k4 */
    private String f30955k4;

    /* JADX INFO: renamed from: kk */
    private String f30956kk;

    /* JADX INFO: renamed from: to */
    private String f30957to;

    /* JADX INFO: renamed from: x1 */
    private String f30958x1;

    public tx9() {
        m41997x1();
    }

    public tx9(AbstractC13912i5 abstractC13912i5) {
        m41997x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.tx9.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = tx9.f30953h4.m27428k4(str);
                if (iM27428k4 == 0) {
                    tx9.this.f30955k4 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    tx9.this.f30958x1 = str2;
                    return true;
                }
                if (iM27428k4 == 2) {
                    tx9.this.f30956kk = str2;
                    return true;
                }
                if (iM27428k4 == 3) {
                    tx9.this.f30957to = str2;
                    return true;
                }
                if (iM27428k4 != 4) {
                    return false;
                }
                tx9.this.f30954du = str2;
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: x1 */
    private void m41997x1() {
        this.f30958x1 = "0cm";
        this.f30956kk = "0cm";
        this.f30957to = "0cm";
        this.f30954du = "0cm";
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("style:rel-width", this.f30955k4);
        if (!"0cm".equals(this.f30958x1)) {
            c3059ii.m12955x1("fo:start-indent", this.f30958x1);
        }
        if (!"0cm".equals(this.f30956kk)) {
            c3059ii.m12955x1("fo:end-indent", this.f30956kk);
        }
        if (!"0cm".equals(this.f30957to)) {
            c3059ii.m12955x1("fo:space-before", this.f30957to);
        }
        if (!"0cm".equals(this.f30954du)) {
            c3059ii.m12955x1("fo:space-after", this.f30954du);
        }
        c3059ii.mo21898jd();
    }
}

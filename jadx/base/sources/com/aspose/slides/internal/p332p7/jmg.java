package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class jmg extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f25259du = new C7017h4("table:style-name", "table:paragraph-style-name", "text:style-name", "text:paragraph-style-name");

    /* JADX INFO: renamed from: k4 */
    private String f25260k4;

    /* JADX INFO: renamed from: kk */
    private String f25261kk;

    /* JADX INFO: renamed from: to */
    private String f25262to;

    /* JADX INFO: renamed from: x1 */
    private String f25263x1;

    public jmg() {
    }

    /* JADX INFO: renamed from: k4 */
    public final String m34841k4() {
        return this.f25260k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m34842x1() {
        return this.f25261kk;
    }

    public jmg(AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.jmg.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = jmg.f25259du.m27428k4(str);
                if (iM27428k4 == 0) {
                    jmg.this.f25260k4 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    jmg.this.f25263x1 = str2;
                    return true;
                }
                if (iM27428k4 == 2) {
                    jmg.this.f25261kk = str2;
                    return true;
                }
                if (iM27428k4 != 3) {
                    return false;
                }
                jmg.this.f25262to = str2;
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("table:style-name", this.f25260k4);
        c3059ii.m12955x1("table:paragraph-style-name", this.f25263x1);
        c3059ii.m12955x1("text:style-name", this.f25261kk);
        c3059ii.m12955x1("text:paragraph-style-name", this.f25262to);
        c3059ii.mo21898jd();
    }
}

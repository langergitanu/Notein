package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes4.dex */
public class jk9 extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private String f25183kk;

    /* JADX INFO: renamed from: to */
    private int f25184to;

    /* JADX INFO: renamed from: x1 */
    private long f25185x1;

    /* JADX INFO: renamed from: k4 */
    public static final int f25182k4 = fg1.m31775k4("ascending");

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f25181du = new C7017h4("table:field-number", "table:data-type", "table:order");

    public jk9() {
        m34742x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m34742x1() {
        this.f25184to = f25182k4;
    }

    public jk9(AbstractC13912i5 abstractC13912i5) {
        m34742x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.jk9.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = jk9.f25181du.m27428k4(str);
                if (iM27428k4 == 0) {
                    jk9.this.f25185x1 = AbstractC7361bz.m29295ne(str2);
                    return true;
                }
                if (iM27428k4 == 1) {
                    jk9.this.f25183kk = str2;
                    return true;
                }
                if (iM27428k4 != 2) {
                    return false;
                }
                jk9.this.f25184to = fg1.m31775k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("table:field-number", C13850af.m65147x1(this.f25185x1));
        c3059ii.m12955x1("table:data-type", this.f25183kk);
        int i = this.f25184to;
        if (i != f25182k4) {
            c3059ii.m12955x1("table:order", fg1.m31776k4(i));
        }
        c3059ii.mo21898jd();
    }
}

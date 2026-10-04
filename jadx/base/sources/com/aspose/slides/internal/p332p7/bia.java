package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes4.dex */
public class bia extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f20568to = new C7017h4("text:name", "text:display-outline-level", "text:separation-character");

    /* JADX INFO: renamed from: k4 */
    private String f20569k4;

    /* JADX INFO: renamed from: kk */
    private char f20570kk;

    /* JADX INFO: renamed from: x1 */
    private long f20571x1;

    public bia() {
        m28911x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m28911x1() {
        this.f20570kk = (char) 0;
    }

    public bia(AbstractC13912i5 abstractC13912i5) {
        m28911x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.bia.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = bia.f20568to.m27428k4(str);
                if (iM27428k4 == 0) {
                    bia.this.f20569k4 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    bia.this.f20571x1 = AbstractC7361bz.m29295ne(str2);
                    return true;
                }
                if (iM27428k4 != 2) {
                    return false;
                }
                bia.this.f20570kk = C13850af.m65075jd(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("text:name", this.f20569k4);
        c3059ii.m12955x1("text:display-outline-level", C13850af.m65147x1(this.f20571x1));
        char c = this.f20570kk;
        if (c != 0) {
            c3059ii.m12955x1("text:separation-character", C13850af.m65100k4(c));
        }
        c3059ii.mo21898jd();
    }
}

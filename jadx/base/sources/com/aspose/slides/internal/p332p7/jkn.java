package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class jkn extends AbstractC7361bz {

    /* JADX INFO: renamed from: k4 */
    public static final int f25198k4 = el1.m31122k4("short");

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f25199to = new C7017h4("number:style", "number:calendar");

    /* JADX INFO: renamed from: kk */
    private String f25200kk;

    /* JADX INFO: renamed from: x1 */
    private int f25201x1;

    public jkn() {
        m34756x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m34756x1() {
        this.f25201x1 = f25198k4;
    }

    public jkn(AbstractC13912i5 abstractC13912i5) {
        m34756x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.jkn.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = jkn.f25199to.m27428k4(str);
                if (iM27428k4 == 0) {
                    jkn.this.f25201x1 = el1.m31122k4(str2);
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                jkn.this.f25200kk = str2;
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        int i = this.f25201x1;
        if (i != f25198k4) {
            c3059ii.m12955x1("number:style", el1.m31123k4(i));
        }
        if (this.f25200kk != null) {
            if (c3059ii.mo12952k4("urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0") == null) {
                c3059ii.m12954to("xmlns", "odfnum", null, "urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0");
            }
            c3059ii.m12955x1("number:calendar", this.f25200kk);
        }
        c3059ii.mo21898jd();
    }
}

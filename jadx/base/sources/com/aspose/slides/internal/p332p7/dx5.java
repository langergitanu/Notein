package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class dx5 extends AbstractC7361bz {

    /* JADX INFO: renamed from: k4 */
    public static final int f21926k4 = cc9.m29561k4("number");

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f21927to = new C7017h4("text:style-name", "text:display");

    /* JADX INFO: renamed from: kk */
    private int f21928kk;

    /* JADX INFO: renamed from: x1 */
    private String f21929x1;

    public dx5() {
        m30689x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m30689x1() {
        this.f21928kk = f21926k4;
    }

    public dx5(AbstractC13912i5 abstractC13912i5) {
        m30689x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.dx5.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = dx5.f21927to.m27428k4(str);
                if (iM27428k4 == 0) {
                    dx5.this.f21929x1 = str2;
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                dx5.this.f21928kk = cc9.m29561k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f21929x1;
        if (str3 != null) {
            c3059ii.m12955x1("text:style-name", str3);
        }
        int i = this.f21928kk;
        if (i != f21926k4) {
            c3059ii.m12955x1("text:display", cc9.m29562k4(i));
        }
        c3059ii.mo21898jd();
    }
}

package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class kke extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f25737du = new C7017h4("table:field-name", "table:member-type", "table:member-name", "table:type");

    /* JADX INFO: renamed from: k4 */
    private String f25738k4;

    /* JADX INFO: renamed from: kk */
    private String f25739kk;

    /* JADX INFO: renamed from: to */
    private int f25740to;

    /* JADX INFO: renamed from: x1 */
    private int f25741x1;

    public kke() {
        m35471x1();
    }

    public kke(AbstractC13912i5 abstractC13912i5) {
        m35471x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.kke.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = kke.f25737du.m27428k4(str);
                if (iM27428k4 == 0) {
                    kke.this.f25738k4 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    kke.this.f25741x1 = cgl.m29597k4(str2);
                    return true;
                }
                if (iM27428k4 == 2) {
                    kke.this.f25739kk = str2;
                    return true;
                }
                if (iM27428k4 != 3) {
                    return false;
                }
                kke.this.f25740to = wdy.m43635k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: x1 */
    private void m35471x1() {
        this.f25741x1 = 0;
        this.f25740to = 0;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("table:field-name", this.f25738k4);
        c3059ii.m12955x1("table:member-type", cgl.m29598k4(this.f25741x1));
        String str3 = this.f25739kk;
        if (str3 != null) {
            c3059ii.m12955x1("table:member-name", str3);
        }
        c3059ii.m12955x1("table:type", wdy.m43636k4(this.f25740to));
        c3059ii.mo21898jd();
    }
}

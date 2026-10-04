package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class swa extends AbstractC7361bz {

    /* JADX INFO: renamed from: h4 */
    private static final C7017h4 f30455h4 = new C7017h4("text:table-name", "text:table-type", "text:database-name", "text:condition", "connection-resource");

    /* JADX INFO: renamed from: du */
    private r1l f30456du;

    /* JADX INFO: renamed from: k4 */
    private String f30457k4;

    /* JADX INFO: renamed from: kk */
    private String f30458kk;

    /* JADX INFO: renamed from: to */
    private String f30459to;

    /* JADX INFO: renamed from: x1 */
    private int f30460x1;

    public swa() {
        m41401x1();
    }

    public swa(final AbstractC13912i5 abstractC13912i5) {
        m41401x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.swa.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = swa.f30455h4.m27428k4(str);
                if (iM27428k4 == 0) {
                    swa.this.f30457k4 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    swa.this.f30460x1 = tgm.m41711k4(str2);
                    return true;
                }
                if (iM27428k4 == 2) {
                    swa.this.f30458kk = str2;
                    return true;
                }
                if (iM27428k4 != 3) {
                    return false;
                }
                swa.this.f30459to = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.swa.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (swa.f30455h4.m27428k4(abstractC13912i5.mo65023fa()) != 4) {
                    return false;
                }
                swa.this.f30456du = new r1l(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    private void m41401x1() {
        this.f30460x1 = 0;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("text:table-name", this.f30457k4);
        int i = this.f30460x1;
        if (i != 0) {
            c3059ii.m12955x1("text:table-type", tgm.m41712k4(i));
        }
        String str3 = this.f30458kk;
        if (str3 != null) {
            c3059ii.m12955x1("text:database-name", str3);
        }
        String str4 = this.f30459to;
        if (str4 != null) {
            c3059ii.m12955x1("text:condition", str4);
        }
        r1l r1lVar = this.f30456du;
        if (r1lVar != null) {
            r1lVar.mo6846k4("form", c3059ii, "connection-resource");
        }
        c3059ii.mo21898jd();
    }
}

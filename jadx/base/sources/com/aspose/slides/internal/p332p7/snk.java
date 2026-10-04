package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class snk extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f30270kk = new C7017h4("office:target-frame-name", "xlink:show");

    /* JADX INFO: renamed from: k4 */
    private String f30271k4;

    /* JADX INFO: renamed from: x1 */
    private int f30272x1;

    public snk() {
        m41192x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m41192x1() {
        this.f30272x1 = 0;
    }

    public snk(AbstractC13912i5 abstractC13912i5) {
        m41192x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.snk.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = snk.f30270kk.m27428k4(str);
                if (iM27428k4 == 0) {
                    snk.this.f30271k4 = str2;
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                snk.this.f30272x1 = ina.m34328k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f30271k4;
        if (str3 != null) {
            c3059ii.m12955x1("office:target-frame-name", str3);
        }
        int i = this.f30272x1;
        if (i != 0) {
            c3059ii.m12955x1("xlink:show", ina.m34329k4(i));
        }
        c3059ii.mo21898jd();
    }
}

package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class k1j extends AbstractC7361bz {

    /* JADX INFO: renamed from: k4 */
    public static final int f25428k4 = ts3.m41869k4("equal");

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f25429to = new C7017h4("operator", "val");

    /* JADX INFO: renamed from: kk */
    private String f25430kk;

    /* JADX INFO: renamed from: x1 */
    private int f25431x1;

    public k1j() {
        m35080x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m35080x1() {
        this.f25431x1 = f25428k4;
    }

    public k1j(AbstractC13912i5 abstractC13912i5) {
        m35080x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.k1j.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = k1j.f25429to.m27428k4(str);
                if (iM27428k4 == 0) {
                    k1j.this.f25431x1 = ts3.m41869k4(str2);
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                k1j.this.f25430kk = str2;
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        int i = this.f25431x1;
        if (i != f25428k4) {
            c3059ii.m12955x1("operator", ts3.m41870k4(i));
        }
        String str3 = this.f25430kk;
        if (str3 != null) {
            c3059ii.m12955x1("val", str3);
        }
        c3059ii.mo21898jd();
    }
}

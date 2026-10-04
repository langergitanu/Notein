package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class nlj extends AbstractC7361bz {

    /* JADX INFO: renamed from: k4 */
    public static final int f27454k4 = fg1.m31775k4("ascending");

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f27455to = new C7017h4("table:data-type", "table:order");

    /* JADX INFO: renamed from: kk */
    private int f27456kk;

    /* JADX INFO: renamed from: x1 */
    private String f27457x1;

    public nlj() {
        m37705x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m37705x1() {
        this.f27456kk = f27454k4;
    }

    public nlj(AbstractC13912i5 abstractC13912i5) {
        m37705x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.nlj.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = nlj.f27455to.m27428k4(str);
                if (iM27428k4 == 0) {
                    nlj.this.f27457x1 = str2;
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                nlj.this.f27456kk = fg1.m31775k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("table:data-type", this.f27457x1);
        int i = this.f27456kk;
        if (i != f27454k4) {
            c3059ii.m12955x1("table:order", fg1.m31776k4(i));
        }
        c3059ii.mo21898jd();
    }
}

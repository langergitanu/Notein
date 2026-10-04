package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class tan extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f30644kk = new C7017h4("w_Id", "w_DisplacedByCustomXml");

    /* JADX INFO: renamed from: k4 */
    private String f30645k4;

    /* JADX INFO: renamed from: x1 */
    private int f30646x1;

    public tan() {
        m41630x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m41630x1() {
        this.f30646x1 = 0;
    }

    public tan(AbstractC13912i5 abstractC13912i5) {
        m41630x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.tan.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = tan.f30644kk.m27428k4(str);
                if (iM27428k4 == 0) {
                    tan.this.f30645k4 = str2;
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                tan.this.f30646x1 = ges.m32492k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("w:id", this.f30645k4);
        int i = this.f30646x1;
        if (i != 0) {
            c3059ii.m12955x1("w:displacedByCustomXml", ges.m32493k4(i));
        }
        c3059ii.mo21898jd();
    }
}

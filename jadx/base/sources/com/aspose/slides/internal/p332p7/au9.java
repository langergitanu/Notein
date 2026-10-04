package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class au9 extends AbstractC7361bz {

    /* JADX INFO: renamed from: k4 */
    public static final int f20229k4 = bhu.m28903k4("simple");

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f20230to = new C7017h4("xlink:href", "xlink:type");

    /* JADX INFO: renamed from: kk */
    private int f20231kk;

    /* JADX INFO: renamed from: x1 */
    private String f20232x1;

    public au9() {
        m28489x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m28489x1() {
        this.f20231kk = f20229k4;
    }

    public au9(AbstractC13912i5 abstractC13912i5) {
        m28489x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.au9.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = au9.f20230to.m27428k4(str);
                if (iM27428k4 == 0) {
                    au9.this.f20232x1 = str2;
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                au9.this.f20231kk = bhu.m28903k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("xlink:href", this.f20232x1);
        int i = this.f20231kk;
        if (i != f20229k4) {
            c3059ii.m12955x1("xlink:type", bhu.m28904k4(i));
        }
        c3059ii.mo21898jd();
    }
}

package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class cn9 extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f21144x1 = new C7017h4("w_Val");

    /* JADX INFO: renamed from: k4 */
    private int f21145k4;

    public cn9() {
        m29694x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m29694x1() {
        this.f21145k4 = 0;
    }

    public cn9(AbstractC13912i5 abstractC13912i5) {
        m29694x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.cn9.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (cn9.f21144x1.m27428k4(str) != 0) {
                    return false;
                }
                cn9.this.f21145k4 = ozh.m38543k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("w:val", ozh.m38544k4(this.f21145k4));
        c3059ii.mo21898jd();
    }
}

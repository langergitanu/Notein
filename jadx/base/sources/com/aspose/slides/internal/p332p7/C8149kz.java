package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.kz */
/* JADX INFO: loaded from: classes4.dex */
public class C8149kz extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f26025to = new C7017h4("name", "value", "units");

    /* JADX INFO: renamed from: k4 */
    private String f26026k4;

    /* JADX INFO: renamed from: kk */
    private String f26027kk;

    /* JADX INFO: renamed from: x1 */
    private String f26028x1;

    public C8149kz() {
    }

    public C8149kz(AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.kz.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C8149kz.f26025to.m27428k4(str);
                if (iM27428k4 == 0) {
                    C8149kz.this.f26026k4 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    C8149kz.this.f26028x1 = str2;
                    return true;
                }
                if (iM27428k4 != 2) {
                    return false;
                }
                C8149kz.this.f26027kk = str2;
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("name", this.f26026k4);
        c3059ii.m12955x1("value", this.f26028x1);
        String str3 = this.f26027kk;
        if (str3 != null) {
            c3059ii.m12955x1("units", str3);
        }
        c3059ii.mo21898jd();
    }
}

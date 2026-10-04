package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class zvz extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f34182to = new C7017h4("table:sort-mode", "table:data-field", "table:order");

    /* JADX INFO: renamed from: k4 */
    private int f34183k4;

    /* JADX INFO: renamed from: kk */
    private int f34184kk;

    /* JADX INFO: renamed from: x1 */
    private String f34185x1;

    public zvz() {
        m45977x1();
    }

    public zvz(AbstractC13912i5 abstractC13912i5) {
        m45977x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.zvz.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = zvz.f34182to.m27428k4(str);
                if (iM27428k4 == 0) {
                    zvz.this.f34183k4 = u6l.m42108k4(str2);
                    return true;
                }
                if (iM27428k4 == 1) {
                    zvz.this.f34185x1 = str2;
                    return true;
                }
                if (iM27428k4 != 2) {
                    return false;
                }
                zvz.this.f34184kk = fg1.m31775k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29298x1(abstractC13912i5);
    }

    /* JADX INFO: renamed from: x1 */
    private void m45977x1() {
        this.f34183k4 = 0;
        this.f34184kk = 0;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("table:sort-mode", u6l.m42109k4(this.f34183k4));
        String str3 = this.f34185x1;
        if (str3 != null) {
            c3059ii.m12955x1("table:data-field", str3);
        }
        c3059ii.m12955x1("table:order", fg1.m31776k4(this.f34184kk));
        c3059ii.mo21898jd();
    }
}

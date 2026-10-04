package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class itd extends AbstractC7361bz {

    /* JADX INFO: renamed from: c5 */
    private hhj f24931c5;

    /* JADX INFO: renamed from: du */
    private l4q f24932du;

    /* JADX INFO: renamed from: dy */
    private s2v f24933dy;

    /* JADX INFO: renamed from: h4 */
    private hw5 f24934h4;

    /* JADX INFO: renamed from: kk */
    private int f24935kk;

    /* JADX INFO: renamed from: m9 */
    private nn2 f24936m9;

    /* JADX INFO: renamed from: to */
    private String f24937to;

    /* JADX INFO: renamed from: x1 */
    private String f24938x1;

    /* JADX INFO: renamed from: k4 */
    public static final int f24930k4 = de9.m30306k4("pending");

    /* JADX INFO: renamed from: jd */
    private static final C7017h4 f24929jd = new C7017h4("table:id", "table:acceptance-state", "table:rejecting-change-id", "source-range-address", "target-range-address", "change-info", "dependencies", "deletions");

    public itd() {
        m34461x1();
        this.f24932du = new l4q();
        this.f24934h4 = new hw5();
        this.f24936m9 = new nn2();
    }

    public itd(final AbstractC13912i5 abstractC13912i5) {
        m34461x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.itd.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = itd.f24929jd.m27428k4(str);
                if (iM27428k4 == 0) {
                    itd.this.f24938x1 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    itd.this.f24935kk = de9.m30306k4(str2);
                    return true;
                }
                if (iM27428k4 != 2) {
                    return false;
                }
                itd.this.f24937to = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.itd.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = itd.f24929jd.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 3) {
                    itd.this.f24932du = new l4q(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 == 4) {
                    itd.this.f24934h4 = new hw5(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 == 5) {
                    itd.this.f24936m9 = new nn2(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 == 6) {
                    itd.this.f24933dy = new s2v(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 != 7) {
                    return false;
                }
                itd.this.f24931c5 = new hhj(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    private void m34461x1() {
        this.f24935kk = f24930k4;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("table:id", this.f24938x1);
        int i = this.f24935kk;
        if (i != f24930k4) {
            c3059ii.m12955x1("table:acceptance-state", de9.m30307k4(i));
        }
        String str3 = this.f24937to;
        if (str3 != null) {
            c3059ii.m12955x1("table:rejecting-change-id", str3);
        }
        this.f24932du.mo6846k4("table", c3059ii, "source-range-address");
        this.f24934h4.mo6846k4("table", c3059ii, "target-range-address");
        this.f24936m9.mo6846k4("office", c3059ii, "change-info");
        s2v s2vVar = this.f24933dy;
        if (s2vVar != null) {
            s2vVar.mo6846k4("table", c3059ii, "dependencies");
        }
        hhj hhjVar = this.f24931c5;
        if (hhjVar != null) {
            hhjVar.mo6846k4("table", c3059ii, "deletions");
        }
        c3059ii.mo21898jd();
    }
}

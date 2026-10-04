package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class azg extends AbstractC7361bz {

    /* JADX INFO: renamed from: c5 */
    private gp2 f20350c5;

    /* JADX INFO: renamed from: du */
    private s6u f20351du;

    /* JADX INFO: renamed from: dy */
    private hhj f20352dy;

    /* JADX INFO: renamed from: h4 */
    private nn2 f20353h4;

    /* JADX INFO: renamed from: kk */
    private int f20354kk;

    /* JADX INFO: renamed from: m9 */
    private s2v f20355m9;

    /* JADX INFO: renamed from: to */
    private String f20356to;

    /* JADX INFO: renamed from: x1 */
    private String f20357x1;

    /* JADX INFO: renamed from: k4 */
    public static final int f20349k4 = de9.m30306k4("pending");

    /* JADX INFO: renamed from: jd */
    private static final C7017h4 f20348jd = new C7017h4("table:id", "table:acceptance-state", "table:rejecting-change-id", "cell-address", "change-info", "dependencies", "deletions", "previous");

    public azg() {
        m28647x1();
        this.f20351du = new s6u();
        this.f20353h4 = new nn2();
        this.f20350c5 = new gp2();
    }

    public azg(final AbstractC13912i5 abstractC13912i5) {
        m28647x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.azg.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = azg.f20348jd.m27428k4(str);
                if (iM27428k4 == 0) {
                    azg.this.f20357x1 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    azg.this.f20354kk = de9.m30306k4(str2);
                    return true;
                }
                if (iM27428k4 != 2) {
                    return false;
                }
                azg.this.f20356to = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.azg.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = azg.f20348jd.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 3) {
                    azg.this.f20351du = new s6u(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 == 4) {
                    azg.this.f20353h4 = new nn2(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 == 5) {
                    azg.this.f20355m9 = new s2v(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 == 6) {
                    azg.this.f20352dy = new hhj(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 != 7) {
                    return false;
                }
                azg.this.f20350c5 = new gp2(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    private void m28647x1() {
        this.f20354kk = f20349k4;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("table:id", this.f20357x1);
        int i = this.f20354kk;
        if (i != f20349k4) {
            c3059ii.m12955x1("table:acceptance-state", de9.m30307k4(i));
        }
        String str3 = this.f20356to;
        if (str3 != null) {
            c3059ii.m12955x1("table:rejecting-change-id", str3);
        }
        this.f20351du.mo6846k4("table", c3059ii, "cell-address");
        this.f20353h4.mo6846k4("office", c3059ii, "change-info");
        s2v s2vVar = this.f20355m9;
        if (s2vVar != null) {
            s2vVar.mo6846k4("table", c3059ii, "dependencies");
        }
        hhj hhjVar = this.f20352dy;
        if (hhjVar != null) {
            hhjVar.mo6846k4("table", c3059ii, "deletions");
        }
        this.f20350c5.mo6846k4("table", c3059ii, "previous");
        c3059ii.mo21898jd();
    }
}

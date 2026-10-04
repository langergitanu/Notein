package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes4.dex */
public class xps extends AbstractC7361bz {

    /* JADX INFO: renamed from: c5 */
    private nn2 f33004c5;

    /* JADX INFO: renamed from: ck */
    private hhj f33005ck;

    /* JADX INFO: renamed from: du */
    private int f33006du;

    /* JADX INFO: renamed from: dy */
    private String f33007dy;

    /* JADX INFO: renamed from: h4 */
    private String f33008h4;

    /* JADX INFO: renamed from: jd */
    private s2v f33009jd;

    /* JADX INFO: renamed from: kk */
    private int f33010kk;

    /* JADX INFO: renamed from: m9 */
    private int f33011m9;

    /* JADX INFO: renamed from: to */
    private long f33012to;

    /* JADX INFO: renamed from: x1 */
    private int f33013x1;

    /* JADX INFO: renamed from: k4 */
    public static final int f33003k4 = de9.m30306k4("pending");

    /* JADX INFO: renamed from: fa */
    private static final C7017h4 f33002fa = new C7017h4("table:type", "table:position", "table:count", "table:table", "table:id", "table:acceptance-state", "table:rejecting-change-id", "change-info", "dependencies", "deletions");

    public xps() {
        m44578x1();
        this.f33004c5 = new nn2();
    }

    public xps(final AbstractC13912i5 abstractC13912i5) {
        m44578x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.xps.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (xps.f33002fa.m27428k4(str)) {
                    case 0:
                        xps.this.f33013x1 = tnt.m41814k4(str2);
                        break;
                    case 1:
                        xps.this.f33010kk = C13850af.m65151yj(str2);
                        break;
                    case 2:
                        xps.this.f33012to = AbstractC7361bz.m29295ne(str2);
                        break;
                    case 3:
                        xps.this.f33006du = C13850af.m65151yj(str2);
                        break;
                    case 4:
                        xps.this.f33008h4 = str2;
                        break;
                    case 5:
                        xps.this.f33011m9 = de9.m30306k4(str2);
                        break;
                    case 6:
                        xps.this.f33007dy = str2;
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.xps.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = xps.f33002fa.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 7) {
                    xps.this.f33004c5 = new nn2(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 == 8) {
                    xps.this.f33009jd = new s2v(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 != 9) {
                    return false;
                }
                xps.this.f33005ck = new hhj(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    private void m44578x1() {
        this.f33013x1 = 0;
        this.f33012to = 1L;
        this.f33006du = 0;
        this.f33011m9 = f33003k4;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("table:type", tnt.m41815k4(this.f33013x1));
        c3059ii.m12955x1("table:position", C13850af.m65103k4(this.f33010kk));
        long j = this.f33012to;
        if ((4294967295L & j) != 1) {
            c3059ii.m12955x1("table:count", C13850af.m65147x1(j));
        }
        int i = this.f33006du;
        if (i != 0) {
            c3059ii.m12955x1("table:table", C13850af.m65103k4(i));
        }
        c3059ii.m12955x1("table:id", this.f33008h4);
        int i2 = this.f33011m9;
        if (i2 != f33003k4) {
            c3059ii.m12955x1("table:acceptance-state", de9.m30307k4(i2));
        }
        String str3 = this.f33007dy;
        if (str3 != null) {
            c3059ii.m12955x1("table:rejecting-change-id", str3);
        }
        this.f33004c5.mo6846k4("office", c3059ii, "change-info");
        s2v s2vVar = this.f33009jd;
        if (s2vVar != null) {
            s2vVar.mo6846k4("table", c3059ii, "dependencies");
        }
        hhj hhjVar = this.f33005ck;
        if (hhjVar != null) {
            hhjVar.mo6846k4("table", c3059ii, "deletions");
        }
        c3059ii.mo21898jd();
    }
}

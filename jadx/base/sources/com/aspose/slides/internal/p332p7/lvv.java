package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes4.dex */
public class lvv extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f26549du = new C7017h4("wrapText", "distL", "distR", "wrapPolygon");

    /* JADX INFO: renamed from: k4 */
    private int f26550k4;

    /* JADX INFO: renamed from: kk */
    private long f26551kk;

    /* JADX INFO: renamed from: to */
    private cii f26552to;

    /* JADX INFO: renamed from: x1 */
    private long f26553x1;

    public lvv() {
        m36476x1();
        this.f26552to = new cii();
    }

    public lvv(final AbstractC13912i5 abstractC13912i5) {
        m36476x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.lvv.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = lvv.f26549du.m27428k4(str);
                if (iM27428k4 == 0) {
                    lvv.this.f26550k4 = p2c.m38580k4(str2);
                    return true;
                }
                if (iM27428k4 == 1) {
                    lvv.this.f26553x1 = AbstractC7361bz.m29295ne(str2);
                    return true;
                }
                if (iM27428k4 != 2) {
                    return false;
                }
                lvv.this.f26551kk = AbstractC7361bz.m29295ne(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.lvv.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (lvv.f26549du.m27428k4(abstractC13912i5.mo65023fa()) != 3) {
                    return false;
                }
                lvv.this.f26552to = new cii(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    private void m36476x1() {
        this.f26550k4 = 0;
        this.f26553x1 = 4294967295L;
        this.f26551kk = 4294967295L;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("wrapText", p2c.m38581k4(this.f26550k4));
        long j = this.f26553x1;
        if ((j & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("distL", C13850af.m65147x1(j));
        }
        long j2 = this.f26551kk;
        if ((j2 & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("distR", C13850af.m65147x1(j2));
        }
        this.f26552to.mo6846k4("wp", c3059ii, "wrapPolygon");
        c3059ii.mo21898jd();
    }
}

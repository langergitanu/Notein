package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes4.dex */
public class cnx extends AbstractC7361bz {

    /* JADX INFO: renamed from: m9 */
    private static final C7017h4 f21147m9 = new C7017h4("wrapText", "distT", "distB", "distL", "distR", "effectExtent");

    /* JADX INFO: renamed from: du */
    private long f21148du;

    /* JADX INFO: renamed from: h4 */
    private foz f21149h4;

    /* JADX INFO: renamed from: k4 */
    private int f21150k4;

    /* JADX INFO: renamed from: kk */
    private long f21151kk;

    /* JADX INFO: renamed from: to */
    private long f21152to;

    /* JADX INFO: renamed from: x1 */
    private long f21153x1;

    public cnx() {
        m29702x1();
    }

    public cnx(final AbstractC13912i5 abstractC13912i5) {
        m29702x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.cnx.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = cnx.f21147m9.m27428k4(str);
                if (iM27428k4 == 0) {
                    cnx.this.f21150k4 = p2c.m38580k4(str2);
                    return true;
                }
                if (iM27428k4 == 1) {
                    cnx.this.f21153x1 = AbstractC7361bz.m29295ne(str2);
                    return true;
                }
                if (iM27428k4 == 2) {
                    cnx.this.f21151kk = AbstractC7361bz.m29295ne(str2);
                    return true;
                }
                if (iM27428k4 == 3) {
                    cnx.this.f21152to = AbstractC7361bz.m29295ne(str2);
                    return true;
                }
                if (iM27428k4 != 4) {
                    return false;
                }
                cnx.this.f21148du = AbstractC7361bz.m29295ne(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.cnx.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (cnx.f21147m9.m27428k4(abstractC13912i5.mo65023fa()) != 5) {
                    return false;
                }
                cnx.this.f21149h4 = new foz(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    private void m29702x1() {
        this.f21150k4 = 0;
        this.f21153x1 = 4294967295L;
        this.f21151kk = 4294967295L;
        this.f21152to = 4294967295L;
        this.f21148du = 4294967295L;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("wrapText", p2c.m38581k4(this.f21150k4));
        long j = this.f21153x1;
        if ((j & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("distT", C13850af.m65147x1(j));
        }
        long j2 = this.f21151kk;
        if ((j2 & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("distB", C13850af.m65147x1(j2));
        }
        long j3 = this.f21152to;
        if ((j3 & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("distL", C13850af.m65147x1(j3));
        }
        long j4 = this.f21148du;
        if ((j4 & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("distR", C13850af.m65147x1(j4));
        }
        foz fozVar = this.f21149h4;
        if (fozVar != null) {
            fozVar.mo6846k4("wp", c3059ii, "effectExtent");
        }
        c3059ii.mo21898jd();
    }
}

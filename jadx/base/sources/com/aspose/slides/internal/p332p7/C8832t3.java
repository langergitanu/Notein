package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.t3 */
/* JADX INFO: loaded from: classes4.dex */
public class C8832t3 extends AbstractC7361bz {

    /* JADX INFO: renamed from: m9 */
    private static final C7017h4 f30558m9 = new C7017h4("begChr", "sepChr", "endChr", "grow", "shp", "ctrlPr");

    /* JADX INFO: renamed from: du */
    private C7506dr f30559du;

    /* JADX INFO: renamed from: h4 */
    private C7782go f30560h4;

    /* JADX INFO: renamed from: k4 */
    private C8376ns f30561k4;

    /* JADX INFO: renamed from: kk */
    private C8376ns f30562kk;

    /* JADX INFO: renamed from: to */
    private C9408zw f30563to;

    /* JADX INFO: renamed from: x1 */
    private C8376ns f30564x1;

    public C8832t3() {
    }

    /* JADX INFO: renamed from: du */
    public final C9408zw m41517du() {
        return this.f30563to;
    }

    /* JADX INFO: renamed from: h4 */
    public final C7506dr m41518h4() {
        return this.f30559du;
    }

    /* JADX INFO: renamed from: kk */
    public final C8376ns m41523kk() {
        return this.f30564x1;
    }

    /* JADX INFO: renamed from: m9 */
    public final C7782go m41525m9() {
        return this.f30560h4;
    }

    /* JADX INFO: renamed from: to */
    public final C8376ns m41526to() {
        return this.f30562kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final C8376ns m41527x1() {
        return this.f30561k4;
    }

    public C8832t3(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.t3.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C8832t3.f30558m9.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    C8832t3.this.f30561k4 = new C8376ns(abstractC13912i5);
                } else if (iM27428k4 == 1) {
                    C8832t3.this.f30564x1 = new C8376ns(abstractC13912i5);
                } else if (iM27428k4 == 2) {
                    C8832t3.this.f30562kk = new C8376ns(abstractC13912i5);
                } else if (iM27428k4 == 3) {
                    C8832t3.this.f30563to = new C9408zw(abstractC13912i5);
                } else if (iM27428k4 == 4) {
                    C8832t3.this.f30559du = new C7506dr(abstractC13912i5);
                } else {
                    if (iM27428k4 != 5) {
                        return false;
                    }
                    C8832t3.this.f30560h4 = new C7782go(abstractC13912i5);
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C7782go m41519k4() {
        if (this.f30560h4 != null) {
            throw new Exception("Only one <ctrlPr> element can be added.");
        }
        C7782go c7782go = new C7782go();
        this.f30560h4 = c7782go;
        return c7782go;
    }

    /* JADX INFO: renamed from: kk */
    public final void m41524kk(C8376ns c8376ns) {
        this.f30562kk = c8376ns;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m41528x1(C8376ns c8376ns) {
        this.f30564x1 = c8376ns;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m41520k4(C7506dr c7506dr) {
        this.f30559du = c7506dr;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m41521k4(C8376ns c8376ns) {
        this.f30561k4 = c8376ns;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m41522k4(C9408zw c9408zw) {
        this.f30563to = c9408zw;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        C8376ns c8376ns = this.f30561k4;
        if (c8376ns != null) {
            c8376ns.mo6846k4("m", c3059ii, "begChr");
        }
        C8376ns c8376ns2 = this.f30564x1;
        if (c8376ns2 != null) {
            c8376ns2.mo6846k4("m", c3059ii, "sepChr");
        }
        C8376ns c8376ns3 = this.f30562kk;
        if (c8376ns3 != null) {
            c8376ns3.mo6846k4("m", c3059ii, "endChr");
        }
        C9408zw c9408zw = this.f30563to;
        if (c9408zw != null) {
            c9408zw.mo6846k4("m", c3059ii, "grow");
        }
        C7506dr c7506dr = this.f30559du;
        if (c7506dr != null) {
            c7506dr.mo6846k4("m", c3059ii, "shp");
        }
        C7782go c7782go = this.f30560h4;
        if (c7782go != null) {
            c7782go.mo6846k4("m", c3059ii, "ctrlPr");
        }
        c3059ii.mo21898jd();
    }
}

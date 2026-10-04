package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.ct */
/* JADX INFO: loaded from: classes4.dex */
public class C7438ct extends AbstractC7361bz {

    /* JADX INFO: renamed from: m9 */
    private static final C7017h4 f21247m9 = new C7017h4("name", "scene3d", "sp3d", "txPr", "style", "extLst");

    /* JADX INFO: renamed from: du */
    private C8601qh f21248du;

    /* JADX INFO: renamed from: h4 */
    private C8397nz f21249h4;

    /* JADX INFO: renamed from: k4 */
    private String f21250k4;

    /* JADX INFO: renamed from: kk */
    private C8638qy f21251kk;

    /* JADX INFO: renamed from: to */
    private C8270mj f21252to;

    /* JADX INFO: renamed from: x1 */
    private C8820sx f21253x1;

    public C7438ct() {
    }

    /* JADX INFO: renamed from: x1 */
    public final C8601qh m29803x1() {
        return this.f21248du;
    }

    public C7438ct(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.ct.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (C7438ct.f21247m9.m27428k4(str) != 0) {
                    return false;
                }
                C7438ct.this.f21250k4 = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.ct.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C7438ct.f21247m9.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 1) {
                    C7438ct.this.f21253x1 = new C8820sx(abstractC13912i5);
                } else if (iM27428k4 == 2) {
                    C7438ct.this.f21251kk = new C8638qy(abstractC13912i5);
                } else if (iM27428k4 == 3) {
                    C7438ct.this.f21252to = new C8270mj(abstractC13912i5);
                } else if (iM27428k4 == 4) {
                    C7438ct.this.f21248du = new C8601qh(abstractC13912i5);
                } else {
                    if (iM27428k4 != 5) {
                        return false;
                    }
                    C7438ct.this.f21249h4 = new C8397nz(abstractC13912i5);
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final String m29802k4() {
        return this.f21250k4;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("name", this.f21250k4);
        C8820sx c8820sx = this.f21253x1;
        if (c8820sx != null) {
            c8820sx.mo6846k4("dgm", c3059ii, "scene3d");
        }
        C8638qy c8638qy = this.f21251kk;
        if (c8638qy != null) {
            c8638qy.mo6846k4("dgm", c3059ii, "sp3d");
        }
        C8270mj c8270mj = this.f21252to;
        if (c8270mj != null) {
            c8270mj.mo6846k4("dgm", c3059ii, "txPr");
        }
        C8601qh c8601qh = this.f21248du;
        if (c8601qh != null) {
            c8601qh.mo6846k4("dgm", c3059ii, "style");
        }
        C8397nz c8397nz = this.f21249h4;
        if (c8397nz != null) {
            c8397nz.mo6846k4("dgm", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}

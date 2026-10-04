package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.xq */
/* JADX INFO: loaded from: classes4.dex */
public class C9226xq extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f33017du = new C7017h4("anchor", "norm", "up", "extLst");

    /* JADX INFO: renamed from: k4 */
    private C9165x2 f33018k4;

    /* JADX INFO: renamed from: kk */
    private C8428od f33019kk;

    /* JADX INFO: renamed from: to */
    private C8397nz f33020to;

    /* JADX INFO: renamed from: x1 */
    private C8428od f33021x1;

    public C9226xq() {
        this.f33018k4 = new C9165x2();
        this.f33021x1 = new C8428od();
        this.f33019kk = new C8428od();
    }

    /* JADX INFO: renamed from: kk */
    public final C8428od m44585kk() {
        return this.f33019kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final C8428od m44586x1() {
        return this.f33021x1;
    }

    public C9226xq(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.xq.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C9226xq.f33017du.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    C9226xq.this.f33018k4 = new C9165x2(abstractC13912i5);
                } else if (iM27428k4 == 1) {
                    C9226xq.this.f33021x1 = new C8428od(abstractC13912i5);
                } else if (iM27428k4 == 2) {
                    C9226xq.this.f33019kk = new C8428od(abstractC13912i5);
                } else {
                    if (iM27428k4 != 3) {
                        return false;
                    }
                    C9226xq.this.f33020to = new C8397nz(abstractC13912i5);
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C9165x2 m44584k4() {
        return this.f33018k4;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        this.f33018k4.mo6846k4("a", c3059ii, "anchor");
        this.f33021x1.mo6846k4("a", c3059ii, "norm");
        this.f33019kk.mo6846k4("a", c3059ii, "up");
        C8397nz c8397nz = this.f33020to;
        if (c8397nz != null) {
            c8397nz.mo6846k4("a", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}

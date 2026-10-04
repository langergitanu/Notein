package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.j0 */
/* JADX INFO: loaded from: classes4.dex */
public class C7971j0 extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f24985du = new C7017h4("cxnSpLocks", "stCxn", "endCxn", "extLst");

    /* JADX INFO: renamed from: k4 */
    private C9034vf f24986k4;

    /* JADX INFO: renamed from: kk */
    private C7982j8 f24987kk;

    /* JADX INFO: renamed from: to */
    private C8397nz f24988to;

    /* JADX INFO: renamed from: x1 */
    private C7982j8 f24989x1;

    public C7971j0() {
    }

    /* JADX INFO: renamed from: du */
    public final C7982j8 m34528du() {
        return this.f24989x1;
    }

    /* JADX INFO: renamed from: h4 */
    public final C7982j8 m34529h4() {
        return this.f24987kk;
    }

    /* JADX INFO: renamed from: kk */
    public final C7982j8 m34532kk() {
        if (this.f24987kk != null) {
            throw new Exception("Only one <endCxn> element can be added.");
        }
        C7982j8 c7982j8 = new C7982j8();
        this.f24987kk = c7982j8;
        return c7982j8;
    }

    /* JADX INFO: renamed from: m9 */
    public final AbstractC7414ck m34533m9() {
        return this.f24988to;
    }

    /* JADX INFO: renamed from: to */
    public final C9034vf m34534to() {
        return this.f24986k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final C7982j8 m34535x1() {
        if (this.f24989x1 != null) {
            throw new Exception("Only one <stCxn> element can be added.");
        }
        C7982j8 c7982j8 = new C7982j8();
        this.f24989x1 = c7982j8;
        return c7982j8;
    }

    public C7971j0(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.j0.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C7971j0.f24985du.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    C7971j0.this.f24986k4 = new C9034vf(abstractC13912i5);
                } else if (iM27428k4 == 1) {
                    C7971j0.this.f24989x1 = new C7982j8(abstractC13912i5);
                } else if (iM27428k4 == 2) {
                    C7971j0.this.f24987kk = new C7982j8(abstractC13912i5);
                } else {
                    if (iM27428k4 != 3) {
                        return false;
                    }
                    C7971j0.this.f24988to = new C8397nz(abstractC13912i5);
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C9034vf m34530k4() {
        if (this.f24986k4 != null) {
            throw new Exception("Only one <cxnSpLocks> element can be added.");
        }
        C9034vf c9034vf = new C9034vf();
        this.f24986k4 = c9034vf;
        return c9034vf;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m34531k4(AbstractC7414ck abstractC7414ck) {
        this.f24988to = (C8397nz) abstractC7414ck;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        C9034vf c9034vf = this.f24986k4;
        if (c9034vf != null) {
            c9034vf.mo6846k4("a", c3059ii, "cxnSpLocks");
        }
        C7982j8 c7982j8 = this.f24989x1;
        if (c7982j8 != null) {
            c7982j8.mo6846k4("a", c3059ii, "stCxn");
        }
        C7982j8 c7982j82 = this.f24987kk;
        if (c7982j82 != null) {
            c7982j82.mo6846k4("a", c3059ii, "endCxn");
        }
        C8397nz c8397nz = this.f24988to;
        if (c8397nz != null) {
            c8397nz.mo6846k4("a", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}

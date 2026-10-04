package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.gs */
/* JADX INFO: loaded from: classes4.dex */
public class C7794gs extends AbstractC7361bz {

    /* JADX INFO: renamed from: m9 */
    private static final C7017h4 f23704m9 = new C7017h4("opEmu", "noBreak", "diff", "brk", "aln", "ctrlPr");

    /* JADX INFO: renamed from: du */
    private C9408zw f23705du;

    /* JADX INFO: renamed from: h4 */
    private C7782go f23706h4;

    /* JADX INFO: renamed from: k4 */
    private C9408zw f23707k4;

    /* JADX INFO: renamed from: kk */
    private C9408zw f23708kk;

    /* JADX INFO: renamed from: to */
    private C7422cn f23709to;

    /* JADX INFO: renamed from: x1 */
    private C9408zw f23710x1;

    public C7794gs() {
    }

    /* JADX INFO: renamed from: du */
    public final C7422cn m32867du() {
        return this.f23709to;
    }

    /* JADX INFO: renamed from: h4 */
    public final C9408zw m32868h4() {
        return this.f23705du;
    }

    /* JADX INFO: renamed from: kk */
    public final C9408zw m32872kk() {
        return this.f23710x1;
    }

    /* JADX INFO: renamed from: m9 */
    public final C7782go m32874m9() {
        return this.f23706h4;
    }

    /* JADX INFO: renamed from: to */
    public final C9408zw m32875to() {
        return this.f23708kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final C9408zw m32877x1() {
        return this.f23707k4;
    }

    public C7794gs(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.gs.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C7794gs.f23704m9.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    C7794gs.this.f23707k4 = new C9408zw(abstractC13912i5);
                } else if (iM27428k4 == 1) {
                    C7794gs.this.f23710x1 = new C9408zw(abstractC13912i5);
                } else if (iM27428k4 == 2) {
                    C7794gs.this.f23708kk = new C9408zw(abstractC13912i5);
                } else if (iM27428k4 == 3) {
                    C7794gs.this.f23709to = new C7422cn(abstractC13912i5);
                } else if (iM27428k4 == 4) {
                    C7794gs.this.f23705du = new C9408zw(abstractC13912i5);
                } else {
                    if (iM27428k4 != 5) {
                        return false;
                    }
                    C7794gs.this.f23706h4 = new C7782go(abstractC13912i5);
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C7782go m32869k4() {
        if (this.f23706h4 != null) {
            throw new Exception("Only one <ctrlPr> element can be added.");
        }
        C7782go c7782go = new C7782go();
        this.f23706h4 = c7782go;
        return c7782go;
    }

    /* JADX INFO: renamed from: kk */
    public final void m32873kk(C9408zw c9408zw) {
        this.f23708kk = c9408zw;
    }

    /* JADX INFO: renamed from: to */
    public final void m32876to(C9408zw c9408zw) {
        this.f23705du = c9408zw;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m32878x1(C9408zw c9408zw) {
        this.f23710x1 = c9408zw;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m32870k4(C7422cn c7422cn) {
        this.f23709to = c7422cn;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m32871k4(C9408zw c9408zw) {
        this.f23707k4 = c9408zw;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        C9408zw c9408zw = this.f23707k4;
        if (c9408zw != null) {
            c9408zw.mo6846k4("m", c3059ii, "opEmu");
        }
        C9408zw c9408zw2 = this.f23710x1;
        if (c9408zw2 != null) {
            c9408zw2.mo6846k4("m", c3059ii, "noBreak");
        }
        C9408zw c9408zw3 = this.f23708kk;
        if (c9408zw3 != null) {
            c9408zw3.mo6846k4("m", c3059ii, "diff");
        }
        C7422cn c7422cn = this.f23709to;
        if (c7422cn != null) {
            c7422cn.mo6846k4("m", c3059ii, "brk");
        }
        C9408zw c9408zw4 = this.f23705du;
        if (c9408zw4 != null) {
            c9408zw4.mo6846k4("m", c3059ii, "aln");
        }
        C7782go c7782go = this.f23706h4;
        if (c7782go != null) {
            c7782go.mo6846k4("m", c3059ii, "ctrlPr");
        }
        c3059ii.mo21898jd();
    }
}

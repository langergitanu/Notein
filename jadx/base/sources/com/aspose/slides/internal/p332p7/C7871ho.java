package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.ho */
/* JADX INFO: loaded from: classes4.dex */
public class C7871ho extends AbstractC7361bz {

    /* JADX INFO: renamed from: m9 */
    private static final C7017h4 f24238m9 = new C7017h4("baseJc", "maxDist", "objDist", "rSpRule", "rSp", "ctrlPr");

    /* JADX INFO: renamed from: du */
    private C8717rw f24239du;

    /* JADX INFO: renamed from: h4 */
    private C7782go f24240h4;

    /* JADX INFO: renamed from: k4 */
    private C8880tn f24241k4;

    /* JADX INFO: renamed from: kk */
    private C9408zw f24242kk;

    /* JADX INFO: renamed from: to */
    private C8168lb f24243to;

    /* JADX INFO: renamed from: x1 */
    private C9408zw f24244x1;

    public C7871ho() {
    }

    /* JADX INFO: renamed from: du */
    public final C8168lb m33539du() {
        return this.f24243to;
    }

    /* JADX INFO: renamed from: h4 */
    public final C8717rw m33540h4() {
        return this.f24239du;
    }

    /* JADX INFO: renamed from: k4 */
    public final C7782go m33541k4() {
        if (this.f24240h4 != null) {
            throw new Exception("Only one <ctrlPr> element can be added.");
        }
        C7782go c7782go = new C7782go();
        this.f24240h4 = c7782go;
        return c7782go;
    }

    /* JADX INFO: renamed from: kk */
    public final C9408zw m33546kk() {
        return this.f24244x1;
    }

    /* JADX INFO: renamed from: m9 */
    public final C7782go m33547m9() {
        return this.f24240h4;
    }

    /* JADX INFO: renamed from: to */
    public final C9408zw m33548to() {
        return this.f24242kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final C8880tn m33549x1() {
        return this.f24241k4;
    }

    public C7871ho(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.ho.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C7871ho.f24238m9.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    C7871ho.this.f24241k4 = new C8880tn(abstractC13912i5);
                } else if (iM27428k4 == 1) {
                    C7871ho.this.f24244x1 = new C9408zw(abstractC13912i5);
                } else if (iM27428k4 == 2) {
                    C7871ho.this.f24242kk = new C9408zw(abstractC13912i5);
                } else if (iM27428k4 == 3) {
                    C7871ho.this.f24243to = new C8168lb(abstractC13912i5);
                } else if (iM27428k4 == 4) {
                    C7871ho.this.f24239du = new C8717rw(abstractC13912i5);
                } else {
                    if (iM27428k4 != 5) {
                        return false;
                    }
                    C7871ho.this.f24240h4 = new C7782go(abstractC13912i5);
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    public final void m33550x1(C9408zw c9408zw) {
        this.f24242kk = c9408zw;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m33542k4(C8168lb c8168lb) {
        this.f24243to = c8168lb;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m33543k4(C8717rw c8717rw) {
        this.f24239du = c8717rw;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m33544k4(C8880tn c8880tn) {
        this.f24241k4 = c8880tn;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m33545k4(C9408zw c9408zw) {
        this.f24244x1 = c9408zw;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        C8880tn c8880tn = this.f24241k4;
        if (c8880tn != null) {
            c8880tn.mo6846k4("m", c3059ii, "baseJc");
        }
        C9408zw c9408zw = this.f24244x1;
        if (c9408zw != null) {
            c9408zw.mo6846k4("m", c3059ii, "maxDist");
        }
        C9408zw c9408zw2 = this.f24242kk;
        if (c9408zw2 != null) {
            c9408zw2.mo6846k4("m", c3059ii, "objDist");
        }
        C8168lb c8168lb = this.f24243to;
        if (c8168lb != null) {
            c8168lb.mo6846k4("m", c3059ii, "rSpRule");
        }
        C8717rw c8717rw = this.f24239du;
        if (c8717rw != null) {
            c8717rw.mo6846k4("m", c3059ii, "rSp");
        }
        C7782go c7782go = this.f24240h4;
        if (c7782go != null) {
            c7782go.mo6846k4("m", c3059ii, "ctrlPr");
        }
        c3059ii.mo21898jd();
    }
}

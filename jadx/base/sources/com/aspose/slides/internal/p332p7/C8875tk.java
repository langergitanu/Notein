package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.tk */
/* JADX INFO: loaded from: classes4.dex */
public class C8875tk extends AbstractC7361bz {

    /* JADX INFO: renamed from: dy */
    private static final C7017h4 f30781dy = new C7017h4("showHorzBorder", "showVertBorder", "showOutline", "showKeys", "spPr", "txPr", "extLst");

    /* JADX INFO: renamed from: du */
    private C8087kh f30782du;

    /* JADX INFO: renamed from: h4 */
    private C8952ug f30783h4;

    /* JADX INFO: renamed from: k4 */
    private C8828t1 f30784k4;

    /* JADX INFO: renamed from: kk */
    private C8828t1 f30785kk;

    /* JADX INFO: renamed from: m9 */
    private C7683fo f30786m9;

    /* JADX INFO: renamed from: to */
    private C8828t1 f30787to;

    /* JADX INFO: renamed from: x1 */
    private C8828t1 f30788x1;

    public C8875tk() {
    }

    /* JADX INFO: renamed from: c5 */
    public final C8828t1 m41777c5() {
        return this.f30785kk;
    }

    /* JADX INFO: renamed from: ck */
    public final C8087kh m41778ck() {
        return this.f30782du;
    }

    /* JADX INFO: renamed from: du */
    public final C8087kh m41779du() {
        if (this.f30782du != null) {
            throw new Exception("Only one <spPr> element can be added.");
        }
        C8087kh c8087kh = new C8087kh();
        this.f30782du = c8087kh;
        return c8087kh;
    }

    /* JADX INFO: renamed from: dy */
    public final C8828t1 m41780dy() {
        return this.f30788x1;
    }

    /* JADX INFO: renamed from: fa */
    public final C8952ug m41781fa() {
        return this.f30783h4;
    }

    /* JADX INFO: renamed from: h4 */
    public final C8952ug m41782h4() {
        if (this.f30783h4 != null) {
            throw new Exception("Only one <txPr> element can be added.");
        }
        C8952ug c8952ug = new C8952ug();
        this.f30783h4 = c8952ug;
        return c8952ug;
    }

    /* JADX INFO: renamed from: jd */
    public final C8828t1 m41783jd() {
        return this.f30787to;
    }

    /* JADX INFO: renamed from: kk */
    public final C8828t1 m41786kk() {
        if (this.f30785kk != null) {
            throw new Exception("Only one <showOutline> element can be added.");
        }
        C8828t1 c8828t1 = new C8828t1();
        this.f30785kk = c8828t1;
        return c8828t1;
    }

    /* JADX INFO: renamed from: m9 */
    public final C8828t1 m41787m9() {
        return this.f30784k4;
    }

    /* JADX INFO: renamed from: to */
    public final C8828t1 m41788to() {
        if (this.f30787to != null) {
            throw new Exception("Only one <showKeys> element can be added.");
        }
        C8828t1 c8828t1 = new C8828t1();
        this.f30787to = c8828t1;
        return c8828t1;
    }

    /* JADX INFO: renamed from: up */
    public final AbstractC7414ck m41789up() {
        return this.f30786m9;
    }

    /* JADX INFO: renamed from: x1 */
    public final C8828t1 m41790x1() {
        if (this.f30788x1 != null) {
            throw new Exception("Only one <showVertBorder> element can be added.");
        }
        C8828t1 c8828t1 = new C8828t1();
        this.f30788x1 = c8828t1;
        return c8828t1;
    }

    public C8875tk(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.tk.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                switch (C8875tk.f30781dy.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 0:
                        C8875tk.this.f30784k4 = new C8828t1(abstractC13912i5);
                        return true;
                    case 1:
                        C8875tk.this.f30788x1 = new C8828t1(abstractC13912i5);
                        return true;
                    case 2:
                        C8875tk.this.f30785kk = new C8828t1(abstractC13912i5);
                        return true;
                    case 3:
                        C8875tk.this.f30787to = new C8828t1(abstractC13912i5);
                        return true;
                    case 4:
                        C8875tk.this.f30782du = new C8087kh(abstractC13912i5);
                        return true;
                    case 5:
                        C8875tk.this.f30783h4 = new C8952ug(abstractC13912i5);
                        return true;
                    case 6:
                        C8875tk.this.f30786m9 = new C7683fo(abstractC13912i5);
                        return true;
                    default:
                        return false;
                }
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C8828t1 m41784k4() {
        if (this.f30784k4 != null) {
            throw new Exception("Only one <showHorzBorder> element can be added.");
        }
        C8828t1 c8828t1 = new C8828t1();
        this.f30784k4 = c8828t1;
        return c8828t1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m41785k4(AbstractC7414ck abstractC7414ck) {
        this.f30786m9 = (C7683fo) abstractC7414ck;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        C8828t1 c8828t1 = this.f30784k4;
        if (c8828t1 != null) {
            c8828t1.mo6846k4("c", c3059ii, "showHorzBorder");
        }
        C8828t1 c8828t12 = this.f30788x1;
        if (c8828t12 != null) {
            c8828t12.mo6846k4("c", c3059ii, "showVertBorder");
        }
        C8828t1 c8828t13 = this.f30785kk;
        if (c8828t13 != null) {
            c8828t13.mo6846k4("c", c3059ii, "showOutline");
        }
        C8828t1 c8828t14 = this.f30787to;
        if (c8828t14 != null) {
            c8828t14.mo6846k4("c", c3059ii, "showKeys");
        }
        C8087kh c8087kh = this.f30782du;
        if (c8087kh != null) {
            c8087kh.mo6846k4("c", c3059ii, "spPr");
        }
        C8952ug c8952ug = this.f30783h4;
        if (c8952ug != null) {
            c8952ug.mo6846k4("c", c3059ii, "txPr");
        }
        C7683fo c7683fo = this.f30786m9;
        if (c7683fo != null) {
            c7683fo.mo6846k4("c", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}

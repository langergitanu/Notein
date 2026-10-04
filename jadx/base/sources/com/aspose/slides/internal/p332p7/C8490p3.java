package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.p3 */
/* JADX INFO: loaded from: classes4.dex */
public class C8490p3 extends AbstractC7361bz {

    /* JADX INFO: renamed from: c5 */
    private static final C7017h4 f28204c5 = new C7017h4("blur", "fillOverlay", "glow", "innerShdw", "outerShdw", "prstShdw", "reflection", "softEdge");

    /* JADX INFO: renamed from: du */
    private C9314yu f28205du;

    /* JADX INFO: renamed from: dy */
    private C8438of f28206dy;

    /* JADX INFO: renamed from: h4 */
    private C8115ko f28207h4;

    /* JADX INFO: renamed from: k4 */
    private C8142kw f28208k4;

    /* JADX INFO: renamed from: kk */
    private C8395ny f28209kk;

    /* JADX INFO: renamed from: m9 */
    private C9199xh f28210m9;

    /* JADX INFO: renamed from: to */
    private C9108wg f28211to;

    /* JADX INFO: renamed from: x1 */
    private C8964ul f28212x1;

    public C8490p3() {
    }

    /* JADX INFO: renamed from: c5 */
    public final C8142kw m38591c5() {
        return this.f28208k4;
    }

    /* JADX INFO: renamed from: ck */
    public final C8395ny m38592ck() {
        return this.f28209kk;
    }

    /* JADX INFO: renamed from: du */
    public final C9314yu m38593du() {
        if (this.f28205du != null) {
            throw new Exception("Only one <outerShdw> element can be added.");
        }
        C9314yu c9314yu = new C9314yu();
        this.f28205du = c9314yu;
        return c9314yu;
    }

    /* JADX INFO: renamed from: dy */
    public final C8438of m38594dy() {
        if (this.f28206dy != null) {
            throw new Exception("Only one <softEdge> element can be added.");
        }
        C8438of c8438of = new C8438of();
        this.f28206dy = c8438of;
        return c8438of;
    }

    /* JADX INFO: renamed from: fa */
    public final C9108wg m38595fa() {
        return this.f28211to;
    }

    /* JADX INFO: renamed from: h4 */
    public final C8115ko m38596h4() {
        if (this.f28207h4 != null) {
            throw new Exception("Only one <prstShdw> element can be added.");
        }
        C8115ko c8115ko = new C8115ko();
        this.f28207h4 = c8115ko;
        return c8115ko;
    }

    /* JADX INFO: renamed from: jd */
    public final C8964ul m38597jd() {
        return this.f28212x1;
    }

    /* JADX INFO: renamed from: kk */
    public final C8395ny m38599kk() {
        if (this.f28209kk != null) {
            throw new Exception("Only one <glow> element can be added.");
        }
        C8395ny c8395ny = new C8395ny();
        this.f28209kk = c8395ny;
        return c8395ny;
    }

    /* JADX INFO: renamed from: ks */
    public final C9199xh m38600ks() {
        return this.f28210m9;
    }

    /* JADX INFO: renamed from: m9 */
    public final C9199xh m38601m9() {
        if (this.f28210m9 != null) {
            throw new Exception("Only one <reflection> element can be added.");
        }
        C9199xh c9199xh = new C9199xh();
        this.f28210m9 = c9199xh;
        return c9199xh;
    }

    /* JADX INFO: renamed from: rv */
    public final C8438of m38602rv() {
        return this.f28206dy;
    }

    /* JADX INFO: renamed from: to */
    public final C9108wg m38603to() {
        if (this.f28211to != null) {
            throw new Exception("Only one <innerShdw> element can be added.");
        }
        C9108wg c9108wg = new C9108wg();
        this.f28211to = c9108wg;
        return c9108wg;
    }

    /* JADX INFO: renamed from: up */
    public final C9314yu m38604up() {
        return this.f28205du;
    }

    /* JADX INFO: renamed from: x1 */
    public final C8964ul m38605x1() {
        if (this.f28212x1 != null) {
            throw new Exception("Only one <fillOverlay> element can be added.");
        }
        C8964ul c8964ul = new C8964ul();
        this.f28212x1 = c8964ul;
        return c8964ul;
    }

    /* JADX INFO: renamed from: yj */
    public final C8115ko m38606yj() {
        return this.f28207h4;
    }

    public C8490p3(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.p3.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                switch (C8490p3.f28204c5.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 0:
                        C8490p3.this.f28208k4 = new C8142kw(abstractC13912i5);
                        return true;
                    case 1:
                        C8490p3.this.f28212x1 = new C8964ul(abstractC13912i5);
                        return true;
                    case 2:
                        C8490p3.this.f28209kk = new C8395ny(abstractC13912i5);
                        return true;
                    case 3:
                        C8490p3.this.f28211to = new C9108wg(abstractC13912i5);
                        return true;
                    case 4:
                        C8490p3.this.f28205du = new C9314yu(abstractC13912i5);
                        return true;
                    case 5:
                        C8490p3.this.f28207h4 = new C8115ko(abstractC13912i5);
                        return true;
                    case 6:
                        C8490p3.this.f28210m9 = new C9199xh(abstractC13912i5);
                        return true;
                    case 7:
                        C8490p3.this.f28206dy = new C8438of(abstractC13912i5);
                        return true;
                    default:
                        return false;
                }
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C8142kw m38598k4() {
        if (this.f28208k4 != null) {
            throw new Exception("Only one <blur> element can be added.");
        }
        C8142kw c8142kw = new C8142kw();
        this.f28208k4 = c8142kw;
        return c8142kw;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, "a".equals(c3059ii.mo12952k4("http://schemas.openxmlformats.org/drawingml/2006/main")) ? null : "http://schemas.openxmlformats.org/drawingml/2006/main");
        C8142kw c8142kw = this.f28208k4;
        if (c8142kw != null) {
            c8142kw.mo6846k4("a", c3059ii, "blur");
        }
        C8964ul c8964ul = this.f28212x1;
        if (c8964ul != null) {
            c8964ul.mo6846k4("a", c3059ii, "fillOverlay");
        }
        C8395ny c8395ny = this.f28209kk;
        if (c8395ny != null) {
            c8395ny.mo6846k4("a", c3059ii, "glow");
        }
        C9108wg c9108wg = this.f28211to;
        if (c9108wg != null) {
            c9108wg.mo6846k4("a", c3059ii, "innerShdw");
        }
        C9314yu c9314yu = this.f28205du;
        if (c9314yu != null) {
            c9314yu.mo6846k4("a", c3059ii, "outerShdw");
        }
        C8115ko c8115ko = this.f28207h4;
        if (c8115ko != null) {
            c8115ko.mo6846k4("a", c3059ii, "prstShdw");
        }
        C9199xh c9199xh = this.f28210m9;
        if (c9199xh != null) {
            c9199xh.mo6846k4("a", c3059ii, "reflection");
        }
        C8438of c8438of = this.f28206dy;
        if (c8438of != null) {
            c8438of.mo6846k4("a", c3059ii, "softEdge");
        }
        c3059ii.mo21898jd();
    }
}

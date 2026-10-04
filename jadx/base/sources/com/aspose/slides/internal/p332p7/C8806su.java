package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.su */
/* JADX INFO: loaded from: classes4.dex */
public class C8806su extends AbstractC7361bz {

    /* JADX INFO: renamed from: jd */
    private static final C7017h4 f30381jd = new C7017h4("errDir", "errBarType", "errValType", "noEndCap", "plus", "minus", "val", "spPr", "extLst");

    /* JADX INFO: renamed from: c5 */
    private C7683fo f30382c5;

    /* JADX INFO: renamed from: du */
    private C8262mg f30383du;

    /* JADX INFO: renamed from: dy */
    private C8087kh f30384dy;

    /* JADX INFO: renamed from: h4 */
    private C8262mg f30385h4;

    /* JADX INFO: renamed from: k4 */
    private C8076kd f30386k4;

    /* JADX INFO: renamed from: kk */
    private C9145wv f30387kk;

    /* JADX INFO: renamed from: m9 */
    private C7405cg f30388m9;

    /* JADX INFO: renamed from: to */
    private C8828t1 f30389to;

    /* JADX INFO: renamed from: x1 */
    private C8224lx f30390x1;

    public C8806su() {
        this.f30390x1 = new C8224lx();
        this.f30387kk = new C9145wv();
    }

    /* JADX INFO: renamed from: c5 */
    public final C9145wv m41307c5() {
        return this.f30387kk;
    }

    /* JADX INFO: renamed from: ck */
    public final C8262mg m41308ck() {
        return this.f30383du;
    }

    /* JADX INFO: renamed from: du */
    public final C7405cg m41309du() {
        if (this.f30388m9 != null) {
            throw new Exception("Only one <val> element can be added.");
        }
        C7405cg c7405cg = new C7405cg();
        this.f30388m9 = c7405cg;
        return c7405cg;
    }

    /* JADX INFO: renamed from: dy */
    public final C8224lx m41310dy() {
        return this.f30390x1;
    }

    /* JADX INFO: renamed from: fa */
    public final C8262mg m41311fa() {
        return this.f30385h4;
    }

    /* JADX INFO: renamed from: h4 */
    public final C8087kh m41312h4() {
        if (this.f30384dy != null) {
            throw new Exception("Only one <spPr> element can be added.");
        }
        C8087kh c8087kh = new C8087kh();
        this.f30384dy = c8087kh;
        return c8087kh;
    }

    /* JADX INFO: renamed from: jd */
    public final C8828t1 m41313jd() {
        return this.f30389to;
    }

    /* JADX INFO: renamed from: kk */
    public final C8262mg m41316kk() {
        if (this.f30383du != null) {
            throw new Exception("Only one <plus> element can be added.");
        }
        C8262mg c8262mg = new C8262mg();
        this.f30383du = c8262mg;
        return c8262mg;
    }

    /* JADX INFO: renamed from: ks */
    public final AbstractC7414ck m41317ks() {
        return this.f30382c5;
    }

    /* JADX INFO: renamed from: m9 */
    public final C8076kd m41318m9() {
        return this.f30386k4;
    }

    /* JADX INFO: renamed from: to */
    public final C8262mg m41319to() {
        if (this.f30385h4 != null) {
            throw new Exception("Only one <minus> element can be added.");
        }
        C8262mg c8262mg = new C8262mg();
        this.f30385h4 = c8262mg;
        return c8262mg;
    }

    /* JADX INFO: renamed from: up */
    public final C7405cg m41320up() {
        return this.f30388m9;
    }

    /* JADX INFO: renamed from: yj */
    public final C8087kh m41322yj() {
        return this.f30384dy;
    }

    public C8806su(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.su.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                switch (C8806su.f30381jd.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 0:
                        C8806su.this.f30386k4 = new C8076kd(abstractC13912i5);
                        return true;
                    case 1:
                        C8806su.this.f30390x1 = new C8224lx(abstractC13912i5);
                        return true;
                    case 2:
                        C8806su.this.f30387kk = new C9145wv(abstractC13912i5);
                        return true;
                    case 3:
                        C8806su.this.f30389to = new C8828t1(abstractC13912i5);
                        return true;
                    case 4:
                        C8806su.this.f30383du = new C8262mg(abstractC13912i5);
                        return true;
                    case 5:
                        C8806su.this.f30385h4 = new C8262mg(abstractC13912i5);
                        return true;
                    case 6:
                        C8806su.this.f30388m9 = new C7405cg(abstractC13912i5);
                        return true;
                    case 7:
                        C8806su.this.f30384dy = new C8087kh(abstractC13912i5);
                        return true;
                    case 8:
                        C8806su.this.f30382c5 = new C7683fo(abstractC13912i5);
                        return true;
                    default:
                        return false;
                }
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    public final C8828t1 m41321x1() {
        if (this.f30389to != null) {
            throw new Exception("Only one <noEndCap> element can be added.");
        }
        C8828t1 c8828t1 = new C8828t1();
        this.f30389to = c8828t1;
        return c8828t1;
    }

    /* JADX INFO: renamed from: k4 */
    public final C8076kd m41314k4() {
        if (this.f30386k4 != null) {
            throw new Exception("Only one <errDir> element can be added.");
        }
        C8076kd c8076kd = new C8076kd();
        this.f30386k4 = c8076kd;
        return c8076kd;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m41315k4(AbstractC7414ck abstractC7414ck) {
        this.f30382c5 = (C7683fo) abstractC7414ck;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        C8076kd c8076kd = this.f30386k4;
        if (c8076kd != null) {
            c8076kd.mo6846k4("c", c3059ii, "errDir");
        }
        this.f30390x1.mo6846k4("c", c3059ii, "errBarType");
        this.f30387kk.mo6846k4("c", c3059ii, "errValType");
        C8828t1 c8828t1 = this.f30389to;
        if (c8828t1 != null) {
            c8828t1.mo6846k4("c", c3059ii, "noEndCap");
        }
        C8262mg c8262mg = this.f30383du;
        if (c8262mg != null) {
            c8262mg.mo6846k4("c", c3059ii, "plus");
        }
        C8262mg c8262mg2 = this.f30385h4;
        if (c8262mg2 != null) {
            c8262mg2.mo6846k4("c", c3059ii, "minus");
        }
        C7405cg c7405cg = this.f30388m9;
        if (c7405cg != null) {
            c7405cg.mo6846k4("c", c3059ii, "val");
        }
        C8087kh c8087kh = this.f30384dy;
        if (c8087kh != null) {
            c8087kh.mo6846k4("c", c3059ii, "spPr");
        }
        C7683fo c7683fo = this.f30382c5;
        if (c7683fo != null) {
            c7683fo.mo6846k4("c", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}

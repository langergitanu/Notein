package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.js */
/* JADX INFO: loaded from: classes4.dex */
public class C8037js extends AbstractC7361bz {

    /* JADX INFO: renamed from: up */
    private static final C7017h4 f25334up = new C7017h4("name", "spPr", "trendlineType", "order", "period", "forward", "backward", "intercept", "dispRSqr", "dispEq", "trendlineLbl", "extLst");

    /* JADX INFO: renamed from: c5 */
    private C8828t1 f25335c5;

    /* JADX INFO: renamed from: ck */
    private C9180x8 f25336ck;

    /* JADX INFO: renamed from: du */
    private C8494p7 f25337du;

    /* JADX INFO: renamed from: dy */
    private C7405cg f25338dy;

    /* JADX INFO: renamed from: fa */
    private C7683fo f25339fa;

    /* JADX INFO: renamed from: h4 */
    private C7405cg f25340h4;

    /* JADX INFO: renamed from: jd */
    private C8828t1 f25341jd;

    /* JADX INFO: renamed from: k4 */
    private String f25342k4;

    /* JADX INFO: renamed from: kk */
    private C8779sj f25343kk;

    /* JADX INFO: renamed from: m9 */
    private C7405cg f25344m9;

    /* JADX INFO: renamed from: to */
    private C8426oc f25345to;

    /* JADX INFO: renamed from: x1 */
    private C8087kh f25346x1;

    public C8037js() {
        this.f25343kk = new C8779sj();
    }

    /* JADX INFO: renamed from: c5 */
    public final C9180x8 m34933c5() {
        if (this.f25336ck != null) {
            throw new Exception("Only one <trendlineLbl> element can be added.");
        }
        C9180x8 c9180x8 = new C9180x8();
        this.f25336ck = c9180x8;
        return c9180x8;
    }

    /* JADX INFO: renamed from: ck */
    public final C8087kh m34934ck() {
        return this.f25346x1;
    }

    /* JADX INFO: renamed from: du */
    public final C7405cg m34935du() {
        if (this.f25344m9 != null) {
            throw new Exception("Only one <backward> element can be added.");
        }
        C7405cg c7405cg = new C7405cg();
        this.f25344m9 = c7405cg;
        return c7405cg;
    }

    /* JADX INFO: renamed from: dy */
    public final C8828t1 m34936dy() {
        if (this.f25341jd != null) {
            throw new Exception("Only one <dispEq> element can be added.");
        }
        C8828t1 c8828t1 = new C8828t1();
        this.f25341jd = c8828t1;
        return c8828t1;
    }

    /* JADX INFO: renamed from: fa */
    public final C8779sj m34937fa() {
        return this.f25343kk;
    }

    /* JADX INFO: renamed from: h4 */
    public final C7405cg m34938h4() {
        if (this.f25338dy != null) {
            throw new Exception("Only one <intercept> element can be added.");
        }
        C7405cg c7405cg = new C7405cg();
        this.f25338dy = c7405cg;
        return c7405cg;
    }

    /* JADX INFO: renamed from: ix */
    public final C8828t1 m34939ix() {
        return this.f25341jd;
    }

    /* JADX INFO: renamed from: jd */
    public final String m34940jd() {
        return this.f25342k4;
    }

    /* JADX INFO: renamed from: ks */
    public final C7405cg m34945ks() {
        return this.f25340h4;
    }

    /* JADX INFO: renamed from: m9 */
    public final C8828t1 m34946m9() {
        if (this.f25335c5 != null) {
            throw new Exception("Only one <dispRSqr> element can be added.");
        }
        C8828t1 c8828t1 = new C8828t1();
        this.f25335c5 = c8828t1;
        return c8828t1;
    }

    /* JADX INFO: renamed from: ne */
    public final C8828t1 m34947ne() {
        return this.f25335c5;
    }

    /* JADX INFO: renamed from: rv */
    public final C7405cg m34948rv() {
        return this.f25344m9;
    }

    /* JADX INFO: renamed from: to */
    public final C7405cg m34949to() {
        if (this.f25340h4 != null) {
            throw new Exception("Only one <forward> element can be added.");
        }
        C7405cg c7405cg = new C7405cg();
        this.f25340h4 = c7405cg;
        return c7405cg;
    }

    /* JADX INFO: renamed from: u4 */
    public final C9180x8 m34950u4() {
        return this.f25336ck;
    }

    /* JADX INFO: renamed from: up */
    public final C8426oc m34951up() {
        return this.f25345to;
    }

    /* JADX INFO: renamed from: uz */
    public final AbstractC7414ck m34952uz() {
        return this.f25339fa;
    }

    /* JADX INFO: renamed from: x6 */
    public final C7405cg m34954x6() {
        return this.f25338dy;
    }

    /* JADX INFO: renamed from: yj */
    public final C8494p7 m34955yj() {
        return this.f25337du;
    }

    public C8037js(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.js.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                switch (C8037js.f25334up.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 0:
                        C8037js.this.f25342k4 = abstractC13912i5.mo65052v4();
                        if (abstractC13912i5.mo65048u4()) {
                            return true;
                        }
                        while (abstractC13912i5.mo65028jd() != 15) {
                            abstractC13912i5.mo65026h4();
                            C8037js c8037js = C8037js.this;
                            c8037js.f25342k4 = C14113y2.m67400k4(c8037js.f25342k4, abstractC13912i5.mo65052v4());
                        }
                        return true;
                    case 1:
                        C8037js.this.f25346x1 = new C8087kh(abstractC13912i5);
                        return true;
                    case 2:
                        C8037js.this.f25343kk = new C8779sj(abstractC13912i5);
                        return true;
                    case 3:
                        C8037js.this.f25345to = new C8426oc(abstractC13912i5);
                        return true;
                    case 4:
                        C8037js.this.f25337du = new C8494p7(abstractC13912i5);
                        return true;
                    case 5:
                        C8037js.this.f25340h4 = new C7405cg(abstractC13912i5);
                        return true;
                    case 6:
                        C8037js.this.f25344m9 = new C7405cg(abstractC13912i5);
                        return true;
                    case 7:
                        C8037js.this.f25338dy = new C7405cg(abstractC13912i5);
                        return true;
                    case 8:
                        C8037js.this.f25335c5 = new C8828t1(abstractC13912i5);
                        return true;
                    case 9:
                        C8037js.this.f25341jd = new C8828t1(abstractC13912i5);
                        return true;
                    case 10:
                        C8037js.this.f25336ck = new C9180x8(abstractC13912i5);
                        return true;
                    case 11:
                        C8037js.this.f25339fa = new C7683fo(abstractC13912i5);
                        return true;
                    default:
                        return false;
                }
            }
        });
    }

    /* JADX INFO: renamed from: kk */
    public final C8494p7 m34944kk() {
        if (this.f25337du != null) {
            throw new Exception("Only one <period> element can be added.");
        }
        C8494p7 c8494p7 = new C8494p7();
        this.f25337du = c8494p7;
        return c8494p7;
    }

    /* JADX INFO: renamed from: x1 */
    public final C8426oc m34953x1() {
        if (this.f25345to != null) {
            throw new Exception("Only one <order> element can be added.");
        }
        C8426oc c8426oc = new C8426oc();
        this.f25345to = c8426oc;
        return c8426oc;
    }

    /* JADX INFO: renamed from: k4 */
    public final C8087kh m34941k4() {
        if (this.f25346x1 != null) {
            throw new Exception("Only one <spPr> element can be added.");
        }
        C8087kh c8087kh = new C8087kh();
        this.f25346x1 = c8087kh;
        return c8087kh;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m34942k4(AbstractC7414ck abstractC7414ck) {
        this.f25339fa = (C7683fo) abstractC7414ck;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m34943k4(String str) {
        this.f25342k4 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        C8037js c8037js;
        C3059ii c3059ii2;
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f25342k4;
        if (str3 != null) {
            c8037js = this;
            c3059ii2 = c3059ii;
            c8037js.m29301k4("c", c3059ii2, "name", str3, false);
        } else {
            c8037js = this;
            c3059ii2 = c3059ii;
        }
        C8087kh c8087kh = c8037js.f25346x1;
        if (c8087kh != null) {
            c8087kh.mo6846k4("c", c3059ii2, "spPr");
        }
        c8037js.f25343kk.mo6846k4("c", c3059ii2, "trendlineType");
        C8426oc c8426oc = c8037js.f25345to;
        if (c8426oc != null) {
            c8426oc.mo6846k4("c", c3059ii2, "order");
        }
        C8494p7 c8494p7 = c8037js.f25337du;
        if (c8494p7 != null) {
            c8494p7.mo6846k4("c", c3059ii2, "period");
        }
        C7405cg c7405cg = c8037js.f25340h4;
        if (c7405cg != null) {
            c7405cg.mo6846k4("c", c3059ii2, "forward");
        }
        C7405cg c7405cg2 = c8037js.f25344m9;
        if (c7405cg2 != null) {
            c7405cg2.mo6846k4("c", c3059ii2, "backward");
        }
        C7405cg c7405cg3 = c8037js.f25338dy;
        if (c7405cg3 != null) {
            c7405cg3.mo6846k4("c", c3059ii2, "intercept");
        }
        C8828t1 c8828t1 = c8037js.f25335c5;
        if (c8828t1 != null) {
            c8828t1.mo6846k4("c", c3059ii2, "dispRSqr");
        }
        C8828t1 c8828t12 = c8037js.f25341jd;
        if (c8828t12 != null) {
            c8828t12.mo6846k4("c", c3059ii2, "dispEq");
        }
        C9180x8 c9180x8 = c8037js.f25336ck;
        if (c9180x8 != null) {
            c9180x8.mo6846k4("c", c3059ii2, "trendlineLbl");
        }
        C7683fo c7683fo = c8037js.f25339fa;
        if (c7683fo != null) {
            c7683fo.mo6846k4("c", c3059ii2, "extLst");
        }
        c3059ii2.mo21898jd();
    }
}

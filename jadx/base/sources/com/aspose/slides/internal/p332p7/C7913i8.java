package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.orion.notein.domain.models.note.NoteMeta;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.i8 */
/* JADX INFO: loaded from: classes4.dex */
public class C7913i8 extends AbstractC7361bz {

    /* JADX INFO: renamed from: ks */
    private static final C7017h4 f24533ks = new C7017h4("id", "hidden", "catScaling", "valScaling", NoteMeta.PROPERTY_TITLE, "units", "majorGridlines", "minorGridlines", "majorTickMarks", "minorTickMarks", "tickLabels", "numFmt", "spPr", "txPr", "extLst");

    /* JADX INFO: renamed from: c5 */
    private C7884hw f24534c5;

    /* JADX INFO: renamed from: ck */
    private C7314bd f24535ck;

    /* JADX INFO: renamed from: du */
    private C7208a2 f24536du;

    /* JADX INFO: renamed from: dy */
    private C7884hw f24537dy;

    /* JADX INFO: renamed from: fa */
    private C8087kh f24538fa;

    /* JADX INFO: renamed from: h4 */
    private C9255y3 f24539h4;

    /* JADX INFO: renamed from: jd */
    private C7730g5 f24540jd;

    /* JADX INFO: renamed from: k4 */
    private long f24541k4;

    /* JADX INFO: renamed from: kk */
    private C7394ca f24542kk;

    /* JADX INFO: renamed from: m9 */
    private C9255y3 f24543m9;

    /* JADX INFO: renamed from: to */
    private C7926ie f24544to;

    /* JADX INFO: renamed from: up */
    private C8952ug f24545up;

    /* JADX INFO: renamed from: x1 */
    private boolean f24546x1;

    /* JADX INFO: renamed from: yj */
    private C7249ah f24547yj;

    public C7913i8() {
        m33923qq();
    }

    /* JADX INFO: renamed from: qq */
    private void m33923qq() {
        this.f24546x1 = false;
    }

    /* JADX INFO: renamed from: c5 */
    public final boolean m33927c5() {
        return this.f24546x1;
    }

    /* JADX INFO: renamed from: ck */
    public final C7926ie m33928ck() {
        return this.f24544to;
    }

    /* JADX INFO: renamed from: du */
    public final C7730g5 m33929du() {
        if (this.f24540jd != null) {
            throw new Exception("Only one <tickLabels> element can be added.");
        }
        C7730g5 c7730g5 = new C7730g5();
        this.f24540jd = c7730g5;
        return c7730g5;
    }

    /* JADX INFO: renamed from: dy */
    public final C8952ug m33930dy() {
        if (this.f24545up != null) {
            throw new Exception("Only one <txPr> element can be added.");
        }
        C8952ug c8952ug = new C8952ug();
        this.f24545up = c8952ug;
        return c8952ug;
    }

    /* JADX INFO: renamed from: fa */
    public final C7208a2 m33931fa() {
        return this.f24536du;
    }

    /* JADX INFO: renamed from: h4 */
    public final C7314bd m33932h4() {
        if (this.f24535ck != null) {
            throw new Exception("Only one <numFmt> element can be added.");
        }
        C7314bd c7314bd = new C7314bd();
        this.f24535ck = c7314bd;
        return c7314bd;
    }

    /* JADX INFO: renamed from: ix */
    public final C8087kh m33933ix() {
        return this.f24538fa;
    }

    /* JADX INFO: renamed from: jd */
    public final C7394ca m33934jd() {
        return this.f24542kk;
    }

    /* JADX INFO: renamed from: kk */
    public final C9255y3 m33941kk() {
        if (this.f24539h4 != null) {
            throw new Exception("Only one <majorGridlines> element can be added.");
        }
        C9255y3 c9255y3 = new C9255y3();
        this.f24539h4 = c9255y3;
        return c9255y3;
    }

    /* JADX INFO: renamed from: ks */
    public final C7884hw m33942ks() {
        return this.f24537dy;
    }

    /* JADX INFO: renamed from: m9 */
    public final C8087kh m33943m9() {
        if (this.f24538fa != null) {
            throw new Exception("Only one <spPr> element can be added.");
        }
        C8087kh c8087kh = new C8087kh();
        this.f24538fa = c8087kh;
        return c8087kh;
    }

    /* JADX INFO: renamed from: ne */
    public final C7314bd m33944ne() {
        return this.f24535ck;
    }

    /* JADX INFO: renamed from: rv */
    public final C7884hw m33945rv() {
        return this.f24534c5;
    }

    /* JADX INFO: renamed from: to */
    public final C9255y3 m33946to() {
        if (this.f24543m9 != null) {
            throw new Exception("Only one <minorGridlines> element can be added.");
        }
        C9255y3 c9255y3 = new C9255y3();
        this.f24543m9 = c9255y3;
        return c9255y3;
    }

    /* JADX INFO: renamed from: u4 */
    public final C8952ug m33947u4() {
        return this.f24545up;
    }

    /* JADX INFO: renamed from: up */
    public final C9255y3 m33948up() {
        return this.f24539h4;
    }

    /* JADX INFO: renamed from: uz */
    public final C7249ah m33949uz() {
        return this.f24547yj;
    }

    /* JADX INFO: renamed from: x1 */
    public final C7208a2 m33950x1() {
        if (this.f24536du != null) {
            throw new Exception("Only one <units> element can be added.");
        }
        C7208a2 c7208a2 = new C7208a2();
        this.f24536du = c7208a2;
        return c7208a2;
    }

    /* JADX INFO: renamed from: x6 */
    public final C7730g5 m33951x6() {
        return this.f24540jd;
    }

    /* JADX INFO: renamed from: yj */
    public final C9255y3 m33952yj() {
        return this.f24543m9;
    }

    public C7913i8(final AbstractC13912i5 abstractC13912i5) {
        m33923qq();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.i8.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C7913i8.f24533ks.m27428k4(str);
                if (iM27428k4 == 0) {
                    C7913i8.this.f24541k4 = AbstractC7361bz.m29295ne(str2);
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                C7913i8.this.f24546x1 = C13850af.m65068c5(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.i8.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                C7913i8 c7913i8;
                C7394ca c7394ca;
                switch (C7913i8.f24533ks.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 2:
                        c7913i8 = C7913i8.this;
                        c7394ca = new C7394ca("catScaling", new C8166l9(abstractC13912i5));
                        break;
                    case 3:
                        c7913i8 = C7913i8.this;
                        c7394ca = new C7394ca("valScaling", new C8766se(abstractC13912i5));
                        break;
                    case 4:
                        C7913i8.this.f24544to = new C7926ie(abstractC13912i5);
                        return true;
                    case 5:
                        C7913i8.this.f24536du = new C7208a2(abstractC13912i5);
                        return true;
                    case 6:
                        C7913i8.this.f24539h4 = new C9255y3(abstractC13912i5);
                        return true;
                    case 7:
                        C7913i8.this.f24543m9 = new C9255y3(abstractC13912i5);
                        return true;
                    case 8:
                        C7913i8.this.f24537dy = new C7884hw(abstractC13912i5);
                        return true;
                    case 9:
                        C7913i8.this.f24534c5 = new C7884hw(abstractC13912i5);
                        return true;
                    case 10:
                        C7913i8.this.f24540jd = new C7730g5(abstractC13912i5);
                        return true;
                    case 11:
                        C7913i8.this.f24535ck = new C7314bd(abstractC13912i5);
                        return true;
                    case 12:
                        C7913i8.this.f24538fa = new C8087kh(abstractC13912i5);
                        return true;
                    case 13:
                        C7913i8.this.f24545up = new C8952ug(abstractC13912i5);
                        return true;
                    case 14:
                        C7913i8.this.f24547yj = new C7249ah(abstractC13912i5);
                        return true;
                    default:
                        return false;
                }
                c7913i8.f24542kk = c7394ca;
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C7394ca m33935k4(String str) {
        C7394ca c7394ca;
        if (this.f24542kk != null) {
            throw new Exception("AxisScaling already is initialized.");
        }
        int iM27428k4 = f24533ks.m27428k4(str);
        if (iM27428k4 == 2) {
            c7394ca = new C7394ca("catScaling", new C8166l9());
        } else {
            if (iM27428k4 != 3) {
                throw new Exception(C14113y2.m67408k4("Wrong element: ", str));
            }
            c7394ca = new C7394ca("valScaling", new C8766se());
        }
        this.f24542kk = c7394ca;
        return this.f24542kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final C7926ie m33936k4() {
        if (this.f24544to != null) {
            throw new Exception("Only one <title> element can be added.");
        }
        C7926ie c7926ie = new C7926ie();
        this.f24544to = c7926ie;
        return c7926ie;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m33937k4(long j) {
        this.f24541k4 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m33938k4(C7249ah c7249ah) {
        this.f24547yj = c7249ah;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m33939k4(C7884hw c7884hw) {
        this.f24537dy = c7884hw;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("id", C13850af.m65147x1(this.f24541k4));
        boolean z = this.f24546x1;
        if (z) {
            c3059ii.m12955x1("hidden", z ? "1" : "0");
        }
        C7394ca c7394ca = this.f24542kk;
        if (c7394ca != null) {
            int iM27428k4 = f24533ks.m27428k4(c7394ca.m29539k4());
            if (iM27428k4 == 2) {
                ((C8166l9) this.f24542kk.m29541kk()).mo6846k4("cx", c3059ii, this.f24542kk.m29539k4());
            } else if (iM27428k4 == 3) {
                ((C8766se) this.f24542kk.m29541kk()).mo6846k4("cx", c3059ii, this.f24542kk.m29539k4());
            }
        }
        C7926ie c7926ie = this.f24544to;
        if (c7926ie != null) {
            c7926ie.mo6846k4("cx", c3059ii, NoteMeta.PROPERTY_TITLE);
        }
        C7208a2 c7208a2 = this.f24536du;
        if (c7208a2 != null) {
            c7208a2.mo6846k4("cx", c3059ii, "units");
        }
        C9255y3 c9255y3 = this.f24539h4;
        if (c9255y3 != null) {
            c9255y3.mo6846k4("cx", c3059ii, "majorGridlines");
        }
        C9255y3 c9255y32 = this.f24543m9;
        if (c9255y32 != null) {
            c9255y32.mo6846k4("cx", c3059ii, "minorGridlines");
        }
        C7884hw c7884hw = this.f24537dy;
        if (c7884hw != null) {
            c7884hw.mo6846k4("cx", c3059ii, "majorTickMarks");
        }
        C7884hw c7884hw2 = this.f24534c5;
        if (c7884hw2 != null) {
            c7884hw2.mo6846k4("cx", c3059ii, "minorTickMarks");
        }
        C7730g5 c7730g5 = this.f24540jd;
        if (c7730g5 != null) {
            c7730g5.mo6846k4("cx", c3059ii, "tickLabels");
        }
        C7314bd c7314bd = this.f24535ck;
        if (c7314bd != null) {
            c7314bd.mo6846k4("cx", c3059ii, "numFmt");
        }
        C8087kh c8087kh = this.f24538fa;
        if (c8087kh != null) {
            c8087kh.mo6846k4("cx", c3059ii, "spPr");
        }
        C8952ug c8952ug = this.f24545up;
        if (c8952ug != null) {
            c8952ug.mo6846k4("cx", c3059ii, "txPr");
        }
        C7249ah c7249ah = this.f24547yj;
        if (c7249ah != null) {
            c7249ah.mo6846k4("cx", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m33940k4(boolean z) {
        this.f24546x1 = z;
    }
}

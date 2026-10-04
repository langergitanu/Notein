package com.aspose.slides.internal.p332p7;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.wi */
/* JADX INFO: loaded from: classes4.dex */
public class C9115wi extends AbstractC7361bz {

    /* JADX INFO: renamed from: x6 */
    private static final C7017h4 f32316x6 = new C7017h4("dLbl", RequestParameters.SUBRESOURCE_DELETE, "numFmt", "spPr", "txPr", "dLblPos", "showLegendKey", "showVal", "showCatName", "showSerName", "showPercent", "showBubbleSize", "separator", "showLeaderLines", "leaderLines", "extLst");

    /* JADX INFO: renamed from: c5 */
    private C8828t1 f32317c5;

    /* JADX INFO: renamed from: ck */
    private C8828t1 f32318ck;

    /* JADX INFO: renamed from: du */
    private C8304n1 f32319du;

    /* JADX INFO: renamed from: dy */
    private C8828t1 f32320dy;

    /* JADX INFO: renamed from: fa */
    private String f32321fa;

    /* JADX INFO: renamed from: h4 */
    private C8828t1 f32322h4;

    /* JADX INFO: renamed from: jd */
    private C8828t1 f32323jd;

    /* JADX INFO: renamed from: k4 */
    private List<C9342z4> f32324k4;

    /* JADX INFO: renamed from: kk */
    private C8087kh f32325kk;

    /* JADX INFO: renamed from: ks */
    private C7394ca f32326ks;

    /* JADX INFO: renamed from: m9 */
    private C8828t1 f32327m9;

    /* JADX INFO: renamed from: rv */
    private C7683fo f32328rv;

    /* JADX INFO: renamed from: to */
    private C8952ug f32329to;

    /* JADX INFO: renamed from: up */
    private C8828t1 f32330up;

    /* JADX INFO: renamed from: x1 */
    private C7937ik f32331x1;

    /* JADX INFO: renamed from: yj */
    private C7571eh f32332yj;

    public C9115wi() {
        m43674ak();
    }

    /* JADX INFO: renamed from: ak */
    private void m43674ak() {
        this.f32324k4 = new List<>();
    }

    /* JADX INFO: renamed from: ar */
    public final C8828t1 m43693ar() {
        return this.f32323jd;
    }

    /* JADX INFO: renamed from: b3 */
    public final AbstractC7414ck m43694b3() {
        return this.f32328rv;
    }

    /* JADX INFO: renamed from: bv */
    public final String m43695bv() {
        return this.f32321fa;
    }

    /* JADX INFO: renamed from: c5 */
    public final C8828t1 m43696c5() {
        if (this.f32317c5 != null) {
            throw new Exception("Only one <showSerName> element can be added.");
        }
        C8828t1 c8828t1 = new C8828t1();
        this.f32317c5 = c8828t1;
        return c8828t1;
    }

    /* JADX INFO: renamed from: ck */
    public final C8828t1 m43697ck() {
        if (this.f32318ck != null) {
            throw new Exception("Only one <showBubbleSize> element can be added.");
        }
        C8828t1 c8828t1 = new C8828t1();
        this.f32318ck = c8828t1;
        return c8828t1;
    }

    /* JADX INFO: renamed from: du */
    public final C8304n1 m43698du() {
        if (this.f32319du != null) {
            throw new Exception("Only one <dLblPos> element can be added.");
        }
        C8304n1 c8304n1 = new C8304n1();
        this.f32319du = c8304n1;
        return c8304n1;
    }

    /* JADX INFO: renamed from: dy */
    public final C8828t1 m43700dy() {
        if (this.f32320dy != null) {
            throw new Exception("Only one <showCatName> element can be added.");
        }
        C8828t1 c8828t1 = new C8828t1();
        this.f32320dy = c8828t1;
        return c8828t1;
    }

    /* JADX INFO: renamed from: fa */
    public final C8828t1 m43701fa() {
        if (this.f32330up != null) {
            throw new Exception("Only one <showLeaderLines> element can be added.");
        }
        C8828t1 c8828t1 = new C8828t1();
        this.f32330up = c8828t1;
        return c8828t1;
    }

    /* JADX INFO: renamed from: h4 */
    public final C8828t1 m43702h4() {
        if (this.f32322h4 != null) {
            throw new Exception("Only one <showLegendKey> element can be added.");
        }
        C8828t1 c8828t1 = new C8828t1();
        this.f32322h4 = c8828t1;
        return c8828t1;
    }

    /* JADX INFO: renamed from: ix */
    public final C8304n1 m43704ix() {
        return this.f32319du;
    }

    /* JADX INFO: renamed from: jd */
    public final C8828t1 m43705jd() {
        if (this.f32323jd != null) {
            throw new Exception("Only one <showPercent> element can be added.");
        }
        C8828t1 c8828t1 = new C8828t1();
        this.f32323jd = c8828t1;
        return c8828t1;
    }

    /* JADX INFO: renamed from: kk */
    public final C8087kh m43709kk() {
        if (this.f32325kk != null) {
            throw new Exception("Only one <spPr> element can be added.");
        }
        C8087kh c8087kh = new C8087kh();
        this.f32325kk = c8087kh;
        return c8087kh;
    }

    /* JADX INFO: renamed from: ks */
    public final C9342z4[] m43711ks() {
        return this.f32324k4.toArray(new C9342z4[0]);
    }

    /* JADX INFO: renamed from: lr */
    public final C7571eh m43712lr() {
        return this.f32332yj;
    }

    /* JADX INFO: renamed from: m9 */
    public final C8828t1 m43713m9() {
        if (this.f32327m9 != null) {
            throw new Exception("Only one <showVal> element can be added.");
        }
        C8828t1 c8828t1 = new C8828t1();
        this.f32327m9 = c8828t1;
        return c8828t1;
    }

    /* JADX INFO: renamed from: ne */
    public final C8952ug m43715ne() {
        return this.f32329to;
    }

    /* JADX INFO: renamed from: qq */
    public final C8828t1 m43716qq() {
        return this.f32317c5;
    }

    /* JADX INFO: renamed from: rv */
    public final C7937ik m43717rv() {
        return this.f32331x1;
    }

    /* JADX INFO: renamed from: u4 */
    public final C8828t1 m43720u4() {
        return this.f32322h4;
    }

    /* JADX INFO: renamed from: um */
    public final C8828t1 m43721um() {
        return this.f32318ck;
    }

    /* JADX INFO: renamed from: up */
    public final C7571eh m43722up() {
        if (this.f32332yj != null) {
            throw new Exception("Only one <leaderLines> element can be added.");
        }
        C7571eh c7571eh = new C7571eh();
        this.f32332yj = c7571eh;
        return c7571eh;
    }

    /* JADX INFO: renamed from: uz */
    public final C8828t1 m43723uz() {
        return this.f32327m9;
    }

    /* JADX INFO: renamed from: v4 */
    public final C8828t1 m43724v4() {
        return this.f32330up;
    }

    /* JADX INFO: renamed from: wl */
    public final C8828t1 m43725wl() {
        return this.f32320dy;
    }

    /* JADX INFO: renamed from: x1 */
    public final C7937ik m43726x1() {
        if (this.f32331x1 != null) {
            throw new Exception("Only one <numFmt> element can be added.");
        }
        C7937ik c7937ik = new C7937ik();
        this.f32331x1 = c7937ik;
        return c7937ik;
    }

    /* JADX INFO: renamed from: x6 */
    public final C8087kh m43729x6() {
        return this.f32325kk;
    }

    /* JADX INFO: renamed from: yd */
    public final C7394ca m43730yd() {
        return this.f32326ks;
    }

    /* JADX INFO: renamed from: yj */
    public final AbstractC7414ck m43731yj() {
        if (this.f32328rv != null) {
            throw new Exception("Only one <extLst> element can be added.");
        }
        C7683fo c7683fo = new C7683fo();
        this.f32328rv = c7683fo;
        return c7683fo;
    }

    public C9115wi(final AbstractC13912i5 abstractC13912i5) {
        m43674ak();
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.wi.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                switch (C9115wi.f32316x6.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 0:
                        C9115wi.this.f32324k4.addItem(new C9342z4(abstractC13912i5));
                        return true;
                    case 1:
                        C9115wi.this.f32326ks = new C7394ca(RequestParameters.SUBRESOURCE_DELETE, new C8828t1(abstractC13912i5));
                        return true;
                    case 2:
                        C9115wi.this.f32331x1 = new C7937ik(abstractC13912i5);
                        return true;
                    case 3:
                        C9115wi.this.f32325kk = new C8087kh(abstractC13912i5);
                        return true;
                    case 4:
                        C9115wi.this.f32329to = new C8952ug(abstractC13912i5);
                        return true;
                    case 5:
                        C9115wi.this.f32319du = new C8304n1(abstractC13912i5);
                        return true;
                    case 6:
                        C9115wi.this.f32322h4 = new C8828t1(abstractC13912i5);
                        return true;
                    case 7:
                        C9115wi.this.f32327m9 = new C8828t1(abstractC13912i5);
                        return true;
                    case 8:
                        C9115wi.this.f32320dy = new C8828t1(abstractC13912i5);
                        return true;
                    case 9:
                        C9115wi.this.f32317c5 = new C8828t1(abstractC13912i5);
                        return true;
                    case 10:
                        C9115wi.this.f32323jd = new C8828t1(abstractC13912i5);
                        return true;
                    case 11:
                        C9115wi.this.f32318ck = new C8828t1(abstractC13912i5);
                        return true;
                    case 12:
                        C9115wi.this.f32321fa = abstractC13912i5.mo65052v4();
                        if (abstractC13912i5.mo65048u4()) {
                            return true;
                        }
                        while (abstractC13912i5.mo65028jd() != 15) {
                            abstractC13912i5.mo65026h4();
                            C9115wi c9115wi = C9115wi.this;
                            c9115wi.f32321fa = C14113y2.m67400k4(c9115wi.f32321fa, abstractC13912i5.mo65052v4());
                        }
                        return true;
                    case 13:
                        C9115wi.this.f32330up = new C8828t1(abstractC13912i5);
                        return true;
                    case 14:
                        C9115wi.this.f32332yj = new C7571eh(abstractC13912i5);
                        return true;
                    case 15:
                        C9115wi.this.f32328rv = new C7683fo(abstractC13912i5);
                        return true;
                    default:
                        return false;
                }
            }
        });
    }

    /* JADX INFO: renamed from: to */
    public final C8952ug m43718to() {
        if (this.f32329to != null) {
            throw new Exception("Only one <txPr> element can be added.");
        }
        C8952ug c8952ug = new C8952ug();
        this.f32329to = c8952ug;
        return c8952ug;
    }

    /* JADX INFO: renamed from: du */
    public final void m43699du(C8828t1 c8828t1) {
        this.f32323jd = c8828t1;
    }

    /* JADX INFO: renamed from: h4 */
    public final void m43703h4(C8828t1 c8828t1) {
        this.f32318ck = c8828t1;
    }

    /* JADX INFO: renamed from: k4 */
    public final C7394ca m43706k4(String str) {
        if (this.f32326ks != null) {
            throw new Exception("Delete already is initialized.");
        }
        if (f32316x6.m27428k4(str) != 1) {
            throw new Exception(C14113y2.m67408k4("Wrong element: ", str));
        }
        C7394ca c7394ca = new C7394ca(RequestParameters.SUBRESOURCE_DELETE, new C8828t1());
        this.f32326ks = c7394ca;
        return c7394ca;
    }

    /* JADX INFO: renamed from: kk */
    public final void m43710kk(C8828t1 c8828t1) {
        this.f32320dy = c8828t1;
    }

    /* JADX INFO: renamed from: m9 */
    public final void m43714m9(C8828t1 c8828t1) {
        this.f32330up = c8828t1;
    }

    /* JADX INFO: renamed from: to */
    public final void m43719to(C8828t1 c8828t1) {
        this.f32317c5 = c8828t1;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m43727x1(C8828t1 c8828t1) {
        this.f32327m9 = c8828t1;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m43728x1(String str) {
        this.f32321fa = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final C9342z4 m43707k4() {
        C9342z4 c9342z4 = new C9342z4();
        this.f32324k4.addItem(c9342z4);
        return c9342z4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m43708k4(C8828t1 c8828t1) {
        this.f32322h4 = c8828t1;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) throws Throwable {
        Throwable th;
        C3059ii c3059ii2;
        C9115wi c9115wi;
        c3059ii.mo12953k4(str, str2, (String) null);
        List.Enumerator<C9342z4> it = this.f32324k4.iterator();
        while (it.hasNext()) {
            try {
                try {
                    it.next().mo6846k4("c", c3059ii, "dLbl");
                } catch (Throwable th2) {
                    th = th2;
                    if (!C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        throw th;
                    }
                    it.dispose();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        C7394ca c7394ca = this.f32326ks;
        if (c7394ca != null && f32316x6.m27428k4(c7394ca.m29539k4()) == 1) {
            ((C8828t1) this.f32326ks.m29541kk()).mo6846k4("c", c3059ii, this.f32326ks.m29539k4());
        }
        C7937ik c7937ik = this.f32331x1;
        if (c7937ik != null) {
            c7937ik.mo6846k4("c", c3059ii, "numFmt");
        }
        C8087kh c8087kh = this.f32325kk;
        if (c8087kh != null) {
            c8087kh.mo6846k4("c", c3059ii, "spPr");
        }
        C8952ug c8952ug = this.f32329to;
        if (c8952ug != null) {
            c8952ug.mo6846k4("c", c3059ii, "txPr");
        }
        C8304n1 c8304n1 = this.f32319du;
        if (c8304n1 != null) {
            c8304n1.mo6846k4("c", c3059ii, "dLblPos");
        }
        C8828t1 c8828t1 = this.f32322h4;
        if (c8828t1 != null) {
            c8828t1.mo6846k4("c", c3059ii, "showLegendKey");
        }
        C8828t1 c8828t12 = this.f32327m9;
        if (c8828t12 != null) {
            c8828t12.mo6846k4("c", c3059ii, "showVal");
        }
        C8828t1 c8828t13 = this.f32320dy;
        if (c8828t13 != null) {
            c8828t13.mo6846k4("c", c3059ii, "showCatName");
        }
        C8828t1 c8828t14 = this.f32317c5;
        if (c8828t14 != null) {
            c8828t14.mo6846k4("c", c3059ii, "showSerName");
        }
        C8828t1 c8828t15 = this.f32323jd;
        if (c8828t15 != null) {
            c8828t15.mo6846k4("c", c3059ii, "showPercent");
        }
        C8828t1 c8828t16 = this.f32318ck;
        if (c8828t16 != null) {
            c8828t16.mo6846k4("c", c3059ii, "showBubbleSize");
        }
        String str3 = this.f32321fa;
        if (str3 != null) {
            c3059ii2 = c3059ii;
            m29301k4("c", c3059ii2, "separator", str3, false);
            c9115wi = this;
        } else {
            c3059ii2 = c3059ii;
            c9115wi = this;
        }
        C8828t1 c8828t17 = c9115wi.f32330up;
        if (c8828t17 != null) {
            c8828t17.mo6846k4("c", c3059ii2, "showLeaderLines");
        }
        C7571eh c7571eh = c9115wi.f32332yj;
        if (c7571eh != null) {
            c7571eh.mo6846k4("c", c3059ii2, "leaderLines");
        }
        C7683fo c7683fo = c9115wi.f32328rv;
        if (c7683fo != null) {
            c7683fo.mo6846k4("c", c3059ii2, "extLst");
        }
        c3059ii2.mo21898jd();
    }
}

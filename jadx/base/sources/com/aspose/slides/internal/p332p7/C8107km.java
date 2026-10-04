package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.km */
/* JADX INFO: loaded from: classes4.dex */
public class C8107km extends AbstractC7361bz {

    /* JADX INFO: renamed from: c5 */
    private C7249ah f25791c5;

    /* JADX INFO: renamed from: du */
    private boolean f25792du;

    /* JADX INFO: renamed from: dy */
    private C8952ug f25793dy;

    /* JADX INFO: renamed from: h4 */
    private C8294mw f25794h4;

    /* JADX INFO: renamed from: kk */
    private int f25795kk;

    /* JADX INFO: renamed from: m9 */
    private C8087kh f25796m9;

    /* JADX INFO: renamed from: to */
    private int f25797to;

    /* JADX INFO: renamed from: k4 */
    public static final int f25789k4 = C9284yh.m45002k4("t");

    /* JADX INFO: renamed from: x1 */
    public static final int f25790x1 = C8769sg.m41008k4("ctr");

    /* JADX INFO: renamed from: jd */
    private static final C7017h4 f25788jd = new C7017h4("pos", "align", "overlay", "tx", "spPr", "txPr", "extLst");

    public C8107km() {
        m35518fa();
    }

    /* JADX INFO: renamed from: fa */
    private void m35518fa() {
        this.f25795kk = f25789k4;
        this.f25797to = f25790x1;
        this.f25792du = false;
    }

    /* JADX INFO: renamed from: c5 */
    public final C8952ug m35526c5() {
        return this.f25793dy;
    }

    /* JADX INFO: renamed from: du */
    public final int m35527du() {
        return this.f25797to;
    }

    /* JADX INFO: renamed from: dy */
    public final C8087kh m35528dy() {
        return this.f25796m9;
    }

    /* JADX INFO: renamed from: h4 */
    public final boolean m35529h4() {
        return this.f25792du;
    }

    /* JADX INFO: renamed from: jd */
    public final C7249ah m35530jd() {
        return this.f25791c5;
    }

    /* JADX INFO: renamed from: kk */
    public final C8952ug m35534kk() {
        if (this.f25793dy != null) {
            throw new Exception("Only one <txPr> element can be added.");
        }
        C8952ug c8952ug = new C8952ug();
        this.f25793dy = c8952ug;
        return c8952ug;
    }

    /* JADX INFO: renamed from: m9 */
    public final C8294mw m35535m9() {
        return this.f25794h4;
    }

    /* JADX INFO: renamed from: to */
    public final int m35536to() {
        return this.f25795kk;
    }

    public C8107km(final AbstractC13912i5 abstractC13912i5) {
        m35518fa();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.km.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C8107km.f25788jd.m27428k4(str);
                if (iM27428k4 == 0) {
                    C8107km.this.f25795kk = C9284yh.m45002k4(str2);
                    return true;
                }
                if (iM27428k4 == 1) {
                    C8107km.this.f25797to = C8769sg.m41008k4(str2);
                    return true;
                }
                if (iM27428k4 != 2) {
                    return false;
                }
                C8107km.this.f25792du = C13850af.m65068c5(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.km.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C8107km.f25788jd.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 3) {
                    C8107km.this.f25794h4 = new C8294mw(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 == 4) {
                    C8107km.this.f25796m9 = new C8087kh(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 == 5) {
                    C8107km.this.f25793dy = new C8952ug(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 != 6) {
                    return false;
                }
                C8107km.this.f25791c5 = new C7249ah(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    public final C8087kh m35537x1() {
        if (this.f25796m9 != null) {
            throw new Exception("Only one <spPr> element can be added.");
        }
        C8087kh c8087kh = new C8087kh();
        this.f25796m9 = c8087kh;
        return c8087kh;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m35538x1(int i) {
        this.f25797to = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final C8294mw m35531k4() {
        if (this.f25794h4 != null) {
            throw new Exception("Only one <tx> element can be added.");
        }
        C8294mw c8294mw = new C8294mw();
        this.f25794h4 = c8294mw;
        return c8294mw;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m35532k4(int i) {
        this.f25795kk = i;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        int i = this.f25795kk;
        if (i != f25789k4) {
            c3059ii.m12955x1("pos", C9284yh.m45003k4(i));
        }
        int i2 = this.f25797to;
        if (i2 != f25790x1) {
            c3059ii.m12955x1("align", C8769sg.m41009k4(i2));
        }
        boolean z = this.f25792du;
        if (z) {
            c3059ii.m12955x1("overlay", z ? "1" : "0");
        }
        C8294mw c8294mw = this.f25794h4;
        if (c8294mw != null) {
            c8294mw.mo6846k4("cx", c3059ii, "tx");
        }
        C8087kh c8087kh = this.f25796m9;
        if (c8087kh != null) {
            c8087kh.mo6846k4("cx", c3059ii, "spPr");
        }
        C8952ug c8952ug = this.f25793dy;
        if (c8952ug != null) {
            c8952ug.mo6846k4("cx", c3059ii, "txPr");
        }
        C7249ah c7249ah = this.f25791c5;
        if (c7249ah != null) {
            c7249ah.mo6846k4("cx", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m35533k4(boolean z) {
        this.f25792du = z;
    }
}

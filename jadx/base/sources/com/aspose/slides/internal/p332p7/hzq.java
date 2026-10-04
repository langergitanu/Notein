package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.facebook.common.callercontext.ContextChain;

/* JADX INFO: loaded from: classes4.dex */
public class hzq extends AbstractC7361bz {

    /* JADX INFO: renamed from: jd */
    private static final C7017h4 f24427jd = new C7017h4("spid", "name", "showAsIcon", "r:id", "imgW", "imgH", "progId", "embed", "link", "pic");

    /* JADX INFO: renamed from: c5 */
    private C7513du f24428c5;

    /* JADX INFO: renamed from: du */
    private double f24429du;

    /* JADX INFO: renamed from: dy */
    private C7394ca f24430dy;

    /* JADX INFO: renamed from: h4 */
    private double f24431h4;

    /* JADX INFO: renamed from: k4 */
    private String f24432k4;

    /* JADX INFO: renamed from: kk */
    private boolean f24433kk;

    /* JADX INFO: renamed from: m9 */
    private String f24434m9;

    /* JADX INFO: renamed from: to */
    private String f24435to;

    /* JADX INFO: renamed from: x1 */
    private String f24436x1;

    public hzq() {
        m33753fa();
    }

    /* JADX INFO: renamed from: fa */
    private void m33753fa() {
        this.f24436x1 = "";
        this.f24433kk = false;
        this.f24429du = Double.NaN;
        this.f24431h4 = Double.NaN;
    }

    /* JADX INFO: renamed from: c5 */
    public final C7394ca m33763c5() {
        return this.f24430dy;
    }

    /* JADX INFO: renamed from: du */
    public final String m33764du() {
        return this.f24435to;
    }

    /* JADX INFO: renamed from: dy */
    public final String m33766dy() {
        return this.f24434m9;
    }

    /* JADX INFO: renamed from: h4 */
    public final double m33767h4() {
        return this.f24429du;
    }

    /* JADX INFO: renamed from: jd */
    public final C7513du m33768jd() {
        return this.f24428c5;
    }

    /* JADX INFO: renamed from: kk */
    public final String m33773kk() {
        return this.f24436x1;
    }

    /* JADX INFO: renamed from: m9 */
    public final double m33775m9() {
        return this.f24431h4;
    }

    public hzq(final AbstractC13912i5 abstractC13912i5) {
        m33753fa();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.hzq.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (hzq.f24427jd.m27428k4(str)) {
                    case 0:
                        hzq.this.f24432k4 = str2;
                        break;
                    case 1:
                        hzq.this.f24436x1 = str2;
                        break;
                    case 2:
                        hzq.this.f24433kk = C13850af.m65068c5(str2);
                        break;
                    case 3:
                        hzq.this.f24435to = str2;
                        break;
                    case 4:
                        hzq.this.f24429du = C13850af.m65132uz(str2) / 12700.0d;
                        break;
                    case 5:
                        hzq.this.f24431h4 = C13850af.m65132uz(str2) / 12700.0d;
                        break;
                    case 6:
                        hzq.this.f24434m9 = str2;
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.hzq.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                hzq hzqVar;
                C7394ca c7394ca;
                int iM27428k4 = hzq.f24427jd.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 7) {
                    hzqVar = hzq.this;
                    c7394ca = new C7394ca("embed", new cfo(abstractC13912i5));
                } else {
                    if (iM27428k4 != 8) {
                        if (iM27428k4 != 9) {
                            return false;
                        }
                        hzq.this.f24428c5 = new C7513du(abstractC13912i5);
                        return true;
                    }
                    hzqVar = hzq.this;
                    c7394ca = new C7394ca("link", new uj6(abstractC13912i5));
                }
                hzqVar.f24430dy = c7394ca;
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: du */
    public final void m33765du(String str) {
        this.f24434m9 = str;
    }

    /* JADX INFO: renamed from: to */
    public final void m33776to(String str) {
        this.f24435to = str;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m33778x1() {
        return this.f24432k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final C7394ca m33769k4(String str) {
        C7394ca c7394ca;
        if (this.f24430dy != null) {
            throw new Exception("OleObject already is initialized.");
        }
        int iM27428k4 = f24427jd.m27428k4(str);
        if (iM27428k4 == 7) {
            c7394ca = new C7394ca("embed", new cfo());
        } else {
            if (iM27428k4 != 8) {
                throw new Exception(C14113y2.m67408k4("Wrong element: ", str));
            }
            c7394ca = new C7394ca("link", new uj6());
        }
        this.f24430dy = c7394ca;
        return this.f24430dy;
    }

    /* JADX INFO: renamed from: kk */
    public final void m33774kk(String str) {
        this.f24436x1 = str;
    }

    /* JADX INFO: renamed from: to */
    public final boolean m33777to() {
        return this.f24433kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final C7513du m33770k4() {
        if (this.f24428c5 != null) {
            throw new Exception("Only one <pic> element can be added.");
        }
        C7513du c7513du = new C7513du();
        this.f24428c5 = c7513du;
        return c7513du;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m33779x1(double d) {
        this.f24431h4 = d;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m33780x1(String str) {
        this.f24432k4 = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m33771k4(double d) {
        this.f24429du = d;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(ContextChain.TAG_PRODUCT, str2, "http://schemas.openxmlformats.org/presentationml/2006/main");
        if (c3059ii.mo12952k4("http://schemas.openxmlformats.org/officeDocument/2006/relationships") == null) {
            c3059ii.m12954to("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
        }
        if (c3059ii.mo12952k4("http://schemas.openxmlformats.org/drawingml/2006/main") == null) {
            c3059ii.m12954to("xmlns", "a", null, "http://schemas.openxmlformats.org/drawingml/2006/main");
        }
        String str3 = this.f24432k4;
        if (str3 != null) {
            c3059ii.m12955x1("spid", str3);
        }
        if (!"".equals(this.f24436x1)) {
            c3059ii.m12955x1("name", this.f24436x1);
        }
        boolean z = this.f24433kk;
        if (z) {
            c3059ii.m12955x1("showAsIcon", z ? "1" : "0");
        }
        if (this.f24435to != null) {
            if (c3059ii.mo12952k4("http://schemas.openxmlformats.org/officeDocument/2006/relationships") == null) {
                c3059ii.m12954to("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
            }
            c3059ii.m12955x1("r:id", this.f24435to);
        }
        if (!C14044b3.m66437kk(this.f24429du)) {
            c3059ii.m12955x1("imgW", C22238OooO0oO.OooO00o(this.f24429du, 12700.0d, 14));
        }
        if (!C14044b3.m66437kk(this.f24431h4)) {
            c3059ii.m12955x1("imgH", C22238OooO0oO.OooO00o(this.f24431h4, 12700.0d, 14));
        }
        String str4 = this.f24434m9;
        if (str4 != null) {
            c3059ii.m12955x1("progId", str4);
        }
        C7394ca c7394ca = this.f24430dy;
        if (c7394ca != null) {
            int iM27428k4 = f24427jd.m27428k4(c7394ca.m29539k4());
            if (iM27428k4 == 7) {
                ((cfo) this.f24430dy.m29541kk()).mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, this.f24430dy.m29539k4());
            } else if (iM27428k4 == 8) {
                ((uj6) this.f24430dy.m29541kk()).mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, this.f24430dy.m29539k4());
            }
        }
        C7513du c7513du = this.f24428c5;
        if (c7513du != null) {
            c7513du.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "pic");
        }
        c3059ii.mo21898jd();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m33772k4(boolean z) {
        this.f24433kk = z;
    }
}

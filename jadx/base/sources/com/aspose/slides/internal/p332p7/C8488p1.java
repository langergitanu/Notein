package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.huawei.hms.network.embedded.C18437z2;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.p1 */
/* JADX INFO: loaded from: classes4.dex */
public class C8488p1 extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private C7261ao f28193du;

    /* JADX INFO: renamed from: dy */
    private C8397nz f28194dy;

    /* JADX INFO: renamed from: h4 */
    private C8087kh f28195h4;

    /* JADX INFO: renamed from: kk */
    private int f28196kk;

    /* JADX INFO: renamed from: m9 */
    private C8952ug f28197m9;

    /* JADX INFO: renamed from: to */
    private String f28198to;

    /* JADX INFO: renamed from: x1 */
    private String f28199x1;

    /* JADX INFO: renamed from: k4 */
    public static final int f28192k4 = C8658r8.m39906k4("node");

    /* JADX INFO: renamed from: c5 */
    private static final C7017h4 f28191c5 = new C7017h4("modelId", C18437z2.f56754h, "cxnId", "prSet", "spPr", "t", "extLst");

    public C8488p1() {
        m38557fa();
    }

    /* JADX INFO: renamed from: fa */
    private void m38557fa() {
        this.f28196kk = f28192k4;
        this.f28198to = "0";
    }

    /* JADX INFO: renamed from: c5 */
    public final C8952ug m38565c5() {
        return this.f28197m9;
    }

    /* JADX INFO: renamed from: du */
    public final String m38566du() {
        return this.f28199x1;
    }

    /* JADX INFO: renamed from: dy */
    public final C8087kh m38567dy() {
        return this.f28195h4;
    }

    /* JADX INFO: renamed from: h4 */
    public final int m38568h4() {
        return this.f28196kk;
    }

    /* JADX INFO: renamed from: jd */
    public final AbstractC7414ck m38569jd() {
        return this.f28194dy;
    }

    /* JADX INFO: renamed from: kk */
    public final C8952ug m38575kk() {
        if (this.f28197m9 != null) {
            throw new Exception("Only one <t> element can be added.");
        }
        C8952ug c8952ug = new C8952ug();
        this.f28197m9 = c8952ug;
        return c8952ug;
    }

    /* JADX INFO: renamed from: m9 */
    public final C7261ao m38576m9() {
        return this.f28193du;
    }

    /* JADX INFO: renamed from: to */
    public final AbstractC7414ck m38577to() {
        if (this.f28194dy != null) {
            throw new Exception("Only one <extLst> element can be added.");
        }
        C8397nz c8397nz = new C8397nz();
        this.f28194dy = c8397nz;
        return c8397nz;
    }

    /* JADX INFO: renamed from: x1 */
    public final C8087kh m38578x1() {
        if (this.f28195h4 != null) {
            throw new Exception("Only one <spPr> element can be added.");
        }
        C8087kh c8087kh = new C8087kh();
        this.f28195h4 = c8087kh;
        return c8087kh;
    }

    public C8488p1(final AbstractC13912i5 abstractC13912i5) {
        m38557fa();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.p1.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C8488p1.f28191c5.m27428k4(str);
                if (iM27428k4 == 0) {
                    C8488p1.this.f28199x1 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    C8488p1.this.f28196kk = C8658r8.m39906k4(str2);
                    return true;
                }
                if (iM27428k4 != 2) {
                    return false;
                }
                C8488p1.this.f28198to = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.p1.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C8488p1.f28191c5.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 3) {
                    C8488p1.this.f28193du = new C7261ao(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 == 4) {
                    C8488p1.this.f28195h4 = new C8087kh(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 == 5) {
                    C8488p1.this.f28197m9 = new C8952ug(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 != 6) {
                    return false;
                }
                C8488p1.this.f28194dy = new C8397nz(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C7261ao m38570k4() {
        if (this.f28193du != null) {
            throw new Exception("Only one <prSet> element can be added.");
        }
        C7261ao c7261ao = new C7261ao();
        this.f28193du = c7261ao;
        return c7261ao;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m38579x1(String str) {
        this.f28198to = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m38571k4(int i) {
        this.f28196kk = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m38572k4(AbstractC7414ck abstractC7414ck) {
        this.f28194dy = (C8397nz) abstractC7414ck;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m38573k4(C8952ug c8952ug) {
        this.f28197m9 = c8952ug;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m38574k4(String str) {
        this.f28199x1 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("modelId", this.f28199x1);
        int i = this.f28196kk;
        if (i != f28192k4) {
            c3059ii.m12955x1(C18437z2.f56754h, C8658r8.m39907k4(i));
        }
        if (!"0".equals(this.f28198to)) {
            c3059ii.m12955x1("cxnId", this.f28198to);
        }
        C7261ao c7261ao = this.f28193du;
        if (c7261ao != null) {
            c7261ao.mo6846k4("dgm", c3059ii, "prSet");
        }
        C8087kh c8087kh = this.f28195h4;
        if (c8087kh != null) {
            c8087kh.mo6846k4("dgm", c3059ii, "spPr");
        }
        C8952ug c8952ug = this.f28197m9;
        if (c8952ug != null) {
            c8952ug.mo6846k4("dgm", c3059ii, "t");
        }
        C8397nz c8397nz = this.f28194dy;
        if (c8397nz != null) {
            c8397nz.mo6846k4("dgm", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}

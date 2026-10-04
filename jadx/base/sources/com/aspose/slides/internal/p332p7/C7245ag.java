package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.ag */
/* JADX INFO: loaded from: classes4.dex */
public final class C7245ag extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private boolean f20047du;

    /* JADX INFO: renamed from: dy */
    private C7249ah f20048dy;

    /* JADX INFO: renamed from: h4 */
    private C8087kh f20049h4;

    /* JADX INFO: renamed from: kk */
    private int f20050kk;

    /* JADX INFO: renamed from: m9 */
    private C8952ug f20051m9;

    /* JADX INFO: renamed from: to */
    private int f20052to;

    /* JADX INFO: renamed from: k4 */
    public static final int f20045k4 = C9284yh.m45002k4("r");

    /* JADX INFO: renamed from: x1 */
    public static final int f20046x1 = C8769sg.m41008k4("ctr");

    /* JADX INFO: renamed from: c5 */
    private static final C7017h4 f20044c5 = new C7017h4("pos", "align", "overlay", "spPr", "txPr", "extLst");

    public C7245ag() {
        this.f20050kk = f20045k4;
        this.f20052to = f20046x1;
        this.f20047du = false;
    }

    /* JADX INFO: renamed from: du */
    public final boolean m28228du() {
        return this.f20047du;
    }

    /* JADX INFO: renamed from: dy */
    public final C7249ah m28229dy() {
        return this.f20048dy;
    }

    /* JADX INFO: renamed from: h4 */
    public final C8087kh m28230h4() {
        return this.f20049h4;
    }

    /* JADX INFO: renamed from: kk */
    public final int m28235kk() {
        return this.f20050kk;
    }

    /* JADX INFO: renamed from: m9 */
    public final C8952ug m28236m9() {
        return this.f20051m9;
    }

    /* JADX INFO: renamed from: to */
    public final int m28237to() {
        return this.f20052to;
    }

    public C7245ag(final AbstractC13912i5 abstractC13912i5) {
        this();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.ag.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C7245ag.f20044c5.m27428k4(str);
                if (iM27428k4 == 0) {
                    C7245ag.this.f20050kk = C9284yh.m45002k4(str2);
                } else if (iM27428k4 == 1) {
                    C7245ag.this.f20052to = C8769sg.m41008k4(str2);
                } else {
                    if (iM27428k4 != 2) {
                        return false;
                    }
                    C7245ag.this.f20047du = C13850af.m65068c5(str2);
                }
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.ag.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C7245ag.f20044c5.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 3) {
                    C7245ag.this.f20049h4 = new C8087kh(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 == 4) {
                    C7245ag.this.f20051m9 = new C8952ug(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 != 5) {
                    return false;
                }
                C7245ag.this.f20048dy = new C7249ah(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    public final C8952ug m28238x1() {
        if (this.f20051m9 != null) {
            throw new Exception("Only one <txPr> element can be added.");
        }
        C8952ug c8952ug = new C8952ug();
        this.f20051m9 = c8952ug;
        return c8952ug;
    }

    /* JADX INFO: renamed from: k4 */
    public final C8087kh m28231k4() {
        if (this.f20049h4 != null) {
            throw new Exception("Only one <spPr> element can be added.");
        }
        C8087kh c8087kh = new C8087kh();
        this.f20049h4 = c8087kh;
        return c8087kh;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m28239x1(int i) {
        this.f20052to = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m28232k4(int i) {
        this.f20050kk = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m28233k4(C7249ah c7249ah) {
        this.f20048dy = c7249ah;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("pos", C9284yh.m45003k4(this.f20050kk));
        int i = this.f20052to;
        if (i != f20046x1 && i != 0) {
            c3059ii.m12955x1("align", C8769sg.m41009k4(i));
        }
        boolean z = this.f20047du;
        if (z) {
            c3059ii.m12955x1("overlay", z ? "1" : "0");
        }
        C8087kh c8087kh = this.f20049h4;
        if (c8087kh != null) {
            c8087kh.mo6846k4("cx", c3059ii, "spPr");
        }
        C8952ug c8952ug = this.f20051m9;
        if (c8952ug != null) {
            c8952ug.mo6846k4("cx", c3059ii, "txPr");
        }
        C7249ah c7249ah = this.f20048dy;
        if (c7249ah != null) {
            c7249ah.mo6846k4("cx", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m28234k4(boolean z) {
        this.f20047du = z;
    }
}

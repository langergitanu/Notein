package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14047bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes4.dex */
public class ov2 extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private String f28129du;

    /* JADX INFO: renamed from: dy */
    private C8087kh f28130dy;

    /* JADX INFO: renamed from: h4 */
    private boolean f28131h4;

    /* JADX INFO: renamed from: kk */
    private boolean f28132kk;

    /* JADX INFO: renamed from: m9 */
    private C9220xo f28133m9;

    /* JADX INFO: renamed from: to */
    private int f28134to;

    /* JADX INFO: renamed from: x1 */
    private C14047bz f28135x1 = new C14047bz();

    /* JADX INFO: renamed from: k4 */
    public static final int f28128k4 = ey6.m31433k4("preview");

    /* JADX INFO: renamed from: c5 */
    private static final C7017h4 f28127c5 = new C7017h4("id", "returnToParent", "imageType", "transitionDur", "showBg", "blipFill", "spPr");

    public ov2() {
        m38469c5();
        this.f28133m9 = new C9220xo();
        this.f28130dy = new C8087kh();
    }

    /* JADX INFO: renamed from: c5 */
    private void m38469c5() {
        C14047bz.f47172k4.CloneTo(this.f28135x1);
        this.f28132kk = true;
        this.f28134to = f28128k4;
        this.f28131h4 = true;
    }

    /* JADX INFO: renamed from: du */
    public final boolean m38478du() {
        return this.f28131h4;
    }

    /* JADX INFO: renamed from: h4 */
    public final C9220xo m38479h4() {
        return this.f28133m9;
    }

    /* JADX INFO: renamed from: kk */
    public final int m38485kk() {
        return this.f28134to;
    }

    /* JADX INFO: renamed from: m9 */
    public final C8087kh m38486m9() {
        return this.f28130dy;
    }

    /* JADX INFO: renamed from: to */
    public final String m38487to() {
        return this.f28129du;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m38488x1(boolean z) {
        this.f28131h4 = z;
    }

    public ov2(final AbstractC13912i5 abstractC13912i5) {
        m38469c5();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.ov2.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = ov2.f28127c5.m27428k4(str);
                if (iM27428k4 == 0) {
                    ov2.this.f28135x1 = new C14047bz(str2);
                    return true;
                }
                if (iM27428k4 == 1) {
                    ov2.this.f28132kk = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 == 2) {
                    ov2.this.f28134to = ey6.m31433k4(str2);
                    return true;
                }
                if (iM27428k4 == 3) {
                    ov2.this.f28129du = str2;
                    return true;
                }
                if (iM27428k4 != 4) {
                    return false;
                }
                ov2.this.f28131h4 = C13850af.m65068c5(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.ov2.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = ov2.f28127c5.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 5) {
                    ov2.this.f28133m9 = new C9220xo(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 != 6) {
                    return false;
                }
                ov2.this.f28130dy = new C8087kh(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m38489x1() {
        return this.f28132kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final C14047bz m38480k4() {
        return this.f28135x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m38481k4(int i) {
        this.f28134to = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m38482k4(C14047bz c14047bz) {
        c14047bz.CloneTo(this.f28135x1);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m38483k4(String str) {
        this.f28129du = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("id", C14113y2.m67408k4("{", OooOO0.OooO00o(this.f28135x1), "}"));
        boolean z = this.f28132kk;
        if (!z) {
            c3059ii.m12955x1("returnToParent", z ? "1" : "0");
        }
        int i = this.f28134to;
        if (i != f28128k4) {
            c3059ii.m12955x1("imageType", ey6.m31434k4(i));
        }
        String str3 = this.f28129du;
        if (str3 != null) {
            c3059ii.m12955x1("transitionDur", str3);
        }
        boolean z2 = this.f28131h4;
        if (!z2) {
            c3059ii.m12955x1("showBg", z2 ? "1" : "0");
        }
        this.f28133m9.mo6846k4("p166", c3059ii, "blipFill");
        this.f28130dy.mo6846k4("p166", c3059ii, "spPr");
        c3059ii.mo21898jd();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m38484k4(boolean z) {
        this.f28132kk = z;
    }
}

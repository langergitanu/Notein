package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.w5 */
/* JADX INFO: loaded from: classes4.dex */
public class C9087w5 extends AbstractC7361bz {

    /* JADX INFO: renamed from: dy */
    private static final C7017h4 f32177dy = new C7017h4("rowSpan", "gridSpan", "hMerge", "vMerge", "txBody", "tcPr", "extLst");

    /* JADX INFO: renamed from: du */
    private C8952ug f32178du;

    /* JADX INFO: renamed from: h4 */
    private C8017jl f32179h4;

    /* JADX INFO: renamed from: k4 */
    private int f32180k4;

    /* JADX INFO: renamed from: kk */
    private boolean f32181kk;

    /* JADX INFO: renamed from: m9 */
    private C8397nz f32182m9;

    /* JADX INFO: renamed from: to */
    private boolean f32183to;

    /* JADX INFO: renamed from: x1 */
    private int f32184x1;

    public C9087w5() {
        m43490c5();
    }

    /* JADX INFO: renamed from: c5 */
    private void m43490c5() {
        this.f32180k4 = 1;
        this.f32184x1 = 1;
        this.f32181kk = false;
        this.f32183to = false;
    }

    /* JADX INFO: renamed from: du */
    public final C8952ug m43499du() {
        return this.f32178du;
    }

    /* JADX INFO: renamed from: h4 */
    public final C8017jl m43500h4() {
        return this.f32179h4;
    }

    /* JADX INFO: renamed from: kk */
    public final int m43505kk() {
        return this.f32180k4;
    }

    /* JADX INFO: renamed from: m9 */
    public final AbstractC7414ck m43506m9() {
        return this.f32182m9;
    }

    /* JADX INFO: renamed from: to */
    public final int m43507to() {
        return this.f32184x1;
    }

    public C9087w5(final AbstractC13912i5 abstractC13912i5) {
        m43490c5();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.w5.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C9087w5.f32177dy.m27428k4(str);
                if (iM27428k4 == 0) {
                    C9087w5.this.f32180k4 = C13850af.m65151yj(str2);
                    return true;
                }
                if (iM27428k4 == 1) {
                    C9087w5.this.f32184x1 = C13850af.m65151yj(str2);
                    return true;
                }
                if (iM27428k4 == 2) {
                    C9087w5.this.f32181kk = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 != 3) {
                    return false;
                }
                C9087w5.this.f32183to = C13850af.m65068c5(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.w5.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C9087w5.f32177dy.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 4) {
                    C9087w5.this.f32178du = new C8952ug(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 == 5) {
                    C9087w5.this.f32179h4 = new C8017jl(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 != 6) {
                    return false;
                }
                C9087w5.this.f32182m9 = new C8397nz(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    public final C8017jl m43508x1() {
        if (this.f32179h4 != null) {
            throw new Exception("Only one <tcPr> element can be added.");
        }
        C8017jl c8017jl = new C8017jl();
        this.f32179h4 = c8017jl;
        return c8017jl;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m43509x1(int i) {
        this.f32184x1 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final C8952ug m43501k4() {
        if (this.f32178du != null) {
            throw new Exception("Only one <txBody> element can be added.");
        }
        C8952ug c8952ug = new C8952ug();
        this.f32178du = c8952ug;
        return c8952ug;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m43510x1(boolean z) {
        this.f32183to = z;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m43502k4(int i) {
        this.f32180k4 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m43503k4(AbstractC7414ck abstractC7414ck) {
        this.f32182m9 = (C8397nz) abstractC7414ck;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        int i = this.f32180k4;
        if (i != 1) {
            c3059ii.m12955x1("rowSpan", C13850af.m65103k4(i));
        }
        int i2 = this.f32184x1;
        if (i2 != 1) {
            c3059ii.m12955x1("gridSpan", C13850af.m65103k4(i2));
        }
        boolean z = this.f32181kk;
        if (z) {
            c3059ii.m12955x1("hMerge", z ? "1" : "0");
        }
        boolean z2 = this.f32183to;
        if (z2) {
            c3059ii.m12955x1("vMerge", z2 ? "1" : "0");
        }
        C8952ug c8952ug = this.f32178du;
        if (c8952ug != null) {
            c8952ug.mo6846k4("a", c3059ii, "txBody");
        }
        C8017jl c8017jl = this.f32179h4;
        if (c8017jl != null) {
            c8017jl.mo6846k4("a", c3059ii, "tcPr");
        }
        C8397nz c8397nz = this.f32182m9;
        if (c8397nz != null) {
            c8397nz.mo6846k4("a", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m43504k4(boolean z) {
        this.f32181kk = z;
    }
}

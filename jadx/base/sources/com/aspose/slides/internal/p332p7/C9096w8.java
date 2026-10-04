package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.w8 */
/* JADX INFO: loaded from: classes4.dex */
public class C9096w8 extends AbstractC7361bz {

    /* JADX INFO: renamed from: c5 */
    private static final C7017h4 f32216c5 = new C7017h4("noGrp", "noUngrp", "noSelect", "noRot", "noChangeAspect", "noMove", "noResize", "extLst");

    /* JADX INFO: renamed from: du */
    private boolean f32217du;

    /* JADX INFO: renamed from: dy */
    private C8397nz f32218dy;

    /* JADX INFO: renamed from: h4 */
    private boolean f32219h4;

    /* JADX INFO: renamed from: k4 */
    private boolean f32220k4;

    /* JADX INFO: renamed from: kk */
    private boolean f32221kk;

    /* JADX INFO: renamed from: m9 */
    private boolean f32222m9;

    /* JADX INFO: renamed from: to */
    private boolean f32223to;

    /* JADX INFO: renamed from: x1 */
    private boolean f32224x1;

    public C9096w8() {
        m43551jd();
    }

    /* JADX INFO: renamed from: jd */
    private void m43551jd() {
        this.f32220k4 = false;
        this.f32224x1 = false;
        this.f32221kk = false;
        this.f32223to = false;
        this.f32217du = false;
        this.f32219h4 = false;
        this.f32222m9 = false;
    }

    /* JADX INFO: renamed from: du */
    public final void m43558du(boolean z) {
        this.f32217du = z;
    }

    /* JADX INFO: renamed from: dy */
    public final AbstractC7414ck m43560dy() {
        return this.f32218dy;
    }

    /* JADX INFO: renamed from: h4 */
    public final void m43561h4(boolean z) {
        this.f32219h4 = z;
    }

    /* JADX INFO: renamed from: kk */
    public final void m43566kk(boolean z) {
        this.f32221kk = z;
    }

    /* JADX INFO: renamed from: m9 */
    public final void m43568m9(boolean z) {
        this.f32222m9 = z;
    }

    /* JADX INFO: renamed from: to */
    public final void m43570to(boolean z) {
        this.f32223to = z;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m43572x1(boolean z) {
        this.f32224x1 = z;
    }

    public C9096w8(final AbstractC13912i5 abstractC13912i5) {
        m43551jd();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.w8.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (C9096w8.f32216c5.m27428k4(str)) {
                    case 0:
                        C9096w8.this.f32220k4 = C13850af.m65068c5(str2);
                        break;
                    case 1:
                        C9096w8.this.f32224x1 = C13850af.m65068c5(str2);
                        break;
                    case 2:
                        C9096w8.this.f32221kk = C13850af.m65068c5(str2);
                        break;
                    case 3:
                        C9096w8.this.f32223to = C13850af.m65068c5(str2);
                        break;
                    case 4:
                        C9096w8.this.f32217du = C13850af.m65068c5(str2);
                        break;
                    case 5:
                        C9096w8.this.f32219h4 = C13850af.m65068c5(str2);
                        break;
                    case 6:
                        C9096w8.this.f32222m9 = C13850af.m65068c5(str2);
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.w8.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (C9096w8.f32216c5.m27428k4(abstractC13912i5.mo65023fa()) != 7) {
                    return false;
                }
                C9096w8.this.f32218dy = new C8397nz(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: du */
    public final boolean m43559du() {
        return this.f32217du;
    }

    /* JADX INFO: renamed from: h4 */
    public final boolean m43562h4() {
        return this.f32219h4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m43563k4(AbstractC7414ck abstractC7414ck) {
        this.f32218dy = (C8397nz) abstractC7414ck;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m43567kk() {
        return this.f32221kk;
    }

    /* JADX INFO: renamed from: m9 */
    public final boolean m43569m9() {
        return this.f32222m9;
    }

    /* JADX INFO: renamed from: to */
    public final boolean m43571to() {
        return this.f32223to;
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m43573x1() {
        return this.f32224x1;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        boolean z = this.f32220k4;
        if (z) {
            c3059ii.m12955x1("noGrp", z ? "1" : "0");
        }
        boolean z2 = this.f32224x1;
        if (z2) {
            c3059ii.m12955x1("noUngrp", z2 ? "1" : "0");
        }
        boolean z3 = this.f32221kk;
        if (z3) {
            c3059ii.m12955x1("noSelect", z3 ? "1" : "0");
        }
        boolean z4 = this.f32223to;
        if (z4) {
            c3059ii.m12955x1("noRot", z4 ? "1" : "0");
        }
        boolean z5 = this.f32217du;
        if (z5) {
            c3059ii.m12955x1("noChangeAspect", z5 ? "1" : "0");
        }
        boolean z6 = this.f32219h4;
        if (z6) {
            c3059ii.m12955x1("noMove", z6 ? "1" : "0");
        }
        boolean z7 = this.f32222m9;
        if (z7) {
            c3059ii.m12955x1("noResize", z7 ? "1" : "0");
        }
        C8397nz c8397nz = this.f32218dy;
        if (c8397nz != null) {
            c8397nz.mo6846k4("a", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m43564k4(boolean z) {
        this.f32220k4 = z;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m43565k4() {
        return this.f32220k4;
    }
}

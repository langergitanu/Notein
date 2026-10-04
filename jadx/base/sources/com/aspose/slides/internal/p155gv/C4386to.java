package com.aspose.slides.internal.p155gv;

import com.aspose.slides.C22200OooO0o0;
import com.aspose.slides.Collections.Generic.Stack;
import com.aspose.slides.internal.p039be.AbstractC1689x1;
import com.aspose.slides.internal.p151gj.C4317dy;
import com.aspose.slides.internal.p223ka.C5656k4;
import com.aspose.slides.internal.p346pw.C9574to;
import com.aspose.slides.internal.p416tb.C10894bv;
import com.aspose.slides.internal.p416tb.C10898dy;
import com.aspose.slides.internal.p416tb.C10921yd;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14116yg;
import com.google.mlkit.p567nl.translate.TranslateLanguage;

/* JADX INFO: renamed from: com.aspose.slides.internal.gv.to */
/* JADX INFO: loaded from: classes.dex */
public class C4386to {

    /* JADX INFO: renamed from: k4 */
    private boolean f11940k4;

    /* JADX INFO: renamed from: kk */
    private C4384kk f11941kk;

    /* JADX INFO: renamed from: to */
    private final Stack<C4384kk> f11942to = new Stack<>();

    /* JADX INFO: renamed from: x1 */
    private final C10898dy f11943x1;

    public C4386to(C10898dy c10898dy) {
        this.f11943x1 = c10898dy;
    }

    /* JADX INFO: renamed from: k4 */
    public final C12007ix m17759k4(C12007ix c12007ix) {
        C12025x6[] c12025x6Arr = (C12025x6[]) C22200OooO0o0.OooO00o(C12025x6.class, 2);
        c12025x6Arr[0] = new C12025x6(c12007ix.m56571to(), c12007ix.m56554dy());
        c12025x6Arr[1] = new C12025x6(c12007ix.m56556h4(), c12007ix.m56558k4());
        this.f11941kk.m17747x1().m17342k4(c12025x6Arr);
        return new C12007ix(C14116yg.m67504x1(c12025x6Arr[0].m56897x1(), c12025x6Arr[1].m56897x1()), C14116yg.m67504x1(c12025x6Arr[0].m56895kk(), c12025x6Arr[1].m56895kk()), C14116yg.m67480k4(c12025x6Arr[0].m56897x1() - c12025x6Arr[1].m56897x1()), C14116yg.m67480k4(c12025x6Arr[0].m56895kk() - c12025x6Arr[1].m56895kk()));
    }

    /* JADX INFO: renamed from: kk */
    public final void m17769kk(float f, C10894bv c10894bv) {
        if (f == this.f11941kk.m17753yj()) {
            return;
        }
        this.f11941kk.m17728h4(f);
        c10894bv.m52430kk("{0} w", C10921yd.m52639x1(f));
    }

    /* JADX INFO: renamed from: to */
    public final void m17772to(float f, C10894bv c10894bv) {
        if (f == this.f11941kk.m17752x6()) {
            return;
        }
        this.f11941kk.m17741m9(f);
        c10894bv.m52430kk("{0} M", C10921yd.m52639x1(f));
    }

    /* JADX INFO: renamed from: x1 */
    public final C4384kk m17773x1() {
        return this.f11941kk;
    }

    /* JADX INFO: renamed from: kk */
    public final void m17770kk(int i, C10894bv c10894bv) {
        if (i == this.f11941kk.m17743rv()) {
            return;
        }
        this.f11941kk.m17738kk(i);
        c10894bv.m52430kk("{0} j", C9574to.m46742k4(i));
    }

    /* JADX INFO: renamed from: x1 */
    public final void m17774x1(float f, C10894bv c10894bv) {
        if (f == this.f11941kk.m17746up()) {
            return;
        }
        this.f11941kk.m17724du(f);
        c10894bv.m52430kk("{0} Tc", C10921yd.m52639x1(f));
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m17771kk() {
        return this.f11941kk.m17727h4() < 1.0f || this.f11941kk.m17740m9() < 1.0f;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m17775x1(int i, C10894bv c10894bv) {
        if (i == this.f11941kk.m17739ks()) {
            return;
        }
        this.f11941kk.m17749x1(i);
        c10894bv.m52430kk("{0} J", C9574to.m46742k4(i));
    }

    /* JADX INFO: renamed from: x1 */
    private void m17758x1(C4317dy c4317dy, C10894bv c10894bv) {
        c10894bv.m52423k4(c4317dy, "cm");
        this.f11941kk.m17747x1().m17341k4(c4317dy, 0);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m17776x1(C10894bv c10894bv) {
        c10894bv.m52429kk("Q");
        this.f11941kk = this.f11942to.pop();
    }

    /* JADX INFO: renamed from: k4 */
    public final C12025x6 m17760k4(C12025x6 c12025x6) {
        C12025x6[] c12025x6Arr = (C12025x6[]) C22200OooO0o0.OooO00o(C12025x6.class, 1);
        c12025x6.CloneTo(c12025x6Arr[0]);
        this.f11941kk.m17747x1().m17342k4(c12025x6Arr);
        return c12025x6Arr[0];
    }

    /* JADX INFO: renamed from: k4 */
    public final void m17761k4() {
        this.f11941kk = new C4384kk();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m17762k4(float f, C10894bv c10894bv) {
        if (f == this.f11941kk.m17721c5()) {
            return;
        }
        this.f11941kk.m17737kk(f);
        c10894bv.m52430kk("{0} TL", C10921yd.m52639x1(f));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m17763k4(int i, C10894bv c10894bv) {
        if (i == this.f11941kk.m17726fa()) {
            return;
        }
        this.f11941kk.m17732k4(i);
        c10894bv.m52430kk("{0} Tr", C9574to.m46742k4(i));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m17764k4(AbstractC1689x1 abstractC1689x1, float f, C10894bv c10894bv) {
        if (abstractC1689x1 == this.f11941kk.m17729jd() && f == this.f11941kk.m17722ck()) {
            return;
        }
        this.f11941kk.m17733k4(abstractC1689x1);
        this.f11941kk.m17745to(f);
        c10894bv.m52431kk("/{0} {1} Tf", abstractC1689x1.m52566ck(), C10921yd.m52639x1(f));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m17765k4(C4317dy c4317dy, C10894bv c10894bv) {
        int iM52636k4 = c4317dy != null ? C10921yd.m52636k4(c4317dy.m17330dy(), c4317dy.m17328c5()) : 0;
        if (iM52636k4 <= 1) {
            m17758x1(c4317dy, c10894bv);
            return;
        }
        C4317dy c4317dy2 = new C4317dy();
        float f = iM52636k4;
        c4317dy2.m17348x1(c4317dy.m17330dy() / f, c4317dy.m17328c5() / f);
        for (int i = 0; i < iM52636k4; i++) {
            m17758x1(c4317dy2, c10894bv);
        }
        m17758x1(new C4317dy(c4317dy.m17347to(), c4317dy.m17329du(), c4317dy.m17331h4(), c4317dy.m17346m9(), 0.0f, 0.0f), c10894bv);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m17766k4(C4383k4 c4383k4, boolean z, C10894bv c10894bv) {
        C4384kk c4384kk = this.f11941kk;
        if (z) {
            if (c4383k4 == c4384kk.m17736kk()) {
                return;
            } else {
                this.f11941kk.m17734k4(c4383k4);
            }
        } else if (c4383k4 == c4384kk.m17744to()) {
            return;
        } else {
            this.f11941kk.m17750x1(c4383k4);
        }
        c10894bv.m52431kk("/{0} {1}", c4383k4.m17719du(), z ? "CS" : TranslateLanguage.CZECH);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m17757k4(C4387x1 c4387x1, C10894bv c10894bv) {
        c10894bv.m52430kk("/{0} gs", c4387x1.m52566ck());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m17767k4(C5656k4 c5656k4, boolean z, C10894bv c10894bv) {
        C4384kk c4384kk = this.f11941kk;
        if (z) {
            if (c4384kk.m17736kk() == C4383k4.m17718x1() && C5656k4.m23096kk(c5656k4, this.f11941kk.m17723du())) {
                return;
            }
            this.f11941kk.m17734k4(C4383k4.m17718x1());
            this.f11941kk.m17735k4(c5656k4);
        } else {
            if (c4384kk.m17744to() == C4383k4.m17718x1() && C5656k4.m23096kk(c5656k4, this.f11941kk.m17725dy())) {
                return;
            }
            this.f11941kk.m17750x1(C4383k4.m17718x1());
            this.f11941kk.m17751x1(c5656k4);
        }
        if (c5656k4.m23105x1() < 255) {
            float fM23105x1 = c5656k4.m23105x1() / 255.0f;
            C4384kk c4384kk2 = this.f11941kk;
            if (z) {
                c4384kk2.m17731k4(fM23105x1);
            } else {
                c4384kk2.m17748x1(fM23105x1);
            }
            m17757k4(this.f11943x1.m52459kk().m52561k4(this.f11941kk.m17727h4(), this.f11941kk.m17740m9()), c10894bv);
            this.f11940k4 = true;
        } else if (m17771kk()) {
            C4384kk c4384kk3 = this.f11941kk;
            if (z) {
                c4384kk3.m17731k4(1.0f);
            } else {
                c4384kk3.m17748x1(1.0f);
            }
            m17757k4(this.f11943x1.m52459kk().m52561k4(this.f11941kk.m17727h4(), this.f11941kk.m17740m9()), c10894bv);
        }
        c10894bv.m52431kk("{0} {1}", C10921yd.m52637k4(c5656k4), z ? "RG" : "rg");
    }

    /* JADX INFO: renamed from: k4 */
    public final void m17768k4(C10894bv c10894bv) {
        c10894bv.m52429kk("q");
        this.f11942to.push(this.f11941kk.m17730k4());
    }
}

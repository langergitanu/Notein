package com.aspose.slides.internal.p416tb;

/* JADX INFO: renamed from: com.aspose.slides.internal.tb.lr */
/* JADX INFO: loaded from: classes4.dex */
public class C10906lr extends AbstractC10914up {

    /* JADX INFO: renamed from: c5 */
    private boolean f37920c5;

    /* JADX INFO: renamed from: ck */
    private boolean f37921ck;

    /* JADX INFO: renamed from: du */
    private int f37922du;

    /* JADX INFO: renamed from: dy */
    private boolean f37923dy;

    /* JADX INFO: renamed from: fa */
    private boolean f37924fa;

    /* JADX INFO: renamed from: h4 */
    private int f37925h4;

    /* JADX INFO: renamed from: jd */
    private boolean f37926jd;

    /* JADX INFO: renamed from: k4 */
    private int f37927k4;

    /* JADX INFO: renamed from: kk */
    private int f37928kk;

    /* JADX INFO: renamed from: m9 */
    private boolean f37929m9;

    /* JADX INFO: renamed from: to */
    private int f37930to;

    /* JADX INFO: renamed from: up */
    private boolean f37931up;

    public C10906lr(C10898dy c10898dy) {
        super(c10898dy);
        this.f37927k4 = 1;
        this.f37928kk = 1;
        this.f37930to = 1;
        this.f37922du = 1;
        this.f37925h4 = 0;
        this.f37929m9 = false;
        this.f37923dy = false;
        this.f37920c5 = false;
        this.f37926jd = false;
        this.f37921ck = false;
        this.f37924fa = false;
        this.f37931up = false;
    }

    @Override // com.aspose.slides.internal.p416tb.AbstractC10914up
    /* JADX INFO: renamed from: k4 */
    public void mo9082k4(C10922yj c10922yj) {
        int i;
        c10922yj.m52676k4(this);
        c10922yj.m52643dy();
        int i2 = this.f37927k4;
        if (i2 != 1) {
            c10922yj.m52666kk("/PrintClip", C10896ck.m52438k4(i2));
        }
        int i3 = this.f37928kk;
        if (i3 != 1) {
            c10922yj.m52666kk("/PrintArea", C10896ck.m52438k4(i3));
        }
        int i4 = this.f37930to;
        if (i4 != 1) {
            c10922yj.m52666kk("/ViewClip", C10896ck.m52438k4(i4));
        }
        int i5 = this.f37922du;
        if (i5 != 1) {
            c10922yj.m52666kk("/ViewArea", C10896ck.m52438k4(i5));
        }
        if (this.f37929m9 && (i = this.f37925h4) != 0) {
            c10922yj.m52666kk("/NonFullScreenPageMode", C10896ck.m52444x1(i));
        }
        boolean z = this.f37923dy;
        if (z) {
            c10922yj.m52660k4("/DisplayDocTitle", z);
        }
        boolean z2 = this.f37920c5;
        if (z2) {
            c10922yj.m52660k4("/CenterWindow", z2);
        }
        boolean z3 = this.f37926jd;
        if (z3) {
            c10922yj.m52660k4("/FitWindow", z3);
        }
        boolean z4 = this.f37921ck;
        if (z4) {
            c10922yj.m52660k4("/HideWindowUI", z4);
        }
        boolean z5 = this.f37924fa;
        if (z5) {
            c10922yj.m52660k4("/HideMenubar", z5);
        }
        boolean z6 = this.f37931up;
        if (z6) {
            c10922yj.m52660k4("/HideToolbar", z6);
        }
        c10922yj.m52640c5();
        c10922yj.m52678x1();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m52503x1(boolean z) {
        this.f37929m9 = z;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m52502k4(boolean z) {
        this.f37923dy = z;
    }
}

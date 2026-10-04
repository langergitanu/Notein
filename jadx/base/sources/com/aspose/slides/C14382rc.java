package com.aspose.slides;

import com.aspose.slides.p559ms.System.C14093tq;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.rc */
/* JADX INFO: loaded from: classes3.dex */
class C14382rc {

    /* JADX INFO: renamed from: du */
    private IFontData f48552du;

    /* JADX INFO: renamed from: dy */
    private int f48553dy;

    /* JADX INFO: renamed from: h4 */
    private boolean f48554h4;

    /* JADX INFO: renamed from: k4 */
    private final C13827mb f48555k4;

    /* JADX INFO: renamed from: kk */
    private final IFontData f48556kk;

    /* JADX INFO: renamed from: m9 */
    private IFontData f48557m9;

    /* JADX INFO: renamed from: to */
    private final C14093tq<Integer> f48558to;

    /* JADX INFO: renamed from: x1 */
    private final int f48559x1;

    public C14382rc(C13827mb c13827mb, int i, IFontData iFontData, C14093tq<Integer> c14093tq, boolean z) {
        C14093tq<Integer> c14093tq2 = new C14093tq<>();
        this.f48558to = c14093tq2;
        this.f48553dy = 1;
        this.f48555k4 = c13827mb;
        this.f48559x1 = i;
        this.f48556kk = iFontData;
        c14093tq.CloneTo(c14093tq2);
        this.f48554h4 = z;
    }

    /* JADX INFO: renamed from: du */
    public final boolean m70063du() {
        return this.f48557m9 != null;
    }

    /* JADX INFO: renamed from: dy */
    public final boolean m70064dy() {
        return this.f48554h4;
    }

    /* JADX INFO: renamed from: h4 */
    public final void m70065h4() {
        this.f48552du = null;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m70066k4() {
        return this.f48559x1;
    }

    /* JADX INFO: renamed from: kk */
    public final C14093tq<Integer> m70070kk() {
        return this.f48558to;
    }

    /* JADX INFO: renamed from: m9 */
    public final boolean m70071m9() {
        return C14113y2.m67359c5(this.f48556kk.getFontName(), "+m");
    }

    /* JADX INFO: renamed from: to */
    public final boolean m70072to() {
        return this.f48552du != null;
    }

    /* JADX INFO: renamed from: x1 */
    public final IFontData m70073x1() {
        if (m70063du()) {
            int i = this.f48553dy;
            if (i == 1) {
                return this.f48557m9;
            }
            if (i == 0 && this.f48555k4.m64801k4() != null && !this.f48555k4.m64801k4().m1550k4((FontData) this.f48556kk).m68818to()) {
                return this.f48557m9;
            }
        }
        return m70072to() ? this.f48552du : this.f48556kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m70067k4(int i) {
        this.f48553dy = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m70074x1(IFontData iFontData) {
        this.f48557m9 = iFontData;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m70068k4(IFontData iFontData) {
        this.f48552du = iFontData;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m70069k4(boolean z) {
        this.f48554h4 = z;
    }
}

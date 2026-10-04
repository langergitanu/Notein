package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.wq */
/* JADX INFO: loaded from: classes3.dex */
final class C14747wq {

    /* JADX INFO: renamed from: k4 */
    private IAudio f49842k4;

    /* JADX INFO: renamed from: x1 */
    private String f49846x1 = null;

    /* JADX INFO: renamed from: kk */
    private String f49843kk = null;

    /* JADX INFO: renamed from: to */
    private boolean f49845to = true;

    /* JADX INFO: renamed from: du */
    private boolean f49839du = false;

    /* JADX INFO: renamed from: h4 */
    private boolean f49841h4 = false;

    /* JADX INFO: renamed from: m9 */
    private int f49844m9 = 0;

    /* JADX INFO: renamed from: dy */
    private String f49840dy = null;

    /* JADX INFO: renamed from: c5 */
    private boolean f49838c5 = false;

    /* JADX INFO: renamed from: c5 */
    public final String m72862c5() {
        return this.f49840dy;
    }

    /* JADX INFO: renamed from: du */
    public final boolean m72863du() {
        return this.f49841h4;
    }

    /* JADX INFO: renamed from: dy */
    public final boolean m72864dy() {
        return this.f49838c5;
    }

    public boolean equals(Object obj) {
        Hyperlink hyperlink = (Hyperlink) C7019kk.m27452k4(obj, Hyperlink.class);
        return hyperlink != null && m72861k4(hyperlink);
    }

    /* JADX INFO: renamed from: h4 */
    public final IAudio m72865h4() {
        return this.f49842k4;
    }

    public int hashCode() {
        return super.hashCode();
    }

    /* JADX INFO: renamed from: jd */
    public final long m72866jd() {
        return 1L;
    }

    /* JADX INFO: renamed from: k4 */
    public final String m72867k4() {
        return this.f49846x1;
    }

    /* JADX INFO: renamed from: kk */
    public final void m72872kk(String str) {
        this.f49840dy = str;
    }

    /* JADX INFO: renamed from: m9 */
    public final int m72875m9() {
        return this.f49844m9;
    }

    /* JADX INFO: renamed from: to */
    public final void m72876to(boolean z) {
        this.f49838c5 = z;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m72878x1() {
        return this.f49843kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m72868k4(int i) {
        this.f49844m9 = i;
    }

    /* JADX INFO: renamed from: kk */
    public final void m72873kk(boolean z) {
        this.f49841h4 = z;
    }

    /* JADX INFO: renamed from: to */
    public final boolean m72877to() {
        return this.f49839du;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m72879x1(String str) {
        this.f49843kk = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m72869k4(IAudio iAudio) {
        this.f49842k4 = iAudio;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m72874kk() {
        return this.f49845to;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m72880x1(boolean z) {
        this.f49839du = z;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m72870k4(String str) {
        this.f49846x1 = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m72871k4(boolean z) {
        this.f49845to = z;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m72861k4(Hyperlink hyperlink) {
        return C14113y2.m67363du(m72867k4(), hyperlink.getTargetFrame()) && C14113y2.m67363du(m72878x1(), hyperlink.getTooltip()) && m72874kk() == hyperlink.getHistory() && m72877to() == hyperlink.getHighlightClick() && m72863du() == hyperlink.getStopSoundOnClick() && m72875m9() == hyperlink.getColorSource() && m72865h4() == hyperlink.getSound();
    }
}

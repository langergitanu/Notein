package com.aspose.slides.internal.p087dm;

import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p115eq.C3794up;
import com.aspose.slides.internal.p252lk.C6105kk;
import com.aspose.slides.internal.p252lk.C6106m9;
import com.aspose.slides.internal.p252lk.C6107to;
import com.aspose.slides.internal.p404sp.C10307du;
import com.aspose.slides.internal.p404sp.C10308dy;
import com.aspose.slides.internal.p404sp.C10309h4;
import com.aspose.slides.internal.p404sp.C10313m9;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.dm.du */
/* JADX INFO: loaded from: classes3.dex */
public class C3182du extends C3181c5 {
    public C3182du() {
    }

    /* JADX INFO: renamed from: c5 */
    public final float m13645c5() {
        float fM50271k4 = C10308dy.m50271k4(this.f9461x1.m13690kk("stroke-opacity", "1"), 1.0f);
        return C14116yg.m67504x1(1.0f, C14116yg.m67481k4(0.0f, fM50271k4)) * m13667to();
    }

    /* JADX INFO: renamed from: ck */
    public final C10309h4 m13646ck() {
        return C10309h4.m50273k4(this.f9461x1.m13690kk("stroke-dasharray", "none"));
    }

    /* JADX INFO: renamed from: du */
    public final String m13647du() {
        return this.f9461x1.get_Item("style");
    }

    /* JADX INFO: renamed from: dy */
    public final C10307du m13649dy() {
        return C10307du.m50262k4(this.f9461x1.m13690kk("stroke-width", C3794up.m15165k4(m13664m9()) ? "1" : "0"), C10307du.m50263kk(C3794up.m15165k4(m13664m9()) ? 1.0f : 0.0f));
    }

    /* JADX INFO: renamed from: fa */
    public final C10307du m13650fa() {
        return C10307du.m50262k4(this.f9461x1.m13690kk("stroke-dashoffset", "0"), C10307du.m50263kk(0.0f));
    }

    /* JADX INFO: renamed from: h4 */
    public final String m13651h4() {
        return this.f9461x1.get_Item("class");
    }

    /* JADX INFO: renamed from: jd */
    public final int m13653jd() {
        return C10313m9.m50286k4(this.f9461x1.m13690kk("stroke-linecap", "butt"));
    }

    /* JADX INFO: renamed from: k4 */
    public final String m13654k4() {
        return this.f9461x1.m13690kk("xml:base", "");
    }

    /* JADX INFO: renamed from: kk */
    public final void m13660kk(int i) {
        this.f9461x1.set_Item("text-rendering", C6106m9.m24741k4(i));
    }

    /* JADX INFO: renamed from: ks */
    public final float m13663ks() {
        float fM50271k4 = C10308dy.m50271k4(this.f9461x1.m13690kk("fill-opacity", "1"), 1.0f);
        return C14116yg.m67504x1(1.0f, C14116yg.m67481k4(0.0f, fM50271k4)) * m13667to();
    }

    /* JADX INFO: renamed from: m9 */
    public final String m13664m9() {
        return C14113y2.m67440x1(this.f9461x1.m13690kk("stroke", "none"));
    }

    /* JADX INFO: renamed from: ne */
    public final String m13665ne() {
        return C14113y2.m67440x1(this.f9461x1.m13682k4(new String[]{"marker-end"}, "none"));
    }

    /* JADX INFO: renamed from: rv */
    public final String m13666rv() {
        return C14113y2.m67440x1(this.f9461x1.m13682k4(new String[]{"marker-start"}, "none"));
    }

    /* JADX INFO: renamed from: to */
    public final float m13667to() {
        return C14116yg.m67504x1(1.0f, C14116yg.m67481k4(0.0f, C10308dy.m50271k4(this.f9461x1.m13690kk("opacity", "1"), 1.0f)));
    }

    /* JADX INFO: renamed from: up */
    public final String m13670up() {
        return C14113y2.m67440x1(this.f9461x1.m13690kk("fill", "black"));
    }

    /* JADX INFO: renamed from: x1 */
    public String mo13671x1() {
        return this.f9461x1.m13690kk("overflow", "hidden");
    }

    /* JADX INFO: renamed from: x6 */
    public final String m13675x6() {
        return C14113y2.m67440x1(this.f9461x1.m13682k4(new String[]{"marker-mid"}, "none"));
    }

    /* JADX INFO: renamed from: yj */
    public final boolean m13676yj() {
        return !C14113y2.m67432to("none", m13670up(), (short) 3);
    }

    public C3182du(String str) {
        this.f9456h4 = str;
    }

    /* JADX INFO: renamed from: du */
    public final void m13648du(String str) {
        this.f9461x1.set_Item("marker-start", str);
    }

    /* JADX INFO: renamed from: h4 */
    public final void m13652h4(String str) {
        this.f9461x1.set_Item("marker-end", str);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m13655k4(float f) {
        this.f9461x1.set_Item("stroke-opacity", C10308dy.m50272k4(f));
    }

    /* JADX INFO: renamed from: kk */
    public final void m13661kk(String str) {
        this.f9461x1.set_Item("stroke", str);
    }

    /* JADX INFO: renamed from: to */
    public final void m13668to(int i) {
        this.f9461x1.set_Item("shape-rendering", C6107to.m24742k4(i));
    }

    /* JADX INFO: renamed from: x1 */
    public final void m13672x1(float f) {
        this.f9461x1.set_Item("fill-opacity", C10308dy.m50272k4(f));
    }

    public C3182du(String str, C3187kk c3187kk, C3181c5 c3181c5) {
        super(str, c3187kk, c3181c5);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m13656k4(int i) {
        this.f9461x1.set_Item("stroke-linecap", C10313m9.m50287k4(i));
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m13662kk() {
        String strMo13671x1 = mo13671x1();
        return C14113y2.m67432to("hidden", strMo13671x1, (short) 3) || C14113y2.m67432to("scroll", strMo13671x1, (short) 3);
    }

    /* JADX INFO: renamed from: to */
    public final void m13669to(String str) {
        this.f9461x1.set_Item("fill", str);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m13673x1(int i) {
        this.f9461x1.set_Item("pointer-events", C6105kk.m24740k4(i));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m13657k4(C10307du c10307du) {
        this.f9461x1.set_Item("stroke-width", c10307du.toString());
    }

    /* JADX INFO: renamed from: x1 */
    public final void m13674x1(String str) {
        this.f9461x1.set_Item("class", str);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m13658k4(C10309h4 c10309h4) {
        this.f9461x1.set_Item("stroke-dasharray", c10309h4.toString());
    }

    /* JADX INFO: renamed from: k4 */
    public void mo13659k4(String str) {
        throw new NotImplementedException();
    }
}

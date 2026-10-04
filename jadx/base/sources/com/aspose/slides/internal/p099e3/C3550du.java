package com.aspose.slides.internal.p099e3;

import com.aspose.slides.internal.p087dm.C3182du;
import com.aspose.slides.internal.p087dm.InterfaceC3186k4;
import com.aspose.slides.internal.p115eq.C3786fa;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p404sp.C10307du;
import com.aspose.slides.internal.p404sp.C10310jd;
import com.aspose.slides.internal.p404sp.C10312kk;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.e3.du */
/* JADX INFO: loaded from: classes3.dex */
public class C3550du extends C3182du implements InterfaceC3186k4 {
    public C3550du() {
        this.f9456h4 = "svg";
        this.f9461x1.set_Item("version", "1.1");
        this.f9461x1.set_Item("xmlns", "http://www.w3.org/2000/svg");
        this.f9461x1.set_Item("xmlns:xlink", "http://www.w3.org/1999/xlink");
    }

    /* JADX INFO: renamed from: ak */
    public final C10307du m14427ak() {
        return C10307du.m50262k4(this.f9461x1.m13690kk("width", "100%"), C10307du.m50264x1(100.0f));
    }

    /* JADX INFO: renamed from: b3 */
    public final C10307du m14428b3() {
        return C10307du.m50262k4(this.f9461x1.m13690kk("X", "0"), C10307du.m50263kk(0.0f));
    }

    /* JADX INFO: renamed from: c6 */
    public final boolean m14429c6() {
        String strMo13671x1 = mo13671x1();
        return C14113y2.m67432to("hidden", strMo13671x1, (short) 3) || C14113y2.m67432to("scroll", strMo13671x1, (short) 3);
    }

    /* JADX INFO: renamed from: dq */
    public final C10307du m14430dq() {
        return C10307du.m50262k4(this.f9461x1.m13690kk("height", "100%"), C10307du.m50264x1(100.0f));
    }

    /* JADX INFO: renamed from: du */
    public final void m14431du(C10307du c10307du) {
        this.f9461x1.set_Item("height", c10307du.toString());
    }

    /* JADX INFO: renamed from: e0 */
    public final C10312kk m14432e0() {
        return C10312kk.m50279k4(this.f9461x1.get_Item("preserveAspectRatio"));
    }

    @Override // com.aspose.slides.internal.p087dm.InterfaceC3186k4
    /* JADX INFO: renamed from: k4 */
    public final C12007ix mo13679k4(C3786fa c3786fa, C12015qq c12015qq) {
        C12007ix c12007ix;
        if (c12015qq.m56696k4() && (m14427ak().m50268kk() || m14430dq().m50268kk())) {
            C10310jd c10310jdM14437ts = m14437ts();
            if (c10310jdM14437ts != null) {
                c12007ix = c10310jdM14437ts.m50276k4(c3786fa);
            } else if (m14427ak().m50265k4() != 100.0f || m14430dq().m50265k4() != 100.0f) {
                c12007ix = new C12007ix();
                for (int i = 0; i < m13628ar().m13697k4(); i++) {
                    InterfaceC3186k4 interfaceC3186k4 = (InterfaceC3186k4) C7019kk.m27452k4((Object) m13628ar().m13702x1(i), InterfaceC3186k4.class);
                    if (interfaceC3186k4 != null) {
                        C12007ix c12007ixClone = interfaceC3186k4.mo13679k4(c3786fa, c12015qq.Clone()).Clone();
                        if (!c12007ixClone.m56568kk()) {
                            C12007ix.m56549x1(c12007ix.Clone(), c12007ixClone.Clone()).CloneTo(c12007ix);
                        }
                    }
                }
            }
            c12007ix.m56570m9().CloneTo(c12015qq);
        }
        if (c12015qq.m56696k4()) {
            c12015qq = new C12015qq(c3786fa.m15131kk(500.0f), c3786fa.m15131kk(500.0f));
        }
        return new C12007ix(m14440xk() ? 0.0f : c3786fa.m15125k4(m14428b3(), "x", this, c12015qq.Clone()), m14440xk() ? 0.0f : c3786fa.m15125k4(m14438wy(), "y", this, c12015qq.Clone()), c3786fa.m15125k4(m14427ak(), "width", this, c12015qq.Clone()), c3786fa.m15125k4(m14430dq(), "height", this, c12015qq.Clone()));
    }

    /* JADX INFO: renamed from: kk */
    public final void m14435kk(C10307du c10307du) {
        this.f9461x1.set_Item("Y", c10307du.toString());
    }

    /* JADX INFO: renamed from: to */
    public final void m14436to(C10307du c10307du) {
        this.f9461x1.set_Item("width", c10307du.toString());
    }

    /* JADX INFO: renamed from: ts */
    public final C10310jd m14437ts() {
        return C10310jd.m50275k4(this.f9461x1.get_Item("viewBox"));
    }

    /* JADX INFO: renamed from: wy */
    public final C10307du m14438wy() {
        return C10307du.m50262k4(this.f9461x1.m13690kk("y", "0"), C10307du.m50263kk(0.0f));
    }

    @Override // com.aspose.slides.internal.p087dm.C3182du
    /* JADX INFO: renamed from: x1 */
    public String mo13671x1() {
        return this.f9461x1.m13690kk("overflow", m14440xk() ? "visible" : "hidden");
    }

    /* JADX INFO: renamed from: xk */
    public final boolean m14440xk() {
        return "root".equals(this.f9457k4.f9456h4);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m14433k4(C10310jd c10310jd) {
        this.f9461x1.set_Item("viewBox", c10310jd == null ? null : c10310jd.toString());
    }

    /* JADX INFO: renamed from: x1 */
    public final void m14439x1(C10307du c10307du) {
        this.f9461x1.set_Item("X", c10307du.toString());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m14434k4(C10312kk c10312kk) {
        this.f9461x1.set_Item("preserveAspectRatio", c10312kk.toString());
    }

    @Override // com.aspose.slides.internal.p087dm.C3182du
    /* JADX INFO: renamed from: k4 */
    public void mo13659k4(String str) {
        this.f9461x1.set_Item("overflow", str);
    }
}

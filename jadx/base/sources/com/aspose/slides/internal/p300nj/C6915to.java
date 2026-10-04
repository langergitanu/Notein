package com.aspose.slides.internal.p300nj;

import com.aspose.slides.internal.p087dm.C3182du;
import com.aspose.slides.internal.p115eq.C3783ck;
import com.aspose.slides.internal.p115eq.C3786fa;
import com.aspose.slides.internal.p115eq.C3791ks;
import com.aspose.slides.internal.p115eq.C3794up;
import com.aspose.slides.internal.p252lk.C6104k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p404sp.C10307du;
import com.aspose.slides.internal.p404sp.C10310jd;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.C12015qq;

/* JADX INFO: renamed from: com.aspose.slides.internal.nj.to */
/* JADX INFO: loaded from: classes4.dex */
public class C6915to extends C3182du {

    /* JADX INFO: renamed from: dy */
    private C6915to f18855dy = null;

    public C6915to() {
        this.f9456h4 = "pattern";
    }

    /* JADX INFO: renamed from: ak */
    public final C10307du m27090ak() {
        return (this.f9461x1.containsKey("x") || m27092bz() == null) ? C10307du.m50262k4(this.f9461x1.get_Item("x"), C10307du.m50263kk(0.0f)) : m27092bz().m27090ak();
    }

    /* JADX INFO: renamed from: b3 */
    public final int m27091b3() {
        return (this.f9461x1.containsKey("patternUnits") || m27092bz() == null) ? C6104k4.m24738k4(this.f9461x1.m13690kk("patternUnits", "objectBoundingBox")) : m27092bz().m27091b3();
    }

    /* JADX INFO: renamed from: bz */
    public final C6915to m27092bz() {
        return this.f18855dy;
    }

    /* JADX INFO: renamed from: c6 */
    public final C10307du m27093c6() {
        return (this.f9461x1.containsKey("height") || m27092bz() == null) ? C10307du.m50262k4(this.f9461x1.get_Item("height"), C10307du.m50263kk(0.0f)) : m27092bz().m27093c6();
    }

    /* JADX INFO: renamed from: dq */
    public final C10307du m27094dq() {
        return (this.f9461x1.containsKey("y") || m27092bz() == null) ? C10307du.m50262k4(this.f9461x1.get_Item("y"), C10307du.m50263kk(0.0f)) : m27092bz().m27094dq();
    }

    /* JADX INFO: renamed from: du */
    public final void m27095du(C10307du c10307du) {
        this.f9461x1.set_Item("height", c10307du.toString());
    }

    /* JADX INFO: renamed from: e0 */
    public final String m27096e0() {
        return (this.f9461x1.containsKey("patternTransform") || m27092bz() == null) ? this.f9461x1.get_Item("patternTransform") : m27092bz().m27096e0();
    }

    /* JADX INFO: renamed from: jd */
    public final void m27097jd(String str) {
        this.f9461x1.set_Item("patternTransform", str);
    }

    /* JADX INFO: renamed from: k4 */
    public final C11913yj m27098k4(C3786fa c3786fa, C12015qq c12015qq) {
        C11913yj c11913yj = new C11913yj();
        if (m27096e0() != null) {
            c11913yj.m55787x1(new C3791ks(c3786fa).m15149k4(m27096e0(), c12015qq.Clone()));
        }
        return c11913yj;
    }

    /* JADX INFO: renamed from: kk */
    public final void m27101kk(C10307du c10307du) {
        this.f9461x1.set_Item("y", c10307du.toString());
    }

    /* JADX INFO: renamed from: m9 */
    public final void m27102m9(int i) {
        this.f9461x1.set_Item("patternUnits", C6104k4.m24739k4(i));
    }

    /* JADX INFO: renamed from: to */
    public final void m27103to(C10307du c10307du) {
        this.f9461x1.set_Item("width", c10307du.toString());
    }

    /* JADX INFO: renamed from: ts */
    public final C10310jd m27104ts() {
        return (this.f9461x1.containsKey("viewBox") || m27092bz() == null) ? C10310jd.m50275k4(this.f9461x1.get_Item("viewBox")) : m27092bz().m27104ts();
    }

    /* JADX INFO: renamed from: wy */
    public final int m27105wy() {
        return (this.f9461x1.containsKey("patternContentUnits") || m27092bz() == null) ? C6104k4.m24738k4(this.f9461x1.m13690kk("patternContentUnits", "userSpaceOnUse")) : m27092bz().m27105wy();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m27106x1(C10307du c10307du) {
        this.f9461x1.set_Item("x", c10307du.toString());
    }

    /* JADX INFO: renamed from: xk */
    public final C10307du m27107xk() {
        return (this.f9461x1.containsKey("width") || m27092bz() == null) ? C10307du.m50262k4(this.f9461x1.get_Item("width"), C10307du.m50263kk(0.0f)) : m27092bz().m27107xk();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m27099k4(C3783ck c3783ck) {
        if (this.f9461x1.containsKey("xlink:href")) {
            m27100k4((C6915to) C7019kk.m27452k4((Object) c3783ck.m15116k4(C3794up.m15166kk(this.f9461x1.get_Item("xlink:href"))), C6915to.class));
            if (m27092bz() != null) {
                m27092bz().m27099k4(c3783ck);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m27100k4(C6915to c6915to) {
        this.f18855dy = c6915to;
    }
}

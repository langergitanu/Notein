package com.aspose.slides.internal.p300nj;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.OooO;
import com.aspose.slides.internal.p087dm.C3182du;
import com.aspose.slides.internal.p115eq.C3783ck;
import com.aspose.slides.internal.p115eq.C3786fa;
import com.aspose.slides.internal.p115eq.C3791ks;
import com.aspose.slides.internal.p115eq.C3794up;
import com.aspose.slides.internal.p252lk.C6102du;
import com.aspose.slides.internal.p252lk.C6104k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p472w8.C11902kk;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.nj.k4 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC6913k4 extends C3182du {

    /* JADX INFO: renamed from: dy */
    private AbstractC6913k4 f18854dy = null;

    /* JADX INFO: renamed from: c5 */
    private List<C6912h4> f18853c5 = null;

    /* JADX INFO: renamed from: ak */
    public final int m27062ak() {
        return (this.f9461x1.containsKey("spreadMethod") || m27064c6() == null) ? C6102du.m24735k4(C14113y2.m67440x1(this.f9461x1.m13690kk("spreadMethod", "pad"))) : m27064c6().m27062ak();
    }

    /* JADX INFO: renamed from: b3 */
    public final int m27063b3() {
        return (this.f9461x1.containsKey("gradientUnits") || m27064c6() == null) ? C6104k4.m24738k4(this.f9461x1.m13690kk("gradientUnits", "objectBoundingBox")) : m27064c6().m27063b3();
    }

    /* JADX INFO: renamed from: c6 */
    public final AbstractC6913k4 m27064c6() {
        return this.f18854dy;
    }

    /* JADX INFO: renamed from: dq */
    public final String m27065dq() {
        return (this.f9461x1.containsKey("color-interpolation") || m27064c6() == null) ? C14113y2.m67440x1(this.f9461x1.m13690kk("color-interpolation", "auto")) : m27064c6().m27065dq();
    }

    /* JADX INFO: renamed from: dy */
    public final void m27066dy(int i) {
        this.f9461x1.set_Item("spreadMethod", C6102du.m24736k4(i));
    }

    /* JADX INFO: renamed from: jd */
    public final void m27067jd(String str) {
        this.f9461x1.set_Item("gradientTransform", str);
    }

    /* JADX INFO: renamed from: k4 */
    public final C11902kk m27068k4(C3786fa c3786fa, C12007ix c12007ix, float f, boolean z) {
        boolean z2;
        boolean z3;
        int size = m27073ts().size();
        if (size == 0) {
            return null;
        }
        int i = 0;
        if (m27073ts().get_Item(0).m27056b3() > 0.0f) {
            size++;
            if (z) {
                z2 = false;
                z3 = true;
            } else {
                z3 = false;
                z2 = true;
            }
        } else {
            z2 = false;
            z3 = false;
        }
        if (m27073ts().get_Item(m27073ts().size() - 1).m27056b3() < 1.0f) {
            size++;
            if (z) {
                z2 = true;
            } else {
                z3 = true;
            }
        }
        C11902kk c11902kk = new C11902kk(size);
        C12003du c12003duClone = C12003du.m56460uz().Clone();
        int i2 = 0;
        while (i < size) {
            C6912h4 c6912h4 = m27073ts().get_Item(z ? (m27073ts().size() - 1) - i2 : i2);
            float fM56550c5 = c12007ix.m56550c5();
            float fM27055ak = c6912h4.m27055ak() * f;
            float fM56550c52 = c12007ix.m56550c5() * c6912h4.m27056b3();
            float f2 = z ? 1.0f - (fM56550c52 / fM56550c5) : fM56550c52 / fM56550c5;
            C12003du.m56400k4(OooO.OooO00o(fM27055ak * 255.0f, 14), c6912h4.m27061wy().m50292k4().Clone()).CloneTo(c12003duClone);
            i2++;
            if (z2 && i == 0) {
                c11902kk.m55669x1()[i] = 0.0f;
                c12003duClone.CloneTo(c11902kk.m55668k4()[i]);
                i++;
            }
            c11902kk.m55669x1()[i] = f2;
            c12003duClone.CloneTo(c11902kk.m55668k4()[i]);
            if (z3 && i == size - 2) {
                i++;
                c11902kk.m55669x1()[i] = 1.0f;
                c12003duClone.CloneTo(c11902kk.m55668k4()[i]);
            }
            i++;
        }
        return c11902kk;
    }

    /* JADX INFO: renamed from: m9 */
    public final void m27072m9(int i) {
        this.f9461x1.set_Item("gradientUnits", C6104k4.m24739k4(i));
    }

    /* JADX INFO: renamed from: ts */
    public final List<C6912h4> m27073ts() {
        if (this.f18853c5 == null) {
            this.f18853c5 = new List<>();
            for (int i = 0; i < m13628ar().m13697k4(); i++) {
                C6912h4 c6912h4 = (C6912h4) C7019kk.m27452k4((Object) m13628ar().m13702x1(i), C6912h4.class);
                if (c6912h4 != null) {
                    this.f18853c5.addItem(c6912h4);
                }
            }
        }
        if (this.f18853c5.size() == 0 && m27064c6() != null) {
            this.f18853c5 = m27064c6().m27073ts();
        }
        return this.f18853c5;
    }

    /* JADX INFO: renamed from: wy */
    public final boolean m27074wy() {
        return m27063b3() == 1;
    }

    /* JADX INFO: renamed from: xk */
    public final String m27075xk() {
        return (this.f9461x1.containsKey("gradientTransform") || m27064c6() == null) ? this.f9461x1.get_Item("gradientTransform") : m27064c6().m27075xk();
    }

    /* JADX INFO: renamed from: k4 */
    public final C11913yj m27069k4(C3786fa c3786fa, C12015qq c12015qq) {
        C11913yj c11913yj = new C11913yj();
        if (m27075xk() != null) {
            c11913yj.m55787x1(new C3791ks(c3786fa).m15149k4(m27075xk(), c12015qq.Clone()));
        }
        return c11913yj;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m27070k4(C3783ck c3783ck) {
        if (this.f9461x1.containsKey("xlink:href")) {
            m27071k4((AbstractC6913k4) C7019kk.m27452k4((Object) c3783ck.m15116k4(C3794up.m15166kk(this.f9461x1.get_Item("xlink:href"))), AbstractC6913k4.class));
            if (m27064c6() != null) {
                m27064c6().m27070k4(c3783ck);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m27071k4(AbstractC6913k4 abstractC6913k4) {
        this.f18854dy = abstractC6913k4;
    }
}

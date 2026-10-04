package com.aspose.slides.internal.p535yz;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p087dm.C3181c5;
import com.aspose.slides.internal.p087dm.C3182du;
import com.aspose.slides.internal.p115eq.C3782c5;
import com.aspose.slides.internal.p115eq.C3785dy;
import com.aspose.slides.internal.p115eq.C3786fa;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p404sp.C10308dy;
import com.aspose.slides.internal.p475wh.C12015qq;

/* JADX INFO: renamed from: com.aspose.slides.internal.yz.h4 */
/* JADX INFO: loaded from: classes5.dex */
public class C13341h4 extends C3182du {
    public C13341h4() {
        this.f9456h4 = "glyph";
    }

    /* JADX INFO: renamed from: ak */
    public final String m62000ak() {
        return this.f9461x1.get_Item("d");
    }

    /* JADX INFO: renamed from: b3 */
    public String mo61991b3() {
        return this.f9461x1.get_Item("unicode");
    }

    /* JADX INFO: renamed from: c6 */
    public final C13343k4 m62001c6() {
        for (C3181c5 c3181c5M13638qq = m13638qq(); c3181c5M13638qq != null; c3181c5M13638qq = c3181c5M13638qq.m13638qq()) {
            C13343k4 c13343k4 = (C13343k4) C7019kk.m27452k4((Object) c3181c5M13638qq, C13343k4.class);
            if (c13343k4 != null) {
                return c13343k4;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: dq */
    public final float m62002dq() {
        return this.f9461x1.containsKey("horiz-adv-x") ? C10308dy.m50270k4(this.f9461x1.get_Item("horiz-adv-x")) : m62001c6().m62005b3();
    }

    /* JADX INFO: renamed from: k4 */
    public final List<C3785dy> m62003k4(C3786fa c3786fa, C12015qq c12015qq) {
        return C3782c5.m15111k4(m62000ak(), c3786fa);
    }

    /* JADX INFO: renamed from: wy */
    public String mo61992wy() {
        return this.f9461x1.get_Item("glyph-name");
    }

    /* JADX INFO: renamed from: xk */
    public final boolean m62004xk() {
        return this.f9461x1.containsKey("horiz-adv-x") || m62001c6().f9461x1.containsKey("horiz-adv-x");
    }
}

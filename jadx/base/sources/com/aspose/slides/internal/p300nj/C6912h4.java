package com.aspose.slides.internal.p300nj;

import com.aspose.slides.internal.p087dm.C3181c5;
import com.aspose.slides.internal.p087dm.C3182du;
import com.aspose.slides.internal.p404sp.C10308dy;
import com.aspose.slides.internal.p404sp.C10314to;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.nj.h4 */
/* JADX INFO: loaded from: classes4.dex */
public class C6912h4 extends C3182du {
    public C6912h4() {
        this.f9456h4 = "stop";
    }

    /* JADX INFO: renamed from: ak */
    public final float m27055ak() {
        float fM50270k4;
        if (!m27057dq()) {
            return 1.0f;
        }
        if ("inherit".equals(this.f9461x1.get_Item("stop-opacity"))) {
            fM50270k4 = 1.0f;
            for (C3181c5 c3181c5M13638qq = m13638qq(); c3181c5M13638qq != null; c3181c5M13638qq = c3181c5M13638qq.m13638qq()) {
                if (!C14113y2.m67411k4(c3181c5M13638qq.f9461x1.get_Item("stop-opacity")) && !"inherit".equals(c3181c5M13638qq.f9461x1.get_Item("stop-opacity"))) {
                    fM50270k4 = C10308dy.m50270k4(c3181c5M13638qq.f9461x1.get_Item("stop-opacity"));
                }
            }
        } else {
            fM50270k4 = C10308dy.m50270k4(this.f9461x1.get_Item("stop-opacity"));
        }
        return C14116yg.m67504x1(1.0f, C14116yg.m67481k4(0.0f, fM50270k4));
    }

    /* JADX INFO: renamed from: b3 */
    public final float m27056b3() {
        return C14116yg.m67504x1(1.0f, C14116yg.m67481k4(0.0f, C14113y2.m67424kk(C14113y2.m67440x1(this.f9461x1.get_Item("offset")), "%") ? C10308dy.m50270k4(C14113y2.m67362du(this.f9461x1.get_Item("offset"), '%')) / 100.0f : C10308dy.m50270k4(this.f9461x1.get_Item("offset"))));
    }

    /* JADX INFO: renamed from: dq */
    public final boolean m27057dq() {
        return this.f9461x1.get_Item("stop-opacity") != null;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m27058k4(C10314to c10314to) {
        this.f9461x1.set_Item("stop-color", c10314to.toString());
    }

    /* JADX INFO: renamed from: kk */
    public final void m27059kk(float f) {
        this.f9461x1.set_Item("offset", C10308dy.m50272k4(f));
    }

    /* JADX INFO: renamed from: to */
    public final void m27060to(float f) {
        this.f9461x1.set_Item("stop-opacity", C10308dy.m50272k4(f));
    }

    /* JADX INFO: renamed from: wy */
    public final C10314to m27061wy() {
        if ("inherit".equals(this.f9461x1.get_Item("stop-color"))) {
            for (C3181c5 c3181c5M13638qq = m13638qq(); c3181c5M13638qq != null; c3181c5M13638qq = c3181c5M13638qq.m13638qq()) {
                if (!C14113y2.m67411k4(c3181c5M13638qq.f9461x1.get_Item("stop-color")) && !"inherit".equals(c3181c5M13638qq.f9461x1.get_Item("stop-color"))) {
                    return C10314to.m50289k4(c3181c5M13638qq.f9461x1.get_Item("stop-color"));
                }
            }
        }
        return C10314to.m50289k4("currentColor".equals(this.f9461x1.get_Item("stop-color")) ? m13638qq().f9461x1.get_Item("color") : this.f9461x1.m13690kk("stop-color", "black"));
    }
}

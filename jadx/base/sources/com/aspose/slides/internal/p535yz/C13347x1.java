package com.aspose.slides.internal.p535yz;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p087dm.C3182du;
import com.aspose.slides.internal.p404sp.C10308dy;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.yz.x1 */
/* JADX INFO: loaded from: classes5.dex */
public class C13347x1 extends C3182du {

    /* JADX INFO: renamed from: dy */
    private List<String> f44703dy;

    public C13347x1() {
        List<String> list = new List<>();
        this.f44703dy = list;
        list.addItem("bold");
        this.f44703dy.addItem("bolder");
        this.f44703dy.addItem("600");
        this.f44703dy.addItem("700");
        this.f44703dy.addItem("800");
        this.f44703dy.addItem("900");
        this.f9456h4 = "font-face-name";
    }

    /* JADX INFO: renamed from: ak */
    public final boolean m62009ak() {
        String strM67361du = C14113y2.m67361du(C14113y2.m67440x1(m62014wy()));
        return "italic".equals(strM67361du) || "oblique".equals(strM67361du);
    }

    /* JADX INFO: renamed from: b3 */
    public final String m62010b3() {
        return this.f9461x1.get_Item("font-family");
    }

    /* JADX INFO: renamed from: c6 */
    public final String m62011c6() {
        String str = this.f9461x1.get_Item("font-weight");
        return str == null ? "all" : str;
    }

    /* JADX INFO: renamed from: dq */
    public final String m62012dq() {
        String str = this.f9461x1.get_Item("font-variant");
        return str == null ? "normal" : str;
    }

    /* JADX INFO: renamed from: ts */
    public final float m62013ts() {
        if (this.f9461x1.containsKey("units-per-em")) {
            return C10308dy.m50270k4(this.f9461x1.get_Item("units-per-em"));
        }
        return 1000.0f;
    }

    /* JADX INFO: renamed from: wy */
    public final String m62014wy() {
        String str = this.f9461x1.get_Item("font-style");
        return str == null ? "all" : str;
    }

    /* JADX INFO: renamed from: xk */
    public final boolean m62015xk() {
        return "small-caps".equals(C14113y2.m67361du(C14113y2.m67440x1(m62012dq())));
    }
}

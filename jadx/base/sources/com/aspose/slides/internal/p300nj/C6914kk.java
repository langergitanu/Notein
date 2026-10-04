package com.aspose.slides.internal.p300nj;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.aspose.slides.internal.p087dm.C3182du;
import com.aspose.slides.internal.p404sp.C10307du;
import com.aspose.slides.internal.p404sp.C10310jd;
import com.aspose.slides.internal.p404sp.C10312kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.nj.kk */
/* JADX INFO: loaded from: classes4.dex */
public class C6914kk extends C3182du {
    public C6914kk() {
        this.f9456h4 = RequestParameters.MARKER;
    }

    /* JADX INFO: renamed from: ak */
    public final C10307du m27076ak() {
        return C10307du.m50262k4(this.f9461x1.get_Item("markerWidth"), C10307du.m50263kk(3.0f));
    }

    /* JADX INFO: renamed from: b3 */
    public final C10307du m27077b3() {
        return C10307du.m50262k4(this.f9461x1.get_Item("refX"), C10307du.m50263kk(0.0f));
    }

    /* JADX INFO: renamed from: bz */
    public final C10312kk m27078bz() {
        return C10312kk.m50279k4(this.f9461x1.get_Item("preserveAspectRatio"));
    }

    /* JADX INFO: renamed from: c6 */
    public final String m27079c6() {
        return this.f9461x1.m13690kk("markerUnits", "strokeWidth");
    }

    /* JADX INFO: renamed from: ck */
    public final void m27080ck(String str) {
        this.f9461x1.set_Item("markerUnits", str);
    }

    /* JADX INFO: renamed from: dq */
    public final C10307du m27081dq() {
        return C10307du.m50262k4(this.f9461x1.get_Item("markerHeight"), C10307du.m50263kk(3.0f));
    }

    /* JADX INFO: renamed from: e0 */
    public final C10310jd m27082e0() {
        return C10310jd.m50275k4(this.f9461x1.get_Item("viewBox"));
    }

    /* JADX INFO: renamed from: jd */
    public final void m27083jd(String str) {
        this.f9461x1.set_Item("orient", str);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m27084k4(C10310jd c10310jd) {
        this.f9461x1.set_Item("viewBox", c10310jd.toString());
    }

    /* JADX INFO: renamed from: kk */
    public final void m27085kk(C10307du c10307du) {
        this.f9461x1.set_Item("markerHeight", c10307du.toString());
    }

    /* JADX INFO: renamed from: ts */
    public final boolean m27086ts() {
        return "strokeWidth".equals(m27079c6());
    }

    /* JADX INFO: renamed from: wy */
    public final C10307du m27087wy() {
        return C10307du.m50262k4(this.f9461x1.get_Item("refY"), C10307du.m50263kk(0.0f));
    }

    /* JADX INFO: renamed from: x1 */
    public final void m27088x1(C10307du c10307du) {
        this.f9461x1.set_Item("markerWidth", c10307du.toString());
    }

    /* JADX INFO: renamed from: xk */
    public final String m27089xk() {
        return this.f9461x1.m13690kk("orient", "0");
    }
}

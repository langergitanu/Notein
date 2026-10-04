package com.aspose.slides.internal.p104ec;

import com.aspose.slides.internal.p080dd.C3125bv;
import com.aspose.slides.internal.p080dd.C3144um;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14047bz;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ec.s7 */
/* JADX INFO: loaded from: classes3.dex */
class C3639s7 {

    /* JADX INFO: renamed from: k4 */
    private final C3652vj f10097k4 = new C3652vj();

    /* JADX INFO: renamed from: x1 */
    private String f10098x1;

    /* JADX INFO: renamed from: x1 */
    private void m14788x1() {
        new C6765kp(this.f10098x1).m26792k4("[Host Extender Info]");
    }

    /* JADX INFO: renamed from: k4 */
    public final void m14789k4(C3125bv c3125bv) {
        this.f10097k4.m14818k4(c3125bv);
        c3125bv.mo13304k4(this.f10098x1);
    }

    /* JADX INFO: renamed from: kk */
    public final void m14793kk(String str) {
        this.f10097k4.m14821kk(str);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m14790k4(C3144um c3144um) {
        this.f10097k4.m14819k4(c3144um);
        this.f10098x1 = c3144um.mo13427dy();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m14794x1(String str) {
        this.f10097k4.m14823x1(str);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m14791k4(String str) {
        this.f10097k4.m14820k4(str);
        m14788x1();
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m14792k4() {
        C3614gi c3614gi;
        if (((C3660xw) C7019kk.m27452k4((Object) this.f10097k4.m14822to("DPB"), C3660xw.class)) == null || (c3614gi = (C3614gi) C7019kk.m27452k4((Object) this.f10097k4.m14822to("ID"), C3614gi.class)) == null) {
            return false;
        }
        return C14113y2.m67363du(c3614gi.m14726x1(), C14047bz.f47172k4.m66538k4("B"));
    }
}

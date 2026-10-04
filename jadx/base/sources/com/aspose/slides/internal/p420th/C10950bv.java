package com.aspose.slides.internal.p420th;

import com.aspose.slides.internal.p151gj.C4317dy;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12025x6;

/* JADX INFO: renamed from: com.aspose.slides.internal.th.bv */
/* JADX INFO: loaded from: classes4.dex */
public class C10950bv extends AbstractC10957fa {

    /* JADX INFO: renamed from: k4 */
    private boolean f38161k4;

    /* JADX INFO: renamed from: k4 */
    public static C10950bv m52889k4(C12007ix c12007ix) {
        C10950bv c10950bv = new C10950bv();
        c10950bv.m52895k4(true);
        c10950bv.m52899x1(c12007ix.Clone());
        return c10950bv;
    }

    /* JADX INFO: renamed from: kk */
    public final void m52897kk(C12025x6[] c12025x6Arr) {
        int length = c12025x6Arr.length;
        int i = 0;
        while (i < length - 3) {
            C12025x6 c12025x6Clone = c12025x6Arr[i].Clone();
            C12025x6 c12025x6Clone2 = c12025x6Arr[i + 1].Clone();
            C12025x6 c12025x6Clone3 = c12025x6Arr[i + 2].Clone();
            i += 3;
            m52930k4(new C10955du(c12025x6Clone, c12025x6Clone2, c12025x6Clone3, c12025x6Arr[i].Clone()));
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final C10950bv m52898x1() {
        C10950bv c10950bv = new C10950bv();
        c10950bv.f38161k4 = this.f38161k4;
        for (int i = 0; i < m52927c5(); i++) {
            c10950bv.m52930k4(((InterfaceC10979xk) m52931k4(i)).mo52921x1());
        }
        return c10950bv;
    }

    /* JADX INFO: renamed from: k4 */
    public static C10950bv m52890k4(C12025x6 c12025x6, C12025x6 c12025x62) {
        C10950bv c10950bv = new C10950bv();
        c10950bv.m52900x1(c12025x6.Clone(), c12025x62.Clone());
        return c10950bv;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m52899x1(C12007ix c12007ix) {
        C10974v4 c10974v4 = new C10974v4();
        c10974v4.m53117k4().addItem(new C12025x6(c12007ix.m56571to(), c12007ix.m56554dy()));
        c10974v4.m53117k4().addItem(new C12025x6(c12007ix.m56556h4(), c12007ix.m56554dy()));
        c10974v4.m53117k4().addItem(new C12025x6(c12007ix.m56556h4(), c12007ix.m56558k4()));
        c10974v4.m53117k4().addItem(new C12025x6(c12007ix.m56571to(), c12007ix.m56558k4()));
        m52930k4(c10974v4);
    }

    /* JADX INFO: renamed from: k4 */
    public static C10950bv m52891k4(C12025x6[] c12025x6Arr) {
        C10950bv c10950bv = new C10950bv();
        c10950bv.m52895k4(false);
        c10950bv.m52897kk(c12025x6Arr);
        return c10950bv;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m52900x1(C12025x6 c12025x6, C12025x6 c12025x62) {
        C10974v4 c10974v4 = new C10974v4();
        c10974v4.m53117k4().addItem(c12025x6.Clone());
        c10974v4.m53117k4().addItem(c12025x62.Clone());
        m52930k4(c10974v4);
    }

    /* JADX INFO: renamed from: k4 */
    public static C10950bv m52892k4(C12025x6[] c12025x6Arr, boolean z) {
        C10950bv c10950bv = new C10950bv();
        c10950bv.m52895k4(z);
        c10950bv.m52901x1(c12025x6Arr);
        return c10950bv;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m52901x1(C12025x6[] c12025x6Arr) {
        m52930k4(new C10974v4(c12025x6Arr));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m52893k4(C4317dy c4317dy) {
        for (int i = 0; i < m52927c5(); i++) {
            ((InterfaceC10952c6) m52931k4(i)).mo52910k4(c4317dy);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m52894k4(C10961k4 c10961k4) {
        for (C10969to c10969to : c10961k4.m52959x1()) {
            m52930k4(new C10955du(c10969to.Clone()));
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m52895k4(boolean z) {
        this.f38161k4 = z;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m52896k4() {
        return this.f38161k4;
    }
}

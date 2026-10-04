package com.aspose.slides;

import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p407st.C10695wm;
import com.aspose.slides.p559ms.System.IDisposable;

/* JADX INFO: loaded from: classes3.dex */
class ofi implements IDisposable {

    /* JADX INFO: renamed from: du */
    private long f47766du;

    /* JADX INFO: renamed from: k4 */
    private C10695wm f47767k4;

    /* JADX INFO: renamed from: kk */
    private AbstractC3150x6 f47768kk;

    /* JADX INFO: renamed from: to */
    private int f47769to;

    /* JADX INFO: renamed from: x1 */
    private C3134k4 f47770x1;

    public ofi(C10695wm c10695wm, C3134k4 c3134k4) {
        this.f47767k4 = c10695wm;
        this.f47770x1 = c3134k4;
        this.f47768kk = c3134k4.m13371ck();
        m68512k4();
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public final void dispose() {
        this.f47767k4 = null;
        this.f47770x1 = null;
        this.f47768kk = null;
    }

    /* JADX INFO: renamed from: k4 */
    public final C10695wm m68511k4(int i) {
        C10695wm c10695wmM68513x1;
        do {
            c10695wmM68513x1 = m68513x1();
            if (c10695wmM68513x1 != null && C7019kk.m27457kk(Integer.valueOf(c10695wmM68513x1.m51923to()), 8) == C7019kk.m27457kk(Integer.valueOf(i), 8)) {
                return c10695wmM68513x1;
            }
        } while (c10695wmM68513x1 != null);
        return null;
    }

    /* JADX INFO: renamed from: x1 */
    public final C10695wm m68513x1() {
        if (this.f47769to < 1) {
            return null;
        }
        this.f47768kk.setPosition(this.f47766du);
        C10695wm c10695wm = new C10695wm(this.f47770x1);
        this.f47766du += (long) (c10695wm.m51914du() + 8);
        this.f47769to -= c10695wm.m51914du() + 8;
        return c10695wm;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m68512k4() {
        this.f47769to = this.f47767k4.m51914du();
        this.f47766du = this.f47767k4.m51915h4() + 8;
    }
}

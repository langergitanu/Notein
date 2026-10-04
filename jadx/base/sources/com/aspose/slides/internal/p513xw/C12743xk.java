package com.aspose.slides.internal.p513xw;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p022ai.C1375h4;
import com.aspose.slides.internal.p048bv.InterfaceC1861h4;

/* JADX INFO: renamed from: com.aspose.slides.internal.xw.xk */
/* JADX INFO: loaded from: classes5.dex */
public class C12743xk extends C12688c6 {

    /* JADX INFO: renamed from: du */
    private List<List<InterfaceC1861h4>> f42527du;

    /* JADX INFO: renamed from: h4 */
    private List<List<InterfaceC1861h4>> f42528h4;

    /* JADX INFO: renamed from: k4 */
    private C1375h4 f42529k4;

    /* JADX INFO: renamed from: kk */
    private List<C12682ar> f42530kk;

    /* JADX INFO: renamed from: to */
    private List<C12702ix> f42531to;

    /* JADX INFO: renamed from: x1 */
    private int f42532x1;

    public C12743xk(int i, List<C12682ar> list, List<C12702ix> list2, C12717os c12717os, boolean z) {
        super(i, c12717os, z);
        this.f42527du = null;
        this.f42528h4 = null;
        this.f42529k4 = C1375h4.f5962k4;
        this.f42532x1 = 0;
        this.f42530kk = new List<>(list);
        this.f42531to = new List<>(list2);
    }

    /* JADX INFO: renamed from: c5 */
    public final boolean m59406c5() {
        return this.f42531to.size() > 0;
    }

    /* JADX INFO: renamed from: ck */
    public final List<List<InterfaceC1861h4>> m59407ck() {
        return this.f42528h4;
    }

    /* JADX INFO: renamed from: du */
    public final List<C12682ar> m59408du() {
        return this.f42530kk;
    }

    /* JADX INFO: renamed from: fa */
    public final C1375h4 m59409fa() {
        return this.f42529k4;
    }

    /* JADX INFO: renamed from: h4 */
    public final List<C12702ix> m59410h4() {
        return this.f42531to;
    }

    /* JADX INFO: renamed from: jd */
    public final List<List<InterfaceC1861h4>> m59411jd() {
        return this.f42527du;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m59412k4(List<InterfaceC1861h4> list) {
        if (this.f42527du == null) {
            this.f42527du = new List<>();
        }
        this.f42527du.addItem(list);
    }

    /* JADX INFO: renamed from: m9 */
    public final boolean m59414m9() {
        return this.f42530kk.size() > 0;
    }

    /* JADX INFO: renamed from: up */
    public final int m59415up() {
        return this.f42532x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m59416x1(List<InterfaceC1861h4> list) {
        if (this.f42528h4 == null) {
            this.f42528h4 = new List<>();
        }
        this.f42528h4.addItem(list);
    }

    public C12743xk(int i, C1375h4 c1375h4, int i2, C12717os c12717os, boolean z) {
        super(i, c12717os, z);
        this.f42527du = null;
        this.f42528h4 = null;
        this.f42529k4 = c1375h4;
        this.f42532x1 = i2;
        this.f42530kk = new List<>();
        this.f42531to = new List<>();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m59413k4(C1375h4 c1375h4) {
        this.f42529k4 = c1375h4;
    }
}

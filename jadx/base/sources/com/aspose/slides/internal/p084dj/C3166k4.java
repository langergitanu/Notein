package com.aspose.slides.internal.p084dj;

import com.aspose.slides.internal.p180ib.C4804dy;
import com.aspose.slides.internal.p472w8.C11898h4;
import com.aspose.slides.internal.p472w8.C11913yj;

/* JADX INFO: renamed from: com.aspose.slides.internal.dj.k4 */
/* JADX INFO: loaded from: classes3.dex */
public class C3166k4 {

    /* JADX INFO: renamed from: k4 */
    private C3167x1 f9407k4;

    /* JADX INFO: renamed from: kk */
    private final C4804dy f9408kk;

    /* JADX INFO: renamed from: x1 */
    private final C11913yj f9409x1;

    public C3166k4(C11913yj c11913yj, C4804dy c4804dy) {
        this.f9409x1 = c11913yj;
        this.f9408kk = c4804dy;
    }

    /* JADX INFO: renamed from: x1 */
    private float m13533x1(C11898h4 c11898h4) {
        float fM55596c5 = c11898h4.m55596c5() * this.f9408kk.m19882x1();
        float fM55596c52 = c11898h4.m55596c5();
        if (fM55596c52 <= 0.0f) {
            fM55596c52 = 1.0f;
        }
        return fM55596c5 >= this.f9408kk.m19881to() ? fM55596c52 * 2.0f : fM55596c52;
    }

    /* JADX INFO: renamed from: k4 */
    public float m13534k4(C11898h4 c11898h4) {
        if (c11898h4.m55597ck()) {
            return m13533x1(c11898h4);
        }
        if (this.f9407k4 == null) {
            this.f9407k4 = new C3167x1(this.f9409x1, this.f9408kk, true);
        }
        return this.f9407k4.m13535k4(c11898h4.m55596c5());
    }
}

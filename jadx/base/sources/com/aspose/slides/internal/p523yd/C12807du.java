package com.aspose.slides.internal.p523yd;

import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p097e0.C3518fa;
import com.aspose.slides.internal.p111em.C3763x1;

/* JADX INFO: renamed from: com.aspose.slides.internal.yd.du */
/* JADX INFO: loaded from: classes5.dex */
public class C12807du {

    /* JADX INFO: renamed from: k4 */
    private String f42569k4;

    /* JADX INFO: renamed from: kk */
    private C12814to f42570kk;

    /* JADX INFO: renamed from: to */
    private C3518fa f42571to = null;

    /* JADX INFO: renamed from: x1 */
    private AbstractC3150x6 f42572x1;

    public C12807du(String str, C12814to c12814to, AbstractC3150x6 abstractC3150x6) {
        this.f42572x1 = null;
        this.f42569k4 = str;
        this.f42570kk = c12814to;
        if (c12814to == null) {
            this.f42570kk = C12809h4.m59524k4().m59546x1();
        }
        this.f42572x1 = abstractC3150x6;
        m59521x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m59521x1() {
        this.f42571to = new C3518fa(this.f42569k4, this.f42570kk, this.f42572x1);
    }

    /* JADX INFO: renamed from: k4 */
    public final C3763x1 m59522k4() {
        if (this.f42571to == null) {
            m59521x1();
        }
        return this.f42571to;
    }
}

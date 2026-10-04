package com.aspose.slides.internal.p060ca;

import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.ze */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2406ze {

    /* JADX INFO: renamed from: k4 */
    protected AbstractC2313tw f8349k4;

    /* JADX INFO: renamed from: x1 */
    protected AbstractC3150x6 f8350x1;

    /* JADX INFO: renamed from: k4 */
    public static AbstractC2406ze m11819k4(AbstractC2313tw abstractC2313tw, AbstractC3150x6 abstractC3150x6) {
        AbstractC2406ze c2309tq;
        if (C7019kk.m27469x1(abstractC2313tw, C2303tf.class)) {
            c2309tq = new C2127ib();
        } else if (C7019kk.m27469x1(abstractC2313tw, C2132iq.class)) {
            c2309tq = new C2170kx();
        } else if (C7019kk.m27469x1(abstractC2313tw, C2015bq.class)) {
            c2309tq = new C2304tg();
        } else {
            if (!C7019kk.m27469x1(abstractC2313tw, C2286s7.class)) {
                throw new C2279rs("Font saving error. Saving of requested font type is not supported.");
            }
            c2309tq = new C2309tq();
        }
        c2309tq.f8349k4 = abstractC2313tw;
        c2309tq.f8350x1 = abstractC3150x6;
        return c2309tq;
    }

    /* JADX INFO: renamed from: k4 */
    public abstract void mo10714k4();
}

package com.aspose.slides.internal.p453uz;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p231kk.AbstractC5788h4;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p447up.C11528c5;
import com.aspose.slides.internal.p447up.C11537ks;
import com.aspose.slides.internal.p478wl.C12160qw;
import com.aspose.slides.internal.p494x6.AbstractC12455k4;
import com.aspose.slides.internal.p494x6.C12456x1;
import com.aspose.slides.p559ms.System.AbstractC14106wy;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.uz.uz */
/* JADX INFO: loaded from: classes4.dex */
public class C11592uz extends AbstractC11580k4 {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f39136kk = new C7017h4("linear-gradient");

    /* JADX INFO: renamed from: k4 */
    private String f39137k4;

    /* JADX INFO: renamed from: x1 */
    private AbstractC12455k4 f39138x1;

    public C11592uz(AbstractC5788h4 abstractC5788h4) {
        super(abstractC5788h4);
        if (m54589k4()) {
            this.f39137k4 = mo54591to();
            return;
        }
        if (C7019kk.m27469x1(abstractC5788h4, C11528c5.class)) {
            C11528c5 c11528c5 = (C11528c5) C7019kk.m27452k4((Object) abstractC5788h4, C11528c5.class);
            if (f39136kk.m27428k4(C14113y2.m67361du(c11528c5.m54518k4())) != 0) {
                return;
            }
            AbstractC5788h4[] abstractC5788h4ArrM54519x1 = c11528c5.m54519x1();
            int i = (int) AbstractC14106wy.parse(C7019kk.m27443k4((Class<?>) C12160qw.class), ((C11537ks) abstractC5788h4ArrM54519x1[0]).mo23706x1());
            AbstractC5788h4 abstractC5788h42 = abstractC5788h4ArrM54519x1[1];
            C11581kk c11581kk = abstractC5788h42 != null ? new C11581kk(abstractC5788h42) : null;
            List list = new List();
            for (int i2 = 2; i2 < abstractC5788h4ArrM54519x1.length; i2++) {
                list.addItem(new C11576fa(abstractC5788h4ArrM54519x1[i2]));
            }
            this.f39138x1 = new C12456x1(i, c11581kk, list);
        }
    }

    /* JADX INFO: renamed from: c5 */
    public final boolean m54602c5() {
        return C14113y2.m67411k4(this.f39137k4) && m54603dy() == null;
    }

    /* JADX INFO: renamed from: dy */
    public final AbstractC12455k4 m54603dy() {
        return this.f39138x1;
    }

    /* JADX INFO: renamed from: m9 */
    public final String m54604m9() {
        return this.f39137k4;
    }
}

package com.aspose.slides.internal.p453uz;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.internal.p231kk.AbstractC5788h4;
import com.aspose.slides.internal.p231kk.AbstractC5803to;
import com.aspose.slides.internal.p231kk.C5796m9;
import com.aspose.slides.internal.p231kk.C5813x1;
import com.aspose.slides.internal.p297ne.C6884yj;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p447up.C11531dy;
import com.aspose.slides.internal.p447up.C11532fa;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.p559ms.System.C14093tq;

/* JADX INFO: renamed from: com.aspose.slides.internal.uz.ak */
/* JADX INFO: loaded from: classes4.dex */
public class C11567ak extends AbstractC11580k4 {

    /* JADX INFO: renamed from: du */
    private boolean f39077du;

    /* JADX INFO: renamed from: k4 */
    private C6884yj f39078k4;

    /* JADX INFO: renamed from: kk */
    private C6884yj f39079kk;

    /* JADX INFO: renamed from: to */
    private C14093tq<C12003du> f39080to;

    /* JADX INFO: renamed from: x1 */
    private C6884yj f39081x1;

    public C11567ak(AbstractC5788h4 abstractC5788h4) {
        C14093tq<C12003du> c14093tq;
        super(abstractC5788h4);
        this.f39080to = new C14093tq<>();
        IGenericEnumerator<AbstractC5788h4> it = ((C5796m9) abstractC5788h4).iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next() == C5813x1.k4.f15898b3) {
                this.f39077du = true;
                return;
            }
            if (i == 0) {
                this.f39078k4 = C11598yd.m54613k4(it.next());
            } else if (i == 1) {
                this.f39081x1 = C11598yd.m54613k4(it.next());
            } else if (i != 2) {
                if (i == 3) {
                    c14093tq = new C14093tq<>(((AbstractC5803to) it.next()).mo23698du().m23409du().Clone());
                    this.f39080to = c14093tq;
                }
            } else if (C7019kk.m27469x1(it.next(), C11531dy.class) || C7019kk.m27469x1(it.next(), C11532fa.class)) {
                this.f39079kk = C11598yd.m54613k4(it.next());
            } else {
                c14093tq = new C14093tq<>(((AbstractC5803to) it.next()).mo23698du().m23409du().Clone());
                this.f39080to = c14093tq;
            }
            i++;
        }
    }
}

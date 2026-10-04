package com.aspose.slides.internal.p453uz;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.internal.p231kk.AbstractC5788h4;
import com.aspose.slides.internal.p231kk.AbstractC5803to;
import com.aspose.slides.internal.p231kk.C5796m9;
import com.aspose.slides.internal.p231kk.C5813x1;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14093tq;

/* JADX INFO: renamed from: com.aspose.slides.internal.uz.bv */
/* JADX INFO: loaded from: classes4.dex */
public class C11570bv extends AbstractC11580k4 {

    /* JADX INFO: renamed from: k4 */
    private String f39086k4;

    /* JADX INFO: renamed from: kk */
    private boolean f39087kk;

    /* JADX INFO: renamed from: to */
    private boolean f39088to;

    /* JADX INFO: renamed from: x1 */
    private C14093tq<Integer> f39089x1;

    public C11570bv(AbstractC5788h4 abstractC5788h4) {
        C14093tq<Integer> c14093tq;
        super(abstractC5788h4);
        this.f39086k4 = null;
        this.f39089x1 = new C14093tq<>();
        IGenericEnumerator<AbstractC5788h4> it = ((C5796m9) C7019kk.m27452k4((Object) abstractC5788h4, C5796m9.class)).iterator();
        while (it.hasNext()) {
            AbstractC5788h4 next = it.next();
            if (C5813x1.k4.f16548yd == next) {
                this.f39087kk = true;
            } else if (C5813x1.k4.f15898b3 == next) {
                this.f39088to = true;
            } else if (next.m23417m9() == 1) {
                AbstractC5803to abstractC5803to = (AbstractC5803to) next;
                if (abstractC5803to.m23700k4() == 19 || abstractC5803to.m23700k4() == 20) {
                    this.f39086k4 = abstractC5803to.mo23706x1();
                    if (it.hasNext()) {
                        AbstractC5788h4 next2 = it.next();
                        if (C5813x1.k4.f15979e8 == next2) {
                            c14093tq = new C14093tq<>(0);
                        } else if (C5813x1.k4.f16335qw == next2) {
                            c14093tq = new C14093tq<>(1);
                        }
                        this.f39089x1 = c14093tq;
                    }
                }
            }
        }
    }
}

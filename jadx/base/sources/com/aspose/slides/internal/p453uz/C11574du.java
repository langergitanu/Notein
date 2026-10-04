package com.aspose.slides.internal.p453uz;

import com.aspose.slides.internal.p231kk.AbstractC5788h4;
import com.aspose.slides.internal.p231kk.C5796m9;
import com.aspose.slides.internal.p231kk.C5813x1;

/* JADX INFO: renamed from: com.aspose.slides.internal.uz.du */
/* JADX INFO: loaded from: classes4.dex */
public class C11574du extends AbstractC11580k4 {

    /* JADX INFO: renamed from: k4 */
    private C11584m9 f39098k4;

    /* JADX INFO: renamed from: kk */
    private boolean f39099kk;

    /* JADX INFO: renamed from: to */
    private boolean f39100to;

    /* JADX INFO: renamed from: x1 */
    private C11584m9 f39101x1;

    public C11574du(AbstractC5788h4 abstractC5788h4) {
        super(abstractC5788h4);
        if (m54592x1()) {
            if (C5813x1.k4.f16165kp == abstractC5788h4) {
                this.f39099kk = true;
                return;
            } else {
                if (C5813x1.k4.f16041gi == abstractC5788h4) {
                    this.f39100to = true;
                    return;
                }
                return;
            }
        }
        if (abstractC5788h4.m23417m9() != 2) {
            C11584m9 c11584m9 = new C11584m9(abstractC5788h4);
            this.f39098k4 = c11584m9;
            this.f39101x1 = c11584m9;
            return;
        }
        C5796m9 c5796m9 = (C5796m9) abstractC5788h4;
        if (c5796m9.mo23681k4() == 1) {
            this.f39098k4 = new C11584m9(c5796m9.mo23682k4(0));
            this.f39101x1 = new C11584m9(C5813x1.k4.f16548yd);
        } else {
            this.f39098k4 = new C11584m9(c5796m9.mo23682k4(0));
            this.f39101x1 = new C11584m9(c5796m9.mo23682k4(1));
        }
    }

    /* JADX INFO: renamed from: dy */
    public final C11584m9 m54574dy() {
        return this.f39101x1;
    }

    /* JADX INFO: renamed from: m9 */
    public final C11584m9 m54575m9() {
        return this.f39098k4;
    }
}

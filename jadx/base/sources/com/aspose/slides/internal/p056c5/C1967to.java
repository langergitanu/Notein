package com.aspose.slides.internal.p056c5;

import com.aspose.slides.internal.p096dy.AbstractC3505to;
import com.aspose.slides.internal.p231kk.AbstractC5788h4;
import com.aspose.slides.internal.p231kk.AbstractC5803to;
import com.aspose.slides.internal.p231kk.C5796m9;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p423to.C11074x1;

/* JADX INFO: renamed from: com.aspose.slides.internal.c5.to */
/* JADX INFO: loaded from: classes3.dex */
public class C1967to extends AbstractC3505to {

    /* JADX INFO: renamed from: k4 */
    private float f6933k4;

    /* JADX INFO: renamed from: x1 */
    private float f6934x1;

    public C1967to(String str, AbstractC5788h4 abstractC5788h4) {
        super(str, abstractC5788h4);
        C5796m9 c5796m9 = (C5796m9) C7019kk.m27452k4((Object) abstractC5788h4, C5796m9.class);
        if (c5796m9 != null) {
            this.f6933k4 = ((AbstractC5803to) c5796m9.mo23682k4(0)).mo23699k4((short) 1);
            this.f6934x1 = ((AbstractC5803to) c5796m9.mo23682k4(2)).mo23699k4((short) 1);
        }
    }

    @Override // com.aspose.slides.internal.p096dy.InterfaceC3506x1
    /* JADX INFO: renamed from: k4 */
    public boolean mo10096k4(C11074x1 c11074x1) {
        return this.f6933k4 / this.f6934x1 == ((float) c11074x1.m53518kk().m56865x1()) / ((float) c11074x1.m53518kk().m56862kk());
    }
}

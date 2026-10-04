package com.aspose.slides.internal.p235kp;

import com.aspose.slides.internal.p097e0.AbstractC3511c5;
import com.aspose.slides.internal.p097e0.AbstractC3524ks;
import com.aspose.slides.internal.p097e0.AbstractC3533um;
import com.aspose.slides.internal.p111em.InterfaceC3757h4;
import com.aspose.slides.internal.p150gi.C4270dy;
import com.aspose.slides.internal.p150gi.InterfaceC4260ak;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.kp.x1 */
/* JADX INFO: loaded from: classes.dex */
public class C5897x1 extends AbstractC3524ks implements InterfaceC4260ak {

    /* JADX INFO: renamed from: h4 */
    private C4270dy f16685h4;

    /* JADX INFO: renamed from: m9 */
    private String f16686m9;

    public C5897x1(AbstractC3511c5 abstractC3511c5) {
        super(abstractC3511c5);
        this.f16686m9 = C14113y2.f47374k4;
    }

    /* JADX INFO: renamed from: e0 */
    public final String m23750e0() {
        return this.f16686m9;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: ix */
    public int mo14084ix() {
        return 7;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3524ks, com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public void mo14090k4(AbstractC3533um abstractC3533um) {
        super.mo14090k4(abstractC3533um);
        this.f16685h4 = C4270dy.m17199k4(abstractC3533um);
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: rv */
    public String mo14114rv() {
        return "bookmark-title";
    }

    @Override // com.aspose.slides.internal.p150gi.InterfaceC4260ak
    /* JADX INFO: renamed from: ts */
    public final C4270dy mo17117ts() {
        return this.f16685h4;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: x1 */
    public void mo14124x1(char[] cArr, int i, int i2, AbstractC3533um abstractC3533um, InterfaceC3757h4 interfaceC3757h4) {
        this.f16686m9 = C14113y2.m67400k4(this.f16686m9, C14113y2.m67406k4(cArr, i, i2));
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public void mo14094k4(InterfaceC3757h4 interfaceC3757h4, String str, String str2) {
        if (C14113y2.m67363du("http://www.w3.org/1999/XSL/Format", str)) {
            m14103kk(interfaceC3757h4, str, str2);
        }
    }
}

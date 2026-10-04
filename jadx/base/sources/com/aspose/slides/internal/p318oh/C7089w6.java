package com.aspose.slides.internal.p318oh;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p190is.C5114k4;
import com.aspose.slides.internal.p539z4.AbstractC13373f9;
import com.aspose.slides.internal.p539z4.C13396nv;
import com.aspose.slides.internal.p539z4.C13423x6;
import com.aspose.slides.internal.p539z4.C13427y9;

/* JADX INFO: renamed from: com.aspose.slides.internal.oh.w6 */
/* JADX INFO: loaded from: classes4.dex */
public class C7089w6 extends AbstractC7052e0 {

    /* JADX INFO: renamed from: k4 */
    private final C13396nv f19219k4;

    public C7089w6(C13396nv c13396nv) {
        this.f19219k4 = c13396nv;
    }

    /* JADX INFO: renamed from: k4 */
    public AbstractC13373f9 m27610k4(C3134k4 c3134k4) {
        C13427y9 c13427y9 = new C13427y9();
        if (this.f19219k4.m62271yj() > 0) {
            c13427y9.m62487k4(C5114k4.m21966kk(this.f19219k4.m62271yj(), c3134k4));
        }
        if (this.f19219k4.m62244jd() > 0) {
            int iM62244jd = this.f19219k4.m62244jd();
            C13423x6[] c13423x6Arr = new C13423x6[iM62244jd];
            for (int i = 0; i < iM62244jd; i++) {
                c13423x6Arr[i] = (C13423x6) new C7048ck().m27570k4(c3134k4);
            }
            c13427y9.m62488k4(c13423x6Arr);
        }
        return c13427y9;
    }
}

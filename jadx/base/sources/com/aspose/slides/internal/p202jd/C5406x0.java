package com.aspose.slides.internal.p202jd;

import com.aspose.slides.internal.p126fa.AbstractC3894c5;
import com.aspose.slides.internal.p231kk.AbstractC5788h4;
import com.aspose.slides.internal.p231kk.C5813x1;
import com.aspose.slides.internal.p270m9.C6344m9;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p368qq.C9919h4;
import com.aspose.slides.internal.p368qq.InterfaceC9933up;
import com.aspose.slides.internal.p447up.AbstractC11535k4;

/* JADX INFO: renamed from: com.aspose.slides.internal.jd.x0 */
/* JADX INFO: loaded from: classes.dex */
public class C5406x0 extends AbstractC3894c5 {
    @Override // com.aspose.slides.internal.p126fa.AbstractC3894c5, com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: k4 */
    public AbstractC5788h4 mo15578k4(InterfaceC9933up interfaceC9933up, C6344m9 c6344m9) {
        AbstractC11535k4 abstractC11535k4 = (AbstractC11535k4) C7019kk.m27452k4((Object) super.mo15578k4(interfaceC9933up, c6344m9), AbstractC11535k4.class);
        if (abstractC11535k4 != null) {
            if (abstractC11535k4.m23700k4() != 1) {
                throw C9919h4.m48829kk(abstractC11535k4.mo23414h4());
            }
            float fMo23699k4 = abstractC11535k4.mo23699k4((short) 1);
            if (fMo23699k4 < 0.0f || fMo23699k4 > 100.0f) {
                throw C9919h4.m48829kk(abstractC11535k4.mo23414h4());
            }
        }
        return abstractC11535k4;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: kk */
    public boolean mo15584kk() {
        return false;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: to */
    public AbstractC5788h4 mo15585to() {
        return C5813x1.k4.f16057h4;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: x1 */
    public int mo15586x1() {
        return 221;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: k4 */
    public String mo15583k4() {
        return "richness";
    }
}

package com.aspose.slides.internal.p202jd;

import com.aspose.slides.internal.p126fa.AbstractC3895ck;
import com.aspose.slides.internal.p231kk.AbstractC5788h4;
import com.aspose.slides.internal.p231kk.AbstractC5803to;
import com.aspose.slides.internal.p231kk.C5813x1;
import com.aspose.slides.internal.p231kk.InterfaceC5808uz;
import com.aspose.slides.internal.p270m9.C6344m9;
import com.aspose.slides.internal.p368qq.InterfaceC9933up;
import com.aspose.slides.internal.p447up.AbstractC11535k4;
import com.aspose.slides.internal.p447up.C11539rv;

/* JADX INFO: renamed from: com.aspose.slides.internal.jd.tt */
/* JADX INFO: loaded from: classes.dex */
public class C5380tt extends AbstractC3895ck {
    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: k4 */
    public AbstractC5788h4 mo15597k4(InterfaceC5808uz interfaceC5808uz, C6344m9 c6344m9, String str, C11539rv c11539rv, AbstractC5788h4 abstractC5788h4, int i) {
        if (abstractC5788h4 == null) {
            return super.mo15597k4(interfaceC5808uz, c6344m9, str, c11539rv, abstractC5788h4, i);
        }
        AbstractC11535k4 abstractC11535k4 = (AbstractC11535k4) abstractC5788h4;
        float fMo23699k4 = abstractC11535k4.mo23699k4((short) 1);
        return (fMo23699k4 < 0.0f || fMo23699k4 > 100.0f) ? C5813x1.k4.f16057h4 : abstractC11535k4;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: kk */
    public boolean mo15584kk() {
        return true;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: to */
    public AbstractC5788h4 mo15585to() {
        return C5813x1.k4.f16057h4;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: x1 */
    public int mo15586x1() {
        return 213;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3895ck, com.aspose.slides.internal.p126fa.AbstractC3894c5, com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: k4 */
    public AbstractC5788h4 mo15578k4(InterfaceC9933up interfaceC9933up, C6344m9 c6344m9) {
        AbstractC5788h4 abstractC5788h4Mo15578k4 = super.mo15578k4(interfaceC9933up, c6344m9);
        if (abstractC5788h4Mo15578k4 != C5813x1.k4.f16146k4) {
            AbstractC5803to abstractC5803to = (AbstractC5803to) abstractC5788h4Mo15578k4;
            if (abstractC5803to.m23700k4() != 1) {
                throw m15605x1(abstractC5803to.toString());
            }
        }
        return abstractC5788h4Mo15578k4;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: k4 */
    public String mo15583k4() {
        return "pitch-range";
    }
}

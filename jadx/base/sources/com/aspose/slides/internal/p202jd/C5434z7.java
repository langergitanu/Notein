package com.aspose.slides.internal.p202jd;

import com.aspose.slides.internal.p126fa.AbstractC3895ck;
import com.aspose.slides.internal.p231kk.AbstractC5788h4;
import com.aspose.slides.internal.p231kk.C5813x1;
import com.aspose.slides.internal.p231kk.InterfaceC5808uz;
import com.aspose.slides.internal.p270m9.C6344m9;
import com.aspose.slides.internal.p368qq.C9919h4;
import com.aspose.slides.internal.p368qq.InterfaceC9933up;
import com.aspose.slides.internal.p447up.C11531dy;
import com.aspose.slides.internal.p447up.C11539rv;

/* JADX INFO: renamed from: com.aspose.slides.internal.jd.z7 */
/* JADX INFO: loaded from: classes.dex */
public class C5434z7 extends AbstractC3895ck {
    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: k4 */
    public AbstractC5788h4 mo15597k4(InterfaceC5808uz interfaceC5808uz, C6344m9 c6344m9, String str, C11539rv c11539rv, AbstractC5788h4 abstractC5788h4, int i) {
        C11531dy c11531dy = (C11531dy) super.mo15597k4(interfaceC5808uz, c6344m9, str, c11539rv, abstractC5788h4, i);
        float fMo23699k4 = c11531dy.mo23699k4(c11531dy.m23700k4());
        return fMo23699k4 < 0.0f ? C5813x1.k4.f16507x1 : fMo23699k4 > 1.0f ? C5813x1.k4.f16160kk : c11531dy;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: kk */
    public boolean mo15584kk() {
        return false;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: to */
    public AbstractC5788h4 mo15585to() {
        return C5813x1.k4.f16160kk;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: x1 */
    public int mo15586x1() {
        return 185;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3895ck, com.aspose.slides.internal.p126fa.AbstractC3894c5, com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: k4 */
    public AbstractC5788h4 mo15578k4(InterfaceC9933up interfaceC9933up, C6344m9 c6344m9) {
        switch (interfaceC9933up.mo48850k4()) {
            case 12:
                return C5813x1.k4.f16146k4;
            case 13:
                return new C11531dy(interfaceC9933up.mo48834du(), (short) 1);
            case 14:
                return new C11531dy(interfaceC9933up.mo48788h4(), (short) 1);
            default:
                throw C9919h4.m48827k4(interfaceC9933up.mo48850k4());
        }
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: k4 */
    public String mo15583k4() {
        return "opacity";
    }
}

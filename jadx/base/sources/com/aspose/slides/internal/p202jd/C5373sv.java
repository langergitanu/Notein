package com.aspose.slides.internal.p202jd;

import com.aspose.slides.internal.p126fa.AbstractC3894c5;
import com.aspose.slides.internal.p231kk.AbstractC5788h4;
import com.aspose.slides.internal.p231kk.C5796m9;
import com.aspose.slides.internal.p231kk.C5813x1;
import com.aspose.slides.internal.p270m9.C6344m9;
import com.aspose.slides.internal.p368qq.InterfaceC9933up;

/* JADX INFO: renamed from: com.aspose.slides.internal.jd.sv */
/* JADX INFO: loaded from: classes.dex */
public class C5373sv extends AbstractC3894c5 {
    @Override // com.aspose.slides.internal.p126fa.AbstractC3894c5, com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: k4 */
    public AbstractC5788h4 mo15578k4(InterfaceC9933up interfaceC9933up, C6344m9 c6344m9) {
        C5796m9 c5796m9 = new C5796m9();
        while (interfaceC9933up != null) {
            c5796m9.m23683x1(super.mo15578k4(interfaceC9933up, c6344m9));
            interfaceC9933up = interfaceC9933up.mo48851kk();
        }
        return c5796m9;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: kk */
    public boolean mo15584kk() {
        return false;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: to */
    public AbstractC5788h4 mo15585to() {
        return new C5796m9(C5813x1.k4.f16507x1);
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: x1 */
    public int mo15586x1() {
        return 60;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: k4 */
    public String mo15583k4() {
        return "border-top-left-radius";
    }
}

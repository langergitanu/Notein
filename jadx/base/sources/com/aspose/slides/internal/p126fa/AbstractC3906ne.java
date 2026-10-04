package com.aspose.slides.internal.p126fa;

import com.aspose.slides.internal.p231kk.AbstractC5788h4;
import com.aspose.slides.internal.p231kk.C5813x1;
import com.aspose.slides.internal.p270m9.C6344m9;
import com.aspose.slides.internal.p368qq.C9919h4;
import com.aspose.slides.internal.p368qq.InterfaceC9933up;
import com.aspose.slides.internal.p447up.C11543x6;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.fa.ne */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3906ne extends AbstractC3905m9 {
    @Override // com.aspose.slides.internal.p126fa.AbstractC3905m9, com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: k4 */
    public AbstractC5788h4 mo15578k4(InterfaceC9933up interfaceC9933up, C6344m9 c6344m9) {
        short sMo48850k4 = interfaceC9933up.mo48850k4();
        if (sMo48850k4 == 12) {
            return C5813x1.k4.f16146k4;
        }
        if (sMo48850k4 != 24) {
            if (sMo48850k4 == 35) {
                AbstractC5788h4 abstractC5788h4M53498k4 = mo15596du().m53498k4(C14113y2.m67361du(interfaceC9933up.mo48784c5()));
                if (abstractC5788h4M53498k4 != null) {
                    return abstractC5788h4M53498k4;
                }
                throw m15601k4(interfaceC9933up.mo48784c5());
            }
            if (sMo48850k4 != 36) {
                throw C9919h4.m48827k4(interfaceC9933up.mo48850k4());
            }
        }
        return new C11543x6(interfaceC9933up.mo48784c5());
    }
}

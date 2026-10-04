package com.aspose.slides.internal.p126fa;

import com.aspose.slides.internal.p231kk.AbstractC5788h4;
import com.aspose.slides.internal.p231kk.C5813x1;
import com.aspose.slides.internal.p270m9.C6344m9;
import com.aspose.slides.internal.p368qq.InterfaceC9933up;
import com.aspose.slides.internal.p423to.C11068dy;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.fa.m9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3905m9 extends AbstractC3909u4 {
    /* JADX INFO: renamed from: du */
    public abstract C11068dy<AbstractC5788h4> mo15596du();

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: k4 */
    public AbstractC5788h4 mo15578k4(InterfaceC9933up interfaceC9933up, C6344m9 c6344m9) {
        short sMo48850k4 = interfaceC9933up.mo48850k4();
        if (sMo48850k4 == 12) {
            return C5813x1.k4.f16146k4;
        }
        if (sMo48850k4 != 35) {
            throw m15602k4(interfaceC9933up.mo48850k4());
        }
        String strM67361du = C14113y2.m67361du(interfaceC9933up.mo48784c5());
        AbstractC5788h4 abstractC5788h4M53498k4 = mo15596du().m53498k4(strM67361du);
        if (abstractC5788h4M53498k4 != null) {
            return abstractC5788h4M53498k4;
        }
        if ("initial".equals(strM67361du)) {
            return C5813x1.k4.f16040gf;
        }
        throw m15601k4(interfaceC9933up.mo48784c5());
    }
}

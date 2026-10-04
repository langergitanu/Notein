package com.aspose.slides.internal.p126fa;

import com.aspose.slides.internal.p231kk.AbstractC5788h4;
import com.aspose.slides.internal.p231kk.C5813x1;
import com.aspose.slides.internal.p270m9.C6344m9;
import com.aspose.slides.internal.p368qq.InterfaceC9933up;
import com.aspose.slides.internal.p423to.C11068dy;

/* JADX INFO: renamed from: com.aspose.slides.internal.fa.x1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3911x1 extends AbstractC3902k4 {
    /* JADX INFO: renamed from: du */
    public abstract C11068dy<AbstractC5788h4> mo15607du();

    @Override // com.aspose.slides.internal.p126fa.AbstractC3902k4, com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: k4 */
    public AbstractC5788h4 mo15578k4(InterfaceC9933up interfaceC9933up, C6344m9 c6344m9) {
        short sMo48850k4 = interfaceC9933up.mo48850k4();
        if (sMo48850k4 == 12) {
            return C5813x1.k4.f16146k4;
        }
        if (sMo48850k4 != 35) {
            return super.mo15578k4(interfaceC9933up, c6344m9);
        }
        AbstractC5788h4 abstractC5788h4M53498k4 = mo15607du().m53498k4(interfaceC9933up.mo48784c5());
        if (abstractC5788h4M53498k4 != null) {
            return abstractC5788h4M53498k4;
        }
        throw m15601k4(interfaceC9933up.mo48784c5());
    }
}

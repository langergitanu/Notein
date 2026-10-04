package com.aspose.slides.internal.p126fa;

import com.aspose.slides.internal.p231kk.AbstractC5788h4;
import com.aspose.slides.internal.p270m9.C6344m9;
import com.aspose.slides.internal.p368qq.C9919h4;
import com.aspose.slides.internal.p368qq.InterfaceC9933up;
import com.aspose.slides.internal.p447up.C11531dy;

/* JADX INFO: renamed from: com.aspose.slides.internal.fa.du */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3896du extends AbstractC3909u4 {
    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: k4 */
    public AbstractC5788h4 mo15578k4(InterfaceC9933up interfaceC9933up, C6344m9 c6344m9) {
        short sMo48850k4 = interfaceC9933up.mo48850k4();
        if (sMo48850k4 == 33) {
            return new C11531dy(interfaceC9933up.mo48788h4(), (short) 16);
        }
        if (sMo48850k4 == 34) {
            return new C11531dy(interfaceC9933up.mo48788h4(), (short) 17);
        }
        throw C9919h4.m48827k4(interfaceC9933up.mo48850k4());
    }
}

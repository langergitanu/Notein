package com.aspose.slides.internal.p126fa;

import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.p231kk.AbstractC5788h4;
import com.aspose.slides.internal.p270m9.C6344m9;
import com.aspose.slides.internal.p368qq.AbstractC9922k4;
import com.aspose.slides.internal.p368qq.InterfaceC9933up;
import com.aspose.slides.internal.p368qq.InterfaceC9938x6;

/* JADX INFO: renamed from: com.aspose.slides.internal.fa.yj */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3913yj extends AbstractC3909u4 {
    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: k4 */
    public AbstractC5788h4 mo15578k4(InterfaceC9933up interfaceC9933up, C6344m9 c6344m9) {
        throw new NotSupportedException("See individual properties.");
    }

    /* JADX INFO: renamed from: k4 */
    public abstract void mo15609k4(C6344m9 c6344m9, InterfaceC9938x6 interfaceC9938x6, InterfaceC9933up interfaceC9933up, boolean z);

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: to */
    public AbstractC5788h4 mo15585to() {
        throw new NotSupportedException("See individual properties.");
    }

    /* JADX INFO: renamed from: k4 */
    public final void m15610k4(InterfaceC9938x6 interfaceC9938x6, String str, IGenericList<InterfaceC9933up> iGenericList, boolean z) {
        if (iGenericList.size() != 0) {
            interfaceC9938x6.mo48819k4(str, AbstractC9922k4.m48836k4(iGenericList).mo48853x1(), z);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m15611k4(InterfaceC9938x6 interfaceC9938x6, String str, InterfaceC9933up interfaceC9933up, boolean z) {
        interfaceC9938x6.mo48819k4(str, interfaceC9933up, z);
    }
}

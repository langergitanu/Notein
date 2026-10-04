package com.aspose.slides.internal.p202jd;

import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.internal.p126fa.AbstractC3913yj;
import com.aspose.slides.internal.p270m9.C6344m9;
import com.aspose.slides.internal.p368qq.AbstractC9922k4;
import com.aspose.slides.internal.p368qq.InterfaceC9933up;
import com.aspose.slides.internal.p368qq.InterfaceC9938x6;

/* JADX INFO: renamed from: com.aspose.slides.internal.jd.r9 */
/* JADX INFO: loaded from: classes.dex */
public class C5360r9 extends AbstractC3913yj {
    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: k4 */
    public String mo15583k4() {
        return "rest";
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: kk */
    public boolean mo15584kk() {
        return false;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: x1 */
    public int mo15586x1() {
        return 218;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3913yj
    /* JADX INFO: renamed from: k4 */
    public void mo15609k4(C6344m9 c6344m9, InterfaceC9938x6 interfaceC9938x6, InterfaceC9933up interfaceC9933up, boolean z) {
        if (interfaceC9933up.mo48851kk() == null) {
            m15611k4(interfaceC9938x6, "rest-before", interfaceC9933up, z);
            m15611k4(interfaceC9938x6, "rest-after", interfaceC9933up, z);
        } else {
            IGenericList<InterfaceC9933up> iGenericListM48835k4 = AbstractC9922k4.m48835k4(interfaceC9933up);
            m15611k4(interfaceC9938x6, "rest-before", iGenericListM48835k4.get_Item(0), z);
            m15611k4(interfaceC9938x6, "rest-after", iGenericListM48835k4.get_Item(1), z);
        }
    }
}

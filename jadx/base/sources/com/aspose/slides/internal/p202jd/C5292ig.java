package com.aspose.slides.internal.p202jd;

import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.internal.p126fa.AbstractC3913yj;
import com.aspose.slides.internal.p270m9.C6344m9;
import com.aspose.slides.internal.p368qq.AbstractC9922k4;
import com.aspose.slides.internal.p368qq.C9919h4;
import com.aspose.slides.internal.p368qq.InterfaceC9933up;
import com.aspose.slides.internal.p368qq.InterfaceC9938x6;

/* JADX INFO: renamed from: com.aspose.slides.internal.jd.ig */
/* JADX INFO: loaded from: classes.dex */
public class C5292ig extends AbstractC3913yj {
    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: k4 */
    public String mo15583k4() {
        return "cue";
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: kk */
    public boolean mo15584kk() {
        return false;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: x1 */
    public int mo15586x1() {
        return 87;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3913yj
    /* JADX INFO: renamed from: k4 */
    public void mo15609k4(C6344m9 c6344m9, InterfaceC9938x6 interfaceC9938x6, InterfaceC9933up interfaceC9933up, boolean z) {
        IGenericList<InterfaceC9933up> iGenericListM48835k4 = AbstractC9922k4.m48835k4(interfaceC9933up);
        if (iGenericListM48835k4.size() > 2) {
            throw C9919h4.m48829kk(iGenericListM48835k4.get_Item(2).toString());
        }
        if (iGenericListM48835k4.size() == 1) {
            iGenericListM48835k4.addItem(iGenericListM48835k4.get_Item(0));
        }
        interfaceC9938x6.mo48819k4("cue-before", iGenericListM48835k4.get_Item(0), z);
        interfaceC9938x6.mo48819k4("cue-after", iGenericListM48835k4.get_Item(1), z);
    }
}

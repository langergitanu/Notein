package com.aspose.slides.internal.p202jd;

import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.internal.p126fa.AbstractC3913yj;
import com.aspose.slides.internal.p231kk.AbstractC5788h4;
import com.aspose.slides.internal.p231kk.C5813x1;
import com.aspose.slides.internal.p270m9.C6344m9;
import com.aspose.slides.internal.p368qq.AbstractC9922k4;
import com.aspose.slides.internal.p368qq.InterfaceC9933up;
import com.aspose.slides.internal.p368qq.InterfaceC9938x6;

/* JADX INFO: renamed from: com.aspose.slides.internal.jd.bm */
/* JADX INFO: loaded from: classes.dex */
public class C5232bm extends AbstractC3913yj {
    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: k4 */
    public String mo15583k4() {
        return "pause";
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: kk */
    public boolean mo15584kk() {
        return false;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3913yj, com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: to */
    public AbstractC5788h4 mo15585to() {
        return C5813x1.k4.f16507x1;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: x1 */
    public int mo15586x1() {
        return 207;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3913yj
    /* JADX INFO: renamed from: k4 */
    public void mo15609k4(C6344m9 c6344m9, InterfaceC9938x6 interfaceC9938x6, InterfaceC9933up interfaceC9933up, boolean z) {
        IGenericList<InterfaceC9933up> iGenericListM48835k4 = AbstractC9922k4.m48835k4(interfaceC9933up);
        if (iGenericListM48835k4.size() > 2) {
            throw m15600k4(iGenericListM48835k4.get_Item(2));
        }
        if (iGenericListM48835k4.size() == 1) {
            iGenericListM48835k4.addItem(iGenericListM48835k4.get_Item(0));
        }
        m15611k4(interfaceC9938x6, "pause-before", iGenericListM48835k4.get_Item(0), z);
        m15611k4(interfaceC9938x6, "pause-after", iGenericListM48835k4.get_Item(1), z);
    }
}

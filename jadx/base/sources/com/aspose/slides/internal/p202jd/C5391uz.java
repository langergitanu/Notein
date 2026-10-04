package com.aspose.slides.internal.p202jd;

import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.internal.p126fa.AbstractC3913yj;
import com.aspose.slides.internal.p270m9.C6344m9;
import com.aspose.slides.internal.p368qq.AbstractC9922k4;
import com.aspose.slides.internal.p368qq.InterfaceC9933up;
import com.aspose.slides.internal.p368qq.InterfaceC9938x6;

/* JADX INFO: renamed from: com.aspose.slides.internal.jd.uz */
/* JADX INFO: loaded from: classes.dex */
public class C5391uz extends AbstractC3913yj {
    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: k4 */
    public String mo15583k4() {
        return "border-color";
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: kk */
    public boolean mo15584kk() {
        return false;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: x1 */
    public int mo15586x1() {
        return 40;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0017, code lost:
    
        if (r7 != 3) goto L13;
     */
    @Override // com.aspose.slides.internal.p126fa.AbstractC3913yj
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo15609k4(C6344m9 c6344m9, InterfaceC9938x6 interfaceC9938x6, InterfaceC9933up interfaceC9933up, boolean z) {
        InterfaceC9933up interfaceC9933up2;
        IGenericList<InterfaceC9933up> iGenericListM48835k4 = AbstractC9922k4.m48835k4(interfaceC9933up);
        if (iGenericListM48835k4.size() > 4) {
            throw m15602k4(iGenericListM48835k4.get_Item(4).mo48850k4());
        }
        int size = iGenericListM48835k4.size();
        if (size != 1) {
            if (size == 2) {
                iGenericListM48835k4.addItem(iGenericListM48835k4.get_Item(0));
            }
            interfaceC9933up2 = iGenericListM48835k4.get_Item(1);
        } else {
            iGenericListM48835k4.addItem(iGenericListM48835k4.get_Item(0));
            iGenericListM48835k4.addItem(iGenericListM48835k4.get_Item(0));
            interfaceC9933up2 = iGenericListM48835k4.get_Item(0);
        }
        iGenericListM48835k4.addItem(interfaceC9933up2);
        interfaceC9938x6.mo48819k4("border-top-color", iGenericListM48835k4.get_Item(0), z);
        interfaceC9938x6.mo48819k4("border-right-color", iGenericListM48835k4.get_Item(1), z);
        interfaceC9938x6.mo48819k4("border-bottom-color", iGenericListM48835k4.get_Item(2), z);
        interfaceC9938x6.mo48819k4("border-left-color", iGenericListM48835k4.get_Item(3), z);
    }
}

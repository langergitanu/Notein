package com.aspose.slides.internal.p051bz;

import com.aspose.slides.internal.p057c6.InterfaceC1986to;
import com.aspose.slides.internal.p150gi.AbstractC4282kp;

/* JADX INFO: renamed from: com.aspose.slides.internal.bz.k4 */
/* JADX INFO: loaded from: classes3.dex */
public class C1915k4 extends AbstractC1914jd {
    @Override // com.aspose.slides.internal.p051bz.InterfaceC1911fa
    /* JADX INFO: renamed from: k4 */
    public int mo9856k4() {
        return 1;
    }

    @Override // com.aspose.slides.internal.p051bz.InterfaceC1911fa
    /* JADX INFO: renamed from: k4 */
    public AbstractC4282kp mo9857k4(AbstractC4282kp[] abstractC4282kpArr, C1904ar c1904ar) {
        InterfaceC1986to interfaceC1986toMo9878h4 = abstractC4282kpArr[0].mo9878h4();
        if (interfaceC1986toMo9878h4 != null) {
            return (AbstractC4282kp) C1924u4.m9894k4(interfaceC1986toMo9878h4);
        }
        throw new C1921qq("Non numeric operand to abs function");
    }
}

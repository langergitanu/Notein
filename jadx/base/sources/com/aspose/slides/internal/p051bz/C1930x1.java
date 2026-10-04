package com.aspose.slides.internal.p051bz;

import com.aspose.slides.internal.p057c6.InterfaceC1986to;
import com.aspose.slides.internal.p097e0.AbstractC3533um;
import com.aspose.slides.internal.p150gi.AbstractC4282kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p409sv.C10790uz;

/* JADX INFO: renamed from: com.aspose.slides.internal.bz.x1 */
/* JADX INFO: loaded from: classes3.dex */
public class C1930x1 extends AbstractC1914jd {
    @Override // com.aspose.slides.internal.p051bz.InterfaceC1911fa
    /* JADX INFO: renamed from: k4 */
    public int mo9856k4() {
        return 0;
    }

    @Override // com.aspose.slides.internal.p051bz.InterfaceC1911fa
    /* JADX INFO: renamed from: k4 */
    public AbstractC4282kp mo9857k4(AbstractC4282kp[] abstractC4282kpArr, C1904ar c1904ar) {
        InterfaceC1986to interfaceC1986toMo9878h4 = c1904ar.m9854to().m14385du(195).mo9878h4();
        AbstractC3533um abstractC3533umM9854to = c1904ar.m9854to();
        while (abstractC3533umM9854to != null && !C7019kk.m27469x1(abstractC3533umM9854to.m14393k4(), C10790uz.class)) {
            abstractC3533umM9854to = abstractC3533umM9854to.m14397kk();
        }
        if (abstractC3533umM9854to != null) {
            return (AbstractC4282kp) C1924u4.m9896k4(interfaceC1986toMo9878h4, abstractC3533umM9854to.m14385du(233).mo9878h4());
        }
        throw new C1921qq("body-start() called from outside an fo:list-item");
    }
}

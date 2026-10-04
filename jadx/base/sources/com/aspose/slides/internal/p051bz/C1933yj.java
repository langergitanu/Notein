package com.aspose.slides.internal.p051bz;

import com.aspose.slides.internal.p057c6.C1985m9;
import com.aspose.slides.internal.p057c6.InterfaceC1984kk;
import com.aspose.slides.internal.p097e0.AbstractC3533um;
import com.aspose.slides.internal.p150gi.AbstractC4282kp;
import com.aspose.slides.internal.p150gi.C4292ss;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p409sv.C10790uz;

/* JADX INFO: renamed from: com.aspose.slides.internal.bz.yj */
/* JADX INFO: loaded from: classes3.dex */
public class C1933yj extends AbstractC1914jd {
    @Override // com.aspose.slides.internal.p051bz.InterfaceC1911fa
    /* JADX INFO: renamed from: k4 */
    public int mo9856k4() {
        return 0;
    }

    @Override // com.aspose.slides.internal.p051bz.InterfaceC1911fa
    /* JADX INFO: renamed from: k4 */
    public AbstractC4282kp mo9857k4(AbstractC4282kp[] abstractC4282kpArr, C1904ar c1904ar) {
        InterfaceC1984kk interfaceC1984kkMo9877dy = c1904ar.m9854to().m14385du(195).mo9877dy();
        InterfaceC1984kk interfaceC1984kkMo9877dy2 = c1904ar.m9854to().m14390h4(196).mo9877dy();
        AbstractC3533um abstractC3533umM9854to = c1904ar.m9854to();
        while (abstractC3533umM9854to != null && !C7019kk.m27469x1(abstractC3533umM9854to.m14393k4(), C10790uz.class)) {
            abstractC3533umM9854to = abstractC3533umM9854to.m14397kk();
        }
        if (abstractC3533umM9854to == null) {
            throw new C1921qq("label-end() called from outside an fo:list-item");
        }
        return (AbstractC4282kp) C1924u4.m9905x1(new C4292ss(1.0d, new C1985m9(c1904ar.m9854to(), 4)), C1924u4.m9905x1(C1924u4.m9896k4(interfaceC1984kkMo9877dy, abstractC3533umM9854to.m14385du(233).mo9877dy()), interfaceC1984kkMo9877dy2));
    }
}

package com.aspose.slides.internal.p051bz;

import com.aspose.slides.internal.p097e0.C3521jd;
import com.aspose.slides.internal.p150gi.AbstractC4282kp;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.bz.dy */
/* JADX INFO: loaded from: classes3.dex */
public class C1910dy extends AbstractC1914jd {
    @Override // com.aspose.slides.internal.p051bz.InterfaceC1911fa
    /* JADX INFO: renamed from: k4 */
    public int mo9856k4() {
        return 1;
    }

    @Override // com.aspose.slides.internal.p051bz.AbstractC1914jd, com.aspose.slides.internal.p051bz.InterfaceC1911fa
    /* JADX INFO: renamed from: kk */
    public boolean mo9870kk() {
        return true;
    }

    @Override // com.aspose.slides.internal.p051bz.InterfaceC1911fa
    /* JADX INFO: renamed from: k4 */
    public AbstractC4282kp mo9857k4(AbstractC4282kp[] abstractC4282kpArr, C1904ar c1904ar) {
        String strMo9926j_ = abstractC4282kpArr[0].mo9926j_();
        if (strMo9926j_ == null) {
            throw new C1921qq("Incorrect parameter to from-parent function");
        }
        int iM14273k4 = C3521jd.m14273k4(strMo9926j_);
        if (iM14273k4 >= 0) {
            return c1904ar.m9854to().m14400m9(iM14273k4);
        }
        throw new C1921qq(C14113y2.m67408k4("Unknown property name used with inherited-property-value function: ", strMo9926j_));
    }
}

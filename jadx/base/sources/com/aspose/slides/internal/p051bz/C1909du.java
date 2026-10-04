package com.aspose.slides.internal.p051bz;

import com.aspose.slides.internal.p150gi.AbstractC4282kp;
import com.aspose.slides.internal.p150gi.C4293sv;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.bz.du */
/* JADX INFO: loaded from: classes3.dex */
public class C1909du extends AbstractC1914jd {
    @Override // com.aspose.slides.internal.p051bz.InterfaceC1911fa
    /* JADX INFO: renamed from: k4 */
    public int mo9856k4() {
        return 1;
    }

    @Override // com.aspose.slides.internal.p051bz.InterfaceC1911fa
    /* JADX INFO: renamed from: k4 */
    public AbstractC4282kp mo9857k4(AbstractC4282kp[] abstractC4282kpArr, C1904ar c1904ar) {
        Object objMo9924m9 = abstractC4282kpArr[0].mo9924m9();
        if (objMo9924m9 != null) {
            return C4293sv.m17270k4(C14116yg.m67501x1(((Double) C7019kk.m27464to(objMo9924m9, Double.TYPE)).doubleValue()));
        }
        throw new C1921qq("Non number operand to ceiling function");
    }
}

package com.aspose.slides.internal.p051bz;

import com.aspose.slides.internal.p150gi.AbstractC4282kp;
import com.aspose.slides.internal.p150gi.C4276h4;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p523yd.C12814to;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.bz.to */
/* JADX INFO: loaded from: classes3.dex */
public class C1923to extends AbstractC1914jd {
    @Override // com.aspose.slides.internal.p051bz.InterfaceC1911fa
    /* JADX INFO: renamed from: k4 */
    public int mo9856k4() {
        return 4;
    }

    @Override // com.aspose.slides.internal.p051bz.InterfaceC1911fa
    /* JADX INFO: renamed from: k4 */
    public AbstractC4282kp mo9857k4(AbstractC4282kp[] abstractC4282kpArr, C1904ar c1904ar) {
        C6765kp c6765kp = new C6765kp();
        c6765kp.m26792k4(C14113y2.m67407k4("cmyk(", abstractC4282kpArr[0], ",", abstractC4282kpArr[1], ",", abstractC4282kpArr[2], ",", abstractC4282kpArr[3], ")"));
        C12814to c12814toM14111q_ = null;
        if (c1904ar != null && c1904ar.m9852kk() != null) {
            c12814toM14111q_ = c1904ar.m9852kk().m14111q_();
        }
        return C4276h4.m17236k4(c12814toM14111q_, c6765kp.toString());
    }
}

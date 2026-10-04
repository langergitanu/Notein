package com.aspose.slides.internal.p051bz;

import com.aspose.slides.internal.p057c6.InterfaceC1979du;
import com.aspose.slides.internal.p057c6.InterfaceC1981h4;
import com.aspose.slides.internal.p150gi.AbstractC4282kp;
import com.aspose.slides.internal.p150gi.C4276h4;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p523yd.C12814to;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.bz.kk */
/* JADX INFO: loaded from: classes3.dex */
public class C1916kk extends AbstractC1914jd {

    /* JADX INFO: renamed from: com.aspose.slides.internal.bz.kk$k4 */
    public static class k4 implements InterfaceC1979du {
        private k4() {
        }

        @Override // com.aspose.slides.internal.p057c6.InterfaceC1979du
        /* JADX INFO: renamed from: k4 */
        public final int mo9872k4() {
            return 0;
        }

        @Override // com.aspose.slides.internal.p057c6.InterfaceC1979du
        /* JADX INFO: renamed from: x1 */
        public final double mo9874x1() {
            return 1.0d;
        }

        @Override // com.aspose.slides.internal.p057c6.InterfaceC1979du
        /* JADX INFO: renamed from: k4 */
        public final int mo9873k4(InterfaceC1981h4 interfaceC1981h4) {
            return 0;
        }
    }

    @Override // com.aspose.slides.internal.p051bz.InterfaceC1911fa
    /* JADX INFO: renamed from: k4 */
    public int mo9856k4() {
        return 6;
    }

    @Override // com.aspose.slides.internal.p051bz.AbstractC1914jd, com.aspose.slides.internal.p051bz.InterfaceC1911fa
    /* JADX INFO: renamed from: x1 */
    public InterfaceC1979du mo9871x1() {
        return new k4();
    }

    @Override // com.aspose.slides.internal.p051bz.InterfaceC1911fa
    /* JADX INFO: renamed from: k4 */
    public AbstractC4282kp mo9857k4(AbstractC4282kp[] abstractC4282kpArr, C1904ar c1904ar) {
        Object objMo9924m9 = abstractC4282kpArr[0].mo9924m9();
        Class cls = Float.TYPE;
        float fFloatValue = ((Float) C7019kk.m27464to(objMo9924m9, cls)).floatValue();
        float fFloatValue2 = ((Float) C7019kk.m27464to(abstractC4282kpArr[1].mo9924m9(), cls)).floatValue();
        float fFloatValue3 = ((Float) C7019kk.m27464to(abstractC4282kpArr[2].mo9924m9(), cls)).floatValue();
        if (fFloatValue < 0.0f || fFloatValue > 255.0f || fFloatValue2 < 0.0f || fFloatValue2 > 255.0f || fFloatValue3 < 0.0f || fFloatValue3 > 255.0f) {
            throw new C1921qq(C14113y2.m67408k4("sRGB color values out of range. ", "Arguments to cie-lab-color() must be [0..255] or [0%..100%]"));
        }
        float fFloatValue4 = ((Float) C7019kk.m27464to(abstractC4282kpArr[3].mo9924m9(), cls)).floatValue();
        float fFloatValue5 = ((Float) C7019kk.m27464to(abstractC4282kpArr[4].mo9924m9(), cls)).floatValue();
        float fFloatValue6 = ((Float) C7019kk.m27464to(abstractC4282kpArr[5].mo9924m9(), cls)).floatValue();
        if (fFloatValue4 < 0.0f || fFloatValue4 > 100.0f) {
            throw new C1921qq("L* value out of range. Valid range: [0..100]");
        }
        if (fFloatValue5 < -127.0f || fFloatValue5 > 127.0f || fFloatValue6 < -127.0f || fFloatValue6 > 127.0f) {
            throw new C1921qq("a* and b* values out of range. Valid range: [-127..+127]");
        }
        C6765kp c6765kp = new C6765kp();
        c6765kp.m26792k4(C14113y2.m67408k4("cie-lab-color(", C14064he.m66704h4(fFloatValue), ",", C14064he.m66704h4(fFloatValue2), ",", C14064he.m66704h4(fFloatValue3), ",", C14064he.m66704h4(fFloatValue4), ",", C14064he.m66704h4(fFloatValue5), ",", C14064he.m66704h4(fFloatValue6), ")"));
        C12814to c12814toM14111q_ = null;
        if (c1904ar != null && c1904ar.m9852kk() != null) {
            c12814toM14111q_ = c1904ar.m9852kk().m14111q_();
        }
        return C4276h4.m17236k4(c12814toM14111q_, c6765kp.toString());
    }
}

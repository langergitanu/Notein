package com.aspose.slides.internal.p051bz;

import com.aspose.slides.Collections.Specialized.OooO00o;
import com.aspose.slides.internal.p057c6.InterfaceC1979du;
import com.aspose.slides.internal.p057c6.InterfaceC1981h4;
import com.aspose.slides.internal.p150gi.AbstractC4282kp;
import com.aspose.slides.internal.p150gi.C4276h4;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p406ss.C10341to;
import com.aspose.slides.internal.p406ss.C10347x1;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.bz.ne */
/* JADX INFO: loaded from: classes3.dex */
public class C1920ne extends AbstractC1914jd {

    /* JADX INFO: renamed from: com.aspose.slides.internal.bz.ne$k4 */
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
            return 255.0d;
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
        return 5;
    }

    @Override // com.aspose.slides.internal.p051bz.AbstractC1914jd, com.aspose.slides.internal.p051bz.InterfaceC1911fa
    /* JADX INFO: renamed from: x1 */
    public InterfaceC1979du mo9871x1() {
        return new k4();
    }

    @Override // com.aspose.slides.internal.p051bz.InterfaceC1911fa
    /* JADX INFO: renamed from: k4 */
    public AbstractC4282kp mo9857k4(AbstractC4282kp[] abstractC4282kpArr, C1904ar c1904ar) {
        String strMo9926j_ = abstractC4282kpArr[3].mo9926j_();
        String strMo9926j_2 = abstractC4282kpArr[4].mo9926j_();
        C10341to c10341toM50406qm = c1904ar.m9852kk() != null ? c1904ar.m9852kk().mo14126yj().m50406qm() : null;
        C10347x1 c10347x1M50391du = c10341toM50406qm != null ? c10341toM50406qm.m50391du(strMo9926j_) : null;
        if (c10347x1M50391du == null) {
            C1921qq c1921qq = new C1921qq(C14113y2.m67408k4("The ", strMo9926j_, " color profile was not declared"));
            c1921qq.m9887k4(c1904ar);
            throw c1921qq;
        }
        Object objMo9924m9 = abstractC4282kpArr[0].mo9924m9();
        Class cls = Float.TYPE;
        float fFloatValue = ((Float) C7019kk.m27464to(objMo9924m9, cls)).floatValue();
        float fFloatValue2 = ((Float) C7019kk.m27464to(abstractC4282kpArr[1].mo9924m9(), cls)).floatValue();
        float fFloatValue3 = ((Float) C7019kk.m27464to(abstractC4282kpArr[2].mo9924m9(), cls)).floatValue();
        if (fFloatValue < 0.0f || fFloatValue > 255.0f || fFloatValue2 < 0.0f || fFloatValue2 > 255.0f || fFloatValue3 < 0.0f || fFloatValue3 > 255.0f) {
            throw new C1921qq(C14113y2.m67408k4("sRGB color values out of range. ", "Arguments to rgb-named-color() must be [0..255] or [0%..100%]"));
        }
        C6765kp c6765kpOooO00o = OooO00o.OooO00o("fop-rgb-named-color(");
        c6765kpOooO00o.m26785k4(fFloatValue / 255.0f);
        c6765kpOooO00o.m26780k4(',').m26785k4(fFloatValue2 / 255.0f);
        c6765kpOooO00o.m26780k4(',').m26785k4(fFloatValue3 / 255.0f);
        c6765kpOooO00o.m26780k4(',').m26792k4(strMo9926j_);
        c6765kpOooO00o.m26780k4(',').m26792k4(c10347x1M50391du.m50410e0());
        c6765kpOooO00o.m26792k4(", '").m26792k4(strMo9926j_2).m26780k4('\'');
        c6765kpOooO00o.m26792k4(")");
        return C4276h4.m17236k4(c1904ar.m9853m9(), c6765kpOooO00o.toString());
    }
}

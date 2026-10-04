package com.aspose.slides;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p332p7.C9192xf;
import com.aspose.slides.internal.p464vq.C11791os;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.x2 */
/* JADX INFO: loaded from: classes3.dex */
class C14762x2 extends ywb {
    public C14762x2(C11791os c11791os, gnb gnbVar) {
        super(c11791os, gnbVar);
    }

    /* JADX INFO: renamed from: k4 */
    public final IChart m72998k4(IShapeCollection iShapeCollection, IChart iChart, com.aspose.slides.internal.p332p7.pij pijVar, bjs bjsVar) {
        C14144mu c14144mu = new C14144mu(bjsVar);
        mo3469k4(new String[0]);
        IChart iChart2 = null;
        while (m55443jd().mo65026h4()) {
            if (m55443jd().mo65028jd() == 1 && "chartSpace".equals(m55443jd().mo65023fa())) {
                C9192xf c9192xf = new C9192xf(m55443jd());
                IChart iChartM72997k4 = m72997k4((ShapeCollection) iShapeCollection, iChart, c9192xf);
                if (iChartM72997k4 != null) {
                    C14908zp.m74714k4(iChartM72997k4, pijVar, c9192xf, c14144mu);
                }
                iChart2 = iChartM72997k4;
            }
        }
        mo55330fa();
        return iChart2;
    }

    public C14762x2(C11791os c11791os, u8s u8sVar) {
        super(c11791os, u8sVar);
    }

    /* JADX INFO: renamed from: k4 */
    private IChart m72997k4(ShapeCollection shapeCollection, IChart iChart, C9192xf c9192xf) {
        if ((shapeCollection != null && iChart != null) || (shapeCollection == null && iChart == null)) {
            throw new Exception(C14113y2.m67408k4("Wrong use of ChartPartParser.ReadPart() - ", "only parameter 'chartOfTemplateTo' or only paramenter 'shapes' must be not null."));
        }
        if (iChart != null) {
            return iChart;
        }
        if (c9192xf.m44321kk().m31298to().m32993x1().m34686to().length == 0) {
            return null;
        }
        return shapeCollection.m2621k4(C14908zp.m74713k4(c9192xf.m44321kk().m31298to(), c9192xf.m44321kk().m31298to().m32993x1().m34686to()[0]));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m72999k4(IChart iChart, com.aspose.slides.internal.p332p7.pij pijVar, sdp sdpVar) {
        C14786xh c14786xh = new C14786xh(sdpVar);
        mo55332up();
        C9192xf c9192xf = new C9192xf();
        C14908zp.m74717k4(iChart, c9192xf, pijVar, c14786xh);
        c9192xf.mo6846k4(null, m55442ck(), "chartSpace");
        mo55333yj();
    }
}

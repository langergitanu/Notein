package com.aspose.slides;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p332p7.C8207lr;
import com.aspose.slides.internal.p464vq.C11791os;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.gr */
/* JADX INFO: loaded from: classes3.dex */
class C1159gr extends ywb {
    public C1159gr(C11791os c11791os, gnb gnbVar) {
        super(c11791os, gnbVar);
    }

    /* JADX INFO: renamed from: k4 */
    public IChart m6893k4(IShapeCollection iShapeCollection, IChart iChart, com.aspose.slides.internal.p332p7.pij pijVar, bjs bjsVar) {
        C14144mu c14144mu = new C14144mu(bjsVar);
        mo3469k4(new String[0]);
        IChart iChart2 = null;
        while (m55443jd().mo65026h4()) {
            if (m55443jd().mo65028jd() == 1 && m55443jd().mo65023fa().equals("chartSpace")) {
                C8207lr c8207lr = new C8207lr(m55443jd());
                c14144mu.m67733k4(c8207lr.m36396x6().m42947ne());
                IChart iChartM6892k4 = m6892k4((ShapeCollection) iShapeCollection, iChart, c8207lr);
                C13741ko.m64064k4(iChartM6892k4, pijVar, c8207lr, c14144mu);
                iChart2 = iChartM6892k4;
            }
        }
        mo55330fa();
        return iChart2;
    }

    public C1159gr(C11791os c11791os, u8s u8sVar) {
        super(c11791os, u8sVar);
    }

    /* JADX INFO: renamed from: k4 */
    private IChart m6892k4(ShapeCollection shapeCollection, IChart iChart, C8207lr c8207lr) {
        if ((shapeCollection != null && iChart != null) || (shapeCollection == null && iChart == null)) {
            throw new Exception(C14113y2.m67408k4("Wrong use of ChartPartParser.ReadPart() - ", "only parameter 'chartOfTemplateTo' or only paramenter 'shapes' must be not null."));
        }
        if (iChart != null) {
            return iChart;
        }
        int[] iArr = {0};
        return shapeCollection.m2622k4(C13741ko.m64055k4(c8207lr.m36396x6().m42947ne(), 0, iArr), iArr[0]);
    }

    /* JADX INFO: renamed from: k4 */
    public void m6894k4(IChart iChart, com.aspose.slides.internal.p332p7.pij pijVar, sdp sdpVar) {
        C14786xh c14786xh = new C14786xh(sdpVar);
        mo55332up();
        C8207lr c8207lr = new C8207lr();
        C13741ko.m64060k4(iChart, c8207lr, pijVar, c14786xh);
        c8207lr.mo6846k4(null, m55442ck(), "chartSpace");
        mo55333yj();
    }
}

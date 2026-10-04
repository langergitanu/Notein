package com.aspose.slides;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.exceptions.NullReferenceException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC8619qq;
import com.aspose.slides.internal.p332p7.AbstractC9120wl;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.internal.p332p7.C7402cf;
import com.aspose.slides.internal.p332p7.C7935ij;
import com.aspose.slides.internal.p332p7.C8262mg;
import com.aspose.slides.internal.p332p7.C9069vu;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.InterfaceC14073kp;

/* JADX INFO: renamed from: com.aspose.slides.uq */
/* JADX INFO: loaded from: classes3.dex */
class C14645uq extends AbstractC13703jv {
    /* JADX INFO: renamed from: k4 */
    private void m71752k4(IChartDataPointCollection iChartDataPointCollection, C7402cf c7402cf, int i) {
        C9069vu c9069vuM29590x1;
        String strM2835k4;
        c7402cf.m29587k4("General");
        int i2 = 0;
        for (int i3 = 0; i3 < iChartDataPointCollection.size(); i3++) {
            ISingleCellChartValue iSingleCellChartValueM63555k4 = AbstractC13703jv.m63555k4(iChartDataPointCollection.get_Item(i3), i);
            if (C7019kk.m27469x1(iSingleCellChartValueM63555k4, DoubleChartValue.class)) {
                DoubleChartValue doubleChartValue = (DoubleChartValue) iSingleCellChartValueM63555k4;
                if (!DoubleChartValue.m1354k4(doubleChartValue, false, false)) {
                    c9069vuM29590x1 = c7402cf.m29590x1();
                    c9069vuM29590x1.m43318k4(4294967295L & ((long) i3));
                    strM2835k4 = DoubleChartValue.m1352k4((IDoubleChartValue) doubleChartValue);
                    c9069vuM29590x1.m43322x1(strM2835k4);
                    i2++;
                }
            } else {
                StringOrDoubleChartValue stringOrDoubleChartValue = (StringOrDoubleChartValue) iSingleCellChartValueM63555k4;
                if (!StringOrDoubleChartValue.m2837k4((ISingleCellChartValue) stringOrDoubleChartValue, false)) {
                    c9069vuM29590x1 = c7402cf.m29590x1();
                    c9069vuM29590x1.m43318k4(4294967295L & ((long) i3));
                    strM2835k4 = StringOrDoubleChartValue.m2835k4((IStringOrDoubleChartValue) stringOrDoubleChartValue);
                    c9069vuM29590x1.m43322x1(strM2835k4);
                    i2++;
                }
            }
        }
        c7402cf.m29586k4().m38333k4(((long) i2) & 4294967295L);
    }

    @Override // com.aspose.slides.AbstractC13703jv
    /* JADX INFO: renamed from: k4 */
    public void mo6078k4(IChartSeries iChartSeries, AbstractC8619qq abstractC8619qq, int i) {
        IChartDataPointCollection dataPoints;
        C7394ca c7394caM36930k4;
        if (C7019kk.m27469x1(abstractC8619qq, C7935ij.class)) {
            dataPoints = iChartSeries.getDataPoints();
            c7394caM36930k4 = ((C7935ij) abstractC8619qq).m34168k4("numLit");
        } else {
            if (!C7019kk.m27469x1(abstractC8619qq, C8262mg.class)) {
                throw new Exception();
            }
            dataPoints = iChartSeries.getDataPoints();
            c7394caM36930k4 = ((C8262mg) abstractC8619qq).m36930k4("numLit");
        }
        m71752k4(dataPoints, (C7402cf) c7394caM36930k4.m29542x1(), i);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0088  */
    @Override // com.aspose.slides.AbstractC13703jv
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo6079k4(IChartSeries iChartSeries, AbstractC8619qq abstractC8619qq, int i, gnb gnbVar, boolean z) {
        C7402cf c7402cf;
        C7394ca c7394caM36929du;
        m63557x1(iChartSeries, abstractC8619qq, i);
        if (C7019kk.m27469x1(abstractC8619qq, C7935ij.class)) {
            c7394caM36929du = ((C7935ij) abstractC8619qq).m34166du();
        } else {
            if (!C7019kk.m27469x1(abstractC8619qq, C8262mg.class)) {
                c7402cf = null;
                if (c7402cf != null) {
                    throw new NullReferenceException("DataElement couldn't be empty.");
                }
                for (C9069vu c9069vu : c7402cf.m29584du()) {
                    ISingleCellChartValue iSingleCellChartValueM63555k4 = AbstractC13703jv.m63555k4(iChartSeries.getDataPoints().getOrCreateDataPointByIdx(c9069vu.m43317k4()), i);
                    if (!"#N/A".equals(c9069vu.m43320kk())) {
                        if (C7019kk.m27469x1(iSingleCellChartValueM63555k4, IDoubleChartValue.class)) {
                            ((IDoubleChartValue) iSingleCellChartValueM63555k4).setAsLiteralDouble(C14080ne.m66906fa(c9069vu.m43320kk(), (InterfaceC14073kp) C11697x1.m55250kk()));
                        } else if (C7019kk.m27469x1(iSingleCellChartValueM63555k4, IStringOrDoubleChartValue.class)) {
                            ((IStringOrDoubleChartValue) iSingleCellChartValueM63555k4).setAsLiteralDouble(C14080ne.m66906fa(c9069vu.m43320kk(), (InterfaceC14073kp) C11697x1.m55250kk()));
                        }
                    }
                }
                return;
            }
            c7394caM36929du = ((C8262mg) abstractC8619qq).m36929du();
        }
        c7402cf = (C7402cf) c7394caM36929du.m29542x1();
        if (c7402cf != null) {
        }
    }

    @Override // com.aspose.slides.AbstractC13703jv
    /* JADX INFO: renamed from: k4 */
    public void mo6080k4(IChartSeries iChartSeries, AbstractC9120wl abstractC9120wl) {
        throw new NotImplementedException();
    }
}

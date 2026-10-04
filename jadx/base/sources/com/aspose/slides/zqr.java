package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC8619qq;
import com.aspose.slides.internal.p332p7.AbstractC9120wl;
import com.aspose.slides.internal.p332p7.C7402cf;
import com.aspose.slides.internal.p332p7.C7626f0;
import com.aspose.slides.internal.p332p7.C7935ij;
import com.aspose.slides.internal.p332p7.C8089ki;
import com.aspose.slides.internal.p332p7.C8262mg;
import com.aspose.slides.internal.p332p7.C8583q7;
import com.aspose.slides.internal.p332p7.C9069vu;
import com.aspose.slides.internal.p332p7.C9099w9;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class zqr extends AbstractC13703jv {
    /* JADX INFO: renamed from: k4 */
    private void m74766k4(IChartCellCollection iChartCellCollection, C7626f0 c7626f0) {
        c7626f0.m31514k4(iChartCellCollection.getCellsAddress());
        C8583q7 c8583q7M31513k4 = c7626f0.m31513k4();
        long jM43589k4 = 0;
        for (int i = 0; i < iChartCellCollection.getCount(); i++) {
            if (iChartCellCollection.get_Item(i).getValue() != null) {
                C9099w9 c9099w9M39374x1 = c8583q7M31513k4.m39374x1();
                c9099w9M39374x1.m43590k4(((long) i) & 4294967295L);
                c9099w9M39374x1.m43591k4(C14080ne.m66987ks(iChartCellCollection.get_Item(i).getValue(), C11697x1.m55250kk()));
                if ((((c9099w9M39374x1.m43589k4() & 4294967295L) + 1) & 4294967295L) > (jM43589k4 & 4294967295L)) {
                    jM43589k4 = ((c9099w9M39374x1.m43589k4() & 4294967295L) + 1) & 4294967295L;
                }
            }
        }
        c8583q7M31513k4.m39371k4().m38333k4(jM43589k4);
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m74768x1(IChartSeries iChartSeries, int i) {
        boolean zM63556k4 = true;
        for (int i2 = 0; i2 < iChartSeries.getDataPoints().size(); i2++) {
            ISingleCellChartValue iSingleCellChartValueM63555k4 = AbstractC13703jv.m63555k4(iChartSeries.getDataPoints().get_Item(i2), i);
            if (!DoubleChartValue.m1353k4(iSingleCellChartValueM63555k4) && !StringOrDoubleChartValue.m2836k4(iSingleCellChartValueM63555k4)) {
                zM63556k4 &= AbstractC13703jv.m63556k4(C14080ne.m66987ks(iSingleCellChartValueM63555k4.getAsCell().getValue(), C11697x1.m55250kk()), new double[]{0.0d});
            }
        }
        return zM63556k4;
    }

    /* JADX INFO: renamed from: k4 */
    private void m74767k4(IChartSeries iChartSeries, IChartCellCollection iChartCellCollection, C8089ki c8089ki, int i) {
        String numberFormatOfXValues;
        c8089ki.m35403k4(iChartCellCollection.getCellsAddress());
        C7402cf c7402cfM35401k4 = c8089ki.m35401k4();
        if (iChartSeries.getNumberFormatOfValues() != null) {
            if (i != 0) {
                if (i != 1) {
                    if (i == 3 && !"".equals(C14113y2.m67440x1(iChartSeries.getNumberFormatOfValues()))) {
                        numberFormatOfXValues = iChartSeries.getNumberFormatOfValues();
                        c7402cfM35401k4.m29587k4(numberFormatOfXValues);
                    }
                } else if (!"".equals(C14113y2.m67440x1(iChartSeries.getNumberFormatOfYValues()))) {
                    numberFormatOfXValues = iChartSeries.getNumberFormatOfYValues();
                    c7402cfM35401k4.m29587k4(numberFormatOfXValues);
                }
            } else if (!"".equals(C14113y2.m67440x1(iChartSeries.getNumberFormatOfXValues()))) {
                numberFormatOfXValues = iChartSeries.getNumberFormatOfXValues();
                c7402cfM35401k4.m29587k4(numberFormatOfXValues);
            }
        }
        if (iChartCellCollection.getCount() > 0 && !"".equals(C14113y2.m67440x1(iChartCellCollection.get_Item(0).getCustomNumberFormat()))) {
            c7402cfM35401k4.m29587k4(iChartCellCollection.get_Item(0).getCustomNumberFormat());
        }
        long count = ((long) iChartCellCollection.getCount()) & 4294967295L;
        for (int i2 = 0; i2 < iChartCellCollection.getCount(); i2++) {
            ChartDataCell chartDataCell = (ChartDataCell) iChartCellCollection.get_Item(i2);
            if (chartDataCell.m559c5().m72689ks().f3861k4 != null) {
                C9069vu c9069vuM29590x1 = c7402cfM35401k4.m29590x1();
                c9069vuM29590x1.m43318k4(((long) i2) & 4294967295L);
                if ((((c9069vuM29590x1.m43317k4() & 4294967295L) + 1) & 4294967295L) > (count & 4294967295L)) {
                    count = ((c9069vuM29590x1.m43317k4() & 4294967295L) + 1) & 4294967295L;
                }
                String strM66987ks = C14080ne.m66987ks(chartDataCell.m559c5().m72689ks().f3861k4, C11697x1.m55250kk());
                if (!AbstractC13703jv.m63556k4(strM66987ks, new double[]{0.0d})) {
                    strM66987ks = "0";
                }
                c9069vuM29590x1.m43322x1(strM66987ks);
                if (iChartSeries.getLabels().getDefaultDataLabelFormat().isNumberFormatLinkedToSource() && !chartDataCell.m576to()) {
                    String strM567k4 = chartDataCell.m567k4(false);
                    if (!C14113y2.m67363du(c7402cfM35401k4.m29588kk(), strM567k4)) {
                        c9069vuM29590x1.m43319k4(strM567k4);
                    }
                }
            }
        }
        c7402cfM35401k4.m29586k4().m38333k4(count);
    }

    @Override // com.aspose.slides.AbstractC13703jv
    /* JADX INFO: renamed from: k4 */
    public void mo6078k4(IChartSeries iChartSeries, AbstractC8619qq abstractC8619qq, int i) {
        IChartCellCollection cellCollection = iChartSeries.getChart().getChartData().getChartDataWorkbook().getCellCollection("", true);
        IGenericEnumerator<IChartDataPoint> it = iChartSeries.getDataPoints().iterator();
        while (it.hasNext()) {
            try {
                ISingleCellChartValue iSingleCellChartValueM63555k4 = AbstractC13703jv.m63555k4(it.next(), i);
                if (iSingleCellChartValueM63555k4.getAsCell() != null) {
                    cellCollection.add(iSingleCellChartValueM63555k4.getAsCell());
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (!C7019kk.m27469x1(abstractC8619qq, C7935ij.class)) {
            if (!C7019kk.m27469x1(abstractC8619qq, C8262mg.class)) {
                throw new Exception();
            }
            m74767k4(iChartSeries, cellCollection, (C8089ki) ((C8262mg) abstractC8619qq).m36930k4("numRef").m29542x1(), i);
        } else {
            C7935ij c7935ij = (C7935ij) abstractC8619qq;
            if (m74768x1(iChartSeries, i)) {
                m74767k4(iChartSeries, cellCollection, (C8089ki) c7935ij.m34168k4("numRef").m29542x1(), i);
            } else {
                m74766k4(cellCollection, (C7626f0) c7935ij.m34168k4("strRef").m29542x1());
            }
        }
    }

    @Override // com.aspose.slides.AbstractC13703jv
    /* JADX INFO: renamed from: k4 */
    public void mo6079k4(IChartSeries iChartSeries, AbstractC8619qq abstractC8619qq, int i, gnb gnbVar, boolean z) {
        throw new NotImplementedException();
    }

    @Override // com.aspose.slides.AbstractC13703jv
    /* JADX INFO: renamed from: k4 */
    public void mo6080k4(IChartSeries iChartSeries, AbstractC9120wl abstractC9120wl) {
        if (iChartSeries.getName().getAsCells().getCount() == 0) {
            return;
        }
        C7626f0 c7626f0 = (C7626f0) abstractC9120wl.mo30759dy().m42726k4("strRef").m29542x1();
        c7626f0.m31514k4(iChartSeries.getName().getCellsAddressInWorkbook());
        C8583q7 c8583q7M31513k4 = c7626f0.m31513k4();
        IChartCellCollection asCells = iChartSeries.getName().getAsCells();
        c8583q7M31513k4.m39371k4().m38333k4(((long) asCells.getCount()) & 4294967295L);
        for (int i = 0; i < asCells.getCount(); i++) {
            if (asCells.get_Item(i).getValue() != null) {
                C9099w9 c9099w9M39374x1 = c8583q7M31513k4.m39374x1();
                c9099w9M39374x1.m43590k4(((long) i) & 4294967295L);
                c9099w9M39374x1.m43591k4(C14080ne.m66987ks(asCells.get_Item(i).getValue(), C11697x1.m55250kk()));
            }
        }
    }

    @Override // com.aspose.slides.AbstractC13703jv
    /* JADX INFO: renamed from: k4 */
    public boolean mo6081k4(IChartSeries iChartSeries, int i) {
        IGenericEnumerator<IChartDataPoint> it = iChartSeries.getDataPoints().iterator();
        while (it.hasNext()) {
            try {
                if (AbstractC13703jv.m63555k4(it.next(), i).getAsCell() != null) {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                    return true;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }
}

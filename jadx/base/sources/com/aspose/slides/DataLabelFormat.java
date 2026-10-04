package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class DataLabelFormat extends PVIObject implements IDataLabelFormat {

    /* JADX INFO: renamed from: k4 */
    private IChartSeries f2100k4;

    /* JADX INFO: renamed from: kk */
    private Format f2101kk;

    /* JADX INFO: renamed from: to */
    private ChartTextFormat f2102to;

    /* JADX INFO: renamed from: x1 */
    private DataLabelCollection f2103x1;

    public DataLabelFormat(InterfaceC14397rj interfaceC14397rj) {
        IChartSeries iChartSeriesM1294dy;
        super(interfaceC14397rj);
        if (C7019kk.m27469x1(interfaceC14397rj, DataLabelCollection.class)) {
            iChartSeriesM1294dy = ((DataLabelCollection) interfaceC14397rj).getParentSeries();
        } else {
            if (!C7019kk.m27469x1(interfaceC14397rj, DataLabel.class)) {
                throw new NotImplementedException("Unknown parent type for DataLabelFormat.");
            }
            iChartSeriesM1294dy = ((DataLabel) interfaceC14397rj).m1294dy();
        }
        this.f2100k4 = iChartSeriesM1294dy;
        this.f2103x1 = (DataLabelCollection) C7019kk.m27452k4((Object) interfaceC14397rj, DataLabelCollection.class);
    }

    /* JADX INFO: renamed from: k4 */
    private IPortion m1312k4(ITextFrame iTextFrame) {
        if (iTextFrame.getParagraphs().getCount() == 0) {
            return null;
        }
        IGenericEnumerator<IPortion> it = iTextFrame.getParagraphs().get_Item(0).getPortions().iterator();
        while (it.hasNext()) {
            try {
                IPortion next = it.next();
                if (next.getField() != null && "CELLRANGE".equals(next.getField().getType().getInternalString())) {
                    return next;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        return null;
    }

    @Override // com.aspose.slides.PVIObject
    /* JADX INFO: renamed from: M_ */
    public Object mo331M_() {
        return new C14243om(getParent_Immediate(), this.f2101kk, this.f2102to);
    }

    @Override // com.aspose.slides.PVIObject
    /* JADX INFO: renamed from: N_ */
    public void mo334N_() {
        this.f2101kk = new Format(this);
        this.f2102to = new ChartTextFormat(this);
    }

    /* JADX INFO: renamed from: du */
    public final boolean m1314du() {
        if (m2138ix()) {
            return m1320x1().m68689yj();
        }
        return false;
    }

    @Override // com.aspose.slides.IChartComponent
    public final IChart getChart() {
        return ((IChartComponent) getParent_Immediate()).getChart();
    }

    @Override // com.aspose.slides.IDataLabelFormat
    public final IFormat getFormat() {
        m2146wl();
        return this.f2101kk;
    }

    @Override // com.aspose.slides.IDataLabelFormat
    public final String getNumberFormat() {
        return m2138ix() ? m1320x1().m68686x1() : "";
    }

    @Override // com.aspose.slides.IDataLabelFormat
    public final int getPosition() {
        if (m2138ix()) {
            return m1320x1().m68678kk();
        }
        return -1;
    }

    @Override // com.aspose.slides.IDataLabelFormat
    public final String getSeparator() {
        return m2138ix() ? m1320x1().m68662ck() : "";
    }

    @Override // com.aspose.slides.IDataLabelFormat
    public final boolean getShowBubbleSize() {
        if (m2138ix()) {
            return m1320x1().m68661c5();
        }
        return false;
    }

    @Override // com.aspose.slides.IDataLabelFormat
    public final boolean getShowCategoryName() {
        if (m2138ix()) {
            return m1320x1().m68670h4();
        }
        return false;
    }

    @Override // com.aspose.slides.IDataLabelFormat
    public final boolean getShowLabelAsDataCallout() {
        if (m2138ix()) {
            return m1320x1().m68668fa();
        }
        return false;
    }

    @Override // com.aspose.slides.IDataLabelFormat
    public final boolean getShowLabelValueFromCell() {
        if (m2138ix()) {
            return m1320x1().m68685up();
        }
        return false;
    }

    @Override // com.aspose.slides.IDataLabelFormat
    public final boolean getShowLeaderLines() {
        if (m2138ix()) {
            return m1320x1().m68672jd();
        }
        return false;
    }

    @Override // com.aspose.slides.IDataLabelFormat
    public final boolean getShowLegendKey() {
        if (m2138ix()) {
            return m1320x1().m68684to();
        }
        return false;
    }

    @Override // com.aspose.slides.IDataLabelFormat
    public final boolean getShowPercentage() {
        if (m2138ix()) {
            return m1320x1().m68667dy();
        }
        return false;
    }

    @Override // com.aspose.slides.IDataLabelFormat
    public final boolean getShowSeriesName() {
        if (m2138ix()) {
            return m1320x1().m68682m9();
        }
        return false;
    }

    @Override // com.aspose.slides.IDataLabelFormat
    public final boolean getShowValue() {
        if (m2138ix()) {
            return m1320x1().m68665du();
        }
        return false;
    }

    @Override // com.aspose.slides.IFormattedTextContainer
    public final IChartTextFormat getTextFormat() {
        m2146wl();
        return this.f2102to;
    }

    @Override // com.aspose.slides.PVIObject, com.aspose.slides.InterfaceC14376r6
    public long getVersion() {
        if (m2138ix()) {
            return m1320x1().m68680ks();
        }
        return 1L;
    }

    /* JADX INFO: renamed from: h4 */
    public final IChartComponent m1315h4() {
        return (IChartComponent) getParent_Immediate();
    }

    @Override // com.aspose.slides.IDataLabelFormat
    public final boolean isNumberFormatLinkedToSource() {
        if (m2138ix()) {
            return m1320x1().m68677k4();
        }
        return true;
    }

    @Override // com.aspose.slides.IDataLabelFormat
    public final void setNumberFormat(String str) {
        m2141k4("", str);
        if (m2138ix()) {
            m1320x1().m68675k4(str);
        }
        DataLabelCollection dataLabelCollection = this.f2103x1;
        if (dataLabelCollection != null) {
            IGenericEnumerator<IDataLabel> it = dataLabelCollection.iterator();
            while (it.hasNext()) {
                try {
                    it.next().getDataLabelFormat().setNumberFormat(str);
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
        }
    }

    @Override // com.aspose.slides.IDataLabelFormat
    public final void setNumberFormatLinkedToSource(boolean z) {
        m2141k4(Boolean.TRUE, Boolean.valueOf(z));
        if (m2138ix()) {
            m1320x1().m68676k4(z);
        }
        DataLabelCollection dataLabelCollection = this.f2103x1;
        if (dataLabelCollection != null) {
            IGenericEnumerator<IDataLabel> it = dataLabelCollection.iterator();
            while (it.hasNext()) {
                try {
                    it.next().getDataLabelFormat().setNumberFormatLinkedToSource(z);
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
        }
    }

    @Override // com.aspose.slides.IDataLabelFormat
    public final void setPosition(int i) {
        String strM1290k4 = DataLabel.m1290k4(this.f2100k4, i);
        if (!"".equals(strM1290k4)) {
            throw new InvalidOperationException(C14113y2.m67408k4("Wrong label position for this type of series. Possible values: ", strM1290k4));
        }
        m2141k4((Integer) (-1), Integer.valueOf(i));
        if (m2138ix()) {
            m1320x1().m68673k4(i);
        }
        DataLabelCollection dataLabelCollection = this.f2103x1;
        if (dataLabelCollection != null) {
            IGenericEnumerator<IDataLabel> it = dataLabelCollection.iterator();
            while (it.hasNext()) {
                try {
                    it.next().getDataLabelFormat().setPosition(i);
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
        }
    }

    @Override // com.aspose.slides.IDataLabelFormat
    public final void setSeparator(String str) {
        m2141k4("", str);
        if (m2138ix()) {
            m1320x1().m68687x1(str);
        }
        DataLabelCollection dataLabelCollection = this.f2103x1;
        if (dataLabelCollection != null) {
            IGenericEnumerator<IDataLabel> it = dataLabelCollection.iterator();
            while (it.hasNext()) {
                try {
                    it.next().getDataLabelFormat().setSeparator(str);
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
        }
    }

    @Override // com.aspose.slides.IDataLabelFormat
    public final void setShowBubbleSize(boolean z) {
        m2141k4(Boolean.FALSE, Boolean.valueOf(z));
        if (m2138ix()) {
            m1320x1().m68681m9(z);
        }
        DataLabelCollection dataLabelCollection = this.f2103x1;
        if (dataLabelCollection != null) {
            IGenericEnumerator<IDataLabel> it = dataLabelCollection.iterator();
            while (it.hasNext()) {
                try {
                    it.next().getDataLabelFormat().setShowBubbleSize(z);
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
        }
    }

    @Override // com.aspose.slides.IDataLabelFormat
    public final void setShowCategoryName(boolean z) {
        m2141k4(Boolean.FALSE, Boolean.valueOf(z));
        if (m2138ix()) {
            m1320x1().m68683to(z);
        }
        DataLabelCollection dataLabelCollection = this.f2103x1;
        if (dataLabelCollection != null) {
            IGenericEnumerator<IDataLabel> it = dataLabelCollection.iterator();
            while (it.hasNext()) {
                try {
                    it.next().getDataLabelFormat().setShowCategoryName(z);
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            if (!ChartTypeCharacterizer.m768up(this.f2103x1.getParentSeries().getType()) || ((ChartSeries) this.f2103x1.getParentSeries()).m719c5() == null) {
                return;
            }
            IGenericEnumerator<C0791b3> it2 = ((ChartSeries) this.f2103x1.getParentSeries()).m719c5().iterator();
            while (it2.hasNext()) {
                try {
                    C0791b3 next = it2.next();
                    next.m3961m9().getDataLabelFormat().setShowCategoryName(z);
                    next.m3948du().getDataLabelFormat().setShowCategoryName(z);
                    next.m3954k4().getDataLabelFormat().setShowCategoryName(z);
                    next.m3959kk().getDataLabelFormat().setShowCategoryName(z);
                    next.m3954k4().getDataLabelFormat().setShowCategoryName(z);
                    next.m3970x1().getDataLabelFormat().setShowCategoryName(z);
                    next.m3965to().getDataLabelFormat().setShowCategoryName(z);
                    next.m3951h4().getDataLabelFormat().setShowCategoryName(z);
                } finally {
                    if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                        it2.dispose();
                    }
                }
            }
        }
    }

    @Override // com.aspose.slides.IDataLabelFormat
    public final void setShowLabelAsDataCallout(boolean z) {
        m2141k4(Boolean.FALSE, Boolean.valueOf(z));
        if (m2138ix()) {
            m1320x1().m68660c5(z);
        }
        DataLabelCollection dataLabelCollection = this.f2103x1;
        if (dataLabelCollection != null) {
            IGenericEnumerator<IDataLabel> it = dataLabelCollection.iterator();
            while (it.hasNext()) {
                try {
                    it.next().getDataLabelFormat().setShowLabelAsDataCallout(z);
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
        }
    }

    @Override // com.aspose.slides.IDataLabelFormat
    public final void setShowLabelValueFromCell(boolean z) {
        m2141k4(Boolean.FALSE, Boolean.valueOf(z));
        if (m2138ix()) {
            m1320x1().m68671jd(z);
        }
        DataLabelCollection dataLabelCollection = this.f2103x1;
        if (dataLabelCollection == null) {
            m1313k4(z, (IDataLabel) C7019kk.m27452k4((Object) m1315h4(), DataLabel.class));
            return;
        }
        IGenericEnumerator<IDataLabel> it = dataLabelCollection.iterator();
        while (it.hasNext()) {
            try {
                IDataLabel next = it.next();
                next.getDataLabelFormat().setShowLabelValueFromCell(z);
                m1313k4(z, next);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    @Override // com.aspose.slides.IDataLabelFormat
    public final void setShowLeaderLines(boolean z) {
        m2141k4(Boolean.FALSE, Boolean.valueOf(z));
        if (m2138ix()) {
            m1320x1().m68666dy(z);
        }
        DataLabelCollection dataLabelCollection = this.f2103x1;
        if (dataLabelCollection != null) {
            IGenericEnumerator<IDataLabel> it = dataLabelCollection.iterator();
            while (it.hasNext()) {
                try {
                    it.next().getDataLabelFormat().setShowLeaderLines(z);
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
        }
    }

    @Override // com.aspose.slides.IDataLabelFormat
    public final void setShowLegendKey(boolean z) {
        m2141k4(Boolean.FALSE, Boolean.valueOf(z));
        if (m2138ix()) {
            m1320x1().m68688x1(z);
        }
        DataLabelCollection dataLabelCollection = this.f2103x1;
        if (dataLabelCollection != null) {
            IGenericEnumerator<IDataLabel> it = dataLabelCollection.iterator();
            while (it.hasNext()) {
                try {
                    it.next().getDataLabelFormat().setShowLegendKey(z);
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
        }
    }

    @Override // com.aspose.slides.IDataLabelFormat
    public final void setShowPercentage(boolean z) {
        m2141k4(Boolean.FALSE, Boolean.valueOf(z));
        if (m2138ix()) {
            m1320x1().m68669h4(z);
        }
        DataLabelCollection dataLabelCollection = this.f2103x1;
        if (dataLabelCollection != null) {
            IGenericEnumerator<IDataLabel> it = dataLabelCollection.iterator();
            while (it.hasNext()) {
                try {
                    it.next().getDataLabelFormat().setShowPercentage(z);
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
        }
    }

    @Override // com.aspose.slides.IDataLabelFormat
    public final void setShowSeriesName(boolean z) {
        m2141k4(Boolean.FALSE, Boolean.valueOf(z));
        if (m2138ix()) {
            m1320x1().m68664du(z);
        }
        DataLabelCollection dataLabelCollection = this.f2103x1;
        if (dataLabelCollection != null) {
            IGenericEnumerator<IDataLabel> it = dataLabelCollection.iterator();
            while (it.hasNext()) {
                try {
                    it.next().getDataLabelFormat().setShowSeriesName(z);
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            if (!ChartTypeCharacterizer.m768up(this.f2103x1.getParentSeries().getType()) || ((ChartSeries) this.f2103x1.getParentSeries()).m719c5() == null) {
                return;
            }
            IGenericEnumerator<C0791b3> it2 = ((ChartSeries) this.f2103x1.getParentSeries()).m719c5().iterator();
            while (it2.hasNext()) {
                try {
                    C0791b3 next = it2.next();
                    next.m3961m9().getDataLabelFormat().setShowSeriesName(z);
                    next.m3948du().getDataLabelFormat().setShowSeriesName(z);
                    next.m3954k4().getDataLabelFormat().setShowSeriesName(z);
                    next.m3959kk().getDataLabelFormat().setShowSeriesName(z);
                    next.m3954k4().getDataLabelFormat().setShowSeriesName(z);
                    next.m3970x1().getDataLabelFormat().setShowSeriesName(z);
                    next.m3965to().getDataLabelFormat().setShowSeriesName(z);
                    next.m3951h4().getDataLabelFormat().setShowSeriesName(z);
                } finally {
                    if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                        it2.dispose();
                    }
                }
            }
        }
    }

    @Override // com.aspose.slides.IDataLabelFormat
    public final void setShowValue(boolean z) {
        m2141k4(Boolean.FALSE, Boolean.valueOf(z));
        if (m2138ix()) {
            m1320x1().m68679kk(z);
        }
        DataLabelCollection dataLabelCollection = this.f2103x1;
        if (dataLabelCollection != null) {
            IGenericEnumerator<IDataLabel> it = dataLabelCollection.iterator();
            while (it.hasNext()) {
                try {
                    it.next().getDataLabelFormat().setShowValue(z);
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            if (!ChartTypeCharacterizer.m768up(this.f2103x1.getParentSeries().getType()) || ((ChartSeries) this.f2103x1.getParentSeries()).m719c5() == null) {
                return;
            }
            IGenericEnumerator<C0791b3> it2 = ((ChartSeries) this.f2103x1.getParentSeries()).m719c5().iterator();
            while (it2.hasNext()) {
                try {
                    C0791b3 next = it2.next();
                    next.m3961m9().getDataLabelFormat().setShowValue(z);
                    next.m3948du().getDataLabelFormat().setShowValue(z);
                    next.m3954k4().getDataLabelFormat().setShowValue(z);
                    next.m3959kk().getDataLabelFormat().setShowValue(z);
                    next.m3954k4().getDataLabelFormat().setShowValue(z);
                    next.m3970x1().getDataLabelFormat().setShowValue(z);
                    next.m3965to().getDataLabelFormat().setShowValue(z);
                    next.m3951h4().getDataLabelFormat().setShowValue(z);
                } finally {
                    if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                        it2.dispose();
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: to */
    public final IChartTextFormat m1319to() {
        return this.f2102to;
    }

    /* JADX INFO: renamed from: x1 */
    public final C14243om m1320x1() {
        return (C14243om) m2144u4();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m1316k4(int i) {
        if ("".equals(DataLabel.m1290k4(this.f2100k4, i))) {
            m2141k4((Integer) (-1), Integer.valueOf(i));
            if (m2138ix()) {
                m1320x1().m68673k4(i);
            }
            DataLabelCollection dataLabelCollection = this.f2103x1;
            if (dataLabelCollection != null) {
                IGenericEnumerator<IDataLabel> it = dataLabelCollection.iterator();
                while (it.hasNext()) {
                    try {
                        it.next().getDataLabelFormat().setPosition(i);
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m1317k4(DataLabelFormat dataLabelFormat) {
        if (m2138ix() || dataLabelFormat.m2138ix()) {
            m2145uz();
            m1320x1().m68674k4(dataLabelFormat);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m1318k4(boolean z) {
        m2141k4(Boolean.FALSE, Boolean.valueOf(z));
        if (m2138ix()) {
            m1320x1().m68663ck(z);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m1313k4(boolean z, IDataLabel iDataLabel) {
        IPortion iPortionM1312k4 = m1312k4(iDataLabel.getTextFrameForOverriding());
        if (iPortionM1312k4 != null) {
            if (z) {
                iPortionM1312k4.setText("[CELLRANGE]");
            } else {
                iDataLabel.getTextFrameForOverriding().getParagraphs().get_Item(0).getPortions().remove(iPortionM1312k4);
            }
        }
    }
}

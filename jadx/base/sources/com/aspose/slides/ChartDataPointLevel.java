package com.aspose.slides;

import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: loaded from: classes3.dex */
public class ChartDataPointLevel extends DomObject<ChartDataPointLevelsManager> implements IChartDataPointLevel {

    /* JADX INFO: renamed from: du */
    private DataLabel f1408du;

    /* JADX INFO: renamed from: k4 */
    private boolean f1409k4;

    /* JADX INFO: renamed from: kk */
    private int f1410kk;

    /* JADX INFO: renamed from: m9 */
    private IFormat f1411m9;

    /* JADX INFO: renamed from: to */
    private Format f1412to;

    /* JADX INFO: renamed from: x1 */
    private int f1413x1;

    public ChartDataPointLevel(ChartDataPointLevelsManager chartDataPointLevelsManager, int i) {
        super(chartDataPointLevelsManager);
        this.f1409k4 = true;
        this.f1410kk = i;
    }

    /* JADX INFO: renamed from: du */
    public final IFormat m645du() {
        if (this.f1411m9 == null) {
            Chart chart = (Chart) m652m9().m596to().m640x1().getChart();
            ChartData chartData = (ChartData) chart.getChartData();
            ChartCategoryCollection chartCategoryCollection = (ChartCategoryCollection) chartData.getCategories();
            int iM617k4 = m652m9().m596to().m617k4((IChartDataPoint) m652m9());
            if (chartCategoryCollection.size() == 0) {
                IFormat iFormatM71124k4 = chart.m513ks().m63797h4().m71124k4(this, iM617k4, m652m9().m596to().size());
                this.f1411m9 = iFormatM71124k4;
                return iFormatM71124k4;
            }
            List<KeyValuePair<Integer, String>> listM532k4 = chartCategoryCollection.m532k4((chartData.m553x1().mo5710kk() != 2 ? ((ChartCategory) chartCategoryCollection.get_Item(0)).m526x1().m4304k4() : chartCategoryCollection.getGroupingLevelCount()) - 1);
            int i = 0;
            for (int i2 = 0; i2 < listM532k4.size(); i2++) {
                if (iM617k4 >= listM532k4.get_Item(i2).getKey().intValue()) {
                    i = i2;
                }
            }
            this.f1411m9 = chart.m513ks().m63797h4().m71124k4(this, i, listM532k4.size());
        }
        return this.f1411m9;
    }

    /* JADX INFO: renamed from: dy */
    public final int m646dy() {
        return this.f1413x1;
    }

    @Override // com.aspose.slides.IChartDataPointLevel
    public final IFormat getFormat() {
        if (this.f1410kk == 0) {
            return m652m9().getFormat();
        }
        if (!m654x1()) {
            return m648k4().getFormat();
        }
        if (this.f1412to == null) {
            this.f1412to = new Format(this);
        }
        return this.f1412to;
    }

    @Override // com.aspose.slides.IChartDataPointLevel
    public final IDataLabel getLabel() {
        if (this.f1410kk == 0) {
            return m652m9().getLabel();
        }
        if (!m654x1()) {
            return m648k4().getLabel();
        }
        if (this.f1408du == null) {
            this.f1408du = new DataLabel(this);
        }
        return this.f1408du;
    }

    /* JADX INFO: renamed from: h4 */
    public final String m647h4() {
        int iM617k4 = m652m9().m596to().m617k4((IChartDataPoint) m652m9());
        List<KeyValuePair<Integer, String>> listM532k4 = ((ChartCategoryCollection) ((ChartData) m652m9().m596to().m640x1().getChart().getChartData()).getCategories()).m532k4(this.f1410kk);
        int i = 0;
        for (int i2 = 0; i2 < listM532k4.size() && iM617k4 >= listM532k4.get_Item(i2).getKey().intValue(); i2++) {
            i = i2;
        }
        return listM532k4.get_Item(i).getValue();
    }

    /* JADX INFO: renamed from: k4 */
    public final IChartDataPointLevel m648k4() {
        int iM617k4 = m652m9().m596to().m617k4((IChartDataPoint) m652m9());
        List<KeyValuePair<Integer, String>> listM532k4 = ((ChartCategoryCollection) m652m9().m596to().m640x1().getChart().getChartData().getCategories()).m532k4(this.f1410kk);
        int iIntValue = 0;
        for (int i = 0; i < listM532k4.size() && listM532k4.get_Item(i).getKey().intValue() <= iM617k4; i++) {
            iIntValue = listM532k4.get_Item(i).getKey().intValue();
        }
        return m652m9().m596to().get_Item(iIntValue).getDataPointLevels().get_Item(this.f1410kk);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: kk */
    public final FillFormat m651kk() {
        if (getFormat().getFill().getFillType() == -1) {
            int count = ((ChartDataPointLevelsManager) this.f2127h4).getCount();
            int i = this.f1410kk;
            if (count > i + 1) {
                return ((ChartDataPointLevel) C7019kk.m27452k4((Object) ((ChartDataPointLevelsManager) this.f2127h4).get_Item(i + 1), ChartDataPointLevel.class)).m651kk();
            }
        }
        return getFormat().getFill().getFillType() == -1 ? (FillFormat) m645du().getFill() : (FillFormat) getFormat().getFill();
    }

    /* JADX INFO: renamed from: m9 */
    public final ChartDataPoint m652m9() {
        return (ChartDataPoint) ((InterfaceC14397rj) C7019kk.m27452k4((Object) this.f2127h4, InterfaceC14397rj.class)).getParent_Immediate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: to */
    public final IEffectFormat m653to() {
        if (getFormat().getFill().getFillType() == -1) {
            int count = ((ChartDataPointLevelsManager) this.f2127h4).getCount();
            int i = this.f1410kk;
            if (count > i + 1) {
                return ((ChartDataPointLevel) C7019kk.m27452k4((Object) ((ChartDataPointLevelsManager) this.f2127h4).get_Item(i + 1), ChartDataPointLevel.class)).m653to();
            }
        }
        return getFormat().getFill().getFillType() == -1 ? m645du().getEffect() : getFormat().getEffect();
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m654x1() {
        int iM617k4 = m652m9().m596to().m617k4((IChartDataPoint) m652m9());
        if (iM617k4 == 0) {
            return true;
        }
        ChartCategoryCollection chartCategoryCollection = (ChartCategoryCollection) m652m9().m596to().m640x1().getChart().getChartData().getCategories();
        if (chartCategoryCollection.size() < iM617k4 + 1) {
            return false;
        }
        List<KeyValuePair<Integer, String>> listM532k4 = chartCategoryCollection.m532k4(this.f1410kk);
        for (int i = 0; i < listM532k4.size(); i++) {
            if (listM532k4.get_Item(i).getKey().intValue() == iM617k4) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m649k4(int i) {
        this.f1413x1 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m650k4(boolean z) {
        this.f1409k4 = z;
    }
}

package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14113y2;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class ChartCategoryCollection extends DomObject<ChartData> implements IChartCategoryCollection {

    /* JADX INFO: renamed from: du */
    private final Dictionary<String, ChartCategory> f1326du;

    /* JADX INFO: renamed from: k4 */
    private String f1327k4;

    /* JADX INFO: renamed from: kk */
    private boolean f1328kk;

    /* JADX INFO: renamed from: m9 */
    private final C0968ex f1329m9;

    /* JADX INFO: renamed from: to */
    private final nl7<IChartCategory> f1330to;

    /* JADX INFO: renamed from: x1 */
    private boolean f1331x1;

    public ChartCategoryCollection(ChartData chartData) {
        super(chartData);
        this.f1328kk = true;
        this.f1330to = new nl7<>(chartData);
        this.f1326du = new Dictionary<>();
        this.f1329m9 = new C0968ex();
    }

    /* JADX INFO: renamed from: x1 */
    private void m528x1(IChartCategory iChartCategory) {
        if (!this.f1328kk || iChartCategory.getAsCell() == null) {
            return;
        }
        String strM561du = ((ChartDataCell) iChartCategory.getAsCell()).m561du();
        if (this.f1326du.containsKey(strM561du)) {
            return;
        }
        this.f1326du.addItem(strM561du, (ChartCategory) iChartCategory);
    }

    @Override // com.aspose.slides.IChartCategoryCollection
    public final IChartCategory add(IChartDataCell iChartDataCell) {
        ChartCategory chartCategory;
        if (!this.f1328kk) {
            throw new InvalidOperationException("For using worksheet set UseCells property to true.");
        }
        String strM561du = ((ChartDataCell) iChartDataCell).m561du();
        if (this.f1326du.containsKey(strM561du)) {
            chartCategory = this.f1326du.get_Item(strM561du);
        } else {
            chartCategory = new ChartCategory(this);
            this.f1330to.addItem(chartCategory);
            m528x1(chartCategory);
        }
        chartCategory.setAsCell(iChartDataCell);
        return chartCategory;
    }

    @Override // com.aspose.slides.IChartCategoryCollection
    public final void clear() {
        synchronized (this.f1330to) {
            try {
                for (IChartCategory iChartCategory : this.f1330to.toArray(new IChartCategory[0])) {
                    m527k4(iChartCategory);
                    iChartCategory.remove();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final void copyTo(AbstractC14092to abstractC14092to, int i) {
        this.f1330to.copyTo(abstractC14092to, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: du */
    public final String m529du() {
        ChartCellCollection chartCellCollection = (ChartCellCollection) ((ChartData) this.f2127h4).getChartDataWorkbook().getCellCollection("", true);
        Iterator<IChartCategory> it = this.f1330to.iterator();
        while (it.hasNext()) {
            chartCellCollection.add(it.next().getAsCell());
        }
        if (getGroupingLevelCount() == 1) {
            return chartCellCollection.getCellsAddress();
        }
        for (int i = 1; i < getGroupingLevelCount(); i++) {
            for (IChartCategory iChartCategory : this.f1330to) {
                if (iChartCategory.getGroupingLevels().get_Item(i) != null) {
                    chartCellCollection.add(iChartCategory.getGroupingLevels().get_Item(i));
                }
            }
        }
        return chartCellCollection.m544k4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.slides.IChartCategoryCollection
    public final int getGroupingLevelCount() {
        if (getUseCells() && ((ChartData) this.f2127h4).m553x1().mo5710kk() != 2) {
            if (size() > 0) {
                return ((ChartCategory) get_Item(0)).m526x1().m4304k4();
            }
            return 0;
        }
        int i = 0;
        for (IChartCategory iChartCategory : this.f1330to) {
            int iM540k4 = iChartCategory.getGroupingLevels() != null ? ((ChartCategoryLevelsManager) iChartCategory.getGroupingLevels()).m540k4() : 0;
            if (i < iM540k4) {
                i = iM540k4;
            }
        }
        return i + 1;
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final Object getSyncRoot() {
        return this;
    }

    @Override // com.aspose.slides.IChartCategoryCollection
    public final boolean getUseCells() {
        return this.f1328kk;
    }

    @Override // com.aspose.slides.IChartCategoryCollection
    public final IChartCategory get_Item(int i) {
        return this.f1330to.get_Item(i);
    }

    /* JADX INFO: renamed from: h4 */
    public final boolean m530h4() {
        return this.f1331x1;
    }

    @Override // com.aspose.slides.IChartCategoryCollection
    public final int indexOf(IChartCategory iChartCategory) {
        return this.f1330to.indexOf(iChartCategory);
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final boolean isSynchronized() {
        return false;
    }

    @Override // java.lang.Iterable
    public final IGenericEnumerator<IChartCategory> iterator() {
        return this.f1330to.iterator();
    }

    @Override // com.aspose.slides.IGenericCollection
    public final IGenericEnumerator<IChartCategory> iteratorJava() {
        return this.f1330to.iteratorJava();
    }

    /* JADX INFO: renamed from: k4 */
    public final ChartCategory m531k4(Object obj) {
        ChartCategory chartCategory = new ChartCategory(this);
        chartCategory.m524k4(obj);
        this.f1330to.addItem(chartCategory);
        return chartCategory;
    }

    /* JADX INFO: renamed from: kk */
    public final String m537kk() {
        return this.f1327k4;
    }

    @Override // com.aspose.slides.IChartCategoryCollection
    public final void remove(IChartCategory iChartCategory) {
        m527k4(iChartCategory);
        iChartCategory.remove();
    }

    @Override // com.aspose.slides.IChartCategoryCollection
    public final void removeAt(int i) {
        m527k4(get_Item(i));
        get_Item(i).remove();
    }

    @Override // com.aspose.slides.IChartCategoryCollection
    public final void setUseCells(boolean z) {
        this.f1328kk = z;
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final int size() {
        return this.f1330to.size();
    }

    /* JADX INFO: renamed from: to */
    public final C0968ex m538to() {
        return this.f1329m9;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.slides.IChartCategoryCollection
    public final IChartCategory add(Object obj) {
        ChartCategory chartCategory = new ChartCategory(this);
        if (this.f1328kk) {
            ChartDataCell chartDataCellM669dy = ((ChartDataWorkbook) ((ChartData) this.f2127h4).getChartDataWorkbook()).m669dy();
            chartDataCellM669dy.setValue(obj);
            chartCategory.setAsCell(chartDataCellM669dy);
            m528x1(chartCategory);
        } else {
            chartCategory.setAsLiteral(obj);
        }
        this.f1330to.addItem(chartCategory);
        return chartCategory;
    }

    /* JADX INFO: renamed from: k4 */
    public final List<KeyValuePair<Integer, String>> m532k4(int i) {
        List<KeyValuePair<Integer, String>> list = new List<>();
        if (size() == 0) {
            return list;
        }
        Object objM523k4 = ((ChartCategory) C7019kk.m27452k4((Object) get_Item(0), ChartCategory.class)).m523k4(i);
        int i2 = 0;
        for (int i3 = 1; i3 < size(); i3++) {
            Object objM523k42 = ((ChartCategory) get_Item(i3)).m523k4(i);
            boolean z = (objM523k42 == null || "".equals(objM523k42.toString()) || (objM523k4 != null && C14113y2.m67363du(objM523k4.toString(), objM523k42.toString()))) ? false : true;
            if (i == 0 || z) {
                list.addItem(new KeyValuePair<>(Integer.valueOf(i2), objM523k4 != null ? objM523k4.toString() : C14113y2.f47374k4));
                i2 = i3;
                objM523k4 = objM523k42;
            }
        }
        list.addItem(new KeyValuePair<>(Integer.valueOf(i2), objM523k4 != null ? objM523k4.toString() : C14113y2.f47374k4));
        return list;
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m539x1() {
        boolean zM63556k4 = true;
        for (int i = 0; i < getGroupingLevelCount(); i++) {
            for (int i2 = 0; i2 < size(); i2++) {
                Object objM523k4 = ((ChartCategory) C7019kk.m27452k4((Object) get_Item(i2), ChartCategory.class)).m523k4(i);
                if (objM523k4 != null) {
                    zM63556k4 &= AbstractC13703jv.m63556k4(C14080ne.m66987ks(objM523k4, C11697x1.m55250kk()), new double[]{0.0d});
                }
            }
        }
        return zM63556k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m533k4() {
        synchronized (this.f1330to) {
            try {
                for (IChartCategory iChartCategory : this.f1330to.toArray(new IChartCategory[0])) {
                    m527k4(iChartCategory);
                }
                this.f1330to.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m534k4(ChartCategory chartCategory) {
        m527k4((IChartCategory) chartCategory);
        if (!this.f1330to.removeItem(chartCategory)) {
            throw new ArgumentException("The value parameter was not found in the collection.");
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m527k4(IChartCategory iChartCategory) {
        if (((ChartData) C0754al.m3657k4(ChartData.class, (InterfaceC14397rj) this.f2127h4)).m553x1().mo5710kk() == 2 && this.f1328kk && iChartCategory.getAsCell() != null) {
            this.f1326du.removeItemByKey(((ChartDataCell) iChartCategory.getAsCell()).m561du());
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m535k4(String str) {
        this.f1327k4 = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m536k4(boolean z) {
        this.f1331x1 = z;
    }
}

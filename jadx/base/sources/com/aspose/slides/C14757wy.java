package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14074ks;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.wy */
/* JADX INFO: loaded from: classes3.dex */
class C14757wy extends DomObject<ChartSeries> implements IGenericEnumerable<C0791b3> {

    /* JADX INFO: renamed from: k4 */
    private final List<C0791b3> f49879k4;

    public C14757wy(ChartSeries chartSeries) {
        super(chartSeries);
        this.f49879k4 = new nl7(chartSeries.getChart().getChartData());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c5 */
    private void m72961c5() {
        double d;
        boolean z;
        double d2;
        double d3;
        double d4;
        IAxis horizontalAxis = ((ChartSeries) this.f2127h4).getChart().getAxes().getHorizontalAxis();
        double dM72962ck = ((ChartSeries) this.f2127h4).getChart().getAxes().getHorizontalAxis().getAggregationType() == 1 ? m72962ck() : horizontalAxis.getBinWidth();
        double d5 = 0.0d;
        double[] dArr = {0.0d};
        double[] dArr2 = {0.0d};
        m72969k4(dArr, dArr2);
        double underflowBin = dArr[0];
        double overflowBin = dArr2[0];
        double d6 = 1.0d;
        if (horizontalAxis.isOverflowBin() || horizontalAxis.isUnderflowBin()) {
            double d7 = 0.0d;
            double d8 = 0.0d;
            for (int i = 0; i < ((ChartSeries) this.f2127h4).getDataPoints().size(); i++) {
                double dM72972k4 = m72972k4(((ChartSeries) this.f2127h4).getDataPoints().get_Item(i));
                if (!horizontalAxis.isAutomaticOverflowBin() && dM72972k4 > horizontalAxis.getOverflowBin()) {
                    d7 += 1.0d;
                }
                if (!horizontalAxis.isAutomaticUnderflowBin() && dM72972k4 <= horizontalAxis.getUnderflowBin()) {
                    d8 += 1.0d;
                }
            }
            if (!horizontalAxis.isAutomaticOverflowBin() && horizontalAxis.getOverflowBin() < overflowBin) {
                overflowBin = horizontalAxis.getOverflowBin();
            }
            if (!horizontalAxis.isAutomaticUnderflowBin() && horizontalAxis.getUnderflowBin() > underflowBin) {
                underflowBin = horizontalAxis.getUnderflowBin();
            }
            double d9 = d8;
            d = 0.0d;
            d5 = d9;
            z = true;
            double d10 = d7;
            d2 = dM72962ck;
            d3 = d10;
        } else {
            z = true;
            d2 = dM72962ck;
            d3 = 0.0d;
            d = 0.0d;
        }
        if (d2 != d) {
            int i2 = 0;
            double d11 = underflowBin;
            while (true) {
                boolean z2 = z;
                if (i2 >= C7019kk.m27462to(Double.valueOf(C14116yg.m67501x1((overflowBin - underflowBin) / d2)), 14)) {
                    break;
                }
                Double dValueOf = Double.valueOf(d11);
                d11 += d2;
                String strM67402k4 = C14113y2.m67402k4("[{0}, {1}]", dValueOf, Double.valueOf(d11));
                C0791b3 c0791b3 = new C0791b3(this);
                c0791b3.m3958k4(strM67402k4);
                this.f49879k4.addItem(c0791b3);
                i2++;
                z = z2;
            }
            int i3 = 0;
            while (i3 < ((ChartSeries) this.f2127h4).getDataPoints().size()) {
                double dM72972k42 = m72972k4(((ChartSeries) this.f2127h4).getDataPoints().get_Item(i3));
                if (!C14044b3.m66437kk(dM72972k42) && ((horizontalAxis.isAutomaticOverflowBin() || dM72972k42 <= horizontalAxis.getOverflowBin()) && (horizontalAxis.isAutomaticUnderflowBin() || dM72972k42 > horizontalAxis.getUnderflowBin()))) {
                    int iM27462to = C7019kk.m27462to(Double.valueOf(C14116yg.m67501x1((dM72972k42 - underflowBin) / d2)), 14);
                    if (iM27462to > 0) {
                        iM27462to--;
                    }
                    d4 = d6;
                    this.f49879k4.get_Item(iM27462to).m3955k4(this.f49879k4.get_Item(iM27462to).m3950fa() + d4);
                } else {
                    d4 = d6;
                }
                i3++;
                d6 = d4;
            }
        }
        if (d3 > d) {
            C0791b3 c0791b32 = new C0791b3(this);
            c0791b32.m3958k4(C14113y2.m67408k4("> ", C14044b3.m66425h4(horizontalAxis.getOverflowBin())));
            c0791b32.m3955k4(d3);
            List<C0791b3> list = this.f49879k4;
            list.insertItem(list.size(), c0791b32);
        }
        if (d5 > d) {
            C0791b3 c0791b33 = new C0791b3(this);
            c0791b33.m3958k4(C14113y2.m67408k4("<= ", C14044b3.m66425h4(horizontalAxis.getUnderflowBin())));
            c0791b33.m3955k4(d5);
            this.f49879k4.insertItem(0, c0791b33);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ck */
    private double m72962ck() {
        return C14116yg.m67490kk((m72967jd() * 3.5d) / C14116yg.m67469du(((ChartSeries) this.f2127h4).getDataPoints().size(), 0.3333333432674408d));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: du */
    private void m72963du() {
        IChartCategoryCollection categories = ((ChartSeries) this.f2127h4).getChart().getChartData().getCategories();
        Dictionary dictionary = new Dictionary();
        List list = new List();
        for (int i = 0; i < ((ChartSeries) this.f2127h4).getDataPoints().size(); i++) {
            String string = C14113y2.f47374k4;
            if (i < categories.size() && ((ChartCategory) categories.get_Item(i)).m525kk() != null) {
                string = ((ChartCategory) categories.get_Item(i)).m525kk().toString();
            }
            double dM72972k4 = m72972k4(((ChartSeries) this.f2127h4).getDataPoints().get_Item(i));
            boolean zContainsKey = dictionary.containsKey(string);
            boolean zM66437kk = C14044b3.m66437kk(dM72972k4);
            if (zContainsKey) {
                if (!zM66437kk) {
                    ((List) dictionary.get_Item(string)).addItem(((ChartSeries) this.f2127h4).getDataPoints().get_Item(i));
                }
            } else if (!zM66437kk) {
                List list2 = new List();
                list2.addItem(((ChartSeries) this.f2127h4).getDataPoints().get_Item(i));
                dictionary.addItem(string, list2);
                list.addItem(string);
            }
        }
        List.Enumerator it = list.iterator();
        while (it.hasNext()) {
            try {
                String str = (String) it.next();
                ((List) dictionary.get_Item(str)).sort(new AbstractC14074ks<IChartDataPoint>() { // from class: com.aspose.slides.wy.1
                    @Override // com.aspose.slides.p559ms.System.AbstractC14074ks
                    /* JADX INFO: renamed from: k4, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
                    public int mo1193k4(IChartDataPoint iChartDataPoint, IChartDataPoint iChartDataPoint2) {
                        return C14044b3.m66430k4(C14757wy.this.m72972k4(iChartDataPoint), C14757wy.this.m72972k4(iChartDataPoint2));
                    }
                });
                this.f49879k4.addItem(new C0791b3(this, (List) dictionary.get_Item(str)));
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: dy */
    private void m72964dy() {
        boolean z;
        double d;
        double d2;
        double d3;
        double d4;
        double d5;
        IAxis horizontalAxis = ((ChartSeries) this.f2127h4).getChart().getAxes().getHorizontalAxis();
        double d6 = 0.0d;
        double[] dArr = {0.0d};
        double[] dArr2 = {0.0d};
        m72969k4(dArr, dArr2);
        double underflowBin = dArr[0];
        double overflowBin = dArr2[0];
        long numberOfBins = horizontalAxis.getNumberOfBins();
        double d7 = 1.0d;
        if (horizontalAxis.isOverflowBin() || horizontalAxis.isUnderflowBin()) {
            double d8 = 0.0d;
            double d9 = 0.0d;
            for (int i = 0; i < ((ChartSeries) this.f2127h4).getDataPoints().size(); i++) {
                if (!horizontalAxis.isAutomaticOverflowBin() && m72972k4(((ChartSeries) this.f2127h4).getDataPoints().get_Item(i)) > horizontalAxis.getOverflowBin()) {
                    d8 += 1.0d;
                }
                if (!horizontalAxis.isAutomaticUnderflowBin() && m72972k4(((ChartSeries) this.f2127h4).getDataPoints().get_Item(i)) <= horizontalAxis.getUnderflowBin()) {
                    d9 += 1.0d;
                }
            }
            if (d8 > 0.0d) {
                overflowBin = horizontalAxis.getOverflowBin();
                numberOfBins--;
            }
            if (d9 > 0.0d) {
                underflowBin = horizontalAxis.getUnderflowBin();
                numberOfBins--;
            }
            z = true;
            d = d8;
            d2 = underflowBin;
            d3 = d9;
        } else {
            d2 = underflowBin;
            d3 = 0.0d;
            z = true;
            d = 0.0d;
        }
        double d10 = overflowBin - d2;
        double d11 = d10 / (numberOfBins & 4294967295L);
        if (d11 != 0.0d) {
            double d12 = d2;
            int i2 = 0;
            while (true) {
                d4 = d7;
                if (i2 >= C7019kk.m27462to(Double.valueOf(C14116yg.m67501x1(d10 / d11)), 14)) {
                    break;
                }
                Double dValueOf = Double.valueOf(d12);
                d12 += d11;
                String strM67402k4 = C14113y2.m67402k4("[{0}, {1}]", dValueOf, Double.valueOf(d12));
                C0791b3 c0791b3 = new C0791b3(this);
                c0791b3.m3958k4(strM67402k4);
                c0791b3.m3955k4(0.0d);
                this.f49879k4.addItem(c0791b3);
                i2++;
                d7 = d4;
            }
            int i3 = 0;
            while (i3 < ((ChartSeries) this.f2127h4).getDataPoints().size()) {
                double dM72972k4 = m72972k4(((ChartSeries) this.f2127h4).getDataPoints().get_Item(i3));
                if ((horizontalAxis.isAutomaticOverflowBin() || dM72972k4 <= horizontalAxis.getOverflowBin()) && (horizontalAxis.isAutomaticUnderflowBin() || dM72972k4 > horizontalAxis.getUnderflowBin())) {
                    int iM27462to = C7019kk.m27462to(Double.valueOf(C14116yg.m67501x1((dM72972k4 - d2) / d11)), 14);
                    if (iM27462to > 0) {
                        iM27462to--;
                    }
                    d5 = d6;
                    ((C0791b3) C7019kk.m27452k4((Object) this.f49879k4.get_Item(iM27462to), C0791b3.class)).m3955k4(((C0791b3) C7019kk.m27452k4((Object) this.f49879k4.get_Item(iM27462to), C0791b3.class)).m3950fa() + d4);
                } else {
                    d5 = d6;
                }
                i3++;
                d6 = d5;
            }
        }
        double d13 = d6;
        if (d > d13) {
            C0791b3 c0791b32 = new C0791b3(this);
            c0791b32.m3958k4(C14113y2.m67408k4("> ", C14044b3.m66425h4(horizontalAxis.getOverflowBin())));
            c0791b32.m3955k4(d);
            List<C0791b3> list = this.f49879k4;
            list.insertItem(list.size(), c0791b32);
        }
        if (d3 > d13) {
            C0791b3 c0791b33 = new C0791b3(this);
            c0791b33.m3958k4(C14113y2.m67408k4("<= ", C14044b3.m66425h4(horizontalAxis.getUnderflowBin())));
            c0791b33.m3955k4(d3);
            this.f49879k4.insertItem(0, c0791b33);
        }
    }

    /* JADX INFO: renamed from: fa */
    private void m72965fa() {
        for (int i = 0; i < this.f49879k4.size(); i++) {
            this.f49879k4.get_Item(i).m3956k4(i);
        }
        this.f49879k4.sort(new AbstractC14074ks<C0791b3>() { // from class: com.aspose.slides.wy.2
            @Override // com.aspose.slides.p559ms.System.AbstractC14074ks
            /* JADX INFO: renamed from: k4, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public int mo1193k4(C0791b3 c0791b3, C0791b3 c0791b32) {
                return c0791b3.m3950fa() == c0791b32.m3950fa() ? c0791b3.m3945ar() < c0791b32.m3945ar() ? -1 : 1 : c0791b3.m3950fa() > c0791b32.m3950fa() ? -1 : 1;
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h4 */
    private void m72966h4() {
        int aggregationType = ((ChartSeries) this.f2127h4).getChart().getAxes().getHorizontalAxis().getAggregationType();
        if (aggregationType == 0) {
            m72970m9();
            return;
        }
        if (aggregationType == 1) {
            if (((ChartSeries) this.f2127h4).getChart().getChartData().getCategories().size() > 0) {
                m72970m9();
                return;
            } else {
                m72961c5();
                return;
            }
        }
        if (aggregationType == 2) {
            m72961c5();
        } else {
            if (aggregationType != 3) {
                return;
            }
            m72964dy();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: jd */
    private double m72967jd() {
        int size = ((ChartSeries) this.f2127h4).getDataPoints().size();
        double dM67469du = 0.0d;
        double dM72972k4 = 0.0d;
        for (int i = 0; i < size; i++) {
            if (!C14044b3.m66437kk(m72972k4(((ChartSeries) this.f2127h4).getDataPoints().get_Item(i)))) {
                dM72972k4 += m72972k4(((ChartSeries) this.f2127h4).getDataPoints().get_Item(i));
            }
        }
        double d = dM72972k4 / ((double) size);
        for (int i2 = 0; i2 < size; i2++) {
            double dM72972k42 = m72972k4(((ChartSeries) this.f2127h4).getDataPoints().get_Item(i2));
            if (!C14044b3.m66437kk(dM72972k42)) {
                dM67469du = C14116yg.m67469du(dM72972k42 - d, 2.0d) + dM67469du;
            }
        }
        return C14116yg.m67496rv(dM67469du / ((double) (size - 1)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m9 */
    private void m72970m9() {
        ChartCategory chartCategory;
        Object objM525kk;
        int size = ((ChartSeries) this.f2127h4).getChart().getChartData().getCategories().size();
        int i = 0;
        if (size == 0) {
            C0791b3 c0791b3 = new C0791b3(this);
            c0791b3.m3958k4(C14113y2.f47374k4);
            c0791b3.m3955k4(0.0d);
            this.f49879k4.addItem(c0791b3);
            while (i < ((ChartSeries) this.f2127h4).getDataPoints().size()) {
                c0791b3.m3955k4(c0791b3.m3950fa() + m72972k4(((ChartSeries) this.f2127h4).getDataPoints().get_Item(i)));
                i++;
            }
            return;
        }
        Dictionary dictionary = new Dictionary();
        List list = new List();
        while (i < ((ChartSeries) this.f2127h4).getDataPoints().size()) {
            String string = C14113y2.f47374k4;
            if (i < size && (chartCategory = (ChartCategory) ((ChartSeries) this.f2127h4).getChart().getChartData().getCategories().get_Item(i)) != null) {
                if (chartCategory.m526x1().m4304k4() > 1 && chartCategory.m526x1().m4305k4(chartCategory.m526x1().m4304k4() - 1) != null) {
                    objM525kk = chartCategory.m526x1().m4305k4(chartCategory.m526x1().m4304k4() - 1);
                } else if (chartCategory.m525kk() != null) {
                    objM525kk = chartCategory.m525kk();
                }
                string = objM525kk.toString();
            }
            double dM72972k4 = m72972k4(((ChartSeries) this.f2127h4).getDataPoints().get_Item(i));
            if (C14044b3.m66437kk(dM72972k4)) {
                dM72972k4 = 0.0d;
            }
            if (dictionary.containsKey(string)) {
                dictionary.set_Item(string, Double.valueOf(((Double) dictionary.get_Item(string)).doubleValue() + dM72972k4));
            } else {
                dictionary.addItem(string, Double.valueOf(dM72972k4));
                list.addItem(string);
            }
            i++;
        }
        List.Enumerator it = list.iterator();
        while (it.hasNext()) {
            try {
                String str = (String) it.next();
                C0791b3 c0791b32 = new C0791b3(this);
                c0791b32.m3958k4(str);
                c0791b32.m3955k4(((Double) dictionary.get_Item(str)).doubleValue());
                this.f49879k4.addItem(c0791b32);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: to */
    private void m72971to() {
        ChartSeries chartSeries;
        int i = 0;
        while (true) {
            if (i >= ((ChartSeries) this.f2127h4).getChart().getChartData().getSeries().size()) {
                chartSeries = null;
                break;
            } else {
                if (((ChartSeries) this.f2127h4).getChart().getChartData().getSeries().get_Item(i).getType() == 76) {
                    chartSeries = (ChartSeries) ((ChartSeries) this.f2127h4).getChart().getChartData().getSeries().get_Item(i);
                    break;
                }
                i++;
            }
        }
        if (chartSeries == null) {
            throw new InvalidOperationException("Owner series for Pareto line series can't be found");
        }
        chartSeries.m719c5().m72965fa();
        double dM3950fa = 0.0d;
        for (int i2 = 0; i2 < chartSeries.m719c5().m72973k4(); i2++) {
            if (!C14044b3.m66437kk(((C0791b3) C7019kk.m27452k4((Object) chartSeries.m719c5().m72975k4(i2), C0791b3.class)).m3950fa())) {
                dM3950fa += ((C0791b3) C7019kk.m27452k4((Object) chartSeries.m719c5().m72975k4(i2), C0791b3.class)).m3950fa();
            }
        }
        double dM3950fa2 = 0.0d;
        for (int i3 = 0; i3 < chartSeries.m719c5().m72973k4(); i3++) {
            if (!C14044b3.m66437kk(((C0791b3) C7019kk.m27452k4((Object) chartSeries.m719c5().m72975k4(i3), C0791b3.class)).m3950fa())) {
                dM3950fa2 += ((C0791b3) C7019kk.m27452k4((Object) chartSeries.m719c5().m72975k4(i3), C0791b3.class)).m3950fa();
            }
            C0791b3 c0791b3 = new C0791b3(this);
            if (dM3950fa == 0.0d) {
                dM3950fa = 1.0d;
            }
            c0791b3.m3955k4(dM3950fa2 / dM3950fa);
            this.f49879k4.addItem(c0791b3);
        }
    }

    @Override // java.lang.Iterable
    public final IGenericEnumerator<C0791b3> iterator() {
        return this.f49879k4.iterator();
    }

    /* JADX INFO: renamed from: k4 */
    public final double m72972k4(IChartDataPoint iChartDataPoint) {
        if (((ChartData) m72976kk().getChart().getChartData()).m553x1().mo5710kk() == 2) {
            return iChartDataPoint.getValue().toDouble();
        }
        ChartDataPoint chartDataPoint = (ChartDataPoint) iChartDataPoint;
        if (chartDataPoint.m579c5().m71989k4() == null) {
            return Double.NaN;
        }
        return ((Double) C7019kk.m27464to(chartDataPoint.m579c5().m71989k4(), Double.TYPE)).doubleValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: kk */
    public final ChartSeries m72976kk() {
        return (ChartSeries) this.f2127h4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x1 */
    public final void m72977x1() {
        List<C0791b3> list = new List<>(this.f49879k4);
        this.f49879k4.clear();
        switch (((ChartSeries) this.f2127h4).getType()) {
            case 76:
                m72966h4();
                break;
            case 77:
                m72971to();
                break;
            case 78:
                m72963du();
                break;
            default:
                throw new InvalidOperationException("Aggregated data points are not supported for this series type.");
        }
        m72968k4(list, this.f49879k4);
    }

    /* JADX INFO: renamed from: k4 */
    public final int m72973k4() {
        return this.f49879k4.size();
    }

    /* JADX INFO: renamed from: k4 */
    public final int m72974k4(C0791b3 c0791b3) {
        return this.f49879k4.indexOf(c0791b3);
    }

    /* JADX INFO: renamed from: k4 */
    public final C0791b3 m72975k4(int i) {
        return this.f49879k4.get_Item(i);
    }

    /* JADX INFO: renamed from: k4 */
    private void m72968k4(List<C0791b3> list, List<C0791b3> list2) {
        int iM67507x1 = C14116yg.m67507x1(list2.size(), list.size());
        for (int i = 0; i < iM67507x1; i++) {
            list2.get_Item(i).m3957k4(list.get_Item(i));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    private void m72969k4(double[] dArr, double[] dArr2) {
        double dM72972k4 = m72972k4(((ChartSeries) this.f2127h4).getDataPoints().get_Item(0));
        dArr[0] = dM72972k4;
        if (C14044b3.m66437kk(dM72972k4)) {
            for (int i = 0; i < ((ChartSeries) this.f2127h4).getDataPoints().size(); i++) {
                double dM72972k42 = m72972k4(((ChartSeries) this.f2127h4).getDataPoints().get_Item(i));
                dArr[0] = dM72972k42;
                if (!C14044b3.m66437kk(dM72972k42)) {
                    break;
                }
            }
        }
        dArr2[0] = dArr[0];
        if (((ChartSeries) this.f2127h4).getDataPoints().size() > 1) {
            for (int i2 = 1; i2 < ((ChartSeries) this.f2127h4).getDataPoints().size(); i2++) {
                double dM72972k43 = m72972k4(((ChartSeries) this.f2127h4).getDataPoints().get_Item(i2));
                if (dM72972k43 > dArr2[0]) {
                    dArr2[0] = dM72972k43;
                }
                if (dM72972k43 < dArr[0]) {
                    dArr[0] = dM72972k43;
                }
            }
        }
    }
}

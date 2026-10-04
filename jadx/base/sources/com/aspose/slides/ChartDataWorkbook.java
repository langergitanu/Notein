package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.exceptions.InvalidDataException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p077d8.C3065k4;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p193iv.C5133k4;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C7626f0;
import com.aspose.slides.internal.p332p7.C8089ki;
import com.aspose.slides.internal.p482wr.C12275wy;
import com.aspose.slides.internal.p541z6.C13450to;
import com.aspose.slides.internal.p541z6.C13452x1;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14114y9;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.C14117yj;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.words.ControlChar;
import com.huawei.hms.network.embedded.C18241k5;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class ChartDataWorkbook extends DomObject<ChartData> implements IChartDataWorkbook {

    /* JADX INFO: renamed from: ks */
    private static char f1415ks = 'A';

    /* JADX INFO: renamed from: x6 */
    private static final C7017h4 f1416x6 = new C7017h4("application/vnd.openxmlformats-officedocument.vmlDrawing");

    /* JADX INFO: renamed from: c5 */
    private ChartDataWorksheetCollection f1417c5;

    /* JADX INFO: renamed from: ck */
    private final zxr f1418ck;

    /* JADX INFO: renamed from: du */
    private boolean f1419du;

    /* JADX INFO: renamed from: dy */
    private Chart f1420dy;

    /* JADX INFO: renamed from: fa */
    private final List<KeyValuePair<String, String>> f1421fa;

    /* JADX INFO: renamed from: jd */
    private int f1422jd;

    /* JADX INFO: renamed from: k4 */
    uih f1423k4;

    /* JADX INFO: renamed from: kk */
    djf f1424kk;

    /* JADX INFO: renamed from: m9 */
    private idr f1425m9;

    /* JADX INFO: renamed from: rv */
    private String f1426rv;

    /* JADX INFO: renamed from: to */
    zt8 f1427to;

    /* JADX INFO: renamed from: up */
    private final nc9 f1428up;

    /* JADX INFO: renamed from: x1 */
    mco f1429x1;

    /* JADX INFO: renamed from: yj */
    private final rhq f1430yj;

    public ChartDataWorkbook(IChartData iChartData) {
        super((ChartData) iChartData);
        this.f1418ck = new zxr();
        this.f1421fa = new List<>();
        this.f1428up = new nc9();
        this.f1430yj = new rhq();
        m658k4(new idr(this));
        AbstractC3150x6 abstractC3150x6M21997k4 = C5133k4.m21997k4("template.xlsx");
        try {
            if (abstractC3150x6M21997k4 == null) {
                throw new PptxException("Aspose.Slides.dll is broken.");
            }
            m659k4(abstractC3150x6M21997k4, new C13452x1(C13450to.f45032k4), InterruptionToken.getNone());
            abstractC3150x6M21997k4.dispose();
        } catch (Throwable th) {
            if (abstractC3150x6M21997k4 != null) {
                abstractC3150x6M21997k4.dispose();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: up */
    private void m663up() {
        Dictionary dictionary = new Dictionary();
        IGenericEnumerator<IChartSeries> it = m670fa().getSeries().iterator();
        while (it.hasNext()) {
            try {
                ChartSeries chartSeries = (ChartSeries) it.next();
                if (chartSeries.getName().getDataSourceType() == 0) {
                    String string = chartSeries.getName().toString();
                    String cellsAddressInWorkbook = chartSeries.getName().getCellsAddressInWorkbook();
                    if (!C14113y2.m67411k4(string) && dictionary.containsKey(string) && !C14113y2.m67363du((String) dictionary.get_Item(string), cellsAddressInWorkbook) && (!ChartTypeCharacterizer.isChartTypePie(chartSeries.getType()) || !C14113y2.m67363du(cellsAddressInWorkbook, (String) dictionary.get_Item(string)))) {
                        throw new InvalidDataException(C14113y2.m67408k4("Chart series names must be unique. More than one series named as \"", chartSeries.getName().toString(), "\"."));
                    }
                    if (!dictionary.containsKey(string)) {
                        dictionary.addItem(string, cellsAddressInWorkbook);
                    }
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
    }

    /* JADX INFO: renamed from: x1 */
    private IChartDataWorksheet m664x1(int i) {
        if (i > getWorksheets().size() - 1) {
            int size = i - (getWorksheets().size() - 1);
            for (int i2 = 0; i2 < size; i2++) {
                this.f1417c5.m704k4();
            }
        }
        return getWorksheets().get_Item(i);
    }

    /* JADX INFO: renamed from: c5 */
    public final String m666c5() {
        return this.f1426rv;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.slides.IChartDataWorkbook
    public final void calculateFormulas() {
        m682k4(true);
        List list = new List();
        IGenericEnumerator<IChartDataWorksheet> it = getWorksheets().iterator();
        while (it.hasNext()) {
            try {
                IGenericEnumerator<KeyValuePair<String, SortedList<Long, SortedList<String, ChartDataCell>>>> it2 = ((ChartDataWorksheet) it.next()).m703x1().iterator();
                while (it2.hasNext()) {
                    try {
                        IGenericEnumerator<KeyValuePair<String, ChartDataCell>> it3 = it2.next().getValue().iterator();
                        while (it3.hasNext()) {
                            try {
                                it3 = it3.next().getValue().iterator();
                                while (it3.hasNext()) {
                                    try {
                                        KeyValuePair<String, ChartDataCell> next = it3.next();
                                        if (!C14113y2.m67411k4(next.getValue().getFormula())) {
                                            list.addItem(next.getValue());
                                        }
                                    } finally {
                                        if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                                            it3.dispose();
                                        }
                                    }
                                }
                                if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                                    it3.dispose();
                                }
                            } finally {
                            }
                        }
                        if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                            it3.dispose();
                        }
                    } catch (Throwable th) {
                        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                            it2.dispose();
                        }
                        throw th;
                    }
                }
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            } catch (Throwable th2) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th2;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        try {
            try {
                List.Enumerator it4 = list.iterator();
                while (it4.hasNext()) {
                    try {
                        ((ChartDataCell) it4.next()).calculate(false);
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it4, (Class<IDisposable>) IDisposable.class)) {
                            it4.dispose();
                        }
                    }
                }
                if (C7019kk.m27456k4((Iterator) it4, (Class<IDisposable>) IDisposable.class)) {
                    it4.dispose();
                }
                List.Enumerator it5 = list.iterator();
                while (it5.hasNext()) {
                    try {
                        ((ChartDataCell) it5.next()).calculate(true);
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it5, (Class<IDisposable>) IDisposable.class)) {
                            it5.dispose();
                        }
                    }
                }
                if (C7019kk.m27456k4((Iterator) it5, (Class<IDisposable>) IDisposable.class)) {
                    it5.dispose();
                }
                it4 = list.iterator();
                while (it4.hasNext()) {
                    try {
                        ChartDataCell chartDataCell = (ChartDataCell) it4.next();
                        if (chartDataCell.m559c5().m72689ks().mo3431dy() == 2) {
                            chartDataCell.calculate(true);
                        }
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it4, (Class<IDisposable>) IDisposable.class)) {
                            it4.dispose();
                        }
                    }
                }
                m682k4(false);
            } catch (RuntimeException e) {
                throw e;
            }
        } catch (Throwable th3) {
            m682k4(false);
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ck */
    public final Chart m667ck() {
        Chart chart = this.f1420dy;
        if (chart == null) {
            Chart[] chartArr = {chart};
            kke.m63959k4(Chart.class, (InterfaceC14397rj) this.f2127h4, chartArr);
            this.f1420dy = chartArr[0];
        }
        return this.f1420dy;
    }

    @Override // com.aspose.slides.IChartDataWorkbook
    public final void clear(int i) {
        if (i < getWorksheets().size()) {
            ((ChartDataWorksheet) getWorksheets().get_Item(i)).m703x1().m63040du();
        }
        m690x1().mo5386kk().mo67819k4(getWorksheets().get_Item(i).getName());
    }

    /* JADX INFO: renamed from: du */
    public final nc9 m668du() {
        return this.f1428up;
    }

    /* JADX INFO: renamed from: dy */
    public final ChartDataCell m669dy() {
        ChartDataWorksheet chartDataWorksheetM707x1 = this.f1417c5.m707x1("AUTO_DATA");
        if (chartDataWorksheetM707x1 == null) {
            chartDataWorksheetM707x1 = this.f1417c5.m705k4("AUTO_DATA");
        }
        ChartDataCell chartDataCellM63052x1 = chartDataWorksheetM707x1.m703x1().m63052x1("A1");
        int i = 0;
        int iM564h4 = chartDataCellM63052x1.getValue() != null ? chartDataCellM63052x1.m564h4() + 1 : 0;
        ChartDataCell chartDataCellM63052x12 = chartDataWorksheetM707x1.m703x1().m63052x1("A2");
        int iM564h42 = chartDataCellM63052x12.getValue() != null ? chartDataCellM63052x12.m564h4() : 1;
        if (iM564h4 <= 65535) {
            i = iM564h4;
        } else {
            if (iM564h42 >= 255) {
                throw new InvalidOperationException("You reached the limit of worksheet, but you are able to add data using ChartDataWorkbook.GetCell method");
            }
            iM564h42++;
        }
        chartDataWorksheetM707x1.m703x1().m63052x1("A1").m568k4(i);
        chartDataWorksheetM707x1.m703x1().m63052x1("A2").m568k4(iM564h42);
        return chartDataWorksheetM707x1.m703x1().m63051x1(i, iM564h42);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: fa */
    public final ChartData m670fa() {
        return (ChartData) this.f2127h4;
    }

    @Override // com.aspose.slides.IChartDataWorkbook
    public final IChartDataCell getCell(int i, int i2, int i3) {
        m664x1(i);
        return ((ChartDataWorksheet) getWorksheets().get_Item(i)).m703x1().m63051x1(i2, i3);
    }

    @Override // com.aspose.slides.IChartDataWorkbook
    public final IChartCellCollection getCellCollection(String str, boolean z) {
        ChartCellCollection chartCellCollection = new ChartCellCollection(this);
        chartCellCollection.m545k4(m678k4(str, z, true));
        return chartCellCollection;
    }

    @Override // com.aspose.slides.IChartDataWorkbook
    public final IChartDataWorksheetCollection getWorksheets() {
        return this.f1417c5;
    }

    /* JADX INFO: renamed from: h4 */
    public final rhq m671h4() {
        return this.f1430yj;
    }

    /* JADX INFO: renamed from: jd */
    public final void m672jd() {
        if (m670fa() == null || m670fa().m552to().mo268du().m5180kk() == null) {
            ChartDataWorksheet chartDataWorksheetM673k4 = m673k4(m670fa());
            boolean z = false;
            int[] iArr = {0};
            int[] iArr2 = {0};
            int[] iArr3 = {0};
            int[] iArr4 = {0};
            m683k4(iArr, iArr2, iArr3, iArr4);
            int i = iArr[0];
            int i2 = iArr2[0];
            int i3 = iArr3[0];
            int i4 = iArr4[0];
            if (chartDataWorksheetM673k4 == null || i3 - i <= 0 || i4 - i2 <= 0 || chartDataWorksheetM673k4.m694du().m72414jd() != null) {
                return;
            }
            IGenericEnumerator<kvj> it = chartDataWorksheetM673k4.m696k4().iterator();
            while (it.hasNext()) {
                try {
                    kvj next = it.next();
                    if (next.m64209x1() <= i3 || next.m64204kk() >= i || next.m64207to() <= i4 || next.m64200du() >= i4) {
                        z = true;
                        break;
                    }
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            if (z) {
                return;
            }
            m663up();
            kvj kvjVarM64128k4 = chartDataWorksheetM673k4.m696k4().m64128k4();
            kvjVarM64128k4.m64203k4(i);
            kvjVarM64128k4.m64210x1(i3);
            kvjVarM64128k4.m64205kk(i2);
            kvjVarM64128k4.m64208to(i4);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final ChartDataWorksheet m673k4(ChartData chartData) {
        ISingleCellChartValue colorValue;
        if (m670fa().getSeries().size() <= 0) {
            return null;
        }
        ChartDataPointCollection chartDataPointCollection = (ChartDataPointCollection) m670fa().getSeries().get_Item(0).getDataPoints();
        if (chartDataPointCollection.size() <= 0) {
            return null;
        }
        if (chartDataPointCollection.getDataSourceTypeForValues() == 0 && chartDataPointCollection.get_Item(0).getValue().getAsCell() != null) {
            colorValue = chartDataPointCollection.get_Item(0).getValue();
        } else if (chartDataPointCollection.getDataSourceTypeForXValues() == 0 && chartDataPointCollection.get_Item(0).getXValue().getAsCell() != null) {
            colorValue = chartDataPointCollection.get_Item(0).getXValue();
        } else if (chartDataPointCollection.getDataSourceTypeForYValues() == 0 && chartDataPointCollection.get_Item(0).getYValue().getAsCell() != null) {
            colorValue = chartDataPointCollection.get_Item(0).getYValue();
        } else if (chartDataPointCollection.getDataSourceTypeForBubbleSizes() == 0 && chartDataPointCollection.get_Item(0).getBubbleSize().getAsCell() != null) {
            colorValue = chartDataPointCollection.get_Item(0).getBubbleSize();
        } else if (ChartTypeCharacterizer.m759fa(chartData.getSeries().get_Item(0).getType())) {
            colorValue = chartDataPointCollection.get_Item(0).getSizeValue();
        } else {
            if (chartData.getSeries().get_Item(0).getType() != 81) {
                return null;
            }
            colorValue = chartDataPointCollection.get_Item(0).getColorValue();
        }
        return (ChartDataWorksheet) colorValue.getAsCell().getChartDataWorksheet();
    }

    /* JADX INFO: renamed from: kk */
    public final int m685kk() {
        return this.f1422jd;
    }

    /* JADX INFO: renamed from: m9 */
    public final String m687m9() {
        return m685kk() == 1 ? ".xlsm" : m685kk() == 4 ? "xlsb" : ".xlsx";
    }

    /* JADX INFO: renamed from: to */
    public final zxr m688to() {
        return this.f1418ck;
    }

    public ChartDataWorkbook(IChartData iChartData, AbstractC3150x6 abstractC3150x6, C13452x1 c13452x1, InterruptionToken interruptionToken) {
        super((ChartData) iChartData);
        this.f1418ck = new zxr();
        this.f1421fa = new List<>();
        this.f1428up = new nc9();
        this.f1430yj = new rhq();
        m658k4(new idr(this));
        try {
            m659k4(abstractC3150x6, c13452x1, interruptionToken);
        } catch (C3065k4 e) {
            throw new PptxReadException("Workbook reading aborted.", e);
        }
    }

    /* JADX INFO: renamed from: du */
    private boolean m655du(String str) {
        String[] strArrM67416k4 = C14113y2.m67416k4(str, new char[]{',', ';'}, (short) 1);
        List list = new List();
        for (int i = 0; i < strArrM67416k4.length; i++) {
            if (C14113y2.m67364dy(strArrM67416k4[i], C18241k5.f55433h) >= 0 && list.containsItem(strArrM67416k4[i])) {
                return true;
            }
            list.addItem(strArrM67416k4[i]);
        }
        return false;
    }

    /* JADX INFO: renamed from: h4 */
    private String m656h4(String str) {
        List.Enumerator<KeyValuePair<String, String>> it = this.f1421fa.iterator();
        while (it.hasNext()) {
            try {
                KeyValuePair<String, String> next = it.next();
                if (C14113y2.m67363du(next.getKey(), str)) {
                    return next.getValue();
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (!C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            return null;
        }
        it.dispose();
        return null;
    }

    @Override // com.aspose.slides.IChartDataWorkbook
    public final IChartDataCell getCell(int i, int i2, int i3, Object obj) {
        m664x1(i);
        ChartDataCell chartDataCellM63051x1 = ((ChartDataWorksheet) getWorksheets().get_Item(i)).m703x1().m63051x1(i2, i3);
        chartDataCellM63051x1.m570k4(obj);
        return chartDataCellM63051x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final ChartDataWorksheet m674k4(String str) {
        ChartDataWorksheet chartDataWorksheet;
        IGenericEnumerator<IChartDataWorksheet> it = getWorksheets().iterator();
        while (true) {
            try {
                if (!it.hasNext()) {
                    chartDataWorksheet = null;
                    break;
                }
                chartDataWorksheet = (ChartDataWorksheet) it.next();
                if (C14113y2.m67363du(chartDataWorksheet.getName(), str)) {
                    break;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (chartDataWorksheet != null) {
            return chartDataWorksheet;
        }
        ChartDataWorksheet chartDataWorksheetM704k4 = this.f1417c5.m704k4();
        chartDataWorksheetM704k4.m700k4(str);
        return chartDataWorksheetM704k4;
    }

    /* JADX INFO: renamed from: kk */
    public final List<C14857yq> m686kk(String str) {
        int i;
        int i2;
        int i3;
        int i4;
        List<C14857yq> list = new List<>();
        for (String str2 : C14113y2.m67416k4(str, new char[]{',', ';'}, (short) 1)) {
            String[] strArr = {null};
            String[] strArr2 = {null};
            boolean zM661k4 = m661k4(str2, strArr, strArr2);
            String str3 = strArr[0];
            String str4 = strArr2[0];
            if (zM661k4 && (str4.length() <= 0 || str4.charAt(0) != '#' || androidx.core.content.OooO0O0.OooO00o(1, str4) != '!')) {
                String strM656h4 = m656h4(str4);
                if (!C14113y2.m67411k4(strM656h4)) {
                    return m686kk(strM656h4);
                }
                String[] strArrM67416k4 = C14113y2.m67416k4(str4, new char[]{':'}, (short) 1);
                if (strArrM67416k4.length > 1) {
                    int[] iArr = {0};
                    int[] iArr2 = {0};
                    int[] iArr3 = {0};
                    int[] iArr4 = {0};
                    boolean z = (m660k4(strArrM67416k4[0], iArr, iArr2) && m660k4(strArrM67416k4[1], iArr3, iArr4)) ? false : true;
                    int i5 = iArr[0];
                    int i6 = iArr2[0];
                    int i7 = iArr3[0];
                    int i8 = iArr4[0];
                    if (!z) {
                        i3 = i6;
                        i2 = i7;
                        i4 = i8;
                        i = i5;
                        list.addItem(new C14857yq(str3, i, i2, i3, i4));
                    }
                } else {
                    int[] iArr5 = {0};
                    int[] iArr6 = {0};
                    boolean zM660k4 = m660k4(str4, iArr5, iArr6);
                    int i9 = iArr5[0];
                    int i10 = iArr6[0];
                    if (zM660k4) {
                        i = i9;
                        i2 = i;
                        i3 = i10;
                        i4 = i3;
                        list.addItem(new C14857yq(str3, i, i2, i3, i4));
                    }
                }
            }
        }
        return list;
    }

    /* JADX INFO: renamed from: to */
    public final boolean m689to(String str) {
        for (String str2 : C14113y2.m67416k4(str, new char[]{',', ';'}, (short) 1)) {
            String[] strArr = {null};
            String[] strArr2 = {null};
            boolean zM661k4 = m661k4(str2, strArr, strArr2);
            String str3 = strArr[0];
            String str4 = strArr2[0];
            if (zM661k4) {
                String strM656h4 = m656h4(str4);
                if (!C14113y2.m67411k4(strM656h4)) {
                    return m689to(strM656h4);
                }
                if (this.f1417c5.m707x1(str3) == null) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: x1 */
    public final idr m690x1() {
        return this.f1425m9;
    }

    @Override // com.aspose.slides.IChartDataWorkbook
    public final IChartDataCell getCell(int i, String str) {
        m664x1(i);
        return ((ChartDataWorksheet) getWorksheets().get_Item(i)).m703x1().m63052x1(str);
    }

    /* JADX INFO: renamed from: k4 */
    public final List<C14857yq> m675k4(long j, String[] strArr) {
        new List();
        boolean zM655du = m655du(strArr[0]);
        List<C14857yq> listM686kk = m686kk(strArr[0]);
        String[] strArr2 = {null};
        m661k4(strArr[0], new String[]{null}, strArr2);
        String str = strArr2[0];
        List.Enumerator<C14857yq> it = listM686kk.iterator();
        int iM67483k4 = 0;
        while (it.hasNext()) {
            try {
                C14857yq next = it.next();
                iM67483k4 += C14116yg.m67483k4(next.m74065to(), next.m74064m9());
            } finally {
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        if (!zM655du && listM686kk.size() != 0 && iM67483k4 >= (4294967295L & j)) {
            return listM686kk;
        }
        String strM67408k4 = C14113y2.m67408k4("Repared", "!", C14113y2.m67407k4("$", Character.valueOf(f1415ks), "$1:$", Character.valueOf(f1415ks), "$", C14114y9.m67465x1(j)));
        strArr[0] = strM67408k4;
        List<C14857yq> listM686kk2 = m686kk(strM67408k4);
        if (C14113y2.m67411k4(str)) {
            m681k4(str, strArr[0]);
        }
        f1415ks = (char) (f1415ks + 1);
        return listM686kk2;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m691x1(String str) {
        this.f1426rv = str;
    }

    /* JADX INFO: renamed from: x1 */
    private void m665x1(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        IGenericEnumerator<IChartCategory> it;
        ChartData chartDataM670fa = m670fa();
        if (chartDataM670fa.getCategories().getUseCells()) {
            it = chartDataM670fa.getCategories().iterator();
            while (it.hasNext()) {
                try {
                    ChartCategory chartCategory = (ChartCategory) it.next();
                    for (int i = 0; i < chartDataM670fa.getCategories().getGroupingLevelCount(); i++) {
                        m657k4(chartCategory.getGroupingLevels().get_Item(i), iArr, iArr2, iArr3, iArr4);
                    }
                } finally {
                }
            }
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                it.dispose();
            }
        }
        if (chartDataM670fa.getUseSecondaryCategories() && chartDataM670fa.getSecondaryCategories().getUseCells()) {
            it = chartDataM670fa.getSecondaryCategories().iterator();
            while (it.hasNext()) {
                try {
                    ChartCategory chartCategory2 = (ChartCategory) it.next();
                    for (int i2 = 0; i2 < chartDataM670fa.getSecondaryCategories().getGroupingLevelCount(); i2++) {
                        m657k4(chartCategory2.getGroupingLevels().get_Item(i2), iArr, iArr2, iArr3, iArr4);
                    }
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
        }
    }

    @Override // com.aspose.slides.IChartDataWorkbook
    public final IChartDataCell getCell(int i, String str, Object obj) {
        m664x1(i);
        ChartDataCell chartDataCellM63052x1 = ((ChartDataWorksheet) getWorksheets().get_Item(i)).m703x1().m63052x1(str);
        chartDataCellM63052x1.m570k4(obj);
        return chartDataCellM63052x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final List<C14857yq> m676k4(C7626f0 c7626f0) {
        new List();
        long jM38332k4 = c7626f0.m31515kk().m39372kk().m38332k4();
        String[] strArr = {c7626f0.m31517x1()};
        List<C14857yq> listM675k4 = m675k4(jM38332k4, strArr);
        String str = strArr[0];
        if (listM675k4.size() > 0) {
            c7626f0.m31514k4(str);
        }
        return listM675k4;
    }

    @Override // com.aspose.slides.IChartDataWorkbook
    public final IChartDataCell getCell(String str, int i, int i2) {
        return m674k4(str).m703x1().m63051x1(i, i2);
    }

    /* JADX INFO: renamed from: k4 */
    public final List<C14857yq> m677k4(C8089ki c8089ki) {
        new List();
        long jM38332k4 = c8089ki.m35404kk().m29589to().m38332k4();
        String[] strArr = {c8089ki.m35406x1()};
        List<C14857yq> listM675k4 = m675k4(jM38332k4, strArr);
        String str = strArr[0];
        if (listM675k4.size() > 0) {
            c8089ki.m35403k4(str);
        }
        return listM675k4;
    }

    /* JADX INFO: renamed from: kk */
    private void m662kk(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        new Dictionary();
        IGenericEnumerator<IChartDataCell> it = m670fa().getSeries().iterator();
        while (it.hasNext()) {
            try {
                ChartSeries chartSeries = (ChartSeries) it.next();
                if (chartSeries.getName().getDataSourceType() == 0) {
                    it = chartSeries.getName().getAsCells().iterator();
                    while (it.hasNext()) {
                        try {
                            m657k4((ChartDataCell) it.next(), iArr, iArr2, iArr3, iArr4);
                        } finally {
                            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                                it.dispose();
                            }
                        }
                    }
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
                it = chartSeries.getDataPoints().iterator();
                while (it.hasNext()) {
                    try {
                        IChartDataPoint next = it.next();
                        if (chartSeries.getDataPoints().getDataSourceTypeForValues() == 0) {
                            m657k4(next.getValue().getAsCell(), iArr, iArr2, iArr3, iArr4);
                        }
                        if (chartSeries.getDataPoints().getDataSourceTypeForXValues() == 0) {
                            m657k4(next.getXValue().getAsCell(), iArr, iArr2, iArr3, iArr4);
                        }
                        if (chartSeries.getDataPoints().getDataSourceTypeForYValues() == 0) {
                            m657k4(next.getYValue().getAsCell(), iArr, iArr2, iArr3, iArr4);
                        }
                        if (chartSeries.getDataPoints().getDataSourceTypeForBubbleSizes() == 0) {
                            m657k4(next.getBubbleSize().getAsCell(), iArr, iArr2, iArr3, iArr4);
                        }
                    } finally {
                    }
                }
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final List<ChartDataCell> m678k4(String str, boolean z, boolean z2) {
        List<ChartDataCell> list = new List<>();
        List.Enumerator<C14857yq> it = m686kk(str).iterator();
        while (it.hasNext()) {
            try {
                C14857yq next = it.next();
                ChartDataWorksheet chartDataWorksheetM674k4 = z2 ? m674k4(next.m74062k4()) : this.f1417c5.m707x1(next.m74062k4());
                if (chartDataWorksheetM674k4 != null) {
                    for (int iM74060du = next.m74060du(); iM74060du <= next.m74061h4(); iM74060du++) {
                        for (int iM74066x1 = next.m74066x1(); iM74066x1 <= next.m74063kk(); iM74066x1++) {
                            ChartDataCell chartDataCellM63051x1 = chartDataWorksheetM674k4.m703x1().m63051x1(iM74060du, iM74066x1);
                            if (!chartDataCellM63051x1.isHidden() || !z) {
                                list.addItem(chartDataCellM63051x1);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        return list;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m679k4(int i) {
        this.f1422jd = i;
    }

    /* JADX INFO: renamed from: k4 */
    private static void m657k4(IChartDataCell iChartDataCell, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        if (iChartDataCell == null) {
            return;
        }
        if (iChartDataCell.getColumn() < iArr[0]) {
            iArr[0] = iChartDataCell.getColumn();
        }
        if (iChartDataCell.getRow() < iArr2[0]) {
            iArr2[0] = iChartDataCell.getRow();
        }
        if (iChartDataCell.getColumn() > iArr3[0]) {
            iArr3[0] = iChartDataCell.getColumn();
        }
        if (iChartDataCell.getRow() > iArr4[0]) {
            iArr4[0] = iChartDataCell.getRow();
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m658k4(idr idrVar) {
        this.f1425m9 = idrVar;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m680k4(AbstractC3150x6 abstractC3150x6) {
        C12275wy c12275wy = new C12275wy();
        try {
            new ik7().m7664k4(this, c12275wy, m685kk());
            c12275wy.m57507x1(abstractC3150x6);
        } finally {
            c12275wy.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m659k4(AbstractC3150x6 abstractC3150x6, C13452x1 c13452x1, InterruptionToken interruptionToken) {
        if (abstractC3150x6.getPosition() != 0) {
            if (abstractC3150x6.canSeek()) {
                abstractC3150x6.seek(0L, 0);
            } else {
                byte[] bArr = new byte[4096];
                C3152yj c3152yj = new C3152yj((int) 0);
                while (true) {
                    int i = abstractC3150x6.read(bArr, 0, 4096);
                    if (i == 0) {
                        break;
                    } else {
                        c3152yj.write(bArr, 0, i);
                    }
                }
                c3152yj.seek(0L, 0);
                abstractC3150x6 = c3152yj;
            }
        }
        byte b = (byte) abstractC3150x6.readByte();
        abstractC3150x6.seek(-1L, 1);
        if (b != 80) {
            throw new InvalidOperationException("Unsupported workbook file format");
        }
        this.f1417c5 = new ChartDataWorksheetCollection(this);
        this.f1429x1 = new mco(this);
        new x8n().m73194k4(this, abstractC3150x6, c13452x1, interruptionToken);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m681k4(String str, String str2) {
        if (C14113y2.m67411k4(str)) {
            return;
        }
        this.f1421fa.addItem(new KeyValuePair(str, str2).Clone());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m682k4(boolean z) {
        this.f1419du = z;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m683k4(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        boolean z;
        iArr2[0] = Integer.MAX_VALUE;
        iArr[0] = Integer.MAX_VALUE;
        iArr4[0] = Integer.MIN_VALUE;
        iArr3[0] = Integer.MIN_VALUE;
        IGenericEnumerator<IChartSeries> it = m670fa().getSeries().iterator();
        while (true) {
            try {
                if (!it.hasNext()) {
                    z = true;
                    break;
                }
                ChartSeries chartSeries = (ChartSeries) it.next();
                if (chartSeries.getName().getDataSourceType() == 0 && chartSeries.getName().getAsCells().getCount() == 0) {
                    z = false;
                    break;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (z) {
            m665x1(iArr, iArr2, iArr3, iArr4);
            m662kk(iArr, iArr2, iArr3, iArr4);
        }
        if (iArr[0] == Integer.MAX_VALUE) {
            iArr[0] = 0;
        }
        if (iArr2[0] == Integer.MAX_VALUE) {
            iArr2[0] = 0;
        }
        if (iArr3[0] == Integer.MIN_VALUE) {
            iArr3[0] = 0;
        }
        if (iArr4[0] == Integer.MIN_VALUE) {
            iArr4[0] = 0;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m684k4() {
        return this.f1419du;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m660k4(String str, int[] iArr, int[] iArr2) {
        int i;
        String strM67440x1 = C14113y2.m67440x1(str);
        int length = strM67440x1.length() - 1;
        while (length >= 0 && C14117yj.m67539to(strM67440x1.charAt(length))) {
            length--;
        }
        int i2 = length + 1;
        String strM67358c5 = C14113y2.m67358c5(C14113y2.m67423kk(C14113y2.m67443x1(strM67440x1, 0, i2), '$', ControlChar.SPACE_CHAR));
        String strOooO00o = OooO0OO.OooO00o(i2, i2, strM67440x1, strM67440x1);
        iArr[0] = 0;
        for (int i3 = 0; i3 < strM67358c5.length(); i3++) {
            iArr[0] = C7019kk.m27462to(Double.valueOf(C14116yg.m67469du(26.0d, ((double) (strM67358c5.length() - i3)) - 1.0d) * ((double) (strM67358c5.charAt(i3) - '@'))), 14) + iArr[0];
        }
        iArr[0] = iArr[0] - 1;
        if (strOooO00o.length() > 0) {
            int i4 = strOooO00o.charAt(0) == '-' ? 1 : 0;
            i = 0;
            for (int i5 = i4; i5 < strOooO00o.length(); i5++) {
                char cCharAt = strOooO00o.charAt(i5);
                if (cCharAt < '0' || cCharAt > '9') {
                    i = 0;
                    break;
                }
                i = (i * 10) + (cCharAt - '0');
            }
            if (i4 != 0) {
                i *= -1;
            }
        } else {
            i = 0;
        }
        iArr2[0] = i - 1;
        return ("".equals(strM67358c5) || "".equals(strOooO00o)) ? false : true;
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m661k4(String str, String[] strArr, String[] strArr2) {
        int iM67429to;
        String strM67401k4 = C14113y2.m67401k4(C14113y2.m67401k4(str, ")", C14113y2.f47374k4), "(", C14113y2.f47374k4);
        int iM67429to2 = C14113y2.m67429to(strM67401k4, '[');
        int iM67429to3 = C14113y2.m67429to(strM67401k4, ']');
        if (iM67429to2 > -1 && iM67429to3 > iM67429to2) {
            strM67401k4 = C14113y2.m67396k4(strM67401k4, iM67429to2, (iM67429to3 - iM67429to2) + 1);
        }
        strM67401k4.length();
        if (strM67401k4.length() <= 2 || strM67401k4.charAt(0) != '\'') {
            iM67429to = C14113y2.m67429to(strM67401k4, '!');
        } else {
            iM67429to = C14113y2.m67418kk(strM67401k4, '\'') + 1;
            if (iM67429to == 1) {
                String str2 = C14113y2.f47374k4;
                strArr2[0] = str2;
                strArr[0] = str2;
                return false;
            }
        }
        if (iM67429to <= 0) {
            String str3 = C14113y2.f47374k4;
            strArr2[0] = str3;
            strArr[0] = str3;
            return false;
        }
        String strM67443x1 = C14113y2.m67443x1(strM67401k4, 0, iM67429to);
        strArr[0] = strM67443x1;
        if (strM67443x1.length() > 2 && strArr[0].charAt(0) == '\'' && androidx.core.content.OooO0O0.OooO00o(1, strArr[0]) == '\'') {
            String str4 = strArr[0];
            strArr[0] = OooO0OO.OooO00o(2, 1, str4, str4);
        }
        int i = iM67429to + 1;
        strArr2[0] = OooO0OO.OooO00o(i, i, strM67401k4, strM67401k4);
        return true;
    }
}

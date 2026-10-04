package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.NullReferenceException;
import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p205ji.C5449c5;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.internal.p332p7.C7876hr;
import com.aspose.slides.internal.p332p7.C7922id;
import com.aspose.slides.internal.p332p7.C8087kh;
import com.aspose.slides.internal.p332p7.C8212lu;
import com.aspose.slides.internal.p332p7.C8294mw;
import com.aspose.slides.internal.p332p7.C8324nc;
import com.aspose.slides.internal.p332p7.C8557py;
import com.aspose.slides.internal.p332p7.C8572q2;
import com.aspose.slides.internal.p332p7.C8663rb;
import com.aspose.slides.internal.p332p7.C8754sb;
import com.aspose.slides.internal.p332p7.C9192xf;
import com.aspose.slides.internal.p332p7.C9296ym;
import com.aspose.slides.internal.p332p7.C9311yt;
import com.aspose.slides.internal.p332p7.C9326yy;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14047bz;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14114y9;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.kh */
/* JADX INFO: loaded from: classes3.dex */
class C13728kh {
    /* JADX INFO: renamed from: k4 */
    public static List<C7394ca> m63854k4(C8324nc c8324nc, C8663rb c8663rb) {
        if (c8324nc.m37399up() == null) {
            return null;
        }
        long jM39315k4 = c8324nc.m37399up().m39315k4();
        for (C8557py c8557py : c8663rb.m39945x1()) {
            if (c8557py.m39197k4() == jM39315k4) {
                return c8557py.m39200x1();
            }
        }
        throw new Exception(C14113y2.m67408k4("Can't find chartData.Data element with id = ", C14114y9.m67465x1(jM39315k4)));
    }

    /* JADX INFO: renamed from: x1 */
    private static int m63867x1(IChartSeries iChartSeries) {
        switch (iChartSeries.getType()) {
            case 74:
                return 7;
            case 75:
                return 6;
            case 76:
                return 2;
            case 77:
                return 4;
            case 78:
                return 1;
            case 79:
                return 8;
            case 80:
                return 3;
            case 81:
                return 5;
            default:
                throw new Exception("Unknown series type");
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static C9311yt m63855k4(IGenericEnumerable<C7394ca> iGenericEnumerable, int i) {
        IGenericEnumerator<C7394ca> it = iGenericEnumerable.iterator();
        while (it.hasNext()) {
            try {
                C9311yt c9311yt = (C9311yt) C7019kk.m27452k4((Object) it.next().m29542x1(), C9311yt.class);
                if (c9311yt != null && c9311yt.m45129kk() == i) {
                    return c9311yt;
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

    /* JADX INFO: renamed from: x1 */
    private static void m63868x1(IChartSeries iChartSeries, C8324nc c8324nc) {
        String strM66987ks;
        boolean z = ((ChartData) iChartSeries.getChart().getChartData()).m553x1().mo5710kk() != 2;
        if (z) {
            if (C14113y2.m67411k4(((ChartSeries) iChartSeries).m725jd())) {
                return;
            }
        } else if (iChartSeries.getName().getAsCells().getCount() == 0) {
            return;
        }
        C8754sb c8754sb = (C8754sb) c8324nc.m37385k4().m37150k4("txData").m29542x1();
        C8212lu c8212lu = new C8212lu();
        if (z) {
            ChartSeries chartSeries = (ChartSeries) iChartSeries;
            c8212lu.m36438k4(chartSeries.m720ck());
            c8754sb.m40879k4(c8212lu);
            strM66987ks = chartSeries.m725jd();
        } else {
            IChartCellCollection asCells = iChartSeries.getName().getAsCells();
            c8212lu.m36438k4(iChartSeries.getName().getCellsAddressInWorkbook());
            c8754sb.m40879k4(c8212lu);
            strM66987ks = C14080ne.m66987ks(asCells.get_Item(0).getValue(), C11697x1.m55250kk());
        }
        c8754sb.m40880k4(strM66987ks);
    }

    /* JADX INFO: renamed from: k4 */
    private static AbstractC14443sc m63856k4(int i) {
        switch (i) {
            case 74:
                return new nwb();
            case 75:
                return new eyk();
            case 76:
                return new C0825bo();
            case 77:
                return new C0911dr();
            case 78:
                return new C14781xc();
            case 79:
                return new l3o();
            case 80:
                return new C13723kc();
            case 81:
                return new jtx();
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: x1 */
    private static void m63869x1(IChartSeries iChartSeries, final C8324nc c8324nc, u8s u8sVar) {
        m63860k4(iChartSeries);
        ChartCategoryCollection chartCategoryCollection = (ChartCategoryCollection) iChartSeries.getChart().getChartData().getCategories();
        for (int i = 0; i < chartCategoryCollection.size(); i++) {
            for (int groupingLevelCount = chartCategoryCollection.getGroupingLevelCount() - 1; groupingLevelCount >= 0; groupingLevelCount--) {
                ChartDataPointLevel chartDataPointLevel = (ChartDataPointLevel) C7019kk.m27452k4((Object) iChartSeries.getDataPoints().get_Item(i).getDataPointLevels().get_Item(groupingLevelCount), ChartDataPointLevel.class);
                if (chartDataPointLevel.m646dy() != -1) {
                    C14299pr.m69195k4(chartDataPointLevel, new AbstractC4685kk<C9296ym>() { // from class: com.aspose.slides.kh.5
                        @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                        public String getDelegateId() {
                            return System.identityHashCode(c8324nc) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.cx_CT_SeriesElementData.AddDataPt()";
                        }

                        @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                        /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                        public C9296ym invoke() {
                            return c8324nc.m37394kk();
                        }
                    }, u8sVar);
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static String m63857k4(String str) {
        String strM55062ne = C5449c5.m22523k4().m22531h4().m55263fa().m55062ne();
        String strM55050ix = C5449c5.m22523k4().m22531h4().m55263fa().m55050ix();
        String strM67401k4 = C14113y2.m67401k4(C14113y2.m67401k4(str, ",", strM55050ix), ".", strM55050ix);
        int iM67430to = C14113y2.m67430to(strM67401k4, strM55050ix);
        return iM67430to == -1 ? strM67401k4 : C14113y2.m67397k4(C14113y2.m67396k4(strM67401k4, iM67430to, strM55050ix.length()), iM67430to, strM55062ne);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m63858k4(ChartSeries chartSeries, C9296ym c9296ym, gnb gnbVar) {
        long jM45062x1 = c9296ym.m45062x1();
        if (chartSeries.getType() == 74 || chartSeries.getType() == 75) {
            IChartDataPointLevel iChartDataPointLevelM622k4 = ((ChartDataPointCollection) chartSeries.getDataPoints()).m622k4((int) jM45062x1);
            if (iChartDataPointLevelM622k4 != null) {
                C14864yx.m74128k4(iChartDataPointLevelM622k4.getFormat(), c9296ym.m45060kk(), gnbVar);
                return;
            }
            return;
        }
        if (chartSeries.getType() != 76) {
            C14299pr.m69197k4(chartSeries.getDataPoints().getOrCreateDataPointByIdx(jM45062x1), c9296ym, gnbVar);
            return;
        }
        C0791b3 c0791b3M72975k4 = ((long) (chartSeries.m719c5().m72973k4() + (-1))) >= (4294967295L & jM45062x1) ? chartSeries.m719c5().m72975k4((int) jM45062x1) : null;
        if (c0791b3M72975k4 != null) {
            C14864yx.m74128k4(c0791b3M72975k4.m3949dy(), c9296ym.m45060kk(), gnbVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void m63859k4(IChartCellCollection iChartCellCollection, C8557py c8557py, int i) {
        int i2;
        int i3;
        C9311yt c9311yt = (C9311yt) c8557py.m39198k4("numDim").m29542x1();
        C8212lu c8212lu = new C8212lu();
        c8212lu.m36438k4(iChartCellCollection.getCellsAddress());
        c9311yt.m45128k4(c8212lu);
        if (i != 0) {
            if (i == 1) {
                c9311yt.m45127k4(3);
            } else if (i == 3) {
                c9311yt.m45127k4(1);
            } else if (i == 8) {
                i2 = 4;
            } else if (i == 9) {
                i2 = 6;
            }
            C9326yy c9326yyM45131x1 = c9311yt.m45131x1();
            long count = ((long) iChartCellCollection.getCount()) & 4294967295L;
            for (i3 = 0; i3 < iChartCellCollection.getCount(); i3++) {
                ChartDataCell chartDataCell = (ChartDataCell) iChartCellCollection.get_Item(i3);
                if (chartDataCell.getValue() != null) {
                    C7876hr c7876hrM45271k4 = c9326yyM45131x1.m45271k4();
                    c7876hrM45271k4.m33598k4(((long) i3) & 4294967295L);
                    if ((((c7876hrM45271k4.m33597k4() & 4294967295L) + 1) & 4294967295L) > (count & 4294967295L)) {
                        count = ((c7876hrM45271k4.m33597k4() & 4294967295L) + 1) & 4294967295L;
                    }
                    String strM66987ks = C14080ne.m66987ks(chartDataCell.m559c5().m72689ks().f3861k4, C11697x1.m55250kk());
                    if (!AbstractC13703jv.m63556k4(strM66987ks, new double[]{0.0d})) {
                        strM66987ks = "0";
                    }
                    c7876hrM45271k4.m33599k4(strM66987ks);
                }
            }
            c9326yyM45131x1.m45272k4(count);
            if (iChartCellCollection.getCount() > 0 || "".equals(C14113y2.m67440x1(iChartCellCollection.get_Item(0).getCustomNumberFormat()))) {
            }
            c9326yyM45131x1.m45273k4(m63857k4(iChartCellCollection.get_Item(0).getCustomNumberFormat()));
            return;
        }
        i2 = 2;
        c9311yt.m45127k4(i2);
        C9326yy c9326yyM45131x12 = c9311yt.m45131x1();
        long count2 = ((long) iChartCellCollection.getCount()) & 4294967295L;
        while (i3 < iChartCellCollection.getCount()) {
        }
        c9326yyM45131x12.m45272k4(count2);
        if (iChartCellCollection.getCount() > 0) {
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m63860k4(IChartSeries iChartSeries) {
        ChartCategoryCollection chartCategoryCollection = (ChartCategoryCollection) iChartSeries.getChart().getChartData().getCategories();
        String[] strArr = new String[chartCategoryCollection.getGroupingLevelCount()];
        int i = -1;
        for (int i2 = 0; i2 < chartCategoryCollection.size(); i2++) {
            for (int groupingLevelCount = chartCategoryCollection.getGroupingLevelCount() - 1; groupingLevelCount >= 0 && i2 <= iChartSeries.getDataPoints().size() - 1; groupingLevelCount--) {
                ChartDataPointLevel chartDataPointLevel = (ChartDataPointLevel) C7019kk.m27452k4((Object) iChartSeries.getDataPoints().get_Item(i2).getDataPointLevels().get_Item(groupingLevelCount), ChartDataPointLevel.class);
                if (chartCategoryCollection.getGroupingLevelCount() != 1) {
                    Object objM523k4 = ((ChartCategory) chartCategoryCollection.get_Item(i2)).m523k4(groupingLevelCount);
                    if (objM523k4 != null) {
                        String string = objM523k4.toString();
                        if (i2 == 0) {
                            strArr[groupingLevelCount] = string;
                        } else if (!C14113y2.m67363du(string, strArr[groupingLevelCount]) && !C14113y2.m67411k4(string)) {
                            strArr[groupingLevelCount] = string;
                        }
                        i++;
                        chartDataPointLevel.m649k4(i);
                    }
                    chartDataPointLevel.m649k4(-1);
                } else {
                    i++;
                    chartDataPointLevel.m649k4(i);
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m63861k4(IChartSeries iChartSeries, int i, C8557py c8557py, IChartDataWorkbook iChartDataWorkbook) {
        if (m63866k4(iChartSeries.getType(), i)) {
            IChartCellCollection cellCollection = iChartDataWorkbook.getCellCollection("", true);
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
            m63859k4(cellCollection, c8557py, i);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m63862k4(IChartSeries iChartSeries, C8324nc c8324nc) {
        String strM36437k4;
        C8294mw c8294mwM37381dy = c8324nc.m37381dy();
        if (c8294mwM37381dy == null) {
            strM36437k4 = "";
        } else {
            if (!"txData".equals(c8294mwM37381dy.m37149k4().m29539k4())) {
                throw new Exception(C14113y2.m67408k4("Unknown element \"", c8294mwM37381dy.m37149k4().m29539k4(), "\""));
            }
            strM36437k4 = ((C8754sb) C7019kk.m27452k4((Object) c8294mwM37381dy.m37149k4().m29542x1(), C8754sb.class)).m40878k4().m36437k4();
        }
        if ("".equals(strM36437k4)) {
            return;
        }
        iChartSeries.getName().setDataSourceType(0);
        ((ChartSeries) C7019kk.m27452k4((Object) iChartSeries, ChartSeries.class)).m732kk(strM36437k4);
        ((ChartSeries) iChartSeries).f1473k4.addItem(((C8754sb) C7019kk.m27452k4((Object) c8294mwM37381dy.m37149k4().m29542x1(), C8754sb.class)).m40881x1());
    }

    /* JADX INFO: renamed from: k4 */
    public static void m63863k4(IChartSeries iChartSeries, C8324nc c8324nc, C9192xf c9192xf, C14144mu c14144mu) {
        C13821m5 c13821m5M726k4 = ((ChartSeries) iChartSeries).m726k4();
        gnb gnbVarM4229k4 = c14144mu.m67731k4().m4229k4();
        C14864yx.m74128k4(iChartSeries.getFormat(), c8324nc.m37378c5(), gnbVarM4229k4);
        m63862k4(iChartSeries, c8324nc);
        c13821m5M726k4.m64752k4(c8324nc.m37396ks());
        List<C7394ca> listM63854k4 = m63854k4(c8324nc, c9192xf.m44324x1());
        C14764x4.m73097k4(iChartSeries, listM63854k4, 0);
        C14764x4.m73097k4(iChartSeries, listM63854k4, 1);
        C14764x4.m73097k4(iChartSeries, listM63854k4, 8);
        C14764x4.m73097k4(iChartSeries, listM63854k4, 3);
        C14764x4.m73097k4(iChartSeries, listM63854k4, 9);
        if (ChartTypeCharacterizer.m768up(iChartSeries.getType())) {
            ((ChartSeries) iChartSeries).m722dy();
        }
        if (c8324nc.m37379ck() != null) {
            for (C9296ym c9296ym : c8324nc.m37379ck()) {
                m63858k4((ChartSeries) iChartSeries, c9296ym, gnbVarM4229k4);
            }
        }
        if (c8324nc.m37402yj() != null) {
            AbstractC14443sc abstractC14443scM63856k4 = m63856k4(iChartSeries.getType());
            if (abstractC14443scM63856k4 == null) {
                throw new NullReferenceException("LayoutParser cannot be null.");
            }
            abstractC14443scM63856k4.mo4281k4((ChartSeries) iChartSeries, c8324nc.m37402yj());
        }
        c13821m5M726k4.m64757k4(c8324nc.m37383h4());
        if (c8324nc.m37384jd() != null) {
            c13821m5M726k4.m64756k4(c8324nc.m37384jd());
        }
        c13821m5M726k4.m64762x1(c8324nc.m37397m9());
        C1255ik.m7651k4(iChartSeries.getLabels(), c8324nc.m37382fa(), gnbVarM4229k4);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m63864k4(IChartSeries iChartSeries, final C8324nc c8324nc, C9192xf c9192xf, C14786xh c14786xh) {
        if (ChartTypeCharacterizer.m768up(iChartSeries.getType())) {
            ((ChartSeries) iChartSeries).m722dy();
        }
        ChartSeries chartSeries = (ChartSeries) iChartSeries;
        C13821m5 c13821m5M726k4 = chartSeries.m726k4();
        C14864yx.m74127k4(iChartSeries.getFormat(), new AbstractC4685kk<C8087kh>() { // from class: com.aspose.slides.kh.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(c8324nc) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.cx_CT_SeriesElementData.AddSpPr()";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public C8087kh invoke() {
                return c8324nc.m37400x1();
            }
        }, c14786xh.m73359k4().m70580k4(), null, false);
        c8324nc.m37388k4(c13821m5M726k4.m64760to());
        m63868x1(iChartSeries, c8324nc);
        c8324nc.m37392k4(C14113y2.m67407k4("{", C14047bz.m66536x1(), "}"));
        c8324nc.m37386k4(m63867x1(iChartSeries));
        if (iChartSeries.getType() == 77) {
            c8324nc.m37401x1(0L);
            c8324nc.m37387k4(2L);
            return;
        }
        C8557py c8557pyM39943k4 = c9192xf.m44324x1().m39943k4();
        c8557pyM39943k4.m39199k4(((((long) c9192xf.m44324x1().m39945x1().length) & 4294967295L) - 1) & 4294967295L);
        C8572q2 c8572q2 = new C8572q2();
        c8572q2.m39316k4(c8557pyM39943k4.m39197k4());
        c8324nc.m37390k4(c8572q2);
        ChartData chartData = (ChartData) iChartSeries.getChart().getChartData();
        if (iChartSeries.getChart().getChartData().getCategories().size() > 0) {
            if (chartData.m553x1().mo5710kk() == 2) {
                C14298pq.m69187k4((ChartCategoryCollection) iChartSeries.getChart().getChartData().getCategories(), c8557pyM39943k4);
            } else {
                C14764x4.m73093k4((ChartCategoryCollection) iChartSeries.getChart().getChartData().getCategories(), c8557pyM39943k4);
            }
        }
        if (chartData.m553x1().mo5710kk() == 2) {
            m63861k4(iChartSeries, 8, c8557pyM39943k4, iChartSeries.getChart().getChartData().getChartDataWorkbook());
            m63861k4(iChartSeries, 3, c8557pyM39943k4, iChartSeries.getChart().getChartData().getChartDataWorkbook());
            m63861k4(iChartSeries, 0, c8557pyM39943k4, iChartSeries.getChart().getChartData().getChartDataWorkbook());
            m63861k4(iChartSeries, 1, c8557pyM39943k4, iChartSeries.getChart().getChartData().getChartDataWorkbook());
            m63861k4(iChartSeries, 9, c8557pyM39943k4, iChartSeries.getChart().getChartData().getChartDataWorkbook());
        } else {
            C14764x4.m73095k4(chartSeries, 8, c8557pyM39943k4);
            C14764x4.m73095k4(chartSeries, 3, c8557pyM39943k4);
            C14764x4.m73095k4(chartSeries, 0, c8557pyM39943k4);
            C14764x4.m73095k4(chartSeries, 1, c8557pyM39943k4);
            C14764x4.m73095k4(chartSeries, 9, c8557pyM39943k4);
        }
        m63865k4(iChartSeries, c8324nc, c14786xh.m73359k4().m70580k4());
        AbstractC14443sc abstractC14443scM63856k4 = m63856k4(iChartSeries.getType());
        if (abstractC14443scM63856k4 == null) {
            throw new NullReferenceException("LayoutParser cannot be null.");
        }
        abstractC14443scM63856k4.mo4282k4(chartSeries, c8324nc);
        c8324nc.m37393k4(c13821m5M726k4.m64759m9());
        c8324nc.m37391k4(c13821m5M726k4.m64749h4());
        if ((c13821m5M726k4.m64748dy() & 4294967295L) != 4294967295L) {
            c8324nc.m37395kk(c13821m5M726k4.m64748dy());
        }
        C1255ik.m7650k4(iChartSeries.getLabels(), new AbstractC4685kk<C7922id>() { // from class: com.aspose.slides.kh.2
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(c8324nc) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.cx_CT_SeriesElementData.AddDataLabels()";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public C7922id invoke() {
                return c8324nc.m37398to();
            }
        }, c14786xh.m73359k4().m70580k4());
    }

    /* JADX INFO: renamed from: k4 */
    private static void m63865k4(IChartSeries iChartSeries, final C8324nc c8324nc, u8s u8sVar) {
        if (iChartSeries.getType() == 75 || iChartSeries.getType() == 74) {
            m63869x1(iChartSeries, c8324nc, u8sVar);
            return;
        }
        if (iChartSeries.getType() == 76) {
            ChartSeries chartSeries = (ChartSeries) iChartSeries;
            for (int i = 0; i < chartSeries.m719c5().m72973k4(); i++) {
                C14299pr.m69198k4(chartSeries.m719c5().m72975k4(i), new AbstractC4685kk<C9296ym>() { // from class: com.aspose.slides.kh.3
                    @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                    public String getDelegateId() {
                        return System.identityHashCode(c8324nc) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.cx_CT_SeriesElementData.AddDataPt()";
                    }

                    @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                    public C9296ym invoke() {
                        return c8324nc.m37394kk();
                    }
                }, ((long) i) & 4294967295L, u8sVar);
            }
            return;
        }
        IGenericEnumerator<IChartDataPoint> it = iChartSeries.getDataPoints().iterator();
        while (it.hasNext()) {
            try {
                IChartDataPoint next = it.next();
                C14299pr.m69196k4(next, new AbstractC4685kk<C9296ym>() { // from class: com.aspose.slides.kh.4
                    @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                    public String getDelegateId() {
                        return System.identityHashCode(c8324nc) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.cx_CT_SeriesElementData.AddDataPt()";
                    }

                    @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                    public C9296ym invoke() {
                        return c8324nc.m37394kk();
                    }
                }, next.getIndex(), u8sVar);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m63866k4(int i, int i2) {
        if (i2 != 3) {
            if (i2 != 8) {
                return i2 == 9 && i == 81;
            }
            if (ChartTypeCharacterizer.m762k4(i) == 0 && i != 81) {
                return true;
            }
        } else if (ChartTypeCharacterizer.m762k4(i) == 7 || ChartTypeCharacterizer.m762k4(i) == 1) {
            return true;
        }
        return false;
    }
}

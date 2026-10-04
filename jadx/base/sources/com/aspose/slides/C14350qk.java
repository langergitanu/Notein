package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.exceptions.SerializationException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.internal.p332p7.AbstractC7523dy;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.internal.p332p7.C7405cg;
import com.aspose.slides.internal.p332p7.C7809gy;
import com.aspose.slides.internal.p332p7.C7913i8;
import com.aspose.slides.internal.p332p7.C8085kg;
import com.aspose.slides.internal.p332p7.C8166l9;
import com.aspose.slides.internal.p332p7.C8578q5;
import com.aspose.slides.internal.p332p7.C8616qo;
import com.aspose.slides.internal.p332p7.C8766se;
import com.aspose.slides.internal.p332p7.C9218xn;
import com.aspose.slides.internal.p332p7.C9267ya;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.qk */
/* JADX INFO: loaded from: classes3.dex */
class C14350qk {
    /* JADX INFO: renamed from: k4 */
    private static int m69678k4(boolean z, C8578q5 c8578q5) {
        if (c8578q5 == null) {
            throw new ArgumentNullException("plotAreaData");
        }
        List.Enumerator<C7394ca> it = c8578q5.m39346h4().iterator();
        int i = 0;
        while (it.hasNext()) {
            try {
                AbstractC7523dy abstractC7523dy = (AbstractC7523dy) it.next().m29542x1();
                if (!z && m69688k4(abstractC7523dy)) {
                    i++;
                }
                if (z && m69693x1(abstractC7523dy)) {
                    i++;
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
        return i;
    }

    /* JADX INFO: renamed from: kk */
    private static int m69692kk(AbstractC7523dy abstractC7523dy) {
        if (abstractC7523dy == null) {
            throw new ArgumentNullException("axis");
        }
        int iM32293k4 = abstractC7523dy.mo28019du().m32293k4();
        if (iM32293k4 == 0) {
            return 3;
        }
        if (iM32293k4 == 1) {
            return 2;
        }
        if (iM32293k4 == 2) {
            return 1;
        }
        if (iM32293k4 == 3) {
            return 0;
        }
        throw new NotSupportedException(C14113y2.m67402k4("Can't find opposite position for axis with position '{0}'", C14042ak.m66410k4(AxisPositionType.class, abstractC7523dy.mo28019du().m32293k4())));
    }

    /* JADX INFO: renamed from: x1 */
    private static boolean m69693x1(AbstractC7523dy abstractC7523dy) {
        return abstractC7523dy.mo28019du().m32293k4() == 1 || abstractC7523dy.mo28019du().m32293k4() == 2;
    }

    /* JADX INFO: renamed from: k4 */
    public static List<Integer> m69679k4(C14144mu c14144mu) {
        List<Integer> list = new List<>();
        C8578q5 c8578q5M67734kk = c14144mu.m67734kk();
        if (c8578q5M67734kk.m39346h4().size() == 3) {
            boolean zM27469x1 = C7019kk.m27469x1(c8578q5M67734kk.m39346h4().get_Item(2).m29542x1(), C9267ya.class);
            AbstractC7361bz abstractC7361bzM29542x1 = c8578q5M67734kk.m39346h4().get_Item(2).m29542x1();
            if (zM27469x1) {
                list.addItem(Integer.valueOf(((AbstractC7523dy) abstractC7361bzM29542x1).mo28028k4().m41464k4()));
                return list;
            }
            C7019kk.m27469x1(abstractC7361bzM29542x1, C9218xn.class);
            return list;
        }
        if (c8578q5M67734kk.m39346h4().size() != 4) {
            c8578q5M67734kk.m39346h4().size();
            return list;
        }
        List.Enumerator<C7394ca> it = c8578q5M67734kk.m39346h4().iterator();
        AbstractC7523dy abstractC7523dy = null;
        int i = 0;
        int i2 = 0;
        AbstractC7523dy abstractC7523dy2 = null;
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                if ("catAx".equals(next.m29539k4())) {
                    if (i == 0) {
                        i++;
                    } else {
                        abstractC7523dy = (AbstractC7523dy) next.m29542x1();
                    }
                } else if ("valAx".equals(next.m29539k4())) {
                    if (i2 == 0) {
                        i2++;
                    } else {
                        abstractC7523dy2 = (AbstractC7523dy) next.m29542x1();
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
        if (abstractC7523dy == null || abstractC7523dy2 == null) {
            list.addItem(Integer.valueOf(((AbstractC7523dy) c8578q5M67734kk.m39346h4().get_Item(2).m29542x1()).mo28028k4().m41464k4()));
            list.addItem(Integer.valueOf(((AbstractC7523dy) c8578q5M67734kk.m39346h4().get_Item(3).m29542x1()).mo28028k4().m41464k4()));
            return list;
        }
        list.addItem(Integer.valueOf(abstractC7523dy2.mo28028k4().m41464k4()));
        list.addItem(Integer.valueOf(abstractC7523dy.mo28028k4().m41464k4()));
        return list;
    }

    /* JADX INFO: renamed from: k4 */
    private static AbstractC7523dy m69680k4(AbstractC7523dy abstractC7523dy, C8578q5 c8578q5) {
        if (abstractC7523dy == null) {
            throw new ArgumentNullException("axis");
        }
        if (c8578q5 == null) {
            throw new ArgumentNullException("plotAreaData");
        }
        for (int i = 0; i < c8578q5.m39346h4().size(); i++) {
            AbstractC7523dy abstractC7523dy2 = (AbstractC7523dy) c8578q5.m39346h4().get_Item(i).m29542x1();
            if (abstractC7523dy2 != abstractC7523dy && C14067j2.m66727k4(abstractC7523dy2) == C14067j2.m66727k4(abstractC7523dy)) {
                return abstractC7523dy2;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    private static void m69681k4(Axis axis, Axis axis2, C8578q5 c8578q5, int i) {
        C0764av.m3747k4(axis, axis2.m319k4().m68836dy(), c8578q5);
        axis.m319k4().m68847kk(i);
        axis.m319k4().m68852to(axis2.m319k4().m68836dy());
        axis2.m319k4().m68852to(axis.m319k4().m68836dy());
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00f1 A[PHI: r8 r10
      0x00f1: PHI (r8v14 com.aspose.slides.ChartDataCell) = 
      (r8v7 com.aspose.slides.ChartDataCell)
      (r8v13 com.aspose.slides.ChartDataCell)
      (r8v20 com.aspose.slides.ChartDataCell)
     binds: [B:79:0x019f, B:63:0x014b, B:45:0x00ee] A[DONT_GENERATE, DONT_INLINE]
      0x00f1: PHI (r10v8 com.aspose.slides.internal.p7.dy) = 
      (r10v4 com.aspose.slides.internal.p7.dy)
      (r10v6 com.aspose.slides.internal.p7.dy)
      (r10v10 com.aspose.slides.internal.p7.dy)
     binds: [B:79:0x019f, B:63:0x014b, B:45:0x00ee] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void m69682k4(Axis axis, Dictionary<IAxis, String> dictionary, Dictionary<IAxis, IChartSeries> dictionary2, IChart iChart, C8578q5 c8578q5, u8s u8sVar) {
        AbstractC7523dy abstractC7523dy;
        ChartDataCell chartDataCell;
        IChartDataCell asCell = null;
        String[] strArr = {null};
        dictionary.tryGetValue(axis, strArr);
        String str = strArr[0];
        IChartSeries[] iChartSeriesArr = {null};
        dictionary2.tryGetValue(axis, iChartSeriesArr);
        IChartSeries iChartSeries = iChartSeriesArr[0];
        boolean z = ((ChartData) iChart.getChartData()).m553x1().mo5710kk() == 2;
        if (str != null) {
            if ("cat".equals(str)) {
                abstractC7523dy = (AbstractC7523dy) c8578q5.m39347k4(axis.getCategoryAxisType() == 1 ? "dateAx" : "catAx").m29542x1();
                if (axis.isNumberFormatLinkedToSource()) {
                    IChartCategoryCollection secondaryCategories = (iChartSeries != null && iChartSeries.getPlotOnSecondAxis() && iChart.getChartData().getUseSecondaryCategories()) ? iChart.getChartData().getSecondaryCategories() : iChart.getChartData().getCategories();
                    if (secondaryCategories.size() > 0 && secondaryCategories.getUseCells() && z) {
                        asCell = secondaryCategories.get_Item(0).getAsCell();
                    }
                    if (asCell != null) {
                        axis.setNumberFormat(((ChartDataCell) asCell).m567k4(false));
                    }
                }
            } else {
                String strM567k4 = "General";
                if ("val".equals(str)) {
                    abstractC7523dy = (AbstractC7523dy) c8578q5.m39347k4("valAx").m29542x1();
                    if (z && axis.isNumberFormatLinkedToSource() && iChartSeries != null && iChartSeries.getDataPoints().getDataSourceTypeForValues() == 0 && iChartSeries.getDataPoints().size() > 0) {
                        chartDataCell = (ChartDataCell) C7019kk.m27452k4((Object) iChartSeries.getDataPoints().get_Item(0).getValue().getAsCell(), ChartDataCell.class);
                        if (chartDataCell != null && !C7019kk.m27469x1(chartDataCell.getValue(), String.class)) {
                            strM567k4 = chartDataCell.m567k4(false);
                        }
                        axis.setNumberFormat(strM567k4);
                    }
                } else if ("xVal".equals(str)) {
                    abstractC7523dy = (AbstractC7523dy) c8578q5.m39347k4("valAx").m29542x1();
                    if (z && axis.isNumberFormatLinkedToSource() && iChartSeries != null && iChartSeries.getDataPoints().getDataSourceTypeForXValues() == 0 && iChartSeries.getDataPoints().size() > 0) {
                        chartDataCell = (ChartDataCell) C7019kk.m27452k4((Object) iChartSeries.getDataPoints().get_Item(0).getXValue().getAsCell(), ChartDataCell.class);
                        if (chartDataCell != null && !C7019kk.m27469x1(chartDataCell.getValue(), String.class)) {
                        }
                        axis.setNumberFormat(strM567k4);
                    }
                } else if ("yVal".equals(str)) {
                    abstractC7523dy = (AbstractC7523dy) c8578q5.m39347k4("valAx").m29542x1();
                    if (z && axis.isNumberFormatLinkedToSource() && iChartSeries != null && iChartSeries.getDataPoints().getDataSourceTypeForYValues() == 0 && iChartSeries.getDataPoints().size() > 0) {
                        chartDataCell = (ChartDataCell) C7019kk.m27452k4((Object) iChartSeries.getDataPoints().get_Item(0).getYValue().getAsCell(), ChartDataCell.class);
                        if (chartDataCell != null && !C7019kk.m27469x1(chartDataCell.getValue(), String.class)) {
                        }
                        axis.setNumberFormat(strM567k4);
                    }
                } else {
                    if (!"ser".equals(str)) {
                        throw new Exception();
                    }
                    abstractC7523dy = (AbstractC7523dy) c8578q5.m39347k4("serAx").m29542x1();
                }
            }
            C0764av.m3750k4(axis, abstractC7523dy, u8sVar);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m69683k4(IAxesManager iAxesManager, C7809gy c7809gy, C14144mu c14144mu) {
        IAxis horizontalAxis;
        C7913i8 c7913i8;
        IAxis horizontalAxis2;
        C7913i8 c7913i82;
        int type = ((AxesManager) C7019kk.m27452k4((Object) iAxesManager, AxesManager.class)).m312k4().getType();
        int i = 0;
        if (type != 73 && ChartTypeCharacterizer.m762k4(type) == 1) {
            while (i < c7809gy.m32991kk().length) {
                if (C7019kk.m27469x1(c7809gy.m32991kk()[i].m33934jd().m29542x1(), C8166l9.class)) {
                    C14466sq.m70727k4(iAxesManager.getVerticalAxis(), c7809gy.m32991kk()[i], c14144mu);
                    return;
                }
                i++;
            }
            return;
        }
        if (c7809gy.m32991kk().length == 2) {
            while (i < c7809gy.m32991kk().length) {
                if (C7019kk.m27469x1(c7809gy.m32991kk()[i].m33934jd().m29542x1(), C8766se.class)) {
                    horizontalAxis2 = iAxesManager.getVerticalAxis();
                    c7913i82 = c7809gy.m32991kk()[i];
                } else {
                    if (!C7019kk.m27469x1(c7809gy.m32991kk()[i].m33934jd().m29542x1(), C8166l9.class)) {
                        throw new SerializationException("Invalid element type");
                    }
                    horizontalAxis2 = iAxesManager.getHorizontalAxis();
                    c7913i82 = c7809gy.m32991kk()[i];
                }
                C14466sq.m70727k4(horizontalAxis2, c7913i82, c14144mu);
                i++;
            }
            return;
        }
        if (c7809gy.m32991kk().length == 3) {
            boolean z = false;
            while (i < c7809gy.m32991kk().length) {
                if (C7019kk.m27469x1(c7809gy.m32991kk()[i].m33934jd().m29542x1(), C8766se.class)) {
                    if (z) {
                        horizontalAxis = iAxesManager.getSecondaryVerticalAxis();
                        c7913i8 = c7809gy.m32991kk()[i];
                    } else {
                        C14466sq.m70727k4(iAxesManager.getVerticalAxis(), c7809gy.m32991kk()[i], c14144mu);
                        z = true;
                        i++;
                    }
                } else {
                    if (!C7019kk.m27469x1(c7809gy.m32991kk()[i].m33934jd().m29542x1(), C8166l9.class)) {
                        throw new SerializationException("Invalid element type");
                    }
                    horizontalAxis = iAxesManager.getHorizontalAxis();
                    c7913i8 = c7809gy.m32991kk()[i];
                }
                C14466sq.m70727k4(horizontalAxis, c7913i8, c14144mu);
                i++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0274  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m69684k4(IAxesManager iAxesManager, C8578q5 c8578q5, C14144mu c14144mu) {
        AbstractC7523dy abstractC7523dy;
        AbstractC7523dy abstractC7523dy2;
        AbstractC7523dy abstractC7523dy3;
        int iM67483k4;
        AbstractC7523dy abstractC7523dy4;
        AbstractC7523dy abstractC7523dy5;
        AbstractC7523dy abstractC7523dy6;
        AbstractC7523dy abstractC7523dy7;
        int i = 0;
        int i2 = (iAxesManager.getHorizontalAxis() != null ? 1 : 0) + (iAxesManager.getVerticalAxis() != null ? 1 : 0) + (iAxesManager.getSecondaryHorizontalAxis() != null ? 1 : 0) + (iAxesManager.getSecondaryVerticalAxis() != null ? 1 : 0) + (iAxesManager.getSeriesAxis() != null ? 1 : 0);
        if (c8578q5 == null) {
            throw new Exception("plotAreaElementData must not be null.");
        }
        if (i2 == 2) {
            if (m69688k4((AbstractC7523dy) c8578q5.m39346h4().get_Item(0).m29542x1())) {
                abstractC7523dy7 = (AbstractC7523dy) c8578q5.m39346h4().get_Item(0).m29542x1();
                abstractC7523dy6 = (AbstractC7523dy) c8578q5.m39346h4().get_Item(1).m29542x1();
            } else {
                abstractC7523dy6 = (AbstractC7523dy) c8578q5.m39346h4().get_Item(0).m29542x1();
                abstractC7523dy7 = (AbstractC7523dy) c8578q5.m39346h4().get_Item(1).m29542x1();
            }
            if (c8578q5.m39346h4().size() > 2 && C7019kk.m27469x1(c8578q5.m39346h4().get_Item(2).m29542x1(), C9218xn.class)) {
                AxesManager axesManager = (AxesManager) iAxesManager;
                axesManager.m313k4((C9218xn) c8578q5.m39346h4().get_Item(2).m29542x1());
                axesManager.m315kk();
                AbstractC7523dy abstractC7523dy8 = (AbstractC7523dy) c8578q5.m39346h4().get_Item(2).m29542x1();
                if (iAxesManager.getSeriesAxis() != null) {
                    C0764av.m3749k4(iAxesManager.getSeriesAxis(), abstractC7523dy8, c14144mu);
                }
            }
            if (abstractC7523dy7 == null || abstractC7523dy6 == null) {
                return;
            }
            C0764av.m3749k4(iAxesManager.getHorizontalAxis(), abstractC7523dy7, c14144mu);
            C0764av.m3749k4(iAxesManager.getVerticalAxis(), abstractC7523dy6, c14144mu);
            return;
        }
        AbstractC7523dy abstractC7523dy9 = null;
        if (i2 == 3) {
            int i3 = 0;
            while (true) {
                if (i3 >= 3) {
                    abstractC7523dy4 = null;
                    break;
                } else {
                    if (m69688k4((AbstractC7523dy) c8578q5.m39346h4().get_Item(i3).m29542x1())) {
                        abstractC7523dy4 = (AbstractC7523dy) c8578q5.m39346h4().get_Item(i3).m29542x1();
                        break;
                    }
                    i3++;
                }
            }
            int i4 = 0;
            while (true) {
                if (i4 >= 3) {
                    abstractC7523dy5 = null;
                    break;
                } else {
                    if (m69693x1((AbstractC7523dy) c8578q5.m39346h4().get_Item(i4).m29542x1())) {
                        abstractC7523dy5 = (AbstractC7523dy) c8578q5.m39346h4().get_Item(i4).m29542x1();
                        break;
                    }
                    i4++;
                }
            }
            while (true) {
                if (i >= 3) {
                    break;
                }
                if (C7019kk.m27469x1(c8578q5.m39346h4().get_Item(i).m29542x1(), C9218xn.class)) {
                    abstractC7523dy9 = (AbstractC7523dy) c8578q5.m39346h4().get_Item(i).m29542x1();
                    break;
                }
                i++;
            }
            if (abstractC7523dy4 == null || abstractC7523dy5 == null || abstractC7523dy9 == null) {
                return;
            }
            C0764av.m3749k4(iAxesManager.getHorizontalAxis(), abstractC7523dy4, c14144mu);
            C0764av.m3749k4(iAxesManager.getVerticalAxis(), abstractC7523dy5, c14144mu);
            if (iAxesManager.getSeriesAxis() != null) {
                C0764av.m3749k4(iAxesManager.getSeriesAxis(), abstractC7523dy9, c14144mu);
                return;
            } else {
                ((AxesManager) iAxesManager).m313k4((C9218xn) abstractC7523dy9);
                return;
            }
        }
        if (i2 == 4) {
            m69687k4(c8578q5);
            int i5 = 0;
            while (true) {
                if (i5 >= 2) {
                    abstractC7523dy = null;
                    abstractC7523dy2 = null;
                    break;
                } else if (!m69688k4((AbstractC7523dy) c8578q5.m39346h4().get_Item(i5).m29542x1())) {
                    i5++;
                } else if (i5 == 0) {
                    int i6 = i5 + 1;
                    if (m69688k4((AbstractC7523dy) c8578q5.m39346h4().get_Item(i6).m29542x1())) {
                        abstractC7523dy2 = (AbstractC7523dy) c8578q5.m39346h4().get_Item(i6).m29542x1();
                        abstractC7523dy = (AbstractC7523dy) c8578q5.m39346h4().get_Item(i5).m29542x1();
                    } else {
                        abstractC7523dy2 = (AbstractC7523dy) c8578q5.m39346h4().get_Item(i5).m29542x1();
                        abstractC7523dy = null;
                    }
                }
            }
            int i7 = 0;
            while (true) {
                if (i7 >= 4) {
                    abstractC7523dy3 = null;
                    break;
                }
                if (!m69693x1((AbstractC7523dy) c8578q5.m39346h4().get_Item(i7).m29542x1())) {
                    i7++;
                } else if (i7 == 0) {
                    int i8 = i7 + 1;
                    if (m69693x1((AbstractC7523dy) c8578q5.m39346h4().get_Item(i8).m29542x1())) {
                        abstractC7523dy9 = (AbstractC7523dy) c8578q5.m39346h4().get_Item(i8).m29542x1();
                        abstractC7523dy3 = (AbstractC7523dy) c8578q5.m39346h4().get_Item(i7).m29542x1();
                    } else {
                        AbstractC7523dy abstractC7523dy10 = (AbstractC7523dy) c8578q5.m39346h4().get_Item(i7).m29542x1();
                        abstractC7523dy3 = null;
                        abstractC7523dy9 = abstractC7523dy10;
                    }
                }
            }
            if (c8578q5.m39346h4().size() == 3) {
                iM67483k4 = C14116yg.m67483k4(abstractC7523dy2.mo28028k4().m41464k4(), abstractC7523dy9.mo28028k4().m41464k4());
                AbstractC7523dy abstractC7523dy11 = (AbstractC7523dy) c8578q5.m39346h4().get_Item(2).m29542x1();
                if (m69688k4(abstractC7523dy11)) {
                    iM67483k4 = C14116yg.m67483k4(iM67483k4, abstractC7523dy11.mo28028k4().m41464k4());
                    abstractC7523dy3 = abstractC7523dy9;
                    abstractC7523dy = abstractC7523dy11;
                } else if (m69693x1(abstractC7523dy11)) {
                    iM67483k4 = C14116yg.m67483k4(iM67483k4, abstractC7523dy11.mo28028k4().m41464k4());
                    abstractC7523dy = abstractC7523dy2;
                    abstractC7523dy3 = abstractC7523dy11;
                }
            } else {
                int i9 = 2;
                while (true) {
                    if (i9 >= 4) {
                        break;
                    }
                    if (m69688k4((AbstractC7523dy) c8578q5.m39346h4().get_Item(i9).m29542x1())) {
                        if (i9 == 2) {
                            int i10 = i9 + 1;
                            if (m69688k4((AbstractC7523dy) c8578q5.m39346h4().get_Item(i10).m29542x1())) {
                                abstractC7523dy2 = (AbstractC7523dy) c8578q5.m39346h4().get_Item(i10).m29542x1();
                            }
                        }
                        abstractC7523dy = (AbstractC7523dy) c8578q5.m39346h4().get_Item(i9).m29542x1();
                    } else {
                        i9++;
                    }
                }
                int i11 = 2;
                while (true) {
                    if (i11 >= 4) {
                        break;
                    }
                    if (m69693x1((AbstractC7523dy) c8578q5.m39346h4().get_Item(i11).m29542x1())) {
                        if (i11 == 2) {
                            int i12 = i11 + 1;
                            if (m69693x1((AbstractC7523dy) c8578q5.m39346h4().get_Item(i12).m29542x1())) {
                                abstractC7523dy9 = (AbstractC7523dy) c8578q5.m39346h4().get_Item(i12).m29542x1();
                            }
                        }
                        abstractC7523dy3 = (AbstractC7523dy) c8578q5.m39346h4().get_Item(i11).m29542x1();
                    } else {
                        i11++;
                    }
                }
                iM67483k4 = 0;
            }
            if (abstractC7523dy2 == null || abstractC7523dy9 == null || abstractC7523dy == null || abstractC7523dy3 == null) {
                return;
            }
            C0764av.m3749k4(iAxesManager.getHorizontalAxis(), abstractC7523dy2, c14144mu);
            C0764av.m3749k4(iAxesManager.getVerticalAxis(), abstractC7523dy9, c14144mu);
            C0764av.m3749k4(iAxesManager.getSecondaryHorizontalAxis(), abstractC7523dy, c14144mu);
            C0764av.m3749k4(iAxesManager.getSecondaryVerticalAxis(), abstractC7523dy3, c14144mu);
            if (c8578q5.m39346h4().size() == 3) {
                (((Axis) iAxesManager.getHorizontalAxis()).m319k4().m68836dy() == ((Axis) iAxesManager.getSecondaryHorizontalAxis()).m319k4().m68836dy() ? iAxesManager.getSecondaryHorizontalAxis() : iAxesManager.getSecondaryVerticalAxis()).setVisible(false);
                m69681k4((Axis) iAxesManager.getSecondaryHorizontalAxis(), (Axis) iAxesManager.getSecondaryVerticalAxis(), c8578q5, iM67483k4 + 1);
                m69681k4((Axis) iAxesManager.getHorizontalAxis(), (Axis) iAxesManager.getVerticalAxis(), c8578q5, iM67483k4 + 2);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m69685k4(IChart iChart, C7809gy c7809gy, u8s u8sVar) {
        switch (iChart.getChartData().getSeries().get_Item(0).getType()) {
            case 76:
            case 77:
                C7913i8 c7913i8M32988k4 = c7809gy.m32988k4();
                c7913i8M32988k4.m33935k4("catScaling");
                C14466sq.m70728k4(iChart.getAxes().getHorizontalAxis(), c7913i8M32988k4, u8sVar, 0L);
                C7913i8 c7913i8M32988k42 = c7809gy.m32988k4();
                c7913i8M32988k42.m33935k4("valScaling");
                C14466sq.m70728k4(iChart.getAxes().getVerticalAxis(), c7913i8M32988k42, u8sVar, 1L);
                if (iChart.getAxes().getSecondaryVerticalAxis() != null) {
                    C7913i8 c7913i8M32988k43 = c7809gy.m32988k4();
                    c7913i8M32988k43.m33935k4("valScaling");
                    C14466sq.m70728k4(iChart.getAxes().getSecondaryVerticalAxis(), c7913i8M32988k43, u8sVar, 2L);
                }
                break;
            case 78:
            case 79:
                C7913i8 c7913i8M32988k44 = c7809gy.m32988k4();
                c7913i8M32988k44.m33935k4("valScaling");
                C14466sq.m70728k4(iChart.getAxes().getVerticalAxis(), c7913i8M32988k44, u8sVar, 0L);
                C7913i8 c7913i8M32988k45 = c7809gy.m32988k4();
                c7913i8M32988k45.m33935k4("catScaling");
                C14466sq.m70728k4(iChart.getAxes().getHorizontalAxis(), c7913i8M32988k45, u8sVar, 1L);
                break;
            case 80:
                C7913i8 c7913i8M32988k46 = c7809gy.m32988k4();
                c7913i8M32988k46.m33935k4("catScaling");
                C14466sq.m70728k4(iChart.getAxes().getVerticalAxis(), c7913i8M32988k46, u8sVar, 1L);
                break;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m69686k4(IChart iChart, C8578q5 c8578q5, u8s u8sVar) {
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        IChartSeries iChartSeries;
        IChartSeries iChartSeries2;
        Dictionary dictionary;
        Dictionary dictionary2;
        IChartData chartData = iChart.getChartData();
        IAxesManager axes = iChart.getAxes();
        String str5 = null;
        if (chartData.getSeries().size() > 0) {
            IGenericEnumerator<IChartSeries> it = chartData.getSeries().iterator();
            str = null;
            str3 = null;
            str4 = null;
            str2 = null;
            iChartSeries = null;
            iChartSeries2 = null;
            while (it.hasNext()) {
                try {
                    IChartSeries next = it.next();
                    String[] strArrM69691k4 = m69691k4(next.getType());
                    if (next.getPlotOnSecondAxis()) {
                        if (str3 == null) {
                            str3 = strArrM69691k4[0];
                        } else if ("xVal".equals(str3) && "cat".equals(strArrM69691k4[0])) {
                            str3 = strArrM69691k4[0];
                        } else if (!m69689k4(str3, strArrM69691k4[0])) {
                            throw new Exception();
                        }
                        if (str4 == null) {
                            str4 = strArrM69691k4[1];
                        } else if (!m69689k4(str4, strArrM69691k4[1])) {
                            throw new Exception();
                        }
                        if (iChartSeries2 == null) {
                            iChartSeries2 = next;
                        }
                    } else {
                        if (str5 == null) {
                            str5 = strArrM69691k4[0];
                        } else if ("xVal".equals(str5) && "cat".equals(strArrM69691k4[0])) {
                            str5 = strArrM69691k4[0];
                        } else if (!m69689k4(str5, strArrM69691k4[0])) {
                            throw new Exception();
                        }
                        if (str == null) {
                            str = strArrM69691k4[1];
                        } else if (!m69689k4(str, strArrM69691k4[1])) {
                            throw new Exception();
                        }
                        if (iChartSeries == null) {
                            iChartSeries = next;
                        }
                    }
                    if (str2 == null) {
                        str2 = strArrM69691k4[2];
                    } else if (!m69689k4(str2, strArrM69691k4[2])) {
                        throw new Exception();
                    }
                } catch (Throwable th) {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                    throw th;
                }
            }
            i = 0;
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                it.dispose();
            }
        } else {
            i = 0;
            String[] strArrM69691k42 = m69691k4(iChart.getType());
            String str6 = strArrM69691k42[0];
            str = strArrM69691k42[1];
            str2 = strArrM69691k42[2];
            str3 = null;
            str4 = null;
            iChartSeries = null;
            iChartSeries2 = null;
            str5 = str6;
        }
        Dictionary dictionary3 = new Dictionary();
        if (axes.getHorizontalAxis() != null) {
            dictionary3.addItem(axes.getHorizontalAxis(), str5);
        }
        if (axes.getVerticalAxis() != null) {
            dictionary3.addItem(axes.getVerticalAxis(), str);
        }
        if (axes.getSecondaryHorizontalAxis() != null) {
            dictionary3.addItem(axes.getSecondaryHorizontalAxis(), str3);
        }
        if (axes.getSecondaryVerticalAxis() != null) {
            dictionary3.addItem(axes.getSecondaryVerticalAxis(), str4);
        }
        if (axes.getSeriesAxis() != null) {
            dictionary3.addItem(axes.getSeriesAxis(), str2);
        }
        Dictionary dictionary4 = new Dictionary();
        if (axes.getHorizontalAxis() != null) {
            dictionary4.addItem(axes.getHorizontalAxis(), iChartSeries);
        }
        if (axes.getVerticalAxis() != null) {
            dictionary4.addItem(axes.getVerticalAxis(), iChartSeries);
        }
        if (axes.getSecondaryHorizontalAxis() != null) {
            dictionary4.addItem(axes.getSecondaryHorizontalAxis(), iChartSeries2);
        }
        if (axes.getSecondaryVerticalAxis() != null) {
            dictionary4.addItem(axes.getSecondaryVerticalAxis(), iChartSeries2);
        }
        IAxis[] iAxisArrM69690k4 = m69690k4(chartData.getSeriesGroups(), axes);
        int length = iAxisArrM69690k4.length;
        int i2 = i;
        while (i2 < length) {
            IAxis iAxis = iAxisArrM69690k4[i2];
            if (iAxis != null) {
                dictionary = dictionary3;
                dictionary2 = dictionary4;
                m69682k4((Axis) iAxis, dictionary, dictionary2, iChart, c8578q5, u8sVar);
            } else {
                dictionary = dictionary3;
                dictionary2 = dictionary4;
            }
            i2++;
            dictionary3 = dictionary;
            dictionary4 = dictionary2;
        }
        int length2 = iAxisArrM69690k4.length;
        int i3 = i;
        int i4 = i3;
        while (i3 < length2) {
            IAxis iAxis2 = iAxisArrM69690k4[i3];
            if (iAxis2 != null) {
                if (c8578q5.m39346h4().size() == i4) {
                    return;
                }
                AbstractC7523dy abstractC7523dy = (AbstractC7523dy) c8578q5.m39346h4().get_Item(i4).m29542x1();
                i4++;
                for (int i5 = i; i5 < c8578q5.m39346h4().size(); i5++) {
                    AbstractC7523dy abstractC7523dy2 = (AbstractC7523dy) c8578q5.m39346h4().get_Item(i5).m29542x1();
                    if (abstractC7523dy2.mo28028k4().m41464k4() == abstractC7523dy.mo28012ar().m41464k4()) {
                        if (iAxis2.getCrossType() == 2) {
                            ((C7405cg) (abstractC7523dy2.mo28043um() == null ? abstractC7523dy2.mo28027k4("crossesAt") : abstractC7523dy2.mo28043um()).m29542x1()).m29596k4(iAxis2.getCrossAt());
                        } else if (!abstractC7523dy2.mo28030kk().m41467k4()) {
                            ((C8085kg) (abstractC7523dy2.mo28043um() == null ? abstractC7523dy2.mo28027k4("crosses") : abstractC7523dy2.mo28043um()).m29542x1()).m35352k4(iAxis2.getCrossType());
                        }
                    }
                }
            }
            i3++;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m69687k4(C8578q5 c8578q5) {
        boolean zM27456k4;
        if (c8578q5 == null) {
            throw new ArgumentNullException("plotAreaData");
        }
        if (c8578q5.m39346h4().size() != 4) {
            return;
        }
        List.Enumerator<C7394ca> it = c8578q5.m39346h4().iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                if (!C7019kk.m27469x1(next.m29542x1(), C8616qo.class) && !C7019kk.m27469x1(next.m29542x1(), C9267ya.class)) {
                    if (zM27456k4) {
                        return;
                    } else {
                        return;
                    }
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
        for (int i = 0; i < c8578q5.m39346h4().size(); i++) {
            AbstractC7523dy abstractC7523dy = (AbstractC7523dy) c8578q5.m39346h4().get_Item(i).m29542x1();
            AbstractC7523dy abstractC7523dyM69680k4 = m69680k4(abstractC7523dy, c8578q5);
            if (abstractC7523dyM69680k4 != null && ((!m69688k4(abstractC7523dy) || !m69688k4(abstractC7523dyM69680k4)) && ((!m69693x1(abstractC7523dy) || !m69693x1(abstractC7523dyM69680k4)) && m69678k4(m69693x1(abstractC7523dy), c8578q5) == 3))) {
                abstractC7523dy.mo28019du().m32294k4(m69692kk(abstractC7523dyM69680k4));
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m69688k4(AbstractC7523dy abstractC7523dy) {
        return abstractC7523dy.mo28019du().m32293k4() == 0 || abstractC7523dy.mo28019du().m32293k4() == 3;
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m69689k4(String str, String str2) {
        if (str2 == null || C14113y2.m67363du(str, str2) || (("xVal".equals(str) || "yVal".equals(str) || "val".equals(str)) && ("xVal".equals(str2) || "yVal".equals(str2) || "val".equals(str2)))) {
            return true;
        }
        return "cat".equals(str) && "xVal".equals(str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0038 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0032 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[LOOP:0: B:31:0x000d->B:37:?, LOOP_END, SYNTHETIC] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static IAxis[] m69690k4(IChartSeriesGroupCollection iChartSeriesGroupCollection, IAxesManager iAxesManager) {
        IGenericEnumerator<IChartSeriesGroup> it = iChartSeriesGroupCollection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            try {
                int type = it.next().getType();
                if (type == 7 || type == 8 || type == 9) {
                    z = true;
                } else {
                    switch (type) {
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                            z = true;
                            break;
                    }
                    if (!z) {
                        return z ? new IAxis[]{iAxesManager.getHorizontalAxis(), iAxesManager.getVerticalAxis(), iAxesManager.getSecondaryVerticalAxis(), iAxesManager.getSecondaryHorizontalAxis(), iAxesManager.getSeriesAxis()} : new IAxis[]{iAxesManager.getVerticalAxis(), iAxesManager.getHorizontalAxis(), iAxesManager.getSecondaryHorizontalAxis(), iAxesManager.getSecondaryVerticalAxis(), iAxesManager.getSeriesAxis()};
                    }
                }
                if (!z) {
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (z) {
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static String[] m69691k4(int i) {
        switch (i) {
            case 0:
            case 1:
            case 2:
                return new String[]{"cat", "val", null};
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                return new String[]{"cat", "val", "ser"};
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
                return new String[]{"cat", "val", null};
            case 25:
                return new String[]{"cat", "val", "ser"};
            case 26:
            case 29:
                return new String[]{null, null, null};
            case 27:
            case 30:
                return new String[]{null, null, null};
            case 28:
            case 31:
                return new String[]{null, null, null};
            case 32:
            case 34:
            case 35:
                return new String[]{"val", "cat", null};
            case 33:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
                return new String[]{"val", "cat", "ser"};
            case 47:
            case 48:
            case 49:
                return new String[]{"cat", "val", null};
            case 50:
            case 51:
            case 52:
                return new String[]{"cat", "val", "ser"};
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
                return new String[]{"xVal", "yVal", null};
            case 58:
            case 59:
            case 60:
            case 61:
                return new String[]{"cat", "val", null};
            case 62:
            case 63:
                return new String[]{"cat", "val", "ser"};
            case 64:
            case 65:
                return new String[]{"cat", "val", "ser"};
            case 66:
            case 67:
                return new String[]{null, null, null};
            case 68:
            case 69:
                return new String[]{"xVal", "yVal", null};
            case 70:
            case 71:
            case 72:
                return new String[]{"cat", "val", null};
            default:
                throw new Exception();
        }
    }
}

package com.aspose.slides;

import com.aspose.slides.AbstractC14173n9;
import com.aspose.slides.C13741ko;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p080dd.C3141rv;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.internal.p332p7.C7534e4;
import com.aspose.slides.internal.p464vq.C11839vw;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.p559ms.System.AbstractC14041ai;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import com.huawei.hms.network.embedded.C18177fb;
import com.huawei.hms.network.embedded.C18241k5;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.i3 */
/* JADX INFO: loaded from: classes3.dex */
class C1237i3 {

    /* JADX INFO: renamed from: k4 */
    private static final C7017h4 f5614k4 = new C7017h4("chart:bar", "chart:column", "chart:circle", "chart:ring", "chart:area", "chart:line", "chart:scatter", "chart:bubble", "chart:radar", "chart:filled-radar", "chart:stock");

    /* JADX INFO: renamed from: k4 */
    private static int m7395k4(int i) {
        switch (i) {
            case 1:
            case 15:
                return 7;
            case 2:
                return 2;
            case 3:
            case 4:
            case 5:
            case 6:
                return 9;
            case 7:
            case 8:
            case 10:
            default:
                return -1;
            case 9:
                return 0;
            case 11:
                return 10;
            case 12:
                return 6;
            case 13:
                return 8;
            case 14:
                return 1;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static int m7396k4(com.aspose.slides.internal.p332p7.im9 im9Var) {
        int iM34284ck = im9Var.m34284ck();
        int i = 1;
        int i2 = iM34284ck != 2 ? iM34284ck != 3 ? iM34284ck != 4 ? 0 : 4 : 1 : 3;
        int i3 = im9Var.m34288h4() ? 1 : 2;
        if (im9Var.m34287fa()) {
            i = 4;
        } else if (!im9Var.m34302up()) {
            i = 2;
        }
        IGenericEnumerator<KeyValuePair<TKey, TValue>> it = C13741ko.m64057k4().iterator();
        while (it.hasNext()) {
            try {
                KeyValuePair keyValuePair = (KeyValuePair) it.next();
                if (i3 == ((C13741ko.k4) keyValuePair.getValue()).m64083k4() && i == ((C13741ko.k4) keyValuePair.getValue()).m64086x1() && ((C13741ko.k4) keyValuePair.getValue()).m64084k4(i2)) {
                    return ((Integer) keyValuePair.getKey()).intValue();
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
        return im9Var.m34288h4() ? 33 : 3;
    }

    /* JADX INFO: renamed from: k4 */
    private static int m7397k4(String str, com.aspose.slides.internal.p332p7.kpw kpwVar, com.aspose.slides.internal.p332p7.im9 im9Var, com.aspose.slides.internal.p332p7.im9 im9Var2) {
        boolean z;
        boolean z2 = im9Var != null && im9Var.m34291k4() == 1;
        switch (f5614k4.m27428k4(C14113y2.m67361du(str))) {
            case 0:
            case 1:
                if (z2) {
                    return m7396k4(im9Var);
                }
                if (im9Var == null) {
                    return 0;
                }
                if (im9Var.m34288h4()) {
                    if (im9Var.m34287fa()) {
                        return 35;
                    }
                    return im9Var.m34302up() ? 32 : 34;
                }
                if (im9Var.m34287fa()) {
                    return 1;
                }
                return im9Var.m34302up() ? 2 : 0;
            case 2:
                return (im9Var2 == null || (im9Var2.m34290jd() & 4294967295L) <= 0) ? z2 ? 27 : 26 : z2 ? 30 : 29;
            case 3:
                return (im9Var2 == null || (im9Var2.m34290jd() & 4294967295L) <= 0) ? 66 : 67;
            case 4:
                if (im9Var == null) {
                    return 47;
                }
                return im9Var.m34287fa() ? z2 ? 51 : 48 : im9Var.m34302up() ? z2 ? 52 : 49 : z2 ? 50 : 47;
            case 5:
                if (z2) {
                    return 25;
                }
                if (im9Var == null) {
                    return 19;
                }
                z = im9Var.m34306x1() > 0;
                return im9Var.m34287fa() ? z ? 23 : 20 : im9Var.m34302up() ? z ? 24 : 21 : z ? 22 : 19;
            case 6:
                if (im9Var == null) {
                    return 57;
                }
                z = im9Var.m34283c5() > 1;
                return im9Var.m34306x1() > 0 ? z ? 54 : 53 : z ? 55 : 57;
            case 7:
                return 68;
            case 8:
                return (im9Var != null && im9Var.m34306x1() > 0) ? 71 : 70;
            case 9:
                return 72;
            case 10:
                int length = kpwVar.m35635kk().length;
                if (length <= 0) {
                    return 58;
                }
                if (!"chart:bar".equals(kpwVar.m35635kk()[0].m39591kk())) {
                    return length == 4 ? 59 : 58;
                }
                if (length == 4) {
                    return 60;
                }
                return length == 5 ? 61 : 58;
            default:
                return 34;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static Chart m7398k4(ShapeCollection shapeCollection, com.aspose.slides.internal.p332p7.vtn vtnVar, com.aspose.slides.internal.p332p7.vcq vcqVar, qye qyeVar) {
        com.aspose.slides.internal.p332p7.yxj yxjVarM38436kk;
        com.aspose.slides.internal.p332p7.kfh kfhVarM37243k4;
        com.aspose.slides.internal.p332p7.lzc lzcVarM72892k4;
        if (shapeCollection == null) {
            throw new ArgumentNullException("shapes");
        }
        if (vcqVar == null) {
            throw new ArgumentNullException("objectElement");
        }
        C12007ix c12007ixClone = wgi.m72716k4(vtnVar.m43291dy(), vtnVar.m43286c5(), vtnVar.m43296jd(), vtnVar.m43288ck()).Clone();
        String strM42931k4 = vcqVar.m42931k4();
        com.aspose.slides.internal.p332p7.im9 im9Var = null;
        if (wgi.m72731kk(strM42931k4) && C14113y2.m67359c5(strM42931k4, "Object")) {
            String strM67401k4 = C14113y2.m67401k4(strM42931k4, "./", "");
            C11839vw c11839vwM69959x1 = qyeVar.m69959x1(C14113y2.m67408k4(strM67401k4, "/styles.xml"));
            if (c11839vwM69959x1 != null) {
                new C13768la(c11839vwM69959x1, qyeVar).m64331k4();
            }
            C11839vw c11839vwM69959x12 = qyeVar.m69959x1(C14113y2.m67401k4(C3141rv.m13412x1(strM67401k4, "content.xml"), "\\", "/"));
            if (c11839vwM69959x12 == null) {
                return null;
            }
            try {
                com.aspose.slides.internal.p332p7.oss ossVarM70602k4 = new C14454sf(c11839vwM69959x12, qyeVar).m70602k4();
                if (ossVarM70602k4 != null && (yxjVarM38436kk = ossVarM70602k4.m38436kk()) != null && "chart".equals(yxjVarM38436kk.m45214k4().m29539k4())) {
                    wxb wxbVar = new wxb(qyeVar, ossVarM70602k4.m38437x1());
                    com.aspose.slides.internal.p332p7.n4n n4nVar = (com.aspose.slides.internal.p332p7.n4n) C7019kk.m27452k4((Object) yxjVarM38436kk.m45214k4().m29542x1(), com.aspose.slides.internal.p332p7.n4n.class);
                    if (n4nVar == null || (kfhVarM37243k4 = n4nVar.m37243k4()) == null) {
                        return null;
                    }
                    com.aspose.slides.internal.p332p7.kpw kpwVarM35342dy = kfhVarM37243k4.m35342dy();
                    com.aspose.slides.internal.p332p7.lzc lzcVarM72892k42 = wr8.m72892k4(kpwVarM35342dy.m35634k4(), wxbVar);
                    com.aspose.slides.internal.p332p7.im9 im9Var2 = lzcVarM72892k42 != null ? (com.aspose.slides.internal.p332p7.im9) wgi.m72712k4(com.aspose.slides.internal.p332p7.im9.class, "chart-properties", lzcVarM72892k42.m36550to()) : null;
                    if (kpwVarM35342dy.m35635kk().length > 0 && (lzcVarM72892k4 = wr8.m72892k4(kpwVarM35342dy.m35635kk()[0].m39587du(), wxbVar)) != null) {
                        im9Var = (com.aspose.slides.internal.p332p7.im9) wgi.m72712k4(com.aspose.slides.internal.p332p7.im9.class, "chart-properties", lzcVarM72892k4.m36550to());
                    }
                    Chart chartM2621k4 = shapeCollection.m2621k4(m7397k4(kfhVarM37243k4.m35344k4(), kpwVarM35342dy, im9Var2, im9Var));
                    chartM2621k4.setFrame(new ShapeFrame(c12007ixClone.m56557jd(), c12007ixClone.m56551ck(), c12007ixClone.m56550c5(), c12007ixClone.m56575x1(), (byte) 0, (byte) 0, 0.0f));
                    m7415k4(chartM2621k4.getChartData(), kfhVarM37243k4.m35340c5(), chartM2621k4.getType());
                    m7400k4(chartM2621k4.getFillFormat(), chartM2621k4.getLineFormat(), chartM2621k4.getTextFormat(), kfhVarM37243k4.m35347to(), wxbVar);
                    if (kfhVarM37243k4.m35341du() != null) {
                        chartM2621k4.setTitle(true);
                        m7418k4(chartM2621k4.getChartTitle(), kfhVarM37243k4.m35341du(), kfhVarM37243k4.m35343h4(), wxbVar);
                    }
                    m7406k4(chartM2621k4, kfhVarM37243k4.m35346m9(), wxbVar);
                    m7405k4(chartM2621k4, kpwVarM35342dy, im9Var2, im9Var, wxbVar);
                    if (im9Var2 != null && (im9Var2.m34281b3() != 1 || im9Var2.m34308yd() != 1)) {
                        m7410k4((ChartPlotArea) C7019kk.m27452k4((Object) chartM2621k4.getPlotArea(), ChartPlotArea.class), kpwVarM35342dy, kfhVarM37243k4);
                    }
                    return chartM2621k4;
                }
            } catch (RuntimeException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    private static IChartSeries m7399k4(IChartData iChartData, ChartDataWorkbook chartDataWorkbook, int i, boolean z, boolean z2, com.aspose.slides.internal.p332p7.qmc qmcVar, wxb wxbVar) {
        if (C14113y2.m67411k4(m7402k4(qmcVar.m39590k4()))) {
            return null;
        }
        IChartSeries iChartSeriesAdd = iChartData.getSeries().add(i);
        String strM7402k4 = m7402k4(qmcVar.m39594x1());
        if (!C14113y2.m67411k4(strM7402k4)) {
            IChartCellCollection cellCollection = chartDataWorkbook.getCellCollection(strM7402k4, true);
            if (cellCollection.getCount() > 0) {
                iChartSeriesAdd.getName().setFromOneCell(cellCollection.get_Item(0));
            }
        }
        m7407k4(chartDataWorkbook, iChartSeriesAdd, m7402k4(qmcVar.m39590k4()), new AbstractC14173n9.k4() { // from class: com.aspose.slides.i3.1
            @Override // com.aspose.slides.AbstractC14173n9.k4
            /* JADX INFO: renamed from: k4 */
            public void mo6300k4(IChartDataCell iChartDataCell, IChartDataPoint iChartDataPoint) {
                iChartDataPoint.getValue().setAsCell(iChartDataCell);
            }
        });
        m7400k4(iChartSeriesAdd.getFormat().getFill(), iChartSeriesAdd.getFormat().getLine(), (IChartTextFormat) null, qmcVar.m39587du(), wxbVar);
        if (i != 0) {
            iChartSeriesAdd.getFormat().getLine().getFillFormat().setFillType((byte) 0);
            iChartSeriesAdd.setSmooth(true);
            iChartSeriesAdd.getMarker().setSymbol(4);
            if (!z2) {
                iChartSeriesAdd.getRelatedLegendEntry().setHide(true);
            }
            if (z) {
                iChartSeriesAdd.setPlotOnSecondAxis(true);
            }
        }
        return iChartSeriesAdd;
    }

    /* JADX INFO: renamed from: k4 */
    private static com.aspose.slides.internal.p332p7.lzc m7400k4(IFillFormat iFillFormat, ILineFormat iLineFormat, IChartTextFormat iChartTextFormat, String str, wxb wxbVar) {
        com.aspose.slides.internal.p332p7.lzc lzcVarM72892k4 = wr8.m72892k4(str, wxbVar);
        if (lzcVarM72892k4 == null) {
            return null;
        }
        if (iChartTextFormat != null) {
            ParagraphFormat paragraphFormat = (ParagraphFormat) iChartTextFormat.getParagraphFormat();
            if (paragraphFormat != null) {
                ap3.m3703k4(paragraphFormat, (TextFrameFormat) null, lzcVarM72892k4, wxbVar);
            }
            BasePortionFormat basePortionFormat = (BasePortionFormat) iChartTextFormat.getPortionFormat();
            if (basePortionFormat != null) {
                zfd.m74510k4(basePortionFormat, lzcVarM72892k4, wxbVar);
            }
        }
        com.aspose.slides.internal.p332p7.rsv rsvVar = (com.aspose.slides.internal.p332p7.rsv) wgi.m72712k4(com.aspose.slides.internal.p332p7.rsv.class, "graphic-properties", lzcVarM72892k4.m36550to());
        if (rsvVar != null) {
            if (rsvVar.m40478k4() == 0 && wgi.m72731kk(rsvVar.m40498to())) {
                rsvVar.m40480k4(3);
            }
            if (iFillFormat != null) {
                C13706jy.m63567k4(iFillFormat, rsvVar, wxbVar);
            }
            if (iLineFormat != null) {
                eem.m5506k4(iLineFormat, rsvVar, wxbVar);
            }
        }
        return lzcVarM72892k4;
    }

    /* JADX INFO: renamed from: k4 */
    private static String m7401k4(com.aspose.slides.internal.p332p7.ok7 ok7Var) {
        C6765kp c6765kp = new C6765kp();
        List.Enumerator<C7394ca> it = ok7Var.m38327kk().iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                if ("_TEXT".equals(next.m29539k4())) {
                    c6765kp.m26810x1(next.m29541kk().toString());
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return C14113y2.m67362du(c6765kp.toString(), new char[0]);
    }

    /* JADX INFO: renamed from: k4 */
    private static String m7402k4(String str) {
        if (C14113y2.m67411k4(str)) {
            return null;
        }
        return C14113y2.m67401k4(C14113y2.m67401k4(str, ".", ""), "local-table", C14113y2.m67408k4("local-table", "!"));
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01df  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void m7403k4(Chart chart, ChartDataWorkbook chartDataWorkbook, com.aspose.slides.internal.p332p7.kpw kpwVar, wxb wxbVar) {
        boolean z;
        boolean z2;
        IChartSeries iChartSeriesM7399k4;
        ChartSeriesGroup chartSeriesGroup;
        wxb wxbVar2;
        IChartData chartData = chart.getChartData();
        com.aspose.slides.internal.p332p7.oow oowVarM43016du = null;
        for (com.aspose.slides.internal.p332p7.ven venVar : kpwVar.m35638x1()) {
            oowVarM43016du = venVar.m43016du();
            if (oowVarM43016du != null) {
                break;
            }
        }
        if (oowVarM43016du != null) {
            String strM7402k4 = m7402k4(oowVarM43016du.m38395k4());
            if (!C14113y2.m67411k4(strM7402k4)) {
                List<C14857yq> listM686kk = chartDataWorkbook.m686kk(strM7402k4);
                if (listM686kk.size() == 0) {
                    return;
                }
                C14857yq c14857yq = listM686kk.get_Item(0);
                for (int iM74060du = c14857yq.m74060du(); iM74060du <= c14857yq.m74064m9(); iM74060du++) {
                    chartData.getCategories().add(chartDataWorkbook.getCell(c14857yq.m74062k4(), iM74060du, c14857yq.m74066x1()));
                }
            }
        }
        int length = kpwVar.m35635kk().length;
        int i = 0;
        com.aspose.slides.internal.p332p7.qmc qmcVar = null;
        com.aspose.slides.internal.p332p7.qmc qmcVar2 = null;
        com.aspose.slides.internal.p332p7.qmc qmcVar3 = null;
        com.aspose.slides.internal.p332p7.qmc qmcVar4 = null;
        com.aspose.slides.internal.p332p7.qmc qmcVar5 = null;
        for (com.aspose.slides.internal.p332p7.qmc qmcVar6 : kpwVar.m35635kk()) {
            if ("chart:bar".equals(qmcVar6.m39591kk())) {
                length--;
                qmcVar = qmcVar6;
            } else if (i == 0) {
                if (length == 4) {
                    qmcVar2 = qmcVar6;
                } else {
                    qmcVar4 = qmcVar6;
                }
                i++;
            } else {
                if (i == 1) {
                    if (length == 4) {
                    }
                    i++;
                } else {
                    if (i != 2 || length != 4) {
                        qmcVar5 = qmcVar6;
                    }
                    i++;
                }
                qmcVar3 = qmcVar6;
                i++;
            }
        }
        if (qmcVar != null) {
            m7399k4(chartData, chartDataWorkbook, 0, true, false, qmcVar, wxbVar);
            z = true;
        } else {
            z = false;
        }
        if (qmcVar2 != null) {
            m7399k4(chartData, chartDataWorkbook, 59, z, false, qmcVar2, wxbVar);
            z2 = true;
        } else {
            z2 = false;
        }
        if (qmcVar3 != null) {
            m7399k4(chartData, chartDataWorkbook, z2 ? 59 : 58, z, false, qmcVar3, wxbVar);
        }
        if (qmcVar4 != null) {
            iChartSeriesM7399k4 = m7399k4(chartData, chartDataWorkbook, z2 ? 59 : 58, z, false, qmcVar4, wxbVar);
            if (qmcVar5 == null) {
                throw new NullPointerException("Close Series Element can't be null.");
            }
            if (iChartSeriesM7399k4 == null) {
                throw new NullPointerException("Series can't be null.");
            }
            String strM39593to = qmcVar5.m39593to();
            if (!C14113y2.m67411k4(strM39593to) && C14113y2.m67448x1(strM39593to, "secondary-")) {
                chartSeriesGroup = (ChartSeriesGroup) iChartSeriesM7399k4.getParentSeriesGroup();
            }
            if (qmcVar5 == null) {
                wxbVar2 = wxbVar;
                iChartSeriesM7399k4 = m7399k4(chartData, chartDataWorkbook, z2 ? 59 : 58, z, true, qmcVar5, wxbVar2);
            } else {
                wxbVar2 = wxbVar;
            }
            if (z2) {
                IUpDownBarsManager upDownBars = chartSeriesGroup != null ? chartSeriesGroup.getUpDownBars() : chartData.getSeriesGroups().get_Item(0).getUpDownBars();
                upDownBars.setGapWidth(100);
                upDownBars.setUpDownBars(true);
                com.aspose.slides.internal.p332p7.hyg hygVarM35637to = kpwVar.m35637to();
                if (hygVarM35637to != null) {
                    com.aspose.slides.internal.p332p7.lzc lzcVarM7400k4 = m7400k4(upDownBars.getUpBarsFormat().getFill(), upDownBars.getUpBarsFormat().getLine(), (IChartTextFormat) null, hygVarM35637to.m33739k4(), wxbVar2);
                    if (lzcVarM7400k4 == null) {
                        throw new NullPointerException("Style Graphic can't be null.");
                    }
                    com.aspose.slides.internal.p332p7.rsv rsvVar = (com.aspose.slides.internal.p332p7.rsv) wgi.m72712k4(com.aspose.slides.internal.p332p7.rsv.class, "graphic-properties", lzcVarM7400k4.m36550to());
                    if (rsvVar != null && rsvVar.m40478k4() == 0 && C14113y2.m67411k4(rsvVar.m40498to())) {
                        upDownBars.getUpBarsFormat().getLine().getFillFormat().setFillType((byte) 1);
                        ((ColorFormat) upDownBars.getUpBarsFormat().getLine().getFillFormat().getSolidFillColor()).m1080k4(C12003du.m56460uz().Clone());
                    }
                }
                com.aspose.slides.internal.p332p7.rgw rgwVarM35631du = kpwVar.m35631du();
                if (rgwVarM35631du != null) {
                    m7400k4(upDownBars.getDownBarsFormat().getFill(), upDownBars.getDownBarsFormat().getLine(), (IChartTextFormat) null, rgwVarM35631du.m40005k4(), wxbVar2);
                }
            }
            if (kpwVar.m35633h4() != null) {
                ILineFormat line = (chartSeriesGroup != null ? chartSeriesGroup.getHiLowLinesFormat() : chartData.getSeriesGroups().get_Item(0).getHiLowLinesFormat()).getLine();
                m7400k4((IFillFormat) null, line, (IChartTextFormat) null, kpwVar.m35633h4().m33508k4(), wxbVar2);
                if (!z2 && iChartSeriesM7399k4 != null) {
                    IMarker marker = iChartSeriesM7399k4.getMarker();
                    marker.setSymbol(1);
                    marker.setSize(10);
                    marker.getFormat().getLine().getFillFormat().setFillType((byte) 0);
                    marker.getFormat().getFill().setFillType((byte) 1);
                    ((ColorFormat) marker.getFormat().getFill().getSolidFillColor()).m1080k4(((ColorFormat) line.getFillFormat().getSolidFillColor()).m1084to().Clone());
                }
            }
            m7404k4(chart, kpwVar, (ChartSeriesGroup) chartData.getSeriesGroups().get_Item(0), chartSeriesGroup, wxbVar2);
        }
        iChartSeriesM7399k4 = null;
        chartSeriesGroup = null;
        if (qmcVar5 == null) {
        }
        if (z2) {
        }
        if (kpwVar.m35633h4() != null) {
        }
        m7404k4(chart, kpwVar, (ChartSeriesGroup) chartData.getSeriesGroups().get_Item(0), chartSeriesGroup, wxbVar2);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m7404k4(Chart chart, com.aspose.slides.internal.p332p7.kpw kpwVar, ChartSeriesGroup chartSeriesGroup, ChartSeriesGroup chartSeriesGroup2, wxb wxbVar) {
        IAxis seriesAxis;
        IAxesManager axes = chart.getAxes();
        boolean z = false;
        boolean z2 = false;
        for (com.aspose.slides.internal.p332p7.ven venVar : kpwVar.m35638x1()) {
            int iM43018k4 = venVar.m43018k4();
            if (iM43018k4 == 1) {
                m7411k4(axes.getHorizontalAxis(), axes.getSecondaryHorizontalAxis(), chartSeriesGroup, chartSeriesGroup2, venVar, wxbVar);
                if (C14113y2.m67448x1(venVar.m43021x1(), "secondary-")) {
                    z = true;
                }
            } else if (iM43018k4 == 2) {
                m7411k4(axes.getVerticalAxis(), axes.getSecondaryVerticalAxis(), chartSeriesGroup, chartSeriesGroup2, venVar, wxbVar);
                if (C14113y2.m67448x1(venVar.m43021x1(), "secondary-")) {
                    z2 = true;
                }
            } else if (iM43018k4 == 3 && (seriesAxis = axes.getSeriesAxis()) != null) {
                m7411k4(seriesAxis, (IAxis) null, chartSeriesGroup, chartSeriesGroup2, venVar, wxbVar);
                ((Axis) seriesAxis).m319k4().m68852to(((Axis) axes.getHorizontalAxis()).m319k4().m68836dy());
            }
        }
        if (z && !z2 && axes.getSecondaryVerticalAxis() != null) {
            axes.getSecondaryVerticalAxis().setVisible(false);
        }
        if (!z2 || z || axes.getSecondaryHorizontalAxis() == null) {
            return;
        }
        axes.getSecondaryHorizontalAxis().setVisible(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r23v1 */
    /* JADX WARN: Type inference failed for: r23v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [com.aspose.slides.ChartDataWorkbook] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r4v22, types: [com.aspose.slides.IChartSeries] */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r6v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX INFO: renamed from: k4 */
    private static void m7405k4(Chart chart, com.aspose.slides.internal.p332p7.kpw kpwVar, com.aspose.slides.internal.p332p7.im9 im9Var, com.aspose.slides.internal.p332p7.im9 im9Var2, wxb wxbVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        ?? r23;
        ?? r4;
        ?? r6;
        ChartDataWorkbook chartDataWorkbook = (ChartDataWorkbook) chart.getChartData().getChartDataWorkbook();
        ChartPlotArea chartPlotArea = (ChartPlotArea) C7019kk.m27452k4((Object) chart.getPlotArea(), ChartPlotArea.class);
        int type = chart.getType();
        boolean zIsChartTypePie = ChartTypeCharacterizer.isChartTypePie(type);
        boolean zIsChartTypeDoughnut = ChartTypeCharacterizer.isChartTypeDoughnut(type);
        boolean zIs3DChart = ChartTypeCharacterizer.is3DChart(type);
        if (zIsChartTypePie || zIsChartTypeDoughnut || ChartTypeCharacterizer.isChartTypeRadar(type)) {
            long jM34290jd = im9Var2.m34290jd();
            if ((jM34290jd & 4294967295L) > 0) {
                chart.getChartData().getSeries().get_Item(0).setExplosion(zIsChartTypePie ? (int) jM34290jd : 15);
            }
        } else {
            com.aspose.slides.internal.p332p7.mga mgaVarM35636m9 = kpwVar.m35636m9();
            if (mgaVarM35636m9 != null) {
                IFormat format = zIs3DChart ? chart.getBackWall().getFormat() : chartPlotArea.getFormat();
                m7400k4(format.getFill(), format.getLine(), (IChartTextFormat) null, mgaVarM35636m9.m36935k4(), wxbVar);
            }
        }
        if (zIs3DChart) {
            ((Format) chart.getSideWall().getFormat()).m1555k4(chart.getBackWall().getFormat());
            com.aspose.slides.internal.p332p7.bsv bsvVarM35632dy = kpwVar.m35632dy();
            if (bsvVarM35632dy != null) {
                IFormat format2 = chart.getFloor().getFormat();
                m7400k4(format2.getFill(), format2.getLine(), (IChartTextFormat) null, bsvVarM35632dy.m29110k4(), wxbVar);
            }
        }
        if (ChartTypeCharacterizer.isChartTypeStock(type)) {
            m7403k4(chart, chartDataWorkbook, kpwVar, wxbVar);
            return;
        }
        boolean zIsChartTypeBubble = ChartTypeCharacterizer.isChartTypeBubble(type);
        com.aspose.slides.internal.p332p7.qmc[] qmcVarArrM35635kk = kpwVar.m35635kk();
        int length = qmcVarArrM35635kk.length;
        String strM7402k4 = "";
        ChartSeriesGroup chartSeriesGroup = null;
        ChartSeriesGroup chartSeriesGroup2 = null;
        int i = 0;
        int i2 = 0;
        String str = "";
        ?? r3 = chartDataWorkbook;
        while (i < length) {
            com.aspose.slides.internal.p332p7.qmc qmcVar = qmcVarArrM35635kk[i];
            if (zIsChartTypeBubble) {
                z = zIsChartTypeBubble;
                IChartSeries iChartSeriesAdd = chart.getChartData().getSeries().add(type);
                z2 = zIsChartTypePie;
                z3 = zIsChartTypeDoughnut;
                z4 = zIs3DChart;
                String strM7402k42 = str;
                int i3 = 0;
                for (com.aspose.slides.internal.p332p7.o9y o9yVar : qmcVar.m39592m9()) {
                    String strM38077k4 = o9yVar.m38077k4();
                    if (!C14113y2.m67411k4(strM38077k4)) {
                        if (i3 == 0) {
                            strM7402k42 = m7402k4(strM38077k4);
                        } else {
                            strM7402k4 = m7402k4(strM38077k4);
                        }
                        i3++;
                    }
                }
                m7416k4(iChartSeriesAdd, strM7402k4, strM7402k42, (ChartDataWorkbook) r3, qmcVar);
                str = strM7402k42;
                r4 = iChartSeriesAdd;
            } else {
                z = zIsChartTypeBubble;
                z2 = zIsChartTypePie;
                z3 = zIsChartTypeDoughnut;
                z4 = zIs3DChart;
                if (i2 >= chart.getChartData().getSeries().size()) {
                    r23 = r3;
                    i++;
                    zIsChartTypePie = z2;
                    zIsChartTypeBubble = z;
                    zIsChartTypeDoughnut = z3;
                    r3 = r23;
                    zIs3DChart = z4;
                } else {
                    r4 = chart.getChartData().getSeries().get_Item(i2);
                }
            }
            if (i2 == 0) {
                chartSeriesGroup = (ChartSeriesGroup) chart.getChartData().getSeriesGroups().get_Item(0);
            }
            if ("chart:line".equals(qmcVar.m39591kk()) && !ChartTypeCharacterizer.isChartTypeLine(r4.getType())) {
                r4.setType(19);
            }
            String strM39593to = qmcVar.m39593to();
            if (C14113y2.m67411k4(strM39593to) || !C14113y2.m67448x1(strM39593to, "secondary-")) {
                r6 = 1;
            } else {
                r6 = 1;
                r4.setPlotOnSecondAxis(true);
                ChartSeriesGroup chartSeriesGroup3 = (ChartSeriesGroup) r4.getParentSeriesGroup();
                chartSeriesGroup3.setGapWidth(chartSeriesGroup.getGapWidth());
                chartSeriesGroup3.setOverlap(chartSeriesGroup.getOverlap());
                chartSeriesGroup2 = chartSeriesGroup3;
            }
            r4.setInvertIfNegative(r6);
            if (im9Var != null && im9Var.m34283c5() > r6) {
                r4.setSmooth(r6);
            }
            String strM7402k43 = m7402k4(qmcVar.m39594x1());
            if (!C14113y2.m67411k4(strM7402k43)) {
                IChartCellCollection cellCollection = r3.getCellCollection(strM7402k43, r6);
                if (cellCollection.getCount() > 0) {
                    r4.getName().setFromOneCell(cellCollection.get_Item(0));
                }
            }
            r4.getRelatedLegendEntry().setHide(qmcVar.m39589h4() == 1);
            r23 = r3;
            m7400k4(r4.getFormat().getFill(), r4.getFormat().getLine(), (IChartTextFormat) null, qmcVar.m39587du(), wxbVar);
            m7419k4(r4.getMarker(), qmcVar.m39587du(), wxbVar);
            m7417k4((IChartSeries) r4, z2 || z3, qmcVar, wxbVar);
            i2++;
            i++;
            zIsChartTypePie = z2;
            zIsChartTypeBubble = z;
            zIsChartTypeDoughnut = z3;
            r3 = r23;
            zIs3DChart = z4;
        }
        boolean z5 = zIsChartTypePie;
        boolean z6 = zIsChartTypeDoughnut;
        boolean z7 = zIs3DChart;
        m7404k4(chart, kpwVar, chartSeriesGroup, chartSeriesGroup2, wxbVar);
        if (type == 47 || z6) {
            m7414k4(chart.getChartData());
        }
        if (z5 || z6) {
            chartSeriesGroup = (ChartSeriesGroup) chart.getChartData().getSeriesGroups().get_Item(0);
            if (z6) {
                chartSeriesGroup.setDoughnutHoleSize((byte) 30);
            }
            long jM34304v4 = im9Var.m34304v4() & 4294967295L;
            if (jM34304v4 != 4294967295L) {
                chartSeriesGroup.setFirstSliceAngle((int) ((((360 - jM34304v4) & 4294967295L) + 90) & C18177fb.f54859s));
            }
        }
        if (z7) {
            chartSeriesGroup.setGapDepth(100);
            IRotation3D rotation3D = chart.getRotation3D();
            rotation3D.setPerspective((byte) 30);
            rotation3D.setDepthPercents(100);
            rotation3D.setRightAngleAxes(true);
            if (z5) {
                rotation3D.setRotationX((byte) 30);
                rotation3D.setRotationY(0);
            } else {
                rotation3D.setRotationX((byte) 11);
                rotation3D.setRotationY(25);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002d A[PHI: r4
      0x002d: PHI (r4v1 int) = (r4v0 int), (r4v2 int), (r4v2 int) binds: [B:11:0x001e, B:15:0x0024, B:17:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void m7406k4(Chart chart, com.aspose.slides.internal.p332p7.qta qtaVar, wxb wxbVar) {
        if (qtaVar == null) {
            chart.setLegend(false);
            return;
        }
        Legend legend = (Legend) C7019kk.m27452k4((Object) chart.getLegend(), Legend.class);
        int iM39669k4 = qtaVar.m39669k4();
        if (iM39669k4 == 1) {
            legend.setPosition(1);
        } else if (iM39669k4 != 2) {
            int i = 3;
            if (iM39669k4 != 3) {
                i = 4;
                if (iM39669k4 == 4) {
                    legend.setPosition(0);
                } else if (iM39669k4 == 5 || iM39669k4 == 7) {
                    legend.setPosition(i);
                } else {
                    legend.setPosition(2);
                }
            }
        }
        legend.setOverlay(qtaVar.m39670kk() == 1);
        m7400k4(legend.getFormat().getFill(), legend.getFormat().getLine(), legend.getTextFormat(), qtaVar.m39671x1(), wxbVar);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m7407k4(ChartDataWorkbook chartDataWorkbook, IChartSeries iChartSeries, String str, AbstractC14173n9.k4 k4Var) {
        if (C14113y2.m67411k4(str)) {
            return;
        }
        List<C14857yq> listM686kk = chartDataWorkbook.m686kk(str);
        if (listM686kk.size() == 0) {
            return;
        }
        C14857yq c14857yq = listM686kk.get_Item(0);
        if (c14857yq.m74064m9() == 0) {
            return;
        }
        AbstractC14173n9.m67893k4(chartDataWorkbook, iChartSeries, c14857yq, k4Var);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m7408k4(ChartDataWorksheet chartDataWorksheet, int i, com.aspose.slides.internal.p332p7.exz exzVar) {
        Object objValueOf;
        byte b;
        if (exzVar == null) {
            return;
        }
        for (int i2 = 0; i2 < exzVar.m31422kk().size(); i2++) {
            ChartDataCell chartDataCellM63051x1 = chartDataWorksheet.m703x1().m63051x1(i, i2);
            com.aspose.slides.internal.p332p7.t1m t1mVar = (com.aspose.slides.internal.p332p7.t1m) exzVar.m31422kk().get_Item(i2).m29542x1();
            switch (t1mVar.m41502x1()) {
                case 1:
                    objValueOf = Double.valueOf(t1mVar.m41499kk());
                    chartDataCellM63051x1.setValue(objValueOf);
                    break;
                case 2:
                    chartDataCellM63051x1.setValue(Double.valueOf(t1mVar.m41499kk()));
                    b = 10;
                    chartDataCellM63051x1.setPresetNumberFormat(b);
                    break;
                case 3:
                    objValueOf = C14113y2.m67408k4(C14044b3.m66425h4(t1mVar.m41499kk()), t1mVar.m41501to());
                    chartDataCellM63051x1.setValue(objValueOf);
                    break;
                case 4:
                    chartDataCellM63051x1.setValue(t1mVar.m41492du().Clone());
                    b = 15;
                    chartDataCellM63051x1.setPresetNumberFormat(b);
                    break;
                case 5:
                    chartDataCellM63051x1.setValue(t1mVar.m41494h4().Clone());
                    b = 21;
                    chartDataCellM63051x1.setPresetNumberFormat(b);
                    break;
                case 6:
                    objValueOf = Byte.valueOf(t1mVar.m41500m9());
                    chartDataCellM63051x1.setValue(objValueOf);
                    break;
                default:
                    C6765kp c6765kp = new C6765kp(t1mVar.m41493dy());
                    if (c6765kp.m26807x1() == 0) {
                        IGenericEnumerator<C7394ca> it = t1mVar.m41491ck().iterator();
                        while (it.hasNext()) {
                            try {
                                com.aspose.slides.internal.p332p7.ok7 ok7Var = (com.aspose.slides.internal.p332p7.ok7) C7019kk.m27452k4((Object) it.next().m29542x1(), com.aspose.slides.internal.p332p7.ok7.class);
                                if (ok7Var != null) {
                                    c6765kp.m26810x1(m7401k4(ok7Var));
                                }
                            } finally {
                                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                                    it.dispose();
                                }
                            }
                        }
                    }
                    if (c6765kp.m26807x1() > 0) {
                        objValueOf = C14113y2.m67362du(c6765kp.toString(), new char[0]);
                        chartDataCellM63051x1.setValue(objValueOf);
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m7409k4(ChartDataWorksheet chartDataWorksheet, List<C7394ca> list, int[] iArr) {
        List.Enumerator<C7394ca> it = list.iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                com.aspose.slides.internal.p332p7.exz exzVarM33445k4 = (com.aspose.slides.internal.p332p7.exz) C7019kk.m27452k4((Object) next.m29542x1(), com.aspose.slides.internal.p332p7.exz.class);
                if (exzVarM33445k4 == null) {
                    com.aspose.slides.internal.p332p7.hi8 hi8Var = (com.aspose.slides.internal.p332p7.hi8) C7019kk.m27452k4((Object) next.m29542x1(), com.aspose.slides.internal.p332p7.hi8.class);
                    if (hi8Var != null) {
                        exzVarM33445k4 = hi8Var.m33445k4();
                    } else {
                        com.aspose.slides.internal.p332p7.awn awnVar = (com.aspose.slides.internal.p332p7.awn) C7019kk.m27452k4((Object) next.m29542x1(), com.aspose.slides.internal.p332p7.awn.class);
                        if (awnVar != null) {
                            m7409k4(chartDataWorksheet, awnVar.m28530k4(), iArr);
                        }
                    }
                }
                if (exzVarM33445k4 != null) {
                    m7408k4(chartDataWorksheet, iArr[0], exzVarM33445k4);
                    iArr[0] = iArr[0] + 1;
                } else {
                    com.aspose.slides.internal.p332p7.mrd mrdVar = (com.aspose.slides.internal.p332p7.mrd) C7019kk.m27452k4((Object) next.m29542x1(), com.aspose.slides.internal.p332p7.mrd.class);
                    if (mrdVar != null) {
                        m7409k4(chartDataWorksheet, mrdVar.m37077k4(), iArr);
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

    /* JADX INFO: renamed from: k4 */
    private static void m7410k4(ChartPlotArea chartPlotArea, com.aspose.slides.internal.p332p7.kpw kpwVar, com.aspose.slides.internal.p332p7.kfh kfhVar) {
        com.aspose.slides.internal.p332p7.omq omqVarM35630c5 = kpwVar.m35630c5();
        if (omqVarM35630c5 == null) {
            return;
        }
        float fM72703h4 = (float) wgi.m72703h4(kfhVar.m35348x1());
        float fM72703h42 = (float) wgi.m72703h4(kfhVar.m35345kk());
        if (C14064he.m66715kk(fM72703h4) || C14064he.m66715kk(fM72703h42)) {
            return;
        }
        C12007ix c12007ixClone = wgi.m72716k4(omqVarM35630c5.m38378k4(), omqVarM35630c5.m38381x1(), omqVarM35630c5.m38379kk(), omqVarM35630c5.m38380to()).Clone();
        if (c12007ixClone.m56568kk() || C14064he.m66715kk(c12007ixClone.m56550c5()) || C14064he.m66715kk(c12007ixClone.m56575x1())) {
            return;
        }
        chartPlotArea.setX(c12007ixClone.m56557jd() / fM72703h4);
        chartPlotArea.setY(c12007ixClone.m56551ck() / fM72703h42);
        chartPlotArea.setWidth(c12007ixClone.m56550c5() / fM72703h4);
        chartPlotArea.setHeight(c12007ixClone.m56575x1() / fM72703h42);
        C14361qv c14361qvM709k4 = chartPlotArea.m709k4();
        c14361qvM709k4.m6288k4(new C7534e4());
        c14361qvM709k4.m6286h4().m30788k4(1);
        c14361qvM709k4.m6294x1(c14361qvM709k4.m6286h4());
    }

    /* JADX INFO: renamed from: k4 */
    private static void m7411k4(IAxis iAxis, IAxis iAxis2, ChartSeriesGroup chartSeriesGroup, ChartSeriesGroup chartSeriesGroup2, com.aspose.slides.internal.p332p7.ven venVar, wxb wxbVar) {
        IAxis iAxis3;
        boolean z;
        boolean z2;
        boolean z3 = venVar.m43018k4() == 2;
        if (C14113y2.m67448x1(venVar.m43021x1(), "primary-")) {
            if (iAxis != null) {
                m7412k4(iAxis, z3, false, chartSeriesGroup, venVar, wxbVar);
            }
            if (iAxis2 == null) {
                return;
            }
            z2 = true;
            iAxis3 = iAxis2;
            z = z3;
        } else {
            iAxis3 = iAxis2;
            z = z3;
            if (!C14113y2.m67448x1(venVar.m43021x1(), "secondary-") || iAxis3 == null) {
                return;
            } else {
                z2 = true;
            }
        }
        m7412k4(iAxis3, z, z2, chartSeriesGroup2, venVar, wxbVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:135:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01ae  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void m7412k4(IAxis iAxis, boolean z, boolean z2, ChartSeriesGroup chartSeriesGroup, com.aspose.slides.internal.p332p7.ven venVar, wxb wxbVar) {
        com.aspose.slides.internal.p332p7.im9 im9Var;
        byte bM34286dy;
        double dM34307x6;
        double dM34298rv;
        double dM34296ne;
        long jM34289ix;
        int type = chartSeriesGroup.getChart().getType();
        Axis axisM325to = ((Axis) iAxis).m325to();
        m7413k4((axisM325to == null || !ChartTypeCharacterizer.isChartTypeBar(type)) ? iAxis : axisM325to, venVar.m43017h4(), wxbVar);
        com.aspose.slides.internal.p332p7.nci nciVarM43020to = venVar.m43020to();
        if (nciVarM43020to != null) {
            iAxis.setTitle(true);
            m7418k4(iAxis.getTitle(), nciVarM43020to, (com.aspose.slides.internal.p332p7.mhd) null, wxbVar);
        }
        com.aspose.slides.internal.p332p7.lzc lzcVarM7400k4 = m7400k4(iAxis.getFormat().getFill(), iAxis.getFormat().getLine(), iAxis.getTextFormat(), venVar.m43019kk(), wxbVar);
        if (lzcVarM7400k4 == null || (im9Var = (com.aspose.slides.internal.p332p7.im9) wgi.m72712k4(com.aspose.slides.internal.p332p7.im9.class, "chart-properties", lzcVarM7400k4.m36550to())) == null) {
            return;
        }
        chartSeriesGroup.setGapWidth((im9Var.m34295m9() > 0 ? im9Var.m34295m9() : 100) & 65535);
        int type2 = chartSeriesGroup.getSeries().get_Item(0).getType();
        if (!ChartTypeCharacterizer.m758dy(type2) && !ChartTypeCharacterizer.m761jd(type2)) {
            if (im9Var.m34286dy() != 0) {
                bM34286dy = (byte) im9Var.m34286dy();
            }
            Object[] objArr = z && (ChartTypeCharacterizer.isChartTypeScatter(type) || ChartTypeCharacterizer.isChartTypeBubble(type));
            dM34307x6 = im9Var.m34307x6();
            if (C14044b3.m66437kk(dM34307x6)) {
                iAxis.setAutomaticMinValue(false);
                iAxis.setMinValue(dM34307x6);
            } else if (objArr != false) {
                iAxis.setAutomaticMinValue(false);
                iAxis.setMinValue(0.5d);
            }
            dM34298rv = im9Var.m34298rv();
            if (!C14044b3.m66437kk(dM34298rv)) {
                iAxis.setAutomaticMaxValue(false);
                iAxis.setMaxValue(dM34298rv);
            }
            dM34296ne = im9Var.m34296ne();
            if (C14044b3.m66437kk(dM34296ne)) {
                iAxis.setAutomaticMajorUnit(false);
                iAxis.setMajorUnit(dM34296ne);
            } else if (objArr != false) {
                iAxis.setAutomaticMajorUnit(false);
                iAxis.setMajorUnit(0.5d);
            }
            jM34289ix = im9Var.m34289ix() & 4294967295L;
            if (jM34289ix != 4294967295L) {
                iAxis.setAutomaticMinorUnit(false);
                iAxis.setMinorUnit(jM34289ix);
            }
            iAxis.setLogarithmic(im9Var.m34293ks() != 1);
            iAxis.setPlotOrderReversed(im9Var.m34280ar());
            iAxis.setVisible(im9Var.m34309yj() == 0);
            if (im9Var.m34305wl() != 0) {
                iAxis.setTickLabelPosition(3);
            } else {
                int iM34282bv = im9Var.m34282bv();
                if (iM34282bv == 3) {
                    iAxis.setTickLabelPosition(0);
                } else if (iM34282bv != 4) {
                    iAxis.setTickLabelPosition(2);
                } else {
                    iAxis.setTickLabelPosition(1);
                }
            }
            if ((im9Var.m34297qq() & 4294967295L) != 4294967295L) {
                iAxis.getTextFormat().getTextBlockFormat().setRotationAngle((360 - (im9Var.m34297qq() & 4294967295L)) & 4294967295L);
            }
            if (im9Var.m34300u4() == -1) {
                iAxis.setMajorTickMark(im9Var.m34300u4() == 1 ? 1 : 3);
            } else if (iAxis.getMajorTickMark() == 0) {
                iAxis.setMajorTickMark(2);
            }
            if (im9Var.m34303uz() == -1) {
                iAxis.setMinorTickMark(im9Var.m34303uz() == 1 ? 1 : 3);
            } else if (iAxis.getMinorTickMark() == 0) {
                iAxis.setMinorTickMark(2);
            }
            if (axisM325to != null) {
                return;
            }
            float[] fArr = {0.0f};
            boolean zM66714k4 = C14064he.m66714k4(im9Var.m34301um(), fArr);
            float f = fArr[0];
            if ("end".equals(im9Var.m34301um())) {
                axisM325to.setCrossType(1);
                if (z2 && axisM325to.isPlotOrderReversed()) {
                    iAxis.setPosition(z ? 1 : 0);
                } else {
                    iAxis.setPosition(z ? 2 : 3);
                }
            } else if ("start".equals(im9Var.m34301um()) || (zM66714k4 && f == 0.0f)) {
                axisM325to.setCrossType(0);
            } else if (zM66714k4) {
                axisM325to.setCrossType(2);
                axisM325to.setCrossAt(f);
            }
            if (z) {
                return;
            }
            int i = (ChartTypeCharacterizer.isChartTypeArea(type) || ChartTypeCharacterizer.isChartTypeLine(type)) ? 1 : 0;
            if (im9Var.m34294lr() == 0.5d) {
                axisM325to.m319k4().m68856x1(i ^ 1);
                return;
            } else {
                axisM325to.m319k4().m68856x1(i);
                return;
            }
        }
        bM34286dy = (byte) (im9Var.m34286dy() > 0 ? im9Var.m34286dy() : 100);
        chartSeriesGroup.setOverlap(bM34286dy);
        if (z) {
        }
        dM34307x6 = im9Var.m34307x6();
        if (C14044b3.m66437kk(dM34307x6)) {
        }
        dM34298rv = im9Var.m34298rv();
        if (!C14044b3.m66437kk(dM34298rv)) {
        }
        dM34296ne = im9Var.m34296ne();
        if (C14044b3.m66437kk(dM34296ne)) {
        }
        jM34289ix = im9Var.m34289ix() & 4294967295L;
        if (jM34289ix != 4294967295L) {
        }
        iAxis.setLogarithmic(im9Var.m34293ks() != 1);
        iAxis.setPlotOrderReversed(im9Var.m34280ar());
        iAxis.setVisible(im9Var.m34309yj() == 0);
        if (im9Var.m34305wl() != 0) {
        }
        if ((im9Var.m34297qq() & 4294967295L) != 4294967295L) {
        }
        if (im9Var.m34300u4() == -1) {
        }
        if (im9Var.m34303uz() == -1) {
        }
        if (axisM325to != null) {
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m7413k4(IAxis iAxis, com.aspose.slides.internal.p332p7.jj3[] jj3VarArr, wxb wxbVar) {
        IChartLinesFormat majorGridLinesFormat = iAxis.getMajorGridLinesFormat();
        IChartLinesFormat minorGridLinesFormat = iAxis.getMinorGridLinesFormat();
        boolean z = false;
        boolean z2 = false;
        for (com.aspose.slides.internal.p332p7.jj3 jj3Var : jj3VarArr) {
            if (jj3Var.m34727k4() == 1) {
                m7400k4((IFillFormat) null, majorGridLinesFormat.getLine(), (IChartTextFormat) null, jj3Var.m34728x1(), wxbVar);
                iAxis.setMajorTickMark(3);
                z = true;
            } else if (jj3Var.m34727k4() == 2) {
                m7400k4((IFillFormat) null, minorGridLinesFormat.getLine(), (IChartTextFormat) null, jj3Var.m34728x1(), wxbVar);
                iAxis.setMinorTickMark(3);
                z2 = true;
            }
        }
        if (!z) {
            majorGridLinesFormat.getLine().getFillFormat().setFillType((byte) 0);
        }
        if (z2) {
            return;
        }
        minorGridLinesFormat.getLine().getFillFormat().setFillType((byte) 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    private static void m7414k4(IChartData iChartData) {
        ChartSeriesCollection chartSeriesCollection = (ChartSeriesCollection) iChartData.getSeries();
        int size = chartSeriesCollection.size() - 1;
        if (size <= 0) {
            return;
        }
        List list = new List();
        IGenericEnumerator<IChartSeries> it = chartSeriesCollection.iterator();
        while (it.hasNext()) {
            try {
                list.addItem(it.next());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        C14346qh c14346qh = (C14346qh) iChartData.getSeriesGroups();
        List.Enumerator it2 = list.iterator();
        while (it2.hasNext()) {
            try {
                ChartSeries chartSeries = (ChartSeries) it2.next();
                c14346qh.m69582x1(chartSeries);
                chartSeriesCollection.m746k4(0, chartSeries);
                int i = size - 1;
                chartSeries.setOrder(size);
                size = i;
            } finally {
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            }
        }
        it = chartSeriesCollection.iterator();
        while (it.hasNext()) {
            try {
                ((C14346qh) iChartData.getSeriesGroups()).m69580k4((ChartSeries) it.next());
            } finally {
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m7415k4(IChartData iChartData, com.aspose.slides.internal.p332p7.n6p n6pVar, int i) {
        ChartDataWorksheet chartDataWorksheet = (ChartDataWorksheet) iChartData.getChartDataWorkbook().getWorksheets().get_Item(0);
        String strM37284k4 = n6pVar.m37284k4();
        if (strM37284k4 == null) {
            strM37284k4 = "local-table";
        }
        chartDataWorksheet.m700k4(strM37284k4);
        m7409k4(chartDataWorksheet, n6pVar.m37282jd(), new int[]{0});
        C13646iq c13646iqM703x1 = chartDataWorksheet.m703x1();
        if (c13646iqM703x1.m63049to() <= 0 || c13646iqM703x1.m63050x1() <= 0 || ChartTypeCharacterizer.isChartTypeStock(i) || ChartTypeCharacterizer.isChartTypeBubble(i)) {
            return;
        }
        C6765kp c6765kp = new C6765kp(chartDataWorksheet.getName());
        c6765kp.m26792k4("!");
        c6765kp.m26792k4(c13646iqM703x1.m63051x1(0, 0).m561du());
        c6765kp.m26792k4(C18241k5.f55433h);
        c6765kp.m26792k4(c13646iqM703x1.m63051x1(c13646iqM703x1.m63050x1(), c13646iqM703x1.m63049to()).m561du());
        iChartData.setRange(c6765kp.toString());
        if (iChartData.getSeriesGroups().size() > 1) {
            C14346qh c14346qh = (C14346qh) iChartData.getSeriesGroups();
            C14886zi c14886zi = (C14886zi) c14346qh.get_Item(0).getSeries();
            for (int i2 = 1; i2 < iChartData.getSeries().size(); i2++) {
                ChartSeries chartSeries = (ChartSeries) iChartData.getSeries().get_Item(i2);
                c14346qh.m69582x1(chartSeries);
                c14886zi.m74527k4(chartSeries);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m7416k4(IChartSeries iChartSeries, String str, String str2, ChartDataWorkbook chartDataWorkbook, com.aspose.slides.internal.p332p7.qmc qmcVar) {
        if (C14113y2.m67411k4(str)) {
            iChartSeries.getDataPoints().setDataSourceTypeForXValues(2);
        }
        iChartSeries.getDataPoints().setDataSourceTypeForYValues(0);
        iChartSeries.getDataPoints().setDataSourceTypeForBubbleSizes(0);
        m7407k4(chartDataWorkbook, iChartSeries, str2, new AbstractC14173n9.k4() { // from class: com.aspose.slides.i3.2
            @Override // com.aspose.slides.AbstractC14173n9.k4
            /* JADX INFO: renamed from: k4 */
            public void mo6300k4(IChartDataCell iChartDataCell, IChartDataPoint iChartDataPoint) {
                iChartDataPoint.getYValue().setAsCell(iChartDataCell);
                if (iChartDataPoint.getXValue().getDataSourceType() == 2) {
                    iChartDataPoint.getXValue().setAsLiteralDouble(((iChartDataPoint.getIndex() & 4294967295L) + 1) & 4294967295L);
                }
            }
        });
        m7407k4(chartDataWorkbook, iChartSeries, str, new AbstractC14173n9.k4() { // from class: com.aspose.slides.i3.3
            @Override // com.aspose.slides.AbstractC14173n9.k4
            /* JADX INFO: renamed from: k4 */
            public void mo6300k4(IChartDataCell iChartDataCell, IChartDataPoint iChartDataPoint) {
                iChartDataPoint.getXValue().setAsCell(iChartDataCell);
            }
        });
        m7407k4(chartDataWorkbook, iChartSeries, m7402k4(qmcVar.m39590k4()), new AbstractC14173n9.k4() { // from class: com.aspose.slides.i3.4
            @Override // com.aspose.slides.AbstractC14173n9.k4
            /* JADX INFO: renamed from: k4 */
            public void mo6300k4(IChartDataCell iChartDataCell, IChartDataPoint iChartDataPoint) {
                iChartDataPoint.getBubbleSize().setAsCell(iChartDataCell);
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    private static void m7417k4(IChartSeries iChartSeries, boolean z, com.aspose.slides.internal.p332p7.qmc qmcVar, wxb wxbVar) {
        final int[] iArr = {0};
        ChartDataPointCollection chartDataPointCollection = (ChartDataPointCollection) iChartSeries.getDataPoints();
        for (com.aspose.slides.internal.p332p7.bls blsVar : qmcVar.m39588dy()) {
            ChartDataPoint chartDataPoint = (ChartDataPoint) C7019kk.m27452k4((Object) chartDataPointCollection.m621k4(new AbstractC14041ai<IChartDataPoint>() { // from class: com.aspose.slides.i3.5
                @Override // com.aspose.slides.p559ms.System.AbstractC14041ai
                /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                public boolean invoke(IChartDataPoint iChartDataPoint) {
                    return (iChartDataPoint.getIndex() & 4294967295L) == ((long) iArr[0]);
                }
            }), ChartDataPoint.class);
            if (chartDataPoint == null) {
                chartDataPoint = (ChartDataPoint) chartDataPointCollection.m618k4();
                chartDataPoint.m588k4(((long) iArr[0]) & 4294967295L);
            }
            com.aspose.slides.internal.p332p7.lzc lzcVarM7400k4 = m7400k4(chartDataPoint.getFormat().getFill(), chartDataPoint.getFormat().getLine(), (IChartTextFormat) null, blsVar.m28993k4(), wxbVar);
            if (lzcVarM7400k4 != null && z) {
                long jM34290jd = ((com.aspose.slides.internal.p332p7.im9) wgi.m72712k4(com.aspose.slides.internal.p332p7.im9.class, "chart-properties", lzcVarM7400k4.m36550to())).m34290jd();
                if ((4294967295L & jM34290jd) > 0) {
                    chartDataPoint.setExplosion((int) jM34290jd);
                }
            }
            iArr[0] = iArr[0] + 1;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m7418k4(IChartTitle iChartTitle, com.aspose.slides.internal.p332p7.nci nciVar, com.aspose.slides.internal.p332p7.mhd mhdVar, wxb wxbVar) {
        iChartTitle.setOverlay(false);
        gga ggaVarM6640k4 = gga.m6640k4(nciVar.m37420k4(), 12);
        if (iChartTitle.getTextFrameForOverriding() == null) {
            iChartTitle.addTextFrameForOverriding("");
            iChartTitle.getTextFrameForOverriding().getParagraphs().clear();
        }
        m7420k4((TextFrame) iChartTitle.getTextFrameForOverriding(), nciVar.m37421x1(), wxbVar, ggaVarM6640k4);
        if (mhdVar != null) {
            m7420k4((TextFrame) iChartTitle.getTextFrameForOverriding(), mhdVar.m36953k4(), wxbVar, ggaVarM6640k4);
        }
        m7400k4(iChartTitle.getFormat().getFill(), iChartTitle.getFormat().getLine(), (IChartTextFormat) null, nciVar.m37420k4(), wxbVar);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m7419k4(IMarker iMarker, String str, wxb wxbVar) {
        com.aspose.slides.internal.p332p7.im9 im9Var;
        Format format = new Format((Marker) iMarker);
        com.aspose.slides.internal.p332p7.lzc lzcVarM7400k4 = m7400k4(format.getFill(), format.getLine(), (IChartTextFormat) null, str, wxbVar);
        if (lzcVarM7400k4 == null || (im9Var = (com.aspose.slides.internal.p332p7.im9) wgi.m72712k4(com.aspose.slides.internal.p332p7.im9.class, "chart-properties", lzcVarM7400k4.m36550to())) == null || im9Var.m34306x1() == 0) {
            return;
        }
        int iM34306x1 = im9Var.m34306x1();
        if (iM34306x1 == 1) {
            iMarker.setSymbol(4);
            return;
        }
        iMarker.setSymbol(iM34306x1 != 3 ? -1 : m7395k4(im9Var.m34292kk()));
        double dM72703h4 = wgi.m72703h4(im9Var.m34299to());
        if (C14044b3.m66437kk(dM72703h4)) {
            dM72703h4 = wgi.m72703h4(im9Var.m34285du());
        }
        if (!C14044b3.m66437kk(dM72703h4)) {
            iMarker.setSize(C7019kk.m27462to(Double.valueOf(C14116yg.m67497to(dM72703h4)), 14));
        }
        ((Format) iMarker.getFormat()).m1555k4((IFormat) format);
        FillFormat fillFormat = (FillFormat) iMarker.getFormat().getFill();
        LineFormat lineFormat = (LineFormat) iMarker.getFormat().getLine();
        if (fillFormat.getFillType() == 1) {
            if (iMarker.getSymbol() == 10 || iMarker.getSymbol() == 6 || iMarker.getSymbol() == 8) {
                lineFormat.setWidth(1.5d);
                lineFormat.getFillFormat().setFillType((byte) 1);
                lineFormat.getFillFormat().getSolidFillColor().copyFrom(fillFormat.getSolidFillColor());
                fillFormat.setFillType((byte) 0);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m7420k4(TextFrame textFrame, com.aspose.slides.internal.p332p7.ok7 ok7Var, wxb wxbVar, gga ggaVar) {
        if (ok7Var == null) {
            return;
        }
        Paragraph paragraph = new Paragraph();
        textFrame.getParagraphs().add(paragraph);
        fmm.m6229k4(paragraph, textFrame, ok7Var, wxbVar, ggaVar);
        IGenericEnumerator<IPortion> it = paragraph.getPortions().iterator();
        while (it.hasNext()) {
            try {
                IPortion next = it.next();
                if (next.getPortionFormat().getFontBold() == -1) {
                    next.getPortionFormat().setFontBold((byte) 0);
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }
}

package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.InvalidDataException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.InterfaceC14073kp;

/* JADX INFO: renamed from: com.aspose.slides.nz */
/* JADX INFO: loaded from: classes3.dex */
class C14209nz {
    /* JADX INFO: renamed from: k4 */
    public static void m68287k4(ChartDataCell chartDataCell, com.aspose.slides.internal.p332p7.sw4 sw4Var, ctu ctuVar) {
        String strM66987ks;
        sw4Var.m41390k4(chartDataCell.m561du());
        sw4Var.m41387k4(chartDataCell.m559c5().m72689ks().f3866x1);
        if (!"".equals(C14113y2.m67440x1(chartDataCell.getCustomNumberFormat()))) {
            chartDataCell.m562dy().m73598x1(chartDataCell.m563fa().m72938x1());
        }
        sw4Var.m41388k4(((long) chartDataCell.m565jd()) & 4294967295L);
        if (chartDataCell.m559c5().m72689ks().f3861k4 != null) {
            if (chartDataCell.m559c5().m72689ks().f3866x1 == 3) {
                mco mcoVar = chartDataCell.m572kk().f1429x1;
                int iM64840k4 = 0;
                while (true) {
                    if (iM64840k4 >= mcoVar.m64845x1()) {
                        iM64840k4 = -1;
                        break;
                    }
                    try {
                    } catch (RuntimeException unused) {
                        ctuVar.m4810k4(C14113y2.m67408k4("SharedString ", sw4Var.m41385du(), " has unknown type and is not read"), 1);
                    }
                    if (C14113y2.m67363du(mcoVar.m64841k4(iM64840k4), (String) chartDataCell.getValue())) {
                        break;
                    } else {
                        iM64840k4++;
                    }
                }
                if (iM64840k4 == -1) {
                    iM64840k4 = mcoVar.m64840k4((String) chartDataCell.getValue());
                    mcoVar.f46216x1++;
                }
                sw4Var.m41394x1(C14080ne.m66948k4(Integer.valueOf(iM64840k4), (InterfaceC14073kp) C11697x1.m55250kk()));
                mcoVar.f46213k4++;
            } else if (chartDataCell.m559c5().m72689ks().f3866x1 != 0) {
                strM66987ks = C14080ne.m66987ks(chartDataCell.m559c5().m72689ks().f3861k4, C11697x1.m55250kk());
            } else if (chartDataCell.m559c5().mo3433h4() != null) {
                strM66987ks = C14080ne.m66946k4(chartDataCell.m559c5().mo3433h4(), (InterfaceC14073kp) C11697x1.m55250kk());
            } else {
                ctuVar.m4810k4(C14113y2.m67408k4("Boolean value is lost for cell ", chartDataCell.m561du(), "."), 1);
            }
            m68291x1(chartDataCell, sw4Var, ctuVar);
        }
        strM66987ks = null;
        sw4Var.m41394x1(strM66987ks);
        m68291x1(chartDataCell, sw4Var, ctuVar);
    }

    /* JADX INFO: renamed from: x1 */
    private static void m68291x1(ChartDataCell chartDataCell, com.aspose.slides.internal.p332p7.sw4 sw4Var, ctu ctuVar) {
        com.aspose.slides.internal.p332p7.qy7 qy7Var = chartDataCell.m559c5().m72689ks().f3859h4;
        if (qy7Var != null) {
            sw4Var.m41389k4(qy7Var);
            if (m68290k4(qy7Var)) {
                ctuVar.m4813to().m73116k4(chartDataCell, qy7Var.m39786to(), qy7Var.m39787x1());
                return;
            }
            return;
        }
        if (chartDataCell.m559c5().m72691up()) {
            com.aspose.slides.internal.p332p7.qy7 qy7Var2 = new com.aspose.slides.internal.p332p7.qy7();
            qy7Var2.m39788x1(chartDataCell.getFormula());
            qy7Var2.m39781k4(3);
            qy7Var2.m39782k4(((long) ctuVar.m4813to().m73113k4(chartDataCell.getChartDataWorksheet().getIndex())) & 4294967295L);
            qy7Var2.m39783k4(chartDataCell.m559c5().m72690rv());
            qy7Var2.m39784k4(chartDataCell.m559c5().m72689ks().f3863m9);
            sw4Var.m41389k4(qy7Var2);
            ctuVar.m4813to().m73116k4(chartDataCell, qy7Var2.m39786to(), qy7Var2.m39787x1());
            return;
        }
        if (chartDataCell.m559c5().m72692yj()) {
            com.aspose.slides.internal.p332p7.qy7 qy7Var3 = new com.aspose.slides.internal.p332p7.qy7();
            qy7Var3.m39781k4(3);
            qy7Var3.m39782k4(ctuVar.m4813to().m73114k4(chartDataCell));
            qy7Var3.m39784k4(chartDataCell.m559c5().m72689ks().f3863m9);
            sw4Var.m41389k4(qy7Var3);
            return;
        }
        if (C14113y2.m67411k4(chartDataCell.getFormula())) {
            sw4Var.m41389k4((com.aspose.slides.internal.p332p7.qy7) null);
            return;
        }
        com.aspose.slides.internal.p332p7.qy7 qy7Var4 = new com.aspose.slides.internal.p332p7.qy7();
        qy7Var4.m39788x1(chartDataCell.getFormula());
        qy7Var4.m39781k4(0);
        qy7Var4.m39784k4(chartDataCell.m559c5().m72689ks().f3863m9);
        sw4Var.m41389k4(qy7Var4);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m68288k4(ChartDataCell chartDataCell, com.aspose.slides.internal.p332p7.sw4 sw4Var, hxc hxcVar) {
        String strM67408k4;
        a9h a9hVarM72689ks;
        Object objValueOf;
        a9h a9hVarM72689ks2;
        wuq wuqVarM560ck;
        if (sw4Var == null) {
            return;
        }
        chartDataCell.m575to(sw4Var.m41386k4());
        chartDataCell.m559c5().m72689ks().f3866x1 = sw4Var.m41391kk();
        chartDataCell.m569k4(chartDataCell.m572kk().f1427to.m74814k4((int) sw4Var.m41393x1()));
        if ((chartDataCell.m562dy().m73593to() & 4294967295L) >= 164 && chartDataCell.m562dy().m73570c5() != 0 && (wuqVarM560ck = chartDataCell.m560ck()) != null) {
            chartDataCell.setCustomNumberFormat(wuqVarM560ck.m72935k4());
        }
        String strM41385du = null;
        if (sw4Var.m41385du() != null) {
            byte bM41391kk = sw4Var.m41391kk();
            if (bM41391kk != 0) {
                if (bM41391kk == 1) {
                    objValueOf = t5p.m70971k4(sw4Var.m41385du());
                    if (objValueOf != null) {
                        a9hVarM72689ks = chartDataCell.m559c5().m72689ks();
                        a9hVarM72689ks.f3861k4 = objValueOf;
                    } else {
                        chartDataCell.m559c5().m72689ks().f3861k4 = null;
                        strM67408k4 = C14113y2.m67408k4("Number value ", sw4Var.m41385du(), " has unknown format and is not loaded.");
                    }
                } else if (bM41391kk == 3) {
                    try {
                        chartDataCell.m559c5().m72689ks().f3861k4 = chartDataCell.m572kk().f1429x1.m64841k4(C14080ne.m67015to(sw4Var.m41385du()));
                    } catch (NotImplementedException unused) {
                        chartDataCell.m559c5().m72689ks().f3861k4 = null;
                        strM67408k4 = C14113y2.m67408k4("SharedString ", sw4Var.m41385du(), " has unknown type and is not loaded");
                        hxcVar.m7324k4(strM67408k4, 1);
                    }
                } else if (bM41391kk != 6) {
                    a9hVarM72689ks2 = chartDataCell.m559c5().m72689ks();
                    strM41385du = sw4Var.m41385du();
                } else {
                    Double dM70972k4 = t5p.m70972k4(sw4Var.m41385du(), 0);
                    if (dM70972k4 != null) {
                        chartDataCell.m559c5().m72689ks().f3861k4 = dM70972k4;
                        chartDataCell.m559c5().m72689ks().f3866x1 = (byte) 1;
                    } else {
                        chartDataCell.m559c5().m72689ks().f3861k4 = null;
                        strM67408k4 = C14113y2.m67408k4("Date value ", sw4Var.m41385du(), " has unknown format and is not loaded.");
                    }
                }
                hxcVar.m7324k4(strM67408k4, 1);
            } else {
                Integer numM70973x1 = t5p.m70973x1(sw4Var.m41385du());
                if (numM70973x1 != null) {
                    a9hVarM72689ks = chartDataCell.m559c5().m72689ks();
                    objValueOf = Boolean.valueOf(numM70973x1.intValue() == 1);
                    a9hVarM72689ks.f3861k4 = objValueOf;
                } else {
                    chartDataCell.m559c5().m72689ks().f3861k4 = null;
                    strM67408k4 = C14113y2.m67408k4("Boolean value ", sw4Var.m41385du(), " has unknown format and is not loaded.");
                    hxcVar.m7324k4(strM67408k4, 1);
                }
            }
            m68292x1(chartDataCell, sw4Var, hxcVar);
            chartDataCell.f1346k4 = true;
        }
        a9hVarM72689ks2 = chartDataCell.m559c5().m72689ks();
        a9hVarM72689ks2.f3861k4 = strM41385du;
        m68292x1(chartDataCell, sw4Var, hxcVar);
        chartDataCell.f1346k4 = true;
    }

    /* JADX INFO: renamed from: x1 */
    private static void m68292x1(ChartDataCell chartDataCell, com.aspose.slides.internal.p332p7.sw4 sw4Var, hxc hxcVar) {
        String strM67402k4;
        if (sw4Var == null || sw4Var.m41392to() == null) {
            return;
        }
        int iM39780k4 = sw4Var.m41392to().m39780k4();
        if (iM39780k4 == 0 || iM39780k4 == 1) {
            if (m68289k4(chartDataCell, sw4Var.m41392to().m39779du())) {
                chartDataCell.m559c5().m72689ks().f3862kk = sw4Var.m41392to().m39779du();
                chartDataCell.m559c5().m72689ks().m3450to(0);
            } else if (sw4Var.m41391kk() != 2) {
                strM67402k4 = C14113y2.m67402k4("Formula {0} (type: {1}) is not supported.", sw4Var.m41392to().m39779du(), C14067j2.m66727k4(sw4Var.m41392to()));
                hxcVar.m7324k4(strM67402k4, 1);
            }
        } else if (iM39780k4 != 3) {
            strM67402k4 = C14113y2.m67402k4("Formula {0} (type: {1}) is not supported.", sw4Var.m41392to().m39779du(), C14067j2.m66727k4(sw4Var.m41392to()));
            hxcVar.m7324k4(strM67402k4, 1);
        } else if (C14113y2.m67411k4(sw4Var.m41392to().m39787x1())) {
            ChartDataCell chartDataCellM73115k4 = hxcVar.m7326to().m73115k4(chartDataCell, sw4Var.m41392to().m39786to());
            if (chartDataCellM73115k4 == null) {
                throw new InvalidDataException(C14113y2.m67402k4("A master formula cell is not found for the cell {0}.", sw4Var.m41386k4()));
            }
            chartDataCell.m559c5().m72689ks().f3864to = chartDataCellM73115k4.m559c5().m72689ks();
            if (chartDataCellM73115k4.m559c5().m72689ks().f3856du == null) {
                chartDataCellM73115k4.m559c5().m72689ks().f3856du = new List<>();
            }
            chartDataCellM73115k4.m559c5().m72689ks().f3856du.addItem(chartDataCell.m559c5().m72689ks());
        } else {
            if (m68289k4(chartDataCell, sw4Var.m41392to().m39779du())) {
                chartDataCell.m559c5().m72689ks().f3862kk = sw4Var.m41392to().m39779du();
                chartDataCell.m559c5().m72689ks().m3450to(0);
            } else {
                hxcVar.m7324k4(C14113y2.m67402k4("Formula {0} (type: {1}) is not supported.", sw4Var.m41392to().m39779du(), C14067j2.m66727k4(sw4Var.m41392to())), 1);
            }
            hxcVar.m7326to().m73116k4(chartDataCell, sw4Var.m41392to().m39786to(), sw4Var.m41392to().m39787x1());
        }
        chartDataCell.m559c5().m72689ks().f3863m9 = sw4Var.m41392to().m39785kk();
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m68289k4(ChartDataCell chartDataCell, String str) {
        List list = new List();
        list.addRange(tst.m71299kk());
        list.addRange(tst.m71300to());
        list.addRange(tst.m71298k4());
        C14699vr c14699vr = new C14699vr(new C1219hp(list, str), chartDataCell.getRow() + 1, chartDataCell.getColumn() + 1, 0);
        if (c14699vr.m72507kk() == null) {
            return false;
        }
        if (c14699vr.m72508x1().size() > 0) {
            C0909dp c0909dpMo3428c5 = chartDataCell.m559c5().mo3428c5();
            chartDataCell.m559c5().mo3436k4().mo5425k4().mo5386kk().mo67821k4(c0909dpMo3428c5.mo3720k4(), c0909dpMo3428c5, c14699vr.m72508x1());
        }
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m68290k4(com.aspose.slides.internal.p332p7.qy7 qy7Var) {
        return qy7Var.m39780k4() == 3 && !C14113y2.m67411k4(qy7Var.m39787x1());
    }
}

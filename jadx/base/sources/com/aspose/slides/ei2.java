package com.aspose.slides;

import androidx.core.text.util.LocalePreferences;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.facebook.common.callercontext.ContextChain;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class ei2 {

    /* JADX INFO: renamed from: k4 */
    private static final List<String> f4806k4;

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f4807x1;

    static {
        List<String> list = new List<>();
        f4806k4 = list;
        list.addItem("gray");
        list.addItem("bw");
        list.addItem("orange");
        list.addItem("turquoise");
        list.addItem("blue");
        list.addItem(LocalePreferences.FirstDayOfWeek.SUNDAY);
        list.addItem("earth");
        list.addItem("green");
        list.addItem("seetang");
        list.addItem("lightblue");
        list.addItem("yellow");
        f4807x1 = new C7017h4(ContextChain.TAG_PRODUCT, "list");
    }

    /* JADX INFO: renamed from: k4 */
    private static byte m5547k4(int i) {
        if (i != 2) {
            return i != 3 ? (byte) 0 : (byte) 2;
        }
        return (byte) 1;
    }

    /* JADX INFO: renamed from: x1 */
    private static byte m5560x1(int i) {
        if (i == 2) {
            return (byte) 1;
        }
        if (i != 3) {
            return i != 4 ? (byte) 0 : (byte) 3;
        }
        return (byte) 2;
    }

    /* JADX INFO: renamed from: k4 */
    public static Shape m5548k4(ShapeCollection shapeCollection, com.aspose.slides.internal.p332p7.vtn vtnVar, com.aspose.slides.internal.p332p7.n6p n6pVar, wxb wxbVar) {
        if (shapeCollection == null) {
            throw new ArgumentNullException("shapes");
        }
        if (n6pVar == null) {
            throw new ArgumentNullException("tableElement");
        }
        C12007ix c12007ixClone = wgi.m72716k4(vtnVar.m43291dy(), vtnVar.m43286c5(), vtnVar.m43296jd(), vtnVar.m43288ck()).Clone();
        Table table = (Table) shapeCollection.addTable(c12007ixClone.m56557jd(), c12007ixClone.m56551ck(), m5561x1(n6pVar, wxbVar), m5559k4(n6pVar, wxbVar));
        table.setStylePreset(0);
        table.setFirstRow(n6pVar.m37286kk());
        table.setFirstCol(n6pVar.m37279du());
        table.setLastRow(n6pVar.m37288to());
        table.setLastCol(n6pVar.m37281h4());
        table.setHorizontalBanding(n6pVar.m37287m9());
        table.setVerticalBanding(n6pVar.m37280dy());
        m5555k4(table, vtnVar, n6pVar, (wgi.m72731kk(n6pVar.m37290x1()) && wxbVar.m72960x1().m69239fa().containsKey(n6pVar.m37290x1())) ? wxbVar.m72960x1().m69239fa().get_Item(n6pVar.m37290x1()) : null, wxbVar);
        return table;
    }

    /* JADX INFO: renamed from: x1 */
    private static double[] m5561x1(com.aspose.slides.internal.p332p7.n6p n6pVar, wxb wxbVar) {
        double[] dArr = new double[n6pVar.m37278c5().size()];
        for (int i = 0; i < n6pVar.m37278c5().size(); i++) {
            dArr[i] = wgi.m72703h4(m5549k4((com.aspose.slides.internal.p332p7.k6w) n6pVar.m37278c5().get_Item(i).m29542x1(), wxbVar).m31171k4());
        }
        return dArr;
    }

    /* JADX INFO: renamed from: k4 */
    private static com.aspose.slides.internal.p332p7.enf m5549k4(com.aspose.slides.internal.p332p7.k6w k6wVar, wxb wxbVar) {
        com.aspose.slides.internal.p332p7.lzc lzcVarM72892k4 = wr8.m72892k4(k6wVar.m35167k4(), wxbVar);
        if (lzcVarM72892k4 == null) {
            throw new InvalidOperationException("Table column must have associated style");
        }
        com.aspose.slides.internal.p332p7.enf enfVar = (com.aspose.slides.internal.p332p7.enf) wgi.m72712k4(com.aspose.slides.internal.p332p7.enf.class, "table-column-properties", lzcVarM72892k4.m36550to());
        if (enfVar != null) {
            return enfVar;
        }
        throw new InvalidOperationException("Table column must have associated style properties");
    }

    /* JADX INFO: renamed from: k4 */
    private static com.aspose.slides.internal.p332p7.hj8 m5550k4(com.aspose.slides.internal.p332p7.exz exzVar, wxb wxbVar) {
        com.aspose.slides.internal.p332p7.lzc lzcVarM72892k4 = wr8.m72892k4(exzVar.m31421k4(), wxbVar);
        if (lzcVarM72892k4 == null) {
            throw new InvalidOperationException("Table row must have associated style");
        }
        com.aspose.slides.internal.p332p7.hj8 hj8Var = (com.aspose.slides.internal.p332p7.hj8) wgi.m72712k4(com.aspose.slides.internal.p332p7.hj8.class, "table-row-properties", lzcVarM72892k4.m36550to());
        if (hj8Var != null) {
            return hj8Var;
        }
        throw new InvalidOperationException("Table row must have associated style properties");
    }

    /* JADX INFO: renamed from: k4 */
    private static com.aspose.slides.internal.p332p7.lzc m5551k4(int i, com.aspose.slides.internal.p332p7.n6p n6pVar, com.aspose.slides.internal.p332p7.exz exzVar, com.aspose.slides.internal.p332p7.xvt xvtVar, wxb wxbVar) {
        String strM34841k4;
        int i2 = 1;
        boolean z = xvtVar != null;
        String strM37290x1 = n6pVar.m37290x1();
        if (n6pVar.m37279du() && i == 0) {
            if (z && xvtVar.m44682du() != null) {
                strM34841k4 = xvtVar.m44682du().m39730k4();
                if (strM34841k4 == null) {
                    strM34841k4 = xvtVar.m44682du().m39731x1();
                }
                strM37290x1 = strM34841k4;
            }
            i2 = 3;
        } else if (n6pVar.m37281h4() && i == exzVar.m31422kk().size() - 1) {
            if (z && xvtVar.m44684h4() != null) {
                strM34841k4 = xvtVar.m44684h4().m34841k4();
                if (strM34841k4 == null) {
                    strM34841k4 = xvtVar.m44684h4().m34842x1();
                }
                strM37290x1 = strM34841k4;
            }
            i2 = 3;
        } else if (n6pVar.m37280dy()) {
            if (i % 2 != 0) {
                if (z && xvtVar.m44685jd() != null) {
                    String strM33625k4 = xvtVar.m44685jd().m33625k4();
                    if (strM33625k4 == null) {
                        strM33625k4 = xvtVar.m44685jd().m33626x1();
                    }
                    strM37290x1 = strM33625k4;
                }
                i2 = 2;
            } else if (z && xvtVar.m44680c5() != null) {
                String strM30729k4 = xvtVar.m44680c5().m30729k4();
                if (strM30729k4 == null) {
                    strM30729k4 = xvtVar.m44680c5().m30730x1();
                }
                strM37290x1 = strM30729k4;
            }
        }
        return m5553k4(strM37290x1, i2, n6pVar, wxbVar);
    }

    /* JADX INFO: renamed from: k4 */
    private static com.aspose.slides.internal.p332p7.lzc m5552k4(int i, com.aspose.slides.internal.p332p7.n6p n6pVar, com.aspose.slides.internal.p332p7.xvt xvtVar, wxb wxbVar) {
        String strM28212k4;
        int i2 = 1;
        boolean z = xvtVar != null;
        String strM37290x1 = n6pVar.m37290x1();
        if (n6pVar.m37286kk() && i == 0) {
            if (z && xvtVar.m44687kk() != null) {
                strM28212k4 = xvtVar.m44687kk().m43610k4();
                if (strM28212k4 == null) {
                    strM28212k4 = xvtVar.m44687kk().m43611x1();
                }
                strM37290x1 = strM28212k4;
            }
            i2 = 3;
        } else if (n6pVar.m37288to() && i == n6pVar.m37282jd().size() - 1) {
            if (z && xvtVar.m44689to() != null) {
                strM28212k4 = xvtVar.m44689to().m28212k4();
                if (strM28212k4 == null) {
                    strM28212k4 = xvtVar.m44689to().m28213x1();
                }
                strM37290x1 = strM28212k4;
            }
            i2 = 3;
        } else if (n6pVar.m37287m9()) {
            if (i % 2 != 0) {
                if (z && xvtVar.m44683dy() != null) {
                    String strM39723k4 = xvtVar.m44683dy().m39723k4();
                    if (strM39723k4 == null) {
                        strM39723k4 = xvtVar.m44683dy().m39724x1();
                    }
                    strM37290x1 = strM39723k4;
                }
                i2 = 2;
            } else if (z && xvtVar.m44688m9() != null) {
                String strM36984k4 = xvtVar.m44688m9().m36984k4();
                if (strM36984k4 == null) {
                    strM36984k4 = xvtVar.m44688m9().m36985x1();
                }
                strM37290x1 = strM36984k4;
            }
        }
        return m5553k4(strM37290x1, i2, n6pVar, wxbVar);
    }

    /* JADX INFO: renamed from: k4 */
    private static com.aspose.slides.internal.p332p7.lzc m5553k4(String str, int i, com.aspose.slides.internal.p332p7.n6p n6pVar, wxb wxbVar) {
        if (!"default".equals(n6pVar.m37290x1())) {
            if (C14113y2.m67411k4(str)) {
                return null;
            }
            return wr8.m72892k4(str, wxbVar);
        }
        List.Enumerator<String> it = f4806k4.iterator();
        while (it.hasNext()) {
            try {
                com.aspose.slides.internal.p332p7.lzc lzcVarM72892k4 = wr8.m72892k4(C14113y2.m67408k4(it.next(), C14057f9.m66591x1(i)), wxbVar);
                if (lzcVarM72892k4 != null) {
                    return lzcVarM72892k4;
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

    /* JADX INFO: renamed from: k4 */
    private static void m5554k4(Cell cell) {
        PortionFormat portionFormat = (PortionFormat) cell.getTextFrame().getTextFrameFormat().getTextStyle().getDefaultParagraphFormat().getDefaultPortionFormat();
        if (PortionFormat.m2303to(portionFormat)) {
            return;
        }
        IGenericEnumerator<IParagraph> it = cell.getTextFrame().getParagraphs().iterator();
        while (it.hasNext()) {
            try {
                ((PortionFormat) ((Paragraph) it.next()).getParagraphFormat().getDefaultPortionFormat()).m370x1(portionFormat);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void m5555k4(Table table, com.aspose.slides.internal.p332p7.vtn vtnVar, com.aspose.slides.internal.p332p7.n6p n6pVar, com.aspose.slides.internal.p332p7.xvt xvtVar, wxb wxbVar) {
        String strM39161k4;
        com.aspose.slides.internal.p332p7.lzc lzcVarM72892k4;
        int i;
        List<C7394ca> list;
        boolean z;
        com.aspose.slides.internal.p332p7.lzc lzcVarM72892k42;
        boolean z2;
        com.aspose.slides.internal.p332p7.n6p n6pVar2 = n6pVar;
        com.aspose.slides.internal.p332p7.xvt xvtVar2 = xvtVar;
        if (xvtVar2 == null || xvtVar2.m44681ck() == null) {
            strM39161k4 = "default";
            if (!"default".equals(n6pVar2.m37290x1())) {
                lzcVarM72892k4 = null;
            }
            i = 0;
            while (i < n6pVar2.m37282jd().size()) {
                com.aspose.slides.internal.p332p7.lzc lzcVarM5552k4 = m5552k4(i, n6pVar2, xvtVar2, wxbVar);
                com.aspose.slides.internal.p332p7.exz exzVar = (com.aspose.slides.internal.p332p7.exz) n6pVar2.m37282jd().get_Item(i).m29542x1();
                com.aspose.slides.internal.p332p7.lzc lzcVarM72892k43 = wr8.m72892k4(exzVar.m31421k4(), wxbVar);
                com.aspose.slides.internal.p332p7.lzc lzcVarM72892k44 = wr8.m72892k4(exzVar.m31423x1(), wxbVar);
                int i2 = 0;
                while (i2 < exzVar.m31422kk().size()) {
                    com.aspose.slides.internal.p332p7.lzc lzcVarM5551k4 = m5551k4(i2, n6pVar2, exzVar, xvtVar2, wxbVar);
                    com.aspose.slides.internal.p332p7.lzc lzcVarM72892k45 = wr8.m72892k4(((com.aspose.slides.internal.p332p7.k6w) n6pVar2.m37278c5().get_Item(i2).m29542x1()).m35167k4(), wxbVar);
                    Cell cellM2869k4 = table.m2869k4(i2, i);
                    C7394ca c7394ca = exzVar.m31422kk().get_Item(i2);
                    if (C7019kk.m27469x1(c7394ca.m29542x1(), com.aspose.slides.internal.p332p7.btk.class)) {
                        com.aspose.slides.internal.p332p7.btk btkVar = (com.aspose.slides.internal.p332p7.btk) c7394ca.m29542x1();
                        List<C7394ca> listM29143x1 = btkVar.m29143x1();
                        lzcVarM72892k42 = wr8.m72892k4(btkVar.m29142k4(), wxbVar);
                        list = listM29143x1;
                        z = false;
                    } else {
                        com.aspose.slides.internal.p332p7.t1m t1mVar = (com.aspose.slides.internal.p332p7.t1m) c7394ca.m29542x1();
                        List<C7394ca> listM41491ck = t1mVar.m41491ck();
                        com.aspose.slides.internal.p332p7.lzc lzcVarM72892k46 = wr8.m72892k4(t1mVar.m41497k4(), wxbVar);
                        list = listM41491ck;
                        cellM2869k4.f1263x1 = (int) t1mVar.m41490c5();
                        cellM2869k4.f1258k4 = (int) t1mVar.m41495jd();
                        cellM2869k4.f1259kk = null;
                        if (cellM2869k4.m474m9()) {
                            z = false;
                            cellM2869k4.m479x1(false);
                        } else {
                            z = false;
                        }
                        lzcVarM72892k42 = lzcVarM72892k46;
                    }
                    m5557k4(wr8.m72892k4(vtnVar.m43301kk(), wxbVar), cellM2869k4, z, wxbVar);
                    m5557k4(lzcVarM72892k4, cellM2869k4, true, wxbVar);
                    m5557k4(lzcVarM5551k4, cellM2869k4, z, wxbVar);
                    m5557k4(lzcVarM5552k4, cellM2869k4, z, wxbVar);
                    m5557k4(lzcVarM72892k45, cellM2869k4, z, wxbVar);
                    m5557k4(lzcVarM72892k43, cellM2869k4, z, wxbVar);
                    m5557k4(lzcVarM72892k44, cellM2869k4, z, wxbVar);
                    m5557k4(lzcVarM72892k42, cellM2869k4, z, wxbVar);
                    TextFrame textFrame = (TextFrame) cellM2869k4.getTextFrame();
                    textFrame.getParagraphs().clear();
                    IGenericEnumerator<C7394ca> it = list.iterator();
                    while (it.hasNext()) {
                        try {
                            C7394ca next = it.next();
                            int iM27428k4 = f4807x1.m27428k4(next.m29539k4());
                            if (iM27428k4 == 0) {
                                z2 = true;
                                m5558k4((com.aspose.slides.internal.p332p7.ok7) next.m29542x1(), vtnVar, textFrame, wxbVar);
                            } else if (iM27428k4 != 1) {
                                wxbVar.m72957k4().m69954k4(C14113y2.m67402k4("Unknown table content element: {0}", next.m29539k4()), 1);
                                z2 = true;
                            } else {
                                z2 = true;
                                m5556k4((com.aspose.slides.internal.p332p7.lxj) next.m29542x1(), vtnVar, textFrame, wxbVar);
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
                    m5554k4(cellM2869k4);
                    i2++;
                    n6pVar2 = n6pVar;
                    xvtVar2 = xvtVar;
                }
                i++;
                n6pVar2 = n6pVar;
                xvtVar2 = xvtVar;
            }
        }
        com.aspose.slides.internal.p332p7.pvz pvzVar = (com.aspose.slides.internal.p332p7.pvz) xvtVar2.m44681ck().m29541kk();
        strM39161k4 = pvzVar.m39161k4();
        if (strM39161k4 == null) {
            strM39161k4 = pvzVar.m39162x1();
        }
        lzcVarM72892k4 = wr8.m72892k4(strM39161k4, wxbVar);
        i = 0;
        while (i < n6pVar2.m37282jd().size()) {
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m5556k4(com.aspose.slides.internal.p332p7.lxj lxjVar, com.aspose.slides.internal.p332p7.vtn vtnVar, TextFrame textFrame, wxb wxbVar) {
        com.aspose.slides.internal.p332p7.w7y w7yVar = wxbVar.m4422to().containsKey(lxjVar.m36514kk()) ? wxbVar.m4422to().get_Item(lxjVar.m36514kk()) : null;
        gga ggaVarM6640k4 = gga.m6640k4(vtnVar.m43305to(), 10);
        if (lxjVar.m36515to() != null) {
            mxr.m67789k4(textFrame, lxjVar, w7yVar, wxbVar, ggaVarM6640k4);
        }
        uan.m71588k4(textFrame, new nh5(vtnVar), lxjVar, w7yVar, 1, wxbVar, ggaVarM6640k4);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m5557k4(com.aspose.slides.internal.p332p7.lzc lzcVar, Cell cell, boolean z, wxb wxbVar) {
        if (lzcVar != null) {
            if (wgi.m72731kk(lzcVar.m36551x1())) {
                m5557k4(wr8.m72892k4(lzcVar.m36551x1(), wxbVar), cell, false, wxbVar);
            }
            com.aspose.slides.internal.p332p7.rsv rsvVar = (com.aspose.slides.internal.p332p7.rsv) wgi.m72712k4(com.aspose.slides.internal.p332p7.rsv.class, "graphic-properties", lzcVar.m36550to());
            if (rsvVar != null) {
                C13706jy.m63567k4(cell.getCellFormat().getFillFormat(), rsvVar, wxbVar);
                cell.setTextAnchorType(m5560x1(rsvVar.m40468fa()));
                if (wgi.m72731kk(rsvVar.m40451bv())) {
                    cell.setMarginLeft(wgi.m72703h4(rsvVar.m40451bv()));
                }
                if (wgi.m72731kk(rsvVar.m40447ar())) {
                    cell.setMarginTop(wgi.m72703h4(rsvVar.m40447ar()));
                }
                if (wgi.m72731kk(rsvVar.m40510v4())) {
                    cell.setMarginRight(wgi.m72703h4(rsvVar.m40510v4()));
                }
                if (wgi.m72731kk(rsvVar.m40504um())) {
                    cell.setMarginBottom(wgi.m72703h4(rsvVar.m40504um()));
                }
            }
            com.aspose.slides.internal.p332p7.mdp mdpVar = (com.aspose.slides.internal.p332p7.mdp) wgi.m72712k4(com.aspose.slides.internal.p332p7.mdp.class, "paragraph-properties", lzcVar.m36550to());
            if (mdpVar != null) {
                ((CellFormat) cell.getCellFormat()).m499to();
                if (wgi.m72731kk(mdpVar.m36855c5())) {
                    eem.m5507k4(cell.getCellFormat().getBorderLeft(), mdpVar.m36855c5(), false, wxbVar);
                    eem.m5507k4(cell.getCellFormat().getBorderTop(), mdpVar.m36855c5(), false, wxbVar);
                    eem.m5507k4(cell.getCellFormat().getBorderRight(), mdpVar.m36855c5(), false, wxbVar);
                    eem.m5507k4(cell.getCellFormat().getBorderBottom(), mdpVar.m36855c5(), false, wxbVar);
                }
                if (wgi.m72731kk(mdpVar.m36868jd()) && ((z && cell.getFirstRowIndex() == 0) || !z)) {
                    eem.m5507k4(cell.getCellFormat().getBorderTop(), mdpVar.m36868jd(), false, wxbVar);
                }
                if (wgi.m72731kk(mdpVar.m36863fa()) && ((z && cell.getFirstColumnIndex() == 0) || !z)) {
                    eem.m5507k4(cell.getCellFormat().getBorderLeft(), mdpVar.m36863fa(), false, wxbVar);
                }
                if (wgi.m72731kk(mdpVar.m36857ck()) && ((z && cell.m466jd() == cell.m473kk().getRows().size()) || !z)) {
                    eem.m5507k4(cell.getCellFormat().getBorderBottom(), mdpVar.m36857ck(), false, wxbVar);
                }
                if (wgi.m72731kk(mdpVar.m36886up()) && ((z && cell.m460c5() == cell.m473kk().getColumns().size()) || !z)) {
                    eem.m5507k4(cell.getCellFormat().getBorderRight(), mdpVar.m36886up(), false, wxbVar);
                }
                if (mdpVar.m36885u4() == 3) {
                    cell.setTextVerticalType((byte) 1);
                }
                ((CellFormat) cell.getCellFormat()).m495du();
            }
            com.aspose.slides.internal.p332p7.v9h v9hVar = (com.aspose.slides.internal.p332p7.v9h) wgi.m72712k4(com.aspose.slides.internal.p332p7.v9h.class, "table-cell-properties", lzcVar.m36550to());
            if (v9hVar != null) {
                C13706jy.m63568k4(cell.getCellFormat().getFillFormat(), v9hVar, wxbVar);
                cell.setTextAnchorType(m5547k4(v9hVar.m42806k4()));
                if (wgi.m72731kk(v9hVar.m42805jd())) {
                    cell.setMarginLeft(wgi.m72703h4(v9hVar.m42805jd()));
                }
                if (wgi.m72731kk(v9hVar.m42800dy())) {
                    cell.setMarginTop(wgi.m72703h4(v9hVar.m42800dy()));
                }
                if (wgi.m72731kk(v9hVar.m42797ck())) {
                    cell.setMarginRight(wgi.m72703h4(v9hVar.m42797ck()));
                }
                if (wgi.m72731kk(v9hVar.m42795c5())) {
                    cell.setMarginBottom(wgi.m72703h4(v9hVar.m42795c5()));
                }
                ((CellFormat) cell.getCellFormat()).m499to();
                if (wgi.m72731kk(v9hVar.m42809kk())) {
                    eem.m5507k4(cell.getCellFormat().getBorderLeft(), v9hVar.m42809kk(), true, wxbVar);
                    eem.m5507k4(cell.getCellFormat().getBorderTop(), v9hVar.m42809kk(), true, wxbVar);
                    eem.m5507k4(cell.getCellFormat().getBorderRight(), v9hVar.m42809kk(), true, wxbVar);
                    eem.m5507k4(cell.getCellFormat().getBorderBottom(), v9hVar.m42809kk(), true, wxbVar);
                }
                if (wgi.m72731kk(v9hVar.m42813to()) && ((z && cell.getFirstRowIndex() == 0) || !z)) {
                    eem.m5507k4(cell.getCellFormat().getBorderTop(), v9hVar.m42813to(), true, wxbVar);
                }
                if (wgi.m72731kk(v9hVar.m42803h4()) && ((z && cell.getFirstColumnIndex() == 0) || !z)) {
                    eem.m5507k4(cell.getCellFormat().getBorderLeft(), v9hVar.m42803h4(), true, wxbVar);
                }
                if (wgi.m72731kk(v9hVar.m42798du()) && ((z && cell.m466jd() == cell.m473kk().getRows().size()) || !z)) {
                    eem.m5507k4(cell.getCellFormat().getBorderBottom(), v9hVar.m42798du(), true, wxbVar);
                }
                if (wgi.m72731kk(v9hVar.m42811m9()) && ((z && cell.m460c5() == cell.m473kk().getColumns().size()) || !z)) {
                    eem.m5507k4(cell.getCellFormat().getBorderRight(), v9hVar.m42811m9(), true, wxbVar);
                }
                ((CellFormat) cell.getCellFormat()).m495du();
            }
            wr8.m72901k4((TextFrame) cell.getTextFrame(), lzcVar.m36546k4(), wxbVar);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m5558k4(com.aspose.slides.internal.p332p7.ok7 ok7Var, com.aspose.slides.internal.p332p7.vtn vtnVar, TextFrame textFrame, wxb wxbVar) {
        yup.m74103k4(textFrame, new com.aspose.slides.internal.p332p7.ok7[]{ok7Var}, wxbVar, gga.m6640k4(vtnVar.m43305to(), 10));
    }

    /* JADX INFO: renamed from: k4 */
    private static double[] m5559k4(com.aspose.slides.internal.p332p7.n6p n6pVar, wxb wxbVar) {
        double[] dArr = new double[n6pVar.m37282jd().size()];
        for (int i = 0; i < n6pVar.m37282jd().size(); i++) {
            dArr[i] = wgi.m72703h4(m5550k4((com.aspose.slides.internal.p332p7.exz) n6pVar.m37282jd().get_Item(i).m29542x1(), wxbVar).m33497k4());
        }
        return dArr;
    }
}

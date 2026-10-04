package com.aspose.slides;

import android.support.v4.media.session.PlaybackStateCompat;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p294n9.C6773ss;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p407st.C10355ai;
import com.aspose.slides.internal.p407st.C10386c9;
import com.aspose.slides.internal.p407st.C10397d4;
import com.aspose.slides.internal.p407st.C10462h9;
import com.aspose.slides.internal.p407st.C10480ii;
import com.aspose.slides.internal.p407st.C10489j5;
import com.aspose.slides.internal.p407st.C10511kn;
import com.aspose.slides.internal.p407st.C10534m3;
import com.aspose.slides.internal.p407st.C10548mt;
import com.aspose.slides.internal.p407st.C10564nv;
import com.aspose.slides.internal.p407st.C10609qn;
import com.aspose.slides.internal.p407st.C10711xc;
import com.aspose.slides.internal.p407st.C10715xl;
import com.aspose.slides.internal.p407st.C10724y1;
import com.aspose.slides.internal.p407st.C10749ze;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p482wr.C12256h4;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class rx0 extends C0969ey {
    /* JADX INFO: renamed from: k4 */
    private static C10462h9 m70381k4(C12014ne c12014ne, q0x q0xVar) {
        C10462h9 c10462h9M72000ix = q0xVar.m72000ix();
        C10534m3 c10534m3Mo50859du = c10462h9M72000ix.mo50859du();
        c10462h9M72000ix.mo50863m9();
        C10397d4 c10397d4 = new C10397d4();
        c10534m3Mo50859du.m51263x1().m50926k4(c10397d4);
        c10397d4.m50628dy(true);
        C10489j5 c10489j5 = (C10489j5) c10534m3Mo50859du.m51263x1().m50923k4(959);
        if (c10489j5 == null) {
            C10480ii c10480iiM51263x1 = c10534m3Mo50859du.m51263x1();
            c10489j5 = new C10489j5();
            c10480iiM51263x1.m50926k4(c10489j5);
        }
        c10489j5.m50985k4(true);
        c10489j5.m50987to(false);
        c10489j5.m50984du(false);
        c10489j5.m50988x1(false);
        c10489j5.m50986kk(false);
        tcp.m71098k4(q0xVar.m69355ck(), c10462h9M72000ix, (byte) 2, q0xVar.m69354c5().m3738du().m70215k4());
        new C10609qn(191, 393216L);
        new C10609qn(383, 65536L);
        new C10609qn(447, PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
        C10715xl c10715xl = new C10715xl();
        c10462h9M72000ix.m50513yj().addItem(c10715xl);
        c10715xl.m51980k4(c12014ne.Clone());
        q0xVar.mo5827dy();
        return c10462h9M72000ix;
    }

    /* JADX INFO: renamed from: kk */
    private static void m70386kk(zsn zsnVar) {
        Table tableM74800dy = zsnVar.m74800dy();
        for (int i = 0; i < zsnVar.m74798ar(); i++) {
            for (int i2 = 0; i2 < zsnVar.m74804um(); i2++) {
                Cell cell = (Cell) tableM74800dy.get_Item(i, i2);
                if (cell.getCellFormat().getBorderLeft().isFormatNotDefined()) {
                    cell.getCellFormat().getBorderLeft().getFillFormat().setFillType((byte) 0);
                }
                if (cell.getCellFormat().getBorderTop().isFormatNotDefined()) {
                    cell.getCellFormat().getBorderTop().getFillFormat().setFillType((byte) 0);
                }
                if (cell.getCellFormat().getBorderRight().isFormatNotDefined()) {
                    cell.getCellFormat().getBorderRight().getFillFormat().setFillType((byte) 0);
                }
                if (cell.getCellFormat().getBorderBottom().isFormatNotDefined()) {
                    cell.getCellFormat().getBorderBottom().getFillFormat().setFillType((byte) 0);
                }
            }
        }
    }

    /* JADX INFO: renamed from: to */
    private static void m70387to(zsn zsnVar) {
        Table tableM74800dy = zsnVar.m74800dy();
        List.Enumerator<qah> it = zsnVar.m70642h4().iterator();
        while (it.hasNext()) {
            try {
                nsh nshVar = (nsh) C7019kk.m27452k4((Object) it.next().m69481du(), nsh.class);
                if (nshVar != null) {
                    C10462h9 c10462h9M70140fa = nshVar.m70140fa();
                    klp klpVarM70141ix = nshVar.m70141ix();
                    C12014ne c12014neClone = zsnVar.m74802k4(nshVar.m73612x1().Clone().Clone()).Clone();
                    Cell cell = (Cell) tableM74800dy.get_Item(c12014neClone.m56669jd(), c12014neClone.m56664ck());
                    nshVar.m68198k4(cell);
                    C14680vi.m72289k4(cell.getCellFormat().getFillFormat(), nshVar);
                    C10548mt c10548mtM50880ck = c10462h9M70140fa.m50880ck();
                    if (c10548mtM50880ck != null && c10548mtM50880ck.m51409um().m51921k4()) {
                        ljv.m64424x1(klpVarM70141ix);
                        ((TextFrame) cell.getTextFrame()).m2910k4((ITextFrame) klpVarM70141ix.m63996m9());
                        m70382k4(cell);
                    }
                    cell.f1263x1 = c12014neClone.m56663c5() > 0 ? c12014neClone.m56663c5() : 1;
                    cell.f1258k4 = c12014neClone.m56683x1() > 0 ? c12014neClone.m56683x1() : 1;
                    if (c12014neClone.m56663c5() > 1) {
                        ((LineFormat) cell.getCellFormat().getBorderRight()).m1896k4(tableM74800dy.get_Item((c12014neClone.m56669jd() + c12014neClone.m56663c5()) - 1, c12014neClone.m56664ck()).getCellFormat().getBorderRight());
                    }
                    if (c12014neClone.m56683x1() > 1) {
                        ((LineFormat) cell.getCellFormat().getBorderBottom()).m1896k4(tableM74800dy.get_Item(c12014neClone.m56669jd(), (c12014neClone.m56664ck() + c12014neClone.m56683x1()) - 1).getCellFormat().getBorderBottom());
                    }
                    cell.m479x1(false);
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
    public static void m70388x1(Cell cell) {
        TextFrameFormat textFrameFormat = (TextFrameFormat) cell.getTextFrame().getTextFrameFormat();
        textFrameFormat.m2953k4(cell.m468k4().m73500k4(textFrameFormat.m2963to().Clone()).Clone());
        textFrameFormat.setAnchoringType(cell.getTextAnchorType() == 0 ? (byte) -1 : cell.getTextAnchorType());
        textFrameFormat.setCenterText(cell.getAnchorCenter() ? (byte) 1 : (byte) -1);
        textFrameFormat.setTextVerticalType(cell.getTextVerticalType() != 0 ? cell.getTextVerticalType() : (byte) -1);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m70382k4(Cell cell) {
        TextFrameFormat textFrameFormat = (TextFrameFormat) cell.getTextFrame().getTextFrameFormat();
        cell.m471k4(textFrameFormat.m2963to().m73500k4(cell.m468k4().Clone()).Clone());
        cell.setTextAnchorType(textFrameFormat.getAnchoringType() == -1 ? (byte) 0 : textFrameFormat.getAnchoringType());
        cell.setAnchorCenter(textFrameFormat.getCenterText() == 1);
        cell.setTextVerticalType(textFrameFormat.getTextVerticalType() != -1 ? textFrameFormat.getTextVerticalType() : (byte) 0);
    }

    /* JADX INFO: renamed from: x1 */
    public static void m70389x1(qah qahVar) {
        char[] cArrM26671k4;
        char[] cArrM26671k42;
        zsn zsnVar = (zsn) qahVar.m69481du();
        C10511kn c10511knM70644kk = zsnVar.m70644kk();
        Table tableM74800dy = zsnVar.m74800dy();
        if (tableM74800dy == null) {
            tableM74800dy = ((ShapeCollection) zsnVar.m70149up().m64735up().getShapes()).m2643ne();
            zsnVar.m74803k4(tableM74800dy);
        }
        C0969ey.m5775k4(qahVar);
        m70385k4(zsnVar);
        m70390x1(zsnVar);
        m70387to(zsnVar);
        m70386kk(zsnVar);
        if (c10511knM70644kk.mo50859du() != null) {
            C10355ai c10355ai = (C10355ai) C7019kk.m27452k4((Object) c10511knM70644kk.mo50859du().m51263x1().m50923k4(897), C10355ai.class);
            if (c10355ai != null && (cArrM26671k42 = new C6773ss().m26671k4(c10355ai.mo50423x1())) != null && cArrM26671k42.length > 0) {
                tableM74800dy.setAlternativeText(cArrM26671k42[cArrM26671k42.length - 1] == 0 ? C14113y2.m67406k4(cArrM26671k42, 0, cArrM26671k42.length - 1) : C14113y2.m67405k4(cArrM26671k42));
            }
            C10355ai c10355ai2 = (C10355ai) C7019kk.m27452k4((Object) c10511knM70644kk.mo50859du().m51263x1().m50923k4(896), C10355ai.class);
            if (c10355ai2 != null && (cArrM26671k4 = new C6773ss().m26671k4(c10355ai2.mo50423x1())) != null && cArrM26671k4.length > 0) {
                tableM74800dy.setName(cArrM26671k4[cArrM26671k4.length - 1] == 0 ? C14113y2.m67406k4(cArrM26671k4, 0, cArrM26671k4.length - 1) : C14113y2.m67405k4(cArrM26671k4));
            }
            C10609qn c10609qn = (C10609qn) C7019kk.m27452k4((Object) c10511knM70644kk.mo50859du().m51263x1().m50923k4(959), C10609qn.class);
            if (c10609qn != null) {
                tableM74800dy.setHidden((c10609qn.m51597ar() & 2) != 0);
            }
            hi8.m7176k4(qahVar);
        }
        C10711xc c10711xcMo50863m9 = c10511knM70644kk.mo50863m9();
        if (c10711xcMo50863m9 != null) {
            int[] iArrM51974kk = c10711xcMo50863m9.m51974kk();
            int iM67507x1 = C14116yg.m67507x1(tableM74800dy.f3493k4.size(), iArrM51974kk.length);
            for (int i = 0; i < iM67507x1; i++) {
                tableM74800dy.f3493k4.get_Item(i).setMinimalHeight(((double) iArrM51974kk[i]) / 8.0d);
            }
        }
        float fM56663c5 = zsnVar.m74799bv().m56663c5() / 8.0f;
        float width = tableM74800dy.getWidth();
        if (fM56663c5 < width) {
            for (int i2 = 0; i2 < tableM74800dy.f3496x1.size(); i2++) {
                tableM74800dy.f3496x1.get_Item(i2).setWidth((tableM74800dy.f3496x1.get_Item(i2).getWidth() / ((double) width)) * ((double) fM56663c5));
            }
        }
        tableM74800dy.m2546bz().mo5640kk();
    }

    /* JADX INFO: renamed from: k4 */
    private static void m70383k4(C12014ne c12014ne, f5k f5kVar) {
        Cell cellM5826c5 = f5kVar.m5826c5();
        C10462h9 c10462h9M72000ix = f5kVar.m72000ix();
        C10724y1 c10724y1Mo50864to = c10462h9M72000ix.mo50864to();
        c10724y1Mo50864to.m52046x1(true);
        c10724y1Mo50864to.m52035jd(true);
        c10724y1Mo50864to.m52032fa(true);
        c10724y1Mo50864to.m52036k4(1);
        C10534m3 c10534m3M72004qq = f5kVar.m72004qq();
        f5kVar.m71997ar();
        C10397d4 c10397d4 = new C10397d4();
        c10534m3M72004qq.m51263x1().m50926k4(c10397d4);
        c10397d4.m50628dy(true);
        C10489j5 c10489j5 = (C10489j5) c10534m3M72004qq.m51263x1().m50923k4(959);
        if (c10489j5 == null) {
            C10480ii c10480iiM51263x1 = c10534m3M72004qq.m51263x1();
            c10489j5 = new C10489j5();
            c10480iiM51263x1.m50926k4(c10489j5);
        }
        c10489j5.m50985k4(true);
        c10489j5.m50987to(false);
        c10489j5.m50984du(false);
        c10489j5.m50988x1(false);
        c10489j5.m50986kk(false);
        C14680vi.m72290k4(cellM5826c5.getCellFormat().getFillFormat(), f5kVar);
        m70388x1(cellM5826c5);
        ljv.m64411k4(cellM5826c5.getTextFrame().getTextFrameFormat(), f5kVar);
        C10715xl c10715xl = new C10715xl();
        c10462h9M72000ix.m50513yj().addItem(c10715xl);
        c10715xl.m51980k4(c12014ne.Clone());
        f5kVar.m72001k4(cellM5826c5.getTextFrame(), 7);
        f5kVar.mo5827dy();
    }

    /* JADX INFO: renamed from: x1 */
    private static void m70390x1(zsn zsnVar) {
        Table tableM74800dy = zsnVar.m74800dy();
        int size = tableM74800dy.getRows().size();
        int size2 = tableM74800dy.getColumns().size();
        C12014ne c12014ne = new C12014ne();
        C12014ne c12014ne2 = new C12014ne();
        List.Enumerator<qah> it = zsnVar.m70642h4().iterator();
        while (it.hasNext()) {
            try {
                gyt gytVar = (gyt) C7019kk.m27452k4((Object) it.next().m69481du(), gyt.class);
                if (gytVar != null && (gytVar.m6947k4() & 255) != 0) {
                    C10462h9 c10462h9M70140fa = gytVar.m70140fa();
                    gytVar.m73612x1().CloneTo(c12014ne);
                    zsnVar.m74802k4(c12014ne.Clone()).CloneTo(c12014ne2);
                    int iM56669jd = c12014ne2.m56669jd();
                    int iM56664ck = c12014ne2.m56664ck();
                    int iM56663c5 = c12014ne2.m56663c5();
                    int iM56683x1 = c12014ne2.m56683x1();
                    LineFormat lineFormat = new LineFormat(tableM74800dy);
                    C12014ne c12014ne3 = c12014ne;
                    tcp.m71097k4((ILineFormat) lineFormat, (byte) 2, false, (ri7) gytVar);
                    byte bM6947k4 = gytVar.m6947k4();
                    int i = 1;
                    if (bM6947k4 == 1) {
                        while (iM56663c5 > 0) {
                            if (iM56664ck > 0) {
                                ((LineFormat) tableM74800dy.get_Item(iM56669jd, iM56664ck - 1).getCellFormat().getBorderBottom()).m1896k4((ILineFormat) lineFormat);
                            }
                            if (iM56664ck < size) {
                                ((LineFormat) tableM74800dy.get_Item(iM56669jd, iM56664ck).getCellFormat().getBorderTop()).m1896k4((ILineFormat) lineFormat);
                            }
                            iM56669jd++;
                            iM56663c5--;
                        }
                    } else if (bM6947k4 == 2) {
                        while (iM56683x1 > 0) {
                            if (iM56669jd > 0) {
                                ((LineFormat) tableM74800dy.get_Item(iM56669jd - 1, iM56664ck).getCellFormat().getBorderRight()).m1896k4((ILineFormat) lineFormat);
                            }
                            if (iM56669jd < size2) {
                                ((LineFormat) tableM74800dy.get_Item(iM56669jd, iM56664ck).getCellFormat().getBorderLeft()).m1896k4((ILineFormat) lineFormat);
                            }
                            iM56664ck++;
                            iM56683x1--;
                        }
                    } else {
                        if (bM6947k4 != 3) {
                            throw new C12256h4("Unknown direction of table border!");
                        }
                        boolean z = c10462h9M70140fa.mo50864to().m52029du() != c10462h9M70140fa.mo50864to().m52034h4();
                        if (z) {
                            iM56669jd += iM56663c5 - 1;
                            i = -1;
                        }
                        while (iM56663c5 > 0) {
                            while (iM56683x1 > 0) {
                                (z ? (LineFormat) tableM74800dy.get_Item(iM56669jd, iM56664ck).getCellFormat().getBorderDiagonalUp() : (LineFormat) tableM74800dy.get_Item(iM56669jd, iM56664ck).getCellFormat().getBorderDiagonalDown()).m1896k4((ILineFormat) lineFormat);
                                iM56664ck++;
                                iM56683x1--;
                            }
                            iM56669jd += i;
                            iM56663c5--;
                        }
                    }
                    c12014ne = c12014ne3;
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

    /* JADX WARN: Removed duplicated region for block: B:73:0x0313  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m70384k4(r9q r9qVar) {
        Table table;
        Table tableMo64936jd = r9qVar.mo64936jd();
        C10462h9 c10462h9M72000ix = r9qVar.m72000ix();
        c10462h9M72000ix.mo50865x1().m51289k4(new C12014ne(OooO00o.OooO00o(tableMo64936jd.getX(), 8.0d, 14), OooO00o.OooO00o(tableMo64936jd.getY(), 8.0d, 14), OooO00o.OooO00o(tableMo64936jd.getWidth(), 8.0d, 14), OooO00o.OooO00o(tableMo64936jd.getHeight(), 8.0d, 14)));
        C10724y1 c10724y1Mo50864to = c10462h9M72000ix.mo50864to();
        boolean z = true;
        c10724y1Mo50864to.m52038k4(true);
        int i = 0;
        c10724y1Mo50864to.m52033h4(false);
        c10724y1Mo50864to.m52041m9(tableMo64936jd.getFrame().getFlipH() == 1);
        c10724y1Mo50864to.m52030dy(tableMo64936jd.getFrame().getFlipV() == 1);
        c10724y1Mo50864to.m52035jd(true);
        C10534m3 c10534m3M72308fa = tableMo64936jd.mo1638uz().m72308fa();
        if (c10534m3M72308fa == null) {
            c10534m3M72308fa = c10462h9M72000ix.mo50859du();
        } else {
            c10462h9M72000ix.m50881k4(c10534m3M72308fa);
        }
        C14281ph.m69048k4(tableMo64936jd.getShapeLock(), c10534m3M72308fa);
        C10489j5 c10489j5 = (C10489j5) c10534m3M72308fa.m51263x1().m50923k4(959);
        if (c10489j5 == null) {
            C10480ii c10480iiM51263x1 = c10534m3M72308fa.m51263x1();
            C10489j5 c10489j52 = new C10489j5();
            c10480iiM51263x1.m50926k4(c10489j52);
            c10489j5 = c10489j52;
        }
        c10489j5.m50985k4(true);
        c10489j5.m50987to(tableMo64936jd.getHidden());
        c10489j5.m50984du(false);
        c10489j5.m50988x1(false);
        c10489j5.m50986kk(false);
        if (!C14064he.m66715kk(tableMo64936jd.getRotation())) {
            c10534m3M72308fa.m51263x1().m50930x1(new C10609qn(4, ((((C7019kk.m27435du(Float.valueOf(tableMo64936jd.getRotation()), 13) & 4294967295L) % 360) & 4294967295L) << 16) & 4294967295L));
        }
        c10534m3M72308fa.m51263x1().m50930x1(new C10355ai(896, tableMo64936jd.getName()));
        c10534m3M72308fa.m51263x1().m50930x1(new C10609qn(127, 16777472L));
        C10711xc c10711xcM72326up = tableMo64936jd.mo1638uz().m72326up();
        C10711xc c10711xcMo50863m9 = c10462h9M72000ix.mo50863m9();
        C10564nv c10564nv = new C10564nv();
        if (c10711xcM72326up != null && c10711xcM72326up.m51976x1().m50923k4(927) != null) {
            c10564nv = (C10564nv) c10711xcM72326up.m51976x1().m50923k4(927);
        }
        c10564nv.m51381k4(true);
        c10711xcMo50863m9.m51976x1().m50930x1(c10564nv);
        C10749ze c10749ze = new C10749ze(928, tableMo64936jd.getRows().size() & 65535, 4);
        c10711xcMo50863m9.m51976x1().m50930x1(c10749ze);
        for (int i2 = 0; i2 < tableMo64936jd.getRows().size(); i2++) {
            c10749ze.m52132k4(i2, C7019kk.m27461m9(Double.valueOf(C14116yg.m67497to(tableMo64936jd.getRows().get_Item(i2).getMinimalHeight() * 8.0d)), 14));
        }
        C10386c9 c10386c9 = new C10386c9();
        c10462h9M72000ix.m50513yj().addItem(c10386c9);
        int iOooO00o = OooO00o.OooO00o(tableMo64936jd.getX(), 8.0d, 14);
        int iOooO00o2 = OooO00o.OooO00o(tableMo64936jd.getY(), 8.0d, 14);
        int iOooO00o3 = OooO00o.OooO00o(tableMo64936jd.getWidth(), 8.0d, 14);
        int iOooO00o4 = OooO00o.OooO00o(tableMo64936jd.getHeight(), 8.0d, 14);
        c10386c9.m50545k4(iOooO00o);
        c10386c9.m50552x1(iOooO00o2);
        c10386c9.m50550to(iOooO00o4);
        c10386c9.m50548kk(iOooO00o3);
        if (tableMo64936jd.getRows().size() < 1 || tableMo64936jd.getColumns().size() < 1) {
            return;
        }
        tableMo64936jd.m2546bz().mo5640kk();
        int size = tableMo64936jd.getColumns().size();
        int size2 = tableMo64936jd.getRows().size();
        int[] iArr = new int[size + 1];
        int[] iArr2 = new int[size2 + 1];
        double x = tableMo64936jd.getX();
        iArr[0] = OooO00o.OooO00o(x, 8.0d, 14);
        int i3 = 0;
        while (i3 < size) {
            x += tableMo64936jd.f3496x1.m1147k4(i3).getWidth();
            i3++;
            iArr[i3] = OooO00o.OooO00o(x, 8.0d, 14);
        }
        double y = tableMo64936jd.getY();
        iArr2[0] = OooO00o.OooO00o(y, 8.0d, 14);
        int i4 = 0;
        while (i4 < size2) {
            y += tableMo64936jd.f3493k4.m2491k4(i4).getHeight();
            i4++;
            iArr2[i4] = OooO00o.OooO00o(y, 8.0d, 14);
        }
        int i5 = 0;
        while (i5 < tableMo64936jd.getRows().size()) {
            Row rowM2491k4 = tableMo64936jd.f3493k4.m2491k4(i5);
            int colSpan = i;
            while (colSpan < size) {
                Cell cellMo484k4 = rowM2491k4.mo484k4(colSpan);
                if (cellMo484k4.m463dy()) {
                    colSpan += cellMo484k4.m462du().getColSpan();
                } else {
                    C12014ne c12014ne = new C12014ne(iArr[colSpan], iArr2[i5], iArr[cellMo484k4.getColSpan() + colSpan] - iArr[colSpan], iArr2[cellMo484k4.getRowSpan() + i5] - iArr2[i5]);
                    m70383k4(c12014ne.Clone(), new f5k(cellMo484k4, r9qVar));
                    if (!cellMo484k4.getCellFormat().getBorderDiagonalDown().isFormatNotDefined()) {
                        m70381k4(c12014ne.Clone(), new q0x(cellMo484k4.getCellFormat().getBorderDiagonalDown(), r9qVar));
                    }
                    if (!cellMo484k4.getCellFormat().getBorderDiagonalUp().isFormatNotDefined()) {
                        m70381k4(c12014ne.Clone(), new q0x(cellMo484k4.getCellFormat().getBorderDiagonalUp(), r9qVar)).mo50864to().m52030dy(true);
                    }
                    colSpan += cellMo484k4.getColSpan();
                }
            }
            i5++;
            i = 0;
        }
        int i6 = 0;
        int i7 = 0;
        while (i6 <= size) {
            int i8 = 0;
            ILineFormat iLineFormat = null;
            while (i8 < size2) {
                Row rowM2491k42 = tableMo64936jd.f3493k4.m2491k4(i8);
                ILineFormat iLineFormatM2866k4 = Table.m2866k4(i6 > 0 ? rowM2491k42.mo484k4(i6 - 1) : null, i6 < size ? rowM2491k42.mo484k4(i6) : null, z);
                if (iLineFormatM2866k4 != null) {
                    if (!iLineFormatM2866k4.equals(iLineFormat)) {
                        if (iLineFormat != null && !iLineFormat.isFormatNotDefined()) {
                            m70381k4(new C12014ne(iArr[i6], i7, 0, iArr2[i8] - i7), new q0x(iLineFormat, r9qVar));
                        }
                        i7 = iArr2[i8];
                        iLineFormat = iLineFormatM2866k4;
                    }
                } else if (iLineFormat != null) {
                }
                i8++;
                z = true;
            }
            if (iLineFormat != null && !iLineFormat.isFormatNotDefined()) {
                m70381k4(new C12014ne(iArr[i6], i7, 0, iArr2[size2] - i7), new q0x(iLineFormat, r9qVar));
            }
            i6++;
            z = true;
        }
        int i9 = 0;
        while (i9 <= size2) {
            Row rowM2491k43 = i9 > 0 ? tableMo64936jd.f3493k4.m2491k4(i9 - 1) : null;
            Row rowM2491k44 = i9 < size2 ? tableMo64936jd.f3493k4.m2491k4(i9) : null;
            int i10 = i7;
            int i11 = 0;
            ILineFormat iLineFormat2 = null;
            while (i11 < size) {
                ILineFormat iLineFormatM2866k42 = Table.m2866k4(rowM2491k43 != null ? rowM2491k43.mo484k4(i11) : null, rowM2491k44 != null ? rowM2491k44.mo484k4(i11) : null, false);
                if (iLineFormatM2866k42 == null ? iLineFormat2 == null : iLineFormatM2866k42.equals(iLineFormat2)) {
                    table = tableMo64936jd;
                } else {
                    if (iLineFormat2 == null || iLineFormat2.isFormatNotDefined()) {
                        table = tableMo64936jd;
                    } else {
                        table = tableMo64936jd;
                        m70381k4(new C12014ne(i10, iArr2[i9], iArr[i11] - i10, 0), new q0x(iLineFormat2, r9qVar));
                    }
                    i10 = iArr[i11];
                    iLineFormat2 = iLineFormatM2866k42;
                }
                i11++;
                tableMo64936jd = table;
            }
            Table table2 = tableMo64936jd;
            if (iLineFormat2 != null && !iLineFormat2.isFormatNotDefined()) {
                m70381k4(new C12014ne(i10, iArr2[i9], iArr[size] - i10, 0), new q0x(iLineFormat2, r9qVar));
            }
            i9++;
            i7 = i10;
            tableMo64936jd = table2;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m70385k4(zsn zsnVar) {
        Table tableM74800dy = zsnVar.m74800dy();
        double[] dArr = new double[zsnVar.m74798ar()];
        double[] dArr2 = new double[zsnVar.m74804um()];
        for (int i = 0; i < zsnVar.m74798ar(); i++) {
            dArr[i] = ((double) zsnVar.m74801k4(i)) / 8.0d;
        }
        for (int i2 = 0; i2 < zsnVar.m74804um(); i2++) {
            dArr2[i2] = ((double) zsnVar.m74805x1(i2)) / 8.0d;
        }
        tableM74800dy.m2872k4(dArr, dArr2);
        C12014ne c12014neClone = zsnVar.m74799bv().Clone();
        nd1 nd1VarMo1214P_ = tableM74800dy.mo1214P_();
        double dM56664ck = ((double) c12014neClone.m56664ck()) / 8.0d;
        double dM56663c5 = ((double) c12014neClone.m56663c5()) / 8.0d;
        double dM56683x1 = ((double) c12014neClone.m56683x1()) / 8.0d;
        nd1VarMo1214P_.m67987k4(new tbp(((double) c12014neClone.m56669jd()) / 8.0d, dM56664ck));
        tableM74800dy.m2555k4(dM56663c5, dM56683x1);
    }
}

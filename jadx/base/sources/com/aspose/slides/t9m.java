package com.aspose.slides;

import androidx.core.app.FrameMetricsAggregator;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.internal.p505xn.C12566m9;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14084qq;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.words.ControlChar;
import com.huawei.hms.network.embedded.C18241k5;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class t9m {

    /* JADX INFO: renamed from: k4 */
    private static final String f49085k4 = C14113y2.m67408k4("anim", C18241k5.f55433h, "par");

    /* JADX INFO: renamed from: k4 */
    private static com.aspose.slides.internal.p332p7.pkv m71036k4(String str, wxb wxbVar) {
        if (wxbVar.m72957k4().m69960x1().m69241jd().containsKey(str)) {
            return wxbVar.m72957k4().m69960x1().m69241jd().get_Item(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    private static void m71037k4(IBaseSlide iBaseSlide) {
        for (int size = iBaseSlide.getShapes().size() - 1; size >= 0; size--) {
            iBaseSlide.getShapes().removeAt(size);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m71038k4(ISlide iSlide, com.aspose.slides.internal.p332p7.fx0 fx0Var) {
        ICommentAuthor iCommentAuthorAddAuthor;
        String strM67407k4;
        if (fx0Var.m32158kk() == null) {
            fx0Var.m32157k4("no author");
        }
        ICommentAuthorCollection commentAuthors = iSlide.getPresentation().getCommentAuthors();
        ICommentAuthor[] iCommentAuthorArrFindByName = commentAuthors.findByName(fx0Var.m32158kk());
        if (iCommentAuthorArrFindByName.length == 0) {
            if ("no author".equals(fx0Var.m32158kk())) {
                strM67407k4 = "n/a";
            } else {
                String[] strArrM67414k4 = C14113y2.m67414k4(fx0Var.m32158kk(), ControlChar.SPACE_CHAR);
                strM67407k4 = strArrM67414k4.length > 1 ? C14113y2.m67407k4(Character.valueOf(strArrM67414k4[0].charAt(0)), ".", Character.valueOf(strArrM67414k4[1].charAt(0)), ".") : C14113y2.m67407k4(Character.valueOf(strArrM67414k4[0].charAt(0)), ".");
            }
            iCommentAuthorAddAuthor = commentAuthors.addAuthor(fx0Var.m32158kk(), strM67407k4);
        } else {
            iCommentAuthorAddAuthor = iCommentAuthorArrFindByName[0];
        }
        List.Enumerator<C7394ca> it = fx0Var.m32155du().iterator();
        String strM67400k4 = "";
        while (it.hasNext()) {
            try {
                com.aspose.slides.internal.p332p7.ok7 ok7Var = (com.aspose.slides.internal.p332p7.ok7) C7019kk.m27452k4(it.next().m29541kk(), com.aspose.slides.internal.p332p7.ok7.class);
                if (ok7Var != null) {
                    it = ok7Var.m38327kk().iterator();
                    while (it.hasNext()) {
                        try {
                            C7394ca next = it.next();
                            if ("_TEXT".equals(next.m29539k4())) {
                                strM67400k4 = C14113y2.m67400k4(strM67400k4, C14113y2.m67408k4(next.m29541kk().toString(), IOUtils.LINE_SEPARATOR_UNIX));
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
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        String strM67394k4 = C14113y2.m67411k4(strM67400k4) ? "" : C14113y2.m67394k4(strM67400k4, strM67400k4.length() - 1);
        double[] dArr = {0.0d};
        C14044b3.m66435k4(C14113y2.m67394k4(fx0Var.m32156k4(), fx0Var.m32156k4().length() - 2), FrameMetricsAggregator.EVERY_DURATION, C11697x1.m55250kk(), dArr);
        double d = dArr[0];
        double[] dArr2 = {0.0d};
        C14044b3.m66435k4(C14113y2.m67394k4(fx0Var.m32160x1(), fx0Var.m32160x1().length() - 2), FrameMetricsAggregator.EVERY_DURATION, C11697x1.m55250kk(), dArr2);
        double d2 = dArr2[0];
        double dM58640dy = C12566m9.m58640dy(d);
        double dM58640dy2 = C12566m9.m58640dy(d2);
        C14084qq c14084qq = new C14084qq();
        C14084qq[] c14084qqArr = {c14084qq};
        C14084qq.m67103k4(fx0Var.m32159to(), c14084qqArr);
        c14084qqArr[0].CloneTo(c14084qq);
        ((CommentCollection) iCommentAuthorAddAuthor.getComments()).m1187k4(strM67394k4, iSlide, new C12025x6((float) dM58640dy, (float) dM58640dy2), c14084qq.Clone());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    private static void m71039k4(Slide slide) {
        boolean zM27456k4;
        IGenericList<IHyperlinkContainer> anyHyperlinks = slide.getHyperlinkQueries().getAnyHyperlinks();
        if (anyHyperlinks.size() == 0) {
            return;
        }
        List list = new List();
        int i = 0;
        while (true) {
            if (i >= anyHyperlinks.size()) {
                break;
            }
            PortionFormat portionFormat = (PortionFormat) C7019kk.m27452k4((Object) anyHyperlinks.get_Item(i), PortionFormat.class);
            if (portionFormat != null) {
                lrb lrbVarM2305bv = portionFormat.m2305bv();
                ((Hyperlink) portionFormat.getHyperlinkClick()).m1703x1(lrbVarM2305bv.getFontUnderline() == 0);
                ParagraphFormat paragraphFormat = (ParagraphFormat) ((Portion) portionFormat.getParent_Immediate()).m2282fa().getParagraphFormat();
                if (portionFormat.getFillFormat().getFillType() != -1 || paragraphFormat.m2204to().getFillFormat().getFillType() != -1) {
                    list.addItem(lrbVarM2305bv);
                }
            }
            i++;
        }
        if (list.size() == 0) {
            return;
        }
        List.Enumerator it = list.iterator();
        lrb lrbVar = null;
        while (it.hasNext()) {
            try {
                lrb lrbVar2 = (lrb) it.next();
                if (lrbVar2.getFillFormat().getFillType() != 1) {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                        return;
                    }
                    return;
                } else {
                    if (lrbVar != null && C12003du.m56476x1(((C14176nc) lrbVar2.getFillFormat()).m67938m9(), ((C14176nc) lrbVar.getFillFormat()).m67938m9())) {
                        if (zM27456k4) {
                            return;
                        } else {
                            return;
                        }
                    }
                    lrbVar = lrbVar2;
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
        if (lrbVar != null) {
            slide.getThemeManager().getOverrideTheme().initColorSchemeFromInherited();
            ((ColorFormat) slide.getThemeManager().getOverrideTheme().getColorScheme().getHyperlink()).m1080k4(((C14176nc) lrbVar.getFillFormat()).m67938m9().Clone());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0046, code lost:
    
        r2 = (com.aspose.slides.LayoutSlide) r6.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0052, code lost:
    
        if (r2.getLayoutType() != 11) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0054, code lost:
    
        r5.m2719x1(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0058, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005e, code lost:
    
        if (com.aspose.slides.internal.p314oc.C7019kk.m27456k4((java.util.Iterator) r6, (java.lang.Class<com.aspose.slides.p559ms.System.IDisposable>) com.aspose.slides.p559ms.System.IDisposable.class) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0060, code lost:
    
        r6.dispose();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006a, code lost:
    
        if (com.aspose.slides.internal.p314oc.C7019kk.m27456k4((java.util.Iterator) r6, (java.lang.Class<com.aspose.slides.p559ms.System.IDisposable>) com.aspose.slides.p559ms.System.IDisposable.class) != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006c, code lost:
    
        r6.dispose();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006f, code lost:
    
        throw r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0074, code lost:
    
        if (com.aspose.slides.internal.p314oc.C7019kk.m27456k4((java.util.Iterator) r1, (java.lang.Class<com.aspose.slides.p559ms.System.IDisposable>) com.aspose.slides.p559ms.System.IDisposable.class) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0076, code lost:
    
        r1.dispose();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0079, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0036, code lost:
    
        r6 = ((com.aspose.slides.MasterLayoutSlideCollection) r2.getLayoutSlides()).iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0044, code lost:
    
        if (r6.hasNext() == false) goto L39;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void m71040k4(Slide slide, com.aspose.slides.internal.p332p7.fre freVar) {
        IGenericEnumerator<IMasterSlide> it = ((MasterSlideCollection) ((Presentation) slide.getPresentation()).getMasters()).iterator();
        while (true) {
            try {
                if (!it.hasNext()) {
                    break;
                }
                MasterSlide masterSlide = (MasterSlide) it.next();
                if (C14113y2.m67363du(((MasterThemeManager) masterSlide.getThemeManager()).m1963k4().getName(), freVar.m32031du())) {
                    break;
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0195, code lost:
    
        com.aspose.slides.mxr.m67792k4((com.aspose.slides.TextFrame) r9.getNotesTextFrame(), new com.aspose.slides.nh5(r5), r4, r5, r10);
     */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m71041k4(Slide slide, com.aspose.slides.internal.p332p7.fre freVar, IGenericList<C7394ca> iGenericList, wxb wxbVar) {
        if (freVar == null) {
            throw new ArgumentNullException("pageElementData");
        }
        m71037k4((IBaseSlide) slide);
        slide.setName(freVar.m32038kk());
        m71040k4(slide, freVar);
        wr8.m72896k4(slide, freVar.m32041to(), wxbVar);
        com.aspose.slides.internal.p332p7.nk7 nk7Var = (com.aspose.slides.internal.p332p7.nk7) wgi.m72712k4(com.aspose.slides.internal.p332p7.nk7.class, "drawing-page-properties", wxbVar.m4421kk().get_Item(freVar.m32041to()).m36550to());
        wxbVar.m72958k4(new hom(slide, m71036k4(freVar.m32034h4(), wxbVar)));
        List.Enumerator<C7394ca> it = freVar.m32040m9().iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                wxbVar.m72957k4().m69957to().throwIfInterruptionRequested();
                mxr.m67788k4((ShapeCollection) slide.getShapes(), next, wxbVar);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (nk7Var != null) {
            slide.setShowMasterShapes(nk7Var.m37664yj() == 1);
            slide.setHidden(nk7Var.m37658up() == 2);
            IGenericEnumerator<C7394ca> it2 = iGenericList.iterator();
            while (it2.hasNext()) {
                try {
                    C7394ca next2 = it2.next();
                    if (!C14113y2.m67411k4(freVar.m32037k4()) && C14113y2.m67363du("footer-decl", next2.m29539k4()) && nk7Var.m37650ks() == 1) {
                        slide.m2710u4().setFooterVisibility(true);
                        com.aspose.slides.internal.p332p7.yp7 yp7Var = (com.aspose.slides.internal.p332p7.yp7) next2.m29541kk();
                        if (yp7Var.m45076k4() != null) {
                            slide.m2710u4().setFooterText(yp7Var.m45076k4());
                        }
                    }
                    if (!C14113y2.m67411k4(freVar.m32043x1()) && C14113y2.m67363du("date-time-decl", next2.m29539k4()) && nk7Var.m37663x6() == 1) {
                        slide.m2710u4().setDateTimeVisibility(true);
                        com.aspose.slides.internal.p332p7.dac dacVar = (com.aspose.slides.internal.p332p7.dac) next2.m29541kk();
                        if (dacVar.m30255k4() != null) {
                            slide.m2710u4().setDateTimeText(dacVar.m30255k4());
                        }
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
            if (nk7Var.m37653rv() == 1) {
                slide.m2710u4().setSlideNumberVisibility(true);
            }
        }
        if (freVar.m32033dy() != null) {
            C14820xw.m73610k4(slide.getTimeline(), (com.aspose.slides.internal.p332p7.idf) freVar.m32033dy().m29542x1(), new c0z(wxbVar));
        }
        if (freVar.m32030c5() != null) {
            INotesSlide iNotesSlideAddNotesSlide = slide.getNotesSlideManager().addNotesSlide();
            it = freVar.m32030c5().m39656x1().iterator();
            while (true) {
                try {
                    if (!it.hasNext()) {
                        break;
                    }
                    com.aspose.slides.internal.p332p7.vtn[] vtnVarArr = {null};
                    com.aspose.slides.internal.p332p7.pb4[] pb4VarArr = {null};
                    boolean zM71042k4 = m71042k4(it.next(), vtnVarArr, pb4VarArr);
                    com.aspose.slides.internal.p332p7.vtn vtnVar = vtnVarArr[0];
                    com.aspose.slides.internal.p332p7.pb4 pb4Var = pb4VarArr[0];
                    if (zM71042k4) {
                        break;
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
        }
        if (freVar.m32035jd().length > 0) {
            for (com.aspose.slides.internal.p332p7.fx0 fx0Var : freVar.m32035jd()) {
                m71038k4(slide, fx0Var);
            }
        }
        m71039k4(slide);
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m71042k4(C7394ca c7394ca, com.aspose.slides.internal.p332p7.vtn[] vtnVarArr, com.aspose.slides.internal.p332p7.pb4[] pb4VarArr) {
        com.aspose.slides.internal.p332p7.pb4 pb4VarM67780k4;
        vtnVarArr[0] = null;
        pb4VarArr[0] = null;
        com.aspose.slides.internal.p332p7.vtn vtnVar = (com.aspose.slides.internal.p332p7.vtn) C7019kk.m27452k4((Object) c7394ca.m29542x1(), com.aspose.slides.internal.p332p7.vtn.class);
        if (vtnVar != null && vtnVar.m43293fa() == 11 && (pb4VarM67780k4 = mxr.m67780k4(vtnVar.m43311yj())) != null) {
            vtnVarArr[0] = vtnVar;
            pb4VarArr[0] = pb4VarM67780k4;
            return true;
        }
        return false;
    }
}

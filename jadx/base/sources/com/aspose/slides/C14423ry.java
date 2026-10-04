package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC9290yj;
import com.aspose.slides.internal.p464vq.C11791os;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14117yj;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.words.ControlChar;
import com.facebook.common.callercontext.ContextChain;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.ry */
/* JADX INFO: loaded from: classes3.dex */
class C14423ry extends ywb {

    /* JADX INFO: renamed from: k4 */
    private static final C7017h4 f48732k4 = new C7017h4("application/vnd.ms-office.DrsShape+xml", "application/vnd.ms-office.DrsE2oDoc+xml", "application/vnd.ms-office.DrsConnector+xml", "application/vnd.ms-office.DrsPicture+xml", "application/vnd.ms-office.DrsInk+xml");

    public C14423ry(C11791os c11791os, gnb gnbVar) {
        super(c11791os, gnbVar);
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC9290yj m70392k4(bjs bjsVar) {
        mo3469k4(new String[0]);
        int iM27428k4 = f48732k4.m27428k4(mo3467du().m55372fa().mo55273k4());
        if (iM27428k4 == 0) {
            return new com.aspose.slides.internal.p332p7.hc1(m55443jd());
        }
        if (iM27428k4 == 1) {
            bjsVar.m4231k4(mo3467du());
            return new com.aspose.slides.internal.p332p7.z2c(m55443jd());
        }
        if (iM27428k4 == 2) {
            return new com.aspose.slides.internal.p332p7.zkb(m55443jd());
        }
        if (iM27428k4 == 3 || iM27428k4 == 4) {
            return new com.aspose.slides.internal.p332p7.hc1(m55443jd());
        }
        mo55330fa();
        return null;
    }

    public C14423ry(C11791os c11791os, u8s u8sVar) {
        super(c11791os, u8sVar);
    }

    /* JADX INFO: renamed from: k4 */
    private void m70391k4(u8s u8sVar) {
        IGenericEnumerator<IMasterSlide> it = u8sVar.m71526c5().getMasters().iterator();
        while (it.hasNext()) {
            try {
                MasterSlide masterSlide = (MasterSlide) it.next();
                if (!u8sVar.m71565x1().containsKey(masterSlide)) {
                    u8sVar.m71565x1().addItem(masterSlide, C14113y2.m67408k4("/ppt/slideMasters/slideMaster", C14057f9.m66591x1(u8sVar.m71523b3()), ".xml"));
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
        IGenericEnumerator<ISlide> it2 = u8sVar.m71526c5().getLayoutSlides().iterator();
        while (it2.hasNext()) {
            try {
                LayoutSlide layoutSlide = (LayoutSlide) it2.next();
                if (!u8sVar.m71565x1().containsKey(layoutSlide)) {
                    u8sVar.m71565x1().addItem(layoutSlide, C14113y2.m67408k4("/ppt/slideLayouts/slideLayout", C14057f9.m66591x1(u8sVar.m71562v4()), ".xml"));
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
            it2.dispose();
        }
        it2 = u8sVar.m71526c5().getSlides().iterator();
        while (it2.hasNext()) {
            try {
                Slide slide = (Slide) it2.next();
                if (!u8sVar.m71565x1().containsKey(slide)) {
                    u8sVar.m71565x1().addItem(slide, C14113y2.m67408k4("/ppt/slides/slide", C14057f9.m66591x1(u8sVar.m71521ak()), ".xml"));
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            }
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX INFO: renamed from: k4 */
    public final boolean m70393k4(IShape iShape, sdp sdpVar) throws Throwable {
        boolean z;
        ShapeStyle shapeStyle;
        Throwable th;
        AutoShape autoShape;
        boolean z2;
        Paragraph paragraph;
        boolean z3 = true;
        if (!C7019kk.m27469x1(iShape, AutoShape.class)) {
            if (!C7019kk.m27469x1(iShape, Table.class) && !C7019kk.m27469x1(iShape, SmartArt.class)) {
                return false;
            }
            mo55332up();
            com.aspose.slides.internal.p332p7.pij pijVar = new com.aspose.slides.internal.p332p7.pij();
            m70391k4(sdpVar.m70580k4());
            if (C7019kk.m27469x1(iShape, Table.class)) {
                pijVar.mo31678kk().m33836k4().m43900k4("http://schemas.openxmlformats.org/drawingml/2006/table");
                rvh.m70355k4((Table) iShape, pijVar, sdpVar.m70580k4());
            }
            if (C7019kk.m27469x1(iShape, SmartArt.class)) {
                pijVar.mo31678kk().m33836k4().m43900k4("http://schemas.openxmlformats.org/drawingml/2006/diagram");
                nkv.m68070k4((SmartArt) iShape, pijVar, sdpVar);
                pijVar.mo31676k4().mo33833k4().m31575k4(iShape.getUniqueId());
            }
            pijVar.mo6846k4(ContextChain.TAG_PRODUCT, m55442ck(), "E2oFrame");
            mo55333yj();
            return true;
        }
        AutoShape autoShape2 = (AutoShape) iShape;
        List list = new List();
        List list2 = new List();
        List list3 = new List();
        List list4 = new List();
        if (autoShape2.getTextFrame() != null) {
            if (autoShape2.getTextFrame().getTextFrameFormat().getAutofitType() == 1) {
                jq6.m63494x1(((TextFrame) autoShape2.getTextFrame()).f3523to);
            }
            boolean z4 = autoShape2.m288x1().m2908jd().m2957ks() != 1;
            IGenericEnumerator<IParagraph> it = autoShape2.getTextFrame().getParagraphs().iterator();
            while (it.hasNext()) {
                try {
                    Paragraph paragraph2 = (Paragraph) it.next();
                    IGenericEnumerator<IPortion> it2 = paragraph2.getPortions().iterator();
                    while (it2.hasNext()) {
                        try {
                            Portion portion = (Portion) it2.next();
                            boolean z5 = z3;
                            list.addItem(portion.m2283h4());
                            if (z4) {
                                C6765kp c6765kp = new C6765kp();
                                String strM2283h4 = portion.m2283h4();
                                z2 = z4;
                                paragraph = paragraph2;
                                int i = 0;
                                while (i < strM2283h4.length()) {
                                    int i2 = i;
                                    if (C14113y2.m67363du(C14113y2.m67358c5(C14117yj.m67537ne(strM2283h4.charAt(i))), C14117yj.m67537ne(strM2283h4.charAt(i)))) {
                                        c6765kp.m26780k4(ControlChar.SPACE_CHAR);
                                    } else {
                                        c6765kp.m26780k4('_');
                                    }
                                    i = i2 + 1;
                                }
                                portion.setText(c6765kp.toString());
                            } else {
                                z2 = z4;
                                paragraph = paragraph2;
                            }
                            list2.addItem(portion.m2295x1().m2304ar());
                            portion.m2295x1().m362k4((IPortionFormatEffectiveData) portion.m2295x1().m2305bv());
                            if (portion.m2291kk()) {
                                ParagraphFormat paragraphFormat = (ParagraphFormat) ((Field) portion.getField()).m1444k4().m63301k4();
                                list4.addItem(paragraphFormat.m2205up());
                                paragraphFormat.m2197k4(paragraphFormat.m2200ks());
                                paragraphFormat.m2204to().m371yj();
                            }
                            z4 = z2;
                            z3 = z5;
                            paragraph2 = paragraph;
                        } catch (Throwable th2) {
                            if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                                it2.dispose();
                            }
                            throw th2;
                        }
                    }
                    boolean z6 = z4;
                    boolean z7 = z3;
                    Paragraph paragraph3 = paragraph2;
                    if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                        it2.dispose();
                    }
                    list3.addItem(paragraph3.m2161k4().m2205up());
                    paragraph3.m2161k4().m2197k4(paragraph3.m2161k4().m2200ks());
                    paragraph3.m2161k4().m2204to().m371yj();
                    z4 = z6;
                    z3 = z7;
                } catch (Throwable th3) {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                    throw th3;
                }
            }
            z = z3;
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                it.dispose();
            }
            autoShape2.mo277dy();
        } else {
            z = true;
        }
        FillFormat fillFormatM1453du = ((FillFormat) autoShape2.getFillFormat()).m1453du();
        LineFormat lineFormatM1893du = ((LineFormat) autoShape2.getLineFormat()).m1893du();
        IFillFormatEffectiveData iFillFormatEffectiveDataMo1585ix = autoShape2.mo1585ix();
        if ((autoShape2.getShapeStyle() != null && !autoShape2.getUseBackgroundFill()) || ((autoShape2.getShapeStyle() == null && autoShape2.getFillFormat().getFillType() == -1) || autoShape2.getFillFormat().getFillType() > 2)) {
            FillFormat fillFormat = new FillFormat(autoShape2);
            fillFormat.m1457k4(iFillFormatEffectiveDataMo1585ix);
            ((FillFormat) autoShape2.getFillFormat()).m1456k4((IFillFormat) fillFormat);
        }
        ILineFormatEffectiveData iLineFormatEffectiveDataMo1587ne = autoShape2.mo1587ne();
        if (autoShape2.getShapeStyle() != null || autoShape2.getLineFormat().getFillFormat().getFillType() == -1 || autoShape2.getLineFormat().getFillFormat().getFillType() > 2) {
            LineFormat lineFormat = new LineFormat(autoShape2);
            lineFormat.m1897k4(iLineFormatEffectiveDataMo1587ne);
            ((LineFormat) autoShape2.getLineFormat()).m1896k4((ILineFormat) lineFormat);
        }
        if (autoShape2.getShapeStyle() != null) {
            ShapeStyle shapeStyleM2662k4 = ((ShapeStyle) autoShape2.getShapeStyle()).m2662k4();
            autoShape2.m1589u4();
            shapeStyle = shapeStyleM2662k4;
        } else {
            shapeStyle = null;
        }
        try {
            mo55332up();
            com.aspose.slides.internal.p332p7.dm6 dm6Var = new com.aspose.slides.internal.p332p7.dm6();
            if (autoShape2.getTextFrame() != null && autoShape2.getTextFrame().getParagraphs().getCount() > 0 && autoShape2.getTextFrame().getParagraphs().get_Item(0).getParagraphFormat().getDefaultPortionFormat().getFontHeight() == 11.0f) {
                autoShape2.getTextFrame().getParagraphs().get_Item(0).getParagraphFormat().getDefaultPortionFormat().setFontHeight(Float.NaN);
            }
            m70391k4(sdpVar.m70580k4());
            C0894dc.m5041k4(autoShape2, dm6Var, sdpVar, null);
            dm6Var.mo6846k4(ContextChain.TAG_PRODUCT, m55442ck(), "sp");
            mo55333yj();
            if (autoShape2.getTextFrame() != null) {
                IGenericEnumerator<IParagraph> it3 = autoShape2.getTextFrame().getParagraphs().iterator();
                int i3 = 0;
                int i4 = 0;
                while (it3.hasNext()) {
                    try {
                        Paragraph paragraph4 = (Paragraph) it3.next();
                        IGenericEnumerator<IPortion> it4 = paragraph4.getPortions().iterator();
                        while (it4.hasNext()) {
                            try {
                                Portion portion2 = (Portion) it4.next();
                                AutoShape autoShape3 = autoShape2;
                                portion2.setText((String) list.get_Item(i3));
                                portion2.m2295x1().m2313um();
                                int i5 = i3;
                                portion2.m2295x1().m369x1((BasePortionFormat) list2.get_Item(i3));
                                if (portion2.m2291kk()) {
                                    ParagraphFormat paragraphFormat2 = (ParagraphFormat) ((Field) portion2.getField()).m1444k4().m63301k4();
                                    paragraphFormat2.m2209yj();
                                    paragraphFormat2.m2195k4((IParagraphFormat) list4.get_Item(0));
                                    list4.removeAt(0);
                                }
                                i3 = i5 + 1;
                                autoShape2 = autoShape3;
                            } catch (Throwable th4) {
                                if (C7019kk.m27456k4((Iterator) it4, (Class<IDisposable>) IDisposable.class)) {
                                    it4.dispose();
                                }
                                throw th4;
                            }
                        }
                        int i6 = i3;
                        AutoShape autoShape4 = autoShape2;
                        if (C7019kk.m27456k4((Iterator) it4, (Class<IDisposable>) IDisposable.class)) {
                            it4.dispose();
                        }
                        paragraph4.m2161k4().m2209yj();
                        paragraph4.m2161k4().m2195k4((IParagraphFormat) list3.get_Item(i4));
                        i4++;
                        autoShape2 = autoShape4;
                        i3 = i6;
                    } catch (Throwable th5) {
                        if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                            it3.dispose();
                        }
                        throw th5;
                    }
                }
                autoShape = autoShape2;
                if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                    it3.dispose();
                }
                autoShape.mo277dy();
            } else {
                autoShape = autoShape2;
            }
            ((FillFormat) autoShape.getFillFormat()).m1456k4((IFillFormat) fillFormatM1453du);
            ((LineFormat) autoShape.getLineFormat()).m1896k4((ILineFormat) lineFormatM1893du);
            if (shapeStyle != null) {
                autoShape.m1588rv();
                ((ShapeStyle) autoShape.getShapeStyle()).m2663k4(shapeStyle);
            }
            return z;
        } catch (Throwable th6) {
            th = th6;
            if (autoShape2.getTextFrame() != null) {
                IGenericEnumerator<IParagraph> it5 = autoShape2.getTextFrame().getParagraphs().iterator();
                int i7 = 0;
                int i8 = 0;
                while (it5.hasNext()) {
                    try {
                        Paragraph paragraph5 = (Paragraph) it5.next();
                        IGenericEnumerator<IPortion> it6 = paragraph5.getPortions().iterator();
                        while (it6.hasNext()) {
                            try {
                                Portion portion3 = (Portion) it6.next();
                                Throwable th7 = th;
                                portion3.setText((String) list.get_Item(i7));
                                portion3.m2295x1().m2313um();
                                int i9 = i7;
                                portion3.m2295x1().m369x1((BasePortionFormat) list2.get_Item(i7));
                                if (portion3.m2291kk()) {
                                    ParagraphFormat paragraphFormat3 = (ParagraphFormat) ((Field) portion3.getField()).m1444k4().m63301k4();
                                    paragraphFormat3.m2209yj();
                                    paragraphFormat3.m2195k4((IParagraphFormat) list4.get_Item(0));
                                    list4.removeAt(0);
                                }
                                i7 = i9 + 1;
                                th = th7;
                            } catch (Throwable th8) {
                                if (C7019kk.m27456k4((Iterator) it6, (Class<IDisposable>) IDisposable.class)) {
                                    it6.dispose();
                                }
                                throw th8;
                            }
                        }
                        Throwable th9 = th;
                        int i10 = i7;
                        if (C7019kk.m27456k4((Iterator) it6, (Class<IDisposable>) IDisposable.class)) {
                            it6.dispose();
                        }
                        paragraph5.m2161k4().m2209yj();
                        paragraph5.m2161k4().m2195k4((IParagraphFormat) list3.get_Item(i8));
                        i8++;
                        th = th9;
                        i7 = i10;
                    } catch (Throwable th10) {
                        if (C7019kk.m27456k4((Iterator) it5, (Class<IDisposable>) IDisposable.class)) {
                            it5.dispose();
                        }
                        throw th10;
                    }
                }
                th = th;
                if (C7019kk.m27456k4((Iterator) it5, (Class<IDisposable>) IDisposable.class)) {
                    it5.dispose();
                }
                autoShape2.mo277dy();
            } else {
                th = th;
            }
            ((FillFormat) autoShape2.getFillFormat()).m1456k4((IFillFormat) fillFormatM1453du);
            ((LineFormat) autoShape2.getLineFormat()).m1896k4((ILineFormat) lineFormatM1893du);
            if (shapeStyle == null) {
                throw th;
            }
            autoShape2.m1588rv();
            ((ShapeStyle) autoShape2.getShapeStyle()).m2663k4(shapeStyle);
            throw th;
        }
    }
}

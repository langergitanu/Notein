package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.internal.p080dd.AbstractC3124b3;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12016rv;
import com.aspose.slides.p559ms.System.AbstractC14106wy;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.google.firebase.vertexai.common.util.KtorKt;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class u9b extends C14367qz<Slide> {
    public u9b(TemplateContext<Slide> templateContext, AbstractC3124b3 abstractC3124b3) {
        super(templateContext, abstractC3124b3);
    }

    @Override // com.aspose.slides.C14842yc
    /* JADX INFO: renamed from: k4 */
    public void mo6644k4() throws Throwable {
        IGenericEnumerator<IShape> it;
        Slide slide;
        boolean z;
        Slide slide2;
        int i;
        Slide slide3;
        boolean z2;
        int i2;
        u9b u9bVar = this;
        Slide object = u9bVar.m69966kk().getObject();
        boolean zBooleanValue = ((Boolean) u9bVar.m69966kk().getGlobal().get("animateTransitions")).booleanValue();
        int iM74520k4 = zgi.m74520k4(object);
        Dictionary<IShape, kte<String, String, Float, Float, String, String, Integer>> dictionaryM74524to = zgi.m74524to(object);
        String strM67408k4 = C14113y2.m67408k4("slide-", C14057f9.m66591x1(iM74520k4));
        String strM67408k42 = C14113y2.m67408k4("display: ", zBooleanValue ? "none" : "block", ";", zgi.m74522k4(u9bVar.m69966kk()));
        String str = u9bVar.m69966kk().getGlobal().containsKey("notesPosition") ? (String) u9bVar.m69966kk().getGlobal().get("notesPosition") : null;
        boolean z3 = (str == null || "None".equals(str)) ? false : true;
        u9bVar.m69969x1("\r\n    \r\n");
        u9bVar.m69969x1(IOUtils.LINE_SEPARATOR_WINDOWS);
        if (z3) {
            u9bVar.m69969x1("    ");
            u9bVar.m69969x1("\r\n\t    <div\r\n\t\t\tid=\"");
            u9bVar.m69967kk(strM67408k4);
            u9bVar.m69969x1("-notes\"\r\n\t\t\tclass=\"notes\">\r\n    ");
            u9bVar.m69969x1(IOUtils.LINE_SEPARATOR_WINDOWS);
        }
        u9bVar.m69969x1(IOUtils.LINE_SEPARATOR_WINDOWS);
        IMasterNotesSlide masterNotesSlide = object.getPresentation().getMasterNotesSlideManager().getMasterNotesSlide();
        INotesSlide notesSlide = object.getNotesSlideManager() != null ? object.getNotesSlideManager().getNotesSlide() : null;
        u9bVar.m69969x1(KtorKt.SSE_SEPARATOR);
        if (z3) {
            it = masterNotesSlide.getShapes().iterator();
            String strM67400k4 = strM67408k42;
            while (it.hasNext()) {
                try {
                    try {
                        IShape next = it.next();
                        if (next.getPlaceholder() == null || next.getPlaceholder().getType() != 14) {
                            slide3 = object;
                            z2 = zBooleanValue;
                            i2 = iM74520k4;
                        } else {
                            double width = ((double) next.getWidth()) / ((double) ((SlideSize) object.getPresentation().getSlideSize()).m2755k4().m56699x1());
                            double height = ((double) next.getHeight()) / ((double) ((SlideSize) object.getPresentation().getSlideSize()).m2755k4().m56697kk());
                            int iIntValue = ((Integer) m69966kk().getGlobal().get("slideMargin")).intValue();
                            slide3 = object;
                            float f = iIntValue;
                            z2 = zBooleanValue;
                            i2 = iM74520k4;
                            strM67400k4 = C14113y2.m67400k4(strM67400k4, C14113y2.m67402k4(" transform: matrix({0},0,0,{1},{2},{3}); transform-origin: {4}px {5}px; {6}", dh2.m5101k4(width), dh2.m5101k4(height), dh2.m5101k4(((double) (next.getX() - f)) - (((1.0d - width) * ((double) ((SlideSize) object.getPresentation().getSlideSize()).m2755k4().m56699x1())) / 2.0d)), dh2.m5101k4(((double) (next.getY() - f)) - (((1.0d - height) * ((double) ((SlideSize) object.getPresentation().getSlideSize()).m2755k4().m56697kk())) / 2.0d)), dh2.m5103k4(((SlideSize) slide3.getPresentation().getSlideSize()).m2755k4().m56699x1() / 2.0f), dh2.m5103k4(((SlideSize) slide3.getPresentation().getSlideSize()).m2755k4().m56697kk() / 2.0f), C14113y2.m67402k4("border: {0};", gau.m6461k4(next.getLineFormat().getEffective()))));
                        }
                        zBooleanValue = z2;
                        object = slide3;
                        iM74520k4 = i2;
                    } catch (Throwable th) {
                        th = th;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            Slide slide4 = object;
            boolean z4 = zBooleanValue;
            int i3 = iM74520k4;
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                it.dispose();
            }
            if (notesSlide != null) {
                IGenericEnumerator<IShape> it2 = notesSlide.getShapes().iterator();
                while (it2.hasNext()) {
                    try {
                        IShape next2 = it2.next();
                        if (next2.getPlaceholder() == null || next2.getPlaceholder().getType() != 14) {
                            z = z4;
                            slide2 = slide4;
                            i = i3;
                            try {
                                m71585k4(next2, slide2, z, i, dictionaryM74524to, z3, false);
                            } catch (Throwable th3) {
                                th = th3;
                                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                                    it2.dispose();
                                }
                                throw th;
                            }
                        } else {
                            z = z4;
                            slide2 = slide4;
                            i = i3;
                        }
                        slide4 = slide2;
                        z4 = z;
                        i3 = i;
                    } catch (Throwable th4) {
                        th = th4;
                    }
                }
                u9bVar = this;
                zBooleanValue = z4;
                object = slide4;
                iM74520k4 = i3;
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            } else {
                u9bVar = this;
                zBooleanValue = z4;
                object = slide4;
                iM74520k4 = i3;
            }
            strM67408k42 = strM67400k4;
        }
        u9bVar.m69969x1("    \r\n<div");
        t8o<String, Integer> t8oVarM63325k4 = jii.m63325k4(" id=\"", 5751);
        t8o<String, Integer> t8oVarM63325k42 = jii.m63325k4("\"", 5764);
        t8o t8oVarM63325k43 = jii.m63325k4("", 5756);
        Slide slide5 = object;
        t8o t8oVarM63325k44 = jii.m63325k4(strM67408k4, 5756);
        Boolean bool = Boolean.FALSE;
        u9bVar.m69965k4("id", t8oVarM63325k4, t8oVarM63325k42, jii.m63324k4(t8oVarM63325k43, t8oVarM63325k44, bool));
        u9bVar.m69969x1(" class=\"slide master-bg\"");
        u9bVar.m69969x1(" \r\n     data-transition-type=\"");
        u9bVar.m69967kk(AbstractC14106wy.getName((Class<?>) TransitionType.class, slide5.getSlideShowTransition().getType()));
        u9bVar.m69969x1("\"");
        u9bVar.m69969x1("\r\n     data-transition-speed=\"");
        u9bVar.m69967kk(AbstractC14106wy.getName((Class<?>) TransitionSpeed.class, slide5.getSlideShowTransition().getSpeed()));
        u9bVar.m69969x1("\"");
        u9bVar.m69969x1("\r\n     data-transition-direction=\"");
        u9bVar.m69967kk(zgi.m74525x1(slide5));
        u9bVar.m69969x1("\"");
        u9bVar.m69969x1("\r\n     data-transition-extra=\"");
        u9bVar.m69967kk(zgi.m74523kk(slide5));
        u9bVar.m69969x1("\"");
        u9bVar.m69965k4("style", jii.m63325k4("\r\n     style=\"", 6106), jii.m63325k4("\"", 6136), jii.m63324k4(jii.m63325k4("", 6120), jii.m63325k4(u9bVar.m69962k4(strM67408k42), 6120), bool));
        u9bVar.m69969x1(">\r\n    \r\n");
        it = slide5.getLayoutSlide().getMasterSlide().getShapes().iterator();
        while (it.hasNext()) {
            try {
                IShape next3 = it.next();
                if (slide5.getLayoutSlide().getShowMasterShapes() && next3.getPlaceholder() == null && !next3.getHidden()) {
                    slide = slide5;
                    u9bVar.m71585k4(next3, slide, zBooleanValue, iM74520k4, dictionaryM74524to, z3, true);
                } else {
                    slide = slide5;
                }
                slide5 = slide;
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        Slide slide6 = slide5;
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        u9bVar.m69969x1(IOUtils.LINE_SEPARATOR_WINDOWS);
        IGenericEnumerator<IShape> it3 = slide6.getLayoutSlide().getShapes().iterator();
        while (it3.hasNext()) {
            try {
                IShape next4 = it3.next();
                if (next4.getPlaceholder() == null) {
                    u9bVar.m71585k4(next4, slide6, zBooleanValue, iM74520k4, dictionaryM74524to, z3, true);
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
        u9bVar.m69969x1("        \r\n");
        IGenericEnumerator<IShape> it4 = slide6.getShapes().iterator();
        while (it4.hasNext()) {
            try {
                IShape next5 = it4.next();
                if (!next5.getHidden()) {
                    u9bVar.m71585k4(next5, slide6, zBooleanValue, iM74520k4, dictionaryM74524to, z3, true);
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it4, (Class<IDisposable>) IDisposable.class)) {
                    it4.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it4, (Class<IDisposable>) IDisposable.class)) {
            it4.dispose();
        }
        u9bVar.m69969x1("\r\n</div>\r\n\r\n");
        if (z3) {
            u9bVar.m69969x1("    ");
            u9bVar.m69969x1(IOUtils.LINE_SEPARATOR_WINDOWS);
            u9bVar.m69969x1("        ");
            u9bVar.m69967kk(u9bVar.m69962k4("</div>"));
            u9bVar.m69969x1("\r\n    ");
            u9bVar.m69969x1(IOUtils.LINE_SEPARATOR_WINDOWS);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0151  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m71585k4(IShape iShape, Slide slide, boolean z, int i, Dictionary<IShape, kte<String, String, Float, Float, String, String, Integer>> dictionary, boolean z2, boolean z3) {
        TemplateContext templateContextSubModel;
        AbstractC3124b3 abstractC3124b3;
        String str;
        int iIntValue = ((Integer) m69966kk().getGlobal().get("slideMargin")).intValue();
        if (z) {
            i = 1;
        }
        float f = (iIntValue + 1) / 2.0f;
        int iM27462to = ((i - 1) * C7019kk.m27462to(Float.valueOf(((SlideSize) slide.getPresentation().getSlideSize()).m2755k4().m56697kk() + f), 13)) + (!z ? i * iIntValue : 0);
        if (z2) {
            iM27462to = C7019kk.m27462to(Float.valueOf(f), 13) + (!z ? iIntValue : 0);
        }
        if (z) {
            iIntValue = 0;
        }
        C12016rv c12016rv = new C12016rv(iIntValue, iM27462to);
        String strM67400k4 = "";
        if (dictionary.containsKey(iShape)) {
            kte<String, String, Float, Float, String, String, Integer> kteVar = dictionary.get_Item(iShape);
            strM67400k4 = C14113y2.m67400k4(C14113y2.m67400k4(C14113y2.m67400k4(C14113y2.m67400k4(C14113y2.m67400k4(C14113y2.m67400k4(C14113y2.m67400k4("", C14113y2.m67408k4("data-animation-type=\"", kteVar.m64153k4(), "\" ")), C14113y2.m67408k4("data-animation-subtype=\"", kteVar.m64157x1(), "\" ")), C14113y2.m67408k4("data-animation-duration=\"", dh2.m5103k4(kteVar.m64154kk().floatValue()), "\" ")), C14113y2.m67408k4("data-animation-delay=\"", dh2.m5103k4(kteVar.m64156to().floatValue()), "\" ")), C14113y2.m67408k4("data-animation-clickTarget=\"", kteVar.m64151du(), "\" ")), C14113y2.m67408k4("data-animation-extra=\"", kteVar.m64152h4(), "\" ")), C14113y2.m67408k4("data-animation-index=\"", C14057f9.m66591x1(kteVar.m64155m9().intValue()), "\" "));
        }
        Class cls = AutoShape.class;
        if (C7019kk.m27469x1(iShape, cls)) {
            AutoShape autoShape = (AutoShape) iShape;
            if (autoShape.getShapeType() == 5 || autoShape.getShapeType() == -1) {
                templateContextSubModel = m69966kk().subModel(autoShape);
                templateContextSubModel.getLocal().put("origin", c12016rv.Clone());
                templateContextSubModel.getLocal().put("animationAttributes", strM67400k4);
                abstractC3124b3 = this.f50311k4;
                str = "autoshape";
            } else {
                cls = VideoFrame.class;
                if (C7019kk.m27469x1(iShape, cls)) {
                    templateContextSubModel = m69966kk().subModel((VideoFrame) iShape);
                    templateContextSubModel.getLocal().put("origin", c12016rv.Clone());
                    templateContextSubModel.getLocal().put("animationAttributes", strM67400k4);
                    abstractC3124b3 = this.f50311k4;
                    str = "videoframe";
                } else {
                    cls = PictureFrame.class;
                    if (C7019kk.m27469x1(iShape, cls)) {
                        templateContextSubModel = m69966kk().subModel((PictureFrame) iShape);
                        templateContextSubModel.getLocal().put("origin", c12016rv.Clone());
                        templateContextSubModel.getLocal().put("animationAttributes", strM67400k4);
                        abstractC3124b3 = this.f50311k4;
                        str = "pictureframe";
                    } else {
                        cls = Table.class;
                        if (C7019kk.m27469x1(iShape, cls)) {
                            templateContextSubModel = m69966kk().subModel((Table) iShape);
                            templateContextSubModel.getLocal().put("origin", c12016rv.Clone());
                            templateContextSubModel.getLocal().put("animationAttributes", strM67400k4);
                            abstractC3124b3 = this.f50311k4;
                            str = "table";
                        } else {
                            cls = Shape.class;
                            if (!C7019kk.m27469x1(iShape, cls)) {
                                return;
                            }
                            templateContextSubModel = m69966kk().subModel((Shape) iShape);
                            templateContextSubModel.getLocal().put("origin", c12016rv.Clone());
                            templateContextSubModel.getLocal().put("animationAttributes", strM67400k4);
                            abstractC3124b3 = this.f50311k4;
                            str = "shape";
                        }
                    }
                }
            }
        }
        nci.m67958k4(cls, abstractC3124b3, str, templateContextSubModel);
    }
}

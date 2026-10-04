package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.NullReferenceException;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3123ar;
import com.aspose.slides.internal.p080dd.C3130fa;
import com.aspose.slides.internal.p080dd.C3141rv;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p085dk.AbstractC3174jd;
import com.aspose.slides.internal.p085dk.C3173h4;
import com.aspose.slides.internal.p129fe.C3977ck;
import com.aspose.slides.internal.p129fe.C3978du;
import com.aspose.slides.internal.p129fe.C3981h4;
import com.aspose.slides.internal.p129fe.C3982jd;
import com.aspose.slides.internal.p129fe.C3986m9;
import com.aspose.slides.internal.p144g6.C4211fa;
import com.aspose.slides.internal.p144g6.C4219ne;
import com.aspose.slides.internal.p258lv.C6231ar;
import com.aspose.slides.internal.p294n9.C6783wp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p323op.C7131h4;
import com.aspose.slides.internal.p323op.C7134m9;
import com.aspose.slides.internal.p416tb.C10909qq;
import com.aspose.slides.internal.p416tb.C10920x6;
import com.aspose.slides.internal.p420th.AbstractC10973uz;
import com.aspose.slides.internal.p420th.C10948ar;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12023wl;
import com.aspose.slides.internal.p479wm.C12210k4;
import com.aspose.slides.internal.p479wm.C12211kk;
import com.aspose.slides.internal.p505xn.C12566m9;
import com.aspose.slides.p559ms.System.AbstractC14041ai;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14047bz;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.InterfaceC14073kp;
import com.aspose.slides.p559ms.System.Xml.C13991ub;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.hms.common.util.ExtractNativeUtils;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class kmn {
    /* JADX INFO: renamed from: k4 */
    private static long m64016k4(int i) {
        if (i == 1) {
            return 6L;
        }
        if (i == 2) {
            return 3L;
        }
        if (i != 3) {
            return i != 5 ? 2L : 5L;
        }
        return 4L;
    }

    /* JADX INFO: renamed from: x1 */
    public static void m64039x1(Presentation presentation, AbstractC3150x6 abstractC3150x6, HtmlOptions htmlOptions, InterruptionToken interruptionToken) {
        C0866cq.m4765k4(presentation, abstractC3150x6, htmlOptions, interruptionToken);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x003e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0013 A[SYNTHETIC] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static List<Long> m64017k4(Presentation presentation) {
        ISlide targetSlide;
        IHyperlink hyperlinkMouseOver;
        List<Long> list = new List<>();
        IGenericEnumerator<IHyperlinkContainer> it = presentation.getHyperlinkQueries().getAnyHyperlinks().iterator();
        while (it.hasNext()) {
            try {
                IHyperlinkContainer next = it.next();
                if (next.getHyperlinkClick() != null) {
                    hyperlinkMouseOver = next.getHyperlinkClick();
                } else if (next.getHyperlinkMouseOver() != null) {
                    hyperlinkMouseOver = next.getHyperlinkMouseOver();
                } else {
                    targetSlide = null;
                    if (targetSlide == null) {
                        list.addItem(Long.valueOf(targetSlide.getSlideId()));
                    }
                }
                targetSlide = hyperlinkMouseOver.getTargetSlide();
                if (targetSlide == null) {
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

    /* JADX INFO: renamed from: x1 */
    public static void m64040x1(Presentation presentation, AbstractC3150x6 abstractC3150x6, PdfOptions pdfOptions, InterruptionToken interruptionToken) {
        C0866cq.m4766k4(presentation, abstractC3150x6, pdfOptions, interruptionToken);
    }

    /* JADX INFO: renamed from: k4 */
    private static List<Integer> m64018k4(Presentation presentation, int[] iArr, boolean z) {
        boolean zM27456k4;
        int i;
        List<Integer> list = new List<>();
        int i2 = 0;
        if (iArr.length > 0 && iArr.length == presentation.getSlides().size() && iArr[0] == 1 && iArr[iArr.length - 1] == presentation.getSlides().size()) {
            IGenericEnumerator<ISlide> it = presentation.getSlides().iterator();
            while (it.hasNext()) {
                try {
                    if (!it.next().getHidden() || z) {
                        i = i2 + 1;
                    } else {
                        i = i2;
                        i2 = -1;
                    }
                    list.addItem(Integer.valueOf(i2));
                    i2 = i;
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            if (zM27456k4) {
                return list;
            }
        } else {
            List list2 = new List();
            for (int i3 = 0; i3 < iArr.length; i3++) {
                if (!presentation.getSlides().get_Item(iArr[i3] - 1).getHidden() || z) {
                    list2.addItem(Integer.valueOf(iArr[i3]));
                }
            }
            IGenericEnumerator<ISlide> it2 = presentation.getSlides().iterator();
            while (it2.hasNext()) {
                try {
                    ISlide next = it2.next();
                    int i4 = 0;
                    while (true) {
                        if (i4 >= list2.size()) {
                            i4 = -1;
                            break;
                        }
                        if (((Integer) list2.get_Item(i4)).intValue() == ((SlideCollection) presentation.getSlides()).indexOf(next) + 1) {
                            break;
                        }
                        i4++;
                    }
                    list.addItem(Integer.valueOf(i4));
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
        }
        return list;
    }

    /* JADX INFO: renamed from: x1 */
    public static void m64041x1(Presentation presentation, AbstractC3150x6 abstractC3150x6, SwfOptions swfOptions, InterruptionToken interruptionToken) {
        C0866cq.m4767k4(presentation, abstractC3150x6, swfOptions, interruptionToken);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m64019k4(IShape iShape, WebDocument webDocument, String str, IPresentation iPresentation, long[] jArr) {
        C12009k4 c12009k4M2553k4;
        if (iShape.getHidden()) {
            return;
        }
        AutoShape autoShape = (AutoShape) C7019kk.m27452k4((Object) iShape, AutoShape.class);
        if (autoShape == null || !(autoShape.getShapeType() == 5 || autoShape.getShapeType() == -1)) {
            IVideoFrame iVideoFrame = (IVideoFrame) C7019kk.m27452k4((Object) iShape, IVideoFrame.class);
            if (iVideoFrame != null) {
                Video video = (Video) iVideoFrame.getEmbeddedVideo();
                long j = jArr[0];
                jArr[0] = 1 + j;
                webDocument.getOutput().bindResource(webDocument.getOutput().add(C3141rv.m13412x1(str, C14113y2.m67402k4("video{0}.{1}", Long.valueOf(j), video.m3064to())), video), video);
                return;
            }
            if (C7019kk.m27469x1(iShape, IPictureFrame.class)) {
                return;
            }
            if (autoShape == null || C14113y2.m67411k4(autoShape.getTextFrame().getText())) {
                c12009k4M2553k4 = C7019kk.m27469x1(iShape, IConnector.class) ? ((Connector) iShape).m2553k4(2, 1.0f, 1.0f) : ((Shape) iShape).m2549e0();
            } else {
                AutoShape autoShape2 = (AutoShape) iPresentation.getSlides().get_Item(0).getShapes().addClone(autoShape);
                try {
                    autoShape2.getTextFrame().getParagraphs().clear();
                    c12009k4M2553k4 = autoShape2.m2549e0();
                } finally {
                    iPresentation.getSlides().get_Item(0).getShapes().remove(autoShape2);
                }
            }
            String strM67368h4 = C14113y2.m67368h4(C14067j2.m66727k4(iShape).mo48540du());
            long j2 = jArr[0];
            jArr[0] = 1 + j2;
            String strM13412x1 = C3141rv.m13412x1(str, C14113y2.m67402k4("{0}{1}.png", strM67368h4, Long.valueOf(j2)));
            C3152yj c3152yj = new C3152yj();
            try {
                c12009k4M2553k4.m56333k4(c3152yj, C3977ck.m15681jd());
                webDocument.getOutput().bindResource(webDocument.getOutput().m2107k4(strM13412x1, c3152yj.toArray()), iShape);
                c3152yj.dispose();
                c12009k4M2553k4.dispose();
            } catch (Throwable th) {
                c3152yj.dispose();
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    public static void m64042x1(Presentation presentation, AbstractC3150x6 abstractC3150x6, TiffOptions tiffOptions, InterruptionToken interruptionToken) {
        C0866cq.m4768k4(presentation, abstractC3150x6, tiffOptions, interruptionToken);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m64020k4(Presentation presentation, AbstractC3150x6 abstractC3150x6, Html5Options html5Options, InterruptionToken interruptionToken) {
        int size = presentation.getSlides().size();
        int[] iArr = new int[size];
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            iArr[i] = i2;
            i = i2;
        }
        m64027k4(presentation, abstractC3150x6, iArr, html5Options, interruptionToken);
    }

    /* JADX INFO: renamed from: x1 */
    public static void m64043x1(Presentation presentation, AbstractC3150x6 abstractC3150x6, int[] iArr, HtmlOptions htmlOptions, InterruptionToken interruptionToken) {
        C0866cq.m4769k4(presentation, abstractC3150x6, iArr, htmlOptions, interruptionToken);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m64021k4(Presentation presentation, AbstractC3150x6 abstractC3150x6, HtmlOptions htmlOptions, InterruptionToken interruptionToken) {
        int size = presentation.getSlides().size();
        int[] iArr = new int[size];
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            iArr[i] = i2;
            i = i2;
        }
        m64028k4(presentation, abstractC3150x6, iArr, htmlOptions, interruptionToken);
    }

    /* JADX INFO: renamed from: x1 */
    public static void m64044x1(Presentation presentation, AbstractC3150x6 abstractC3150x6, int[] iArr, PdfOptions pdfOptions, InterruptionToken interruptionToken) {
        C0866cq.m4770k4(presentation, abstractC3150x6, iArr, pdfOptions, interruptionToken);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m64022k4(Presentation presentation, AbstractC3150x6 abstractC3150x6, IHtml5Options iHtml5Options) {
        WebDocumentOptions webDocumentOptions = new WebDocumentOptions();
        webDocumentOptions.setTemplateEngine(new zk0());
        webDocumentOptions.setOutputSaver(new ibg());
        webDocumentOptions.setEmbedImages(iHtml5Options.getEmbedImages());
        webDocumentOptions.setAnimateShapes(iHtml5Options.getAnimateShapes());
        webDocumentOptions.setAnimateTransitions(iHtml5Options.getAnimateTransitions());
        WebDocument webDocument = new WebDocument(webDocumentOptions);
        String outputPath = iHtml5Options.getOutputPath();
        if (C14113y2.m67411k4(outputPath) && C7019kk.m27469x1(abstractC3150x6, C3130fa.class)) {
            outputPath = C3141rv.m13400h4(((C3130fa) abstractC3150x6).m13345k4());
        }
        webDocument.getGlobal().put("slideMargin", 10);
        webDocument.getGlobal().put("embedImages", Boolean.valueOf(iHtml5Options.getEmbedImages()));
        webDocument.getGlobal().put("animateTransitions", Boolean.valueOf(iHtml5Options.getAnimateTransitions()));
        webDocument.getGlobal().put("animateShapes", Boolean.valueOf(iHtml5Options.getAnimateShapes()));
        webDocument.getGlobal().put("navigationEnabled", Boolean.FALSE);
        webDocument.getGlobal().put("slidesPath", outputPath);
        webDocument.getGlobal().put("stylesPath", outputPath);
        webDocument.getGlobal().put("scriptsPath", outputPath);
        webDocument.getGlobal().put("mediaPath", outputPath);
        webDocument.getGlobal().put("notesPosition", C14042ak.m66410k4(NotesPositions.class, iHtml5Options.getNotesCommentsLayouting().getNotesPosition()));
        webDocument.getInput().m1842k4("styles-pres", new n0k(null, null));
        webDocument.getInput().m1842k4("styles-master", new mok(null, null));
        webDocument.getInput().m1842k4("scripts-animation", new rg7(null, null));
        webDocument.getInput().m1842k4("scripts-effects", new tx8(null, null));
        webDocument.getInput().m1842k4("scripts-navigation", new wyh(null, null));
        webDocument.getInput().m1842k4(FirebaseAnalytics.Param.INDEX, new ggf(null, null));
        webDocument.getInput().m1842k4("slide", new u9b(null, null));
        webDocument.getInput().m1842k4("autoshape", new C14829y4(null, null));
        webDocument.getInput().m1842k4("textframe", new rqx(null, null));
        webDocument.getInput().m1842k4("paragraph", new ozy(null, null));
        webDocument.getInput().m1842k4("bullet", new C14721w2(null, null));
        webDocument.getInput().m1842k4("portion", new u6l(null, null));
        webDocument.getInput().m1842k4("videoframe", new xhk(null, null));
        webDocument.getInput().m1842k4("pictureframe", new htx(null, null));
        webDocument.getInput().m1842k4("table", new t9l(null, null));
        webDocument.getInput().m1842k4("shape", new xk2(null, null));
        if (!iHtml5Options.getEmbedImages()) {
            String outputPath2 = iHtml5Options.getOutputPath();
            if (C14113y2.m67411k4(outputPath2) && C7019kk.m27469x1(abstractC3150x6, C3130fa.class)) {
                outputPath2 = C3141rv.m13400h4(((C3130fa) abstractC3150x6).m13345k4());
            }
            String strM13412x1 = C3141rv.m13412x1(outputPath2, "images");
            webDocument.getGlobal().put("slidesPath", outputPath2);
            webDocument.getGlobal().put("imagesPath", strM13412x1);
            m64047x1(webDocument, strM13412x1, presentation);
            m64035k4(webDocument, strM13412x1, (IPresentation) presentation);
        }
        webDocument.getOutput().m2105k4(abstractC3150x6, FirebaseAnalytics.Param.INDEX, presentation);
        if (outputPath != null) {
            webDocument.getOutput().add(C3141rv.m13412x1(outputPath, "pres.css"), "styles-pres", presentation);
            webDocument.getOutput().add(C3141rv.m13412x1(outputPath, "master.css"), "styles-master", (MasterSlide) presentation.getMasters().get_Item(0));
            webDocument.getOutput().add(C3141rv.m13412x1(outputPath, "animation.js"), "scripts-animation", presentation);
            webDocument.getOutput().add(C3141rv.m13412x1(outputPath, "effects.js"), "scripts-effects", presentation);
            webDocument.getOutput().add(C3141rv.m13412x1(outputPath, "navigation.js"), "scripts-navigation", presentation);
            m64036k4(webDocument, (String) webDocument.getGlobal().get("mediaPath"), presentation);
        }
        webDocument.save();
    }

    /* JADX INFO: renamed from: x1 */
    public static void m64045x1(Presentation presentation, AbstractC3150x6 abstractC3150x6, int[] iArr, SwfOptions swfOptions, InterruptionToken interruptionToken) {
        C0866cq.m4771k4(presentation, abstractC3150x6, iArr, swfOptions, interruptionToken);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m64023k4(Presentation presentation, AbstractC3150x6 abstractC3150x6, PdfOptions pdfOptions, InterruptionToken interruptionToken) {
        int size = presentation.getSlides().size();
        int[] iArr = new int[size];
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            iArr[i] = i2;
            i = i2;
        }
        m64029k4(presentation, abstractC3150x6, iArr, pdfOptions, interruptionToken);
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0203  */
    /* JADX INFO: renamed from: x1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m64046x1(Presentation presentation, AbstractC3150x6 abstractC3150x6, int[] iArr, TiffOptions tiffOptions, InterruptionToken interruptionToken) throws Throwable {
        C3986m9 c3986m9;
        C14258ow c14258ow;
        C14258ow c14258ow2;
        boolean z;
        char c;
        C14258ow c14258ow3;
        char c2;
        Slide slide;
        char c3;
        int iM27462to;
        C12009k4 c12009k4M69372k4;
        C12009k4 c12009k4 = null;
        C3982jd c3982jd = null;
        for (C3982jd c3982jd2 : C3982jd.m15697k4()) {
            if (C14113y2.m67363du(C14113y2.m67368h4(c3982jd2.m15699h4()), "image/tiff")) {
                c3982jd = c3982jd2;
            }
        }
        C3978du c3978du = C3978du.f10789m9;
        if (c3982jd == null) {
            throw new PptException("Multi-page TIFF encoder not found.");
        }
        char c4 = 3;
        char c5 = 2;
        int i = 1;
        if (tiffOptions.getCompressionType() != 0) {
            c3986m9 = new C3986m9(3);
            c3986m9.m15744k4()[1] = new C3981h4(C3978du.f10788kk, m64016k4(tiffOptions.getCompressionType()));
            c3986m9.m15744k4()[2] = new C3981h4(C3978du.f10791x1, tiffOptions.getPixelFormat());
        } else {
            c3986m9 = new C3986m9(2);
            c3986m9.m15744k4()[1] = new C3981h4(C3978du.f10791x1, tiffOptions.getPixelFormat());
        }
        C14258ow c14258owM2395wl = presentation.m2395wl();
        try {
            try {
                if (!C7019kk.m27469x1(tiffOptions.getSlidesLayoutOptions(), HandoutLayoutingOptions.class)) {
                    int i2 = 0;
                    while (i2 < iArr.length) {
                        interruptionToken.throwIfInterruptionRequested();
                        int i3 = iArr[i2] - i;
                        if (i3 < 0 || i3 > presentation.getSlides().size() - i || (slide = (Slide) presentation.getSlides().get_Item(i3)) == null || (slide.getHidden() && !tiffOptions.getShowHiddenSlides())) {
                            c = c5;
                            c14258ow3 = c14258owM2395wl;
                            c2 = c4;
                        } else {
                            C12015qq c12015qqClone = (tiffOptions.getNotesCommentsLayouting().getNotesPosition() != 0 ? ((NotesSize) presentation.getNotesSize()).m2030k4() : ((SlideSize) presentation.getSlideSize()).m2755k4()).Clone();
                            c14258ow3 = c14258owM2395wl;
                            if (tiffOptions.m3014k4().m56861k4()) {
                                c3 = 0;
                                iM27462to = C7019kk.m27462to(Double.valueOf(C12566m9.m58645k4(c12015qqClone.m56699x1(), 96.0d) * ((double) ((tiffOptions.getDpiX() & 4294967295L) / 96.0f))), 14);
                            } else {
                                iM27462to = tiffOptions.m3014k4().m56865x1();
                                c3 = 0;
                            }
                            C12023wl c12023wl = new C12023wl(iM27462to, !tiffOptions.m3014k4().m56861k4() ? tiffOptions.m3014k4().m56862kk() : C7019kk.m27462to(Double.valueOf(C12566m9.m58645k4(c12015qqClone.m56697kk(), 96.0d) * ((double) ((tiffOptions.getDpiY() & 4294967295L) / 96.0f))), 14));
                            C12210k4 c12210k4 = new C12210k4(C7134m9.class, C7131h4.class);
                            C13700js c13700js = new C13700js();
                            c13700js.f45578yj.setHideInk(tiffOptions.getInkOptions().getHideInk());
                            c13700js.f45578yj.setInterpretMaskOpAsOpacity(tiffOptions.getInkOptions().getInterpretMaskOpAsOpacity());
                            c13700js.f45574rv = tiffOptions.getGradientStyle();
                            kg7 kg7Var = new kg7(slide, c12210k4, c13700js);
                            if (tiffOptions.getNotesCommentsLayouting().getNotesPosition() != 0) {
                                if (slide.getNotesSlideManager().getNotesSlide() == null) {
                                    slide.getNotesSlideManager().addNotesSlide();
                                }
                                c12009k4M69372k4 = ((NotesSlide) slide.getNotesSlideManager().getNotesSlide()).m2034x6().m64316k4(c12023wl.Clone(), c13700js);
                            } else {
                                c12009k4M69372k4 = slide.m2721x6().m69372k4(c12023wl.Clone(), kg7Var);
                            }
                            c12009k4M69372k4.m56332k4(tiffOptions.getDpiX() & 4294967295L, tiffOptions.getDpiY() & 4294967295L);
                            c = 2;
                            if (tiffOptions.getCompressionType() != 2) {
                                c2 = 3;
                                if (tiffOptions.getCompressionType() == 3) {
                                }
                                if (c12009k4M69372k4 == null) {
                                    if (c12009k4 == null) {
                                        c3986m9.m15744k4()[c3] = new C3981h4(c3978du, 18L);
                                        c12009k4M69372k4.m56334k4(abstractC3150x6, c3982jd, c3986m9);
                                        c12009k4 = c12009k4M69372k4;
                                    } else {
                                        c3986m9.m15744k4()[c3] = new C3981h4(c3978du, 23L);
                                        c12009k4.m56338k4(c12009k4M69372k4, c3986m9);
                                    }
                                    i2++;
                                    c4 = c2;
                                    c5 = c;
                                    c14258owM2395wl = c14258ow3;
                                    i = 1;
                                }
                            } else {
                                c2 = 3;
                            }
                            if (tiffOptions.getBwConversionMode() != 0) {
                                c12009k4M69372k4 = C14143mt.m67713k4(c12009k4M69372k4, tiffOptions.getBwConversionMode());
                            }
                            if (c12009k4M69372k4 == null) {
                            }
                        }
                        i2++;
                        c4 = c2;
                        c5 = c;
                        c14258owM2395wl = c14258ow3;
                        i = 1;
                    }
                    c14258ow2 = c14258owM2395wl;
                    if (c12009k4 != null) {
                        c3986m9.m15744k4()[0] = new C3981h4(c3978du, 20L);
                        c12009k4.m56335k4(c3986m9);
                    }
                } else {
                    c14258ow2 = c14258owM2395wl;
                    MasterHandoutSlide masterHandoutSlide = (MasterHandoutSlide) presentation.getMasterHandoutSlideManager().getMasterHandoutSlide();
                    if (masterHandoutSlide == null) {
                        masterHandoutSlide = (MasterHandoutSlide) presentation.getMasterHandoutSlideManager().setDefaultMasterHandoutSlide();
                        z = true;
                    } else {
                        z = false;
                    }
                    new C14660v1(masterHandoutSlide, (HandoutLayoutingOptions) tiffOptions.getSlidesLayoutOptions(), tiffOptions.getShowHiddenSlides()).m72045k4(iArr, c3982jd, abstractC3150x6, tiffOptions, c3986m9, interruptionToken);
                    if (z) {
                        presentation.getMasterHandoutSlideManager().removeMasterHandoutSlide();
                    }
                }
                if (c14258ow2 != null) {
                    c14258ow2.dispose();
                }
            } catch (Throwable th) {
                th = th;
                if (c14258ow != null) {
                    c14258ow.dispose();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            c14258ow = c14258owM2395wl;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m64024k4(Presentation presentation, AbstractC3150x6 abstractC3150x6, SwfOptions swfOptions, InterruptionToken interruptionToken) {
        int size = presentation.getSlides().size();
        int[] iArr = new int[size];
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            iArr[i] = i2;
            i = i2;
        }
        m64030k4(presentation, abstractC3150x6, iArr, swfOptions, interruptionToken);
    }

    /* JADX INFO: renamed from: x1 */
    public static void m64047x1(WebDocument webDocument, String str, IPresentation iPresentation) {
        for (int i = 0; i < iPresentation.getImages().size(); i++) {
            IPPImage iPPImage = iPresentation.getImages().get_Item(i);
            webDocument.getOutput().bindResource(webDocument.getOutput().add(C3141rv.m13412x1(str, C14113y2.m67402k4("image{0}.{1}", Integer.valueOf(i), ("image/x-emf".equals(iPPImage.getContentType()) || "image/x-wmf".equals(iPPImage.getContentType())) ? "png" : ((PPImage) iPPImage).m2137x1().mo55336to())), iPPImage), iPPImage);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m64025k4(Presentation presentation, AbstractC3150x6 abstractC3150x6, TiffOptions tiffOptions, InterruptionToken interruptionToken) {
        int size = presentation.getSlides().size();
        int[] iArr = new int[size];
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            iArr[i] = i2;
            i = i2;
        }
        m64046x1(presentation, abstractC3150x6, iArr, tiffOptions, interruptionToken);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m64026k4(Presentation presentation, AbstractC3150x6 abstractC3150x6, XpsOptions xpsOptions, InterruptionToken interruptionToken) {
        int size = presentation.getSlides().size();
        int[] iArr = new int[size];
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            iArr[i] = i2;
            i = i2;
        }
        m64032k4(presentation, abstractC3150x6, iArr, xpsOptions, interruptionToken);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m64027k4(Presentation presentation, AbstractC3150x6 abstractC3150x6, int[] iArr, Html5Options html5Options, InterruptionToken interruptionToken) {
        if (html5Options == null) {
            html5Options = new Html5Options();
        }
        m64022k4(presentation, abstractC3150x6, html5Options);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public static void m64028k4(Presentation presentation, AbstractC3150x6 abstractC3150x6, int[] iArr, HtmlOptions htmlOptions, InterruptionToken interruptionToken) {
        List list;
        Class cls;
        Class cls2;
        HtmlGenerator htmlGenerator;
        SVGOptions sVGOptions;
        String str;
        String str2;
        C13700js c13700js;
        String[] strArr;
        C3986m9 c3986m9;
        vhx[] vhxVarArr;
        C3982jd c3982jd;
        int[] iArr2;
        Class cls3;
        HtmlGenerator htmlGenerator2;
        C3123ar c3123ar;
        SVGOptions sVGOptions2;
        String str3;
        Class cls4;
        C13700js c13700js2;
        String[] strArr2;
        List list2;
        C12210k4 c12210k4;
        int i;
        String[] strArr3;
        HtmlFormatter htmlFormatter;
        Slide slide;
        C3123ar c3123ar2;
        int[] iArr3;
        vhx[] vhxVarArr2;
        List list3;
        C3982jd c3982jd2;
        C3986m9 c3986m92;
        C13700js c13700js3;
        HtmlGenerator htmlGenerator3;
        SVGOptions sVGOptions3;
        int i2;
        HtmlGenerator htmlGenerator4;
        C13700js c13700js4;
        boolean z;
        C12210k4 c12210k42;
        String str4;
        String str5;
        C3986m9 c3986m93;
        C3982jd c3982jd3;
        boolean z2;
        HtmlOptions htmlOptions2 = htmlOptions == null ? new HtmlOptions() : htmlOptions;
        if (C7019kk.m27469x1(htmlOptions2.getSlidesLayoutOptions(), HandoutLayoutingOptions.class)) {
            MasterHandoutSlide masterHandoutSlide = (MasterHandoutSlide) presentation.getMasterHandoutSlideManager().getMasterHandoutSlide();
            if (masterHandoutSlide == null) {
                masterHandoutSlide = (MasterHandoutSlide) presentation.getMasterHandoutSlideManager().setDefaultMasterHandoutSlide();
                z2 = true;
            } else {
                z2 = false;
            }
            new C14660v1(masterHandoutSlide, (HandoutLayoutingOptions) htmlOptions2.getSlidesLayoutOptions(), htmlOptions2.getShowHiddenSlides()).m72042k4(abstractC3150x6, iArr, htmlOptions2, interruptionToken);
            if (z2) {
                presentation.getMasterHandoutSlideManager().removeMasterHandoutSlide();
                return;
            }
            return;
        }
        ILinkEmbedController iLinkEmbedControllerM1683x1 = htmlOptions2.m1683x1();
        C13700js c13700js5 = new C13700js();
        c13700js5.f45568h4 = 96.0f;
        c13700js5.f45563c5 = htmlOptions2.m1682kk().m69787kk();
        c13700js5.f45569jd = htmlOptions2.getDeletePicturesCroppedAreas();
        c13700js5.f45578yj.setHideInk(htmlOptions2.getInkOptions().getHideInk());
        c13700js5.f45578yj.setInterpretMaskOpAsOpacity(htmlOptions2.getInkOptions().getInterpretMaskOpAsOpacity());
        c13700js5.f45574rv = htmlOptions2.getGradientStyle();
        C14726w7 c14726w7 = new C14726w7();
        zny znyVar = new zny(c14726w7);
        String[] strArr4 = new String[presentation.getSlides().size()];
        String[] strArr5 = new String[presentation.getSlides().size()];
        C3123ar c3123ar3 = new C3123ar(abstractC3150x6, new C6783wp(true));
        new C13991ub(c3123ar3);
        List list4 = new List();
        SlideImageFormat slideImageFormatM1681k4 = htmlOptions2.m1681k4();
        int iM2743k4 = slideImageFormatM1681k4.m2743k4();
        C12015qq c12015qqClone = (htmlOptions2.getNotesCommentsLayouting().getNotesPosition() != 0 ? ((NotesSize) presentation.getNotesSize()).m2030k4() : ((SlideSize) presentation.getSlideSize()).m2755k4()).Clone();
        SVGOptions sVGOptions4 = null;
        if (iM2743k4 == 1) {
            list = list4;
            cls = IDisposable.class;
            htmlGenerator = new HtmlGenerator(c3123ar3, c12015qqClone.Clone(), 3, iArr);
            int[] iArr4 = new int[presentation.getSlides().size()];
            if (C14047bz.m66535k4(slideImageFormatM1681k4.m2746x1().m15685k4(), C3977ck.m15678dy().m15685k4())) {
                C3986m9 c3986m94 = new C3986m9(1);
                c3986m93 = c3986m94;
                cls2 = HandoutLayoutingOptions.class;
                c3986m94.m15744k4()[0] = new C3981h4(C3978du.f10783du, htmlOptions2.getJpegQuality() & 255);
                str4 = "image/jpeg";
                str5 = "jpg";
            } else {
                cls2 = HandoutLayoutingOptions.class;
                if (C14047bz.m66535k4(slideImageFormatM1681k4.m2746x1().m15685k4(), C3977ck.m15681jd().m15685k4())) {
                    str4 = "image/png";
                    str5 = "png";
                } else {
                    if (!C14047bz.m66535k4(slideImageFormatM1681k4.m2746x1().m15685k4(), C3977ck.m15676ck().m15685k4())) {
                        throw new ArgumentException("Unsupported image format");
                    }
                    str4 = "image/tiff";
                    str5 = "tif";
                }
                c3986m93 = null;
            }
            C3982jd[] c3982jdArrM15697k4 = C3982jd.m15697k4();
            String str6 = str5;
            int length = c3982jdArrM15697k4.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    c3982jd3 = null;
                    break;
                }
                c3982jd3 = c3982jdArrM15697k4[i3];
                int i4 = length;
                if (C14113y2.m67363du(c3982jd3.m15699h4(), str4)) {
                    break;
                }
                i3++;
                length = i4;
            }
            str = str4;
            c3986m9 = c3986m93;
            iArr2 = iArr4;
            str2 = str6;
            c3982jd = c3982jd3;
            c13700js = c13700js5;
            strArr = strArr5;
            vhxVarArr = null;
        } else {
            list = list4;
            cls = IDisposable.class;
            cls2 = HandoutLayoutingOptions.class;
            htmlGenerator = new HtmlGenerator(c3123ar3, new C12015qq(c12015qqClone.m56699x1() / 72.0f, c12015qqClone.m56697kk() / 72.0f).Clone(), 0, iArr);
            c13700js5.f45573m9 = true;
            vhx[] vhxVarArr3 = new vhx[presentation.getSlides().size()];
            SVGOptions sVGOptions5 = (SVGOptions) ((htmlOptions2.getSlideImageFormat() == null || ((SlideImageFormat) htmlOptions2.getSlideImageFormat()).m2744kk() == null) ? null : ((SlideImageFormat) htmlOptions2.getSlideImageFormat()).m2744kk().m2509to());
            if (sVGOptions5 == null) {
                sVGOptions = new SVGOptions();
                sVGOptions.setDefaultRegularFont(htmlOptions2.getDefaultRegularFont());
                sVGOptions.setJpegQuality(htmlOptions2.getJpegQuality() & 255);
                sVGOptions.setPicturesCompression(htmlOptions2.getPicturesCompression());
            } else {
                sVGOptions = sVGOptions5;
            }
            sVGOptions.m2507k4(iLinkEmbedControllerM1683x1);
            sVGOptions.setDeletePicturesCroppedAreas(htmlOptions2.getDeletePicturesCroppedAreas());
            str = "image/svg+xml";
            str2 = "svg";
            c13700js = c13700js5;
            strArr = strArr5;
            c3986m9 = null;
            sVGOptions4 = sVGOptions;
            vhxVarArr = vhxVarArr3;
            c3982jd = null;
            iArr2 = null;
        }
        float fM56697kk = (c12015qqClone.m56697kk() / c12015qqClone.m56699x1()) * 100.0f;
        String str7 = str2;
        C3982jd c3982jd4 = c3982jd;
        HtmlFormatter htmlFormatterM1680k4 = htmlOptions2.m1680k4(C7019kk.m27462to(Float.valueOf(fM56697kk), 13));
        C14258ow c14258owM2395wl = presentation.m2395wl();
        try {
            String[] strArr6 = strArr;
            C12210k4 c12210k43 = new C12210k4(C7134m9.class, C7131h4.class);
            try {
                EmbedAllFontsHtmlController embedAllFontsHtmlController = (EmbedAllFontsHtmlController) C7019kk.m27452k4((Object) htmlFormatterM1680k4.m1664k4(), EmbedAllFontsHtmlController.class);
                if (embedAllFontsHtmlController != null) {
                    znyVar.m74700k4(m64038k4(presentation, embedAllFontsHtmlController, iArr));
                    znyVar.m74701k4(embedAllFontsHtmlController.getControllerInternal().m73936k4());
                }
                htmlGenerator2 = htmlGenerator;
                c3123ar = c3123ar3;
                sVGOptions2 = sVGOptions4;
                str3 = str;
                cls4 = cls;
                c13700js2 = c13700js;
                strArr2 = strArr6;
                list2 = list;
                c12210k4 = c12210k43;
            } catch (Throwable th) {
                th = th;
                cls3 = cls;
            }
            try {
                m64033k4(presentation, iArr, strArr4, strArr2, iArr2, vhxVarArr, list2, str3, znyVar, c14726w7, iLinkEmbedControllerM1683x1, str7, iM2743k4, sVGOptions2, htmlOptions2);
                int i5 = iM2743k4;
                HtmlFormatter htmlFormatter2 = htmlFormatterM1680k4;
                htmlFormatter2.m1665k4(htmlGenerator2, presentation);
                dnm[] dnmVarArrM74703kk = znyVar.m74703kk();
                int length2 = dnmVarArrM74703kk.length;
                int i6 = 0;
                while (i6 < length2) {
                    znyVar.f50641ck.addItem(dnmVarArrM74703kk[i6].m5199to());
                    i6++;
                    i5 = i5;
                }
                int i7 = i5;
                if (!C7019kk.m27469x1(htmlOptions2.getSlidesLayoutOptions(), cls2)) {
                    int i8 = 0;
                    while (i8 < list2.size()) {
                        interruptionToken.throwIfInterruptionRequested();
                        int iIntValue = ((Integer) list2.get_Item(i8)).intValue();
                        int iIntValue2 = i8 > 0 ? ((Integer) list2.get_Item(i8)).intValue() : -1;
                        int i9 = i8 + 1;
                        int iIntValue3 = i9 < list2.size() ? ((Integer) list2.get_Item(i9)).intValue() : -1;
                        Slide slide2 = (Slide) presentation.getSlides().get_Item(iIntValue);
                        htmlGenerator2.m1676k4(iIntValue2, iIntValue, iIntValue3);
                        htmlFormatter2.m1666k4(htmlGenerator2, slide2);
                        htmlGenerator2.m1675k4();
                        if (strArr2[iIntValue] != null) {
                            HtmlGenerator htmlGenerator5 = htmlGenerator2;
                            i = i9;
                            strArr3 = strArr2;
                            htmlFormatter = htmlFormatter2;
                            slide = slide2;
                            C3982jd c3982jd5 = c3982jd4;
                            C3986m9 c3986m95 = c3986m9;
                            c3123ar2 = c3123ar;
                            C3152yj c3152yj = new C3152yj();
                            if (i7 != 0) {
                                iArr3 = iArr2;
                                vhxVarArr2 = vhxVarArr;
                                list3 = list2;
                                c3982jd2 = c3982jd5;
                                c3986m92 = c3986m95;
                                c13700js3 = c13700js2;
                                htmlGenerator3 = htmlGenerator5;
                                C12015qq c12015qqClone2 = ((SlideSize) presentation.getSlideSize()).m2755k4().Clone();
                                sVGOptions3 = sVGOptions2;
                                slide.m2721x6().m69379x1(new C12023wl(C7019kk.m27462to(Double.valueOf(C14116yg.m67497to(c12015qqClone2.m56699x1() * slideImageFormatM1681k4.m2745to())), 14), C7019kk.m27462to(Double.valueOf(C14116yg.m67497to(C7019kk.m27462to(Float.valueOf(c12015qqClone2.m56697kk()), 13) * slideImageFormatM1681k4.m2745to())), 14)).Clone()).m56334k4(c3152yj, c3982jd2, c3986m92);
                                iLinkEmbedControllerM1683x1.saveExternal(iArr3[iIntValue], c3152yj.toArray());
                                c3123ar2.mo13326x1(C14113y2.m67402k4("<img src=\"{0}\" class=\"slideImage\">", strArr3[iIntValue]));
                            } else {
                                if (vhxVarArr == null) {
                                    throw new NullReferenceException("Canvas couldn't be empty.");
                                }
                                try {
                                    vhx vhxVar = vhxVarArr[iIntValue];
                                    if (htmlOptions2.getNotesCommentsLayouting().getNotesPosition() != 0) {
                                        INotesSlide notesSlide = slide.getNotesSlideManager().getNotesSlide();
                                        if (notesSlide == null) {
                                            notesSlide = slide.getNotesSlideManager().addNotesSlide();
                                        }
                                        INotesSlide iNotesSlide = notesSlide;
                                        C13700js c13700js6 = c13700js2;
                                        iArr3 = iArr2;
                                        ((NotesSlide) iNotesSlide).m2034x6().m64317k4(vhxVar, new C14859ys(iNotesSlide, c12210k4, c13700js2, htmlGenerator5, htmlFormatter.m1664k4(), sVGOptions2.getShapeFormattingController()), c13700js6);
                                        vhxVarArr2 = vhxVarArr;
                                        list3 = list2;
                                        c3982jd2 = c3982jd5;
                                        i2 = iIntValue;
                                        c3986m92 = c3986m95;
                                        c13700js3 = c13700js6;
                                        htmlGenerator3 = htmlGenerator5;
                                    } else {
                                        iArr3 = iArr2;
                                        C13700js c13700js7 = c13700js2;
                                        htmlGenerator3 = htmlGenerator5;
                                        vhxVarArr2 = vhxVarArr;
                                        list3 = list2;
                                        c3986m92 = c3986m95;
                                        c13700js3 = c13700js7;
                                        c3982jd2 = c3982jd5;
                                        i2 = iIntValue;
                                        slide.m2721x6().m69374k4(vhxVar, null, new C14859ys(slide.m2721x6().m69378x1(), c12210k4, c13700js7, htmlGenerator5, htmlFormatter.m1664k4(), sVGOptions2.getShapeFormattingController()), c13700js3, interruptionToken);
                                    }
                                    vhxVar.m72276k4((AbstractC3150x6) c3152yj, true);
                                    iLinkEmbedControllerM1683x1.saveExternal(vhxVar.f49525jd, c3152yj.toArray());
                                    c3123ar2.mo13326x1(C14113y2.m67402k4("<object data=\"{0}\" type=\"image/svg+xml\"></object>", strArr3[i2]));
                                    sVGOptions3 = sVGOptions2;
                                } finally {
                                    c3152yj.dispose();
                                }
                            }
                            c3152yj.dispose();
                        } else if (i7 == 0) {
                            vhx vhxVar2 = vhxVarArr[iIntValue];
                            vhxVar2.f49521fa = true;
                            if (htmlOptions2.getNotesCommentsLayouting().getNotesPosition() != 0) {
                                INotesSlide notesSlide2 = slide2.getNotesSlideManager().getNotesSlide();
                                if (notesSlide2 == null) {
                                    notesSlide2 = slide2.getNotesSlideManager().addNotesSlide();
                                }
                                INotesSlide iNotesSlide2 = notesSlide2;
                                htmlGenerator4 = htmlGenerator2;
                                C13700js c13700js8 = c13700js2;
                                ((NotesSlide) iNotesSlide2).m2034x6().m64317k4(vhxVar2, new C14859ys(iNotesSlide2, c12210k4, c13700js2, htmlGenerator4, htmlFormatter2.m1664k4(), sVGOptions2.getShapeFormattingController()), c13700js8);
                                c13700js4 = c13700js8;
                                i = i9;
                                htmlFormatter = htmlFormatter2;
                                slide = slide2;
                            } else {
                                htmlGenerator4 = htmlGenerator2;
                                c13700js4 = c13700js2;
                                slide = slide2;
                                htmlFormatter = htmlFormatter2;
                                i = i9;
                                slide.m2721x6().m69374k4(vhxVar2, null, new C14859ys(slide2, c12210k4, c13700js4, htmlGenerator4, htmlFormatter2.m1664k4(), sVGOptions2.getShapeFormattingController()), c13700js4, interruptionToken);
                            }
                            if (vhxVar2.m72283up()) {
                                z = false;
                                vhxVar2.m72275k4(htmlGenerator4.m1677kk(), false);
                            } else {
                                z = false;
                            }
                            strArr3 = strArr2;
                            iArr3 = iArr2;
                            vhxVarArr2 = vhxVarArr;
                            list3 = list2;
                            sVGOptions3 = sVGOptions2;
                            c13700js3 = c13700js4;
                            htmlGenerator3 = htmlGenerator4;
                            c3982jd2 = c3982jd4;
                            c3986m92 = c3986m9;
                            c3123ar2 = c3123ar;
                        } else {
                            HtmlGenerator htmlGenerator6 = htmlGenerator2;
                            i = i9;
                            htmlFormatter = htmlFormatter2;
                            slide = slide2;
                            C12015qq c12015qqClone3 = ((SlideSize) presentation.getSlideSize()).m2755k4().Clone();
                            strArr3 = strArr2;
                            C12009k4 c12009k4M69379x1 = slide.m2721x6().m69379x1(new C12023wl(C7019kk.m27462to(Double.valueOf(C14116yg.m67497to(c12015qqClone3.m56699x1() * slideImageFormatM1681k4.m2745to())), 14), C7019kk.m27462to(Double.valueOf(C14116yg.m67497to(C7019kk.m27462to(Float.valueOf(c12015qqClone3.m56697kk()), 13) * slideImageFormatM1681k4.m2745to())), 14)).Clone());
                            C3982jd c3982jd6 = c3982jd4;
                            C3986m9 c3986m96 = c3986m9;
                            c3123ar2 = c3123ar;
                            m64037k4(c3123ar2, c12009k4M69379x1, c3982jd6, c3986m96);
                            iArr3 = iArr2;
                            vhxVarArr2 = vhxVarArr;
                            list3 = list2;
                            c3982jd2 = c3982jd6;
                            c3986m92 = c3986m96;
                            sVGOptions3 = sVGOptions2;
                            c13700js3 = c13700js2;
                            htmlGenerator3 = htmlGenerator6;
                        }
                        htmlFormatter2 = htmlFormatter;
                        htmlFormatter2.m1668x1(htmlGenerator3, slide);
                        htmlGenerator3.m1675k4();
                        i8 = i;
                        c3123ar = c3123ar2;
                        htmlGenerator2 = htmlGenerator3;
                        c3982jd4 = c3982jd2;
                        c3986m9 = c3986m92;
                        sVGOptions2 = sVGOptions3;
                        c13700js2 = c13700js3;
                        list2 = list3;
                        iArr2 = iArr3;
                        strArr2 = strArr3;
                        vhxVarArr = vhxVarArr2;
                    }
                }
                HtmlGenerator htmlGenerator7 = htmlGenerator2;
                C3123ar c3123ar4 = c3123ar;
                htmlFormatter2.m1667x1(htmlGenerator7, presentation);
                htmlGenerator7.m1675k4();
                c3123ar4.mo13308kk();
                Dictionary.Enumerator it = c12210k4.m56976x1().iterator();
                while (it.hasNext()) {
                    try {
                        KeyValuePair next = it.next();
                        if (presentation.m2392um().m56972k4(next.getKey())) {
                            c12210k42 = c12210k4;
                        } else {
                            ((C7131h4) next.getValue()).m27678kk().dispose();
                            c12210k42 = c12210k4;
                            c12210k42.m56977x1(next.getKey());
                        }
                        c12210k4 = c12210k42;
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) cls4)) {
                            it.dispose();
                        }
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                c12210k43 = c12210k4;
                cls3 = cls4;
                Dictionary.Enumerator it2 = c12210k43.m56976x1().iterator();
                while (it2.hasNext()) {
                    try {
                        KeyValuePair next2 = it2.next();
                        if (!presentation.m2392um().m56972k4(next2.getKey())) {
                            ((C7131h4) next2.getValue()).m27678kk().dispose();
                            c12210k43.m56977x1(next2.getKey());
                        }
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) cls3)) {
                            it2.dispose();
                        }
                    }
                }
                throw th;
            }
        } finally {
            if (c14258owM2395wl != null) {
                c14258owM2395wl.dispose();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02b8 A[Catch: all -> 0x02e1, TryCatch #0 {all -> 0x02e1, blocks: (B:81:0x02b2, B:83:0x02b8, B:85:0x02cc), top: B:100:0x02b2, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02e9 A[Catch: all -> 0x0298, TryCatch #2 {all -> 0x0298, blocks: (B:58:0x0255, B:67:0x028e, B:69:0x0294, B:76:0x02a0, B:78:0x02a6, B:79:0x02a9, B:80:0x02aa, B:89:0x02e3, B:91:0x02e9, B:92:0x02ec, B:93:0x02ed, B:95:0x02f3, B:96:0x02f6, B:81:0x02b2, B:83:0x02b8, B:85:0x02cc, B:59:0x025d, B:61:0x0263, B:63:0x0277), top: B:104:0x00ce, inners: #0, #4 }] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m64029k4(Presentation presentation, AbstractC3150x6 abstractC3150x6, int[] iArr, PdfOptions pdfOptions, final InterruptionToken interruptionToken) {
        C14322q0 c14322q0;
        Dictionary.Enumerator it;
        C10909qq c10909qq;
        C10909qq c10909qq2;
        int i;
        Slide slide;
        int[] iArr2 = iArr;
        PdfOptions pdfOptions2 = pdfOptions;
        if (pdfOptions2 == null || pdfOptions2.getProgressCallback() == null) {
            c14322q0 = null;
        } else {
            c14322q0 = new C14322q0(pdfOptions2.getProgressCallback());
            c14322q0.mo7217k4(presentation, iArr2);
        }
        C14322q0 c14322q02 = c14322q0;
        AbstractC3150x6 c3152yj = abstractC3150x6.canSeek() ? abstractC3150x6 : new C3152yj();
        C12211kk c12211kk = new C12211kk(C7134m9.class, C7131h4.class, C7019kk.m27461m9(Integer.valueOf(ExtractNativeUtils.f52517e), 9));
        C12015qq c12015qq = new C12015qq((float) C12566m9.m58654x1(((SlideSize) presentation.getSlideSize()).m2755k4().m56699x1(), 72.0d), (float) C12566m9.m58654x1(((SlideSize) presentation.getSlideSize()).m2755k4().m56697kk(), 72.0d));
        C13700js c13700js = new C13700js();
        C10920x6 c10920x6M2228x1 = pdfOptions2.m2228x1();
        c10920x6M2228x1.m52616k4(c12211kk);
        C10909qq c10909qq3 = new C10909qq(c3152yj, c10920x6M2228x1);
        c13700js.f45576up = pdfOptions2;
        int i2 = 1;
        c13700js.f45570k4 = true;
        c13700js.f45575to = pdfOptions2.getWarningCallback();
        c13700js.f45565du = pdfOptions2.getJpegQuality();
        c13700js.f45568h4 = pdfOptions2.getSufficientResolution();
        c13700js.f45566dy = pdfOptions2.getDrawSlidesFrame();
        c13700js.f45578yj.setHideInk(pdfOptions2.getInkOptions().getHideInk());
        c13700js.f45578yj.setInterpretMaskOpAsOpacity(pdfOptions2.getInkOptions().getInterpretMaskOpAsOpacity());
        c13700js.f45574rv = pdfOptions2.getGradientStyle();
        List<Integer> listM64018k4 = m64018k4(presentation, iArr2, pdfOptions2.getShowHiddenSlides());
        C14258ow c14258owM2395wl = presentation.m2395wl();
        try {
            try {
                c10909qq3.m52512x1().m52491k4(presentation.getDefaultTextStyle().getDefaultParagraphFormat().getDefaultPortionFormat().getLanguageId());
                int i3 = 0;
                if (C7019kk.m27469x1(pdfOptions2.getSlidesLayoutOptions(), HandoutLayoutingOptions.class)) {
                    MasterHandoutSlide masterHandoutSlide = (MasterHandoutSlide) presentation.getMasterHandoutSlideManager().getMasterHandoutSlide();
                    if (masterHandoutSlide == null) {
                        masterHandoutSlide = (MasterHandoutSlide) presentation.getMasterHandoutSlideManager().setDefaultMasterHandoutSlide();
                    } else {
                        i2 = 0;
                    }
                    c10909qq = c10909qq3;
                    try {
                        new C14660v1(masterHandoutSlide, (HandoutLayoutingOptions) c13700js.f45576up.getSlidesLayoutOptions(), c13700js.f45576up.getShowHiddenSlides()).m72043k4(c10909qq, iArr2, c13700js.f45576up.getSaveMetafilesAsPng(), c12211kk, c13700js, listM64018k4, interruptionToken);
                        c12211kk = c12211kk;
                        if (i2 != 0) {
                            presentation.getMasterHandoutSlideManager().removeMasterHandoutSlide();
                        }
                    } catch (Throwable th) {
                        th = th;
                        c12211kk = c12211kk;
                        it = c12211kk.m56976x1().iterator();
                        while (it.hasNext()) {
                            try {
                            } finally {
                                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                                    it.dispose();
                                }
                            }
                        }
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        }
                        throw th;
                    }
                } else {
                    c10909qq = c10909qq3;
                    int length = iArr2.length;
                    while (i3 < length) {
                        int i4 = iArr2[i3];
                        if (i4 < i2 || i4 > presentation.getSlides().size() || (slide = (Slide) presentation.getSlides().get_Item(i4 - 1)) == null || (slide.getHidden() && !pdfOptions2.getShowHiddenSlides())) {
                            c10909qq2 = c10909qq;
                            i = length;
                        } else {
                            C10948ar c10948ar = new C10948ar(c12015qq.m56699x1(), c12015qq.m56697kk());
                            c10909qq2 = c10909qq;
                            i = length;
                            C14250os c14250osM2694k4 = slide.m2694k4(pdfOptions.getSaveMetafilesAsPng(), c12211kk, c13700js, listM64018k4, interruptionToken);
                            try {
                                c10948ar.m52930k4(c14250osM2694k4.m68790jd());
                                c10909qq2.m52514x1(c10948ar, new AbstractC3174jd() { // from class: com.aspose.slides.kmn.1
                                    @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                                    public String getDelegateId() {
                                        return System.identityHashCode(interruptionToken) + "Aspose.Slides.InterruptionToken.ThrowIfInterruptionRequested()";
                                    }

                                    @Override // com.aspose.slides.internal.p085dk.AbstractC3174jd
                                    /* JADX INFO: renamed from: k4 */
                                    public void mo4791k4() {
                                        interruptionToken.throwIfInterruptionRequested();
                                    }
                                });
                                c14250osM2694k4.dispose();
                            } catch (Throwable th2) {
                                if (c14250osM2694k4 != null) {
                                    c14250osM2694k4.dispose();
                                }
                                throw th2;
                            }
                        }
                        i3++;
                        iArr2 = iArr;
                        c10909qq = c10909qq2;
                        length = i;
                        i2 = 1;
                        pdfOptions2 = pdfOptions;
                    }
                }
                C10909qq c10909qq4 = c10909qq;
                String strM67408k4 = C14113y2.m67408k4(BuildVersionInfo.Product, " ", "24.6");
                C3173h4 c3173h4M52492kk = c10909qq4.m52512x1().m52492kk();
                IDocumentProperties documentProperties = presentation.getDocumentProperties();
                c3173h4M52492kk.m13556du(strM67408k4);
                c3173h4M52492kk.m13569kk(documentProperties.getAuthor());
                c3173h4M52492kk.m13563jd(documentProperties.getCategory());
                c3173h4M52492kk.m13576x1(((DocumentProperties) documentProperties).m1347x1().Clone());
                c3173h4M52492kk.m13571m9(documentProperties.getComments());
                c3173h4M52492kk.m13566k4(strM67408k4);
                c3173h4M52492kk.m13561h4(documentProperties.getKeywords());
                c3173h4M52492kk.m13558dy(documentProperties.getLastSavedBy());
                c3173h4M52492kk.m13565k4(((DocumentProperties) documentProperties).m1345to().Clone());
                c3173h4M52492kk.m13568kk(((DocumentProperties) documentProperties).m1342kk().Clone());
                c3173h4M52492kk.m13553c5(C14057f9.m66586k4(documentProperties.getRevisionNumber(), (InterfaceC14073kp) C11697x1.m55250kk()));
                c3173h4M52492kk.m13573to(documentProperties.getSubject());
                c3173h4M52492kk.m13577x1(documentProperties.getTitle());
                c10909qq4.m52511k4();
                c3152yj.flush();
                if (c3152yj != abstractC3150x6) {
                    ((C3152yj) c3152yj).writeTo(abstractC3150x6);
                }
                if (c14322q02 != null) {
                    c14322q02.mo7216k4();
                }
                it = c12211kk.m56976x1().iterator();
                while (it.hasNext()) {
                    try {
                        KeyValuePair next = it.next();
                        if (!presentation.m2392um().m56972k4(next.getKey())) {
                            ((C7131h4) next.getValue()).m27678kk().dispose();
                            c12211kk.m56977x1(next.getKey());
                        }
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                    }
                }
            } finally {
                if (c14258owM2395wl != null) {
                    c14258owM2395wl.dispose();
                }
            }
        } catch (Throwable th3) {
            th = th3;
            it = c12211kk.m56976x1().iterator();
            while (it.hasNext()) {
                KeyValuePair next2 = it.next();
                if (!presentation.m2392um().m56972k4(next2.getKey())) {
                    ((C7131h4) next2.getValue()).m27678kk().dispose();
                    c12211kk.m56977x1(next2.getKey());
                }
            }
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                it.dispose();
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public static void m64030k4(Presentation presentation, AbstractC3150x6 abstractC3150x6, int[] iArr, SwfOptions swfOptions, final InterruptionToken interruptionToken) {
        Dictionary.Enumerator it;
        Slide slide;
        AbstractC3150x6 c3152yj = abstractC3150x6.canSeek() ? abstractC3150x6 : new C3152yj();
        C12210k4 c12210k4 = new C12210k4(C7134m9.class, C7131h4.class, 30);
        String strM67408k4 = C14113y2.m67408k4(BuildVersionInfo.Product, " ", "24.6");
        C3173h4 c3173h4 = new C3173h4();
        IDocumentProperties documentProperties = presentation.getDocumentProperties();
        c3173h4.m13556du(strM67408k4);
        c3173h4.m13569kk(documentProperties.getAuthor());
        c3173h4.m13563jd(documentProperties.getCategory());
        DocumentProperties documentProperties2 = (DocumentProperties) documentProperties;
        c3173h4.m13576x1(documentProperties2.m1347x1().Clone());
        c3173h4.m13571m9(documentProperties.getComments());
        c3173h4.m13566k4(strM67408k4);
        c3173h4.m13561h4(documentProperties.getKeywords());
        c3173h4.m13558dy(documentProperties.getLastSavedBy());
        c3173h4.m13565k4(documentProperties2.m1345to().Clone());
        c3173h4.m13568kk(documentProperties2.m1342kk().Clone());
        c3173h4.m13553c5(C14057f9.m66586k4(documentProperties.getRevisionNumber(), (InterfaceC14073kp) C11697x1.m55250kk()));
        c3173h4.m13573to(documentProperties.getSubject());
        c3173h4.m13577x1(documentProperties.getTitle());
        C6231ar c6231ar = new C6231ar(c3152yj, c3173h4, swfOptions.m2859k4());
        C13700js c13700js = new C13700js();
        int i = 1;
        c13700js.f45570k4 = true;
        c13700js.f45575to = swfOptions.getWarningCallback();
        c13700js.f45568h4 = 96.0f;
        List<Integer> listM64018k4 = m64018k4(presentation, iArr, swfOptions.getShowHiddenSlides());
        C14258ow c14258owM2395wl = presentation.m2395wl();
        try {
            try {
                int length = iArr.length;
                int i2 = 0;
                while (i2 < length) {
                    int i3 = iArr[i2];
                    if (i3 >= i && i3 <= presentation.getSlides().size() && (slide = (Slide) presentation.getSlides().get_Item(i3 - 1)) != 0 && (!slide.getHidden() || swfOptions.getShowHiddenSlides())) {
                        C10948ar c10948ar = new C10948ar(((SlideSize) presentation.getSlideSize()).m2755k4().m56699x1(), ((SlideSize) presentation.getSlideSize()).m2755k4().m56697kk());
                        c10948ar.m52930k4(slide.m2694k4(true, c12210k4, c13700js, listM64018k4, interruptionToken).m68790jd());
                        c6231ar.m25236x1(c10948ar, new AbstractC3174jd() { // from class: com.aspose.slides.kmn.2
                            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                            public String getDelegateId() {
                                return System.identityHashCode(interruptionToken) + "Aspose.Slides.InterruptionToken.ThrowIfInterruptionRequested()";
                            }

                            @Override // com.aspose.slides.internal.p085dk.AbstractC3174jd
                            /* JADX INFO: renamed from: k4 */
                            public void mo4791k4() {
                                interruptionToken.throwIfInterruptionRequested();
                            }
                        });
                    }
                    i2++;
                    i = 1;
                }
                c6231ar.m25235k4();
                c3152yj.flush();
                if (c3152yj != abstractC3150x6) {
                    ((C3152yj) c3152yj).writeTo(abstractC3150x6);
                }
                it = c12210k4.m56976x1().iterator();
                while (it.hasNext()) {
                    try {
                        KeyValuePair next = it.next();
                        if (!presentation.m2392um().m56972k4(next.getKey())) {
                            ((C7131h4) next.getValue()).m27678kk().dispose();
                            c12210k4.m56977x1(next.getKey());
                        }
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                    }
                }
            } catch (Throwable th) {
                it = c12210k4.m56976x1().iterator();
                while (it.hasNext()) {
                    try {
                        KeyValuePair next2 = it.next();
                        if (!presentation.m2392um().m56972k4(next2.getKey())) {
                            ((C7131h4) next2.getValue()).m27678kk().dispose();
                            c12210k4.m56977x1(next2.getKey());
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
                throw th;
            }
        } finally {
            if (c14258owM2395wl != null) {
                c14258owM2395wl.dispose();
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m64031k4(Presentation presentation, AbstractC3150x6 abstractC3150x6, int[] iArr, TiffOptions tiffOptions, InterruptionToken interruptionToken) {
        C0866cq.m4772k4(presentation, abstractC3150x6, iArr, tiffOptions, interruptionToken);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public static void m64032k4(Presentation presentation, AbstractC3150x6 abstractC3150x6, int[] iArr, XpsOptions xpsOptions, InterruptionToken interruptionToken) {
        Dictionary.Enumerator it;
        Slide slide;
        C12015qq c12015qq = new C12015qq((float) C12566m9.m58654x1(((SlideSize) presentation.getSlideSize()).m2755k4().m56699x1(), 72.0d), (float) C12566m9.m58654x1(((SlideSize) presentation.getSlideSize()).m2755k4().m56697kk(), 72.0d));
        C4219ne c4219ne = new C4219ne(new C3173h4(), new C4211fa());
        C12210k4 c12210k4 = new C12210k4(C7134m9.class, C7131h4.class, 4);
        C13700js c13700js = new C13700js();
        c13700js.f45570k4 = true;
        c13700js.f45575to = xpsOptions.getWarningCallback();
        c13700js.f45566dy = xpsOptions.getDrawSlidesFrame();
        c13700js.f45568h4 = 72.0f;
        c13700js.f45572ks = 2.0f;
        c13700js.f45574rv = xpsOptions.getGradientStyle();
        List<Integer> listM64018k4 = m64018k4(presentation, iArr, xpsOptions.getShowHiddenSlides());
        C14258ow c14258owM2395wl = presentation.m2395wl();
        try {
            try {
                for (int i : iArr) {
                    if (i >= 1 && i <= presentation.getSlides().size() && (slide = (Slide) presentation.getSlides().get_Item(i - 1)) != 0 && (!slide.getHidden() || xpsOptions.getShowHiddenSlides())) {
                        C10948ar c10948ar = new C10948ar(c12015qq.m56699x1(), c12015qq.m56697kk());
                        C14250os c14250osM2694k4 = slide.m2694k4(xpsOptions.getSaveMetafilesAsPng(), c12210k4, c13700js, listM64018k4, interruptionToken);
                        try {
                            c10948ar.m52930k4(c14250osM2694k4.m68790jd());
                            c4219ne.m16978k4((AbstractC10973uz) c10948ar);
                            c14250osM2694k4.dispose();
                        } catch (Throwable th) {
                            if (c14250osM2694k4 != null) {
                                c14250osM2694k4.dispose();
                            }
                            throw th;
                        }
                    }
                }
                c4219ne.m16970k4();
                c4219ne.m16980x1().mo58790k4(abstractC3150x6);
                abstractC3150x6.flush();
                it = c12210k4.m56976x1().iterator();
                while (it.hasNext()) {
                    try {
                        KeyValuePair next = it.next();
                        if (!presentation.m2392um().m56972k4(next.getKey())) {
                            ((C7131h4) next.getValue()).m27678kk().dispose();
                            c12210k4.m56977x1(next.getKey());
                        }
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                    }
                }
            } catch (Throwable th2) {
                it = c12210k4.m56976x1().iterator();
                while (it.hasNext()) {
                    try {
                        KeyValuePair next2 = it.next();
                        if (!presentation.m2392um().m56972k4(next2.getKey())) {
                            ((C7131h4) next2.getValue()).m27678kk().dispose();
                            c12210k4.m56977x1(next2.getKey());
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
                throw th2;
            }
        } finally {
            if (c14258owM2395wl != null) {
                c14258owM2395wl.dispose();
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m64033k4(Presentation presentation, int[] iArr, String[] strArr, String[] strArr2, int[] iArr2, vhx[] vhxVarArr, List<Integer> list, String str, zny znyVar, C14726w7 c14726w7, ILinkEmbedController iLinkEmbedController, String str2, int i, SVGOptions sVGOptions, HtmlOptions htmlOptions) {
        Slide slide;
        zny znyVar2;
        List<Long> listM64017k4 = m64017k4(presentation);
        int i2 = 0;
        int i3 = 0;
        while (i3 < iArr.length) {
            int i4 = iArr[i3];
            if (i4 >= 1 && i4 <= presentation.getSlides().size() && (slide = (Slide) presentation.getSlides().get_Item(iArr[i3] - 1)) != null && (!slide.getHidden() || htmlOptions.getShowHiddenSlides())) {
                znyVar.m74698k4(slide.getSlideNumber());
                IGenericEnumerator<IShape> it = slide.getShapes().iterator();
                while (it.hasNext()) {
                    try {
                        Shape shape = (Shape) it.next();
                        if (!C7019kk.m27469x1(shape, AutoShape.class) || shape.getPlaceholder() == null || (shape.getPlaceholder().getType() != 0 && shape.getPlaceholder().getType() != 2)) {
                        }
                        strArr[iArr[i3] - 1] = ((TextFrame) ((AutoShape) shape).getTextFrame()).m2901c5();
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
                int[] iArr3 = {i2};
                int iM72644k4 = c14726w7.m72644k4(iLinkEmbedController, slide, null, "slide", str, str2, iArr3);
                int i5 = iArr3[i2];
                int i6 = i5 == 0 ? 1 : i2;
                if (i6 != 0) {
                    strArr2[iArr[i3] - 1] = iLinkEmbedController.getUrl(iM72644k4, i2);
                    if (strArr2[iArr[i3] - 1] == null) {
                        i5 = 2;
                    }
                }
                if (i5 != 2) {
                    list.addItem(Integer.valueOf(iArr[i3] - 1));
                    if (i == 0) {
                        if (i6 != 0) {
                            zny znyVar3 = new zny(c14726w7);
                            znyVar3.m74700k4(znyVar.m74703kk());
                            znyVar3.f50641ck = znyVar.f50641ck;
                            znyVar2 = znyVar3;
                        } else {
                            znyVar2 = znyVar;
                        }
                        if (htmlOptions.getNotesCommentsLayouting().getNotesPosition() != 0) {
                            vhxVarArr[iArr[i3] - 1] = new vhx(C7019kk.m27462to(Float.valueOf(((NotesSize) presentation.getNotesSize()).m2030k4().m56699x1()), 13), C7019kk.m27462to(Float.valueOf(((NotesSize) presentation.getNotesSize()).m2030k4().m56697kk()), 13), 72.0f, 72.0f, 72.0f, sVGOptions, znyVar2);
                        } else {
                            vhxVarArr[iArr[i3] - 1] = new vhx(C7019kk.m27462to(Float.valueOf(((SlideSize) presentation.getSlideSize()).m2755k4().m56699x1()), 13), C7019kk.m27462to(Float.valueOf(((SlideSize) presentation.getSlideSize()).m2755k4().m56697kk()), 13), 72.0f, 72.0f, 72.0f, sVGOptions, znyVar2);
                        }
                        vhxVarArr[iArr[i3] - 1].f49518ck = listM64017k4.containsItem(Long.valueOf(slide.getSlideId())) ? iArr[i3] : -1;
                        int i7 = iArr[i3];
                        vhx vhxVar = vhxVarArr[i7 - 1];
                        if (i6 == 0) {
                            iM72644k4 = 0;
                        }
                        vhxVar.f49525jd = iM72644k4;
                        vhxVarArr[i7 - 1].f49537up = true;
                        vhxVarArr[i7 - 1].m72281to(htmlOptions.getSvgResponsiveLayout());
                    } else {
                        iArr2[iArr[i3] - 1] = iM72644k4;
                    }
                }
            }
            i3++;
            i2 = 0;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m64034k4(Slide slide, AbstractC3150x6 abstractC3150x6, ITiffOptions iTiffOptions) throws Throwable {
        C3986m9 c3986m9;
        C3982jd c3982jd = null;
        for (C3982jd c3982jd2 : C3982jd.m15697k4()) {
            if (C14113y2.m67363du(C14113y2.m67368h4(c3982jd2.m15699h4()), "image/tiff")) {
                c3982jd = c3982jd2;
            }
        }
        if (c3982jd == null) {
            throw new PptException("TIFF encoder not found.");
        }
        if (iTiffOptions.getCompressionType() != 0) {
            c3986m9 = new C3986m9(3);
            c3986m9.m15744k4()[1] = new C3981h4(C3978du.f10788kk, m64016k4(iTiffOptions.getCompressionType()));
            c3986m9.m15744k4()[2] = new C3981h4(C3978du.f10791x1, iTiffOptions.getPixelFormat());
        } else {
            c3986m9 = new C3986m9(2);
            c3986m9.m15744k4()[1] = new C3981h4(C3978du.f10791x1, iTiffOptions.getPixelFormat());
        }
        C12015qq c12015qqClone = ((SlideSize) slide.m403rv().getSlideSize()).m2755k4().Clone();
        TiffOptions tiffOptions = (TiffOptions) iTiffOptions;
        C12023wl c12023wl = new C12023wl(!tiffOptions.m3014k4().m56861k4() ? tiffOptions.m3014k4().m56865x1() : com.aspose.slides.Collections.Generic.OooO00o.OooO00o(C12566m9.m58645k4(c12015qqClone.m56699x1(), 96.0d), (iTiffOptions.getDpiX() & 4294967295L) / 96.0f, 14), !tiffOptions.m3014k4().m56861k4() ? tiffOptions.m3014k4().m56862kk() : com.aspose.slides.Collections.Generic.OooO00o.OooO00o(C12566m9.m58645k4(c12015qqClone.m56697kk(), 96.0d), (iTiffOptions.getDpiY() & 4294967295L) / 96.0f, 14));
        C12210k4 c12210k4 = new C12210k4(C7134m9.class, C7131h4.class);
        C13700js c13700js = new C13700js();
        c13700js.f45578yj.setHideInk(iTiffOptions.getInkOptions().getHideInk());
        c13700js.f45578yj.setInterpretMaskOpAsOpacity(iTiffOptions.getInkOptions().getInterpretMaskOpAsOpacity());
        c13700js.f45574rv = iTiffOptions.getGradientStyle();
        C12009k4 c12009k4M69372k4 = slide.m2721x6().m69372k4(c12023wl.Clone(), new kg7(slide, c12210k4, c13700js));
        c12009k4M69372k4.m56332k4(iTiffOptions.getDpiX() & 4294967295L, iTiffOptions.getDpiY() & 4294967295L);
        c3986m9.m15744k4()[0] = new C3981h4(C3978du.f10789m9, 18L);
        c12009k4M69372k4.m56334k4(abstractC3150x6, c3982jd, c3986m9);
        c3986m9.m15744k4()[0] = new C3981h4(C3978du.f10789m9, 20L);
        c12009k4M69372k4.m56335k4(c3986m9);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m64035k4(WebDocument webDocument, String str, IPresentation iPresentation) {
        List list = new List();
        IGenericEnumerator<T> it = iPresentation.getSlides().iterator();
        long j = 0;
        while (it.hasNext()) {
            try {
                Slide slide = (Slide) it.next();
                IGenericEnumerator<IShape> it2 = slide.getShapes().iterator();
                while (it2.hasNext()) {
                    try {
                        long[] jArr = {j};
                        m64019k4(it2.next(), webDocument, str, iPresentation, jArr);
                        j = jArr[0];
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
                if (!list.containsItem(slide.getLayoutSlide())) {
                    list.addItem(slide.getLayoutSlide());
                }
                if (!list.containsItem(slide.getLayoutSlide().getMasterSlide())) {
                    list.addItem(slide.getLayoutSlide().getMasterSlide());
                }
            } finally {
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        it = list.iterator();
        while (it.hasNext()) {
            try {
                IGenericEnumerator<IShape> it3 = ((IBaseSlide) it.next()).getShapes().iterator();
                while (it3.hasNext()) {
                    try {
                        long[] jArr2 = {j};
                        m64019k4(it3.next(), webDocument, str, iPresentation, jArr2);
                        j = jArr2[0];
                    } catch (Throwable th2) {
                        if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                            it3.dispose();
                        }
                        throw th2;
                    }
                }
                if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                    it3.dispose();
                }
            } finally {
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m64036k4(WebDocument webDocument, String str, Presentation presentation) {
        List listM3663k4 = alz.m3663k4(VideoFrame.class, presentation);
        for (int i = 0; i < listM3663k4.size(); i++) {
            Video video = (Video) C7019kk.m27452k4((Object) ((VideoFrame) listM3663k4.get_Item(i)).getEmbeddedVideo(), Video.class);
            webDocument.getOutput().bindResource(webDocument.getOutput().add(C3141rv.m13412x1(str, C14113y2.m67402k4("video{0}.{1}", Integer.valueOf(i), video.m3064to())), video), video);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m64037k4(C3123ar c3123ar, AbstractC12002ck abstractC12002ck, C3982jd c3982jd, C3986m9 c3986m9) {
        C3152yj c3152yj = new C3152yj();
        try {
            abstractC12002ck.m56334k4(c3152yj, c3982jd, c3986m9);
            c3123ar.mo13326x1(C14113y2.m67402k4("<img src=\"data:;base64,{0}\" class=\"slideImage\">", C14080ne.m66953k4(c3152yj.getBuffer(), 0, (int) c3152yj.getLength())));
        } finally {
            c3152yj.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static dnm[] m64038k4(Presentation presentation, EmbedAllFontsHtmlController embedAllFontsHtmlController, int[] iArr) {
        omk omkVar = new omk(presentation);
        try {
            dnm[] dnmVarArrM68693k4 = omkVar.m68693k4(iArr);
            omkVar.dispose();
            String[] strArrM73936k4 = embedAllFontsHtmlController.getControllerInternal().m73936k4();
            List list = new List(dnmVarArrM68693k4.length - strArrM73936k4.length);
            for (final dnm dnmVar : dnmVarArrM68693k4) {
                if (C3085sv.m13074k4((Object[]) strArrM73936k4, (AbstractC14041ai) new AbstractC14041ai<String>() { // from class: com.aspose.slides.kmn.3
                    @Override // com.aspose.slides.p559ms.System.AbstractC14041ai
                    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                    public boolean invoke(String str) {
                        return C14113y2.m67363du(str, dnmVar.m5199to());
                    }
                }) == -1) {
                    list.addItem(dnmVar);
                }
            }
            return (dnm[]) list.toArray(new dnm[0]);
        } catch (Throwable th) {
            omkVar.dispose();
            throw th;
        }
    }
}

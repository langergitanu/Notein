package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p077d8.C3099wl;
import com.aspose.slides.internal.p080dd.C3141rv;
import com.aspose.slides.internal.p080dd.C3142to;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p129fe.C3977ck;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p475wh.C12016rv;
import com.aspose.slides.internal.p500xi.AbstractC12536x1;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.google.firebase.crashlytics.internal.common.IdManager;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class jgi {
    /* JADX INFO: renamed from: k4 */
    public static C12009k4 m63305k4(IPPImage iPPImage) {
        AbstractC12536x1 abstractC12536x1M58363k4 = AbstractC12536x1.m58363k4(new C3152yj(iPPImage.getBinaryData()));
        try {
            int iMo13504m9 = abstractC12536x1M58363k4.mo13504m9();
            C12009k4 c12009k4M13178k4 = C3099wl.m13178k4(iPPImage.getBinaryData(), abstractC12536x1M58363k4.mo13502h4(), iMo13504m9);
            abstractC12536x1M58363k4.dispose();
            return c12009k4M13178k4;
        } catch (Throwable th) {
            if (abstractC12536x1M58363k4 != null) {
                abstractC12536x1M58363k4.dispose();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: x1 */
    public static <T> void m63311x1(IPPImage iPPImage, TemplateContext<T> templateContext) {
        if ("image/tiff".equals(iPPImage.getContentType())) {
            String strM13412x1 = C3141rv.m13412x1((String) templateContext.getGlobal().get("slidesPath"), C14113y2.m67408k4(m63307k4(iPPImage, templateContext), ".png"));
            String strM13400h4 = C3141rv.m13400h4(strM13412x1);
            if (!C3142to.m13421kk(strM13400h4)) {
                C3142to.m13416k4(strM13400h4);
            }
            C3152yj c3152yj = new C3152yj(iPPImage.getBinaryData());
            try {
                AbstractC12002ck abstractC12002ckM56312k4 = AbstractC12002ck.m56312k4(c3152yj);
                try {
                    abstractC12002ckM56312k4.m56340k4(strM13412x1, C3977ck.m15681jd());
                    abstractC12002ckM56312k4.dispose();
                } catch (Throwable th) {
                    if (abstractC12002ckM56312k4 != null) {
                        abstractC12002ckM56312k4.dispose();
                    }
                    throw th;
                }
            } finally {
                c3152yj.dispose();
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static C12009k4 m63306k4(Shape shape, IFillFormatEffectiveData iFillFormatEffectiveData) {
        AutoShape autoShape = (AutoShape) C7019kk.m27452k4((Object) shape, AutoShape.class);
        if (autoShape == null) {
            return null;
        }
        List list = new List();
        IGenericEnumerator<IPortion> it = autoShape.getTextFrame().getParagraphs().iterator();
        while (it.hasNext()) {
            try {
                IParagraph next = it.next();
                list.addItem(new List());
                it = next.getPortions().iterator();
                while (it.hasNext()) {
                    try {
                        IPortion next2 = it.next();
                        ((List) list.get_Item(list.size() - 1)).addItem(next2.getText());
                        next2.setText("");
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                    }
                }
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        C12009k4 c12009k4M2549e0 = autoShape.m2549e0();
        for (int i = 0; i < list.size(); i++) {
            for (int i2 = 0; i2 < ((List) list.get_Item(i)).size(); i2++) {
                autoShape.getTextFrame().getParagraphs().get_Item(i).getPortions().get_Item(i2).setText((String) ((List) list.get_Item(i)).get_Item(i2));
            }
        }
        return c12009k4M2549e0;
    }

    /* JADX INFO: renamed from: k4 */
    public static <T> String m63307k4(IPPImage iPPImage, TemplateContext<T> templateContext) {
        C3152yj c3152yj;
        byte[] array;
        if (!((Boolean) templateContext.getGlobal().get("embedImages")).booleanValue()) {
            return alz.m3667k4(templateContext.getOutput().getResourcePath(iPPImage), (String) templateContext.getGlobal().get("slidesPath"));
        }
        byte[] binaryData = iPPImage.getBinaryData();
        if (!"image/x-emf".equals(iPPImage.getContentType()) && !"image/x-wmf".equals(iPPImage.getContentType())) {
            if ("image/tiff".equals(iPPImage.getContentType())) {
                c3152yj = new C3152yj();
                try {
                    new C12009k4(((PPImage) iPPImage).m2131k4()).m56333k4(c3152yj, C3977ck.m15681jd());
                    c3152yj.flush();
                    array = c3152yj.toArray();
                } finally {
                }
            }
            return C14113y2.m67408k4("data:image/png;base64, ", C14080ne.m66952k4(binaryData));
        }
        c3152yj = new C3152yj();
        try {
            m63305k4(iPPImage).m56333k4(c3152yj, C3977ck.m15681jd());
            c3152yj.flush();
            array = c3152yj.toArray();
        } finally {
        }
        c3152yj.dispose();
        binaryData = array;
        return C14113y2.m67408k4("data:image/png;base64, ", C14080ne.m66952k4(binaryData));
    }

    /* JADX INFO: renamed from: k4 */
    public static String m63308k4(PictureFrame pictureFrame, C12016rv c12016rv) {
        String strM67400k4 = C7019kk.m27462to(Float.valueOf(pictureFrame.getRotation()), 13) != 0 ? C14113y2.m67400k4("", C14113y2.m67402k4(" rotate({0}deg)", Integer.valueOf(C7019kk.m27462to(Float.valueOf(pictureFrame.getRotation()), 13)))) : "";
        if (pictureFrame.getFrame().getFlipH() == 1) {
            strM67400k4 = C14113y2.m67400k4(strM67400k4, " scaleX(-1)");
        }
        if (pictureFrame.getFrame().getFlipV() == 1) {
            strM67400k4 = C14113y2.m67400k4(strM67400k4, " scaleY(-1)");
        }
        if (!C14113y2.m67411k4(strM67400k4)) {
            strM67400k4 = C14113y2.m67402k4("transform:{0};", strM67400k4);
        }
        return C14113y2.m67402k4("left: {0}px; top: {1}px; width: {2}px; height: {3}px;{4}", Integer.valueOf(C7019kk.m27462to(Float.valueOf(pictureFrame.getX()), 13)), Integer.valueOf(C7019kk.m27462to(Float.valueOf(pictureFrame.getY()), 13)), Integer.valueOf(C7019kk.m27462to(Float.valueOf(pictureFrame.getWidth()), 13)), Integer.valueOf(C7019kk.m27462to(Float.valueOf(pictureFrame.getHeight()), 13)), strM67400k4);
    }

    /* JADX INFO: renamed from: k4 */
    public static String m63309k4(PictureFrame pictureFrame, String str) {
        IGenericEnumerator<IImageTransformOperation> it = pictureFrame.getPictureFormat().getPicture().getImageTransform().iterator();
        String strM67402k4 = "";
        while (it.hasNext()) {
            try {
                IImageTransformOperation next = it.next();
                if (C14067j2.m66727k4(next) == C7019kk.m27443k4((Class<?>) ColorChange.class)) {
                    ColorChange colorChange = (ColorChange) next;
                    int i = 0;
                    String strM67400k4 = "";
                    String strM67400k42 = strM67400k4;
                    String strM67400k43 = strM67400k42;
                    while (i < 256) {
                        String str2 = "0 ";
                        strM67400k4 = C14113y2.m67400k4(strM67400k4, i == (colorChange.getFromColor().getR() & 255) ? "1 " : "0 ");
                        strM67400k42 = C14113y2.m67400k4(strM67400k42, i == (colorChange.getFromColor().getG() & 255) ? "1 " : "0 ");
                        if (i == (colorChange.getFromColor().getB() & 255)) {
                            str2 = "1 ";
                        }
                        strM67400k43 = C14113y2.m67400k4(strM67400k43, str2);
                        i++;
                    }
                    strM67402k4 = C14113y2.m67402k4(C14113y2.m67408k4("<svg width=\"{3}\" height=\"{4}\" viewBox=\"0 0 {3} {4}\">", "<defs>", "<filter id=\"{5}\" color-interpolation-filters=\"sRGB\">", "<feComponentTransfer>", "<feFuncR type=\"discrete\" tableValues=\"{0}\"></feFuncR>", "<feFuncG type=\"discrete\" tableValues=\"{1}\"></feFuncG>", "<feFuncB type=\"discrete\" tableValues=\"{2}\"></feFuncB>", "</feComponentTransfer>", "<feColorMatrix type=\"matrix\" values=\"1 0 0 0 0 0 1 0 0 0 0 0 1 0 0 1 1 1 1 -3\" result=\"selectedColor\"></feColorMatrix>", "<feComposite operator=\"out\" in=\"SourceGraphic\" result=\"notSelectedColor\"></feComposite>", "<feFlood flood-color=\"{6}\" flood-opacity=\"{7}\"></feFlood>", "<feComposite operator=\"in\" in2=\"selectedColor\"></feComposite>", "<feComposite operator=\"over\" in2=\"notSelectedColor\"></feComposite>", "</filter>", "</defs>", "</svg>"), C14113y2.m67440x1(strM67400k4), C14113y2.m67440x1(strM67400k42), C14113y2.m67440x1(strM67400k43), Integer.valueOf(C7019kk.m27462to(Float.valueOf(pictureFrame.getWidth()), 13)), Integer.valueOf(C7019kk.m27462to(Float.valueOf(pictureFrame.getHeight()), 13)), str, C14113y2.m67402k4("#{0:X2}{1:X2}{2:X2}", Byte.valueOf(colorChange.getToColor().getR()), Byte.valueOf(colorChange.getToColor().getG()), Byte.valueOf(colorChange.getToColor().getB())), C14064he.m66712k4((((ColorFormat) colorChange.getToColor()).m1084to().m56501c5() & 255) / 255.0f, IdManager.DEFAULT_VERSION_NAME, C11697x1.m55250kk()));
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
        return strM67402k4;
    }

    /* JADX INFO: renamed from: k4 */
    public static String m63310k4(String str, float f, float f2, float f3, float f4) {
        if (f == 0.0f && f2 == 0.0f && f3 == 0.0f && f4 == 0.0f) {
            return str;
        }
        if (!C14113y2.m67448x1(str, "data:image/png;base64, ")) {
            throw new NotImplementedException();
        }
        AbstractC12002ck abstractC12002ckM56312k4 = AbstractC12002ck.m56312k4(new C3152yj(C14080ne.m66934jd(C14113y2.m67422kk(str, 23))));
        C12014ne c12014ne = new C12014ne(C7019kk.m27462to(Float.valueOf((abstractC12002ckM56312k4.mo15760yj() * f) / 100.0f), 13), C7019kk.m27462to(Float.valueOf((abstractC12002ckM56312k4.mo15757m9() * f2) / 100.0f), 13), C7019kk.m27462to(Float.valueOf((((100.0f - f) - f3) * abstractC12002ckM56312k4.mo15760yj()) / 100.0f), 13), C7019kk.m27462to(Float.valueOf((((100.0f - f2) - f4) * abstractC12002ckM56312k4.mo15757m9()) / 100.0f), 13));
        C12014ne c12014ne2 = new C12014ne(0, 0, c12014ne.m56663c5(), c12014ne.m56683x1());
        C12009k4 c12009k4 = new C12009k4(c12014ne2.m56663c5(), c12014ne2.m56683x1());
        AbstractC12008jd abstractC12008jdM56582k4 = AbstractC12008jd.m56582k4((AbstractC12002ck) c12009k4);
        try {
            abstractC12008jdM56582k4.mo17560kk(7);
            abstractC12008jdM56582k4.mo17481h4(4);
            abstractC12008jdM56582k4.mo17512k4(abstractC12002ckM56312k4, c12014ne2.Clone(), c12014ne.Clone(), 2);
            abstractC12008jdM56582k4.mo17559kk();
            abstractC12008jdM56582k4.dispose();
            C3152yj c3152yj = new C3152yj();
            c12009k4.m56333k4(c3152yj, C3977ck.m15681jd());
            return C14113y2.m67402k4("{1}{0}", C14080ne.m66952k4(c3152yj.toArray()), "data:image/png;base64, ");
        } catch (Throwable th) {
            if (abstractC12008jdM56582k4 != null) {
                abstractC12008jdM56582k4.dispose();
            }
            throw th;
        }
    }
}

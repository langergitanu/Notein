package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p077d8.C3038bv;
import com.aspose.slides.internal.p077d8.C3041c6;
import com.aspose.slides.internal.p077d8.C3052g8;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p077d8.C3092um;
import com.aspose.slides.internal.p077d8.C3095v4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14114y9;
import com.aspose.slides.p559ms.System.IDisposable;
import com.facebook.common.callercontext.ContextChain;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;
import com.microsoft.identity.common.java.platform.AbstractDevicePopManager;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class ov2 {
    /* JADX INFO: renamed from: k4 */
    private static com.aspose.slides.internal.p332p7.lzc m68880k4(pkv pkvVar) {
        com.aspose.slides.internal.p332p7.lzc lzcVarM69128k4 = pkvVar.m69128k4("gr", 9);
        com.aspose.slides.internal.p332p7.mdp mdpVar = (com.aspose.slides.internal.p332p7.mdp) lzcVarM69128k4.m36545k4("paragraph-properties").m29542x1();
        mdpVar.m36872k4((byte) 1);
        mdpVar.m36883to(1);
        com.aspose.slides.internal.p332p7.rsv rsvVar = (com.aspose.slides.internal.p332p7.rsv) lzcVarM69128k4.m36545k4("graphic-properties").m29542x1();
        rsvVar.m40499to(1);
        rsvVar.m40503u4("0.05in");
        rsvVar.m40509uz("0.05in");
        rsvVar.m40513wl("0.1in");
        rsvVar.m40495qq("0.1in");
        rsvVar.m40519x1(2);
        rsvVar.m40484kk(2);
        rsvVar.m40472h4(1);
        rsvVar.m40480k4(1);
        rsvVar.m40479k4((byte) 1);
        rsvVar.m40518x1((byte) 1);
        rsvVar.m40475ix("position size");
        rsvVar.m40483kk((byte) 0);
        return lzcVarM69128k4;
    }

    /* JADX INFO: renamed from: kk */
    private static com.aspose.slides.internal.p332p7.lzc m68884kk(pkv pkvVar) {
        com.aspose.slides.internal.p332p7.lzc lzcVarM69128k4 = pkvVar.m69128k4("P", 1);
        com.aspose.slides.internal.p332p7.zob zobVar = (com.aspose.slides.internal.p332p7.zob) lzcVarM69128k4.m36545k4("text-properties").m29542x1();
        zobVar.m45812k4(1);
        zobVar.m45831x1(1);
        zobVar.m45813k4("#ff9999");
        zobVar.m45824to("none");
        zobVar.m45815kk(1);
        zobVar.m45832x1("auto");
        zobVar.m45816kk("font-color");
        zobVar.m45798du("0% 100");
        zobVar.m45806h4("Calibri");
        zobVar.m45793c5("0.4in");
        zobVar.m45809jd("0in");
        zobVar.m45795ck(TranslateLanguage.ENGLISH);
        zobVar.m45803fa(AbstractDevicePopManager.CertificateProperties.COUNTRY);
        zobVar.m45797du(1);
        zobVar.m45827up("0.04in 0in 0pc #000000");
        zobVar.m45819m9(1);
        zobVar.m45800dy(1);
        zobVar.m45792c5(2);
        zobVar.m45830x1((byte) 1);
        return lzcVarM69128k4;
    }

    /* JADX INFO: renamed from: x1 */
    private static com.aspose.slides.internal.p332p7.lzc m68886x1(pkv pkvVar) {
        com.aspose.slides.internal.p332p7.lzc lzcVarM69128k4 = pkvVar.m69128k4("P", 2);
        com.aspose.slides.internal.p332p7.mdp mdpVar = (com.aspose.slides.internal.p332p7.mdp) lzcVarM69128k4.m36545k4("paragraph-properties").m29542x1();
        mdpVar.m36889x1("150%");
        mdpVar.m36873k4(5);
        mdpVar.m36876kk("1in");
        mdpVar.m36860du("0in");
        mdpVar.m36860du("0in");
        mdpVar.m36862dy("0in");
        mdpVar.m36884to("0in");
        mdpVar.m36888x1(2);
        mdpVar.m36875kk(4);
        mdpVar.m36883to(1);
        return lzcVarM69128k4;
    }

    /* JADX INFO: renamed from: k4 */
    public static void m68881k4(IShapeCollection iShapeCollection, C7394ca.k4 k4Var, pkv pkvVar) {
        if (iShapeCollection == null) {
            throw new ArgumentNullException("shapeCollection");
        }
        if (k4Var == null) {
            throw new ArgumentNullException("addShapeDelegate");
        }
        IGenericEnumerator<IShape> it = iShapeCollection.iterator();
        while (it.hasNext()) {
            try {
                IShape next = it.next();
                pkvVar.m69130x1().m2044c5().throwIfInterruptionRequested();
                xky.m73463k4(next, k4Var, pkvVar);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: kk */
    private static void m68885kk(Slide slide, com.aspose.slides.internal.p332p7.fre freVar, pkv pkvVar) {
        String[][] strArr = {null};
        byte[][] bArr = {null};
        int[] iArrM2334k4 = Presentation.m2334k4((ctm) ((Presentation) slide.getPresentation()).m2399x6(), bArr);
        byte[] bArr2 = bArr[0];
        strArr[0] = C3038bv.m12798to();
        if (Arrays.equals(iArrM2334k4, r1s.f48531x1) && bArr2 != null && bArr2.length > 0) {
            strArr[0] = C14113y2.m67417k4(Presentation.m2325k4(bArr2), new String[]{IOUtils.LINE_SEPARATOR_WINDOWS, IOUtils.LINE_SEPARATOR_UNIX, "\r", "\n\r"}, 0);
        }
        int[] iArrM12821x1 = C3052g8.f9069k4;
        if (C3041c6.m12821x1() == C3052g8.f9070x1) {
            try {
                C3041c6.m12809k4().m12825to();
                iArrM12821x1 = C3041c6.m12821x1();
            } catch (IllegalStateException e) {
                int[] iArr = C3052g8.f9069k4;
                C3085sv.m13082k4(e);
                iArrM12821x1 = iArr;
            }
        }
        String[] strArr2 = strArr[0];
        if ((Arrays.equals(C3038bv.m12793k4(), C3095v4.f9211x1) && C3092um.m13135k4() != null && (C3092um.m13135k4() instanceof C3038bv)) || Arrays.equals(iArrM2334k4, r1s.f48530kk) || Arrays.equals(iArrM12821x1, C3052g8.f9070x1)) {
            return;
        }
        C12015qq c12015qqClone = ((SlideSize) slide.getPresentation().getSlideSize()).m2755k4().Clone();
        double dM56699x1 = ((double) (c12015qqClone.m56699x1() - 504.8f)) / 2.0d;
        double dM56697kk = ((double) (c12015qqClone.m56697kk() - 123.6f)) / 2.0d;
        com.aspose.slides.internal.p332p7.vtn vtnVar = (com.aspose.slides.internal.p332p7.vtn) freVar.m32036k4("frame").m29542x1();
        vtnVar.m43310x1(m68880k4(pkvVar).m36546k4());
        vtnVar.m43295h4(wgi.m72717k4(dM56699x1));
        vtnVar.m43304m9(wgi.m72717k4(dM56697kk));
        vtnVar.m43292dy("7in");
        vtnVar.m43287c5("1.7in");
        m68883k4(strArr2, (com.aspose.slides.internal.p332p7.pb4) vtnVar.m43297k4("text-box").m29542x1(), pkvVar);
    }

    /* JADX INFO: renamed from: x1 */
    private static void m68887x1(Slide slide, com.aspose.slides.internal.p332p7.fre freVar, pkv pkvVar) {
        if (C14113y2.m67411k4(slide.getName())) {
            slide.setName(C14113y2.m67408k4("Slide_", C14114y9.m67465x1(slide.m2708ne().m5309to())));
        }
        freVar.m32044x1(slide.getName());
        freVar.m32032du(C14113y2.m67402k4("Slide-{0}", Long.valueOf(slide.getSlideId())));
        freVar.m32042to(C14113y2.m67408k4(slide.m2713v4().getName(), CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR, slide.m2687bv().getName()));
        com.aspose.slides.internal.p332p7.lzc lzcVarM69128k4 = pkvVar.m69128k4("gp", 11);
        freVar.m32039kk(lzcVarM69128k4.m36546k4());
        com.aspose.slides.internal.p332p7.nk7 nk7Var = (com.aspose.slides.internal.p332p7.nk7) lzcVarM69128k4.m36545k4("drawing-page-properties").m29542x1();
        nk7Var.m37633du((byte) 0);
        nk7Var.m37639h4((byte) 0);
        nk7Var.m37655to((byte) 0);
        nk7Var.m37647kk((byte) 0);
        nk7Var.m37643k4(wgi.m72707k4(slide.getShowMasterShapes()));
        if (slide.getHidden()) {
            nk7Var.m37656to(2);
        }
        Background background = (Background) slide.getBackground();
        if (background.getType() == -1 && slide.getLayoutSlide() != null) {
            background = (Background) slide.getLayoutSlide().getBackground();
            if (background.getType() == -1 && slide.getLayoutSlide().getMasterSlide() != null) {
                background = (Background) slide.getLayoutSlide().getMasterSlide().getBackground();
            }
        }
        if (background.getType() != 1 || background.getFillFormat().getFillType() != 0) {
            C14909zq.m74729k4(background.getEffective().getFillFormat(), new jlf(nk7Var), pkvVar.m69130x1());
        } else {
            nk7Var.m37644k4(3);
            nk7Var.m37649kk(C14113y2.f47374k4);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m68882k4(Slide slide, final com.aspose.slides.internal.p332p7.fre freVar, pkv pkvVar) {
        if (slide == null) {
            throw new ArgumentNullException("slide");
        }
        if (freVar == null) {
            throw new ArgumentNullException("pageElementData");
        }
        m68887x1(slide, freVar, pkvVar);
        IGenericEnumerator<IShape> it = slide.getShapes().iterator();
        while (it.hasNext()) {
            try {
                IShape next = it.next();
                pkvVar.m69130x1().m2044c5().throwIfInterruptionRequested();
                xky.m73463k4(next, new C7394ca.k4() { // from class: com.aspose.slides.ov2.1
                    @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                    public String getDelegateId() {
                        return System.identityHashCode(freVar) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.odfdraw_CT_PageElementData.AddShape(System.String)";
                    }

                    @Override // com.aspose.slides.internal.p332p7.C7394ca.k4
                    /* JADX INFO: renamed from: k4 */
                    public C7394ca mo2788k4(String str) {
                        return freVar.m32036k4(str);
                    }
                }, pkvVar);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        m68885kk(slide, freVar, pkvVar);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m68883k4(String[] strArr, com.aspose.slides.internal.p332p7.pb4 pb4Var, pkv pkvVar) {
        com.aspose.slides.internal.p332p7.lzc lzcVarM68886x1 = m68886x1(pkvVar);
        com.aspose.slides.internal.p332p7.lzc lzcVarM68884kk = m68884kk(pkvVar);
        for (String str : strArr) {
            com.aspose.slides.internal.p332p7.ok7 ok7Var = (com.aspose.slides.internal.p332p7.ok7) pb4Var.m38780k4(ContextChain.TAG_PRODUCT).m29542x1();
            ok7Var.m38329x1(lzcVarM68886x1.m36546k4());
            com.aspose.slides.internal.p332p7.omk omkVar = (com.aspose.slides.internal.p332p7.omk) ok7Var.m38325k4(C14113y2.m67408k4("text:", "span")).m29542x1();
            omkVar.m38372x1(lzcVarM68884kk.m36546k4());
            omkVar.m38369k4("_TEXT").m29540k4(str);
        }
    }
}

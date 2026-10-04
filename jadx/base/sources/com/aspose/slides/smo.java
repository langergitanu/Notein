package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC8917u4;
import com.aspose.slides.internal.p332p7.C7281az;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.internal.p332p7.dti;
import com.aspose.slides.internal.p332p7.gc6;
import com.aspose.slides.internal.p332p7.hyf;
import com.aspose.slides.internal.p464vq.C11709bg;
import com.aspose.slides.internal.p464vq.C11779my;
import com.aspose.slides.internal.p464vq.C11785nh;
import com.aspose.slides.internal.p464vq.C11791os;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.C13981tl;
import com.aspose.slides.p559ms.System.Xml.XmlDocument;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class smo extends ywb {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f48884x1 = new C7017h4("shapelayout", "shapetype", "shape", "xml", "group");

    /* JADX INFO: renamed from: k4 */
    private Dictionary<String, String> f48885k4;

    public smo(C11791os c11791os, gnb gnbVar) {
        super(c11791os, gnbVar);
    }

    /* JADX INFO: renamed from: k4 */
    private static Dictionary<String, String> m70679k4(C11791os c11791os) {
        XmlDocument xmlDocument = new XmlDocument();
        C3152yj c3152yjM55417h4 = c11791os.m55417h4();
        try {
            xmlDocument.load(c3152yjM55417h4);
            Dictionary<String, String> dictionary = new Dictionary<>();
            m70681k4(dictionary, xmlDocument.getDocumentElement());
            return dictionary;
        } finally {
            if (c3152yjM55417h4 != null) {
                c3152yjM55417h4.dispose();
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    private void m70689x1(IBaseSlide iBaseSlide, bjs bjsVar) {
        ISlideComponent iSlideComponent;
        dti dtiVar = new dti(m55443jd());
        try {
            String strMo29890k4 = dtiVar.mo29890k4();
            if (strMo29890k4 == null) {
                strMo29890k4 = "";
            }
            String strM30639u4 = dtiVar.m30639u4();
            if (strM30639u4 == null) {
                strM30639u4 = "";
            }
            String strM67422kk = null;
            if ("".equals(strMo29890k4)) {
                iSlideComponent = null;
            } else {
                ISlideComponent[] iSlideComponentArr = {null};
                bjsVar.m4237to().tryGetValue(strMo29890k4, iSlideComponentArr);
                iSlideComponent = iSlideComponentArr[0];
            }
            if (iSlideComponent == null && !"".equals(strM30639u4)) {
                ISlideComponent[] iSlideComponentArr2 = {iSlideComponent};
                bjsVar.m4237to().tryGetValue(strM30639u4, iSlideComponentArr2);
                iSlideComponent = iSlideComponentArr2[0];
                if (iSlideComponent == null && C14113y2.m67448x1(strM30639u4, "_x")) {
                    int i = 2;
                    while (i < strM30639u4.length() && strM30639u4.charAt(i) >= '0' && strM30639u4.charAt(i) <= '9') {
                        i++;
                    }
                    int i2 = i + 2;
                    if (i2 != strM30639u4.length() && strM30639u4.charAt(i) == '_' && strM30639u4.charAt(i + 1) == 's') {
                        strM67422kk = C14113y2.m67422kk(strM30639u4, i2);
                        iSlideComponentArr2[0] = iSlideComponent;
                        bjsVar.m4237to().tryGetValue(strM67422kk, iSlideComponentArr2);
                        iSlideComponent = iSlideComponentArr2[0];
                    }
                }
            }
            if (iSlideComponent == null && (!"".equals(strMo29890k4) || !"".equals(strM30639u4))) {
                if (this.f48885k4 == null) {
                    this.f48885k4 = m70679k4(bjsVar.m4238x1());
                }
                if (this.f48885k4.containsKey(strMo29890k4) || this.f48885k4.containsKey(strM30639u4)) {
                    return;
                }
                if (strM67422kk != null && this.f48885k4.containsKey(strM67422kk)) {
                    return;
                }
            }
            if (iSlideComponent != null && !C7019kk.m27469x1(iSlideComponent, IShape.class)) {
                m70684k4((IControl) iSlideComponent, dtiVar, mo3471m9());
                return;
            }
            m70683k4(iBaseSlide, (IShape) iSlideComponent, dtiVar, mo3471m9());
        } catch (RuntimeException e) {
            C3085sv.m13082k4(e);
        }
    }

    public smo(C11791os c11791os, u8s u8sVar) {
        super(c11791os, u8sVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    private LegacyDiagram m70680k4(bjs bjsVar) {
        ISlideComponent iSlideComponent;
        C11709bg c11709bg;
        com.aspose.slides.internal.p332p7.l3s l3sVar = new com.aspose.slides.internal.p332p7.l3s(m55443jd());
        String strMo29890k4 = l3sVar.mo29890k4();
        String strM35891u4 = l3sVar.m35891u4();
        if (C14113y2.m67411k4(strMo29890k4)) {
            iSlideComponent = null;
        } else {
            ISlideComponent[] iSlideComponentArr = {null};
            bjsVar.m4237to().tryGetValue(strMo29890k4, iSlideComponentArr);
            iSlideComponent = iSlideComponentArr[0];
        }
        if (iSlideComponent == null && !C14113y2.m67411k4(strM35891u4)) {
            ISlideComponent[] iSlideComponentArr2 = {iSlideComponent};
            bjsVar.m4237to().tryGetValue(strM35891u4, iSlideComponentArr2);
            iSlideComponent = iSlideComponentArr2[0];
        }
        LegacyDiagram legacyDiagram = (LegacyDiagram) C7019kk.m27452k4((Object) iSlideComponent, LegacyDiagram.class);
        if (legacyDiagram != null) {
            nml nmlVarMo272to = legacyDiagram.mo272to();
            nmlVarMo272to.m68093k4(l3sVar);
            List list = new List();
            m70688k4(l3sVar, (List<com.aspose.slides.internal.p332p7.ai5>) list);
            if (list.size() > 0) {
                C11709bg[] c11709bgArrM55309k4 = bjsVar.m4229k4().m55338u4().m55309k4(C11779my.f39790k4);
                List.Enumerator it = list.iterator();
                while (it.hasNext()) {
                    try {
                        com.aspose.slides.internal.p332p7.ai5 ai5Var = (com.aspose.slides.internal.p332p7.ai5) it.next();
                        int length = c11709bgArrM55309k4.length;
                        int i = 0;
                        while (true) {
                            if (i >= length) {
                                c11709bg = null;
                                break;
                            }
                            c11709bg = c11709bgArrM55309k4[i];
                            if (C14113y2.m67363du(ai5Var.m28265k4(), c11709bg.m55289du())) {
                                break;
                            }
                            i++;
                        }
                        if (c11709bg != null) {
                            nmlVarMo272to.m68097x1().addItem(ai5Var, c11709bg.m55296x1().m55426to());
                            c11709bg.m55296x1().m55422k4(true);
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
                    return legacyDiagram;
                }
            }
        }
        return legacyDiagram;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    private static void m70681k4(Dictionary<String, String> dictionary, C13981tl c13981tl) {
        String strM65912to = c13981tl.m65912to("spid", "");
        if (!C14113y2.m67411k4(strM65912to)) {
            dictionary.set_Item(strM65912to, strM65912to);
            return;
        }
        IEnumerator it = c13981tl.getChildNodes().iterator();
        while (it.hasNext()) {
            try {
                C13981tl c13981tl2 = (C13981tl) C7019kk.m27452k4(it.next(), C13981tl.class);
                if (c13981tl2 != null) {
                    m70681k4(dictionary, c13981tl2);
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) it).dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m70682k4(Control control, int i, C3059ii c3059ii, sdp sdpVar) {
        dti dtiVar = new dti();
        dtiVar.mo29906x1(control.getName());
        dtiVar.mo29902to(C14113y2.m67402k4("_x0000_s{0:D4}", Integer.valueOf(i)));
        dtiVar.mo30634ck(C14113y2.m67408k4("#", "_x0000_t75"));
        yw9.m74122k4(dtiVar, control.getFrame());
        o9y.m68422k4(dtiVar, control.getSubstitutePictureFormat().getPicture().getImage(), sdpVar);
        dtiVar.mo6846k4("v", c3059ii, "shape");
    }

    /* JADX INFO: renamed from: k4 */
    private static void m70683k4(IBaseSlide iBaseSlide, IShape iShape, dti dtiVar, gnb gnbVar) {
        if (iShape != null) {
            if (C7019kk.m27469x1(iShape, IOleObjectFrame.class)) {
                OleObjectFrame oleObjectFrame = (OleObjectFrame) iShape;
                if (C14064he.m66715kk(oleObjectFrame.getRawFrame().getX())) {
                    yw9.m74121k4(iShape, dtiVar.mo29904x1());
                }
                C14273pb.m68995k4(iShape.getFillFormat(), iShape.getLineFormat(), dtiVar, false, false, gnbVar);
                o9y.m68421k4((PictureFillFormat) oleObjectFrame.getSubstitutePictureFormat(), dtiVar, gnbVar);
                oleObjectFrame.mo268du().m71909k4((com.aspose.slides.internal.p332p7.qaz) dtiVar.m42084k4("recolorinfo"));
                return;
            }
            return;
        }
        List.Enumerator<C7394ca> it = dtiVar.mo29877c5().iterator();
        while (it.hasNext()) {
            try {
                if ("ClientData".equals(it.next().m29539k4())) {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                        return;
                    }
                    return;
                }
            } finally {
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        ShapeCollection shapeCollection = (ShapeCollection) iBaseSlide.getShapes();
        boolean[] zArr = {false};
        IPPImage iPPImageM68416k4 = o9y.m68416k4(iBaseSlide, dtiVar, gnbVar, zArr);
        boolean z = zArr[0];
        if (iPPImageM68416k4 != null) {
            PictureFrame pictureFrameM2653x6 = shapeCollection.m2653x6();
            pictureFrameM2653x6.getPictureFormat().getPicture().setImage(iPPImageM68416k4);
            pictureFrameM2653x6.getPictureFormat().setPictureFillMode(1);
            pictureFrameM2653x6.setShapeType(5);
            if (z) {
                iBaseSlide.getShapes().reorder(0, pictureFrameM2653x6);
            }
            yw9.m74121k4(pictureFrameM2653x6, dtiVar.mo29904x1());
            o9y.m68420k4((PictureFillFormat) pictureFrameM2653x6.getPictureFormat(), dtiVar);
            return;
        }
        AutoShape autoShapeM2615fa = shapeCollection.m2615fa();
        autoShapeM2615fa.setShapeType(5);
        IShapeStyle shapeStyle = autoShapeM2615fa.getShapeStyle();
        if (shapeStyle != null) {
            shapeStyle.setLineStyleIndex(0);
            shapeStyle.setFillStyleIndex((short) 0);
            shapeStyle.setEffectStyleIndex(0L);
            shapeStyle.setFontCollectionIndex((byte) 0);
        }
        yw9.m74121k4(autoShapeM2615fa, dtiVar.mo29904x1());
        if (!"_x0000_t75".equals(C14113y2.m67422kk(dtiVar.mo30641x6(), 1))) {
            C14273pb.m68993k4(autoShapeM2615fa.getFillFormat(), autoShapeM2615fa.getLineFormat(), dtiVar, gnbVar);
        } else {
            autoShapeM2615fa.getFillFormat().setFillType((byte) 0);
            autoShapeM2615fa.getLineFormat().getFillFormat().setFillType((byte) 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m70690k4(IBaseSlide iBaseSlide, bjs bjsVar) {
        mo3469k4(new String[0]);
        this.f48885k4 = null;
        List list = new List();
        while (m55443jd().mo65026h4()) {
            while (true) {
                if (m55443jd().mo65028jd() == 1) {
                    int iM27428k4 = f48884x1.m27428k4(m55443jd().mo65023fa());
                    if (iM27428k4 != 0 && iM27428k4 != 1) {
                        if (iM27428k4 == 2) {
                            m70689x1(iBaseSlide, bjsVar);
                            break;
                        } else {
                            if (iM27428k4 == 3) {
                                break;
                            }
                            if (iM27428k4 == 4) {
                                LegacyDiagram legacyDiagramM70680k4 = m70680k4(bjsVar);
                                if (legacyDiagramM70680k4 != null) {
                                    list.addItem(legacyDiagramM70680k4);
                                }
                            }
                        }
                    } else {
                        m55443jd().mo65208bv();
                        if (m55443jd().mo65015ar()) {
                            break;
                        }
                    }
                } else {
                    break;
                }
            }
        }
        List list2 = new List();
        List.Enumerator it = list.iterator();
        while (it.hasNext()) {
            try {
                list2.addItem(((LegacyDiagram) it.next()).mo272to().m68092k4());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        it = list.iterator();
        while (it.hasNext()) {
            try {
                LegacyDiagram legacyDiagram = (LegacyDiagram) it.next();
                C0861cn.m4673k4(legacyDiagram.m1858kk(), legacyDiagram.mo272to().m68092k4(), list2, bjsVar.m4229k4());
                C12007ix c12007ixClone = legacyDiagram.m1858kk().m1653up().Clone();
                legacyDiagram.m1858kk().m1647k4(new tbp(c12007ixClone.m56557jd(), c12007ixClone.m56551ck()));
                legacyDiagram.m1858kk().m1654x1(new tbp(c12007ixClone.m56550c5(), c12007ixClone.m56575x1()));
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        mo55330fa();
    }

    /* JADX INFO: renamed from: k4 */
    private static void m70684k4(IControl iControl, dti dtiVar, gnb gnbVar) {
        yw9.m74120k4(iControl, dtiVar.mo29904x1());
        o9y.m68421k4((PictureFillFormat) iControl.getSubstitutePictureFormat(), dtiVar, gnbVar);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m70685k4(LegacyDiagram legacyDiagram, int i, C3059ii c3059ii, sdp sdpVar) {
        C11791os c11791osM70584m9 = sdpVar.m70584m9();
        nml nmlVarMo272to = legacyDiagram.mo272to();
        C11785nh c11785nhMo4812qm = sdpVar.m70580k4().mo4812qm();
        Dictionary.Enumerator<com.aspose.slides.internal.p332p7.q0e, C11791os> it = nmlVarMo272to.m68097x1().iterator();
        while (it.hasNext()) {
            try {
                KeyValuePair next = it.next();
                ((com.aspose.slides.internal.p332p7.ai5) next.getKey()).m28266k4(c11791osM70584m9.m55377up().m55311x1(c11785nhMo4812qm.m55395k4(C14113y2.m67402k4("/ppt/drawings/legacyDiagramText{0}.bin", Integer.valueOf(sdpVar.m70580k4().m71555rv())), null, new C11779my(), (byte[]) next.getValue())).m55289du());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        it = nmlVarMo272to.m68096to().iterator();
        while (it.hasNext()) {
            try {
                KeyValuePair next2 = it.next();
                ((com.aspose.slides.internal.p332p7.q0e) next2.getKey()).m39257jd(c11791osM70584m9.m55377up().m55311x1((C11791os) next2.getValue()).m55289du());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        nmlVarMo272to.m68092k4().mo29906x1(C14113y2.m67402k4("_x0000_s{0:D4}", Integer.valueOf(i)));
        nmlVarMo272to.m68092k4().mo6846k4("v", c3059ii, "group");
    }

    /* JADX INFO: renamed from: k4 */
    private static void m70686k4(OleObjectFrame oleObjectFrame, int i, C3059ii c3059ii, sdp sdpVar) {
        dti dtiVar = new dti();
        dtiVar.mo29906x1(C14113y2.m67402k4("_x0000_s{0:D4}", Integer.valueOf(i)));
        dtiVar.mo30634ck(C14113y2.m67408k4("#", "_x0000_t75"));
        yw9.m74122k4(dtiVar, oleObjectFrame.getFrame());
        C14273pb.m69001k4(dtiVar, oleObjectFrame.getFillFormat(), oleObjectFrame.getLineFormat(), sdpVar);
        o9y.m68422k4(dtiVar, oleObjectFrame.getSubstitutePictureFormat().getPicture().getImage() == null ? ((ImageCollection) sdpVar.m70580k4().m71526c5().getImages()).m1735kk() : (oleObjectFrame.isObjectIcon() ? oleObjectFrame.m2083qq() : oleObjectFrame.getSubstitutePictureFormat()).getPicture().getImage(), sdpVar);
        oah.m68425k4(dtiVar, oleObjectFrame.getGraphicalObjectLock());
        com.aspose.slides.internal.p332p7.qaz qazVarM71908k4 = oleObjectFrame.mo268du().m71908k4();
        if (qazVarM71908k4 != null && qazVarM71908k4.m39434kk().length > 0) {
            com.aspose.slides.internal.p332p7.qaz qazVar = (com.aspose.slides.internal.p332p7.qaz) dtiVar.mo29887h4("recolorinfo").m29542x1();
            if (qazVarM71908k4.m39435x1() == 1 || qazVarM71908k4.m39435x1() == 3) {
                qazVar.m39432k4(1);
            }
            qazVar.m39433k4(((long) qazVarM71908k4.m39434kk().length) & 4294967295L);
            for (com.aspose.slides.internal.p332p7.xhm xhmVar : qazVarM71908k4.m39434kk()) {
                com.aspose.slides.internal.p332p7.xhm xhmVarM39431k4 = qazVar.m39431k4();
                xhmVarM39431k4.m44408k4(xhmVar.m44407k4());
                xhmVarM39431k4.m44410x1(xhmVar.m44409x1());
            }
        }
        dtiVar.mo6846k4("v", c3059ii, "shape");
    }

    /* JADX INFO: renamed from: k4 */
    private static void m70687k4(C3059ii c3059ii) {
        hyf hyfVar = new hyf();
        hyfVar.m33736ix("21600,21600");
        hyfVar.mo29906x1("_x0000_t75");
        hyfVar.mo29891k4(75.0f);
        hyfVar.mo29898m9(1);
        hyfVar.mo30640up("m@4@5l@4@11@9@11@9@5xe");
        hyfVar.mo29894kk(2);
        hyfVar.mo29881du(2);
        ((gc6) hyfVar.mo29887h4("stroke").m29542x1()).m32455x1((byte) 2);
        com.aspose.slides.internal.p332p7.kvj kvjVar = (com.aspose.slides.internal.p332p7.kvj) hyfVar.mo29887h4("formulas").m29542x1();
        kvjVar.m35746k4().m34189k4("if lineDrawn pixelLineWidth 0");
        kvjVar.m35746k4().m34189k4("sum @0 1 0");
        kvjVar.m35746k4().m34189k4("sum 0 0 @1");
        kvjVar.m35746k4().m34189k4("prod @2 1 2");
        kvjVar.m35746k4().m34189k4("prod @3 21600 pixelWidth");
        kvjVar.m35746k4().m34189k4("prod @3 21600 pixelHeight");
        kvjVar.m35746k4().m34189k4("sum @0 0 1");
        kvjVar.m35746k4().m34189k4("prod @6 1 2");
        kvjVar.m35746k4().m34189k4("prod @7 21600 pixelWidth");
        kvjVar.m35746k4().m34189k4("sum @8 21600 0");
        kvjVar.m35746k4().m34189k4("prod @7 21600 pixelHeight");
        kvjVar.m35746k4().m34189k4("sum @10 21600 0");
        com.aspose.slides.internal.p332p7.iak iakVar = (com.aspose.slides.internal.p332p7.iak) hyfVar.mo29887h4("path").m29542x1();
        iakVar.m33984du(2);
        iakVar.m33988kk(1);
        iakVar.m33989to(2);
        C7281az c7281az = (C7281az) hyfVar.mo29887h4("lock").m29542x1();
        c7281az.m28628k4(2);
        c7281az.m28626du(1);
        hyfVar.mo6846k4("v", c3059ii, "shapetype");
    }

    /* JADX INFO: renamed from: k4 */
    private static void m70688k4(AbstractC8917u4 abstractC8917u4, List<com.aspose.slides.internal.p332p7.ai5> list) {
        List.Enumerator<C7394ca> it = abstractC8917u4.mo29877c5().iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                if ("textdata".equals(next.m29539k4())) {
                    list.addItem((com.aspose.slides.internal.p332p7.ai5) next.m29542x1());
                } else if (C7019kk.m27469x1(next.m29542x1(), AbstractC8917u4.class)) {
                    m70688k4((AbstractC8917u4) next.m29542x1(), list);
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
    public final void m70691k4(sdp sdpVar) {
        mo55332up();
        sdpVar.m70582k4(mo3467du());
        m55442ck().mo12953k4((String) null, "xml", (String) null);
        m55442ck().m12954to("xmlns", "v", null, "urn:schemas-microsoft-com:vml");
        m55442ck().m12954to("xmlns", "o", null, "urn:schemas-microsoft-com:office:office");
        m55442ck().m12954to("xmlns", "xs", null, "http://www.w3.org/2001/XMLSchema");
        m55442ck().m12954to("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
        m55442ck().m12954to("xmlns", "wvml", null, "urn:schemas-microsoft-com:office:word");
        m55442ck().m12954to("xmlns", "x", null, "urn:schemas-microsoft-com:office:excel");
        m55442ck().m12954to("xmlns", "ppt", null, "urn:schemas-microsoft-com:office:powerpoint");
        Dictionary.Enumerator<ISlideComponent, Integer> it = sdpVar.m70578h4().iterator();
        boolean z = false;
        while (it.hasNext()) {
            try {
                KeyValuePair next = it.next();
                ISlideComponent iSlideComponent = (ISlideComponent) next.getKey();
                int iIntValue = ((Integer) next.getValue()).intValue();
                if (C7019kk.m27469x1(iSlideComponent, OleObjectFrame.class)) {
                    if (!z) {
                        m70687k4(m55442ck());
                        z = true;
                    }
                    m70686k4((OleObjectFrame) iSlideComponent, iIntValue, m55442ck(), sdpVar);
                } else if (C7019kk.m27469x1(iSlideComponent, Control.class)) {
                    if (!z) {
                        m70687k4(m55442ck());
                        z = true;
                    }
                    m70682k4((Control) iSlideComponent, iIntValue, m55442ck(), sdpVar);
                } else if (C7019kk.m27469x1(iSlideComponent, LegacyDiagram.class)) {
                    m70685k4((LegacyDiagram) iSlideComponent, iIntValue, m55442ck(), sdpVar);
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
        m55442ck().mo21898jd();
        mo55333yj();
    }
}

package com.aspose.slides;

import com.aspose.slides.C1158gq;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.b6z;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.internal.p332p7.AbstractC7379c5;
import com.aspose.slides.internal.p332p7.AbstractC7650fa;
import com.aspose.slides.internal.p332p7.AbstractC8125ks;
import com.aspose.slides.internal.p332p7.AbstractC8333ne;
import com.aspose.slides.internal.p332p7.AbstractC8714rv;
import com.aspose.slides.internal.p332p7.AbstractC9290yj;
import com.aspose.slides.internal.p332p7.C7279ay;
import com.aspose.slides.internal.p332p7.C7317be;
import com.aspose.slides.internal.p332p7.C7322bh;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.internal.p332p7.C7513du;
import com.aspose.slides.internal.p332p7.C7590ep;
import com.aspose.slides.internal.p332p7.C7639f6;
import com.aspose.slides.internal.p332p7.C7664fe;
import com.aspose.slides.internal.p332p7.C7902i2;
import com.aspose.slides.internal.p332p7.C8150l0;
import com.aspose.slides.internal.p332p7.C8202lo;
import com.aspose.slides.internal.p332p7.C8247m7;
import com.aspose.slides.internal.p332p7.C8360nm;
import com.aspose.slides.internal.p332p7.C8499p9;
import com.aspose.slides.internal.p332p7.C8528pk;
import com.aspose.slides.internal.p332p7.C8638qy;
import com.aspose.slides.internal.p332p7.C8820sx;
import com.aspose.slides.internal.p332p7.C8949uf;
import com.aspose.slides.internal.p332p7.C9096w8;
import com.aspose.slides.internal.p332p7.C9171x4;
import com.aspose.slides.internal.p332p7.C9188xc;
import com.aspose.slides.internal.p464vq.AbstractC11760jd;
import com.aspose.slides.internal.p464vq.C11709bg;
import com.aspose.slides.internal.p464vq.C11791os;
import com.aspose.slides.internal.p464vq.C11793ph;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.t8 */
/* JADX INFO: loaded from: classes3.dex */
class C14490t8 {

    /* JADX INFO: renamed from: k4 */
    private static final C7017h4 f49042k4 = new C7017h4("AlternateContent", "sp", "grpSp", "graphicFrame", "cxnSp", "pic", "contentPart", "http://schemas.microsoft.com/office/powerpoint/2016/slidezoom", "http://schemas.microsoft.com/office/powerpoint/2016/summaryzoom", "http://schemas.microsoft.com/office/powerpoint/2016/sectionzoom", "http://schemas.openxmlformats.org/drawingml/2006/table", "http://schemas.openxmlformats.org/presentationml/2006/ole", "http://schemas.openxmlformats.org/drawingml/2006/chart", "http://schemas.microsoft.com/office/drawing/2014/chartex", "http://schemas.microsoft.com/office/drawing/2015/9/8/chartex", "http://schemas.microsoft.com/office/drawing/2015/10/21/chartex", "http://schemas.microsoft.com/office/drawing/2016/5/10/chartex", "http://schemas.openxmlformats.org/drawingml/2006/diagram", "http://schemas.openxmlformats.org/drawingml/2006/compatibility", "audioCd", "wavAudioFile", "audioFile", "videoFile", "quickTimeFile");

    /* JADX INFO: renamed from: k4 */
    public static IShape m70982k4(C7394ca c7394ca, IGroupShape iGroupShape, bjs bjsVar) {
        IPictureFrame iPictureFrameM2653x6;
        ShapeCollection shapeCollection = (ShapeCollection) iGroupShape.getShapes();
        C7017h4 c7017h4 = f49042k4;
        switch (c7017h4.m27428k4(c7394ca.m29539k4())) {
            case 0:
                return C14471sv.m70798k4((C7639f6) c7394ca.m29542x1(), iGroupShape, bjsVar);
            case 1:
                AbstractC8333ne abstractC8333ne = (AbstractC8333ne) c7394ca.m29542x1();
                AutoShape autoShapeM2615fa = shapeCollection.m2615fa();
                C0894dc.m5040k4(autoShapeM2615fa, abstractC8333ne, bjsVar);
                return autoShapeM2615fa;
            case 2:
                AbstractC9290yj abstractC9290yj = (AbstractC9290yj) c7394ca.m29542x1();
                GroupShape groupShapeM2646up = shapeCollection.m2646up();
                m70985k4(groupShapeM2646up, abstractC9290yj, bjsVar);
                return groupShapeM2646up;
            case 3:
                com.aspose.slides.internal.p332p7.pij pijVar = (com.aspose.slides.internal.p332p7.pij) c7394ca.m29542x1();
                switch (c7017h4.m27428k4(bjsVar.m4238x1().m55379yj().m55342k4(pijVar.mo31678kk().m33836k4().m43890ck()))) {
                    case 7:
                        ZoomFrame zoomFrameM2613du = shapeCollection.m2613du();
                        d4k.m4939k4(zoomFrameM2613du, pijVar, bjsVar);
                        return zoomFrameM2613du;
                    case 8:
                        SummaryZoomFrame summaryZoomFrameM2642m9 = shapeCollection.m2642m9();
                        kaf.m63735k4(summaryZoomFrameM2642m9, pijVar, bjsVar);
                        return summaryZoomFrameM2642m9;
                    case 9:
                        SectionZoomFrame sectionZoomFrameM2616h4 = shapeCollection.m2616h4();
                        mbn.m64816k4(sectionZoomFrameM2616h4, pijVar, bjsVar);
                        return sectionZoomFrameM2616h4;
                    case 10:
                        return rvh.m70354k4(shapeCollection, pijVar, bjsVar);
                    case 11:
                        OleObjectFrame oleObjectFrameM2645to = shapeCollection.m2645to();
                        dbk.m5029k4(oleObjectFrameM2645to, pijVar, bjsVar);
                        return oleObjectFrameM2645to;
                    case 12:
                        return C14426s1.m70415k4(shapeCollection, pijVar, bjsVar, false);
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                        return C14426s1.m70415k4(shapeCollection, pijVar, bjsVar, true);
                    case 17:
                        return nkv.m68069k4(shapeCollection, pijVar, bjsVar);
                    case 18:
                        return ya3.m73788k4(shapeCollection, pijVar, bjsVar);
                    default:
                        return m70983k4(pijVar, iGroupShape, bjsVar);
                }
            case 4:
                AbstractC7379c5 abstractC7379c5 = (AbstractC7379c5) c7394ca.m29542x1();
                Connector connectorM2644rv = shapeCollection.m2644rv();
                C13771lc.m64352k4(connectorM2644rv, abstractC7379c5, bjsVar);
                return connectorM2644rv;
            case 5:
                boolean zM27469x1 = C7019kk.m27469x1(c7394ca.m29542x1(), C7513du.class);
                AbstractC7361bz abstractC7361bzM29542x1 = c7394ca.m29542x1();
                AbstractC8714rv abstractC8714rvM30643x1 = zM27469x1 ? ((C7513du) abstractC7361bzM29542x1).m30643x1() : (AbstractC8714rv) abstractC7361bzM29542x1;
                if (abstractC8714rvM30643x1.mo35656k4().mo44221kk() == null || abstractC8714rvM30643x1.mo35656k4().mo44221kk().m32918m9() == null) {
                    iPictureFrameM2653x6 = shapeCollection.m2653x6();
                } else {
                    switch (c7017h4.m27428k4(abstractC8714rvM30643x1.mo35656k4().mo44221kk().m32918m9().m29539k4())) {
                        case 19:
                            iPictureFrameM2653x6 = C14854yo.m73949k4(iGroupShape, (C9188xc) abstractC8714rvM30643x1.mo35656k4().mo44221kk().m32918m9().m29542x1());
                            break;
                        case 20:
                            iPictureFrameM2653x6 = C14854yo.m73947k4(iGroupShape, (C8528pk) abstractC8714rvM30643x1.mo35656k4().mo44221kk().m32918m9().m29542x1(), bjsVar.m4229k4());
                            break;
                        case 21:
                            iPictureFrameM2653x6 = C14854yo.m73948k4(iGroupShape, abstractC8714rvM30643x1, (C8360nm) abstractC8714rvM30643x1.mo35656k4().mo44221kk().m32918m9().m29542x1(), bjsVar.m4229k4());
                            break;
                        case 22:
                            iPictureFrameM2653x6 = rcz.m70075k4((ShapeCollection) iGroupShape.getShapes(), abstractC8714rvM30643x1, (C7590ep) abstractC8714rvM30643x1.mo35656k4().mo44221kk().m32918m9().m29542x1(), bjsVar.m4229k4());
                            break;
                        case 23:
                            iPictureFrameM2653x6 = shapeCollection.m2653x6();
                            iPictureFrameM2653x6.getPictureFormat().getPicture().setImage(((ImageCollection) bjsVar.m4229k4().m6801yj().getImages()).m1717k4());
                            bjsVar.m4229k4().m6785k4("Loading of the quickTimeFile media type is not implemented yet.", 1);
                            break;
                        default:
                            throw new ArgumentOutOfRangeException();
                    }
                }
                if (iPictureFrameM2653x6 != null) {
                    r3b.m70018k4(iPictureFrameM2653x6, abstractC8714rvM30643x1, bjsVar);
                }
                return iPictureFrameM2653x6;
            case 6:
                com.aspose.slides.internal.p332p7.jbq jbqVar = (com.aspose.slides.internal.p332p7.jbq) c7394ca.m29542x1();
                Ink inkM2650x1 = shapeCollection.m2650x1();
                mfs.m64872k4(inkM2650x1, jbqVar, bjsVar);
                return inkM2650x1;
            default:
                throw new Exception(C14113y2.m67408k4("Unknown element \"", c7394ca.m29539k4(), "\""));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00c0 A[PHI: r5
      0x00c0: PHI (r5v1 com.aspose.slides.internal.p7.pij) = 
      (r5v0 com.aspose.slides.internal.p7.pij)
      (r5v6 com.aspose.slides.internal.p7.pij)
      (r5v6 com.aspose.slides.internal.p7.pij)
     binds: [B:15:0x0040, B:20:0x009d, B:22:0x00a7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: x1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void m70988x1(IShape iShape, AbstractC9290yj abstractC9290yj, sdp sdpVar, C14786xh c14786xh) {
        boolean z;
        boolean z2;
        Chart chart = (Chart) iShape;
        IGenericEnumerator<IChartSeries> it = chart.getChartData().getSeries().iterator();
        while (true) {
            try {
                z = true;
                if (!it.hasNext()) {
                    z2 = false;
                    break;
                } else if (ChartTypeCharacterizer.m767to(it.next().getType())) {
                    z2 = true;
                    break;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        com.aspose.slides.internal.p332p7.pij pijVar = null;
        if (chart.getType() != 81) {
            z = false;
        } else {
            if (chart.m2581um() != null) {
                C7639f6 c7639f6 = (C7639f6) abstractC9290yj.mo28598k4("AlternateContent").m29542x1();
                c7639f6.m31638k4("cx4", "http://schemas.microsoft.com/office/drawing/2016/5/10/chartex");
                C7322bh c7322bhM31637k4 = c7639f6.m31637k4();
                c7322bhM31637k4.m28902x1("cx4");
                com.aspose.slides.internal.p332p7.pij pijVar2 = (com.aspose.slides.internal.p332p7.pij) c7322bhM31637k4.m28901k4("graphicFrame").m29542x1();
                com.aspose.slides.internal.p332p7.ks0 ks0Var = (com.aspose.slides.internal.p332p7.ks0) c7639f6.m31641x1().m43855k4("pic").m29542x1();
                PictureFrame pictureFrame = (PictureFrame) chart.m2581um();
                pictureFrame.m2592x1(chart.m2594xw());
                r3b.m70019k4(pictureFrame, ks0Var, sdpVar.m70580k4());
                pictureFrame.m2592x1((InterfaceC14397rj) null);
                pijVar = pijVar2;
            }
            if (sdpVar.m70580k4().m71552m9() == 2 && !chart.getThemeManager().isOverrideThemeEnabled()) {
                chart.getThemeManager().getOverrideTheme().initColorSchemeFromInherited();
                chart.getThemeManager().getOverrideTheme().initFontSchemeFromInherited();
            }
        }
        if (pijVar == null) {
            pijVar = (com.aspose.slides.internal.p332p7.pij) abstractC9290yj.mo28598k4("graphicFrame").m29542x1();
        }
        pijVar.mo31678kk().m33836k4().m43900k4(z2 ? "http://schemas.microsoft.com/office/drawing/2014/chartex" : "http://schemas.openxmlformats.org/drawingml/2006/chart");
        C14426s1.m70416k4(chart, pijVar, sdpVar);
        if (z) {
            chart.getThemeManager().getOverrideTheme().clear();
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static IShape m70983k4(com.aspose.slides.internal.p332p7.pij pijVar, IGroupShape iGroupShape, bjs bjsVar) {
        C8499p9 c8499p9M43907u4;
        C11709bg c11709bgM55303k4;
        GraphicalObject graphicalObjectM2641ks = ((ShapeCollection) iGroupShape.getShapes()).m2641ks();
        C14297pp.m69181k4(graphicalObjectM2641ks, pijVar, bjsVar);
        graphicalObjectM2641ks.mo272to().m63741k4(pijVar.mo31678kk());
        if (pijVar.mo31678kk().m33836k4() != null && (c8499p9M43907u4 = pijVar.mo31678kk().m33836k4().m43907u4()) != null) {
            String strM38655k4 = c8499p9M43907u4.m38655k4();
            if (!C14113y2.m67411k4(strM38655k4) && (c11709bgM55303k4 = bjsVar.m4229k4().m55338u4().m55303k4(strM38655k4)) != null && c11709bgM55303k4.m55296x1() != null) {
                graphicalObjectM2641ks.mo272to().m63742k4(c11709bgM55303k4.m55296x1().m55426to());
                c11709bgM55303k4.m55296x1().m55422k4(true);
            }
        }
        return graphicalObjectM2641ks;
    }

    /* JADX INFO: renamed from: k4 */
    private static void m70984k4(GraphicalObject graphicalObject, AbstractC9290yj abstractC9290yj, final sdp sdpVar) {
        float height;
        float height2;
        C7902i2 c7902i2M63748x6 = graphicalObject.mo272to().m63748x6();
        if (c7902i2M63748x6 == null || graphicalObject.m2581um() == null || !C14113y2.m67363du("http://schemas.microsoft.com/office/drawing/2017/model3d", c7902i2M63748x6.m33836k4().m43890ck())) {
            AbstractC7650fa abstractC7650fa = (AbstractC7650fa) abstractC9290yj.mo28598k4("graphicFrame").m29542x1();
            C14297pp.m69182k4(graphicalObject, abstractC7650fa, sdpVar.m70580k4());
            if (c7902i2M63748x6 != null) {
                abstractC7650fa.mo31678kk().m33836k4().m43900k4(c7902i2M63748x6.m33836k4().m43890ck());
                abstractC7650fa.mo31678kk().m33836k4().m43899k4(c7902i2M63748x6.m33836k4().m43896jd());
                return;
            }
            return;
        }
        C7639f6 c7639f6 = (C7639f6) abstractC9290yj.mo28598k4("AlternateContent").m29542x1();
        c7639f6.m31638k4("am3d", "http://schemas.microsoft.com/office/drawing/2017/model3d");
        C7322bh c7322bhM31637k4 = c7639f6.m31637k4();
        c7322bhM31637k4.m28902x1("am3d");
        com.aspose.slides.internal.p332p7.pij pijVar = (com.aspose.slides.internal.p332p7.pij) c7322bhM31637k4.m28901k4("graphicFrame").m29542x1();
        C14297pp.m69182k4(graphicalObject, pijVar, sdpVar.m70580k4());
        pijVar.mo31678kk().m33836k4().m43900k4("http://schemas.microsoft.com/office/drawing/2017/model3d");
        pijVar.mo31678kk().m33836k4().m43898k4(c7902i2M63748x6.m33836k4().m43907u4());
        C8499p9 c8499p9M43907u4 = pijVar.mo31678kk().m33836k4().m43907u4();
        c8499p9M43907u4.m38659x1().m35383k4(pijVar.mo31680x1());
        C8949uf c8949uf = (C8949uf) C7019kk.m27452k4(c8499p9M43907u4.m38658to().m29541kk(), C8949uf.class);
        if (c8949uf != null) {
            if (graphicalObject.getWidth() < graphicalObject.getHeight()) {
                height = graphicalObject.getWidth();
                height2 = graphicalObject.m2581um().getWidth();
            } else {
                height = graphicalObject.getHeight();
                height2 = graphicalObject.m2581um().getHeight();
            }
            c8949uf.m42352k4(c8949uf.m42351k4() * ((double) (height / height2)));
        }
        com.aspose.slides.internal.p332p7.ks0 ks0Var = (com.aspose.slides.internal.p332p7.ks0) c7639f6.m31641x1().m43855k4("pic").m29542x1();
        PictureFrame pictureFrame = (PictureFrame) graphicalObject.m2581um();
        pictureFrame.m2592x1(graphicalObject.m2594xw());
        pictureFrame.m2559k4(graphicalObject.m2593xk());
        r3b.m70019k4(pictureFrame, ks0Var, sdpVar.m70580k4());
        pictureFrame.m2592x1((InterfaceC14397rj) null);
        byte[] bArrM63745ne = graphicalObject.mo272to().m63745ne();
        if (bArrM63745ne != null) {
            C11793ph c11793ph = new C11793ph();
            C11791os c11791osM55394k4 = sdpVar.m70580k4().mo4812qm().m55394k4("/ppt/media/model3d{0}.glb", new AbstractC11760jd.k4() { // from class: com.aspose.slides.t8.8
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return C22209OooOo0O.OooO00o(sdpVar.m70580k4(), new StringBuilder(), "Aspose.Slides.PptxSerialization.PptxSerializationContext.GetNextImageFileNumber()");
                }

                @Override // com.aspose.slides.internal.p464vq.AbstractC11760jd.k4
                /* JADX INFO: renamed from: k4 */
                public int mo5039k4() {
                    return sdpVar.m70580k4().m71558u4();
                }
            }, c11793ph);
            c11791osM55394k4.m55423k4(bArrM63745ne);
            C8202lo c8202loM38657kk = c8499p9M43907u4.m38657kk();
            if (c8202loM38657kk != null && ks0Var.mo35659x1().m44547du() != null && !C14113y2.m67411k4(ks0Var.mo35659x1().m44547du().m37966k4())) {
                c8202loM38657kk.m36341k4(ks0Var.mo35659x1().m44547du());
            }
            c8499p9M43907u4.m38656k4(sdpVar.m70580k4().m55433g8().m55304k4(c11793ph.mo55275x1().m55382k4(), c11791osM55394k4.m55427x1()).m55289du());
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m70985k4(final IGroupShape iGroupShape, AbstractC9290yj abstractC9290yj, bjs bjsVar) {
        if (abstractC9290yj == null) {
            return;
        }
        bjsVar.m4229k4().m6790ks().throwIfInterruptionRequested();
        C14260oy c14260oyMo272to = ((GroupShape) iGroupShape).mo272to();
        C7664fe c7664feMo28603x1 = abstractC9290yj.mo28603x1();
        C1169h1.m6958k4(iGroupShape.getFillFormat(), c7664feMo28603x1.m31761to(), bjsVar.m4229k4());
        C1158gq.m6880k4(new C1158gq.k4() { // from class: com.aspose.slides.t8.1
            @Override // com.aspose.slides.C1158gq.k4
            /* JADX INFO: renamed from: k4 */
            public IEffectFormat mo3774k4() {
                return iGroupShape.getEffectFormat();
            }
        }, c7664feMo28603x1.m31756du(), bjsVar.m4229k4());
        b6z.m4034k4(new b6z.AbstractC0806k4() { // from class: com.aspose.slides.t8.2
            @Override // com.aspose.slides.b6z.AbstractC0806k4
            /* JADX INFO: renamed from: k4 */
            public IThreeDFormat mo3782k4() {
                return iGroupShape.getThreeDFormat();
            }
        }, c7664feMo28603x1.m31757h4(), (C8638qy) null, (C7317be) null);
        AbstractC8125ks abstractC8125ksMo28599k4 = abstractC9290yj.mo28599k4();
        axn.m3764k4(iGroupShape, abstractC8125ksMo28599k4.mo34363kk(), bjsVar);
        axn.m3762k4(iGroupShape, abstractC8125ksMo28599k4.mo29447k4(), bjsVar);
        C9171x4 c9171x4Mo29448x1 = abstractC8125ksMo28599k4.mo29448x1();
        C14180ng.m68016k4(iGroupShape.getGroupShapeLock(), c9171x4Mo29448x1.m44199x1());
        c14260oyMo272to.m68904x1(c9171x4Mo29448x1.m44198kk());
        c14260oyMo272to.m68901k4(abstractC9290yj.mo28602to());
        ((ShapeCollection) iGroupShape.getShapes()).clear();
        List.Enumerator<C7394ca> it = abstractC9290yj.mo28601kk().iterator();
        while (it.hasNext()) {
            try {
                m70982k4(it.next(), iGroupShape, bjsVar);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        C0819bj.m4225k4((GroupShape) iGroupShape, abstractC9290yj);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m70986k4(IGroupShape iGroupShape, final AbstractC9290yj abstractC9290yj, sdp sdpVar, C14786xh c14786xh) {
        if (iGroupShape == null) {
            return;
        }
        sdpVar.m70580k4().m71525bz().throwIfInterruptionRequested();
        final C7664fe c7664feMo28603x1 = abstractC9290yj.mo28603x1();
        GroupShape groupShape = (GroupShape) iGroupShape;
        C14260oy c14260oyMo272to = groupShape.mo272to();
        u8s u8sVarM70580k4 = sdpVar.m70580k4();
        if (C7019kk.m27469x1(abstractC9290yj, com.aspose.slides.internal.p332p7.hc1.class) || C7019kk.m27469x1(abstractC9290yj, C7279ay.class)) {
            abstractC9290yj.mo28600k4(c14260oyMo272to.m68899k4());
        } else {
            C7019kk.m27469x1(abstractC9290yj, C8247m7.class);
        }
        C1169h1.m6956k4(iGroupShape.getFillFormat(), new C7394ca.k4() { // from class: com.aspose.slides.t8.3
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(c7664feMo28603x1) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_GroupShapePropertiesElementData.AddFillProperties(System.String)";
            }

            @Override // com.aspose.slides.internal.p332p7.C7394ca.k4
            /* JADX INFO: renamed from: k4 */
            public C7394ca mo2788k4(String str) {
                return c7664feMo28603x1.m31762x1(str);
            }
        }, u8sVarM70580k4);
        C1158gq.m6877k4(iGroupShape.getEffectFormat(), new C7394ca.k4() { // from class: com.aspose.slides.t8.4
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(c7664feMo28603x1) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_GroupShapePropertiesElementData.AddEffectProperties(System.String)";
            }

            @Override // com.aspose.slides.internal.p332p7.C7394ca.k4
            /* JADX INFO: renamed from: k4 */
            public C7394ca mo2788k4(String str) {
                return c7664feMo28603x1.m31758k4(str);
            }
        }, u8sVarM70580k4);
        b6z.m4032k4(iGroupShape.getThreeDFormat(), new AbstractC4685kk<C8820sx>() { // from class: com.aspose.slides.t8.5
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(c7664feMo28603x1) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_GroupShapePropertiesElementData.AddScene3d()";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public C8820sx invoke() {
                return c7664feMo28603x1.m31763x1();
            }
        }, (AbstractC4685kk<C8638qy>) null, (AbstractC4685kk<C7317be>) null);
        C0819bj.m4224k4(groupShape, new AbstractC4685kk<C8150l0>() { // from class: com.aspose.slides.t8.6
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(abstractC9290yj.mo28603x1()) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_GroupShapePropertiesElementData.AddXfrm()";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public C8150l0 invoke() {
                return abstractC9290yj.mo28603x1().m31759k4();
            }
        });
        AbstractC8125ks abstractC8125ksMo28599k4 = abstractC9290yj.mo28599k4();
        axn.m3765k4(iGroupShape, abstractC8125ksMo28599k4.mo34363kk(), u8sVarM70580k4);
        axn.m3763k4(iGroupShape, abstractC8125ksMo28599k4.mo29447k4(), u8sVarM70580k4);
        final C9171x4 c9171x4Mo29448x1 = abstractC8125ksMo28599k4.mo29448x1();
        c9171x4Mo29448x1.m44197k4(c14260oyMo272to.m68903x1());
        if (iGroupShape.getGroupShapeLock() != null) {
            C14883zf.m74501k4((GroupShapeLock) iGroupShape.getGroupShapeLock(), new AbstractC4685kk<C9096w8>() { // from class: com.aspose.slides.t8.7
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return System.identityHashCode(c9171x4Mo29448x1) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_NonVisualGroupDrawingShapePropsElementData.AddGrpSpLocks()";
                }

                @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                public C9096w8 invoke() {
                    return c9171x4Mo29448x1.m44196k4();
                }
            });
        }
        List list = new List();
        for (int i = 0; i < iGroupShape.getShapes().size(); i++) {
            sdpVar.m70580k4().m71525bz().throwIfInterruptionRequested();
            IShape iShapeConvertToSmartArt = iGroupShape.getShapes().get_Item(i);
            if (!((Shape) iShapeConvertToSmartArt).m2585wy()) {
                if (sdpVar.m70580k4().mo4812qm().m55348m9() != 0 && C7019kk.m27469x1(iShapeConvertToSmartArt, LegacyDiagram.class)) {
                    iShapeConvertToSmartArt = ((LegacyDiagram) C7019kk.m27452k4((Object) iGroupShape.getShapes().get_Item(i), LegacyDiagram.class)).convertToSmartArt();
                    list.addItem(iShapeConvertToSmartArt);
                    ((Shape) iShapeConvertToSmartArt).m2569kk(true);
                }
                m70987k4(iShapeConvertToSmartArt, abstractC9290yj, sdpVar, c14786xh);
            }
        }
        List.Enumerator it = list.iterator();
        while (it.hasNext()) {
            try {
                iGroupShape.getShapes().remove((IShape) it.next());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m70987k4(IShape iShape, AbstractC9290yj abstractC9290yj, sdp sdpVar, C14786xh c14786xh) {
        u8s u8sVarM70580k4 = sdpVar.m70580k4();
        if (C7019kk.m27469x1(iShape, AutoShape.class)) {
            AutoShape autoShape = (AutoShape) iShape;
            if (autoShape.m287up()) {
                C14471sv.m70799k4(autoShape, (C7639f6) abstractC9290yj.mo28598k4("AlternateContent").m29542x1(), sdpVar, c14786xh);
                return;
            } else {
                C0894dc.m5041k4(autoShape, (AbstractC8333ne) abstractC9290yj.mo28598k4("sp").m29542x1(), sdpVar, c14786xh);
                return;
            }
        }
        if (C7019kk.m27469x1(iShape, Connector.class)) {
            C13771lc.m64353k4((Connector) iShape, (AbstractC7379c5) abstractC9290yj.mo28598k4("cxnSp").m29542x1(), u8sVarM70580k4);
            return;
        }
        if (C7019kk.m27469x1(iShape, AudioFrame.class)) {
            C14854yo.m73952k4((AudioFrame) iShape, ((C7513du) abstractC9290yj.mo28598k4("pic").m29542x1()).m30642k4(), u8sVarM70580k4);
            return;
        }
        if (C7019kk.m27469x1(iShape, VideoFrame.class)) {
            rcz.m70077k4((VideoFrame) iShape, ((C7513du) abstractC9290yj.mo28598k4("pic").m29542x1()).m30642k4(), u8sVarM70580k4);
            return;
        }
        if (C7019kk.m27469x1(iShape, IChart.class)) {
            m70988x1(iShape, abstractC9290yj, sdpVar, c14786xh);
            return;
        }
        if (C7019kk.m27469x1(iShape, SmartArt.class)) {
            com.aspose.slides.internal.p332p7.pij pijVar = (com.aspose.slides.internal.p332p7.pij) abstractC9290yj.mo28598k4("graphicFrame").m29542x1();
            pijVar.mo31678kk().m33836k4().m43900k4("http://schemas.openxmlformats.org/drawingml/2006/diagram");
            nkv.m68070k4((SmartArt) iShape, pijVar, sdpVar);
            return;
        }
        if (C7019kk.m27469x1(iShape, OleObjectFrame.class)) {
            com.aspose.slides.internal.p332p7.pij pijVar2 = (com.aspose.slides.internal.p332p7.pij) abstractC9290yj.mo28598k4("graphicFrame").m29542x1();
            pijVar2.mo31678kk().m33836k4().m43900k4("http://schemas.openxmlformats.org/presentationml/2006/ole");
            dbk.m5030k4((OleObjectFrame) iShape, pijVar2, sdpVar);
            return;
        }
        if (C7019kk.m27469x1(iShape, Table.class)) {
            com.aspose.slides.internal.p332p7.pij pijVar3 = (com.aspose.slides.internal.p332p7.pij) abstractC9290yj.mo28598k4("graphicFrame").m29542x1();
            pijVar3.mo31678kk().m33836k4().m43900k4("http://schemas.openxmlformats.org/drawingml/2006/table");
            rvh.m70355k4((Table) iShape, pijVar3, u8sVarM70580k4);
            return;
        }
        if (C7019kk.m27469x1(iShape, GroupShape.class)) {
            m70986k4((IGroupShape) iShape, (AbstractC9290yj) abstractC9290yj.mo28598k4("grpSp").m29542x1(), sdpVar, c14786xh);
            return;
        }
        if (C7019kk.m27469x1(iShape, PictureFrame.class)) {
            AbstractC7361bz abstractC7361bzM29542x1 = abstractC9290yj.mo28598k4("pic").m29542x1();
            r3b.m70019k4((PictureFrame) iShape, C7019kk.m27469x1(abstractC7361bzM29542x1, C7513du.class) ? ((C7513du) abstractC7361bzM29542x1).m30642k4() : (AbstractC8714rv) abstractC7361bzM29542x1, u8sVarM70580k4);
            return;
        }
        if (C7019kk.m27469x1(iShape, LegacyDiagram.class)) {
            AbstractC7650fa abstractC7650fa = (AbstractC7650fa) abstractC9290yj.mo28598k4("graphicFrame").m29542x1();
            abstractC7650fa.mo31678kk().m33836k4().m43900k4("http://schemas.openxmlformats.org/drawingml/2006/compatibility");
            ya3.m73790k4((LegacyDiagram) iShape, abstractC7650fa, sdpVar);
            return;
        }
        if (C7019kk.m27469x1(iShape, Ink.class)) {
            mfs.m64873k4((Ink) iShape, (com.aspose.slides.internal.p332p7.jbq) abstractC9290yj.mo28598k4("contentPart").m29542x1(), u8sVarM70580k4);
            return;
        }
        if (C7019kk.m27469x1(iShape, SummaryZoomFrame.class)) {
            if (sdpVar.m70580k4().m71552m9() != 2) {
                kaf.m63738k4((SummaryZoomFrame) iShape, abstractC9290yj, sdpVar);
            }
        } else if (C7019kk.m27469x1(iShape, SectionZoomFrame.class)) {
            if (sdpVar.m70580k4().m71552m9() != 2) {
                mbn.m64819k4((SectionZoomFrame) iShape, abstractC9290yj, sdpVar);
            }
        } else if (C7019kk.m27469x1(iShape, ZoomFrame.class)) {
            if (sdpVar.m70580k4().m71552m9() != 2) {
                d4k.m4942k4((ZoomFrame) iShape, abstractC9290yj, sdpVar);
            }
        } else if (C7019kk.m27469x1(iShape, GraphicalObject.class)) {
            m70984k4((GraphicalObject) iShape, abstractC9290yj, sdpVar);
        }
    }
}

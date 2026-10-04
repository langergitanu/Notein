package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p085dk.AbstractC3174jd;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.internal.p332p7.C8594qb;
import com.aspose.slides.internal.p464vq.AbstractC11747gf;
import com.aspose.slides.internal.p464vq.AbstractC11758j2;
import com.aspose.slides.internal.p464vq.AbstractC11762jm;
import com.aspose.slides.internal.p464vq.C11702ak;
import com.aspose.slides.internal.p464vq.C11709bg;
import com.aspose.slides.internal.p464vq.C11717c5;
import com.aspose.slides.internal.p464vq.C11728dt;
import com.aspose.slides.internal.p464vq.C11738ew;
import com.aspose.slides.internal.p464vq.C11750gx;
import com.aspose.slides.internal.p464vq.C11785nh;
import com.aspose.slides.internal.p464vq.C11791os;
import com.aspose.slides.internal.p464vq.C11799qq;
import com.aspose.slides.internal.p464vq.C11844wy;
import com.aspose.slides.internal.p464vq.C11848x3;
import com.aspose.slides.internal.p508xq.C12599kk;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14047bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class kjx {

    /* JADX INFO: renamed from: k4 */
    private gnb f45748k4;

    /* JADX INFO: renamed from: x1 */
    private C11791os f45749x1;

    /* JADX INFO: renamed from: c5 */
    private void m63917c5(C11785nh c11785nh, IPresentation iPresentation) {
        if (c11785nh.m55359lr() == null) {
            return;
        }
        ((Presentation) iPresentation).m2351fa().m68398x1(c11785nh.m55359lr().m55426to());
        c11785nh.m55359lr().m55422k4(true);
    }

    /* JADX INFO: renamed from: ck */
    private void m63918ck(C11785nh c11785nh, IPresentation iPresentation) {
        for (C11709bg c11709bg : c11785nh.m55354ar().m55377up().m55309k4(C11844wy.f39926k4)) {
            C11791os c11791osM55296x1 = c11709bg.m55296x1();
            if (c11791osM55296x1.m55377up() != null) {
                ICustomXmlPart iCustomXmlPartM6795to = this.f45748k4.m6795to(c11791osM55296x1);
                C11709bg[] c11709bgArrM55309k4 = c11791osM55296x1.m55377up().m55309k4(C11702ak.f39665k4);
                if (c11709bgArrM55309k4.length > 0) {
                    c11791osM55296x1 = c11709bgArrM55309k4[0].m55296x1();
                    if (c11791osM55296x1.m55426to().length > 0) {
                        new C14783xe(c11791osM55296x1, this.f45748k4).m73340k4(iCustomXmlPartM6795to);
                    }
                    c11791osM55296x1.m55422k4(true);
                }
            } else {
                c11791osM55296x1.m55422k4(true);
            }
        }
    }

    /* JADX INFO: renamed from: du */
    private void m63919du(C11785nh c11785nh, IPresentation iPresentation) {
        if (c11785nh.m55364um() == null) {
            return;
        }
        new w0x(c11785nh.m55364um(), this.f45748k4).m72619k4(((Presentation) iPresentation).m2351fa().m68389u4());
    }

    /* JADX INFO: renamed from: dy */
    private void m63920dy(C11785nh c11785nh, IPresentation iPresentation) {
        if (c11785nh.m55367v4() == null) {
            return;
        }
        new x7y().m73178k4(c11785nh.m55367v4().m55426to(), iPresentation);
        Presentation presentation = (Presentation) iPresentation;
        presentation.m2351fa().m68378k4(c11785nh.m55367v4().m55426to());
        presentation.m2351fa().m68368k4(((VbaProject) iPresentation.getVbaProject()).m3051k4());
        c11785nh.m55367v4().m55422k4(true);
    }

    /* JADX INFO: renamed from: h4 */
    private void m63921h4(C11785nh c11785nh, IPresentation iPresentation) {
        new np9(c11785nh.m55356bv(), this.f45748k4).m68155k4(iPresentation);
    }

    /* JADX INFO: renamed from: jd */
    private void m63922jd(C11785nh c11785nh, IPresentation iPresentation) {
        int i;
        if (c11785nh.m55355b3() == null) {
            return;
        }
        new yeb(c11785nh.m55355b3(), this.f45748k4).m73860k4(iPresentation);
        n3i n3iVarM68386rv = ((Presentation) iPresentation).m2351fa().m68386rv();
        if (n3iVarM68386rv == null || n3iVarM68386rv.m67862k4() == null) {
            return;
        }
        C8594qb c8594qbM67862k4 = n3iVarM68386rv.m67862k4();
        IViewProperties viewProperties = iPresentation.getViewProperties();
        int iM39449to = c8594qbM67862k4.m39449to();
        switch (iM39449to) {
            case 0:
                i = 0;
                break;
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;
                break;
            case 3:
                i = 3;
                break;
            case 4:
                i = 4;
                break;
            case 5:
                i = 5;
                break;
            case 6:
                i = 6;
                break;
            case 7:
                i = 7;
                break;
            case 8:
                i = 8;
                break;
            default:
                throw new PptxReadException(C14113y2.m67408k4("Unknown view type: ", C14042ak.m66410k4(com.aspose.slides.internal.p332p7.b4a.class, iM39449to)));
        }
        viewProperties.setLastView(i);
        viewProperties.setShowComments(c8594qbM67862k4.m39441du() ? (byte) 1 : (byte) 0);
        if (c8594qbM67862k4.m39443h4() != null) {
            tve.m71336k4(((ViewProperties) viewProperties).getNormalViewProperties(), c8594qbM67862k4.m39443h4());
        }
        if (c8594qbM67862k4.m39448m9() != null) {
            C0844c7.m4498k4(viewProperties.getSlideViewProperties(), c8594qbM67862k4.m39448m9().m31931k4().m44137k4());
        }
        if (c8594qbM67862k4.m39440c5() != null) {
            C0844c7.m4498k4(viewProperties.getNotesViewProperties(), c8594qbM67862k4.m39440c5().m32279k4().m44137k4());
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static float m63923k4(int i) {
        if (i == 3) {
            return 0.8f;
        }
        if (i == 2) {
            return 0.5f;
        }
        return i == 1 ? 0.2f : 0.0f;
    }

    /* JADX INFO: renamed from: kk */
    private void m63941kk(C11785nh c11785nh, IPresentation iPresentation) {
        for (C11791os c11791os : c11785nh.m55388c5()) {
            if (C14113y2.m67448x1(c11791os.m55372fa().mo55273k4(), "audio/")) {
                this.f45748k4.m6798x1(c11791os);
            }
        }
    }

    /* JADX INFO: renamed from: m9 */
    private void m63943m9(C11785nh c11785nh, IPresentation iPresentation) {
        new nps(c11785nh.m55354ar(), this.f45748k4).m68165k4(iPresentation);
        String presentationFormat = iPresentation.getDocumentProperties().getPresentationFormat();
        if (!C14113y2.m67411k4(presentationFormat) && C14113y2.m67363du("widescreen", C14113y2.m67368h4(presentationFormat)) && ((SlideSize) iPresentation.getSlideSize()).m2756k4(16)) {
            iPresentation.getSlideSize().setSize(16, 0);
        }
    }

    /* JADX INFO: renamed from: to */
    private void m63944to(C11785nh c11785nh, IPresentation iPresentation) {
        for (C11791os c11791os : c11785nh.m55388c5()) {
            if (C14113y2.m67448x1(c11791os.m55372fa().mo55273k4(), "video/")) {
                this.f45748k4.m6789kk(c11791os);
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    public static void m63945x1(C11785nh c11785nh, IDocumentProperties iDocumentProperties, AbstractC11758j2 abstractC11758j2) {
        if (c11785nh.m55366uz() != null) {
            new C13708k0(c11785nh.m55366uz(), abstractC11758j2).m63590k4(iDocumentProperties);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static int m63924k4(float f) {
        if (f >= 80.0f) {
            return 3;
        }
        return f >= 50.0f ? 2 : 1;
    }

    /* JADX INFO: renamed from: kk */
    public static void m63942kk(C11785nh c11785nh, IPresentation iPresentation, gnb gnbVar) {
        List.Enumerator<IShape> it = gnbVar.m6774ck().iterator();
        while (it.hasNext()) {
            try {
                IShape next = it.next();
                if (C7019kk.m27469x1(next, IAudioFrame.class)) {
                    m63927k4((IAudioFrame) next);
                } else if (C7019kk.m27469x1(next, IVideoFrame.class)) {
                    m63929k4((IVideoFrame) next);
                } else if (C7019kk.m27469x1(next, SummaryZoomFrame.class)) {
                    m63932k4((SummaryZoomFrame) next, gnbVar.m6801yj());
                } else if (C7019kk.m27469x1(next, SectionZoomFrame.class)) {
                    m63931k4((SectionZoomFrame) next, gnbVar.m6801yj());
                } else if (C7019kk.m27469x1(next, IZoomFrame.class)) {
                    m63930k4((IZoomFrame) next, gnbVar.m6801yj());
                } else if (C7019kk.m27469x1(next, AutoShape.class)) {
                    ((Shape) next).mo277dy();
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
        gnbVar.m6779ix();
    }

    /* JADX INFO: renamed from: x1 */
    private void m63946x1(C11785nh c11785nh, IPresentation iPresentation) {
        for (C11791os c11791os : c11785nh.m55393jd()) {
            for (C11791os c11791os2 : c11791os.m55374k4(AbstractC11747gf.f39744k4)) {
                this.f45748k4.m6790ks().throwIfInterruptionRequested();
                this.f45748k4.m6781k4(c11791os2);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m63925k4(List<C7394ca> list, C7394ca c7394ca, C7394ca c7394ca2, IShape iShape) {
        Shape shape;
        if (c7394ca == null || !"spTgt".equals(c7394ca.m29539k4()) || (shape = (Shape) C7019kk.m27452k4((Object) iShape, Shape.class)) == null || !C14113y2.m67363du(((com.aspose.slides.internal.p332p7.sdd) c7394ca.m29542x1()).m40964k4(), C13850af.m65147x1(shape.m2584wp()))) {
            return;
        }
        list.addItem(c7394ca2);
    }

    /* JADX INFO: renamed from: x1 */
    public static void m63947x1(C11785nh c11785nh, IPresentation iPresentation, gnb gnbVar) {
        for (C11791os c11791os : c11785nh.m55363u4()) {
            DigitalSignature digitalSignature = new DigitalSignature();
            new C0972f0(c11791os, gnbVar).m5800k4(digitalSignature);
            iPresentation.getDigitalSignatures().add(digitalSignature);
            c11791os.m55422k4(true);
        }
        if (iPresentation.getDigitalSignatures().size() > 0) {
            C11791os c11791osM55392h4 = c11785nh.m55392h4("/_xmlsignatures/origin.sigs");
            if (c11791osM55392h4 != null) {
                c11791osM55392h4.m55422k4(true);
            }
            LoadOptions loadOptionsM2349du = ((Presentation) iPresentation).m2349du();
            if (loadOptionsM2349du != null) {
                loadOptionsM2349du.m1922kk();
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m63926k4(List<C7394ca> list, com.aspose.slides.internal.p332p7.rqz rqzVar, IShape iShape) {
        com.aspose.slides.internal.p332p7.v2z v2zVarM33336x1;
        com.aspose.slides.internal.p332p7.ycb ycbVarM42701h4;
        com.aspose.slides.internal.p332p7.lmh lmhVarM63186k4;
        if (rqzVar == null) {
            return;
        }
        for (int i = 0; i < rqzVar.m40177k4().size(); i++) {
            C7394ca c7394ca = rqzVar.m40177k4().get_Item(i);
            if (C7019kk.m27469x1(c7394ca.m29542x1(), com.aspose.slides.internal.p332p7.ycb.class)) {
                ycbVarM42701h4 = (com.aspose.slides.internal.p332p7.ycb) c7394ca.m29542x1();
            } else {
                if (C7019kk.m27469x1(c7394ca.m29542x1(), com.aspose.slides.internal.p332p7.c6b.class)) {
                    v2zVarM33336x1 = ((com.aspose.slides.internal.p332p7.c6b) c7394ca.m29542x1()).m29443x1();
                } else {
                    if (C7019kk.m27469x1(c7394ca.m29542x1(), com.aspose.slides.internal.p332p7.hgn.class)) {
                        v2zVarM33336x1 = ((com.aspose.slides.internal.p332p7.hgn) c7394ca.m29542x1()).m33336x1();
                    }
                    if (!C13670j2.m63207x1(c7394ca.m29539k4()) && (lmhVarM63186k4 = C13670j2.m63186k4(c7394ca)) != null) {
                        if (lmhVarM63186k4.m36322wy() != null) {
                            m63926k4(list, lmhVarM63186k4.m36322wy(), iShape);
                        }
                        if (lmhVarM63186k4.m36277ak() != null) {
                            m63926k4(list, lmhVarM63186k4.m36277ak(), iShape);
                        }
                    }
                }
                ycbVarM42701h4 = v2zVarM33336x1.m42701h4();
            }
            m63925k4(list, ycbVarM42701h4.m44924k4(), c7394ca, iShape);
            if (!C13670j2.m63207x1(c7394ca.m29539k4())) {
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    private static void m63948x1(o8s o8sVar, List<coq> list, C11709bg c11709bg) {
        ipw ipwVarM64892k4 = o8sVar.m68384ne().m64892k4(c11709bg.m55292k4());
        if (ipwVarM64892k4 != null) {
            if (C14113y2.m67411k4(ipwVarM64892k4.m63031to())) {
                ipwVarM64892k4.m63029k4(c11709bg.m55291h4());
            }
            list.addItem(new coq(c11709bg.m55289du(), c11709bg.m55291h4(), c11709bg.m55292k4(), c11709bg.m55294m9(), true));
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m63927k4(IAudioFrame iAudioFrame) {
        float fM63183k4;
        com.aspose.slides.internal.p332p7.v2z v2zVarM33336x1;
        AbstractC0919dx abstractC0919dxMo400kk = ((BaseSlide) iAudioFrame.getSlide()).mo400kk();
        if (abstractC0919dxMo400kk.m5301k4() == null) {
            abstractC0919dxMo400kk.m5304k4(new com.aspose.slides.internal.p332p7.ehe());
        }
        com.aspose.slides.internal.p332p7.v2z v2zVar = null;
        com.aspose.slides.internal.p332p7.c6b c6bVar = null;
        com.aspose.slides.internal.p332p7.hgn hgnVar = null;
        for (C7394ca c7394ca : m63940k4(abstractC0919dxMo400kk.m5301k4().m31097kk(), iAudioFrame)) {
            if (C7019kk.m27469x1(c7394ca.m29542x1(), com.aspose.slides.internal.p332p7.c6b.class)) {
                com.aspose.slides.internal.p332p7.c6b c6bVar2 = (com.aspose.slides.internal.p332p7.c6b) c7394ca.m29542x1();
                v2zVarM33336x1 = c6bVar2.m29443x1();
                c6bVar = c6bVar2;
            } else if (C7019kk.m27469x1(c7394ca.m29542x1(), com.aspose.slides.internal.p332p7.hgn.class)) {
                com.aspose.slides.internal.p332p7.hgn hgnVar2 = (com.aspose.slides.internal.p332p7.hgn) c7394ca.m29542x1();
                v2zVarM33336x1 = hgnVar2.m33336x1();
                hgnVar = hgnVar2;
            }
            v2zVar = v2zVarM33336x1;
        }
        if (v2zVar != null) {
            fM63183k4 = C13670j2.m63183k4(v2zVar.m42700du().m36282ck());
            iAudioFrame.setHideAtShowing(!v2zVar.m42707to());
            iAudioFrame.setPlayLoopMode(fM63183k4 == Float.POSITIVE_INFINITY);
            ((AudioFrame) iAudioFrame).setRewindAudio(v2zVar.m42700du().m36310ne() == 0);
            if (v2zVar.m42709x1()) {
                iAudioFrame.setVolume(0);
            } else {
                iAudioFrame.setVolume(m63924k4(v2zVar.m42702k4()));
            }
        } else {
            fM63183k4 = 1.0f;
        }
        List list = new List();
        IGenericEnumerator<ISequence> it = iAudioFrame.getSlide().getTimeline().getInteractiveSequences().iterator();
        while (it.hasNext()) {
            try {
                for (IEffect iEffect : it.next().getEffectsByShape(iAudioFrame)) {
                    list.addItem(iEffect);
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        IEffect[] effectsByShape = iAudioFrame.getSlide().getTimeline().getMainSequence().getEffectsByShape(iAudioFrame);
        m63937k4(effectsByShape.length > 0 ? effectsByShape : (IEffect[]) list.toArray(new IEffect[0]), fM63183k4);
        iAudioFrame.setPlayMode(-1);
        if (effectsByShape.length == 1 && list.size() == 0) {
            ((AudioFrame) C7019kk.m27452k4((Object) iAudioFrame, AudioFrame.class)).f210kk = effectsByShape[0].getTiming().getTriggerType() == 1 ? 3 : 0;
        } else if (list.size() == 1) {
            ((AudioFrame) C7019kk.m27452k4((Object) iAudioFrame, AudioFrame.class)).f210kk = 1;
        }
        if (c6bVar != null) {
            ((AudioFrame) C7019kk.m27452k4((Object) iAudioFrame, AudioFrame.class)).mo272to().m67910k4(c6bVar.m29442k4());
            if (v2zVar != null && (v2zVar.m42706kk() & 4294967295L) > 1) {
                iAudioFrame.setPlayAcrossSlides(true);
            }
        }
        if (c6bVar == null && hgnVar == null && iAudioFrame.getPresentation().getSourceFormat() != 0) {
            iAudioFrame.setVolume(-1);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m63928k4(IPresentation iPresentation) {
        C11791os[] c11791osArrM55375k4 = this.f45749x1.m55375k4(new C11799qq());
        if (c11791osArrM55375k4.length > 0) {
            new C13645ip(c11791osArrM55375k4[0], this.f45748k4).m63022k4(iPresentation);
        }
        C11791os[] c11791osArrM55375k42 = this.f45749x1.m55375k4(new C11717c5());
        if (c11791osArrM55375k42.length > 0) {
            new C14853yn(c11791osArrM55375k42[0], this.f45748k4).m73945k4(iPresentation);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m63929k4(IVideoFrame iVideoFrame) {
        float fM63183k4;
        jmb jmbVarMo268du = ((VideoFrame) iVideoFrame).mo268du();
        com.aspose.slides.internal.p332p7.ehe eheVarM5301k4 = ((BaseSlide) iVideoFrame.getSlide()).mo400kk().m5301k4();
        if (eheVarM5301k4 == null) {
            return;
        }
        C7394ca[] c7394caArrM63940k4 = m63940k4(eheVarM5301k4.m31097kk(), iVideoFrame);
        jmbVarMo268du.m63438k4(-1);
        for (C7394ca c7394ca : c7394caArrM63940k4) {
            com.aspose.slides.internal.p332p7.hgn hgnVar = (com.aspose.slides.internal.p332p7.hgn) C7019kk.m27452k4((Object) c7394ca.m29542x1(), com.aspose.slides.internal.p332p7.hgn.class);
            if (hgnVar != null) {
                fM63183k4 = C13670j2.m63183k4(hgnVar.m33336x1().m42700du().m36282ck());
                iVideoFrame.setHideAtShowing(!hgnVar.m33336x1().m42707to());
                iVideoFrame.setPlayLoopMode(fM63183k4 == Float.POSITIVE_INFINITY);
                iVideoFrame.setFullScreenMode(hgnVar.m33335k4());
                iVideoFrame.setRewindVideo(hgnVar.m33336x1().m42700du().m36310ne() == 0);
                if (hgnVar.m33336x1().m42709x1()) {
                    iVideoFrame.setVolume(0);
                } else {
                    iVideoFrame.setVolume(m63924k4(hgnVar.m33336x1().m42702k4()));
                }
            } else {
                fM63183k4 = 1.0f;
            }
            List list = new List();
            IGenericEnumerator<ISequence> it = iVideoFrame.getSlide().getTimeline().getInteractiveSequences().iterator();
            while (it.hasNext()) {
                try {
                    for (IEffect iEffect : it.next().getEffectsByShape(iVideoFrame)) {
                        list.addItem(iEffect);
                    }
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            IEffect[] effectsByShape = iVideoFrame.getSlide().getTimeline().getMainSequence().getEffectsByShape(iVideoFrame);
            m63937k4(effectsByShape.length > 0 ? effectsByShape : (IEffect[]) list.toArray(new IEffect[0]), fM63183k4);
            if (effectsByShape.length == 1 && list.size() == 1) {
                if (hgnVar != null) {
                    jmbVarMo268du.m63438k4((hgnVar.m33336x1().m42706kk() & 4294967295L) == 999 ? 2 : effectsByShape[0].getTiming().getTriggerType() == 1 ? 3 : 0);
                } else {
                    jmbVarMo268du.m63438k4(0);
                }
            } else if (list.size() == 1) {
                jmbVarMo268du.m63438k4(1);
            }
            if (hgnVar == null && iVideoFrame.getPresentation().getSourceFormat() != 0) {
                iVideoFrame.setVolume(-1);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m63930k4(IZoomFrame iZoomFrame, Presentation presentation) {
        IGenericEnumerator<ISlide> it = presentation.getSlides().iterator();
        while (it.hasNext()) {
            try {
                ISlide next = it.next();
                if (((ZoomFrame) iZoomFrame).m3129wl() == ((Slide) next).getSlideId()) {
                    ((ZoomFrame) iZoomFrame).m3131x1(next);
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0020 A[Catch: RuntimeException -> 0x001d, TryCatch #0 {RuntimeException -> 0x001d, blocks: (B:2:0x0000, B:4:0x0008, B:6:0x0012, B:10:0x0030, B:12:0x0080, B:13:0x008d, B:9:0x0020), top: B:21:0x0000 }] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m63949k4(Presentation presentation, AbstractC3150x6 abstractC3150x6, final InterruptionToken interruptionToken) {
        C11785nh c11785nh;
        try {
            int i = abstractC3150x6.readByte();
            if (i > 0) {
                abstractC3150x6.seek(-1L, 1);
                c11785nh = ((byte) i) == 80 ? new C11785nh(abstractC3150x6, false, new AbstractC3174jd() { // from class: com.aspose.slides.kjx.1
                    @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                    public String getDelegateId() {
                        return System.identityHashCode(interruptionToken) + "Aspose.Slides.InterruptionToken.ThrowIfInterruptionRequested()";
                    }

                    @Override // com.aspose.slides.internal.p085dk.AbstractC3174jd
                    /* JADX INFO: renamed from: k4 */
                    public void mo4791k4() {
                        interruptionToken.throwIfInterruptionRequested();
                    }
                }) : new C11785nh(new C12599kk(abstractC3150x6), new AbstractC3174jd() { // from class: com.aspose.slides.kjx.2
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
            this.f45748k4 = new gnb(presentation, interruptionToken, c11785nh.m55346k4());
            o8s o8sVarM2351fa = presentation.m2351fa();
            C11791os c11791osM55354ar = c11785nh.m55354ar();
            this.f45749x1 = c11791osM55354ar;
            o8sVarM2351fa.m68366k4(lxj.m64612k4(c11791osM55354ar.m55372fa().mo55273k4(), 0));
            m63918ck(c11785nh, presentation);
            m63950k4(c11785nh, presentation);
            m63928k4(presentation);
            m63946x1(c11785nh, presentation);
            m63941kk(c11785nh, presentation);
            m63944to(c11785nh, presentation);
            m63919du(c11785nh, presentation);
            m63921h4(c11785nh, presentation);
            m63935k4(c11785nh, this.f45748k4);
            m63943m9(c11785nh, presentation);
            m63920dy(c11785nh, presentation);
            m63917c5(c11785nh, presentation);
            C11791os c11791osM55370yd = c11785nh.m55370yd();
            if (c11791osM55370yd != null) {
                new ot7(c11791osM55370yd, this.f45748k4).m68823k4(presentation);
                c11791osM55370yd.m55422k4(true);
            }
            m63922jd(c11785nh, presentation);
            m63947x1(c11785nh, presentation, this.f45748k4);
            m63934k4(c11785nh, presentation, this.f45748k4);
            m63942kk(c11785nh, presentation, this.f45748k4);
        } catch (RuntimeException e) {
            if (!C7019kk.m27469x1(e, C11848x3.class)) {
                throw new PptxReadException(e.getMessage(), e);
            }
            throw new PptxUnsupportedFormatException(e.getMessage(), e);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m63931k4(SectionZoomFrame sectionZoomFrame, Presentation presentation) {
        IGenericEnumerator<ISection> it = presentation.getSections().iterator();
        while (it.hasNext()) {
            try {
                ISection next = it.next();
                if (C14047bz.m66535k4(sectionZoomFrame.m2525k4(), ((Section) next).m2517k4())) {
                    sectionZoomFrame.m2526k4(next);
                    sectionZoomFrame.m3131x1(next.getStartedFromSlide());
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m63932k4(SummaryZoomFrame summaryZoomFrame, Presentation presentation) {
        IGenericEnumerator<ISection> it = presentation.getSections().iterator();
        while (it.hasNext()) {
            try {
                ISection next = it.next();
                IGenericEnumerator<ISummaryZoomSection> it2 = summaryZoomFrame.getSummaryZoomCollection().iterator();
                while (it2.hasNext()) {
                    try {
                        ISummaryZoomSection next2 = it2.next();
                        if (C14047bz.m66535k4(((SummaryZoomSection) next2).m2525k4(), ((Section) next).m2517k4())) {
                            ((SummaryZoomSection) next2).setTargetSection(next);
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
            } catch (Throwable th2) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th2;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m63933k4(C11785nh c11785nh, IDocumentProperties iDocumentProperties, AbstractC11758j2 abstractC11758j2) {
        if (c11785nh.m55368wl() != null) {
            new C14565tk(c11785nh.m55368wl(), abstractC11758j2).m71238k4(iDocumentProperties);
        }
        if (c11785nh.m55361qq() != null) {
            new C14668v9(c11785nh.m55361qq(), abstractC11758j2).m72097k4(iDocumentProperties);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m63950k4(C11785nh c11785nh, IPresentation iPresentation) {
        if (iPresentation.getProtectionManager().getEncryptDocumentProperties()) {
            m63933k4(c11785nh, iPresentation.getDocumentProperties(), this.f45748k4);
        }
        if (c11785nh.m55368wl() != null) {
            c11785nh.m55368wl().m55422k4(true);
        }
        if (c11785nh.m55361qq() != null) {
            c11785nh.m55361qq().m55422k4(true);
        }
        m63945x1(c11785nh, iPresentation.getDocumentProperties(), this.f45748k4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public static void m63934k4(C11785nh c11785nh, IPresentation iPresentation, gnb gnbVar) {
        o8s o8sVarM2351fa = ((Presentation) iPresentation).m2351fa();
        for (C11791os c11791os : c11785nh.m55388c5()) {
            if (!C7019kk.m27469x1(c11791os.m55372fa(), AbstractC11762jm.class) && !c11791os.m55413c5() && !C7019kk.m27469x1(c11791os.m55372fa(), C11738ew.class) && (!C7019kk.m27469x1(c11791os.m55372fa(), C11750gx.class) || !C14113y2.m67448x1(c11791os.m55424kk(), "ppt/slides/slide"))) {
                o8sVarM2351fa.m68384ne().m64893k4(c11791os.m55427x1(), c11791os.m55426to(), c11791os.m55372fa().mo55273k4(), c11791os.m55372fa().mo55275x1() != null ? c11791os.m55372fa().mo55275x1().m55382k4() : "", c11791os.m55377up());
                c11791os.m55422k4(true);
            }
        }
        int iM6775du = gnbVar.m6775du();
        if (iM6775du == 0) {
            for (C11709bg c11709bg : c11785nh.m55354ar().m55377up().m55313x1()) {
                m63936k4(o8sVarM2351fa, o8sVarM2351fa.m68362ix(), c11709bg);
            }
            for (C11709bg c11709bg2 : c11785nh.m55390dy().m55313x1()) {
                m63948x1(o8sVarM2351fa, o8sVarM2351fa.m68362ix(), c11709bg2);
            }
        } else if (iM6775du != 1 && iM6775du != 2 && iM6775du != 3) {
            throw new ArgumentOutOfRangeException();
        }
        List list = new List();
        for (C11791os c11791os2 : c11785nh.m55360ne()) {
            list.addItem(c11791os2);
        }
        for (C11791os c11791os3 : c11785nh.m55371yj()) {
            list.addItem(c11791os3);
        }
        for (C11791os c11791os4 : c11785nh.m55358ks()) {
            list.addItem(c11791os4);
        }
        for (C11791os c11791os5 : c11785nh.m55362rv()) {
            list.addItem(c11791os5);
        }
        for (C11791os c11791os6 : c11785nh.m55369x6()) {
            list.addItem(c11791os6);
        }
        for (C11791os c11791os7 : c11785nh.m55365up()) {
            list.addItem(c11791os7);
        }
        List.Enumerator it = list.iterator();
        while (it.hasNext()) {
            try {
                C11791os c11791os8 = (C11791os) it.next();
                if (gnbVar.m6780jd().containsKey(c11791os8.m55427x1())) {
                    AbstractC0919dx abstractC0919dxMo400kk = ((BaseSlide) gnbVar.m6780jd().get_Item(c11791os8.m55427x1())).mo400kk();
                    for (C11709bg c11709bg3 : c11791os8.m55377up().m55313x1()) {
                        m63936k4(o8sVarM2351fa, abstractC0919dxMo400kk.m5308m9(), c11709bg3);
                    }
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m63935k4(C11785nh c11785nh, gnb gnbVar) {
        for (C11791os c11791os : c11785nh.m55371yj()) {
            C11709bg[] c11709bgArrM55309k4 = c11791os.m55377up().m55309k4(C11728dt.f39724k4);
            if (c11709bgArrM55309k4 != null && c11709bgArrM55309k4.length > 0) {
                SortedList<String, SortedList<String, C11791os>> sortedListM6777fa = gnbVar.m6777fa();
                if (!sortedListM6777fa.containsKey(c11709bgArrM55309k4[0].m55292k4())) {
                    gnbVar.m6777fa().addItem(c11709bgArrM55309k4[0].m55292k4(), new SortedList<>());
                }
                sortedListM6777fa.get_Item(c11709bgArrM55309k4[0].m55292k4()).addItem(c11791os.m55427x1(), c11791os);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m63936k4(o8s o8sVar, List<coq> list, C11709bg c11709bg) {
        ipw ipwVarM64892k4 = o8sVar.m68384ne().m64892k4(c11709bg.m55292k4());
        if (ipwVarM64892k4 != null && C14113y2.m67411k4(ipwVarM64892k4.m63031to())) {
            ipwVarM64892k4.m63029k4(c11709bg.m55291h4());
        }
        coq coqVar = new coq(c11709bg.m55289du(), c11709bg.m55291h4(), c11709bg.m55292k4(), c11709bg.m55294m9());
        list.addItem(coqVar);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m63937k4(IEffect[] iEffectArr, float f) {
        for (IEffect iEffect : iEffectArr) {
            if (iEffect.getPresetClassType() == 4) {
                iEffect.getTiming().setRepeatCount(f);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m63938k4(C11785nh c11785nh) {
        C3152yj c3152yj = new C3152yj();
        c3152yj.write(c11785nh.m55354ar().m55426to(), 0, c11785nh.m55354ar().m55426to().length);
        c3152yj.seek(0L, 0);
        return AbstractC13912i5.m65463k4(c3152yj).m65480du("p:modifyVerifier");
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m63939k4(C11785nh c11785nh, String str) {
        C3152yj c3152yj = new C3152yj();
        c3152yj.write(c11785nh.m55354ar().m55426to(), 0, c11785nh.m55354ar().m55426to().length);
        c3152yj.seek(0L, 0);
        AbstractC13912i5 abstractC13912i5M65463k4 = AbstractC13912i5.m65463k4(c3152yj);
        if (abstractC13912i5M65463k4.m65480du("p:modifyVerifier")) {
            return eeo.m5510k4(str, new com.aspose.slides.internal.p332p7.i0y(abstractC13912i5M65463k4));
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public static C7394ca[] m63940k4(com.aspose.slides.internal.p332p7.rqz rqzVar, IShape iShape) {
        List list = new List();
        m63926k4((List<C7394ca>) list, rqzVar, iShape);
        return (C7394ca[]) list.toArray(new C7394ca[0]);
    }
}

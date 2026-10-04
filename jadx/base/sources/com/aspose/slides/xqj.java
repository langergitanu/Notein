package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.internal.p464vq.AbstractC11747gf;
import com.aspose.slides.internal.p464vq.C11709bg;
import com.aspose.slides.internal.p464vq.C11728dt;
import com.aspose.slides.internal.p464vq.C11791os;
import com.aspose.slides.internal.p464vq.C11848x3;
import com.aspose.slides.internal.p464vq.C11851xb;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class xqj {

    /* JADX INFO: renamed from: k4 */
    private gnb f50180k4;

    /* JADX INFO: renamed from: du */
    private void m73552du(C11851xb c11851xb, IPresentation iPresentation) {
        if (c11851xb.m55436rv() == null) {
            return;
        }
        new x7y().m73178k4(c11851xb.m55436rv().m55426to(), iPresentation);
        Presentation presentation = (Presentation) iPresentation;
        presentation.m2351fa().m68378k4(c11851xb.m55436rv().m55426to());
        presentation.m2351fa().m68368k4(((VbaProject) iPresentation.getVbaProject()).m3051k4());
        c11851xb.m55436rv().m55422k4(true);
    }

    /* JADX INFO: renamed from: h4 */
    private void m73553h4(C11851xb c11851xb, IPresentation iPresentation) {
        if (c11851xb.m55438x6() == null) {
            return;
        }
        ((Presentation) iPresentation).m2351fa().m68398x1(c11851xb.m55438x6().m55426to());
        c11851xb.m55438x6().m55422k4(true);
    }

    /* JADX INFO: renamed from: k4 */
    public static int m73554k4(float f) {
        if (f >= 80.0f) {
            return 3;
        }
        if (f >= 50.0f) {
            return 2;
        }
        return f >= 20.0f ? 1 : 0;
    }

    /* JADX INFO: renamed from: kk */
    private void m73564kk(C11851xb c11851xb, IPresentation iPresentation) {
        for (C11791os c11791os : c11851xb.m55388c5()) {
            if (C14113y2.m67448x1(c11791os.m55372fa().mo55273k4(), "video/")) {
                this.f50180k4.m6789kk(c11791os);
            }
        }
    }

    /* JADX INFO: renamed from: to */
    private void m73565to(C11851xb c11851xb, IPresentation iPresentation) {
        if (c11851xb.m55435ks() != null) {
            new np9(c11851xb.m55435ks(), this.f50180k4).m68155k4(iPresentation);
        }
    }

    /* JADX INFO: renamed from: x1 */
    private void m73566x1(C11851xb c11851xb, IPresentation iPresentation) {
        for (C11791os c11791os : c11851xb.m55388c5()) {
            if (C14113y2.m67448x1(c11791os.m55372fa().mo55273k4(), "audio/")) {
                this.f50180k4.m6798x1(c11791os);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m73555k4(List<C7394ca> list, C7394ca c7394ca, C7394ca c7394ca2, IShape iShape) {
        Shape shape;
        if (c7394ca == null || !"spTgt".equals(c7394ca.m29539k4()) || (shape = (Shape) C7019kk.m27452k4((Object) iShape, Shape.class)) == null || !C14113y2.m67363du(((com.aspose.slides.internal.p332p7.sdd) c7394ca.m29542x1()).m40964k4(), C13850af.m65147x1(shape.m2584wp()))) {
            return;
        }
        list.addItem(c7394ca2);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m73556k4(List<C7394ca> list, com.aspose.slides.internal.p332p7.rqz rqzVar, IShape iShape) {
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
                            m73556k4(list, lmhVarM63186k4.m36322wy(), iShape);
                        }
                        if (lmhVarM63186k4.m36277ak() != null) {
                            m73556k4(list, lmhVarM63186k4.m36277ak(), iShape);
                        }
                    }
                }
                ycbVarM42701h4 = v2zVarM33336x1.m42701h4();
            }
            m73555k4(list, ycbVarM42701h4.m44924k4(), c7394ca, iShape);
            if (!C13670j2.m63207x1(c7394ca.m29539k4())) {
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m73557k4(IAudioFrame iAudioFrame) {
        AbstractC0919dx abstractC0919dxMo400kk = ((BaseSlide) iAudioFrame.getSlide()).mo400kk();
        if (abstractC0919dxMo400kk.m5301k4() == null) {
            abstractC0919dxMo400kk.m5304k4(new com.aspose.slides.internal.p332p7.ehe());
        }
        C7394ca[] c7394caArrM73563k4 = m73563k4(abstractC0919dxMo400kk.m5301k4().m31097kk(), iAudioFrame);
        int length = c7394caArrM73563k4.length;
        com.aspose.slides.internal.p332p7.c6b c6bVar = null;
        int i = 0;
        while (true) {
            int i2 = 3;
            if (i >= length) {
                break;
            }
            C7394ca c7394ca = c7394caArrM73563k4[i];
            if (C7019kk.m27469x1(c7394ca.m29542x1(), com.aspose.slides.internal.p332p7.c6b.class)) {
                c6bVar = (com.aspose.slides.internal.p332p7.c6b) c7394ca.m29542x1();
                iAudioFrame.setHideAtShowing(!c6bVar.m29443x1().m42707to());
                iAudioFrame.setPlayLoopMode(C13670j2.m63183k4(c6bVar.m29443x1().m42700du().m36282ck()) == Float.POSITIVE_INFINITY);
                ((AudioFrame) iAudioFrame).setRewindAudio(c6bVar.m29443x1().m42700du().m36310ne() == 0);
                if (c6bVar.m29443x1().m42709x1()) {
                    iAudioFrame.setVolume(0);
                } else if (c6bVar.m29443x1().m42702k4() >= 80.0f) {
                    iAudioFrame.setVolume(i2);
                } else if (c6bVar.m29443x1().m42702k4() >= 50.0f) {
                    i2 = 2;
                    iAudioFrame.setVolume(i2);
                } else if (c6bVar.m29443x1().m42702k4() >= 20.0f) {
                    iAudioFrame.setVolume(1);
                }
            }
            i++;
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
        iAudioFrame.setPlayMode(-1);
        if (effectsByShape.length == 1 && list.size() == 0) {
            ((AudioFrame) C7019kk.m27452k4((Object) iAudioFrame, AudioFrame.class)).f210kk = effectsByShape[0].getTiming().getTriggerType() == 1 ? 3 : 0;
        } else if (list.size() == 1) {
            ((AudioFrame) C7019kk.m27452k4((Object) iAudioFrame, AudioFrame.class)).f210kk = 1;
        }
        if (c6bVar != null) {
            ((AudioFrame) C7019kk.m27452k4((Object) iAudioFrame, AudioFrame.class)).mo272to().m67910k4(c6bVar.m29442k4());
            if ((c6bVar.m29443x1().m42706kk() & 4294967295L) == 999) {
                iAudioFrame.setPlayAcrossSlides(true);
            }
        }
        if (c6bVar == null) {
            iAudioFrame.setVolume(-1);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m73558k4(IVideoFrame iVideoFrame) {
        jmb jmbVarMo268du = ((VideoFrame) iVideoFrame).mo268du();
        com.aspose.slides.internal.p332p7.ehe eheVarM5301k4 = ((BaseSlide) iVideoFrame.getSlide()).mo400kk().m5301k4();
        if (eheVarM5301k4 == null) {
            return;
        }
        C7394ca[] c7394caArrM73563k4 = m73563k4(eheVarM5301k4.m31097kk(), iVideoFrame);
        jmbVarMo268du.m63438k4(-1);
        com.aspose.slides.internal.p332p7.hgn hgnVar = null;
        for (C7394ca c7394ca : c7394caArrM73563k4) {
            if (C7019kk.m27469x1(c7394ca.m29542x1(), com.aspose.slides.internal.p332p7.hgn.class)) {
                hgnVar = (com.aspose.slides.internal.p332p7.hgn) c7394ca.m29542x1();
                iVideoFrame.setHideAtShowing(!hgnVar.m33336x1().m42707to());
                iVideoFrame.setPlayLoopMode(C13670j2.m63183k4(hgnVar.m33336x1().m42700du().m36282ck()) == Float.POSITIVE_INFINITY);
                iVideoFrame.setFullScreenMode(hgnVar.m33335k4());
                iVideoFrame.setRewindVideo(hgnVar.m33336x1().m42700du().m36310ne() == 0);
                if (hgnVar.m33336x1().m42709x1()) {
                    iVideoFrame.setVolume(0);
                } else {
                    iVideoFrame.setVolume(m73554k4(hgnVar.m33336x1().m42702k4()));
                }
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
            if (effectsByShape.length == 1 && list.size() == 1) {
                if (hgnVar != null) {
                    jmbVarMo268du.m63438k4((hgnVar.m33336x1().m42706kk() & 4294967295L) == 999 ? 2 : effectsByShape[0].getTiming().getTriggerType() == 1 ? 3 : 0);
                } else {
                    jmbVarMo268du.m63438k4(0);
                }
            } else if (list.size() == 1) {
                jmbVarMo268du.m63438k4(1);
            }
            if (hgnVar == null) {
                iVideoFrame.setVolume(-1);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m73567k4(Presentation presentation, AbstractC3150x6 abstractC3150x6, C1209hm c1209hm, InterruptionToken interruptionToken) {
        try {
            C11851xb c11851xb = new C11851xb(abstractC3150x6, false);
            if (c11851xb.m55439yj().size() != 0) {
                for (int i = 0; i < c11851xb.m55439yj().size(); i++) {
                    this.f50180k4 = new gnb(presentation, interruptionToken);
                    presentation.m2351fa().m68366k4(lxj.m64612k4(c11851xb.m55439yj().get_Item(i).m55372fa().mo55273k4(), 0));
                    m73560k4(c11851xb, presentation);
                    m73566x1(c11851xb, presentation);
                    m73564kk(c11851xb, presentation);
                    m73565to(c11851xb, presentation);
                    m73562k4(c11851xb, this.f50180k4);
                    m73559k4(c11851xb.m55439yj().get_Item(i), presentation);
                    m73552du(c11851xb, presentation);
                    m73553h4(c11851xb, presentation);
                    m73561k4(c11851xb, presentation, this.f50180k4);
                    if (i < c11851xb.m55439yj().size() - 1) {
                        presentation = c1209hm.m7225x1().m72347x1();
                    }
                }
                return;
            }
            this.f50180k4 = new gnb(presentation, interruptionToken);
            m73565to(c11851xb, presentation);
            MasterSlide masterSlideM73631k4 = xxd.m73631k4(presentation);
            vtn.m72529k4(masterSlideM73631k4, (byte) 0);
            vtn.m72529k4(masterSlideM73631k4, (byte) 15);
            vtn.m72529k4(masterSlideM73631k4, (byte) 31);
            vtn.m72529k4(masterSlideM73631k4, (byte) 28);
            vtn.m72529k4(masterSlideM73631k4, (byte) 32);
            vtn.m72529k4(masterSlideM73631k4, (byte) 10);
            vtn.m72529k4(masterSlideM73631k4, (byte) 11);
            vtn.m72529k4(masterSlideM73631k4, (byte) 33);
            vtn.m72529k4(masterSlideM73631k4, (byte) 34);
            vtn.m72529k4(masterSlideM73631k4, (byte) 24);
            vtn.m72529k4(masterSlideM73631k4, (byte) 26);
            ((Background) masterSlideM73631k4.getBackground()).getStyleColor().setSchemeColor(2);
            C13682je c13682jeM423to = ((BaseThemeManager) masterSlideM73631k4.getThemeManager()).m423to();
            c13682jeM423to.m63290k4(0, (byte) 0);
            c13682jeM423to.m63290k4(1, (byte) 1);
            c13682jeM423to.m63290k4(2, (byte) 2);
            c13682jeM423to.m63290k4(3, (byte) 3);
            c13682jeM423to.m63290k4(4, (byte) 4);
            c13682jeM423to.m63290k4(5, (byte) 5);
            c13682jeM423to.m63290k4(6, (byte) 6);
            c13682jeM423to.m63290k4(7, (byte) 7);
            c13682jeM423to.m63290k4(8, (byte) 8);
            c13682jeM423to.m63290k4(9, (byte) 9);
            c13682jeM423to.m63290k4(10, (byte) 10);
            c13682jeM423to.m63290k4(11, (byte) 11);
            ((Background) masterSlideM73631k4.getBackground()).setStyleIndex(3);
            ((FillFormat) ((TextStyle) masterSlideM73631k4.getTitleStyle()).m2990to()[1].m2204to().getFillFormat()).getSolidFillColor().setSchemeColor(3);
            ((MasterSlideCollection) presentation.getMasters()).m1949k4(masterSlideM73631k4);
            masterSlideM73631k4.m382c5();
        } catch (RuntimeException e) {
            if (!C7019kk.m27469x1(e, C11848x3.class)) {
                throw new PptxReadException(e.getMessage(), e);
            }
            throw new PptxUnsupportedFormatException(e.getMessage(), e);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m73559k4(C11791os c11791os, IPresentation iPresentation) {
        new nps(c11791os, this.f50180k4).m68165k4(iPresentation);
    }

    /* JADX INFO: renamed from: k4 */
    private void m73560k4(C11851xb c11851xb, IPresentation iPresentation) {
        for (C11791os c11791os : c11851xb.m55393jd()) {
            for (C11791os c11791os2 : c11791os.m55374k4(AbstractC11747gf.f39744k4)) {
                this.f50180k4.m6781k4(c11791os2);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m73561k4(C11851xb c11851xb, IPresentation iPresentation, gnb gnbVar) {
        List.Enumerator<IShape> it = gnbVar.m6774ck().iterator();
        while (it.hasNext()) {
            try {
                IShape next = it.next();
                if (C7019kk.m27469x1(next, IAudioFrame.class)) {
                    m73557k4((IAudioFrame) next);
                } else if (C7019kk.m27469x1(next, IVideoFrame.class)) {
                    m73558k4((IVideoFrame) next);
                } else if (C7019kk.m27469x1(next, IAutoShape.class)) {
                    ((AutoShape) next).mo277dy();
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

    /* JADX INFO: renamed from: k4 */
    public static void m73562k4(C11851xb c11851xb, gnb gnbVar) {
        for (C11791os c11791os : c11851xb.m55437up()) {
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
    public static C7394ca[] m73563k4(com.aspose.slides.internal.p332p7.rqz rqzVar, IShape iShape) {
        List list = new List();
        m73556k4((List<C7394ca>) list, rqzVar, iShape);
        return (C7394ca[]) list.toArray(new C7394ca[0]);
    }
}

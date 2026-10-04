package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.exceptions.NullReferenceException;
import com.aspose.slides.internal.p077d8.C3038bv;
import com.aspose.slides.internal.p077d8.C3041c6;
import com.aspose.slides.internal.p077d8.C3052g8;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p077d8.C3092um;
import com.aspose.slides.internal.p077d8.C3095v4;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p085dk.AbstractC3174jd;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C8967uo;
import com.aspose.slides.internal.p407st.AbstractC10376bv;
import com.aspose.slides.internal.p407st.AbstractC10456gv;
import com.aspose.slides.internal.p407st.AbstractC10539m9;
import com.aspose.slides.internal.p407st.AbstractC10571o4;
import com.aspose.slides.internal.p407st.C10358am;
import com.aspose.slides.internal.p407st.C10431f3;
import com.aspose.slides.internal.p407st.C10462h9;
import com.aspose.slides.internal.p407st.C10463hc;
import com.aspose.slides.internal.p407st.C10470hq;
import com.aspose.slides.internal.p407st.C10487j0;
import com.aspose.slides.internal.p407st.C10491j8;
import com.aspose.slides.internal.p407st.C10503k4;
import com.aspose.slides.internal.p407st.C10511kn;
import com.aspose.slides.internal.p407st.C10553n2;
import com.aspose.slides.internal.p407st.C10556n5;
import com.aspose.slides.internal.p407st.C10562nk;
import com.aspose.slides.internal.p407st.C10567nz;
import com.aspose.slides.internal.p407st.C10584p5;
import com.aspose.slides.internal.p407st.C10609qn;
import com.aspose.slides.internal.p407st.C10610qp;
import com.aspose.slides.internal.p407st.C10611qq;
import com.aspose.slides.internal.p407st.C10626rv;
import com.aspose.slides.internal.p407st.C10629s2;
import com.aspose.slides.internal.p407st.C10635sd;
import com.aspose.slides.internal.p407st.C10636sf;
import com.aspose.slides.internal.p407st.C10683vm;
import com.aspose.slides.internal.p407st.C10703x1;
import com.aspose.slides.internal.p407st.C10740z0;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.internal.p464vq.C11708b5;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12016rv;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14052dq;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14114y9;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.InterfaceC14073kp;
import com.aspose.slides.p559ms.System.Xml.AbstractC13943n5;
import com.aspose.slides.p559ms.System.Xml.C13938ms;
import com.huawei.hms.network.embedded.C18177fb;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.i5 */
/* JADX INFO: loaded from: classes3.dex */
class C1240i5 {
    /* JADX INFO: renamed from: c5 */
    private static void m7443c5(rpo rpoVar) {
        IControlCollection controls = rpoVar.m70235x1().getControls();
        for (int i = 0; i < controls.size(); i++) {
            k3x.m63630k4(new vpe((Control) controls.get_Item(i), rpoVar.m70210h4()));
        }
    }

    /* JADX INFO: renamed from: ck */
    private static void m7444ck(rpo rpoVar) {
        Shape shapeMo64936jd;
        BaseSlide baseSlideM70235x1 = rpoVar.m70235x1();
        com.aspose.slides.internal.p332p7.ehe eheVarM70240yd = rpoVar.m70240yd();
        SortedList sortedList = new SortedList();
        List.Enumerator<uz3> it = rpoVar.m70205c5().iterator();
        while (it.hasNext()) {
            try {
                uz3 next = it.next();
                if (next.m3744m9() && (shapeMo64936jd = next.mo64936jd()) != null) {
                    sortedList.set_Item(C14114y9.m67459k4(shapeMo64936jd.m2584wp(), (InterfaceC14073kp) C11697x1.m55250kk()), shapeMo64936jd);
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        rpoVar.m70216k4(new gi8(m7452k4((SortedList<String, ISlideComponent>) sortedList), rpoVar.m70215k4()));
        C13670j2.m63195k4(baseSlideM70235x1.getTimeline(), baseSlideM70235x1.getShapes(), eheVarM70240yd, rpoVar.m70203b3());
    }

    /* JADX INFO: renamed from: du */
    private static void m7445du(m4c m4cVar) {
        int iM64714fa = m4cVar.m64714fa();
        if (iM64714fa == 0 || iM64714fa == 1) {
            f8s.m6048k4(m4cVar);
        } else if (iM64714fa == 5 || iM64714fa == 7) {
            f8s.m6052x1(m4cVar);
        } else {
            f8s.m6051kk(m4cVar);
        }
        td3.m71114x1(m4cVar);
        m4cVar.m64719k4();
    }

    /* JADX INFO: renamed from: dy */
    private static void m7447dy(m4c m4cVar) {
        Connector connector;
        C10635sd c10635sdM64716ix = m4cVar.m64716ix();
        if (c10635sdM64716ix != null) {
            List.Enumerator<AbstractC10571o4> it = c10635sdM64716ix.m50513yj().iterator();
            while (it.hasNext()) {
                try {
                    C10463hc c10463hc = (C10463hc) C7019kk.m27452k4((Object) it.next(), C10463hc.class);
                    if (c10463hc != null && m4cVar.m64738wl().containsKey(Long.valueOf(c10463hc.m50889to())) && m4cVar.m64738wl().get_Item(Long.valueOf(c10463hc.m50889to())).m69492rv() && (connector = (Connector) C7019kk.m27452k4((Object) m4cVar.m64738wl().get_Item(Long.valueOf(c10463hc.m50889to())).m69481du().m70148u4(), Connector.class)) != null) {
                        if (connector.getStartShapeConnectedTo() == null && (c10463hc.m50891x1() & 4294967295L) > 0 && m4cVar.m64738wl().containsKey(Long.valueOf(c10463hc.m50891x1()))) {
                            qah qahVar = m4cVar.m64738wl().get_Item(Long.valueOf(c10463hc.m50891x1()));
                            if (qahVar.m69482dy() != 8 && qahVar.m69482dy() != 6) {
                                IShape iShape = (IShape) C7019kk.m27452k4((Object) qahVar.m69481du().m70148u4(), IShape.class);
                                if (iShape != null && iShape.getConnectionSiteCount() > 0) {
                                    connector.m1219k4(iShape);
                                    if (c10463hc.m50883du() > 0 && c10463hc.m50883du() < iShape.getConnectionSiteCount()) {
                                        connector.m1218k4(((long) c10463hc.m50883du()) & 4294967295L);
                                    }
                                }
                            }
                        }
                        if (connector.getEndShapeConnectedTo() == null && (c10463hc.m50887kk() & 4294967295L) > 0 && m4cVar.m64738wl().containsKey(Long.valueOf(c10463hc.m50887kk()))) {
                            qah qahVar2 = m4cVar.m64738wl().get_Item(Long.valueOf(c10463hc.m50887kk()));
                            if (qahVar2.m69482dy() != 8 && qahVar2.m69482dy() != 6) {
                                IShape iShape2 = (IShape) C7019kk.m27452k4((Object) qahVar2.m69481du().m70148u4(), IShape.class);
                                if (iShape2 != null && iShape2.getConnectionSiteCount() > 0) {
                                    connector.m1222x1(iShape2);
                                    if (c10463hc.m50884h4() > 0 && c10463hc.m50884h4() < iShape2.getConnectionSiteCount()) {
                                        connector.m1221x1(((long) c10463hc.m50884h4()) & 4294967295L);
                                    }
                                }
                            }
                        }
                        connector.m1220kk();
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
    }

    /* JADX INFO: renamed from: h4 */
    private static void m7449h4(m4c m4cVar) {
        AbstractC1165gx abstractC1165gxMo404to = m4cVar.m64735up().mo404to();
        C10567nz c10567nzM51756du = m4cVar.m64717jd().m51756du();
        if (c10567nzM51756du != null) {
            if (c10567nzM51756du.m51389to() != null) {
                abstractC1165gxMo404to.m6941k4(c10567nzM51756du.m51389to().m51002x1());
                abstractC1165gxMo404to.m6935k4(c10567nzM51756du.m51389to().m50996du());
                abstractC1165gxMo404to.m6942k4(c10567nzM51756du.m51389to().m50998h4());
                abstractC1165gxMo404to.m6939k4(c10567nzM51756du.m51389to().m51000m9());
                abstractC1165gxMo404to.m6938k4(c10567nzM51756du.m51389to().m50997dy());
                abstractC1165gxMo404to.m6937k4(c10567nzM51756du.m51389to().m50994c5());
                abstractC1165gxMo404to.m6936k4(c10567nzM51756du.m51389to().m50995ck());
                m7454k4(m4cVar.m64735up(), c10567nzM51756du.m51389to().m51001to(), m4cVar.m64712du().m71946k4());
            }
            if (c10567nzM51756du.m51387du() != null) {
                abstractC1165gxMo404to.m6940k4(c10567nzM51756du.m51387du().m51463x1());
            }
        }
    }

    /* JADX INFO: renamed from: jd */
    private static void m7451jd(rpo rpoVar) {
        BaseSlide baseSlideM70235x1 = rpoVar.m70235x1();
        AbstractC10376bv abstractC10376bvM70228to = rpoVar.m70228to();
        C10567nz c10567nz = new C10567nz();
        abstractC10376bvM70228to.m50507k4(c10567nz);
        m7459k4(c10567nz, baseSlideM70235x1.mo404to().m6944to());
        C13658is.m63093x1(baseSlideM70235x1.getCustomData(), c10567nz);
        C10610qp c10610qp = new C10610qp();
        c10567nz.m50513yj().addItem(c10610qp);
        C10626rv c10626rv = new C10626rv("___PPT10", (short) 0);
        c10626rv.m51409um().m51920k4((short) 0);
        c10610qp.m50513yj().addItem(c10626rv);
        C10491j8 c10491j8 = new C10491j8();
        c10610qp.m50513yj().addItem(c10491j8);
        c10491j8.m51409um().m51916k4((byte) 0);
        c10491j8.m51409um().m51920k4((short) 0);
        ICommentAuthorCollection commentAuthors = rpoVar.m70215k4().m71946k4().getCommentAuthors();
        if (commentAuthors != null) {
            IGenericEnumerator<IComment> it = commentAuthors.iterator();
            while (it.hasNext()) {
                try {
                    it = it.next().getComments().iterator();
                    while (it.hasNext()) {
                        try {
                            Comment comment = (Comment) it.next();
                            if (((Slide) comment.getSlide()) == baseSlideM70235x1) {
                                C10611qq c10611qq = new C10611qq();
                                c10491j8.m50513yj().addItem(c10611qq);
                                m7455k4(comment, c10611qq, rpoVar.m70215k4());
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
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                it.dispose();
            }
        }
        Slide slide = (Slide) C7019kk.m27452k4((Object) baseSlideM70235x1, Slide.class);
        if (slide != null && !slide.m2708ne().m70262dy()) {
            C10636sf c10636sf = new C10636sf();
            c10636sf.m51675k4(2);
            c10491j8.m50513yj().addItem(c10636sf);
        }
        C10629s2 c10629s2 = new C10629s2();
        c10629s2.m51409um().m51916k4((byte) 0);
        c10629s2.m51409um().m51920k4((short) 0);
        c10491j8.m50513yj().addItem(c10629s2);
        m7461k4(c10491j8, rpoVar);
    }

    /* JADX INFO: renamed from: k4 */
    private static Dictionary<IShape, Long> m7452k4(SortedList<String, ISlideComponent> sortedList) {
        Dictionary<IShape, Long> dictionary = new Dictionary<>();
        IGenericEnumerator<KeyValuePair<String, ISlideComponent>> it = sortedList.iterator();
        while (it.hasNext()) {
            try {
                Shape shape = (Shape) C7019kk.m27452k4((Object) it.next().getValue(), Shape.class);
                if (shape != null) {
                    dictionary.addItem(shape, Long.valueOf(shape.m2584wp()));
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return dictionary;
    }

    /* JADX INFO: renamed from: kk */
    private static void m7466kk(final m4c m4cVar) {
        C10556n5 c10556n5;
        Class cls;
        BaseSlide baseSlideM64735up = m4cVar.m64735up();
        try {
            C8967uo c8967uo = new C8967uo();
            wrl.m72907k4(c8967uo, m4cVar);
            C14323q1.m69358k4(c8967uo, m4cVar);
            int i = 0;
            C13670j2.m63196k4(baseSlideM64735up.getTimeline(), c8967uo.m42508jd(), new yqd(m4cVar.m64712du(), m7453k4(m4cVar, false)));
            if (c8967uo.m42508jd() == null && m4cVar.m64730qq().size() > 0) {
                SortedList sortedList = new SortedList();
                List list = new List();
                Dictionary.KeyCollection.Enumerator<IShape, C10703x1> it = m4cVar.m64730qq().getKeys().iterator();
                while (it.hasNext()) {
                    try {
                        IShape next = it.next();
                        C10503k4 c10503k4M51965x1 = m4cVar.m64730qq().get_Item(next).m51965x1();
                        if (sortedList.containsKey(Integer.valueOf(c10503k4M51965x1.m51069dy()))) {
                            list.addItem(next);
                        } else {
                            sortedList.addItem(Integer.valueOf(c10503k4M51965x1.m51069dy()), next);
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
                IGenericEnumerator<T> it2 = sortedList.getKeys().iterator();
                int i2 = 0;
                while (true) {
                    try {
                        boolean zHasNext = it2.hasNext();
                        cls = Integer.TYPE;
                        if (!zHasNext) {
                            break;
                        }
                        int iIntValue = ((Integer) C7019kk.m27464to(it2.next(), cls)).intValue();
                        if (i2 < iIntValue) {
                            i2 = iIntValue;
                        }
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                            it2.dispose();
                        }
                    }
                }
                List.Enumerator it3 = list.iterator();
                while (it3.hasNext()) {
                    try {
                        i2++;
                        sortedList.addItem(Integer.valueOf(i2), (IShape) it3.next());
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                            it3.dispose();
                        }
                    }
                }
                it2 = sortedList.getKeys().iterator();
                while (it2.hasNext()) {
                    try {
                        Integer num = (Integer) C7019kk.m27464to(it2.next(), cls);
                        num.intValue();
                        IShape iShape = (IShape) sortedList.get_Item(num);
                        blo.m4247k4(iShape, baseSlideM64735up.getTimeline(), m4cVar.m64730qq().get_Item(iShape).m51965x1(), i, m4cVar.m64712du());
                        i++;
                    } finally {
                    }
                }
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            } else if (baseSlideM64735up.getTimeline().getMainSequence().getCount() == 0 && baseSlideM64735up.getTimeline().getInteractiveSequences().getCount() == 0 && (c10556n5 = (C10556n5) C7019kk.m27452k4((Object) m4cVar.m64717jd(), C10556n5.class)) != null && c10556n5.m51361u4() != null && c10556n5.m51358ix() != null) {
                try {
                    C11708b5 c11708b5 = new C11708b5(new C3152yj(c10556n5.m51361u4().mo51148to()), new AbstractC3174jd() { // from class: com.aspose.slides.i5.1
                        @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                        public String getDelegateId() {
                            return System.identityHashCode(m4cVar.m64712du().m71955yj()) + "Aspose.Slides.InterruptionToken.ThrowIfInterruptionRequested()";
                        }

                        @Override // com.aspose.slides.internal.p085dk.AbstractC3174jd
                        /* JADX INFO: renamed from: k4 */
                        public void mo4791k4() {
                            m4cVar.m64712du().m71955yj().throwIfInterruptionRequested();
                        }
                    });
                    if (c11708b5.m55283u4() != null) {
                        C13938ms c13938ms = new C13938ms(new C3152yj(c11708b5.m55283u4().m55426to()));
                        c13938ms.m65615k4((AbstractC13943n5) null);
                        C8967uo c8967uo2 = new C8967uo(c13938ms);
                        try {
                            C13670j2.m63196k4(baseSlideM64735up.getTimeline(), c8967uo2.m42508jd(), new yqd(m4cVar.m64712du(), m7453k4(m4cVar, true)));
                        } catch (RuntimeException unused) {
                        }
                        c8967uo = c8967uo2;
                    }
                } catch (RuntimeException unused2) {
                }
            }
            if (c8967uo.m42508jd() != null) {
                AbstractC0919dx abstractC0919dxMo400kk = baseSlideM64735up.mo400kk();
                abstractC0919dxMo400kk.m5305k4(c8967uo.m42508jd().m31098to());
                abstractC0919dxMo400kk.m5303k4(c8967uo.m42508jd().m31092du());
                abstractC0919dxMo400kk.m5304k4(c8967uo.m42508jd());
            }
        } catch (InvalidOperationException e) {
            e = e;
            m4cVar.m64712du().m3185k4("Loading of the animation info failed.", 1);
            C3085sv.m13082k4(e);
            m7456k4(baseSlideM64735up.getTimeline());
        } catch (NotImplementedException e2) {
            e = e2;
            m4cVar.m64712du().m3185k4("Loading of the animation info failed.", 1);
            C3085sv.m13082k4(e);
            m7456k4(baseSlideM64735up.getTimeline());
        }
    }

    /* JADX INFO: renamed from: m9 */
    private static void m7468m9(m4c m4cVar) {
        cct cctVarM64731rv = m4cVar.m64731rv();
        if (cctVarM64731rv == null) {
            return;
        }
        C14566tl.m71242k4(cctVarM64731rv);
        BaseSlide baseSlideM64735up = m4cVar.m64735up();
        if (baseSlideM64735up.getBackground() == null || m4cVar.m64710ck() == null || !m4cVar.m64710ck().m51116to()) {
            return;
        }
        baseSlideM64735up.getBackground().setType((byte) -1);
    }

    /* JADX INFO: renamed from: to */
    private static void m7470to(m4c m4cVar) {
        if (m4cVar.m64710ck() == null) {
            return;
        }
        if (m4cVar.m64714fa() > 1 && m4cVar.m64714fa() != 7 && m4cVar.m64714fa() != 5) {
            m4cVar.m64735up().setShowMasterShapes(m4cVar.m64710ck().m51118x1());
        }
        if (C7019kk.m27452k4((Object) m4cVar.m64735up(), Slide.class) != null) {
            ((Slide) m4cVar.m64735up()).m2688ix().m5782x1(m4cVar.m64710ck().m51115kk());
        }
        if (C7019kk.m27452k4((Object) m4cVar.m64735up(), LayoutSlide.class) != null) {
            ((LayoutSlide) m4cVar.m64735up()).m1848ne().m5782x1(m4cVar.m64710ck().m51115kk());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x1 */
    public static void m7472x1(m4c m4cVar) {
        BaseSlide baseSlideM64735up = m4cVar.m64735up();
        SortedList sortedList = new SortedList();
        sortedList.addItem(Long.valueOf(baseSlideM64735up.f1077kk.m2584wp()), baseSlideM64735up.f1077kk);
        List list = new List();
        m7457k4(baseSlideM64735up.f1077kk.getShapes(), (SortedList<Long, Shape>) sortedList, (List<Shape>) list);
        IGenericEnumerator<T> it = sortedList.getKeys().iterator();
        long j = 0;
        while (it.hasNext()) {
            try {
                long jLongValue = ((Long) C7019kk.m27464to(it.next(), Long.TYPE)).longValue();
                if ((j & 4294967295L) < (jLongValue & 4294967295L)) {
                    j = jLongValue;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        baseSlideM64735up.m395k4(((j & 4294967295L) + 1) & 4294967295L, false);
        List.Enumerator it2 = list.iterator();
        while (it2.hasNext()) {
            try {
                ((Shape) it2.next()).m2577to(baseSlideM64735up.m388jd());
            } finally {
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            }
        }
        baseSlideM64735up.f1084x1.m5437k4(baseSlideM64735up);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0067  */
    /* JADX INFO: renamed from: du */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void m7446du(rpo rpoVar) {
        Dictionary dictionary = new Dictionary();
        List list = new List();
        List.Enumerator<kiv> it = rpoVar.m70222ks().iterator();
        while (true) {
            try {
                int i = 0;
                if (!it.hasNext()) {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                    List.Enumerator it2 = list.iterator();
                    while (it2.hasNext()) {
                        try {
                            kiv kivVar = (kiv) it2.next();
                            while (dictionary.containsKey(Integer.valueOf(i))) {
                                i++;
                            }
                            kivVar.m63907kk(i);
                            dictionary.addItem(Integer.valueOf(i), kivVar);
                            i++;
                        } finally {
                            if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                                it2.dispose();
                            }
                        }
                    }
                    if (rpoVar.m70220kk() == 2) {
                        m7450h4(rpoVar);
                        return;
                    }
                    return;
                }
                kiv next = it.next();
                if (next.m63911x1().m3744m9()) {
                    byte type = next.m63906kk().getType();
                    int i2 = type != 4 ? type != 5 ? type != 6 ? type != 7 ? -1 : 0 : 3 : 4 : 2;
                    if (i2 >= 0) {
                        i = i2;
                        if (i >= 0 || dictionary.containsKey(Integer.valueOf(i))) {
                            list.addItem(next);
                        } else {
                            next.m63907kk(i);
                            dictionary.addItem(Integer.valueOf(i), next);
                        }
                    } else {
                        int iM63899du = next.m63899du();
                        if (iM63899du != 1) {
                            if (iM63899du == 2) {
                                i = 1;
                            } else if (iM63899du != 3) {
                                if (iM63899du != 4 && iM63899du != 6) {
                                    if (iM63899du != 17) {
                                        if (iM63899du != 18) {
                                            switch (iM63899du) {
                                                case 12:
                                                case 14:
                                                    break;
                                                case 13:
                                                case 15:
                                                    break;
                                                default:
                                                    i = i2;
                                                    break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (i >= 0) {
                        }
                        list.addItem(next);
                    }
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: dy */
    private static void m7448dy(rpo rpoVar) {
        boolean z = rpoVar.m70212jd() == null && rpoVar.m70206ck() == null;
        C10487j0 c10487j0M70212jd = rpoVar.m70212jd();
        List.Enumerator<kiv> it = rpoVar.m70222ks().iterator();
        int i = 0;
        while (it.hasNext()) {
            try {
                kiv next = it.next();
                boolean z2 = next.m63899du() != 0;
                if (next.m63901h4() == -1 && z) {
                    z2 = false;
                }
                if (next.m63911x1().m3744m9() && z2) {
                    next.m63902k4();
                    if (c10487j0M70212jd != null && i < 8 && next.m63909to() == 0) {
                        c10487j0M70212jd.m50979dy()[i] = next.m63899du();
                        i++;
                    }
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: h4 */
    private static void m7450h4(rpo rpoVar) {
        int size = rpoVar.m70205c5().size();
        int i = size - 1;
        while (size > 0) {
            size--;
            uz3 uz3Var = rpoVar.m70205c5().get_Item(size);
            if (uz3Var.m3744m9() && uz3Var.m72008uz() != null && size < i) {
                rpoVar.m70205c5().removeAt(size);
                rpoVar.m70205c5().insertItem(i, uz3Var);
                i--;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static SortedList<String, ISlideComponent> m7453k4(m4c m4cVar, boolean z) {
        SortedList<String, ISlideComponent> sortedList = new SortedList<>(m4cVar.m64736uz().size());
        IGenericEnumerator<qah> it = m4cVar.m64736uz().iterator();
        while (it.hasNext()) {
            try {
                m7463k4(it.next(), sortedList, z);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return sortedList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: kk */
    private static void m7467kk(rpo rpoVar) {
        List list = new List();
        m7471to(rpoVar);
        m7446du(rpoVar);
        m7469m9(rpoVar);
        m7444ck(rpoVar);
        rpo rpoVarM70214k4 = rpoVar.m70214k4(0);
        List.Enumerator<uz3> it = rpoVar.m70205c5().iterator();
        while (it.hasNext()) {
            try {
                uz3 next = it.next();
                rpoVar.m70215k4().m71955yj().throwIfInterruptionRequested();
                if (next.m3744m9()) {
                    if (next.m72011wy()) {
                        list.addItem(next);
                    }
                    m7458k4(next);
                    if (next.m72008uz() == null) {
                        if (rpoVar.m70239x6()) {
                            rpoVar.m70219k4(next);
                        }
                        if (rpoVar.m70220kk() == 2 && rpoVarM70214k4.m70208dy().containsKey(next.mo64936jd())) {
                            C10358am c10358amM72007um = rpoVarM70214k4.m70208dy().get_Item(next.mo64936jd()).m72007um();
                            next.m72007um().m50507k4(c10358amM72007um.m50432ne());
                            next.m72007um().m50507k4(c10358amM72007um.m50433rv());
                        }
                    }
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
        List.Enumerator it2 = list.iterator();
        while (it2.hasNext()) {
            try {
                ((uz3) it2.next()).mo64938yj();
            } finally {
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
            it2.dispose();
        }
        m7448dy(rpoVar);
        it2 = rpoVar.m70205c5().iterator();
        while (it2.hasNext()) {
            try {
                uz3 next2 = it2.next();
                if (next2.m3744m9()) {
                    next2.mo5827dy();
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: m9 */
    private static void m7469m9(rpo rpoVar) {
        rpo rpoVarM70214k4;
        Dictionary dictionary;
        C10553n2 c10553n2;
        Object obj;
        kiv kivVar;
        int iM70220kk = rpoVar.m70220kk();
        if (iM70220kk == 4) {
            rpoVarM70214k4 = rpoVar.m70214k4(rpoVar.m70204bv() ? 2 : 3);
            dictionary = new Dictionary();
            int size = rpoVarM70214k4.m70222ks().size();
            while (size > 0) {
                size--;
                kiv kivVar2 = rpoVarM70214k4.m70222ks().get_Item(size);
                if (kivVar2.m63900dy()) {
                    break;
                } else {
                    dictionary.addItem(Long.valueOf(kivVar2.m63906kk().getIndex()), kivVar2);
                }
            }
            if (rpoVarM70214k4.m70234wl()) {
                rpoVarM70214k4 = rpoVar.m70214k4(0);
            }
        } else {
            if (iM70220kk != 6) {
                return;
            }
            rpoVarM70214k4 = rpoVar.m70214k4(5);
            dictionary = null;
        }
        if (rpoVarM70214k4 == null) {
            throw new NullReferenceException("No parent slides found for inheritance from " + C14067j2.m66727k4(rpoVar.m70235x1()));
        }
        Dictionary dictionary2 = new Dictionary();
        Dictionary dictionary3 = new Dictionary();
        List.Enumerator<kiv> it = rpoVarM70214k4.m70222ks().iterator();
        while (it.hasNext()) {
            try {
                kiv next = it.next();
                if (next.m63911x1().m3744m9()) {
                    boolean zM7184x1 = hi8.m7184x1(next.m63906kk());
                    if (zM7184x1) {
                        if (dictionary3.containsKey(Byte.valueOf(next.m63906kk().getType()))) {
                            dictionary3.set_Item(Byte.valueOf(next.m63906kk().getType()), next);
                        } else {
                            dictionary3.addItem(Byte.valueOf(next.m63906kk().getType()), next);
                        }
                    }
                    if (!dictionary2.containsKey(Long.valueOf(next.m63906kk().getIndex()))) {
                        dictionary2.addItem(Long.valueOf(next.m63906kk().getIndex()), next);
                    } else if (!zM7184x1) {
                        dictionary2.set_Item(Long.valueOf(next.m63906kk().getIndex()), next);
                    }
                }
            } finally {
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        it = rpoVar.m70222ks().iterator();
        while (it.hasNext()) {
            try {
                kiv next2 = it.next();
                if (next2.m63909to() == 0) {
                    uz3 uz3VarM63911x1 = next2.m63911x1();
                    Placeholder placeholderM63906kk = next2.m63906kk();
                    if (dictionary == null || !dictionary.containsKey(Long.valueOf(placeholderM63906kk.getIndex()))) {
                        c10553n2 = null;
                    } else {
                        kiv kivVar3 = (kiv) dictionary.get_Item(Long.valueOf(placeholderM63906kk.getIndex()));
                        c10553n2 = new C10553n2();
                        c10553n2.m51347k4(kivVar3.m63911x1().mo64936jd().m2584wp());
                        Placeholder placeholderM63906kk2 = kivVar3.m63906kk();
                        uz3VarM63911x1.m3741k4(kivVar3.m63911x1());
                        next2.m63904k4(kivVar3.m63911x1());
                        placeholderM63906kk = placeholderM63906kk2;
                    }
                    if (hi8.m7184x1(placeholderM63906kk)) {
                        if (dictionary3.containsKey(Byte.valueOf(placeholderM63906kk.getType()))) {
                            obj = dictionary3.get_Item(Byte.valueOf(placeholderM63906kk.getType()));
                            kivVar = (kiv) obj;
                        }
                        kivVar = null;
                    } else {
                        if (dictionary2.containsKey(Long.valueOf(placeholderM63906kk.getIndex()))) {
                            obj = dictionary2.get_Item(Long.valueOf(placeholderM63906kk.getIndex()));
                            kivVar = (kiv) obj;
                        }
                        kivVar = null;
                    }
                    if (kivVar != null) {
                        uz3VarM63911x1.m3741k4(kivVar.m63911x1());
                        long jM52045x1 = kivVar.m63911x1().m72010wl().m52045x1();
                        uz3VarM63911x1.m72010wl().m52033h4(true);
                        uz3VarM63911x1.m72004qq().m51263x1().m50926k4(new C10609qn(769, jM52045x1));
                    }
                    if (c10553n2 != null) {
                        uz3VarM63911x1.m72007um().m50507k4(c10553n2);
                    }
                    if (rpoVar.m70220kk() == 4) {
                        next2.m63907kk(-1);
                    }
                }
            } finally {
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: to */
    private static void m7471to(rpo rpoVar) {
        List.Enumerator it;
        boolean zM27456k4;
        List.Enumerator it2;
        if ((rpoVar.m70220kk() == 3 || rpoVar.m70220kk() == 2) && !rpoVar.m70234wl()) {
            boolean zM70204bv = rpoVar.m70204bv();
            int size = rpoVar.m70222ks().size();
            List list = new List();
            List list2 = new List();
            for (int i = 0; i < size; i++) {
                kiv kivVar = rpoVar.m70222ks().get_Item(i);
                kivVar.m63911x1().m3742k4(!(kivVar.m63900dy() ^ zM70204bv));
                if (hi8.m7179k4(kivVar.m63906kk())) {
                    kivVar.m63911x1().m3742k4(true ^ kivVar.m63900dy());
                }
                AutoShape autoShape = (AutoShape) C7019kk.m27452k4((Object) kivVar.m63911x1().mo64936jd(), AutoShape.class);
                if (autoShape != null && autoShape.getTextFrame() != null) {
                    autoShape.getTextFrame().getText();
                }
                if (kivVar.m63900dy()) {
                    list.addItem(kivVar);
                } else {
                    list2.addItem(kivVar);
                }
            }
            if (!zM70204bv) {
                it = list.iterator();
                while (it.hasNext()) {
                    try {
                        kiv kivVar2 = (kiv) it.next();
                        if (hi8.m7179k4(kivVar2.m63906kk())) {
                            kivVar2.m63911x1().m3742k4(false);
                            it = list2.iterator();
                            while (true) {
                                try {
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    kiv kivVar3 = (kiv) it.next();
                                    if (kivVar2.m63906kk().getType() == kivVar3.m63906kk().getType()) {
                                        kivVar3.m63911x1().m3742k4(true);
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
                        } else {
                            it = list2.iterator();
                            while (true) {
                                try {
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    kiv kivVar4 = (kiv) it.next();
                                    if (kivVar2.m63906kk().getIndex() == kivVar4.m63906kk().getIndex()) {
                                        kivVar2.m63911x1().m3742k4(false);
                                        kivVar4.m63911x1().m3742k4(true);
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
                    } finally {
                    }
                }
                if (zM27456k4) {
                    return;
                } else {
                    return;
                }
            }
            it = list.iterator();
            while (it.hasNext()) {
                try {
                    kiv kivVar5 = (kiv) it.next();
                    if (hi8.m7179k4(kivVar5.m63906kk())) {
                        it2 = list2.iterator();
                        while (true) {
                            try {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                kiv kivVar6 = (kiv) it2.next();
                                if (kivVar6.m63906kk().getType() == kivVar5.m63906kk().getType()) {
                                    kivVar5.m63911x1().m3742k4(false);
                                    kivVar6.m63911x1().m3742k4(true);
                                    kivVar6.m63904k4(kivVar5.m63911x1());
                                    break;
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
                    } else {
                        it2 = list2.iterator();
                        while (true) {
                            try {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                kiv kivVar7 = (kiv) it2.next();
                                if (kivVar7.m63906kk().getIndex() == kivVar5.m63906kk().getIndex()) {
                                    kivVar5.m63911x1().m3742k4(true);
                                    kivVar7.m63911x1().m3742k4(false);
                                    kivVar5.m63904k4(kivVar7.m63911x1());
                                    break;
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
                    }
                } finally {
                }
            }
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                it.dispose();
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    private static void m7473x1(rpo rpoVar) {
        LayoutSlide layoutSlide;
        y2n y2nVarM70215k4 = rpoVar.m70215k4();
        y2nVarM70215k4.m73733yd();
        C10740z0 c10740z0M51561x1 = rpoVar.m70207du().m51561x1();
        y2nVarM70215k4.m73705k4(c10740z0M51561x1);
        c10740z0M51561x1.m52118k4((int) (y2nVarM70215k4.m73689b3() & C18177fb.f54859s));
        z9q z9qVarM70210h4 = rpoVar.m70210h4();
        z9qVarM70210h4.m72010wl().m52037k4(rpoVar.m70213k4(false));
        if (((rpoVar.m70220kk() == 3) & rpoVar.m70235x1().getShowMasterShapes() & (C7019kk.m27452k4((Object) rpoVar.m70228to(), C10431f3.class) != null)) || (rpoVar.m70220kk() == 2)) {
            layoutSlide = (LayoutSlide) C7019kk.m27452k4((Object) rpoVar.m70235x1(), LayoutSlide.class);
            z9qVarM70210h4.m74356k4(((MasterSlide) layoutSlide.getMasterSlide()).f1077kk);
        } else {
            z9qVarM70210h4.m74356k4(rpoVar.m70235x1().f1077kk);
            layoutSlide = null;
        }
        if (layoutSlide != null) {
            List.Enumerator<uz3> it = rpoVar.m70205c5().iterator();
            while (it.hasNext()) {
                try {
                    uz3 next = it.next();
                    if (next.m72008uz() != null) {
                        next.m72008uz().m63905k4(true);
                    } else {
                        next.m3742k4(next.m3744m9() & layoutSlide.getShowMasterShapes());
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
            z9qVarM70210h4.m74356k4(layoutSlide.f1077kk);
        }
        z9qVarM70210h4.mo5827dy();
        gh7.m6658kk(rpoVar);
        C14566tl.m71243k4(rpoVar);
        m7467kk(rpoVar);
        m7443c5(rpoVar);
        if (rpoVar.m70215k4().m73717qq()) {
            m7474x1(z9qVarM70210h4);
        }
        m7460k4(z9qVarM70210h4.m74353ck(), rpoVar);
        m7465k4(z9qVarM70210h4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    private static void m7454k4(BaseSlide baseSlide, C10611qq[] c10611qqArr, Presentation presentation) {
        ISlide iSlide;
        ICommentAuthor iCommentAuthorAddAuthor;
        if (c10611qqArr == null || c10611qqArr.length < 1 || (iSlide = (ISlide) baseSlide) == null) {
            return;
        }
        ICommentAuthorCollection commentAuthors = presentation.getCommentAuthors();
        for (C10611qq c10611qq : c10611qqArr) {
            ICommentAuthor[] iCommentAuthorArrFindByNameAndInitials = commentAuthors.findByNameAndInitials(c10611qq.m51604x1(), c10611qq.m51599du());
            if (iCommentAuthorArrFindByNameAndInitials.length > 0) {
                iCommentAuthorAddAuthor = iCommentAuthorArrFindByNameAndInitials[0];
            } else {
                ICommentAuthor[] iCommentAuthorArrFindByNameAndInitials2 = commentAuthors.findByNameAndInitials(c10611qq.m51604x1(), C14113y2.f47374k4);
                if (iCommentAuthorArrFindByNameAndInitials2.length > 0) {
                    iCommentAuthorAddAuthor = iCommentAuthorArrFindByNameAndInitials2[0];
                    iCommentAuthorAddAuthor.setInitials(c10611qq.m51599du());
                } else {
                    iCommentAuthorAddAuthor = commentAuthors.addAuthor(c10611qq.m51604x1(), c10611qq.m51599du());
                }
            }
            ((CommentCollection) iCommentAuthorAddAuthor.getComments()).m1187k4(c10611qq.m51603to(), iSlide, new C12025x6(c10611qq.m51600h4().m51912kk().m56708k4() / 8.0f, c10611qq.m51600h4().m51912kk().m56713x1() / 8.0f).Clone(), c10611qq.m51600h4().m51913x1().Clone());
        }
    }

    /* JADX INFO: renamed from: x1 */
    private static void m7474x1(z9q z9qVar) {
        rpo rpoVarM3738du = z9qVar.m3738du();
        String[][] strArr = {null};
        byte[][] bArr = {null};
        int[] iArrM2334k4 = Presentation.m2334k4((ctm) rpoVarM3738du.m70215k4().m71946k4().m2399x6(), bArr);
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
        String strM67403k4 = C14113y2.m67403k4(C14052dq.m66570kk(), strArr[0]);
        if ((Arrays.equals(C3038bv.m12793k4(), C3095v4.f9211x1) && C3092um.m13135k4() != null && (C3092um.m13135k4() instanceof C3038bv)) || Arrays.equals(iArrM2334k4, r1s.f48530kk) || Arrays.equals(iArrM12821x1, C3052g8.f9070x1)) {
            return;
        }
        AutoShape autoShape = new AutoShape((InterfaceC14397rj) rpoVarM3738du.m70235x1().getShapes());
        TextFrame textFrame = new TextFrame(autoShape);
        C12015qq c12015qqClone = ((SlideSize) rpoVarM3738du.m70215k4().m71946k4().getSlideSize()).m2755k4().Clone();
        autoShape.setFrame(new ShapeFrame(0.0f, 0.0f, c12015qqClone.m56699x1(), c12015qqClone.m56697kk(), (byte) 0, (byte) 0, 0.0f));
        autoShape.m283k4(textFrame);
        textFrame.getTextFrameFormat().setAnchoringType((byte) 1);
        textFrame.m2916k4(strM67403k4);
        textFrame.getParagraphs().get_Item(0).getParagraphFormat().setAlignment(1);
        autoShape.getLineFormat().getFillFormat().setFillType((byte) 0);
        IGenericEnumerator<IParagraph> it = textFrame.getParagraphs().iterator();
        while (it.hasNext()) {
            try {
                Paragraph paragraph = (Paragraph) it.next();
                paragraph.getParagraphFormat().setAlignment(1);
                paragraph.getParagraphFormat().setSpaceWithin(150.0f);
                PortionFormat portionFormat = (PortionFormat) paragraph.getPortions().get_Item(0).getPortionFormat();
                portionFormat.setFontHeight(32.0f);
                ((FillFormat) portionFormat.getFillFormat()).setFillType((byte) 1);
                ((ColorFormat) ((FillFormat) portionFormat.getFillFormat()).getSolidFillColor()).m1080k4(C12003du.m56398k4(255, 255, 216, 207).Clone());
                ((EffectFormat) portionFormat.getEffectFormat()).enablePresetShadowEffect();
            } finally {
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        textFrame.getTextFrameFormat().setAutofitType((byte) 2);
        uz3 uz3Var = new uz3(autoShape, z9qVar);
        k3x.m63632kk(uz3Var);
        C22225Oooo0oO.OooO0O0(127, 14680288L, uz3Var.m72004qq().m51263x1());
        uz3Var.mo5827dy();
    }

    /* JADX INFO: renamed from: k4 */
    private static void m7455k4(Comment comment, C10611qq c10611qq, y2n y2nVar) {
        c10611qq.m51601k4(comment.getAuthor().getName());
        c10611qq.m51605x1(comment.getText());
        c10611qq.m51602kk(comment.getAuthor().getInitials());
        c10611qq.m51600h4().m51911k4(comment.m1163k4().Clone());
        c10611qq.m51600h4().m51910k4(new C12016rv(OooO.OooO00o(comment.m1169x1().m56897x1() * 8.0f, 14), OooO.OooO00o(comment.m1169x1().m56895kk() * 8.0f, 14)));
        c10611qq.m51600h4().m51909k4(y2nVar.m73724um());
    }

    /* JADX INFO: renamed from: k4 */
    private static void m7456k4(IAnimationTimeLine iAnimationTimeLine) {
        iAnimationTimeLine.getMainSequence().clear();
    }

    /* JADX INFO: renamed from: k4 */
    private static void m7457k4(IShapeCollection iShapeCollection, SortedList<Long, Shape> sortedList, List<Shape> list) {
        IGenericEnumerator<IShape> it = iShapeCollection.iterator();
        while (it.hasNext()) {
            try {
                Shape shape = (Shape) it.next();
                if (sortedList.containsKey(Long.valueOf(shape.m2584wp()))) {
                    list.addItem(shape);
                } else {
                    sortedList.addItem(Long.valueOf(shape.m2584wp()), shape);
                }
                sortedList.set_Item(Long.valueOf(shape.m2584wp()), shape);
                if (C7019kk.m27469x1(shape, GroupShape.class)) {
                    m7457k4(((GroupShape) shape).getShapes(), sortedList, list);
                }
                if (C7019kk.m27469x1(shape, LegacyDiagram.class)) {
                    m7457k4(((LegacyDiagram) shape).m1858kk().getShapes(), sortedList, list);
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
    private static void m7458k4(au9 au9Var) {
        r9q r9qVar = (r9q) C7019kk.m27452k4((Object) au9Var, r9q.class);
        if (r9qVar != null) {
            rx0.m70384k4(r9qVar);
            return;
        }
        z9q z9qVar = (z9q) C7019kk.m27452k4((Object) au9Var, z9q.class);
        if (z9qVar != null) {
            C14916zv.m74843k4(z9qVar);
            return;
        }
        uz3 uz3Var = (uz3) C7019kk.m27452k4((Object) au9Var, uz3.class);
        if (uz3Var != null) {
            k3x.m63632kk(uz3Var);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m7459k4(AbstractC10456gv abstractC10456gv, C10683vm c10683vm) {
        if (c10683vm == null) {
            return;
        }
        C10610qp c10610qp = new C10610qp();
        abstractC10456gv.m50513yj().addItem(c10610qp);
        c10610qp.m50513yj().addItem(new C10626rv("___PPT12", (short) 0));
        C10584p5 c10584p5 = new C10584p5();
        c10610qp.m50513yj().addItem(c10584p5);
        c10584p5.m50513yj().addItem(c10683vm);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m7460k4(C10511kn c10511kn, rpo rpoVar) {
        int size = c10511kn.m50513yj().size();
        for (int i = 1; i < size; i++) {
            C10511kn c10511kn2 = (C10511kn) C7019kk.m27452k4((Object) c10511kn.m50513yj().get_Item(i), C10511kn.class);
            if (c10511kn2 != null) {
                c10511kn2.mo50864to().m52037k4(rpoVar.m70213k4(false));
                m7460k4(c10511kn2, rpoVar);
            } else {
                C10462h9 c10462h9 = (C10462h9) C7019kk.m27452k4((Object) c10511kn.m50513yj().get_Item(i), C10462h9.class);
                if (c10462h9 != null) {
                    c10462h9.mo50864to().m52037k4(rpoVar.m70213k4(true));
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m7461k4(AbstractC10539m9 abstractC10539m9, rpo rpoVar) {
        BaseSlide baseSlideM70235x1 = rpoVar.m70235x1();
        if (baseSlideM70235x1 == null || baseSlideM70235x1.getTimeline() == null) {
            return;
        }
        if (baseSlideM70235x1.getTimeline().getMainSequence().getCount() == 0 && baseSlideM70235x1.getTimeline().getInteractiveSequences().getCount() == 0) {
            return;
        }
        com.aspose.slides.internal.p332p7.ehe eheVarM70240yd = rpoVar.m70240yd();
        gi8 gi8VarM70203b3 = rpoVar.m70203b3();
        abstractC10539m9.m50513yj().addItem(new C10470hq());
        C10562nk c10562nk = new C10562nk();
        abstractC10539m9.m50513yj().addItem(c10562nk);
        wrl.m72906k4(eheVarM70240yd, c10562nk, gi8VarM70203b3);
        C14323q1.m69357k4(eheVarM70240yd, abstractC10539m9, gi8VarM70203b3);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m7462k4(m4c m4cVar) {
        m7470to(m4cVar);
        m7445du(m4cVar);
        m7449h4(m4cVar);
        C14916zv.m74841k4(m4cVar);
        m7468m9(m4cVar);
        m7447dy(m4cVar);
        C13658is.m63092k4(m4cVar.m64735up().getCustomData(), m4cVar.m64729ne());
        m7472x1(m4cVar);
        cn8.m4691k4(m4cVar);
        m7466kk(m4cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002e A[PHI: r1
      0x002e: PHI (r1v8 java.lang.String) = (r1v2 java.lang.String), (r1v13 java.lang.String) binds: [B:12:0x004a, B:9:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void m7463k4(qah qahVar, SortedList<String, ISlideComponent> sortedList, boolean z) {
        String strM67459k4;
        if (qahVar.m69492rv()) {
            if (!z || (qahVar.m69485jd() & 4294967295L) <= 0) {
                strM67459k4 = C14114y9.m67459k4(qahVar.m69479c5(), (InterfaceC14073kp) C11697x1.m55250kk());
                if (!sortedList.containsKey(strM67459k4)) {
                    sortedList.addItem(strM67459k4, qahVar.m69481du().m70148u4());
                }
            } else {
                strM67459k4 = C14114y9.m67459k4(qahVar.m69485jd(), (InterfaceC14073kp) C11697x1.m55250kk());
                if (!sortedList.containsKey(strM67459k4)) {
                }
            }
            if (C7019kk.m27469x1(qahVar.m69481du(), g9n.class)) {
                List.Enumerator<qah> it = ((g9n) qahVar.m69481du()).m70642h4().iterator();
                while (it.hasNext()) {
                    try {
                        m7463k4(it.next(), sortedList, z);
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m7464k4(rpo rpoVar) {
        f8s.m6049k4(rpoVar);
        m7473x1(rpoVar);
        f8s.m6053x1(rpoVar);
        td3.m71115x1(rpoVar);
        m7451jd(rpoVar);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m7465k4(z9q z9qVar) {
        Connector connector;
        long j;
        int startShapeConnectionSiteIndex;
        C10635sd c10635sd = new C10635sd();
        y2n y2nVarM70215k4 = z9qVar.m3738du().m70215k4();
        List.Enumerator<au9> it = z9qVar.m74354fa().iterator();
        long j2 = 0;
        long j3 = 0;
        while (it.hasNext()) {
            try {
                uz3 uz3Var = (uz3) it.next();
                if (uz3Var.m3744m9() && (connector = (Connector) C7019kk.m27452k4((Object) uz3Var.mo64936jd(), Connector.class)) != null) {
                    C10463hc c10463hc = new C10463hc();
                    j3++;
                    c10463hc.m50886k4(j3);
                    c10463hc.m50890to(uz3Var.m72010wl().m52045x1());
                    if (connector.getStartShapeConnectedTo() != null) {
                        long jM2584wp = ((Shape) connector.getStartShapeConnectedTo()).m2584wp();
                        if (y2nVarM70215k4.m73690bv().containsKey(Long.valueOf(jM2584wp))) {
                            c10463hc.m50893x1(y2nVarM70215k4.m73690bv().get_Item(Long.valueOf(jM2584wp)).m72010wl().m52045x1());
                        }
                    }
                    int endShapeConnectionSiteIndex = -1;
                    if ((c10463hc.m50891x1() & 4294967295L) == j2) {
                        j = j2;
                        startShapeConnectionSiteIndex = -1;
                    } else {
                        j = j2;
                        startShapeConnectionSiteIndex = (int) connector.getStartShapeConnectionSiteIndex();
                    }
                    c10463hc.m50885k4(startShapeConnectionSiteIndex);
                    if (connector.getEndShapeConnectedTo() != null) {
                        long jM2584wp2 = ((Shape) connector.getEndShapeConnectedTo()).m2584wp();
                        if (y2nVarM70215k4.m73690bv().containsKey(Long.valueOf(jM2584wp2))) {
                            c10463hc.m50888kk(y2nVarM70215k4.m73690bv().get_Item(Long.valueOf(jM2584wp2)).m72010wl().m52045x1());
                        }
                    }
                    if ((c10463hc.m50887kk() & 4294967295L) != j) {
                        endShapeConnectionSiteIndex = (int) connector.getEndShapeConnectionSiteIndex();
                    }
                    c10463hc.m50892x1(endShapeConnectionSiteIndex);
                    c10635sd.m50513yj().addItem(c10463hc);
                    j2 = j;
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
        if (c10635sd.m50513yj().size() > 0) {
            c10635sd.m51407kk((short) c10635sd.m50513yj().size());
            z9qVar.m3738du().m70207du().m50513yj().addItem(c10635sd);
        }
    }
}

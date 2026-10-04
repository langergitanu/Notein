package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.OperationCanceledException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p151gj.C4317dy;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p323op.C7131h4;
import com.aspose.slides.internal.p323op.C7134m9;
import com.aspose.slides.internal.p407st.C10434f9;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12023wl;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.internal.p479wm.C12210k4;
import com.aspose.slides.p559ms.System.C14047bz;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
final class q1f extends C14168n5 {
    public q1f(Slide slide) {
        super(slide);
    }

    /* JADX INFO: renamed from: kk */
    private void m69365kk(AbstractC14897zn abstractC14897zn, kg7 kg7Var) {
        IGenericEnumerator<IControl> it = m69378x1().getControls().iterator();
        while (it.hasNext()) {
            try {
                ((Control) it.next()).m1249k4(abstractC14897zn, kg7Var);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (m69378x1().m2722yd() == null || m69378x1().getControls().size() <= 0) {
            return;
        }
        m69378x1().m2722yd().mo2723k4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public final IPPImage m69369k4(boolean z) {
        Dictionary.Enumerator it;
        C12210k4 c12210k4 = new C12210k4(C7134m9.class, C7131h4.class);
        C12015qq c12015qqClone = ((SlideSize) m67872k4().getSlideSize()).m2755k4().Clone();
        C12009k4 c12009k4 = new C12009k4(C7019kk.m27462to(Float.valueOf(c12015qqClone.m56699x1()), 13), C7019kk.m27462to(Float.valueOf(c12015qqClone.m56697kk()), 13), 139273);
        c12009k4.m56332k4(96.0f, 96.0f);
        c12009k4.m56603k4();
        try {
            try {
                C14258ow c14258owM2395wl = m67872k4().m2395wl();
                try {
                    omq omqVar = new omq(c12009k4, c12015qqClone.m56699x1(), c12015qqClone.m56697kk());
                    if (z) {
                        try {
                            omqVar.mo68794k4(new C12007ix(-1.0f, -1.0f, c12015qqClone.m56699x1() + 2.0f, c12015qqClone.m56697kk() + 2.0f), (azo) null, new C0962es(C12003du.m56385i5().Clone()));
                        } catch (Throwable th) {
                            omqVar.dispose();
                            throw th;
                        }
                    }
                    C13700js c13700js = new C13700js();
                    c13700js.f45564ck = z;
                    m69374k4(omqVar, null, new kg7(m69378x1(), c12210k4, c13700js), c13700js, (InterruptionToken) m67872k4().m2349du().getInterruptionToken());
                    omqVar.dispose();
                    if (c14258owM2395wl != null) {
                        c14258owM2395wl.dispose();
                    }
                    IPPImage iPPImageM1724k4 = ((ImageCollection) m67872k4().getImages()).m1724k4(c12009k4);
                    it = c12210k4.m56976x1().iterator();
                    while (it.hasNext()) {
                        try {
                            KeyValuePair next = it.next();
                            if (!m67872k4().m2392um().m56972k4(next.getKey())) {
                                ((C7131h4) next.getValue()).m27678kk().dispose();
                                c12210k4.m56977x1(next.getKey());
                            }
                        } finally {
                        }
                    }
                    return iPPImageM1724k4;
                } finally {
                }
            } catch (Throwable th2) {
                it = c12210k4.m56976x1().iterator();
                while (it.hasNext()) {
                    try {
                        KeyValuePair next2 = it.next();
                        if (!m67872k4().m2392um().m56972k4(next2.getKey())) {
                            ((C7131h4) next2.getValue()).m27678kk().dispose();
                            c12210k4.m56977x1(next2.getKey());
                        }
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                        throw th;
                    }
                }
            }
        } catch (OperationCanceledException unused) {
            c12009k4.dispose();
            Dictionary.Enumerator it2 = c12210k4.m56976x1().iterator();
            while (it2.hasNext()) {
                try {
                    KeyValuePair next3 = it2.next();
                    if (!m67872k4().m2392um().m56972k4(next3.getKey())) {
                        ((C7131h4) next3.getValue()).m27678kk().dispose();
                        c12210k4.m56977x1(next3.getKey());
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
            return null;
        } catch (RuntimeException e) {
            c12009k4.dispose();
            throw e;
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final Slide m69378x1() {
        return (Slide) this.f47477k4;
    }

    /* JADX INFO: renamed from: kk */
    private void m69366kk(AbstractC14897zn abstractC14897zn, kg7 kg7Var, InterruptionToken interruptionToken) {
        m69378x1().f1077kk.m2546bz().mo4131k4(abstractC14897zn, kg7Var, interruptionToken);
        if (m69378x1().m2722yd() == null || m69378x1().getShapes().size() <= 0) {
            return;
        }
        m69378x1().m2722yd().mo2723k4();
    }

    /* JADX INFO: renamed from: k4 */
    public final C12009k4 m69370k4(ITiffOptions iTiffOptions) {
        AbstractC12002ck abstractC12002ckM56312k4;
        m67872k4().m2361k4((ISaveOptions) iTiffOptions);
        C14047bz c14047bzClone = C14047bz.m66536x1().Clone();
        try {
            try {
                v7f.m72086k4(c14047bzClone.Clone());
                if (C14113y2.m67411k4(iTiffOptions.getDefaultRegularFont())) {
                    m67872k4().m2385ks().m7126k4((String) null);
                } else {
                    m67872k4().m2385ks().m7126k4(iTiffOptions.getDefaultRegularFont());
                }
                C3152yj c3152yj = new C3152yj();
                if (!((NotesCommentsLayoutingOptions) iTiffOptions.getNotesCommentsLayouting()).m2029x1()) {
                    kmn.m64034k4(m69378x1(), c3152yj, iTiffOptions);
                    abstractC12002ckM56312k4 = AbstractC12002ck.m56312k4(c3152yj);
                } else {
                    if (iTiffOptions.getNotesCommentsLayouting().getNotesPosition() == 1) {
                        throw new InvalidOperationException("Use NotesPositions.BottomTruncated instead of NotesPositions.BottomFull as result may overflow one page!");
                    }
                    kmn.m64031k4(m67872k4(), c3152yj, new int[]{m69378x1().m2709qq() + 1}, (TiffOptions) iTiffOptions, (InterruptionToken) m67872k4().m2349du().getInterruptionToken());
                    abstractC12002ckM56312k4 = AbstractC12002ck.m56312k4(c3152yj);
                }
                C12009k4 c12009k4 = (C12009k4) abstractC12002ckM56312k4;
                v7f.m72087k4(c14047bzClone.Clone(), c12009k4);
                m67872k4().m2361k4((ISaveOptions) null);
                return c12009k4;
            } catch (RuntimeException e) {
                m67872k4().m2385ks().m7126k4((String) null);
                v7f.m72090x1(c14047bzClone.Clone());
                throw e;
            }
        } catch (Throwable th) {
            m67872k4().m2361k4((ISaveOptions) null);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x1 */
    public final C12009k4 m69379x1(C12023wl c12023wl) {
        Dictionary.Enumerator it;
        C12210k4 c12210k4 = new C12210k4(C7134m9.class, C7131h4.class);
        C12009k4 c12009k4 = new C12009k4(c12023wl.m56865x1(), c12023wl.m56862kk(), 139273);
        c12009k4.m56332k4(96.0f, 96.0f);
        C14047bz c14047bzClone = C14047bz.m66536x1().Clone();
        try {
            try {
                v7f.m72086k4(c14047bzClone.Clone());
                C12015qq c12015qqClone = ((SlideSize) m67872k4().getSlideSize()).m2755k4().Clone();
                omq omqVar = new omq(c12009k4, c12015qqClone.m56699x1(), c12015qqClone.m56697kk());
                try {
                    omqVar.mo68794k4(new C12007ix(-1.0f, -1.0f, c12015qqClone.m56699x1() + 2.0f, c12015qqClone.m56697kk() + 2.0f), (azo) null, new C0962es(C12003du.m56385i5().Clone()));
                    m69376k4(omqVar, (C12210k4<C7134m9, C7131h4>) c12210k4, new C13700js(), (InterruptionToken) m67872k4().m2349du().getInterruptionToken());
                    omqVar.dispose();
                    v7f.m72087k4(c14047bzClone.Clone(), c12009k4);
                    it = c12210k4.m56976x1().iterator();
                    while (it.hasNext()) {
                        try {
                            KeyValuePair next = it.next();
                            if (!m67872k4().m2392um().m56972k4(next.getKey())) {
                                ((C7131h4) next.getValue()).m27678kk().dispose();
                                c12210k4.m56977x1(next.getKey());
                            }
                        } finally {
                            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                                it.dispose();
                            }
                        }
                    }
                    return c12009k4;
                } catch (Throwable th) {
                    omqVar.dispose();
                    throw th;
                }
            } catch (Throwable th2) {
                it = c12210k4.m56976x1().iterator();
                while (it.hasNext()) {
                    try {
                        KeyValuePair next2 = it.next();
                        if (!m67872k4().m2392um().m56972k4(next2.getKey())) {
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
        } catch (OperationCanceledException unused) {
            m69361k4(c12009k4, c14047bzClone.Clone());
            Dictionary.Enumerator it2 = c12210k4.m56976x1().iterator();
            while (it2.hasNext()) {
                try {
                    KeyValuePair next3 = it2.next();
                    if (!m67872k4().m2392um().m56972k4(next3.getKey())) {
                        ((C7131h4) next3.getValue()).m27678kk().dispose();
                        c12210k4.m56977x1(next3.getKey());
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
            return null;
        } catch (RuntimeException e) {
            m69361k4(c12009k4, c14047bzClone.Clone());
            throw e;
        }
    }

    /* JADX INFO: renamed from: x1 */
    private void m69367x1(AbstractC14897zn abstractC14897zn, kg7 kg7Var) {
        if (m69378x1().m2712uz()) {
            IGenericEnumerator<IControl> it = m69378x1().m2687bv().getControls().iterator();
            while (it.hasNext()) {
                try {
                    ((Control) it.next()).m1249k4(abstractC14897zn, kg7Var);
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            if (m69378x1().m2722yd() == null || m69378x1().getLayoutSlide().getControls().size() <= 0) {
                return;
            }
            m69378x1().m2722yd().mo2723k4();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final C12009k4 m69371k4(C12023wl c12023wl) {
        C13700js c13700js = new C13700js();
        c13700js.f45563c5 = C13700js.m63539k4(c12023wl.Clone());
        return m69372k4(c12023wl.Clone(), new kg7(m69378x1(), new C12210k4(C7134m9.class, C7131h4.class), c13700js));
    }

    /* JADX INFO: renamed from: x1 */
    private void m69368x1(AbstractC14897zn abstractC14897zn, kg7 kg7Var, InterruptionToken interruptionToken) {
        if (m69378x1().m2712uz()) {
            m69378x1().m2687bv().f1077kk.m2546bz().mo4131k4(abstractC14897zn, kg7Var, interruptionToken);
            if (m69378x1().m2722yd() == null || m69378x1().getLayoutSlide().getShapes().size() <= 0) {
                return;
            }
            m69378x1().m2722yd().mo2723k4();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:? A[Catch: all -> 0x0091, RuntimeException -> 0x0095, OperationCanceledException -> 0x0127, SYNTHETIC, TRY_LEAVE, TryCatch #9 {all -> 0x0091, blocks: (B:10:0x008d, B:15:0x0099, B:51:0x011f, B:52:0x0126, B:53:0x0127, B:44:0x010e, B:45:0x0111), top: B:99:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:121:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010e A[Catch: all -> 0x0091, RuntimeException -> 0x0095, OperationCanceledException -> 0x0127, TRY_ENTER, TryCatch #9 {all -> 0x0091, blocks: (B:10:0x008d, B:15:0x0099, B:51:0x011f, B:52:0x0126, B:53:0x0127, B:44:0x010e, B:45:0x0111), top: B:99:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0140 A[Catch: all -> 0x0171, TryCatch #8 {all -> 0x0171, blocks: (B:55:0x013a, B:57:0x0140, B:59:0x0158), top: B:97:0x013a }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x019a A[Catch: all -> 0x01cb, TryCatch #7 {all -> 0x01cb, blocks: (B:72:0x0194, B:74:0x019a, B:76:0x01b2), top: B:95:0x0194 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01d4  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C12009k4 m69372k4(C12023wl c12023wl, kg7 kg7Var) throws Throwable {
        Dictionary.Enumerator<C7134m9, C7131h4> it;
        Dictionary.Enumerator<C7134m9, C7131h4> it2;
        C12009k4 c12009k4 = new C12009k4(c12023wl.m56865x1(), c12023wl.m56862kk(), 139273);
        c12009k4.m56332k4(96.0f, 96.0f);
        C14047bz c14047bzClone = C14047bz.m66536x1().Clone();
        try {
            try {
                try {
                    v7f.m72086k4(c14047bzClone.Clone());
                    C12015qq c12015qqClone = ((SlideSize) m67872k4().getSlideSize()).m2755k4().Clone();
                    C14258ow c14258owM2395wl = m67872k4().m2395wl();
                    try {
                        try {
                            omq omqVar = new omq(c12009k4, c12015qqClone.m56699x1(), c12015qqClone.m56697kk());
                            try {
                                omqVar.mo68794k4(new C12007ix(-1.0f, -1.0f, c12015qqClone.m56699x1() + 2.0f, c12015qqClone.m56697kk() + 2.0f), (azo) null, new C0962es(C12003du.m56385i5().Clone()));
                            } catch (Throwable th) {
                                th = th;
                            }
                            try {
                                m69375k4(omqVar, null, kg7Var, true, false, (InterruptionToken) m67872k4().m2349du().getInterruptionToken());
                                omqVar.dispose();
                                if (c14258owM2395wl != null) {
                                    c14258owM2395wl.dispose();
                                }
                                v7f.m72087k4(c14047bzClone.Clone(), c12009k4);
                                it = kg7Var.m63846ks().m56976x1().iterator();
                                while (it.hasNext()) {
                                    try {
                                        KeyValuePair next = it.next();
                                        if (!m67872k4().m2392um().m56972k4(next.getKey())) {
                                            ((C7131h4) next.getValue()).m27678kk().dispose();
                                            kg7Var.m63846ks().m56977x1(next.getKey());
                                        }
                                    } finally {
                                    }
                                }
                                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                                    it.dispose();
                                }
                                return c12009k4;
                            } catch (Throwable th2) {
                                th = th2;
                                Throwable th3 = th;
                                omqVar.dispose();
                                throw th3;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            Throwable th5 = th;
                            if (c14258owM2395wl != null) {
                                throw th5;
                            }
                            c14258owM2395wl.dispose();
                            throw th5;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        Throwable th52 = th;
                        if (c14258owM2395wl != null) {
                        }
                    }
                } catch (Throwable th7) {
                    th = th7;
                    Throwable th8 = th;
                    it2 = kg7Var.m63846ks().m56976x1().iterator();
                    while (it2.hasNext()) {
                        try {
                            KeyValuePair next2 = it2.next();
                            if (!m67872k4().m2392um().m56972k4(next2.getKey())) {
                                ((C7131h4) next2.getValue()).m27678kk().dispose();
                                kg7Var.m63846ks().m56977x1(next2.getKey());
                            }
                        } finally {
                        }
                    }
                    if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                        throw th8;
                    }
                    it2.dispose();
                    throw th8;
                }
            } catch (OperationCanceledException unused) {
                m69361k4(c12009k4, c14047bzClone.Clone());
                it = kg7Var.m63846ks().m56976x1().iterator();
                while (it.hasNext()) {
                    try {
                        KeyValuePair next3 = it.next();
                        if (!m67872k4().m2392um().m56972k4(next3.getKey())) {
                            ((C7131h4) next3.getValue()).m27678kk().dispose();
                            kg7Var.m63846ks().m56977x1(next3.getKey());
                        }
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                        throw th;
                    }
                }
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                return null;
            } catch (RuntimeException e) {
                e = e;
                RuntimeException runtimeException = e;
                m69361k4(c12009k4, c14047bzClone.Clone());
                throw runtimeException;
            }
        } catch (OperationCanceledException unused2) {
            m69361k4(c12009k4, c14047bzClone.Clone());
            it = kg7Var.m63846ks().m56976x1().iterator();
            while (it.hasNext()) {
            }
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            }
            return null;
        } catch (RuntimeException e2) {
            e = e2;
            RuntimeException runtimeException2 = e;
            m69361k4(c12009k4, c14047bzClone.Clone());
            throw runtimeException2;
        } catch (Throwable th9) {
            th = th9;
            Throwable th82 = th;
            it2 = kg7Var.m63846ks().m56976x1().iterator();
            while (it2.hasNext()) {
            }
            if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public final void m69373k4(AbstractC3150x6 abstractC3150x6, ISVGOptions iSVGOptions) {
        zny znyVar;
        Dictionary.Enumerator it;
        C13700js c13700js;
        if (iSVGOptions == null) {
            iSVGOptions = new SVGOptions();
        }
        SVGOptions sVGOptions = (SVGOptions) iSVGOptions;
        ILinkEmbedController iLinkEmbedControllerM2510x1 = sVGOptions.m2510x1();
        if ((iLinkEmbedControllerM2510x1 == null || iLinkEmbedControllerM2510x1 == C10434f9.f36986k4) && iSVGOptions.getExternalFontsHandling() != 1) {
            znyVar = null;
        } else {
            zny znyVar2 = new zny(new C14726w7());
            omk omkVar = new omk((Presentation) m69378x1().getPresentation());
            try {
                dnm[] dnmVarArrM68693k4 = omkVar.m68693k4(new int[]{m69378x1().m2709qq() + 1});
                omkVar.dispose();
                znyVar2.m74700k4(dnmVarArrM68693k4);
                znyVar = znyVar2;
            } catch (Throwable th) {
                omkVar.dispose();
                throw th;
            }
        }
        vhx vhxVar = new vhx(C7019kk.m27462to(Float.valueOf(((SlideSize) m67872k4().getSlideSize()).m2755k4().m56699x1()), 13), C7019kk.m27462to(Float.valueOf(((SlideSize) m67872k4().getSlideSize()).m2755k4().m56697kk()), 13), 72.0f, 72.0f, 72.0f, sVGOptions, znyVar);
        C12210k4 c12210k4 = new C12210k4(C7134m9.class, C7131h4.class);
        m67872k4().m2361k4((ISaveOptions) iSVGOptions);
        C14047bz c14047bzClone = C14047bz.m66536x1().Clone();
        try {
            try {
                v7f.m72086k4(c14047bzClone.Clone());
                c13700js = new C13700js();
                c13700js.f45578yj.setHideInk(iSVGOptions.getInkOptions().getHideInk());
                c13700js.f45578yj.setInterpretMaskOpAsOpacity(iSVGOptions.getInkOptions().getInterpretMaskOpAsOpacity());
                c13700js.f45573m9 = true;
                c13700js.f45563c5 = ((SVGOptions) iSVGOptions).m2508kk().m69787kk();
                c13700js.f45569jd = iSVGOptions.getDeletePicturesCroppedAreas();
            } catch (RuntimeException e) {
                e = e;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            m69374k4(vhxVar, null, new c9d(m69378x1(), c12210k4, c13700js, iSVGOptions.getShapeFormattingController()), c13700js, (InterruptionToken) m67872k4().m2349du().getInterruptionToken());
            vhxVar = vhxVar;
            vhxVar.m72276k4(abstractC3150x6, true);
            v7f.m72084k4(c14047bzClone.Clone(), abstractC3150x6);
            it = c12210k4.m56976x1().iterator();
            while (it.hasNext()) {
                try {
                    KeyValuePair next = it.next();
                    if (!m67872k4().m2392um().m56972k4(next.getKey())) {
                        ((C7131h4) next.getValue()).m27678kk().dispose();
                        c12210k4.m56977x1(next.getKey());
                    }
                } finally {
                }
            }
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                it.dispose();
            }
            m67872k4().m2361k4((ISaveOptions) null);
            vhxVar.dispose();
        } catch (RuntimeException e2) {
            e = e2;
            vhxVar = vhxVar;
            RuntimeException runtimeException = e;
            v7f.m72090x1(c14047bzClone.Clone());
            throw runtimeException;
        } catch (Throwable th3) {
            th = th3;
            vhxVar = vhxVar;
            Throwable th4 = th;
            it = c12210k4.m56976x1().iterator();
            while (it.hasNext()) {
                try {
                    KeyValuePair next2 = it.next();
                    if (!m67872k4().m2392um().m56972k4(next2.getKey())) {
                        ((C7131h4) next2.getValue()).m27678kk().dispose();
                        c12210k4.m56977x1(next2.getKey());
                    }
                } finally {
                }
            }
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                it.dispose();
            }
            m67872k4().m2361k4((ISaveOptions) null);
            vhxVar.dispose();
            throw th4;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m69361k4(C12009k4 c12009k4, C14047bz c14047bz) {
        m69362k4(c14047bz.Clone());
        c12009k4.dispose();
    }

    /* JADX INFO: renamed from: k4 */
    private void m69362k4(C14047bz c14047bz) {
        v7f.m72090x1(c14047bz.Clone());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m69374k4(AbstractC14897zn abstractC14897zn, IShapeFrame iShapeFrame, kg7 kg7Var, C13700js c13700js, InterruptionToken interruptionToken) {
        m69375k4(abstractC14897zn, iShapeFrame, kg7Var, c13700js.f45564ck, c13700js.f45566dy, interruptionToken);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m69375k4(AbstractC14897zn abstractC14897zn, IShapeFrame iShapeFrame, kg7 kg7Var, boolean z, boolean z2, InterruptionToken interruptionToken) {
        C4317dy c4317dy;
        float f;
        ShapeFrame shapeFrame = (ShapeFrame) iShapeFrame;
        ShapeFrame shapeFrameM405up = m69378x1().m405up();
        if (iShapeFrame == null) {
            float f2 = 1.0f;
            if (shapeFrameM405up.getFlipH() == 1) {
                f = 1.0f;
                f2 = -1.0f;
            } else {
                f = 1.0f;
            }
            c4317dy = new C4317dy(f2, 0.0f, 0.0f, shapeFrameM405up.getFlipV() == 1 ? -1.0f : f, shapeFrameM405up.getFlipH() == 1 ? shapeFrameM405up.getCenterX() * 2.0f : 0.0f, shapeFrameM405up.getFlipV() == 1 ? shapeFrameM405up.getCenterY() * 2.0f : 0.0f);
            if (!C14064he.m66715kk(shapeFrameM405up.getRotation())) {
                c4317dy.m17339k4((shapeFrameM405up.getFlipH() == 1) ^ (shapeFrameM405up.getFlipV() == 1) ? -shapeFrameM405up.getRotation() : shapeFrameM405up.getRotation(), new C12025x6(shapeFrameM405up.getCenterX(), shapeFrameM405up.getCenterY()), 0);
            }
        } else {
            c4317dy = new C4317dy(shapeFrame.getWidth() / shapeFrameM405up.getWidth(), 0.0f, 0.0f, shapeFrame.getHeight() / shapeFrameM405up.getHeight(), shapeFrame.getX(), shapeFrame.getY());
        }
        abstractC14897zn.m74622kk(c4317dy);
        abstractC14897zn.m74616k4(kg7Var);
        C0962es c0962esM67873k4 = m67873k4((Background) m69378x1().getBackground(), shapeFrameM405up, abstractC14897zn, kg7Var);
        if (c0962esM67873k4 == null) {
            c0962esM67873k4 = new C0962es(C12003du.m56385i5().Clone());
        }
        if (c0962esM67873k4.m5681to() == 1) {
            abstractC14897zn.m74617k4(false);
        }
        if (z) {
            abstractC14897zn.mo68794k4(shapeFrameM405up.m2660k4().Clone(), (azo) null, c0962esM67873k4);
        }
        if (c0962esM67873k4.m5681to() == 1) {
            abstractC14897zn.m74617k4(true);
        }
        m69364k4(abstractC14897zn, kg7Var, interruptionToken);
        m69368x1(abstractC14897zn, kg7Var, interruptionToken);
        m69366kk(abstractC14897zn, kg7Var, interruptionToken);
        m69363k4(abstractC14897zn, kg7Var);
        m69367x1(abstractC14897zn, kg7Var);
        m69365kk(abstractC14897zn, kg7Var);
        m69377k4(abstractC14897zn, z2, shapeFrameM405up);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m69376k4(AbstractC14897zn abstractC14897zn, C12210k4<C7134m9, C7131h4> c12210k4, C13700js c13700js, InterruptionToken interruptionToken) {
        m69374k4(abstractC14897zn, null, new kg7(m69378x1(), c12210k4, c13700js), c13700js, interruptionToken);
    }

    /* JADX INFO: renamed from: k4 */
    private void m69363k4(AbstractC14897zn abstractC14897zn, kg7 kg7Var) {
        if (m69378x1().m2714wl()) {
            IGenericEnumerator<IControl> it = m69378x1().m2687bv().getMasterSlide().getControls().iterator();
            while (it.hasNext()) {
                try {
                    ((Control) it.next()).m1249k4(abstractC14897zn, kg7Var);
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            if (m69378x1().m2722yd() == null || m69378x1().m2713v4().getControls().size() <= 0) {
                return;
            }
            m69378x1().m2722yd().mo2723k4();
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m69364k4(AbstractC14897zn abstractC14897zn, kg7 kg7Var, InterruptionToken interruptionToken) {
        if (m69378x1().m2714wl()) {
            ((MasterSlide) m69378x1().m2687bv().getMasterSlide()).f1077kk.m2546bz().mo4131k4(abstractC14897zn, kg7Var, interruptionToken);
            if (m69378x1().m2722yd() == null || m69378x1().m2713v4().getShapes().size() <= 0) {
                return;
            }
            m69378x1().m2722yd().mo2723k4();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m69377k4(AbstractC14897zn abstractC14897zn, boolean z, ShapeFrame shapeFrame) {
        if (z) {
            abstractC14897zn.mo68794k4(shapeFrame.m2660k4().Clone(), new azo(C12003du.m56460uz().Clone(), 0.2f), (C0962es) null);
        }
        m67874k4(abstractC14897zn);
        abstractC14897zn.m74626rv();
    }
}

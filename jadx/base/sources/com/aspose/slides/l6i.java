package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p323op.C7131h4;
import com.aspose.slides.internal.p323op.C7134m9;
import com.aspose.slides.internal.p420th.C10951c5;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12023wl;
import com.aspose.slides.internal.p479wm.C12210k4;
import com.aspose.slides.p559ms.System.C14047bz;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
final class l6i extends C14168n5 {
    public l6i(NotesSlide notesSlide) {
        super(notesSlide);
    }

    /* JADX INFO: renamed from: k4 */
    public final C10951c5 m64315k4(boolean z, kg7 kg7Var, C13700js c13700js) {
        C12015qq c12015qqClone = ((NotesSize) m67872k4().getNotesSize()).m2030k4().Clone();
        C14250os c14250os = new C14250os(C7019kk.m27462to(Float.valueOf(c12015qqClone.m56699x1()), 13), C7019kk.m27462to(Float.valueOf(c12015qqClone.m56697kk()), 13), 72.0f, 72.0f, z, c13700js, m67872k4().m2385ks(), null);
        m64317k4(c14250os, kg7Var, c13700js);
        return c14250os.m68790jd();
    }

    /* JADX INFO: renamed from: x1 */
    public final NotesSlide m64318x1() {
        return (NotesSlide) this.f47477k4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public final C12009k4 m64316k4(C12023wl c12023wl, C13700js c13700js) {
        Dictionary.Enumerator it;
        C12210k4 c12210k4 = new C12210k4(C7134m9.class, C7131h4.class);
        C12009k4 c12009k4 = new C12009k4(c12023wl.m56865x1(), c12023wl.m56862kk(), 139273);
        c12009k4.m56332k4(96.0f, 96.0f);
        C14047bz c14047bzClone = C14047bz.m66536x1().Clone();
        try {
            try {
                v7f.m72086k4(c14047bzClone.Clone());
                C12015qq c12015qqClone = ((NotesSize) m67872k4().getNotesSize()).m2030k4().Clone();
                omq omqVar = new omq(c12009k4, c12015qqClone.m56699x1(), c12015qqClone.m56697kk());
                try {
                    omqVar.mo68794k4(new C12007ix(-1.0f, -1.0f, c12015qqClone.m56699x1() + 2.0f, c12015qqClone.m56697kk() + 2.0f), (azo) null, new C0962es(C12003du.m56385i5().Clone()));
                    m64317k4(omqVar, new kg7(m64318x1(), c12210k4, c13700js), c13700js);
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
        } catch (RuntimeException e) {
            v7f.m72090x1(c14047bzClone.Clone());
            c12009k4.dispose();
            throw e;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m64317k4(AbstractC14897zn abstractC14897zn, kg7 kg7Var, C13700js c13700js) {
        C12009k4 c12009k4;
        FillFormat fillFormat;
        AbstractC14897zn abstractC14897zn2 = abstractC14897zn;
        C13700js c13700js2 = c13700js;
        ShapeFrame shapeFrame = new ShapeFrame(0.0f, 0.0f, ((NotesSize) m67872k4().getNotesSize()).m2030k4().m56699x1(), ((NotesSize) m67872k4().getNotesSize()).m2030k4().m56697kk(), (byte) 0, (byte) 0, 0.0f);
        C0962es c0962esM67873k4 = m67873k4((Background) m64318x1().getBackground(), shapeFrame, abstractC14897zn2, kg7Var);
        if (c0962esM67873k4 == null) {
            c0962esM67873k4 = new C0962es(C12003du.m56385i5().Clone());
        }
        FillFormat fillFormat2 = null;
        abstractC14897zn2.mo68794k4(shapeFrame.m2660k4().Clone(), (azo) null, c0962esM67873k4);
        if (m67872k4() != null) {
            if (m67872k4().getMasterNotesSlideManager().getMasterNotesSlide() == null) {
                m67872k4().getMasterNotesSlideManager().setDefaultMasterNotesSlide();
                ((s8a) m67872k4().getMasterNotesSlideManager()).m70473k4();
            }
            if (m64318x1().getShowMasterShapes()) {
                ((BaseSlide) m67872k4().getMasterNotesSlideManager().getMasterNotesSlide()).f1077kk.m2546bz().mo4131k4(abstractC14897zn2, kg7Var, (InterruptionToken) m67872k4().m2349du().getInterruptionToken());
            }
        }
        byte fillType = -1;
        if (m64318x1().f2850h4 != null) {
            IGenericEnumerator<IShape> it = m64318x1().getShapes().iterator();
            while (it.hasNext()) {
                try {
                    AutoShape autoShape = (AutoShape) C7019kk.m27452k4(it.next(), AutoShape.class);
                    if (autoShape != null && autoShape.getPlaceholder() != null && autoShape.getPlaceholder().getType() == 14 && autoShape.getFrame().getWidth() > 0.0f && autoShape.getFrame().getHeight() > 0.0f) {
                        FillFormat fillFormat3 = (FillFormat) autoShape.getFillFormat();
                        if (fillFormat3 != null) {
                            fillType = fillFormat3.getFillType();
                            fillFormat3.setFillType((byte) 0);
                        }
                        byte b = fillType;
                        q1f q1fVarM2721x6 = m64318x1().f2850h4.m2721x6();
                        IShapeFrame frame = autoShape.getFrame();
                        if (C7019kk.m27469x1(abstractC14897zn2, C14250os.class)) {
                            C13700js c13700js3 = new C13700js();
                            c13700js3.f45578yj.setHideInk(kg7Var.m63847m9().getHideInk());
                            c13700js3.f45578yj.setInterpretMaskOpAsOpacity(kg7Var.m63847m9().getInterpretMaskOpAsOpacity());
                            q1fVarM2721x6.m69374k4(abstractC14897zn2, frame, new kg7(q1fVarM2721x6.m69378x1(), kg7Var.m63846ks(), c13700js3), c13700js3, (InterruptionToken) m67872k4().m2349du().getInterruptionToken());
                        } else if (C7019kk.m27469x1(abstractC14897zn2, vhx.class)) {
                            C13700js c13700js4 = c13700js2;
                            q1fVarM2721x6.m69374k4(abstractC14897zn2, frame, new kg7(q1fVarM2721x6.m69378x1(), kg7Var.m63846ks(), c13700js2), c13700js4, (InterruptionToken) m67872k4().m2349du().getInterruptionToken());
                            c13700js2 = c13700js4;
                            abstractC14897zn2 = abstractC14897zn;
                        } else {
                            C12009k4 c12009k4M69372k4 = q1fVarM2721x6.m69372k4(new C12023wl(C7019kk.m27462to(Double.valueOf(((double) frame.getWidth()) * 2.775d), 14), C7019kk.m27462to(Double.valueOf(((double) frame.getHeight()) * 2.775d), 14)), new kg7(q1fVarM2721x6.m69378x1(), kg7Var.m63846ks(), c13700js2));
                            try {
                                C12007ix c12007ix = new C12007ix(frame.getX(), frame.getY(), frame.getWidth(), frame.getHeight());
                                fillFormat = fillFormat3;
                                C12009k4 c12009k42 = new C12009k4(C7019kk.m27462to(Double.valueOf(C14116yg.m67497to(c12007ix.m56550c5())), 14), C7019kk.m27462to(Double.valueOf(C14116yg.m67497to(c12007ix.m56575x1())), 14));
                                try {
                                    c12009k42.m56603k4();
                                    AbstractC12008jd abstractC12008jdM56582k4 = AbstractC12008jd.m56582k4((AbstractC12002ck) c12009k42);
                                    try {
                                        abstractC12008jdM56582k4.mo17507k4(c12009k4M69372k4, new C12007ix(0.0f, 0.0f, frame.getWidth(), frame.getHeight()), new C12007ix(0.0f, 0.0f, c12009k4M69372k4.mo15760yj(), c12009k4M69372k4.mo15757m9()), 2);
                                        abstractC12008jdM56582k4.dispose();
                                        abstractC14897zn.mo64339k4(c12009k4M69372k4, c12007ix.m56557jd(), c12007ix.m56551ck(), c12007ix.m56550c5(), c12007ix.m56575x1());
                                        c12009k4 = c12009k4M69372k4;
                                        abstractC14897zn2 = abstractC14897zn;
                                        try {
                                            c12009k42.dispose();
                                            c12009k4.dispose();
                                            fillType = b;
                                            fillFormat2 = fillFormat;
                                        } catch (Throwable th) {
                                            th = th;
                                            if (c12009k4 != null) {
                                                c12009k4.dispose();
                                            }
                                            throw th;
                                        }
                                    } catch (Throwable th2) {
                                        c12009k4 = c12009k4M69372k4;
                                        if (abstractC12008jdM56582k4 != null) {
                                            try {
                                                abstractC12008jdM56582k4.dispose();
                                            } catch (Throwable th3) {
                                                th = th3;
                                                c12009k42.dispose();
                                                throw th;
                                            }
                                        }
                                        throw th2;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    c12009k4 = c12009k4M69372k4;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                c12009k4 = c12009k4M69372k4;
                            }
                        }
                        fillFormat = fillFormat3;
                        fillType = b;
                        fillFormat2 = fillFormat;
                    }
                } catch (Throwable th6) {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                    throw th6;
                }
            }
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                it.dispose();
            }
        }
        m64318x1().f1077kk.m2546bz().mo4131k4(abstractC14897zn2, kg7Var, m67872k4() == null ? InterruptionToken.getNone() : (InterruptionToken) m67872k4().m2349du().getInterruptionToken());
        if (fillFormat2 != null) {
            fillFormat2.setFillType(fillType);
        }
        m67874k4(abstractC14897zn);
    }
}

package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.internal.p332p7.C8528pk;
import com.aspose.slides.internal.p464vq.C11709bg;
import com.aspose.slides.internal.p464vq.C11729du;
import com.aspose.slides.internal.p464vq.C11791os;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class q5v {
    /* JADX INFO: renamed from: k4 */
    private static void m69412k4(Effect effect, com.aspose.slides.internal.p332p7.rx0 rx0Var, gi8 gi8Var) {
        com.aspose.slides.internal.p332p7.no7 no7VarM38216x1;
        List.Enumerator<C7394ca> it = rx0Var.m40596k4().m36277ak().m40177k4().iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                if (C7019kk.m27469x1(next.m29542x1(), com.aspose.slides.internal.p332p7.c6b.class)) {
                    m69415k4((com.aspose.slides.internal.p332p7.c6b) next.m29542x1(), effect, rx0Var, gi8Var);
                } else {
                    com.aspose.slides.internal.p332p7.oeg oegVar = (com.aspose.slides.internal.p332p7.oeg) C7019kk.m27452k4((Object) next.m29542x1(), com.aspose.slides.internal.p332p7.oeg.class);
                    if (oegVar != null) {
                        no7VarM38216x1 = oegVar.m38216x1();
                    } else {
                        com.aspose.slides.internal.p332p7.zv9 zv9Var = (com.aspose.slides.internal.p332p7.zv9) C7019kk.m27452k4((Object) next.m29542x1(), com.aspose.slides.internal.p332p7.zv9.class);
                        if (zv9Var != null) {
                            no7VarM38216x1 = zv9Var.m45969kk();
                        }
                    }
                    m69420k4(no7VarM38216x1, rx0Var);
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    private static void m69413k4(Sequence sequence, Effect effect, com.aspose.slides.internal.p332p7.rqz rqzVar) {
        Object obj;
        IShape iShapeM7584to = effect.m1375kk().m7584to();
        if (C7019kk.m27469x1(iShapeM7584to, IAudioFrame.class) || C7019kk.m27469x1(iShapeM7584to, IVideoFrame.class)) {
            for (C7394ca c7394ca : kjx.m63940k4(rqzVar, iShapeM7584to)) {
                if ("audio".equals(c7394ca.m29539k4()) || "video".equals(c7394ca.m29539k4())) {
                    return;
                }
            }
            com.aspose.slides.internal.p332p7.rqz rqzVarM31097kk = ((BaseSlide) iShapeM7584to.getSlide()).mo400kk().m5301k4().m31097kk();
            Object obj2 = null;
            if (rqzVarM31097kk != null) {
                com.aspose.slides.internal.p332p7.hgn hgnVar = null;
                for (C7394ca c7394ca2 : kjx.m63940k4(rqzVarM31097kk, iShapeM7584to)) {
                    if ("audio".equals(c7394ca2.m29539k4())) {
                        obj2 = (com.aspose.slides.internal.p332p7.c6b) c7394ca2.m29542x1();
                    } else if ("video".equals(c7394ca2.m29539k4())) {
                        hgnVar = (com.aspose.slides.internal.p332p7.hgn) c7394ca2.m29542x1();
                    }
                    rqzVar.m40179k4(c7394ca2);
                }
                obj = obj2;
                obj2 = hgnVar;
            } else {
                obj = null;
            }
            long jM63205x1 = C13670j2.m63205x1(iShapeM7584to);
            IAudioFrame iAudioFrame = (IAudioFrame) C7019kk.m27452k4((Object) iShapeM7584to, IAudioFrame.class);
            if (iAudioFrame != null) {
                if (obj == null) {
                    obj = (com.aspose.slides.internal.p332p7.c6b) rqzVar.m40178k4("audio").m29542x1();
                }
                int iM6577x1 = sequence.m2530k4().m6577x1() + 1;
                sequence.m2530k4().m6570k4(iM6577x1);
                m69417k4((com.aspose.slides.internal.p332p7.c6b) obj, iAudioFrame, iM6577x1, jM63205x1, effect.getTiming());
                return;
            }
            IVideoFrame iVideoFrame = (IVideoFrame) iShapeM7584to;
            if (obj2 == null) {
                obj2 = (com.aspose.slides.internal.p332p7.hgn) rqzVar.m40178k4("video").m29542x1();
            }
            int iM6577x12 = sequence.m2530k4().m6577x1() + 1;
            sequence.m2530k4().m6570k4(iM6577x12);
            m69419k4((com.aspose.slides.internal.p332p7.hgn) obj2, iVideoFrame, iM6577x12, jM63205x1, effect.getTiming());
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m69414k4(Sequence sequence, Effect effect, com.aspose.slides.internal.p332p7.rx0 rx0Var, gi8 gi8Var, com.aspose.slides.internal.p332p7.rqz rqzVar) {
        com.aspose.slides.internal.p332p7.rqz rqzVarM36277ak = rx0Var.m40596k4().m36277ak();
        if (effect.getSound() != null) {
            m69421k4(rqzVarM36277ak);
        } else if (effect.getStopPreviousSound()) {
            m69422k4(rqzVarM36277ak, (byte) 0, "onstopaudio");
        }
        m69412k4(effect, rx0Var, gi8Var);
        if (effect.getPresetClassType() == 4) {
            m69413k4(sequence, effect, rqzVar);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m69415k4(com.aspose.slides.internal.p332p7.c6b c6bVar, Effect effect, com.aspose.slides.internal.p332p7.rx0 rx0Var, gi8 gi8Var) {
        C8528pk c8528pk;
        if (c6bVar == null || c6bVar.m29443x1().m42700du().m36320v4() == null) {
            return;
        }
        com.aspose.slides.internal.p332p7.bnx[] bnxVarArrM31106x1 = c6bVar.m29443x1().m42700du().m36320v4().m31106x1();
        int length = bnxVarArrM31106x1.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            com.aspose.slides.internal.p332p7.bnx bnxVar = bnxVarArrM31106x1[i];
            if (bnxVar.m29010k4() == 2 && bnxVar.m29013kk() != null) {
                ((com.aspose.slides.internal.p332p7.vsk) C7019kk.m27452k4((Object) bnxVar.m29013kk().m29542x1(), com.aspose.slides.internal.p332p7.vsk.class)).m43242k4(rx0Var.m40596k4().m36289h4());
                break;
            }
            i++;
        }
        if (c6bVar.m29443x1().m42701h4() == null || (c8528pk = (C8528pk) C7019kk.m27452k4((Object) c6bVar.m29443x1().m42701h4().m44924k4().m29542x1(), C8528pk.class)) == null) {
            return;
        }
        if (effect.getSound() == null) {
            C11709bg c11709bgM6689k4 = gi8Var.m6689k4(C11729du.f39725k4.m55382k4());
            if (c11709bgM6689k4 != null) {
                c8528pk.m38952k4(c11709bgM6689k4.m55289du());
                return;
            }
            return;
        }
        C11791os c11791osM6690k4 = gi8Var.m6690k4(effect.getSound());
        if (c11791osM6690k4 != null) {
            c8528pk.m38952k4(gi8Var.m6688k4(c11791osM6690k4).m55289du());
            if (C14113y2.m67411k4(c8528pk.m38955x1())) {
                c8528pk.m38956x1(C14113y2.m67401k4(c11791osM6690k4.m55424kk(), "ppt/media/", ""));
                return;
            }
            return;
        }
        int iM6696x1 = gi8Var.m6696x1(effect.getSound());
        if (iM6696x1 > 0) {
            c8528pk.m38952k4(C14113y2.m67408k4("", C14057f9.m66591x1(iM6696x1)));
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m69416k4(com.aspose.slides.internal.p332p7.c6b c6bVar, IAudioFrame iAudioFrame, int i, long j) {
        m69417k4(c6bVar, iAudioFrame, i, j, (ITiming) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0085  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m69417k4(com.aspose.slides.internal.p332p7.c6b c6bVar, IAudioFrame iAudioFrame, int i, long j, ITiming iTiming) {
        com.aspose.slides.internal.p332p7.lmh lmhVarM42700du;
        float repeatCount;
        long j2;
        com.aspose.slides.internal.p332p7.v2z v2zVarM29443x1 = c6bVar.m29443x1();
        m69423k4(v2zVarM29443x1, i, j, !iAudioFrame.getHideAtShowing(), true);
        v2zVarM29443x1.m42700du().m36302kk(((AudioFrame) iAudioFrame).getRewindAudio() ? (byte) 0 : (byte) 2);
        if (iAudioFrame.getPlayAcrossSlides()) {
            j2 = (v2zVarM29443x1.m42706kk() & 4294967295L) < 2 ? 999L : 1L;
            if (iAudioFrame.getVolume() == 0) {
                v2zVarM29443x1.m42705k4(true);
            }
            v2zVarM29443x1.m42703k4(C14854yo.f50379k4[iAudioFrame.getVolume() != -1 ? iAudioFrame.getVolume() : 2]);
            if (iTiming != null || iAudioFrame.getPlayLoopMode()) {
                lmhVarM42700du = v2zVarM29443x1.m42700du();
                repeatCount = !iAudioFrame.getPlayLoopMode() ? Float.POSITIVE_INFINITY : 1.0f;
            } else {
                lmhVarM42700du = v2zVarM29443x1.m42700du();
                repeatCount = iTiming.getRepeatCount();
            }
            lmhVarM42700du.m36327x1(C13670j2.m63187k4(repeatCount));
            c6bVar.m29441k4(((AudioFrame) C7019kk.m27452k4((Object) iAudioFrame, AudioFrame.class)).mo272to().m67911x1());
        }
        v2zVarM29443x1.m42704k4(j2);
        if (iAudioFrame.getVolume() == 0) {
        }
        v2zVarM29443x1.m42703k4(C14854yo.f50379k4[iAudioFrame.getVolume() != -1 ? iAudioFrame.getVolume() : 2]);
        if (iTiming != null) {
            lmhVarM42700du = v2zVarM29443x1.m42700du();
            if (!iAudioFrame.getPlayLoopMode()) {
            }
        }
        lmhVarM42700du.m36327x1(C13670j2.m63187k4(repeatCount));
        c6bVar.m29441k4(((AudioFrame) C7019kk.m27452k4((Object) iAudioFrame, AudioFrame.class)).mo272to().m67911x1());
    }

    /* JADX INFO: renamed from: k4 */
    public static void m69418k4(com.aspose.slides.internal.p332p7.hgn hgnVar, IVideoFrame iVideoFrame, int i, long j) {
        m69419k4(hgnVar, iVideoFrame, i, j, (ITiming) null);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m69419k4(com.aspose.slides.internal.p332p7.hgn hgnVar, IVideoFrame iVideoFrame, int i, long j, ITiming iTiming) {
        com.aspose.slides.internal.p332p7.lmh lmhVarM42700du;
        float repeatCount;
        hgnVar.m33334k4(iVideoFrame.getFullScreenMode());
        m69423k4(hgnVar.m33336x1(), i, j, !iVideoFrame.getHideAtShowing(), false);
        if (((VideoFrame) iVideoFrame).mo268du().m63437k4() == 2) {
            hgnVar.m33336x1().m42704k4(999L);
        }
        if (iVideoFrame.getVolume() == 0) {
            hgnVar.m33336x1().m42705k4(true);
        }
        hgnVar.m33336x1().m42703k4(kjx.m63923k4(iVideoFrame.getVolume()) * 100.0f);
        hgnVar.m33336x1().m42700du().m36302kk(iVideoFrame.getRewindVideo() ? (byte) 0 : (byte) 2);
        if (iTiming == null || iVideoFrame.getPlayLoopMode()) {
            lmhVarM42700du = hgnVar.m33336x1().m42700du();
            repeatCount = iVideoFrame.getPlayLoopMode() ? Float.POSITIVE_INFINITY : 1.0f;
        } else {
            lmhVarM42700du = hgnVar.m33336x1().m42700du();
            repeatCount = iTiming.getRepeatCount();
        }
        lmhVarM42700du.m36327x1(C13670j2.m63187k4(repeatCount));
    }

    /* JADX INFO: renamed from: k4 */
    private static void m69420k4(com.aspose.slides.internal.p332p7.no7 no7Var, com.aspose.slides.internal.p332p7.rx0 rx0Var) {
        com.aspose.slides.internal.p332p7.vsk vskVar;
        if (no7Var == null || no7Var.m37765h4() == null || no7Var.m37765h4().m36320v4() == null) {
            return;
        }
        for (com.aspose.slides.internal.p332p7.bnx bnxVar : no7Var.m37765h4().m36320v4().m31106x1()) {
            if (bnxVar.m29013kk() != null && (vskVar = (com.aspose.slides.internal.p332p7.vsk) C7019kk.m27452k4((Object) bnxVar.m29013kk().m29542x1(), com.aspose.slides.internal.p332p7.vsk.class)) != null) {
                vskVar.m43242k4(rx0Var.m40596k4().m36289h4());
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m69421k4(com.aspose.slides.internal.p332p7.rqz rqzVar) {
        com.aspose.slides.internal.p332p7.c6b c6bVar = (com.aspose.slides.internal.p332p7.c6b) rqzVar.m40178k4("audio").m29542x1();
        c6bVar.m29443x1().m42700du().m36284du((byte) 0);
        c6bVar.m29443x1().m42700du().m36314to((byte) 0);
        com.aspose.slides.internal.p332p7.bnx bnxVarM31105k4 = c6bVar.m29443x1().m42700du().m36293k4().m31105k4();
        bnxVarM31105k4.m29012k4((byte) 2);
        bnxVarM31105k4.m29015x1("0");
        bnxVarM31105k4.m29011k4("tn");
        com.aspose.slides.internal.p332p7.bnx bnxVarM31105k42 = c6bVar.m29443x1().m42700du().m36323x1().m31105k4();
        bnxVarM31105k42.m29012k4((byte) 10);
        bnxVarM31105k42.m29015x1("0");
        ((com.aspose.slides.internal.p332p7.ycb) bnxVarM31105k42.m29011k4("tgtEl").m29542x1()).m44925k4("sldTgt");
        c6bVar.m29443x1().m42701h4().m44925k4("sndTgt");
    }

    /* JADX INFO: renamed from: k4 */
    public static void m69422k4(com.aspose.slides.internal.p332p7.rqz rqzVar, byte b, String str) {
        com.aspose.slides.internal.p332p7.zv9 zv9Var = (com.aspose.slides.internal.p332p7.zv9) rqzVar.m40178k4("cmd").m29542x1();
        zv9Var.m45967k4(b);
        zv9Var.m45968k4(str);
        zv9Var.m45969kk().m37765h4().m36284du((byte) 0);
        zv9Var.m45969kk().m37765h4().m36314to((byte) 0);
        com.aspose.slides.internal.p332p7.bnx bnxVarM31105k4 = zv9Var.m45969kk().m37765h4().m36293k4().m31105k4();
        bnxVarM31105k4.m29012k4((byte) 2);
        bnxVarM31105k4.m29015x1("0");
        bnxVarM31105k4.m29011k4("tn");
        zv9Var.m45969kk().m37771m9().m44925k4("sldTgt");
    }

    /* JADX INFO: renamed from: k4 */
    private static void m69423k4(com.aspose.slides.internal.p332p7.v2z v2zVar, int i, long j, boolean z, boolean z2) {
        v2zVar.m42700du().m36296k4(i);
        v2zVar.m42700du().m36325x1(0.0f);
        v2zVar.m42700du().m36303kk(0.0f);
        v2zVar.m42700du().m36314to((byte) 0);
        v2zVar.m42708x1(z);
        if (v2zVar.m42701h4().m44924k4() == null) {
            ((com.aspose.slides.internal.p332p7.sdd) v2zVar.m42701h4().m44925k4("spTgt").m29542x1()).m40967x1(C13850af.m65147x1(j));
        }
        if (v2zVar.m42700du().m36320v4() == null) {
            v2zVar.m42700du().m36293k4().m31105k4().m29015x1(C13670j2.m63187k4(Float.POSITIVE_INFINITY));
        }
        if (z2 && v2zVar.m42700du().m36307lr() == null) {
            com.aspose.slides.internal.p332p7.ei2 ei2VarM36323x1 = v2zVar.m42700du().m36323x1();
            com.aspose.slides.internal.p332p7.bnx bnxVarM31105k4 = ei2VarM36323x1.m31105k4();
            bnxVarM31105k4.m29015x1(C13670j2.m63187k4(0.0f));
            ((com.aspose.slides.internal.p332p7.ycb) bnxVarM31105k4.m29011k4("tgtEl").m29542x1()).m44925k4("sldTgt");
            bnxVarM31105k4.m29012k4((byte) 9);
            com.aspose.slides.internal.p332p7.bnx bnxVarM31105k42 = ei2VarM36323x1.m31105k4();
            bnxVarM31105k42.m29015x1(C13670j2.m63187k4(0.0f));
            ((com.aspose.slides.internal.p332p7.ycb) bnxVarM31105k42.m29011k4("tgtEl").m29542x1()).m44925k4("sldTgt");
            bnxVarM31105k42.m29012k4((byte) 10);
        }
    }
}

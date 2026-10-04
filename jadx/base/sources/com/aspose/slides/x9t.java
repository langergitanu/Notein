package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NullReferenceException;
import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.internal.p332p7.C7811gz;
import com.aspose.slides.internal.p332p7.C8528pk;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class x9t {

    /* JADX INFO: renamed from: k4 */
    private static final C7017h4 f50022k4 = new C7017h4("par", "audio", "spTgt", TranslateLanguage.BULGARIAN, "inkTgt", "sldTgt", "sndTgt", "tmAbs", "tmPct", "subSp", "oleChartEl", "txEl", "graphicEl");

    /* JADX INFO: renamed from: k4 */
    private static byte m73229k4(int i) {
        byte b = 1;
        if (i != 1) {
            b = 2;
            if (i != 2) {
                return (byte) 0;
            }
        }
        return b;
    }

    /* JADX INFO: renamed from: x1 */
    private static boolean m73269x1(com.aspose.slides.internal.p332p7.ei2 ei2Var, byte b) {
        com.aspose.slides.internal.p332p7.ycb ycbVar;
        if (ei2Var != null && ei2Var.m31106x1() != null && ei2Var.m31106x1().length != 0) {
            for (com.aspose.slides.internal.p332p7.bnx bnxVar : ei2Var.m31106x1()) {
                if (bnxVar.m29010k4() == b && bnxVar.m29013kk() != null && (ycbVar = (com.aspose.slides.internal.p332p7.ycb) C7019kk.m27452k4((Object) bnxVar.m29013kk().m29542x1(), com.aspose.slides.internal.p332p7.ycb.class)) != null && "sldTgt".equals(ycbVar.m44924k4().m29539k4())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    private static byte m73230k4(com.aspose.slides.internal.p332p7.no7 no7Var) {
        com.aspose.slides.internal.p332p7.sdd sddVar;
        if (no7Var == null || no7Var.m37771m9() == null || no7Var.m37771m9().m44924k4() == null || (sddVar = (com.aspose.slides.internal.p332p7.sdd) C7019kk.m27452k4((Object) no7Var.m37771m9().m44924k4().m29542x1(), com.aspose.slides.internal.p332p7.sdd.class)) == null || sddVar.m40966x1() == null) {
            return (byte) 0;
        }
        int iM27428k4 = f50022k4.m27428k4(sddVar.m40966x1().m29539k4());
        if (iM27428k4 == 3) {
            return (byte) 1;
        }
        switch (iM27428k4) {
            case 9:
                return (byte) 2;
            case 10:
                return (byte) 3;
            case 11:
                return (byte) 4;
            case 12:
                return (byte) 5;
            default:
                throw new InvalidOperationException("Unknown element");
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static float m73231k4(C7394ca c7394ca) {
        int iM27428k4 = f50022k4.m27428k4(c7394ca.m29539k4());
        if (iM27428k4 == 7) {
            return -C13670j2.m63183k4(((com.aspose.slides.internal.p332p7.ks4) c7394ca.m29542x1()).m35664k4());
        }
        if (iM27428k4 == 8) {
            return ((com.aspose.slides.internal.p332p7.fko) c7394ca.m29542x1()).m31808k4();
        }
        throw new Exception(C14113y2.m67408k4("Unknown element \"", c7394ca.m29539k4(), "\""));
    }

    /* JADX INFO: renamed from: k4 */
    private static int m73232k4(byte b) {
        int i = 1;
        if (b != 1) {
            i = 2;
            if (b != 2) {
                return 0;
            }
        }
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0141 A[PHI: r1
      0x0141: PHI (r1v12 int) = (r1v11 int), (r1v13 int) binds: [B:39:0x012f, B:41:0x0133] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Effect m73233k4(Sequence sequence, com.aspose.slides.internal.p332p7.rx0 rx0Var, com.aspose.slides.internal.p332p7.lmh lmhVar, yqd yqdVar) {
        int i;
        long jM36308m9 = lmhVar.m36308m9();
        long jM36281c5 = lmhVar.m36281c5();
        Effect effect = new Effect(sequence);
        m73246k4(effect.getTiming(), lmhVar);
        if (effect.getTiming().getRepeatCount() == Float.POSITIVE_INFINITY && m73269x1(lmhVar.m36307lr(), (byte) 8)) {
            effect.getTiming().setRepeatUntilNextClick(true);
        }
        effect.m1375kk().m7592x1(rx0Var);
        char c = 0;
        if (sequence.m2530k4().m6564dy() != null) {
            effect.getTiming().setTriggerType(sequence.m2530k4().m6561c5());
        } else {
            byte bM36317um = lmhVar.m36317um();
            if (bM36317um == 0) {
                effect.getTiming().setTriggerType(1);
            } else if (bM36317um == 1) {
                effect.getTiming().setTriggerType(2);
            } else if (bM36317um == 2) {
                effect.getTiming().setTriggerType(0);
            }
        }
        List.Enumerator<C7394ca> it = lmhVar.m36322wy().m40177k4().iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                IBehavior[] iBehaviorArr = {null};
                com.aspose.slides.internal.p332p7.no7[] no7VarArr = {null};
                boolean zM73268k4 = m73268k4(next, sequence, iBehaviorArr, no7VarArr);
                IBehavior iBehavior = iBehaviorArr[c];
                com.aspose.slides.internal.p332p7.no7 no7Var = no7VarArr[c];
                if (zM73268k4) {
                    ((Behavior) iBehavior).mo424k4().m72016k4(effect);
                    C1136g9.m6456k4(iBehavior, next.m29542x1(), yqdVar);
                    effect.getBehaviors().add(iBehavior);
                    m73251k4(sequence, no7Var, effect, iBehavior, yqdVar);
                }
                c = 0;
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        m73244k4(effect, lmhVar.m36277ak(), yqdVar);
        if (lmhVar.m36279b3() != null) {
            effect.m1375kk().m7593x1(lmhVar.m36279b3().m31499x1());
            effect.setAnimateTextType(m73232k4(lmhVar.m36279b3().m31494k4()));
            effect.setDelayBetweenTextParts(m73231k4(lmhVar.m36279b3().m31498kk()));
        }
        effect.m1375kk().m7565k4(lmhVar.m36286dy());
        byte bM7562jd = effect.m1375kk().m7562jd();
        if (bM7562jd != 0) {
            if (bM7562jd == 1) {
                effect.m1375kk().m7575kk(1);
            } else if (bM7562jd != 2) {
                int i2 = 3;
                if (bM7562jd != 3) {
                    i2 = 5;
                    if (bM7562jd == 4) {
                        effect.m1375kk().m7575kk(i2);
                    } else if (bM7562jd == 5) {
                        effect.m1375kk().m7575kk(4);
                    }
                }
            } else {
                effect.m1375kk().m7575kk(2);
            }
            i = 0;
        } else {
            i = 0;
            effect.m1375kk().m7575kk(0);
        }
        effect.m1375kk().m7566k4((int) lmhVar.m36311qq());
        effect.m1375kk().m7574k4(m73230k4(C13670j2.m63206x1(lmhVar.m36322wy().m40177k4().get_Item(i))) != 1 ? i : 1);
        effect.m1375kk().m7585to(C1243i8.m7546k4(jM36308m9, lmhVar.m36286dy()));
        effect.m1375kk().m7555du(C1243i8.m7549x1(effect.m1375kk().m7562jd(), effect.m1375kk().m7595yj(), jM36281c5));
        return effect;
    }

    /* JADX INFO: renamed from: k4 */
    public static Effect m73234k4(Sequence sequence, com.aspose.slides.internal.p332p7.rx0 rx0Var, com.aspose.slides.internal.p332p7.rx0 rx0Var2, yqd yqdVar) {
        Effect effectM73233k4;
        boolean zM27456k4;
        Effect effectM73234k4;
        com.aspose.slides.internal.p332p7.lmh lmhVarM40596k4 = rx0Var2.m40596k4();
        if (lmhVarM40596k4.m36308m9() - (-2147483648L) != -1) {
            effectM73233k4 = m73233k4(sequence, rx0Var, lmhVarM40596k4, yqdVar);
            sequence.m2530k4().m6576to().addItem(effectM73233k4);
        } else {
            effectM73233k4 = null;
        }
        if (lmhVarM40596k4.m36322wy() != null) {
            List.Enumerator<C7394ca> it = lmhVarM40596k4.m36322wy().m40177k4().iterator();
            while (it.hasNext()) {
                try {
                    com.aspose.slides.internal.p332p7.rx0 rx0Var3 = (com.aspose.slides.internal.p332p7.rx0) C7019kk.m27452k4((Object) it.next().m29542x1(), com.aspose.slides.internal.p332p7.rx0.class);
                    if (rx0Var3 != null && (effectM73234k4 = m73234k4(sequence, rx0Var2, rx0Var3, yqdVar)) != null && C14064he.m66715kk(effectM73234k4.getTiming().getTriggerDelayTime())) {
                        m73260k4(lmhVarM40596k4, effectM73234k4.getTiming());
                    }
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            if (zM27456k4) {
                return effectM73233k4;
            }
        }
        return effectM73233k4;
    }

    /* JADX INFO: renamed from: k4 */
    public static IShape m73235k4(yqd yqdVar, com.aspose.slides.internal.p332p7.ycb ycbVar) {
        if ("spTgt".equals(ycbVar.m44924k4().m29539k4())) {
            return m73236k4(yqdVar, ((com.aspose.slides.internal.p332p7.sdd) C7019kk.m27452k4((Object) ycbVar.m44924k4().m29542x1(), com.aspose.slides.internal.p332p7.sdd.class)).m40964k4());
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public static IShape m73236k4(yqd yqdVar, String str) {
        if (str != null && yqdVar.m74068k4().containsKey(str)) {
            return (IShape) C7019kk.m27452k4((Object) yqdVar.m74068k4().get_Item(str), IShape.class);
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    private static com.aspose.slides.internal.p332p7.rvh m73237k4(Sequence sequence, C7394ca.k4 k4Var, int i) {
        com.aspose.slides.internal.p332p7.rvh rvhVar = (com.aspose.slides.internal.p332p7.rvh) k4Var.mo2788k4("seq").m29542x1();
        rvhVar.m40577h4().m36296k4(i);
        rvhVar.m40579k4((byte) 1);
        rvhVar.m40584x1((byte) 1);
        rvhVar.m40577h4().m36309m9((byte) 4);
        rvhVar.m40577h4().m36324x1((byte) 1);
        rvhVar.m40577h4().m36302kk((byte) 2);
        rvhVar.m40577h4().m36285du("cancelBubble");
        m73259k4(rvhVar.m40577h4().m36293k4(), C13670j2.m63188k4(sequence.getTriggerShape()));
        m73259k4(rvhVar.m40583x1(), C13670j2.m63188k4(sequence.getTriggerShape()));
        com.aspose.slides.internal.p332p7.bnx bnxVarM36301kk = rvhVar.m40577h4().m36301kk();
        bnxVarM36301kk.m29012k4((byte) 3);
        bnxVarM36301kk.m29015x1(C13670j2.m63187k4(0.0f));
        ((com.aspose.slides.internal.p332p7.fdb) bnxVarM36301kk.m29011k4("rtn").m29542x1()).m31747k4(3);
        return rvhVar;
    }

    /* JADX INFO: renamed from: k4 */
    private static com.aspose.slides.internal.p332p7.rvh m73238k4(C7394ca.k4 k4Var, int i) {
        com.aspose.slides.internal.p332p7.rvh rvhVar = (com.aspose.slides.internal.p332p7.rvh) k4Var.mo2788k4("seq").m29542x1();
        rvhVar.m40577h4().m36296k4(i);
        rvhVar.m40579k4((byte) 1);
        rvhVar.m40584x1((byte) 1);
        rvhVar.m40577h4().m36299k4(C13670j2.m63187k4(Float.POSITIVE_INFINITY));
        rvhVar.m40577h4().m36309m9((byte) 3);
        m73258k4(rvhVar.m40578k4(), (byte) 9);
        m73258k4(rvhVar.m40583x1(), (byte) 8);
        return rvhVar;
    }

    /* JADX INFO: renamed from: k4 */
    private static com.aspose.slides.internal.p332p7.rx0 m73239k4(Dictionary<Long, com.aspose.slides.internal.p332p7.rx0> dictionary, long j, Sequence sequence, com.aspose.slides.internal.p332p7.rqz rqzVar) {
        com.aspose.slides.internal.p332p7.rx0 rx0VarM73243k4 = m73243k4(sequence, rqzVar);
        rx0VarM73243k4.m40596k4().m36283du();
        dictionary.addItem(Long.valueOf(j), rx0VarM73243k4);
        return rx0VarM73243k4;
    }

    /* JADX INFO: renamed from: k4 */
    private static com.aspose.slides.internal.p332p7.rx0 m73240k4(Effect effect, Sequence sequence, C7394ca.k4 k4Var) {
        com.aspose.slides.internal.p332p7.rx0 rx0Var = (com.aspose.slides.internal.p332p7.rx0) k4Var.mo2788k4("par").m29542x1();
        sequence.m2530k4().m6572k4(rx0Var);
        int iM6577x1 = sequence.m2530k4().m6577x1() + 1;
        sequence.m2530k4().m6570k4(iM6577x1);
        rx0Var.m40596k4().m36296k4(iM6577x1);
        rx0Var.m40596k4().m36302kk((byte) 2);
        rx0Var.m40596k4().m36309m9(effect.m1375kk().m7556dy() == null ? (byte) 7 : effect.m1375kk().m7556dy().m40596k4().m36317um());
        rx0Var.m40596k4().m36293k4().m31105k4().m29015x1((effect.m1375kk().m7556dy() == null || effect.m1375kk().m7556dy().m40596k4().m36320v4() == null || effect.m1375kk().m7556dy().m40596k4().m36320v4().m31106x1() == null || effect.m1375kk().m7556dy().m40596k4().m36320v4().m31106x1().length <= 0) ? C13670j2.m63187k4(sequence.m2530k4().m6563du()) : effect.m1375kk().m7556dy().m40596k4().m36320v4().m31106x1()[0].m29014x1());
        return rx0Var;
    }

    /* JADX INFO: renamed from: k4 */
    private static com.aspose.slides.internal.p332p7.rx0 m73241k4(Sequence sequence, C7394ca.k4 k4Var) {
        return m73242k4(sequence, k4Var, Float.POSITIVE_INFINITY);
    }

    /* JADX INFO: renamed from: k4 */
    private static com.aspose.slides.internal.p332p7.rx0 m73242k4(Sequence sequence, C7394ca.k4 k4Var, float f) {
        sequence.m2530k4().m6578x1(0.0f);
        com.aspose.slides.internal.p332p7.rx0 rx0Var = (com.aspose.slides.internal.p332p7.rx0) k4Var.mo2788k4("par").m29542x1();
        sequence.m2530k4().m6580x1(rx0Var);
        int iM6577x1 = sequence.m2530k4().m6577x1() + 1;
        sequence.m2530k4().m6570k4(iM6577x1);
        rx0Var.m40596k4().m36296k4(iM6577x1);
        rx0Var.m40596k4().m36302kk((byte) 2);
        rx0Var.m40596k4().m36309m9((byte) 7);
        rx0Var.m40596k4().m36293k4().m31105k4().m29015x1(C13670j2.m63187k4(f));
        return rx0Var;
    }

    /* JADX INFO: renamed from: k4 */
    private static com.aspose.slides.internal.p332p7.rx0 m73243k4(Sequence sequence, final com.aspose.slides.internal.p332p7.rqz rqzVar) {
        final com.aspose.slides.internal.p332p7.rx0 rx0VarM73241k4 = m73241k4(sequence, new C7394ca.k4() { // from class: com.aspose.slides.x9t.5
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(rqzVar) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.p_CT_TimeNodeListElementData.AddNode(System.String)";
            }

            @Override // com.aspose.slides.internal.p332p7.C7394ca.k4
            /* JADX INFO: renamed from: k4 */
            public C7394ca mo2788k4(String str) {
                return rqzVar.m40178k4(str);
            }
        });
        rx0VarM73241k4.m40596k4().m36309m9((byte) 5);
        if (sequence.m2530k4().m6567k4() == 4 && rqzVar.m40177k4().size() == 1) {
            rx0VarM73241k4.m40596k4().m36320v4().m31106x1()[0].m29015x1(C13670j2.m63187k4(0.0f));
        }
        m73250k4(sequence, new AbstractC4685kk<com.aspose.slides.internal.p332p7.bnx>() { // from class: com.aspose.slides.x9t.6
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(rx0VarM73241k4.m40596k4().m36320v4()) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.p_CT_TLTimeConditionListElementData.AddCond()";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public com.aspose.slides.internal.p332p7.bnx invoke() {
                return rx0VarM73241k4.m40596k4().m36320v4().m31105k4();
            }
        });
        return rx0VarM73241k4;
    }

    /* JADX INFO: renamed from: k4 */
    private static void m73244k4(Effect effect, com.aspose.slides.internal.p332p7.rqz rqzVar, yqd yqdVar) {
        com.aspose.slides.internal.p332p7.bc9 bc9Var;
        if (rqzVar == null) {
            return;
        }
        com.aspose.slides.internal.p332p7.rqz rqzVar2 = new com.aspose.slides.internal.p332p7.rqz();
        List.Enumerator<C7394ca> it = rqzVar.m40177k4().iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                com.aspose.slides.internal.p332p7.c6b c6bVar = (com.aspose.slides.internal.p332p7.c6b) C7019kk.m27452k4((Object) next.m29542x1(), com.aspose.slides.internal.p332p7.c6b.class);
                if (c6bVar != null) {
                    m73265k4(yqdVar, c6bVar, effect);
                } else {
                    com.aspose.slides.internal.p332p7.zv9 zv9Var = (com.aspose.slides.internal.p332p7.zv9) C7019kk.m27452k4((Object) next.m29542x1(), com.aspose.slides.internal.p332p7.zv9.class);
                    if (zv9Var == null || !C14113y2.m67363du(zv9Var.m45970x1(), C14113y2.m67368h4("onStopAudio"))) {
                        com.aspose.slides.internal.p332p7.nbb nbbVar = (com.aspose.slides.internal.p332p7.nbb) C7019kk.m27452k4((Object) next.m29542x1(), com.aspose.slides.internal.p332p7.nbb.class);
                        if (nbbVar != null) {
                            effect.setAfterAnimationType(1);
                            C1246ib.m7611k4(effect.getAfterAnimationColor(), nbbVar.m37351c5());
                        } else {
                            com.aspose.slides.internal.p332p7.oeg oegVar = (com.aspose.slides.internal.p332p7.oeg) C7019kk.m27452k4((Object) next.m29542x1(), com.aspose.slides.internal.p332p7.oeg.class);
                            if (oegVar != null && oegVar.m38215kk() != null && oegVar.m38216x1() != null && (bc9Var = (com.aspose.slides.internal.p332p7.bc9) C7019kk.m27452k4((Object) oegVar.m38215kk().m34176k4().m29542x1(), com.aspose.slides.internal.p332p7.bc9.class)) != null && "hidden".equals(bc9Var.m28815k4())) {
                                com.aspose.slides.internal.p332p7.lmh lmhVarM37765h4 = oegVar.m38216x1().m37765h4();
                                if (lmhVarM37765h4.m36278ar() == 1) {
                                    byte bM36321wl = lmhVarM37765h4.m36321wl();
                                    if (bM36321wl == 0) {
                                        effect.setAfterAnimationType(2);
                                    } else if (bM36321wl == 2) {
                                        effect.setAfterAnimationType(3);
                                    }
                                }
                            }
                            rqzVar2.m40179k4(next);
                        }
                    } else {
                        effect.m1375kk().m7576kk(true);
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
        if (rqzVar2.m40177k4().size() > 0) {
            effect.m1375kk().m7571k4(rqzVar2);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m73245k4(Effect effect, com.aspose.slides.internal.p332p7.rx0 rx0Var) {
        com.aspose.slides.internal.p332p7.rqz rqzVarM36277ak = rx0Var.m40596k4().m36277ak();
        int afterAnimationType = effect.getAfterAnimationType();
        if (afterAnimationType == 1) {
            m73262k4(rqzVarM36277ak, effect);
        } else if (afterAnimationType == 2) {
            m73264k4(rx0Var, effect, (byte) 0);
        } else {
            if (afterAnimationType != 3) {
                return;
            }
            m73264k4(rx0Var, effect, (byte) 2);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m73246k4(ITiming iTiming, com.aspose.slides.internal.p332p7.lmh lmhVar) {
        iTiming.setAccelerate(lmhVar.m36330yj() / 100.0f);
        iTiming.setDecelerate(lmhVar.m36306ks() / 100.0f);
        iTiming.setAutoReverse(lmhVar.m36312rv());
        iTiming.setRepeatCount(C13670j2.m63183k4(lmhVar.m36282ck()));
        iTiming.setRepeatDuration(C13670j2.m63183k4(lmhVar.m36288fa()));
        iTiming.setRestart(lmhVar.m36328x6());
        iTiming.setSpeed(lmhVar.m36318up() / 100.0f);
        Timing timing = (Timing) iTiming;
        timing.m3018k4(C13670j2.m63183k4(lmhVar.m36292jd()));
        timing.m3019k4((int) lmhVar.m36310ne());
        m73260k4(lmhVar, iTiming);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m73247k4(Sequence sequence, Effect effect, com.aspose.slides.internal.p332p7.rx0 rx0Var) {
        C7394ca c7394ca;
        final com.aspose.slides.internal.p332p7.rqz rqzVarM36283du = effect.getBehaviors().getCount() > 0 ? rx0Var.m40596k4().m36283du() : null;
        IGenericEnumerator<IBehavior> it = effect.getBehaviors().iterator();
        while (it.hasNext()) {
            try {
                IBehavior next = it.next();
                C14659v0 c14659v0Mo424k4 = ((Behavior) next).mo424k4();
                com.aspose.slides.internal.p332p7.no7[] no7VarArr = {null};
                C1136g9.m6457k4(next, new C7394ca.k4() { // from class: com.aspose.slides.x9t.8
                    @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                    public String getDelegateId() {
                        return System.identityHashCode(rqzVarM36283du) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.p_CT_TimeNodeListElementData.AddNode(System.String)";
                    }

                    @Override // com.aspose.slides.internal.p332p7.C7394ca.k4
                    /* JADX INFO: renamed from: k4 */
                    public C7394ca mo2788k4(String str) {
                        return rqzVarM36283du.m40178k4(str);
                    }
                }, no7VarArr);
                com.aspose.slides.internal.p332p7.no7 no7Var = no7VarArr[0];
                if (no7Var == null) {
                    throw new PptxException("fail.");
                }
                byte accumulate = next.getAccumulate();
                if (accumulate == -1) {
                    no7Var.m37775x1((byte) -1);
                } else if (accumulate == 0) {
                    no7Var.m37775x1((byte) 0);
                } else if (accumulate == 1) {
                    no7Var.m37775x1((byte) 1);
                }
                no7Var.m37768k4(c14659v0Mo424k4.m72019x1());
                Timing timing = (Timing) next.getTiming();
                if (!C14064he.m66715kk(timing.m3017k4())) {
                    no7Var.m37765h4().m36299k4(C13670j2.m63187k4(timing.m3017k4()));
                }
                no7Var.m37765h4().m36295k4(timing.getSpeed() * 100.0f);
                no7Var.m37765h4().m36325x1(timing.getAccelerate() * 100.0f);
                no7Var.m37765h4().m36303kk(timing.getDecelerate() * 100.0f);
                no7Var.m37765h4().m36300k4(timing.getAutoReverse());
                if (timing.getRepeatCount() != 1.0f) {
                    no7Var.m37765h4().m36327x1(C13670j2.m63187k4(timing.getRepeatCount()));
                }
                no7Var.m37767k4((byte) next.getAdditive());
                com.aspose.slides.internal.p332p7.sdd sddVar = (com.aspose.slides.internal.p332p7.sdd) no7Var.m37771m9().m44925k4("spTgt").m29542x1();
                sddVar.m40967x1(C13670j2.m63188k4(effect.m1375kk().m7584to()));
                if (C7019kk.m27469x1(effect.m1375kk().m7584to(), Chart.class) && !C14272pa.m68985k4(effect)) {
                    C14272pa.m68982k4(sddVar, sequence.m2530k4().m6576to(), effect, (Chart) effect.m1375kk().m7584to());
                }
                if (effect.m1375kk().m7577kk() && sddVar.m40966x1() == null) {
                    sddVar.m40963k4(TranslateLanguage.BULGARIAN);
                }
                if (effect.m1375kk().m7581ne() != null && effect.m1375kk().m7581ne().m40966x1() != null) {
                    C7811gz c7811gz = (C7811gz) C7019kk.m27452k4((Object) effect.m1375kk().m7581ne().m40966x1().m29542x1(), C7811gz.class);
                    if (c7811gz != null) {
                        c7394ca = new C7394ca("graphicEl", c7811gz);
                    } else {
                        com.aspose.slides.internal.p332p7.hof hofVar = (com.aspose.slides.internal.p332p7.hof) C7019kk.m27452k4((Object) effect.m1375kk().m7581ne().m40966x1().m29542x1(), com.aspose.slides.internal.p332p7.hof.class);
                        if (hofVar != null) {
                            c7394ca = new C7394ca("oleChartEl", hofVar);
                        }
                    }
                    sddVar.m40965k4(c7394ca);
                }
                no7Var.m37765h4().m36302kk((byte) ((Timing) next.getTiming()).m3021x1());
                no7Var.m37773to(c14659v0Mo424k4.m72014k4());
                no7Var.m37765h4().m36315to(c14659v0Mo424k4.m72018kk());
                int iM6577x1 = sequence.m2530k4().m6577x1() + 1;
                sequence.m2530k4().m6570k4(iM6577x1);
                no7Var.m37765h4().m36296k4(iM6577x1);
                float triggerDelayTime = C14064he.m66715kk(timing.getTriggerDelayTime()) ? 0.0f : timing.getTriggerDelayTime();
                if (timing.m3017k4() + triggerDelayTime > sequence.m2530k4().m6575m9()) {
                    sequence.m2530k4().m6574kk(triggerDelayTime + timing.m3017k4());
                }
                if (!C14064he.m66715kk(timing.getTriggerDelayTime())) {
                    no7Var.m37765h4().m36293k4().m31105k4().m29015x1(C13670j2.m63187k4(timing.getTriggerDelayTime()));
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
    public static void m73248k4(Sequence sequence, Effect effect, boolean z, C7394ca.k4 k4Var, gi8 gi8Var, com.aspose.slides.internal.p332p7.rqz rqzVar) {
        com.aspose.slides.internal.p332p7.lmh lmhVarM40596k4;
        com.aspose.slides.internal.p332p7.rx0 rx0VarM73240k4 = (!z || sequence.m2530k4().m6573kk() == null) ? m73240k4(effect, sequence, k4Var) : sequence.m2530k4().m6573kk();
        com.aspose.slides.internal.p332p7.rqz rqzVarM36322wy = rx0VarM73240k4.m40596k4().m36322wy();
        if (rqzVarM36322wy == null) {
            rqzVarM36322wy = rx0VarM73240k4.m40596k4().m36283du();
        }
        com.aspose.slides.internal.p332p7.rx0 rx0Var = (com.aspose.slides.internal.p332p7.rx0) rqzVarM36322wy.m40178k4("par").m29542x1();
        byte b = 1;
        int iM6577x1 = sequence.m2530k4().m6577x1() + 1;
        sequence.m2530k4().m6570k4(iM6577x1);
        rx0Var.m40596k4().m36296k4(iM6577x1);
        rx0Var.m40596k4().m36297k4(C1243i8.m7544k4(effect.m1375kk().m7595yj(), effect.m1375kk().m7562jd()));
        rx0Var.m40596k4().m36326x1(C1243i8.m7542ck(effect.m1375kk().m7578ks()));
        rx0Var.m40596k4().m36294k4(effect.m1375kk().m7562jd());
        Timing timing = (Timing) effect.getTiming();
        rx0Var.m40596k4().m36325x1(timing.getAccelerate() * 100.0f);
        rx0Var.m40596k4().m36303kk(timing.getDecelerate() * 100.0f);
        rx0Var.m40596k4().m36300k4(timing.getAutoReverse());
        rx0Var.m40596k4().m36324x1((byte) timing.getRestart());
        rx0Var.m40596k4().m36295k4(timing.getSpeed() * 100.0f);
        if (effect.m1375kk().m7564k4() != -1) {
            rx0Var.m40596k4().m36304kk(((long) effect.m1375kk().m7564k4()) & 4294967295L);
        }
        if (!C14064he.m66715kk(timing.m3017k4())) {
            rx0Var.m40596k4().m36299k4(C13670j2.m63187k4(timing.m3017k4()));
        }
        if (timing.getRepeatCount() != 1.0f && effect.getPresetClassType() != 4) {
            rx0Var.m40596k4().m36327x1(C13670j2.m63187k4(timing.getRepeatCount()));
            if (timing.getRepeatUntilNextClick() && !m73269x1(rx0Var.m40596k4().m36307lr(), (byte) 8)) {
                m73258k4(rx0Var.m40596k4().m36323x1(), (byte) 8);
            }
        }
        rx0Var.m40596k4().m36302kk((byte) ((Timing) effect.getTiming()).m3021x1());
        if (effect.m1375kk().m7553ck() || effect.getAnimateTextType() != 0 || effect.getDelayBetweenTextParts() != 0.0f) {
            final com.aspose.slides.internal.p332p7.eza ezaVarM36313to = rx0Var.m40596k4().m36313to();
            ezaVarM36313to.m31497k4(effect.m1375kk().m7553ck());
            ezaVarM36313to.m31496k4(m73229k4(effect.getAnimateTextType()));
            m73257k4(new C7394ca.k4() { // from class: com.aspose.slides.x9t.7
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return System.identityHashCode(ezaVarM36313to) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.p_CT_TLIterateDataElementData.AddIterateInterval(System.String)";
                }

                @Override // com.aspose.slides.internal.p332p7.C7394ca.k4
                /* JADX INFO: renamed from: k4 */
                public C7394ca mo2788k4(String str) {
                    return ezaVarM36313to.m31495k4(str);
                }
            }, effect.getDelayBetweenTextParts());
        }
        effect.m1375kk().m7572k4(rx0Var);
        int triggerType = timing.getTriggerType();
        if (triggerType != 0) {
            if (triggerType == 1) {
                lmhVarM40596k4 = rx0Var.m40596k4();
                b = 0;
            } else {
                if (triggerType != 2) {
                    throw new ArgumentOutOfRangeException("effect");
                }
                lmhVarM40596k4 = rx0Var.m40596k4();
            }
            lmhVarM40596k4.m36309m9(b);
        } else {
            rx0Var.m40596k4().m36309m9((byte) 2);
        }
        m73263k4(rx0Var, effect);
        sequence.m2530k4().m6574kk(0.0f);
        m73247k4(sequence, effect, rx0Var);
        com.aspose.slides.internal.p332p7.rqz rqzVarM7558fa = effect.m1375kk().m7558fa();
        if (rqzVarM7558fa == null) {
            rqzVarM7558fa = new com.aspose.slides.internal.p332p7.rqz();
        }
        rx0Var.m40596k4().m36298k4(rqzVarM7558fa);
        q5v.m69414k4(sequence, effect, rx0Var, gi8Var, rqzVar);
        m73245k4(effect, rx0Var);
        if (rx0Var.m40596k4().m36277ak().m40177k4().size() == 0) {
            rx0Var.m40596k4().m36298k4((com.aspose.slides.internal.p332p7.rqz) null);
        }
        float triggerDelayTime = C14064he.m66715kk(effect.getTiming().getTriggerDelayTime()) ? 0.0f : effect.getTiming().getTriggerDelayTime();
        if (effect.getTiming().getTriggerType() != 2) {
            sequence.m2530k4().m6578x1(sequence.m2530k4().m6575m9() + triggerDelayTime);
            sequence.m2530k4().m6574kk(sequence.m2530k4().m6575m9() + sequence.m2530k4().m6565h4());
            sequence.m2530k4().m6569k4(sequence.m2530k4().m6563du() + sequence.m2530k4().m6565h4());
            return;
        }
        float fM6575m9 = sequence.m2530k4().m6575m9() + triggerDelayTime;
        if (fM6575m9 > sequence.m2530k4().m6565h4()) {
            sequence.m2530k4().m6569k4(sequence.m2530k4().m6563du() - sequence.m2530k4().m6565h4());
            sequence.m2530k4().m6569k4(sequence.m2530k4().m6563du() + fM6575m9);
            sequence.m2530k4().m6574kk(fM6575m9);
            sequence.m2530k4().m6578x1(sequence.m2530k4().m6575m9());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0195 A[SYNTHETIC] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m73249k4(Sequence sequence, IShapeCollection iShapeCollection, int[] iArr, com.aspose.slides.internal.p332p7.rqz rqzVar, gi8 gi8Var) {
        com.aspose.slides.internal.p332p7.rvh rvhVarM73237k4;
        boolean z;
        com.aspose.slides.internal.p332p7.rvh rvhVar;
        Dictionary dictionary;
        final com.aspose.slides.internal.p332p7.rx0 rx0VarM73239k4;
        boolean z2;
        Sequence sequence2 = sequence;
        final com.aspose.slides.internal.p332p7.rqz rqzVar2 = rqzVar;
        gi8 gi8Var2 = gi8Var;
        if (sequence2.getCount() == 0) {
            return;
        }
        boolean z3 = false;
        if (sequence2.m2530k4().m6567k4() == 3) {
            iArr[0] = iArr[0] + 1;
            rvhVarM73237k4 = m73238k4(new C7394ca.k4() { // from class: com.aspose.slides.x9t.1
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return System.identityHashCode(rqzVar2) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.p_CT_TimeNodeListElementData.AddNode(System.String)";
                }

                @Override // com.aspose.slides.internal.p332p7.C7394ca.k4
                /* JADX INFO: renamed from: k4 */
                public C7394ca mo2788k4(String str) {
                    return rqzVar2.m40178k4(str);
                }
            }, iArr[0]);
        } else {
            if (sequence2.m2530k4().m6567k4() != 4) {
                throw new InvalidOperationException("Unknown sequence type");
            }
            if (!gi8Var2.m6694k4(sequence2.getTriggerShape())) {
                return;
            }
            iArr[0] = iArr[0] + 1;
            rvhVarM73237k4 = m73237k4(sequence2, new C7394ca.k4() { // from class: com.aspose.slides.x9t.2
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return System.identityHashCode(rqzVar2) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.p_CT_TimeNodeListElementData.AddNode(System.String)";
                }

                @Override // com.aspose.slides.internal.p332p7.C7394ca.k4
                /* JADX INFO: renamed from: k4 */
                public C7394ca mo2788k4(String str) {
                    return rqzVar2.m40178k4(str);
                }
            }, iArr[0]);
        }
        com.aspose.slides.internal.p332p7.rvh rvhVar2 = rvhVarM73237k4;
        sequence2.m2530k4().m6570k4(iArr[0]);
        com.aspose.slides.internal.p332p7.rqz rqzVarM36283du = null;
        sequence2.m2530k4().m6572k4((com.aspose.slides.internal.p332p7.rx0) null);
        sequence2.m2530k4().m6574kk(0.0f);
        sequence2.m2530k4().m6578x1(0.0f);
        sequence2.m2530k4().m6569k4(0.0f);
        if (sequence2.m2530k4().m6576to().size() == 0) {
            m73243k4(sequence2, rvhVar2.m40577h4().m36283du());
        } else {
            Dictionary dictionary2 = new Dictionary();
            Dictionary dictionary3 = new Dictionary();
            com.aspose.slides.internal.p332p7.rx0 rx0VarM73243k4 = null;
            int i = 0;
            while (i < sequence2.m2530k4().m6576to().size()) {
                Effect effect = (Effect) sequence2.m2530k4().m6576to().get_Item(i);
                IShape iShapeM7584to = effect.m1375kk().m7584to();
                boolean zM73267k4 = m73267k4(sequence2, effect);
                if (gi8Var2.m6694k4(iShapeM7584to)) {
                    if (rqzVarM36283du == null) {
                        rqzVarM36283du = rvhVar2.m40577h4().m36283du();
                    }
                    com.aspose.slides.internal.p332p7.rqz rqzVar3 = rqzVarM36283du;
                    z = z3;
                    rvhVar = rvhVar2;
                    long jM63205x1 = C13670j2.m63205x1(iShapeM7584to);
                    Dictionary dictionary4 = dictionary2;
                    long jM7590x1 = ((long) effect.m1375kk().m7590x1()) & 4294967295L;
                    if (rx0VarM73243k4 != null && zM73267k4) {
                        dictionary = dictionary4;
                    } else if (dictionary3.containsKey(Long.valueOf(jM63205x1))) {
                        dictionary = dictionary4;
                        if (!dictionary.containsKey(Long.valueOf(jM7590x1))) {
                            rx0VarM73243k4 = m73239k4((Dictionary<Long, com.aspose.slides.internal.p332p7.rx0>) dictionary, jM7590x1, sequence2, rqzVar3);
                        } else if (C7019kk.m27469x1(iShapeM7584to, IChart.class)) {
                            rx0VarM73243k4 = m73243k4(sequence2, rqzVar3);
                            rx0VarM73243k4.m40596k4().m36283du();
                        }
                    } else {
                        rx0VarM73239k4 = m73239k4((Dictionary<Long, com.aspose.slides.internal.p332p7.rx0>) dictionary3, jM63205x1, sequence2, rqzVar3);
                        dictionary = dictionary4;
                        if (i <= 0 && effect.getTiming().getTriggerType() == 1) {
                            sequence2.m2530k4().m6569k4(0.0f);
                        }
                        if (rx0VarM73239k4 != null) {
                            throw new NullReferenceException("JointElement couldn't be empty.");
                        }
                        if (effect.getTiming().getTriggerType() == 0) {
                            sequence2.m2530k4().m6572k4(m73242k4(sequence2, new C7394ca.k4() { // from class: com.aspose.slides.x9t.3
                                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                                public String getDelegateId() {
                                    return System.identityHashCode(rx0VarM73239k4.m40596k4().m36322wy()) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.p_CT_TimeNodeListElementData.AddNode(System.String)";
                                }

                                @Override // com.aspose.slides.internal.p332p7.C7394ca.k4
                                /* JADX INFO: renamed from: k4 */
                                public C7394ca mo2788k4(String str) {
                                    return rx0VarM73239k4.m40596k4().m36322wy().m40178k4(str);
                                }
                            }, sequence2.m2530k4().m6563du()));
                            z2 = true;
                        } else {
                            z2 = zM73267k4;
                        }
                        m73248k4(sequence2, effect, z2, new C7394ca.k4() { // from class: com.aspose.slides.x9t.4
                            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                            public String getDelegateId() {
                                return System.identityHashCode(rx0VarM73239k4.m40596k4().m36322wy()) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.p_CT_TimeNodeListElementData.AddNode(System.String)";
                            }

                            @Override // com.aspose.slides.internal.p332p7.C7394ca.k4
                            /* JADX INFO: renamed from: k4 */
                            public C7394ca mo2788k4(String str) {
                                return rx0VarM73239k4.m40596k4().m36322wy().m40178k4(str);
                            }
                        }, gi8Var2, rqzVar2);
                        rx0VarM73243k4 = rx0VarM73239k4;
                        rqzVarM36283du = rqzVar3;
                    }
                    rx0VarM73239k4 = rx0VarM73243k4;
                    if (i <= 0) {
                        if (rx0VarM73239k4 != null) {
                        }
                    }
                } else {
                    z = z3;
                    rvhVar = rvhVar2;
                    dictionary = dictionary2;
                }
                i++;
                sequence2 = sequence;
                rqzVar2 = rqzVar;
                gi8Var2 = gi8Var;
                dictionary2 = dictionary;
                rvhVar2 = rvhVar;
                z3 = z;
            }
        }
        iArr[z3 ? 1 : 0] = sequence.m2530k4().m6577x1();
    }

    /* JADX INFO: renamed from: k4 */
    private static void m73250k4(Sequence sequence, AbstractC4685kk<com.aspose.slides.internal.p332p7.bnx> abstractC4685kk) {
        Effect effect = (Effect) sequence.m2530k4().m6576to().get_Item(0);
        if (effect.getTiming().getTriggerType() == 0 || effect.getTiming().getTriggerType() == 2) {
            com.aspose.slides.internal.p332p7.bnx bnxVarInvoke = abstractC4685kk.invoke();
            bnxVarInvoke.m29015x1(C13670j2.m63187k4(0.0f));
            bnxVarInvoke.m29012k4((byte) 0);
            com.aspose.slides.internal.p332p7.vsk vskVar = (com.aspose.slides.internal.p332p7.vsk) bnxVarInvoke.m29011k4("tn").m29542x1();
            if (sequence.m2530k4().m6577x1() != 1) {
                vskVar.m43242k4(sequence.m2530k4().m6577x1() - 1);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0034 A[PHI: r1
      0x0034: PHI (r1v4 byte) = (r1v3 byte), (r1v5 byte) binds: [B:3:0x002c, B:6:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void m73251k4(Sequence sequence, com.aspose.slides.internal.p332p7.no7 no7Var, Effect effect, IBehavior iBehavior, yqd yqdVar) {
        C14659v0 c14659v0Mo424k4 = ((Behavior) iBehavior).mo424k4();
        com.aspose.slides.internal.p332p7.lmh lmhVarM37765h4 = no7Var.m37765h4();
        m73246k4(iBehavior.getTiming(), lmhVarM37765h4);
        c14659v0Mo424k4.m72015k4(no7Var.m37763du());
        c14659v0Mo424k4.m72020x1(lmhVarM37765h4.m36291ix());
        c14659v0Mo424k4.m72017k4(no7Var.m37772to());
        byte bM37769kk = no7Var.m37769kk();
        byte b = -1;
        if (bM37769kk == -1) {
            iBehavior.setAccumulate(b);
        } else if (bM37769kk != 0) {
            b = 1;
            if (bM37769kk == 1) {
            }
        } else {
            iBehavior.setAccumulate((byte) 0);
        }
        iBehavior.setAdditive(no7Var.m37774x1());
        if (sequence.m2530k4().m6564dy() != null) {
            effect.m1375kk().m7568k4(sequence.m2530k4().m6564dy());
            return;
        }
        com.aspose.slides.internal.p332p7.ycb ycbVarM37771m9 = no7Var.m37771m9();
        if (ycbVarM37771m9.m44924k4() == null) {
            return;
        }
        int iM27428k4 = f50022k4.m27428k4(ycbVarM37771m9.m44924k4().m29539k4());
        if (iM27428k4 != 2) {
            if (iM27428k4 != 3 && iM27428k4 != 4 && iM27428k4 != 5 && iM27428k4 != 6) {
                throw new PptxException("fail!");
            }
            return;
        }
        com.aspose.slides.internal.p332p7.sdd sddVar = (com.aspose.slides.internal.p332p7.sdd) C7019kk.m27452k4((Object) ycbVarM37771m9.m44924k4().m29542x1(), com.aspose.slides.internal.p332p7.sdd.class);
        effect.m1375kk().m7573k4(sddVar);
        effect.m1375kk().m7568k4(m73236k4(yqdVar, sddVar.m40964k4()));
        C7394ca c7394caM40966x1 = sddVar.m40966x1();
        if (c7394caM40966x1 == null || !"txEl".equals(c7394caM40966x1.m29539k4())) {
            return;
        }
        com.aspose.slides.internal.p332p7.nhj nhjVar = (com.aspose.slides.internal.p332p7.nhj) C7019kk.m27452k4((Object) c7394caM40966x1.m29542x1(), com.aspose.slides.internal.p332p7.nhj.class);
        AutoShape autoShape = (AutoShape) C7019kk.m27452k4((Object) effect.m1375kk().m7584to(), AutoShape.class);
        if (autoShape == null || autoShape.getTextFrame().getParagraphs().getCount() == 0) {
            return;
        }
        com.aspose.slides.internal.p332p7.a9h a9hVar = (com.aspose.slides.internal.p332p7.a9h) C7019kk.m27452k4((Object) nhjVar.m37517k4().m29542x1(), com.aspose.slides.internal.p332p7.a9h.class);
        if (!"pRg".equals(nhjVar.m37517k4().m29539k4())) {
            if (!"charRg".equals(nhjVar.m37517k4().m29539k4()) || m73266k4(effect, autoShape, a9hVar)) {
                return;
            }
            effect.m1375kk().m7570k4(a9hVar);
            return;
        }
        IParagraphCollection paragraphs = autoShape.getTextFrame().getParagraphs();
        if (((int) a9hVar.m28055k4()) >= paragraphs.getCount() || ((int) a9hVar.m28057x1()) >= paragraphs.getCount()) {
            return;
        }
        effect.m1374k4((int) a9hVar.m28055k4(), (int) a9hVar.m28057x1(), (ParagraphCollection) paragraphs);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m73252k4(Sequence sequence, com.aspose.slides.internal.p332p7.rqz rqzVar, yqd yqdVar) {
        if (rqzVar != null) {
            List.Enumerator<C7394ca> it = rqzVar.m40177k4().iterator();
            while (it.hasNext()) {
                try {
                    C7394ca next = it.next();
                    int iM27428k4 = f50022k4.m27428k4(next.m29539k4());
                    if (iM27428k4 == 0) {
                        m73234k4(sequence, (com.aspose.slides.internal.p332p7.rx0) null, (com.aspose.slides.internal.p332p7.rx0) C7019kk.m27452k4((Object) next.m29542x1(), com.aspose.slides.internal.p332p7.rx0.class), yqdVar);
                    } else {
                        if (iM27428k4 != 1) {
                            throw new PptxException("fail!");
                        }
                        m73255k4(sequence, yqdVar, (com.aspose.slides.internal.p332p7.c6b) C7019kk.m27452k4((Object) next.m29542x1(), com.aspose.slides.internal.p332p7.c6b.class));
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

    /* JADX INFO: renamed from: k4 */
    private static void m73253k4(Sequence sequence, com.aspose.slides.internal.p332p7.rvh rvhVar) {
        if (sequence == null || rvhVar == null || rvhVar.m40577h4().m36322wy() == null || rvhVar.m40577h4().m36322wy().m40177k4() == null) {
            return;
        }
        List.Enumerator<C7394ca> it = rvhVar.m40577h4().m36322wy().m40177k4().iterator();
        while (it.hasNext()) {
            try {
                com.aspose.slides.internal.p332p7.rx0 rx0Var = (com.aspose.slides.internal.p332p7.rx0) C7019kk.m27452k4((Object) it.next().m29542x1(), com.aspose.slides.internal.p332p7.rx0.class);
                if (rx0Var != null) {
                    List.Enumerator<IEffect> it2 = sequence.m2530k4().m6576to().iterator();
                    while (it2.hasNext()) {
                        try {
                            Effect effect = (Effect) it2.next();
                            if (effect.m1375kk().m7556dy() == null) {
                                effect.m1375kk().m7591x1(0);
                            } else if (effect.m1375kk().m7556dy().m40596k4().m36289h4() > rx0Var.m40596k4().m36289h4() || rx0Var.m40596k4().m36289h4() < 0) {
                                effect.m1375kk().m7591x1(sequence.m2531x1().m249k4().m386fa());
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
    public static void m73254k4(Sequence sequence, com.aspose.slides.internal.p332p7.rvh rvhVar, yqd yqdVar) {
        if (rvhVar == null) {
            throw new InvalidOperationException();
        }
        m73252k4(sequence, rvhVar.m40577h4().m36322wy(), yqdVar);
        m73253k4(sequence, rvhVar);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m73255k4(Sequence sequence, yqd yqdVar, com.aspose.slides.internal.p332p7.c6b c6bVar) {
        Effect effect = (Effect) sequence.m2530k4().m6576to().get_Item(sequence.m2530k4().m6576to().size() - 1);
        m73265k4(yqdVar, c6bVar, effect);
        C7394ca c7394ca = new C7394ca("audio", new com.aspose.slides.internal.p332p7.c6b());
        c7394ca.m29540k4(c6bVar);
        effect.m1375kk().m7571k4(new com.aspose.slides.internal.p332p7.rqz());
        effect.m1375kk().m7558fa().m40179k4(c7394ca);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m73256k4(Sequence sequence, com.aspose.slides.internal.p332p7.bnx[] bnxVarArr, yqd yqdVar) {
        com.aspose.slides.internal.p332p7.ycb ycbVar;
        for (com.aspose.slides.internal.p332p7.bnx bnxVar : bnxVarArr) {
            if (bnxVar.m29010k4() == 4 && bnxVar.m29013kk() != null && (ycbVar = (com.aspose.slides.internal.p332p7.ycb) C7019kk.m27452k4((Object) bnxVar.m29013kk().m29542x1(), com.aspose.slides.internal.p332p7.ycb.class)) != null && "spTgt".equals(ycbVar.m44924k4().m29539k4())) {
                sequence.setTriggerShape(m73236k4(yqdVar, ((com.aspose.slides.internal.p332p7.sdd) C7019kk.m27452k4((Object) ycbVar.m44924k4().m29542x1(), com.aspose.slides.internal.p332p7.sdd.class)).m40964k4()));
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m73257k4(C7394ca.k4 k4Var, float f) {
        if (f >= 0.0f) {
            ((com.aspose.slides.internal.p332p7.fko) k4Var.mo2788k4("tmPct").m29542x1()).m31809k4(f);
            return;
        }
        com.aspose.slides.internal.p332p7.ks4 ks4Var = (com.aspose.slides.internal.p332p7.ks4) k4Var.mo2788k4("tmAbs").m29542x1();
        if (C14064he.m66715kk(f)) {
            return;
        }
        ks4Var.m35665k4(C13670j2.m63187k4(-f));
    }

    /* JADX INFO: renamed from: k4 */
    private static void m73258k4(com.aspose.slides.internal.p332p7.ei2 ei2Var, byte b) {
        com.aspose.slides.internal.p332p7.bnx bnxVarM31105k4 = ei2Var.m31105k4();
        bnxVarM31105k4.m29012k4(b);
        bnxVarM31105k4.m29015x1(C13670j2.m63187k4(0.0f));
        ((com.aspose.slides.internal.p332p7.ycb) bnxVarM31105k4.m29011k4("tgtEl").m29542x1()).m44925k4("sldTgt");
    }

    /* JADX INFO: renamed from: k4 */
    private static void m73259k4(com.aspose.slides.internal.p332p7.ei2 ei2Var, String str) {
        com.aspose.slides.internal.p332p7.bnx bnxVarM31105k4 = ei2Var.m31105k4();
        bnxVarM31105k4.m29012k4((byte) 4);
        bnxVarM31105k4.m29015x1(C13670j2.m63187k4(0.0f));
        ((com.aspose.slides.internal.p332p7.sdd) ((com.aspose.slides.internal.p332p7.ycb) bnxVarM31105k4.m29011k4("tgtEl").m29542x1()).m44925k4("spTgt").m29542x1()).m40967x1(str);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m73260k4(com.aspose.slides.internal.p332p7.lmh lmhVar, ITiming iTiming) {
        if (lmhVar.m36320v4() != null) {
            for (com.aspose.slides.internal.p332p7.bnx bnxVar : lmhVar.m36320v4().m31106x1()) {
                if (!"indefinite".equals(bnxVar.m29014x1())) {
                    iTiming.setTriggerDelayTime(C13670j2.m63183k4(bnxVar.m29014x1()));
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m73261k4(com.aspose.slides.internal.p332p7.no7 no7Var, Effect effect, byte b) {
        no7Var.m37773to((byte) 1);
        no7Var.m37765h4().m36290h4((byte) 1);
        no7Var.m37765h4().m36284du(b);
        no7Var.m37765h4().m36314to((byte) 0);
        no7Var.m37765h4().m36302kk((byte) 2);
        no7Var.m37765h4().m36299k4("1");
        ((com.aspose.slides.internal.p332p7.sdd) no7Var.m37771m9().m44925k4("spTgt").m29542x1()).m40967x1(C13670j2.m63188k4(effect.m1375kk().m7584to()));
    }

    /* JADX INFO: renamed from: k4 */
    public static void m73262k4(com.aspose.slides.internal.p332p7.rqz rqzVar, Effect effect) {
        com.aspose.slides.internal.p332p7.nbb nbbVar = (com.aspose.slides.internal.p332p7.nbb) rqzVar.m40178k4("animClr").m29542x1();
        nbbVar.m37361x1((byte) 0);
        nbbVar.m37356k4((byte) 0);
        com.aspose.slides.internal.p332p7.no7 no7VarM37354h4 = nbbVar.m37354h4();
        m73261k4(no7VarM37354h4, effect, (byte) 2);
        no7VarM37354h4.m37766k4().m40903k4("ppt_c");
        C1246ib.m7612x1(effect.getAfterAnimationColor(), nbbVar.m37357kk());
    }

    /* JADX INFO: renamed from: k4 */
    private static void m73263k4(com.aspose.slides.internal.p332p7.rx0 rx0Var, Effect effect) {
        rx0Var.m40596k4().m36293k4().m31105k4().m29015x1(C13670j2.m63187k4(effect.getTiming().getTriggerDelayTime()));
    }

    /* JADX INFO: renamed from: k4 */
    public static void m73264k4(com.aspose.slides.internal.p332p7.rx0 rx0Var, Effect effect, byte b) {
        com.aspose.slides.internal.p332p7.oeg oegVar = (com.aspose.slides.internal.p332p7.oeg) rx0Var.m40596k4().m36277ak().m40178k4("set").m29542x1();
        com.aspose.slides.internal.p332p7.no7 no7VarM38216x1 = oegVar.m38216x1();
        m73261k4(no7VarM38216x1, effect, b);
        if (b == 0) {
            com.aspose.slides.internal.p332p7.bnx bnxVarM31105k4 = no7VarM38216x1.m37765h4().m36293k4().m31105k4();
            bnxVarM31105k4.m29012k4((byte) 3);
            bnxVarM31105k4.m29015x1("0");
            ((com.aspose.slides.internal.p332p7.vsk) bnxVarM31105k4.m29011k4("tn").m29542x1()).m43242k4(rx0Var.m40596k4().m36289h4());
        }
        no7VarM38216x1.m37766k4().m40903k4("style.visibility");
        ((com.aspose.slides.internal.p332p7.bc9) oegVar.m38214k4().m34177k4("strVal").m29542x1()).m28816k4("hidden");
    }

    /* JADX INFO: renamed from: k4 */
    private static void m73265k4(yqd yqdVar, com.aspose.slides.internal.p332p7.c6b c6bVar, Effect effect) {
        C8528pk c8528pk;
        if (c6bVar == null || c6bVar.m29443x1().m42701h4() == null || (c8528pk = (C8528pk) C7019kk.m27452k4((Object) c6bVar.m29443x1().m42701h4().m44924k4().m29542x1(), C8528pk.class)) == null) {
            return;
        }
        effect.m1375kk().m7567k4(yqdVar.m74069k4(c8528pk.m38951k4()));
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m73266k4(Effect effect, AutoShape autoShape, com.aspose.slides.internal.p332p7.a9h a9hVar) {
        if (C14113y2.m67411k4(autoShape.getTextFrame().getText())) {
            return false;
        }
        IParagraphCollection paragraphs = autoShape.getTextFrame().getParagraphs();
        int i = -1;
        int i2 = -1;
        int i3 = 0;
        for (int i4 = 0; i4 < paragraphs.getCount(); i4++) {
            IParagraph iParagraph = paragraphs.get_Item(i4);
            if (C14113y2.m67411k4(iParagraph.getText())) {
                i3++;
            } else {
                if (i == -1 && i3 == (a9hVar.m28055k4() & 4294967295L)) {
                    i = i4;
                }
                int length = ((Paragraph) C7019kk.m27452k4((Object) iParagraph, Paragraph.class)).m2168to().length() + i3 + 1;
                if (i2 == -1 && length == (4294967295L & a9hVar.m28057x1())) {
                    i2 = i4;
                }
                if (i > -1 && i2 > -1) {
                    effect.m1374k4(i, i2, (ParagraphCollection) paragraphs);
                    return true;
                }
                i3 = length;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m73267k4(Sequence sequence, Effect effect) {
        if (effect.getTiming().getTriggerType() != 2) {
            return effect.getTiming().getTriggerType() == 0 && sequence.m2530k4().m6573kk() != null;
        }
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m73268k4(C7394ca c7394ca, Sequence sequence, IBehavior[] iBehaviorArr, com.aspose.slides.internal.p332p7.no7[] no7VarArr) {
        if ("animMotion".equals(c7394ca.m29539k4())) {
            no7VarArr[0] = ((com.aspose.slides.internal.p332p7.glt) C7019kk.m27452k4((Object) c7394ca.m29542x1(), com.aspose.slides.internal.p332p7.glt.class)).m32641jd();
            iBehaviorArr[0] = sequence.m2530k4().m6566jd().createMotionEffect();
        } else if ("set".equals(c7394ca.m29539k4())) {
            no7VarArr[0] = ((com.aspose.slides.internal.p332p7.oeg) C7019kk.m27452k4((Object) c7394ca.m29542x1(), com.aspose.slides.internal.p332p7.oeg.class)).m38216x1();
            iBehaviorArr[0] = sequence.m2530k4().m6566jd().createSetEffect();
        } else if ("animEffect".equals(c7394ca.m29539k4())) {
            no7VarArr[0] = ((com.aspose.slides.internal.p332p7.i4y) C7019kk.m27452k4((Object) c7394ca.m29542x1(), com.aspose.slides.internal.p332p7.i4y.class)).m33856to();
            iBehaviorArr[0] = sequence.m2530k4().m6566jd().createFilterEffect();
        } else if ("anim".equals(c7394ca.m29539k4())) {
            no7VarArr[0] = ((com.aspose.slides.internal.p332p7.it6) C7019kk.m27452k4((Object) c7394ca.m29542x1(), com.aspose.slides.internal.p332p7.it6.class)).m34447m9();
            iBehaviorArr[0] = sequence.m2530k4().m6566jd().createPropertyEffect();
        } else if ("animClr".equals(c7394ca.m29539k4())) {
            no7VarArr[0] = ((com.aspose.slides.internal.p332p7.nbb) C7019kk.m27452k4((Object) c7394ca.m29542x1(), com.aspose.slides.internal.p332p7.nbb.class)).m37354h4();
            iBehaviorArr[0] = sequence.m2530k4().m6566jd().createColorEffect();
        } else if ("animScale".equals(c7394ca.m29539k4())) {
            no7VarArr[0] = ((com.aspose.slides.internal.p332p7.s0t) C7019kk.m27452k4((Object) c7394ca.m29542x1(), com.aspose.slides.internal.p332p7.s0t.class)).m40701du();
            iBehaviorArr[0] = sequence.m2530k4().m6566jd().createScaleEffect();
        } else if ("animRot".equals(c7394ca.m29539k4())) {
            no7VarArr[0] = ((com.aspose.slides.internal.p332p7.u4g) C7019kk.m27452k4((Object) c7394ca.m29542x1(), com.aspose.slides.internal.p332p7.u4g.class)).m42101to();
            iBehaviorArr[0] = sequence.m2530k4().m6566jd().createRotationEffect();
        } else if ("cmd".equals(c7394ca.m29539k4())) {
            no7VarArr[0] = ((com.aspose.slides.internal.p332p7.zv9) C7019kk.m27452k4((Object) c7394ca.m29542x1(), com.aspose.slides.internal.p332p7.zv9.class)).m45969kk();
            iBehaviorArr[0] = sequence.m2530k4().m6566jd().createCommandEffect();
        } else {
            iBehaviorArr[0] = null;
            no7VarArr[0] = null;
        }
        return iBehaviorArr[0] != null;
    }
}

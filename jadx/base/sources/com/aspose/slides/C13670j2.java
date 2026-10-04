package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.internal.p332p7.C7390c9;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.InterfaceC14073kp;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.j2 */
/* JADX INFO: loaded from: classes3.dex */
class C13670j2 {

    /* JADX INFO: renamed from: k4 */
    private static final List<String> f45407k4;

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f45408x1;

    static {
        List<String> list = new List<>();
        f45407k4 = list;
        list.addItem("par");
        list.addItem("seq");
        list.addItem("excl");
        list.addItem("audio");
        list.addItem("video");
        f45408x1 = new C7017h4("bldP", "bldDgm", "bldOleChart", "bldGraphic");
    }

    /* JADX INFO: renamed from: k4 */
    public static float m63183k4(String str) {
        if (str == null) {
            return Float.NaN;
        }
        if ("indefinite".equals(str)) {
            return Float.POSITIVE_INFINITY;
        }
        return C13850af.m65122ks(str) / 1000.0f;
    }

    /* JADX INFO: renamed from: x1 */
    public static int m63204x1(IAutoShape iAutoShape, long j) {
        IGenericEnumerator<IParagraph> it = iAutoShape.getTextFrame().getParagraphs().iterator();
        int length = 0;
        int i = 0;
        while (it.hasNext()) {
            try {
                IParagraph next = it.next();
                length++;
                if (!C14113y2.m67411k4(next.getText())) {
                    length += next.getText().length();
                }
                if (i == (4294967295L & j)) {
                    return length;
                }
                i++;
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (!C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            return -1;
        }
        it.dispose();
        return -1;
    }

    /* JADX INFO: renamed from: k4 */
    public static int m63184k4(IAutoShape iAutoShape, long j) {
        IGenericEnumerator<IParagraph> it = iAutoShape.getTextFrame().getParagraphs().iterator();
        int i = 0;
        int length = 0;
        while (it.hasNext()) {
            try {
                IParagraph next = it.next();
                if (i == (4294967295L & j)) {
                    return length;
                }
                if (!C14113y2.m67411k4(next.getText())) {
                    length += next.getText().length();
                }
                length++;
                i++;
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (!C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            return -1;
        }
        it.dispose();
        return -1;
    }

    /* JADX INFO: renamed from: x1 */
    public static long m63205x1(IShape iShape) {
        return ((Shape) iShape).mo272to().m69039ix();
    }

    /* JADX INFO: renamed from: k4 */
    public static long m63185k4(Slide slide) {
        com.aspose.slides.internal.p332p7.ehe eheVarM5301k4 = slide.m2708ne().m5301k4();
        long j = 0;
        if (eheVarM5301k4 == null || eheVarM5301k4.m31097kk() == null || eheVarM5301k4.m31097kk().m40177k4() == null) {
            return 0L;
        }
        List.Enumerator<C7394ca> it = eheVarM5301k4.m31097kk().m40177k4().iterator();
        while (it.hasNext()) {
            try {
                long[] jArr = {j};
                m63199k4(it.next(), jArr);
                j = jArr[0];
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return j;
    }

    /* JADX INFO: renamed from: x1 */
    public static com.aspose.slides.internal.p332p7.no7 m63206x1(C7394ca c7394ca) {
        AbstractC7361bz abstractC7361bzM29542x1 = c7394ca.m29542x1();
        if (C7019kk.m27469x1(abstractC7361bzM29542x1, com.aspose.slides.internal.p332p7.nbb.class)) {
            return ((com.aspose.slides.internal.p332p7.nbb) abstractC7361bzM29542x1).m37354h4();
        }
        if (C7019kk.m27469x1(abstractC7361bzM29542x1, com.aspose.slides.internal.p332p7.zv9.class)) {
            return ((com.aspose.slides.internal.p332p7.zv9) abstractC7361bzM29542x1).m45969kk();
        }
        if (C7019kk.m27469x1(abstractC7361bzM29542x1, com.aspose.slides.internal.p332p7.i4y.class)) {
            return ((com.aspose.slides.internal.p332p7.i4y) abstractC7361bzM29542x1).m33856to();
        }
        if (C7019kk.m27469x1(abstractC7361bzM29542x1, com.aspose.slides.internal.p332p7.glt.class)) {
            return ((com.aspose.slides.internal.p332p7.glt) abstractC7361bzM29542x1).m32641jd();
        }
        if (C7019kk.m27469x1(abstractC7361bzM29542x1, com.aspose.slides.internal.p332p7.it6.class)) {
            return ((com.aspose.slides.internal.p332p7.it6) abstractC7361bzM29542x1).m34447m9();
        }
        if (C7019kk.m27469x1(abstractC7361bzM29542x1, com.aspose.slides.internal.p332p7.u4g.class)) {
            return ((com.aspose.slides.internal.p332p7.u4g) abstractC7361bzM29542x1).m42101to();
        }
        if (C7019kk.m27469x1(abstractC7361bzM29542x1, com.aspose.slides.internal.p332p7.s0t.class)) {
            return ((com.aspose.slides.internal.p332p7.s0t) abstractC7361bzM29542x1).m40701du();
        }
        if (C7019kk.m27469x1(abstractC7361bzM29542x1, com.aspose.slides.internal.p332p7.oeg.class)) {
            return ((com.aspose.slides.internal.p332p7.oeg) abstractC7361bzM29542x1).m38216x1();
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public static com.aspose.slides.internal.p332p7.lmh m63186k4(C7394ca c7394ca) {
        if (!m63207x1(c7394ca.m29539k4())) {
            return null;
        }
        if ("par".equals(c7394ca.m29539k4())) {
            return ((com.aspose.slides.internal.p332p7.rx0) C7019kk.m27452k4((Object) c7394ca.m29542x1(), com.aspose.slides.internal.p332p7.rx0.class)).m40596k4();
        }
        if ("seq".equals(c7394ca.m29539k4())) {
            return ((com.aspose.slides.internal.p332p7.rvh) C7019kk.m27452k4((Object) c7394ca.m29542x1(), com.aspose.slides.internal.p332p7.rvh.class)).m40577h4();
        }
        if ("excl".equals(c7394ca.m29539k4())) {
            return ((com.aspose.slides.internal.p332p7.qca) C7019kk.m27452k4((Object) c7394ca.m29542x1(), com.aspose.slides.internal.p332p7.qca.class)).m39453k4();
        }
        if ("audio".equals(c7394ca.m29539k4())) {
            return ((com.aspose.slides.internal.p332p7.c6b) C7019kk.m27452k4((Object) c7394ca.m29542x1(), com.aspose.slides.internal.p332p7.c6b.class)).m29443x1().m42700du();
        }
        if ("video".equals(c7394ca.m29539k4())) {
            return ((com.aspose.slides.internal.p332p7.hgn) C7019kk.m27452k4((Object) c7394ca.m29542x1(), com.aspose.slides.internal.p332p7.hgn.class)).m33336x1().m42700du();
        }
        throw new InvalidOperationException("CommonTimeNodeParent inconsistency");
    }

    /* JADX INFO: renamed from: x1 */
    public static boolean m63207x1(String str) {
        return f45407k4.containsItem(str);
    }

    /* JADX INFO: renamed from: k4 */
    public static String m63187k4(float f) {
        return C14064he.m66703du(f) ? "indefinite" : C13850af.m65104k4(C7019kk.m27438h4(Double.valueOf(C14116yg.m67497to(f * 1000.0f)), 14));
    }

    /* JADX INFO: renamed from: k4 */
    public static String m63188k4(IShape iShape) {
        return C13850af.m65147x1(((Shape) iShape).mo272to().m69039ix());
    }

    /* JADX INFO: renamed from: k4 */
    private static void m63189k4(byte b, IAnimationTimeLine iAnimationTimeLine, C7394ca c7394ca, yqd yqdVar) {
        if (b == 3) {
            x9t.m73254k4((Sequence) iAnimationTimeLine.getMainSequence(), (com.aspose.slides.internal.p332p7.rvh) C7019kk.m27452k4((Object) c7394ca.m29542x1(), com.aspose.slides.internal.p332p7.rvh.class), yqdVar);
            return;
        }
        if (b != 4) {
            throw new ArgumentOutOfRangeException("nodeType", C14042ak.m66410k4(C7390c9.class, b), "Not a general sequence");
        }
        Sequence sequence = (Sequence) iAnimationTimeLine.getInteractiveSequences().add(null);
        com.aspose.slides.internal.p332p7.rvh rvhVar = (com.aspose.slides.internal.p332p7.rvh) C7019kk.m27452k4((Object) c7394ca.m29542x1(), com.aspose.slides.internal.p332p7.rvh.class);
        if (rvhVar != null) {
            if (rvhVar.m40577h4().m36320v4() != null) {
                x9t.m73256k4(sequence, rvhVar.m40577h4().m36320v4().m31106x1(), yqdVar);
            }
            x9t.m73254k4(sequence, rvhVar, yqdVar);
            return;
        }
        com.aspose.slides.internal.p332p7.rx0 rx0Var = (com.aspose.slides.internal.p332p7.rx0) C7019kk.m27452k4((Object) c7394ca.m29542x1(), com.aspose.slides.internal.p332p7.rx0.class);
        if (rx0Var != null) {
            if (sequence.m2530k4().m6567k4() == 4 && rx0Var.m40596k4().m36320v4() != null) {
                x9t.m73256k4(sequence, rx0Var.m40596k4().m36320v4().m31106x1(), yqdVar);
            }
            x9t.m73252k4(sequence, rx0Var.m40596k4().m36322wy(), yqdVar);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m63190k4(IGenericEnumerable<C7394ca> iGenericEnumerable, IAnimationTimeLine iAnimationTimeLine, yqd yqdVar) {
        IGenericEnumerator<C7394ca> it = iGenericEnumerable.iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                com.aspose.slides.internal.p332p7.lmh lmhVarM63186k4 = m63186k4(next);
                if (lmhVarM63186k4 != null) {
                    byte bM36317um = lmhVarM63186k4.m36317um();
                    if (m63201k4(bM36317um)) {
                        m63189k4(bM36317um, iAnimationTimeLine, next, yqdVar);
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
    private static void m63191k4(Effect effect, com.aspose.slides.internal.p332p7.rqz rqzVar) {
        com.aspose.slides.internal.p332p7.sdd sddVar;
        if (rqzVar == null) {
            return;
        }
        List.Enumerator<C7394ca> it = rqzVar.m40177k4().iterator();
        while (it.hasNext()) {
            try {
                com.aspose.slides.internal.p332p7.no7 no7VarM63206x1 = m63206x1(it.next());
                if (no7VarM63206x1 != null && !effect.m1375kk().m7577kk() && (sddVar = (com.aspose.slides.internal.p332p7.sdd) C7019kk.m27452k4((Object) no7VarM63206x1.m37771m9().m44924k4().m29542x1(), com.aspose.slides.internal.p332p7.sdd.class)) != null && sddVar.m40966x1() == null) {
                    if (effect.m1372k4() != null && effect.m1377x1() != null) {
                        com.aspose.slides.internal.p332p7.a9h a9hVar = (com.aspose.slides.internal.p332p7.a9h) ((com.aspose.slides.internal.p332p7.nhj) sddVar.m40963k4("txEl").m29542x1()).m37518k4("pRg").m29542x1();
                        a9hVar.m28056k4(((long) effect.m1372k4().m2167m9()) & 4294967295L);
                        a9hVar.m28058x1(((long) effect.m1377x1().m2167m9()) & 4294967295L);
                    } else if (effect.m1375kk().m7551c5() != null) {
                        com.aspose.slides.internal.p332p7.a9h a9hVar2 = (com.aspose.slides.internal.p332p7.a9h) ((com.aspose.slides.internal.p332p7.nhj) sddVar.m40963k4("txEl").m29542x1()).m37518k4("charRg").m29542x1();
                        a9hVar2.m28056k4(effect.m1375kk().m7551c5().m28055k4());
                        a9hVar2.m28058x1(effect.m1375kk().m7551c5().m28057x1());
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
    }

    /* JADX INFO: renamed from: k4 */
    private static void m63192k4(IAnimationTimeLine iAnimationTimeLine, List<ISequence> list) {
        List.Enumerator<ISequence> it = list.iterator();
        while (it.hasNext()) {
            try {
                Sequence sequence = (Sequence) it.next();
                List.Enumerator<IEffect> it2 = sequence.m2530k4().m6576to().iterator();
                while (it2.hasNext()) {
                    try {
                        Effect effect = (Effect) it2.next();
                        if (effect.m1375kk().m7564k4() < 0) {
                            TextAnimation textAnimation = new TextAnimation();
                            textAnimation.f3508kk = true;
                            textAnimation.m2888k4(sequence);
                            textAnimation.m2890x1().m73332k4().addItem(effect);
                            if (effect.m1375kk().m7577kk()) {
                                textAnimation.m2890x1().m73334k4(effect);
                            }
                            textAnimation.m2890x1().m73335k4(effect.m1375kk().m7584to());
                            textAnimation.m2889kk();
                            ((AnimationTimeLine) iAnimationTimeLine).f200kk.m2892k4(textAnimation);
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
    private static void m63193k4(IAnimationTimeLine iAnimationTimeLine, List<ISequence> list, IGenericEnumerable<C7394ca> iGenericEnumerable, yqd yqdVar) {
        List<C7394ca> listM6562ck;
        int i;
        IGenericEnumerator<C7394ca> it = iGenericEnumerable.iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                int iM27428k4 = f45408x1.m27428k4(next.m29539k4());
                if (iM27428k4 == 0) {
                    com.aspose.slides.internal.p332p7.c9d c9dVar = (com.aspose.slides.internal.p332p7.c9d) next.m29542x1();
                    String strM29492k4 = c9dVar.m29492k4();
                    Sequence sequence = null;
                    IShape iShape = yqdVar.m74068k4().containsKey(strM29492k4) ? (IShape) yqdVar.m74068k4().get_Item(strM29492k4) : null;
                    long jM29501x1 = c9dVar.m29501x1();
                    List.Enumerator<ISequence> it2 = list.iterator();
                    while (it2.hasNext()) {
                        try {
                            Sequence sequence2 = (Sequence) it2.next();
                            if (sequence2.getEffectsByShape(iShape).length > 0) {
                                sequence = sequence2;
                            }
                        } finally {
                            if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                                it2.dispose();
                            }
                        }
                    }
                    if (sequence == null) {
                        String strM67402k4 = C14113y2.m67402k4("No effects found for animation, id: {0}, groupId: {1}", strM29492k4, Long.valueOf(jM29501x1));
                        if (yqdVar.m74071x1() != null) {
                            yqdVar.m74071x1().m6785k4(strM67402k4, 99);
                        } else if (yqdVar.m74070kk() != null) {
                            yqdVar.m74070kk().m3185k4(strM67402k4, 99);
                        }
                    }
                    TextAnimation textAnimation = new TextAnimation();
                    textAnimation.m2888k4(sequence);
                    if (textAnimation.m2886k4() != null) {
                        IEffect[] effectsByShape = textAnimation.m2886k4().getEffectsByShape(iShape);
                        Effect effect = (Effect) effectsByShape[0];
                        if (c9dVar.m29491h4()) {
                            textAnimation.m2890x1().m73334k4(effect);
                        }
                        i = 0;
                        for (IEffect iEffect : effectsByShape) {
                            Effect effect2 = (Effect) iEffect;
                            if (effect2.m1375kk().m7564k4() == (jM29501x1 & 4294967295L)) {
                                textAnimation.m2890x1().m73332k4().addItem(effect2);
                                if (effect2.m1375kk().m7551c5() != null) {
                                    i++;
                                }
                            }
                        }
                        textAnimation.m2890x1().m73335k4(effect.m1375kk().m7584to());
                        if (textAnimation.m2890x1().m73332k4().size() == 0) {
                        }
                    } else {
                        textAnimation.m2890x1().m73335k4(iShape);
                        i = 0;
                    }
                    String strM29488c5 = c9dVar.m29488c5();
                    if (strM29488c5 == null) {
                        strM29488c5 = "indefinite";
                    }
                    textAnimation.m2890x1().m73333k4("indefinite".equals(strM29488c5) ? Integer.MIN_VALUE : C13850af.m65151yj(strM29488c5));
                    textAnimation.m2890x1().m73336k4(c9dVar.m29490dy());
                    int iM29500to = c9dVar.m29500to();
                    if (iM29500to == 1) {
                        textAnimation.f3507k4 = 1;
                    } else if (iM29500to == 2) {
                        int iM29489du = (int) c9dVar.m29489du();
                        if (iM29489du == 1) {
                            textAnimation.f3507k4 = 2;
                        } else if (iM29489du == 2) {
                            textAnimation.f3507k4 = 3;
                        } else if (iM29489du == 3) {
                            textAnimation.f3507k4 = 4;
                        } else if (iM29489du == 4) {
                            textAnimation.f3507k4 = 5;
                        } else if (iM29489du == 5) {
                            textAnimation.f3507k4 = 6;
                        }
                    } else if (iM29500to == 3 || iM29500to == 4) {
                        textAnimation.f3507k4 = 0;
                    }
                    ((AnimationTimeLine) iAnimationTimeLine).f200kk.m2892k4(textAnimation);
                    if (i <= 0 || textAnimation.m2890x1().m73332k4().size() != i) {
                        textAnimation.m2889kk();
                    } else {
                        textAnimation.m2887k4(textAnimation.f3507k4);
                    }
                } else if (iM27428k4 == 1) {
                    if (yqdVar.m74068k4().containsKey(((com.aspose.slides.internal.p332p7.lkb) next.m29542x1()).m36213k4())) {
                        listM6562ck = ((Sequence) iAnimationTimeLine.getMainSequence()).m2530k4().m6562ck();
                        listM6562ck.addItem(next);
                    }
                } else if (iM27428k4 != 2) {
                    if (iM27428k4 != 3) {
                        throw new Exception();
                    }
                    if (yqdVar.m74068k4().containsKey(((com.aspose.slides.internal.p332p7.kbh) next.m29542x1()).m35266k4())) {
                        listM6562ck = ((Sequence) iAnimationTimeLine.getMainSequence()).m2530k4().m6562ck();
                        listM6562ck.addItem(next);
                    }
                } else if (yqdVar.m74068k4().containsKey(((com.aspose.slides.internal.p332p7.ljk) next.m29542x1()).m36184k4())) {
                    listM6562ck = ((Sequence) iAnimationTimeLine.getMainSequence()).m2530k4().m6562ck();
                    listM6562ck.addItem(next);
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
    private static void m63194k4(IAnimationTimeLine iAnimationTimeLine, List<ISequence> list, com.aspose.slides.internal.p332p7.ehe eheVar, yqd yqdVar) {
        try {
            m63192k4(iAnimationTimeLine, list);
            if (eheVar.m31098to() != null) {
                m63193k4(iAnimationTimeLine, list, eheVar.m31098to().m41741k4(), yqdVar);
            }
        } catch (RuntimeException e) {
            throw new PptxException("reading animation group failed.", e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x019d A[Catch: all -> 0x01a1, TryCatch #1 {all -> 0x01a1, blocks: (B:46:0x0122, B:48:0x0128, B:51:0x013e, B:75:0x0197, B:77:0x019d, B:82:0x01a7, B:85:0x01b1, B:87:0x01b7, B:89:0x01cf, B:90:0x01de, B:92:0x01fb, B:93:0x0204, B:95:0x0209, B:99:0x021d, B:103:0x023f, B:104:0x0251, B:114:0x0278, B:118:0x0288, B:106:0x0256, B:108:0x025d, B:109:0x0263, B:110:0x0269, B:111:0x026f, B:102:0x022f, B:94:0x0207, B:119:0x0292, B:120:0x0299, B:121:0x029a, B:123:0x02a0, B:124:0x02a3, B:53:0x014c, B:55:0x0152, B:60:0x0169, B:62:0x016f, B:64:0x0175, B:66:0x017f), top: B:176:0x0122, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01a7 A[Catch: all -> 0x01a1, TryCatch #1 {all -> 0x01a1, blocks: (B:46:0x0122, B:48:0x0128, B:51:0x013e, B:75:0x0197, B:77:0x019d, B:82:0x01a7, B:85:0x01b1, B:87:0x01b7, B:89:0x01cf, B:90:0x01de, B:92:0x01fb, B:93:0x0204, B:95:0x0209, B:99:0x021d, B:103:0x023f, B:104:0x0251, B:114:0x0278, B:118:0x0288, B:106:0x0256, B:108:0x025d, B:109:0x0263, B:110:0x0269, B:111:0x026f, B:102:0x022f, B:94:0x0207, B:119:0x0292, B:120:0x0299, B:121:0x029a, B:123:0x02a0, B:124:0x02a3, B:53:0x014c, B:55:0x0152, B:60:0x0169, B:62:0x016f, B:64:0x0175, B:66:0x017f), top: B:176:0x0122, inners: #4 }] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m63195k4(IAnimationTimeLine iAnimationTimeLine, IShapeCollection iShapeCollection, com.aspose.slides.internal.p332p7.ehe eheVar, gi8 gi8Var) {
        int i;
        List.Enumerator<IEffect> it;
        com.aspose.slides.internal.p332p7.rqz rqzVar;
        int i2;
        if (eheVar == null) {
            throw new InvalidOperationException();
        }
        if (iAnimationTimeLine.getInteractiveSequences().getCount() == 0 && iAnimationTimeLine.getMainSequence().getCount() == 0) {
            IPresentation presentation = ((AnimationTimeLine) iAnimationTimeLine).m249k4().getPresentation();
            if (presentation.getAudios().size() == 0 && presentation.getVideos().size() == 0) {
                return;
            }
        }
        com.aspose.slides.internal.p332p7.rx0 rx0Var = (com.aspose.slides.internal.p332p7.rx0) eheVar.m31093k4().m40178k4("par").m29542x1();
        rx0Var.m40596k4().m36309m9((byte) 8);
        rx0Var.m40596k4().m36296k4(1);
        int i3 = -1;
        rx0Var.m40596k4().m36302kk((byte) -1);
        rx0Var.m40596k4().m36299k4(m63187k4(Float.POSITIVE_INFINITY));
        rx0Var.m40596k4().m36324x1((byte) 2);
        com.aspose.slides.internal.p332p7.rqz rqzVarM36283du = rx0Var.m40596k4().m36283du();
        int i4 = 0;
        if (iAnimationTimeLine.getMainSequence().getCount() > 0) {
            int[] iArr = {1};
            x9t.m73249k4((Sequence) iAnimationTimeLine.getMainSequence(), iShapeCollection, iArr, rqzVarM36283du, gi8Var);
            i = iArr[0];
        } else {
            i = 1;
        }
        IGenericEnumerator<ITextAnimation> it2 = iAnimationTimeLine.getInteractiveSequences().iterator();
        while (it2.hasNext()) {
            try {
                int[] iArr2 = {i};
                x9t.m73249k4((Sequence) it2.next(), iShapeCollection, iArr2, rqzVarM36283du, gi8Var);
                i = iArr2[0];
            } finally {
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
            it2.dispose();
        }
        com.aspose.slides.internal.p332p7.tif tifVarM31098to = eheVar.m31098to();
        eheVar.m31096k4((com.aspose.slides.internal.p332p7.tif) null);
        eheVar.m31099x1();
        if (tifVarM31098to != null) {
            List.Enumerator<C7394ca> it3 = tifVarM31098to.m41741k4().iterator();
            while (it3.hasNext()) {
                try {
                    C7394ca next = it3.next();
                    if (!"bldP".equals(next.m29539k4())) {
                        eheVar.m31098to().m41743k4(next);
                    }
                } finally {
                    if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                        it3.dispose();
                    }
                }
            }
            if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                it3.dispose();
            }
        }
        it2 = iAnimationTimeLine.getTextAnimationCollection().iterator();
        int i5 = 0;
        while (it2.hasNext()) {
            try {
                TextAnimation textAnimation = (TextAnimation) it2.next();
                if (textAnimation.m2890x1().m73332k4().size() != 0) {
                    it = textAnimation.m2890x1().m73332k4().iterator();
                    int i6 = i4;
                    while (it.hasNext()) {
                        try {
                            Effect effect = (Effect) it.next();
                            int i7 = effect.m1375kk().m7579m9() == null ? 1 : i4;
                            i6 = (i7 != 0 || effect.m1372k4() == null || effect.m1377x1() == null) ? i7 : (effect.m1372k4().m2154ck() == null || effect.m1377x1().m2154ck() == null) ? 1 : i4;
                            if (i6 != 0) {
                                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                                    it.dispose();
                                }
                                if (i6 != 0) {
                                    m63198k4(textAnimation, i5);
                                    if (textAnimation.f3508kk) {
                                        continue;
                                    } else {
                                        if (eheVar.m31098to() == null) {
                                            throw new PptxException("Internal error: animation build list is not initialized");
                                        }
                                        com.aspose.slides.internal.p332p7.c9d c9dVar = (com.aspose.slides.internal.p332p7.c9d) eheVar.m31098to().m41742k4("bldP").m29542x1();
                                        if (textAnimation.m2890x1().m73331du() != null) {
                                            c9dVar.m29495k4(m63188k4(textAnimation.m2890x1().m73331du()));
                                        }
                                        c9dVar.m29494k4((((Effect) textAnimation.m2890x1().m73332k4().get_Item(i4)).m1375kk().m7564k4() > i3 ? r15.m1375kk().m7564k4() : i5) & 4294967295L);
                                        c9dVar.m29496k4(textAnimation.m2890x1().m73332k4().size() > 1);
                                        c9dVar.m29503x1(textAnimation.m2890x1().m73337kk() == Integer.MIN_VALUE ? "indefinite" : C14057f9.m66586k4(textAnimation.m2890x1().m73337kk(), (InterfaceC14073kp) C11697x1.m55250kk()));
                                        c9dVar.m29497kk(textAnimation.m2890x1().m73338to());
                                        switch (textAnimation.getBuildType()) {
                                            case 0:
                                                i2 = 4;
                                                break;
                                            case 1:
                                                i2 = 1;
                                                break;
                                            case 2:
                                                c9dVar.m29502x1(1L);
                                                i2 = 2;
                                                break;
                                            case 3:
                                                c9dVar.m29502x1(2L);
                                                i2 = 2;
                                                break;
                                            case 4:
                                                c9dVar.m29502x1(3L);
                                                i2 = 2;
                                                break;
                                            case 5:
                                                c9dVar.m29502x1(4L);
                                                i2 = 2;
                                                break;
                                            case 6:
                                                c9dVar.m29502x1(5L);
                                                i2 = 2;
                                                break;
                                            default:
                                                i2 = 3;
                                                break;
                                        }
                                        c9dVar.m29493k4(i2);
                                        c9dVar.m29504x1(textAnimation.m2890x1().m73339x1() != null);
                                        i5++;
                                        i3 = -1;
                                        i4 = 0;
                                    }
                                }
                            }
                        } finally {
                            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                                it.dispose();
                            }
                        }
                    }
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    }
                    if (i6 != 0) {
                    }
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
                throw th;
            }
        }
        it = ((Sequence) iAnimationTimeLine.getMainSequence()).m2530k4().m6562ck().iterator();
        while (it.hasNext()) {
            try {
                C7394ca next2 = it.next();
                int iM27428k4 = f45408x1.m27428k4(next2.m29539k4());
                String strM35266k4 = iM27428k4 != 1 ? iM27428k4 != 2 ? iM27428k4 != 3 ? null : ((com.aspose.slides.internal.p332p7.kbh) C7019kk.m27452k4((Object) next2.m29542x1(), com.aspose.slides.internal.p332p7.kbh.class)).m35266k4() : ((com.aspose.slides.internal.p332p7.ljk) C7019kk.m27452k4((Object) next2.m29542x1(), com.aspose.slides.internal.p332p7.ljk.class)).m36184k4() : ((com.aspose.slides.internal.p332p7.lkb) C7019kk.m27452k4((Object) next2.m29542x1(), com.aspose.slides.internal.p332p7.lkb.class)).m36213k4();
                if (!C14113y2.m67411k4(strM35266k4) && gi8Var.m6693k4(C13850af.m65124ne(strM35266k4))) {
                    eheVar.m31098to().m41743k4(next2);
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (eheVar.m31098to().m41741k4().size() == 0) {
            rqzVar = null;
            eheVar.m31096k4((com.aspose.slides.internal.p332p7.tif) null);
        } else {
            rqzVar = null;
        }
        m63197k4(iShapeCollection, new int[]{i}, rqzVarM36283du, gi8Var);
        if (rqzVarM36283du.m40177k4().size() == 0) {
            eheVar.m31095k4(rqzVar);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m63196k4(IAnimationTimeLine iAnimationTimeLine, com.aspose.slides.internal.p332p7.ehe eheVar, yqd yqdVar) {
        if (eheVar == null || eheVar.m31097kk() == null || eheVar.m31097kk().m40177k4().size() == 0) {
            return;
        }
        com.aspose.slides.internal.p332p7.lmh lmhVarM63186k4 = m63186k4(eheVar.m31097kk().m40177k4().get_Item(0));
        if (lmhVarM63186k4 == null) {
            throw new PptxReadException("TimeLine.Load, error reading slide.");
        }
        if (lmhVarM63186k4.m36322wy() == null || lmhVarM63186k4.m36322wy().m40177k4().size() == 0) {
            return;
        }
        if (lmhVarM63186k4.m36317um() == -1) {
            lmhVarM63186k4.m36309m9((byte) 8);
        }
        m63190k4(lmhVarM63186k4.m36322wy().m40177k4(), iAnimationTimeLine, yqdVar);
        List list = new List();
        list.addItem(iAnimationTimeLine.getMainSequence());
        list.addRange(iAnimationTimeLine.getInteractiveSequences());
        m63194k4(iAnimationTimeLine, (List<ISequence>) list, eheVar, yqdVar);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m63197k4(IShapeCollection iShapeCollection, int[] iArr, com.aspose.slides.internal.p332p7.rqz rqzVar, gi8 gi8Var) {
        if (iShapeCollection == null) {
            return;
        }
        IGenericEnumerator<IShape> it = iShapeCollection.iterator();
        while (it.hasNext()) {
            try {
                IShape next = it.next();
                IGroupShape iGroupShape = (IGroupShape) C7019kk.m27452k4((Object) next, IGroupShape.class);
                if (iGroupShape != null) {
                    m63197k4(iGroupShape.getShapes(), iArr, rqzVar, gi8Var);
                } else {
                    IAudioFrame iAudioFrame = (IAudioFrame) C7019kk.m27452k4((Object) next, IAudioFrame.class);
                    if (iAudioFrame != null) {
                        if (!m63202k4(next, rqzVar, gi8Var)) {
                            com.aspose.slides.internal.p332p7.c6b c6bVar = (com.aspose.slides.internal.p332p7.c6b) rqzVar.m40178k4("audio").m29542x1();
                            int i = iArr[0] + 1;
                            iArr[0] = i;
                            q5v.m69416k4(c6bVar, iAudioFrame, i, ((AudioFrame) iAudioFrame).m2584wp());
                        }
                        gi8Var.m6692k4(true);
                    } else {
                        VideoFrame videoFrame = (VideoFrame) C7019kk.m27452k4((Object) next, VideoFrame.class);
                        if (videoFrame != null && !m63202k4(next, rqzVar, gi8Var)) {
                            com.aspose.slides.internal.p332p7.hgn hgnVar = (com.aspose.slides.internal.p332p7.hgn) rqzVar.m40178k4("video").m29542x1();
                            int i2 = iArr[0] + 1;
                            iArr[0] = i2;
                            q5v.m69418k4(hgnVar, videoFrame, i2, videoFrame.m2584wp());
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
    }

    /* JADX INFO: renamed from: k4 */
    private static void m63198k4(TextAnimation textAnimation, int i) {
        List.Enumerator<IEffect> it = textAnimation.m2890x1().m73332k4().iterator();
        while (it.hasNext()) {
            try {
                Effect effect = (Effect) it.next();
                if (!textAnimation.f3508kk) {
                    if (effect.m1375kk().m7564k4() == -1) {
                        effect.m1375kk().m7579m9().m40596k4().m36304kk(((long) i) & 4294967295L);
                    }
                    if (textAnimation.f3507k4 == 0) {
                    }
                }
                m63191k4(effect, effect.m1375kk().m7579m9().m40596k4().m36322wy());
                m63191k4(effect, effect.m1375kk().m7579m9().m40596k4().m36277ak());
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
    public static void m63199k4(C7394ca c7394ca, long[] jArr) {
        if (m63207x1(c7394ca.m29539k4())) {
            com.aspose.slides.internal.p332p7.lmh lmhVarM63186k4 = m63186k4(c7394ca);
            if (lmhVarM63186k4 == null) {
                throw new PptxReadException("TimeLine.TNid, error reading slide.");
            }
            jArr[0] = ((long) lmhVarM63186k4.m36289h4()) & 4294967295L;
            if (lmhVarM63186k4.m36322wy() == null || lmhVarM63186k4.m36322wy().m40177k4() == null) {
                return;
            }
            List.Enumerator<C7394ca> it = lmhVarM63186k4.m36322wy().m40177k4().iterator();
            while (it.hasNext()) {
                try {
                    m63199k4(it.next(), jArr);
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m63200k4(com.aspose.slides.internal.p332p7.uc0 uc0Var, C12025x6 c12025x6) {
        uc0Var.m42313k4(c12025x6.m56897x1());
        uc0Var.m42315x1(c12025x6.m56895kk());
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m63201k4(byte b) {
        return b == 3 || b == 4;
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m63202k4(IShape iShape, com.aspose.slides.internal.p332p7.rqz rqzVar, gi8 gi8Var) {
        Long[] lArr = {0L};
        boolean zTryGetValue = gi8Var.m6687k4().tryGetValue(iShape, lArr);
        long jLongValue = lArr[0].longValue();
        if (zTryGetValue) {
            List.Enumerator<C7394ca> it = rqzVar.m40177k4().iterator();
            while (it.hasNext()) {
                try {
                    C7394ca next = it.next();
                    com.aspose.slides.internal.p332p7.c6b c6bVar = (com.aspose.slides.internal.p332p7.c6b) C7019kk.m27452k4((Object) next.m29542x1(), com.aspose.slides.internal.p332p7.c6b.class);
                    if (c6bVar == null) {
                        com.aspose.slides.internal.p332p7.hgn hgnVar = (com.aspose.slides.internal.p332p7.hgn) C7019kk.m27452k4((Object) next.m29542x1(), com.aspose.slides.internal.p332p7.hgn.class);
                        if (hgnVar != null && m63203k4(hgnVar.m33336x1(), C13850af.m65147x1(jLongValue))) {
                            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                                it.dispose();
                            }
                            return true;
                        }
                    } else if (m63203k4(c6bVar.m29443x1(), C13850af.m65147x1(jLongValue))) {
                        return true;
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
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m63203k4(com.aspose.slides.internal.p332p7.v2z v2zVar, String str) {
        com.aspose.slides.internal.p332p7.ycb ycbVarM42701h4;
        com.aspose.slides.internal.p332p7.sdd sddVar;
        if (v2zVar == null || (ycbVarM42701h4 = v2zVar.m42701h4()) == null || ycbVarM42701h4.m44924k4() == null || (sddVar = (com.aspose.slides.internal.p332p7.sdd) C7019kk.m27452k4((Object) ycbVarM42701h4.m44924k4().m29542x1(), com.aspose.slides.internal.p332p7.sdd.class)) == null) {
            return false;
        }
        return C14113y2.m67363du(sddVar.m40964k4(), str);
    }
}

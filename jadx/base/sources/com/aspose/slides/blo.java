package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.internal.p407st.AbstractC10402dj;
import com.aspose.slides.internal.p407st.AbstractC10571o4;
import com.aspose.slides.internal.p407st.C10358am;
import com.aspose.slides.internal.p407st.C10391cu;
import com.aspose.slides.internal.p407st.C10409du;
import com.aspose.slides.internal.p407st.C10419ee;
import com.aspose.slides.internal.p407st.C10427ep;
import com.aspose.slides.internal.p407st.C10486iy;
import com.aspose.slides.internal.p407st.C10503k4;
import com.aspose.slides.internal.p407st.C10514kq;
import com.aspose.slides.internal.p407st.C10562nk;
import com.aspose.slides.internal.p407st.C10574od;
import com.aspose.slides.internal.p407st.C10659tx;
import com.aspose.slides.internal.p407st.C10661u4;
import com.aspose.slides.internal.p407st.C10664ug;
import com.aspose.slides.internal.p407st.C10671ur;
import com.aspose.slides.internal.p407st.C10703x1;
import com.aspose.slides.internal.p407st.C10742z2;
import com.aspose.slides.internal.p407st.C10743z5;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.InterfaceC14073kp;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class blo {

    /* JADX INFO: renamed from: k4 */
    private static final C7017h4 f4216k4 = new C7017h4("boolVal", "intVal", "fltVal", "strVal", "clrVal");

    /* JADX INFO: renamed from: k4 */
    private static byte m4244k4(int i) {
        if (i == 0) {
            return (byte) 0;
        }
        byte b = 1;
        if (i != 1) {
            b = 2;
            if (i != 2) {
                return (byte) -1;
            }
        }
        return b;
    }

    /* JADX INFO: renamed from: x1 */
    private static int m4258x1(byte b) {
        if (b == 0) {
            return 0;
        }
        if (b == 1) {
            return 1;
        }
        if (b == 2) {
            return 2;
        }
        throw new NotImplementedException();
    }

    /* JADX INFO: renamed from: k4 */
    private static byte m4245k4(long j) {
        int i = (int) j;
        if (i == 0) {
            return (byte) 0;
        }
        byte b = 1;
        if (i != 1) {
            b = 2;
            if (i != 2) {
                return (byte) -1;
            }
        }
        return b;
    }

    /* JADX INFO: renamed from: k4 */
    private static long m4246k4(byte b) {
        if (b == 0) {
            return 0L;
        }
        if (b == 1) {
            return 1L;
        }
        if (b == 2) {
            return 2L;
        }
        throw new NotImplementedException();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x0139, code lost:
    
        if (r0 != 3) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00d2, code lost:
    
        if (r0 != 3) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0111, code lost:
    
        if (r0 != 3) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01fd A[Catch: all -> 0x0227, TryCatch #0 {all -> 0x0227, blocks: (B:131:0x01f7, B:133:0x01fd, B:135:0x020b, B:137:0x0223, B:141:0x022c, B:143:0x023a), top: B:189:0x01f7 }] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0254 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:195:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m4247k4(IShape iShape, IAnimationTimeLine iAnimationTimeLine, C10503k4 c10503k4, int i, a3u a3uVar) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        Effect effectM2529k4;
        IGenericEnumerator<IBehavior> it;
        float duration;
        ISetEffect iSetEffect;
        byte bM51070fa;
        ISetEffect iSetEffect2;
        C10659tx c10659txM51042k4;
        int i7 = 43;
        int i8 = 47;
        int i9 = 21;
        switch (c10503k4.m51073jd()) {
            case 0:
                if ((c10503k4.m51065ck() & 255) != 0) {
                    return;
                }
                i8 = 0;
                i9 = 0;
                Sequence sequence = (Sequence) iAnimationTimeLine.getMainSequence();
                effectM2529k4 = sequence.m2529k4(iShape, i8, i9, C1243i8.m7545k4(i8, i9), 1);
                effectM2529k4.m1375kk().m7566k4(i);
                effectM2529k4.m1375kk().m7591x1(sequence.m2531x1().m249k4().m386fa());
                if ((c10503k4.m51071h4() & 4294967295L) > 0 && (c10659txM51042k4 = a3uVar.m71951m9().m51705jd().m51042k4((int) c10503k4.m51071h4())) != null && c10659txM51042k4.m51783du() != null && c10659txM51042k4.m51784h4() != null) {
                    effectM2529k4.m1375kk().m7567k4(a3uVar.m3179k4(c10659txM51042k4));
                }
                if (c10503k4.m51083m9() >= 0 && c10503k4.m51083m9() < Integer.MAX_VALUE) {
                    effectM2529k4.getTiming().setTriggerDelayTime(c10503k4.m51083m9() / 1000.0f);
                }
                it = effectM2529k4.getBehaviors().iterator();
                duration = 0.0f;
                iSetEffect = null;
                while (it.hasNext()) {
                    try {
                        IBehavior next = it.next();
                        if (C7019kk.m27469x1(next, ISetEffect.class) && "visible".equals(C7019kk.m27452k4(((ISetEffect) next).getTo(), String.class))) {
                            iSetEffect = (ISetEffect) next;
                        } else if (!C14064he.m66715kk(next.getTiming().getDuration())) {
                            duration += next.getTiming().getDuration();
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
                if (duration == 0.0f && iSetEffect != null) {
                    iSetEffect.getTiming().setTriggerDelayTime(0.5f);
                }
                effectM2529k4.m1375kk().m7579m9();
                bM51070fa = c10503k4.m51070fa();
                if (bM51070fa == 1) {
                    IColorEffect iColorEffectCreateColorEffect = sequence.m2530k4().m6566jd().createColorEffect();
                    C14294pm.m69145k4(iColorEffectCreateColorEffect.getTo(), c10503k4.m51088x1());
                    iSetEffect2 = iColorEffectCreateColorEffect;
                } else if (bM51070fa != 2) {
                    iSetEffect2 = null;
                } else {
                    ISetEffect iSetEffectCreateSetEffect = sequence.m2530k4().m6566jd().createSetEffect();
                    iSetEffectCreateSetEffect.setTo("hidden");
                    iSetEffect2 = iSetEffectCreateSetEffect;
                }
                if (iSetEffect2 != null) {
                    ((Behavior) iSetEffect2).mo424k4().m72016k4(effectM2529k4);
                    effectM2529k4.getBehaviors().add(iSetEffect2);
                }
                if (!C7019kk.m27469x1(iShape, IAutoShape.class) || ((IAutoShape) iShape).getTextFrame() == null) {
                    return;
                }
                byte bM51064c5 = c10503k4.m51064c5();
                int i10 = bM51064c5 != 2 ? bM51064c5 != 3 ? bM51064c5 != 4 ? bM51064c5 != 5 ? bM51064c5 != 6 ? 0 : 6 : 5 : 4 : 3 : 2;
                TextAnimation textAnimationAdd = ((TextAnimationCollection) iAnimationTimeLine.getTextAnimationCollection()).add();
                textAnimationAdd.m2888k4(sequence);
                if (c10503k4.m51068du()) {
                    textAnimationAdd.m2890x1().m73334k4(effectM2529k4);
                }
                textAnimationAdd.m2890x1().m73335k4(iShape);
                textAnimationAdd.m2890x1().m73332k4().addItem(effectM2529k4);
                effectM2529k4.m1375kk().m7569k4(textAnimationAdd);
                textAnimationAdd.f3507k4 = i10;
                if (i10 > 1) {
                    textAnimationAdd.m2887k4(1);
                    return;
                }
                return;
            case 1:
                i7 = 127;
                i8 = i7;
                i9 = 0;
                Sequence sequence2 = (Sequence) iAnimationTimeLine.getMainSequence();
                effectM2529k4 = sequence2.m2529k4(iShape, i8, i9, C1243i8.m7545k4(i8, i9), 1);
                effectM2529k4.m1375kk().m7566k4(i);
                effectM2529k4.m1375kk().m7591x1(sequence2.m2531x1().m249k4().m386fa());
                if ((c10503k4.m51071h4() & 4294967295L) > 0) {
                    effectM2529k4.m1375kk().m7567k4(a3uVar.m3179k4(c10659txM51042k4));
                }
                if (c10503k4.m51083m9() >= 0) {
                    effectM2529k4.getTiming().setTriggerDelayTime(c10503k4.m51083m9() / 1000.0f);
                }
                it = effectM2529k4.getBehaviors().iterator();
                duration = 0.0f;
                iSetEffect = null;
                while (it.hasNext()) {
                    break;
                }
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                }
                if (duration == 0.0f) {
                    iSetEffect.getTiming().setTriggerDelayTime(0.5f);
                }
                effectM2529k4.m1375kk().m7579m9();
                bM51070fa = c10503k4.m51070fa();
                if (bM51070fa == 1) {
                }
                if (iSetEffect2 != null) {
                }
                if (C7019kk.m27469x1(iShape, IAutoShape.class)) {
                    return;
                } else {
                    return;
                }
            case 2:
                i9 = (c10503k4.m51065ck() & 255) == 0 ? 42 : 20;
                i8 = 4;
                Sequence sequence22 = (Sequence) iAnimationTimeLine.getMainSequence();
                effectM2529k4 = sequence22.m2529k4(iShape, i8, i9, C1243i8.m7545k4(i8, i9), 1);
                effectM2529k4.m1375kk().m7566k4(i);
                effectM2529k4.m1375kk().m7591x1(sequence22.m2531x1().m249k4().m386fa());
                if ((c10503k4.m51071h4() & 4294967295L) > 0) {
                }
                if (c10503k4.m51083m9() >= 0) {
                }
                it = effectM2529k4.getBehaviors().iterator();
                duration = 0.0f;
                iSetEffect = null;
                while (it.hasNext()) {
                    break;
                }
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                }
                if (duration == 0.0f) {
                }
                effectM2529k4.m1375kk().m7579m9();
                bM51070fa = c10503k4.m51070fa();
                if (bM51070fa == 1) {
                }
                if (iSetEffect2 != null) {
                }
                if (C7019kk.m27469x1(iShape, IAutoShape.class)) {
                }
                break;
            case 3:
                i9 = (c10503k4.m51065ck() & 255) == 1 ? 42 : 1;
                i8 = 20;
                Sequence sequence222 = (Sequence) iAnimationTimeLine.getMainSequence();
                effectM2529k4 = sequence222.m2529k4(iShape, i8, i9, C1243i8.m7545k4(i8, i9), 1);
                effectM2529k4.m1375kk().m7566k4(i);
                effectM2529k4.m1375kk().m7591x1(sequence222.m2531x1().m249k4().m386fa());
                if ((c10503k4.m51071h4() & 4294967295L) > 0) {
                }
                if (c10503k4.m51083m9() >= 0) {
                }
                it = effectM2529k4.getBehaviors().iterator();
                duration = 0.0f;
                iSetEffect = null;
                while (it.hasNext()) {
                    break;
                }
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                }
                if (duration == 0.0f) {
                }
                effectM2529k4.m1375kk().m7579m9();
                bM51070fa = c10503k4.m51070fa();
                if (bM51070fa == 1) {
                }
                if (iSetEffect2 != null) {
                }
                if (C7019kk.m27469x1(iShape, IAutoShape.class)) {
                }
                break;
            case 4:
                byte bM51065ck = c10503k4.m51065ck();
                i2 = 123;
                if (bM51065ck != 1) {
                    if (bM51065ck != 2) {
                    }
                    i8 = i2;
                    i9 = 34;
                    Sequence sequence2222 = (Sequence) iAnimationTimeLine.getMainSequence();
                    effectM2529k4 = sequence2222.m2529k4(iShape, i8, i9, C1243i8.m7545k4(i8, i9), 1);
                    effectM2529k4.m1375kk().m7566k4(i);
                    effectM2529k4.m1375kk().m7591x1(sequence2222.m2531x1().m249k4().m386fa());
                    if ((c10503k4.m51071h4() & 4294967295L) > 0) {
                    }
                    if (c10503k4.m51083m9() >= 0) {
                    }
                    it = effectM2529k4.getBehaviors().iterator();
                    duration = 0.0f;
                    iSetEffect = null;
                    while (it.hasNext()) {
                        break;
                    }
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    }
                    if (duration == 0.0f) {
                    }
                    effectM2529k4.m1375kk().m7579m9();
                    bM51070fa = c10503k4.m51070fa();
                    if (bM51070fa == 1) {
                    }
                    if (iSetEffect2 != null) {
                    }
                    if (C7019kk.m27469x1(iShape, IAutoShape.class)) {
                    }
                }
                i8 = i2;
                i9 = 36;
                Sequence sequence22222 = (Sequence) iAnimationTimeLine.getMainSequence();
                effectM2529k4 = sequence22222.m2529k4(iShape, i8, i9, C1243i8.m7545k4(i8, i9), 1);
                effectM2529k4.m1375kk().m7566k4(i);
                effectM2529k4.m1375kk().m7591x1(sequence22222.m2531x1().m249k4().m386fa());
                if ((c10503k4.m51071h4() & 4294967295L) > 0) {
                }
                if (c10503k4.m51083m9() >= 0) {
                }
                it = effectM2529k4.getBehaviors().iterator();
                duration = 0.0f;
                iSetEffect = null;
                while (it.hasNext()) {
                    break;
                }
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                }
                if (duration == 0.0f) {
                }
                effectM2529k4.m1375kk().m7579m9();
                bM51070fa = c10503k4.m51070fa();
                if (bM51070fa == 1) {
                }
                if (iSetEffect2 != null) {
                }
                if (C7019kk.m27469x1(iShape, IAutoShape.class)) {
                }
                break;
            case 5:
                if ((c10503k4.m51065ck() & 255) != 0) {
                    return;
                }
                i8 = 36;
                i9 = 0;
                Sequence sequence222222 = (Sequence) iAnimationTimeLine.getMainSequence();
                effectM2529k4 = sequence222222.m2529k4(iShape, i8, i9, C1243i8.m7545k4(i8, i9), 1);
                effectM2529k4.m1375kk().m7566k4(i);
                effectM2529k4.m1375kk().m7591x1(sequence222222.m2531x1().m249k4().m386fa());
                if ((c10503k4.m51071h4() & 4294967295L) > 0) {
                }
                if (c10503k4.m51083m9() >= 0) {
                }
                it = effectM2529k4.getBehaviors().iterator();
                duration = 0.0f;
                iSetEffect = null;
                while (it.hasNext()) {
                    break;
                }
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                }
                if (duration == 0.0f) {
                }
                effectM2529k4.m1375kk().m7579m9();
                bM51070fa = c10503k4.m51070fa();
                if (bM51070fa == 1) {
                }
                if (iSetEffect2 != null) {
                }
                if (C7019kk.m27469x1(iShape, IAutoShape.class)) {
                }
                break;
            case 6:
                if ((c10503k4.m51065ck() & 255) != 0) {
                    return;
                }
                i7 = 39;
                i8 = i7;
                i9 = 0;
                Sequence sequence2222222 = (Sequence) iAnimationTimeLine.getMainSequence();
                effectM2529k4 = sequence2222222.m2529k4(iShape, i8, i9, C1243i8.m7545k4(i8, i9), 1);
                effectM2529k4.m1375kk().m7566k4(i);
                effectM2529k4.m1375kk().m7591x1(sequence2222222.m2531x1().m249k4().m386fa());
                if ((c10503k4.m51071h4() & 4294967295L) > 0) {
                }
                if (c10503k4.m51083m9() >= 0) {
                }
                it = effectM2529k4.getBehaviors().iterator();
                duration = 0.0f;
                iSetEffect = null;
                while (it.hasNext()) {
                    break;
                }
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                }
                if (duration == 0.0f) {
                }
                effectM2529k4.m1375kk().m7579m9();
                bM51070fa = c10503k4.m51070fa();
                if (bM51070fa == 1) {
                }
                if (iSetEffect2 != null) {
                }
                if (C7019kk.m27469x1(iShape, IAutoShape.class)) {
                }
                break;
            case 7:
                byte bM51065ck2 = c10503k4.m51065ck();
                i2 = 29;
                if (bM51065ck2 != 1) {
                    if (bM51065ck2 != 2) {
                    }
                    i8 = i2;
                    i9 = 34;
                    Sequence sequence22222222 = (Sequence) iAnimationTimeLine.getMainSequence();
                    effectM2529k4 = sequence22222222.m2529k4(iShape, i8, i9, C1243i8.m7545k4(i8, i9), 1);
                    effectM2529k4.m1375kk().m7566k4(i);
                    effectM2529k4.m1375kk().m7591x1(sequence22222222.m2531x1().m249k4().m386fa());
                    if ((c10503k4.m51071h4() & 4294967295L) > 0) {
                    }
                    if (c10503k4.m51083m9() >= 0) {
                    }
                    it = effectM2529k4.getBehaviors().iterator();
                    duration = 0.0f;
                    iSetEffect = null;
                    while (it.hasNext()) {
                        break;
                    }
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    }
                    if (duration == 0.0f) {
                    }
                    effectM2529k4.m1375kk().m7579m9();
                    bM51070fa = c10503k4.m51070fa();
                    if (bM51070fa == 1) {
                    }
                    if (iSetEffect2 != null) {
                    }
                    if (C7019kk.m27469x1(iShape, IAutoShape.class)) {
                    }
                }
                i8 = i2;
                i9 = 36;
                Sequence sequence222222222 = (Sequence) iAnimationTimeLine.getMainSequence();
                effectM2529k4 = sequence222222222.m2529k4(iShape, i8, i9, C1243i8.m7545k4(i8, i9), 1);
                effectM2529k4.m1375kk().m7566k4(i);
                effectM2529k4.m1375kk().m7591x1(sequence222222222.m2531x1().m249k4().m386fa());
                if ((c10503k4.m51071h4() & 4294967295L) > 0) {
                }
                if (c10503k4.m51083m9() >= 0) {
                }
                it = effectM2529k4.getBehaviors().iterator();
                duration = 0.0f;
                iSetEffect = null;
                while (it.hasNext()) {
                    break;
                }
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                }
                if (duration == 0.0f) {
                }
                effectM2529k4.m1375kk().m7579m9();
                bM51070fa = c10503k4.m51070fa();
                if (bM51070fa == 1) {
                }
                if (iSetEffect2 != null) {
                }
                if (C7019kk.m27469x1(iShape, IAutoShape.class)) {
                }
                break;
            case 8:
                i7 = (c10503k4.m51065ck() & 255) == 0 ? 20 : 42;
                i3 = 126;
                i8 = i3;
                i9 = i7;
                Sequence sequence2222222222 = (Sequence) iAnimationTimeLine.getMainSequence();
                effectM2529k4 = sequence2222222222.m2529k4(iShape, i8, i9, C1243i8.m7545k4(i8, i9), 1);
                effectM2529k4.m1375kk().m7566k4(i);
                effectM2529k4.m1375kk().m7591x1(sequence2222222222.m2531x1().m249k4().m386fa());
                if ((c10503k4.m51071h4() & 4294967295L) > 0) {
                }
                if (c10503k4.m51083m9() >= 0) {
                }
                it = effectM2529k4.getBehaviors().iterator();
                duration = 0.0f;
                iSetEffect = null;
                while (it.hasNext()) {
                    break;
                }
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                }
                if (duration == 0.0f) {
                }
                effectM2529k4.m1375kk().m7579m9();
                bM51070fa = c10503k4.m51070fa();
                if (bM51070fa == 1) {
                }
                if (iSetEffect2 != null) {
                }
                if (C7019kk.m27469x1(iShape, IAutoShape.class)) {
                }
                break;
            case 9:
                byte bM51065ck3 = c10503k4.m51065ck();
                i4 = 136;
                i5 = bM51065ck3 != 5 ? bM51065ck3 != 6 ? bM51065ck3 != 7 ? 40 : 12 : 11 : 41;
                i9 = i5;
                i8 = i4;
                Sequence sequence22222222222 = (Sequence) iAnimationTimeLine.getMainSequence();
                effectM2529k4 = sequence22222222222.m2529k4(iShape, i8, i9, C1243i8.m7545k4(i8, i9), 1);
                effectM2529k4.m1375kk().m7566k4(i);
                effectM2529k4.m1375kk().m7591x1(sequence22222222222.m2531x1().m249k4().m386fa());
                if ((c10503k4.m51071h4() & 4294967295L) > 0) {
                }
                if (c10503k4.m51083m9() >= 0) {
                }
                it = effectM2529k4.getBehaviors().iterator();
                duration = 0.0f;
                iSetEffect = null;
                while (it.hasNext()) {
                    break;
                }
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                }
                if (duration == 0.0f) {
                }
                effectM2529k4.m1375kk().m7579m9();
                bM51070fa = c10503k4.m51070fa();
                if (bM51070fa == 1) {
                }
                if (iSetEffect2 != null) {
                }
                if (C7019kk.m27469x1(iShape, IAutoShape.class)) {
                }
                break;
            case 10:
                byte bM51065ck4 = c10503k4.m51065ck();
                i2 = 149;
                if (bM51065ck4 != 1) {
                    if (bM51065ck4 != 2) {
                    }
                    i8 = i2;
                    i9 = 28;
                    Sequence sequence222222222222 = (Sequence) iAnimationTimeLine.getMainSequence();
                    effectM2529k4 = sequence222222222222.m2529k4(iShape, i8, i9, C1243i8.m7545k4(i8, i9), 1);
                    effectM2529k4.m1375kk().m7566k4(i);
                    effectM2529k4.m1375kk().m7591x1(sequence222222222222.m2531x1().m249k4().m386fa());
                    if ((c10503k4.m51071h4() & 4294967295L) > 0) {
                    }
                    if (c10503k4.m51083m9() >= 0) {
                    }
                    it = effectM2529k4.getBehaviors().iterator();
                    duration = 0.0f;
                    iSetEffect = null;
                    while (it.hasNext()) {
                        break;
                    }
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    }
                    if (duration == 0.0f) {
                    }
                    effectM2529k4.m1375kk().m7579m9();
                    bM51070fa = c10503k4.m51070fa();
                    if (bM51070fa == 1) {
                    }
                    if (iSetEffect2 != null) {
                    }
                    if (C7019kk.m27469x1(iShape, IAutoShape.class)) {
                    }
                }
                i8 = i2;
                i9 = 2;
                Sequence sequence2222222222222 = (Sequence) iAnimationTimeLine.getMainSequence();
                effectM2529k4 = sequence2222222222222.m2529k4(iShape, i8, i9, C1243i8.m7545k4(i8, i9), 1);
                effectM2529k4.m1375kk().m7566k4(i);
                effectM2529k4.m1375kk().m7591x1(sequence2222222222222.m2531x1().m249k4().m386fa());
                if ((c10503k4.m51071h4() & 4294967295L) > 0) {
                }
                if (c10503k4.m51083m9() >= 0) {
                }
                it = effectM2529k4.getBehaviors().iterator();
                duration = 0.0f;
                iSetEffect = null;
                while (it.hasNext()) {
                    break;
                }
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                }
                if (duration == 0.0f) {
                }
                effectM2529k4.m1375kk().m7579m9();
                bM51070fa = c10503k4.m51070fa();
                if (bM51070fa == 1) {
                }
                if (iSetEffect2 != null) {
                }
                if (C7019kk.m27469x1(iShape, IAutoShape.class)) {
                }
                break;
            case 11:
                i7 = (c10503k4.m51065ck() & 255) == 0 ? 31 : 25;
                i3 = 151;
                i8 = i3;
                i9 = i7;
                Sequence sequence22222222222222 = (Sequence) iAnimationTimeLine.getMainSequence();
                effectM2529k4 = sequence22222222222222.m2529k4(iShape, i8, i9, C1243i8.m7545k4(i8, i9), 1);
                effectM2529k4.m1375kk().m7566k4(i);
                effectM2529k4.m1375kk().m7591x1(sequence22222222222222.m2531x1().m249k4().m386fa());
                if ((c10503k4.m51071h4() & 4294967295L) > 0) {
                }
                if (c10503k4.m51083m9() >= 0) {
                }
                it = effectM2529k4.getBehaviors().iterator();
                duration = 0.0f;
                iSetEffect = null;
                while (it.hasNext()) {
                    break;
                }
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                }
                if (duration == 0.0f) {
                }
                effectM2529k4.m1375kk().m7579m9();
                bM51070fa = c10503k4.m51070fa();
                if (bM51070fa == 1) {
                }
                if (iSetEffect2 != null) {
                }
                if (C7019kk.m27469x1(iShape, IAutoShape.class)) {
                }
                break;
            case 12:
                switch (c10503k4.m51065ck()) {
                    case 1:
                        i9 = 36;
                        break;
                    case 2:
                        i9 = 34;
                        break;
                    case 3:
                        i9 = 2;
                        break;
                    case 4:
                        i7 = 37;
                        i9 = i7;
                        break;
                    case 5:
                        i7 = 38;
                        i9 = i7;
                        break;
                    case 6:
                        i9 = 3;
                        break;
                    case 7:
                        i9 = 4;
                        break;
                    default:
                        i9 = 28;
                        break;
                }
                Sequence sequence222222222222222 = (Sequence) iAnimationTimeLine.getMainSequence();
                effectM2529k4 = sequence222222222222222.m2529k4(iShape, i8, i9, C1243i8.m7545k4(i8, i9), 1);
                effectM2529k4.m1375kk().m7566k4(i);
                effectM2529k4.m1375kk().m7591x1(sequence222222222222222.m2531x1().m249k4().m386fa());
                if ((c10503k4.m51071h4() & 4294967295L) > 0) {
                }
                if (c10503k4.m51083m9() >= 0) {
                }
                it = effectM2529k4.getBehaviors().iterator();
                duration = 0.0f;
                iSetEffect = null;
                while (it.hasNext()) {
                    break;
                }
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                }
                if (duration == 0.0f) {
                }
                effectM2529k4.m1375kk().m7579m9();
                bM51070fa = c10503k4.m51070fa();
                if (bM51070fa == 1) {
                }
                if (iSetEffect2 != null) {
                }
                if (C7019kk.m27469x1(iShape, IAutoShape.class)) {
                }
                break;
            case 13:
                byte bM51065ck5 = c10503k4.m51065ck();
                i8 = 134;
                if (bM51065ck5 != 1) {
                    if (bM51065ck5 == 2) {
                        i7 = 44;
                    } else if (bM51065ck5 != 3) {
                        i7 = 22;
                    }
                    i9 = i7;
                }
                Sequence sequence2222222222222222 = (Sequence) iAnimationTimeLine.getMainSequence();
                effectM2529k4 = sequence2222222222222222.m2529k4(iShape, i8, i9, C1243i8.m7545k4(i8, i9), 1);
                effectM2529k4.m1375kk().m7566k4(i);
                effectM2529k4.m1375kk().m7591x1(sequence2222222222222222.m2531x1().m249k4().m386fa());
                if ((c10503k4.m51071h4() & 4294967295L) > 0) {
                }
                if (c10503k4.m51083m9() >= 0) {
                }
                it = effectM2529k4.getBehaviors().iterator();
                duration = 0.0f;
                iSetEffect = null;
                while (it.hasNext()) {
                    break;
                }
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                }
                if (duration == 0.0f) {
                }
                effectM2529k4.m1375kk().m7579m9();
                bM51070fa = c10503k4.m51070fa();
                if (bM51070fa == 1) {
                }
                if (iSetEffect2 != null) {
                }
                if (C7019kk.m27469x1(iShape, IAutoShape.class)) {
                }
                break;
            case 14:
                i8 = i7;
                i9 = 0;
                Sequence sequence22222222222222222 = (Sequence) iAnimationTimeLine.getMainSequence();
                effectM2529k4 = sequence22222222222222222.m2529k4(iShape, i8, i9, C1243i8.m7545k4(i8, i9), 1);
                effectM2529k4.m1375kk().m7566k4(i);
                effectM2529k4.m1375kk().m7591x1(sequence22222222222222222.m2531x1().m249k4().m386fa());
                if ((c10503k4.m51071h4() & 4294967295L) > 0) {
                }
                if (c10503k4.m51083m9() >= 0) {
                }
                it = effectM2529k4.getBehaviors().iterator();
                duration = 0.0f;
                iSetEffect = null;
                while (it.hasNext()) {
                    break;
                }
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                }
                if (duration == 0.0f) {
                }
                effectM2529k4.m1375kk().m7579m9();
                bM51070fa = c10503k4.m51070fa();
                if (bM51070fa == 1) {
                }
                if (iSetEffect2 != null) {
                }
                if (C7019kk.m27469x1(iShape, IAutoShape.class)) {
                }
                break;
            case 15:
                if ((c10503k4.m51065ck() & 255) != 0) {
                    return;
                }
                i6 = 35;
                i8 = i6;
                i9 = 30;
                Sequence sequence222222222222222222 = (Sequence) iAnimationTimeLine.getMainSequence();
                effectM2529k4 = sequence222222222222222222.m2529k4(iShape, i8, i9, C1243i8.m7545k4(i8, i9), 1);
                effectM2529k4.m1375kk().m7566k4(i);
                effectM2529k4.m1375kk().m7591x1(sequence222222222222222222.m2531x1().m249k4().m386fa());
                if ((c10503k4.m51071h4() & 4294967295L) > 0) {
                }
                if (c10503k4.m51083m9() >= 0) {
                }
                it = effectM2529k4.getBehaviors().iterator();
                duration = 0.0f;
                iSetEffect = null;
                while (it.hasNext()) {
                    break;
                }
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                }
                if (duration == 0.0f) {
                }
                effectM2529k4.m1375kk().m7579m9();
                bM51070fa = c10503k4.m51070fa();
                if (bM51070fa == 1) {
                }
                if (iSetEffect2 != null) {
                }
                if (C7019kk.m27469x1(iShape, IAutoShape.class)) {
                }
                break;
            case 16:
                if ((c10503k4.m51065ck() & 255) != 0) {
                    return;
                }
                i6 = 125;
                i8 = i6;
                i9 = 30;
                Sequence sequence2222222222222222222 = (Sequence) iAnimationTimeLine.getMainSequence();
                effectM2529k4 = sequence2222222222222222222.m2529k4(iShape, i8, i9, C1243i8.m7545k4(i8, i9), 1);
                effectM2529k4.m1375kk().m7566k4(i);
                effectM2529k4.m1375kk().m7591x1(sequence2222222222222222222.m2531x1().m249k4().m386fa());
                if ((c10503k4.m51071h4() & 4294967295L) > 0) {
                }
                if (c10503k4.m51083m9() >= 0) {
                }
                it = effectM2529k4.getBehaviors().iterator();
                duration = 0.0f;
                iSetEffect = null;
                while (it.hasNext()) {
                    break;
                }
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                }
                if (duration == 0.0f) {
                }
                effectM2529k4.m1375kk().m7579m9();
                bM51070fa = c10503k4.m51070fa();
                if (bM51070fa == 1) {
                }
                if (iSetEffect2 != null) {
                }
                if (C7019kk.m27469x1(iShape, IAutoShape.class)) {
                }
                break;
            case 17:
                if ((c10503k4.m51065ck() & 255) != 0) {
                    return;
                }
                i7 = 146;
                i8 = i7;
                i9 = 0;
                Sequence sequence22222222222222222222 = (Sequence) iAnimationTimeLine.getMainSequence();
                effectM2529k4 = sequence22222222222222222222.m2529k4(iShape, i8, i9, C1243i8.m7545k4(i8, i9), 1);
                effectM2529k4.m1375kk().m7566k4(i);
                effectM2529k4.m1375kk().m7591x1(sequence22222222222222222222.m2531x1().m249k4().m386fa());
                if ((c10503k4.m51071h4() & 4294967295L) > 0) {
                }
                if (c10503k4.m51083m9() >= 0) {
                }
                it = effectM2529k4.getBehaviors().iterator();
                duration = 0.0f;
                iSetEffect = null;
                while (it.hasNext()) {
                    break;
                }
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                }
                if (duration == 0.0f) {
                }
                effectM2529k4.m1375kk().m7579m9();
                bM51070fa = c10503k4.m51070fa();
                if (bM51070fa == 1) {
                }
                if (iSetEffect2 != null) {
                }
                if (C7019kk.m27469x1(iShape, IAutoShape.class)) {
                }
                break;
            case 18:
                byte bM51065ck6 = c10503k4.m51065ck();
                i4 = 147;
                if (bM51065ck6 == 2) {
                    i5 = 46;
                } else if (bM51065ck6 != 3) {
                    i5 = bM51065ck6 != 4 ? bM51065ck6 != 8 ? 45 : 49 : 48;
                } else {
                    i9 = 47;
                    i8 = i4;
                    Sequence sequence222222222222222222222 = (Sequence) iAnimationTimeLine.getMainSequence();
                    effectM2529k4 = sequence222222222222222222222.m2529k4(iShape, i8, i9, C1243i8.m7545k4(i8, i9), 1);
                    effectM2529k4.m1375kk().m7566k4(i);
                    effectM2529k4.m1375kk().m7591x1(sequence222222222222222222222.m2531x1().m249k4().m386fa());
                    if ((c10503k4.m51071h4() & 4294967295L) > 0) {
                    }
                    if (c10503k4.m51083m9() >= 0) {
                    }
                    it = effectM2529k4.getBehaviors().iterator();
                    duration = 0.0f;
                    iSetEffect = null;
                    while (it.hasNext()) {
                        break;
                    }
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    }
                    if (duration == 0.0f) {
                    }
                    effectM2529k4.m1375kk().m7579m9();
                    bM51070fa = c10503k4.m51070fa();
                    if (bM51070fa == 1) {
                    }
                    if (iSetEffect2 != null) {
                    }
                    if (C7019kk.m27469x1(iShape, IAutoShape.class)) {
                    }
                }
                i9 = i5;
                i8 = i4;
                Sequence sequence2222222222222222222222 = (Sequence) iAnimationTimeLine.getMainSequence();
                effectM2529k4 = sequence2222222222222222222222.m2529k4(iShape, i8, i9, C1243i8.m7545k4(i8, i9), 1);
                effectM2529k4.m1375kk().m7566k4(i);
                effectM2529k4.m1375kk().m7591x1(sequence2222222222222222222222.m2531x1().m249k4().m386fa());
                if ((c10503k4.m51071h4() & 4294967295L) > 0) {
                }
                if (c10503k4.m51083m9() >= 0) {
                }
                it = effectM2529k4.getBehaviors().iterator();
                duration = 0.0f;
                iSetEffect = null;
                while (it.hasNext()) {
                    break;
                }
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                }
                if (duration == 0.0f) {
                }
                effectM2529k4.m1375kk().m7579m9();
                bM51070fa = c10503k4.m51070fa();
                if (bM51070fa == 1) {
                }
                if (iSetEffect2 != null) {
                }
                if (C7019kk.m27469x1(iShape, IAutoShape.class)) {
                }
                break;
            case 19:
                if ((c10503k4.m51065ck() & 255) != 0) {
                    return;
                }
                i8 = 21;
                i9 = 30;
                Sequence sequence22222222222222222222222 = (Sequence) iAnimationTimeLine.getMainSequence();
                effectM2529k4 = sequence22222222222222222222222.m2529k4(iShape, i8, i9, C1243i8.m7545k4(i8, i9), 1);
                effectM2529k4.m1375kk().m7566k4(i);
                effectM2529k4.m1375kk().m7591x1(sequence22222222222222222222222.m2531x1().m249k4().m386fa());
                if ((c10503k4.m51071h4() & 4294967295L) > 0) {
                }
                if (c10503k4.m51083m9() >= 0) {
                }
                it = effectM2529k4.getBehaviors().iterator();
                duration = 0.0f;
                iSetEffect = null;
                while (it.hasNext()) {
                    break;
                }
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                }
                if (duration == 0.0f) {
                }
                effectM2529k4.m1375kk().m7579m9();
                bM51070fa = c10503k4.m51070fa();
                if (bM51070fa == 1) {
                }
                if (iSetEffect2 != null) {
                }
                if (C7019kk.m27469x1(iShape, IAutoShape.class)) {
                }
                break;
            default:
                i8 = 0;
                i9 = 0;
                Sequence sequence222222222222222222222222 = (Sequence) iAnimationTimeLine.getMainSequence();
                effectM2529k4 = sequence222222222222222222222222.m2529k4(iShape, i8, i9, C1243i8.m7545k4(i8, i9), 1);
                effectM2529k4.m1375kk().m7566k4(i);
                effectM2529k4.m1375kk().m7591x1(sequence222222222222222222222222.m2531x1().m249k4().m386fa());
                if ((c10503k4.m51071h4() & 4294967295L) > 0) {
                }
                if (c10503k4.m51083m9() >= 0) {
                }
                it = effectM2529k4.getBehaviors().iterator();
                duration = 0.0f;
                iSetEffect = null;
                while (it.hasNext()) {
                    break;
                }
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                }
                if (duration == 0.0f) {
                }
                effectM2529k4.m1375kk().m7579m9();
                bM51070fa = c10503k4.m51070fa();
                if (bM51070fa == 1) {
                }
                if (iSetEffect2 != null) {
                }
                if (C7019kk.m27469x1(iShape, IAutoShape.class)) {
                }
                break;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m4248k4(AbstractC4685kk<com.aspose.slides.internal.p332p7.sx3> abstractC4685kk, C10664ug c10664ug) {
        if (c10664ug.m51801to() == null || c10664ug.m51801to().m50739to().size() == 0) {
            return;
        }
        com.aspose.slides.internal.p332p7.sx3 sx3VarInvoke = abstractC4685kk.invoke();
        Iterator<C10671ur> it = c10664ug.m51801to().m50739to().iterator();
        while (it.hasNext()) {
            try {
                C10671ur next = it.next();
                com.aspose.slides.internal.p332p7.uit uitVarM41426k4 = sx3VarInvoke.m41426k4();
                if (next.m51816k4().m52125x1() > -1) {
                    uitVarM41426k4.m42415k4(C14057f9.m66586k4(next.m51816k4().m52125x1() * 100, (InterfaceC14073kp) C11697x1.m55250kk()));
                }
                m4256k4(next, uitVarM41426k4, uitVarM41426k4.m42414k4());
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) it).dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            ((IDisposable) it).dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m4249k4(com.aspose.slides.internal.p332p7.it6 it6Var, C10409du c10409du, gi8 gi8Var) {
        if (it6Var == null) {
            return;
        }
        C10664ug c10664ug = new C10664ug();
        c10409du.m50513yj().addItem(c10664ug);
        m4251k4(it6Var, c10664ug);
        m4252k4(it6Var, c10664ug, gi8Var);
        if (!C14113y2.m67411k4(it6Var.m34449x1())) {
            C10742z2 c10742z2 = new C10742z2(it6Var.m34449x1());
            c10742z2.m51409um().m51920k4((short) 1);
            c10664ug.m50513yj().addItem(c10742z2);
        }
        if (!C14113y2.m67411k4(it6Var.m34445kk())) {
            C10742z2 c10742z22 = new C10742z2(it6Var.m34445kk());
            c10742z22.m51409um().m51920k4((short) 2);
            c10664ug.m50513yj().addItem(c10742z22);
        }
        if (!C14113y2.m67411k4(it6Var.m34448to())) {
            C10742z2 c10742z23 = new C10742z2(it6Var.m34448to());
            c10742z23.m51409um().m51920k4((short) 3);
            c10664ug.m50513yj().addItem(c10742z23);
        }
        m4253k4(it6Var.m34447m9(), c10664ug, gi8Var);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m4250k4(final com.aspose.slides.internal.p332p7.it6 it6Var, C10562nk c10562nk, m4c m4cVar) {
        if (c10562nk == null || c10562nk.m51373ks() == null) {
            throw new InvalidOperationException();
        }
        C10664ug c10664ugM51373ks = c10562nk.m51373ks();
        l1y.m64245k4(it6Var.m34447m9(), c10562nk, c10664ugM51373ks.m51798dy(), m4cVar);
        m4248k4(new AbstractC4685kk<com.aspose.slides.internal.p332p7.sx3>() { // from class: com.aspose.slides.blo.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(it6Var) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.p_CT_TLAnimateBehaviorElementData.AddTavLst()";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public com.aspose.slides.internal.p332p7.sx3 invoke() {
                return it6Var.m34442k4();
            }
        }, c10664ugM51373ks);
        it6Var.m34444k4(c10664ugM51373ks.m51797du() == null ? null : c10664ugM51373ks.m51797du().m52123du());
        it6Var.m34451x1(c10664ugM51373ks.m51799h4() == null ? null : c10664ugM51373ks.m51799h4().m52123du());
        it6Var.m34446kk(c10664ugM51373ks.m51800m9() != null ? c10664ugM51373ks.m51800m9().m52123du() : null);
        it6Var.m34443k4(m4245k4(c10664ugM51373ks.m51802x1().m51137x1()));
        it6Var.m34450x1(m4244k4(c10664ugM51373ks.m51802x1().m51134kk()));
    }

    /* JADX INFO: renamed from: k4 */
    private static void m4251k4(com.aspose.slides.internal.p332p7.it6 it6Var, C10664ug c10664ug) {
        long jM4246k4;
        if (it6Var == null) {
            throw new ArgumentNullException();
        }
        if (c10664ug == null) {
            throw new ArgumentNullException();
        }
        C10514kq c10514kq = new C10514kq();
        c10664ug.m50513yj().addItem(c10514kq);
        if (it6Var.m34439du() != -1) {
            c10514kq.m51136to(true);
            jM4246k4 = m4246k4(it6Var.m34439du());
        } else {
            c10514kq.m51136to(false);
            jM4246k4 = 0;
        }
        c10514kq.m51132k4(jM4246k4);
        if (C14113y2.m67411k4(it6Var.m34449x1())) {
            c10514kq.m51133k4(false);
        } else {
            c10514kq.m51133k4(true);
        }
        if (C14113y2.m67411k4(it6Var.m34445kk())) {
            c10514kq.m51138x1(false);
        } else {
            c10514kq.m51138x1(true);
        }
        if (C14113y2.m67411k4(it6Var.m34448to())) {
            c10514kq.m51135kk(false);
        } else {
            c10514kq.m51135kk(true);
        }
        if (it6Var.m34440dy() == null || it6Var.m34440dy().m41427x1().length <= 0) {
            c10514kq.m51129du(false);
        } else {
            c10514kq.m51129du(true);
        }
        if (it6Var.m34441h4() != -1) {
            c10514kq.m51130h4(true);
            c10514kq.m51131k4(m4258x1(it6Var.m34441h4()));
        } else {
            c10514kq.m51130h4(false);
            c10514kq.m51131k4(1);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m4252k4(com.aspose.slides.internal.p332p7.it6 it6Var, C10664ug c10664ug, gi8 gi8Var) {
        if (it6Var == null) {
            throw new ArgumentNullException();
        }
        if (c10664ug == null) {
            throw new ArgumentNullException();
        }
        if (it6Var.m34440dy() == null || it6Var.m34440dy().m41427x1().length == 0) {
            return;
        }
        C10419ee c10419ee = new C10419ee();
        c10664ug.m50513yj().addItem(c10419ee);
        for (com.aspose.slides.internal.p332p7.uit uitVar : it6Var.m34440dy().m41427x1()) {
            m4255k4(uitVar, c10419ee, gi8Var);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m4253k4(com.aspose.slides.internal.p332p7.no7 no7Var, C10664ug c10664ug, gi8 gi8Var) {
        if (no7Var == null) {
            throw new ArgumentNullException();
        }
        if (c10664ug == null) {
            throw new ArgumentNullException();
        }
        C10486iy c10486iy = new C10486iy();
        c10664ug.m50513yj().addItem(c10486iy);
        l1y.m64243k4(no7Var, c10486iy);
        l1y.m64246x1(no7Var, c10486iy);
        fut.m6321k4(no7Var.m37771m9(), c10486iy, gi8Var);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m4254k4(com.aspose.slides.internal.p332p7.rx0 rx0Var, C10503k4 c10503k4) {
        if (rx0Var.m40596k4().m36286dy() != 0) {
            throw new InvalidOperationException();
        }
        com.aspose.slides.internal.p332p7.lmh lmhVarM40596k4 = rx0Var.m40596k4();
        c10503k4.m51089x1((byte) 0);
        c10503k4.m51081kk((byte) 0);
        if (lmhVarM40596k4.m36308m9() == 1) {
            c10503k4.m51089x1((byte) 0);
            c10503k4.m51081kk((byte) 0);
            return;
        }
        if (lmhVarM40596k4.m36308m9() == 0) {
            c10503k4.m51089x1((byte) 6);
            c10503k4.m51081kk((byte) 0);
            return;
        }
        if (lmhVarM40596k4.m36308m9() == 3) {
            c10503k4.m51089x1((byte) 2);
            if (lmhVarM40596k4.m36281c5() == 5) {
                c10503k4.m51081kk((byte) 0);
                return;
            } else {
                if (lmhVarM40596k4.m36281c5() == 10) {
                    c10503k4.m51081kk((byte) 1);
                    return;
                }
                return;
            }
        }
        if (lmhVarM40596k4.m36308m9() == 5) {
            c10503k4.m51089x1((byte) 3);
            if (lmhVarM40596k4.m36281c5() == 5) {
                c10503k4.m51081kk((byte) 1);
                return;
            } else {
                if (lmhVarM40596k4.m36281c5() == 10) {
                    c10503k4.m51081kk((byte) 0);
                    return;
                }
                return;
            }
        }
        if (lmhVarM40596k4.m36308m9() == 12) {
            c10503k4.m51089x1((byte) 4);
            c10503k4.m51081kk((byte) 0);
            return;
        }
        if (lmhVarM40596k4.m36308m9() == 9) {
            c10503k4.m51089x1((byte) 5);
            c10503k4.m51081kk((byte) 0);
            return;
        }
        if (lmhVarM40596k4.m36308m9() == 10) {
            c10503k4.m51089x1((byte) 6);
            c10503k4.m51081kk((byte) 0);
            return;
        }
        if (lmhVarM40596k4.m36308m9() == 14) {
            c10503k4.m51089x1((byte) 8);
            if (lmhVarM40596k4.m36281c5() == 5) {
                c10503k4.m51081kk((byte) 1);
                return;
            } else {
                if (lmhVarM40596k4.m36281c5() == 10) {
                    c10503k4.m51081kk((byte) 0);
                    return;
                }
                return;
            }
        }
        if (lmhVarM40596k4.m36308m9() == 18) {
            c10503k4.m51089x1((byte) 9);
            if (lmhVarM40596k4.m36281c5() == 3) {
                c10503k4.m51081kk((byte) 5);
                return;
            }
            if (lmhVarM40596k4.m36281c5() == 6) {
                c10503k4.m51081kk((byte) 7);
                return;
            } else if (lmhVarM40596k4.m36281c5() == 9) {
                c10503k4.m51081kk((byte) 4);
                return;
            } else {
                if (lmhVarM40596k4.m36281c5() == 12) {
                    c10503k4.m51081kk((byte) 6);
                    return;
                }
                return;
            }
        }
        if (lmhVarM40596k4.m36308m9() == 22) {
            c10503k4.m51089x1((byte) 10);
            if (lmhVarM40596k4.m36281c5() == 8) {
                c10503k4.m51081kk((byte) 2);
                return;
            }
            if (lmhVarM40596k4.m36281c5() == 1) {
                c10503k4.m51081kk((byte) 3);
                return;
            } else if (lmhVarM40596k4.m36281c5() == 2) {
                c10503k4.m51081kk((byte) 0);
                return;
            } else {
                if (lmhVarM40596k4.m36281c5() == 4) {
                    c10503k4.m51081kk((byte) 1);
                    return;
                }
                return;
            }
        }
        if (lmhVarM40596k4.m36308m9() == 53) {
            c10503k4.m51089x1((byte) 11);
            c10503k4.m51081kk((byte) 0);
            return;
        }
        if (lmhVarM40596k4.m36308m9() == 2) {
            c10503k4.m51089x1((byte) 12);
            if (lmhVarM40596k4.m36281c5() == 8) {
                c10503k4.m51081kk((byte) 0);
                return;
            }
            if (lmhVarM40596k4.m36281c5() == 1) {
                c10503k4.m51081kk((byte) 1);
                return;
            }
            if (lmhVarM40596k4.m36281c5() == 2) {
                c10503k4.m51081kk((byte) 2);
                return;
            }
            if (lmhVarM40596k4.m36281c5() == 4) {
                c10503k4.m51081kk((byte) 3);
                return;
            }
            if (lmhVarM40596k4.m36281c5() == 9) {
                c10503k4.m51081kk((byte) 4);
                return;
            }
            if (lmhVarM40596k4.m36281c5() == 3) {
                c10503k4.m51081kk((byte) 5);
                return;
            } else if (lmhVarM40596k4.m36281c5() == 12) {
                c10503k4.m51081kk((byte) 6);
                return;
            } else {
                if (lmhVarM40596k4.m36281c5() == 6) {
                    c10503k4.m51081kk((byte) 7);
                    return;
                }
                return;
            }
        }
        if (lmhVarM40596k4.m36308m9() == 16) {
            c10503k4.m51089x1((byte) 13);
            if (lmhVarM40596k4.m36281c5() == 26) {
                c10503k4.m51081kk((byte) 0);
                return;
            }
            if (lmhVarM40596k4.m36281c5() == 42) {
                c10503k4.m51081kk((byte) 1);
                return;
            } else if (lmhVarM40596k4.m36281c5() == 21) {
                c10503k4.m51081kk((byte) 3);
                return;
            } else {
                if (lmhVarM40596k4.m36281c5() == 37) {
                    c10503k4.m51081kk((byte) 3);
                    return;
                }
                return;
            }
        }
        if (lmhVarM40596k4.m36308m9() == 8) {
            c10503k4.m51089x1((byte) 17);
            c10503k4.m51081kk((byte) 0);
            return;
        }
        if (lmhVarM40596k4.m36308m9() == 13) {
            c10503k4.m51089x1((byte) 18);
            c10503k4.m51081kk((byte) 0);
        } else if (lmhVarM40596k4.m36308m9() == 20) {
            c10503k4.m51089x1((byte) 19);
            c10503k4.m51081kk((byte) 0);
        } else if (lmhVarM40596k4.m36308m9() == 21) {
            c10503k4.m51089x1((byte) 26);
            c10503k4.m51081kk((byte) 1);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m4255k4(com.aspose.slides.internal.p332p7.uit uitVar, C10419ee c10419ee, gi8 gi8Var) {
        C10743z5 c10743z5;
        if (uitVar == null) {
            throw new ArgumentNullException();
        }
        if (c10419ee == null) {
            throw new ArgumentNullException();
        }
        if (uitVar.m42417to() == null) {
            return;
        }
        if (uitVar.m42417to().m34176k4() == null) {
            throw new InvalidOperationException();
        }
        AbstractC10571o4 c10574od = null;
        if (C14113y2.m67411k4(uitVar.m42418x1())) {
            c10743z5 = null;
        } else {
            c10743z5 = new C10743z5();
            c10743z5.m52124k4(ubb.m71602k4(C13670j2.m63183k4(uitVar.m42418x1())) / 100);
        }
        if (c10743z5 == null) {
            throw new InvalidOperationException();
        }
        c10419ee.m50513yj().addItem(c10743z5);
        C7394ca c7394caM34176k4 = uitVar.m42417to().m34176k4();
        int iM27428k4 = f4216k4.m27428k4(c7394caM34176k4.m29539k4());
        if (iM27428k4 == 0) {
            c10574od = new C10574od(((com.aspose.slides.internal.p332p7.oy7) c7394caM34176k4.m29542x1()).m38528k4());
        } else if (iM27428k4 == 1) {
            c10574od = new C10391cu(((com.aspose.slides.internal.p332p7.ql5) c7394caM34176k4.m29542x1()).m39532k4());
        } else if (iM27428k4 == 2) {
            c10574od = new C10427ep(((com.aspose.slides.internal.p332p7.mox) c7394caM34176k4.m29542x1()).m37034k4());
        } else if (iM27428k4 == 3) {
            c10574od = new C10742z2(((com.aspose.slides.internal.p332p7.bc9) c7394caM34176k4.m29542x1()).m28815k4());
        } else {
            if (iM27428k4 != 4) {
                throw new NotImplementedException();
            }
            gi8Var.m6691k4("Writing of the animation value list failed.", 1);
        }
        if (c10574od != null) {
            c10574od.m51409um().m51920k4((short) 0);
            c10419ee.m50513yj().addItem(c10574od);
        }
        if (uitVar.m42416kk() != null) {
            C10742z2 c10742z2 = new C10742z2(uitVar.m42416kk());
            c10742z2.m51409um().m51920k4((short) 1);
            c10419ee.m50513yj().addItem(c10742z2);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m4256k4(C10671ur c10671ur, com.aspose.slides.internal.p332p7.uit uitVar, com.aspose.slides.internal.p332p7.ijy ijyVar) {
        String strM52123du;
        AbstractC10402dj abstractC10402djM51818x1 = c10671ur.m51818x1();
        int iM50676x1 = abstractC10402djM51818x1.m50676x1();
        if (iM50676x1 == 0) {
            ((com.aspose.slides.internal.p332p7.oy7) ijyVar.m34177k4("boolVal").m29542x1()).m38527k4(((C10574od) C7019kk.m27452k4((Object) abstractC10402djM51818x1, C10574od.class)).m51427du());
        } else if (iM50676x1 == 1) {
            ((com.aspose.slides.internal.p332p7.ql5) ijyVar.m34177k4("intVal").m29542x1()).m39533k4(((C10391cu) C7019kk.m27452k4((Object) abstractC10402djM51818x1, C10391cu.class)).m50572du());
        } else if (iM50676x1 == 2) {
            ((com.aspose.slides.internal.p332p7.mox) ijyVar.m34177k4("fltVal").m29542x1()).m37035k4(((C10427ep) C7019kk.m27452k4((Object) abstractC10402djM51818x1, C10427ep.class)).m50772du());
        } else if (iM50676x1 == 3) {
            ((com.aspose.slides.internal.p332p7.bc9) ijyVar.m34177k4("strVal").m29542x1()).m28816k4(((C10742z2) C7019kk.m27452k4((Object) abstractC10402djM51818x1, C10742z2.class)).m52123du());
        }
        if (c10671ur.m51817kk() == null || (strM52123du = c10671ur.m51817kk().m52123du()) == null) {
            return;
        }
        uitVar.m42419x1(strM52123du);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m4257k4(uz3 uz3Var) {
        gi8 gi8VarM70203b3;
        int iM27462to;
        byte b;
        Effect effectM72002lr = uz3Var.m72002lr();
        if (effectM72002lr == null || (gi8VarM70203b3 = uz3Var.m3738du().m70203b3()) == null || !gi8VarM70203b3.m6695kk()) {
            return;
        }
        com.aspose.slides.internal.p332p7.rx0 rx0VarM7579m9 = effectM72002lr.m1375kk().m7579m9();
        if (rx0VarM7579m9 == null) {
            throw new ArgumentNullException();
        }
        C10358am c10358amM72007um = uz3Var.m72007um();
        if (c10358amM72007um == null) {
            throw new ArgumentNullException();
        }
        C10703x1 c10703x1 = new C10703x1();
        c10358amM72007um.m50507k4(c10703x1);
        C10503k4 c10503k4 = new C10503k4();
        c10703x1.m50513yj().addItem(c10503k4);
        c10503k4.m51077k4(new C10661u4(6L, C12003du.m56460uz().Clone()));
        c10503k4.m51084to((byte) 0);
        IGenericEnumerator<IBehavior> it = effectM72002lr.getBehaviors().iterator();
        while (it.hasNext()) {
            try {
                IBehavior next = it.next();
                if (C7019kk.m27469x1(next, IColorEffect.class) && ((IColorEffect) next).getTo() != null) {
                    c10503k4.m51084to((byte) 1);
                    c10503k4.m51077k4(new C10661u4(254L, ((ColorFormat) ((IColorEffect) next).getTo()).m1084to().Clone()));
                }
                if (C7019kk.m27469x1(next, ISetEffect.class) && C14113y2.m67363du("hidden", (String) C7019kk.m27452k4(((ISetEffect) next).getTo(), String.class))) {
                    c10503k4.m51084to((byte) 2);
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
        c10503k4.m51079k4(effectM72002lr.getTiming().getTriggerType() != 1);
        c10503k4.m51085to(true);
        c10503k4.m51066du((byte) 0);
        c10503k4.m51072h4((byte) 0);
        c10503k4.m51090x1(1);
        c10503k4.m51074k4((byte) 1);
        if (effectM72002lr.getSound() != null) {
            c10503k4.m51076k4(((long) nmb.m68089k4(effectM72002lr.getSound(), uz3Var.m3738du().m70215k4())) & 4294967295L);
        }
        if (effectM72002lr.getStopPreviousSound()) {
            c10503k4.m51091x1(true);
        }
        TextAnimation textAnimation = (TextAnimation) effectM72002lr.m1375kk().m7554du();
        if (textAnimation != null) {
            if (textAnimation.m2890x1().m73339x1() != null) {
                c10503k4.m51067du(true);
            }
            switch (textAnimation.getBuildType()) {
                case 0:
                case 1:
                    c10503k4.m51074k4((byte) 1);
                    break;
                case 2:
                    c10503k4.m51074k4((byte) 2);
                    break;
                case 3:
                    b = 3;
                    c10503k4.m51074k4(b);
                    break;
                case 4:
                    b = 4;
                    c10503k4.m51074k4(b);
                    break;
                case 5:
                    b = 5;
                    c10503k4.m51074k4(b);
                    break;
                case 6:
                    b = 6;
                    c10503k4.m51074k4(b);
                    break;
            }
        }
        c10503k4.m51078k4((short) uz3Var.m72013yd());
        if (!C14064he.m66703du(effectM72002lr.getTiming().getTriggerDelayTime())) {
            iM27462to = C14064he.m66715kk((float) c10503k4.m51083m9()) ? Integer.MAX_VALUE : C7019kk.m27462to(Double.valueOf(C14116yg.m67497to(effectM72002lr.getTiming().getTriggerDelayTime() * 1000.0f)), 14);
            m4254k4(rx0VarM7579m9, c10503k4);
        }
        c10503k4.m51075k4(iM27462to);
        m4254k4(rx0VarM7579m9, c10503k4);
    }
}

package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.gi */
/* JADX INFO: loaded from: classes3.dex */
class C1145gi {

    /* JADX INFO: renamed from: k4 */
    private static final C7017h4 f5253k4 = new C7017h4("by-letter", "by-word");

    /* JADX INFO: renamed from: k4 */
    public static int m6676k4(int i) {
        if (i == 0) {
            return -1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 0;
        }
        if (i == 3) {
            return 1;
        }
        if (i == 4) {
            return -1;
        }
        throw new ArgumentOutOfRangeException("value", C14042ak.m66410k4(com.aspose.slides.internal.p332p7.ac6.class, i));
    }

    /* JADX INFO: renamed from: kk */
    private static byte m6685kk(int i) {
        switch (i) {
            case 0:
            case 1:
                return (byte) -1;
            case 2:
                return (byte) 0;
            case 3:
                return (byte) 1;
            case 4:
                return (byte) 2;
            case 5:
                return (byte) 3;
            case 6:
                return (byte) 4;
            case 7:
                return (byte) 5;
            default:
                throw new ArgumentOutOfRangeException("presetClass", C14042ak.m66410k4(com.aspose.slides.internal.p332p7.c7j.class, i));
        }
    }

    /* JADX INFO: renamed from: x1 */
    public static int m6686x1(int i) {
        switch (i) {
            case 0:
                return -1;
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
            case 5:
                return -1;
            case 6:
                return 3;
            default:
                throw new ArgumentOutOfRangeException("value", C14042ak.m66410k4(com.aspose.slides.internal.p332p7.voi.class, i));
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static int m6677k4(String str) {
        int iM27428k4 = f5253k4.m27428k4(str);
        if (iM27428k4 != 0) {
            return iM27428k4 != 1 ? 0 : 1;
        }
        return 2;
    }

    /* JADX INFO: renamed from: k4 */
    public static Effect m6678k4(Sequence sequence, com.aspose.slides.internal.p332p7.idf idfVar, c0z c0zVar) {
        if (sequence == null) {
            throw new ArgumentNullException("sequence");
        }
        if (idfVar == null) {
            throw new ArgumentNullException("parElement");
        }
        if (idfVar.m34070to() == 0) {
            throw new InvalidOperationException();
        }
        Effect effect = new Effect(sequence);
        m6682k4(effect, idfVar.m34066jd(), idfVar.m34070to(), idfVar.m34071x1(), idfVar.m34068kk());
        sequence.m2530k4().m6576to().addItem(effect);
        m6683k4(effect, idfVar.m34064fa(), c0zVar);
        m6684k4(effect, idfVar);
        m6681k4(effect, idfVar.m34067k4());
        int[] iArr = {0};
        boolean z = wgi.m72731kk(idfVar.m34062du()) && C14057f9.m66590k4(idfVar.m34062du(), iArr);
        int i = iArr[0];
        if (z) {
            effect.m1375kk().m7566k4(i);
        }
        return effect;
    }

    /* JADX INFO: renamed from: k4 */
    public static Effect m6679k4(Sequence sequence, com.aspose.slides.internal.p332p7.vbl vblVar, c0z c0zVar) {
        if (sequence == null) {
            throw new ArgumentNullException("sequence");
        }
        if (vblVar == null) {
            throw new ArgumentNullException("parElement");
        }
        if (vblVar.m42905to() == 0) {
            throw new InvalidOperationException();
        }
        Effect effect = new Effect(sequence);
        m6682k4(effect, vblVar.m42901jd(), vblVar.m42905to(), vblVar.m42906x1(), vblVar.m42903kk());
        if (wgi.m72731kk(vblVar.m42896c5())) {
            effect.getTiming().setTriggerDelayTime(s8r.m70490k4(vblVar.m42896c5()));
        }
        if (wgi.m72731kk(vblVar.m42904m9())) {
            effect.setAnimateTextType(m6677k4(vblVar.m42904m9()));
            effect.setDelayBetweenTextParts((-((float) vblVar.m42899dy().m66822m9())) / 1000.0f);
        }
        if (effect.m1375kk().m7584to() == null) {
            C13742kp.m64089k4(effect, vblVar.m42900h4(), c0zVar);
        }
        sequence.m2530k4().m6576to().addItem(effect);
        m6683k4(effect, vblVar.m42897ck(), c0zVar);
        m6681k4(effect, vblVar.m42902k4());
        int[] iArr = {0};
        boolean z = wgi.m72731kk(vblVar.m42898du()) && C14057f9.m66590k4(vblVar.m42898du(), iArr);
        int i = iArr[0];
        if (z) {
            effect.m1375kk().m7566k4(i);
        }
        return effect;
    }

    /* JADX INFO: renamed from: k4 */
    private static void m6680k4(Effect effect, byte b) {
        if (b == 0) {
            effect.m1375kk().m7575kk(0);
            return;
        }
        if (b == 1) {
            effect.m1375kk().m7575kk(1);
            return;
        }
        if (b == 2) {
            effect.m1375kk().m7575kk(2);
            return;
        }
        if (b == 3) {
            effect.m1375kk().m7575kk(3);
        } else if (b == 4) {
            effect.m1375kk().m7575kk(5);
        } else {
            if (b != 5) {
                return;
            }
            effect.m1375kk().m7575kk(4);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m6681k4(Effect effect, int i) {
        if (i == 1) {
            effect.getTiming().setTriggerType(0);
            return;
        }
        if (i == 2) {
            effect.getTiming().setTriggerType(1);
        } else if (i == 3) {
            effect.getTiming().setTriggerType(2);
        } else {
            if (i != 4) {
                throw new ArgumentOutOfRangeException(C14113y2.m67402k4("{0} is not expected", C14042ak.m66411k4(com.aspose.slides.internal.p332p7.p8l.class, i, "F")));
            }
            effect.getTiming().setTriggerType(0);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m6682k4(Effect effect, int i, int i2, String str, String str2) {
        ((Timing) effect.getTiming()).m3019k4(m6686x1(i));
        effect.m1375kk().m7565k4(m6685kk(i2));
        m6680k4(effect, effect.m1375kk().m7562jd());
        if (wgi.m72731kk(str) && C14488t6.m70975x1().containsKey(str)) {
            effect.m1375kk().m7585to(C1243i8.m7546k4(C14488t6.m70975x1().get_Item(str).m72217k4(), effect.m1375kk().m7562jd()));
        } else {
            effect.m1375kk().m7585to(127);
        }
        if (!wgi.m72731kk(str2)) {
            effect.m1375kk().m7555du(0);
            return;
        }
        if (C14488t6.m70974k4().containsKey(str2)) {
            effect.m1375kk().m7555du(C1243i8.m7549x1(effect.m1375kk().m7562jd(), effect.m1375kk().m7595yj(), C14488t6.m70974k4().get_Item(str2).m69780k4()));
            return;
        }
        int[] iArr = {0};
        boolean z = C14057f9.m66590k4(str2, iArr) && iArr[0] > 0;
        int i3 = iArr[0];
        if (z) {
            effect.m1375kk().m7555du(C1243i8.m7543k4(effect.m1375kk().m7562jd(), effect.m1375kk().m7595yj(), ((long) i3) - 1));
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m6683k4(Effect effect, List<C7394ca> list, c0z c0zVar) {
        List.Enumerator<C7394ca> it = list.iterator();
        while (it.hasNext()) {
            try {
                C14468ss.m70753k4(effect, it.next(), c0zVar);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m6684k4(Effect effect, com.aspose.slides.internal.p332p7.idf idfVar) {
        effect.getTiming().setAutoReverse(idfVar.m34061ck());
        effect.getTiming().setRestart(m6676k4(idfVar.m34060c5()));
        if (wgi.m72731kk(idfVar.m34063dy())) {
            effect.getTiming().setRepeatCount(s8r.m70493x1(idfVar.m34063dy()));
        }
        if (wgi.m72731kk(idfVar.m34069m9())) {
            effect.getTiming().setRepeatDuration(s8r.m70490k4(idfVar.m34069m9()));
        }
        if (wgi.m72731kk(idfVar.m34065h4())) {
            effect.getTiming().setTriggerDelayTime(s8r.m70490k4(idfVar.m34065h4()));
        }
    }
}

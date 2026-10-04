package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C7811gz;
import com.aspose.slides.internal.p332p7.C8248m8;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.pa */
/* JADX INFO: loaded from: classes3.dex */
class C14272pa {
    /* JADX INFO: renamed from: k4 */
    private static byte m68980k4(C1243i8 c1243i8) {
        if (c1243i8.m7561ix() != -1) {
            int iM7589wl = c1243i8.m7589wl();
            if (iM7589wl == 0) {
                return (byte) 1;
            }
            if (iM7589wl == 1) {
                return (byte) 2;
            }
            throw new ArgumentOutOfRangeException();
        }
        int iM7582qq = c1243i8.m7582qq();
        if (iM7582qq == 0) {
            return (byte) 3;
        }
        if (iM7582qq == 1) {
            return (byte) 4;
        }
        throw new ArgumentOutOfRangeException();
    }

    /* JADX INFO: renamed from: k4 */
    private static void m68981k4(com.aspose.slides.internal.p332p7.sdd sddVar) {
        ((C8248m8) ((C7811gz) sddVar.m40963k4("graphicEl").m29542x1()).m33001k4("chart").m29542x1()).m36730k4((byte) 0);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m68982k4(com.aspose.slides.internal.p332p7.sdd sddVar, List<IEffect> list, Effect effect, Chart chart) {
        int iM7588uz;
        if (m68984k4(list, effect, chart)) {
            m68981k4(sddVar);
            return;
        }
        C8248m8 c8248m8 = (C8248m8) ((C7811gz) sddVar.m40963k4("graphicEl").m29542x1()).m33001k4("chart").m29542x1();
        C1243i8 c1243i8M1375kk = effect.m1375kk();
        if (c1243i8M1375kk.m7561ix() != -1) {
            int iM7589wl = c1243i8M1375kk.m7589wl();
            if (iM7589wl == 0) {
                c8248m8.m36731k4(effect.m1375kk().m7561ix());
                c8248m8.m36730k4(m68980k4(c1243i8M1375kk));
            } else {
                if (iM7589wl != 1) {
                    throw new ArgumentOutOfRangeException();
                }
                iM7588uz = effect.m1375kk().m7561ix();
            }
        } else {
            c8248m8.m36731k4(effect.m1375kk().m7586u4());
            iM7588uz = effect.m1375kk().m7588uz();
        }
        c8248m8.m36732x1(iM7588uz);
        c8248m8.m36730k4(m68980k4(c1243i8M1375kk));
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m68983k4(List<IEffect> list, Chart chart) {
        List.Enumerator<IEffect> it = list.iterator();
        while (it.hasNext()) {
            try {
                Effect effect = (Effect) it.next();
                if (effect.m1375kk().m7584to() == chart && effect.m1375kk().m7561ix() != -1) {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                    return true;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m68984k4(List<IEffect> list, Effect effect, Chart chart) {
        return m68985k4(effect) && m68983k4(list, chart);
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m68985k4(Effect effect) {
        return (effect.m1375kk().m7561ix() == -1) && (effect.m1375kk().m7588uz() == -1 && effect.m1375kk().m7586u4() == -1);
    }
}

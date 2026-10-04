package com.aspose.slides.internal.p071cz;

import com.aspose.slides.exceptions.NotImplementedException;

/* JADX INFO: renamed from: com.aspose.slides.internal.cz.zg */
/* JADX INFO: loaded from: classes3.dex */
final class C2996zg {

    /* JADX INFO: renamed from: k4 */
    private static C2996zg f8826k4;

    /* JADX INFO: renamed from: x1 */
    private static final Object f8827x1 = new Object();

    /* JADX INFO: renamed from: k4 */
    public AbstractC2788k9 m12645k4(AbstractC2679c1 abstractC2679c1, AbstractC2725fb abstractC2725fb, AbstractC2759hz abstractC2759hz, AbstractC2720f3 abstractC2720f3, C2778ji c2778ji, C2867q6 c2867q6) {
        C2696dd c2696dd = abstractC2679c1 instanceof C2696dd ? (C2696dd) abstractC2679c1 : null;
        if (c2696dd != null) {
            return new C2748h8(c2696dd, abstractC2725fb, abstractC2759hz, abstractC2720f3, c2778ji, c2867q6);
        }
        C2946wg c2946wg = abstractC2679c1 instanceof C2946wg ? (C2946wg) abstractC2679c1 : null;
        if (c2946wg != null) {
            return new C2658al(c2946wg, abstractC2725fb, abstractC2759hz, abstractC2720f3, c2778ji, c2867q6);
        }
        C2767iq c2767iq = abstractC2679c1 instanceof C2767iq ? (C2767iq) abstractC2679c1 : null;
        if (c2767iq != null) {
            return new C2761i3(c2767iq, abstractC2725fb, abstractC2759hz, abstractC2720f3, c2778ji, c2867q6);
        }
        C3001zp c3001zp = abstractC2679c1 instanceof C3001zp ? (C3001zp) abstractC2679c1 : null;
        if (c3001zp != null) {
            return new C2793ko(c3001zp, abstractC2725fb, abstractC2759hz, abstractC2720f3, c2778ji, c2867q6);
        }
        throw new NotImplementedException();
    }

    /* JADX INFO: renamed from: k4 */
    public static C2996zg m12644k4() {
        C2996zg c2996zg = f8826k4;
        if (c2996zg != null) {
            return c2996zg;
        }
        synchronized (f8827x1) {
            if (c2996zg == null) {
                try {
                    c2996zg = new C2996zg();
                    f8826k4 = c2996zg;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c2996zg;
    }
}

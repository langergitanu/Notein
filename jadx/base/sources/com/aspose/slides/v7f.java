package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.internal.p077d8.C3048e0;
import com.aspose.slides.internal.p077d8.C3091u4;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p205ji.C5449c5;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.p559ms.System.C14047bz;

/* JADX INFO: loaded from: classes3.dex */
class v7f {

    /* JADX INFO: renamed from: k4 */
    private static final Dictionary<Long, C14047bz> f49480k4 = new Dictionary<>();

    /* JADX INFO: renamed from: x1 */
    private static final Object f49481x1 = new Object();

    /* JADX INFO: renamed from: k4 */
    private static double m72081k4(AbstractC3150x6 abstractC3150x6) {
        if (abstractC3150x6 == null) {
            return 0.0d;
        }
        AbstractC3150x6 abstractC3150x6M13133k4 = C3091u4.m13133k4(abstractC3150x6);
        double length = abstractC3150x6M13133k4.getLength() / 1048576.0d;
        if (abstractC3150x6M13133k4 != abstractC3150x6) {
            abstractC3150x6M13133k4.dispose();
        }
        return length;
    }

    /* JADX INFO: renamed from: x1 */
    public static boolean m72090x1(C14047bz c14047bz) {
        boolean z;
        long jM22530dy = C5449c5.m22523k4().m22530dy();
        synchronized (f49481x1) {
            try {
                C14047bz c14047bz2 = new C14047bz();
                C14047bz[] c14047bzArr = {c14047bz2};
                Dictionary<Long, C14047bz> dictionary = f49480k4;
                z = true;
                boolean z2 = dictionary.tryGetValue(Long.valueOf(jM22530dy), c14047bzArr) && C14047bz.m66535k4(c14047bzArr[0], c14047bz);
                c14047bzArr[0].CloneTo(c14047bz2);
                if (z2) {
                    dictionary.removeItemByKey(Long.valueOf(jM22530dy));
                } else {
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: k4 */
    private static double m72082k4(C12009k4 c12009k4) {
        if (c12009k4 == null) {
            return 0.0d;
        }
        return ((double) ((c12009k4.mo15757m9() * c12009k4.mo15760yj()) * 32)) / 1048576.0d;
    }

    /* JADX INFO: renamed from: k4 */
    private static double m72083k4(C12015qq c12015qq) {
        return ((double) ((c12015qq.m56697kk() * c12015qq.m56699x1()) * 32.0f)) / 1048576.0d;
    }

    /* JADX INFO: renamed from: k4 */
    public static double m72084k4(C14047bz c14047bz, AbstractC3150x6 abstractC3150x6) {
        double dM72081k4 = m72081k4(abstractC3150x6);
        if (m72090x1(c14047bz.Clone())) {
            C3048e0.m12897k4().m12900k4(dM72081k4);
        }
        return dM72081k4;
    }

    /* JADX INFO: renamed from: k4 */
    private static double m72085k4(String str) {
        if (str != null) {
            return ((double) str.length()) / 1048576.0d;
        }
        return 0.0d;
    }

    /* JADX INFO: renamed from: k4 */
    public static void m72086k4(C14047bz c14047bz) {
        long jM22530dy = C5449c5.m22523k4().m22530dy();
        synchronized (f49481x1) {
            try {
                Dictionary<Long, C14047bz> dictionary = f49480k4;
                if (!dictionary.containsKey(Long.valueOf(jM22530dy))) {
                    dictionary.addItem(Long.valueOf(jM22530dy), c14047bz.Clone());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m72087k4(C14047bz c14047bz, C12009k4 c12009k4) {
        if (m72090x1(c14047bz.Clone())) {
            C3048e0.m12897k4().m12900k4(m72082k4(c12009k4));
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m72088k4(C14047bz c14047bz, C12015qq c12015qq) {
        if (m72090x1(c14047bz.Clone())) {
            C3048e0.m12897k4().m12900k4(m72083k4(c12015qq.Clone()));
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m72089k4(C14047bz c14047bz, String str) {
        if (m72090x1(c14047bz.Clone())) {
            C3048e0.m12897k4().m12900k4(m72085k4(str));
        }
    }
}

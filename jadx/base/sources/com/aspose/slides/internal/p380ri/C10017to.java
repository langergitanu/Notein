package com.aspose.slides.internal.p380ri;

import com.aspose.slides.p559ms.System.C14069jd;

/* JADX INFO: renamed from: com.aspose.slides.internal.ri.to */
/* JADX INFO: loaded from: classes4.dex */
public class C10017to {
    /* JADX INFO: renamed from: k4 */
    public static int m49167k4(double d) {
        long jM66783x1 = C14069jd.m66783x1(d);
        return (int) (jM66783x1 ^ (jM66783x1 >> 32));
    }

    /* JADX INFO: renamed from: k4 */
    public static int m49168k4(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m49169k4(double d, double d2) {
        return C14069jd.m66783x1(d) == C14069jd.m66783x1(d2);
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m49170k4(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj == obj2 || obj.equals(obj2);
    }
}

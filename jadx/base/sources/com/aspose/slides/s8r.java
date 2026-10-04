package com.aspose.slides;

import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: loaded from: classes3.dex */
class s8r {
    /* JADX INFO: renamed from: k4 */
    public static float m70490k4(String str) {
        return m70491k4(str, 1.0f);
    }

    /* JADX INFO: renamed from: kk */
    private static float m70492kk(String str, float f) {
        float[] fArr = {0.0f};
        return !C14064he.m66713k4(str, 111, C11697x1.m55250kk(), fArr) ? f : fArr[0];
    }

    /* JADX INFO: renamed from: x1 */
    public static float m70493x1(String str) {
        return m70494x1(str, Float.NaN);
    }

    /* JADX INFO: renamed from: k4 */
    public static float m70491k4(String str, float f) {
        return !wgi.m72731kk(str) ? f : !C14113y2.m67424kk(str, "s") ? m70492kk(str, f) * 1000.0f : m70492kk(OooO0OO.OooO00o(1, 0, str, str), f);
    }

    /* JADX INFO: renamed from: x1 */
    public static float m70494x1(String str, float f) {
        if (!wgi.m72731kk(str)) {
            return f;
        }
        if ("indefinite".equals(str)) {
            return Float.POSITIVE_INFINITY;
        }
        return C13850af.m65122ks(str);
    }
}

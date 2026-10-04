package com.aspose.slides;

import com.aspose.slides.internal.p475wh.C12009k4;

/* JADX INFO: renamed from: com.aspose.slides.mt */
/* JADX INFO: loaded from: classes3.dex */
class C14143mt {
    /* JADX INFO: renamed from: k4 */
    private static C12009k4 m67712k4(C12009k4 c12009k4, float f) {
        return ysu.m74079k4(c12009k4, C22202OooO0oo.OooO00o(f, 255.0f, 13));
    }

    /* JADX INFO: renamed from: kk */
    private static C12009k4 m67714kk(C12009k4 c12009k4, int i) {
        return C13679jb.m63271k4(c12009k4);
    }

    /* JADX INFO: renamed from: x1 */
    private static C12009k4 m67715x1(C12009k4 c12009k4, int i) {
        return j5m.m63218k4(c12009k4);
    }

    /* JADX INFO: renamed from: k4 */
    public static C12009k4 m67713k4(C12009k4 c12009k4, int i) {
        float f;
        switch (i) {
            case 1:
            case 2:
                return m67714kk(c12009k4, i);
            case 3:
            case 4:
                return m67715x1(c12009k4, i);
            case 5:
                f = 0.25f;
                break;
            case 6:
                f = 0.5f;
                break;
            case 7:
                f = 0.75f;
                break;
            default:
                return c12009k4;
        }
        return m67712k4(c12009k4, f);
    }
}

package com.aspose.slides.internal.p404sp;

import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.sp.k4 */
/* JADX INFO: loaded from: classes4.dex */
public class C10311k4 {

    /* JADX INFO: renamed from: k4 */
    private static final C7017h4 f36734k4 = new C7017h4("none", "xminymin", "xmidymin", "xmaxymin", "xminymid", "xmaxymid", "xminymax", "xmidymax", "xmaxymax", "xmidymid");

    /* JADX INFO: renamed from: k4 */
    public static int m50277k4(String str) {
        if (C14113y2.m67411k4(str)) {
            return 5;
        }
        switch (f36734k4.m27428k4(C14113y2.m67368h4(C14113y2.m67440x1(str)))) {
        }
        return 5;
    }

    /* JADX INFO: renamed from: k4 */
    public static String m50278k4(int i) {
        switch (i) {
            case 0:
                return "none";
            case 1:
                return "xMinYMin";
            case 2:
                return "xMidYMin";
            case 3:
                return "xMaxYMin";
            case 4:
                return "xMinYMid";
            case 5:
            default:
                return "xMidYMid";
            case 6:
                return "xMaxYMid";
            case 7:
                return "xMinYMax";
            case 8:
                return "xMidYMax";
            case 9:
                return "xMaxYMax";
        }
    }
}

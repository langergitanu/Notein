package com.aspose.slides.internal.p404sp;

import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.sp.m9 */
/* JADX INFO: loaded from: classes4.dex */
public class C10313m9 {

    /* JADX INFO: renamed from: k4 */
    private static final C7017h4 f36738k4 = new C7017h4("round", "square");

    /* JADX INFO: renamed from: k4 */
    public static int m50286k4(String str) {
        if (str == null) {
            return 0;
        }
        int iM27428k4 = f36738k4.m27428k4(C14113y2.m67368h4(C14113y2.m67440x1(str)));
        if (iM27428k4 != 0) {
            return iM27428k4 != 1 ? 0 : 2;
        }
        return 1;
    }

    /* JADX INFO: renamed from: x1 */
    public static int m50288x1(int i) {
        if (i != 1) {
            return i != 2 ? 0 : 1;
        }
        return 2;
    }

    /* JADX INFO: renamed from: k4 */
    public static String m50287k4(int i) {
        return i != 1 ? i != 2 ? "butt" : "square" : "round";
    }
}

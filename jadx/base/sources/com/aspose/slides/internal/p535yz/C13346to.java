package com.aspose.slides.internal.p535yz;

import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.yz.to */
/* JADX INFO: loaded from: classes5.dex */
public class C13346to {

    /* JADX INFO: renamed from: k4 */
    private static final C7017h4 f44702k4 = new C7017h4("italic", "oblique");

    /* JADX INFO: renamed from: k4 */
    public static int m62007k4(String str) {
        if (C14113y2.m67411k4(str)) {
            return 0;
        }
        int iM27428k4 = f44702k4.m27428k4(C14113y2.m67368h4(C14113y2.m67440x1(str)));
        if (iM27428k4 != 0) {
            return iM27428k4 != 1 ? 0 : 2;
        }
        return 1;
    }

    /* JADX INFO: renamed from: k4 */
    public static String m62008k4(int i) {
        return i != 1 ? i != 2 ? "normal" : "oblique" : "italic";
    }
}

package com.aspose.slides.internal.p252lk;

import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.lk.du */
/* JADX INFO: loaded from: classes4.dex */
public class C6102du {

    /* JADX INFO: renamed from: k4 */
    private static final C7017h4 f17234k4 = new C7017h4("reflect", "repeat", "pad");

    /* JADX INFO: renamed from: k4 */
    public static int m24735k4(String str) {
        if (C14113y2.m67411k4(str)) {
            return 0;
        }
        int iM27428k4 = f17234k4.m27428k4(str);
        if (iM27428k4 != 0) {
            return iM27428k4 != 1 ? 0 : 2;
        }
        return 1;
    }

    /* JADX INFO: renamed from: k4 */
    public static String m24736k4(int i) {
        return i != 1 ? i != 2 ? "pad" : "repeat" : "reflect";
    }
}

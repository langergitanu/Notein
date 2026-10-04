package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p032b1.C1569kk;
import com.aspose.slides.internal.p521y9.C12804k4;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.w3 */
/* JADX INFO: loaded from: classes3.dex */
class C14722w3 {

    /* JADX INFO: renamed from: k4 */
    private static final List<String> f49757k4;

    static {
        List<String> list = new List<>();
        f49757k4 = list;
        list.addItem("h1");
        list.addItem("h2");
        list.addItem("h3");
        list.addItem("h4");
        list.addItem("h5");
        list.addItem("h6");
    }

    /* JADX INFO: renamed from: c5 */
    public static boolean m72625c5(C12804k4 c12804k4) {
        int iOooO0O0 = OooOo00.OooO0O0((C1569kk) c12804k4);
        return iOooO0O0 == 1 || iOooO0O0 == 2;
    }

    /* JADX INFO: renamed from: du */
    public static boolean m72626du(C12804k4 c12804k4) {
        int iOooO0O0 = OooOo00.OooO0O0((C1569kk) c12804k4);
        return iOooO0O0 == 1 || iOooO0O0 == 14 || iOooO0O0 == 2;
    }

    /* JADX INFO: renamed from: dy */
    public static boolean m72627dy(C12804k4 c12804k4) {
        return f49757k4.containsItem(C14113y2.m67361du(c12804k4.mo22604c5()));
    }

    /* JADX INFO: renamed from: h4 */
    public static boolean m72628h4(C12804k4 c12804k4) {
        return C14113y2.m67432to(c12804k4.mo22604c5(), "body", (short) 3);
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m72629k4(C12804k4 c12804k4) {
        return C14113y2.m67432to(c12804k4.mo22604c5(), "img", (short) 3) || C14113y2.m67432to(c12804k4.mo22604c5(), "svg", (short) 3) || C14113y2.m67432to(c12804k4.mo22604c5(), "canvas", (short) 3);
    }

    /* JADX INFO: renamed from: kk */
    public static boolean m72630kk(C12804k4 c12804k4) {
        return OooOo00.OooO0O0((C1569kk) c12804k4) == 14;
    }

    /* JADX INFO: renamed from: m9 */
    public static boolean m72631m9(C12804k4 c12804k4) {
        return C14113y2.m67432to(c12804k4.mo22604c5(), "center", (short) 3);
    }

    /* JADX INFO: renamed from: to */
    public static boolean m72632to(C12804k4 c12804k4) {
        return OooOo00.OooO0O0((C1569kk) c12804k4) == 0;
    }

    /* JADX INFO: renamed from: x1 */
    public static boolean m72633x1(C12804k4 c12804k4) {
        return OooOo00.OooO0O0((C1569kk) c12804k4) == 6;
    }
}

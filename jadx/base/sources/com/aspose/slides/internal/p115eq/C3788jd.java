package com.aspose.slides.internal.p115eq;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.eq.jd */
/* JADX INFO: loaded from: classes.dex */
public class C3788jd {
    /* JADX INFO: renamed from: k4 */
    public static List<Float> m15136k4(String str) {
        if (C14113y2.m67432to("none", str, (short) 3)) {
            return new List<>();
        }
        List<Float> list = new List<>();
        C3789k4 c3789k4 = new C3789k4(str);
        while (true) {
            float fM15140kk = c3789k4.m15140kk();
            if (c3789k4.m15139k4()) {
                return list;
            }
            list.addItem(Float.valueOf(fM15140kk));
        }
    }
}

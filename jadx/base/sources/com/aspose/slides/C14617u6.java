package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C7859hj;
import com.aspose.slides.internal.p332p7.C9248xz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.u6 */
/* JADX INFO: loaded from: classes3.dex */
class C14617u6 {
    /* JADX INFO: renamed from: k4 */
    public static void m71490k4(IFonts iFonts, C7859hj c7859hj) {
        if (c7859hj == null) {
            return;
        }
        FontData fontDataM68334k4 = C14215o5.m68334k4(c7859hj.m33481x1());
        iFonts.setLatinFont(fontDataM68334k4);
        FontData fontDataM68334k42 = C14215o5.m68334k4(c7859hj.m33479kk());
        if (!C14113y2.m67411k4(fontDataM68334k42.getFontName())) {
            fontDataM68334k4 = fontDataM68334k42;
        }
        iFonts.setEastAsianFont(fontDataM68334k4);
        iFonts.setComplexScriptFont(C14215o5.m68334k4(c7859hj.m33480to()));
        m71491kk(iFonts, c7859hj);
    }

    /* JADX INFO: renamed from: kk */
    private static void m71491kk(IFonts iFonts, C7859hj c7859hj) {
        C1247ic c1247icM1523k4 = ((Fonts) iFonts).m1523k4();
        for (C9248xz c9248xz : c7859hj.m33475du()) {
            c1247icM1523k4.m7618k4(c9248xz.m44754k4(), c9248xz.m44756x1());
        }
        c1247icM1523k4.m7617k4(c7859hj.m33476h4());
    }

    /* JADX INFO: renamed from: to */
    private static void m71492to(IFonts iFonts, C7859hj c7859hj) {
        C1247ic c1247icM1523k4 = ((Fonts) iFonts).m1523k4();
        Dictionary.Enumerator<String, String> it = c1247icM1523k4.m7615k4().iterator();
        while (it.hasNext()) {
            try {
                KeyValuePair next = it.next();
                C9248xz c9248xzM33477k4 = c7859hj.m33477k4();
                c9248xzM33477k4.m44755k4((String) next.getKey());
                c9248xzM33477k4.m44757x1((String) next.getValue());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c7859hj.m33478k4(c1247icM1523k4.m7619x1());
    }

    /* JADX INFO: renamed from: x1 */
    public static void m71493x1(IFonts iFonts, C7859hj c7859hj) {
        C14215o5.m68337k4(iFonts.getLatinFont(), c7859hj.m33481x1());
        C14215o5.m68337k4(iFonts.getEastAsianFont(), c7859hj.m33479kk());
        C14215o5.m68337k4(iFonts.getComplexScriptFont(), c7859hj.m33480to());
        m71492to(iFonts, c7859hj);
    }
}

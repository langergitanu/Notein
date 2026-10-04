package com.aspose.slides.internal.p258lv;

import com.aspose.slides.internal.p151gj.C4324m9;
import com.aspose.slides.internal.p223ka.C5656k4;
import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.lv.c5 */
/* JADX INFO: loaded from: classes4.dex */
public class C6234c5 extends C6257wy {
    public C6234c5(C6258x1 c6258x1) {
        super(c6258x1);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m25247k4(C4324m9 c4324m9) {
        m25384h4().m25294x1(2, 2, false);
        m25384h4().m25294x1(0, 2, false);
        if (c4324m9.m17409x1() == null) {
            m25384h4().m25294x1(2, 4, false);
            m25246k4(c4324m9.m17393h4(), (byte) 0);
            m25246k4(c4324m9.m17399m9(), (byte) -1);
        } else {
            m25384h4().m25294x1(c4324m9.m17409x1().length, 4, false);
            for (int i = 0; i < c4324m9.m17409x1().length; i++) {
                m25246k4(c4324m9.m17409x1()[i].m17353k4(), C7019kk.m27442k4(Float.valueOf(c4324m9.m17409x1()[i].m17355x1() * 255.0f), 13));
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m25246k4(C5656k4 c5656k4, byte b) {
        m25384h4().m25282k4(b & 255);
        m25384h4().m25295x1(c5656k4);
    }
}

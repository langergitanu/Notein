package com.aspose.slides;

import com.aspose.slides.exceptions.NullReferenceException;
import com.aspose.slides.internal.p407st.C10634sc;

/* JADX INFO: renamed from: com.aspose.slides.v2 */
/* JADX INFO: loaded from: classes3.dex */
class C14661v2 {
    /* JADX INFO: renamed from: k4 */
    public static void m72056k4(MasterHandoutSlide masterHandoutSlide, C10634sc c10634sc) {
        masterHandoutSlide.m1929ne();
    }

    /* JADX INFO: renamed from: k4 */
    public static void m72057k4(m4c m4cVar) {
        MasterHandoutSlide masterHandoutSlide = (MasterHandoutSlide) m4cVar.m64735up();
        if (masterHandoutSlide == null) {
            throw new NullReferenceException("Can't create target DOM MasterHandoutSlide!");
        }
        C10634sc c10634sc = (C10634sc) m4cVar.m64717jd();
        C1240i5.m7462k4(m4cVar);
        m72056k4(masterHandoutSlide, c10634sc);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m72058k4(rpo rpoVar) {
        if (rpoVar == null) {
            return;
        }
        C1240i5.m7464k4(rpoVar);
    }
}

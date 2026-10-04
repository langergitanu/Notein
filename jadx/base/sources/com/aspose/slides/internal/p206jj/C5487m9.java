package com.aspose.slides.internal.p206jj;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p019ac.AbstractC1349ne;
import com.aspose.slides.internal.p019ac.C1341fa;
import com.aspose.slides.internal.p019ac.C1346kk;
import com.aspose.slides.internal.p019ac.C1355up;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.jj.m9 */
/* JADX INFO: loaded from: classes.dex */
public class C5487m9 extends AbstractC5496yj {
    /* JADX INFO: renamed from: k4 */
    public AbstractC1349ne m22577k4(C3134k4 c3134k4) {
        C1355up c1355up = new C1355up((C1341fa) new C5479dy().m22569k4(c3134k4));
        try {
            c1355up.m7994k4((C1346kk) new C5494x1().m22584k4(c3134k4));
            return c1355up;
        } catch (ArgumentOutOfRangeException e) {
            C6005k4.m24263kk(C14113y2.m67408k4("ArgumentOutOfRangeException in EmfDesignVectorReader:", e.getMessage()));
            return c1355up;
        }
    }
}

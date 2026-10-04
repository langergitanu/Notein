package com.aspose.slides.internal.p422tl;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p260ly.AbstractC6280ne;
import com.aspose.slides.internal.p260ly.C6272fa;
import com.aspose.slides.internal.p260ly.C6277kk;
import com.aspose.slides.internal.p260ly.C6286up;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.tl.m9 */
/* JADX INFO: loaded from: classes4.dex */
public class C11056m9 extends AbstractC11065yj {
    /* JADX INFO: renamed from: k4 */
    public AbstractC6280ne m53488k4(C3134k4 c3134k4) {
        C6286up c6286up = new C6286up((C6272fa) new C11048dy().m53480k4(c3134k4));
        try {
            c6286up.m25650k4((C6277kk) new C11063x1().m53495k4(c3134k4));
            return c6286up;
        } catch (ArgumentOutOfRangeException e) {
            C6005k4.m24263kk(C14113y2.m67408k4("ArgumentOutOfRangeException in EmfDesignVectorReader:", e.getMessage()));
            return c6286up;
        }
    }
}

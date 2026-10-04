package com.aspose.slides.internal.p435u5;

import androidx.core.app.FrameMetricsAggregator;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.u5.m9 */
/* JADX INFO: loaded from: classes4.dex */
class C11286m9 {
    /* JADX INFO: renamed from: k4 */
    public static Object m54247k4(String str) {
        if (str != null && C14113y2.m67440x1(str).length() != 0) {
            try {
                return Float.valueOf(C14064he.m66706k4(str, FrameMetricsAggregator.EVERY_DURATION, C11697x1.m55250kk()));
            } catch (RuntimeException unused) {
            }
        }
        return null;
    }
}

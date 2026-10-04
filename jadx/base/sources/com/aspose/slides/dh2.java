package com.aspose.slides;

import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14113y2;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;

/* JADX INFO: loaded from: classes3.dex */
class dh2 {
    /* JADX INFO: renamed from: k4 */
    public static String m5101k4(double d) {
        return m5102k4(d, 3, true);
    }

    /* JADX INFO: renamed from: k4 */
    public static String m5102k4(double d, int i, boolean z) {
        String strM66434k4 = C14044b3.m66434k4(d, C14113y2.m67408k4("0.", C14113y2.m67389k4('0', i)), C11697x1.m55250kk());
        return z ? C14113y2.m67362du(C14113y2.m67362du(strM66434k4, '0'), FilenameUtils.EXTENSION_SEPARATOR) : strM66434k4;
    }

    /* JADX INFO: renamed from: k4 */
    public static String m5103k4(float f) {
        return m5102k4(f, 3, true);
    }
}

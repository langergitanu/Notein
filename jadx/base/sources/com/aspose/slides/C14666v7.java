package com.aspose.slides;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.words.ControlChar;

/* JADX INFO: renamed from: com.aspose.slides.v7 */
/* JADX INFO: loaded from: classes3.dex */
class C14666v7 {

    /* JADX INFO: renamed from: k4 */
    private double f49478k4;

    /* JADX INFO: renamed from: x1 */
    private double f49479x1;

    public C14666v7(String str) {
        if (C14113y2.m67411k4(str)) {
            return;
        }
        String[] strArrM67414k4 = C14113y2.m67414k4(str, ControlChar.SPACE_CHAR);
        if (strArrM67414k4.length < 2) {
            throw new InvalidOperationException();
        }
        this.f49478k4 = wgi.m72739up(strArrM67414k4[0]);
        this.f49479x1 = C14044b3.m66428k4(strArrM67414k4[1], C11697x1.m55250kk());
    }
}

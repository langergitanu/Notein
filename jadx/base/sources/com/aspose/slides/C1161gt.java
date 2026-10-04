package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.words.ControlChar;

/* JADX INFO: renamed from: com.aspose.slides.gt */
/* JADX INFO: loaded from: classes3.dex */
class C1161gt {

    /* JADX INFO: renamed from: k4 */
    private double f5333k4;

    /* JADX INFO: renamed from: kk */
    private double f5334kk;

    /* JADX INFO: renamed from: x1 */
    private double f5335x1;

    public C1161gt(String str) {
        if (C14113y2.m67411k4(str)) {
            throw new ArgumentNullException("value");
        }
        String strM67401k4 = C14113y2.m67401k4(C14113y2.m67401k4(str, "(", ""), ")", "");
        if ("".equals(strM67401k4)) {
            return;
        }
        String[] strArrM67414k4 = C14113y2.m67414k4(strM67401k4, ControlChar.SPACE_CHAR);
        if (strArrM67414k4.length < 3) {
            return;
        }
        this.f5333k4 = wgi.m72739up(strArrM67414k4[0]);
        this.f5335x1 = wgi.m72739up(strArrM67414k4[1]);
        this.f5334kk = wgi.m72739up(strArrM67414k4[2]);
    }
}

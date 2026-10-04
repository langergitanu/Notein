package com.aspose.slides;

import com.aspose.slides.exceptions.FormatException;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p080dd.C3134k4;

/* JADX INFO: loaded from: classes3.dex */
class s0q {

    /* JADX INFO: renamed from: k4 */
    private final int f48740k4;

    /* JADX INFO: renamed from: x1 */
    private final String f48741x1;

    private s0q(C3134k4 c3134k4) {
        int iM13386x6 = c3134k4.m13386x6();
        this.f48740k4 = iM13386x6;
        if (iM13386x6 == 0) {
            this.f48741x1 = "";
            return;
        }
        String strM13079k4 = C3085sv.m13079k4(c3134k4);
        this.f48741x1 = strM13079k4;
        if (strM13079k4.length() + 1 != iM13386x6) {
            throw new FormatException();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static s0q m70409k4(C3134k4 c3134k4) {
        return new s0q(c3134k4);
    }

    /* JADX INFO: renamed from: k4 */
    public final String m70410k4() {
        return this.f48741x1;
    }
}

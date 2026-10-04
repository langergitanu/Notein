package com.aspose.slides;

import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
class i7n {

    /* JADX INFO: renamed from: k4 */
    static final int[] f5657k4 = {61440, 61568, 61696};

    /* JADX INFO: renamed from: kk */
    private final float[] f5658kk;

    /* JADX INFO: renamed from: x1 */
    private final int[] f5659x1;

    public i7n(int[] iArr, float[] fArr) {
        this.f5659x1 = iArr;
        this.f5658kk = fArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final float m7539k4(char c) {
        int iM67196k4 = AbstractC14092to.m67196k4((c < 61440 || !ay6.m3836ks()) ? AbstractC14092to.m67208k4((Object) this.f5659x1) : AbstractC14092to.m67208k4((Object) f5657k4), Integer.valueOf(c));
        if (iM67196k4 < 0) {
            iM67196k4 = (~iM67196k4) - 1;
        }
        return this.f5658kk[iM67196k4];
    }

    /* JADX INFO: renamed from: k4 */
    public final String m7540k4(String str, int[] iArr) {
        int i = iArr[0];
        if (i >= str.length()) {
            return "";
        }
        float fM7539k4 = m7539k4(str.charAt(iArr[0]));
        iArr[0] = iArr[0] + 1;
        if (C14064he.m66715kk(fM7539k4)) {
            while (iArr[0] < str.length() && C14064he.m66715kk(m7539k4(str.charAt(iArr[0])))) {
                iArr[0] = iArr[0] + 1;
            }
        } else {
            while (iArr[0] < str.length() && fM7539k4 == m7539k4(str.charAt(iArr[0]))) {
                iArr[0] = iArr[0] + 1;
            }
        }
        return (i == 0 && iArr[0] == str.length()) ? str : C14113y2.m67443x1(str, i, iArr[0] - i);
    }
}

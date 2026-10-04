package com.aspose.slides.internal.p550zi;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.zi.qq */
/* JADX INFO: loaded from: classes5.dex */
public class C13609qq {

    /* JADX INFO: renamed from: k4 */
    private final int[] f45187k4;

    /* JADX INFO: renamed from: kk */
    private String f45188kk;

    /* JADX INFO: renamed from: to */
    private final int f45189to;

    /* JADX INFO: renamed from: x1 */
    private final int f45190x1;

    private C13609qq(int[] iArr, int i, int i2, String str) {
        this.f45189to = i2;
        this.f45187k4 = iArr;
        this.f45190x1 = i;
        this.f45188kk = C14113y2.m67400k4(this.f45188kk, C14113y2.m67408k4(str, ", used channels: "));
        int i3 = 0;
        while (true) {
            int[] iArr2 = this.f45187k4;
            if (i3 >= iArr2.length) {
                return;
            }
            String strM67399k4 = C14113y2.m67399k4(this.f45188kk, C7019kk.m27466x1(iArr2[i3]));
            this.f45188kk = strM67399k4;
            if (i3 < this.f45187k4.length - 1) {
                this.f45188kk = C14113y2.m67399k4(strM67399k4, C7019kk.m27446k4(','));
            }
            i3++;
        }
    }

    /* JADX INFO: renamed from: c5 */
    public static C13609qq m62780c5() {
        return new C13609qq(new int[]{8, 8, 8}, 24, 2, "RGB24Bpp");
    }

    /* JADX INFO: renamed from: dy */
    public static C13609qq m62781dy() {
        return new C13609qq(new int[]{8, 8, 8, 8}, 32, 5, "YCCK");
    }

    /* JADX INFO: renamed from: h4 */
    public static C13609qq m62782h4() {
        return new C13609qq(new int[]{8, 8, 8}, 24, 3, "YCbCr");
    }

    /* JADX INFO: renamed from: k4 */
    public static C13609qq m62783k4() {
        return new C13609qq(new int[]{8, 8, 8, 8}, 32, 4, "CMYK");
    }

    /* JADX INFO: renamed from: m9 */
    public static C13609qq m62784m9() {
        return new C13609qq(new int[]{8}, 8, 0, "Grayscale");
    }

    /* JADX INFO: renamed from: x1 */
    public static C13609qq m62785x1() {
        return new C13609qq(new int[]{8, 8, 8}, 24, 1, "Rgb24Bpp");
    }

    /* JADX INFO: renamed from: du */
    public int m62786du() {
        return this.f45187k4.length;
    }

    public boolean equals(Object obj) {
        if (C7019kk.m27469x1(obj, C13609qq.class)) {
            return C14113y2.m67363du(((C13609qq) obj).f45188kk, this.f45188kk);
        }
        return false;
    }

    public int hashCode() {
        return this.f45188kk.hashCode();
    }

    /* JADX INFO: renamed from: kk */
    public int m62787kk() {
        return this.f45189to;
    }

    /* JADX INFO: renamed from: to */
    public int m62788to() {
        return this.f45190x1;
    }

    public String toString() {
        return this.f45188kk;
    }
}

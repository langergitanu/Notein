package com.aspose.slides.internal.p022ai;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ai.jd */
/* JADX INFO: loaded from: classes3.dex */
public class C1376jd extends AbstractC1370c5 {

    /* JADX INFO: renamed from: h4 */
    private static final C1376jd[] f5967h4;

    /* JADX INFO: renamed from: k4 */
    public static final C1376jd f5968k4;

    /* JADX INFO: renamed from: kk */
    public static final C1376jd f5969kk;

    /* JADX INFO: renamed from: x1 */
    public static final C1376jd f5971x1;

    /* JADX INFO: renamed from: to */
    private static final String[] f5970to = {"normal", "embed", "bidi-override"};

    /* JADX INFO: renamed from: du */
    private static final int[] f5966du = {97, 38, 15};

    static {
        C1376jd c1376jd = new C1376jd(0);
        f5968k4 = c1376jd;
        C1376jd c1376jd2 = new C1376jd(1);
        f5971x1 = c1376jd2;
        C1376jd c1376jd3 = new C1376jd(2);
        f5969kk = c1376jd3;
        f5967h4 = new C1376jd[]{c1376jd, c1376jd2, c1376jd3};
    }

    private C1376jd(int i) {
        super(f5970to[i], f5966du[i]);
    }

    /* JADX INFO: renamed from: k4 */
    public static C1376jd m8166k4(int i) {
        int i2 = 0;
        while (true) {
            C1376jd[] c1376jdArr = f5967h4;
            if (i2 >= c1376jdArr.length) {
                throw new ArgumentException(C14113y2.m67408k4("Illegal unicode-bidi: ", C14057f9.m66591x1(i)));
            }
            if (c1376jdArr[i2].m8127x1() == i) {
                return c1376jdArr[i2];
            }
            i2++;
        }
    }

    public String toString() {
        return m8126k4();
    }
}

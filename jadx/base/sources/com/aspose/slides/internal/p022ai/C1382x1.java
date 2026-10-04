package com.aspose.slides.internal.p022ai;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ai.x1 */
/* JADX INFO: loaded from: classes3.dex */
public class C1382x1 extends AbstractC1370c5 {

    /* JADX INFO: renamed from: c5 */
    public static final C1382x1 f5994c5;

    /* JADX INFO: renamed from: du */
    public static final C1382x1 f5996du;

    /* JADX INFO: renamed from: dy */
    public static final C1382x1 f5997dy;

    /* JADX INFO: renamed from: h4 */
    public static final C1382x1 f5999h4;

    /* JADX INFO: renamed from: jd */
    public static final C1382x1 f6000jd;

    /* JADX INFO: renamed from: k4 */
    public static final C1382x1 f6001k4;

    /* JADX INFO: renamed from: kk */
    public static final C1382x1 f6002kk;

    /* JADX INFO: renamed from: m9 */
    public static final C1382x1 f6003m9;

    /* JADX INFO: renamed from: to */
    public static final C1382x1 f6004to;

    /* JADX INFO: renamed from: up */
    private static final C1382x1[] f6005up;

    /* JADX INFO: renamed from: x1 */
    public static final C1382x1 f6006x1;

    /* JADX INFO: renamed from: ck */
    private static final String[] f5995ck = {"none", "hidden", "dotted", "dashed", "solid", "double", "groove", "ridge", "inset", "outset"};

    /* JADX INFO: renamed from: fa */
    private static final int[] f5998fa = {95, 57, 36, 31, 133, 37, 55, 119, 67, 101};

    static {
        C1382x1 c1382x1 = new C1382x1(0);
        f6001k4 = c1382x1;
        C1382x1 c1382x12 = new C1382x1(1);
        f6006x1 = c1382x12;
        C1382x1 c1382x13 = new C1382x1(2);
        f6002kk = c1382x13;
        C1382x1 c1382x14 = new C1382x1(3);
        f6004to = c1382x14;
        C1382x1 c1382x15 = new C1382x1(4);
        f5996du = c1382x15;
        C1382x1 c1382x16 = new C1382x1(5);
        f5999h4 = c1382x16;
        C1382x1 c1382x17 = new C1382x1(6);
        f6003m9 = c1382x17;
        C1382x1 c1382x18 = new C1382x1(7);
        f5997dy = c1382x18;
        C1382x1 c1382x19 = new C1382x1(8);
        f5994c5 = c1382x19;
        C1382x1 c1382x110 = new C1382x1(9);
        f6000jd = c1382x110;
        f6005up = new C1382x1[]{c1382x1, c1382x12, c1382x13, c1382x14, c1382x15, c1382x16, c1382x17, c1382x18, c1382x19, c1382x110};
    }

    private C1382x1(int i) {
        super(f5995ck[i], f5998fa[i]);
    }

    /* JADX INFO: renamed from: k4 */
    public static C1382x1 m8176k4(int i) {
        int i2 = 0;
        while (true) {
            C1382x1[] c1382x1Arr = f6005up;
            if (i2 >= c1382x1Arr.length) {
                throw new ArgumentException(C14113y2.m67408k4("Illegal border style: ", C14057f9.m66591x1(i)));
            }
            if (c1382x1Arr[i2].m8127x1() == i) {
                return c1382x1Arr[i2];
            }
            i2++;
        }
    }

    public String toString() {
        return C14113y2.m67408k4("BorderStyle:", m8126k4());
    }
}

package com.aspose.slides.internal.p271mc;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p033b2.C1573k4;

/* JADX INFO: renamed from: com.aspose.slides.internal.mc.dy */
/* JADX INFO: loaded from: classes4.dex */
public class C6362dy {
    /* JADX INFO: renamed from: k4 */
    public static int m26130k4(int i) {
        if (i != 1) {
            return i != 2 ? 0 : 1;
        }
        return 2;
    }

    /* JADX INFO: renamed from: x1 */
    public static int m26133x1(int i) {
        if (i != 1) {
            return i != 2 ? 0 : 1;
        }
        return 2;
    }

    /* JADX INFO: renamed from: k4 */
    public static int m26131k4(float[] fArr) {
        return (fArr == null || fArr.length == 0) ? 0 : 1;
    }

    /* JADX INFO: renamed from: k4 */
    public static float[] m26132k4(C1573k4 c1573k4, float f) {
        if (c1573k4 == null) {
            return new float[0];
        }
        List<Integer> listM8463x1 = c1573k4.m8463x1();
        float[] fArr = new float[listM8463x1.size()];
        for (int i = 0; i < listM8463x1.size(); i++) {
            fArr[i] = listM8463x1.get_Item(i).intValue() / f;
        }
        return fArr;
    }
}

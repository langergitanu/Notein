package com.aspose.slides.internal.p380ri;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ri.k4 */
/* JADX INFO: loaded from: classes4.dex */
public class C10014k4 {
    /* JADX INFO: renamed from: k4 */
    private static int m49147k4(int i) {
        if (i == 9) {
            return 0;
        }
        if (i == 28) {
            return 1;
        }
        if (i == 44 || i == 100) {
            return 3;
        }
        if (i == 104) {
            return 2;
        }
        throw new ArgumentException(C14113y2.m67408k4("Illegal value for breakClass: ", C14057f9.m66591x1(i)));
    }

    /* JADX INFO: renamed from: k4 */
    public static int m49148k4(int i, int i2) {
        return m49147k4(i) < m49147k4(i2) ? i2 : i;
    }
}

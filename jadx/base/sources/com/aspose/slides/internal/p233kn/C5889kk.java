package com.aspose.slides.internal.p233kn;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

/* JADX INFO: renamed from: com.aspose.slides.internal.kn.kk */
/* JADX INFO: loaded from: classes.dex */
public class C5889kk {
    /* JADX INFO: renamed from: k4 */
    public static int m23723k4(int i) {
        if (i <= 0) {
            throw new ArgumentOutOfRangeException("power2");
        }
        int i2 = 0;
        while (i != 1) {
            i >>= 1;
            i2++;
        }
        return i2;
    }
}

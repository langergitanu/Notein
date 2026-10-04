package com.aspose.slides;

import com.aspose.slides.exceptions.NotSupportedException;

/* JADX INFO: renamed from: com.aspose.slides.sk */
/* JADX INFO: loaded from: classes3.dex */
class C14459sk {
    /* JADX INFO: renamed from: k4 */
    public static int m70653k4(int i) {
        return (i == 0 || i == 1 || i != 2) ? 0 : 1;
    }

    /* JADX INFO: renamed from: x1 */
    public static int m70654x1(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        throw new NotSupportedException();
    }
}

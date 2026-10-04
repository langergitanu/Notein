package com.aspose.slides.internal.p036b6;

import com.aspose.slides.exceptions.Exception;

/* JADX INFO: renamed from: com.aspose.slides.internal.b6.qq */
/* JADX INFO: loaded from: classes3.dex */
public class C1642qq {
    /* JADX INFO: renamed from: k4 */
    public static long m8902k4(int i) {
        switch (i) {
            case 0:
            case 1:
            case 10:
                return 1L;
            case 2:
            case 3:
                return 2L;
            case 4:
            case 5:
            case 6:
                return 4L;
            case 7:
            case 8:
            default:
                throw new Exception("Unknown DataType.");
            case 9:
                return 8L;
            case 11:
            case 12:
                throw new Exception("Can't determine DataType size.");
            case 13:
                return 3L;
        }
    }
}

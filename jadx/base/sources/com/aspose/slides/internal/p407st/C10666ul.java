package com.aspose.slides.internal.p407st;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.ul */
/* JADX INFO: loaded from: classes4.dex */
public class C10666ul {
    /* JADX INFO: renamed from: k4 */
    public static int m51805k4(int i, int i2) {
        switch (i) {
            case 0:
                return 4;
            case 1:
            case 13:
                return 0;
            case 2:
            case 14:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
                if (i2 == 0) {
                    return 1;
                }
                if (i2 == 1) {
                    return 7;
                }
                if (i2 == 2) {
                    return 8;
                }
                throw new ArgumentOutOfRangeException("size");
            case 3:
            case 15:
                return 6;
            case 4:
            case 16:
                return 5;
            case 5:
            case 10:
            case 17:
            case 25:
            case 26:
                return 4;
            case 6:
            case 11:
            case 12:
                return 2;
            case 7:
            case 8:
            case 9:
                return 4;
            default:
                throw new ArgumentOutOfRangeException("placeholderType");
        }
    }
}

package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentException;

/* JADX INFO: loaded from: classes3.dex */
class agh {
    /* JADX INFO: renamed from: k4 */
    public static <T> void m3573k4(T t, String str) {
        if (t == null) {
            throw new ArgumentException("Value cannot be null.", str);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m3574k4(String str, String str2) {
        m3573k4(str, str2);
        if (str.length() == 0) {
            throw new ArgumentException("Value cannot be empty.", str2);
        }
    }
}

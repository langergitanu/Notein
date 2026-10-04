package com.aspose.slides.p559ms.System;

import com.aspose.slides.exceptions.ArgumentNullException;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.zj */
/* JADX INFO: loaded from: classes5.dex */
public class C14120zj {

    /* JADX INFO: renamed from: k4 */
    static final /* synthetic */ boolean f47387k4 = true;

    /* JADX INFO: renamed from: k4 */
    private static int m67571k4(String str, int i, int i2) {
        if (str.charAt(0) == '-') {
            i2++;
        }
        while (i2 < str.length() && Character.digit(str.charAt(i2), i) != -1) {
            i2++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: k4 */
    public static long m67572k4(String str, int i, int i2, int[] iArr) {
        if (str == null) {
            throw new ArgumentNullException("s");
        }
        int i3 = iArr[0];
        int iM67571k4 = i2 == 8192 ? m67571k4(str, i, i3) : str.length();
        String strSubstring = str.substring(i3, iM67571k4);
        iArr[0] = iM67571k4;
        return Long.parseLong(strSubstring, i);
    }
}

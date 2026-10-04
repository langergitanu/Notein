package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3068ks;
import com.microsoft.identity.common.java.providers.oauth2.IDToken;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.x3 */
/* JADX INFO: loaded from: classes4.dex */
public class C9166x3 {

    /* JADX INFO: renamed from: k4 */
    static final C3068ks f32694k4 = new C3068ks("circle", "dash", "diamond", "dot", "none", IDToken.PICTURE, "plus", "square", "star", "triangle", "x");

    /* JADX INFO: renamed from: k4 */
    public static int m44180k4(String str) {
        if ("auto".equals(str)) {
            return -1;
        }
        return f32694k4.m12963k4(str);
    }

    /* JADX INFO: renamed from: k4 */
    public static String m44181k4(int i) {
        return f32694k4.m12964k4(i);
    }
}

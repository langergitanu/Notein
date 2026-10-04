package com.aspose.slides.internal.p475wh;

import com.aspose.slides.internal.p314oc.C7017h4;

/* JADX INFO: renamed from: com.aspose.slides.internal.wh.h4 */
/* JADX INFO: loaded from: classes5.dex */
public class C12006h4 {

    /* JADX INFO: renamed from: k4 */
    private static final C7017h4 f40518k4 = new C7017h4("buttonface", "threedface", "buttonhighlight", "threedlightshadow", "buttonshadow", "captiontext", "threeddarkshadow", "threedhighlight", "background", "buttontext", "infobackground", "lightgrey");

    /* JADX INFO: renamed from: k4 */
    public static C12003du m56537k4(int i) {
        C12003du c12003duClone = C12003du.m56398k4(255, i & 255, (i >> 8) & 255, (i >> 16) & 255).Clone();
        C12003du c12003duClone2 = C12020up.m56830k4(c12003duClone.Clone()).Clone();
        return c12003duClone2.m56504dy() ? c12003duClone : c12003duClone2;
    }

    /* JADX INFO: renamed from: x1 */
    public static C12003du m56538x1(int i) {
        return m56537k4(i);
    }
}

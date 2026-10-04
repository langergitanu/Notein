package com.aspose.slides;

import com.aspose.slides.internal.p475wh.C12009k4;

/* JADX INFO: loaded from: classes3.dex */
class ysu {
    /* JADX INFO: renamed from: k4 */
    public static C12009k4 m74078k4(C0755am c0755am, byte b) {
        C0755am c0755amM3670k4 = C0755am.m3670k4(c0755am.m3671du().Clone(), 196865);
        for (int i = 0; i < c0755amM3670k4.m3674k4(); i++) {
            for (int i2 = 0; i2 < c0755amM3670k4.m3678x1(); i2++) {
                c0755amM3670k4.m3675k4(i, i2, (c0755am.m3673k4(i, i2) & 255) > (b & 255) ? (byte) -1 : (byte) 0);
            }
        }
        return c0755amM3670k4.m3672h4();
    }

    /* JADX INFO: renamed from: k4 */
    public static C12009k4 m74079k4(C12009k4 c12009k4, byte b) {
        return m74078k4(C0755am.m3669k4(c12009k4), b);
    }
}

package com.aspose.slides;

import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
class bls {
    /* JADX INFO: renamed from: k4 */
    public static IPPImage m4260k4(IPictureFillFormat iPictureFillFormat) {
        if (iPictureFillFormat == null || iPictureFillFormat.getPicture() == null) {
            return null;
        }
        return iPictureFillFormat.getPicture().getImage();
    }

    /* JADX INFO: renamed from: k4 */
    public static String m4261k4(IPPImage iPPImage, InterfaceC14374r4 interfaceC14374r4, ls9 ls9Var) {
        return m4265k4(interfaceC14374r4, ls9Var, interfaceC14374r4.mo64147k4(iPPImage), (String) null);
    }

    /* JADX INFO: renamed from: k4 */
    public static String m4262k4(IPPImage iPPImage, InterfaceC14374r4 interfaceC14374r4, ls9 ls9Var, String str) {
        return m4265k4(interfaceC14374r4, ls9Var, interfaceC14374r4.mo64147k4(iPPImage), str);
    }

    /* JADX INFO: renamed from: k4 */
    public static String m4263k4(IShape iShape, InterfaceC14374r4 interfaceC14374r4, ls9 ls9Var) {
        return m4265k4(interfaceC14374r4, ls9Var, interfaceC14374r4.mo64148k4(iShape), iShape.getAlternativeText());
    }

    /* JADX INFO: renamed from: k4 */
    public static String m4264k4(InterfaceC14374r4 interfaceC14374r4, ls9 ls9Var, String str) {
        return m4265k4(interfaceC14374r4, ls9Var, str, (String) null);
    }

    /* JADX INFO: renamed from: k4 */
    public static String m4265k4(InterfaceC14374r4 interfaceC14374r4, ls9 ls9Var, String str, String str2) {
        if (C14113y2.m67411k4(str2)) {
            str2 = "Image";
        }
        return ls9Var.m64564k4(str2, C14113y2.m67408k4(interfaceC14374r4.mo64146k4(), str));
    }
}

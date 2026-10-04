package com.aspose.slides.internal.p144g6;

import com.aspose.slides.internal.p085dk.C3175k4;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p505xn.C12566m9;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: renamed from: com.aspose.slides.internal.g6.x6 */
/* JADX INFO: loaded from: classes.dex */
public class C4224x6 {
    /* JADX INFO: renamed from: k4 */
    public static void m17010k4(C3175k4 c3175k4) {
        m17017x1(c3175k4);
        c3175k4.m13592x1();
    }

    /* JADX INFO: renamed from: kk */
    private static void m17016kk(C3175k4 c3175k4, String str) {
        c3175k4.m13593x1("psf:ScoredProperty");
        c3175k4.m13590kk("name", str);
    }

    /* JADX INFO: renamed from: x1 */
    private static void m17017x1(C3175k4 c3175k4) {
        c3175k4.m13584k4("psf:PrintTicket");
        c3175k4.m13590kk("version", "1");
        c3175k4.m13590kk("xmlns:psf", "http://schemas.microsoft.com/windows/2003/08/printing/printschemaframework");
        c3175k4.m13590kk("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
        c3175k4.m13590kk("xmlns:xsd", "http://www.w3.org/2001/XMLSchema");
        c3175k4.m13590kk("xmlns:ns0000", "http://schemas.microsoft.com/windows/2006/06/printing/printschemakeywords/microsoftxpsdocumentwriter");
        c3175k4.m13590kk("xmlns:psk", "http://schemas.microsoft.com/windows/2003/08/printing/printschemakeywords");
    }

    /* JADX INFO: renamed from: k4 */
    private static void m17011k4(C3175k4 c3175k4, C12015qq c12015qq) {
        boolean z = c12015qq.m56699x1() > c12015qq.m56697kk();
        int iM58653to = C12566m9.m58653to(z ? c12015qq.m56697kk() : c12015qq.m56699x1());
        int iM58653to2 = C12566m9.m58653to(z ? c12015qq.m56699x1() : c12015qq.m56697kk());
        m17013k4(c3175k4, "psk:PageMediaSize");
        m17018x1(c3175k4, C4220rv.m16982k4(c12015qq.Clone()));
        m17016kk(c3175k4, "psk:MediaSizeWidth");
        m17014k4(c3175k4, "xsd:integer", C13850af.m65103k4(iM58653to));
        c3175k4.m13588kk();
        m17016kk(c3175k4, "psk:MediaSizeHeight");
        m17014k4(c3175k4, "xsd:integer", C13850af.m65103k4(iM58653to2));
        c3175k4.m13588kk();
        c3175k4.m13588kk();
        c3175k4.m13588kk();
        m17013k4(c3175k4, "psk:PageOrientation");
        m17018x1(c3175k4, z ? "psk:Landscape" : "psk:Portrait");
        c3175k4.m13588kk();
        c3175k4.m13588kk();
    }

    /* JADX INFO: renamed from: x1 */
    private static void m17018x1(C3175k4 c3175k4, String str) {
        c3175k4.m13593x1("psf:Option");
        c3175k4.m13590kk("name", str);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m17012k4(C3175k4 c3175k4, C12015qq c12015qq, boolean z) {
        m17017x1(c3175k4);
        m17011k4(c3175k4, c12015qq.Clone());
        m17015k4(c3175k4, z);
        c3175k4.m13592x1();
    }

    /* JADX INFO: renamed from: k4 */
    private static void m17013k4(C3175k4 c3175k4, String str) {
        c3175k4.m13593x1("psf:Feature");
        c3175k4.m13590kk("name", str);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m17014k4(C3175k4 c3175k4, String str, String str2) {
        c3175k4.m13593x1("psf:Value");
        c3175k4.m13590kk("xsi:type", str);
        c3175k4.m13591to(str2);
        c3175k4.m13588kk();
    }

    /* JADX INFO: renamed from: k4 */
    private static void m17015k4(C3175k4 c3175k4, boolean z) {
        m17013k4(c3175k4, z ? "psk:PageInputBin" : "psk:JobInputBin");
        m17018x1(c3175k4, "psk:AutoSelect");
        c3175k4.m13588kk();
        c3175k4.m13588kk();
    }
}

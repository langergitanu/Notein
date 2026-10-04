package com.aspose.slides.internal.p508xq;

import com.aspose.slides.internal.p085dk.C3175k4;
import com.aspose.slides.internal.p346pw.C9574to;
import com.aspose.slides.p559ms.System.C14084qq;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.xq.x1 */
/* JADX INFO: loaded from: classes5.dex */
public class C12602x1 {
    /* JADX INFO: renamed from: k4 */
    private static void m58816k4(C3175k4 c3175k4, String str, C14084qq c14084qq) {
        if (c14084qq.m67158yj() > 1) {
            c3175k4.m13593x1(C14113y2.m67408k4("dcterms:", str));
            c3175k4.m13590kk("xsi:type", "dcterms:W3CDTF");
            c3175k4.m13591to(C9574to.m46743k4(c14084qq.Clone()));
            c3175k4.m13588kk();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m58817k4(C3175k4 c3175k4, String str, String str2, String str3, String str4, String str5, String str6, String str7, C14084qq c14084qq, C14084qq c14084qq2, C14084qq c14084qq3, String str8) {
        c3175k4.m13584k4("cp:coreProperties");
        c3175k4.m13590kk("xmlns:cp", "http://schemas.openxmlformats.org/package/2006/metadata/core-properties");
        c3175k4.m13590kk("xmlns:dc", "http://purl.org/dc/elements/1.1/");
        c3175k4.m13590kk("xmlns:dcterms", "http://purl.org/dc/terms/");
        c3175k4.m13590kk("xmlns:dcmitype", "http://purl.org/dc/dcmitype/");
        c3175k4.m13590kk("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
        c3175k4.m13594x1("dc:title", str);
        c3175k4.m13594x1("dc:subject", str2);
        c3175k4.m13594x1("dc:creator", str3);
        c3175k4.m13594x1("cp:keywords", str4);
        c3175k4.m13594x1("dc:description", str5);
        c3175k4.m13594x1("cp:lastModifiedBy", str6);
        c3175k4.m13586k4("cp:revision", str7);
        c3175k4.m13585k4("cp:lastPrinted", c14084qq.Clone());
        m58816k4(c3175k4, "created", c14084qq2.Clone());
        m58816k4(c3175k4, "modified", c14084qq3.Clone());
        c3175k4.m13594x1("cp:category", str8);
        c3175k4.m13592x1();
    }
}

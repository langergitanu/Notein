package com.aspose.slides;

/* JADX INFO: renamed from: com.aspose.slides.OoooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C22233OoooOOo {
    public static IPortionCollection OooO00o(Portion portion, String str, boolean z, String str2, Paragraph paragraph) {
        portion.getPortionFormat().setLanguageId(str);
        portion.getPortionFormat().setSmartTagClean(z);
        portion.m2289k4(str2);
        return paragraph.getPortions();
    }
}

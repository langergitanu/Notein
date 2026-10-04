package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12001c5;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.mf */
/* JADX INFO: loaded from: classes3.dex */
class C13834mf {
    /* JADX INFO: renamed from: k4 */
    public static String m64868k4(IFontData iFontData, int i) {
        String fontName = iFontData.getFontName();
        return i == 0 ? C14113y2.m67402k4("fonts/{0}.ttf", fontName) : C14113y2.m67402k4("fonts/{0} {1}.ttf", fontName, C14042ak.m66410k4(C12001c5.class, i));
    }

    /* JADX INFO: renamed from: k4 */
    public static <T> String m64869k4(IPortionFormatEffectiveData iPortionFormatEffectiveData, TemplateContext<T> templateContext) {
        TemplateContext templateContext2 = (TemplateContext) C7019kk.m27452k4((Object) templateContext, TemplateContext.class);
        return ((templateContext2 == null || !"he-IL".equals(((Portion) templateContext2.getObject()).getPortionFormat().getLanguageId())) ? iPortionFormatEffectiveData.getLatinFont() : iPortionFormatEffectiveData.getComplexScriptFont()).toString();
    }
}

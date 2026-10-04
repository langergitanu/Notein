package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;

/* JADX INFO: loaded from: classes3.dex */
class n7b {
    /* JADX INFO: renamed from: k4 */
    public static void m67878k4(IPatternFormatEffectiveData iPatternFormatEffectiveData, jlf jlfVar, OdpSerializationContext odpSerializationContext) {
        if (iPatternFormatEffectiveData == null) {
            throw new ArgumentNullException("patternFormat");
        }
        if (jlfVar == null) {
            throw new ArgumentNullException("fillFormatContext");
        }
        jlfVar.m63422k4(2);
        n9i n9iVar = (n9i) iPatternFormatEffectiveData;
        odpSerializationContext.m2060k4(jlfVar, (PPImage) ((ImageCollection) odpSerializationContext.m2051k4().getImages()).m1724k4(n9i.m67899k4((n9iVar.m67905kk().m56501c5() & 255) < 255 || (n9iVar.m67907x1().m56501c5() & 255) < 255 ? 2498570 : 137224, iPatternFormatEffectiveData.getPatternStyle(), n9iVar.m67905kk().Clone(), n9iVar.m67907x1().Clone())));
    }
}

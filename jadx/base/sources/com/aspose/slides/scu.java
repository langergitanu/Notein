package com.aspose.slides;

import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
class scu {
    /* JADX INFO: renamed from: k4 */
    public static boolean m70501k4(IPortionFormat iPortionFormat, IPortionFormat iPortionFormat2) {
        if (C14067j2.m66729x1(iPortionFormat, iPortionFormat2)) {
            return true;
        }
        if (!((iPortionFormat == null) | (iPortionFormat2 == null)) && C14113y2.m67363du(iPortionFormat.getBookmarkId(), iPortionFormat2.getBookmarkId()) && iPortionFormat.getSmartTagClean() == iPortionFormat2.getSmartTagClean() && iPortionFormat.getFontBold() == iPortionFormat2.getFontBold() && iPortionFormat.getFontItalic() == iPortionFormat2.getFontItalic() && iPortionFormat.getKumimoji() == iPortionFormat2.getKumimoji() && iPortionFormat.getNormaliseHeight() == iPortionFormat2.getNormaliseHeight() && iPortionFormat.getProofDisabled() == iPortionFormat2.getProofDisabled() && iPortionFormat.getFontUnderline() == iPortionFormat2.getFontUnderline() && iPortionFormat.getTextCapType() == iPortionFormat2.getTextCapType() && iPortionFormat.getStrikethroughType() == iPortionFormat2.getStrikethroughType() && iPortionFormat.isHardUnderlineLine() == iPortionFormat2.isHardUnderlineLine() && iPortionFormat.isHardUnderlineFill() == iPortionFormat2.isHardUnderlineFill() && C3085sv.m13089k4(iPortionFormat.getFontHeight(), iPortionFormat2.getFontHeight()) && C3085sv.m13089k4(iPortionFormat.getEscapement(), iPortionFormat2.getEscapement()) && C3085sv.m13089k4(iPortionFormat.getKerningMinimalSize(), iPortionFormat2.getKerningMinimalSize()) && C14113y2.m67363du(iPortionFormat.getLanguageId(), iPortionFormat2.getLanguageId()) && C14113y2.m67363du(iPortionFormat.getAlternativeLanguageId(), iPortionFormat2.getAlternativeLanguageId()) && C3085sv.m13089k4(iPortionFormat.getSpacing(), iPortionFormat2.getSpacing()) && C14067j2.m66728k4(iPortionFormat.getLatinFont(), iPortionFormat2.getLatinFont()) && C14067j2.m66728k4(iPortionFormat.getEastAsianFont(), iPortionFormat2.getEastAsianFont()) && C14067j2.m66728k4(iPortionFormat.getComplexScriptFont(), iPortionFormat2.getComplexScriptFont()) && C14067j2.m66728k4(iPortionFormat.getSymbolFont(), iPortionFormat2.getSymbolFont())) {
            csi csiVar = csi.f4436k4;
            if (csiVar.equals(iPortionFormat.getLineFormat(), iPortionFormat2.getLineFormat())) {
                C1105fm c1105fm = C1105fm.f5063k4;
                if (c1105fm.equals(iPortionFormat.getFillFormat(), iPortionFormat2.getFillFormat()) && C1188h7.f5443k4.equals(iPortionFormat.getEffectFormat(), iPortionFormat2.getEffectFormat()) && C14767x7.f50002k4.equals(iPortionFormat.getHighlightColor(), iPortionFormat2.getHighlightColor()) && csiVar.equals(iPortionFormat.getUnderlineLineFormat(), iPortionFormat2.getUnderlineLineFormat()) && c1105fm.equals(iPortionFormat.getUnderlineFillFormat(), iPortionFormat2.getUnderlineFillFormat()) && C0978f6.f4967k4.equals(iPortionFormat, iPortionFormat2)) {
                    return true;
                }
            }
        }
        return false;
    }
}

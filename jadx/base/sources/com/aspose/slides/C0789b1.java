package com.aspose.slides;

import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.b1 */
/* JADX INFO: loaded from: classes3.dex */
class C0789b1 {
    /* JADX INFO: renamed from: k4 */
    public static String m3936k4(IAutoShape iAutoShape, C0950eh c0950eh) {
        IPPImage iPPImageM4260k4;
        if (iAutoShape.getTextFrame() != null && !C14113y2.m67411k4(iAutoShape.getTextFrame().getText())) {
            return ugr.m71685k4(iAutoShape.getTextFrame(), c0950eh.f4791x1, true, iAutoShape.getPlaceholder() != null ? iAutoShape.getPlaceholder().getType() : (byte) 1);
        }
        if (iAutoShape.getFillFormat() == null || iAutoShape.getFillFormat().getFillType() != 4 || c0950eh.f4790kk.getExportType() == 1 || (iPPImageM4260k4 = bls.m4260k4(iAutoShape.getFillFormat().getPictureFillFormat())) == null) {
            return null;
        }
        return bls.m4262k4(iPPImageM4260k4, c0950eh.f4789k4, c0950eh.f4791x1, iAutoShape.getAlternativeText());
    }
}

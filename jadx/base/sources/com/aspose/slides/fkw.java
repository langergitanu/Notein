package com.aspose.slides;

import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14114y9;

/* JADX INFO: loaded from: classes3.dex */
class fkw extends AbstractC14611u0<ISketchFormat, fkw> {

    /* JADX INFO: renamed from: k4 */
    public static final fkw f5054k4 = new fkw();

    @Override // com.aspose.slides.AbstractC14611u0
    /* JADX INFO: renamed from: k4, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public int mo4124k4(ISketchFormat iSketchFormat) {
        int iM66409k4 = (C14042ak.m66409k4(iSketchFormat.getSketchType()) - 324743029) * 486187739;
        SketchFormat sketchFormat = (SketchFormat) iSketchFormat;
        return C14042ak.m66409k4(sketchFormat.m2670du().m3308ck()) + ((C14114y9.m67453k4(sketchFormat.m2678to()) + iM66409k4) * 486187739);
    }

    @Override // com.aspose.slides.AbstractC14611u0
    /* JADX INFO: renamed from: k4, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public boolean mo4125k4(ISketchFormat iSketchFormat, ISketchFormat iSketchFormat2) {
        if (iSketchFormat.getSketchType() != iSketchFormat2.getSketchType()) {
            return false;
        }
        SketchFormat sketchFormat = (SketchFormat) iSketchFormat;
        SketchFormat sketchFormat2 = (SketchFormat) iSketchFormat2;
        return sketchFormat.m2678to() == sketchFormat2.m2678to() && sketchFormat.m2670du().m3308ck() == sketchFormat2.m2670du().m3308ck();
    }
}

package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.zq */
/* JADX INFO: loaded from: classes3.dex */
class C14909zq {
    /* JADX INFO: renamed from: k4 */
    public static void m74729k4(IFillFormatEffectiveData iFillFormatEffectiveData, jlf jlfVar, OdpSerializationContext odpSerializationContext) {
        if (iFillFormatEffectiveData == null) {
            throw new ArgumentNullException("fillParamSources");
        }
        if (jlfVar == null) {
            throw new ArgumentNullException("fillFormatContext");
        }
        m74730x1(iFillFormatEffectiveData, jlfVar, odpSerializationContext);
    }

    /* JADX INFO: renamed from: x1 */
    private static void m74730x1(IFillFormatEffectiveData iFillFormatEffectiveData, jlf jlfVar, OdpSerializationContext odpSerializationContext) {
        byte fillType = iFillFormatEffectiveData.getFillType();
        if (fillType == -1 || fillType == 0) {
            jlfVar.m63424kk(1);
            return;
        }
        if (fillType == 1) {
            jlfVar.m63424kk(2);
            C14176nc c14176nc = (C14176nc) iFillFormatEffectiveData;
            jlfVar.m63421h4(wgi.m72720k4(c14176nc.m67938m9().Clone()));
            if ((c14176nc.m67938m9().m56501c5() & 255) < 255) {
                jlfVar.m63426m9(wgi.m72718k4(OooO.OooO00o(((c14176nc.m67938m9().m56501c5() & 255) * 100) / 255.0f, 14)));
                return;
            }
            return;
        }
        if (fillType == 2) {
            jlfVar.m63424kk(4);
            C1222hs.m7285k4(iFillFormatEffectiveData.getGradientFormat(), jlfVar, odpSerializationContext);
            return;
        }
        if (fillType != 3) {
            if (fillType != 4) {
                return;
            }
            jlfVar.m63424kk(3);
            FillFormat fillFormatM4601W_ = ((C14176nc) iFillFormatEffectiveData).m4601W_();
            ssy.m70764k4(iFillFormatEffectiveData.getPictureFillFormat(), fillFormatM4601W_ != null ? (Shape) C7019kk.m27452k4((Object) fillFormatM4601W_.getParent_IPresentationComponent(), Shape.class) : null, jlfVar, odpSerializationContext);
            return;
        }
        if (iFillFormatEffectiveData.getPatternFormat().getPatternStyle() <= 0) {
            jlfVar.m63424kk(1);
        } else {
            jlfVar.m63424kk(3);
            n7b.m67878k4(iFillFormatEffectiveData.getPatternFormat(), jlfVar, odpSerializationContext);
        }
    }
}

package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;

/* JADX INFO: renamed from: com.aspose.slides.me */
/* JADX INFO: loaded from: classes3.dex */
class C13832me {
    /* JADX INFO: renamed from: k4 */
    public static void m64865k4(IEffectFormatEffectiveData iEffectFormatEffectiveData, com.aspose.slides.internal.p332p7.rsv rsvVar, OdpSerializationContext odpSerializationContext) {
        if (iEffectFormatEffectiveData == null) {
            throw new ArgumentNullException("effectParamSources");
        }
        if (rsvVar == null) {
            throw new ArgumentNullException("graphicProperties");
        }
        if (iEffectFormatEffectiveData.isNoEffects() || iEffectFormatEffectiveData.getOuterShadowEffect() == null) {
            return;
        }
        rsvVar.m40462du(1);
        IOuterShadowEffectiveData outerShadowEffect = iEffectFormatEffectiveData.getOuterShadowEffect();
        vmd vmdVar = (vmd) outerShadowEffect;
        rsvVar.m40469fa(wgi.m72720k4(vmdVar.m72367x1().Clone()));
        if ((vmdVar.m72367x1().m56501c5() & 255) < 255) {
            rsvVar.m40507up(wgi.m72718k4(OooO.OooO00o(((vmdVar.m72367x1().m56501c5() & 255) * 100) / 255.0f, 14)));
        }
        if (outerShadowEffect.getDirection() == 0.0f || outerShadowEffect.getDirection() == 360.0f) {
            rsvVar.m40477jd(wgi.m72717k4(outerShadowEffect.getDistance()));
            return;
        }
        if (outerShadowEffect.getDirection() > 44.0f && outerShadowEffect.getDirection() < 90.0f) {
            rsvVar.m40477jd(wgi.m72717k4(outerShadowEffect.getDistance()));
            rsvVar.m40458ck(wgi.m72717k4(outerShadowEffect.getDistance()));
            return;
        }
        if (outerShadowEffect.getDirection() == 90.0f) {
            rsvVar.m40477jd("0cm");
            rsvVar.m40458ck(wgi.m72717k4(outerShadowEffect.getDistance()));
            return;
        }
        if (outerShadowEffect.getDirection() > 90.0f && outerShadowEffect.getDirection() < 180.0f) {
            rsvVar.m40477jd(wgi.m72717k4(outerShadowEffect.getDistance() * (-1.0d)));
            rsvVar.m40458ck(wgi.m72717k4(outerShadowEffect.getDistance()));
            return;
        }
        if (outerShadowEffect.getDirection() == 180.0f) {
            rsvVar.m40477jd(wgi.m72717k4(outerShadowEffect.getDistance() * (-1.0d)));
            return;
        }
        if (outerShadowEffect.getDirection() > 180.0f && outerShadowEffect.getDirection() < 270.0f) {
            rsvVar.m40477jd(wgi.m72717k4(outerShadowEffect.getDistance() * (-1.0d)));
            rsvVar.m40458ck(wgi.m72717k4(outerShadowEffect.getDistance() * (-1.0d)));
        } else if (outerShadowEffect.getDirection() == 270.0f) {
            rsvVar.m40477jd("0cm");
            rsvVar.m40458ck(wgi.m72717k4(outerShadowEffect.getDistance() * (-1.0d)));
        } else {
            if (outerShadowEffect.getDirection() <= 270.0f || outerShadowEffect.getDirection() >= 360.0f) {
                return;
            }
            rsvVar.m40477jd(wgi.m72717k4(outerShadowEffect.getDistance()));
            rsvVar.m40458ck(wgi.m72717k4(outerShadowEffect.getDistance() * (-1.0d)));
        }
    }
}

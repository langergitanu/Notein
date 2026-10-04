package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.sm */
/* JADX INFO: loaded from: classes3.dex */
class C14461sm {
    /* JADX INFO: renamed from: k4 */
    public static void m70670k4(IEffectFormat iEffectFormat, com.aspose.slides.internal.p332p7.rsv rsvVar, wxb wxbVar) {
        int iM72737to;
        if (iEffectFormat == null) {
            throw new ArgumentNullException("effectFormat");
        }
        if (rsvVar == null) {
            throw new ArgumentNullException("graphicProperties");
        }
        int iM40486ks = rsvVar.m40486ks();
        if (iM40486ks != 1) {
            if (iM40486ks != 2) {
                return;
            }
            iEffectFormat.disableOuterShadowEffect();
            return;
        }
        iEffectFormat.enableOuterShadowEffect();
        IOuterShadow outerShadowEffect = iEffectFormat.getOuterShadowEffect();
        if (wgi.m72731kk(rsvVar.m40492ne())) {
            ((ColorFormat) outerShadowEffect.getShadowColor()).m1080k4(wgi.m72698ck(rsvVar.m40492ne()).Clone());
            if (wgi.m72731kk(rsvVar.m40474ix()) && (iM72737to = wgi.m72737to(rsvVar.m40474ix())) < 100 && iM72737to >= 0) {
                outerShadowEffect.getShadowColor().getColorTransform().add(5, iM72737to / 100.0f);
            }
        }
        outerShadowEffect.setDistance(3.0d);
        outerShadowEffect.setDirection(45.0f);
        outerShadowEffect.setRectangleAlign((byte) 0);
        if (wgi.m72731kk(rsvVar.m40496rv()) || wgi.m72731kk(rsvVar.m40521x6())) {
            double dM72708k4 = wgi.m72708k4(rsvVar.m40496rv(), 0.0d);
            double dM72708k42 = wgi.m72708k4(rsvVar.m40521x6(), 0.0d);
            if (dM72708k4 == 0.0d && dM72708k42 == 0.0d) {
                outerShadowEffect.setDistance(0.0d);
                outerShadowEffect.setDirection(0.0f);
                return;
            }
            if (dM72708k4 == 0.0d) {
                if (dM72708k42 != 0.0d) {
                    outerShadowEffect.setDistance(C14116yg.m67475k4(dM72708k42));
                    if (dM72708k42 > 0.0d) {
                        outerShadowEffect.setDirection(90.0f);
                        return;
                    } else {
                        outerShadowEffect.setDirection(270.0f);
                        return;
                    }
                }
                return;
            }
            outerShadowEffect.setDistance(C14116yg.m67475k4(dM72708k4));
            if (dM72708k42 > 0.0d) {
                outerShadowEffect.setDirection(dM72708k4 < 0.0d ? 135.0f : 45.0f);
            } else if (dM72708k42 == 0.0d) {
                outerShadowEffect.setDirection(dM72708k4 < 0.0d ? 180.0f : 0.0f);
            } else {
                outerShadowEffect.setDirection(dM72708k4 < 0.0d ? 225.0f : 315.0f);
            }
        }
    }
}

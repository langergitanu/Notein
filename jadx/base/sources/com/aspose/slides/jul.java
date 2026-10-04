package com.aspose.slides;

import com.aspose.slides.internal.p332p7.C7272au;
import com.aspose.slides.internal.p332p7.C8243m5;

/* JADX INFO: loaded from: classes3.dex */
class jul {
    /* JADX INFO: renamed from: k4 */
    public static void m63553k4(ILightRig iLightRig, C7272au c7272au) {
        if (c7272au == null) {
            return;
        }
        iLightRig.setDirection(c7272au.m28482kk());
        iLightRig.setLightType(c7272au.m28484x1());
        if (c7272au.m28483to() != null) {
            iLightRig.setRotation(c7272au.m28483to().m36587k4(), c7272au.m28483to().m36591x1(), c7272au.m28483to().m36589kk());
        }
    }

    /* JADX INFO: renamed from: x1 */
    public static void m63554x1(ILightRig iLightRig, C7272au c7272au) {
        if (iLightRig.getLightType() == -1) {
            return;
        }
        c7272au.m28485x1(iLightRig.getDirection() == -1 ? 1 : iLightRig.getDirection());
        c7272au.m28481k4(iLightRig.getLightType() == -1 ? 26 : iLightRig.getLightType());
        float[] rotation = iLightRig.getRotation();
        if (rotation != null) {
            if (rotation[0] == 0.0f && rotation[1] == 0.0f && rotation[2] == 0.0f) {
                return;
            }
            C8243m5 c8243m5M28480k4 = c7272au.m28480k4();
            c8243m5M28480k4.m36588k4(rotation[0]);
            c8243m5M28480k4.m36592x1(rotation[1]);
            c8243m5M28480k4.m36590kk(rotation[2]);
        }
    }
}

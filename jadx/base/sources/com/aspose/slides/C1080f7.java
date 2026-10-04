package com.aspose.slides;

import com.aspose.slides.internal.p407st.C10534m3;
import com.aspose.slides.internal.p407st.C10711xc;

/* JADX INFO: renamed from: com.aspose.slides.f7 */
/* JADX INFO: loaded from: classes3.dex */
class C1080f7 {
    /* JADX INFO: renamed from: k4 */
    public static void m6025k4(IBackdrop3DScene iBackdrop3DScene, C10534m3 c10534m3, C10711xc c10711xc) {
    }

    /* JADX INFO: renamed from: k4 */
    public static void m6026k4(IBackdrop3DScene iBackdrop3DScene, C10534m3 c10534m3, C10711xc c10711xc, y2n y2nVar) {
        iBackdrop3DScene.getAnchorPoint();
        float[] normalVector = iBackdrop3DScene.getNormalVector();
        float[] upVector = iBackdrop3DScene.getUpVector();
        if (normalVector[0] == 0.0f && normalVector[1] == 0.0f && normalVector[2] == 0.0f && upVector[0] == 0.0f && upVector[1] == 0.0f && upVector[2] == 0.0f) {
            return;
        }
        y2nVar.m73707k4("Serialization of the Backdrop3DScene is not imlemented yet.", 2);
    }
}

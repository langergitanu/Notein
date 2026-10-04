package com.aspose.slides;

import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p332p7.C9226xq;

/* JADX INFO: renamed from: com.aspose.slides.ly */
/* JADX INFO: loaded from: classes3.dex */
class C13814ly {
    /* JADX INFO: renamed from: k4 */
    public static void m64613k4(IBackdrop3DScene iBackdrop3DScene, AbstractC4685kk<C9226xq> abstractC4685kk) {
        float[] anchorPoint = iBackdrop3DScene.getAnchorPoint();
        float[] normalVector = iBackdrop3DScene.getNormalVector();
        float[] upVector = iBackdrop3DScene.getUpVector();
        if (normalVector[0] == 0.0f && normalVector[1] == 0.0f && normalVector[2] == 0.0f && upVector[0] == 0.0f && upVector[1] == 0.0f && upVector[2] == 0.0f) {
            return;
        }
        C9226xq c9226xqInvoke = abstractC4685kk.invoke();
        c9226xqInvoke.m44584k4().m44171k4(anchorPoint[0]);
        c9226xqInvoke.m44584k4().m44175x1(anchorPoint[1]);
        c9226xqInvoke.m44584k4().m44173kk(anchorPoint[2]);
        c9226xqInvoke.m44586x1().m38191k4(normalVector[0]);
        c9226xqInvoke.m44586x1().m38195x1(normalVector[1]);
        c9226xqInvoke.m44586x1().m38193kk(normalVector[2]);
        c9226xqInvoke.m44585kk().m38191k4(upVector[0]);
        c9226xqInvoke.m44585kk().m38195x1(upVector[1]);
        c9226xqInvoke.m44585kk().m38193kk(upVector[2]);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m64614k4(IBackdrop3DScene iBackdrop3DScene, C9226xq c9226xq) {
        if (c9226xq == null) {
            return;
        }
        iBackdrop3DScene.setAnchorPoint(new float[]{(float) c9226xq.m44584k4().m44170k4(), (float) c9226xq.m44584k4().m44174x1(), (float) c9226xq.m44584k4().m44172kk()});
        iBackdrop3DScene.setNormalVector(new float[]{(float) c9226xq.m44586x1().m38190k4(), (float) c9226xq.m44586x1().m38194x1(), (float) c9226xq.m44586x1().m38192kk()});
        iBackdrop3DScene.setUpVector(new float[]{(float) c9226xq.m44585kk().m38190k4(), (float) c9226xq.m44585kk().m38194x1(), (float) c9226xq.m44585kk().m38192kk()});
    }
}

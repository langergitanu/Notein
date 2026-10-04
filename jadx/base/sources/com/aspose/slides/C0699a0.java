package com.aspose.slides;

import com.aspose.slides.internal.p332p7.C7978j6;
import com.aspose.slides.internal.p332p7.C8243m5;
import com.aspose.slides.p559ms.System.C14064he;

/* JADX INFO: renamed from: com.aspose.slides.a0 */
/* JADX INFO: loaded from: classes3.dex */
class C0699a0 {
    /* JADX INFO: renamed from: k4 */
    public static void m3134k4(ICamera iCamera, C7978j6 c7978j6) {
        if (c7978j6 == null) {
            return;
        }
        iCamera.setCameraType(c7978j6.m34579x1());
        iCamera.setZoom(c7978j6.m34578to());
        iCamera.setFieldOfViewAngle(c7978j6.m34577kk());
        if (c7978j6.m34573du() != null) {
            iCamera.setRotation(c7978j6.m34573du().m36587k4(), c7978j6.m34573du().m36591x1(), c7978j6.m34573du().m36589kk());
        }
    }

    /* JADX INFO: renamed from: x1 */
    public static void m3135x1(ICamera iCamera, C7978j6 c7978j6) {
        if (iCamera.getCameraType() == -1) {
            return;
        }
        c7978j6.m34576k4(iCamera.getCameraType());
        if (!C14064he.m66715kk(iCamera.getZoom())) {
            c7978j6.m34580x1(iCamera.getZoom());
        }
        if (!C14064he.m66715kk(iCamera.getFieldOfViewAngle())) {
            c7978j6.m34575k4(iCamera.getFieldOfViewAngle());
        }
        float[] rotation = iCamera.getRotation();
        if (rotation != null) {
            C8243m5 c8243m5M34574k4 = c7978j6.m34574k4();
            c8243m5M34574k4.m36588k4(rotation[0]);
            c8243m5M34574k4.m36592x1(rotation[1]);
            c8243m5M34574k4.m36590kk(rotation[2]);
        }
    }
}

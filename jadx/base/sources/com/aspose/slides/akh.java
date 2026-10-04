package com.aspose.slides;

import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p332p7.C9199xh;

/* JADX INFO: loaded from: classes3.dex */
class akh {
    /* JADX INFO: renamed from: k4 */
    public static void m3655k4(IReflection iReflection, AbstractC4685kk<C9199xh> abstractC4685kk) {
        if (iReflection == null) {
            return;
        }
        C9199xh c9199xhInvoke = abstractC4685kk.invoke();
        c9199xhInvoke.m44386k4(iReflection.getBlurRadius());
        c9199xhInvoke.m44376du(iReflection.getDirection());
        c9199xhInvoke.m44397x1(iReflection.getDistance());
        c9199xhInvoke.m44385k4(iReflection.getRectangleAlign());
        c9199xhInvoke.m44387k4(iReflection.getStartReflectionOpacity());
        c9199xhInvoke.m44390kk(iReflection.getEndReflectionOpacity());
        c9199xhInvoke.m44398x1(iReflection.getStartPosAlpha());
        c9199xhInvoke.m44394to(iReflection.getEndPosAlpha());
        c9199xhInvoke.m44381h4(iReflection.getFadeDirection());
        c9199xhInvoke.m44373c5((float) iReflection.getSkewHorizontal());
        c9199xhInvoke.m44383jd((float) iReflection.getSkewVertical());
        c9199xhInvoke.m44388k4(iReflection.getRotateShadowWithShape());
        c9199xhInvoke.m44392m9((float) iReflection.getScaleHorizontal());
        c9199xhInvoke.m44378dy((float) iReflection.getScaleVertical());
    }

    /* JADX INFO: renamed from: k4 */
    public static void m3656k4(IReflection iReflection, C9199xh c9199xh) {
        if (c9199xh == null) {
            return;
        }
        iReflection.setBlurRadius(c9199xh.m44384k4());
        iReflection.setDirection(c9199xh.m44391m9());
        iReflection.setDistance(c9199xh.m44380h4());
        iReflection.setRectangleAlign(c9199xh.m44395up());
        iReflection.setStartReflectionOpacity(c9199xh.m44396x1());
        iReflection.setEndReflectionOpacity(c9199xh.m44393to());
        iReflection.setStartPosAlpha(c9199xh.m44389kk());
        iReflection.setEndPosAlpha(c9199xh.m44375du());
        iReflection.setFadeDirection(c9199xh.m44377dy());
        iReflection.setSkewHorizontal(c9199xh.m44374ck());
        iReflection.setSkewVertical(c9199xh.m44379fa());
        iReflection.setRotateShadowWithShape(c9199xh.m44399yj());
        iReflection.setScaleHorizontal(c9199xh.m44372c5());
        iReflection.setScaleVertical(c9199xh.m44382jd());
    }
}

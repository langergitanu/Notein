package com.aspose.slides;

import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: loaded from: classes3.dex */
class sza {
    /* JADX INFO: renamed from: k4 */
    public static float m70913k4(XamlOptions xamlOptions, C12015qq c12015qq, C12015qq c12015qq2, float f) {
        if (C14064he.m66715kk(f)) {
            throw new yii(C14113y2.m67402k4("In the '{0}' class was put a parameter '{1}' equal 'null'.", "ScaleHelper", "unscaledSize"));
        }
        float fM70914k4 = f * m70914k4(c12015qq.Clone(), c12015qq2.Clone());
        if (xamlOptions.m3092c5() == 0) {
            fM70914k4 /= 2.0f;
        }
        return (float) C14116yg.m67477k4(fM70914k4, 2);
    }

    /* JADX INFO: renamed from: k4 */
    public static float m70914k4(C12015qq c12015qq, C12015qq c12015qq2) {
        float fM56699x1;
        float fM56699x12;
        if (c12015qq.m56699x1() / c12015qq.m56697kk() > c12015qq2.m56699x1() / c12015qq2.m56697kk()) {
            fM56699x1 = c12015qq.m56697kk();
            fM56699x12 = c12015qq2.m56697kk();
        } else {
            fM56699x1 = c12015qq.m56699x1();
            fM56699x12 = c12015qq2.m56699x1();
        }
        float fM67477k4 = (float) C14116yg.m67477k4(fM56699x1 / fM56699x12, 2);
        if (fM67477k4 != 0.0f) {
            return fM67477k4;
        }
        return 1.0f;
    }
}

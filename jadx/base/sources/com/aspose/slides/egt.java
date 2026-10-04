package com.aspose.slides;

import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12014ne;

/* JADX INFO: loaded from: classes3.dex */
class egt {
    /* JADX INFO: renamed from: k4 */
    public static void m5522k4(C14365qy c14365qy, C12007ix c12007ix) {
        if (c14365qy.m69834fa().hasLegend() && C14164n2.m67859x1(c14365qy.m69834fa())) {
            c14365qy.m69826c5().m74380k4((Legend) c14365qy.m69834fa().getLegend(), c14365qy);
            C12014ne c12014neClone = C12014ne.m56661x1(c12007ix.Clone()).Clone();
            C12014ne[] c12014neArr = {c12014neClone};
            gfh.m6613k4(c12014neArr, c14365qy);
            c12014neArr[0].CloneTo(c12014neClone);
        }
    }
}

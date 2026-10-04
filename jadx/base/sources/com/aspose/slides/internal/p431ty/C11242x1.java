package com.aspose.slides.internal.p431ty;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.ty.x1 */
/* JADX INFO: loaded from: classes4.dex */
public class C11242x1 {
    /* JADX INFO: renamed from: k4 */
    public static float m54226k4(C12025x6 c12025x6, C12025x6 c12025x62) {
        return (float) C14116yg.m67496rv(((c12025x62.m56895kk() - c12025x6.m56895kk()) * (c12025x62.m56895kk() - c12025x6.m56895kk())) + ((c12025x62.m56897x1() - c12025x6.m56897x1()) * (c12025x62.m56897x1() - c12025x6.m56897x1())));
    }

    /* JADX INFO: renamed from: x1 */
    public static float m54229x1(C12025x6 c12025x6, C12025x6 c12025x62) {
        return (float) C14116yg.m67498to(c12025x62.m56895kk() - c12025x6.m56895kk(), c12025x62.m56897x1() - c12025x6.m56897x1());
    }

    /* JADX INFO: renamed from: k4 */
    public static List<Long> m54227k4(C12025x6[] c12025x6Arr, C12007ix c12007ix, C11913yj c11913yj) {
        List<Long> list = new List<>();
        c11913yj.m55775k4(c12025x6Arr);
        for (int i = 0; i < c12025x6Arr.length; i++) {
            C12025x6 c12025x6 = c12025x6Arr[i];
            c12025x6.m56891k4(c12025x6.m56897x1() - c12007ix.m56557jd());
            C12025x6 c12025x62 = c12025x6Arr[i];
            c12025x62.m56898x1(c12025x62.m56895kk() - c12007ix.m56551ck());
            list.addItem(Long.valueOf(C7019kk.m27438h4(Float.valueOf(c12025x6Arr[i].m56897x1() * 12700.0f), 13)));
            list.addItem(Long.valueOf(C7019kk.m27438h4(Float.valueOf(c12025x6Arr[i].m56895kk() * 12700.0f), 13)));
        }
        return list;
    }

    /* JADX INFO: renamed from: k4 */
    public static C12015qq m54228k4(C12025x6 c12025x6, C12025x6 c12025x62, float f) {
        double d = f;
        double dM54229x1 = ((double) m54229x1(c12025x6.Clone(), c12025x62.Clone())) + 1.5707963267948966d;
        return new C12015qq((float) (C14116yg.m67470dy(dM54229x1) * d), (float) (C14116yg.m67495m9(dM54229x1) * d));
    }
}

package com.aspose.slides.internal.p460vf;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.internal.p052c0.C1937to;
import com.aspose.slides.internal.p151gj.C4317dy;
import com.aspose.slides.internal.p302nm.C6921dy;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p420th.C10951c5;
import com.aspose.slides.internal.p420th.C10970u4;
import com.aspose.slides.internal.p420th.C10971um;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12025x6;

/* JADX INFO: renamed from: com.aspose.slides.internal.vf.x1 */
/* JADX INFO: loaded from: classes4.dex */
public class C11641x1 {

    /* JADX INFO: renamed from: k4 */
    private final Dictionary<Integer, C10951c5> f39227k4 = new Dictionary<>();

    /* JADX INFO: renamed from: k4 */
    public final C10951c5 m54763k4(C10970u4 c10970u4, C11639kk c11639kk, C12015qq c12015qq, C12007ix c12007ix, C12007ix c12007ix2, C10951c5[] c10951c5Arr) {
        int iM27124k4 = C6921dy.m27124k4(c10970u4.m53082to(), null);
        if (!this.f39227k4.tryGetValue(Integer.valueOf(iM27124k4), c10951c5Arr)) {
            C1937to c1937to = new C1937to(c10970u4.m53082to());
            if (c1937to.m9995to()) {
                c11639kk.m54742k4(c10970u4.m53083x1().Clone());
            }
            c10951c5Arr[0] = C11638k4.m54724k4(c1937to, c12015qq.Clone(), c12007ix.Clone(), c11639kk, c12007ix2.Clone());
            this.f39227k4.set_Item(Integer.valueOf(iM27124k4), c10951c5Arr[0]);
        }
        C10951c5 c10951c5 = new C10951c5();
        c10951c5.m52930k4(c10951c5Arr[0]);
        C10951c5 c10951c52 = (C10951c5) C7019kk.m27452k4((Object) c10970u4.m53116um(), C10951c5.class);
        if (c10951c52 != null) {
            c10951c52.m52932x1(c10970u4);
            c10951c52.m52930k4(c10951c5);
        }
        C12007ix c12007ix3 = new C12007ix(0.0f, 0.0f, c12015qq.m56699x1(), c12015qq.m56697kk());
        if (!C6921dy.m27126k4(c10970u4.m53069h4())) {
            c10970u4.m53069h4().m27128k4(c12007ix3.Clone()).CloneTo(c12007ix3);
            c10951c5.m52907k4(C10971um.m53087k4(c12007ix3.Clone()));
        }
        c10951c5.m52904k4(new C4317dy());
        c10951c5.mo52909to().m17349x1(c10970u4.m53072k4().m56897x1(), c10970u4.m53072k4().m56895kk(), 0);
        c10951c5.mo52909to().m17336k4(c10970u4.m53083x1().m56699x1() / c12007ix3.m56550c5(), c10970u4.m53083x1().m56697kk() / c12007ix3.m56575x1(), 0);
        c10951c5.mo52909to().m17349x1(-c12007ix3.m56557jd(), -c12007ix3.m56551ck(), 0);
        c10951c5.m52906k4(c10970u4.m53081m9());
        return c10951c5;
    }

    /* JADX INFO: renamed from: k4 */
    public final C10951c5 m54764k4(C10970u4 c10970u4, C11639kk c11639kk, C10951c5[] c10951c5Arr) {
        C1937to c1937to = new C1937to(c10970u4.m53082to());
        return m54763k4(c10970u4, c11639kk, new C12015qq(21600.0f, 21600.0f), c1937to.m9986fa().Clone(), new C12007ix(C12025x6.f40591k4.Clone(), c1937to.m9993ne().Clone()), c10951c5Arr);
    }
}

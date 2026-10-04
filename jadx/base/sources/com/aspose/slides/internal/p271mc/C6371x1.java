package com.aspose.slides.internal.p271mc;

import OooOO0.OooO0OO;
import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p033b2.C1574kk;
import com.aspose.slides.internal.p033b2.C1575to;
import com.aspose.slides.internal.p070cx.AbstractC2646h4;
import com.aspose.slides.internal.p070cx.C2645dy;
import com.aspose.slides.internal.p070cx.C2647k4;
import com.aspose.slides.internal.p309o2.AbstractC6972x1;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p329p4.C7182dy;
import com.aspose.slides.internal.p329p4.C7186k4;
import com.aspose.slides.internal.p329p4.C7187kk;
import com.aspose.slides.internal.p341po.C9476to;
import com.aspose.slides.internal.p401sl.AbstractC10239m9;
import com.aspose.slides.internal.p401sl.AbstractC10240to;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.mc.x1 */
/* JADX INFO: loaded from: classes4.dex */
public class C6371x1 {
    /* JADX INFO: renamed from: k4 */
    public static List<C12003du> m26191k4(float[] fArr, AbstractC6972x1 abstractC6972x1) {
        List<C12003du> list = new List<>(fArr.length);
        for (float f : fArr) {
            float[] fArrMo27241k4 = abstractC6972x1.mo27241k4(new float[]{f});
            list.addItem(C12003du.m56398k4(255, OooO0OO.OooO0OO(fArrMo27241k4[0], 255.0f, 13), OooO0OO.OooO0OO(fArrMo27241k4[1], 255.0f, 13), OooO0OO.OooO0OO(fArrMo27241k4[2], 255.0f, 13)).Clone().Clone());
        }
        return list;
    }

    /* JADX INFO: renamed from: x1 */
    public static C6363fa m26194x1(C1574kk c1574kk, C11913yj c11913yj) {
        AbstractC2646h4 abstractC2646h4M8464k4 = c1574kk.m8464k4();
        if (abstractC2646h4M8464k4.mo12103k4() != 3 || !C7019kk.m27469x1(abstractC2646h4M8464k4, C2645dy.class)) {
            return null;
        }
        C2645dy c2645dy = (C2645dy) C7019kk.m27452k4((Object) abstractC2646h4M8464k4, C2645dy.class);
        C11913yj c11913yjM46655k4 = C9476to.m46655k4(((C7187kk) c1574kk.mo8461c5()).mo27768h4(C7182dy.f19735zb));
        C7186k4 c7186k4M12109x1 = c2645dy.m12109x1();
        C12025x6[] c12025x6Arr = {new C12025x6(c7186k4M12109x1.m27786to(0), c7186k4M12109x1.m27786to(1)), new C12025x6(c7186k4M12109x1.m27786to(3), c7186k4M12109x1.m27786to(4))};
        c11913yjM46655k4.m55775k4(c12025x6Arr);
        c11913yj.m55775k4(c12025x6Arr);
        return new C6363fa(c12025x6Arr[0].Clone(), c7186k4M12109x1.m27786to(2) * c11913yjM46655k4.m55776k4()[0], c12025x6Arr[1].Clone(), c7186k4M12109x1.m27786to(5) * c11913yjM46655k4.m55776k4()[0], c2645dy.m12106du(), c2645dy.m12108kk());
    }

    /* JADX INFO: renamed from: k4 */
    public static C6359c5 m26192k4(C1574kk c1574kk, C11913yj c11913yj) {
        AbstractC2646h4 abstractC2646h4M8464k4 = c1574kk.m8464k4();
        if (abstractC2646h4M8464k4.mo12103k4() != 2 || !C7019kk.m27469x1(abstractC2646h4M8464k4, C2647k4.class)) {
            return null;
        }
        C2647k4 c2647k4 = (C2647k4) C7019kk.m27452k4((Object) abstractC2646h4M8464k4, C2647k4.class);
        C7186k4 c7186k4M12109x1 = c2647k4.m12109x1();
        C12025x6[] c12025x6Arr = {new C12025x6(c7186k4M12109x1.m27786to(0), c7186k4M12109x1.m27786to(1)), new C12025x6(c7186k4M12109x1.m27786to(2), c7186k4M12109x1.m27786to(3))};
        c11913yj.m55775k4(c12025x6Arr);
        return new C6359c5(c12025x6Arr[0].Clone(), c12025x6Arr[1].Clone(), c2647k4.m12106du(), c2647k4.m12108kk());
    }

    /* JADX INFO: renamed from: k4 */
    public static AbstractC10240to m26193k4(C1575to c1575to) {
        Dictionary.ValueCollection.Enumerator<String, AbstractC10239m9> it = c1575to.m8465k4().m46095h4().getValues().iterator();
        try {
            AbstractC10239m9 next = it.hasNext() ? it.next() : null;
            if (next == null || !C7019kk.m27469x1(next, AbstractC10240to.class)) {
                return null;
            }
            return (AbstractC10240to) C7019kk.m27452k4((Object) next, AbstractC10240to.class);
        } finally {
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                it.dispose();
            }
        }
    }
}

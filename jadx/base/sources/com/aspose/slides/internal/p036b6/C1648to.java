package com.aspose.slides.internal.p036b6;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14093tq;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.b6.to */
/* JADX INFO: loaded from: classes3.dex */
public class C1648to {
    /* JADX INFO: renamed from: k4 */
    public static C14093tq<C1630gi> m8915k4(List<C1624du> list) {
        C1624du c1624du = new C1624du();
        List.Enumerator<C1624du> it = list.iterator();
        while (it.hasNext()) {
            try {
                c1624du.m8750x1().addRange(it.next().m8750x1());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return m8916k4(c1624du);
    }

    /* JADX INFO: renamed from: k4 */
    public static C14093tq<C1630gi> m8916k4(C1624du c1624du) {
        if (c1624du.m8748k4() == 0) {
            return new C14093tq<>();
        }
        double dM8817kk = c1624du.m8750x1().get_Item(0).m8817kk();
        double dM8817kk2 = c1624du.m8750x1().get_Item(0).m8817kk();
        double dM8818to = c1624du.m8750x1().get_Item(0).m8818to();
        double dM8818to2 = c1624du.m8750x1().get_Item(0).m8818to();
        double dM8818to3 = dM8818to;
        double dM8817kk3 = dM8817kk2;
        double dM8817kk4 = dM8817kk;
        for (int i = 1; i < c1624du.m8748k4(); i++) {
            C1631h4 c1631h4 = c1624du.m8750x1().get_Item(i);
            if (c1631h4.m8817kk() < dM8817kk4) {
                dM8817kk4 = c1631h4.m8817kk();
            }
            if (c1631h4.m8817kk() > dM8817kk3) {
                dM8817kk3 = c1631h4.m8817kk();
            }
            if (c1631h4.m8818to() < dM8818to3) {
                dM8818to3 = c1631h4.m8818to();
            }
            if (c1631h4.m8818to() > dM8818to2) {
                dM8818to2 = c1631h4.m8818to();
            }
        }
        return new C14093tq<>(new C1630gi(dM8817kk4, dM8818to3, dM8817kk3 - dM8817kk4, dM8818to2 - dM8818to3));
    }
}

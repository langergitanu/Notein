package com.aspose.slides.internal.p036b6;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14093tq;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.b6.g8 */
/* JADX INFO: loaded from: classes3.dex */
public class C1629g8 {
    /* JADX INFO: renamed from: k4 */
    private static List<C1624du> m8798k4(List<C1624du> list) {
        List<C1624du> list2 = new List<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get_Item(i).m8748k4() > 0) {
                list2.addItem(m8799k4(list.get_Item(i)));
            }
        }
        return list2;
    }

    /* JADX INFO: renamed from: k4 */
    private static C1624du m8799k4(C1624du c1624du) {
        C1624du c1624du2 = new C1624du();
        C1631h4 c1631h4 = c1624du.m8750x1().get_Item(0);
        c1624du2.m8749k4(c1631h4);
        int iM8748k4 = c1624du.m8748k4();
        int i = 1;
        while (i < iM8748k4) {
            C1631h4 c1631h42 = c1624du.m8750x1().get_Item(i);
            if (c1631h42.m8819x1()) {
                c1624du2.m8749k4(c1631h42);
                c1631h4 = c1631h42;
            } else {
                C1631h4 c1631h43 = c1624du.m8750x1().get_Item(i + 1);
                C1631h4 c1631h44 = i == iM8748k4 + (-2) ? c1624du.m8750x1().get_Item(0) : c1624du.m8750x1().get_Item(i + 2);
                C1631h4[][] c1631h4ArrM9032k4 = C1660x1.m9032k4(c1631h4, c1631h42, c1631h43, c1631h44);
                c1631h4ArrM9032k4[0][2].m8816k4(true);
                c1624du2.m8749k4(c1631h4ArrM9032k4[0][1]);
                c1624du2.m8749k4(c1631h4ArrM9032k4[0][2]);
                if (c1631h4ArrM9032k4.length > 1) {
                    c1631h4ArrM9032k4[1][2].m8816k4(true);
                    c1624du2.m8749k4(c1631h4ArrM9032k4[1][1]);
                    c1624du2.m8749k4(c1631h4ArrM9032k4[1][2]);
                }
                i += 2;
                c1631h4 = c1631h44;
            }
            i++;
        }
        List.Enumerator<C1631h4> it = c1624du2.m8750x1().iterator();
        while (it.hasNext()) {
            try {
                it.next().m8815k4();
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return c1624du2;
    }

    /* JADX INFO: renamed from: k4 */
    private static C1627f9 m8800k4(C1627f9 c1627f9) {
        double dM8768to;
        for (C1625dy c1625dy : c1627f9.m8785m9()) {
            c1625dy.m8761k4(m8798k4(c1625dy.m8758k4()));
            C14093tq<C1630gi> c14093tqClone = C1648to.m8915k4(c1625dy.m8758k4()).Clone();
            if (C14093tq.m67296x1(c14093tqClone, null)) {
                c1625dy.m8759k4(C14116yg.m67477k4(c14093tqClone.m67297k4().m8804k4(), 5));
                c1625dy.m8771x1(C14116yg.m67477k4(c14093tqClone.m67297k4().m8807kk() + c14093tqClone.m67297k4().m8804k4(), 5));
                c1625dy.m8765kk(C14116yg.m67477k4(c14093tqClone.m67297k4().m8811x1(), 5));
                c1625dy.m8769to(C14116yg.m67477k4(c14093tqClone.m67297k4().m8809to() + c14093tqClone.m67297k4().m8811x1(), 5));
                dM8768to = c1625dy.m8768to();
            } else {
                dM8768to = 0.0d;
                c1625dy.m8759k4(0.0d);
                c1625dy.m8771x1(0.0d);
                c1625dy.m8765kk(0.0d);
                c1625dy.m8769to(0.0d);
            }
            c1625dy.m8754du(dM8768to);
        }
        c1627f9.m8778k4(1.0d);
        c1627f9.m8777k4("maxp").set_Item("version", Double.valueOf(1.0d));
        c1627f9.m8777k4("maxp").set_Item("maxZones", Integer.valueOf((((Integer) C7019kk.m27464to(c1627f9.m8777k4("maxp").get_Item("maxTwilightPoints"), Integer.TYPE)).intValue() & 65535) > 1 ? 2 : 1));
        return c1627f9;
    }

    /* JADX INFO: renamed from: k4 */
    public static byte[] m8801k4(byte[] bArr) {
        return new C1647t6().m8914k4(m8800k4(new C1646sv().m8910k4(bArr)));
    }
}

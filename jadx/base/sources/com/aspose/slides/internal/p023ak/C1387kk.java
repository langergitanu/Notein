package com.aspose.slides.internal.p023ak;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.Stack;
import com.aspose.slides.internal.p034b3.C1602uz;
import com.aspose.slides.internal.p048bv.C1869to;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p406ss.C10326c5;
import com.aspose.slides.internal.p486wy.C12314dy;
import com.aspose.slides.p559ms.System.AbstractC14096u4;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.ak.kk */
/* JADX INFO: loaded from: classes3.dex */
public class C1387kk {
    /* JADX INFO: renamed from: k4 */
    private static List<C1383du> m8224k4(List<C1383du> list, int i) {
        List<C1383du> list2 = new List<>();
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            C1383du c1383du = list.get_Item(i2);
            if (c1383du.m8187x1() < i) {
                list2.addItem(c1383du);
            } else {
                int i3 = i2;
                while (i3 < size && list.get_Item(i3).m8187x1() >= i) {
                    i3++;
                }
                if (i2 < i3) {
                    list2.addRange(m8225k4(list, i2, i3));
                }
                i2 = i3 - 1;
            }
            i2++;
        }
        return !list2.equals(list) ? list2 : list;
    }

    /* JADX INFO: renamed from: kk */
    private static List<C1383du> m8234kk(List<C1383du> list) {
        return list;
    }

    /* JADX INFO: renamed from: to */
    private static List<C12314dy> m8235to(List<C12314dy> list) {
        return new C1388m9(list).m8266k4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x1 */
    private static List<C1383du> m8236x1(List<C1383du> list) {
        List<C1383du> list2 = new List<>();
        C1869to c1869to = new C1869to(list);
        while (c1869to.mo9764x1()) {
            C1383du c1383du = (C1383du) c1869to.mo9760kk();
            if (c1383du.m8186to()) {
                list2.addItem(c1383du);
            } else {
                list2.addRange(c1383du.m8179du());
            }
        }
        return !list2.equals(list) ? list2 : list;
    }

    /* JADX INFO: renamed from: k4 */
    private static List<C1383du> m8225k4(List<C1383du> list, int i, int i2) {
        int i3 = i2 - i;
        List<C1383du> list2 = new List<>(i3);
        if (i3 > 0) {
            for (int i4 = 0; i4 < i3; i4++) {
                C1383du c1383du = list.get_Item(((i3 - i4) - 1) + i);
                c1383du.m8185m9();
                list2.addItem(c1383du);
            }
        }
        return list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    private static List<C1383du> m8226k4(List<C12314dy> list, List<C1383du> list2) {
        C1869to c1869to = new C1869to(list);
        while (c1869to.mo9764x1()) {
            list2 = ((C12314dy) c1869to.mo9760kk()).mo57580x1(list2);
        }
        return list2;
    }

    /* JADX INFO: renamed from: k4 */
    private static List<C1389to> m8227k4(Stack<C1389to> stack) {
        List<C1389to> list = new List<>();
        Stack.Enumerator<C1389to> it = stack.iterator();
        while (it.hasNext()) {
            try {
                C1389to next = it.next();
                if (!next.m8277x1()) {
                    list.addItem(next);
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    private static void m8228k4(List<C1389to> list) {
        C1869to c1869to = new C1869to(list);
        while (c1869to.mo9764x1()) {
            ((C1389to) c1869to.mo9760kk()).m8276kk();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    private static void m8229k4(List<C1383du> list, boolean z) {
        C1869to c1869to = new C1869to(list);
        while (c1869to.mo9764x1()) {
            ((C1383du) c1869to.mo9760kk()).m8182k4(z);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m8230k4(C1602uz c1602uz) {
        int[] iArrM8184kk;
        List<C1383du> listM8226k4 = m8226k4(c1602uz.m8640wl(), (List<C1383du>) new List());
        for (int i = 0; i < listM8226k4.size(); i++) {
            C1383du c1383du = listM8226k4.get_Item(i);
            if (c1383du.m8186to() && c1383du.m8187x1() == -1 && (iArrM8184kk = c1383du.m8184kk()) != null) {
                for (int i2 = 0; i2 < iArrM8184kk.length; i2++) {
                    iArrM8184kk[i2] = 0;
                }
                c1383du.m8183k4(iArrM8184kk);
            }
        }
        List<C1383du> listM8236x1 = m8236x1(listM8226k4);
        int[] iArrM8233k4 = m8233k4(listM8236x1, (int[]) null);
        int i3 = iArrM8233k4[0];
        int i4 = iArrM8233k4[1];
        if (i4 > 0) {
            if ((i3 & 1) == 0) {
                i3++;
            }
            while (i4 >= i3) {
                listM8236x1 = m8224k4(listM8236x1, i4);
                i4--;
            }
        }
        m8229k4(listM8236x1, true);
        m8231k4(c1602uz, m8234kk(listM8236x1));
    }

    /* JADX INFO: renamed from: k4 */
    private static void m8231k4(C1602uz c1602uz, List<C1383du> list) {
        c1602uz.m8641x1(m8235to(list.convertAll(new AbstractC14096u4<C1383du, C12314dy>() { // from class: com.aspose.slides.internal.ak.kk.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14096u4
            /* JADX INFO: renamed from: k4, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public C12314dy mo6770k4(C1383du c1383du) {
                return c1383du.m8181k4();
            }
        })));
    }

    /* JADX INFO: renamed from: k4 */
    public static void m8232k4(C10326c5 c10326c5) {
        m8228k4(m8227k4(c10326c5.m14085k4(new Stack<>())));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    private static int[] m8233k4(List<C1383du> list, int[] iArr) {
        if (iArr == null) {
            iArr = new int[]{Integer.MAX_VALUE, Integer.MIN_VALUE};
        }
        C1869to c1869to = new C1869to(list);
        while (c1869to.mo9764x1()) {
            ((C1383du) c1869to.mo9760kk()).m8188x1(iArr);
        }
        return iArr;
    }
}

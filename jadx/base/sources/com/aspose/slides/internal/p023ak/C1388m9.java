package com.aspose.slides.internal.p023ak;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Stack;
import com.aspose.slides.internal.p034b3.C1604wl;
import com.aspose.slides.internal.p034b3.C1606x1;
import com.aspose.slides.internal.p048bv.C1869to;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p486wy.C12313du;
import com.aspose.slides.internal.p486wy.C12314dy;
import com.aspose.slides.internal.p486wy.C12317jd;
import com.aspose.slides.internal.p486wy.C12319kk;
import com.aspose.slides.internal.p486wy.C12320ks;
import com.aspose.slides.internal.p486wy.C12322rv;
import com.aspose.slides.internal.p486wy.C12327yj;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.ak.m9 */
/* JADX INFO: loaded from: classes3.dex */
public class C1388m9 {

    /* JADX INFO: renamed from: du */
    private C12320ks f6022du;

    /* JADX INFO: renamed from: k4 */
    private List<C12314dy> f6025k4;

    /* JADX INFO: renamed from: to */
    private C12320ks f6028to;

    /* JADX INFO: renamed from: dy */
    private Dictionary<C12317jd, Integer> f6023dy = new Dictionary<>();

    /* JADX INFO: renamed from: x1 */
    private List<C12314dy> f6029x1 = new List<>();

    /* JADX INFO: renamed from: kk */
    private int f6026kk = -1;

    /* JADX INFO: renamed from: h4 */
    private Stack f6024h4 = new Stack();

    /* JADX INFO: renamed from: m9 */
    private Stack f6027m9 = new Stack();

    public C1388m9(List<C12314dy> list) {
        this.f6025k4 = list;
    }

    /* JADX INFO: renamed from: du */
    private static List<C12317jd> m8237du(C12314dy c12314dy) {
        List<C12317jd> list = new List<>();
        while (true) {
            for (C1606x1 c1606x1M8681x6 = c12314dy.m8681x6(); c1606x1M8681x6 != null; c1606x1M8681x6 = null) {
                if (C7019kk.m27469x1(c1606x1M8681x6, C12314dy.class)) {
                    if (C7019kk.m27469x1(c1606x1M8681x6, C12317jd.class) && !C7019kk.m27469x1(c1606x1M8681x6, C12320ks.class)) {
                        list.addItem((C12317jd) c1606x1M8681x6);
                    }
                    c12314dy = (C12314dy) c1606x1M8681x6;
                }
            }
            return list;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private int m8238k4(C12317jd c12317jd) {
        if (c12317jd.f41182ck.size() == 1) {
            return 3;
        }
        int iIntValue = this.f6023dy.get_Item(c12317jd).intValue();
        if (iIntValue == 1) {
            return 0;
        }
        return iIntValue == c12317jd.f41182ck.size() ? 1 : 2;
    }

    /* JADX INFO: renamed from: kk */
    private void m8252kk() {
        m8262x1((List<C12317jd>) null, (C12320ks) null);
    }

    /* JADX INFO: renamed from: to */
    private static C12320ks m8257to(C12314dy c12314dy) {
        C12320ks c12320ks = null;
        while (c12320ks == null) {
            if (!C7019kk.m27469x1(c12314dy, C12320ks.class)) {
                C1606x1 c1606x1M8681x6 = c12314dy.m8681x6();
                if (!C7019kk.m27469x1(c1606x1M8681x6, C12314dy.class)) {
                    break;
                }
                c12314dy = (C12314dy) c1606x1M8681x6;
            } else {
                c12320ks = (C12320ks) c12314dy;
            }
        }
        return c12320ks;
    }

    /* JADX INFO: renamed from: x1 */
    private static C12317jd m8259x1(C12317jd c12317jd, int i) {
        C12317jd c12317jd2 = new C12317jd();
        if (c12317jd != null) {
            m8246k4(c12317jd2, c12317jd, i);
        }
        return c12317jd2;
    }

    /* JADX INFO: renamed from: kk */
    private void m8253kk(List<C12317jd> list, C12320ks c12320ks) {
        if (m8249k4(list, c12320ks)) {
            m8262x1(list, c12320ks);
        }
    }

    /* JADX INFO: renamed from: to */
    private void m8258to() {
        m8261x1();
        m8252kk();
    }

    /* JADX INFO: renamed from: x1 */
    private static C12320ks m8260x1(C12320ks c12320ks) {
        C12320ks c12320ks2 = new C12320ks();
        if (c12320ks != null) {
            c12320ks2.m8668k4(c12320ks.m8674ne());
            c12320ks2.m8670kk(c12320ks.mo8658e_());
            c12320ks2.m57573ks(c12320ks.m57577um());
            c12320ks2.m57593fa(c12320ks.m57597wl());
            c12320ks2.m57591c5(c12320ks.m57595u4());
            c12320ks2.m57594jd(c12320ks.m57596uz());
        }
        return c12320ks2;
    }

    /* JADX INFO: renamed from: k4 */
    public final List<C12314dy> m8266k4() {
        List<C12314dy> list = this.f6025k4;
        if (list != null) {
            List.Enumerator<C12314dy> it = list.iterator();
            while (it.hasNext()) {
                try {
                    m8245k4(it.next());
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
        }
        m8258to();
        return this.f6029x1;
    }

    /* JADX INFO: renamed from: k4 */
    private static C12317jd m8239k4(C12313du c12313du, int i) {
        C12313du c12313du2 = new C12313du();
        if (c12313du != null) {
            m8246k4(c12313du2, c12313du, i);
            m8244k4(c12313du2, c12313du);
        }
        return c12313du2;
    }

    /* JADX INFO: renamed from: kk */
    private void m8254kk(C12314dy c12314dy) {
        if (this.f6027m9.size() == 0) {
            this.f6029x1.addItem(c12314dy);
        } else {
            ((C12317jd) this.f6027m9.peek()).mo8582k4((C1606x1) c12314dy);
        }
    }

    /* JADX INFO: renamed from: x1 */
    private void m8261x1() {
        m8248k4((C12320ks) null);
    }

    /* JADX INFO: renamed from: k4 */
    private static C12317jd m8240k4(C12317jd c12317jd, int i) {
        return C7019kk.m27469x1(c12317jd, C12319kk.class) ? m8241k4((C12319kk) c12317jd, i) : C7019kk.m27469x1(c12317jd, C12313du.class) ? m8239k4((C12313du) c12317jd, i) : m8259x1(c12317jd, i);
    }

    /* JADX INFO: renamed from: kk */
    private static void m8255kk(C12320ks c12320ks) {
        List.Enumerator<C12314dy> it = c12320ks.mo57566d_().iterator();
        int i = 0;
        while (it.hasNext()) {
            try {
                C12314dy next = it.next();
                if (C7019kk.m27469x1(next, C12327yj.class) && ((C12327yj) next).m57624uz()) {
                    i++;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (i > 0) {
            c12320ks.m8679x1((c12320ks.m57595u4() * i) + c12320ks.m8678x1());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x1 */
    private void m8262x1(List<C12317jd> list, C12320ks c12320ks) {
        if (list == null || list.size() == 0) {
            while (this.f6027m9.size() != 0) {
                this.f6024h4.pop();
                C12317jd c12317jd = (C12317jd) this.f6027m9.pop();
                if (this.f6027m9.size() == 0) {
                    this.f6029x1.addItem(c12317jd);
                } else {
                    ((C12317jd) this.f6027m9.peek()).mo8582k4((C1606x1) c12317jd);
                }
            }
            return;
        }
        C1869to c1869to = new C1869to(list);
        while (c1869to.mo9764x1()) {
            C12317jd c12317jd2 = (C12317jd) c1869to.mo9760kk();
            C12317jd c12317jd3 = this.f6024h4.size() == 0 ? null : (C12317jd) this.f6024h4.peek();
            if (c12317jd3 != null) {
                if (c12317jd2 == c12317jd3) {
                    return;
                }
                this.f6024h4.pop();
                C12317jd c12317jd4 = (C12317jd) this.f6027m9.pop();
                if (this.f6027m9.size() == 0) {
                    this.f6029x1.addItem(c12317jd4);
                } else {
                    ((C12317jd) this.f6027m9.peek()).mo8582k4((C1606x1) c12317jd4);
                }
                if (this.f6024h4.size() != 0 && this.f6024h4.peek() == c12317jd2) {
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static C12317jd m8241k4(C12319kk c12319kk, int i) {
        C12319kk c12319kk2 = new C12319kk();
        if (c12319kk != null) {
            m8246k4(c12319kk2, c12319kk, i);
            m8247k4(c12319kk2, c12319kk);
        }
        return c12319kk2;
    }

    /* JADX INFO: renamed from: kk */
    private void m8256kk(C12320ks c12320ks, C12314dy c12314dy) {
        if (C7019kk.m27469x1(c12320ks, C12322rv.class)) {
            this.f6022du = c12320ks;
            return;
        }
        if (this.f6022du == null) {
            this.f6022du = m8260x1(c12320ks);
        }
        this.f6022du.mo8582k4((C1606x1) c12314dy);
    }

    /* JADX INFO: renamed from: x1 */
    private void m8263x1(List<C12317jd> list, C12320ks c12320ks, C12314dy c12314dy) {
        if (m8265x1(c12314dy)) {
            c12320ks = null;
            if (this.f6022du == null) {
                this.f6028to = null;
                return;
            }
            m8261x1();
        } else {
            if (list != null && list.size() != 0) {
                m8242k4(list);
            }
            if (c12320ks != null) {
                m8256kk(c12320ks, c12314dy);
            } else {
                m8254kk(c12314dy);
            }
            this.f6026kk = c12314dy.m8672m9();
        }
        this.f6028to = c12320ks;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    private void m8242k4(List<C12317jd> list) {
        List list2 = new List();
        List.Enumerator<C12317jd> it = list.iterator();
        while (it.hasNext()) {
            try {
                C12317jd next = it.next();
                if (!this.f6024h4.contains(next)) {
                    list2.insertItem(0, next);
                    if (this.f6023dy.containsKey(next)) {
                        Dictionary<C12317jd, Integer> dictionary = this.f6023dy;
                        dictionary.set_Item(next, Integer.valueOf(dictionary.get_Item(next).intValue() + 1));
                    } else {
                        this.f6023dy.addItem(next, 1);
                    }
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        List.Enumerator it2 = list2.iterator();
        while (it2.hasNext()) {
            try {
                C12317jd c12317jd = (C12317jd) it2.next();
                this.f6024h4.push(c12317jd);
                this.f6027m9.push(m8240k4(c12317jd, m8238k4(c12317jd)));
            } finally {
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    private void m8264x1(C12320ks c12320ks, C12314dy c12314dy) {
        if (m8251k4(c12320ks, c12314dy)) {
            m8248k4(c12320ks);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m8243k4(List<C12317jd> list, C12320ks c12320ks, C12314dy c12314dy) {
        C12320ks c12320ks2 = this.f6022du;
        if (c12320ks2 == null || c12320ks != c12320ks2) {
            m8264x1(c12320ks, c12314dy);
            m8253kk(list, c12320ks);
            m8263x1(list, c12320ks, c12314dy);
        }
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m8265x1(C12314dy c12314dy) {
        List.Enumerator<C12314dy> it = this.f6029x1.iterator();
        while (it.hasNext()) {
            try {
                if (c12314dy.m57572k4(it.next())) {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                    return true;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m8244k4(C12313du c12313du, C12313du c12313du2) {
        c12313du.m8679x1(c12313du2.m8678x1());
        c12313du.m57565c5(c12313du2.m57568u4());
    }

    /* JADX INFO: renamed from: k4 */
    private void m8245k4(C12314dy c12314dy) {
        m8243k4(m8237du(c12314dy), m8257to(c12314dy), c12314dy);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m8246k4(C12317jd c12317jd, C12317jd c12317jd2, int i) {
        c12317jd.m8668k4(c12317jd2.m8674ne());
        if (i != 0) {
            if (i == 1) {
                c12317jd.m8667k4(15, (Object) null);
                c12317jd.m8667k4(19, (Object) null);
            } else if (i == 2) {
                c12317jd.m8667k4(20, (Object) null);
                c12317jd.m8667k4(19, (Object) null);
                c12317jd.m8667k4(16, (Object) null);
                c12317jd.m8667k4(15, (Object) null);
                c12317jd.m8667k4(28, (Object) null);
            }
            c12317jd.m8667k4(27, (Object) null);
        } else {
            c12317jd.m8667k4(16, (Object) null);
            c12317jd.m8667k4(20, (Object) null);
            c12317jd.m8667k4(28, (Object) null);
        }
        c12317jd.m8670kk(c12317jd2.mo8658e_());
        c12317jd.m57573ks(c12317jd2.m57577um());
    }

    /* JADX INFO: renamed from: k4 */
    private static void m8247k4(C12319kk c12319kk, C12319kk c12319kk2) {
        C1604wl c1604wlM57599u4 = c12319kk2.m57599u4();
        if (c1604wlM57599u4 != null) {
            String[] strArrMo8592to = c1604wlM57599u4.mo8592to();
            if (strArrMo8592to.length > 0) {
                C1604wl c1604wl = new C1604wl(strArrMo8592to[0], c12319kk);
                c12319kk.m57598k4(c1604wl);
                c1604wlM57599u4.m8650k4(c1604wl);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m8248k4(C12320ks c12320ks) {
        C12320ks c12320ks2 = this.f6022du;
        if (c12320ks2 != null) {
            m8255kk(c12320ks2);
            if (this.f6027m9.size() != 0) {
                ((C12317jd) this.f6027m9.peek()).mo8582k4((C1606x1) this.f6022du);
            } else {
                this.f6029x1.addItem(this.f6022du);
            }
        }
        this.f6022du = null;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m8249k4(List<C12317jd> list, C12320ks c12320ks) {
        C12317jd c12317jd;
        C12317jd c12317jd2;
        return (list == null || list.size() == 0) ? this.f6024h4.size() != 0 : (this.f6024h4.size() == 0 || (c12317jd = list.get_Item(0)) == (c12317jd2 = (C12317jd) this.f6024h4.peek()) || m8250k4(c12317jd, c12317jd2)) ? false : true;
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m8250k4(C12317jd c12317jd, C12317jd c12317jd2) {
        return c12317jd.m8681x6() == c12317jd2;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m8251k4(C12320ks c12320ks, C12314dy c12314dy) {
        C12320ks c12320ks2 = this.f6028to;
        if (c12320ks2 == null || c12320ks == c12320ks2) {
            return (this.f6026kk == -1 || c12314dy.m8672m9() == this.f6026kk) ? false : true;
        }
        return true;
    }
}

package com.aspose.slides.internal.p416tb;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p039be.AbstractC1689x1;
import com.aspose.slides.internal.p089dp.C3211x1;
import com.aspose.slides.internal.p151gj.C4317dy;
import com.aspose.slides.internal.p151gj.C4328x1;
import com.aspose.slides.internal.p155gv.AbstractC4385m9;
import com.aspose.slides.internal.p155gv.C4381dy;
import com.aspose.slides.internal.p155gv.C4387x1;
import com.aspose.slides.internal.p223ka.C5659x1;
import com.aspose.slides.internal.p302nm.C6920du;
import com.aspose.slides.internal.p302nm.C6921dy;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p505xn.C12571u4;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.tb.um */
/* JADX INFO: loaded from: classes4.dex */
public class C10913um {

    /* JADX INFO: renamed from: m9 */
    private static final Dictionary<Integer, C10892ar> f37953m9;

    /* JADX INFO: renamed from: k4 */
    private final C10898dy f37956k4;

    /* JADX INFO: renamed from: x1 */
    private final SortedList<String, AbstractC1689x1> f37959x1 = new C12571u4();

    /* JADX INFO: renamed from: kk */
    private final SortedList<String, AbstractC4385m9> f37957kk = new C12571u4();

    /* JADX INFO: renamed from: to */
    private final SortedList<String, C4387x1> f37958to = new C12571u4();

    /* JADX INFO: renamed from: du */
    private final SortedList<Integer, C3211x1> f37954du = new SortedList<>();

    /* JADX INFO: renamed from: h4 */
    private final C4381dy f37955h4 = new C4381dy();

    static {
        Dictionary<Integer, C10892ar> dictionary = new Dictionary<>();
        f37953m9 = dictionary;
        dictionary.addItem(1, new C10892ar("Font", "F"));
        dictionary.addItem(2, new C10892ar("Pattern", "P"));
        dictionary.addItem(3, new C10892ar("ExtGState", "GS"));
        dictionary.addItem(4, new C10892ar("XObject", "X"));
    }

    public C10913um(C10898dy c10898dy) {
        this.f37956k4 = c10898dy;
    }

    /* JADX INFO: renamed from: kk */
    public static String m52554kk(int i) {
        return f37953m9.get_Item(Integer.valueOf(i)).f37866x1;
    }

    /* JADX INFO: renamed from: to */
    private IGenericList<AbstractC10914up> m52555to(int i) {
        IGenericDictionary iGenericDictionary;
        if (i == 1) {
            iGenericDictionary = this.f37959x1;
        } else if (i == 2) {
            iGenericDictionary = this.f37957kk;
        } else if (i == 3) {
            iGenericDictionary = this.f37958to;
        } else {
            if (i != 4) {
                throw new InvalidOperationException("Unknown resource type.");
            }
            iGenericDictionary = this.f37954du;
        }
        return m52550k4(iGenericDictionary.getValues());
    }

    /* JADX INFO: renamed from: x1 */
    public static String m52556x1(int i) {
        return f37953m9.get_Item(Integer.valueOf(i)).f37865k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m52557k4(int i) {
        return m52555to(i).size();
    }

    /* JADX INFO: renamed from: k4 */
    private <TValue extends AbstractC10914up> IGenericList<AbstractC10914up> m52550k4(IGenericList<TValue> iGenericList) {
        List list = new List(iGenericList.size());
        IGenericEnumerator<TValue> it = iGenericList.iterator();
        while (it.hasNext()) {
            try {
                list.addItem(it.next());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return list;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m52564x1(C10922yj c10922yj) {
        m52553k4(this.f37959x1.getValues(), c10922yj);
        m52553k4(this.f37957kk.getValues(), c10922yj);
        m52553k4(this.f37958to.getValues(), c10922yj);
        m52553k4(this.f37954du.getValues(), c10922yj);
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC1689x1 m52558k4(C5659x1 c5659x1, boolean z, int i) {
        int i2 = c5659x1.m23120k4().m48225qq() ? c5659x1.m23120k4().m48172ar() ? 0 : 1 : z ? 2 : 3;
        String strM52551k4 = m52551k4(c5659x1.m23123m9(), c5659x1.m23125x1(), i2);
        AbstractC1689x1[] abstractC1689x1Arr = {null};
        boolean zTryGetValue = this.f37959x1.tryGetValue(strM52551k4, abstractC1689x1Arr);
        AbstractC1689x1 abstractC1689x1 = abstractC1689x1Arr[0];
        if (zTryGetValue) {
            return abstractC1689x1;
        }
        AbstractC1689x1 abstractC1689x1M9116k4 = AbstractC1689x1.m9116k4(this.f37956k4, c5659x1.m23125x1(), c5659x1.m23120k4(), i2, i);
        this.f37959x1.set_Item(strM52551k4, abstractC1689x1M9116k4);
        return abstractC1689x1M9116k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final C3211x1 m52559k4(byte[] bArr, C6921dy c6921dy, C6920du c6920du) {
        int iM27125k4 = C6921dy.m27125k4(bArr, c6921dy, c6920du);
        C3211x1[] c3211x1Arr = {null};
        boolean zTryGetValue = this.f37956k4.m52459kk().f37954du.tryGetValue(Integer.valueOf(iM27125k4), c3211x1Arr);
        C3211x1 c3211x1 = c3211x1Arr[0];
        if (!zTryGetValue) {
            c3211x1 = new C3211x1(this.f37956k4, bArr, c6921dy, c6920du);
            this.f37956k4.m52459kk().f37954du.set_Item(Integer.valueOf(iM27125k4), c3211x1);
        }
        this.f37954du.set_Item(Integer.valueOf(iM27125k4), c3211x1);
        return c3211x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC4385m9 m52560k4(C4328x1 c4328x1, C4317dy c4317dy) {
        if (!C4381dy.m17702k4(c4328x1)) {
            AbstractC4385m9 abstractC4385m9M17755k4 = AbstractC4385m9.m17755k4(c4328x1, this.f37956k4);
            this.f37957kk.set_Item(abstractC4385m9M17755k4.m52566ck(), abstractC4385m9M17755k4);
            return abstractC4385m9M17755k4;
        }
        if (this.f37955h4.m17706k4(c4328x1, c4317dy)) {
            return this.f37955h4.m17707x1(c4328x1, c4317dy);
        }
        AbstractC4385m9 abstractC4385m9M17755k42 = AbstractC4385m9.m17755k4(c4328x1, this.f37956k4);
        this.f37957kk.set_Item(abstractC4385m9M17755k42.m52566ck(), abstractC4385m9M17755k42);
        this.f37955h4.m17705k4(c4328x1, abstractC4385m9M17755k42, c4317dy);
        return abstractC4385m9M17755k42;
    }

    /* JADX INFO: renamed from: k4 */
    public final C4387x1 m52561k4(float f, float f2) {
        C4387x1 next;
        IGenericEnumerator<C4387x1> it = this.f37958to.getValues().iterator();
        while (true) {
            try {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (next.m17777k4() == f && next.m17779x1() == f2) {
                    break;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (next != null) {
            return next;
        }
        C4387x1 c4387x1 = new C4387x1(this.f37956k4);
        c4387x1.m17778k4(f);
        c4387x1.m17780x1(f2);
        this.f37958to.set_Item(c4387x1.m52566ck(), c4387x1);
        return c4387x1;
    }

    /* JADX INFO: renamed from: k4 */
    private static String m52551k4(String str, int i, int i2) {
        return C14113y2.m67402k4("{0}-{1}-{2}", str, Integer.valueOf(i), Integer.valueOf(i2));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m52562k4() {
        this.f37955h4.m17704k4();
    }

    /* JADX INFO: renamed from: k4 */
    private void m52552k4(int i, C10922yj c10922yj) {
        IGenericList<AbstractC10914up> iGenericListM52555to = m52555to(i);
        if (iGenericListM52555to.size() == 0) {
            return;
        }
        c10922yj.m52656k4("/{0}", m52556x1(i));
        c10922yj.m52643dy();
        IGenericEnumerator<AbstractC10914up> it = iGenericListM52555to.iterator();
        while (it.hasNext()) {
            try {
                AbstractC10914up next = it.next();
                c10922yj.m52666kk(C14113y2.m67402k4("/{0}", next.m52566ck()), next.m52565c5());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c10922yj.m52640c5();
    }

    /* JADX INFO: renamed from: k4 */
    private static <TValue extends AbstractC10914up> void m52553k4(IGenericList<TValue> iGenericList, C10922yj c10922yj) {
        if (iGenericList.size() == 0) {
            return;
        }
        IGenericEnumerator<TValue> it = iGenericList.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo9082k4(c10922yj);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m52563k4(C10922yj c10922yj) {
        m52552k4(1, c10922yj);
        m52552k4(2, c10922yj);
        m52552k4(3, c10922yj);
        m52552k4(4, c10922yj);
    }
}

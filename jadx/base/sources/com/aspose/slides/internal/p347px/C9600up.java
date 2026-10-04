package com.aspose.slides.internal.p347px;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p437u9.C11292du;
import com.aspose.slides.internal.p437u9.C11293dy;
import com.aspose.slides.internal.p475wh.C12004dy;
import com.aspose.slides.internal.p514xx.C12751to;
import com.aspose.slides.internal.p514xx.C12752x1;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.words.ControlChar;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.px.up */
/* JADX INFO: loaded from: classes4.dex */
public class C9600up {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f34729du;

    /* JADX INFO: renamed from: to */
    private static final List<String> f34730to;

    /* JADX INFO: renamed from: k4 */
    private final Object f34731k4 = new Object();

    /* JADX INFO: renamed from: kk */
    private final Dictionary<String, C9602v4> f34732kk = C12752x1.m59429k4();

    /* JADX INFO: renamed from: x1 */
    private final C11293dy<C9591ks> f34733x1;

    static {
        List<String> list = new List<>();
        f34730to = list;
        list.addItem("light");
        list.addItem("extralight");
        list.addItem("bold");
        f34729du = new C7017h4("Helvetica Neue", "Helvetica", "Khmer", "Lao", "Meiryo", "Segoe");
    }

    public C9600up(AbstractC9608yj[] abstractC9608yjArr) {
        this.f34733x1 = m46887k4(abstractC9608yjArr);
    }

    /* JADX INFO: renamed from: kk */
    public static String m46889kk() {
        return C12004dy.m56524to().m56527du();
    }

    /* JADX INFO: renamed from: k4 */
    public final C9579bv m46891k4() {
        IGenericEnumerator<C9591ks> it = this.f34733x1.getValues().iterator();
        while (it.hasNext()) {
            try {
                C9579bv c9579bvM46894x1 = m46894x1(it.next().m46846k4(), 0, false);
                if (c9579bvM46894x1 != null) {
                    return c9579bvM46894x1;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (!C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            return null;
        }
        it.dispose();
        return null;
    }

    /* JADX INFO: renamed from: x1 */
    public final C9579bv m46894x1(String str, int i, boolean z) {
        C9602v4[] c9602v4Arr = {null};
        boolean zTryGetValue = this.f34732kk.tryGetValue(str, c9602v4Arr);
        C9602v4 c9602v4 = c9602v4Arr[0];
        if (!zTryGetValue) {
            synchronized (this.f34731k4) {
                c9602v4Arr[0] = c9602v4;
                boolean zTryGetValue2 = this.f34732kk.tryGetValue(str, c9602v4Arr);
                C9602v4 c9602v4M46886k4 = c9602v4Arr[0];
                if (!zTryGetValue2) {
                    try {
                        c9602v4M46886k4 = m46886k4(str);
                        this.f34732kk.set_Item(str, c9602v4M46886k4);
                    } catch (RuntimeException unused) {
                        return null;
                    }
                }
                c9602v4 = c9602v4M46886k4;
            }
        }
        return c9602v4.m46901k4(i, i == 3 && !z);
    }

    /* JADX INFO: renamed from: x1 */
    private static boolean m46890x1(String str, String[] strArr) {
        strArr[0] = null;
        C6765kp c6765kp = new C6765kp(str.length());
        boolean z = false;
        for (String str2 : C14113y2.m67414k4(str, ControlChar.SPACE_CHAR)) {
            if (f34730to.containsItem(C14113y2.m67368h4(str2))) {
                z = true;
            } else {
                c6765kp.m26792k4(str2).m26780k4(ControlChar.SPACE_CHAR);
            }
        }
        String string = c6765kp.toString();
        strArr[0] = string;
        strArr[0] = C14113y2.m67362du(string, new char[0]);
        return z;
    }

    /* JADX INFO: renamed from: k4 */
    public final C9579bv m46892k4(int i) {
        C9579bv c9579bvM46894x1 = m46894x1("Times New Roman", i, false);
        return c9579bvM46894x1 == null ? m46894x1(m46889kk(), i, false) : c9579bvM46894x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final C9579bv m46893k4(String str, int i, boolean z) {
        String str2;
        C9579bv c9579bvM46894x1 = m46894x1(str, i, z);
        if (c9579bvM46894x1 == null) {
            int iM27428k4 = f34729du.m27428k4(str);
            if (iM27428k4 == 0 || iM27428k4 == 1) {
                str2 = "Arial";
            } else if (iM27428k4 == 2) {
                str2 = "Khmer UI";
            } else if (iM27428k4 == 3) {
                str2 = "Lao UI";
            } else if (iM27428k4 == 4) {
                str2 = "Meiryo UI";
            } else if (iM27428k4 != 5) {
                String[] strArr = {null};
                m46888k4(str, strArr);
                str2 = strArr[0];
            } else {
                str2 = "Segoe UI";
            }
            if (C11292du.m54264k4(str2)) {
                return m46894x1(str2, i, true);
            }
        }
        return c9579bvM46894x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final C9606x6[] m46895x1() {
        C9606x6[] c9606x6Arr = new C9606x6[this.f34733x1.size()];
        for (int i = 0; i < this.f34733x1.getValues().size(); i++) {
            C9591ks c9591ks = this.f34733x1.getValues().get_Item(i);
            c9606x6Arr[i] = new C9606x6(c9591ks.m46846k4(), c9591ks.m46845du() != null ? c9591ks.m46845du().f34672x6 : null);
        }
        return c9606x6Arr;
    }

    /* JADX INFO: renamed from: k4 */
    private C9602v4 m46886k4(String str) {
        C9602v4 c9602v4 = new C9602v4(str);
        IGenericEnumerator<C9591ks> it = this.f34733x1.getValues().iterator();
        while (it.hasNext()) {
            try {
                C9591ks next = it.next();
                if (C12751to.m59428k4(str, next.m46846k4()) || C12751to.m59428k4(str, next.m46852x1())) {
                    C9579bv c9579bvM46869k4 = new C9592lr().m46869k4(next.m46850kk(), next.m46852x1());
                    if (c9579bvM46869k4.m46788k4(str)) {
                        c9602v4.m46902k4(c9579bvM46869k4);
                    }
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        return c9602v4;
    }

    /* JADX INFO: renamed from: k4 */
    private static C11293dy<C9591ks> m46887k4(AbstractC9608yj[] abstractC9608yjArr) {
        C11293dy<C9591ks> c11293dy = new C11293dy<>(false);
        C9592lr c9592lr = new C9592lr();
        for (AbstractC9608yj abstractC9608yj : abstractC9608yjArr) {
            try {
                C9591ks[] c9591ksArrM46871k4 = c9592lr.m46871k4(abstractC9608yj);
                if (c9591ksArrM46871k4 != null) {
                    for (C9591ks c9591ks : c9591ksArrM46871k4) {
                        C9591ks[] c9591ksArr = {null};
                        boolean z = !c11293dy.tryGetValue(c9591ks.m46852x1(), c9591ksArr) || c9591ks.m46851to();
                        C9591ks c9591ks2 = c9591ksArr[0];
                        if (z) {
                            c11293dy.set_Item(c9591ks.m46852x1(), c9591ks);
                        }
                        if (c9591ks2 != null && !C14113y2.m67363du(c9591ks2.m46846k4(), c9591ks.m46846k4()) && !c11293dy.containsKey(c9591ks.m46846k4())) {
                            c11293dy.set_Item(c9591ks.m46846k4(), c9591ks);
                        }
                    }
                }
            } catch (RuntimeException unused) {
            }
        }
        return c11293dy;
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m46888k4(String str, String[] strArr) {
        C12004dy c12004dy;
        try {
            try {
                c12004dy = new C12004dy(str);
            } catch (ArgumentException e) {
                String[] strArr2 = {null};
                boolean zM46890x1 = m46890x1(str, strArr2);
                String str2 = strArr2[0];
                if (!zM46890x1) {
                    throw e;
                }
                c12004dy = new C12004dy(str2);
            }
            strArr[0] = c12004dy.m56527du();
            return true;
        } catch (RuntimeException unused) {
            strArr[0] = null;
            return false;
        }
    }
}

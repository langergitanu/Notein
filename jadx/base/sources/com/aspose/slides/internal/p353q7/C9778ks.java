package com.aspose.slides.internal.p353q7;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.KeyNotFoundException;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p346pw.C9571du;
import com.aspose.slides.internal.p346pw.C9575x1;
import com.aspose.slides.internal.p463vm.C11690k4;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.internal.p475wh.C12004dy;
import com.aspose.slides.internal.p505xn.C12562jd;
import com.aspose.slides.internal.p505xn.C12565ks;
import com.aspose.slides.internal.p505xn.C12571u4;
import com.aspose.slides.p559ms.System.AbstractC14070jw;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.words.ControlChar;
import java.text.Collator;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.q7.ks */
/* JADX INFO: loaded from: classes4.dex */
public class C9778ks {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f35319du;

    /* JADX INFO: renamed from: to */
    private static final List<String> f35320to;

    /* JADX INFO: renamed from: k4 */
    private final Object f35321k4 = new Object();

    /* JADX INFO: renamed from: kk */
    private final Dictionary<String, C9767e0> f35322kk = C9575x1.m46750k4();

    /* JADX INFO: renamed from: x1 */
    private final C12571u4<List<C9800x6>> f35323x1 = new C12571u4<>(new k4(C11697x1.m55252to(), true));

    /* JADX INFO: renamed from: com.aspose.slides.internal.q7.ks$k4 */
    public final class k4 extends AbstractC14070jw {

        /* JADX INFO: renamed from: h4 */
        private boolean f35325h4;

        /* JADX INFO: renamed from: m9 */
        private C11690k4 f35326m9;

        public k4(C11697x1 c11697x1, boolean z) {
            this.f35326m9 = c11697x1.m55271up();
            this.f35325h4 = z;
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14070jw, java.util.Comparator
        /* JADX INFO: renamed from: k4 */
        public int compare(String str, String str2) {
            Collator collator = Collator.getInstance();
            collator.setDecomposition(1);
            collator.setStrength(this.f35325h4 ? 1 : 2);
            return collator.compare(str, str2);
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14070jw, com.aspose.slides.Collections.Generic.IGenericEqualityComparer
        /* JADX INFO: renamed from: x1 */
        public int hashCodeT(String str) {
            if (str != null) {
                return this.f35326m9.m55133k4(str, 0L).hashCode();
            }
            throw new ArgumentNullException("s");
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14070jw, com.aspose.slides.Collections.Generic.IGenericEqualityComparer
        /* JADX INFO: renamed from: x1 */
        public boolean equalsT(String str, String str2) {
            return compare(str, str2) == 0;
        }
    }

    static {
        List<String> list = new List<>();
        f35320to = list;
        list.addItem("light");
        list.addItem("extralight");
        list.addItem("bold");
        f35319du = new C7017h4("Helvetica Neue", "Helvetica", "Khmer", "Lao", "Meiryo", "Segoe", "Humnst777CnBT,Bold");
    }

    public C9778ks(AbstractC9784rv[] abstractC9784rvArr) {
        IGenericEnumerator<C9800x6> it = m48110k4(abstractC9784rvArr).iterator();
        while (it.hasNext()) {
            try {
                C9800x6 next = it.next();
                try {
                    Object[] objArr = {null};
                    boolean zTryGetValue = this.f35323x1.tryGetValue(next.m48303k4(), objArr);
                    List list = (List) objArr[0];
                    if (!zTryGetValue) {
                        List<C9800x6> list2 = new List<>();
                        list2.addItem(next);
                        this.f35323x1.addItem(next.m48303k4(), list2);
                    }
                    if (list != null) {
                        list.addItem(next);
                    }
                } catch (KeyNotFoundException unused) {
                }
                try {
                    Object[] objArr2 = {null};
                    boolean zTryGetValue2 = this.f35323x1.tryGetValue(next.m48309x1(), objArr2);
                    List list3 = (List) objArr2[0];
                    if (!zTryGetValue2) {
                        List<C9800x6> list4 = new List<>();
                        list4.addItem(next);
                        this.f35323x1.addItem(next.m48309x1(), list4);
                    }
                    if (list3 != null) {
                        list3.addItem(next);
                    }
                } catch (KeyNotFoundException unused2) {
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
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    private C9767e0 m48109k4(String str) {
        C9767e0 c9767e0 = new C9767e0(str);
        C9767e0 c9767e02 = new C9767e0(str);
        List[] listArr = {null};
        boolean zTryGetValue = this.f35323x1.tryGetValue(str, listArr);
        List list = listArr[0];
        if (zTryGetValue) {
            Dictionary dictionary = new Dictionary();
            List list2 = new List();
            List list3 = new List();
            List.Enumerator it = list.iterator();
            while (it.hasNext()) {
                try {
                    C9800x6 c9800x6 = (C9800x6) it.next();
                    if (C9571du.m46734k4(str, c9800x6.m48309x1())) {
                        list3.addItem(c9800x6);
                    } else {
                        list2.addItem(c9800x6);
                    }
                } finally {
                }
            }
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                it.dispose();
            }
            List list4 = new List(list2);
            list4.addRange(list3);
            it = list4.iterator();
            while (it.hasNext()) {
                try {
                    C9800x6 c9800x62 = (C9800x6) it.next();
                    boolean zContainsKey = dictionary.containsKey(c9800x62.m48307kk());
                    if (!zContainsKey || c9800x62.m48308to()) {
                        C9790ts c9790tsM48011k4 = new C9760bz().m48011k4(c9800x62.m48307kk(), c9800x62.m48309x1());
                        if (c9790tsM48011k4.m48214k4(str, false)) {
                            c9767e0.m48050k4(c9790tsM48011k4);
                        }
                        if (c9790tsM48011k4.m48214k4(str, true)) {
                            c9767e02.m48050k4(c9790tsM48011k4);
                        }
                        if (!zContainsKey) {
                            dictionary.addItem(c9800x62.m48307kk(), 0);
                        }
                    }
                } finally {
                }
            }
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                it.dispose();
            }
        }
        return c9767e0.m48048k4() != 0 ? c9767e0 : c9767e02;
    }

    /* JADX INFO: renamed from: to */
    public static String m48112to() {
        return C12004dy.m56524to().m56527du();
    }

    /* JADX INFO: renamed from: kk */
    public final void m48117kk() {
        synchronized (this.f35321k4) {
            this.f35322kk.clear();
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final C9790ts m48118x1(String str, int i, boolean z) {
        C9767e0 c9767e0M48109k4;
        synchronized (this.f35321k4) {
            C9767e0[] c9767e0Arr = {null};
            boolean zTryGetValue = this.f35322kk.tryGetValue(str, c9767e0Arr);
            c9767e0M48109k4 = c9767e0Arr[0];
            if (!zTryGetValue) {
                try {
                    c9767e0M48109k4 = m48109k4(str);
                    this.f35322kk.set_Item(str, c9767e0M48109k4);
                } catch (RuntimeException unused) {
                    return null;
                }
            }
        }
        return c9767e0M48109k4.m48049k4(i, i == 3 && !z);
    }

    /* JADX INFO: renamed from: x1 */
    private static boolean m48113x1(String str, String[] strArr) {
        strArr[0] = null;
        C6765kp c6765kp = new C6765kp(str.length());
        boolean z = false;
        for (String str2 : C14113y2.m67414k4(str, ControlChar.SPACE_CHAR)) {
            if (f35320to.containsItem(C14113y2.m67368h4(str2))) {
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
    public final C9790ts m48114k4() {
        IGenericEnumerator<List<C9800x6>> it = this.f35323x1.getValues().iterator();
        while (it.hasNext()) {
            try {
                List.Enumerator<C9800x6> it2 = it.next().iterator();
                while (it2.hasNext()) {
                    try {
                        C9790ts c9790tsM48118x1 = m48118x1(it2.next().m48303k4(), 0, false);
                        if (c9790tsM48118x1 != null) {
                            return c9790tsM48118x1;
                        }
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                            it2.dispose();
                        }
                    }
                }
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
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

    /* JADX INFO: renamed from: k4 */
    public final C9790ts m48115k4(int i) {
        C9790ts c9790tsM48118x1 = m48118x1("Times New Roman", i, false);
        return c9790tsM48118x1 == null ? m48118x1(m48112to(), i, false) : c9790tsM48118x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final C9773ix[] m48119x1() {
        List list = new List(this.f35323x1.size());
        IGenericEnumerator<List<C9800x6>> it = this.f35323x1.getValues().iterator();
        while (it.hasNext()) {
            try {
                List.Enumerator<C9800x6> it2 = it.next().iterator();
                while (it2.hasNext()) {
                    try {
                        C9800x6 next = it2.next();
                        list.addItem(new C9773ix(next.m48303k4(), next.m48302du() != null ? next.m48302du().f35473x6 : null));
                    } finally {
                    }
                }
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
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
        return (C9773ix[]) list.toArray(new C9773ix[0]);
    }

    /* JADX INFO: renamed from: k4 */
    public final C9790ts m48116k4(String str, int i, boolean z) {
        String str2;
        C9790ts c9790tsM48118x1 = m48118x1(str, i, z);
        if (c9790tsM48118x1 == null) {
            switch (f35319du.m27428k4(str)) {
                case 0:
                case 1:
                    str2 = "Arial";
                    break;
                case 2:
                    str2 = "Khmer UI";
                    break;
                case 3:
                    str2 = "Lao UI";
                    break;
                case 4:
                    str2 = "Meiryo UI";
                    break;
                case 5:
                    str2 = "Segoe UI";
                    break;
                case 6:
                    str2 = "Calibri";
                    break;
                default:
                    String[] strArr = {null};
                    m48111k4(str, strArr);
                    str2 = strArr[0];
                    break;
            }
            if (C12565ks.m58630x1(str2)) {
                return m48118x1(str2, i, true);
            }
        }
        return c9790tsM48118x1;
    }

    /* JADX INFO: renamed from: k4 */
    private static C12562jd m48110k4(AbstractC9784rv[] abstractC9784rvArr) {
        C12562jd c12562jd = new C12562jd(AbstractC14070jw.m66789to());
        C9760bz c9760bz = new C9760bz();
        for (AbstractC9784rv abstractC9784rv : abstractC9784rvArr) {
            try {
                C9800x6[] c9800x6ArrM48016k4 = c9760bz.m48016k4(abstractC9784rv);
                if (c9800x6ArrM48016k4 != null) {
                    for (C9800x6 c9800x6 : c9800x6ArrM48016k4) {
                        c12562jd.addItem(c9800x6);
                    }
                }
            } catch (RuntimeException unused) {
            }
        }
        return c12562jd;
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m48111k4(String str, String[] strArr) {
        C12004dy c12004dy;
        try {
            try {
                c12004dy = new C12004dy(str);
            } catch (ArgumentException e) {
                String[] strArr2 = {null};
                boolean zM48113x1 = m48113x1(str, strArr2);
                String str2 = strArr2[0];
                if (!zM48113x1) {
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

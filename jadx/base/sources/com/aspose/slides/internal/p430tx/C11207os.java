package com.aspose.slides.internal.p430tx;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.Collections.IDictionaryEnumerator;
import com.aspose.slides.exceptions.XsltException;
import com.aspose.slides.internal.p418tf.AbstractC10925du;
import com.aspose.slides.p559ms.System.Xml.C13890ei;

/* JADX INFO: renamed from: com.aspose.slides.internal.tx.os */
/* JADX INFO: loaded from: classes4.dex */
public class C11207os {

    /* JADX INFO: renamed from: du */
    private int f38612du;

    /* JADX INFO: renamed from: dy */
    private boolean f38613dy;

    /* JADX INFO: renamed from: h4 */
    private Hashtable f38614h4;

    /* JADX INFO: renamed from: jd */
    private C11211ri f38615jd;

    /* JADX INFO: renamed from: m9 */
    private ArrayList f38618m9;

    /* JADX INFO: renamed from: to */
    private Hashtable f38619to;

    /* JADX INFO: renamed from: x1 */
    private Hashtable f38620x1;

    /* JADX INFO: renamed from: k4 */
    private ArrayList f38616k4 = new ArrayList();

    /* JADX INFO: renamed from: kk */
    private Hashtable f38617kk = new Hashtable();

    /* JADX INFO: renamed from: c5 */
    private Hashtable f38611c5 = new Hashtable();

    /* JADX INFO: renamed from: com.aspose.slides.internal.tx.os$k4 */
    public static class k4 {

        /* JADX INFO: renamed from: k4 */
        private int f38621k4;

        /* JADX INFO: renamed from: kk */
        private boolean f38622kk;

        /* JADX INFO: renamed from: x1 */
        private double f38623x1;

        public k4(int i, double d, boolean z) {
            this.f38621k4 = i;
            this.f38623x1 = d;
            this.f38622kk = z;
        }

        /* JADX INFO: renamed from: k4 */
        public final double m53877k4() {
            return this.f38623x1;
        }

        /* JADX INFO: renamed from: kk */
        public final boolean m53879kk() {
            return this.f38622kk;
        }

        /* JADX INFO: renamed from: x1 */
        public final int m53880x1() {
            return this.f38621k4;
        }

        /* JADX INFO: renamed from: k4 */
        public final void m53878k4(boolean z) {
            this.f38622kk = z;
        }
    }

    /* JADX INFO: renamed from: du */
    public final void m53861du() {
        Hashtable hashtable = this.f38620x1;
        if (hashtable != null) {
            IDictionaryEnumerator it = hashtable.iterator();
            while (it.hasNext()) {
                ((C11211ri) it.getValue()).m53893k4();
            }
        }
        ArrayList arrayList = this.f38616k4;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((C11207os) this.f38616k4.get_Item(size)).m53861du();
            }
        }
    }

    /* JADX INFO: renamed from: h4 */
    public final Hashtable m53862h4() {
        return this.f38611c5;
    }

    /* JADX INFO: renamed from: k4 */
    public final C11183em m53863k4(C11234xw c11234xw, AbstractC10925du abstractC10925du, C13890ei c13890ei) {
        C11211ri c11211ri;
        Hashtable hashtable = this.f38620x1;
        C11183em c11183emM53892k4 = (hashtable == null || (c11211ri = (C11211ri) hashtable.get_Item(c13890ei)) == null) ? null : c11211ri.m53892k4(c11234xw, abstractC10925du);
        return c11183emM53892k4 == null ? m53876x1(c11234xw, abstractC10925du, c13890ei) : c11183emM53892k4;
    }

    /* JADX INFO: renamed from: kk */
    public final Hashtable m53871kk() {
        return this.f38619to;
    }

    /* JADX INFO: renamed from: to */
    public final void m53873to() {
        if (this.f38614h4 != null) {
            for (int i = 0; i < this.f38618m9.size(); i++) {
                for (int size = this.f38618m9.size() - 1; size > i; size--) {
                    int i2 = size - 1;
                    k4 k4Var = (k4) this.f38618m9.get_Item(i2);
                    k4 k4Var2 = (k4) this.f38618m9.get_Item(size);
                    if (k4Var2.m53877k4() < k4Var.m53877k4()) {
                        this.f38618m9.set_Item(i2, k4Var2);
                        this.f38618m9.set_Item(size, k4Var);
                    }
                }
            }
            this.f38613dy = true;
        }
        ArrayList arrayList = this.f38616k4;
        if (arrayList != null) {
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                C11207os c11207os = (C11207os) this.f38616k4.get_Item(size2);
                if (c11207os.m53869k4()) {
                    c11207os.m53873to();
                    this.f38613dy = true;
                }
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final ArrayList m53874x1() {
        return this.f38616k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final C11183em m53864k4(C13890ei c13890ei) {
        ArrayList arrayList;
        Hashtable hashtable = this.f38617kk;
        C11183em c11183emM53864k4 = hashtable != null ? (C11183em) hashtable.get_Item(c13890ei) : null;
        if (c11183emM53864k4 == null && (arrayList = this.f38616k4) != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                c11183emM53864k4 = ((C11207os) this.f38616k4.get_Item(size)).m53864k4(c13890ei);
                if (c11183emM53864k4 != null) {
                    return c11183emM53864k4;
                }
            }
        }
        return c11183emM53864k4;
    }

    /* JADX INFO: renamed from: kk */
    public final C11183em m53872kk(C11234xw c11234xw, AbstractC10925du abstractC10925du) {
        ArrayList arrayList = this.f38616k4;
        C11183em c11183emM53875x1 = null;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                c11183emM53875x1 = ((C11207os) this.f38616k4.get_Item(size)).m53875x1(c11234xw, abstractC10925du);
                if (c11183emM53875x1 != null) {
                    return c11183emM53875x1;
                }
            }
        }
        return c11183emM53875x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final C11183em m53875x1(C11234xw c11234xw, AbstractC10925du abstractC10925du) {
        C11211ri c11211ri = this.f38615jd;
        C11183em c11183emM53892k4 = c11211ri != null ? c11211ri.m53892k4(c11234xw, abstractC10925du) : null;
        return c11183emM53892k4 == null ? m53872kk(c11234xw, abstractC10925du) : c11183emM53892k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53865k4(C11183em c11183em) {
        C13890ei c13890eiM53720to = c11183em.m53720to();
        if (c11183em.m53721x1() != null) {
            if (this.f38617kk.containsKey(c11183em.m53721x1())) {
                throw XsltException.create("'{0}' is a duplicate template name.", c11183em.m53721x1().toString());
            }
            this.f38617kk.set_Item(c11183em.m53721x1(), c11183em);
        }
        if (c11183em.m53716k4() != -1) {
            if (this.f38620x1 == null) {
                this.f38620x1 = new Hashtable();
            }
            if (c13890eiM53720to == null) {
                c13890eiM53720to = C13890ei.f46456k4;
            }
            C11211ri c11211ri = (C11211ri) this.f38620x1.get_Item(c13890eiM53720to);
            if (c11211ri == null) {
                c11211ri = new C11211ri(this, c13890eiM53720to);
                this.f38620x1.set_Item(c13890eiM53720to, c11211ri);
                if (c13890eiM53720to.m65287kk()) {
                    this.f38615jd = c11211ri;
                }
            }
            int i = this.f38612du + 1;
            this.f38612du = i;
            c11183em.m53722x1(i);
            c11211ri.m53894k4(c11183em);
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final C11183em m53876x1(C11234xw c11234xw, AbstractC10925du abstractC10925du, C13890ei c13890ei) {
        ArrayList arrayList = this.f38616k4;
        C11183em c11183emM53863k4 = null;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                c11183emM53863k4 = ((C11207os) this.f38616k4.get_Item(size)).m53863k4(c11234xw, abstractC10925du, c13890ei);
                if (c11183emM53863k4 != null) {
                    return c11183emM53863k4;
                }
            }
        }
        return c11183emM53863k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53866k4(C11189h4 c11189h4) {
        if (this.f38619to == null) {
            this.f38619to = new Hashtable();
        }
        if (this.f38619to.containsKey(c11189h4.m53801k4())) {
            ((C11189h4) this.f38619to.get_Item(c11189h4.m53801k4())).m53802k4(c11189h4);
        } else {
            this.f38619to.set_Item(c11189h4.m53801k4(), c11189h4);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53867k4(C11212rv c11212rv) {
        Hashtable hashtable = this.f38620x1;
        if (hashtable != null) {
            IDictionaryEnumerator it = hashtable.iterator();
            while (it.hasNext()) {
                C11211ri c11211ri = (C11211ri) it.getValue();
                if (c11211ri.f38633k4 != null) {
                    for (int i = 0; i < c11211ri.f38633k4.size(); i++) {
                        ((C11183em) c11211ri.f38633k4.get_Item(i)).mo53717k4(c11212rv);
                    }
                }
            }
        }
        Hashtable hashtable2 = this.f38617kk;
        if (hashtable2 != null) {
            IDictionaryEnumerator it2 = hashtable2.iterator();
            while (it2.hasNext()) {
                ((C11183em) it2.getValue()).mo53717k4(c11212rv);
            }
        }
        ArrayList arrayList = this.f38616k4;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((C11207os) this.f38616k4.get_Item(size)).m53867k4(c11212rv);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53868k4(C11212rv c11212rv, String str, double d, boolean z) {
        Hashtable hashtable = this.f38614h4;
        if (hashtable == null) {
            this.f38614h4 = new Hashtable();
            this.f38618m9 = new ArrayList();
        } else if (hashtable.contains(str)) {
            ((k4) this.f38614h4.get_Item(str)).m53878k4(z);
            return;
        }
        k4 k4Var = new k4(c11212rv.m53987yj(str), d, z);
        this.f38614h4.set_Item(str, k4Var);
        this.f38618m9.addItem(k4Var);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m53869k4() {
        return this.f38613dy;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m53870k4(C11234xw c11234xw, AbstractC10925du abstractC10925du) {
        ArrayList arrayList = this.f38618m9;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                k4 k4Var = (k4) this.f38618m9.get_Item(size);
                if (c11234xw.m54190k4(abstractC10925du, k4Var.m53880x1())) {
                    return k4Var.m53879kk();
                }
            }
        }
        ArrayList arrayList2 = this.f38616k4;
        if (arrayList2 != null) {
            for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                if (!((C11207os) this.f38616k4.get_Item(size2)).m53870k4(c11234xw, abstractC10925du)) {
                    return false;
                }
            }
        }
        return true;
    }
}

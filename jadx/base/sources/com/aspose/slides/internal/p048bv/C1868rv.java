package com.aspose.slides.internal.p048bv;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p174hz.AbstractC4718gk;
import com.aspose.slides.internal.p314oc.C7016dy;
import com.aspose.slides.internal.p353q7.C9758b3;
import com.aspose.slides.internal.p353q7.C9760bz;
import com.aspose.slides.internal.p353q7.C9790ts;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;

/* JADX INFO: renamed from: com.aspose.slides.internal.bv.rv */
/* JADX INFO: loaded from: classes3.dex */
public class C1868rv implements IDisposable {

    /* JADX INFO: renamed from: k4 */
    private static final C7016dy<C1868rv> f6738k4 = new C7016dy<>(null);

    /* JADX INFO: renamed from: x1 */
    private Dictionary<String, List<k4>> f6739x1 = new Dictionary<>();

    /* JADX INFO: renamed from: com.aspose.slides.internal.bv.rv$k4 */
    public static class k4 {

        /* JADX INFO: renamed from: k4 */
        private C9790ts f6740k4;

        /* JADX INFO: renamed from: kk */
        private String f6741kk;

        /* JADX INFO: renamed from: to */
        private byte[] f6742to;

        /* JADX INFO: renamed from: x1 */
        private int f6743x1;

        public k4(C9790ts c9790ts, int i, String str) {
            this.f6740k4 = c9790ts;
            this.f6743x1 = i;
            this.f6741kk = str;
        }

        /* JADX INFO: renamed from: k4 */
        public final C9790ts m9786k4() {
            return this.f6740k4;
        }

        /* JADX INFO: renamed from: kk */
        public final String m9788kk() {
            return this.f6741kk;
        }

        /* JADX INFO: renamed from: x1 */
        public final int m9789x1() {
            return this.f6743x1;
        }

        public k4(C9790ts c9790ts, int i, String str, byte[] bArr) {
            this(c9790ts, i, str);
            this.f6742to = bArr;
        }

        /* JADX INFO: renamed from: k4 */
        public final boolean m9787k4(byte[] bArr) {
            if (this.f6742to == null) {
                AbstractC3150x6 abstractC3150x6Mo47984x1 = this.f6740k4.m48233um().mo47984x1();
                try {
                    AbstractC4718gk abstractC4718gkM19620du = AbstractC4718gk.m19620du();
                    try {
                        this.f6742to = abstractC4718gkM19620du.m19585k4(abstractC3150x6Mo47984x1);
                        abstractC4718gkM19620du.dispose();
                    } catch (Throwable th) {
                        if (abstractC4718gkM19620du != null) {
                            abstractC4718gkM19620du.dispose();
                        }
                        throw th;
                    }
                } finally {
                    if (abstractC3150x6Mo47984x1 != null) {
                        abstractC3150x6Mo47984x1.dispose();
                    }
                }
            }
            if (bArr.length != this.f6742to.length) {
                return false;
            }
            for (int i = 0; i < bArr.length; i++) {
                if ((bArr[i] & 255) != (this.f6742to[i] & 255)) {
                    return false;
                }
            }
            return true;
        }
    }

    private C1868rv() {
    }

    /* JADX INFO: renamed from: k4 */
    private static int m9777k4(List<k4> list, String str, int i) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            k4 k4Var = list.get_Item(i2);
            if (C14113y2.m67363du(k4Var.m9788kk(), str) && k4Var.m9789x1() == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public final void dispose() {
        f6738k4.set(null);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m9785x1(String str, String str2, int i, byte[] bArr) {
        String strM67398k4 = C14113y2.m67398k4(str, C11697x1.m55250kk());
        k4 k4Var = new k4(m9780k4(strM67398k4, bArr), i, str2);
        List<k4> list = this.f6739x1.containsKey(strM67398k4) ? this.f6739x1.get_Item(strM67398k4) : null;
        if (list == null) {
            List<k4> list2 = new List<>();
            list2.addItem(k4Var);
            this.f6739x1.set_Item(strM67398k4, list2);
        } else {
            int iM9777k4 = m9777k4(list, str2, i);
            if (iM9777k4 != -1) {
                list.set_Item(iM9777k4, k4Var);
            }
            list.addItem(k4Var);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static C1868rv m9778k4() {
        C7016dy<C1868rv> c7016dy = f6738k4;
        if (c7016dy.get() == null) {
            c7016dy.set(new C1868rv());
        }
        return c7016dy.get();
    }

    /* JADX INFO: renamed from: k4 */
    public static C1868rv m9779k4(boolean[] zArr) {
        zArr[0] = true;
        C7016dy<C1868rv> c7016dy = f6738k4;
        if (c7016dy.get() == null) {
            c7016dy.set(new C1868rv());
            zArr[0] = false;
        }
        return c7016dy.get();
    }

    /* JADX INFO: renamed from: k4 */
    public final C9790ts m9782k4(String str, String str2, int i) {
        int iM9777k4;
        String strM67398k4 = C14113y2.m67398k4(str, C11697x1.m55250kk());
        List<k4> list = this.f6739x1.containsKey(strM67398k4) ? this.f6739x1.get_Item(strM67398k4) : null;
        if (list == null || (iM9777k4 = m9777k4(list, str2, i)) == -1) {
            return null;
        }
        return list.get_Item(iM9777k4).m9786k4();
    }

    /* JADX INFO: renamed from: k4 */
    private static C9790ts m9780k4(String str, byte[] bArr) {
        return new C9760bz().m48011k4(new C9758b3(bArr), str);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m9783k4(String str, String str2, int i, C9790ts c9790ts) {
        String strM67398k4 = C14113y2.m67398k4(str, C11697x1.m55250kk());
        List<k4> list = this.f6739x1.containsKey(strM67398k4) ? this.f6739x1.get_Item(strM67398k4) : null;
        if (list == null) {
            List<k4> list2 = new List<>();
            list2.addItem(new k4(c9790ts, i, str2));
            this.f6739x1.set_Item(strM67398k4, list2);
        } else {
            int iM9777k4 = m9777k4(list, str2, i);
            byte[] bArrM9781k4 = m9781k4(c9790ts);
            if (iM9777k4 == -1 || !list.get_Item(iM9777k4).m9787k4(bArrM9781k4)) {
                list.addItem(new k4(c9790ts, i, str2, bArrM9781k4));
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m9784k4(String str, String str2, int i, byte[] bArr) {
        m9783k4(str, str2, i, m9780k4(str, bArr));
    }

    /* JADX INFO: renamed from: k4 */
    private static byte[] m9781k4(C9790ts c9790ts) {
        AbstractC3150x6 abstractC3150x6Mo47984x1 = c9790ts.m48233um().mo47984x1();
        try {
            AbstractC4718gk abstractC4718gkM19620du = AbstractC4718gk.m19620du();
            try {
                byte[] bArrM19585k4 = abstractC4718gkM19620du.m19585k4(abstractC3150x6Mo47984x1);
                abstractC4718gkM19620du.dispose();
                return bArrM19585k4;
            } catch (Throwable th) {
                if (abstractC4718gkM19620du != null) {
                    abstractC4718gkM19620du.dispose();
                }
                throw th;
            }
        } finally {
            if (abstractC3150x6Mo47984x1 != null) {
                abstractC3150x6Mo47984x1.dispose();
            }
        }
    }
}

package com.aspose.slides.internal.p474wg;

import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.Collections.IDictionaryEnumerator;
import com.aspose.slides.Collections.IEnumerable;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14062gk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.orion.notein.richeditor.utils.p606io.IOUtils;

/* JADX INFO: renamed from: com.aspose.slides.internal.wg.fa */
/* JADX INFO: loaded from: classes5.dex */
public class C11935fa implements IEnumerable, InterfaceC11926c6 {

    /* JADX INFO: renamed from: k4 */
    static C11950kp f40232k4;

    /* JADX INFO: renamed from: x1 */
    private Hashtable f40233x1;

    /* JADX INFO: renamed from: com.aspose.slides.internal.wg.fa$k4 */
    public static class k4 {

        /* JADX INFO: renamed from: du */
        private int f40234du;

        /* JADX INFO: renamed from: k4 */
        private C14062gk f40235k4;

        /* JADX INFO: renamed from: kk */
        private String f40236kk;

        /* JADX INFO: renamed from: to */
        private int f40237to;

        /* JADX INFO: renamed from: x1 */
        private String f40238x1;

        public boolean equals(Object obj) {
            k4 k4Var = (k4) C7019kk.m27452k4(obj, k4.class);
            return k4Var != null && this.f40234du == k4Var.f40234du;
        }

        public int hashCode() {
            return this.f40234du;
        }

        /* JADX INFO: renamed from: k4 */
        public int m55966k4() {
            return this.f40237to;
        }

        /* JADX INFO: renamed from: kk */
        public C14062gk m55967kk() {
            return this.f40235k4;
        }

        /* JADX INFO: renamed from: to */
        public String m55968to() {
            return this.f40238x1;
        }

        public String toString() {
            return C14113y2.m67408k4(this.f40236kk, " : ", this.f40238x1, " : len=", C14057f9.m66591x1(this.f40237to));
        }

        /* JADX INFO: renamed from: x1 */
        public String m55969x1() {
            return this.f40236kk;
        }
    }

    static {
        String str = C14113y2.f47374k4;
        f40232k4 = new C11950kp(str, str, str);
    }

    /* JADX INFO: renamed from: k4 */
    public static InterfaceC11926c6 m55965k4() {
        return f40232k4;
    }

    @Override // java.lang.Iterable
    public IEnumerator iterator() {
        return this.f40233x1.getValues().iterator();
    }

    @Override // com.aspose.slides.internal.p474wg.InterfaceC11926c6
    /* JADX INFO: renamed from: k4 */
    public C11950kp mo55894k4(C14062gk c14062gk, String str) {
        C11950kp c11950kp = null;
        if (c14062gk != null && str != null) {
            String strM66686k4 = c14062gk.m66686k4();
            String strM67443x1 = C14113y2.m67443x1(strM66686k4, 0, C14113y2.m67418kk(strM66686k4, IOUtils.DIR_SEPARATOR_UNIX));
            IDictionaryEnumerator it = this.f40233x1.iterator();
            int iM55966k4 = -1;
            while (it.hasNext()) {
                k4 k4Var = (k4) C7019kk.m27452k4(it.getKey(), k4.class);
                if (k4Var.m55966k4() > iM55966k4 && C14113y2.m67382k4(k4Var.m55968to(), str, true) == 0) {
                    C14062gk c14062gkM55967kk = k4Var.m55967kk();
                    if (C14113y2.m67363du(c14062gkM55967kk.m66689ks(), c14062gk.m66689ks()) && c14062gkM55967kk.m66695up() == c14062gk.m66695up() && C14113y2.m67363du(c14062gkM55967kk.m66678du(), c14062gk.m66678du()) && C14113y2.m67448x1(strM67443x1, k4Var.m55969x1())) {
                        iM55966k4 = k4Var.m55966k4();
                        c11950kp = (C11950kp) it.getValue();
                    }
                }
            }
        }
        return c11950kp;
    }
}

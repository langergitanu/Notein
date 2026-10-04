package com.aspose.slides.internal.p270m9;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p231kk.AbstractC5788h4;
import com.aspose.slides.internal.p231kk.InterfaceC5810wl;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p423to.C11070k4;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.m9.x1 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC6355x1 implements InterfaceC5810wl {

    /* JADX INFO: renamed from: k4 */
    private List<k4> f18076k4;

    /* JADX INFO: renamed from: kk */
    private C6344m9 f18077kk;

    /* JADX INFO: renamed from: x1 */
    private C11070k4<Integer, Integer> f18078x1 = new C11070k4<>(Integer.class, Integer.class, -1);

    /* JADX INFO: renamed from: com.aspose.slides.internal.m9.x1$k4 */
    public static class k4 {

        /* JADX INFO: renamed from: k4 */
        private AbstractC5788h4 f18079k4;

        /* JADX INFO: renamed from: kk */
        private boolean f18080kk;

        /* JADX INFO: renamed from: x1 */
        private int f18081x1;

        /* JADX INFO: renamed from: com.aspose.slides.internal.m9.x1$k4$k4, reason: collision with other inner class name */
        public static class C19066k4 implements IGenericEnumerator<String> {

            /* JADX INFO: renamed from: k4 */
            private IGenericEnumerator<k4> f18082k4;

            public C19066k4(IGenericList<k4> iGenericList) {
                this.f18082k4 = iGenericList.iterator();
            }

            @Override // com.aspose.slides.p559ms.System.IDisposable
            public final void dispose() {
                this.f18082k4.dispose();
            }

            @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
            public final boolean hasNext() {
                return this.f18082k4.hasNext();
            }

            @Override // com.aspose.slides.Collections.Generic.IGenericEnumerator, com.aspose.slides.Collections.IEnumerator, java.util.Iterator
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public final String next() {
                return this.f18082k4.next().m26041k4().toString();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }

            @Override // com.aspose.slides.Collections.IEnumerator
            public final void reset() {
                this.f18082k4.reset();
            }
        }

        private k4() {
        }

        /* JADX INFO: renamed from: k4 */
        public final AbstractC5788h4 m26041k4() {
            return this.f18079k4;
        }

        /* JADX INFO: renamed from: kk */
        public final boolean m26045kk() {
            return this.f18080kk;
        }

        /* JADX INFO: renamed from: x1 */
        public final int m26046x1() {
            return this.f18081x1;
        }

        /* JADX INFO: renamed from: k4 */
        public final void m26042k4(int i) {
            this.f18081x1 = i;
        }

        /* JADX INFO: renamed from: k4 */
        public final void m26043k4(AbstractC5788h4 abstractC5788h4) {
            this.f18079k4 = abstractC5788h4;
        }

        /* JADX INFO: renamed from: k4 */
        public final void m26044k4(boolean z) {
            this.f18080kk = z;
        }
    }

    public AbstractC6355x1(C6344m9 c6344m9) {
        this.f18077kk = c6344m9;
        this.f18076k4 = new List<>(c6344m9.m25981du());
    }

    /* JADX INFO: renamed from: du */
    public final boolean m26035du(int i) {
        return this.f18076k4.get_Item(i).m26045kk();
    }

    @Override // java.lang.Iterable
    public final IGenericEnumerator<String> iterator() {
        return new k4.C19066k4(this.f18076k4);
    }

    @Override // com.aspose.slides.internal.p231kk.InterfaceC5810wl
    /* JADX INFO: renamed from: k1 */
    public final String mo23666k1(String str) {
        int iIntValue = this.f18078x1.m53498k4(Integer.valueOf(m26040x1().m26006x1(str))).intValue();
        if (iIntValue == -1) {
            return null;
        }
        return this.f18076k4.get_Item(iIntValue).m26041k4().mo23414h4();
    }

    @Override // com.aspose.slides.internal.p231kk.InterfaceC5810wl
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public AbstractC6340k4 mo23664jm() {
        return null;
    }

    /* JADX INFO: renamed from: kk */
    public final AbstractC5788h4 m26037kk(int i) {
        return this.f18076k4.get_Item(i).m26041k4();
    }

    /* JADX INFO: renamed from: to */
    public final int m26038to(int i) {
        return this.f18076k4.get_Item(i).m26046x1();
    }

    public String toString() {
        return mo23670tw();
    }

    @Override // com.aspose.slides.internal.p231kk.InterfaceC5810wl
    /* JADX INFO: renamed from: tw */
    public String mo23670tw() {
        if (mo23674y6() == 0) {
            return C14113y2.f47374k4;
        }
        k4 k4Var = this.f18076k4.get_Item(0);
        C6765kp c6765kp = new C6765kp();
        c6765kp.m26796k4("{0}: {1}", m26040x1().m26010x1(k4Var.m26046x1()), k4Var.m26041k4());
        if (k4Var.m26045kk()) {
            c6765kp.m26792k4(" !important");
        }
        c6765kp.m26792k4(";");
        for (int i = 1; i < mo23674y6(); i++) {
            k4 k4Var2 = this.f18076k4.get_Item(i);
            c6765kp.m26796k4(" {0}: {1}", m26040x1().m26010x1(k4Var2.m26046x1()), k4Var2.m26041k4());
            if (k4Var2.m26045kk()) {
                c6765kp.m26792k4(" !important");
            }
            c6765kp.m26792k4(";");
        }
        return c6765kp.toString();
    }

    @Override // com.aspose.slides.internal.p231kk.InterfaceC5810wl
    /* JADX INFO: renamed from: wt */
    public final AbstractC5788h4 mo23672wt(String str) {
        int iIntValue = this.f18078x1.m53498k4(Integer.valueOf(m26040x1().m26006x1(str))).intValue();
        if (iIntValue == -1) {
            return null;
        }
        return this.f18076k4.get_Item(iIntValue).m26041k4();
    }

    /* JADX INFO: renamed from: x1 */
    public final AbstractC5788h4 m26039x1(int i) {
        int iIntValue = this.f18078x1.m53498k4(Integer.valueOf(m26040x1().m26003to(i))).intValue();
        if (iIntValue == -1) {
            return null;
        }
        return this.f18076k4.get_Item(iIntValue).m26041k4();
    }

    @Override // com.aspose.slides.internal.p231kk.InterfaceC5810wl
    /* JADX INFO: renamed from: y6 */
    public final int mo23674y6() {
        return this.f18076k4.size();
    }

    @Override // com.aspose.slides.internal.p231kk.InterfaceC5810wl
    /* JADX INFO: renamed from: zd */
    public void mo23676zd(String str) {
        if (C14113y2.m67411k4(str)) {
            return;
        }
        AbstractC6355x1 abstractC6355x1Mo25907k4 = mo25907k4(str);
        if (abstractC6355x1Mo25907k4.mo23674y6() != 0) {
            for (int i = 0; i < abstractC6355x1Mo25907k4.mo23674y6(); i++) {
                mo25908k4(abstractC6355x1Mo25907k4.m26038to(i), abstractC6355x1Mo25907k4.m26037kk(i), abstractC6355x1Mo25907k4.m26035du(i));
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public AbstractC6355x1 mo25907k4(String str) {
        return (AbstractC6355x1) m26040x1().mo26008x1(str, null);
    }

    @Override // com.aspose.slides.internal.p231kk.InterfaceC5810wl
    /* JADX INFO: renamed from: tw */
    public String mo23671tw(String str) {
        int iM26006x1 = m26040x1().m26006x1(str);
        int iIntValue = this.f18078x1.m53498k4(Integer.valueOf(iM26006x1)).intValue();
        if (iIntValue == -1) {
            return null;
        }
        String strMo23414h4 = this.f18076k4.get_Item(iIntValue).m26041k4().mo23414h4();
        this.f18076k4.removeAt(iIntValue);
        this.f18078x1.m53501x1(Integer.valueOf(iM26006x1));
        return strMo23414h4;
    }

    /* JADX INFO: renamed from: x1 */
    public final C6344m9 m26040x1() {
        return this.f18077kk;
    }

    @Override // com.aspose.slides.internal.p231kk.InterfaceC5810wl
    /* JADX INFO: renamed from: y6 */
    public final String mo23675y6(String str) {
        int iM26006x1 = m26040x1().m26006x1(str);
        if (iM26006x1 == -1) {
            return null;
        }
        int iIntValue = this.f18078x1.m53498k4(Integer.valueOf(iM26006x1)).intValue();
        return (iIntValue != -1 && this.f18076k4.get_Item(iIntValue).m26045kk()) ? "important" : C14113y2.f47374k4;
    }

    @Override // com.aspose.slides.internal.p231kk.InterfaceC5810wl
    /* JADX INFO: renamed from: k4 */
    public final String mo23668k4(int i) {
        int iIntValue = this.f18078x1.m53498k4(Integer.valueOf(i)).intValue();
        if (iIntValue == -1) {
            return null;
        }
        return this.f18076k4.get_Item(iIntValue).m26041k4().mo23414h4();
    }

    /* JADX INFO: renamed from: k4 */
    public void mo25908k4(int i, AbstractC5788h4 abstractC5788h4, boolean z) {
        k4 k4Var = new k4();
        k4Var.m26044k4(z);
        k4Var.m26042k4(i);
        k4Var.m26043k4(abstractC5788h4);
        if (this.f18078x1.m53500kk(Integer.valueOf(i))) {
            this.f18076k4.set_Item(this.f18078x1.m53498k4(Integer.valueOf(i)).intValue(), k4Var);
        } else {
            this.f18076k4.addItem(k4Var);
            this.f18078x1.m53499k4(Integer.valueOf(i), Integer.valueOf(this.f18076k4.size() - 1));
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m26036k4(String str, AbstractC5788h4 abstractC5788h4, boolean z) {
        mo25908k4(m26040x1().m26006x1(str), abstractC5788h4, z);
    }

    @Override // com.aspose.slides.internal.p231kk.InterfaceC5810wl
    /* JADX INFO: renamed from: k4 */
    public void mo23669k4(String str, String str2, String str3) {
        if (m26040x1().m26006x1(str) == -1 || C14113y2.m67411k4(str2)) {
            return;
        }
        if (str3 == null) {
            str3 = C14113y2.f47374k4;
        }
        AbstractC6355x1 abstractC6355x1Mo25907k4 = mo25907k4(C14113y2.m67402k4("{0}: {1} {2}", str, str2, str3));
        if (abstractC6355x1Mo25907k4.mo23674y6() != 0) {
            for (int i = 0; i < abstractC6355x1Mo25907k4.mo23674y6(); i++) {
                mo25908k4(abstractC6355x1Mo25907k4.m26038to(i), abstractC6355x1Mo25907k4.m26037kk(i), abstractC6355x1Mo25907k4.m26035du(i));
            }
        }
    }
}

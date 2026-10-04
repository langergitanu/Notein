package com.aspose.slides.internal.p060ca;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p314oc.AbstractC7018k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14049c6;
import com.aspose.slides.p559ms.System.C14047bz;
import com.aspose.slides.p559ms.System.C14081nv;
import com.aspose.slides.p559ms.System.C14111xk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.words.EditingLanguage;
import com.microsoft.identity.common.java.AuthenticationConstants;
import java.util.Comparator;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.m1 */
/* JADX INFO: loaded from: classes3.dex */
public class C2184m1 extends C2236ov {

    /* JADX INFO: renamed from: k4 */
    public final AbstractC7018k4<AbstractC14049c6> f7593k4;

    /* JADX INFO: renamed from: kk */
    private to f7594kk;

    /* JADX INFO: renamed from: to */
    private Dictionary<Integer, List<x1>> f7595to;

    /* JADX INFO: renamed from: x1 */
    private AbstractC14049c6 f7596x1;

    /* JADX INFO: renamed from: com.aspose.slides.internal.ca.m1$k4 */
    public static class k4 extends C14111xk {

        /* JADX INFO: renamed from: k4 */
        public int f7599k4;

        public k4(int i) {
            this.f7599k4 = i;
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.ca.m1$kk */
    public static class kk implements Comparator<Object> {
        private kk() {
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            x1 x1Var = (x1) obj;
            x1 x1Var2 = (x1) obj2;
            int iM67062k4 = C14081nv.m67062k4(x1Var.f7601k4, x1Var2.f7601k4);
            return (iM67062k4 == 0 && (iM67062k4 = C14081nv.m67062k4(x1Var.f7604x1, x1Var2.f7604x1)) == 0 && (iM67062k4 = C14081nv.m67062k4(x1Var.f7602kk, x1Var2.f7602kk)) == 0) ? C14081nv.m67062k4(x1Var.f7603to, x1Var2.f7603to) : iM67062k4;
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.ca.m1$to */
    public static class to extends SortedList<Object, Object> {
        public to() {
            super(new kk());
        }

        /* JADX INFO: renamed from: k4 */
        public final void m11093k4(x1 x1Var) {
            addItem(x1Var, x1Var);
        }

        /* JADX INFO: renamed from: kk */
        public final void m11094kk(x1 x1Var) {
            removeItemByKey(x1Var);
        }

        /* JADX INFO: renamed from: x1 */
        public final boolean m11095x1(x1 x1Var) {
            return containsKey(x1Var);
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.ca.m1$x1 */
    public static class x1 {

        /* JADX INFO: renamed from: du */
        public String f7600du;

        /* JADX INFO: renamed from: k4 */
        public int f7601k4;

        /* JADX INFO: renamed from: kk */
        public int f7602kk;

        /* JADX INFO: renamed from: to */
        public int f7603to;

        /* JADX INFO: renamed from: x1 */
        public int f7604x1;

        private x1() {
        }
    }

    public C2184m1(C2092fz c2092fz, C2132iq c2132iq) {
        super(c2092fz, c2132iq);
        this.f7593k4 = new AbstractC7018k4<AbstractC14049c6>() { // from class: com.aspose.slides.internal.ca.m1.1
            {
                C2184m1.this.f7596x1 = new AbstractC14049c6() { // from class: com.aspose.slides.internal.ca.m1.1.1
                    @Override // com.aspose.slides.p559ms.System.AbstractC14049c6
                    /* JADX INFO: renamed from: k4 */
                    public void mo1379k4(Object obj, C14111xk c14111xk) {
                        Iterator it = ((AbstractC7018k4) AnonymousClass1.this).f19081x1.iterator();
                        while (it.hasNext()) {
                            ((AbstractC14049c6) it.next()).mo1379k4(obj, c14111xk);
                        }
                    }
                };
            }
        };
        this.f7594kk = new to();
        this.f7595to = new Dictionary<>();
    }

    /* JADX INFO: renamed from: k4 */
    public final C2038cx m11089k4(int i) {
        int i2 = i & 65535;
        if (!this.f7595to.containsKey(Integer.valueOf(i2))) {
            return null;
        }
        C2038cx c2038cx = new C2038cx();
        List.Enumerator<x1> it = this.f7595to.get_Item(Integer.valueOf(i2)).iterator();
        while (it.hasNext()) {
            try {
                x1 next = it.next();
                if ((next.f7601k4 & 65535) == C2063e8.m10448k4().m10451x1()) {
                    c2038cx.m10341k4(next.f7600du, next.f7602kk & 65535);
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return c2038cx;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m11091x1(int i) {
        int i2 = i & 65535;
        if (!this.f7595to.containsKey(Integer.valueOf(i2))) {
            return null;
        }
        List<x1> list = this.f7595to.get_Item(Integer.valueOf(i2));
        List.Enumerator<x1> it = list.iterator();
        while (it.hasNext()) {
            try {
                x1 next = it.next();
                if ((next.f7601k4 & 65535) == C2063e8.m10448k4().m10451x1()) {
                    int i3 = next.f7602kk;
                    if ((i3 & 65535) == 1033 || (i3 & 65535) == 2057) {
                        return next.f7600du;
                    }
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        return list.get_Item(0).f7600du;
    }

    public C2184m1(C2377xv c2377xv, long j, long j2, long j3) {
        super(c2377xv, j, j2, j3);
        this.f7593k4 = new AbstractC7018k4<AbstractC14049c6>() { // from class: com.aspose.slides.internal.ca.m1.1
            {
                C2184m1.this.f7596x1 = new AbstractC14049c6() { // from class: com.aspose.slides.internal.ca.m1.1.1
                    @Override // com.aspose.slides.p559ms.System.AbstractC14049c6
                    /* JADX INFO: renamed from: k4 */
                    public void mo1379k4(Object obj, C14111xk c14111xk) {
                        Iterator it = ((AbstractC7018k4) AnonymousClass1.this).f19081x1.iterator();
                        while (it.hasNext()) {
                            ((AbstractC14049c6) it.next()).mo1379k4(obj, c14111xk);
                        }
                    }
                };
            }
        };
        this.f7595to = new Dictionary<>();
    }

    /* JADX INFO: renamed from: x1 */
    private void m11088x1(int i, String str, boolean z) {
        m11085k4(0, i, 1, 0, str, z);
    }

    /* JADX INFO: renamed from: k4 */
    private void m11085k4(int i, int i2, int i3, int i4, String str, boolean z) {
        x1 x1Var = new x1();
        x1Var.f7602kk = i & 65535;
        x1Var.f7603to = i2 & 65535;
        x1Var.f7601k4 = i3 & 65535;
        x1Var.f7604x1 = i4 & 65535;
        x1Var.f7600du = str;
        m11087k4(x1Var, z);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m11090k4(int i, String str) {
        int i2 = 65535 & i;
        m11086k4(i2, str, true);
        m11088x1(i2, str, true);
        AbstractC14049c6 abstractC14049c6 = this.f7596x1;
        if (abstractC14049c6 != null) {
            abstractC14049c6.mo1379k4(this, new k4(i));
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m11086k4(int i, String str, boolean z) {
        m11085k4(EditingLanguage.ENGLISH_US, i, 3, 1, str, z);
    }

    /* JADX INFO: renamed from: k4 */
    private void m11087k4(x1 x1Var, boolean z) {
        if (!this.f7594kk.m11095x1(x1Var)) {
            this.f7594kk.m11093k4(x1Var);
        } else if (z) {
            this.f7594kk.m11094kk(x1Var);
            this.f7594kk.m11093k4(x1Var);
        }
        if (!this.f7595to.containsKey(Integer.valueOf(x1Var.f7603to))) {
            this.f7595to.addItem(Integer.valueOf(x1Var.f7603to), new List<>());
        }
        List<x1> list = this.f7595to.get_Item(Integer.valueOf(x1Var.f7603to));
        int i = 0;
        while (true) {
            if (i >= list.size()) {
                i = Integer.MIN_VALUE;
                break;
            }
            x1 x1Var2 = list.get_Item(i);
            if (x1Var2.f7601k4 == x1Var.f7601k4 && x1Var2.f7603to == x1Var.f7603to && x1Var2.f7602kk == x1Var.f7602kk && x1Var2.f7604x1 == x1Var.f7604x1) {
                break;
            } else {
                i++;
            }
        }
        if (i != Integer.MIN_VALUE) {
            list.removeAt(i);
        }
        list.addItem(x1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006f  */
    @Override // com.aspose.slides.internal.p060ca.C2236ov
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo10299k4(C2212n9 c2212n9) {
        long j;
        long j2 = 4294967295L;
        c2212n9.m11159k4(m11222wy() & 4294967295L);
        c2212n9.m11151fa();
        int iM11151fa = c2212n9.m11151fa();
        this.f7594kk = new to();
        int iM11151fa2 = c2212n9.m11151fa();
        int i = 0;
        while (i < (iM11151fa & 65535)) {
            x1 x1Var = new x1();
            x1Var.f7601k4 = c2212n9.m11151fa();
            x1Var.f7604x1 = c2212n9.m11151fa();
            x1Var.f7602kk = c2212n9.m11151fa();
            x1Var.f7603to = c2212n9.m11151fa();
            int iM11151fa3 = c2212n9.m11151fa() & 65535;
            int iM11151fa4 = c2212n9.m11151fa() & 65535;
            int i2 = x1Var.f7601k4;
            String str = "utf-16be";
            if ((i2 & 65535) == 0) {
                j = j2;
            } else {
                j = j2;
                if ((i2 & 65535) == 1) {
                    str = (x1Var.f7604x1 & 65535) == 2 ? "big5" : "ISO-8859-1";
                } else if ((i2 & 65535) == 3) {
                    if ((x1Var.f7604x1 & 65535) == 4) {
                    }
                } else if ((i2 & 65535) == 2) {
                    int i3 = x1Var.f7604x1;
                    if ((i3 & 65535) == 0) {
                        str = "us-ascii";
                    } else if ((i3 & 65535) == 1) {
                        str = "ISO-10646-UCS-2";
                    } else {
                        int i4 = i3 & 65535;
                    }
                } else {
                    C2244ph.m11243k4(C14113y2.m67402k4("could not read names for {0} platform", Integer.valueOf(i2)));
                    i++;
                    j2 = j;
                }
            }
            long jM11154k4 = c2212n9.m11154k4();
            c2212n9.m11159k4(((((m11222wy() & j) + ((long) (65535 & iM11151fa2))) & j) + ((long) iM11151fa4)) & j);
            x1Var.f7600du = c2212n9.m11157k4(iM11151fa3, str, true);
            m11087k4(x1Var, true);
            c2212n9.m11159k4(jM11154k4);
            i++;
            j2 = j;
        }
        super.mo10299k4(c2212n9);
    }

    @Override // com.aspose.slides.internal.p060ca.C2236ov
    /* JADX INFO: renamed from: k4 */
    public void mo10132k4(byte[][] bArr, long[] jArr, long[] jArr2) throws Throwable {
        String str;
        String str2;
        if (!m11217b3()) {
            super.mo10132k4(bArr, jArr, jArr2);
            return;
        }
        C3152yj c3152yj = new C3152yj();
        try {
            C2362x4 c2362x4 = new C2362x4(c3152yj, true);
            try {
                String strM11091x1 = m11091x1(4);
                if (strM11091x1 == null) {
                    strM11091x1 = m11091x1(1);
                }
                if (strM11091x1 == null) {
                    strM11091x1 = C14047bz.m66536x1().toString();
                }
                int length = 0;
                m11088x1(1, strM11091x1, false);
                m11088x1(2, "Regular", false);
                m11088x1(3, strM11091x1, false);
                m11088x1(4, strM11091x1, false);
                m11088x1(5, "Version 1.1", false);
                m11088x1(6, strM11091x1, false);
                m11086k4(1, strM11091x1, false);
                m11086k4(2, "Regular", false);
                m11086k4(3, strM11091x1, false);
                m11086k4(4, strM11091x1, false);
                m11086k4(5, "Version 1.1", false);
                m11086k4(6, strM11091x1, false);
                c2362x4.m11647k4(0);
                c2362x4.m11647k4(this.f7594kk.size() & 65535);
                c2362x4.m11647k4(((this.f7594kk.size() * 12) + 6) & 65535);
                IGenericEnumerator<Object> it = this.f7594kk.getKeys().iterator();
                while (it.hasNext()) {
                    try {
                        x1 x1Var = (x1) this.f7594kk.get_Item((x1) it.next());
                        c2362x4.m11647k4(x1Var.f7601k4);
                        c2362x4.m11647k4(x1Var.f7604x1);
                        c2362x4.m11647k4(x1Var.f7602kk);
                        c2362x4.m11647k4(x1Var.f7603to);
                        if ((x1Var.f7601k4 & 65535) == 3) {
                            c2362x4.m11647k4((x1Var.f7600du.length() * 2) & 65535);
                            c2362x4.m11647k4(length & 65535);
                            length = (x1Var.f7600du.length() * 2) + length;
                        } else {
                            c2362x4.m11647k4(x1Var.f7600du.length() & 65535);
                            c2362x4.m11647k4(length & 65535);
                            length += x1Var.f7600du.length();
                        }
                    } finally {
                    }
                }
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                it = this.f7594kk.getKeys().iterator();
                while (it.hasNext()) {
                    try {
                        x1 x1Var2 = (x1) this.f7594kk.get_Item((x1) it.next());
                        int i = x1Var2.f7601k4;
                        if ((i & 65535) == 3) {
                            str = x1Var2.f7600du;
                            str2 = "utf-16be";
                        } else if ((i & 65535) == 1) {
                            str = x1Var2.f7600du;
                            str2 = AuthenticationConstants.ENCODING_ASCII_STRING;
                        }
                        c2362x4.m11650k4(str, str2);
                    } finally {
                    }
                }
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                m11219k4(c2362x4, c3152yj, bArr, jArr, jArr2);
                c2362x4.dispose();
                c3152yj.dispose();
            } catch (Throwable th) {
                c2362x4.dispose();
                throw th;
            }
        } catch (Throwable th2) {
            c3152yj.dispose();
            throw th2;
        }
    }
}

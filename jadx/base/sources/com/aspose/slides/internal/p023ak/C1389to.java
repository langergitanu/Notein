package com.aspose.slides.internal.p023ak;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p022ai.C1376jd;
import com.aspose.slides.internal.p022ai.C1378kk;
import com.aspose.slides.internal.p022ai.C1381up;
import com.aspose.slides.internal.p022ai.InterfaceC1380to;
import com.aspose.slides.internal.p048bv.C1871x1;
import com.aspose.slides.internal.p097e0.AbstractC3511c5;
import com.aspose.slides.internal.p097e0.AbstractC3523kk;
import com.aspose.slides.internal.p097e0.AbstractC3524ks;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p380ri.C10018x1;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.ak.to */
/* JADX INFO: loaded from: classes3.dex */
public class C1389to {

    /* JADX INFO: renamed from: k4 */
    private AbstractC3511c5 f6030k4;

    /* JADX INFO: renamed from: x1 */
    private C6765kp f6032x1 = new C6765kp();

    /* JADX INFO: renamed from: kk */
    private List<C1385h4> f6031kk = new List<>();

    public C1389to(AbstractC3511c5 abstractC3511c5) {
        this.f6030k4 = abstractC3511c5;
    }

    /* JADX INFO: renamed from: k4 */
    private static List<C1385h4> m8267k4(C1385h4 c1385h4, int[] iArr) {
        List<C1385h4> list = new List<>();
        AbstractC3511c5 abstractC3511c5M8217k4 = c1385h4.m8217k4();
        int iM8221x1 = c1385h4.m8221x1();
        int iM8219kk = c1385h4.m8219kk();
        int i = iM8221x1;
        while (i < iM8219kk) {
            int i2 = iArr[i];
            int i3 = i;
            while (i3 < iM8219kk && iArr[i3] == i2) {
                i3++;
            }
            if (c1385h4.m8221x1() == i && c1385h4.m8219kk() == i3) {
                c1385h4.m8218k4(i2);
            } else {
                c1385h4 = new C1385h4(abstractC3511c5M8217k4, iM8221x1, i, i3, i2);
            }
            list.addItem(c1385h4);
            i = i3;
        }
        return list;
    }

    /* JADX INFO: renamed from: to */
    private void m8272to() {
        List.Enumerator<C1385h4> it = this.f6031kk.iterator();
        while (it.hasNext()) {
            try {
                it.next().m8220to();
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: kk */
    public final void m8276kk() {
        InterfaceC1380to interfaceC1380toM8173k4 = C1381up.m8173k4(this.f6031kk.get_Item(0).m8217k4());
        if (interfaceC1380toM8173k4 != null) {
            m8269k4(interfaceC1380toM8173k4.mo8171qw(), interfaceC1380toM8173k4.mo8172tq());
        }
    }

    public String toString() {
        C6765kp c6765kp = new C6765kp(C14113y2.m67408k4("DR: ", this.f6030k4.mo14114rv(), " { <", C10018x1.m49176k4(this.f6032x1.toString()), ">"));
        c6765kp.m26792k4(", intervals <");
        List.Enumerator<C1385h4> it = this.f6031kk.iterator();
        boolean z = true;
        while (it.hasNext()) {
            try {
                C1385h4 next = it.next();
                if (z) {
                    z = false;
                } else {
                    c6765kp.m26780k4(',');
                }
                c6765kp.m26792k4(next.toString());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c6765kp.m26792k4("> }");
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m8277x1() {
        return this.f6032x1.m26807x1() == 0;
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC3511c5 m8273k4() {
        return this.f6030k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m8274k4(char c, AbstractC3511c5 abstractC3511c5) {
        if (c != 0) {
            int iM26807x1 = this.f6032x1.m26807x1();
            this.f6032x1.m26780k4(c);
            this.f6031kk.addItem(new C1385h4(abstractC3511c5, iM26807x1, iM26807x1 + 1));
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m8268k4(C1378kk c1378kk) {
        int i = c1378kk == C1378kk.f5983x1 ? 1 : 0;
        List.Enumerator<C1385h4> it = this.f6031kk.iterator();
        while (it.hasNext()) {
            try {
                m8270k4(it.next().m8217k4(), i);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m8269k4(C1378kk c1378kk, C1376jd c1376jd) {
        int[] iArrM8202k4 = C1384dy.m8202k4(new C1871x1(C14113y2.m67365dy(this.f6032x1.toString())), c1378kk, this.f6031kk);
        if (iArrM8202k4 != null) {
            if (c1376jd == C1376jd.f5969kk) {
                for (int i = 0; i < iArrM8202k4.length; i++) {
                    iArrM8202k4[i] = iArrM8202k4[i] + 1;
                }
            }
            m8271k4(iArrM8202k4);
            m8268k4(c1378kk);
            m8272to();
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m8270k4(AbstractC3511c5 abstractC3511c5, int i) {
        while (abstractC3511c5 != null) {
            if (C7019kk.m27469x1(abstractC3511c5, AbstractC3524ks.class)) {
                AbstractC3524ks abstractC3524ks = (AbstractC3524ks) abstractC3511c5;
                if (abstractC3524ks.mo14120wl()) {
                    if (abstractC3524ks.m14331wy() < 0) {
                        abstractC3524ks.m14327to(i);
                        return;
                    }
                    return;
                }
            }
            abstractC3511c5 = abstractC3511c5.m14115s_();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m8275k4(AbstractC3523kk abstractC3523kk, AbstractC3511c5 abstractC3511c5) {
        if (abstractC3523kk != null) {
            int iM26807x1 = this.f6032x1.m26807x1();
            int i = iM26807x1;
            while (abstractC3523kk.mo9764x1()) {
                this.f6032x1.m26780k4(abstractC3523kk.mo14069to());
                i++;
            }
            this.f6031kk.addItem(new C1385h4(abstractC3511c5, iM26807x1, i));
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m8271k4(int[] iArr) {
        List<C1385h4> list = new List<>(this.f6031kk.size());
        List.Enumerator<C1385h4> it = this.f6031kk.iterator();
        while (it.hasNext()) {
            try {
                list.addRange(m8267k4(it.next(), iArr));
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (list.equals(this.f6031kk)) {
            return;
        }
        this.f6031kk = list;
    }
}

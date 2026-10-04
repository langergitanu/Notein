package com.aspose.slides.internal.p159h0;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.OooO0O0;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14093tq;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.h0.xk */
/* JADX INFO: loaded from: classes.dex */
public final class C4485xk implements IGenericEnumerable<C4439dq> {

    /* JADX INFO: renamed from: k4 */
    private C4459os f12335k4 = new C4459os();

    /* JADX INFO: renamed from: x1 */
    private C4459os f12338x1 = new C4459os();

    /* JADX INFO: renamed from: kk */
    private List<C4439dq> f12336kk = new List<>();

    /* JADX INFO: renamed from: to */
    private List<C4439dq> f12337to = new List<>();

    /* JADX INFO: renamed from: du */
    private void m18454du() {
        m18455kk(new C4459os(Float.POSITIVE_INFINITY));
        m18456to(new C4459os(Float.NEGATIVE_INFINITY));
        List.Enumerator<C4439dq> it = this.f12336kk.iterator();
        while (it.hasNext()) {
            try {
                C4439dq next = it.next();
                m18455kk(new C4459os(C14116yg.m67504x1(m18463x1().m18285k4(), next.m18147to().m18285k4()), C14116yg.m67504x1(m18463x1().m18290x1(), next.m18147to().m18290x1())));
                m18456to(new C4459os(C14116yg.m67481k4(m18461kk().m18285k4(), next.m18135du().m18285k4()), C14116yg.m67481k4(m18461kk().m18290x1(), next.m18135du().m18290x1())));
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    @Override // java.lang.Iterable
    public final IGenericEnumerator<C4439dq> iterator() {
        return this.f12336kk.iterator();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m18457k4() {
        ((C4439dq) OooO0O0.OooO00o(this.f12336kk, 1)).m18146m9();
    }

    /* JADX INFO: renamed from: kk */
    public final C4459os m18461kk() {
        return this.f12338x1.Clone();
    }

    /* JADX INFO: renamed from: to */
    public final List<C4439dq> m18462to() {
        return this.f12337to;
    }

    /* JADX INFO: renamed from: x1 */
    public final C4459os m18463x1() {
        return this.f12335k4.Clone();
    }

    /* JADX INFO: renamed from: kk */
    private void m18455kk(C4459os c4459os) {
        this.f12335k4 = c4459os.Clone();
    }

    /* JADX INFO: renamed from: to */
    private void m18456to(C4459os c4459os) {
        this.f12338x1 = c4459os.Clone();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m18464x1(C4459os c4459os) {
        ((C4439dq) OooO0O0.OooO00o(this.f12336kk, 1)).m18142k4(new C4436c6(c4459os.Clone(), 1));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m18458k4(C4436c6 c4436c6) {
        ((C4439dq) OooO0O0.OooO00o(this.f12336kk, 1)).m18142k4(c4436c6);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m18459k4(C4459os c4459os) {
        this.f12336kk.addItem(new C4439dq(this));
        ((C4439dq) OooO0O0.OooO00o(this.f12336kk, 1)).m18142k4(new C4436c6(c4459os.Clone(), 0));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m18460k4(boolean z, C14093tq<C4459os> c14093tq) {
        C4459os c4459osM18281x1;
        List.Enumerator<C4439dq> it = this.f12336kk.iterator();
        while (it.hasNext()) {
            try {
                C4439dq next = it.next();
                if (z) {
                    next.m18139jd();
                }
                next.m18133c5();
            } finally {
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        C4459os c4459os = new C4459os();
        if (C14093tq.m67296x1(c14093tq, null)) {
            c4459osM18281x1 = c14093tq.m67297k4();
        } else {
            m18454du();
            c4459osM18281x1 = C4459os.m18281x1(C4459os.m18279k4(m18463x1(), m18461kk()), 2.0f);
        }
        c4459osM18281x1.CloneTo(c4459os);
        List.Enumerator<C4439dq> it2 = this.f12336kk.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().m18143k4(c4459os.Clone());
            } finally {
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
            it2.dispose();
        }
        this.f12337to.clear();
        List.Enumerator<C4439dq> it3 = this.f12336kk.iterator();
        while (it3.hasNext()) {
            try {
                C4439dq next2 = it3.next();
                List.Enumerator<C4439dq> it4 = this.f12336kk.iterator();
                int i = 0;
                C4439dq c4439dq = null;
                while (it4.hasNext()) {
                    try {
                        C4439dq next3 = it4.next();
                        if (!C14067j2.m66729x1(next2, next3)) {
                            boolean zM18144k4 = next2.m18144k4(next3);
                            i += zM18144k4 ? 1 : 0;
                            if (zM18144k4 && (c4439dq == null || next3.m18144k4(c4439dq))) {
                                c4439dq = next3;
                            }
                        }
                    } finally {
                    }
                }
                if (C7019kk.m27456k4((Iterator) it4, (Class<IDisposable>) IDisposable.class)) {
                    it4.dispose();
                }
                next2.m18141k4(i % 2 == 0 ? 1 : 2);
                if (c4439dq != null) {
                    c4439dq.m18150x1(next2);
                } else {
                    this.f12337to.addItem(next2);
                }
            } finally {
            }
        }
        if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
            it3.dispose();
        }
        List.Enumerator<C4439dq> it5 = this.f12336kk.iterator();
        while (it5.hasNext()) {
            try {
                it5.next().m18136dy();
            } finally {
                if (C7019kk.m27456k4((Iterator) it5, (Class<IDisposable>) IDisposable.class)) {
                    it5.dispose();
                }
            }
        }
        m18454du();
    }
}

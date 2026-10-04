package com.aspose.slides.internal.p462vj;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p097e0.AbstractC3524ks;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p371qw.C9951dy;
import com.aspose.slides.internal.p513xw.C12702ix;
import com.aspose.slides.internal.p513xw.C12719qq;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.vj.rv */
/* JADX INFO: loaded from: classes4.dex */
public class C11668rv {

    /* JADX INFO: renamed from: k4 */
    private static C11668rv f39376k4;

    /* JADX INFO: renamed from: x1 */
    private boolean f39381x1 = false;

    /* JADX INFO: renamed from: kk */
    private C12719qq f39379kk = null;

    /* JADX INFO: renamed from: to */
    private boolean f39380to = false;

    /* JADX INFO: renamed from: du */
    private List<C12702ix> f39377du = new List<>();

    /* JADX INFO: renamed from: h4 */
    private Dictionary<Object, List<C11663ks>> f39378h4 = new Dictionary<>();

    private C11668rv() {
    }

    /* JADX INFO: renamed from: x1 */
    public static C11668rv m54919x1() {
        if (f39376k4 == null) {
            f39376k4 = new C11668rv();
        }
        return f39376k4;
    }

    /* JADX INFO: renamed from: du */
    public final List<C12702ix> m54920du() {
        return this.f39377du;
    }

    /* JADX INFO: renamed from: h4 */
    public final void m54921h4() {
        this.f39377du.clear();
    }

    /* JADX INFO: renamed from: k4 */
    public final int m54922k4(C9951dy c9951dy, AbstractC3524ks abstractC3524ks) {
        if (!this.f39378h4.containsKey(c9951dy.mo59012up())) {
            return -1;
        }
        List<C11663ks> list = this.f39378h4.get_Item(c9951dy.mo59012up());
        for (int i = 0; i < list.size(); i++) {
            if (list.get_Item(i).mo59012up() == abstractC3524ks) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m54929kk() {
        return this.f39380to;
    }

    /* JADX INFO: renamed from: m9 */
    public final void m54930m9() {
        m54921h4();
        f39376k4 = null;
    }

    /* JADX INFO: renamed from: to */
    public final C12719qq m54931to() {
        return this.f39379kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final List<C11663ks> m54923k4(C9951dy c9951dy) {
        if (this.f39378h4.containsKey(c9951dy.mo59012up())) {
            return this.f39378h4.get_Item(c9951dy.mo59012up());
        }
        return null;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m54932x1(boolean z) {
        this.f39380to = z;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m54924k4(C9951dy c9951dy, C11663ks c11663ks) {
        boolean zM27456k4;
        if (!this.f39378h4.containsKey(c9951dy.mo59012up())) {
            this.f39378h4.set_Item(c9951dy.mo59012up(), new List<>());
        }
        List<C11663ks> list = this.f39378h4.get_Item(c9951dy.mo59012up());
        List.Enumerator<C11663ks> it = list.iterator();
        while (it.hasNext()) {
            try {
                if (it.next().mo59012up() == c11663ks.mo59012up()) {
                    if (zM27456k4) {
                        return;
                    } else {
                        return;
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
        c11663ks.m54903du(true);
        list.addItem(c11663ks);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m54925k4(C12719qq c12719qq) {
        this.f39379kk = c12719qq;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m54926k4(boolean z) {
        this.f39381x1 = z;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m54927k4() {
        return this.f39381x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m54928k4(C9951dy c9951dy, int i) {
        List<C11663ks> list = this.f39378h4.get_Item(c9951dy.mo59012up());
        if (!list.get_Item(i).m54907yd()) {
            return false;
        }
        list.removeAt(i);
        return true;
    }
}

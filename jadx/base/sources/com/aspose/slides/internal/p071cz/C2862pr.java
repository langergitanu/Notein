package com.aspose.slides.internal.p071cz;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p060ca.C2183ly;
import com.aspose.slides.internal.p060ca.InterfaceC2001am;
import com.aspose.slides.internal.p060ca.InterfaceC2251pt;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p080dd.C3141rv;
import com.aspose.slides.internal.p080dd.C3142to;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14052dq;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.cz.pr */
/* JADX INFO: loaded from: classes3.dex */
public final class C2862pr {

    /* JADX INFO: renamed from: k4 */
    private static C2862pr f8714k4;

    /* JADX INFO: renamed from: x1 */
    private static final Object f8715x1 = new Object();

    /* JADX INFO: renamed from: kk */
    private List<C2908tf> f8716kk = new List<>();

    /* JADX INFO: renamed from: to */
    private List<InterfaceC2251pt> f8717to = new List<>();

    private C2862pr() {
    }

    /* JADX INFO: renamed from: k4 */
    public final InterfaceC2251pt m12467k4(String str, boolean z, boolean z2) {
        if (this.f8716kk.size() == 0) {
            m12470k4(C3141rv.m13412x1(C3142to.m13422m9(C14052dq.m66566k4(37)).m13430h4(), "Fonts"));
        }
        String strM67402k4 = C14113y2.m67402k4("{0}{1}{2}", str, z ? " Bold" : C14113y2.f47374k4, z2 ? " Italic" : C14113y2.f47374k4);
        List.Enumerator<InterfaceC2251pt> it = this.f8716kk.iterator();
        InterfaceC2251pt interfaceC2251ptM12533k4 = null;
        while (it.hasNext() && (interfaceC2251ptM12533k4 = it.next().m12533k4(strM67402k4)) == null) {
            try {
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        if (interfaceC2251ptM12533k4 == null) {
            it = this.f8717to.iterator();
            while (it.hasNext()) {
                try {
                    InterfaceC2251pt next = it.next();
                    if (C14113y2.m67363du(C14113y2.m67368h4(next.mo10262h4()), C14113y2.m67368h4(strM67402k4))) {
                        return next;
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
        }
        if (interfaceC2251ptM12533k4 != null) {
            return interfaceC2251ptM12533k4;
        }
        List.Enumerator<C2908tf> it2 = this.f8716kk.iterator();
        while (it2.hasNext() && (interfaceC2251ptM12533k4 = it2.next().m12533k4("Arial")) == null) {
            try {
            } finally {
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
            it2.dispose();
        }
        return interfaceC2251ptM12533k4;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m12471kk() {
        return this.f8716kk.size() > 0;
    }

    /* JADX INFO: renamed from: to */
    public final boolean m12472to() {
        return this.f8717to.size() > 0;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m12473x1() {
        this.f8716kk.clear();
        this.f8717to.clear();
    }

    /* JADX INFO: renamed from: k4 */
    public static C2862pr m12466k4() {
        C2862pr c2862pr;
        C2862pr c2862pr2 = f8714k4;
        if (c2862pr2 != null) {
            return c2862pr2;
        }
        synchronized (f8715x1) {
            try {
                c2862pr = f8714k4;
                if (c2862pr == null) {
                    c2862pr = new C2862pr();
                    f8714k4 = c2862pr;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c2862pr;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m12468k4(InterfaceC2001am interfaceC2001am) {
        if (interfaceC2001am == null) {
            throw new ArgumentNullException("source");
        }
        this.f8716kk.addItem(new C2908tf(interfaceC2001am));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m12469k4(InterfaceC2251pt interfaceC2251pt) {
        if (interfaceC2251pt == null) {
            throw new ArgumentNullException("font");
        }
        this.f8717to.addItem(interfaceC2251pt);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m12470k4(String str) {
        if (C3142to.m13421kk(str)) {
            m12468k4(new C2183ly(str));
        } else {
            C3085sv.m13082k4(new ArgumentException(C14113y2.m67408k4("Source directory must exist: ", str)));
        }
    }
}

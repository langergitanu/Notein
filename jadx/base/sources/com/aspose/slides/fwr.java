package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C8260mf;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class fwr extends wsu {

    /* JADX INFO: renamed from: k4 */
    private double f5148k4;

    public fwr(C8260mf c8260mf) {
        double dM36907du = c8260mf.m36907du();
        this.f5148k4 = dM36907du;
        if (C14044b3.m66437kk(dM36907du) || C14044b3.m66439x1(this.f5148k4) || c8260mf.m36909k4() == 23 || c8260mf.m36909k4() == 0) {
            return;
        }
        this.f5148k4 = yz6.m74154k4(this.f5148k4);
    }

    /* JADX INFO: renamed from: c5 */
    private C8260mf m6342c5() {
        return (C8260mf) m72921ne();
    }

    /* JADX INFO: renamed from: du */
    public final int m6344du() {
        return m6342c5().m36909k4();
    }

    /* JADX INFO: renamed from: dy */
    public final double m6345dy() {
        return this.f5148k4;
    }

    /* JADX INFO: renamed from: h4 */
    public final double m6346h4() {
        return m6342c5().m36908h4();
    }

    /* JADX INFO: renamed from: k4 */
    public final List<bay> m6347k4(bay bayVar) {
        return bayVar.m4081k4(m6342c5().m36912x1(), m6342c5().m36910kk(), m6342c5().m36911to());
    }

    /* JADX INFO: renamed from: kk */
    public final int m6348kk() {
        return m6342c5().m36912x1();
    }

    /* JADX INFO: renamed from: to */
    public final String m6349to() {
        return m6342c5().m36910kk();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x1 */
    public final List<bay> m6350x1(bay bayVar) {
        List<bay> list = new List<>();
        if (m6348kk() != 1 && yz6.m74181x1(m6344du())) {
            List.Enumerator<C14244on> it = m6347k4(bayVar).iterator();
            while (it.hasNext()) {
                try {
                    bay next = it.next();
                    if (C7019kk.m27469x1(next.m4077jd(), cpm.class)) {
                        list.addItem(next);
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
            List list2 = new List();
            List.Enumerator<bay> it2 = list.iterator();
            while (it2.hasNext()) {
                try {
                    List.Enumerator<C14244on> it3 = it2.next().m4076h4().iterator();
                    while (it3.hasNext()) {
                        try {
                            C14244on next2 = it3.next();
                            List<C14244on> list3 = new List<>();
                            m6343k4(list3, next2.m68732x1());
                            it = list3.iterator();
                            while (it.hasNext()) {
                                try {
                                    C14244on next3 = it.next();
                                    if (!list2.containsItem(next3)) {
                                        list2.addItem(next3);
                                    }
                                } finally {
                                }
                            }
                            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                                it.dispose();
                            }
                        } finally {
                        }
                    }
                    if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                        it3.dispose();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                it2.dispose();
            }
            List.Enumerator it4 = list2.iterator();
            while (it4.hasNext()) {
                try {
                    bay bayVarM4083k4 = bayVar.m4083k4(((C14244on) it4.next()).m5144ks());
                    if (bayVarM4083k4 != null && C7019kk.m27469x1(bayVarM4083k4.m4077jd(), cpm.class) && !list.containsItem(bayVarM4083k4)) {
                        list.addItem(bayVarM4083k4);
                    }
                } finally {
                    if (C7019kk.m27456k4((Iterator) it4, (Class<IDisposable>) IDisposable.class)) {
                        it4.dispose();
                    }
                }
            }
            if (C7019kk.m27456k4((Iterator) it4, (Class<IDisposable>) IDisposable.class)) {
                it4.dispose();
                return list;
            }
        }
        return list;
    }

    /* JADX INFO: renamed from: k4 */
    private void m6343k4(List<C14244on> list, List<C14244on> list2) {
        List.Enumerator<C14244on> it = list2.iterator();
        while (it.hasNext()) {
            try {
                C14244on next = it.next();
                list.addItem(next);
                m6343k4(list, next.m68732x1());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }
}

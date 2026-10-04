package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.Stack;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C7855hi;
import com.aspose.slides.internal.p332p7.C8488p1;
import com.aspose.slides.internal.p332p7.C9103wc;
import com.aspose.slides.p559ms.System.C14047bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class m6r extends wsu {

    /* JADX INFO: renamed from: k4 */
    private List<bay> f46181k4 = new List<>();

    public m6r(a7l a7lVar, C9103wc c9103wc) {
    }

    /* JADX INFO: renamed from: jd */
    private C9103wc m64772jd() {
        return (C9103wc) m72921ne();
    }

    @Override // com.aspose.slides.wsu
    /* JADX INFO: renamed from: J_ */
    public String mo4816J_() {
        return m64772jd().m43620k4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.slides.wsu
    /* JADX INFO: renamed from: L_ */
    public void mo4732L_() {
        List.Enumerator<bay> it = this.f46181k4.iterator();
        while (it.hasNext()) {
            try {
                bay next = it.next();
                if (!C14113y2.m67411k4(m64778du())) {
                    bay bayVarM4102to = next.m4102to();
                    if (bayVarM4102to == null && next.m4082k4() != null) {
                        bayVarM4102to = next.m4082k4().m4110x1().get_Item(0);
                    }
                    while (true) {
                        if (bayVarM4102to == null || bayVarM4102to == next) {
                            break;
                        }
                        if (C14113y2.m67363du(bayVarM4102to.m4099m9().mo4816J_(), m64778du())) {
                            next.m4092k4(bayVarM4102to.m4066ar().Clone());
                            bayVarM4102to.m4074dy().m74285x1(next.m4074dy());
                            break;
                        } else {
                            bayVarM4102to = bayVarM4102to.m4102to();
                            if (bayVarM4102to == null && next.m4082k4() != null) {
                                bayVarM4102to = next.m4082k4().m4110x1().get_Item(0);
                            }
                        }
                    }
                }
                if (next.m4076h4().size() > 0) {
                    List list = new List();
                    m64774k4(next.m4069c5(), next.m4076h4().get_Item(0).m5144ks(), (List<bay>) list);
                    List.Enumerator it2 = list.iterator();
                    while (it2.hasNext()) {
                        try {
                            bay bayVar = (bay) it2.next();
                            if (bayVar != next && !next.m4074dy().m74254k4(bayVar.m4074dy()) && next.m4074dy().m74230dq() != bayVar.m4074dy()) {
                                bayVar.m4092k4(next.m4066ar().Clone());
                                next.m4074dy().m74285x1(bayVar.m4074dy());
                            }
                        } catch (Throwable th) {
                            if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                                it2.dispose();
                            }
                            throw th;
                        }
                    }
                    if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                        it2.dispose();
                    }
                }
            } catch (Throwable th2) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th2;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
    }

    /* JADX INFO: renamed from: c5 */
    public final List<m6r> m64777c5() {
        List<m6r> list = new List<>();
        m64775k4(this, list);
        return list;
    }

    /* JADX INFO: renamed from: du */
    public final String m64778du() {
        return m64772jd().m43622to();
    }

    /* JADX INFO: renamed from: dy */
    public final void m64779dy() {
        Stack stack = new Stack();
        stack.push(this);
        m64776k4(this, (Stack<m6r>) stack);
        while (stack.size() != 0) {
            List.Enumerator<bay> it = ((m6r) stack.pop()).m64783kk().iterator();
            while (it.hasNext()) {
                try {
                    it.next().m4097lr();
                } catch (Throwable th) {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                    throw th;
                }
            }
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                it.dispose();
            }
        }
    }

    /* JADX INFO: renamed from: h4 */
    public final int m64780h4() {
        return m64772jd().m43621kk();
    }

    /* JADX INFO: renamed from: k4 */
    public final C14648us m64781k4(C14244on c14244on) {
        C14648us c14648usM2779k4 = m72922rv().m3357x1().m2779k4(c14244on.m5144ks(), mo4816J_());
        if (c14648usM2779k4 == null) {
            gnb gnbVar = new gnb(m72922rv().m3357x1().getPresentation(), InterruptionToken.getNone());
            C8488p1 c8488p1 = new C8488p1();
            c8488p1.m38570k4();
            c8488p1.m38578x1();
            c8488p1.m38575kk();
            C14648us c14648us = new C14648us(c8488p1, m72922rv().m3357x1(), gnbVar);
            c14648us.m71880x1(C14113y2.m67408k4("{", C14113y2.m67358c5(C14047bz.m66536x1().toString()), "}"));
            c14648us.m71868k4(4);
            c14648us.m71873kk().m28391x1(mo4816J_());
            c14648us.m71873kk().m28373kk(m64772jd().m43623x1());
            c14648usM2779k4 = c14648us;
        }
        c14648usM2779k4.m71873kk().m28369k4(c14244on.m5144ks());
        return c14648usM2779k4;
    }

    /* JADX INFO: renamed from: kk */
    public final List<bay> m64783kk() {
        return this.f46181k4;
    }

    /* JADX INFO: renamed from: to */
    public final String m64784to() {
        return m64772jd().m43623x1();
    }

    /* JADX INFO: renamed from: k4 */
    private String m64773k4(int i) {
        String strM5786k4;
        if (i == 0) {
            return null;
        }
        for (wsu wsuVarM72924yj = this; wsuVarM72924yj != null; wsuVarM72924yj = wsuVarM72924yj.m72924yj()) {
            m6r m6rVar = (m6r) C7019kk.m27452k4((Object) wsuVarM72924yj, m6r.class);
            if (m6rVar != null) {
                IGenericEnumerator<wsu> it = m6rVar.m72920ks().iterator();
                ez3 ez3Var = null;
                while (it.hasNext() && (ez3Var = (ez3) C7019kk.m27452k4((Object) it.next(), ez3.class)) == null) {
                    try {
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                    }
                }
                if (ez3Var != null && (strM5786k4 = ez3Var.m5786k4(i)) != null) {
                    return strM5786k4;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public final String m64782k4(int i, bay bayVar) {
        String strM5784k4;
        String strM5784k42 = ez3.m5784k4(bayVar.m5147up().m71873kk().m28386uz(), i);
        if (strM5784k42 != null) {
            return strM5784k42;
        }
        do {
            bayVar = bayVar.m4082k4();
            if (bayVar == null) {
                return m64773k4(i);
            }
            strM5784k4 = ez3.m5784k4(bayVar.m5147up().m71873kk().m28386uz(), i);
        } while (strM5784k4 == null);
        return strM5784k4;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0084  */
    @Override // com.aspose.slides.wsu
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo4817k4(bay bayVar, C14244on c14244on) {
        List<C14244on> listM68725k4;
        cuq cuqVar;
        bay bayVar2 = new bay(bayVar, m64781k4(c14244on), this, c14244on);
        AbstractC0753ak abstractC0753ak = (AbstractC0753ak) m72919k4(AbstractC0753ak.class, c14244on, bayVar2);
        if (abstractC0753ak != null) {
            boolean z = false;
            boolean z2 = abstractC0753ak.mo3654x1() && c14244on.m5149yj() == 6 && c14244on.m68723h4();
            if (!z2 || (cuqVar = (cuq) m72918k4(cuq.class)) == null) {
                z = z2;
            } else {
                C13719ka c13719kaM4818kk = cuqVar.m4818kk();
                if ((c13719kaM4818kk.m63729h4().size() <= 0 || c13719kaM4818kk.m63729h4().get_Item(c13719kaM4818kk.m63729h4().size() - 1).booleanValue()) && (c13719kaM4818kk.m63730k4().size() <= 0 || c13719kaM4818kk.m63730k4().get_Item(c13719kaM4818kk.m63730k4().size() - 1).intValue() != 12)) {
                }
            }
            if (z) {
                return;
            }
            if (bayVar != null) {
                bayVar.m4110x1().addItem(bayVar2);
            }
            abstractC0753ak.m3650m9().addItem(bayVar2);
            bayVar2.m4089k4(abstractC0753ak);
            vcq vcqVar = (vcq) m72919k4(vcq.class, c14244on, bayVar2);
            if (vcqVar != null && (vcqVar.m72180kk() != -1 || vcqVar.m72181to())) {
                bayVar2.m4074dy().m74250k4(m72922rv().m3357x1(), vcqVar);
                er2 er2Var = (er2) m72919k4(er2.class, c14244on, bayVar2);
                if (er2Var != null) {
                    listM68725k4 = c14244on.m68725k4(er2Var.m5620kk(), abstractC0753ak.mo3654x1());
                } else if (C7019kk.m27469x1(abstractC0753ak, cpm.class)) {
                    C7855hi c7855hi = new C7855hi();
                    c7855hi.m33438k4("self");
                    listM68725k4 = c14244on.m68725k4(new C13719ka(c7855hi), abstractC0753ak.mo3654x1());
                } else {
                    listM68725k4 = null;
                }
                if (listM68725k4 != null) {
                    List.Enumerator<C14244on> it = listM68725k4.iterator();
                    while (it.hasNext()) {
                        try {
                            bayVar2.m4076h4().addItem(it.next());
                        } finally {
                            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                                it.dispose();
                            }
                        }
                    }
                }
            }
            IGenericEnumerator<wsu> it2 = m72920ks().iterator();
            while (it2.hasNext()) {
                try {
                    it2.next().mo4817k4(bayVar2, c14244on);
                } finally {
                    if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                        it2.dispose();
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m64774k4(bay bayVar, String str, List<bay> list) {
        if (bayVar.m4076h4().size() > 0 && C14113y2.m67363du(bayVar.m4076h4().get_Item(0).m5144ks(), str) && bayVar.m4074dy().m74287x6() && C7019kk.m27469x1(bayVar.m4077jd(), cpm.class)) {
            list.addItem(bayVar);
        }
        List.Enumerator<bay> it = bayVar.m4110x1().iterator();
        while (it.hasNext()) {
            try {
                m64774k4(it.next(), str, list);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m64775k4(wsu wsuVar, List<m6r> list) {
        IGenericEnumerator<wsu> it = wsuVar.m72920ks().iterator();
        while (it.hasNext()) {
            try {
                wsu next = it.next();
                m6r m6rVar = (m6r) C7019kk.m27452k4((Object) next, m6r.class);
                if (m6rVar != null) {
                    list.addItem(m6rVar);
                }
                m64775k4(next, list);
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m64776k4(wsu wsuVar, Stack<m6r> stack) {
        IGenericEnumerator<wsu> it = wsuVar.m72920ks().iterator();
        while (it.hasNext()) {
            try {
                m6r m6rVar = (m6r) C7019kk.m27452k4((Object) it.next(), m6r.class);
                if (m6rVar != null) {
                    stack.push(m6rVar);
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
        it = wsuVar.m72920ks().iterator();
        while (it.hasNext()) {
            try {
                m64776k4(it.next(), stack);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }
}

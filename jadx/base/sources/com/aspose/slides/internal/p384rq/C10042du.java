package com.aspose.slides.internal.p384rq;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.OooOo00;
import com.aspose.slides.internal.p032b1.C1569kk;
import com.aspose.slides.internal.p032b1.InterfaceC1566du;
import com.aspose.slides.internal.p182ii.C4907j2;
import com.aspose.slides.internal.p182ii.C4930tq;
import com.aspose.slides.internal.p182ii.C4937vh;
import com.aspose.slides.internal.p213jw.AbstractC5535bv;
import com.aspose.slides.internal.p213jw.C5532ak;
import com.aspose.slides.internal.p297ne.C6884yj;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p435u5.C11287to;
import com.aspose.slides.internal.p517y2.InterfaceC12777qq;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.rq.du */
/* JADX INFO: loaded from: classes4.dex */
class C10042du {

    /* JADX INFO: renamed from: k4 */
    private InterfaceC1566du f36193k4;

    /* JADX INFO: renamed from: kk */
    private C1569kk f36194kk;

    /* JADX INFO: renamed from: to */
    private C10043dy f36195to;

    /* JADX INFO: renamed from: x1 */
    private C10041ck f36196x1;

    /* JADX INFO: renamed from: com.aspose.slides.internal.rq.du$k4 */
    public static class k4 {

        /* JADX INFO: renamed from: k4 */
        private C1569kk f36197k4;

        /* JADX INFO: renamed from: kk */
        private IGenericList<C19068k4> f36198kk = new List();

        /* JADX INFO: renamed from: x1 */
        private C6884yj f36199x1;

        /* JADX INFO: renamed from: com.aspose.slides.internal.rq.du$k4$k4, reason: collision with other inner class name */
        public static class C19068k4 {

            /* JADX INFO: renamed from: k4 */
            private C6884yj f36200k4;

            /* JADX INFO: renamed from: x1 */
            private boolean f36201x1;

            public C19068k4(C6884yj c6884yj, boolean z) {
                m49616k4(c6884yj);
                m49617k4(z);
            }

            /* JADX INFO: renamed from: k4 */
            public final C6884yj m49615k4() {
                return this.f36200k4;
            }

            /* JADX INFO: renamed from: x1 */
            public final boolean m49618x1() {
                return this.f36201x1;
            }

            /* JADX INFO: renamed from: k4 */
            public final void m49616k4(C6884yj c6884yj) {
                this.f36200k4 = c6884yj;
            }

            /* JADX INFO: renamed from: k4 */
            public final void m49617k4(boolean z) {
                this.f36201x1 = z;
            }
        }

        public k4(C1569kk c1569kk) {
            this.f36197k4 = c1569kk;
        }

        /* JADX INFO: renamed from: c5 */
        public final C6884yj m49603c5() {
            float fM54250k4 = 0.0f;
            if (m49605dy() != null) {
                for (int i = 0; i < m49605dy().size(); i++) {
                    C19068k4 c19068k4 = m49605dy().get_Item(i);
                    if (c19068k4 != null && c19068k4.m49615k4() != null && c19068k4.m49615k4().m26946k4() != 1) {
                        fM54250k4 = C11287to.m54250k4(C11287to.m54258x1(c19068k4.m49615k4().toString())) + fM54250k4;
                    }
                }
            }
            return new C6884yj(C11287to.m54255kk(fM54250k4), 4);
        }

        /* JADX INFO: renamed from: du */
        public final IGenericList<C1569kk> m49604du() {
            List list = new List();
            for (C1569kk c1569kk = (C1569kk) C7019kk.m27452k4((Object) m49614x1().m22725x6(), C1569kk.class); c1569kk != null; c1569kk = (C1569kk) C7019kk.m27452k4((Object) c1569kk.mo22195u4(), C1569kk.class)) {
                if (OooOo00.OooO0O0(c1569kk) == 11) {
                    list.addItem(c1569kk);
                }
            }
            return list;
        }

        /* JADX INFO: renamed from: dy */
        public final IGenericList<C19068k4> m49605dy() {
            return this.f36198kk;
        }

        /* JADX INFO: renamed from: h4 */
        public final IGenericList<C1569kk> m49606h4() {
            List list = new List();
            for (C1569kk c1569kk = (C1569kk) C7019kk.m27452k4((Object) m49610kk().m22725x6(), C1569kk.class); c1569kk != null; c1569kk = (C1569kk) C7019kk.m27452k4((Object) c1569kk.mo22195u4(), C1569kk.class)) {
                if (OooOo00.OooO0O0(c1569kk) == 11) {
                    list.addItem(c1569kk);
                }
            }
            return list;
        }

        /* JADX INFO: renamed from: k4 */
        public final IGenericList<C1569kk> m49607k4(C1569kk c1569kk) {
            List list = new List();
            C1569kk c1569kk2 = (C1569kk) C7019kk.m27452k4((Object) c1569kk.m22725x6(), C1569kk.class);
            if (this.f36197k4.m8445t6().m23857u4() == 1) {
                while (c1569kk2 != null) {
                    list.insertItem(0, c1569kk2);
                    c1569kk2 = (C1569kk) C7019kk.m27452k4((Object) c1569kk2.mo22195u4(), C1569kk.class);
                }
            } else {
                while (c1569kk2 != null) {
                    list.addItem(c1569kk2);
                    c1569kk2 = (C1569kk) C7019kk.m27452k4((Object) c1569kk2.mo22195u4(), C1569kk.class);
                }
            }
            return list;
        }

        /* JADX INFO: renamed from: kk */
        public final IGenericList<C4907j2> m49609kk(C1569kk c1569kk) {
            boolean zM27456k4;
            List list = new List();
            if (c1569kk != null) {
                IGenericEnumerator<InterfaceC12777qq> it = this.f36197k4.m22716m9("COL").iterator();
                while (it.hasNext()) {
                    try {
                        list.addItem((C4907j2) it.next());
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                    }
                }
                if (zM27456k4) {
                    return list;
                }
            }
            return list;
        }

        /* JADX INFO: renamed from: m9 */
        public final void m49611m9() {
            if (!this.f36197k4.m8445t6().m23832jw().m54596m9()) {
                this.f36199x1 = this.f36197k4.m8445t6().m23832jw().m54595dy();
            }
            IGenericEnumerator<C1569kk> it = m49612to().iterator();
            while (it.hasNext()) {
                try {
                    m49602to(it.next());
                    C6884yj c6884yjM49603c5 = m49603c5();
                    if (c6884yjM49603c5.m26948x1() != 0.0f) {
                        this.f36199x1 = m49601k4(c6884yjM49603c5, this.f36199x1);
                    }
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
        }

        /* JADX INFO: renamed from: to */
        public final IGenericList<C1569kk> m49612to() {
            List list = new List();
            IGenericEnumerator<InterfaceC12777qq> it = this.f36197k4.mo22671yd().iterator();
            while (it.hasNext()) {
                try {
                    C1569kk c1569kk = (C1569kk) C7019kk.m27452k4(it.next(), C1569kk.class);
                    if (c1569kk != null && "TBODY".equals(c1569kk.mo22700du())) {
                        list.addItem(c1569kk);
                    }
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            if (list.size() == 0) {
                list.addItem(this.f36197k4);
            }
            return list;
        }

        /* JADX INFO: renamed from: x1 */
        public final IGenericList<C1569kk> m49613x1(C1569kk c1569kk) {
            List list = new List();
            for (C1569kk c1569kk2 = (C1569kk) C7019kk.m27452k4((Object) c1569kk.m22725x6(), C1569kk.class); c1569kk2 != null; c1569kk2 = (C1569kk) c1569kk2.mo22195u4()) {
                if (OooOo00.OooO0O0(c1569kk2) == 8) {
                    Object objM27452k4 = C7019kk.m27452k4((Object) c1569kk2.m22725x6(), (Class<Object>) C1569kk.class);
                    while (true) {
                        C1569kk c1569kk3 = (C1569kk) objM27452k4;
                        if (c1569kk3 != null) {
                            if (OooOo00.OooO0O0(c1569kk3) == 11) {
                                list.addItem(c1569kk3);
                            }
                            objM27452k4 = c1569kk3.mo22195u4();
                        }
                    }
                } else if (OooOo00.OooO0O0(c1569kk2) == 11 || C14113y2.m67363du(c1569kk2.mo22700du(), "TR")) {
                    list.addItem(c1569kk2);
                }
            }
            return list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: to */
        private void m49602to(C1569kk c1569kk) {
            C6884yj c6884yjM54595dy;
            boolean z;
            List list = new List();
            IGenericEnumerator<C1569kk> it = m49609kk(c1569kk).iterator();
            while (it.hasNext()) {
                try {
                    C4907j2 next = it.next();
                    if (!next.m8445t6().m23832jw().m54596m9()) {
                        list.addItem(new C19068k4(next.m8445t6().m23832jw().m54595dy(), true));
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
            it = m49613x1(c1569kk).iterator();
            while (it.hasNext()) {
                try {
                    IGenericList<C1569kk> iGenericListM49607k4 = m49607k4(it.next());
                    int i = 0;
                    while (i < iGenericListM49607k4.size()) {
                        C1569kk c1569kk2 = iGenericListM49607k4.get_Item(i);
                        if (c1569kk2.m8445t6().m23832jw().m54596m9()) {
                            c6884yjM54595dy = (this.f36197k4.m8445t6().m23862vh() != 0 || (i < list.size() && !((C19068k4) list.get_Item(i)).m49618x1())) ? m49600du(c1569kk2) : null;
                            z = false;
                        } else {
                            c6884yjM54595dy = c1569kk2.m8445t6().m23832jw().m54595dy();
                            z = true;
                        }
                        if (c6884yjM54595dy != null) {
                            if (i >= list.size()) {
                                list.addItem(new C19068k4(c6884yjM54595dy, z));
                            } else {
                                list.set_Item(i, new C19068k4(m49601k4(((C19068k4) list.get_Item(i)).m49615k4(), c6884yjM54595dy), ((C19068k4) list.get_Item(i)).m49618x1() || z));
                            }
                        }
                        i++;
                    }
                    this.f36198kk = list;
                } catch (Throwable th) {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: k4 */
        public final C1569kk m49608k4() {
            IGenericEnumerator<InterfaceC12777qq> it = this.f36197k4.mo22671yd().iterator();
            while (it.hasNext()) {
                try {
                    C1569kk c1569kk = (C1569kk) C7019kk.m27452k4(it.next(), C1569kk.class);
                    if (c1569kk != null && (C7019kk.m27469x1(c1569kk, C4937vh.class) || c1569kk.m8445t6().m23860uz().m54594m9() == 15)) {
                        return c1569kk;
                    }
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            if (!C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                return null;
            }
            it.dispose();
            return null;
        }

        /* JADX INFO: renamed from: kk */
        public final C1569kk m49610kk() {
            IGenericEnumerator<InterfaceC12777qq> it = this.f36197k4.mo22671yd().iterator();
            while (it.hasNext()) {
                try {
                    C1569kk c1569kk = (C1569kk) C7019kk.m27452k4(it.next(), C1569kk.class);
                    if (c1569kk != null && c1569kk.m8445t6().m23860uz().m54594m9() == 10) {
                        return c1569kk;
                    }
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            if (!C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                return null;
            }
            it.dispose();
            return null;
        }

        /* JADX INFO: renamed from: k4 */
        private static C6884yj m49601k4(C6884yj c6884yj, C6884yj c6884yj2) {
            if (c6884yj != c6884yj2) {
                if (C14067j2.m66729x1(c6884yj, null)) {
                    return c6884yj2;
                }
                if (!C14067j2.m66729x1(c6884yj2, null)) {
                    return (c6884yj.m26946k4() != c6884yj2.m26946k4() ? c6884yj.m26946k4() != 1 && (c6884yj2.m26946k4() == 1 || C11287to.m54250k4(C11287to.m54258x1(c6884yj.toString())) > C11287to.m54250k4(C11287to.m54258x1(c6884yj2.toString()))) : c6884yj.m26948x1() > c6884yj2.m26948x1()) ? c6884yj : c6884yj2;
                }
            }
            return c6884yj;
        }

        /* JADX INFO: renamed from: du */
        private C6884yj m49600du(C1569kk c1569kk) {
            if (c1569kk.mo22671yd() == null || c1569kk.mo22671yd().mo20312k4() == 0) {
                return null;
            }
            IGenericEnumerator<InterfaceC12777qq> it = c1569kk.mo22671yd().iterator();
            while (it.hasNext()) {
                try {
                    C1569kk c1569kk2 = (C1569kk) C7019kk.m27452k4(it.next(), C1569kk.class);
                    if (c1569kk2 != null) {
                        if (!c1569kk2.m8445t6().m23832jw().m54596m9()) {
                            return c1569kk2.m8445t6().m23832jw().m54595dy();
                        }
                        C6884yj c6884yjM49600du = m49600du(c1569kk2);
                        if (c6884yjM49600du != null) {
                            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                                it.dispose();
                            }
                            return c6884yjM49600du;
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
            return null;
        }

        /* JADX INFO: renamed from: x1 */
        public final C1569kk m49614x1() {
            IGenericEnumerator<InterfaceC12777qq> it = this.f36197k4.mo22671yd().iterator();
            while (it.hasNext()) {
                try {
                    C1569kk c1569kk = (C1569kk) C7019kk.m27452k4(it.next(), C1569kk.class);
                    if (c1569kk != null && c1569kk.m8445t6().m23860uz().m54594m9() == 9) {
                        return c1569kk;
                    }
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            if (!C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                return null;
            }
            it.dispose();
            return null;
        }
    }

    public C10042du(C10043dy c10043dy, C1569kk c1569kk, InterfaceC1566du interfaceC1566du, C10041ck c10041ck) {
        this.f36194kk = c1569kk;
        this.f36193k4 = interfaceC1566du;
        this.f36196x1 = c10041ck;
        this.f36195to = c10043dy;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m49599k4() {
        IGenericEnumerator<C4907j2> it;
        k4 k4Var = new k4(this.f36194kk);
        k4Var.m49611m9();
        if (k4Var.m49608k4() != null && k4Var.m49608k4().m8445t6().m23822fa() == 0) {
            k4Var.m49608k4().mo8441k4(this.f36193k4);
        }
        C10040c5 c10040c5 = new C10040c5(this.f36195to);
        c10040c5.m49427k1(this.f36194kk.m8445t6().m23862vh() == 1 ? "auto" : "fixed");
        if (!this.f36194kk.m8445t6().m23832jw().m54596m9()) {
            c10040c5.m49475so(this.f36194kk.m8445t6().m23832jw().toString());
        }
        this.f36196x1.m49559h4(this.f36194kk, c10040c5);
        if (this.f36194kk.m8445t6().m23862vh() == 0) {
            it = k4Var.m49609kk(this.f36194kk).iterator();
            while (it.hasNext()) {
                try {
                    C4907j2 next = it.next();
                    this.f36193k4.mo8385k4(next);
                    this.f36193k4.mo8420x1(next);
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                it.dispose();
            }
            for (int i = 0; i < k4Var.m49605dy().size(); i++) {
                k4.C19068k4 c19068k4 = k4Var.m49605dy().get_Item(i);
                C10040c5 c10040c52 = new C10040c5(this.f36195to);
                if (c19068k4 != null && c19068k4.m49618x1() && c19068k4.m49615k4() != null) {
                    c10040c52.m49480t6(c19068k4.m49615k4().toString());
                }
            }
        }
        if (k4Var.m49614x1() != null) {
            this.f36196x1.m49597x6();
            it = k4Var.m49604du().iterator();
            while (it.hasNext()) {
                try {
                    C1569kk next2 = it.next();
                    this.f36196x1.m49558h4(next2);
                    IGenericList<C1569kk> iGenericListM49607k4 = k4Var.m49607k4(next2);
                    if (iGenericListM49607k4.size() == 0) {
                        this.f36196x1.m49590u4().m49592x1();
                    } else {
                        IGenericEnumerator<C1569kk> it2 = iGenericListM49607k4.iterator();
                        while (it2.hasNext()) {
                            try {
                                C1569kk next3 = it2.next();
                                C4930tq c4930tq = (C4930tq) C7019kk.m27452k4((Object) next3, C4930tq.class);
                                if (c4930tq == null || !"TH".equals(c4930tq.mo22700du())) {
                                    this.f36193k4.mo8410up(next3);
                                } else {
                                    this.f36193k4.mo8401ks(c4930tq);
                                }
                                IGenericEnumerator<InterfaceC12777qq> it3 = next3.mo22671yd().iterator();
                                while (it3.hasNext()) {
                                    try {
                                        AbstractC5535bv abstractC5535bv = (AbstractC5535bv) it3.next();
                                        if (abstractC5535bv.mo22608fa() == 1) {
                                            ((C1569kk) abstractC5535bv).mo8441k4(this.f36193k4);
                                        } else if (abstractC5535bv.mo22608fa() == 3) {
                                            this.f36193k4.mo4656k4((C5532ak) abstractC5535bv);
                                        }
                                    } catch (Throwable th) {
                                        if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                                            it3.dispose();
                                        }
                                        throw th;
                                    }
                                }
                                if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                                    it3.dispose();
                                }
                                this.f36193k4.mo8433yj(next3);
                            } catch (Throwable th2) {
                                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                                    it2.dispose();
                                }
                                throw th2;
                            }
                        }
                        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                            it2.dispose();
                        }
                    }
                    this.f36196x1.m49592x1();
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                it.dispose();
            }
            this.f36196x1.m49592x1();
        }
        IGenericEnumerator<C1569kk> it4 = k4Var.m49612to().iterator();
        while (it4.hasNext()) {
            try {
                C1569kk next4 = it4.next();
                this.f36196x1.m49597x6();
                IGenericEnumerator<C1569kk> it5 = k4Var.m49613x1(next4).iterator();
                while (it5.hasNext()) {
                    try {
                        C1569kk next5 = it5.next();
                        this.f36196x1.m49558h4(next5);
                        IGenericList<C1569kk> iGenericListM49607k42 = k4Var.m49607k4(next5);
                        if (iGenericListM49607k42.size() == 0) {
                            this.f36196x1.m49590u4().m49592x1();
                        } else {
                            IGenericEnumerator<C1569kk> it6 = iGenericListM49607k42.iterator();
                            while (it6.hasNext()) {
                                try {
                                    C1569kk next6 = it6.next();
                                    boolean z = next6.m8445t6().m23860uz().m54594m9() == 14;
                                    if (!z) {
                                        this.f36196x1.m49590u4().m49549du();
                                        next6.mo8441k4(this.f36193k4);
                                        this.f36196x1.m49592x1().m49592x1();
                                    } else if ("TH".equals(next6.mo22700du())) {
                                        this.f36193k4.mo8401ks(next6);
                                    } else {
                                        this.f36193k4.mo8410up(next6);
                                    }
                                    if (z) {
                                        IGenericEnumerator<InterfaceC12777qq> it7 = next6.mo22671yd().iterator();
                                        while (it7.hasNext()) {
                                            try {
                                                AbstractC5535bv abstractC5535bv2 = (AbstractC5535bv) it7.next();
                                                if (abstractC5535bv2.mo22608fa() == 1) {
                                                    ((C1569kk) abstractC5535bv2).mo8441k4(this.f36193k4);
                                                } else if (abstractC5535bv2.mo22608fa() == 3) {
                                                    this.f36193k4.mo4656k4((C5532ak) abstractC5535bv2);
                                                }
                                            } catch (Throwable th4) {
                                                if (C7019kk.m27456k4((Iterator) it7, (Class<IDisposable>) IDisposable.class)) {
                                                    it7.dispose();
                                                }
                                                throw th4;
                                            }
                                        }
                                        if (C7019kk.m27456k4((Iterator) it7, (Class<IDisposable>) IDisposable.class)) {
                                            it7.dispose();
                                        }
                                        this.f36193k4.mo8433yj(next6);
                                    }
                                } catch (Throwable th5) {
                                    if (C7019kk.m27456k4((Iterator) it6, (Class<IDisposable>) IDisposable.class)) {
                                        it6.dispose();
                                    }
                                    throw th5;
                                }
                            }
                            if (C7019kk.m27456k4((Iterator) it6, (Class<IDisposable>) IDisposable.class)) {
                                it6.dispose();
                            }
                        }
                        this.f36196x1.m49592x1();
                    } catch (Throwable th6) {
                        if (C7019kk.m27456k4((Iterator) it5, (Class<IDisposable>) IDisposable.class)) {
                            it5.dispose();
                        }
                        throw th6;
                    }
                }
                if (C7019kk.m27456k4((Iterator) it5, (Class<IDisposable>) IDisposable.class)) {
                    it5.dispose();
                }
                this.f36196x1.m49592x1();
            } catch (Throwable th7) {
                if (C7019kk.m27456k4((Iterator) it4, (Class<IDisposable>) IDisposable.class)) {
                    it4.dispose();
                }
                throw th7;
            }
        }
        if (C7019kk.m27456k4((Iterator) it4, (Class<IDisposable>) IDisposable.class)) {
            it4.dispose();
        }
        if (k4Var.m49610kk() != null) {
            this.f36196x1.m49597x6();
            IGenericEnumerator<C1569kk> it8 = k4Var.m49606h4().iterator();
            while (it8.hasNext()) {
                try {
                    C1569kk next7 = it8.next();
                    this.f36196x1.m49558h4(next7);
                    IGenericList<C1569kk> iGenericListM49607k43 = k4Var.m49607k4(next7);
                    if (iGenericListM49607k43.size() == 0) {
                        this.f36196x1.m49590u4().m49592x1();
                    } else {
                        IGenericEnumerator<C1569kk> it9 = iGenericListM49607k43.iterator();
                        while (it9.hasNext()) {
                            try {
                                C1569kk next8 = it9.next();
                                C4930tq c4930tq2 = (C4930tq) C7019kk.m27452k4((Object) next8, C4930tq.class);
                                if (c4930tq2 == null || !"TH".equals(c4930tq2.mo22700du())) {
                                    this.f36193k4.mo8410up(next8);
                                } else {
                                    this.f36193k4.mo8401ks(c4930tq2);
                                }
                                IGenericEnumerator<InterfaceC12777qq> it10 = next8.mo22671yd().iterator();
                                while (it10.hasNext()) {
                                    try {
                                        AbstractC5535bv abstractC5535bv3 = (AbstractC5535bv) it10.next();
                                        if (abstractC5535bv3.mo22608fa() == 1) {
                                            ((C1569kk) abstractC5535bv3).mo8441k4(this.f36193k4);
                                        } else if (abstractC5535bv3.mo22608fa() == 3) {
                                            this.f36193k4.mo4656k4((C5532ak) abstractC5535bv3);
                                        }
                                    } catch (Throwable th8) {
                                        if (C7019kk.m27456k4((Iterator) it10, (Class<IDisposable>) IDisposable.class)) {
                                            it10.dispose();
                                        }
                                        throw th8;
                                    }
                                }
                                if (C7019kk.m27456k4((Iterator) it10, (Class<IDisposable>) IDisposable.class)) {
                                    it10.dispose();
                                }
                                this.f36193k4.mo8433yj(next8);
                            } catch (Throwable th9) {
                                if (C7019kk.m27456k4((Iterator) it9, (Class<IDisposable>) IDisposable.class)) {
                                    it9.dispose();
                                }
                                throw th9;
                            }
                        }
                        if (C7019kk.m27456k4((Iterator) it9, (Class<IDisposable>) IDisposable.class)) {
                            it9.dispose();
                        }
                    }
                    this.f36196x1.m49592x1();
                } catch (Throwable th10) {
                    if (C7019kk.m27456k4((Iterator) it8, (Class<IDisposable>) IDisposable.class)) {
                        it8.dispose();
                    }
                    throw th10;
                }
            }
            if (C7019kk.m27456k4((Iterator) it8, (Class<IDisposable>) IDisposable.class)) {
                it8.dispose();
            }
            this.f36196x1.m49592x1();
        }
        this.f36196x1.m49592x1();
        if (k4Var.m49608k4() == null || k4Var.m49608k4().m8445t6().m23822fa() != 1) {
            return;
        }
        k4Var.m49608k4().mo8441k4(this.f36193k4);
    }
}

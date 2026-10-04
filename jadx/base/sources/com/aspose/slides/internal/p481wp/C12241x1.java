package com.aspose.slides.internal.p481wp;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p048bv.C1869to;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p371qw.AbstractC9956kk;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.wp.x1 */
/* JADX INFO: loaded from: classes5.dex */
public class C12241x1 implements InterfaceC12217c5 {

    /* JADX INFO: renamed from: c5 */
    private k4 f40770c5;

    /* JADX INFO: renamed from: ck */
    private List<C12233to> f40771ck;

    /* JADX INFO: renamed from: du */
    private List<C12220dy> f40772du;

    /* JADX INFO: renamed from: h4 */
    private List<C12220dy> f40775h4;

    /* JADX INFO: renamed from: jd */
    private List<C12233to> f40776jd;

    /* JADX INFO: renamed from: k4 */
    private C12232rv f40777k4;

    /* JADX INFO: renamed from: kk */
    private List<C12220dy> f40778kk;

    /* JADX INFO: renamed from: m9 */
    private k4 f40779m9;

    /* JADX INFO: renamed from: x1 */
    private AbstractC9956kk f40781x1;

    /* JADX INFO: renamed from: fa */
    private List<C12220dy> f40774fa = null;

    /* JADX INFO: renamed from: dy */
    private k4 f40773dy = new x1(this);

    /* JADX INFO: renamed from: to */
    private boolean f40780to = true;

    /* JADX INFO: renamed from: com.aspose.slides.internal.wp.x1$k4 */
    public static abstract class k4 {

        /* JADX INFO: renamed from: du */
        private C12225k4 f40782du;

        /* JADX INFO: renamed from: k4 */
        protected AbstractC12228lr f40783k4;

        /* JADX INFO: renamed from: kk */
        protected C12241x1 f40784kk;

        /* JADX INFO: renamed from: to */
        private C12225k4 f40785to;

        /* JADX INFO: renamed from: x1 */
        protected boolean f40786x1;

        public k4(C12241x1 c12241x1) {
            this.f40784kk = c12241x1;
        }

        /* JADX INFO: renamed from: k4 */
        public void mo57178k4() {
            m57187x1(this.f40784kk.f40778kk, true, true, true);
        }

        /* JADX INFO: renamed from: kk */
        public final void m57184kk(List<C12220dy> list, boolean z, boolean z2, boolean z3) {
            if (list == null) {
                return;
            }
            for (int i = 0; i < list.size(); i++) {
                list.get_Item(i).m57041k4(1, this.f40784kk.f40777k4.m57091h4(i), z, z2, z3);
            }
        }

        /* JADX INFO: renamed from: x1 */
        public abstract void mo57185x1();

        /* JADX INFO: renamed from: x1 */
        public final void m57186x1(List<C12220dy> list) {
            for (int i = 0; i < this.f40784kk.f40777k4.m57097sv(); i++) {
                list.get_Item(i).m57039k4(1, (C12233to) this.f40784kk.f40771ck.get_Item(i), false, true, true);
            }
        }

        /* JADX INFO: renamed from: k4 */
        public final void m57179k4(List<C12220dy> list) {
            for (int i = 0; i < this.f40784kk.f40777k4.m57097sv(); i++) {
                list.get_Item(i).m57039k4(0, (C12233to) this.f40784kk.f40776jd.get_Item(i), false, true, true);
            }
        }

        /* JADX INFO: renamed from: x1 */
        public final void m57187x1(List<C12220dy> list, boolean z, boolean z2, boolean z3) {
            if (list == null) {
                return;
            }
            for (int i = 0; i < list.size(); i++) {
                list.get_Item(i).m57041k4(1, this.f40783k4, z, z2, z3);
            }
        }

        /* JADX INFO: renamed from: k4 */
        public final void m57180k4(List<C12220dy> list, List<C12220dy> list2) {
            for (int i = 0; i < list2.size(); i++) {
                C12220dy c12220dy = list2.get_Item(i);
                if (c12220dy.m57029c5() == 0) {
                    c12220dy.m57043k4(list.get_Item(i), 0);
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: k4 */
        public void mo57181k4(List<C12220dy> list, AbstractC12237uz abstractC12237uz) {
            C12225k4 c12225k4Mo49001k4 = this.f40785to;
            C12225k4 c12225k4Mo49001k42 = this.f40782du;
            if (C7019kk.m27469x1(abstractC12237uz, C12243yd.class)) {
                C12243yd c12243yd = (C12243yd) abstractC12237uz;
                List.Enumerator<C12220dy> it = list.iterator();
                while (it.hasNext()) {
                    try {
                        C12220dy next = it.next();
                        boolean z = next.m57029c5() == 0;
                        boolean zMo57031du = next.mo57031du();
                        next.m57041k4(0, (AbstractC12235um) c12243yd, z, z, true);
                        next.m57041k4(1, (AbstractC12235um) c12243yd, zMo57031du, zMo57031du, true);
                    } finally {
                    }
                }
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                c12225k4Mo49001k4 = this.f40784kk.f40781x1.mo49001k4(c12225k4Mo49001k4, c12243yd.f40735up);
                c12225k4Mo49001k42 = this.f40784kk.f40781x1.mo49001k4(c12225k4Mo49001k42, c12243yd.f40736yj);
            }
            if (this.f40786x1) {
                for (int i = 0; i < list.size(); i++) {
                    list.get_Item(i).m57041k4(0, (AbstractC12235um) this.f40783k4, true, true, true);
                }
                this.f40786x1 = false;
            }
            C1869to c1869to = new C1869to(list);
            C12220dy c12220dy = (C12220dy) c1869to.mo9760kk();
            C1869to c1869to2 = new C1869to(this.f40784kk.f40777k4.m57089g8());
            C12239wl c12239wl = (C12239wl) c1869to2.mo9760kk();
            c12220dy.m57040k4(2, c12239wl);
            c12220dy.m57038k4(2, c12225k4Mo49001k4);
            while (c1869to.mo9764x1()) {
                C12220dy c12220dy2 = (C12220dy) c1869to.mo9760kk();
                C12239wl c12239wl2 = (C12239wl) c1869to2.mo9760kk();
                if (c12220dy.mo57049to()) {
                    c12220dy.m57040k4(3, c12239wl);
                    c12220dy2.m57040k4(2, c12239wl2);
                    c12220dy.m57043k4(c12220dy2, 3);
                }
                c12220dy = c12220dy2;
                c12239wl = c12239wl2;
            }
            c12220dy.m57040k4(3, c12239wl);
            c12220dy.m57038k4(3, c12225k4Mo49001k42);
        }

        /* JADX INFO: renamed from: k4 */
        public final void m57182k4(List<C12220dy> list, boolean z, boolean z2, boolean z3) {
            for (int i = 0; i < list.size(); i++) {
                list.get_Item(i).m57041k4(0, this.f40784kk.f40777k4.m57091h4(i), z, z2, z3);
            }
            this.f40784kk.f40780to = false;
        }

        /* JADX INFO: renamed from: k4 */
        public final void m57183k4(AbstractC12228lr abstractC12228lr) {
            this.f40783k4 = abstractC12228lr;
            this.f40786x1 = true;
            this.f40785to = this.f40784kk.f40781x1.mo49001k4(this.f40784kk.f40777k4.f40735up, this.f40783k4.f40735up);
            this.f40782du = this.f40784kk.f40781x1.mo49001k4(this.f40784kk.f40777k4.f40736yj, this.f40783k4.f40736yj);
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.wp.x1$kk */
    public static class kk extends k4 {
        public kk(C12241x1 c12241x1) {
            super(c12241x1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.aspose.slides.internal.p481wp.C12241x1.k4
        /* JADX INFO: renamed from: k4 */
        public void mo57178k4() {
            m57187x1(this.f40784kk.f40775h4, true, true, true);
            C12241x1 c12241x1 = this.f40784kk;
            c12241x1.f40771ck = new List(c12241x1.f40777k4.m57097sv());
            List.Enumerator it = this.f40784kk.f40772du.iterator();
            while (it.hasNext()) {
                try {
                    C12233to c12233to = ((C12220dy) it.next()).f40656x1;
                    C12225k4 c12225k4 = c12233to.f40711k4;
                    c12233to.f40714x1 = c12225k4;
                    c12233to.f40712kk = c12225k4;
                    this.f40784kk.f40771ck.addItem(c12233to);
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.aspose.slides.internal.p481wp.C12241x1.k4
        /* JADX INFO: renamed from: x1 */
        public void mo57185x1() {
            m57180k4(this.f40784kk.f40778kk, this.f40784kk.f40772du);
            List.Enumerator it = this.f40784kk.f40775h4.iterator();
            while (it.hasNext()) {
                try {
                    C12233to c12233to = ((C12220dy) it.next()).f40653kk;
                    C12225k4 c12225k4 = c12233to.f40711k4;
                    c12233to.f40714x1 = c12225k4;
                    c12233to.f40712kk = c12225k4;
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            m57184kk(this.f40784kk.f40775h4, true, false, true);
        }

        @Override // com.aspose.slides.internal.p481wp.C12241x1.k4
        /* JADX INFO: renamed from: k4 */
        public void mo57181k4(List<C12220dy> list, AbstractC12237uz abstractC12237uz) {
            super.mo57181k4(list, abstractC12237uz);
            if (this.f40784kk.f40772du == null) {
                this.f40784kk.f40772du = list;
            } else {
                m57180k4(this.f40784kk.f40775h4, list);
            }
            this.f40784kk.f40775h4 = list;
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.wp.x1$to */
    public static class to extends k4 {
        public to(C12241x1 c12241x1) {
            super(c12241x1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.aspose.slides.internal.p481wp.C12241x1.k4
        /* JADX INFO: renamed from: k4 */
        public void mo57178k4() {
            super.mo57178k4();
            C12241x1 c12241x1 = this.f40784kk;
            c12241x1.f40776jd = new List(c12241x1.f40777k4.m57097sv());
            List.Enumerator it = this.f40784kk.f40778kk.iterator();
            while (it.hasNext()) {
                try {
                    C12233to c12233to = ((C12220dy) it.next()).f40653kk;
                    C12225k4 c12225k4 = c12233to.f40711k4;
                    c12233to.f40714x1 = c12225k4;
                    c12233to.f40712kk = c12225k4;
                    this.f40784kk.f40776jd.addItem(c12233to);
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            C12241x1 c12241x12 = this.f40784kk;
            c12241x12.f40774fa = c12241x12.f40778kk;
        }

        @Override // com.aspose.slides.internal.p481wp.C12241x1.k4
        /* JADX INFO: renamed from: x1 */
        public void mo57185x1() {
            throw new InvalidOperationException();
        }

        @Override // com.aspose.slides.internal.p481wp.C12241x1.k4
        /* JADX INFO: renamed from: k4 */
        public void mo57181k4(List<C12220dy> list, AbstractC12237uz abstractC12237uz) {
            super.mo57181k4(list, abstractC12237uz);
            if (this.f40784kk.f40778kk != null) {
                m57180k4(this.f40784kk.f40778kk, list);
            } else {
                List.Enumerator<C12220dy> it = list.iterator();
                while (it.hasNext()) {
                    try {
                        C12233to c12233to = it.next().f40656x1;
                        C12225k4 c12225k4 = c12233to.f40711k4;
                        c12233to.f40714x1 = c12225k4;
                        c12233to.f40712kk = c12225k4;
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                    }
                }
                m57182k4(list, true, false, true);
            }
            this.f40784kk.f40778kk = list;
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.wp.x1$x1 */
    public static class x1 extends k4 {

        /* JADX INFO: renamed from: to */
        private boolean f40787to;

        public x1(C12241x1 c12241x1) {
            super(c12241x1);
            this.f40787to = true;
        }

        @Override // com.aspose.slides.internal.p481wp.C12241x1.k4
        /* JADX INFO: renamed from: k4 */
        public void mo57181k4(List<C12220dy> list, AbstractC12237uz abstractC12237uz) {
            super.mo57181k4(list, abstractC12237uz);
            if (this.f40784kk.f40780to) {
                m57182k4(list, true, true, true);
            } else {
                m57180k4(this.f40784kk.f40778kk, list);
                m57179k4(list);
            }
            m57186x1(list);
            this.f40784kk.f40778kk = list;
            if (this.f40787to) {
                this.f40787to = false;
                List.Enumerator<C12220dy> it = list.iterator();
                while (it.hasNext()) {
                    try {
                        C12233to c12233to = it.next().f40656x1;
                        c12233to.f40714x1 = c12233to.f40711k4;
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                    }
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.aspose.slides.internal.p481wp.C12241x1.k4
        /* JADX INFO: renamed from: x1 */
        public void mo57185x1() {
            if (this.f40784kk.f40770c5 != null) {
                this.f40784kk.f40770c5.mo57185x1();
            } else {
                m57184kk(this.f40784kk.f40778kk, true, false, false);
            }
            C12241x1 c12241x1 = this.f40784kk;
            if (c12241x1 == null || c12241x1.f40778kk == null) {
                return;
            }
            List.Enumerator it = this.f40784kk.f40778kk.iterator();
            while (it.hasNext()) {
                try {
                    C12233to c12233to = ((C12220dy) it.next()).f40653kk;
                    c12233to.f40714x1 = c12233to.f40711k4;
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
        }
    }

    public C12241x1(C12232rv c12232rv) {
        this.f40777k4 = c12232rv;
        this.f40781x1 = AbstractC9956kk.m48996k4(c12232rv.m57087em());
        int iM57150g8 = 0;
        do {
            C12239wl c12239wlM57091h4 = c12232rv.m57091h4(iM57150g8);
            ((AbstractC12235um) c12239wlM57091h4).f40729ck.m57106kk(((AbstractC12235um) c12232rv).f40729ck, true, false, true);
            C12233to c12233to = ((AbstractC12235um) c12239wlM57091h4).f40729ck;
            c12233to.f40714x1 = c12233to.f40712kk;
            ((AbstractC12235um) c12239wlM57091h4).f40731fa.m57106kk(((AbstractC12235um) c12232rv).f40731fa, true, false, true);
            C12233to c12233to2 = ((AbstractC12235um) c12239wlM57091h4).f40731fa;
            c12233to2.f40714x1 = c12233to2.f40712kk;
            iM57150g8 += c12239wlM57091h4.m57150g8();
        } while (iM57150g8 < c12232rv.m57097sv());
    }

    @Override // com.aspose.slides.internal.p481wp.InterfaceC12217c5
    /* JADX INFO: renamed from: k4 */
    public final void mo56998k4() {
        this.f40779m9.mo57178k4();
    }

    @Override // com.aspose.slides.internal.p481wp.InterfaceC12217c5
    /* JADX INFO: renamed from: x1 */
    public final void mo57001x1() {
        List.Enumerator<C12220dy> it;
        k4 k4Var = this.f40779m9;
        if (k4Var != null) {
            k4Var.mo57185x1();
        }
        this.f40779m9 = null;
        List<C12220dy> list = this.f40774fa;
        if (list != null) {
            it = list.iterator();
            while (it.hasNext()) {
                try {
                    C12233to c12233to = it.next().f40653kk;
                    c12233to.f40714x1 = c12233to.f40711k4;
                } finally {
                }
            }
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                it.dispose();
            }
        }
        List<C12220dy> list2 = this.f40775h4;
        if (list2 != null) {
            it = list2.iterator();
            while (it.hasNext()) {
                try {
                    C12233to c12233to2 = it.next().f40653kk;
                    c12233to2.f40714x1 = c12233to2.f40711k4;
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
        }
    }

    @Override // com.aspose.slides.internal.p481wp.InterfaceC12217c5
    /* JADX INFO: renamed from: k4 */
    public final void mo56999k4(List<C12220dy> list, AbstractC12237uz abstractC12237uz) {
        this.f40779m9.mo57181k4(list, abstractC12237uz);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.slides.internal.p481wp.InterfaceC12217c5
    /* JADX INFO: renamed from: k4 */
    public final void mo57000k4(AbstractC12228lr abstractC12228lr) {
        k4 kkVar;
        if (C7019kk.m27469x1(abstractC12228lr, C12238v4.class)) {
            kkVar = new to(this);
        } else {
            if (this.f40776jd == null || this.f40777k4.m57096s7()) {
                this.f40776jd = new List<>(this.f40777k4.m57097sv());
                C1869to c1869to = new C1869to(this.f40777k4.m57089g8());
                while (c1869to.mo9764x1()) {
                    this.f40776jd.addItem(((AbstractC12235um) ((C12239wl) c1869to.mo9760kk())).f40729ck);
                }
            }
            if (C7019kk.m27469x1(abstractC12228lr, C12216bv.class)) {
                kkVar = new kk(this);
                this.f40770c5 = kkVar;
            } else {
                if (this.f40771ck == null || this.f40777k4.m57088f9()) {
                    this.f40771ck = new List<>(this.f40777k4.m57097sv());
                    C1869to c1869to2 = new C1869to(this.f40777k4.m57089g8());
                    while (c1869to2.mo9764x1()) {
                        this.f40771ck.addItem(((AbstractC12235um) ((C12239wl) c1869to2.mo9760kk())).f40731fa);
                    }
                }
                kkVar = this.f40773dy;
            }
        }
        this.f40779m9 = kkVar;
        this.f40779m9.m57183k4(abstractC12228lr);
    }
}

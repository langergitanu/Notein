package com.aspose.slides.internal.p198j2;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.Stack;
import com.aspose.slides.internal.p151gj.C4317dy;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p420th.AbstractC10957fa;
import com.aspose.slides.internal.p420th.AbstractC10972up;
import com.aspose.slides.internal.p420th.AbstractC10973uz;
import com.aspose.slides.internal.p420th.C10947ak;
import com.aspose.slides.internal.p420th.C10948ar;
import com.aspose.slides.internal.p420th.C10950bv;
import com.aspose.slides.internal.p420th.C10951c5;
import com.aspose.slides.internal.p420th.C10953ck;
import com.aspose.slides.internal.p420th.C10955du;
import com.aspose.slides.internal.p420th.C10956dy;
import com.aspose.slides.internal.p420th.C10958h4;
import com.aspose.slides.internal.p420th.C10959ix;
import com.aspose.slides.internal.p420th.C10960jd;
import com.aspose.slides.internal.p420th.C10963ks;
import com.aspose.slides.internal.p420th.C10965m9;
import com.aspose.slides.internal.p420th.C10966ne;
import com.aspose.slides.internal.p420th.C10967qq;
import com.aspose.slides.internal.p420th.C10970u4;
import com.aspose.slides.internal.p420th.C10971um;
import com.aspose.slides.internal.p420th.C10974v4;
import com.aspose.slides.internal.p420th.C10980yd;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.j2.x1 */
/* JADX INFO: loaded from: classes.dex */
public class C5191x1 extends AbstractC10972up {

    /* JADX INFO: renamed from: du */
    private Dictionary<AbstractC10973uz, Boolean> f14189du;

    /* JADX INFO: renamed from: k4 */
    private C10948ar f14190k4;

    /* JADX INFO: renamed from: x1 */
    private List<k4> f14193x1 = new List<>();

    /* JADX INFO: renamed from: kk */
    private C12007ix f14191kk = C12007ix.f40519k4.Clone();

    /* JADX INFO: renamed from: to */
    private Stack<AbstractC10957fa> f14192to = new Stack<>();

    /* JADX INFO: renamed from: com.aspose.slides.internal.j2.x1$k4 */
    public static class k4 {

        /* JADX INFO: renamed from: k4 */
        private C10951c5 f14194k4;

        /* JADX INFO: renamed from: kk */
        private boolean f14195kk;

        /* JADX INFO: renamed from: to */
        private boolean f14196to;

        /* JADX INFO: renamed from: x1 */
        private boolean f14197x1;

        public k4(C10951c5 c10951c5, boolean z, boolean z2, boolean z3) {
            this.f14194k4 = c10951c5;
            this.f14197x1 = z;
            this.f14195kk = z2;
            this.f14196to = z3;
        }

        /* JADX INFO: renamed from: k4 */
        public final C10951c5 m22177k4() {
            return this.f14194k4;
        }

        /* JADX INFO: renamed from: kk */
        public final boolean m22178kk() {
            return this.f14196to;
        }

        /* JADX INFO: renamed from: to */
        public final boolean m22179to() {
            return this.f14195kk;
        }

        /* JADX INFO: renamed from: x1 */
        public final boolean m22180x1() {
            return this.f14197x1;
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.j2.x1$x1 */
    public static class x1 extends AbstractC10972up {

        /* JADX INFO: renamed from: k4 */
        private Dictionary<AbstractC10973uz, Boolean> f14198k4;

        /* JADX INFO: renamed from: kk */
        private Stack<AbstractC10957fa> f14199kk = new Stack<>();

        /* JADX INFO: renamed from: x1 */
        private C10948ar f14200x1;

        public x1(Dictionary<AbstractC10973uz, Boolean> dictionary) {
            this.f14198k4 = dictionary;
        }

        /* JADX INFO: renamed from: k4 */
        public final C10948ar m22182k4() {
            return this.f14200x1;
        }

        @Override // com.aspose.slides.internal.p420th.AbstractC10972up
        /* JADX INFO: renamed from: x1 */
        public void mo13529x1(C10950bv c10950bv) {
            this.f14199kk.pop();
        }

        @Override // com.aspose.slides.internal.p420th.AbstractC10972up
        /* JADX INFO: renamed from: k4 */
        public void mo16971k4(C10947ak c10947ak) {
            m22181k4((AbstractC10973uz) c10947ak);
        }

        @Override // com.aspose.slides.internal.p420th.AbstractC10972up
        /* JADX INFO: renamed from: x1 */
        public void mo13530x1(C10951c5 c10951c5) {
            this.f14199kk.pop();
        }

        @Override // com.aspose.slides.internal.p420th.AbstractC10972up
        /* JADX INFO: renamed from: k4 */
        public void mo16972k4(C10948ar c10948ar) {
            C10948ar c10948ar2 = new C10948ar(c10948ar.m52876x1(), c10948ar.m52874kk());
            this.f14200x1 = c10948ar2;
            this.f14199kk.push(c10948ar2);
        }

        @Override // com.aspose.slides.internal.p420th.AbstractC10972up
        /* JADX INFO: renamed from: x1 */
        public void mo13516x1(C10971um c10971um) {
            C10971um c10971um2 = new C10971um();
            if (!this.f14198k4.containsKey(c10971um)) {
                c10971um2.m53099k4(c10971um2.mo52909to());
                c10971um2.m53103k4(c10971um2.mo52902du());
                c10971um2.m53101k4(c10971um.m53107x1());
                c10971um2.m53105kk(c10971um.m53097h4());
                this.f14199kk.peek().m52930k4(c10971um2);
            }
            this.f14199kk.push(c10971um2);
        }

        @Override // com.aspose.slides.internal.p420th.AbstractC10972up
        /* JADX INFO: renamed from: k4 */
        public void mo13521k4(C10950bv c10950bv) {
            C10950bv c10950bv2 = new C10950bv();
            if (!this.f14198k4.containsKey(c10950bv)) {
                c10950bv2.m52895k4(c10950bv.m52896k4());
                this.f14199kk.peek().m52930k4(c10950bv2);
            }
            this.f14199kk.push(c10950bv2);
        }

        @Override // com.aspose.slides.internal.p420th.AbstractC10972up
        /* JADX INFO: renamed from: k4 */
        public void mo13522k4(C10951c5 c10951c5) {
            C10951c5 c10951c52 = new C10951c5();
            if (!this.f14198k4.containsKey(c10951c5)) {
                c10951c52.m52904k4(c10951c5.mo52909to());
                c10951c52.m52907k4(c10951c5.mo52902du());
                this.f14199kk.peek().m52930k4(c10951c52);
            }
            this.f14199kk.push(c10951c52);
        }

        @Override // com.aspose.slides.internal.p420th.AbstractC10972up
        /* JADX INFO: renamed from: k4 */
        public void mo16973k4(C10953ck c10953ck) {
            m22181k4((AbstractC10973uz) c10953ck);
        }

        @Override // com.aspose.slides.internal.p420th.AbstractC10972up
        /* JADX INFO: renamed from: k4 */
        public void mo13523k4(C10955du c10955du) {
            m22181k4((AbstractC10973uz) c10955du);
        }

        @Override // com.aspose.slides.internal.p420th.AbstractC10972up
        /* JADX INFO: renamed from: k4 */
        public void mo16974k4(C10956dy c10956dy) {
            m22181k4((AbstractC10973uz) c10956dy);
        }

        @Override // com.aspose.slides.internal.p420th.AbstractC10972up
        /* JADX INFO: renamed from: k4 */
        public void mo16975k4(C10958h4 c10958h4) {
            m22181k4((AbstractC10973uz) c10958h4);
        }

        @Override // com.aspose.slides.internal.p420th.AbstractC10972up
        /* JADX INFO: renamed from: k4 */
        public void mo16976k4(C10960jd c10960jd) {
            m22181k4((AbstractC10973uz) c10960jd);
        }

        @Override // com.aspose.slides.internal.p420th.AbstractC10972up
        /* JADX INFO: renamed from: k4 */
        public void mo13524k4(C10963ks c10963ks) {
            m22181k4((AbstractC10973uz) c10963ks);
        }

        @Override // com.aspose.slides.internal.p420th.AbstractC10972up
        /* JADX INFO: renamed from: k4 */
        public void mo16977k4(C10967qq c10967qq) {
            m22181k4((AbstractC10973uz) c10967qq);
        }

        @Override // com.aspose.slides.internal.p420th.AbstractC10972up
        /* JADX INFO: renamed from: k4 */
        public void mo13525k4(C10970u4 c10970u4) {
            m22181k4((AbstractC10973uz) c10970u4);
        }

        @Override // com.aspose.slides.internal.p420th.AbstractC10972up
        /* JADX INFO: renamed from: k4 */
        public void mo13515k4(C10971um c10971um) {
            this.f14199kk.pop();
        }

        /* JADX INFO: renamed from: k4 */
        private void m22181k4(AbstractC10973uz abstractC10973uz) {
            if (this.f14198k4.containsKey(abstractC10973uz)) {
                return;
            }
            this.f14199kk.peek().m52930k4(abstractC10973uz);
        }

        @Override // com.aspose.slides.internal.p420th.AbstractC10972up
        /* JADX INFO: renamed from: k4 */
        public void mo13528k4(C10974v4 c10974v4) {
            m22181k4((AbstractC10973uz) c10974v4);
        }

        @Override // com.aspose.slides.internal.p420th.AbstractC10972up
        /* JADX INFO: renamed from: k4 */
        public void mo16979k4(C10980yd c10980yd) {
            m22181k4((AbstractC10973uz) c10980yd);
        }

        @Override // com.aspose.slides.internal.p420th.AbstractC10972up
        /* JADX INFO: renamed from: k4 */
        public boolean mo22157k4(C10966ne c10966ne) {
            m22181k4((AbstractC10973uz) c10966ne);
            return true;
        }
    }

    public C5191x1(Dictionary<AbstractC10973uz, Boolean> dictionary) {
        this.f14189du = dictionary;
    }

    /* JADX INFO: renamed from: du */
    private void m22164du(C10951c5 c10951c5) {
        C10950bv c10950bv = new C10950bv();
        c10950bv.m52899x1(new C12007ix(0.0f, this.f14191kk.m56551ck(), this.f14190k4.m52876x1(), this.f14191kk.m56575x1()));
        C10951c5 c10951c52 = new C10951c5();
        C10971um c10971um = new C10971um();
        c10971um.m52930k4(c10950bv);
        c10951c52.m52907k4(c10971um);
        c10951c52.m52930k4(c10951c5);
        this.f14190k4.m52930k4(c10951c52);
    }

    /* JADX INFO: renamed from: h4 */
    private C10951c5 m22165h4(C10951c5 c10951c5) {
        C10951c5 c10951c52 = new C10951c5();
        if (c10951c5.mo52909to() != null) {
            c10951c52.m52904k4(c10951c5.mo52909to().m17345kk());
        }
        if (c10951c5.mo52902du() != null) {
            c10951c52.m52907k4(c10951c5.mo52902du());
            if (c10951c5.mo52902du().mo52909to() != null) {
                c10951c52.mo52902du().m53099k4(c10951c5.mo52902du().mo52909to().m17345kk());
            }
        }
        return c10951c52;
    }

    /* JADX INFO: renamed from: k4 */
    private C10951c5 m22166k4() {
        C10951c5 c10951c5 = new C10951c5();
        if (this.f14192to.size() > 1) {
            AbstractC10957fa[] array = this.f14192to.toArray(new AbstractC10957fa[0]);
            int length = array.length - 2;
            while (length >= 0) {
                C10951c5 c10951c5M22165h4 = m22165h4((C10951c5) array[length]);
                c10951c5.m52930k4(c10951c5M22165h4);
                length--;
                c10951c5 = c10951c5M22165h4;
            }
        }
        return c10951c5;
    }

    /* JADX INFO: renamed from: kk */
    private C10951c5 m22171kk(C10951c5 c10951c5) {
        C10951c5 c10951c5M22165h4 = m22165h4(c10951c5);
        for (int i = 0; i < c10951c5.m52927c5(); i++) {
            c10951c5M22165h4.m52930k4(C7019kk.m27469x1(c10951c5.m52931k4(i), C10951c5.class) ? m22171kk((C10951c5) C7019kk.m27452k4((Object) c10951c5.m52931k4(i), C10951c5.class)) : c10951c5.m52931k4(i));
        }
        return c10951c5M22165h4;
    }

    /* JADX INFO: renamed from: m9 */
    private C10951c5 m22173m9(C10951c5 c10951c5) {
        if (c10951c5.m52927c5() == 0) {
            return null;
        }
        C10951c5 c10951c52 = (C10951c5) C7019kk.m27452k4((Object) c10951c5.m52931k4(0), C10951c5.class);
        if (c10951c52 != null) {
            C10951c5 c10951c5M22173m9 = m22173m9(c10951c52);
            if (c10951c5M22173m9 == null) {
                return null;
            }
            c10951c5.m52932x1(c10951c52);
            if (c10951c5M22173m9.mo52902du() != null) {
                c10951c5.m52930k4(c10951c5M22173m9);
                return c10951c5;
            }
            if (c10951c5M22173m9.mo52909to() != null) {
                if (c10951c5.mo52909to() == null) {
                    c10951c5.m52904k4(new C4317dy());
                }
                c10951c5.mo52909to().m17341k4(c10951c5M22173m9.mo52909to(), 0);
                for (int i = 0; i < c10951c5M22173m9.m52927c5(); i++) {
                    c10951c5.m52930k4(c10951c5M22173m9.m52931k4(i));
                }
            }
        }
        return c10951c5;
    }

    /* JADX INFO: renamed from: to */
    private static C10951c5 m22174to(C10951c5 c10951c5) {
        C10951c5 c10951c52 = new C10951c5();
        if (c10951c5.mo52909to() != null) {
            c10951c52.m52904k4(c10951c5.mo52909to().m17345kk());
        }
        c10951c52.m52907k4(c10951c5.mo52902du());
        for (int i = 0; i < c10951c5.m52927c5(); i++) {
            c10951c52.m52930k4(c10951c5.m52931k4(i));
        }
        return c10951c52;
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: x1 */
    public void mo16981x1(C10948ar c10948ar) {
        this.f14192to.pop();
    }

    /* JADX INFO: renamed from: k4 */
    public static C10959ix m22167k4(C10959ix c10959ix, C12007ix c12007ix) {
        return c10959ix.m52937du() != 0 ? c10959ix.m52937du() == 7 ? new C10959ix(c12007ix.Clone(), c10959ix.m52938h4(), c10959ix.m52942m9()) : new C10959ix(c10959ix.m52937du(), c12007ix.Clone(), c10959ix.m52942m9()) : new C10959ix(c12007ix.Clone(), c10959ix.m52941kk(), c10959ix.m52942m9());
    }

    /* JADX INFO: renamed from: kk */
    private C10951c5 m22172kk(AbstractC10973uz abstractC10973uz) {
        return abstractC10973uz.m53116um() == null ? (C10951c5) abstractC10973uz : m22172kk(abstractC10973uz.m53116um());
    }

    /* JADX INFO: renamed from: to */
    private void m22175to(AbstractC10973uz abstractC10973uz) {
        C10951c5 c10951c5M22166k4 = m22166k4();
        c10951c5M22166k4.m52930k4(abstractC10973uz);
        C10951c5 c10951c5M22173m9 = m22173m9(m22172kk((AbstractC10973uz) c10951c5M22166k4));
        if (c10951c5M22173m9 == null) {
            return;
        }
        C10951c5 c10951c5 = new C10951c5();
        c10951c5.m52930k4(c10951c5M22173m9);
        this.f14193x1.addItem(new k4(c10951c5, this.f14189du.containsKey(abstractC10973uz), C7019kk.m27469x1(abstractC10973uz, C10971um.class) && ((C10971um) abstractC10973uz).m53095ck() != null, C7019kk.m27469x1(abstractC10973uz, C10971um.class)));
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: x1 */
    public void mo13530x1(C10951c5 c10951c5) {
        this.f14192to.pop();
    }

    /* JADX INFO: renamed from: k4 */
    public static C12007ix m22168k4(AbstractC10973uz abstractC10973uz) {
        return new C10965m9().m53022k4(abstractC10973uz);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m22176k4(List<C10948ar> list, C12007ix c12007ix) {
        C12007ix c12007ixM22168k4;
        c12007ix.CloneTo(this.f14191kk);
        if (list.size() == 0) {
            return;
        }
        int i = 0;
        C10948ar c10948ar = new C10948ar(list.get_Item(0).m52876x1(), list.get_Item(0).m52874kk());
        List<C10948ar> list2 = new List<>();
        float fM56575x1 = 0.0f;
        int i2 = 0;
        while (i2 < list.size()) {
            C10948ar c10948ar2 = list.get_Item(i2);
            C12007ix c12007ix2 = new C12007ix();
            if (this.f14189du.size() > 0) {
                x1 x1Var = new x1(this.f14189du);
                x1Var.m53112x1((AbstractC10973uz) c10948ar2);
                c12007ixM22168k4 = m22168k4((AbstractC10973uz) x1Var.m22182k4());
            } else {
                c12007ixM22168k4 = m22168k4((AbstractC10973uz) c10948ar2);
            }
            c12007ixM22168k4.CloneTo(c12007ix2);
            if (((c12007ix2.m56558k4() <= c10948ar2.m52874kk() || c12007ix2.m56575x1() <= c10948ar2.m52874kk()) && c10948ar.m52927c5() == 0) || !m22170k4(list)) {
                list2.addItem(c10948ar2);
            } else {
                for (int i3 = i; i3 < c10948ar2.m52927c5(); i3++) {
                    C10951c5 c10951c5 = new C10951c5();
                    c10951c5.m52930k4(c10948ar2.m52931k4(i3));
                    c10948ar.m52930k4(c10951c5);
                    c10951c5.m52904k4(new C4317dy(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, fM56575x1));
                }
                fM56575x1 = c12007ix2.m56575x1() + fM56575x1;
            }
            i2++;
            i = 0;
        }
        if (c10948ar.m52927c5() > 0) {
            m53112x1((AbstractC10973uz) c10948ar);
            m22169k4(list2, new C12015qq(this.f14190k4.m52876x1(), this.f14190k4.m52874kk()));
        }
        list.clear();
        list.addRange(list2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    private void m22169k4(List<C10948ar> list, C12015qq c12015qq) {
        boolean z = true;
        while (this.f14193x1.size() > 0) {
            this.f14190k4 = new C10948ar(c12015qq.m56699x1(), c12015qq.m56697kk());
            List list2 = new List();
            List list3 = new List();
            List.Enumerator it = this.f14193x1.iterator();
            float fM67481k4 = 0.0f;
            while (it.hasNext()) {
                try {
                    k4 next = it.next();
                    C10951c5 c10951c5M22171kk = m22171kk(next.m22177k4());
                    list3.addItem(new k4(c10951c5M22171kk, next.m22180x1(), next.m22179to(), next.m22178kk()));
                    if (c10951c5M22171kk.mo52909to() == null) {
                        c10951c5M22171kk.m52904k4(new C4317dy());
                    }
                    if (!z) {
                        c10951c5M22171kk.mo52909to().m17348x1(0.0f, (-this.f14191kk.m56575x1()) + this.f14191kk.m56554dy());
                    }
                    C12007ix c12007ixClone = m22168k4((AbstractC10973uz) c10951c5M22171kk).Clone();
                    list2.addItem(c12007ixClone.Clone());
                    if (!next.m22180x1() && !next.m22179to() && c12007ixClone.m56554dy() <= this.f14191kk.m56558k4() && c12007ixClone.m56558k4() > this.f14191kk.m56558k4() && c12007ixClone.m56575x1() <= this.f14191kk.m56575x1()) {
                        float fM56558k4 = this.f14191kk.m56558k4() - c12007ixClone.m56554dy();
                        if (!next.m22178kk() || fM56558k4 / this.f14191kk.m56575x1() < 0.3d) {
                            fM67481k4 = C14116yg.m67481k4(fM67481k4, fM56558k4);
                        }
                    }
                } finally {
                }
            }
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                it.dispose();
            }
            float fM56558k42 = (this.f14191kk.m56558k4() - fM67481k4) - 1.0f;
            for (int i = 0; i < list2.size(); i++) {
                C12007ix c12007ixClone2 = ((C12007ix) list2.get_Item(i)).Clone();
                k4 k4Var = this.f14193x1.get_Item(i);
                if (!k4Var.m22180x1() && !k4Var.m22179to() && c12007ixClone2.m56554dy() <= fM56558k42 && c12007ixClone2.m56558k4() > fM56558k42 && c12007ixClone2.m56575x1() <= this.f14191kk.m56575x1() && fM56558k42 - c12007ixClone2.m56554dy() < 5.0f) {
                    fM67481k4 = C14116yg.m67481k4(fM67481k4, fM56558k42 - c12007ixClone2.m56554dy());
                }
            }
            this.f14193x1.clear();
            float fM56558k43 = this.f14191kk.m56558k4() - fM67481k4;
            it = list3.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                try {
                    k4 k4Var2 = (k4) it.next();
                    int i3 = i2 + 1;
                    C12007ix c12007ixClone3 = ((C12007ix) list2.get_Item(i2)).Clone();
                    if (c12007ixClone3.m56554dy() >= fM56558k43 && c12007ixClone3.m56575x1() <= this.f14191kk.m56575x1()) {
                        this.f14193x1.addItem(new k4(k4Var2.m22177k4(), k4Var2.m22180x1(), k4Var2.m22179to(), k4Var2.m22178kk()));
                        k4Var2.m22177k4().mo52909to().m17348x1(0.0f, fM67481k4);
                    } else if ((k4Var2.m22180x1() || c12007ixClone3.m56575x1() <= this.f14191kk.m56575x1()) && !k4Var2.m22179to()) {
                        this.f14190k4.m52930k4(k4Var2.m22177k4());
                    } else {
                        C10951c5 c10951c5M22174to = m22174to(k4Var2.m22177k4());
                        if (c12007ixClone3.m56558k4() > fM56558k43) {
                            this.f14193x1.addItem(new k4(k4Var2.m22177k4(), false, k4Var2.m22179to(), k4Var2.m22178kk()));
                            k4Var2.m22177k4().mo52909to().m17348x1(0.0f, fM67481k4);
                        }
                        m22164du(c10951c5M22174to);
                    }
                    i2 = i3;
                } finally {
                }
            }
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                it.dispose();
            }
            list.addItem(this.f14190k4);
            z = false;
        }
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: k4 */
    public void mo16971k4(C10947ak c10947ak) {
        m22175to(c10947ak);
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: k4 */
    public void mo16972k4(C10948ar c10948ar) {
        C10948ar c10948ar2 = new C10948ar(c10948ar.m52876x1(), c10948ar.m52874kk());
        this.f14190k4 = c10948ar2;
        this.f14192to.push(c10948ar2);
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: k4 */
    public void mo13522k4(C10951c5 c10951c5) {
        C10951c5 c10951c5M22165h4 = m22165h4(c10951c5);
        this.f14192to.peek().m52930k4(c10951c5M22165h4);
        this.f14192to.push(c10951c5M22165h4);
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: k4 */
    public void mo16973k4(C10953ck c10953ck) {
        m22175to(c10953ck);
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: k4 */
    public void mo16974k4(C10956dy c10956dy) {
        m22175to(c10956dy);
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: k4 */
    public void mo16975k4(C10958h4 c10958h4) {
        m22175to(c10958h4);
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: k4 */
    public void mo16976k4(C10960jd c10960jd) {
        m22175to(c10960jd);
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: k4 */
    public void mo13524k4(C10963ks c10963ks) {
        m22175to(c10963ks);
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: k4 */
    public void mo16977k4(C10967qq c10967qq) {
        m22175to(c10967qq);
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: k4 */
    public void mo13525k4(C10970u4 c10970u4) {
        m22175to(c10970u4);
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: k4 */
    public void mo13515k4(C10971um c10971um) {
        m22175to(c10971um);
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: k4 */
    public void mo16979k4(C10980yd c10980yd) {
        m22175to(c10980yd);
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m22170k4(List<C10948ar> list) {
        int i;
        if (list != null && list.size() >= 2) {
            int i2 = 0;
            while (i2 < list.size() && (i = i2 + 1) < list.size()) {
                if (list.get_Item(i2).m52875to() != list.get_Item(i).m52875to() || list.get_Item(i2).m52871du() != list.get_Item(i).m52871du()) {
                    return false;
                }
                i2 = i;
            }
            return true;
        }
        return true;
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: k4 */
    public boolean mo22157k4(C10966ne c10966ne) {
        m22175to(c10966ne);
        return true;
    }
}

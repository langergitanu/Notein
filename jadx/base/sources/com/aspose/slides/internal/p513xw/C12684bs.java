package com.aspose.slides.internal.p513xw;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Specialized.OooO00o;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p022ai.C1375h4;
import com.aspose.slides.internal.p048bv.C1869to;
import com.aspose.slides.internal.p048bv.InterfaceC1861h4;
import com.aspose.slides.internal.p048bv.InterfaceC1866m9;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14096u4;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.xw.bs */
/* JADX INFO: loaded from: classes5.dex */
public class C12684bs {

    /* JADX INFO: renamed from: c5 */
    private boolean f42158c5;

    /* JADX INFO: renamed from: du */
    private C1375h4[] f42159du;

    /* JADX INFO: renamed from: dy */
    private boolean f42160dy;

    /* JADX INFO: renamed from: h4 */
    private C1375h4[] f42161h4;

    /* JADX INFO: renamed from: k4 */
    private AbstractC12716nv[] f42162k4;

    /* JADX INFO: renamed from: kk */
    private AbstractC12716nv[] f42163kk;

    /* JADX INFO: renamed from: m9 */
    private C1375h4[] f42164m9;

    /* JADX INFO: renamed from: to */
    private AbstractC12716nv[] f42165to;

    /* JADX INFO: renamed from: x1 */
    private C12722rv f42166x1;

    /* JADX INFO: renamed from: com.aspose.slides.internal.xw.bs$k4 */
    public static class k4 extends C12717os {

        /* JADX INFO: renamed from: k4 */
        private C12684bs f42169k4;

        /* JADX INFO: renamed from: x1 */
        private C12717os f42170x1;

        public k4(C12684bs c12684bs, C12722rv c12722rv) {
            super(null);
            this.f42169k4 = c12684bs;
            C12717os c12717osM59134uz = c12722rv.m59134uz();
            while (true) {
                this.f42170x1 = c12717osM59134uz;
                if (!C7019kk.m27469x1(this.f42170x1, C12696f9.class)) {
                    return;
                } else {
                    c12717osM59134uz = this.f42170x1.mo58860kk();
                }
            }
        }

        /* JADX INFO: renamed from: k4 */
        public final C12717os m58858k4() {
            return this.f42170x1;
        }

        @Override // com.aspose.slides.internal.p513xw.C12717os
        /* JADX INFO: renamed from: kk */
        public C12717os mo58860kk() {
            return this.f42170x1;
        }

        @Override // com.aspose.slides.internal.p513xw.C12717os
        public String toString() {
            C6765kp c6765kpOooO00o = OooO00o.OooO00o("SpaceHandlingBreakPosition(");
            c6765kpOooO00o.m26791k4(this.f42170x1);
            c6765kpOooO00o.m26792k4(")");
            return c6765kpOooO00o.toString();
        }

        /* JADX INFO: renamed from: k4 */
        public final void m58859k4(boolean z, C12721ri c12721ri) {
            int i = 0;
            if (!z) {
                while (i < this.f42169k4.f42165to.length) {
                    this.f42169k4.f42165to[i].mo58897k4(this.f42169k4.f42164m9[i]);
                    i++;
                }
            } else if (C12721ri.f42330k4 == c12721ri) {
                while (i < this.f42169k4.f42163kk.length) {
                    this.f42169k4.f42163kk[i].mo58897k4(this.f42169k4.f42161h4[i]);
                    i++;
                }
            } else {
                while (i < this.f42169k4.f42162k4.length) {
                    this.f42169k4.f42162k4[i].mo58897k4(this.f42169k4.f42159du[i]);
                    i++;
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.xw.bs$x1 */
    public static class x1 extends C12717os {

        /* JADX INFO: renamed from: k4 */
        private C12684bs f42171k4;

        public x1(C12684bs c12684bs) {
            super(null);
            this.f42171k4 = c12684bs;
        }

        /* JADX INFO: renamed from: k4 */
        public final void m58861k4() {
            if (this.f42171k4.f42166x1 != null) {
                throw new InvalidOperationException("Only applicable to no-break situations");
            }
            for (int i = 0; i < this.f42171k4.f42163kk.length; i++) {
                this.f42171k4.f42163kk[i].mo58897k4(this.f42171k4.f42161h4[i]);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C12684bs(List<AbstractC12723s7> list, C12722rv c12722rv, List<AbstractC12723s7> list2, boolean z, boolean z2) {
        int i;
        this.f42160dy = z;
        this.f42158c5 = z2;
        int i2 = 0;
        int size = list != null ? list.size() : 0;
        size = list2 != null ? size + list2.size() : size;
        this.f42165to = new AbstractC12716nv[size];
        this.f42164m9 = new C1375h4[size];
        if (list != null) {
            C1869to c1869to = new C1869to(list);
            i = 0;
            while (c1869to.mo9764x1()) {
                this.f42165to[i] = (AbstractC12716nv) c1869to.mo9760kk();
                this.f42164m9[i] = this.f42165to[i].m59070jd();
                i++;
            }
        } else {
            i = 0;
        }
        if (list2 != null) {
            C1869to c1869to2 = new C1869to(list2);
            while (c1869to2.mo9764x1()) {
                this.f42165to[i] = (AbstractC12716nv) c1869to2.mo9760kk();
                this.f42164m9[i] = this.f42165to[i].m59070jd();
                i++;
            }
        }
        if (c12722rv != null) {
            if (c12722rv.m59125ck() != null) {
                list.insertRange(0, c12722rv.m59125ck().convertAll(new AbstractC14096u4<AbstractC12716nv, AbstractC12723s7>() { // from class: com.aspose.slides.internal.xw.bs.1
                    @Override // com.aspose.slides.p559ms.System.AbstractC14096u4
                    /* JADX INFO: renamed from: k4, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
                    public AbstractC12723s7 mo6770k4(AbstractC12716nv abstractC12716nv) {
                        return abstractC12716nv;
                    }
                }));
            }
            if (c12722rv.m59128jd() != null) {
                list2.insertRange(0, c12722rv.m59128jd().convertAll(new AbstractC14096u4<AbstractC12716nv, AbstractC12723s7>() { // from class: com.aspose.slides.internal.xw.bs.2
                    @Override // com.aspose.slides.p559ms.System.AbstractC14096u4
                    /* JADX INFO: renamed from: k4, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
                    public AbstractC12723s7 mo6770k4(AbstractC12716nv abstractC12716nv) {
                        return abstractC12716nv;
                    }
                }));
            }
        }
        if (list != null) {
            AbstractC12716nv[] abstractC12716nvArr = new AbstractC12716nv[list.size()];
            this.f42162k4 = abstractC12716nvArr;
            this.f42159du = new C1375h4[abstractC12716nvArr.length];
            int i3 = 0;
            while (true) {
                AbstractC12716nv[] abstractC12716nvArr2 = this.f42162k4;
                if (i3 >= abstractC12716nvArr2.length) {
                    break;
                }
                abstractC12716nvArr2[i3] = (AbstractC12716nv) C7019kk.m27452k4((Object) list.get_Item(i3), AbstractC12716nv.class);
                this.f42159du[i3] = this.f42162k4[i3].m59070jd();
                i3++;
            }
        }
        this.f42166x1 = c12722rv;
        if (list2 != null) {
            AbstractC12716nv[] abstractC12716nvArr3 = new AbstractC12716nv[list2.size()];
            this.f42163kk = abstractC12716nvArr3;
            this.f42161h4 = new C1375h4[abstractC12716nvArr3.length];
            while (true) {
                AbstractC12716nv[] abstractC12716nvArr4 = this.f42163kk;
                if (i2 >= abstractC12716nvArr4.length) {
                    break;
                }
                abstractC12716nvArr4[i2] = (AbstractC12716nv) C7019kk.m27452k4((Object) list2.get_Item(i2), AbstractC12716nv.class);
                this.f42161h4[i2] = this.f42163kk[i2].m59070jd();
                i2++;
            }
        }
        m58851kk();
    }

    /* JADX INFO: renamed from: k4 */
    private static C1375h4 m58842k4(C1375h4[] c1375h4Arr) {
        C1375h4 c1375h4M8156k4 = C1375h4.f5962k4;
        for (C1375h4 c1375h4 : c1375h4Arr) {
            if (c1375h4 != null) {
                c1375h4M8156k4 = c1375h4M8156k4.m8156k4(c1375h4);
            }
        }
        return c1375h4M8156k4;
    }

    /* JADX INFO: renamed from: kk */
    private void m58851kk() {
        if (this.f42166x1 != null) {
            if (m58849k4()) {
                m58848k4(this.f42162k4, this.f42159du, true);
                m58855x1(this.f42162k4, this.f42159du, true);
                m58846k4(this.f42162k4, this.f42159du);
            }
            if (m58856x1()) {
                m58848k4(this.f42163kk, this.f42161h4, false);
                m58855x1(this.f42163kk, this.f42161h4, false);
                m58846k4(this.f42163kk, this.f42161h4);
            }
            AbstractC12716nv[] abstractC12716nvArr = this.f42165to;
            if (abstractC12716nvArr != null) {
                m58846k4(abstractC12716nvArr, this.f42164m9);
                return;
            }
            return;
        }
        if (this.f42160dy) {
            m58848k4(this.f42163kk, this.f42161h4, false);
            m58855x1(this.f42163kk, this.f42161h4, false);
        }
        if (this.f42158c5) {
            m58848k4(this.f42162k4, this.f42159du, true);
            m58855x1(this.f42162k4, this.f42159du, true);
        }
        if (m58849k4()) {
            AbstractC12716nv[] abstractC12716nvArr2 = this.f42163kk;
            C1375h4[] c1375h4Arr = this.f42161h4;
            this.f42163kk = this.f42162k4;
            this.f42161h4 = this.f42159du;
            this.f42162k4 = abstractC12716nvArr2;
            this.f42159du = c1375h4Arr;
            if (m58849k4()) {
                throw new InvalidOperationException(C14113y2.m67408k4("Didn't expect more than one parts in a", "no-break condition."));
            }
        }
        m58846k4(this.f42163kk, this.f42161h4);
    }

    /* JADX INFO: renamed from: x1 */
    private static void m58855x1(AbstractC12704j5[] abstractC12704j5Arr, C1375h4[] c1375h4Arr, boolean z) {
        for (int i = 0; i < abstractC12704j5Arr.length; i++) {
            int length = z ? (abstractC12704j5Arr.length - 1) - i : i;
            if (c1375h4Arr[length] != null) {
                if (C7019kk.m27469x1(abstractC12704j5Arr[length], AbstractC12710ks.class) || !abstractC12704j5Arr[length].mo58995du()) {
                    return;
                } else {
                    c1375h4Arr[length] = null;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
    
        r10 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006c, code lost:
    
        if (r6.mo59133u4() == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0072, code lost:
    
        r10 = true;
        r8 = false;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m58843k4(List<InterfaceC1861h4> list) {
        List list2;
        boolean z;
        boolean z2;
        List list3;
        List list4;
        AbstractC12723s7 abstractC12723s7Mo9727k4;
        List list5 = new List();
        List list6 = new List();
        C1869to c1869to = new C1869to(list);
        boolean z3 = true;
        while (c1869to.mo9764x1()) {
            AbstractC12723s7 abstractC12723s7 = (AbstractC12723s7) c1869to.mo9760kk();
            if (abstractC12723s7.mo59133u4()) {
                C12722rv c12722rv = (C12722rv) C7019kk.m27452k4((Object) abstractC12723s7, C12722rv.class);
                list5.clear();
                list6.clear();
                if (c12722rv != null) {
                    list2 = list6;
                } else {
                    list5.addItem(abstractC12723s7);
                    list2 = list5;
                }
                while (true) {
                    c1869to.mo9758k4();
                    while (true) {
                        if (!c1869to.mo9764x1()) {
                            z = true;
                            break;
                        }
                        abstractC12723s7Mo9727k4 = ((InterfaceC1861h4) c1869to.mo9760kk()).mo9727k4();
                        if (C7019kk.m27469x1(abstractC12723s7Mo9727k4, C12722rv.class) && c12722rv != null) {
                            z = false;
                            break;
                        } else {
                            if (list2 != list5 || !C7019kk.m27469x1(abstractC12723s7Mo9727k4, C12722rv.class)) {
                                break;
                            }
                            c12722rv = (C12722rv) abstractC12723s7Mo9727k4;
                            c1869to.mo9758k4();
                            list2 = list6;
                        }
                    }
                    list2.addItem(abstractC12723s7Mo9727k4);
                }
                if (c12722rv == null && list6.size() == 0 && !z) {
                    list4 = list5;
                    list3 = list6;
                } else {
                    list3 = list5;
                    list4 = list6;
                }
                C12684bs c12684bs = new C12684bs(list3, c12722rv, list4, z3, z);
                if (!z) {
                    c1869to.mo9756du();
                }
                c12684bs.m58845k4(c1869to);
                if (!z && z2) {
                    c1869to.mo9760kk();
                }
                list5 = list3;
                list6 = list4;
            }
            z3 = false;
        }
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m58856x1() {
        AbstractC12716nv[] abstractC12716nvArr = this.f42163kk;
        return abstractC12716nvArr != null && abstractC12716nvArr.length > 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004f  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m58844k4(List<InterfaceC1861h4> list, int i, int i2, int i3) {
        k4 k4Var;
        k4 k4Var2;
        k4 k4Var3;
        AbstractC12729ts abstractC12729ts = i3 > 0 ? (AbstractC12729ts) list.get_Item(i3).mo9727k4() : null;
        if (abstractC12729ts == null || !abstractC12729ts.mo59086y_()) {
            k4Var = null;
        } else {
            C12717os c12717osM59134uz = abstractC12729ts.m59134uz();
            if (C7019kk.m27469x1(c12717osM59134uz, k4.class)) {
                k4Var = (k4) c12717osM59134uz;
                k4Var.m58859k4(true, C12721ri.f42330k4);
            }
        }
        AbstractC12729ts abstractC12729ts2 = (AbstractC12729ts) list.get_Item(i2);
        if (abstractC12729ts2 == null || !abstractC12729ts2.mo59086y_()) {
            k4Var2 = null;
        } else {
            C12717os c12717osM59134uz2 = abstractC12729ts2.m59134uz();
            if (C7019kk.m27469x1(c12717osM59134uz2, k4.class)) {
                k4Var2 = (k4) c12717osM59134uz2;
                k4Var2.m58859k4(true, C12721ri.f42333x1);
            }
        }
        while (i <= i2) {
            C12717os c12717osM59134uz3 = ((AbstractC12729ts) list.get_Item(i)).m59134uz();
            if (C7019kk.m27469x1(c12717osM59134uz3, x1.class)) {
                ((x1) c12717osM59134uz3).m58861k4();
            } else if (C7019kk.m27469x1(c12717osM59134uz3, k4.class) && (k4Var3 = (k4) c12717osM59134uz3) != k4Var && k4Var3 != k4Var2) {
                k4Var3.m58859k4(false, null);
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m58845k4(InterfaceC1866m9<InterfaceC1861h4> interfaceC1866m9) {
        boolean z;
        C1375h4 c1375h4M58842k4 = m58842k4(this.f42159du);
        C1375h4 c1375h4M58842k42 = m58842k4(this.f42161h4);
        if (this.f42166x1 != null) {
            if (c1375h4M58842k4.m8154h4()) {
                interfaceC1866m9.mo9763x1(new C12718qm(0, 1000, false, null, true));
                interfaceC1866m9.mo9763x1(new C12694e0(c1375h4M58842k4, null, true));
                if (this.f42166x1.mo59082dy()) {
                    interfaceC1866m9.mo9763x1(new C12688c6(0, null, true));
                }
            }
            interfaceC1866m9.mo9763x1(new C12718qm(this.f42166x1.m59127h4(), this.f42166x1.m59130m9(), false, this.f42166x1.m59124c5(), new k4(this, this.f42166x1), false));
            if (this.f42166x1.m59130m9() <= -1000) {
                return;
            }
            C1375h4 c1375h4M58842k43 = m58842k4(this.f42164m9);
            C1375h4 c1375h4M8156k4 = c1375h4M58842k4.m8156k4(c1375h4M58842k42);
            int iM8163x1 = c1375h4M58842k43.m8163x1() - c1375h4M8156k4.m8163x1();
            int iM8149du = c1375h4M58842k43.m8149du() - c1375h4M8156k4.m8149du();
            int iM8161to = c1375h4M58842k43.m8161to() - c1375h4M8156k4.m8161to();
            if (iM8163x1 != 0 || iM8149du != 0 || iM8161to != 0) {
                interfaceC1866m9.mo9763x1(new C12694e0(iM8163x1, iM8149du, iM8161to, null, true));
            }
        } else if (c1375h4M58842k4.m8154h4()) {
            throw new InvalidOperationException("spaceBeforeBreak should be 0 in this case");
        }
        x1 x1Var = this.f42166x1 == null ? new x1(this) : null;
        if (c1375h4M58842k42.m8154h4() || x1Var != null) {
            interfaceC1866m9.mo9763x1(new C12688c6(0, x1Var, true));
        }
        if (c1375h4M58842k42.m8154h4()) {
            interfaceC1866m9.mo9763x1(new C12718qm(0, 1000, false, null, true));
            interfaceC1866m9.mo9763x1(new C12694e0(c1375h4M58842k42, null, true));
            z = true;
        } else {
            z = false;
        }
        if (this.f42158c5 && z) {
            interfaceC1866m9.mo9763x1(new C12688c6(0, null, true));
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m58846k4(AbstractC12704j5[] abstractC12704j5Arr, C1375h4[] c1375h4Arr) {
        AbstractC12704j5 abstractC12704j5;
        int i = 0;
        while (i < abstractC12704j5Arr.length) {
            if (C7019kk.m27469x1(abstractC12704j5Arr[i], C12689ca.class)) {
                int i2 = i;
                while (i2 < abstractC12704j5Arr.length && ((abstractC12704j5 = abstractC12704j5Arr[i2]) == null || C7019kk.m27469x1(abstractC12704j5, C12689ca.class))) {
                    i2++;
                }
                m58847k4(abstractC12704j5Arr, c1375h4Arr, i, i2 - 1);
                i = i2;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m58847k4(AbstractC12704j5[] abstractC12704j5Arr, C1375h4[] c1375h4Arr, int i, int i2) {
        boolean z;
        int i3 = 0;
        int i4 = i;
        int i5 = 0;
        while (true) {
            if (i4 > i2) {
                z = false;
                break;
            }
            if (c1375h4Arr[i4] != null) {
                i5++;
                if (((C12689ca) abstractC12704j5Arr[i4]).m58898m9()) {
                    z = true;
                    break;
                }
            }
            i4++;
        }
        if (i5 == 0) {
            return;
        }
        if (z) {
            while (i <= i2) {
                if (c1375h4Arr[i] != null && !((C12689ca) abstractC12704j5Arr[i]).m58898m9()) {
                    c1375h4Arr[i] = null;
                }
                i++;
            }
            return;
        }
        int iM67483k4 = Integer.MIN_VALUE;
        int iM67483k42 = Integer.MIN_VALUE;
        for (int i6 = i; i6 <= i2; i6++) {
            if (c1375h4Arr[i6] != null) {
                iM67483k42 = C14116yg.m67483k4(iM67483k42, ((C12689ca) abstractC12704j5Arr[i6]).m58896c5());
            }
        }
        int i7 = 0;
        int iM67483k43 = Integer.MIN_VALUE;
        for (int i8 = i; i8 <= i2; i8++) {
            if (c1375h4Arr[i8] != null) {
                C12689ca c12689ca = (C12689ca) abstractC12704j5Arr[i8];
                if (c12689ca.m58896c5() != iM67483k42) {
                    c1375h4Arr[i8] = null;
                } else {
                    iM67483k43 = C14116yg.m67483k4(iM67483k43, c12689ca.m59070jd().m8163x1());
                    i7++;
                }
            }
        }
        if (i7 <= 1) {
            return;
        }
        for (int i9 = i; i9 <= i2; i9++) {
            if (c1375h4Arr[i9] != null) {
                if (((C12689ca) abstractC12704j5Arr[i9]).m59070jd().m8163x1() < iM67483k43) {
                    c1375h4Arr[i9] = null;
                } else {
                    i3++;
                }
            }
        }
        if (i3 <= 1) {
            return;
        }
        int iM67507x1 = Integer.MAX_VALUE;
        while (i <= i2) {
            if (c1375h4Arr[i] != null) {
                C12689ca c12689ca2 = (C12689ca) abstractC12704j5Arr[i];
                iM67483k4 = C14116yg.m67483k4(iM67483k4, c12689ca2.m59070jd().m8155k4());
                iM67507x1 = C14116yg.m67507x1(iM67507x1, c12689ca2.m59070jd().m8157kk());
                if (i3 > 1) {
                    c1375h4Arr[i] = null;
                    i3--;
                } else {
                    c1375h4Arr[i] = C1375h4.m8146k4(iM67483k4, c1375h4Arr[i].m8163x1(), iM67507x1);
                }
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m58848k4(AbstractC12704j5[] abstractC12704j5Arr, C1375h4[] c1375h4Arr, boolean z) {
        for (int i = 0; i < abstractC12704j5Arr.length; i++) {
            int length = z ? (abstractC12704j5Arr.length - 1) - i : i;
            if (C7019kk.m27469x1(abstractC12704j5Arr[length], AbstractC12710ks.class)) {
                AbstractC12710ks abstractC12710ks = (AbstractC12710ks) abstractC12704j5Arr[length];
                if (abstractC12710ks.mo58995du() && !abstractC12710ks.m59069fa() && !abstractC12710ks.m59071ks()) {
                    c1375h4Arr[length] = null;
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m58849k4() {
        AbstractC12716nv[] abstractC12716nvArr = this.f42162k4;
        return abstractC12716nvArr != null && abstractC12716nvArr.length > 0;
    }
}

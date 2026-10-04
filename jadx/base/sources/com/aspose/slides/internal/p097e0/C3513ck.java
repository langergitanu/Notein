package com.aspose.slides.internal.p097e0;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Stack;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.IndexOutOfRangeException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p023ak.C1389to;
import com.aspose.slides.internal.p048bv.C1863k4;
import com.aspose.slides.internal.p048bv.InterfaceC1858du;
import com.aspose.slides.internal.p057c6.InterfaceC1984kk;
import com.aspose.slides.internal.p111em.InterfaceC3757h4;
import com.aspose.slides.internal.p150gi.AbstractC4282kp;
import com.aspose.slides.internal.p150gi.C4266c6;
import com.aspose.slides.internal.p150gi.C4267ck;
import com.aspose.slides.internal.p150gi.C4272f9;
import com.aspose.slides.internal.p150gi.C4279jd;
import com.aspose.slides.internal.p150gi.C4290rv;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p409sv.C10782m9;
import com.aspose.slides.internal.p455v4.InterfaceC11601k4;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14117yj;
import com.aspose.words.StyleIdentifier;
import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;

/* JADX INFO: renamed from: com.aspose.slides.internal.e0.ck */
/* JADX INFO: loaded from: classes3.dex */
public class C3513ck extends AbstractC3511c5 implements InterfaceC1858du {

    /* JADX INFO: renamed from: ar */
    private C10782m9 f9757ar;

    /* JADX INFO: renamed from: bv */
    private InterfaceC11601k4 f9758bv;

    /* JADX INFO: renamed from: c5 */
    private AbstractC4282kp f9759c5;

    /* JADX INFO: renamed from: ck */
    private int f9760ck;

    /* JADX INFO: renamed from: du */
    private C4279jd f9761du;

    /* JADX INFO: renamed from: dy */
    private C4266c6 f9762dy;

    /* JADX INFO: renamed from: fa */
    private int f9763fa;

    /* JADX INFO: renamed from: h4 */
    private C4267ck f9764h4;

    /* JADX INFO: renamed from: ix */
    private String f9765ix;

    /* JADX INFO: renamed from: jd */
    private C4272f9 f9766jd;

    /* JADX INFO: renamed from: ks */
    private int f9767ks;

    /* JADX INFO: renamed from: lr */
    private Dictionary<k4, String> f9768lr;

    /* JADX INFO: renamed from: m9 */
    private C12003du f9769m9;

    /* JADX INFO: renamed from: ne */
    private String f9770ne;

    /* JADX INFO: renamed from: qq */
    private C3513ck f9771qq;

    /* JADX INFO: renamed from: rv */
    private InterfaceC1984kk f9772rv;

    /* JADX INFO: renamed from: to */
    public C1863k4 f9773to;

    /* JADX INFO: renamed from: u4 */
    private String f9774u4;

    /* JADX INFO: renamed from: um */
    private C4290rv f9775um;

    /* JADX INFO: renamed from: up */
    private int f9776up;

    /* JADX INFO: renamed from: uz */
    private int f9777uz;

    /* JADX INFO: renamed from: v4 */
    private int[] f9778v4;

    /* JADX INFO: renamed from: wl */
    private int f9779wl;

    /* JADX INFO: renamed from: x6 */
    private InterfaceC1984kk f9780x6;

    /* JADX INFO: renamed from: yj */
    private AbstractC4282kp f9781yj;

    /* JADX INFO: renamed from: com.aspose.slides.internal.e0.ck$k4 */
    public static class k4 {

        /* JADX INFO: renamed from: k4 */
        private int f9782k4;

        /* JADX INFO: renamed from: x1 */
        private int f9783x1;

        public k4(int i, int i2) {
            this.f9782k4 = i;
            this.f9783x1 = i2;
        }

        public boolean equals(Object obj) {
            if (C7019kk.m27469x1(obj, k4.class)) {
                k4 k4Var = (k4) obj;
                if (k4Var.f9782k4 == this.f9782k4 && k4Var.f9783x1 == this.f9783x1) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.f9782k4 * 31) + this.f9783x1;
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.e0.ck$x1 */
    public static class x1 extends AbstractC3523kk {

        /* JADX INFO: renamed from: k4 */
        private C3513ck f9784k4;

        /* JADX INFO: renamed from: x1 */
        private int f9787x1 = 0;

        /* JADX INFO: renamed from: kk */
        private boolean f9785kk = false;

        /* JADX INFO: renamed from: to */
        private boolean f9786to = false;

        public x1(C3513ck c3513ck) {
            this.f9784k4 = c3513ck;
        }

        @Override // com.aspose.slides.internal.p097e0.AbstractC3523kk, com.aspose.slides.internal.p048bv.InterfaceC1870up
        /* JADX INFO: renamed from: k4 */
        public void mo9758k4() {
            if (!this.f9785kk) {
                throw new InvalidOperationException();
            }
            this.f9784k4.f9773to.m9750x1(this.f9787x1);
            this.f9784k4.f9773to.m9734c5();
            this.f9787x1--;
            this.f9785kk = false;
        }

        @Override // com.aspose.slides.internal.p097e0.AbstractC3523kk
        /* JADX INFO: renamed from: to */
        public char mo14069to() {
            if (this.f9787x1 >= this.f9784k4.f9773to.m9737dy()) {
                throw new Exception("Element was not found");
            }
            this.f9785kk = true;
            this.f9786to = true;
            C1863k4 c1863k4 = this.f9784k4.f9773to;
            int i = this.f9787x1;
            this.f9787x1 = i + 1;
            return c1863k4.m9746kk(i);
        }

        @Override // com.aspose.slides.internal.p097e0.AbstractC3523kk, com.aspose.slides.internal.p048bv.InterfaceC1870up
        /* JADX INFO: renamed from: x1 */
        public boolean mo9764x1() {
            return this.f9787x1 < this.f9784k4.f9773to.m9737dy();
        }

        @Override // com.aspose.slides.internal.p097e0.AbstractC3523kk
        /* JADX INFO: renamed from: k4 */
        public void mo14067k4(char c) {
            if (!this.f9786to) {
                throw new InvalidOperationException();
            }
            this.f9784k4.f9773to.m9743k4(this.f9787x1 - 1, c);
        }
    }

    public C3513ck(AbstractC3511c5 abstractC3511c5) {
        super(abstractC3511c5);
        this.f9769m9 = new C12003du();
        this.f9771qq = null;
        this.f9757ar = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0021 A[FALL_THROUGH, RETURN] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int m14129k4(char c) {
        int iM67545x1 = C14117yj.m67545x1(c);
        if (iM67545x1 == 18) {
            return 1;
        }
        if (iM67545x1 == 19) {
            return c == '-' ? 1 : 0;
        }
        if (iM67545x1 == 21) {
            return c == 8217 ? 2 : 0;
        }
        if (iM67545x1 == 24) {
            return c == '\'' ? 2 : 0;
        }
        switch (iM67545x1) {
            default:
                switch (iM67545x1) {
                    default:
                        switch (iM67545x1) {
                            case 26:
                            case 27:
                            case 28:
                                break;
                            default:
                                return 0;
                        }
                    case 8:
                    case 9:
                    case 10:
                        return 1;
                }
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                break;
        }
    }

    /* JADX INFO: renamed from: kk */
    private boolean m14130kk(int i) {
        int iM14129k4 = m14129k4(m14131m9(i, -1));
        if (iM14129k4 != 0) {
            if (iM14129k4 != 2) {
                return false;
            }
            int iM14129k42 = m14129k4(m14131m9(i, -2));
            if (iM14129k42 != 0 && iM14129k42 != 2) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: m9 */
    private char m14131m9(int i, int i2) {
        int i3 = i + i2;
        if (i3 >= 0 && i3 < mo9715m9()) {
            return mo9716to(i3);
        }
        boolean z = false;
        if (i2 > 0) {
            return (char) 0;
        }
        C3513ck c3513ck = this;
        char cMo9716to = 0;
        while (!z) {
            c3513ck = c3513ck.f9771qq;
            if (c3513ck == null) {
                break;
            }
            int iMo9715m9 = (c3513ck.mo9715m9() + i3) - 1;
            if (iMo9715m9 >= 0) {
                cMo9716to = c3513ck.mo9716to(iMo9715m9);
                z = true;
            } else {
                i3 += iMo9715m9;
            }
        }
        return cMo9716to;
    }

    /* JADX INFO: renamed from: sv */
    private void m14132sv() {
        C1863k4 c1863k4;
        if (mo14109o_().m14409to() || this.f9776up == 95) {
            return;
        }
        this.f9773to.m9747kk();
        int iM9737dy = this.f9773to.m9737dy();
        int i = -1;
        while (true) {
            i++;
            if (i >= iM9737dy) {
                return;
            }
            char cM9748to = this.f9773to.m9748to();
            this.f9773to.m9735du();
            int i2 = this.f9776up;
            if (i2 != 22) {
                if (i2 == 78) {
                    c1863k4 = this.f9773to;
                    cM9748to = C14117yj.m67538rv(cM9748to);
                } else if (i2 == 155) {
                    c1863k4 = this.f9773to;
                    cM9748to = C14117yj.m67521ix(cM9748to);
                }
                c1863k4.m9742k4(cM9748to);
            } else if (m14130kk(i)) {
                C11697x1 c11697x1 = new C11697x1("en-US", false);
                try {
                    if (this.f9765ix != null) {
                        c11697x1 = this.f9770ne != null ? new C11697x1(C14113y2.m67408k4(this.f9765ix, CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR, this.f9770ne)) : new C11697x1(this.f9765ix);
                    }
                } catch (RuntimeException unused) {
                }
                this.f9773to.m9742k4(C14113y2.m67365dy(C14117yj.m67537ne(c11697x1.m55260ck().m55237kk(cM9748to)))[0]);
            } else {
                c1863k4 = this.f9773to;
                c1863k4.m9742k4(cM9748to);
            }
        }
    }

    /* JADX INFO: renamed from: ak */
    public final AbstractC4282kp m14133ak() {
        return this.f9781yj;
    }

    /* JADX INFO: renamed from: ar */
    public final InterfaceC1858du m14134ar() {
        C1863k4 c1863k4 = this.f9773to;
        if (c1863k4 == null) {
            return null;
        }
        c1863k4.m9747kk();
        C1863k4 c1863k42 = this.f9773to;
        return c1863k42.m9741k4(0, c1863k42.m9737dy());
    }

    /* JADX INFO: renamed from: b3 */
    public final AbstractC4282kp m14135b3() {
        return this.f9759c5;
    }

    /* JADX INFO: renamed from: bv */
    public final C4279jd m14136bv() {
        return this.f9761du;
    }

    /* JADX INFO: renamed from: bz */
    public final String m14137bz() {
        return this.f9774u4;
    }

    /* JADX INFO: renamed from: c6 */
    public final int m14138c6() {
        return this.f9777uz;
    }

    /* JADX INFO: renamed from: dq */
    public final C4290rv m14139dq() {
        return this.f9775um;
    }

    /* JADX INFO: renamed from: du */
    public final int m14140du(int i, int i2) {
        Dictionary<k4, String> dictionary = this.f9768lr;
        if (dictionary != null) {
            return dictionary.get_Item(new k4(i, i2)).length();
        }
        return 0;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: dy */
    public void mo14081dy() {
        C1863k4 c1863k4 = this.f9773to;
        if (c1863k4 != null) {
            c1863k4.m9747kk();
        }
        super.mo14081dy();
        mo14107n_().mo14169k4(this);
    }

    /* JADX INFO: renamed from: e0 */
    public final String m14142e0() {
        return this.f9765ix;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: fa */
    public AbstractC3523kk mo14082fa() {
        return new x1(this);
    }

    /* JADX INFO: renamed from: g8 */
    public final InterfaceC11601k4 m14143g8() {
        return this.f9758bv;
    }

    /* JADX INFO: renamed from: h4 */
    public final int[] m14144h4(int i, int i2) {
        if (!m14149kk(i, i2)) {
            return m14158x1(i, i2);
        }
        int i3 = i2 - i;
        int iM14140du = m14140du(i, i2);
        int[] iArrM14158x1 = m14158x1(i, i2);
        if (iArrM14158x1 == null) {
            return null;
        }
        if (iM14140du == i3) {
            return iArrM14158x1;
        }
        if (iM14140du <= i3) {
            int[] iArr = new int[iM14140du];
            AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) iArrM14158x1), 0, AbstractC14092to.m67208k4((Object) iArr), 0, iM14140du);
            return iArr;
        }
        int[] iArr2 = new int[iM14140du];
        AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) iArrM14158x1), 0, AbstractC14092to.m67208k4((Object) iArr2), 0, iArrM14158x1.length);
        int length = iArrM14158x1.length;
        int i4 = length > 0 ? iArrM14158x1[length - 1] : 0;
        while (length < iM14140du) {
            iArr2[length] = i4;
            length++;
        }
        return iArr2;
    }

    /* JADX INFO: renamed from: lr */
    public final C12003du m14150lr() {
        return this.f9769m9;
    }

    /* JADX INFO: renamed from: qm */
    public final void m14151qm() {
        C1863k4 c1863k4 = this.f9773to;
        if (c1863k4 != null) {
            c1863k4.m9747kk();
        }
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: r_ */
    public void mo14113r_() {
        m14132sv();
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: rv */
    public String mo14114rv() {
        return "#PCDATA";
    }

    @Override // com.aspose.slides.internal.p048bv.InterfaceC1858du
    /* JADX INFO: renamed from: to */
    public final char mo9716to(int i) {
        return this.f9773to.m9746kk(i);
    }

    public String toString() {
        return C14113y2.f47374k4;
    }

    /* JADX INFO: renamed from: ts */
    public final int m14153ts() {
        return this.f9779wl;
    }

    /* JADX INFO: renamed from: um */
    public final boolean m14154um() {
        if (this.f9763fa == 48 && this.f9773to.m9737dy() > 0) {
            return true;
        }
        this.f9773to.m9747kk();
        while (this.f9773to.m9739jd()) {
            char cM9748to = this.f9773to.m9748to();
            if (cM9748to != ' ' && cM9748to != '\n' && cM9748to != '\r' && cM9748to != '\t') {
                this.f9773to.m9747kk();
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: v4 */
    public final C4267ck m14155v4() {
        return this.f9764h4;
    }

    /* JADX INFO: renamed from: wy */
    public final int m14156wy() {
        return this.f9760ck;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m14157x1(int i) {
        if (i < 0 || i >= mo9715m9()) {
            throw new IndexOutOfRangeException();
        }
        int[] iArr = this.f9778v4;
        if (iArr != null) {
            return iArr[i];
        }
        return -1;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: x6 */
    public String mo14125x6() {
        return null;
    }

    /* JADX INFO: renamed from: xk */
    public final InterfaceC1984kk m14159xk() {
        return this.f9780x6;
    }

    /* JADX INFO: renamed from: yd */
    public final C4266c6 m14160yd() {
        return this.f9762dy;
    }

    /* JADX INFO: renamed from: du */
    public final void m14141du(String str) {
        C1863k4 c1863k4M9733k4 = C1863k4.m9733k4(str.length() >= 16 ? str.length() : 16);
        this.f9773to = c1863k4M9733k4;
        c1863k4M9733k4.m9736du(c1863k4M9733k4.m9749x1());
        this.f9773to.m9745k4(C14113y2.m67365dy(str), 0, str.length());
        C1863k4 c1863k4 = this.f9773to;
        c1863k4.m9736du(c1863k4.m9740k4());
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public Stack<C1389to> mo14086k4(Stack<C1389to> stack, C1389to c1389to) {
        if (c1389to != null) {
            c1389to.m8275k4(mo14082fa(), this);
        }
        return stack;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m14149kk(int i, int i2) {
        Dictionary<k4, String> dictionary = this.f9768lr;
        return dictionary != null && dictionary.containsKey(new k4(i, i2));
    }

    @Override // com.aspose.slides.internal.p048bv.InterfaceC1858du
    /* JADX INFO: renamed from: m9 */
    public final int mo9715m9() {
        return this.f9773to.m9737dy();
    }

    /* JADX INFO: renamed from: to */
    public final String m14152to(int i, int i2) {
        Dictionary<k4, String> dictionary = this.f9768lr;
        if (dictionary != null) {
            return dictionary.get_Item(new k4(i, i2));
        }
        return null;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: x1 */
    public void mo14124x1(char[] cArr, int i, int i2, AbstractC3533um abstractC3533um, InterfaceC3757h4 interfaceC3757h4) {
        C1863k4 c1863k4M9733k4;
        C1863k4 c1863k4 = this.f9773to;
        if (c1863k4 != null) {
            int iM9740k4 = c1863k4.m9740k4() + i2;
            int iM9749x1 = this.f9773to.m9749x1();
            if (iM9740k4 > iM9749x1) {
                int i3 = iM9749x1 * 2;
                if (iM9740k4 <= i3) {
                    iM9740k4 = i3;
                }
                c1863k4M9733k4 = C1863k4.m9733k4(iM9740k4);
                this.f9773to.m9747kk();
                c1863k4M9733k4.m9744k4(this.f9773to);
            }
            C1863k4 c1863k42 = this.f9773to;
            c1863k42.m9736du(c1863k42.m9749x1());
            this.f9773to.m9745k4(cArr, i, i2);
            C1863k4 c1863k43 = this.f9773to;
            c1863k43.m9736du(c1863k43.m9740k4());
        }
        c1863k4M9733k4 = C1863k4.m9733k4(i2 >= 16 ? i2 : 16);
        this.f9773to = c1863k4M9733k4;
        C1863k4 c1863k422 = this.f9773to;
        c1863k422.m9736du(c1863k422.m9749x1());
        this.f9773to.m9745k4(cArr, i, i2);
        C1863k4 c1863k432 = this.f9773to;
        c1863k432.m9736du(c1863k432.m9740k4());
    }

    /* JADX INFO: renamed from: k4 */
    public final InterfaceC1858du m14145k4(int i, int i2) {
        return this.f9773to.m9741k4(i, i2);
    }

    /* JADX INFO: renamed from: x1 */
    public final int[] m14158x1(int i, int i2) {
        int[] iArr = this.f9778v4;
        if (iArr == null) {
            return null;
        }
        int i3 = i2 - i;
        int[] iArr2 = new int[i3];
        System.arraycopy(iArr, i, iArr2, 0, i3);
        return iArr2;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public AbstractC3511c5 mo14087k4(AbstractC3511c5 abstractC3511c5, boolean z) {
        C1863k4 c1863k4;
        C3513ck c3513ck = (C3513ck) super.mo14087k4(abstractC3511c5, z);
        if (z && (c1863k4 = this.f9773to) != null) {
            c3513ck.f9773to = C1863k4.m9733k4(c1863k4.m9737dy());
            this.f9773to.m9747kk();
            c3513ck.f9773to.m9744k4(this.f9773to);
            c3513ck.f9773to.m9747kk();
        }
        c3513ck.f9771qq = null;
        c3513ck.f9757ar = null;
        return c3513ck;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m14146k4(int i, int i2, int i3) {
        if (i2 < i3) {
            if (this.f9778v4 == null) {
                this.f9778v4 = new int[mo9715m9()];
            }
            while (i2 < i3) {
                this.f9778v4[i2] = i;
                i2++;
            }
            AbstractC3511c5 abstractC3511c5 = this.f9752k4;
            if (abstractC3511c5 != null) {
                ((AbstractC3524ks) abstractC3511c5).m14327to(i);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m14147k4(int i, int i2, InterfaceC1858du interfaceC1858du) {
        if (this.f9768lr == null) {
            this.f9768lr = new Dictionary<>();
        }
        this.f9768lr.addItem(new k4(i, i2), interfaceC1858du.toString());
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public void mo14090k4(AbstractC3533um abstractC3533um) {
        this.f9761du = abstractC3533um.m14384ck();
        this.f9764h4 = abstractC3533um.m14389h4();
        abstractC3533um.m14402to(72).mo9923k4(m14111q_()).CloneTo(this.f9769m9);
        this.f9762dy = abstractC3533um.m14402to(131).mo17190up();
        this.f9766jd = abstractC3533um.m14402to(144).mo17204rv();
        this.f9759c5 = abstractC3533um.m14402to(141);
        this.f9763fa = abstractC3533um.m14402to(StyleIdentifier.INTENSE_EMPHASIS).mo17251du();
        this.f9760ck = abstractC3533um.m14402to(StyleIdentifier.SUBTLE_REFERENCE).mo17251du();
        this.f9776up = abstractC3533um.m14402to(StyleIdentifier.MEDIUM_LIST_2_ACCENT_6).mo17251du();
        this.f9781yj = abstractC3533um.m14402to(StyleIdentifier.BIBLIOGRAPHY);
        this.f9767ks = abstractC3533um.m14402to(StyleIdentifier.TOC_HEADING).mo17251du();
        this.f9775um = abstractC3533um.m14388fa();
        this.f9772rv = abstractC3533um.m14402to(15).mo9877dy();
        this.f9770ne = abstractC3533um.m14402to(81).mo9926j_();
        this.f9765ix = abstractC3533um.m14402to(134).mo9926j_();
        this.f9774u4 = abstractC3533um.m14402to(218).mo9926j_();
        this.f9780x6 = abstractC3533um.m14402to(StyleIdentifier.BOOK_TITLE).mo9877dy();
        this.f9777uz = abstractC3533um.m14402to(245).mo17251du();
        this.f9779wl = abstractC3533um.m14402to(StyleIdentifier.SUBTLE_EMPHASIS).mo17251du();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m14148k4(C10782m9 c10782m9) {
        this.f9757ar = c10782m9;
        C3513ck c3513ck = ((AbstractC3529rv) c10782m9).f9858m9;
        if (c3513ck != null) {
            if (c3513ck.f9757ar == c10782m9) {
                this.f9771qq = c3513ck;
            } else {
                this.f9771qq = null;
            }
        }
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public void mo14097k4(InterfaceC11601k4 interfaceC11601k4) {
        this.f9758bv = interfaceC11601k4;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public boolean mo14101k4(int i) {
        return false;
    }
}

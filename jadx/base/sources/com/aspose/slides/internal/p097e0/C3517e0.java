package com.aspose.slides.internal.p097e0;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.Stack;
import com.aspose.slides.internal.p380ri.C10018x1;
import com.aspose.slides.internal.p409sv.C10782m9;
import com.aspose.words.ControlChar;

/* JADX INFO: renamed from: com.aspose.slides.internal.e0.e0 */
/* JADX INFO: loaded from: classes3.dex */
public class C3517e0 {

    /* JADX INFO: renamed from: c5 */
    private C3510bv f9792c5;

    /* JADX INFO: renamed from: du */
    private int f9794du;

    /* JADX INFO: renamed from: dy */
    private boolean f9795dy;

    /* JADX INFO: renamed from: fa */
    private AbstractC3523kk f9796fa;

    /* JADX INFO: renamed from: h4 */
    private int f9797h4;

    /* JADX INFO: renamed from: jd */
    private List<x1> f9798jd;

    /* JADX INFO: renamed from: kk */
    private int f9800kk;

    /* JADX INFO: renamed from: m9 */
    private boolean f9801m9;

    /* JADX INFO: renamed from: to */
    private int f9802to;

    /* JADX INFO: renamed from: k4 */
    private boolean f9799k4 = false;

    /* JADX INFO: renamed from: x1 */
    private boolean f9803x1 = true;

    /* JADX INFO: renamed from: ck */
    private Stack<C10782m9> f9793ck = new Stack<>();

    /* JADX INFO: renamed from: com.aspose.slides.internal.e0.e0$k4 */
    public static class k4 {

        /* JADX INFO: renamed from: k4 */
        private boolean f9804k4 = false;

        /* JADX INFO: renamed from: kk */
        private C3517e0 f9805kk;

        /* JADX INFO: renamed from: x1 */
        private C3510bv f9806x1;

        public k4(AbstractC3523kk abstractC3523kk, C3517e0 c3517e0) {
            this.f9806x1 = (C3510bv) abstractC3523kk;
            this.f9805kk = c3517e0;
        }

        /* JADX INFO: renamed from: k4 */
        public final boolean m14231k4() {
            if (!this.f9804k4) {
                AbstractC3523kk abstractC3523kkM14068m9 = this.f9806x1.m14068m9();
                while (true) {
                    boolean z = true;
                    if (abstractC3523kkM14068m9.mo9764x1()) {
                        int iM49175k4 = C10018x1.m49175k4(abstractC3523kkM14068m9.mo14069to());
                        if (iM49175k4 == 1) {
                            if (this.f9805kk.f9802to == 108) {
                                this.f9804k4 = true;
                                return true;
                            }
                        } else if (iM49175k4 != 4) {
                            return this.f9804k4;
                        }
                    } else {
                        if (!this.f9805kk.f9795dy && !this.f9805kk.f9801m9) {
                            z = false;
                        }
                        this.f9804k4 = z;
                    }
                }
            }
            return this.f9804k4;
        }

        /* JADX INFO: renamed from: x1 */
        public final void m14232x1() {
            this.f9804k4 = false;
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.e0.e0$x1 */
    public static class x1 {

        /* JADX INFO: renamed from: k4 */
        public AbstractC3523kk f9807k4;

        public x1(AbstractC3529rv abstractC3529rv, AbstractC3523kk abstractC3523kk) {
            this.f9807k4 = abstractC3523kk;
        }
    }

    /* JADX INFO: renamed from: kk */
    private void m14225kk() {
        List<x1> list = this.f9798jd;
        if (list == null || list.size() == 0) {
            return;
        }
        if (this.f9800kk != 0) {
            this.f9798jd.clear();
            return;
        }
        int size = this.f9798jd.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            x1 x1Var = this.f9798jd.get_Item(size);
            this.f9792c5 = (C3510bv) x1Var.f9807k4;
            m14227x1();
            this.f9798jd.removeItem(x1Var);
        }
    }

    /* JADX INFO: renamed from: x1 */
    private void m14227x1() {
        boolean zM14231k4;
        k4 k4Var = new k4(this.f9792c5, this);
        this.f9800kk = 0;
        while (this.f9792c5.mo9764x1()) {
            if (!this.f9799k4) {
                this.f9796fa = this.f9792c5.m14068m9();
            }
            char cMo14069to = this.f9792c5.mo14069to();
            if (C10018x1.m49175k4(cMo14069to) == 1 && this.f9802to == 147) {
                this.f9792c5.mo14067k4(ControlChar.SPACE_CHAR);
                C10018x1.m49175k4(32);
                cMo14069to = ' ';
            }
            int iM49175k4 = C10018x1.m49175k4(cMo14069to);
            if (iM49175k4 == 1) {
                int i = this.f9802to;
                if (i == 60) {
                    this.f9792c5.mo9758k4();
                } else if (i == 108) {
                    k4Var.m14232x1();
                    this.f9799k4 = false;
                    this.f9803x1 = true;
                } else if (i == 148) {
                    this.f9792c5.mo14067k4((char) 8203);
                    this.f9799k4 = false;
                }
            } else if (iM49175k4 != 4) {
                this.f9799k4 = false;
                this.f9803x1 = false;
                this.f9800kk++;
                k4Var.m14232x1();
            } else {
                if (!this.f9799k4 || this.f9797h4 != 149) {
                    switch (this.f9794du) {
                        case 60:
                            zM14231k4 = true;
                            break;
                        case 61:
                            zM14231k4 = this.f9803x1;
                            break;
                        case 62:
                            zM14231k4 = k4Var.m14231k4();
                            break;
                        case 63:
                            if (this.f9803x1 || k4Var.m14231k4()) {
                                zM14231k4 = true;
                                break;
                            }
                        default:
                            zM14231k4 = false;
                            break;
                    }
                    if (!zM14231k4) {
                        this.f9799k4 = true;
                        if (cMo14069to != ' ') {
                            this.f9792c5.mo14067k4(ControlChar.SPACE_CHAR);
                        }
                    }
                }
                this.f9792c5.mo9758k4();
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m14229k4() {
        List<x1> list = this.f9798jd;
        if (list != null) {
            list.clear();
        }
        this.f9793ck.clear();
        this.f9792c5 = null;
        this.f9796fa = null;
    }

    /* JADX INFO: renamed from: k4 */
    private void m14224k4(AbstractC3529rv abstractC3529rv) {
        if (this.f9798jd == null) {
            this.f9798jd = new List<>(5);
        }
        this.f9798jd.addItem(new x1(abstractC3529rv, this.f9796fa));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m14230k4(AbstractC3529rv abstractC3529rv, AbstractC3511c5 abstractC3511c5, AbstractC3511c5 abstractC3511c52) {
        C10782m9 c10782m9Peek;
        int iM52305he;
        List<x1> list;
        int iMo14084ix;
        int iMo14084ix2 = abstractC3529rv.mo14084ix();
        if (iMo14084ix2 != 3) {
            if (iMo14084ix2 == 64) {
                AbstractC3511c5 abstractC3511c5M14115s_ = abstractC3529rv;
                do {
                    abstractC3511c5M14115s_ = abstractC3511c5M14115s_.m14115s_();
                    if (abstractC3511c5M14115s_.mo14084ix() == 3) {
                        break;
                    }
                } while (abstractC3511c5M14115s_.mo14084ix() != 70);
                if (abstractC3511c5M14115s_.mo14084ix() == 3) {
                    c10782m9Peek = (C10782m9) abstractC3511c5M14115s_;
                    this.f9793ck.push(c10782m9Peek);
                }
            } else if (this.f9793ck.size() != 0) {
                c10782m9Peek = this.f9793ck.peek();
            }
            c10782m9Peek = null;
        } else {
            c10782m9Peek = (C10782m9) abstractC3529rv;
            if (this.f9793ck.size() == 0 || abstractC3529rv != this.f9793ck.peek()) {
                if (abstractC3511c52 != null) {
                    this.f9793ck.push(c10782m9Peek);
                }
            } else if (abstractC3511c52 == null) {
                this.f9793ck.pop();
            }
        }
        if (c10782m9Peek != null) {
            this.f9802to = c10782m9Peek.m52297bs();
            this.f9797h4 = c10782m9Peek.m52307jw();
            iM52305he = c10782m9Peek.m52305he();
        } else {
            this.f9802to = 147;
            this.f9797h4 = 149;
            iM52305he = 63;
        }
        this.f9794du = iM52305he;
        boolean z = abstractC3511c52 == null && abstractC3529rv == c10782m9Peek;
        this.f9801m9 = z;
        if (abstractC3511c5 == null) {
            this.f9803x1 = abstractC3529rv == c10782m9Peek && abstractC3529rv.f9851to == null;
            this.f9800kk = 0;
            if (z) {
                m14225kk();
                return;
            }
            return;
        }
        this.f9792c5 = new C3510bv(abstractC3529rv, abstractC3511c5);
        this.f9799k4 = false;
        if (abstractC3529rv == c10782m9Peek || c10782m9Peek == null || (iMo14084ix2 == 64 && abstractC3529rv.m14115s_() == c10782m9Peek)) {
            if (abstractC3511c5 == abstractC3529rv.f9851to) {
                this.f9803x1 = true;
            } else {
                int iMo14084ix3 = abstractC3511c5.f9754x1.f9756x1.mo14084ix();
                this.f9803x1 = iMo14084ix3 == 3 || iMo14084ix3 == 72 || iMo14084ix3 == 71 || iMo14084ix3 == 40 || iMo14084ix3 == 4;
            }
        }
        if (iMo14084ix2 == 81) {
            AbstractC3511c5 abstractC3511c53 = abstractC3529rv.f9752k4;
            while (true) {
                iMo14084ix = abstractC3511c53.mo14084ix();
                if (iMo14084ix != 81) {
                    break;
                } else {
                    abstractC3511c53 = abstractC3511c53.f9752k4;
                }
            }
            if (iMo14084ix == 16 || iMo14084ix == 70 || iMo14084ix == 4 || iMo14084ix == 75) {
                this.f9801m9 = abstractC3511c52 == null;
            }
        }
        if (abstractC3511c52 != null) {
            int iMo14084ix4 = abstractC3511c52.mo14084ix();
            if (iMo14084ix4 != 3 && iMo14084ix4 != 72 && iMo14084ix4 != 71 && iMo14084ix4 != 40 && iMo14084ix4 != 4) {
                z = false;
            }
            this.f9795dy = z;
        } else {
            this.f9795dy = false;
        }
        m14227x1();
        if (abstractC3529rv == c10782m9Peek && (this.f9801m9 || this.f9795dy)) {
            m14225kk();
        }
        if (abstractC3511c52 == null) {
            if (abstractC3529rv == c10782m9Peek) {
                if (this.f9793ck.size() != 0) {
                    this.f9793ck.pop();
                }
                this.f9792c5 = null;
                this.f9796fa = null;
                return;
            }
            if (this.f9800kk > 0 && (list = this.f9798jd) != null) {
                list.clear();
            }
            if (this.f9799k4) {
                m14224k4(abstractC3529rv);
            }
        }
    }
}

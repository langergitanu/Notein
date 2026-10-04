package com.aspose.slides.internal.p097e0;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NullReferenceException;
import com.aspose.slides.internal.p097e0.AbstractC3511c5;
import com.aspose.slides.internal.p111em.InterfaceC3757h4;
import com.aspose.slides.internal.p111em.InterfaceC3760kk;
import com.aspose.slides.internal.p150gi.AbstractC4275gi;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p364qm.C9892x1;
import com.aspose.slides.internal.p364qm.InterfaceC9890k4;
import com.aspose.slides.internal.p409sv.C10765ar;
import com.aspose.slides.p559ms.System.C14113y2;
import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: renamed from: com.aspose.slides.internal.e0.ks */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3524ks extends AbstractC3511c5 {

    /* JADX INFO: renamed from: h4 */
    private static final AbstractC4275gi[] f9843h4 = C3521jd.m14281k4();

    /* JADX INFO: renamed from: c5 */
    private boolean f9844c5;

    /* JADX INFO: renamed from: ck */
    private int f9845ck;

    /* JADX INFO: renamed from: du */
    protected AbstractC3511c5 f9846du;

    /* JADX INFO: renamed from: dy */
    private Dictionary<C9892x1, String> f9847dy;

    /* JADX INFO: renamed from: fa */
    private String f9848fa;

    /* JADX INFO: renamed from: jd */
    private Dictionary<String, C10765ar> f9849jd;

    /* JADX INFO: renamed from: m9 */
    private List<InterfaceC9890k4> f9850m9;

    /* JADX INFO: renamed from: to */
    public AbstractC3511c5 f9851to;

    /* JADX INFO: renamed from: com.aspose.slides.internal.e0.ks$k4 */
    public static class k4 implements AbstractC3511c5.k4 {

        /* JADX INFO: renamed from: k4 */
        private AbstractC3511c5 f9852k4;

        /* JADX INFO: renamed from: kk */
        private int f9853kk = 0;

        /* JADX INFO: renamed from: to */
        private int f9854to;

        /* JADX INFO: renamed from: x1 */
        private AbstractC3524ks f9855x1;

        public k4(AbstractC3524ks abstractC3524ks) {
            this.f9854to = 0;
            this.f9855x1 = abstractC3524ks;
            this.f9852k4 = abstractC3524ks.f9851to;
            this.f9854to = 0;
        }

        @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5.k4
        /* JADX INFO: renamed from: c5 */
        public final AbstractC3511c5 mo14127c5() {
            AbstractC3511c5 abstractC3511c5 = this.f9855x1.f9851to;
            this.f9852k4 = abstractC3511c5;
            this.f9853kk = 0;
            return abstractC3511c5;
        }

        @Override // com.aspose.slides.internal.p048bv.InterfaceC1866m9
        /* JADX INFO: renamed from: ck, reason: merged with bridge method [inline-methods] */
        public final AbstractC3511c5 mo9756du() {
            AbstractC3511c5 abstractC3511c5;
            AbstractC3511c5.x1 x1Var = this.f9852k4.f9754x1;
            if (x1Var == null || (abstractC3511c5 = x1Var.f9756x1) == null) {
                throw new Exception("Element was not found");
            }
            this.f9853kk--;
            this.f9852k4 = abstractC3511c5;
            this.f9854to |= 3;
            return abstractC3511c5;
        }

        @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5.k4
        /* JADX INFO: renamed from: dy */
        public final AbstractC3511c5 mo14128dy() {
            return mo9760kk();
        }

        @Override // com.aspose.slides.internal.p048bv.InterfaceC1866m9
        /* JADX INFO: renamed from: h4 */
        public final int mo9757h4() {
            return this.f9853kk + 1;
        }

        @Override // com.aspose.slides.internal.p048bv.InterfaceC1866m9, com.aspose.slides.internal.p048bv.InterfaceC1870up
        /* JADX INFO: renamed from: jd, reason: merged with bridge method [inline-methods] */
        public final AbstractC3511c5 mo9760kk() {
            AbstractC3511c5 abstractC3511c5;
            AbstractC3511c5 abstractC3511c52 = this.f9852k4;
            if (abstractC3511c52 == null) {
                throw new Exception("Element was not found");
            }
            int i = this.f9853kk;
            if (i != 0) {
                AbstractC3511c5.x1 x1Var = abstractC3511c52.f9754x1;
                if (x1Var == null || (abstractC3511c5 = x1Var.f9755k4) == null) {
                    throw new Exception("Element was not found");
                }
                this.f9852k4 = abstractC3511c5;
            }
            this.f9853kk = i + 1;
            this.f9854to |= 3;
            return this.f9852k4;
        }

        @Override // com.aspose.slides.internal.p048bv.InterfaceC1866m9, com.aspose.slides.internal.p048bv.InterfaceC1870up
        /* JADX INFO: renamed from: k4 */
        public final void mo9758k4() {
            AbstractC3511c5 abstractC3511c5;
            AbstractC3511c5 abstractC3511c52;
            if ((this.f9854to & 2) != 2) {
                throw new InvalidOperationException();
            }
            this.f9855x1.mo14121x1(this.f9852k4);
            int i = this.f9853kk;
            if (i == 0) {
                abstractC3511c5 = this.f9855x1.f9851to;
            } else {
                AbstractC3511c5.x1 x1Var = this.f9852k4.f9754x1;
                if (x1Var != null && (abstractC3511c52 = x1Var.f9756x1) != null) {
                    this.f9852k4 = abstractC3511c52;
                    this.f9853kk = i - 1;
                    this.f9854to = 0;
                }
                abstractC3511c5 = null;
            }
            this.f9852k4 = abstractC3511c5;
            this.f9854to = 0;
        }

        @Override // com.aspose.slides.internal.p048bv.InterfaceC1866m9
        /* JADX INFO: renamed from: m9 */
        public final int mo9761m9() {
            return this.f9853kk - 1;
        }

        @Override // com.aspose.slides.internal.p048bv.InterfaceC1866m9
        /* JADX INFO: renamed from: to */
        public final boolean mo9762to() {
            if (this.f9853kk != 0) {
                return true;
            }
            AbstractC3511c5.x1 x1Var = this.f9852k4.f9754x1;
            return (x1Var == null || x1Var.f9756x1 == null) ? false : true;
        }

        @Override // com.aspose.slides.internal.p048bv.InterfaceC1866m9
        /* JADX INFO: renamed from: x1, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final void mo9763x1(AbstractC3511c5 abstractC3511c5) {
            AbstractC3511c5 abstractC3511c52;
            if (this.f9853kk == -1) {
                AbstractC3511c5 abstractC3511c53 = this.f9852k4;
                if (abstractC3511c53 != null) {
                    AbstractC3511c5.m14073k4(abstractC3511c5, abstractC3511c53);
                }
                AbstractC3524ks abstractC3524ks = this.f9855x1;
                abstractC3524ks.f9851to = abstractC3511c5;
                this.f9853kk = 0;
                this.f9852k4 = abstractC3511c5;
                if (abstractC3524ks.f9846du == null) {
                    abstractC3524ks.f9846du = abstractC3511c5;
                }
            } else {
                AbstractC3511c5.x1 x1Var = this.f9852k4.f9754x1;
                if (x1Var != null && (abstractC3511c52 = x1Var.f9755k4) != null) {
                    AbstractC3511c5.m14073k4(abstractC3511c5, abstractC3511c52);
                }
                AbstractC3511c5.m14073k4(this.f9852k4, abstractC3511c5);
                AbstractC3511c5 abstractC3511c54 = this.f9852k4;
                AbstractC3524ks abstractC3524ks2 = this.f9855x1;
                if (abstractC3511c54 == abstractC3524ks2.f9846du) {
                    abstractC3524ks2.f9846du = abstractC3511c5;
                }
            }
            this.f9854to = 0;
        }

        @Override // com.aspose.slides.internal.p048bv.InterfaceC1866m9
        /* JADX INFO: renamed from: k4, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final void mo9759k4(AbstractC3511c5 abstractC3511c5) {
            AbstractC3511c5 abstractC3511c52;
            if ((this.f9854to & 1) != 1) {
                throw new InvalidOperationException();
            }
            AbstractC3511c5 abstractC3511c53 = this.f9852k4;
            AbstractC3524ks abstractC3524ks = this.f9855x1;
            if (abstractC3511c53 == abstractC3524ks.f9851to) {
                abstractC3524ks.f9851to = abstractC3511c5;
            } else {
                AbstractC3511c5.m14073k4(abstractC3511c53.f9754x1.f9756x1, abstractC3511c5);
            }
            AbstractC3511c5.x1 x1Var = this.f9852k4.f9754x1;
            if (x1Var != null && (abstractC3511c52 = x1Var.f9755k4) != null) {
                AbstractC3511c5.m14073k4(abstractC3511c5, abstractC3511c52);
            }
            AbstractC3511c5 abstractC3511c54 = this.f9852k4;
            AbstractC3524ks abstractC3524ks2 = this.f9855x1;
            if (abstractC3511c54 == abstractC3524ks2.f9846du) {
                abstractC3524ks2.f9846du = abstractC3511c5;
            }
        }

        @Override // com.aspose.slides.internal.p048bv.InterfaceC1866m9, com.aspose.slides.internal.p048bv.InterfaceC1870up
        /* JADX INFO: renamed from: x1 */
        public final boolean mo9764x1() {
            AbstractC3511c5 abstractC3511c5 = this.f9852k4;
            if (abstractC3511c5 == null) {
                return false;
            }
            if (this.f9853kk == 0) {
                return true;
            }
            AbstractC3511c5.x1 x1Var = abstractC3511c5.f9754x1;
            return (x1Var == null || x1Var.f9755k4 == null) ? false : true;
        }
    }

    public AbstractC3524ks(AbstractC3511c5 abstractC3511c5) {
        super(abstractC3511c5);
        this.f9850m9 = null;
        this.f9847dy = null;
        this.f9844c5 = false;
        this.f9849jd = null;
        this.f9845ck = -1;
        this.f9848fa = null;
        if (abstractC3511c5 == null || !C7019kk.m27469x1(abstractC3511c5, AbstractC3524ks.class)) {
            return;
        }
        if (((AbstractC3524ks) abstractC3511c5).m14309e0()) {
            this.f9844c5 = true;
            return;
        }
        int iMo14084ix = mo14084ix();
        if (iMo14084ix == 15 || iMo14084ix == 24 || iMo14084ix == 25) {
            this.f9844c5 = true;
        }
    }

    /* JADX INFO: renamed from: du */
    private void m14308du(String str) {
        if (mo14110p_() || str.length() == 0) {
            return;
        }
        Dictionary<String, String> dictionaryM14405k4 = mo14109o_().m14405k4();
        if (dictionaryM14405k4.containsKey(str)) {
            m14118up().mo14363x1(this, m14105ks(), str, true, this.f9753kk);
        } else {
            dictionaryM14405k4.addItem(str, str);
        }
    }

    /* JADX INFO: renamed from: e0 */
    private boolean m14309e0() {
        return this.f9844c5;
    }

    /* JADX INFO: renamed from: x1 */
    public static AbstractC4275gi m14312x1(int i) {
        return f9843h4[i];
    }

    /* JADX INFO: renamed from: ak */
    public final int m14314ak() {
        int iM14331wy;
        for (AbstractC3511c5 abstractC3511c5M14115s_ = this; abstractC3511c5M14115s_ != null; abstractC3511c5M14115s_ = abstractC3511c5M14115s_.m14115s_()) {
            if (C7019kk.m27469x1(abstractC3511c5M14115s_, AbstractC3524ks.class) && (iM14331wy = ((AbstractC3524ks) abstractC3511c5M14115s_).m14331wy()) >= 0) {
                return iM14331wy;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ar */
    public boolean mo14315ar() {
        return false;
    }

    /* JADX INFO: renamed from: b3 */
    public final boolean m14316b3() {
        String str = this.f9848fa;
        return str != null && str.length() > 0;
    }

    /* JADX INFO: renamed from: bv */
    public final boolean m14317bv() {
        Dictionary<String, C10765ar> dictionary = this.f9849jd;
        return (dictionary == null || dictionary.size() == 0) ? false : true;
    }

    /* JADX INFO: renamed from: c6 */
    public final Dictionary<C9892x1, String> m14318c6() {
        Dictionary<C9892x1, String> dictionary = this.f9847dy;
        return dictionary == null ? new Dictionary<>() : dictionary;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: ck */
    public AbstractC3511c5.k4 mo14080ck() {
        if (m14329um()) {
            return new k4(this);
        }
        return null;
    }

    /* JADX INFO: renamed from: dq */
    public final List<InterfaceC9890k4> m14319dq() {
        List<InterfaceC9890k4> list = this.f9850m9;
        return list == null ? new List<>() : list;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: h4 */
    public void mo14083h4() {
        String str = this.f9848fa;
        if (str != null) {
            m14308du(str);
        }
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public AbstractC3511c5 mo14087k4(AbstractC3511c5 abstractC3511c5, boolean z) {
        AbstractC3524ks abstractC3524ks = (AbstractC3524ks) super.mo14087k4(abstractC3511c5, z);
        if (z) {
            abstractC3524ks.f9851to = null;
        }
        return abstractC3524ks;
    }

    /* JADX INFO: renamed from: kk */
    public final int m14323kk(int i) {
        int i2 = 1;
        for (AbstractC3511c5 abstractC3511c5M14115s_ = m14115s_(); abstractC3511c5M14115s_ != null; abstractC3511c5M14115s_ = abstractC3511c5M14115s_.m14115s_()) {
            if (abstractC3511c5M14115s_.mo14084ix() == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: l_ */
    public final AbstractC3524ks m14325l_() {
        AbstractC3511c5 abstractC3511c5 = this.f9752k4;
        while (abstractC3511c5 != null && !C7019kk.m27469x1(abstractC3511c5, AbstractC3524ks.class)) {
            abstractC3511c5 = abstractC3511c5.f9752k4;
        }
        return (AbstractC3524ks) abstractC3511c5;
    }

    /* JADX INFO: renamed from: lr */
    public final void m14326lr() {
        this.f9851to = null;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: ne */
    public String mo14108ne() {
        return "http://www.w3.org/1999/XSL/Format";
    }

    /* JADX INFO: renamed from: to */
    public final void m14327to(int i) {
        if (i >= 0) {
            int i2 = this.f9845ck;
            if (i2 < 0 || i < i2) {
                this.f9845ck = i;
                AbstractC3511c5 abstractC3511c5 = this.f9752k4;
                if (abstractC3511c5 != null) {
                    AbstractC3524ks abstractC3524ks = (AbstractC3524ks) abstractC3511c5;
                    int iM14331wy = abstractC3524ks.m14331wy();
                    if (iM14331wy < 0 || i < iM14331wy) {
                        abstractC3524ks.m14327to(i);
                    }
                }
            }
        }
    }

    public String toString() {
        return C14113y2.m67408k4(super.toString(), "[@id=", this.f9848fa, "]");
    }

    /* JADX INFO: renamed from: um */
    public final boolean m14329um() {
        return this.f9851to != null;
    }

    /* JADX INFO: renamed from: v4 */
    public final Dictionary<String, C10765ar> m14330v4() {
        return this.f9849jd;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: wl */
    public boolean mo14120wl() {
        String strMo14108ne = mo14108ne();
        String strMo14114rv = mo14114rv();
        return !m14320du(strMo14108ne, strMo14114rv) && m14332x1(strMo14108ne, strMo14114rv);
    }

    /* JADX INFO: renamed from: wy */
    public final int m14331wy() {
        return this.f9845ck;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: x6 */
    public String mo14125x6() {
        return "fo";
    }

    /* JADX INFO: renamed from: xk */
    public final boolean m14333xk() {
        return this.f9850m9 != null;
    }

    /* JADX INFO: renamed from: yd */
    public String mo14334yd() {
        return this.f9848fa;
    }

    /* JADX INFO: renamed from: to */
    private void m14311to(AbstractC3511c5 abstractC3511c5) {
    }

    /* JADX INFO: renamed from: du */
    public final boolean m14320du(String str, String str2) {
        if (!C14113y2.m67363du("http://www.w3.org/1999/XSL/Format", str)) {
            return false;
        }
        if (C14113y2.m67363du(str2, "multi-switch") || C14113y2.m67363du(str2, "multi-properties") || C14113y2.m67363du(str2, "wrapper")) {
            return true;
        }
        return (!this.f9844c5 && C14113y2.m67363du(str2, "float")) || C14113y2.m67363du(str2, "retrieve-marker") || C14113y2.m67363du(str2, "retrieve-table-marker");
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public AbstractC3533um mo14088k4(AbstractC3533um abstractC3533um, AbstractC3516dy abstractC3516dy) {
        return mo14109o_().m14410x1().mo14250k4(this, abstractC3533um);
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: kk */
    public AbstractC3511c5.k4 mo14102kk(AbstractC3511c5 abstractC3511c5) {
        AbstractC3511c5.k4 k4VarMo14080ck = mo14080ck();
        if (k4VarMo14080ck != null) {
            if (this.f9851to != abstractC3511c5) {
                while (k4VarMo14080ck.mo9764x1() && k4VarMo14080ck.mo14128dy().f9754x1.f9755k4 != abstractC3511c5) {
                }
                if (k4VarMo14080ck.mo9764x1()) {
                }
            }
            return k4VarMo14080ck;
        }
        return null;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: x1 */
    public void mo14121x1(AbstractC3511c5 abstractC3511c5) {
        AbstractC3511c5.x1 x1Var = abstractC3511c5.f9754x1;
        AbstractC3511c5 abstractC3511c52 = x1Var != null ? x1Var.f9755k4 : null;
        if (abstractC3511c5 == this.f9851to) {
            this.f9851to = abstractC3511c52;
            if (abstractC3511c52 != null) {
                abstractC3511c52.f9754x1.f9756x1 = null;
            }
        } else {
            AbstractC3511c5 abstractC3511c53 = x1Var.f9756x1;
            abstractC3511c53.f9754x1.f9755k4 = abstractC3511c52;
            if (abstractC3511c52 != null) {
                abstractC3511c52.f9754x1.f9756x1 = abstractC3511c53;
            }
        }
        if (abstractC3511c5 == this.f9846du) {
            if (x1Var != null) {
                this.f9846du = x1Var.f9756x1;
            } else {
                this.f9846du = null;
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    public static void m14313x1(AbstractC3511c5 abstractC3511c5, AbstractC3511c5 abstractC3511c52) {
        abstractC3511c52.mo14089k4(abstractC3511c5);
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public void mo14089k4(AbstractC3511c5 abstractC3511c5) {
        AbstractC3511c5 abstractC3511c52;
        if (abstractC3511c5.mo14084ix() == 44) {
            m14322k4((C10765ar) abstractC3511c5);
            return;
        }
        InterfaceC9890k4 interfaceC9890k4M14117u4 = abstractC3511c5.m14117u4();
        if (interfaceC9890k4M14117u4 != null) {
            m14310k4(interfaceC9890k4M14117u4);
            return;
        }
        AbstractC3511c5 abstractC3511c53 = this.f9851to;
        if (abstractC3511c53 == null) {
            this.f9851to = abstractC3511c5;
            this.f9846du = abstractC3511c5;
            return;
        }
        AbstractC3511c5 abstractC3511c54 = this.f9846du;
        if (abstractC3511c54 != null) {
            AbstractC3511c5.m14073k4(abstractC3511c54, abstractC3511c5);
            this.f9846du = abstractC3511c5;
            return;
        }
        while (true) {
            AbstractC3511c5.x1 x1Var = abstractC3511c53.f9754x1;
            if (x1Var == null || (abstractC3511c52 = x1Var.f9755k4) == null) {
                break;
            } else {
                abstractC3511c53 = abstractC3511c52;
            }
        }
        AbstractC3511c5.m14073k4(abstractC3511c53, abstractC3511c5);
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m14324kk(String str, String str2) {
        if (!C14113y2.m67363du("http://www.w3.org/1999/XSL/Format", str)) {
            return false;
        }
        if (C14113y2.m67363du(str2, "bidi-override") || C14113y2.m67363du(str2, FirebaseAnalytics.Param.CHARACTER) || C14113y2.m67363du(str2, "external-graphic") || C14113y2.m67363du(str2, "instream-foreign-object") || C14113y2.m67363du(str2, "inline") || C14113y2.m67363du(str2, "inline-container") || C14113y2.m67363du(str2, "leader") || C14113y2.m67363du(str2, "page-number") || C14113y2.m67363du(str2, "page-number-citation") || C14113y2.m67363du(str2, "page-number-citation-last") || C14113y2.m67363du(str2, "basic-link")) {
            return true;
        }
        if (!C14113y2.m67363du(str2, "multi-toggle") || (mo14084ix() != 45 && m14323kk(45) <= 0)) {
            return (C14113y2.m67363du(str2, "footnote") && !this.f9844c5) || m14320du(str, str2);
        }
        return true;
    }

    /* JADX INFO: renamed from: to */
    public final boolean m14328to(String str, String str2) {
        return m14332x1(str, str2) || m14324kk(str, str2);
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public void mo14090k4(AbstractC3533um abstractC3533um) {
        this.f9848fa = abstractC3533um.m14385du(122).mo9926j_();
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m14332x1(String str, String str2) {
        if (C14113y2.m67363du("http://www.w3.org/1999/XSL/Format", str)) {
            return C14113y2.m67363du(str2, "block") || C14113y2.m67363du(str2, "table") || C14113y2.m67363du(str2, "table-and-caption") || C14113y2.m67363du(str2, "block-container") || C14113y2.m67363du(str2, "list-block") || C14113y2.m67363du(str2, "float") || m14320du(str, str2);
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    private void m14310k4(InterfaceC9890k4 interfaceC9890k4) {
        if (interfaceC9890k4 == null) {
            throw new NullReferenceException("Parameter attachment must not be null");
        }
        if (this.f9850m9 == null) {
            this.f9850m9 = new List<>();
        }
        this.f9850m9.addItem(interfaceC9890k4);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m14321k4(C9892x1 c9892x1, String str) {
        if (c9892x1 == null) {
            throw new NullReferenceException("Parameter attributeName must not be null");
        }
        if (this.f9847dy == null) {
            this.f9847dy = new Dictionary<>();
        }
        this.f9847dy.addItem(c9892x1, str);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m14322k4(C10765ar c10765ar) {
        String strM52183ts = c10765ar.m52183ts();
        if (this.f9851to != null) {
            AbstractC3511c5.k4 k4VarMo14080ck = mo14080ck();
            while (k4VarMo14080ck.mo9764x1()) {
                AbstractC3511c5 abstractC3511c5Mo9760kk = k4VarMo14080ck.mo9760kk();
                if (C7019kk.m27469x1(abstractC3511c5Mo9760kk, AbstractC3524ks.class) || (C7019kk.m27469x1(abstractC3511c5Mo9760kk, C3513ck.class) && ((C3513ck) abstractC3511c5Mo9760kk).m14154um())) {
                    m14118up().mo14359to(this, m14105ks(), strM52183ts, this.f9753kk);
                    return;
                } else if (C7019kk.m27469x1(abstractC3511c5Mo9760kk, C3513ck.class)) {
                    k4VarMo14080ck.mo9758k4();
                    m14311to(abstractC3511c5Mo9760kk);
                }
            }
        }
        if (this.f9849jd == null) {
            this.f9849jd = new Dictionary<>();
        }
        if (this.f9849jd.containsKey(strM52183ts)) {
            m14118up().mo14338du(this, m14105ks(), strM52183ts, this.f9753kk);
        } else {
            this.f9849jd.addItem(strM52183ts, c10765ar);
        }
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public void mo14098k4(String str, InterfaceC3757h4 interfaceC3757h4, InterfaceC3760kk interfaceC3760kk, AbstractC3533um abstractC3533um) {
        m14091k4(interfaceC3757h4);
        abstractC3533um.mo14395k4(interfaceC3760kk);
        if (!mo14110p_() || C14113y2.m67363du(str, RequestParameters.MARKER)) {
            mo14090k4(abstractC3533um);
        }
    }
}

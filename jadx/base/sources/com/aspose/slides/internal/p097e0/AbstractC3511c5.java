package com.aspose.slides.internal.p097e0;

import com.aspose.slides.Collections.Generic.Stack;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.p023ak.C1389to;
import com.aspose.slides.internal.p048bv.InterfaceC1866m9;
import com.aspose.slides.internal.p111em.C3761m9;
import com.aspose.slides.internal.p111em.InterfaceC3757h4;
import com.aspose.slides.internal.p111em.InterfaceC3760kk;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p364qm.C9892x1;
import com.aspose.slides.internal.p364qm.InterfaceC9890k4;
import com.aspose.slides.internal.p380ri.InterfaceC10012h4;
import com.aspose.slides.internal.p406ss.C10345uz;
import com.aspose.slides.internal.p455v4.InterfaceC11601k4;
import com.aspose.slides.internal.p523yd.C12814to;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;
import com.huawei.hms.network.embedded.C18241k5;

/* JADX INFO: renamed from: com.aspose.slides.internal.e0.c5 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3511c5 implements Cloneable {

    /* JADX INFO: renamed from: k4 */
    public AbstractC3511c5 f9752k4;

    /* JADX INFO: renamed from: kk */
    public InterfaceC3757h4 f9753kk;

    /* JADX INFO: renamed from: x1 */
    public x1 f9754x1;

    /* JADX INFO: renamed from: com.aspose.slides.internal.e0.c5$k4 */
    public interface k4 extends InterfaceC1866m9<AbstractC3511c5> {
        /* JADX INFO: renamed from: c5 */
        AbstractC3511c5 mo14127c5();

        /* JADX INFO: renamed from: dy */
        AbstractC3511c5 mo14128dy();
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.e0.c5$x1 */
    public static class x1 {

        /* JADX INFO: renamed from: k4 */
        public AbstractC3511c5 f9755k4;

        /* JADX INFO: renamed from: x1 */
        public AbstractC3511c5 f9756x1;
    }

    public AbstractC3511c5(AbstractC3511c5 abstractC3511c5) {
        this.f9752k4 = abstractC3511c5;
    }

    /* JADX INFO: renamed from: a_ */
    public static String m14070a_(String str) {
        if (C14113y2.m67363du(str, "http://www.w3.org/1999/XSL/Format")) {
            return "fo";
        }
        if (C14113y2.m67363du(str, "http://xmlgraphics.apache.org/fop/extensions")) {
            return "fox";
        }
        if (C14113y2.m67363du(str, "http://xmlgraphics.apache.org/fop/internal")) {
            return "foi";
        }
        if (C14113y2.m67363du(str, "http://www.w3.org/2000/svg")) {
            return "svg";
        }
        return null;
    }

    /* JADX INFO: renamed from: ar */
    private boolean m14071ar() {
        return mo14101k4(13);
    }

    /* JADX INFO: renamed from: um */
    private boolean m14076um() {
        return mo14101k4(3);
    }

    /* JADX INFO: renamed from: x1 */
    private C1389to m14077x1(Stack<C1389to> stack) {
        C1389to c1389toPeek;
        C1389to c1389to = null;
        if (stack.size() != 0) {
            c1389toPeek = stack.peek();
            if (c1389toPeek != null && (!c1389toPeek.m8277x1() || !m14079x1(c1389toPeek.m8273k4(), this))) {
                c1389to = new C1389to(this);
            }
        } else if (mo14120wl()) {
            c1389to = new C1389to(this);
            c1389toPeek = null;
        } else {
            c1389toPeek = null;
        }
        if (c1389to == null) {
            return c1389toPeek;
        }
        stack.push(c1389to);
        return c1389to;
    }

    /* JADX INFO: renamed from: ck */
    public k4 mo14080ck() {
        return null;
    }

    public Object clone() {
        return m14112qq();
    }

    /* JADX INFO: renamed from: dy */
    public void mo14081dy() {
        mo14113r_();
    }

    /* JADX INFO: renamed from: fa */
    public AbstractC3523kk mo14082fa() {
        return new C3537wl((char) 0);
    }

    /* JADX INFO: renamed from: h4 */
    public void mo14083h4() {
    }

    /* JADX INFO: renamed from: ix */
    public int mo14084ix() {
        return 0;
    }

    /* JADX INFO: renamed from: k4 */
    public final Stack<C1389to> m14085k4(Stack<C1389to> stack) {
        if (m14071ar()) {
            m14077x1(stack);
        }
        Stack<C1389to> stackMo14086k4 = mo14086k4(stack, stack.size() > 0 ? stack.peek() : null);
        if (m14076um()) {
            m14077x1(stackMo14086k4);
        }
        return stackMo14086k4;
    }

    /* JADX INFO: renamed from: kk */
    public k4 mo14102kk(AbstractC3511c5 abstractC3511c5) {
        return null;
    }

    /* JADX INFO: renamed from: ks */
    public final String m14105ks() {
        return m14116to(mo14125x6());
    }

    /* JADX INFO: renamed from: m_ */
    public final InterfaceC3757h4 m14106m_() {
        return this.f9753kk;
    }

    /* JADX INFO: renamed from: n_ */
    public AbstractC3516dy mo14107n_() {
        return this.f9752k4.mo14107n_();
    }

    /* JADX INFO: renamed from: ne */
    public String mo14108ne() {
        return null;
    }

    /* JADX INFO: renamed from: o_ */
    public C3534up mo14109o_() {
        return this.f9752k4.mo14109o_();
    }

    /* JADX INFO: renamed from: p_ */
    public boolean mo14110p_() {
        return mo14109o_().m14409to();
    }

    /* JADX INFO: renamed from: q_ */
    public final C12814to m14111q_() {
        return mo14107n_().mo14167b_();
    }

    /* JADX INFO: renamed from: qq */
    public Object m14112qq() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: renamed from: r_ */
    public void mo14113r_() {
    }

    /* JADX INFO: renamed from: rv */
    public abstract String mo14114rv();

    /* JADX INFO: renamed from: s_ */
    public final AbstractC3511c5 m14115s_() {
        return this.f9752k4;
    }

    /* JADX INFO: renamed from: to */
    public final String m14116to(String str) {
        if (str == null) {
            return mo14114rv();
        }
        C6765kp c6765kp = new C6765kp();
        c6765kp.m26792k4(str).m26780k4(':').m26792k4(mo14114rv());
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: u4 */
    public final InterfaceC9890k4 m14117u4() {
        return null;
    }

    /* JADX INFO: renamed from: up */
    public final InterfaceC3527ne m14118up() {
        return C3543yj.m14416k4(m14111q_().m59580u4());
    }

    /* JADX INFO: renamed from: uz */
    public InterfaceC10012h4 m14119uz() {
        return null;
    }

    /* JADX INFO: renamed from: wl */
    public boolean mo14120wl() {
        return false;
    }

    /* JADX INFO: renamed from: x6 */
    public abstract String mo14125x6();

    /* JADX INFO: renamed from: yj */
    public C10345uz mo14126yj() {
        return this.f9752k4.mo14126yj();
    }

    /* JADX INFO: renamed from: kk */
    public static String m14075kk(InterfaceC3757h4 interfaceC3757h4) {
        return interfaceC3757h4 == null ? "Unknown location" : C14113y2.m67408k4(C14057f9.m66591x1(interfaceC3757h4.mo15070k4()), "/", C14057f9.m66591x1(interfaceC3757h4.mo15072x1()));
    }

    /* JADX INFO: renamed from: x1 */
    public static String m14078x1(InterfaceC3757h4 interfaceC3757h4) {
        return C14113y2.m67408k4("Error(", m14075kk(interfaceC3757h4), "): ");
    }

    /* JADX INFO: renamed from: k4 */
    public Stack<C1389to> mo14086k4(Stack<C1389to> stack, C1389to c1389to) {
        k4 k4VarMo14080ck = mo14080ck();
        while (k4VarMo14080ck != null && k4VarMo14080ck.mo9764x1()) {
            stack = k4VarMo14080ck.mo9760kk().m14085k4(stack);
        }
        return stack;
    }

    /* JADX INFO: renamed from: k4 */
    public AbstractC3511c5 mo14087k4(AbstractC3511c5 abstractC3511c5, boolean z) {
        AbstractC3511c5 abstractC3511c52 = (AbstractC3511c5) clone();
        abstractC3511c52.f9752k4 = abstractC3511c5;
        abstractC3511c52.f9754x1 = null;
        return abstractC3511c52;
    }

    /* JADX INFO: renamed from: kk */
    public final void m14103kk(InterfaceC3757h4 interfaceC3757h4, String str, String str2) {
        m14095k4(interfaceC3757h4, m14105ks(), str, str2, (String) null);
    }

    /* JADX INFO: renamed from: x1 */
    public void mo14121x1(AbstractC3511c5 abstractC3511c5) {
    }

    /* JADX INFO: renamed from: k4 */
    public AbstractC3533um mo14088k4(AbstractC3533um abstractC3533um, AbstractC3516dy abstractC3516dy) {
        return null;
    }

    /* JADX INFO: renamed from: kk */
    public final void m14104kk(String str) {
        m14118up().mo14349k4(this, m14105ks(), str, this.f9753kk);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m14122x1(InterfaceC3757h4 interfaceC3757h4, String str, String str2) {
        m14096k4(interfaceC3757h4, str, str2, false);
    }

    /* JADX INFO: renamed from: k4 */
    public static String m14072k4(String str, String str2) {
        String strM14070a_ = m14070a_(str);
        return strM14070a_ != null ? C14113y2.m67408k4(strM14070a_, C18241k5.f55433h, str2) : C14113y2.m67408k4("(Namespace URI: \"", str, "\", ", "Local Name: \"", str2, "\")");
    }

    /* JADX INFO: renamed from: x1 */
    public final void m14123x1(String str) {
        m14118up().mo14353k4((Object) this, m14105ks(), str, false, this.f9753kk);
    }

    /* JADX INFO: renamed from: k4 */
    public void mo14089k4(AbstractC3511c5 abstractC3511c5) {
    }

    /* JADX INFO: renamed from: x1 */
    public void mo14124x1(char[] cArr, int i, int i2, AbstractC3533um abstractC3533um, InterfaceC3757h4 interfaceC3757h4) {
        m14100k4(cArr, i, i + i2, abstractC3533um, interfaceC3757h4);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m14073k4(AbstractC3511c5 abstractC3511c5, AbstractC3511c5 abstractC3511c52) {
        if (abstractC3511c5.f9754x1 == null) {
            abstractC3511c5.f9754x1 = new x1();
        }
        if (abstractC3511c52.f9754x1 == null) {
            abstractC3511c52.f9754x1 = new x1();
        }
        abstractC3511c5.f9754x1.f9755k4 = abstractC3511c52;
        abstractC3511c52.f9754x1.f9756x1 = abstractC3511c5;
    }

    /* JADX INFO: renamed from: x1 */
    private static boolean m14079x1(AbstractC3511c5 abstractC3511c5, AbstractC3511c5 abstractC3511c52) {
        while (abstractC3511c52 != null) {
            if (abstractC3511c52 == abstractC3511c5) {
                return true;
            }
            abstractC3511c52 = abstractC3511c52.m14115s_();
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public static void m14074k4(AbstractC3511c5 abstractC3511c5, InterfaceC3757h4 interfaceC3757h4, String str, String str2) {
        abstractC3511c5.mo14094k4(interfaceC3757h4, str, str2);
    }

    /* JADX INFO: renamed from: k4 */
    public void mo14090k4(AbstractC3533um abstractC3533um) {
    }

    /* JADX INFO: renamed from: k4 */
    public final void m14091k4(InterfaceC3757h4 interfaceC3757h4) {
        if (interfaceC3757h4 != null) {
            this.f9753kk = new C3761m9(interfaceC3757h4);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m14092k4(InterfaceC3757h4 interfaceC3757h4, C9892x1 c9892x1) {
        m14118up().mo14345k4(this, m14105ks(), c9892x1, interfaceC3757h4);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m14093k4(InterfaceC3757h4 interfaceC3757h4, String str) {
        m14092k4(interfaceC3757h4, new C9892x1("http://www.w3.org/1999/XSL/Format", str));
    }

    /* JADX INFO: renamed from: k4 */
    public void mo14094k4(InterfaceC3757h4 interfaceC3757h4, String str, String str2) {
    }

    /* JADX INFO: renamed from: k4 */
    public final void m14095k4(InterfaceC3757h4 interfaceC3757h4, String str, String str2, String str3, String str4) {
        String strM14070a_ = m14070a_(str2);
        m14118up().mo14346k4(this, str, strM14070a_ != null ? new C9892x1(str2, strM14070a_, str3) : new C9892x1(str2, str3), str4, interfaceC3757h4);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m14096k4(InterfaceC3757h4 interfaceC3757h4, String str, String str2, boolean z) {
        m14118up().mo14352k4(this, m14105ks(), str, str2, z, interfaceC3757h4);
    }

    /* JADX INFO: renamed from: k4 */
    public void mo14097k4(InterfaceC11601k4 interfaceC11601k4) {
        throw new NotSupportedException();
    }

    /* JADX INFO: renamed from: k4 */
    public void mo14098k4(String str, InterfaceC3757h4 interfaceC3757h4, InterfaceC3760kk interfaceC3760kk, AbstractC3533um abstractC3533um) {
    }

    /* JADX INFO: renamed from: k4 */
    public final void m14099k4(String str, boolean z) {
        m14118up().mo14353k4(this, m14105ks(), str, z, this.f9753kk);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m14100k4(char[] cArr, int i, int i2, AbstractC3533um abstractC3533um, InterfaceC3757h4 interfaceC3757h4) {
    }

    /* JADX INFO: renamed from: k4 */
    public boolean mo14101k4(int i) {
        return true;
    }
}

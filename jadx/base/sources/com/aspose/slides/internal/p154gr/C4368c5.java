package com.aspose.slides.internal.p154gr;

import androidx.core.graphics.OooO00o;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p031aw.InterfaceC1565x1;
import com.aspose.slides.internal.p156gw.C4408to;
import com.aspose.slides.internal.p180ib.C4804dy;
import com.aspose.slides.internal.p180ib.C4807kk;
import com.aspose.slides.internal.p180ib.C4808m9;
import com.aspose.slides.internal.p282mu.C6541k4;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p472w8.C11900jd;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.AbstractC12024x1;
import com.aspose.slides.internal.p475wh.C11999ar;
import com.aspose.slides.internal.p475wh.C12012lr;
import com.aspose.slides.internal.p475wh.C12026yj;
import com.aspose.slides.internal.p538z2.C13356x1;
import com.aspose.slides.p559ms.backend.System.Drawing.InterfaceC14122k4;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.aspose.slides.internal.gr.c5 */
/* JADX INFO: loaded from: classes.dex */
public class C4368c5 {

    /* JADX INFO: renamed from: kk */
    private static int f11853kk = 0;

    /* JADX INFO: renamed from: to */
    private static String f11854to = "c:/tmp/drawPath-debug.java";

    /* JADX INFO: renamed from: k4 */
    private final boolean f11855k4 = false;

    /* JADX INFO: renamed from: x1 */
    private final C4369ck f11856x1;

    public C4368c5(C4369ck c4369ck) {
        this.f11856x1 = c4369ck;
    }

    /* JADX INFO: renamed from: k4 */
    private float m17432k4(C11913yj c11913yj, float f) {
        double dSqrt;
        double dM55761jd = c11913yj.m55761jd();
        double dM55784up = c11913yj.m55784up();
        if (dM55761jd == 1.0d || dM55784up == 1.0d) {
            return f;
        }
        double dM55782rv = c11913yj.m55782rv();
        if ((c11913yj.m55755c5() & 36) == 0 || dM55782rv < 0.0d) {
            double dM55761jd2 = c11913yj.m55761jd();
            double dM55759fa = c11913yj.m55759fa();
            double dM55756ck = c11913yj.m55756ck();
            double dM55784up2 = c11913yj.m55784up();
            double d = (dM55756ck * dM55756ck) + (dM55761jd2 * dM55761jd2);
            double dOooO00o = OooO00o.OooO00o(dM55756ck, dM55784up2, dM55761jd2 * dM55759fa, 2.0d);
            double d2 = (dM55784up2 * dM55784up2) + (dM55759fa * dM55759fa);
            double d3 = d - d2;
            double d4 = d + d2;
            dSqrt = Math.sqrt((d4 + Math.sqrt((d3 * d3) + (dOooO00o * dOooO00o))) / 2.0d);
        } else {
            dSqrt = Math.sqrt(dM55782rv);
        }
        return (float) (((double) f) / dSqrt);
    }

    /* JADX INFO: renamed from: kk */
    private void m17440kk(C12026yj c12026yj, C11896dy c11896dy) {
        this.f11856x1.mo17582wl().mo67603x1(c11896dy.m55568ne());
    }

    /* JADX INFO: renamed from: x1 */
    private void m17442x1(InterfaceC1565x1 interfaceC1565x1) {
        this.f11856x1.mo17582wl().mo67598kk(this.f11856x1.m17484k4(interfaceC1565x1));
    }

    /* JADX INFO: renamed from: k4 */
    private C4408to m17433k4(C13356x1 c13356x1) {
        C4408to c4408to = new C4408to(c13356x1.f44711k4);
        c4408to.m17974k4(new C4408to(c13356x1.f44713x1));
        c4408to.m17974k4(new C4408to(c13356x1.f44712kk));
        return c4408to;
    }

    /* JADX INFO: renamed from: kk */
    private boolean m17441kk(InterfaceC1565x1 interfaceC1565x1) {
        return interfaceC1565x1.mo8359kk(null).mo17821x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m17443x1(C12026yj c12026yj, C11896dy c11896dy) {
        if (c12026yj == null) {
            throw new ArgumentNullException("Value of 'pen' cannot be null");
        }
        if (c11896dy == null) {
            throw new ArgumentNullException("Value of 'path' cannot be null");
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m17434k4(InterfaceC1565x1 interfaceC1565x1) {
        this.f11856x1.mo17582wl().mo67603x1(this.f11856x1.m17484k4(interfaceC1565x1));
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m17444x1(C12026yj c12026yj, boolean z) {
        if (!z) {
            return false;
        }
        AbstractC12024x1 abstractC12024x1M56935x1 = c12026yj.m56935x1();
        return ((abstractC12024x1M56935x1 instanceof C12012lr) || (abstractC12024x1M56935x1 instanceof C11900jd)) && !c12026yj.m56933to() && c12026yj.m56908ck() == 0 && c12026yj.m56912fa() == 0 && c12026yj.m56934up() == 0 && c12026yj.m56940x6().m55789x1();
    }

    /* JADX INFO: renamed from: k4 */
    public static void m17435k4(C11896dy c11896dy, C12026yj c12026yj, C11913yj c11913yj, float f) {
        if (c11913yj != null) {
            c11896dy.m55577x1(c11913yj);
        }
        c11896dy.m55541k4((C11913yj) null, f);
        if (c11913yj != null) {
            C11913yj c11913yjM55760h4 = c11913yj.m55760h4();
            c11913yjM55760h4.m55780m9();
            c11896dy.m55577x1(c11913yjM55760h4);
        }
        C4804dy c4804dy = new C4804dy(c12026yj, 1.0f);
        C4808m9 c4808m9 = new C4808m9();
        c4808m9.m19908k4(c11896dy);
        c4808m9.m19907k4(c4804dy);
        if (c11913yj == null) {
            c11913yj = new C11913yj();
        }
        c4808m9.m19909k4(c11913yj);
        c4808m9.m19910k4(false);
        List<C13356x1> listM62020k4 = new C4807kk(c4808m9).m19905k4().m62020k4();
        C11896dy c11896dy2 = new C11896dy();
        for (C13356x1 c13356x1 : listM62020k4) {
            c11896dy2.m55529ix().mo59963k4(c13356x1.f44711k4, false);
            if (c13356x1.f44713x1 != null) {
                c11896dy2.m55529ix().mo59963k4(c13356x1.f44713x1, false);
            }
            if (c13356x1.f44712kk != null) {
                c11896dy2.m55529ix().mo59963k4(c13356x1.f44712kk, false);
            }
        }
        c11896dy.m55529ix().mo59962k4(c11896dy2.m55568ne());
        c11896dy.m55537k4(1);
    }

    /* JADX INFO: renamed from: k4 */
    public void m17445k4(C12026yj c12026yj, C11896dy c11896dy) {
        m17443x1(c12026yj, c11896dy);
        if (Float.isNaN(c12026yj.m56930ne())) {
            return;
        }
        InterfaceC14122k4 interfaceC14122k4Mo17582wl = this.f11856x1.mo17582wl();
        AbstractC12024x1 abstractC12024x1M56935x1 = c12026yj.m56935x1();
        C4376m9 c4376m9 = new C4376m9(this.f11856x1, abstractC12024x1M56935x1);
        try {
            this.f11856x1.m17578um();
            C11913yj c11913yjM17472bv = this.f11856x1.m17472bv();
            c11913yjM17472bv.m55769k4(interfaceC14122k4Mo17582wl.mo67596kk(), 1);
            interfaceC14122k4Mo17582wl.mo67593k4(C11913yj.f40121k4);
            if (!(abstractC12024x1M56935x1 instanceof C11900jd)) {
                C11913yj c11913yjM56867du = abstractC12024x1M56935x1.m56867du();
                c11913yjM56867du.m55769k4(c11913yjM17472bv, 1);
                abstractC12024x1M56935x1.m56871k4(c11913yjM56867du);
            }
            interfaceC14122k4Mo17582wl.mo67595k4(abstractC12024x1M56935x1);
            boolean zM17438k4 = m17438k4(c12026yj, c11913yjM17472bv);
            if (m17439k4(c12026yj, zM17438k4)) {
                m17437k4(interfaceC14122k4Mo17582wl, c12026yj, c11913yjM17472bv, c11896dy.m55568ne());
            } else if (m17444x1(c12026yj, zM17438k4)) {
                m17440kk(c12026yj, c11896dy);
            } else {
                C4804dy c4804dy = new C4804dy(c12026yj, m17432k4(c11913yjM17472bv, 1.0f));
                C4808m9 c4808m9 = new C4808m9();
                c4808m9.m19908k4(c11896dy);
                c4808m9.m19907k4(c4804dy);
                c4808m9.m19909k4(c11913yjM17472bv);
                c4808m9.m19910k4(zM17438k4);
                Iterator<C13356x1> it = new C4807kk(c4808m9).m19905k4().m62020k4().iterator();
                while (it.hasNext()) {
                    m17436k4(it.next(), zM17438k4);
                }
            }
            c4376m9.m17637k4(this.f11856x1, abstractC12024x1M56935x1);
        } catch (Throwable th) {
            c4376m9.m17637k4(this.f11856x1, abstractC12024x1M56935x1);
            throw th;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m17436k4(C13356x1 c13356x1, boolean z) {
        InterfaceC1565x1 interfaceC1565x1M17433k4;
        if (!z) {
            if (m17441kk(c13356x1.f44713x1) && m17441kk(c13356x1.f44712kk)) {
                interfaceC1565x1M17433k4 = c13356x1.f44711k4;
            } else if (this.f11856x1.m17567lr()) {
                interfaceC1565x1M17433k4 = m17433k4(c13356x1);
            } else {
                m17442x1(c13356x1.f44711k4);
            }
            m17442x1(interfaceC1565x1M17433k4);
        }
        m17434k4(c13356x1.f44711k4);
        m17442x1(c13356x1.f44713x1);
        interfaceC1565x1M17433k4 = c13356x1.f44712kk;
        m17442x1(interfaceC1565x1M17433k4);
    }

    /* JADX INFO: renamed from: k4 */
    private void m17437k4(InterfaceC14122k4 interfaceC14122k4, C12026yj c12026yj, C11913yj c11913yj, InterfaceC1565x1 interfaceC1565x1) {
        if (!c11913yj.m55789x1()) {
            interfaceC1565x1 = C6541k4.m26346k4(c11913yj, interfaceC1565x1);
        }
        interfaceC14122k4.mo67603x1(interfaceC1565x1);
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m17438k4(C12026yj c12026yj, C11913yj c11913yj) {
        if (this.f11856x1.m17604yd()) {
            return false;
        }
        C11913yj c11913yjM56940x6 = c12026yj.m56940x6();
        c11913yjM56940x6.m55769k4(c11913yj, 0);
        float fM17432k4 = m17432k4(c11913yjM56940x6, 1.5f);
        return (c12026yj.m56930ne() <= fM17432k4 || Float.isNaN(fM17432k4)) && c12026yj.m56908ck() == 0;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m17439k4(C12026yj c12026yj, boolean z) {
        return z && (c12026yj.m56935x1() instanceof C11999ar) && !c12026yj.m56933to() && c12026yj.m56908ck() == 0 && c12026yj.m56912fa() == 0 && c12026yj.m56934up() == 0 && c12026yj.m56940x6().m55789x1();
    }
}

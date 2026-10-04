package com.aspose.slides.internal.p111em;

import com.aspose.slides.Collections.Generic.Stack;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p097e0.C3518fa;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.InterfaceC14073kp;
import com.aspose.slides.p559ms.System.Xml.C13938ms;

/* JADX INFO: renamed from: com.aspose.slides.internal.em.ck */
/* JADX INFO: loaded from: classes.dex */
public class C3754ck {

    /* JADX INFO: renamed from: k4 */
    private InterfaceC3762to f10272k4 = null;

    /* JADX INFO: renamed from: x1 */
    private InterfaceC3755du f10273x1 = null;

    /* JADX INFO: renamed from: k4 */
    public final void m15067k4(AbstractC3150x6 abstractC3150x6, String str) {
        C13938ms c13938ms = new C13938ms(abstractC3150x6);
        c13938ms.m65617m9(1);
        c13938ms.m65621x1(true);
        m15069k4(c13938ms, str);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m15068k4(InterfaceC3762to interfaceC3762to) {
        this.f10272k4 = interfaceC3762to;
    }

    /* JADX INFO: renamed from: k4 */
    private void m15065k4(C13938ms c13938ms, Stack<String> stack) {
        this.f10272k4.mo14243k4(c13938ms.mo65050up(), c13938ms.mo65023fa(), c13938ms.mo65019ck());
        while (true) {
            String strPop = stack.pop();
            if (strPop == null) {
                return;
            } else {
                this.f10272k4.mo15088x1(strPop);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m15066k4(C13938ms c13938ms, Stack<String> stack, String str) {
        stack.push(null);
        C3759k4 c3759k4 = new C3759k4();
        while (c13938ms.mo65047to()) {
            if (C14113y2.m67363du(c13938ms.mo65050up(), str)) {
                String strMo65023fa = C14113y2.f47374k4;
                if ("xmlns".equals(c13938ms.mo65060yj())) {
                    strMo65023fa = c13938ms.mo65023fa();
                }
                stack.push(strMo65023fa);
                this.f10272k4.mo15086k4(strMo65023fa, c13938ms.mo65042rv());
            } else {
                C3758jd c3758jd = new C3758jd();
                c3758jd.f10275k4 = c13938ms.mo65019ck();
                c3758jd.f10278x1 = c13938ms.mo65050up();
                c3758jd.f10277to = c13938ms.mo65023fa();
                c3758jd.f10276kk = c13938ms.mo65042rv();
                c3759k4.f10279k4.addItem(c3758jd.Clone());
            }
        }
        c13938ms.mo65020du();
        this.f10272k4.mo14244k4(c13938ms.mo65050up(), c13938ms.mo65023fa(), c13938ms.mo65019ck(), c3759k4.m15080k4());
        if (c13938ms.mo65048u4()) {
            this.f10272k4.mo14243k4(c13938ms.mo65050up(), c13938ms.mo65023fa(), c13938ms.mo65019ck());
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m15069k4(C13938ms c13938ms, String str) {
        Stack<String> stack = new Stack<>();
        C3761m9 c3761m9 = new C3761m9();
        C3753c5 c3753c5 = new C3753c5();
        try {
            String strMo65266k4 = c13938ms.mo65059yd().mo65266k4("http://www.w3.org/2000/xmlns/");
            this.f10272k4.mo14247x1();
            C3518fa c3518fa = (C3518fa) C7019kk.m27452k4((Object) this.f10272k4, C3518fa.class);
            if (c3518fa != null && str != null && str.length() > 0) {
                c3518fa.m14242k4(str);
            }
            while (c13938ms.mo65026h4()) {
                c3761m9.m15084k4(c13938ms.ah_());
                c3761m9.m15085x1(c13938ms.ai_());
                this.f10272k4.mo14241k4(c3761m9);
                int iMo65028jd = c13938ms.mo65028jd();
                if (iMo65028jd == 1) {
                    m15066k4(c13938ms, stack, strMo65266k4);
                } else if (iMo65028jd == 3) {
                    char[] cArrM67365dy = C14113y2.m67365dy(c13938ms.mo65042rv());
                    if (cArrM67365dy.length > 0) {
                        this.f10272k4.mo14245k4(cArrM67365dy, 0, cArrM67365dy.length);
                    }
                    if (c13938ms.mo65028jd() == 1) {
                        m15066k4(c13938ms, stack, strMo65266k4);
                    }
                    if (c13938ms.mo65028jd() == 15) {
                        m15065k4(c13938ms, stack);
                    }
                } else if (iMo65028jd == 13) {
                    char[] cArrM67365dy2 = C14113y2.m67365dy(c13938ms.mo65042rv());
                    if (cArrM67365dy2.length > 0) {
                        this.f10272k4.mo14248x1(cArrM67365dy2, 0, cArrM67365dy2.length);
                    }
                } else if (iMo65028jd == 15) {
                    m15065k4(c13938ms, stack);
                } else if (iMo65028jd == 6) {
                    this.f10272k4.mo15087kk(c13938ms.mo65019ck());
                } else if (iMo65028jd == 7) {
                    this.f10272k4.mo15089x1(c13938ms.mo65019ck(), c13938ms.mo65042rv());
                }
            }
            this.f10272k4.mo14246kk();
        } catch (RuntimeException e) {
            c3753c5.m15062k4(C14057f9.m66586k4(c13938ms.ah_(), (InterfaceC14073kp) C11697x1.m55250kk()));
            c3753c5.m15064x1(C14113y2.f47374k4);
            c3753c5.m15063kk(e.getMessage());
            InterfaceC3755du interfaceC3755du = this.f10273x1;
            if (interfaceC3755du == null) {
                throw e;
            }
            interfaceC3755du.mo14240k4(c3753c5);
        }
    }
}

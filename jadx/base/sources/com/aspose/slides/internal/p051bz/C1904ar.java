package com.aspose.slides.internal.p051bz;

import com.aspose.slides.Collections.Stack;
import com.aspose.slides.internal.p057c6.InterfaceC1979du;
import com.aspose.slides.internal.p057c6.InterfaceC1984kk;
import com.aspose.slides.internal.p097e0.AbstractC3524ks;
import com.aspose.slides.internal.p097e0.AbstractC3533um;
import com.aspose.slides.internal.p150gi.AbstractC4275gi;
import com.aspose.slides.internal.p523yd.C12814to;

/* JADX INFO: renamed from: com.aspose.slides.internal.bz.ar */
/* JADX INFO: loaded from: classes3.dex */
public class C1904ar {

    /* JADX INFO: renamed from: k4 */
    private AbstractC4275gi f6835k4;

    /* JADX INFO: renamed from: kk */
    private AbstractC3524ks f6836kk;

    /* JADX INFO: renamed from: to */
    private Stack f6837to;

    /* JADX INFO: renamed from: x1 */
    private AbstractC3533um f6838x1;

    public C1904ar(AbstractC4275gi abstractC4275gi, AbstractC3533um abstractC3533um) {
        this.f6835k4 = abstractC4275gi;
        this.f6838x1 = abstractC3533um;
        this.f6836kk = abstractC3533um.m14404x1();
    }

    /* JADX INFO: renamed from: dy */
    private InterfaceC1979du m9847dy() {
        InterfaceC1911fa interfaceC1911fa;
        Stack stack = this.f6837to;
        if (stack == null || (interfaceC1911fa = (InterfaceC1911fa) stack.peek()) == null) {
            return null;
        }
        return interfaceC1911fa.mo9871x1();
    }

    /* JADX INFO: renamed from: du */
    public final AbstractC4275gi m9848du() {
        return this.f6835k4;
    }

    /* JADX INFO: renamed from: h4 */
    public final void m9849h4() {
        Stack stack = this.f6837to;
        if (stack != null) {
            stack.pop();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final InterfaceC1979du m9850k4() {
        InterfaceC1979du interfaceC1979duM9847dy = m9847dy();
        return interfaceC1979duM9847dy != null ? interfaceC1979duM9847dy : this.f6835k4.mo17231x1(this.f6838x1);
    }

    /* JADX INFO: renamed from: kk */
    public final AbstractC3524ks m9852kk() {
        return this.f6836kk;
    }

    /* JADX INFO: renamed from: m9 */
    public final C12814to m9853m9() {
        if (this.f6838x1.m14393k4() != null) {
            return this.f6838x1.m14393k4().m14111q_();
        }
        return null;
    }

    /* JADX INFO: renamed from: to */
    public final AbstractC3533um m9854to() {
        return this.f6838x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final InterfaceC1984kk m9855x1() {
        return this.f6838x1.m14402to(103).mo9877dy();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m9851k4(InterfaceC1911fa interfaceC1911fa) {
        if (this.f6837to == null) {
            this.f6837to = new Stack();
        }
        this.f6837to.push(interfaceC1911fa);
    }
}

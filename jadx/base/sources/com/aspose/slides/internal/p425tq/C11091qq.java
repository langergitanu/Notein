package com.aspose.slides.internal.p425tq;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.p034b3.C1584du;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p097e0.AbstractC3516dy;
import com.aspose.slides.internal.p198j2.C5185du;
import com.aspose.slides.internal.p198j2.C5186h4;
import com.aspose.slides.internal.p471w6.C11890k4;
import com.aspose.slides.internal.p471w6.InterfaceC11891kk;
import com.aspose.slides.internal.p471w6.InterfaceC11892x1;
import com.aspose.slides.internal.p523yd.C12814to;
import com.aspose.slides.internal.p523yd.C12815x1;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.tq.qq */
/* JADX INFO: loaded from: classes4.dex */
public class C11091qq {

    /* JADX INFO: renamed from: k4 */
    private Dictionary<String, AbstractC11089m9> f38420k4 = new Dictionary<>();

    /* JADX INFO: renamed from: x1 */
    private Dictionary<String, AbstractC11098x1> f38423x1 = new Dictionary<>();

    /* JADX INFO: renamed from: kk */
    private Dictionary<String, AbstractC11087kk> f38421kk = new Dictionary<>();

    /* JADX INFO: renamed from: to */
    private boolean f38422to = false;

    public C11091qq() {
        m53589x1();
    }

    /* JADX INFO: renamed from: kk */
    private InterfaceC11079ck m53587kk(C12814to c12814to, String str) {
        if (m53595kk(str) != null) {
            return m53586k4(m53597x1(c12814to, str));
        }
        return null;
    }

    /* JADX INFO: renamed from: to */
    private InterfaceC11079ck m53588to(C12814to c12814to, String str) {
        AbstractC11089m9 abstractC11089m9M53592k4 = m53592k4(str);
        if (abstractC11089m9M53592k4 == null) {
            return null;
        }
        InterfaceC11079ck interfaceC11079ckMo22079k4 = abstractC11089m9M53592k4.mo22079k4(c12814to);
        InterfaceC11082fa interfaceC11082faMo22081x1 = abstractC11089m9M53592k4.mo22081x1(c12814to);
        if (interfaceC11082faMo22081x1 != null) {
            interfaceC11082faMo22081x1.mo53570k4(interfaceC11079ckMo22079k4);
        }
        return interfaceC11079ckMo22079k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC3516dy m53590k4(C12814to c12814to, String str, AbstractC3150x6 abstractC3150x6) {
        AbstractC11087kk abstractC11087kkM53595kk;
        if (c12814to.m59557dy() != null) {
            return c12814to.m59557dy();
        }
        AbstractC11098x1 abstractC11098x1M53596x1 = m53596x1(str);
        if (abstractC11098x1M53596x1 != null) {
            return abstractC11098x1M53596x1.m53621k4(c12814to, abstractC3150x6);
        }
        AbstractC11089m9 abstractC11089m9M53592k4 = m53592k4(str);
        boolean z = false;
        boolean z2 = c12814to.m59574m9() == null && c12814to.m59559h4() == null;
        if (abstractC11089m9M53592k4 == null) {
            abstractC11087kkM53595kk = m53595kk(str);
            if (abstractC11087kkM53595kk != null) {
                if (abstractC3150x6 == null && abstractC11087kkM53595kk.m53578k4()) {
                    z = true;
                }
                z2 &= z;
            }
        } else {
            if (abstractC3150x6 == null && abstractC11089m9M53592k4.mo22080k4()) {
                z = true;
            }
            z2 &= z;
            abstractC11087kkM53595kk = null;
        }
        if (c12814to.m59574m9() == null && abstractC11089m9M53592k4 == null && c12814to.m59559h4() == null && abstractC11087kkM53595kk == null) {
            throw new NotSupportedException(C14113y2.m67408k4("Don't know how to handle \"", str, "\" as an output format.", " Neither an FOEventHandler, nor a Renderer could be found", " for this output format."));
        }
        if (z2) {
            throw new C12815x1("OutputStream has not been set");
        }
        return new C1584du(c12814to, str, abstractC3150x6);
    }

    /* JADX INFO: renamed from: x1 */
    public final AbstractC11098x1 m53596x1(String str) {
        if (this.f38423x1.containsKey(str)) {
            return this.f38423x1.get_Item(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    private static InterfaceC11079ck m53586k4(InterfaceC11892x1 interfaceC11892x1) {
        return null;
    }

    /* JADX INFO: renamed from: kk */
    public final AbstractC11087kk m53595kk(String str) {
        if (this.f38421kk.containsKey(str)) {
            return this.f38421kk.get_Item(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: x1 */
    public final InterfaceC11892x1 m53597x1(C12814to c12814to, String str) {
        if (c12814to.m59559h4() != null) {
            return c12814to.m59559h4();
        }
        AbstractC11087kk abstractC11087kkM53595kk = m53595kk(str);
        if (abstractC11087kkM53595kk == null) {
            throw new NotSupportedException(C14113y2.m67408k4("No IF document handler for the requested format available: ", str));
        }
        InterfaceC11892x1 interfaceC11892x1M53577k4 = abstractC11087kkM53595kk.m53577k4(c12814to);
        InterfaceC11891kk interfaceC11891kkMo53575k4 = interfaceC11892x1M53577k4.mo53575k4();
        if (interfaceC11891kkMo53575k4 != null) {
            interfaceC11891kkMo53575k4.mo53574k4(interfaceC11892x1M53577k4);
        }
        return new C11890k4(interfaceC11892x1M53577k4, c12814to);
    }

    /* JADX INFO: renamed from: x1 */
    private void m53589x1() {
        m53593k4(new C5185du());
        m53593k4(new C5186h4());
    }

    /* JADX INFO: renamed from: k4 */
    public final InterfaceC11079ck m53591k4(C12814to c12814to, String str) {
        InterfaceC11079ck interfaceC11079ckM53587kk;
        if (c12814to.m59559h4() != null) {
            return m53586k4(c12814to.m59559h4());
        }
        if (c12814to.m59574m9() != null) {
            return c12814to.m59574m9();
        }
        if (m53594k4()) {
            interfaceC11079ckM53587kk = m53588to(c12814to, str);
            if (interfaceC11079ckM53587kk == null) {
                interfaceC11079ckM53587kk = m53587kk(c12814to, str);
            }
        } else {
            interfaceC11079ckM53587kk = m53587kk(c12814to, str);
            if (interfaceC11079ckM53587kk == null) {
                interfaceC11079ckM53587kk = m53588to(c12814to, str);
            }
        }
        if (interfaceC11079ckM53587kk != null) {
            return interfaceC11079ckM53587kk;
        }
        throw new NotSupportedException(C14113y2.m67408k4("No renderer for the requested format available: ", str));
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC11089m9 m53592k4(String str) {
        AbstractC11089m9[] abstractC11089m9Arr = {null};
        this.f38420k4.tryGetValue(str, abstractC11089m9Arr);
        return abstractC11089m9Arr[0];
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53593k4(AbstractC11089m9 abstractC11089m9) {
        for (String str : abstractC11089m9.mo22082x1()) {
            this.f38420k4.addItem(str, abstractC11089m9);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m53594k4() {
        return this.f38422to;
    }
}

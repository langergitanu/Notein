package com.aspose.slides.internal.p253lm;

import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.lm.ks */
/* JADX INFO: loaded from: classes4.dex */
public class C6153ks extends C6198wp {

    /* JADX INFO: renamed from: to */
    private InterfaceC6173qw f17371to;

    public C6153ks(InterfaceC6173qw interfaceC6173qw, String str, C6116bs c6116bs) {
        super(c6116bs);
        ((C6198wp) this).f17519k4 = str;
        this.f17371to = interfaceC6173qw;
    }

    @Override // com.aspose.slides.internal.p253lm.C6198wp
    /* JADX INFO: renamed from: k4 */
    public AbstractC6123ca mo10037k4(InterfaceC6132em interfaceC6132em, AbstractC6211yd abstractC6211yd, AbstractC6123ca[] abstractC6123caArr) {
        if (!"toString".equals(((C6198wp) this).f17519k4) && !"toLocaleString".equals(((C6198wp) this).f17519k4)) {
            throw new C6208y2("unknown boolean function");
        }
        AbstractC6123ca abstractC6123caM24877k4 = m24877k4(abstractC6211yd, abstractC6123caArr);
        interfaceC6132em.mo10079x1(abstractC6123caM24877k4);
        return abstractC6123caM24877k4;
    }

    @Override // com.aspose.slides.internal.p253lm.C6116bs, com.aspose.slides.internal.p253lm.AbstractC6123ca
    public String toString() {
        return C14113y2.m67402k4("function {0}", m25131fa());
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC6123ca m24877k4(AbstractC6211yd abstractC6211yd, AbstractC6123ca[] abstractC6123caArr) {
        return this.f17371to.mo24980v4().m25068h4(abstractC6211yd.toString());
    }
}

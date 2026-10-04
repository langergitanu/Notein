package com.aspose.slides.internal.p433u1;

import com.aspose.slides.internal.p055c4.AbstractC1943dy;
import com.aspose.slides.internal.p213jw.AbstractC5535bv;
import com.aspose.slides.internal.p253lm.AbstractC6123ca;
import com.aspose.slides.internal.p253lm.C6208y2;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p517y2.InterfaceC12777qq;
import com.aspose.slides.internal.p517y2.InterfaceC12785wl;
import com.aspose.slides.p559ms.System.AbstractC14068j5;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.u1.wl */
/* JADX INFO: loaded from: classes4.dex */
public class C11274wl extends AbstractC1943dy {

    /* JADX INFO: renamed from: k4 */
    private static final AbstractC14068j5 f38849k4 = C7019kk.m27443k4((Class<?>) InterfaceC12785wl.class);

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f38850x1 = new C7017h4("getNamedItem", "setNamedItem", "removeNamedItem", "item", "get_length", "getNamedItemNS", "setNamedItemNS", "removeNamedItemNS");

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC6123ca mo10029k4(String str, AbstractC6123ca abstractC6123ca, AbstractC6123ca[] abstractC6123caArr) {
        InterfaceC12785wl interfaceC12785wl = (InterfaceC12785wl) abstractC6123ca.mo24769C_();
        switch (f38850x1.m27428k4(str)) {
            case 0:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                InterfaceC12777qq interfaceC12777qqMo59448to = interfaceC12785wl.mo59448to(abstractC6123caArr[0].toString());
                return interfaceC12777qqMo59448to == null ? m10080h4() : m10084k4(interfaceC12777qqMo59448to, C14067j2.m66727k4(interfaceC12777qqMo59448to));
            case 1:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                InterfaceC12777qq interfaceC12777qqMo59445kk = interfaceC12785wl.mo59445kk((AbstractC5535bv) abstractC6123caArr[0].mo24789D_());
                return interfaceC12777qqMo59445kk == null ? m10080h4() : m10084k4(interfaceC12777qqMo59445kk, C14067j2.m66727k4(interfaceC12777qqMo59445kk));
            case 2:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                InterfaceC12777qq interfaceC12777qqMo59442du = interfaceC12785wl.mo59442du(abstractC6123caArr[0].toString());
                return interfaceC12777qqMo59442du == null ? m10080h4() : m10084k4(interfaceC12777qqMo59442du, C14067j2.m66727k4(interfaceC12777qqMo59442du));
            case 3:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                InterfaceC12777qq interfaceC12777qqMo59444k4 = interfaceC12785wl.mo59444k4(abstractC6123caArr[0].m24794wy());
                return interfaceC12777qqMo59444k4 == null ? m10080h4() : m10084k4(interfaceC12777qqMo59444k4, C14067j2.m66727k4(interfaceC12777qqMo59444k4));
            case 4:
                return m10082k4(interfaceC12785wl.mo59443k4());
            case 5:
                if (abstractC6123caArr.length != 2) {
                    throw new C6208y2("invalid arguments count.");
                }
                InterfaceC12777qq interfaceC12777qqMo59446kk = interfaceC12785wl.mo59446kk(abstractC6123caArr[0].toString(), abstractC6123caArr[1].toString());
                return interfaceC12777qqMo59446kk == null ? m10080h4() : m10084k4(interfaceC12777qqMo59446kk, C14067j2.m66727k4(interfaceC12777qqMo59446kk));
            case 6:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                InterfaceC12777qq interfaceC12777qqMo59447to = interfaceC12785wl.mo59447to((AbstractC5535bv) abstractC6123caArr[0].mo24789D_());
                return interfaceC12777qqMo59447to == null ? m10080h4() : m10084k4(interfaceC12777qqMo59447to, C14067j2.m66727k4(interfaceC12777qqMo59447to));
            case 7:
                if (abstractC6123caArr.length != 2) {
                    throw new C6208y2("invalid arguments count.");
                }
                InterfaceC12777qq interfaceC12777qqMo59449to = interfaceC12785wl.mo59449to(abstractC6123caArr[0].toString(), abstractC6123caArr[1].toString());
                return interfaceC12777qqMo59449to == null ? m10080h4() : m10084k4(interfaceC12777qqMo59449to, C14067j2.m66727k4(interfaceC12777qqMo59449to));
            default:
                throw new C6208y2("unknown function");
        }
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1946kk
    /* JADX INFO: renamed from: x1 */
    public void mo10027x1() {
        m10035kk("getNamedItem");
        m10035kk("setNamedItem");
        m10035kk("removeNamedItem");
        m10035kk("item");
        m10035kk("getNamedItemNS");
        m10035kk("setNamedItemNS");
        m10035kk("removeNamedItemNS");
        m10033k4("length", 1);
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC14068j5 mo10030k4() {
        return f38849k4;
    }
}

package com.aspose.slides.internal.p433u1;

import com.aspose.slides.internal.p055c4.AbstractC1943dy;
import com.aspose.slides.internal.p213jw.AbstractC5535bv;
import com.aspose.slides.internal.p213jw.AbstractC5558v4;
import com.aspose.slides.internal.p213jw.C5538dq;
import com.aspose.slides.internal.p213jw.C5543ix;
import com.aspose.slides.internal.p213jw.C5545k4;
import com.aspose.slides.internal.p253lm.AbstractC6123ca;
import com.aspose.slides.internal.p253lm.C6208y2;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p517y2.InterfaceC12769ix;
import com.aspose.slides.internal.p517y2.InterfaceC12772kk;
import com.aspose.slides.p559ms.System.AbstractC14068j5;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.u1.ks */
/* JADX INFO: loaded from: classes4.dex */
public class C11262ks extends AbstractC1943dy {

    /* JADX INFO: renamed from: k4 */
    private static final AbstractC14068j5 f38829k4 = C7019kk.m27443k4((Class<?>) C5543ix.class);

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f38830x1 = new C7017h4("get_tagName", "getAttribute", "setAttribute", "removeAttribute", "getAttributeNode", "setAttributeNode", "removeAttributeNode", "getElementsByTagName", "getAttributeNS", "setAttributeNS", "removeAttributeNS", "getAttributeNodeNS", "setAttributeNodeNS", "getElementsByTagNameNS", "hasAttribute", "hasAttributeNS", "get_schemaTypeInfo", "setIdAttribute", "setIdAttributeNS", "setIdAttributeNode", "get_firstElementChild", "get_lastElementChild", "get_previousElementSibling", "get_nextElementSibling", "get_childElementCount");

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC6123ca mo10029k4(String str, AbstractC6123ca abstractC6123ca, AbstractC6123ca[] abstractC6123caArr) {
        C5543ix c5543ix = (C5543ix) abstractC6123ca.mo24769C_();
        switch (f38830x1.m27428k4(str)) {
            case 0:
                return m10085k4(c5543ix.mo22700du());
            case 1:
                if (abstractC6123caArr.length == 1) {
                    return m10085k4(c5543ix.mo22721to(abstractC6123caArr[0].toString()));
                }
                throw new C6208y2("invalid arguments count.");
            case 2:
                if (abstractC6123caArr.length != 2) {
                    throw new C6208y2("invalid arguments count.");
                }
                c5543ix.mo22708k4(abstractC6123caArr[0].toString(), abstractC6123caArr[1].toString());
                break;
                break;
            case 3:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                c5543ix.m22701du(abstractC6123caArr[0].toString());
                break;
                break;
            case 4:
                if (abstractC6123caArr.length == 1) {
                    return m10084k4(c5543ix.m22703h4(abstractC6123caArr[0].toString()), C7019kk.m27443k4((Class<?>) C5545k4.class));
                }
                throw new C6208y2("invalid arguments count.");
            case 5:
                if (abstractC6123caArr.length == 1) {
                    return m10084k4(c5543ix.m22706k4((InterfaceC12772kk) abstractC6123caArr[0].mo24789D_()), C7019kk.m27443k4((Class<?>) C5545k4.class));
                }
                throw new C6208y2("invalid arguments count.");
            case 6:
                if (abstractC6123caArr.length == 1) {
                    return m10084k4(c5543ix.m22723x1((InterfaceC12772kk) abstractC6123caArr[0].mo24789D_()), C7019kk.m27443k4((Class<?>) C5545k4.class));
                }
                throw new C6208y2("invalid arguments count.");
            case 7:
                if (abstractC6123caArr.length == 1) {
                    return m10084k4(c5543ix.m22716m9(abstractC6123caArr[0].toString()), C7019kk.m27443k4((Class<?>) AbstractC5558v4.class));
                }
                throw new C6208y2("invalid arguments count.");
            case 8:
                if (abstractC6123caArr.length == 2) {
                    return m10085k4(c5543ix.mo22724x1(abstractC6123caArr[0].toString(), abstractC6123caArr[1].toString()));
                }
                throw new C6208y2("invalid arguments count.");
            case 9:
                if (abstractC6123caArr.length != 3) {
                    throw new C6208y2("invalid arguments count.");
                }
                c5543ix.m22709k4(abstractC6123caArr[0].toString(), abstractC6123caArr[1].toString(), abstractC6123caArr[2].toString());
                break;
                break;
            case 10:
                if (abstractC6123caArr.length != 2) {
                    throw new C6208y2("invalid arguments count.");
                }
                c5543ix.m22714kk(abstractC6123caArr[0].toString(), abstractC6123caArr[1].toString());
                break;
                break;
            case 11:
                if (abstractC6123caArr.length == 2) {
                    return m10084k4(c5543ix.m22720to(abstractC6123caArr[0].toString(), abstractC6123caArr[1].toString()), C7019kk.m27443k4((Class<?>) C5545k4.class));
                }
                throw new C6208y2("invalid arguments count.");
            case 12:
                if (abstractC6123caArr.length == 1) {
                    return m10084k4(c5543ix.m22713kk((InterfaceC12772kk) abstractC6123caArr[0].mo24789D_()), C7019kk.m27443k4((Class<?>) C5545k4.class));
                }
                throw new C6208y2("invalid arguments count.");
            case 13:
                if (abstractC6123caArr.length != 2) {
                    throw new C6208y2("invalid arguments count.");
                }
                if (abstractC6123caArr.length == 2) {
                    return m10084k4(c5543ix.m22699du(abstractC6123caArr[0].toString(), abstractC6123caArr[1].toString()), C7019kk.m27443k4((Class<?>) AbstractC5558v4.class));
                }
                throw new C6208y2("invalid arguments count.");
            case 14:
                if (abstractC6123caArr.length == 1) {
                    return m10086k4(c5543ix.mo22698c5(abstractC6123caArr[0].toString()));
                }
                throw new C6208y2("invalid arguments count.");
            case 15:
                if (abstractC6123caArr.length == 2) {
                    return m10086k4(c5543ix.mo22705h4(abstractC6123caArr[0].toString(), abstractC6123caArr[1].toString()));
                }
                throw new C6208y2("invalid arguments count.");
            case 16:
                return m10084k4(c5543ix.m22715ks(), C7019kk.m27443k4((Class<?>) C5538dq.class));
            case 17:
                if (abstractC6123caArr.length != 2) {
                    throw new C6208y2("invalid arguments count.");
                }
                c5543ix.m22711k4(abstractC6123caArr[0].toString(), abstractC6123caArr[1].mo24772k4());
                break;
                break;
            case 18:
                if (abstractC6123caArr.length != 3) {
                    throw new C6208y2("invalid arguments count.");
                }
                c5543ix.m22710k4(abstractC6123caArr[0].toString(), abstractC6123caArr[1].toString(), abstractC6123caArr[2].mo24772k4());
                break;
                break;
            case 19:
                if (abstractC6123caArr.length != 2) {
                    throw new C6208y2("invalid arguments count.");
                }
                c5543ix.m22707k4((C5545k4) abstractC6123caArr[0].mo24789D_(), abstractC6123caArr[1].mo24772k4());
                break;
                break;
            case 20:
                InterfaceC12769ix interfaceC12769ixM22725x6 = c5543ix.m22725x6();
                return interfaceC12769ixM22725x6 == null ? m10080h4() : m10084k4(interfaceC12769ixM22725x6, C14067j2.m66727k4(interfaceC12769ixM22725x6));
            case 21:
                InterfaceC12769ix interfaceC12769ixM22717ne = c5543ix.m22717ne();
                return interfaceC12769ixM22717ne == null ? m10080h4() : m10084k4(interfaceC12769ixM22717ne, C14067j2.m66727k4(interfaceC12769ixM22717ne));
            case 22:
                InterfaceC12769ix interfaceC12769ixMo22194ix = c5543ix.mo22194ix();
                return interfaceC12769ixMo22194ix == null ? m10080h4() : m10084k4(interfaceC12769ixMo22194ix, C14067j2.m66727k4(interfaceC12769ixMo22194ix));
            case 23:
                InterfaceC12769ix interfaceC12769ixMo22195u4 = c5543ix.mo22195u4();
                return interfaceC12769ixMo22195u4 == null ? m10080h4() : m10084k4(interfaceC12769ixMo22195u4, C14067j2.m66727k4(interfaceC12769ixMo22195u4));
            case 24:
                return m10082k4(c5543ix.m22722uz());
            default:
                throw new C6208y2("unknown function");
        }
        return m10080h4();
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: kk */
    public AbstractC14068j5 mo10034kk() {
        return C7019kk.m27443k4((Class<?>) AbstractC5535bv.class);
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1946kk
    /* JADX INFO: renamed from: x1 */
    public void mo10027x1() {
        m10035kk("getAttribute");
        m10035kk("setAttribute");
        m10035kk("removeAttribute");
        m10035kk("getAttributeNode");
        m10035kk("setAttributeNode");
        m10035kk("removeAttributeNode");
        m10035kk("getElementsByTagName");
        m10035kk("getAttributeNS");
        m10035kk("setAttributeNS");
        m10035kk("removeAttributeNS");
        m10035kk("getAttributeNodeNS");
        m10035kk("setAttributeNodeNS");
        m10035kk("getElementsByTagNameNS");
        m10035kk("hasAttribute");
        m10035kk("hasAttributeNS");
        m10035kk("setIdAttribute");
        m10035kk("setIdAttributeNS");
        m10035kk("setIdAttributeNode");
        m10033k4("tagName", 1);
        m10033k4("schemaTypeInfo", 1);
        m10033k4("firstElementChild", 1);
        m10033k4("lastElementChild", 1);
        m10033k4("previousElementSibling", 1);
        m10033k4("nextElementSibling", 1);
        m10033k4("childElementCount", 1);
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC14068j5 mo10030k4() {
        return f38829k4;
    }
}

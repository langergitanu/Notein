package com.aspose.slides.internal.p433u1;

import com.aspose.slides.internal.p055c4.AbstractC1943dy;
import com.aspose.slides.internal.p213jw.AbstractC5535bv;
import com.aspose.slides.internal.p213jw.AbstractC5558v4;
import com.aspose.slides.internal.p213jw.C5532ak;
import com.aspose.slides.internal.p213jw.C5533ar;
import com.aspose.slides.internal.p213jw.C5534b3;
import com.aspose.slides.internal.p213jw.C5544jd;
import com.aspose.slides.internal.p213jw.C5545k4;
import com.aspose.slides.internal.p213jw.C5550ne;
import com.aspose.slides.internal.p213jw.C5551qq;
import com.aspose.slides.internal.p213jw.C5552rv;
import com.aspose.slides.internal.p213jw.C5553to;
import com.aspose.slides.internal.p213jw.C5562x6;
import com.aspose.slides.internal.p253lm.AbstractC6123ca;
import com.aspose.slides.internal.p253lm.C6208y2;
import com.aspose.slides.internal.p253lm.InterfaceC6183tq;
import com.aspose.slides.internal.p304nv.C6951k4;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p487wz.C12328k4;
import com.aspose.slides.internal.p517y2.C12771k4;
import com.aspose.slides.internal.p517y2.InterfaceC12769ix;
import com.aspose.slides.internal.p517y2.InterfaceC12772kk;
import com.aspose.slides.internal.p517y2.InterfaceC12777qq;
import com.aspose.slides.p559ms.System.AbstractC14068j5;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.u1.fa */
/* JADX INFO: loaded from: classes4.dex */
public class C11256fa extends AbstractC1943dy {

    /* JADX INFO: renamed from: k4 */
    private static final AbstractC14068j5 f38818k4 = C7019kk.m27443k4((Class<?>) C5552rv.class);

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f38819x1 = new C7017h4("get_domConfig", "normalizeDocument", "renameNode", "get_doctype", "get_implementation", "get_documentElement", "createElement", "createDocumentFragment", "createTextNode", "createComment", "createCDATASection", "createProcessingInstruction", "createAttribute", "createEntityReference", "getElementsByTagName", "importNode", "createElementNS", "createAttributeNS", "getElementsByTagNameNS", "getElementById", "get_inputEncoding", "get_xmlEncoding", "get_xmlStandalone", "set_xmlStandalone", "get_xmlVersion", "set_xmlVersion", "get_strictErrorChecking", "set_strictErrorChecking", "get_documentURI", "set_documentURI", "adoptNode", "createEvent", "write", "writeln");

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC6123ca mo10029k4(String str, AbstractC6123ca abstractC6123ca, AbstractC6123ca[] abstractC6123caArr) {
        C5552rv c5552rv = (C5552rv) abstractC6123ca.mo24769C_();
        int i = 0;
        switch (f38819x1.m27428k4(str)) {
            case 0:
                return m10084k4(c5552rv.mo22801qq(), C7019kk.m27443k4((Class<?>) C12771k4.class));
            case 1:
                c5552rv.mo22625c6();
                break;
            case 2:
                if (abstractC6123caArr.length != 3) {
                    throw new C6208y2("invalid arguments count.");
                }
                InterfaceC12777qq interfaceC12777qqM22790k4 = c5552rv.m22790k4((AbstractC5535bv) abstractC6123caArr[0].mo24789D_(), abstractC6123caArr[1].toString(), abstractC6123caArr[2].toString());
                return m10084k4(interfaceC12777qqM22790k4, C14067j2.m66727k4(interfaceC12777qqM22790k4));
            case 3:
                return m10084k4(c5552rv.mo22776du(), C7019kk.m27443k4((Class<?>) C5550ne.class));
            case 4:
                return m10084k4(c5552rv.mo22779h4(), C7019kk.m27443k4((Class<?>) C5544jd.class));
            case 5:
                InterfaceC12769ix interfaceC12769ixMo22815yj = c5552rv.mo22815yj();
                return interfaceC12769ixMo22815yj == null ? m10080h4() : m10084k4(interfaceC12769ixMo22815yj, C14067j2.m66727k4(interfaceC12769ixMo22815yj));
            case 6:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                InterfaceC12769ix interfaceC12769ixMo22775du = c5552rv.mo22775du(abstractC6123caArr[0].toString());
                return m10084k4(interfaceC12769ixMo22775du, C14067j2.m66727k4(interfaceC12769ixMo22775du));
            case 7:
                return m10084k4(c5552rv.m22798ks(), C7019kk.m27443k4((Class<?>) C5562x6.class));
            case 8:
                if (abstractC6123caArr.length == 1) {
                    return m10084k4(c5552rv.mo22780h4(abstractC6123caArr[0].toString()), C7019kk.m27443k4((Class<?>) C5532ak.class));
                }
                throw new C6208y2("invalid arguments count.");
            case 9:
                if (abstractC6123caArr.length == 1) {
                    return m10084k4(c5552rv.mo22799m9(abstractC6123caArr[0].toString()), C7019kk.m27443k4((Class<?>) C5533ar.class));
                }
                throw new C6208y2("invalid arguments count.");
            case 10:
                if (abstractC6123caArr.length == 1) {
                    return m10084k4(c5552rv.m22777dy(abstractC6123caArr[0].toString()), C7019kk.m27443k4((Class<?>) C5553to.class));
                }
                throw new C6208y2("invalid arguments count.");
            case 11:
                if (abstractC6123caArr.length == 2) {
                    return m10084k4(c5552rv.m22786k4(abstractC6123caArr[0].toString(), abstractC6123caArr[1].toString()), C7019kk.m27443k4((Class<?>) C5534b3.class));
                }
                throw new C6208y2("invalid arguments count.");
            case 12:
                if (abstractC6123caArr.length == 1) {
                    return m10084k4(c5552rv.mo22772c5(abstractC6123caArr[0].toString()), C7019kk.m27443k4((Class<?>) C5545k4.class));
                }
                throw new C6208y2("invalid arguments count.");
            case 13:
                if (abstractC6123caArr.length == 1) {
                    return m10084k4(c5552rv.m22782jd(abstractC6123caArr[0].toString()), C7019kk.m27443k4((Class<?>) C5551qq.class));
                }
                throw new C6208y2("invalid arguments count.");
            case 14:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                AbstractC6123ca abstractC6123caM10084k4 = m10084k4(c5552rv.mo22773ck(abstractC6123caArr[0].toString()), C7019kk.m27443k4((Class<?>) AbstractC5558v4.class));
                abstractC6123caM10084k4.m24792k4((InterfaceC6183tq) C7019kk.m27452k4((Object) m10081k4(C7019kk.m27443k4((Class<?>) C12328k4.class)), InterfaceC6183tq.class));
                return abstractC6123caM10084k4;
            case 15:
                if (abstractC6123caArr.length != 2) {
                    throw new C6208y2("invalid arguments count.");
                }
                InterfaceC12777qq interfaceC12777qqM22791k4 = c5552rv.m22791k4((AbstractC5535bv) abstractC6123caArr[0].mo24789D_(), abstractC6123caArr[1].mo24772k4());
                return interfaceC12777qqM22791k4 == null ? m10080h4() : m10084k4(interfaceC12777qqM22791k4, C14067j2.m66727k4(interfaceC12777qqM22791k4));
            case 16:
                if (abstractC6123caArr.length != 2) {
                    throw new C6208y2("invalid arguments count.");
                }
                InterfaceC12769ix interfaceC12769ixMo22795kk = c5552rv.mo22795kk(abstractC6123caArr[0].toString(), abstractC6123caArr[1].toString());
                return m10084k4(interfaceC12769ixMo22795kk, C14067j2.m66727k4(interfaceC12769ixMo22795kk));
            case 17:
                if (abstractC6123caArr.length != 2) {
                    throw new C6208y2("invalid arguments count.");
                }
                InterfaceC12772kk interfaceC12772kkM22804to = c5552rv.m22804to(abstractC6123caArr[0].toString(), abstractC6123caArr[1].toString());
                return m10084k4(interfaceC12772kkM22804to, C14067j2.m66727k4(interfaceC12772kkM22804to));
            case 18:
                if (abstractC6123caArr.length != 2) {
                    throw new C6208y2("invalid arguments count.");
                }
                AbstractC6123ca abstractC6123caM10084k42 = m10084k4(c5552rv.m22774du(abstractC6123caArr[0].toString(), abstractC6123caArr[1].toString()), C7019kk.m27443k4((Class<?>) AbstractC5558v4.class));
                abstractC6123caM10084k42.m24792k4((InterfaceC6183tq) C7019kk.m27452k4((Object) m10081k4(C7019kk.m27443k4((Class<?>) C12328k4.class)), InterfaceC6183tq.class));
                return abstractC6123caM10084k42;
            case 19:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                InterfaceC12769ix interfaceC12769ixM22778fa = c5552rv.m22778fa(abstractC6123caArr[0].toString());
                return interfaceC12769ixM22778fa == null ? m10080h4() : m10084k4(interfaceC12769ixM22778fa, C14067j2.m66727k4(interfaceC12769ixM22778fa));
            case 20:
                return m10085k4(c5552rv.m22814x6());
            case 21:
                return m10085k4(c5552rv.m22800ne());
            case 22:
                return m10086k4(c5552rv.m22781ix());
            case 23:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                c5552rv.m22792k4(abstractC6123caArr[0].mo24772k4());
                break;
                break;
            case 24:
                return m10085k4(c5552rv.m22806u4());
            case 25:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                c5552rv.m22807up(abstractC6123caArr[0].toString());
                break;
                break;
            case 26:
                return m10086k4(c5552rv.m22808uz());
            case 27:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                c5552rv.m22797kk(abstractC6123caArr[0].mo24772k4());
                break;
                break;
            case 28:
                return m10085k4(c5552rv.m22809wl());
            case 29:
                break;
            case 30:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                InterfaceC12777qq interfaceC12777qqM22789k4 = c5552rv.m22789k4((InterfaceC12777qq) abstractC6123caArr[0].mo24789D_());
                return interfaceC12777qqM22789k4 == null ? m10080h4() : m10084k4(interfaceC12777qqM22789k4, C14067j2.m66727k4(interfaceC12777qqM22789k4));
            case 31:
                if (abstractC6123caArr.length == 1) {
                    return m10084k4(new C6951k4(), C7019kk.m27443k4((Class<?>) C6951k4.class));
                }
                throw new C6208y2("invalid arguments count.");
            case 32:
                String[] strArr = new String[abstractC6123caArr.length];
                if (abstractC6123caArr.length != 0) {
                    while (i < abstractC6123caArr.length) {
                        strArr[i] = abstractC6123caArr[i].toString();
                        i++;
                    }
                }
                c5552rv.m22793k4(strArr);
                break;
            case 33:
                String[] strArr2 = new String[abstractC6123caArr.length];
                if (abstractC6123caArr.length != 0) {
                    while (i < abstractC6123caArr.length) {
                        strArr2[i] = abstractC6123caArr[i].toString();
                        i++;
                    }
                }
                c5552rv.m22813x1(strArr2);
                break;
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
        m10035kk("normalizeDocument");
        m10035kk("renameNode");
        m10035kk("createElement");
        m10035kk("createDocumentFragment");
        m10035kk("createTextNode");
        m10035kk("createComment");
        m10035kk("createCDATASection");
        m10035kk("createProcessingInstruction");
        m10035kk("createAttribute");
        m10035kk("createEntityReference");
        m10035kk("getElementsByTagName");
        m10035kk("importNode");
        m10035kk("createElementNS");
        m10035kk("createAttributeNS");
        m10035kk("getElementsByTagNameNS");
        m10035kk("getElementById");
        m10035kk("adoptNode");
        m10035kk("createEvent");
        m10035kk("write");
        m10035kk("writeln");
        m10033k4("doctype", 1);
        m10033k4("implementation", 1);
        m10033k4("documentElement", 1);
        m10033k4("inputEncoding", 1);
        m10033k4("xmlEncoding", 1);
        m10033k4("xmlStandalone", 3);
        m10033k4("xmlVersion", 3);
        m10033k4("strictErrorChecking", 3);
        m10033k4("documentURI", 3);
        m10033k4("domConfig", 1);
        m10033k4("defaultView", 1);
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC14068j5 mo10030k4() {
        return f38818k4;
    }
}

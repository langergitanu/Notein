package com.aspose.slides.internal.p529yn;

import com.aspose.slides.internal.p055c4.AbstractC1943dy;
import com.aspose.slides.internal.p231kk.AbstractC5788h4;
import com.aspose.slides.internal.p231kk.InterfaceC5797ne;
import com.aspose.slides.internal.p231kk.InterfaceC5810wl;
import com.aspose.slides.internal.p253lm.AbstractC6123ca;
import com.aspose.slides.internal.p253lm.C6208y2;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14068j5;

/* JADX INFO: renamed from: com.aspose.slides.internal.yn.jd */
/* JADX INFO: loaded from: classes5.dex */
public class C12867jd extends AbstractC1943dy {

    /* JADX INFO: renamed from: k4 */
    private static final AbstractC14068j5 f43356k4 = C7019kk.m27443k4((Class<?>) InterfaceC5810wl.class);

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f43357x1 = new C7017h4("get_cssText", "set_cssText", "getPropertyValue", "getPropertyCSSValue", "removeProperty", "getPropertyPriority", "setProperty", "get_length", "item", "get_parentRule");

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC6123ca mo10029k4(String str, AbstractC6123ca abstractC6123ca, AbstractC6123ca[] abstractC6123caArr) {
        InterfaceC5810wl interfaceC5810wl = (InterfaceC5810wl) abstractC6123ca.mo24769C_();
        switch (f43357x1.m27428k4(str)) {
            case 0:
                return m10085k4(interfaceC5810wl.mo23670tw());
            case 1:
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5810wl.mo23676zd(abstractC6123caArr[0].toString());
                break;
                break;
            case 2:
                if (abstractC6123caArr.length == 1) {
                    return m10085k4(interfaceC5810wl.mo23666k1(abstractC6123caArr[0].toString()));
                }
                throw new C6208y2("invalid arguments count.");
            case 3:
                if (abstractC6123caArr.length == 1) {
                    return m10084k4(interfaceC5810wl.mo23672wt(abstractC6123caArr[0].toString()), C7019kk.m27443k4((Class<?>) AbstractC5788h4.class));
                }
                throw new C6208y2("invalid arguments count.");
            case 4:
                if (abstractC6123caArr.length == 1) {
                    return m10085k4(interfaceC5810wl.mo23671tw(abstractC6123caArr[0].toString()));
                }
                throw new C6208y2("invalid arguments count.");
            case 5:
                if (abstractC6123caArr.length == 1) {
                    return m10085k4(interfaceC5810wl.mo23675y6(abstractC6123caArr[0].toString()));
                }
                throw new C6208y2("invalid arguments count.");
            case 6:
                if (abstractC6123caArr.length != 3) {
                    throw new C6208y2("invalid arguments count.");
                }
                interfaceC5810wl.mo23669k4(abstractC6123caArr[0].toString(), abstractC6123caArr[1].toString(), abstractC6123caArr[2].toString());
                break;
                break;
            case 7:
                return m10082k4(interfaceC5810wl.mo23674y6());
            case 8:
                if (abstractC6123caArr.length == 1) {
                    return m10085k4(interfaceC5810wl.mo23668k4(abstractC6123caArr[0].m24794wy()));
                }
                throw new C6208y2("invalid arguments count.");
            case 9:
                return m10084k4(interfaceC5810wl.mo23664jm(), C7019kk.m27443k4((Class<?>) InterfaceC5797ne.class));
            default:
                throw new C6208y2("unknown function");
        }
        return m10080h4();
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1946kk
    /* JADX INFO: renamed from: x1 */
    public void mo10027x1() {
        m10035kk("getPropertyValue");
        m10035kk("getPropertyCSSValue");
        m10035kk("removeProperty");
        m10035kk("getPropertyPriority");
        m10035kk("setProperty");
        m10035kk("item");
        m10033k4("cssText", 3);
        m10033k4("length", 1);
        m10033k4("parentRule", 1);
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC14068j5 mo10030k4() {
        return f43356k4;
    }
}

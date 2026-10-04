package com.aspose.slides.internal.p529yn;

import com.aspose.slides.internal.p055c4.AbstractC1943dy;
import com.aspose.slides.internal.p231kk.AbstractC5788h4;
import com.aspose.slides.internal.p231kk.AbstractC5803to;
import com.aspose.slides.internal.p231kk.C5779c5;
import com.aspose.slides.internal.p231kk.C5802sv;
import com.aspose.slides.internal.p231kk.InterfaceC5782dq;
import com.aspose.slides.internal.p253lm.AbstractC6123ca;
import com.aspose.slides.internal.p253lm.C6208y2;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14068j5;
import com.aspose.slides.p559ms.System.C14080ne;

/* JADX INFO: renamed from: com.aspose.slides.internal.yn.m9 */
/* JADX INFO: loaded from: classes5.dex */
public class C12871m9 extends AbstractC1943dy {

    /* JADX INFO: renamed from: k4 */
    private static final AbstractC14068j5 f43365k4 = C7019kk.m27443k4((Class<?>) AbstractC5803to.class);

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f43366x1 = new C7017h4("get_primitiveType", "setFloatValue", "getFloatValue", "setStringValue", "getStringValue", "getCounterValue", "getRectValue", "getRGBColorValue");

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC6123ca mo10029k4(String str, AbstractC6123ca abstractC6123ca, AbstractC6123ca[] abstractC6123caArr) {
        AbstractC5803to abstractC5803to = (AbstractC5803to) abstractC6123ca.mo24769C_();
        switch (f43366x1.m27428k4(str)) {
            case 0:
                return m10082k4(abstractC5803to.m23700k4());
            case 1:
                if (abstractC6123caArr.length != 2) {
                    throw new C6208y2("invalid arguments count.");
                }
                abstractC5803to.mo23701k4(C14080ne.m66874du(Integer.valueOf(abstractC6123caArr[0].m24794wy())), (float) abstractC6123caArr[1].mo24775x1());
                break;
                break;
            case 2:
                if (abstractC6123caArr.length == 1) {
                    return m10082k4(abstractC5803to.mo23699k4(C14080ne.m66874du(Integer.valueOf(abstractC6123caArr[0].m24794wy()))));
                }
                throw new C6208y2("invalid arguments count.");
            case 3:
                if (abstractC6123caArr.length != 2) {
                    throw new C6208y2("invalid arguments count.");
                }
                abstractC5803to.mo23702k4(C14080ne.m66874du(Integer.valueOf(abstractC6123caArr[0].m24794wy())), abstractC6123caArr[1].toString());
                break;
                break;
            case 4:
                return m10085k4(abstractC5803to.mo23706x1());
            case 5:
                return m10084k4(abstractC5803to.mo23703kk(), C7019kk.m27443k4((Class<?>) C5779c5.class));
            case 6:
                return m10084k4(abstractC5803to.mo23704to(), C7019kk.m27443k4((Class<?>) C5802sv.class));
            case 7:
                return m10084k4(abstractC5803to.mo23698du(), C7019kk.m27443k4((Class<?>) InterfaceC5782dq.class));
            default:
                throw new C6208y2("unknown function");
        }
        return m10080h4();
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: kk */
    public AbstractC14068j5 mo10034kk() {
        return C7019kk.m27443k4((Class<?>) AbstractC5788h4.class);
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1946kk
    /* JADX INFO: renamed from: x1 */
    public void mo10027x1() {
        m10035kk("setFloatValue");
        m10035kk("getFloatValue");
        m10035kk("setStringValue");
        m10035kk("getStringValue");
        m10035kk("getCounterValue");
        m10035kk("getRectValue");
        m10035kk("getRGBColorValue");
        m10033k4("primitiveType", 1);
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC14068j5 mo10030k4() {
        return f43365k4;
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public void mo10031k4(AbstractC6123ca abstractC6123ca) {
        m10032k4(abstractC6123ca, "CSS_UNKNOWN", m10082k4(0.0d));
        m10032k4(abstractC6123ca, "CSS_NUMBER", m10082k4(1.0d));
        m10032k4(abstractC6123ca, "CSS_PERCENTAGE", m10082k4(2.0d));
        m10032k4(abstractC6123ca, "CSS_EMS", m10082k4(3.0d));
        m10032k4(abstractC6123ca, "CSS_EXS", m10082k4(4.0d));
        m10032k4(abstractC6123ca, "CSS_PX", m10082k4(5.0d));
        m10032k4(abstractC6123ca, "CSS_CM", m10082k4(6.0d));
        m10032k4(abstractC6123ca, "CSS_MM", m10082k4(7.0d));
        m10032k4(abstractC6123ca, "CSS_IN", m10082k4(8.0d));
        m10032k4(abstractC6123ca, "CSS_PT", m10082k4(9.0d));
        m10032k4(abstractC6123ca, "CSS_PC", m10082k4(10.0d));
        m10032k4(abstractC6123ca, "CSS_DEG", m10082k4(11.0d));
        m10032k4(abstractC6123ca, "CSS_RAD", m10082k4(12.0d));
        m10032k4(abstractC6123ca, "CSS_GRAD", m10082k4(13.0d));
        m10032k4(abstractC6123ca, "CSS_MS", m10082k4(14.0d));
        m10032k4(abstractC6123ca, "CSS_S", m10082k4(15.0d));
        m10032k4(abstractC6123ca, "CSS_HZ", m10082k4(16.0d));
        m10032k4(abstractC6123ca, "CSS_KHZ", m10082k4(17.0d));
        m10032k4(abstractC6123ca, "CSS_DIMENSION", m10082k4(18.0d));
        m10032k4(abstractC6123ca, "CSS_STRING", m10082k4(19.0d));
        m10032k4(abstractC6123ca, "CSS_URI", m10082k4(20.0d));
        m10032k4(abstractC6123ca, "CSS_IDENT", m10082k4(21.0d));
        m10032k4(abstractC6123ca, "CSS_ATTR", m10082k4(22.0d));
        m10032k4(abstractC6123ca, "CSS_COUNTER", m10082k4(23.0d));
        m10032k4(abstractC6123ca, "CSS_RECT", m10082k4(24.0d));
        m10032k4(abstractC6123ca, "CSS_RGBCOLOR", m10082k4(25.0d));
        super.mo10031k4(abstractC6123ca);
    }
}

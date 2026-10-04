package com.aspose.slides.internal.p529yn;

import com.aspose.slides.internal.p055c4.AbstractC1943dy;
import com.aspose.slides.internal.p231kk.AbstractC5788h4;
import com.aspose.slides.internal.p253lm.AbstractC6123ca;
import com.aspose.slides.internal.p253lm.C6208y2;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14068j5;

/* JADX INFO: renamed from: com.aspose.slides.internal.yn.ks */
/* JADX INFO: loaded from: classes5.dex */
public class C12870ks extends AbstractC1943dy {

    /* JADX INFO: renamed from: k4 */
    private static final AbstractC14068j5 f43363k4 = C7019kk.m27443k4((Class<?>) AbstractC5788h4.class);

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f43364x1 = new C7017h4("get_cssText", "set_cssText", "get_cssValueType");

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC6123ca mo10029k4(String str, AbstractC6123ca abstractC6123ca, AbstractC6123ca[] abstractC6123caArr) {
        AbstractC5788h4 abstractC5788h4 = (AbstractC5788h4) abstractC6123ca.mo24769C_();
        int iM27428k4 = f43364x1.m27428k4(str);
        if (iM27428k4 == 0) {
            return m10085k4(abstractC5788h4.mo23414h4());
        }
        if (iM27428k4 != 1) {
            if (iM27428k4 == 2) {
                return m10082k4(abstractC5788h4.m23417m9());
            }
            throw new C6208y2("unknown function");
        }
        if (abstractC6123caArr.length != 1) {
            throw new C6208y2("invalid arguments count.");
        }
        abstractC5788h4.mo23415k4(abstractC6123caArr[0].toString());
        return m10080h4();
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1946kk
    /* JADX INFO: renamed from: x1 */
    public void mo10027x1() {
        m10033k4("cssText", 3);
        m10033k4("cssValueType", 1);
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC14068j5 mo10030k4() {
        return f43363k4;
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public void mo10031k4(AbstractC6123ca abstractC6123ca) {
        m10032k4(abstractC6123ca, "CSS_INHERIT", m10082k4(0.0d));
        m10032k4(abstractC6123ca, "CSS_PRIMITIVE_VALUE", m10082k4(1.0d));
        m10032k4(abstractC6123ca, "CSS_VALUE_LIST", m10082k4(2.0d));
        m10032k4(abstractC6123ca, "CSS_CUSTOM", m10082k4(3.0d));
        super.mo10031k4(abstractC6123ca);
    }
}

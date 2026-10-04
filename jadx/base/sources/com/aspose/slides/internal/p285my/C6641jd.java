package com.aspose.slides.internal.p285my;

import com.aspose.slides.internal.p055c4.AbstractC1943dy;
import com.aspose.slides.internal.p182ii.AbstractC4908jd;
import com.aspose.slides.internal.p213jw.AbstractC5535bv;
import com.aspose.slides.internal.p213jw.AbstractC5558v4;
import com.aspose.slides.internal.p253lm.AbstractC6123ca;
import com.aspose.slides.internal.p253lm.C6208y2;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p517y2.InterfaceC12777qq;
import com.aspose.slides.p559ms.System.AbstractC14068j5;

/* JADX INFO: renamed from: com.aspose.slides.internal.my.jd */
/* JADX INFO: loaded from: classes4.dex */
public class C6641jd extends AbstractC1943dy {

    /* JADX INFO: renamed from: k4 */
    private static final AbstractC14068j5 f18397k4 = C7019kk.m27443k4((Class<?>) AbstractC4908jd.class);

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f18398x1 = new C7017h4("namedItem", "get_item");

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC6123ca mo10029k4(String str, AbstractC6123ca abstractC6123ca, AbstractC6123ca[] abstractC6123caArr) {
        InterfaceC12777qq interfaceC12777qqMo20313k4;
        AbstractC4908jd abstractC4908jd = (AbstractC4908jd) abstractC6123ca.mo24769C_();
        int iM27428k4 = f18398x1.m27428k4(str);
        if (iM27428k4 != 0) {
            if (iM27428k4 != 1) {
                throw new C6208y2("unknown function");
            }
            if (abstractC6123caArr.length != 1) {
                throw new C6208y2("invalid arguments count.");
            }
            interfaceC12777qqMo20313k4 = abstractC4908jd.mo20314k4(abstractC6123caArr[0].m24794wy());
        } else {
            if (abstractC6123caArr.length != 1) {
                throw new C6208y2("invalid arguments count.");
            }
            interfaceC12777qqMo20313k4 = abstractC4908jd.mo20313k4(abstractC6123caArr[0].toString());
        }
        return m10084k4(interfaceC12777qqMo20313k4, C7019kk.m27443k4((Class<?>) AbstractC5535bv.class));
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: kk */
    public AbstractC14068j5 mo10034kk() {
        return C7019kk.m27443k4((Class<?>) AbstractC5558v4.class);
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1946kk
    /* JADX INFO: renamed from: x1 */
    public void mo10027x1() {
        m10035kk("namedItem");
        m10033k4("item", 1);
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC14068j5 mo10030k4() {
        return f18397k4;
    }
}

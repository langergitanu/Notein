package com.aspose.slides.internal.p433u1;

import com.aspose.slides.internal.p055c4.AbstractC1943dy;
import com.aspose.slides.internal.p213jw.AbstractC5558v4;
import com.aspose.slides.internal.p253lm.AbstractC6123ca;
import com.aspose.slides.internal.p253lm.C6208y2;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p517y2.InterfaceC12777qq;
import com.aspose.slides.p559ms.System.AbstractC14068j5;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.u1.ar */
/* JADX INFO: loaded from: classes4.dex */
public class C11250ar extends AbstractC1943dy {

    /* JADX INFO: renamed from: k4 */
    private static final AbstractC14068j5 f38806k4 = C7019kk.m27443k4((Class<?>) AbstractC5558v4.class);

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f38807x1 = new C7017h4("item", "get_length");

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC6123ca mo10029k4(String str, AbstractC6123ca abstractC6123ca, AbstractC6123ca[] abstractC6123caArr) {
        AbstractC5558v4 abstractC5558v4 = (AbstractC5558v4) abstractC6123ca.mo24769C_();
        int iM27428k4 = f38807x1.m27428k4(str);
        if (iM27428k4 != 0) {
            if (iM27428k4 == 1) {
                return m10082k4(abstractC5558v4.mo20312k4());
            }
            throw new C6208y2("unknown function");
        }
        if (abstractC6123caArr.length != 1) {
            throw new C6208y2("invalid arguments count.");
        }
        InterfaceC12777qq interfaceC12777qqMo20314k4 = abstractC5558v4.mo20314k4(abstractC6123caArr[0].m24794wy());
        return interfaceC12777qqMo20314k4 == null ? m10080h4() : m10084k4(interfaceC12777qqMo20314k4, C14067j2.m66727k4(interfaceC12777qqMo20314k4));
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1946kk
    /* JADX INFO: renamed from: x1 */
    public void mo10027x1() {
        m10035kk("item");
        m10033k4("length", 1);
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC14068j5 mo10030k4() {
        return f38806k4;
    }
}

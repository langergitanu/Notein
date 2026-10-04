package com.aspose.slides.internal.p529yn;

import com.aspose.slides.internal.p055c4.AbstractC1943dy;
import com.aspose.slides.internal.p231kk.InterfaceC5775ar;
import com.aspose.slides.internal.p231kk.InterfaceC5789ix;
import com.aspose.slides.internal.p231kk.InterfaceC5797ne;
import com.aspose.slides.internal.p253lm.AbstractC6123ca;
import com.aspose.slides.internal.p253lm.C6208y2;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14068j5;

/* JADX INFO: renamed from: com.aspose.slides.internal.yn.fa */
/* JADX INFO: loaded from: classes5.dex */
public class C12864fa extends AbstractC1943dy {

    /* JADX INFO: renamed from: k4 */
    private static final AbstractC14068j5 f43350k4 = C7019kk.m27443k4((Class<?>) InterfaceC5775ar.class);

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f43351x1 = new C7017h4("insertRule", "deleteRule", "get_ownerRule", "get_cssRules");

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC6123ca mo10029k4(String str, AbstractC6123ca abstractC6123ca, AbstractC6123ca[] abstractC6123caArr) {
        InterfaceC5775ar interfaceC5775ar = (InterfaceC5775ar) abstractC6123ca.mo24769C_();
        int iM27428k4 = f43351x1.m27428k4(str);
        if (iM27428k4 == 0) {
            if (abstractC6123caArr.length == 2) {
                return m10082k4(interfaceC5775ar.mo23387k4(abstractC6123caArr[0].toString(), abstractC6123caArr[1].m24794wy()));
            }
            throw new C6208y2("invalid arguments count.");
        }
        if (iM27428k4 == 1) {
            if (abstractC6123caArr.length != 1) {
                throw new C6208y2("invalid arguments count.");
            }
            interfaceC5775ar.mo23389k4(abstractC6123caArr[0].m24794wy());
            return m10080h4();
        }
        if (iM27428k4 == 2) {
            return m10084k4(interfaceC5775ar.mo23388k4(), C7019kk.m27443k4((Class<?>) InterfaceC5797ne.class));
        }
        if (iM27428k4 == 3) {
            return m10084k4(interfaceC5775ar.mo23390x1(), C7019kk.m27443k4((Class<?>) InterfaceC5789ix.class));
        }
        throw new C6208y2("unknown function");
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1946kk
    /* JADX INFO: renamed from: x1 */
    public void mo10027x1() {
        m10035kk("insertRule");
        m10035kk("deleteRule");
        m10033k4("ownerRule", 1);
        m10033k4("cssRules", 1);
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC14068j5 mo10030k4() {
        return f43350k4;
    }
}

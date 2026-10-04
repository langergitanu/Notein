package com.aspose.slides.internal.p529yn;

import com.aspose.slides.internal.p055c4.AbstractC1943dy;
import com.aspose.slides.internal.p231kk.AbstractC5803to;
import com.aspose.slides.internal.p231kk.InterfaceC5782dq;
import com.aspose.slides.internal.p253lm.AbstractC6123ca;
import com.aspose.slides.internal.p253lm.C6208y2;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14068j5;

/* JADX INFO: renamed from: com.aspose.slides.internal.yn.wl */
/* JADX INFO: loaded from: classes5.dex */
public class C12879wl extends AbstractC1943dy {

    /* JADX INFO: renamed from: k4 */
    private static final AbstractC14068j5 f43381k4 = C7019kk.m27443k4((Class<?>) InterfaceC5782dq.class);

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f43382x1 = new C7017h4("get_red", "get_green", "get_blue");

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC6123ca mo10029k4(String str, AbstractC6123ca abstractC6123ca, AbstractC6123ca[] abstractC6123caArr) {
        AbstractC5803to abstractC5803toM23398k4;
        InterfaceC5782dq interfaceC5782dq = (InterfaceC5782dq) abstractC6123ca.mo24769C_();
        int iM27428k4 = f43382x1.m27428k4(str);
        if (iM27428k4 == 0) {
            abstractC5803toM23398k4 = interfaceC5782dq.m23398k4();
        } else if (iM27428k4 == 1) {
            abstractC5803toM23398k4 = interfaceC5782dq.m23400x1();
        } else {
            if (iM27428k4 != 2) {
                throw new C6208y2("unknown function");
            }
            abstractC5803toM23398k4 = interfaceC5782dq.m23399kk();
        }
        return m10084k4(abstractC5803toM23398k4, C7019kk.m27443k4((Class<?>) AbstractC5803to.class));
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1946kk
    /* JADX INFO: renamed from: x1 */
    public void mo10027x1() {
        m10033k4("red", 1);
        m10033k4("green", 1);
        m10033k4("blue", 1);
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC14068j5 mo10030k4() {
        return f43381k4;
    }
}

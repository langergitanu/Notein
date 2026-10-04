package com.aspose.slides.internal.p529yn;

import com.aspose.slides.internal.p055c4.AbstractC1943dy;
import com.aspose.slides.internal.p213jw.C5544jd;
import com.aspose.slides.internal.p231kk.InterfaceC5775ar;
import com.aspose.slides.internal.p231kk.InterfaceC5795lr;
import com.aspose.slides.internal.p253lm.AbstractC6123ca;
import com.aspose.slides.internal.p253lm.C6208y2;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14068j5;

/* JADX INFO: renamed from: com.aspose.slides.internal.yn.ne */
/* JADX INFO: loaded from: classes5.dex */
public class C12872ne extends AbstractC1943dy {

    /* JADX INFO: renamed from: k4 */
    private static final AbstractC14068j5 f43367k4 = C7019kk.m27443k4((Class<?>) InterfaceC5795lr.class);

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f43368x1 = new C7017h4("createCSSStyleSheet");

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC6123ca mo10029k4(String str, AbstractC6123ca abstractC6123ca, AbstractC6123ca[] abstractC6123caArr) {
        InterfaceC5795lr interfaceC5795lr = (InterfaceC5795lr) abstractC6123ca.mo24769C_();
        if (f43368x1.m27428k4(str) != 0) {
            throw new C6208y2("unknown function");
        }
        if (abstractC6123caArr.length == 2) {
            return m10084k4(interfaceC5795lr.mo22727k4(abstractC6123caArr[0].toString(), abstractC6123caArr[1].toString()), C7019kk.m27443k4((Class<?>) InterfaceC5775ar.class));
        }
        throw new C6208y2("invalid arguments count.");
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: kk */
    public AbstractC14068j5 mo10034kk() {
        return C7019kk.m27443k4((Class<?>) C5544jd.class);
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1946kk
    /* JADX INFO: renamed from: x1 */
    public void mo10027x1() {
        m10035kk("createCSSStyleSheet");
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC14068j5 mo10030k4() {
        return f43367k4;
    }
}

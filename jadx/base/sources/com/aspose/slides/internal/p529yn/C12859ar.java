package com.aspose.slides.internal.p529yn;

import com.aspose.slides.internal.p055c4.AbstractC1943dy;
import com.aspose.slides.internal.p213jw.C5543ix;
import com.aspose.slides.internal.p231kk.C5791k4;
import com.aspose.slides.internal.p231kk.InterfaceC5785e0;
import com.aspose.slides.internal.p231kk.InterfaceC5790jd;
import com.aspose.slides.internal.p231kk.InterfaceC5810wl;
import com.aspose.slides.internal.p253lm.AbstractC6123ca;
import com.aspose.slides.internal.p253lm.C6208y2;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14068j5;

/* JADX INFO: renamed from: com.aspose.slides.internal.yn.ar */
/* JADX INFO: loaded from: classes5.dex */
public class C12859ar extends AbstractC1943dy {

    /* JADX INFO: renamed from: k4 */
    private static final AbstractC14068j5 f43339k4 = C7019kk.m27443k4((Class<?>) InterfaceC5785e0.class);

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f43340kk = new C7017h4("getComputedStyle");

    /* JADX INFO: renamed from: x1 */
    private C5791k4 f43341x1;

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC6123ca mo10029k4(String str, AbstractC6123ca abstractC6123ca, AbstractC6123ca[] abstractC6123caArr) {
        InterfaceC5785e0 interfaceC5785e0 = (InterfaceC5785e0) abstractC6123ca.mo24769C_();
        if (f43340kk.m27428k4(str) != 0) {
            throw new C6208y2("unknown function");
        }
        if (abstractC6123caArr.length != 2) {
            throw new C6208y2("invalid arguments count.");
        }
        InterfaceC5810wl interfaceC5810wlMo20449x1 = interfaceC5785e0.mo20449x1((C5543ix) abstractC6123caArr[0].mo24789D_(), abstractC6123caArr[1].toString());
        C5791k4 c5791k4 = this.f43341x1;
        if (c5791k4 == null || (c5791k4 != null && c5791k4.m23667k4() != interfaceC5810wlMo20449x1)) {
            this.f43341x1 = new C5791k4(interfaceC5810wlMo20449x1);
        }
        return m10084k4(this.f43341x1, C7019kk.m27443k4((Class<?>) InterfaceC5790jd.class));
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1946kk
    /* JADX INFO: renamed from: x1 */
    public void mo10027x1() {
        m10035kk("getComputedStyle");
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC14068j5 mo10030k4() {
        return f43339k4;
    }
}

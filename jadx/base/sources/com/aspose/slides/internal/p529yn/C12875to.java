package com.aspose.slides.internal.p529yn;

import com.aspose.slides.internal.p055c4.AbstractC1943dy;
import com.aspose.slides.internal.p231kk.InterfaceC5774ak;
import com.aspose.slides.internal.p231kk.InterfaceC5775ar;
import com.aspose.slides.internal.p231kk.InterfaceC5794ks;
import com.aspose.slides.internal.p231kk.InterfaceC5797ne;
import com.aspose.slides.internal.p253lm.AbstractC6123ca;
import com.aspose.slides.internal.p253lm.C6208y2;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14068j5;

/* JADX INFO: renamed from: com.aspose.slides.internal.yn.to */
/* JADX INFO: loaded from: classes5.dex */
public class C12875to extends AbstractC1943dy {

    /* JADX INFO: renamed from: k4 */
    private static final AbstractC14068j5 f43373k4 = C7019kk.m27443k4((Class<?>) InterfaceC5794ks.class);

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f43374x1 = new C7017h4("get_href", "get_media", "get_styleSheet");

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC6123ca mo10029k4(String str, AbstractC6123ca abstractC6123ca, AbstractC6123ca[] abstractC6123caArr) {
        InterfaceC5794ks interfaceC5794ks = (InterfaceC5794ks) abstractC6123ca.mo24769C_();
        int iM27428k4 = f43374x1.m27428k4(str);
        if (iM27428k4 == 0) {
            return m10085k4(interfaceC5794ks.mo23679kk());
        }
        if (iM27428k4 == 1) {
            return m10084k4(interfaceC5794ks.mo23678h4(), C7019kk.m27443k4((Class<?>) InterfaceC5774ak.class));
        }
        if (iM27428k4 == 2) {
            return m10084k4(interfaceC5794ks.mo23680m9(), C7019kk.m27443k4((Class<?>) InterfaceC5775ar.class));
        }
        throw new C6208y2("unknown function");
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: kk */
    public AbstractC14068j5 mo10034kk() {
        return C7019kk.m27443k4((Class<?>) InterfaceC5797ne.class);
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1946kk
    /* JADX INFO: renamed from: x1 */
    public void mo10027x1() {
        m10033k4("href", 1);
        m10033k4("media", 1);
        m10033k4("styleSheet", 1);
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC14068j5 mo10030k4() {
        return f43373k4;
    }
}

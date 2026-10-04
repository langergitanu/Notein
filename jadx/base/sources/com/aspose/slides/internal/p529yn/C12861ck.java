package com.aspose.slides.internal.p529yn;

import com.aspose.slides.internal.p055c4.AbstractC1943dy;
import com.aspose.slides.internal.p231kk.InterfaceC5797ne;
import com.aspose.slides.internal.p231kk.InterfaceC5799qq;
import com.aspose.slides.internal.p231kk.InterfaceC5810wl;
import com.aspose.slides.internal.p253lm.AbstractC6123ca;
import com.aspose.slides.internal.p253lm.C6208y2;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14068j5;

/* JADX INFO: renamed from: com.aspose.slides.internal.yn.ck */
/* JADX INFO: loaded from: classes5.dex */
public class C12861ck extends AbstractC1943dy {

    /* JADX INFO: renamed from: k4 */
    private static final AbstractC14068j5 f43344k4 = C7019kk.m27443k4((Class<?>) InterfaceC5799qq.class);

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f43345x1 = new C7017h4("get_selectorText", "set_selectorText", "get_style");

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC6123ca mo10029k4(String str, AbstractC6123ca abstractC6123ca, AbstractC6123ca[] abstractC6123caArr) {
        InterfaceC5799qq interfaceC5799qq = (InterfaceC5799qq) abstractC6123ca.mo24769C_();
        int iM27428k4 = f43345x1.m27428k4(str);
        if (iM27428k4 == 0) {
            return m10085k4(interfaceC5799qq.mo23687kk());
        }
        if (iM27428k4 == 1) {
            throw new C6208y2("Setting selectorText is not allowed.");
        }
        if (iM27428k4 == 2) {
            return m10084k4(interfaceC5799qq.mo23686h4(), C7019kk.m27443k4((Class<?>) InterfaceC5810wl.class));
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
        m10033k4("selectorText", 3);
        m10033k4("style", 1);
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC14068j5 mo10030k4() {
        return f43344k4;
    }
}

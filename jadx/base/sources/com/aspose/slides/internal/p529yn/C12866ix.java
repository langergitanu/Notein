package com.aspose.slides.internal.p529yn;

import com.aspose.slides.internal.p055c4.AbstractC1943dy;
import com.aspose.slides.internal.p213jw.C5543ix;
import com.aspose.slides.internal.p231kk.InterfaceC5776b3;
import com.aspose.slides.internal.p231kk.InterfaceC5810wl;
import com.aspose.slides.internal.p231kk.InterfaceC5816yd;
import com.aspose.slides.internal.p253lm.AbstractC6123ca;
import com.aspose.slides.internal.p253lm.C6208y2;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14068j5;

/* JADX INFO: renamed from: com.aspose.slides.internal.yn.ix */
/* JADX INFO: loaded from: classes5.dex */
public class C12866ix extends AbstractC1943dy {

    /* JADX INFO: renamed from: k4 */
    private static final AbstractC14068j5 f43354k4 = C7019kk.m27443k4((Class<?>) InterfaceC5816yd.class);

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f43355x1 = new C7017h4("getOverrideStyle");

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC6123ca mo10029k4(String str, AbstractC6123ca abstractC6123ca, AbstractC6123ca[] abstractC6123caArr) {
        InterfaceC5816yd interfaceC5816yd = (InterfaceC5816yd) abstractC6123ca.mo24769C_();
        if (f43355x1.m27428k4(str) != 0) {
            throw new C6208y2("unknown function");
        }
        if (abstractC6123caArr.length == 2) {
            return m10084k4(interfaceC5816yd.mo20430k4((C5543ix) abstractC6123caArr[0].mo24789D_(), abstractC6123caArr[1].toString()), C7019kk.m27443k4((Class<?>) InterfaceC5810wl.class));
        }
        throw new C6208y2("invalid arguments count.");
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: kk */
    public AbstractC14068j5 mo10034kk() {
        return C7019kk.m27443k4((Class<?>) InterfaceC5776b3.class);
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1946kk
    /* JADX INFO: renamed from: x1 */
    public void mo10027x1() {
        m10035kk("getOverrideStyle");
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC14068j5 mo10030k4() {
        return f43354k4;
    }
}

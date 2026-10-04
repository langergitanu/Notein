package com.aspose.slides.internal.p433u1;

import com.aspose.slides.internal.p055c4.AbstractC1943dy;
import com.aspose.slides.internal.p213jw.AbstractC5535bv;
import com.aspose.slides.internal.p253lm.AbstractC6123ca;
import com.aspose.slides.internal.p253lm.C6208y2;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p517y2.InterfaceC12788yd;
import com.aspose.slides.p559ms.System.AbstractC14068j5;

/* JADX INFO: renamed from: com.aspose.slides.internal.u1.yd */
/* JADX INFO: loaded from: classes4.dex */
public class C11277yd extends AbstractC1943dy {

    /* JADX INFO: renamed from: k4 */
    private static final AbstractC14068j5 f38853k4 = C7019kk.m27443k4((Class<?>) InterfaceC12788yd.class);

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f38854x1 = new C7017h4("handle");

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC6123ca mo10029k4(String str, AbstractC6123ca abstractC6123ca, AbstractC6123ca[] abstractC6123caArr) {
        InterfaceC12788yd interfaceC12788yd = (InterfaceC12788yd) abstractC6123ca.mo24769C_();
        if (f38854x1.m27428k4(str) != 0) {
            throw new C6208y2("unknown function");
        }
        if (abstractC6123caArr.length != 5) {
            throw new C6208y2("invalid arguments count.");
        }
        interfaceC12788yd.m59458k4(((Byte) abstractC6123caArr[0].mo24789D_()).byteValue(), abstractC6123caArr[1].toString(), abstractC6123caArr[2].mo24789D_(), (AbstractC5535bv) abstractC6123caArr[3].mo24789D_(), (AbstractC5535bv) abstractC6123caArr[4].mo24789D_());
        return m10080h4();
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1946kk
    /* JADX INFO: renamed from: x1 */
    public void mo10027x1() {
        m10035kk("handle");
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC14068j5 mo10030k4() {
        return f38853k4;
    }
}

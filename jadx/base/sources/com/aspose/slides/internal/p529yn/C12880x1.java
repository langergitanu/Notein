package com.aspose.slides.internal.p529yn;

import com.aspose.slides.internal.p055c4.AbstractC1943dy;
import com.aspose.slides.internal.p231kk.InterfaceC5781ck;
import com.aspose.slides.internal.p231kk.InterfaceC5797ne;
import com.aspose.slides.internal.p253lm.AbstractC6123ca;
import com.aspose.slides.internal.p253lm.C6208y2;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14068j5;

/* JADX INFO: renamed from: com.aspose.slides.internal.yn.x1 */
/* JADX INFO: loaded from: classes5.dex */
public class C12880x1 extends AbstractC1943dy {

    /* JADX INFO: renamed from: k4 */
    private static final AbstractC14068j5 f43383k4 = C7019kk.m27443k4((Class<?>) InterfaceC5781ck.class);

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f43384x1 = new C7017h4("get_encoding", "set_encoding");

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC6123ca mo10029k4(String str, AbstractC6123ca abstractC6123ca, AbstractC6123ca[] abstractC6123caArr) {
        InterfaceC5781ck interfaceC5781ck = (InterfaceC5781ck) abstractC6123ca.mo24769C_();
        int iM27428k4 = f43384x1.m27428k4(str);
        if (iM27428k4 == 0) {
            return m10085k4(interfaceC5781ck.mo23397kk());
        }
        if (iM27428k4 != 1) {
            throw new C6208y2("unknown function");
        }
        if (abstractC6123caArr.length != 1) {
            throw new C6208y2("invalid arguments count.");
        }
        interfaceC5781ck.mo23396k4(abstractC6123caArr[0].toString());
        return m10080h4();
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: kk */
    public AbstractC14068j5 mo10034kk() {
        return C7019kk.m27443k4((Class<?>) InterfaceC5797ne.class);
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1946kk
    /* JADX INFO: renamed from: x1 */
    public void mo10027x1() {
        m10033k4("encoding", 3);
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC14068j5 mo10030k4() {
        return f43383k4;
    }
}

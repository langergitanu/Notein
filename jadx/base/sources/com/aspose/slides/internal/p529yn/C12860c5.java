package com.aspose.slides.internal.p529yn;

import com.aspose.slides.internal.p055c4.AbstractC1943dy;
import com.aspose.slides.internal.p231kk.InterfaceC5789ix;
import com.aspose.slides.internal.p231kk.InterfaceC5797ne;
import com.aspose.slides.internal.p253lm.AbstractC6123ca;
import com.aspose.slides.internal.p253lm.C6208y2;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14068j5;

/* JADX INFO: renamed from: com.aspose.slides.internal.yn.c5 */
/* JADX INFO: loaded from: classes5.dex */
public class C12860c5 extends AbstractC1943dy {

    /* JADX INFO: renamed from: k4 */
    private static final AbstractC14068j5 f43342k4 = C7019kk.m27443k4((Class<?>) InterfaceC5789ix.class);

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f43343x1 = new C7017h4("item", "get_length");

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC6123ca mo10029k4(String str, AbstractC6123ca abstractC6123ca, AbstractC6123ca[] abstractC6123caArr) {
        InterfaceC5789ix interfaceC5789ix = (InterfaceC5789ix) abstractC6123ca.mo24769C_();
        int iM27428k4 = f43343x1.m27428k4(str);
        if (iM27428k4 != 0) {
            if (iM27428k4 == 1) {
                return m10082k4(interfaceC5789ix.mo23418k4());
            }
            throw new C6208y2("unknown function");
        }
        if (abstractC6123caArr.length == 1) {
            return m10084k4(interfaceC5789ix.mo23419k4(abstractC6123caArr[0].m24794wy()), C7019kk.m27443k4((Class<?>) InterfaceC5797ne.class));
        }
        throw new C6208y2("invalid arguments count.");
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
        return f43342k4;
    }
}

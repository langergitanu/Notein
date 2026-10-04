package com.aspose.slides.internal.p128fc;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.OooO;
import com.aspose.slides.internal.p329p4.C7179c5;
import com.aspose.slides.internal.p329p4.C7185jd;
import com.aspose.slides.internal.p341po.C9470du;
import com.aspose.slides.internal.p341po.InterfaceC9477x1;
import com.aspose.slides.internal.p475wh.C12003du;

/* JADX INFO: renamed from: com.aspose.slides.internal.fc.s7 */
/* JADX INFO: loaded from: classes.dex */
public class C3951s7 implements InterfaceC3941ks {

    /* JADX INFO: renamed from: k4 */
    private final InterfaceC9477x1 f10705k4;

    public C3951s7(InterfaceC9477x1 interfaceC9477x1) {
        this.f10705k4 = interfaceC9477x1;
    }

    @Override // com.aspose.slides.internal.p128fc.InterfaceC3941ks
    /* JADX INFO: renamed from: k4 */
    public void mo15630k4(C3958u4 c3958u4, List<C7185jd> list) {
        C12003du c12003duM56398k4;
        C9470du c9470duMo46638k4 = this.f10705k4.mo46638k4();
        if (list.size() != 1) {
            if (list.size() == 3) {
                c12003duM56398k4 = C12003du.m56398k4(c9470duMo46638k4.m46615xk().m56501c5() & 255, OooO.OooO00o(((C7179c5) list.get_Item(0)).m27753to() * 255.0f, 14), OooO.OooO00o(((C7179c5) list.get_Item(1)).m27753to() * 255.0f, 14), OooO.OooO00o(((C7179c5) list.get_Item(2)).m27753to() * 255.0f, 14));
            }
            this.f10705k4.mo46639k4(c9470duMo46638k4);
        }
        int iOooO00o = OooO.OooO00o(((C7179c5) list.get_Item(0)).m27753to() * 255.0f, 14);
        c12003duM56398k4 = C12003du.m56398k4(c9470duMo46638k4.m46615xk().m56501c5() & 255, iOooO00o, iOooO00o, iOooO00o);
        c9470duMo46638k4.m46612x1(c12003duM56398k4.Clone());
        this.f10705k4.mo46639k4(c9470duMo46638k4);
    }
}

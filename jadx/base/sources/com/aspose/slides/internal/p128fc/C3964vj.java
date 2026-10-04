package com.aspose.slides.internal.p128fc;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.Stack;
import com.aspose.slides.OooO;
import com.aspose.slides.internal.p200j6.AbstractC5200du;
import com.aspose.slides.internal.p200j6.C5208m9;
import com.aspose.slides.internal.p200j6.C5213x6;
import com.aspose.slides.internal.p329p4.C7179c5;
import com.aspose.slides.internal.p329p4.C7185jd;
import com.aspose.slides.internal.p329p4.C7186k4;
import com.aspose.slides.internal.p333p8.C9421c5;
import com.aspose.slides.internal.p341po.C9470du;
import com.aspose.slides.internal.p341po.InterfaceC9477x1;
import com.aspose.slides.internal.p475wh.C12003du;

/* JADX INFO: renamed from: com.aspose.slides.internal.fc.vj */
/* JADX INFO: loaded from: classes.dex */
public class C3964vj implements InterfaceC3941ks {

    /* JADX INFO: renamed from: k4 */
    private final InterfaceC9477x1 f10723k4;

    /* JADX INFO: renamed from: x1 */
    private final Stack<C9421c5> f10724x1;

    public C3964vj(InterfaceC9477x1 interfaceC9477x1, Stack<C9421c5> stack) {
        this.f10723k4 = interfaceC9477x1;
        this.f10724x1 = stack;
    }

    @Override // com.aspose.slides.internal.p128fc.InterfaceC3941ks
    /* JADX INFO: renamed from: k4 */
    public void mo15630k4(C3958u4 c3958u4, List<C7185jd> list) {
        C12003du c12003duM56398k4;
        if (list == null || list.size() < 1) {
            return;
        }
        C9470du c9470duMo46638k4 = this.f10723k4.mo46638k4();
        AbstractC5200du abstractC5200du = this.f10724x1.peek().m46096k4().get_Item(c9470duMo46638k4.m46616yd());
        C5208m9 c5208m9M46585kk = c9470duMo46638k4.m46585kk();
        if (abstractC5200du != null) {
            C5213x6 c5213x6 = (C5213x6) abstractC5200du;
            c5213x6.m22236x1();
            C7186k4 c7186k4M22237x1 = c5213x6.m22237x1(list.get_Item(0));
            c5208m9M46585kk.m22224k4(c7186k4M22237x1.m27788x1());
            if (c7186k4M22237x1.m27778k4() != 1) {
                if (c7186k4M22237x1.m27778k4() == 3) {
                    c12003duM56398k4 = C12003du.m56398k4(c9470duMo46638k4.m46615xk().m56501c5() & 255, OooO.OooO00o(((C7179c5) c7186k4M22237x1.m27785kk(0)).m27753to() * 255.0f, 14), OooO.OooO00o(((C7179c5) c7186k4M22237x1.m27785kk(1)).m27753to() * 255.0f, 14), OooO.OooO00o(((C7179c5) c7186k4M22237x1.m27785kk(2)).m27753to() * 255.0f, 14));
                }
                c9470duMo46638k4.m46571k4(c5208m9M46585kk);
                this.f10723k4.mo46639k4(c9470duMo46638k4);
            }
            int iOooO00o = OooO.OooO00o(((C7179c5) c7186k4M22237x1.m27785kk(0)).m27753to() * 255.0f, 14);
            c12003duM56398k4 = C12003du.m56398k4(c9470duMo46638k4.m46615xk().m56501c5() & 255, iOooO00o, iOooO00o, iOooO00o);
            c9470duMo46638k4.m46612x1(c12003duM56398k4.Clone());
            c9470duMo46638k4.m46571k4(c5208m9M46585kk);
            this.f10723k4.mo46639k4(c9470duMo46638k4);
        }
    }
}

package com.aspose.slides.internal.p128fc;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.OooO;
import com.aspose.slides.internal.p329p4.C7179c5;
import com.aspose.slides.internal.p329p4.C7185jd;
import com.aspose.slides.internal.p341po.C9470du;
import com.aspose.slides.internal.p341po.InterfaceC9477x1;
import com.aspose.slides.internal.p475wh.C12003du;

/* JADX INFO: renamed from: com.aspose.slides.internal.fc.gi */
/* JADX INFO: loaded from: classes.dex */
public class C3933gi implements InterfaceC3941ks {

    /* JADX INFO: renamed from: k4 */
    private final InterfaceC9477x1 f10676k4;

    public C3933gi(InterfaceC9477x1 interfaceC9477x1) {
        this.f10676k4 = interfaceC9477x1;
    }

    @Override // com.aspose.slides.internal.p128fc.InterfaceC3941ks
    /* JADX INFO: renamed from: k4 */
    public final void mo15630k4(C3958u4 c3958u4, List<C7185jd> list) {
        C9470du c9470duMo46638k4 = this.f10676k4.mo46638k4();
        int iOooO00o = OooO.OooO00o(((C7179c5) list.get_Item(0)).m27753to() * 255.0f, 14);
        c9470duMo46638k4.m46612x1(C12003du.m56398k4(c9470duMo46638k4.m46615xk().m56501c5() & 255, iOooO00o, iOooO00o, iOooO00o).Clone());
        this.f10676k4.mo46639k4(c9470duMo46638k4);
    }
}

package com.aspose.slides.internal.p128fc;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.OooO0O0;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p329p4.C7179c5;
import com.aspose.slides.internal.p329p4.C7185jd;
import com.aspose.slides.internal.p341po.C9470du;
import com.aspose.slides.internal.p341po.C9471dy;
import com.aspose.slides.internal.p341po.InterfaceC9477x1;

/* JADX INFO: renamed from: com.aspose.slides.internal.fc.qq */
/* JADX INFO: loaded from: classes.dex */
public class C3947qq implements InterfaceC3941ks {

    /* JADX INFO: renamed from: k4 */
    private final InterfaceC9477x1 f10697k4;

    public C3947qq(InterfaceC9477x1 interfaceC9477x1) {
        this.f10697k4 = interfaceC9477x1;
    }

    @Override // com.aspose.slides.internal.p128fc.InterfaceC3941ks
    /* JADX INFO: renamed from: k4 */
    public final void mo15630k4(C3958u4 c3958u4, List<C7185jd> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        C7185jd c7185jd = (C7185jd) OooO0O0.OooO00o(list, 1);
        if (C7019kk.m27469x1(c7185jd, C7179c5.class)) {
            C7179c5 c7179c5 = (C7179c5) C7019kk.m27452k4((Object) c7185jd, C7179c5.class);
            C9470du c9470duMo46638k4 = this.f10697k4.mo46638k4();
            C9471dy c9471dyClone = c9470duMo46638k4.m46554c5().Clone();
            c9471dyClone.m46620du(c7179c5.m27753to());
            c9470duMo46638k4.m46576k4(c9471dyClone.Clone());
            this.f10697k4.mo46639k4(c9470duMo46638k4);
        }
    }
}

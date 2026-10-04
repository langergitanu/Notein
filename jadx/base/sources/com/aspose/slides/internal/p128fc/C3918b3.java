package com.aspose.slides.internal.p128fc;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p329p4.C7179c5;
import com.aspose.slides.internal.p329p4.C7185jd;
import com.aspose.slides.internal.p341po.C9470du;
import com.aspose.slides.internal.p341po.InterfaceC9477x1;

/* JADX INFO: renamed from: com.aspose.slides.internal.fc.b3 */
/* JADX INFO: loaded from: classes.dex */
public class C3918b3 implements InterfaceC3941ks {

    /* JADX INFO: renamed from: k4 */
    private final InterfaceC9477x1 f10649k4;

    public C3918b3(InterfaceC9477x1 interfaceC9477x1) {
        this.f10649k4 = interfaceC9477x1;
    }

    @Override // com.aspose.slides.internal.p128fc.InterfaceC3941ks
    /* JADX INFO: renamed from: k4 */
    public void mo15630k4(C3958u4 c3958u4, List<C7185jd> list) {
        if (list == null || list.size() < 1) {
            return;
        }
        C9470du c9470duMo46638k4 = this.f10649k4.mo46638k4();
        c9470duMo46638k4.m46587kk(((C7179c5) list.get_Item(0)).m27753to());
        this.f10649k4.mo46639k4(c9470duMo46638k4);
    }
}

package com.aspose.slides.internal.p128fc;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p329p4.C7182dy;
import com.aspose.slides.internal.p329p4.C7185jd;
import com.aspose.slides.internal.p329p4.C7186k4;
import com.aspose.slides.internal.p341po.C9470du;
import com.aspose.slides.internal.p341po.InterfaceC9477x1;

/* JADX INFO: renamed from: com.aspose.slides.internal.fc.ss */
/* JADX INFO: loaded from: classes.dex */
public class C3952ss implements InterfaceC3941ks {

    /* JADX INFO: renamed from: k4 */
    private final InterfaceC9477x1 f10706k4;

    public C3952ss(InterfaceC9477x1 interfaceC9477x1) {
        this.f10706k4 = interfaceC9477x1;
    }

    @Override // com.aspose.slides.internal.p128fc.InterfaceC3941ks
    /* JADX INFO: renamed from: k4 */
    public void mo15630k4(C3958u4 c3958u4, List<C7185jd> list) {
        if (list == null || list.size() < 1) {
            return;
        }
        C9470du c9470duMo46638k4 = this.f10706k4.mo46638k4();
        C7185jd c7185jd = list.get_Item(0);
        if (C7019kk.m27469x1(c7185jd, C7182dy.class)) {
            c9470duMo46638k4.m46582k4(((C7182dy) C7019kk.m27452k4((Object) c7185jd, C7182dy.class)).m27766k4());
        }
        if (C7019kk.m27469x1(c7185jd, C7186k4.class)) {
            c9470duMo46638k4.m46582k4(((C7186k4) C7019kk.m27452k4((Object) c7185jd, C7186k4.class)).m27776du(0));
        }
        this.f10706k4.mo46639k4(c9470duMo46638k4);
    }
}

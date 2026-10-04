package com.aspose.slides.internal.p128fc;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p329p4.C7179c5;
import com.aspose.slides.internal.p329p4.C7185jd;
import com.aspose.slides.internal.p341po.C9470du;
import com.aspose.slides.internal.p341po.InterfaceC9477x1;
import com.aspose.slides.internal.p472w8.C11913yj;

/* JADX INFO: renamed from: com.aspose.slides.internal.fc.c5 */
/* JADX INFO: loaded from: classes.dex */
public class C3921c5 implements InterfaceC3941ks {

    /* JADX INFO: renamed from: k4 */
    private final InterfaceC9477x1 f10652k4;

    public C3921c5(InterfaceC9477x1 interfaceC9477x1) {
        this.f10652k4 = interfaceC9477x1;
    }

    @Override // com.aspose.slides.internal.p128fc.InterfaceC3941ks
    /* JADX INFO: renamed from: k4 */
    public final void mo15630k4(C3958u4 c3958u4, List<C7185jd> list) {
        if (list == null || list.size() < 6) {
            return;
        }
        C11913yj c11913yj = new C11913yj(((C7179c5) list.get_Item(0)).m27753to(), ((C7179c5) list.get_Item(1)).m27753to(), ((C7179c5) list.get_Item(2)).m27753to(), ((C7179c5) list.get_Item(3)).m27753to(), ((C7179c5) list.get_Item(4)).m27753to(), ((C7179c5) list.get_Item(5)).m27753to());
        C9470du c9470duMo46638k4 = this.f10652k4.mo46638k4();
        c11913yj.m55769k4(c9470duMo46638k4.m46565k4(), 1);
        c9470duMo46638k4.m46579k4(c11913yj);
    }
}

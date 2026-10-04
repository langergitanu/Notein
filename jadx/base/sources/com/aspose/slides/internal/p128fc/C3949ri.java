package com.aspose.slides.internal.p128fc;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p278mq.InterfaceC6407to;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p329p4.C7179c5;
import com.aspose.slides.internal.p329p4.C7185jd;
import com.aspose.slides.internal.p329p4.C7186k4;
import com.aspose.slides.internal.p329p4.C7191up;
import com.aspose.slides.internal.p341po.C9471dy;
import com.aspose.slides.internal.p341po.InterfaceC9473k4;
import com.aspose.slides.internal.p341po.InterfaceC9477x1;
import com.aspose.slides.internal.p472w8.C11913yj;

/* JADX INFO: renamed from: com.aspose.slides.internal.fc.ri */
/* JADX INFO: loaded from: classes.dex */
public class C3949ri extends C3915ai {
    public C3949ri(InterfaceC9477x1 interfaceC9477x1, InterfaceC9473k4 interfaceC9473k4, InterfaceC6407to interfaceC6407to) {
        super(interfaceC9477x1, interfaceC9473k4, interfaceC6407to);
    }

    @Override // com.aspose.slides.internal.p128fc.C3915ai, com.aspose.slides.internal.p128fc.InterfaceC3941ks
    /* JADX INFO: renamed from: k4 */
    public void mo15630k4(C3958u4 c3958u4, List<C7185jd> list) {
        if (list.size() < 1) {
            return;
        }
        if (C7019kk.m27469x1(list.get_Item(0), C7186k4.class)) {
            C7186k4 c7186k4 = (C7186k4) C7019kk.m27452k4((Object) list.get_Item(0), C7186k4.class);
            for (int i = 0; i < c7186k4.m27778k4(); i++) {
                C7185jd c7185jdM27785kk = c7186k4.m27785kk(i);
                if (C7019kk.m27469x1(c7185jdM27785kk, C7179c5.class)) {
                    C7179c5 c7179c5 = (C7179c5) C7019kk.m27452k4((Object) c7185jdM27785kk, C7179c5.class);
                    C9471dy c9471dyClone = this.f10644k4.mo46638k4().m46554c5().Clone();
                    C11913yj c11913yj = new C11913yj(1.0f, 0.0f, 0.0f, 1.0f, c9471dyClone.m46624k4() * c9471dyClone.m46634x1() * (-(c7179c5.m27753to() / 1000.0f)), 0.0f);
                    c11913yj.m55769k4(this.f10646x1.mo26289x1(), 1);
                    this.f10646x1.mo26285k4(c11913yj);
                } else if (C7019kk.m27469x1(c7185jdM27785kk, C7191up.class)) {
                    m15631k4(((C7191up) C7019kk.m27452k4((Object) c7185jdM27785kk, C7191up.class)).m27846k4());
                }
            }
        }
    }
}

package com.aspose.slides.internal.p128fc;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p278mq.InterfaceC6407to;
import com.aspose.slides.internal.p329p4.C7179c5;
import com.aspose.slides.internal.p329p4.C7185jd;
import com.aspose.slides.internal.p472w8.C11913yj;

/* JADX INFO: renamed from: com.aspose.slides.internal.fc.x6 */
/* JADX INFO: loaded from: classes.dex */
public class C3970x6 implements InterfaceC3941ks {

    /* JADX INFO: renamed from: k4 */
    private final InterfaceC6407to f10733k4;

    public C3970x6(InterfaceC6407to interfaceC6407to) {
        this.f10733k4 = interfaceC6407to;
    }

    @Override // com.aspose.slides.internal.p128fc.InterfaceC3941ks
    /* JADX INFO: renamed from: k4 */
    public void mo15630k4(C3958u4 c3958u4, List<C7185jd> list) {
        if (list == null || list.size() < 2) {
            return;
        }
        C11913yj c11913yj = new C11913yj(1.0f, 0.0f, 0.0f, 1.0f, ((C7179c5) list.get_Item(0)).m27753to(), ((C7179c5) list.get_Item(1)).m27753to());
        c11913yj.m55769k4(this.f10733k4.mo26287kk(), 1);
        this.f10733k4.mo26290x1(c11913yj);
        InterfaceC6407to interfaceC6407to = this.f10733k4;
        interfaceC6407to.mo26285k4(interfaceC6407to.mo26287kk().m55760h4());
    }
}

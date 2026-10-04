package com.aspose.slides.internal.p128fc;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p278mq.InterfaceC6407to;
import com.aspose.slides.internal.p329p4.C7179c5;
import com.aspose.slides.internal.p329p4.C7185jd;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.fc.tq */
/* JADX INFO: loaded from: classes.dex */
public class C3956tq implements InterfaceC3941ks {

    /* JADX INFO: renamed from: k4 */
    private final InterfaceC6407to f10710k4;

    public C3956tq(InterfaceC6407to interfaceC6407to) {
        this.f10710k4 = interfaceC6407to;
    }

    @Override // com.aspose.slides.internal.p128fc.InterfaceC3941ks
    /* JADX INFO: renamed from: k4 */
    public final void mo15630k4(C3958u4 c3958u4, List<C7185jd> list) {
        if (list == null || list.size() < 6) {
            return;
        }
        float fM27753to = ((C7179c5) list.get_Item(0)).m27753to();
        float fM27753to2 = ((C7179c5) list.get_Item(1)).m27753to();
        float fM27753to3 = ((C7179c5) list.get_Item(2)).m27753to();
        float fM27753to4 = ((C7179c5) list.get_Item(3)).m27753to();
        float fM27753to5 = ((C7179c5) list.get_Item(4)).m27753to();
        float fM27753to6 = ((C7179c5) list.get_Item(5)).m27753to();
        if (this.f10710k4.mo26281du()) {
            C11913yj c11913yjMo26289x1 = this.f10710k4.mo26289x1();
            if (!c11913yjMo26289x1.m55789x1() && C14116yg.m67480k4(c11913yjMo26289x1.m55757du() - fM27753to6) < 0.05f) {
                fM27753to5 = C14116yg.m67481k4(fM27753to5, c11913yjMo26289x1.m55783to());
            }
        }
        float f = fM27753to5;
        this.f10710k4.mo26285k4(new C11913yj(fM27753to, fM27753to2, fM27753to3, fM27753to4, f, fM27753to6));
        this.f10710k4.mo26290x1(new C11913yj(fM27753to, fM27753to2, fM27753to3, fM27753to4, f, fM27753to6));
    }
}

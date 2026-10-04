package com.aspose.slides.internal.p128fc;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p278mq.InterfaceC6405kk;
import com.aspose.slides.internal.p329p4.C7179c5;
import com.aspose.slides.internal.p329p4.C7185jd;
import com.aspose.slides.internal.p341po.C9476to;
import com.aspose.slides.internal.p341po.InterfaceC9473k4;
import com.aspose.slides.internal.p341po.InterfaceC9477x1;
import com.aspose.slides.internal.p475wh.C12025x6;

/* JADX INFO: renamed from: com.aspose.slides.internal.fc.k4 */
/* JADX INFO: loaded from: classes.dex */
public class C3938k4 implements InterfaceC3941ks {

    /* JADX INFO: renamed from: k4 */
    private final InterfaceC9477x1 f10684k4;

    /* JADX INFO: renamed from: kk */
    private final InterfaceC9473k4 f10685kk;

    /* JADX INFO: renamed from: x1 */
    private final InterfaceC6405kk f10686x1;

    public C3938k4(InterfaceC9477x1 interfaceC9477x1, InterfaceC6405kk interfaceC6405kk, InterfaceC9473k4 interfaceC9473k4) {
        this.f10684k4 = interfaceC9477x1;
        this.f10686x1 = interfaceC6405kk;
        this.f10685kk = interfaceC9473k4;
    }

    @Override // com.aspose.slides.internal.p128fc.InterfaceC3941ks
    /* JADX INFO: renamed from: k4 */
    public final void mo15630k4(C3958u4 c3958u4, List<C7185jd> list) {
        if (list == null || list.size() < 6) {
            return;
        }
        C7179c5 c7179c5 = (C7179c5) list.get_Item(0);
        C7179c5 c7179c52 = (C7179c5) list.get_Item(1);
        C7179c5 c7179c53 = (C7179c5) list.get_Item(2);
        C7179c5 c7179c54 = (C7179c5) list.get_Item(3);
        C7179c5 c7179c55 = (C7179c5) list.get_Item(4);
        C7179c5 c7179c56 = (C7179c5) list.get_Item(5);
        C12025x6 c12025x6Clone = C9476to.m46656k4(c7179c5.m27753to(), c7179c52.m27753to(), this.f10684k4.mo46638k4().m46565k4()).Clone();
        c12025x6Clone.m56898x1(this.f10685kk.mo46644k4() - c12025x6Clone.m56895kk());
        C12025x6 c12025x6Clone2 = C9476to.m46656k4(c7179c53.m27753to(), c7179c54.m27753to(), this.f10684k4.mo46638k4().m46565k4()).Clone();
        c12025x6Clone2.m56898x1(this.f10685kk.mo46644k4() - c12025x6Clone2.m56895kk());
        C12025x6 c12025x6Clone3 = C9476to.m46656k4(c7179c55.m27753to(), c7179c56.m27753to(), this.f10684k4.mo46638k4().m46565k4()).Clone();
        c12025x6Clone3.m56898x1(this.f10685kk.mo46644k4() - c12025x6Clone3.m56895kk());
        this.f10686x1.mo26300k4(c12025x6Clone.Clone(), c12025x6Clone2.Clone(), c12025x6Clone3.Clone());
    }
}

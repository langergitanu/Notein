package com.aspose.slides.internal.p128fc;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p278mq.InterfaceC6405kk;
import com.aspose.slides.internal.p329p4.C7179c5;
import com.aspose.slides.internal.p329p4.C7185jd;
import com.aspose.slides.internal.p341po.C9476to;
import com.aspose.slides.internal.p341po.InterfaceC9473k4;
import com.aspose.slides.internal.p341po.InterfaceC9477x1;
import com.aspose.slides.internal.p475wh.C12025x6;

/* JADX INFO: renamed from: com.aspose.slides.internal.fc.ca */
/* JADX INFO: loaded from: classes.dex */
public class C3923ca implements InterfaceC3941ks {

    /* JADX INFO: renamed from: k4 */
    private final InterfaceC9477x1 f10654k4;

    /* JADX INFO: renamed from: kk */
    private final InterfaceC9473k4 f10655kk;

    /* JADX INFO: renamed from: x1 */
    private final InterfaceC6405kk f10656x1;

    public C3923ca(InterfaceC9477x1 interfaceC9477x1, InterfaceC6405kk interfaceC6405kk, InterfaceC9473k4 interfaceC9473k4) {
        this.f10654k4 = interfaceC9477x1;
        this.f10656x1 = interfaceC6405kk;
        this.f10655kk = interfaceC9473k4;
    }

    @Override // com.aspose.slides.internal.p128fc.InterfaceC3941ks
    /* JADX INFO: renamed from: k4 */
    public final void mo15630k4(C3958u4 c3958u4, List<C7185jd> list) {
        C12025x6 c12025x6Clone = C9476to.m46656k4(((C7179c5) list.get_Item(0)).m27753to(), ((C7179c5) list.get_Item(1)).m27753to(), this.f10654k4.mo46638k4().m46565k4()).Clone();
        c12025x6Clone.m56898x1(this.f10655kk.mo46644k4() - c12025x6Clone.m56895kk());
        this.f10656x1.mo26298k4(c12025x6Clone.Clone());
    }
}

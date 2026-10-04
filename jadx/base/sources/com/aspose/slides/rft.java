package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
class rft implements InterfaceC14249or {

    /* JADX INFO: renamed from: k4 */
    private InterfaceC14836y7 f48563k4;

    public rft(InterfaceC14836y7 interfaceC14836y7) {
        this.f48563k4 = interfaceC14836y7;
    }

    /* JADX INFO: renamed from: k4 */
    private InterfaceC14836y7 m70085k4(InterfaceC0761as interfaceC0761as) {
        return (interfaceC0761as.mo3720k4() == null || C14113y2.m67363du(interfaceC0761as.mo3720k4(), this.f48563k4.mo5429x1())) ? this.f48563k4 : this.f48563k4.mo5425k4().mo5384k4(interfaceC0761as.mo3720k4());
    }

    @Override // com.aspose.slides.InterfaceC14249or
    /* JADX INFO: renamed from: k4 */
    public final InterfaceC14885zh mo68753k4(b6d b6dVar) {
        return new i0y(m70085k4((InterfaceC0761as) b6dVar), b6dVar.m4031x1(), 1, b6dVar.m4031x1(), Integer.MAX_VALUE);
    }

    /* JADX INFO: renamed from: k4 */
    private InterfaceC14885zh m70086k4(b6d b6dVar, b6d b6dVar2) {
        return new i0y(m70085k4((InterfaceC0761as) b6dVar), b6dVar.m4031x1(), 1, b6dVar2.m4031x1(), Integer.MAX_VALUE);
    }

    @Override // com.aspose.slides.InterfaceC14249or
    /* JADX INFO: renamed from: k4 */
    public final InterfaceC14885zh mo68754k4(C0909dp c0909dp) {
        return new i0y(m70085k4((InterfaceC0761as) c0909dp), c0909dp.m5204x1().m4031x1(), c0909dp.m5202kk().m5607x1(), c0909dp.m5204x1().m4031x1(), c0909dp.m5202kk().m5607x1());
    }

    /* JADX INFO: renamed from: k4 */
    private InterfaceC14885zh m70087k4(C0909dp c0909dp, C0909dp c0909dp2) {
        return new i0y(m70085k4((InterfaceC0761as) c0909dp), c0909dp.m5204x1().m4031x1(), c0909dp.m5202kk().m5607x1(), c0909dp2.m5204x1().m4031x1(), c0909dp2.m5202kk().m5607x1());
    }

    @Override // com.aspose.slides.InterfaceC14249or
    /* JADX INFO: renamed from: k4 */
    public final InterfaceC14885zh mo68755k4(C0958eo c0958eo) {
        return new i0y(m70085k4((InterfaceC0761as) c0958eo), 1, c0958eo.m5607x1(), Integer.MAX_VALUE, c0958eo.m5607x1());
    }

    /* JADX INFO: renamed from: k4 */
    private InterfaceC14885zh m70088k4(C0958eo c0958eo, C0958eo c0958eo2) {
        if (c0958eo.mo3720k4() == null || C14113y2.m67363du(c0958eo.mo3720k4(), c0958eo2.mo3720k4())) {
            return new i0y(m70085k4((InterfaceC0761as) c0958eo), 1, c0958eo.m5607x1(), Integer.MAX_VALUE, c0958eo2.m5607x1());
        }
        return null;
    }

    @Override // com.aspose.slides.InterfaceC14249or
    /* JADX INFO: renamed from: k4 */
    public final InterfaceC14885zh mo68756k4(xdd xddVar) {
        if (C7019kk.m27469x1(xddVar.m73330x1(), C0909dp.class) && C7019kk.m27469x1(xddVar.m73329kk(), C0909dp.class)) {
            return m70087k4((C0909dp) xddVar.m73330x1(), (C0909dp) xddVar.m73329kk());
        }
        if (C7019kk.m27469x1(xddVar.m73330x1(), b6d.class) && C7019kk.m27469x1(xddVar.m73329kk(), b6d.class)) {
            return m70086k4((b6d) xddVar.m73330x1(), (b6d) xddVar.m73329kk());
        }
        if (C7019kk.m27469x1(xddVar.m73330x1(), C0958eo.class) && C7019kk.m27469x1(xddVar.m73329kk(), C0958eo.class)) {
            return m70088k4((C0958eo) xddVar.m73330x1(), (C0958eo) xddVar.m73329kk());
        }
        return null;
    }
}

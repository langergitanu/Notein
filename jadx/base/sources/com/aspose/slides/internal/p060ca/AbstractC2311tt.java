package com.aspose.slides.internal.p060ca;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.tt */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2311tt implements InterfaceC2401z6 {

    /* JADX INFO: renamed from: k4 */
    private InterfaceC2039cz f7985k4;

    public AbstractC2311tt(InterfaceC2039cz interfaceC2039cz) {
        this.f7985k4 = interfaceC2039cz;
    }

    /* JADX INFO: renamed from: x1 */
    private static C2068ei m11457x1(InterfaceC2251pt interfaceC2251pt, AbstractC2220nx abstractC2220nx, C2372xo c2372xo) {
        return interfaceC2251pt.mo10265k4(abstractC2220nx);
    }

    @Override // com.aspose.slides.internal.p060ca.InterfaceC2401z6
    /* JADX INFO: renamed from: k4 */
    public final void mo11458k4(InterfaceC2251pt interfaceC2251pt, AbstractC2220nx abstractC2220nx, C2372xo c2372xo) {
        C2372xo c2372xo2 = new C2372xo();
        c2372xo2.m11688k4(c2372xo.m11686k4());
        c2372xo2.m11695x1(c2372xo.m11694x1());
        c2372xo2.m11691kk(c2372xo.m11690kk());
        c2372xo2.m11693to(c2372xo.m11692to());
        c2372xo2.m11683du(c2372xo.m11682du());
        c2372xo2.m11685h4(c2372xo.m11684h4());
        C2372xo c2372xoM11687k4 = (interfaceC2251pt.mo10260du() == 2 ? ((C2337vh) interfaceC2251pt.mo10258c5()).m11562k4(abstractC2220nx) : interfaceC2251pt.mo10258c5().mo10316kk()).m11687k4(c2372xo2);
        C2068ei c2068eiM11457x1 = m11457x1(interfaceC2251pt, abstractC2220nx, c2372xoM11687k4);
        if (c2068eiM11457x1 == null) {
            return;
        }
        mo10155k4(c2372xoM11687k4, c2068eiM11457x1, this.f7985k4);
    }

    /* JADX INFO: renamed from: k4 */
    public abstract void mo10155k4(C2372xo c2372xo, C2068ei c2068ei, InterfaceC2039cz interfaceC2039cz);
}

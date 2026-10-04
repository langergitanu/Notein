package o00000oo;

import Oooo0oO.C21064OoooOO0;
import Oooo0oO.InterfaceC21033OooOOOO;
import Oooo0oO.o00oO0O;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO extends kotlin.jvm.internal.OooOOOO implements InterfaceC32508OooOOOo<InterfaceC21033OooOOOO, Integer, C32460OooOooO> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ o00oO0O f81321OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO(o00oO0O o00oo0o) {
        super(2);
        this.f81321OooOo0o = o00oo0o;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final C32460OooOooO invoke(InterfaceC21033OooOOOO interfaceC21033OooOOOO, Integer num) {
        InterfaceC21033OooOOOO interfaceC21033OooOOOO2 = interfaceC21033OooOOOO;
        if ((num.intValue() & 11) == 2 && interfaceC21033OooOOOO2.OooO00o()) {
            interfaceC21033OooOOOO2.OooO0o();
        } else {
            C21064OoooOO0 c21064OoooOO0 = C24122OooO00o.f81293OooO00o;
            ((InterfaceC32508OooOOOo) this.f81321OooOo0o.getValue()).invoke(interfaceC21033OooOOOO2, 0);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}

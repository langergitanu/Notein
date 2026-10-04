package Oooo0;

import Oooo0oO.InterfaceC21033OooOOOO;
import OoooOoO.InterfaceC21233OooO0o;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o extends kotlin.jvm.internal.OooOOOO implements InterfaceC32508OooOOOo<InterfaceC21033OooOOOO, Integer, C32460OooOooO> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ int f59769OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC21233OooO0o f59770OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO00o(InterfaceC21233OooO0o interfaceC21233OooO0o, int i) {
        super(2);
        this.f59770OooOo0o = interfaceC21233OooO0o;
        this.f59769OooOo = i;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final C32460OooOooO invoke(InterfaceC21033OooOOOO interfaceC21033OooOOOO, Integer num) {
        InterfaceC21033OooOOOO interfaceC21033OooOOOO2 = interfaceC21033OooOOOO;
        if ((num.intValue() & 11) == 2 && interfaceC21033OooOOOO2.OooO00o()) {
            interfaceC21033OooOOOO2.OooO0o();
        } else {
            interfaceC21033OooOOOO2.OooOo00(1275643833);
            OooO0OO.OooO0O0(this.f59770OooOo0o, interfaceC21033OooOOOO2, (this.f59769OooOo >> 3) & 14);
            interfaceC21033OooOOOO2.OooOoo();
        }
        return C32460OooOooO.f116667OooO00o;
    }
}

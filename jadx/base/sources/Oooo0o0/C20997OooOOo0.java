package Oooo0o0;

import Oooo0oO.InterfaceC21033OooOOOO;
import o000oOoO.C24633OooO00o;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: renamed from: Oooo0o0.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20997OooOOo0 extends kotlin.jvm.internal.OooOOOO implements InterfaceC32508OooOOOo<InterfaceC21033OooOOOO, Integer, C32460OooOooO> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C24633OooO00o f60789OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C21018Oooo0o0 f60790OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ int f60791OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20997OooOOo0(C21018Oooo0o0 c21018Oooo0o0, C24633OooO00o c24633OooO00o, int i) {
        super(2);
        this.f60790OooOo0o = c21018Oooo0o0;
        this.f60789OooOo = c24633OooO00o;
        this.f60791OooOoO0 = i;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final C32460OooOooO invoke(InterfaceC21033OooOOOO interfaceC21033OooOOOO, Integer num) {
        InterfaceC21033OooOOOO interfaceC21033OooOOOO2 = interfaceC21033OooOOOO;
        if ((num.intValue() & 11) == 2 && interfaceC21033OooOOOO2.OooO00o()) {
            interfaceC21033OooOOOO2.OooO0o();
        } else {
            C21014Oooo00o.OooO00o(this.f60790OooOo0o.f60864OooOO0, this.f60789OooOo, interfaceC21033OooOOOO2, (this.f60791OooOoO0 >> 6) & 112);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}

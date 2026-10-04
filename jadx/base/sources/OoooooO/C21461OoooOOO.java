package OoooooO;

import Oooo0oO.InterfaceC21033OooOOOO;
import o000oOoO.C24633OooO00o;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: renamed from: OoooooO.OoooOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21461OoooOOO extends kotlin.jvm.internal.OooOOOO implements InterfaceC32508OooOOOo<InterfaceC21033OooOOOO, Integer, C32460OooOooO> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C21462OoooOOo f62135OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C24633OooO00o f62136OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21461OoooOOO(C24633OooO00o c24633OooO00o, C21462OoooOOo c21462OoooOOo) {
        super(2);
        this.f62136OooOo0o = c24633OooO00o;
        this.f62135OooOo = c21462OoooOOo;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final C32460OooOooO invoke(InterfaceC21033OooOOOO interfaceC21033OooOOOO, Integer num) {
        InterfaceC21033OooOOOO interfaceC21033OooOOOO2 = interfaceC21033OooOOOO;
        if ((num.intValue() & 11) == 2 && interfaceC21033OooOOOO2.OooO00o()) {
            interfaceC21033OooOOOO2.OooO0o();
        } else {
            C21462OoooOOo c21462OoooOOo = this.f62135OooOo;
            this.f62136OooOo0o.invoke(Float.valueOf(c21462OoooOOo.f62140OooO0oo.f62064OooO0oO), Float.valueOf(c21462OoooOOo.f62140OooO0oo.f62065OooO0oo), interfaceC21033OooOOOO2, 0);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}

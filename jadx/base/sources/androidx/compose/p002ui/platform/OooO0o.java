package androidx.compose.p002ui.platform;

import Oooo0oO.InterfaceC21033OooOOOO;
import kotlin.jvm.internal.OooOOOO;
import o000oOoO.C24633OooO00o;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0o extends OooOOOO implements InterfaceC32508OooOOOo<InterfaceC21033OooOOOO, Integer, C32460OooOooO> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C24633OooO00o f63507OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C21612OooO0oo f63508OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0o(C21612OooO0oo c21612OooO0oo, C24633OooO00o c24633OooO00o) {
        super(2);
        this.f63508OooOo0o = c21612OooO0oo;
        this.f63507OooOo = c24633OooO00o;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final C32460OooOooO invoke(InterfaceC21033OooOOOO interfaceC21033OooOOOO, Integer num) throws Throwable {
        InterfaceC21033OooOOOO interfaceC21033OooOOOO2 = interfaceC21033OooOOOO;
        if ((num.intValue() & 11) == 2 && interfaceC21033OooOOOO2.OooO00o()) {
            interfaceC21033OooOOOO2.OooO0o();
        } else {
            C21608OooO0Oo.OooO00o(this.f63508OooOo0o.f63514OooOo0o, this.f63507OooOo, interfaceC21033OooOOOO2, 8);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}

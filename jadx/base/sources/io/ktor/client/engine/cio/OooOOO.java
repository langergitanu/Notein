package io.ktor.client.engine.cio;

import io.ktor.utils.p616io.Oooo0;
import o0o00oOo.o0000O0O;
import oO00O0oo.C32222OooOO0o;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o0oOo.InterfaceC33899OooO0o;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOOO extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<Throwable, C32460OooOooO> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Oooo0 f80401OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Oooo0 f80402OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C23938OooOOo0 f80403OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ oO00O0oo.OooOO0O f80404OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO(Oooo0 oooo0, Oooo0 oooo02, oO00O0oo.OooOO0O oooOO0O, C23938OooOOo0 c23938OooOOo0) {
        super(1);
        this.f80402OooOo0o = oooo0;
        this.f80401OooOo = oooo02;
        this.f80404OooOoO0 = oooOO0O;
        this.f80403OooOoO = c23938OooOOo0;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final C32460OooOooO invoke(Throwable th) {
        Throwable th2 = th;
        Throwable thOooO00o = th2 != null ? o0000O0O.OooO00o(th2) : null;
        try {
            this.f80402OooOo0o.cancel(thOooO00o);
            this.f80401OooOo.OooO0Oo(thOooO00o);
            this.f80404OooOoO0.f115660OooO00o.close();
            C23938OooOOo0 c23938OooOOo0 = this.f80403OooOoO;
            C32222OooOO0o c32222OooOO0o = new C32222OooOO0o(c23938OooOOo0.f80431OooOo0o, c23938OooOOo0.f80430OooOo);
            C23934OooO0oo c23934OooO0oo = c23938OooOOo0.f80434OooOoOO;
            c23934OooO0oo.getClass();
            InterfaceC33899OooO0o interfaceC33899OooO0o = c23934OooO0oo.f80390OooO0OO.f115797OooOo0o.get(c32222OooOO0o);
            kotlin.jvm.internal.OooOOO0.OooO0Oo(interfaceC33899OooO0o);
            interfaceC33899OooO0o.release();
            c23934OooO0oo.f80389OooO0O0.release();
            C23938OooOOo0.f80429Oooo00O.decrementAndGet(c23938OooOOo0);
        } catch (Throwable unused) {
        }
        return C32460OooOooO.f116667OooO00o;
    }
}

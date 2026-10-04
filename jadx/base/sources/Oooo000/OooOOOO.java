package Oooo000;

import OooOoo.C20595OooO0o0;
import OooooO0.C21289OooO0o;
import OooooO0.C21290OooO0o0;
import OooooO0.C21291OooO0oO;
import o0000Ooo.C24237OooOO0o;
import oo000o.InterfaceC34635OooOOOO;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOOO extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C21291OooO0oO> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ InterfaceC34635OooOOOO f60286OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C20900OooOOOo f60287OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.OooOOOO f60288OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OooOOOO(C20900OooOOOo c20900OooOOOo, InterfaceC34635OooOOOO interfaceC34635OooOOOO, oO0O000o.OooO00o<C21291OooO0oO> oooO00o) {
        super(0);
        this.f60287OooOo0o = c20900OooOOOo;
        this.f60286OooOo = interfaceC34635OooOOOO;
        this.f60288OooOoO0 = (kotlin.jvm.internal.OooOOOO) oooO00o;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.internal.OooOOOO, oO0O000o.OooO00o] */
    @Override // oO0O000o.OooO00o
    public final C21291OooO0oO invoke() {
        InterfaceC34635OooOOOO interfaceC34635OooOOOO = this.f60286OooOo;
        ?? r1 = this.f60288OooOoO0;
        C20900OooOOOo c20900OooOOOo = this.f60287OooOo0o;
        C21291OooO0oO c21291OooO0oOOooO0o0 = C20900OooOOOo.OooO0o0(c20900OooOOOo, interfaceC34635OooOOOO, r1);
        if (c21291OooO0oOOooO0o0 == null) {
            return null;
        }
        C20595OooO0o0 c20595OooO0o0 = c20900OooOOOo.f60289OooOoO;
        if (c20595OooO0o0 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("responder");
            throw null;
        }
        if (C24237OooOO0o.OooO00o(c20595OooO0o0.f58882Oooo000, 0L)) {
            throw new IllegalStateException("Expected BringIntoViewRequester to not be used before parents are placed.");
        }
        long jOooOO0 = c20595OooO0o0.OooOO0(c21291OooO0oOOooO0o0, c20595OooO0o0.f58882Oooo000);
        return c21291OooO0oOOooO0o0.OooO0o(C21289OooO0o.OooO00o(-C21290OooO0o0.OooO0OO(jOooOO0), -C21290OooO0o0.OooO0Oo(jOooOO0)));
    }
}

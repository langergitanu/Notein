package oO0o0o0O;

import oO00o.InterfaceC32321OooO0oo;
import oO00ooO.C32446OooOOOo;
import oO0OO0oO.InterfaceC32925OooO0O0;
import oO0o0OO.C33614OooOOO0;

/* JADX INFO: renamed from: oO0o0o0O.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33861OooO0Oo implements InterfaceC32321OooO0oo<Object> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C33614OooOOO0 f121998OooOo0o;

    public C33861OooO0Oo(C33614OooOOO0 c33614OooOOO0) {
        this.f121998OooOo0o = c33614OooOOO0;
    }

    @Override // oO00o.InterfaceC32321OooO0oo
    public final void OooO00o(InterfaceC32925OooO0O0 interfaceC32925OooO0O0) {
        this.f121998OooOo0o.OooOo0(new C33860OooO0OO(interfaceC32925OooO0O0, 0));
    }

    @Override // oO00o.InterfaceC32321OooO0oo
    public final void onError(Throwable th) {
        this.f121998OooOo0o.resumeWith(C32446OooOOOo.OooO00o(th));
    }

    @Override // oO00o.InterfaceC32321OooO0oo
    public final void onSuccess(Object obj) {
        this.f121998OooOo0o.resumeWith(obj);
    }
}

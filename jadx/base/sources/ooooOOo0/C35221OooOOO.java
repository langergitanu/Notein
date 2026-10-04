package ooooOOo0;

import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: ooooOOo0.OooOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C35221OooOOO extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<Throwable, C32460OooOooO> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC35211OooO0O0 f126455OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35221OooOOO(InterfaceC35211OooO0O0 interfaceC35211OooO0O0) {
        super(1);
        this.f126455OooOo0o = interfaceC35211OooO0O0;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final C32460OooOooO invoke(Throwable th) {
        this.f126455OooOo0o.cancel();
        return C32460OooOooO.f116667OooO00o;
    }
}

package oO000oO0;

import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import okhttp3.internal.connection.RealCall;

/* JADX INFO: renamed from: oO000oO0.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32113OooOO0o extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<Throwable, C32460OooOooO> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ RealCall f115141OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32113OooOO0o(RealCall realCall) {
        super(1);
        this.f115141OooOo0o = realCall;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final C32460OooOooO invoke(Throwable th) {
        this.f115141OooOo0o.cancel();
        return C32460OooOooO.f116667OooO00o;
    }
}

package o0000OO0;

import android.os.CancellationSignal;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0 extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<Throwable, C32460OooOooO> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ CancellationSignal f81433OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0(CancellationSignal cancellationSignal) {
        super(1);
        this.f81433OooOo0o = cancellationSignal;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final C32460OooOooO invoke(Throwable th) {
        this.f81433OooOo0o.cancel();
        return C32460OooOooO.f116667OooO00o;
    }
}

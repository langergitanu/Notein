package oO000o;

import java.util.concurrent.CancellationException;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o0OO.C33671o00oO0o;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOOO extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<Throwable, C32460OooOooO> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C33671o00oO0o f114933OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO(C33671o00oO0o c33671o00oO0o) {
        super(1);
        this.f114933OooOo0o = c33671o00oO0o;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final C32460OooOooO invoke(Throwable th) {
        Throwable th2 = th;
        if (th2 != null) {
            this.f114933OooOo0o.OooOo0O(new CancellationException(th2.getMessage()));
        }
        return C32460OooOooO.f116667OooO00o;
    }
}

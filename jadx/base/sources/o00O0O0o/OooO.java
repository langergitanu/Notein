package o00O0O0o;

import java.util.concurrent.CancellationException;
import o00O0o00.C24932OooO0OO;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: loaded from: classes.dex */
public final class OooO extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<Throwable, C32460OooOooO> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ OooOO0<Object> f84225OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO(OooOO0<Object> oooOO02) {
        super(1);
        this.f84225OooOo0o = oooOO02;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final C32460OooOooO invoke(Throwable th) {
        Throwable th2 = th;
        OooOO0<Object> oooOO02 = this.f84225OooOo0o;
        if (th2 == null) {
            if (!oooOO02.f84254OooOo0o.isDone()) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        } else if (th2 instanceof CancellationException) {
            oooOO02.f84254OooOo0o.cancel(true);
        } else {
            C24932OooO0OO<Object> c24932OooO0OO = oooOO02.f84254OooOo0o;
            Throwable cause = th2.getCause();
            if (cause != null) {
                th2 = cause;
            }
            c24932OooO0OO.OooOO0(th2);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}

package oO0o0OO;

import java.util.concurrent.ScheduledFuture;

/* JADX INFO: renamed from: oO0o0OO.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33601OooO implements InterfaceC33610OooOO0 {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final ScheduledFuture f121271OooOo0o;

    public C33601OooO(ScheduledFuture scheduledFuture) {
        this.f121271OooOo0o = scheduledFuture;
    }

    @Override // oO0o0OO.InterfaceC33610OooOO0
    public final void OooO00o(Throwable th) {
        this.f121271OooOo0o.cancel(false);
    }

    public final String toString() {
        return "CancelFutureOnCancel[" + this.f121271OooOo0o + ']';
    }
}

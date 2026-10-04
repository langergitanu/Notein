package oO0o0OO;

import java.util.concurrent.ScheduledFuture;

/* JADX INFO: renamed from: oO0o0OO.OoooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33650OoooOo0 implements InterfaceC33651OoooOoO {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final ScheduledFuture f121330OooOo0o;

    public C33650OoooOo0(ScheduledFuture scheduledFuture) {
        this.f121330OooOo0o = scheduledFuture;
    }

    @Override // oO0o0OO.InterfaceC33651OoooOoO
    public final void dispose() {
        this.f121330OooOo0o.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f121330OooOo0o + ']';
    }
}

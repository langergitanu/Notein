package oOo00OoO;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: oOo00OoO.OooOO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34530OooOO0O extends C34547OooOoo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public C34547OooOoo f123741OooO00o;

    public C34530OooOO0O(C34547OooOoo delegate) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(delegate, "delegate");
        this.f123741OooO00o = delegate;
    }

    @Override // oOo00OoO.C34547OooOoo
    public final C34547OooOoo clearDeadline() {
        return this.f123741OooO00o.clearDeadline();
    }

    @Override // oOo00OoO.C34547OooOoo
    public final C34547OooOoo clearTimeout() {
        return this.f123741OooO00o.clearTimeout();
    }

    @Override // oOo00OoO.C34547OooOoo
    public final long deadlineNanoTime() {
        return this.f123741OooO00o.deadlineNanoTime();
    }

    @Override // oOo00OoO.C34547OooOoo
    /* JADX INFO: renamed from: hasDeadline */
    public final boolean getHasDeadline() {
        return this.f123741OooO00o.getHasDeadline();
    }

    @Override // oOo00OoO.C34547OooOoo
    public final void throwIfReached() throws IOException {
        this.f123741OooO00o.throwIfReached();
    }

    @Override // oOo00OoO.C34547OooOoo
    public final C34547OooOoo timeout(long j, TimeUnit unit) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(unit, "unit");
        return this.f123741OooO00o.timeout(j, unit);
    }

    @Override // oOo00OoO.C34547OooOoo
    /* JADX INFO: renamed from: timeoutNanos */
    public final long getTimeoutNanos() {
        return this.f123741OooO00o.getTimeoutNanos();
    }

    @Override // oOo00OoO.C34547OooOoo
    public final C34547OooOoo deadlineNanoTime(long j) {
        return this.f123741OooO00o.deadlineNanoTime(j);
    }
}

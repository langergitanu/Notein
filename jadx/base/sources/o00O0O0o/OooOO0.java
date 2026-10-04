package o00O0O0o;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import o00O0o00.AbstractC24926OooO00o;
import o00O0o00.C24932OooO0OO;
import oO0o0OO.C33671o00oO0o;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0<R> implements ListenableFuture<R> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C24932OooO0OO<R> f84254OooOo0o = new C24932OooO0OO<>();

    public OooOO0(C33671o00oO0o c33671o00oO0o) {
        c33671o00oO0o.invokeOnCompletion(new OooO(this));
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        this.f84254OooOo0o.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.f84254OooOo0o.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public final R get() {
        return this.f84254OooOo0o.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f84254OooOo0o.f84573OooOo0o instanceof AbstractC24926OooO00o.OooO0O0;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f84254OooOo0o.isDone();
    }

    @Override // java.util.concurrent.Future
    public final R get(long j, TimeUnit timeUnit) {
        return this.f84254OooOo0o.get(j, timeUnit);
    }
}

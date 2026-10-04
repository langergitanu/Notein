package androidx.concurrent.futures;

import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: androidx.concurrent.futures.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21619OooO0oO<T> implements ListenableFuture<T> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final OooO00o f63603OooOo = new OooO00o();

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final WeakReference<C21617OooO0Oo<T>> f63604OooOo0o;

    /* JADX INFO: renamed from: androidx.concurrent.futures.OooO0oO$OooO00o */
    public class OooO00o extends OooO0OO<T> {
        public OooO00o() {
        }

        @Override // androidx.concurrent.futures.OooO0OO
        public final String pendingToString() {
            C21617OooO0Oo<T> c21617OooO0Oo = C21619OooO0oO.this.f63604OooOo0o.get();
            return c21617OooO0Oo == null ? "Completer object has been garbage collected, future will fail soon" : OooO0o.OooO0O0(new StringBuilder("tag=["), c21617OooO0Oo.f63599OooO00o, "]");
        }
    }

    public C21619OooO0oO(C21617OooO0Oo<T> c21617OooO0Oo) {
        this.f63604OooOo0o = new WeakReference<>(c21617OooO0Oo);
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        this.f63603OooOo.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        C21617OooO0Oo<T> c21617OooO0Oo = this.f63604OooOo0o.get();
        boolean zCancel = this.f63603OooOo.cancel(z);
        if (zCancel && c21617OooO0Oo != null) {
            c21617OooO0Oo.f63599OooO00o = null;
            c21617OooO0Oo.f63600OooO0O0 = null;
            c21617OooO0Oo.f63601OooO0OO.set(null);
        }
        return zCancel;
    }

    @Override // java.util.concurrent.Future
    public final T get() throws ExecutionException, InterruptedException {
        return this.f63603OooOo.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f63603OooOo.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f63603OooOo.isDone();
    }

    public final String toString() {
        return this.f63603OooOo.toString();
    }

    @Override // java.util.concurrent.Future
    public final T get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.f63603OooOo.get(j, timeUnit);
    }
}

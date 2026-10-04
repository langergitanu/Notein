package o0oooOOo;

import android.accounts.OperationCanceledException;
import android.os.Looper;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import o0oooOo.C31853OooO0OO;

/* JADX INFO: renamed from: o0oooOOo.OooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31850OooOO0<V> extends FutureTask<V> {
    public final V OooO00o() throws OperationCanceledException, IOException, C31853OooO0OO {
        Looper looperMyLooper;
        TimeUnit timeUnit = TimeUnit.MINUTES;
        if (!isDone() && (looperMyLooper = Looper.myLooper()) != null && looperMyLooper == Looper.getMainLooper()) {
            throw new IllegalStateException("calling this from your main thread can lead to deadlock");
        }
        try {
            try {
                return get(10L, timeUnit);
            } catch (InterruptedException | TimeoutException unused) {
                cancel(true);
                throw new OperationCanceledException();
            } catch (CancellationException unused2) {
                throw new OperationCanceledException();
            } catch (ExecutionException e) {
                Throwable cause = e.getCause();
                if (cause instanceof IOException) {
                    throw ((IOException) cause);
                }
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                if (cause instanceof C31853OooO0OO) {
                    throw ((C31853OooO0OO) cause);
                }
                if (cause instanceof OperationCanceledException) {
                    throw ((OperationCanceledException) cause);
                }
                throw new C31853OooO0OO(cause);
            }
        } finally {
            cancel(true);
        }
    }
}

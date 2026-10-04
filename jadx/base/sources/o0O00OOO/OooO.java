package o0O00OOO;

import android.os.Looper;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import o0O00Oo.OooO;

/* JADX INFO: loaded from: classes8.dex */
public final class OooO {
    public static Object OooO00o(OooO0o oooO0o, long j) throws ExecutionException, InterruptedException, TimeoutException {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("await must not be called on the UI thread");
        }
        if (!oooO0o.OooO0oo()) {
            OooO.OooO00o oooO00o = new OooO.OooO00o();
            oooO0o.OooO0o0(oooO00o).OooO0OO(oooO00o);
            if (!oooO00o.f88155OooO00o.await(j, timeUnit)) {
                throw new TimeoutException("Timed out waiting for Task");
            }
        }
        if (oooO0o.OooO()) {
            return oooO0o.OooO0oO();
        }
        throw new ExecutionException(oooO0o.OooO0o());
    }
}

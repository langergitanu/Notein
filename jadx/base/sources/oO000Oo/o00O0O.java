package oO000Oo;

import com.google.common.base.Preconditions;
import com.google.common.base.Throwables;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes10.dex */
public final class o00O0O implements Runnable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final Logger f114604OooOo = Logger.getLogger(o00O0O.class.getName());

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final Runnable f114605OooOo0o;

    public o00O0O(Runnable runnable) {
        this.f114605OooOo0o = (Runnable) Preconditions.checkNotNull(runnable, "task");
    }

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnable = this.f114605OooOo0o;
        try {
            runnable.run();
        } catch (Throwable th) {
            f114604OooOo.log(Level.SEVERE, "Exception while executing runnable " + runnable, th);
            Throwables.throwIfUnchecked(th);
            throw new AssertionError(th);
        }
    }

    public final String toString() {
        return "LogExceptionRunnable(" + this.f114605OooOo0o + ")";
    }
}

package oOo00OoO;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import kotlin.Metadata;

/* JADX INFO: renamed from: oOo00OoO.OooOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u0000 &2\u00020\u0001:\u0001'B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0005\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\nJ\u0017\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\bJ\u000f\u0010\u0012\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0003J\u0015\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ/\u0010\"\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001e2\u0006\u0010\u001f\u001a\u00020\u00002\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000 H\u0086\bø\u0001\u0000¢\u0006\u0004\b\"\u0010#R\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010$R\u0016\u0010\u000e\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010%R\u0016\u0010\t\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010%\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006("}, m80612d2 = {"LoOo00OoO/OooOoo;", "", "<init>", "()V", "", "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "(JLjava/util/concurrent/TimeUnit;)LoOo00OoO/OooOoo;", "timeoutNanos", "()J", "", "hasDeadline", "()Z", "deadlineNanoTime", "(J)LoOo00OoO/OooOoo;", "duration", "deadline", "clearTimeout", "()LoOo00OoO/OooOoo;", "clearDeadline", "LoO00ooO/OooOooO;", "throwIfReached", "Ljava/util/concurrent/locks/Condition;", "condition", "awaitSignal", "(Ljava/util/concurrent/locks/Condition;)V", "monitor", "waitUntilNotified", "(Ljava/lang/Object;)V", "T", "other", "Lkotlin/Function0;", "block", "intersectWith", "(LoOo00OoO/OooOoo;LoO0O000o/OooO00o;)Ljava/lang/Object;", "Z", "J", "Companion", "OooO0O0", "okio"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
public class C34547OooOoo {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final C34547OooOoo NONE = new OooO00o();
    private long deadlineNanoTime;
    private boolean hasDeadline;
    private long timeoutNanos;

    /* JADX INFO: renamed from: oOo00OoO.OooOoo$OooO00o */
    public static final class OooO00o extends C34547OooOoo {
        @Override // oOo00OoO.C34547OooOoo
        public final C34547OooOoo deadlineNanoTime(long j) {
            return this;
        }

        @Override // oOo00OoO.C34547OooOoo
        public final void throwIfReached() {
        }

        @Override // oOo00OoO.C34547OooOoo
        public final C34547OooOoo timeout(long j, TimeUnit unit) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(unit, "unit");
            return this;
        }
    }

    /* JADX INFO: renamed from: oOo00OoO.OooOoo$OooO0O0, reason: from kotlin metadata */
    public static final class Companion {
    }

    public final void awaitSignal(Condition condition) throws InterruptedIOException {
        kotlin.jvm.internal.OooOOO0.OooO0oO(condition, "condition");
        try {
            boolean hasDeadline = getHasDeadline();
            long timeoutNanos = getTimeoutNanos();
            long jNanoTime = 0;
            if (!hasDeadline && timeoutNanos == 0) {
                condition.await();
                return;
            }
            long jNanoTime2 = System.nanoTime();
            if (hasDeadline && timeoutNanos != 0) {
                timeoutNanos = Math.min(timeoutNanos, deadlineNanoTime() - jNanoTime2);
            } else if (hasDeadline) {
                timeoutNanos = deadlineNanoTime() - jNanoTime2;
            }
            if (timeoutNanos > 0) {
                condition.await(timeoutNanos, TimeUnit.NANOSECONDS);
                jNanoTime = System.nanoTime() - jNanoTime2;
            }
            if (jNanoTime >= timeoutNanos) {
                throw new InterruptedIOException("timeout");
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }

    public C34547OooOoo clearDeadline() {
        this.hasDeadline = false;
        return this;
    }

    public C34547OooOoo clearTimeout() {
        this.timeoutNanos = 0L;
        return this;
    }

    public final C34547OooOoo deadline(long duration, TimeUnit unit) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(unit, "unit");
        if (duration <= 0) {
            throw new IllegalArgumentException(androidx.concurrent.futures.OooO00o.OooO0O0(duration, "duration <= 0: ").toString());
        }
        return deadlineNanoTime(unit.toNanos(duration) + System.nanoTime());
    }

    public long deadlineNanoTime() {
        if (this.hasDeadline) {
            return this.deadlineNanoTime;
        }
        throw new IllegalStateException("No deadline");
    }

    /* JADX INFO: renamed from: hasDeadline, reason: from getter */
    public boolean getHasDeadline() {
        return this.hasDeadline;
    }

    public final <T> T intersectWith(C34547OooOoo other, oO0O000o.OooO00o<? extends T> block) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(other, "other");
        kotlin.jvm.internal.OooOOO0.OooO0oO(block, "block");
        long timeoutNanos = getTimeoutNanos();
        Companion companion = INSTANCE;
        long timeoutNanos2 = other.getTimeoutNanos();
        long timeoutNanos3 = getTimeoutNanos();
        companion.getClass();
        if (timeoutNanos2 == 0 || (timeoutNanos3 != 0 && timeoutNanos2 >= timeoutNanos3)) {
            timeoutNanos2 = timeoutNanos3;
        }
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        timeout(timeoutNanos2, timeUnit);
        if (!getHasDeadline()) {
            if (other.getHasDeadline()) {
                deadlineNanoTime(other.deadlineNanoTime());
            }
            try {
                T tInvoke = block.invoke();
                timeout(timeoutNanos, timeUnit);
                if (other.getHasDeadline()) {
                    clearDeadline();
                }
                return tInvoke;
            } catch (Throwable th) {
                timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                if (other.getHasDeadline()) {
                    clearDeadline();
                }
                throw th;
            }
        }
        long jDeadlineNanoTime = deadlineNanoTime();
        if (other.getHasDeadline()) {
            deadlineNanoTime(Math.min(deadlineNanoTime(), other.deadlineNanoTime()));
        }
        try {
            T tInvoke2 = block.invoke();
            timeout(timeoutNanos, timeUnit);
            if (other.getHasDeadline()) {
                deadlineNanoTime(jDeadlineNanoTime);
            }
            return tInvoke2;
        } catch (Throwable th2) {
            timeout(timeoutNanos, TimeUnit.NANOSECONDS);
            if (other.getHasDeadline()) {
                deadlineNanoTime(jDeadlineNanoTime);
            }
            throw th2;
        }
    }

    public void throwIfReached() throws IOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.hasDeadline && this.deadlineNanoTime - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public C34547OooOoo timeout(long timeout, TimeUnit unit) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(unit, "unit");
        if (timeout < 0) {
            throw new IllegalArgumentException(androidx.concurrent.futures.OooO00o.OooO0O0(timeout, "timeout < 0: ").toString());
        }
        this.timeoutNanos = unit.toNanos(timeout);
        return this;
    }

    /* JADX INFO: renamed from: timeoutNanos, reason: from getter */
    public long getTimeoutNanos() {
        return this.timeoutNanos;
    }

    public final void waitUntilNotified(Object monitor) throws InterruptedIOException {
        kotlin.jvm.internal.OooOOO0.OooO0oO(monitor, "monitor");
        try {
            boolean hasDeadline = getHasDeadline();
            long timeoutNanos = getTimeoutNanos();
            long jNanoTime = 0;
            if (!hasDeadline && timeoutNanos == 0) {
                monitor.wait();
                return;
            }
            long jNanoTime2 = System.nanoTime();
            if (hasDeadline && timeoutNanos != 0) {
                timeoutNanos = Math.min(timeoutNanos, deadlineNanoTime() - jNanoTime2);
            } else if (hasDeadline) {
                timeoutNanos = deadlineNanoTime() - jNanoTime2;
            }
            if (timeoutNanos > 0) {
                long j = timeoutNanos / 1000000;
                monitor.wait(j, (int) (timeoutNanos - (1000000 * j)));
                jNanoTime = System.nanoTime() - jNanoTime2;
            }
            if (jNanoTime >= timeoutNanos) {
                throw new InterruptedIOException("timeout");
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }

    public C34547OooOoo deadlineNanoTime(long deadlineNanoTime) {
        this.hasDeadline = true;
        this.deadlineNanoTime = deadlineNanoTime;
        return this;
    }
}

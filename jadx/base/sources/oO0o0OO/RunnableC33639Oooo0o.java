package oO0o0OO;

import androidx.core.location.LocationRequestCompat;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import oO0o0OO.AbstractC33656OooooOO;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: oO0o0OO.Oooo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class RunnableC33639Oooo0o extends AbstractC33656OooooOO implements Runnable {

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public static final RunnableC33639Oooo0o f121321Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public static final long f121322Oooo00O;
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    static {
        Long l;
        RunnableC33639Oooo0o runnableC33639Oooo0o = new RunnableC33639Oooo0o();
        f121321Oooo000 = runnableC33639Oooo0o;
        runnableC33639Oooo0o.o000Oo0O(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        f121322Oooo00O = timeUnit.toNanos(l.longValue());
    }

    @Override // oO0o0OO.AbstractC33656OooooOO, oO0o0OO.InterfaceC33645OoooO00
    public final InterfaceC33651OoooOoO OooOooo(long j, Runnable runnable, InterfaceC34415OooO0oo interfaceC34415OooO0oo) {
        long j2 = j > 0 ? j >= 9223372036854L ? LocationRequestCompat.PASSIVE_INTERVAL : 1000000 * j : 0L;
        if (j2 >= 4611686018427387903L) {
            return o000000.f121353OooOo0o;
        }
        long jNanoTime = System.nanoTime();
        AbstractC33656OooooOO.OooO0O0 oooO0O0 = new AbstractC33656OooooOO.OooO0O0(runnable, j2 + jNanoTime);
        o000o00(jNanoTime, oooO0O0);
        return oooO0O0;
    }

    @Override // oO0o0OO.AbstractC33658OooooOo
    public final Thread o000OoOO() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 != null) {
            return thread2;
        }
        synchronized (this) {
            thread = _thread;
            if (thread == null) {
                thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                _thread = thread;
                thread.setContextClassLoader(f121321Oooo000.getClass().getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // oO0o0OO.AbstractC33658OooooOo
    public final void o000OoOo(long j, AbstractC33656OooooOO.OooO0OO oooO0OO) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // oO0o0OO.AbstractC33656OooooOO
    public final void o000Ooo0(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.o000Ooo0(runnable);
    }

    public final synchronized void o000o00O() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            AbstractC33656OooooOO.f121338OooOoo.set(this, null);
            AbstractC33656OooooOO.f121339OooOooO.set(this, null);
            notifyAll();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zO000o000;
        o0000Ooo.f121365OooO00o.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    if (zO000o000) {
                        return;
                    } else {
                        return;
                    }
                }
                debugStatus = 1;
                notifyAll();
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long jO000Oo0o = o000Oo0o();
                    if (jO000Oo0o == LocationRequestCompat.PASSIVE_INTERVAL) {
                        long jNanoTime = System.nanoTime();
                        if (j == LocationRequestCompat.PASSIVE_INTERVAL) {
                            j = f121322Oooo00O + jNanoTime;
                        }
                        long j2 = j - jNanoTime;
                        if (j2 <= 0) {
                            _thread = null;
                            o000o00O();
                            if (o000o000()) {
                                return;
                            }
                            o000OoOO();
                            return;
                        }
                        if (jO000Oo0o > j2) {
                            jO000Oo0o = j2;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (jO000Oo0o > 0) {
                        int i2 = debugStatus;
                        if (i2 == 2 || i2 == 3) {
                            _thread = null;
                            o000o00O();
                            if (o000o000()) {
                                return;
                            }
                            o000OoOO();
                            return;
                        }
                        LockSupport.parkNanos(this, jO000Oo0o);
                    }
                }
            }
        } finally {
            _thread = null;
            o000o00O();
            if (!o000o000()) {
                o000OoOO();
            }
        }
    }

    @Override // oO0o0OO.AbstractC33656OooooOO, oO0o0OO.AbstractC33655OooooO0
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // oO0o0OO.AbstractC33630OooOooO
    public final String toString() {
        return "DefaultExecutor";
    }
}

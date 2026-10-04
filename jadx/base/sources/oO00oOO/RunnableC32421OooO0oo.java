package oO00oOO;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;
import oO0OO0oO.InterfaceC32925OooO0O0;
import oO0OO0oO.InterfaceC32926OooO0OO;

/* JADX INFO: renamed from: oO00oOO.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class RunnableC32421OooO0oo extends AtomicReferenceArray<Object> implements Runnable, Callable<Object>, InterfaceC32925OooO0O0 {
    private static final long serialVersionUID = -6120223772001106981L;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final Runnable f116578OooOo0o;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final Object f116574OooOo = new Object();

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final Object f116576OooOoO0 = new Object();

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final Object f116575OooOoO = new Object();

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public static final Object f116577OooOoOO = new Object();

    public RunnableC32421OooO0oo(Runnable runnable, InterfaceC32926OooO0OO interfaceC32926OooO0OO) {
        super(3);
        this.f116578OooOo0o = runnable;
        lazySet(0, interfaceC32926OooO0OO);
    }

    public final void OooO00o(Future<?> future) {
        Object obj;
        do {
            obj = get(1);
            if (obj == f116577OooOoOO) {
                return;
            }
            if (obj == f116576OooOoO0) {
                future.cancel(false);
                return;
            } else if (obj == f116575OooOoO) {
                future.cancel(true);
                return;
            }
        } while (!compareAndSet(1, obj, future));
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        run();
        return null;
    }

    @Override // oO0OO0oO.InterfaceC32925OooO0O0
    public final void dispose() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        while (true) {
            Object obj6 = get(1);
            obj = f116577OooOoOO;
            if (obj6 == obj || obj6 == (obj4 = f116576OooOoO0) || obj6 == (obj5 = f116575OooOoO)) {
                break;
            }
            boolean z = get(2) != Thread.currentThread();
            if (z) {
                obj4 = obj5;
            }
            if (compareAndSet(1, obj6, obj4)) {
                if (obj6 != null) {
                    ((Future) obj6).cancel(z);
                }
            }
        }
        do {
            obj2 = get(0);
            if (obj2 == obj || obj2 == (obj3 = f116574OooOo) || obj2 == null) {
                return;
            }
        } while (!compareAndSet(0, obj2, obj3));
        ((InterfaceC32926OooO0OO) obj2).OooO00o(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        boolean zCompareAndSet;
        Object obj2;
        Object obj3 = f116575OooOoO;
        Object obj4 = f116576OooOoO0;
        Object obj5 = f116574OooOo;
        Object obj6 = f116577OooOoOO;
        lazySet(2, Thread.currentThread());
        try {
            this.f116578OooOo0o.run();
        } finally {
            try {
            } catch (Throwable th) {
                do {
                    if (obj == obj4 || obj == obj3) {
                        break;
                    }
                } while (!zCompareAndSet);
            }
        }
        lazySet(2, null);
        Object obj7 = get(0);
        if (obj7 != obj5 && compareAndSet(0, obj7, obj6) && obj7 != null) {
            ((InterfaceC32926OooO0OO) obj7).OooO00o(this);
        }
        do {
            obj2 = get(1);
            if (obj2 == obj4 || obj2 == obj3) {
                return;
            }
        } while (!compareAndSet(1, obj2, obj6));
    }
}

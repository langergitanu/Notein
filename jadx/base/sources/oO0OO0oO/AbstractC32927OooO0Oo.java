package oO0OO0oO;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: oO0OO0oO.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC32927OooO0Oo<T> extends AtomicReference<T> implements InterfaceC32925OooO0O0 {
    private static final long serialVersionUID = 6537757548749041217L;

    public final boolean OooO00o() {
        return get() == null;
    }

    @Override // oO0OO0oO.InterfaceC32925OooO0O0
    public final void dispose() {
        T andSet;
        if (get() == null || (andSet = getAndSet(null)) == null) {
            return;
        }
        ((Runnable) andSet).run();
    }
}

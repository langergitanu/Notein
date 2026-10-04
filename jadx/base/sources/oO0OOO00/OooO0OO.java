package oO0OOO00;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public abstract class OooO0OO<T> extends AtomicReference<T> implements OooO0O0 {
    private static final long serialVersionUID = 6537757548749041217L;

    public final boolean OooO00o() {
        return get() == null;
    }

    @Override // oO0OOO00.OooO0O0
    public final void dispose() {
        T andSet;
        if (get() == null || (andSet = getAndSet(null)) == null) {
            return;
        }
        ((Runnable) andSet).run();
    }
}

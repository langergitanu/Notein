package oO0o0OO;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.Continuation;
import oO0o0Ooo.C33824OooO0o;
import oO0o0Ooo.C33826OooO0oO;
import oO0o0Ooo.C33839OooOo0;

/* JADX INFO: renamed from: oO0o0OO.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33616OooOOOo extends AbstractC33673o0ooOO0 {

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final C33614OooOOO0<?> f121301OooOoOO;

    public C33616OooOOOo(C33614OooOOO0<?> c33614OooOOO0) {
        this.f121301OooOoOO = c33614OooOOO0;
    }

    @Override // oO0o0OO.AbstractC33673o0ooOO0
    public final boolean OooO() {
        return true;
    }

    @Override // oO0o0OO.AbstractC33673o0ooOO0
    public final void OooOO0(Throwable th) {
        o0ooOOo o0oooooOooO0oo = OooO0oo();
        C33614OooOOO0<?> c33614OooOOO0 = this.f121301OooOoOO;
        Throwable thOooOOo0 = c33614OooOOO0.OooOOo0(o0oooooOooO0oo);
        if (c33614OooOOO0.OooOoO0()) {
            Continuation<?> continuation = c33614OooOOO0.f121298OooOoO;
            kotlin.jvm.internal.OooOOO0.OooO0o0(continuation, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            C33824OooO0o c33824OooO0o = (C33824OooO0o) continuation;
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C33824OooO0o.f121918OooOooO;
                Object obj = atomicReferenceFieldUpdater.get(c33824OooO0o);
                C33839OooOo0 c33839OooOo0 = C33826OooO0oO.f121925OooO0O0;
                if (!kotlin.jvm.internal.OooOOO0.OooO0O0(obj, c33839OooOo0)) {
                    if (!(obj instanceof Throwable)) {
                        while (!atomicReferenceFieldUpdater.compareAndSet(c33824OooO0o, obj, null)) {
                            if (atomicReferenceFieldUpdater.get(c33824OooO0o) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    return;
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(c33824OooO0o, c33839OooOo0, thOooOOo0)) {
                    if (atomicReferenceFieldUpdater.get(c33824OooO0o) != c33839OooOo0) {
                        break;
                    }
                }
                return;
            }
        }
        c33614OooOOO0.cancel(thOooOOo0);
        c33614OooOOO0.OooOOO0();
    }
}

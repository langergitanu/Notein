package oO0OOOo0;

import java.util.concurrent.atomic.AtomicInteger;
import oO0OOOoo.InterfaceC33029OooO0oO;
import oO0OooOO.InterfaceC33493OooO0oo;

/* JADX INFO: renamed from: oO0OOOo0.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33006OooO0o0<T> extends AtomicInteger implements InterfaceC33029OooO0oO<T> {
    private static final long serialVersionUID = -3830916580126663321L;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final InterfaceC33493OooO0oo f119399OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final T f119400OooOo0o;

    /* JADX WARN: Multi-variable type inference failed */
    public C33006OooO0o0(InterfaceC33493OooO0oo interfaceC33493OooO0oo, Object obj) {
        this.f119399OooOo = interfaceC33493OooO0oo;
        this.f119400OooOo0o = obj;
    }

    @Override // oO0OOOoo.InterfaceC33027OooO0o
    public final int OooO0O0(int i) {
        return 1;
    }

    @Override // oOO00OOO.OooO0OO
    public final void cancel() {
        lazySet(2);
    }

    @Override // oO0OOOoo.InterfaceC33031OooOO0
    public final void clear() {
        lazySet(1);
    }

    @Override // oO0OOOoo.InterfaceC33031OooOO0
    public final boolean isEmpty() {
        return get() != 0;
    }

    @Override // oO0OOOoo.InterfaceC33031OooOO0
    public final boolean offer(T t) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // oO0OOOoo.InterfaceC33031OooOO0
    public final T poll() {
        if (get() != 0) {
            return null;
        }
        lazySet(1);
        return this.f119400OooOo0o;
    }

    @Override // oOO00OOO.OooO0OO
    public final void request(long j) {
        if (EnumC33007OooO0oO.OooO0OO(j) && compareAndSet(0, 1)) {
            InterfaceC33493OooO0oo interfaceC33493OooO0oo = this.f119399OooOo;
            interfaceC33493OooO0oo.onNext(this.f119400OooOo0o);
            if (get() != 2) {
                interfaceC33493OooO0oo.onComplete();
            }
        }
    }
}

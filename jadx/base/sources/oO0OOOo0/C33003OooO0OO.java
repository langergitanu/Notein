package oO0OOOo0;

import oO0OooOO.InterfaceC33493OooO0oo;

/* JADX INFO: renamed from: oO0OOOo0.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C33003OooO0OO<T> extends AbstractC33001OooO00o<T> {
    private static final long serialVersionUID = -2151279923272604993L;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public T f119388OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final InterfaceC33493OooO0oo f119389OooOo0o;

    public C33003OooO0OO(InterfaceC33493OooO0oo interfaceC33493OooO0oo) {
        this.f119389OooOo0o = interfaceC33493OooO0oo;
    }

    @Override // oO0OOOoo.InterfaceC33027OooO0o
    public final int OooO0O0(int i) {
        lazySet(8);
        return 2;
    }

    public final void OooO0o0(T t) {
        int i = get();
        do {
            InterfaceC33493OooO0oo interfaceC33493OooO0oo = this.f119389OooOo0o;
            if (i == 8) {
                this.f119388OooOo = t;
                lazySet(16);
                interfaceC33493OooO0oo.onNext(t);
                if (get() != 4) {
                    interfaceC33493OooO0oo.onComplete();
                    return;
                }
                return;
            }
            if ((i & (-3)) != 0) {
                return;
            }
            if (i == 2) {
                lazySet(3);
                interfaceC33493OooO0oo.onNext(t);
                if (get() != 4) {
                    interfaceC33493OooO0oo.onComplete();
                    return;
                }
                return;
            }
            this.f119388OooOo = t;
            if (compareAndSet(0, 1)) {
                return;
            } else {
                i = get();
            }
        } while (i != 4);
        this.f119388OooOo = null;
    }

    @Override // oO0OOOoo.InterfaceC33031OooOO0
    public final void clear() {
        lazySet(32);
        this.f119388OooOo = null;
    }

    @Override // oO0OOOoo.InterfaceC33031OooOO0
    public final boolean isEmpty() {
        return get() != 16;
    }

    public void onSuccess(T t) {
        OooO0o0(t);
    }

    @Override // oO0OOOoo.InterfaceC33031OooOO0
    public final T poll() {
        if (get() != 16) {
            return null;
        }
        lazySet(32);
        T t = this.f119388OooOo;
        this.f119388OooOo = null;
        return t;
    }

    @Override // oOO00OOO.OooO0OO
    public final void request(long j) {
        T t;
        if (EnumC33007OooO0oO.OooO0OO(j)) {
            do {
                int i = get();
                if ((i & (-2)) != 0) {
                    return;
                }
                if (i == 1) {
                    if (!compareAndSet(1, 3) || (t = this.f119388OooOo) == null) {
                        return;
                    }
                    this.f119388OooOo = null;
                    InterfaceC33493OooO0oo interfaceC33493OooO0oo = this.f119389OooOo0o;
                    interfaceC33493OooO0oo.onNext(t);
                    if (get() != 4) {
                        interfaceC33493OooO0oo.onComplete();
                        return;
                    }
                    return;
                }
            } while (!compareAndSet(0, 2));
        }
    }
}

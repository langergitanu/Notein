package oO00o0O0;

import oO0OooOO.InterfaceC33499OooOOOO;

/* JADX INFO: renamed from: oO00o0O0.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C32343OooO0Oo<T> extends AbstractC32341OooO0O0<T> {
    private static final long serialVersionUID = -5502432239815349361L;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public T f116287OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final InterfaceC33499OooOOOO<? super T> f116288OooOo0o;

    public C32343OooO0Oo(InterfaceC33499OooOOOO<? super T> interfaceC33499OooOOOO) {
        this.f116288OooOo0o = interfaceC33499OooOOOO;
    }

    @Override // oO0OOOoo.InterfaceC33027OooO0o
    public final int OooO0O0(int i) {
        lazySet(8);
        return 2;
    }

    @Override // oO0OOOoo.InterfaceC33031OooOO0
    public final void clear() {
        lazySet(32);
        this.f116287OooOo = null;
    }

    @Override // oO0OOOoo.InterfaceC33031OooOO0
    public final boolean isEmpty() {
        return get() != 16;
    }

    @Override // oO0OOOoo.InterfaceC33031OooOO0
    public final T poll() throws Exception {
        if (get() != 16) {
            return null;
        }
        T t = this.f116287OooOo;
        this.f116287OooOo = null;
        lazySet(32);
        return t;
    }
}

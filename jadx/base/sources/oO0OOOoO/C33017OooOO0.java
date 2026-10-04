package oO0OOOoO;

import com.google.firebase.inappmessaging.internal.RateLimitProto;
import oO0OOOoo.InterfaceCallableC33030OooO0oo;
import oO0OooOO.AbstractC33498OooOOO0;
import oO0OooOO.InterfaceC33499OooOOOO;

/* JADX INFO: renamed from: oO0OOOoO.OooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33017OooOO0<T> extends AbstractC33498OooOOO0<T> implements InterfaceCallableC33030OooO0oo<T> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final RateLimitProto.Counter f119467OooOo0o;

    public C33017OooOO0(RateLimitProto.Counter counter) {
        this.f119467OooOo0o = counter;
    }

    @Override // oO0OooOO.AbstractC33498OooOOO0
    public final void OooO0OO(InterfaceC33499OooOOOO<? super T> interfaceC33499OooOOOO) {
        RunnableC33019OooOO0o runnableC33019OooOO0o = new RunnableC33019OooOO0o(interfaceC33499OooOOOO, this.f119467OooOo0o);
        interfaceC33499OooOOOO.OooO00o(runnableC33019OooOO0o);
        runnableC33019OooOO0o.run();
    }

    @Override // java.util.concurrent.Callable
    public final T call() {
        return (T) this.f119467OooOo0o;
    }
}

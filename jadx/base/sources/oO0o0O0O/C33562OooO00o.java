package oO0o0O0O;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: oO0o0O0O.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33562OooO00o<T> implements InterfaceC33569OooO0oo<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AtomicReference<InterfaceC33569OooO0oo<T>> f121188OooO00o;

    public C33562OooO00o(InterfaceC33569OooO0oo<? extends T> interfaceC33569OooO0oo) {
        this.f121188OooO00o = new AtomicReference<>(interfaceC33569OooO0oo);
    }

    @Override // oO0o0O0O.InterfaceC33569OooO0oo
    public final Iterator<T> iterator() {
        InterfaceC33569OooO0oo<T> andSet = this.f121188OooO00o.getAndSet(null);
        if (andSet != null) {
            return andSet.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}

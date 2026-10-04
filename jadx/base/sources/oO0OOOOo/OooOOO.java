package oO0OOOOo;

import oO0OooOO.AbstractC33491OooO0o0;
import oO0OooOO.AbstractC33498OooOOO0;
import oO0OooOO.InterfaceC33493OooO0oo;
import oO0OooOO.InterfaceC33499OooOOOO;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOOO<T> extends AbstractC33491OooO0o0<T> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final AbstractC33498OooOOO0<T> f119281OooOo;

    public static class OooO00o<T> implements InterfaceC33499OooOOOO<T>, oOO00OOO.OooO0OO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public oO0OOO00.OooO0O0 f119282OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final InterfaceC33493OooO0oo f119283OooOo0o;

        public OooO00o(InterfaceC33493OooO0oo interfaceC33493OooO0oo) {
            this.f119283OooOo0o = interfaceC33493OooO0oo;
        }

        @Override // oO0OooOO.InterfaceC33499OooOOOO
        public final void OooO00o(oO0OOO00.OooO0O0 oooO0O0) {
            this.f119282OooOo = oooO0O0;
            this.f119283OooOo0o.OooO0Oo(this);
        }

        @Override // oOO00OOO.OooO0OO
        public final void cancel() {
            this.f119282OooOo.dispose();
        }

        @Override // oO0OooOO.InterfaceC33499OooOOOO
        public final void onComplete() {
            this.f119283OooOo0o.onComplete();
        }

        @Override // oO0OooOO.InterfaceC33499OooOOOO
        public final void onError(Throwable th) {
            this.f119283OooOo0o.onError(th);
        }

        @Override // oO0OooOO.InterfaceC33499OooOOOO
        public final void onNext(T t) {
            this.f119283OooOo0o.onNext(t);
        }

        @Override // oOO00OOO.OooO0OO
        public final void request(long j) {
        }
    }

    public OooOOO(AbstractC33498OooOOO0<T> abstractC33498OooOOO0) {
        this.f119281OooOo = abstractC33498OooOOO0;
    }

    @Override // oO0OooOO.AbstractC33491OooO0o0
    public final void OooO0Oo(oOO00OOO.OooO0O0<? super T> oooO0O0) {
        this.f119281OooOo.OooO0O0(new OooO00o((InterfaceC33493OooO0oo) oooO0O0));
    }
}

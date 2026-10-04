package oO0OOOOo;

import o0o0OO0.C30416Oooo0OO;
import oO00o00o.InterfaceC32332OooO0Oo;
import oO00o0o.AbstractC32371OooO00o;
import oO00o0o.AbstractC32372OooO0O0;
import oO0OOOoo.InterfaceC33023OooO00o;
import oO0OOOoo.InterfaceC33029OooO0oO;
import oO0OooOO.AbstractC33491OooO0o0;
import oO0OooOO.InterfaceC33493OooO0oo;

/* JADX INFO: renamed from: oO0OOOOo.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32974OooO0oo<T> extends oO0OOOOo.OooO00o<T, T> {

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final InterfaceC32332OooO0Oo<? super T> f119244OooOoO0;

    /* JADX INFO: renamed from: oO0OOOOo.OooO0oo$OooO00o */
    public static final class OooO00o<T> extends AbstractC32371OooO00o<T, T> {

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public final InterfaceC32332OooO0Oo<? super T> f119245OooOoo0;

        public OooO00o(InterfaceC33023OooO00o<? super T> interfaceC33023OooO00o, InterfaceC32332OooO0Oo<? super T> interfaceC32332OooO0Oo) {
            super(interfaceC33023OooO00o);
            this.f119245OooOoo0 = interfaceC32332OooO0Oo;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // oO0OOOoo.InterfaceC33023OooO00o
        public final boolean OooO0OO(T t) {
            if (this.f116387OooOoO) {
                return false;
            }
            int i = this.f116389OooOoOO;
            InterfaceC33023OooO00o<? super R> interfaceC33023OooO00o = this.f116386OooOo0o;
            if (i != 0) {
                return interfaceC33023OooO00o.OooO0OO(null);
            }
            try {
                return this.f119245OooOoo0.test(t) && interfaceC33023OooO00o.OooO0OO((Object) t);
            } catch (Throwable th) {
                OooO00o(th);
                return true;
            }
        }

        @Override // oOO00OOO.OooO0O0
        public final void onNext(T t) {
            if (OooO0OO(t)) {
                return;
            }
            this.f116385OooOo.request(1L);
        }

        @Override // oO0OOOoo.InterfaceC33031OooOO0
        public final T poll() throws Exception {
            InterfaceC33029OooO0oO<T> interfaceC33029OooO0oO = this.f116388OooOoO0;
            while (true) {
                T tPoll = interfaceC33029OooO0oO.poll();
                if (tPoll == null) {
                    return null;
                }
                if (this.f119245OooOoo0.test(tPoll)) {
                    return tPoll;
                }
                if (this.f116389OooOoOO == 2) {
                    interfaceC33029OooO0oO.request(1L);
                }
            }
        }
    }

    /* JADX INFO: renamed from: oO0OOOOo.OooO0oo$OooO0O0 */
    public static final class OooO0O0<T> extends AbstractC32372OooO0O0<T, T> implements InterfaceC33023OooO00o<T> {

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public final InterfaceC32332OooO0Oo<? super T> f119246OooOoo0;

        public OooO0O0(InterfaceC33493OooO0oo interfaceC33493OooO0oo, InterfaceC32332OooO0Oo interfaceC32332OooO0Oo) {
            super(interfaceC33493OooO0oo);
            this.f119246OooOoo0 = interfaceC32332OooO0Oo;
        }

        @Override // oO0OOOoo.InterfaceC33023OooO00o
        public final boolean OooO0OO(T t) {
            if (this.f116392OooOoO) {
                return false;
            }
            int i = this.f116394OooOoOO;
            InterfaceC33493OooO0oo interfaceC33493OooO0oo = this.f116391OooOo0o;
            if (i != 0) {
                interfaceC33493OooO0oo.onNext(null);
                return true;
            }
            try {
                boolean zTest = this.f119246OooOoo0.test(t);
                if (zTest) {
                    interfaceC33493OooO0oo.onNext(t);
                }
                return zTest;
            } catch (Throwable th) {
                C30416Oooo0OO.OooO00o(th);
                this.f116390OooOo.cancel();
                onError(th);
                return true;
            }
        }

        @Override // oOO00OOO.OooO0O0
        public final void onNext(T t) {
            if (OooO0OO(t)) {
                return;
            }
            this.f116390OooOo.request(1L);
        }

        @Override // oO0OOOoo.InterfaceC33031OooOO0
        public final T poll() throws Exception {
            InterfaceC33029OooO0oO<T> interfaceC33029OooO0oO = this.f116393OooOoO0;
            while (true) {
                T tPoll = interfaceC33029OooO0oO.poll();
                if (tPoll == null) {
                    return null;
                }
                if (this.f119246OooOoo0.test(tPoll)) {
                    return tPoll;
                }
                if (this.f116394OooOoOO == 2) {
                    interfaceC33029OooO0oO.request(1L);
                }
            }
        }
    }

    public C32974OooO0oo(AbstractC33491OooO0o0<T> abstractC33491OooO0o0, InterfaceC32332OooO0Oo<? super T> interfaceC32332OooO0Oo) {
        super(abstractC33491OooO0o0);
        this.f119244OooOoO0 = interfaceC32332OooO0Oo;
    }

    @Override // oO0OooOO.AbstractC33491OooO0o0
    public final void OooO0Oo(oOO00OOO.OooO0O0<? super T> oooO0O0) {
        boolean z = oooO0O0 instanceof InterfaceC33023OooO00o;
        InterfaceC32332OooO0Oo<? super T> interfaceC32332OooO0Oo = this.f119244OooOoO0;
        AbstractC33491OooO0o0<T> abstractC33491OooO0o0 = this.f119186OooOo;
        if (z) {
            abstractC33491OooO0o0.OooO0OO(new OooO00o((InterfaceC33023OooO00o) oooO0O0, interfaceC32332OooO0Oo));
        } else {
            abstractC33491OooO0o0.OooO0OO(new OooO0O0((InterfaceC33493OooO0oo) oooO0O0, interfaceC32332OooO0Oo));
        }
    }
}

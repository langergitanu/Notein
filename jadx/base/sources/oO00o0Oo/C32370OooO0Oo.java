package oO00o0Oo;

import java.util.concurrent.atomic.AtomicReference;
import o00O0OoO.C24871OooO0OO;
import o0Oo0oOo.o00Oo0;
import o0o0OO0.C30416Oooo0OO;
import oO00o0.OooO00o;
import oO0OooOO.AbstractC33502OooOOo0;
import oO0OooOO.InterfaceC33501OooOOo;
import oO0OooOO.InterfaceC33503OooOOoo;
import ooOOo0.EnumC35109OooO0O0;

/* JADX INFO: renamed from: oO00o0Oo.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32370OooO0Oo<T> extends AbstractC33502OooOOo0<T> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final OooO00o.CallableC32324OooO0oO f116381OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final AbstractC33502OooOOo0 f116382OooOo0o;

    /* JADX INFO: renamed from: oO00o0Oo.OooO0Oo$OooO00o */
    public static final class OooO00o<T> extends AtomicReference<oO0OOO00.OooO0O0> implements InterfaceC33501OooOOo<T>, oO0OOO00.OooO0O0 {
        private static final long serialVersionUID = -5314538511045349925L;

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final OooO00o.CallableC32324OooO0oO f116383OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final InterfaceC33501OooOOo<? super T> f116384OooOo0o;

        public OooO00o(InterfaceC33501OooOOo interfaceC33501OooOOo, OooO00o.CallableC32324OooO0oO callableC32324OooO0oO) {
            this.f116384OooOo0o = interfaceC33501OooOOo;
            this.f116383OooOo = callableC32324OooO0oO;
        }

        @Override // oO0OooOO.InterfaceC33501OooOOo
        public final void OooO00o(oO0OOO00.OooO0O0 oooO0O0) {
            if (EnumC35109OooO0O0.OooO0Oo(this, oooO0O0)) {
                this.f116384OooOo0o.OooO00o(this);
            }
        }

        @Override // oO0OOO00.OooO0O0
        public final void dispose() {
            EnumC35109OooO0O0.OooO00o(this);
        }

        @Override // oO0OooOO.InterfaceC33501OooOOo
        public final void onError(Throwable th) {
            InterfaceC33501OooOOo<? super T> interfaceC33501OooOOo = this.f116384OooOo0o;
            try {
                U u = this.f116383OooOo.f116242OooOo0o;
                o00Oo0.OooO00o(u, "The nextFunction returned a null SingleSource.");
                ((InterfaceC33503OooOOoo) u).OooO00o(new C24871OooO0OO(this, interfaceC33501OooOOo));
            } catch (Throwable th2) {
                C30416Oooo0OO.OooO00o(th2);
                interfaceC33501OooOOo.onError(new oO00o00O.OooO00o(th, th2));
            }
        }

        @Override // oO0OooOO.InterfaceC33501OooOOo
        public final void onSuccess(T t) {
            this.f116384OooOo0o.onSuccess(t);
        }
    }

    public C32370OooO0Oo(AbstractC33502OooOOo0 abstractC33502OooOOo0, OooO00o.CallableC32324OooO0oO callableC32324OooO0oO) {
        this.f116382OooOo0o = abstractC33502OooOOo0;
        this.f116381OooOo = callableC32324OooO0oO;
    }

    @Override // oO0OooOO.AbstractC33502OooOOo0
    public final void OooO0o0(InterfaceC33501OooOOo<? super T> interfaceC33501OooOOo) {
        this.f116382OooOo0o.OooO00o(new OooO00o(interfaceC33501OooOOo, this.f116381OooOo));
    }
}

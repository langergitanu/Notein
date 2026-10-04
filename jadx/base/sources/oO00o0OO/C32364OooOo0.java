package oO00o0OO;

import oO00o0O0.C32343OooO0Oo;
import oO0OooOO.AbstractC33498OooOOO0;
import oO0OooOO.InterfaceC33495OooOO0O;
import oO0OooOO.InterfaceC33499OooOOOO;
import ooOOo0.EnumC35109OooO0O0;

/* JADX INFO: renamed from: oO00o0OO.OooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32364OooOo0<T> extends AbstractC33498OooOOO0<T> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C32357OooOOO f116359OooOo0o;

    /* JADX INFO: renamed from: oO00o0OO.OooOo0$OooO00o */
    public static final class OooO00o<T> extends C32343OooO0Oo<T> implements InterfaceC33495OooOO0O<T> {
        private static final long serialVersionUID = 7603343402964826922L;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public oO0OOO00.OooO0O0 f116360OooOoO0;

        @Override // oO0OooOO.InterfaceC33495OooOO0O
        public final void OooO00o(oO0OOO00.OooO0O0 oooO0O0) {
            if (EnumC35109OooO0O0.OooO0o0(this.f116360OooOoO0, oooO0O0)) {
                this.f116360OooOoO0 = oooO0O0;
                this.f116288OooOo0o.OooO00o(this);
            }
        }

        @Override // oO0OOO00.OooO0O0
        public final void dispose() {
            set(4);
            this.f116287OooOo = null;
            this.f116360OooOoO0.dispose();
        }

        @Override // oO0OooOO.InterfaceC33495OooOO0O
        public final void onComplete() {
            if ((get() & 54) != 0) {
                return;
            }
            lazySet(2);
            this.f116288OooOo0o.onComplete();
        }

        @Override // oO0OooOO.InterfaceC33495OooOO0O
        public final void onError(Throwable th) {
            if ((get() & 54) != 0) {
                oO0OOO0O.OooO00o.OooO0O0(th);
            } else {
                lazySet(2);
                this.f116288OooOo0o.onError(th);
            }
        }

        @Override // oO0OooOO.InterfaceC33495OooOO0O
        public final void onSuccess(T t) {
            int i = get();
            if ((i & 54) != 0) {
                return;
            }
            InterfaceC33499OooOOOO<? super T> interfaceC33499OooOOOO = this.f116288OooOo0o;
            if (i == 8) {
                this.f116287OooOo = t;
                lazySet(16);
                interfaceC33499OooOOOO.onNext(null);
            } else {
                lazySet(2);
                interfaceC33499OooOOOO.onNext(t);
            }
            if (get() != 4) {
                interfaceC33499OooOOOO.onComplete();
            }
        }
    }

    public C32364OooOo0(C32357OooOOO c32357OooOOO) {
        this.f116359OooOo0o = c32357OooOOO;
    }

    @Override // oO0OooOO.AbstractC33498OooOOO0
    public final void OooO0OO(InterfaceC33499OooOOOO<? super T> interfaceC33499OooOOOO) {
        this.f116359OooOo0o.OooO00o(new OooO00o(interfaceC33499OooOOOO));
    }
}

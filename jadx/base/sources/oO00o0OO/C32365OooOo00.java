package oO00o0OO;

import oO0OOOo0.C33003OooO0OO;
import oO0OooOO.AbstractC33485OooO;
import oO0OooOO.AbstractC33491OooO0o0;
import oO0OooOO.InterfaceC33493OooO0oo;
import oO0OooOO.InterfaceC33495OooOO0O;
import ooOOo0.EnumC35109OooO0O0;

/* JADX INFO: renamed from: oO00o0OO.OooOo00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32365OooOo00<T> extends AbstractC33491OooO0o0<T> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final AbstractC33485OooO f116361OooOo;

    /* JADX INFO: renamed from: oO00o0OO.OooOo00$OooO00o */
    public static final class OooO00o<T> extends C33003OooO0OO<T> implements InterfaceC33495OooOO0O<T> {
        private static final long serialVersionUID = 7603343402964826922L;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public oO0OOO00.OooO0O0 f116362OooOoO0;

        @Override // oO0OooOO.InterfaceC33495OooOO0O
        public final void OooO00o(oO0OOO00.OooO0O0 oooO0O0) {
            if (EnumC35109OooO0O0.OooO0o0(this.f116362OooOoO0, oooO0O0)) {
                this.f116362OooOoO0 = oooO0O0;
                this.f119389OooOo0o.OooO0Oo(this);
            }
        }

        @Override // oOO00OOO.OooO0OO
        public final void cancel() {
            set(4);
            this.f119388OooOo = null;
            this.f116362OooOoO0.dispose();
        }

        @Override // oO0OooOO.InterfaceC33495OooOO0O
        public final void onComplete() {
            this.f119389OooOo0o.onComplete();
        }

        @Override // oO0OooOO.InterfaceC33495OooOO0O
        public final void onError(Throwable th) {
            this.f119389OooOo0o.onError(th);
        }
    }

    public C32365OooOo00(AbstractC33485OooO abstractC33485OooO) {
        this.f116361OooOo = abstractC33485OooO;
    }

    @Override // oO0OooOO.AbstractC33491OooO0o0
    public final void OooO0Oo(oOO00OOO.OooO0O0<? super T> oooO0O0) {
        this.f116361OooOo.OooO00o(new OooO00o((InterfaceC33493OooO0oo) oooO0O0));
    }
}

package oO0OOOOo;

import androidx.core.location.LocationRequestCompat;
import oO0OOOo0.EnumC33007OooO0oO;
import oO0OOOoo.InterfaceC33024OooO0O0;
import oO0OooOO.AbstractC33485OooO;
import oO0OooOO.AbstractC33491OooO0o0;
import oO0OooOO.InterfaceC33493OooO0oo;
import oO0OooOO.InterfaceC33495OooOO0O;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0o<T> extends AbstractC33485OooO<T> implements InterfaceC33024OooO0O0<T> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final OooOO0O f119235OooOo0o;

    public static final class OooO00o<T> implements InterfaceC33493OooO0oo<T>, oO0OOO00.OooO0O0 {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public oOO00OOO.OooO0OO f119236OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final InterfaceC33495OooOO0O<? super T> f119237OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public boolean f119238OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public long f119239OooOoO0;

        public OooO00o(InterfaceC33495OooOO0O interfaceC33495OooOO0O) {
            this.f119237OooOo0o = interfaceC33495OooOO0O;
        }

        @Override // oOO00OOO.OooO0O0
        public final void OooO0Oo(oOO00OOO.OooO0OO oooO0OO) {
            if (EnumC33007OooO0oO.OooO0Oo(this.f119236OooOo, oooO0OO)) {
                this.f119236OooOo = oooO0OO;
                this.f119237OooOo0o.OooO00o(this);
                oooO0OO.request(LocationRequestCompat.PASSIVE_INTERVAL);
            }
        }

        @Override // oO0OOO00.OooO0O0
        public final void dispose() {
            this.f119236OooOo.cancel();
            this.f119236OooOo = EnumC33007OooO0oO.f119402OooOo0o;
        }

        @Override // oOO00OOO.OooO0O0
        public final void onComplete() {
            this.f119236OooOo = EnumC33007OooO0oO.f119402OooOo0o;
            if (this.f119238OooOoO) {
                return;
            }
            this.f119238OooOoO = true;
            this.f119237OooOo0o.onComplete();
        }

        @Override // oOO00OOO.OooO0O0
        public final void onError(Throwable th) {
            if (this.f119238OooOoO) {
                oO0OOO0O.OooO00o.OooO0O0(th);
                return;
            }
            this.f119238OooOoO = true;
            this.f119236OooOo = EnumC33007OooO0oO.f119402OooOo0o;
            this.f119237OooOo0o.onError(th);
        }

        @Override // oOO00OOO.OooO0O0
        public final void onNext(T t) {
            if (this.f119238OooOoO) {
                return;
            }
            long j = this.f119239OooOoO0;
            if (j != 0) {
                this.f119239OooOoO0 = j + 1;
                return;
            }
            this.f119238OooOoO = true;
            this.f119236OooOo.cancel();
            this.f119236OooOo = EnumC33007OooO0oO.f119402OooOo0o;
            this.f119237OooOo0o.onSuccess(t);
        }
    }

    public OooO0o(OooOO0O oooOO0O) {
        this.f119235OooOo0o = oooOO0O;
    }

    @Override // oO0OooOO.AbstractC33485OooO
    public final void OooO0OO(InterfaceC33495OooOO0O<? super T> interfaceC33495OooOO0O) {
        this.f119235OooOo0o.OooO0OO(new OooO00o(interfaceC33495OooOO0O));
    }

    @Override // oO0OOOoo.InterfaceC33024OooO0O0
    public final AbstractC33491OooO0o0<T> OooO0Oo() {
        return new C32972OooO0o0(this.f119235OooOo0o);
    }
}

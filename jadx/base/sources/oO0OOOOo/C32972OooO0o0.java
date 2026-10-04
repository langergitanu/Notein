package oO0OOOOo;

import androidx.core.location.LocationRequestCompat;
import oO0OOOo0.C33003OooO0OO;
import oO0OOOo0.EnumC33007OooO0oO;
import oO0OooOO.InterfaceC33493OooO0oo;

/* JADX INFO: renamed from: oO0OOOOo.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32972OooO0o0<T> extends oO0OOOOo.OooO00o<T, T> {

    /* JADX INFO: renamed from: oO0OOOOo.OooO0o0$OooO00o */
    public static final class OooO00o<T> extends C33003OooO0OO<T> implements InterfaceC33493OooO0oo<T> {
        private static final long serialVersionUID = 4066607327284737757L;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public long f119240OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public oOO00OOO.OooO0OO f119241OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public boolean f119242OooOoOO;

        @Override // oOO00OOO.OooO0O0
        public final void OooO0Oo(oOO00OOO.OooO0OO oooO0OO) {
            if (EnumC33007OooO0oO.OooO0Oo(this.f119241OooOoO0, oooO0OO)) {
                this.f119241OooOoO0 = oooO0OO;
                this.f119389OooOo0o.OooO0Oo(this);
                oooO0OO.request(LocationRequestCompat.PASSIVE_INTERVAL);
            }
        }

        @Override // oOO00OOO.OooO0OO
        public final void cancel() {
            set(4);
            this.f119388OooOo = null;
            this.f119241OooOoO0.cancel();
        }

        @Override // oOO00OOO.OooO0O0
        public final void onComplete() {
            if (this.f119242OooOoOO) {
                return;
            }
            this.f119242OooOoOO = true;
            this.f119389OooOo0o.onComplete();
        }

        @Override // oOO00OOO.OooO0O0
        public final void onError(Throwable th) {
            if (this.f119242OooOoOO) {
                oO0OOO0O.OooO00o.OooO0O0(th);
            } else {
                this.f119242OooOoOO = true;
                this.f119389OooOo0o.onError(th);
            }
        }

        @Override // oOO00OOO.OooO0O0
        public final void onNext(T t) {
            if (this.f119242OooOoOO) {
                return;
            }
            long j = this.f119240OooOoO;
            if (j != 0) {
                this.f119240OooOoO = j + 1;
                return;
            }
            this.f119242OooOoOO = true;
            this.f119241OooOoO0.cancel();
            OooO0o0(t);
        }
    }

    @Override // oO0OooOO.AbstractC33491OooO0o0
    public final void OooO0Oo(oOO00OOO.OooO0O0<? super T> oooO0O0) {
        this.f119186OooOo.OooO0OO(new OooO00o((InterfaceC33493OooO0oo) oooO0O0));
    }
}

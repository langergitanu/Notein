package oO0OOOOo;

import androidx.core.location.LocationRequestCompat;
import java.util.ArrayList;
import java.util.Collection;
import o0o0OO0.C30416Oooo0OO;
import oO00o0oO.EnumC32387OooO0O0;
import oO0OOOo0.C33003OooO0OO;
import oO0OOOo0.EnumC33004OooO0Oo;
import oO0OOOo0.EnumC33007OooO0oO;
import oO0OooOO.InterfaceC33493OooO0oo;

/* JADX INFO: renamed from: oO0OOOOo.OooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32980OooOo0<T, U extends Collection<? super T>> extends oO0OOOOo.OooO00o<T, U> {

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final EnumC32387OooO0O0 f119343OooOoO0;

    /* JADX INFO: renamed from: oO0OOOOo.OooOo0$OooO00o */
    public static final class OooO00o<T, U extends Collection<? super T>> extends C33003OooO0OO<U> implements InterfaceC33493OooO0oo<T>, oOO00OOO.OooO0OO {
        private static final long serialVersionUID = -8134157938864266736L;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public oOO00OOO.OooO0OO f119344OooOoO0;

        @Override // oOO00OOO.OooO0O0
        public final void OooO0Oo(oOO00OOO.OooO0OO oooO0OO) {
            if (EnumC33007OooO0oO.OooO0Oo(this.f119344OooOoO0, oooO0OO)) {
                this.f119344OooOoO0 = oooO0OO;
                this.f119389OooOo0o.OooO0Oo(this);
                oooO0OO.request(LocationRequestCompat.PASSIVE_INTERVAL);
            }
        }

        @Override // oOO00OOO.OooO0OO
        public final void cancel() {
            set(4);
            this.f119388OooOo = null;
            this.f119344OooOoO0.cancel();
        }

        @Override // oOO00OOO.OooO0O0
        public final void onComplete() {
            OooO0o0(this.f119388OooOo);
        }

        @Override // oOO00OOO.OooO0O0
        public final void onError(Throwable th) {
            this.f119388OooOo = null;
            this.f119389OooOo0o.onError(th);
        }

        @Override // oOO00OOO.OooO0O0
        public final void onNext(T t) {
            Collection collection = (Collection) this.f119388OooOo;
            if (collection != null) {
                collection.add(t);
            }
        }
    }

    public C32980OooOo0(OooOO0 oooOO02, EnumC32387OooO0O0 enumC32387OooO0O0) {
        super(oooOO02);
        this.f119343OooOoO0 = enumC32387OooO0O0;
    }

    @Override // oO0OooOO.AbstractC33491OooO0o0
    public final void OooO0Oo(oOO00OOO.OooO0O0<? super U> oooO0O0) {
        try {
            this.f119343OooOoO0.getClass();
            T t = (T) new ArrayList();
            OooO00o oooO00o = new OooO00o((InterfaceC33493OooO0oo) oooO0O0);
            oooO00o.f119388OooOo = t;
            this.f119186OooOo.OooO0OO(oooO00o);
        } catch (Throwable th) {
            C30416Oooo0OO.OooO00o(th);
            EnumC33004OooO0Oo.OooO0OO(th, (InterfaceC33493OooO0oo) oooO0O0);
        }
    }
}

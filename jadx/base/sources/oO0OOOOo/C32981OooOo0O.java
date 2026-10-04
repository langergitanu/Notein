package oO0OOOOo;

import androidx.core.location.LocationRequestCompat;
import java.util.ArrayList;
import java.util.Collection;
import o0o0OO0.C30416Oooo0OO;
import oO00o0oO.EnumC32387OooO0O0;
import oO0OOOo0.EnumC33007OooO0oO;
import oO0OOOoo.InterfaceC33024OooO0O0;
import oO0OooOO.AbstractC33491OooO0o0;
import oO0OooOO.AbstractC33502OooOOo0;
import oO0OooOO.InterfaceC33493OooO0oo;
import oO0OooOO.InterfaceC33501OooOOo;
import ooOOo0.EnumC35110OooO0OO;

/* JADX INFO: renamed from: oO0OOOOo.OooOo0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32981OooOo0O<T, U extends Collection<? super T>> extends AbstractC33502OooOOo0<U> implements InterfaceC33024OooO0O0<U> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final EnumC32387OooO0O0 f119347OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final OooOO0 f119348OooOo0o;

    /* JADX INFO: renamed from: oO0OOOOo.OooOo0O$OooO00o */
    public static final class OooO00o<T, U extends Collection<? super T>> implements InterfaceC33493OooO0oo<T>, oO0OOO00.OooO0O0 {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public oOO00OOO.OooO0OO f119349OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final InterfaceC33501OooOOo<? super U> f119350OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public U f119351OooOoO0;

        public OooO00o(InterfaceC33501OooOOo<? super U> interfaceC33501OooOOo, U u) {
            this.f119350OooOo0o = interfaceC33501OooOOo;
            this.f119351OooOoO0 = u;
        }

        @Override // oOO00OOO.OooO0O0
        public final void OooO0Oo(oOO00OOO.OooO0OO oooO0OO) {
            if (EnumC33007OooO0oO.OooO0Oo(this.f119349OooOo, oooO0OO)) {
                this.f119349OooOo = oooO0OO;
                this.f119350OooOo0o.OooO00o(this);
                oooO0OO.request(LocationRequestCompat.PASSIVE_INTERVAL);
            }
        }

        @Override // oO0OOO00.OooO0O0
        public final void dispose() {
            this.f119349OooOo.cancel();
            this.f119349OooOo = EnumC33007OooO0oO.f119402OooOo0o;
        }

        @Override // oOO00OOO.OooO0O0
        public final void onComplete() {
            this.f119349OooOo = EnumC33007OooO0oO.f119402OooOo0o;
            this.f119350OooOo0o.onSuccess(this.f119351OooOoO0);
        }

        @Override // oOO00OOO.OooO0O0
        public final void onError(Throwable th) {
            this.f119351OooOoO0 = null;
            this.f119349OooOo = EnumC33007OooO0oO.f119402OooOo0o;
            this.f119350OooOo0o.onError(th);
        }

        @Override // oOO00OOO.OooO0O0
        public final void onNext(T t) {
            this.f119351OooOoO0.add(t);
        }
    }

    public C32981OooOo0O(OooOO0 oooOO02) {
        EnumC32387OooO0O0 enumC32387OooO0O0 = EnumC32387OooO0O0.f116479OooOo0o;
        this.f119348OooOo0o = oooOO02;
        this.f119347OooOo = enumC32387OooO0O0;
    }

    @Override // oO0OOOoo.InterfaceC33024OooO0O0
    public final AbstractC33491OooO0o0<U> OooO0Oo() {
        return new C32980OooOo0(this.f119348OooOo0o, this.f119347OooOo);
    }

    @Override // oO0OooOO.AbstractC33502OooOOo0
    public final void OooO0o0(InterfaceC33501OooOOo<? super U> interfaceC33501OooOOo) {
        try {
            this.f119347OooOo.getClass();
            this.f119348OooOo0o.OooO0OO(new OooO00o(interfaceC33501OooOOo, new ArrayList()));
        } catch (Throwable th) {
            C30416Oooo0OO.OooO00o(th);
            interfaceC33501OooOOo.OooO00o(EnumC35110OooO0OO.f126094OooOo0o);
            interfaceC33501OooOOo.onError(th);
        }
    }
}

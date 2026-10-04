package oO0OooOo;

import java.util.Objects;
import oO00o.AbstractC32314OooO00o;
import oO00o.InterfaceC32315OooO0O0;
import oO00oO00.InterfaceC32403OooO0OO;
import oO0OO00o.AbstractC32901OooO00o;
import oO0o0OO.C33669o000oOoO;
import oOo00ooO.InterfaceC34569OooO00o;

/* JADX INFO: renamed from: oO0OooOo.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33506OooO0OO<T, U> extends AbstractC33504OooO00o<T, U> {

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final InterfaceC32403OooO0OO<? super T, ? extends U> f121002OooOoO0;

    /* JADX INFO: renamed from: oO0OooOo.OooO0OO$OooO00o */
    public static final class OooO00o<T, U> extends AbstractC32901OooO00o<T, U> {

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public final InterfaceC32403OooO0OO<? super T, ? extends U> f121003OooOoOO;

        public OooO00o(InterfaceC34569OooO00o<? super U> interfaceC34569OooO00o, InterfaceC32403OooO0OO<? super T, ? extends U> interfaceC32403OooO0OO) {
            super(interfaceC34569OooO00o);
            this.f121003OooOoOO = interfaceC32403OooO0OO;
        }

        @Override // oOo00ooO.InterfaceC34571OooO0OO
        public final int OooO0O0(int i) {
            return 0;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // oOo00ooO.InterfaceC34569OooO00o
        public final boolean OooO0OO(T t) {
            if (this.f118544OooOoO) {
                return false;
            }
            try {
                U uApply = this.f121003OooOoOO.apply(t);
                Objects.requireNonNull(uApply, "The mapper function returned a null value.");
                return this.f118543OooOo0o.OooO0OO((Object) uApply);
            } catch (Throwable th) {
                C33669o000oOoO.OooO0O0(th);
                this.f118542OooOo.cancel();
                onError(th);
                return true;
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // oOO00OOO.OooO0O0
        public final void onNext(T t) {
            if (this.f118544OooOoO) {
                return;
            }
            InterfaceC34569OooO00o<? super R> interfaceC34569OooO00o = this.f118543OooOo0o;
            try {
                U uApply = this.f121003OooOoOO.apply(t);
                Objects.requireNonNull(uApply, "The mapper function returned a null value.");
                interfaceC34569OooO00o.onNext((Object) uApply);
            } catch (Throwable th) {
                C33669o000oOoO.OooO0O0(th);
                this.f118542OooOo.cancel();
                onError(th);
            }
        }

        @Override // oOo00ooO.InterfaceC34575OooO0oO
        public final U poll() throws Throwable {
            T tPoll = this.f118545OooOoO0.poll();
            if (tPoll == null) {
                return null;
            }
            U uApply = this.f121003OooOoOO.apply(tPoll);
            Objects.requireNonNull(uApply, "The mapper function returned a null value.");
            return uApply;
        }
    }

    /* JADX INFO: renamed from: oO0OooOo.OooO0OO$OooO0O0 */
    public static final class OooO0O0<T, U> extends oO0OO00o.OooO0O0<T, U> {

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public final InterfaceC32403OooO0OO<? super T, ? extends U> f121004OooOoOO;

        public OooO0O0(InterfaceC32315OooO0O0 interfaceC32315OooO0O0, InterfaceC32403OooO0OO interfaceC32403OooO0OO) {
            super(interfaceC32315OooO0O0);
            this.f121004OooOoOO = interfaceC32403OooO0OO;
        }

        @Override // oOo00ooO.InterfaceC34571OooO0OO
        public final int OooO0O0(int i) {
            return 0;
        }

        @Override // oOO00OOO.OooO0O0
        public final void onNext(T t) {
            if (this.f118548OooOoO) {
                return;
            }
            InterfaceC32315OooO0O0 interfaceC32315OooO0O0 = this.f118547OooOo0o;
            try {
                U uApply = this.f121004OooOoOO.apply(t);
                Objects.requireNonNull(uApply, "The mapper function returned a null value.");
                interfaceC32315OooO0O0.onNext(uApply);
            } catch (Throwable th) {
                C33669o000oOoO.OooO0O0(th);
                this.f118546OooOo.cancel();
                onError(th);
            }
        }

        @Override // oOo00ooO.InterfaceC34575OooO0oO
        public final U poll() throws Throwable {
            T tPoll = this.f118549OooOoO0.poll();
            if (tPoll == null) {
                return null;
            }
            U uApply = this.f121004OooOoOO.apply(tPoll);
            Objects.requireNonNull(uApply, "The mapper function returned a null value.");
            return uApply;
        }
    }

    public C33506OooO0OO(AbstractC32314OooO00o<T> abstractC32314OooO00o, InterfaceC32403OooO0OO<? super T, ? extends U> interfaceC32403OooO0OO) {
        super(abstractC32314OooO00o);
        this.f121002OooOoO0 = interfaceC32403OooO0OO;
    }

    @Override // oO00o.AbstractC32314OooO00o
    public final void OooO0O0(oOO00OOO.OooO0O0<? super U> oooO0O0) {
        boolean z = oooO0O0 instanceof InterfaceC34569OooO00o;
        InterfaceC32403OooO0OO<? super T, ? extends U> interfaceC32403OooO0OO = this.f121002OooOoO0;
        AbstractC32314OooO00o<T> abstractC32314OooO00o = this.f121000OooOo;
        if (z) {
            abstractC32314OooO00o.OooO00o(new OooO00o((InterfaceC34569OooO00o) oooO0O0, interfaceC32403OooO0OO));
        } else {
            abstractC32314OooO00o.OooO00o(new OooO0O0((InterfaceC32315OooO0O0) oooO0O0, interfaceC32403OooO0OO));
        }
    }
}

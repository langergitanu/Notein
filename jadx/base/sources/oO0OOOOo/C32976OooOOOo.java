package oO0OOOOo;

import o0Oo0oOo.o00Oo0;
import o0o0OO0.C30416Oooo0OO;
import oO00o0.OooO00o;
import oO00o0o.AbstractC32371OooO00o;
import oO00o0o.AbstractC32372OooO0O0;
import oO0OOOoo.InterfaceC33023OooO00o;
import oO0OooOO.AbstractC33491OooO0o0;
import oO0OooOO.InterfaceC33493OooO0oo;

/* JADX INFO: renamed from: oO0OOOOo.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32976OooOOOo<T, U> extends oO0OOOOo.OooO00o<T, U> {

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final OooO00o.C32325OooO0oo f119292OooOoO0;

    /* JADX INFO: renamed from: oO0OOOOo.OooOOOo$OooO00o */
    public static final class OooO00o<T, U> extends AbstractC32371OooO00o<T, U> {

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public final OooO00o.C32325OooO0oo f119293OooOoo0;

        public OooO00o(InterfaceC33023OooO00o interfaceC33023OooO00o, OooO00o.C32325OooO0oo c32325OooO0oo) {
            super(interfaceC33023OooO00o);
            this.f119293OooOoo0 = c32325OooO0oo;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // oO0OOOoo.InterfaceC33023OooO00o
        public final boolean OooO0OO(T t) {
            if (this.f116387OooOoO) {
                return false;
            }
            try {
                Object objApply = this.f119293OooOoo0.apply(t);
                o00Oo0.OooO00o(objApply, "The mapper function returned a null value.");
                return this.f116386OooOo0o.OooO0OO((Object) objApply);
            } catch (Throwable th) {
                OooO00o(th);
                return true;
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // oOO00OOO.OooO0O0
        public final void onNext(T t) {
            if (this.f116387OooOoO) {
                return;
            }
            int i = this.f116389OooOoOO;
            InterfaceC33023OooO00o<? super R> interfaceC33023OooO00o = this.f116386OooOo0o;
            if (i != 0) {
                interfaceC33023OooO00o.onNext(null);
                return;
            }
            try {
                Object objApply = this.f119293OooOoo0.apply(t);
                o00Oo0.OooO00o(objApply, "The mapper function returned a null value.");
                interfaceC33023OooO00o.onNext((Object) objApply);
            } catch (Throwable th) {
                OooO00o(th);
            }
        }

        @Override // oO0OOOoo.InterfaceC33031OooOO0
        public final U poll() throws Exception {
            T tPoll = this.f116388OooOoO0.poll();
            if (tPoll == null) {
                return null;
            }
            U u = (U) this.f119293OooOoo0.apply(tPoll);
            o00Oo0.OooO00o(u, "The mapper function returned a null value.");
            return u;
        }
    }

    /* JADX INFO: renamed from: oO0OOOOo.OooOOOo$OooO0O0 */
    public static final class OooO0O0<T, U> extends AbstractC32372OooO0O0<T, U> {

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public final OooO00o.C32325OooO0oo f119294OooOoo0;

        public OooO0O0(InterfaceC33493OooO0oo interfaceC33493OooO0oo, OooO00o.C32325OooO0oo c32325OooO0oo) {
            super(interfaceC33493OooO0oo);
            this.f119294OooOoo0 = c32325OooO0oo;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // oOO00OOO.OooO0O0
        public final void onNext(T t) {
            if (this.f116392OooOoO) {
                return;
            }
            int i = this.f116394OooOoOO;
            InterfaceC33493OooO0oo interfaceC33493OooO0oo = this.f116391OooOo0o;
            if (i != 0) {
                interfaceC33493OooO0oo.onNext(null);
                return;
            }
            try {
                Object objApply = this.f119294OooOoo0.apply(t);
                o00Oo0.OooO00o(objApply, "The mapper function returned a null value.");
                interfaceC33493OooO0oo.onNext(objApply);
            } catch (Throwable th) {
                C30416Oooo0OO.OooO00o(th);
                this.f116390OooOo.cancel();
                onError(th);
            }
        }

        @Override // oO0OOOoo.InterfaceC33031OooOO0
        public final U poll() throws Exception {
            T tPoll = this.f116393OooOoO0.poll();
            if (tPoll == null) {
                return null;
            }
            U u = (U) this.f119294OooOoo0.apply(tPoll);
            o00Oo0.OooO00o(u, "The mapper function returned a null value.");
            return u;
        }
    }

    public C32976OooOOOo(AbstractC33491OooO0o0 abstractC33491OooO0o0, OooO00o.C32325OooO0oo c32325OooO0oo) {
        super(abstractC33491OooO0o0);
        this.f119292OooOoO0 = c32325OooO0oo;
    }

    @Override // oO0OooOO.AbstractC33491OooO0o0
    public final void OooO0Oo(oOO00OOO.OooO0O0<? super U> oooO0O0) {
        boolean z = oooO0O0 instanceof InterfaceC33023OooO00o;
        OooO00o.C32325OooO0oo c32325OooO0oo = this.f119292OooOoO0;
        AbstractC33491OooO0o0<T> abstractC33491OooO0o0 = this.f119186OooOo;
        if (z) {
            abstractC33491OooO0o0.OooO0OO(new OooO00o((InterfaceC33023OooO00o) oooO0O0, c32325OooO0oo));
        } else {
            abstractC33491OooO0o0.OooO0OO(new OooO0O0((InterfaceC33493OooO0oo) oooO0O0, c32325OooO0oo));
        }
    }
}

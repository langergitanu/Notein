package oO0OOOoO;

import o0Oo0oOo.o00Oo0;
import o0o0OO0.C30416Oooo0OO;
import oO00o00o.InterfaceC32331OooO0OO;
import oO00o0O0.AbstractC32340OooO00o;
import oO0OooOO.AbstractC33498OooOOO0;
import oO0OooOO.InterfaceC33499OooOOOO;

/* JADX INFO: renamed from: oO0OOOoO.OooOO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33018OooOO0O<T, U> extends AbstractC33009OooO00o<T, U> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final InterfaceC32331OooO0OO<? super T, ? extends U> f119468OooOo;

    /* JADX INFO: renamed from: oO0OOOoO.OooOO0O$OooO00o */
    public static final class OooO00o<T, U> extends AbstractC32340OooO00o<T, U> {

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public final InterfaceC32331OooO0OO<? super T, ? extends U> f119469OooOoOO;

        public OooO00o(InterfaceC33499OooOOOO<? super U> interfaceC33499OooOOOO, InterfaceC32331OooO0OO<? super T, ? extends U> interfaceC32331OooO0OO) {
            super(interfaceC33499OooOOOO);
            this.f119469OooOoOO = interfaceC32331OooO0OO;
        }

        @Override // oO0OOOoo.InterfaceC33027OooO0o
        public final int OooO0O0(int i) {
            return 0;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // oO0OooOO.InterfaceC33499OooOOOO
        public final void onNext(T t) {
            if (this.f116285OooOoO) {
                return;
            }
            InterfaceC33499OooOOOO<? super R> interfaceC33499OooOOOO = this.f116284OooOo0o;
            try {
                U uApply = this.f119469OooOoOO.apply(t);
                o00Oo0.OooO00o(uApply, "The mapper function returned a null value.");
                interfaceC33499OooOOOO.onNext((Object) uApply);
            } catch (Throwable th) {
                C30416Oooo0OO.OooO00o(th);
                this.f116283OooOo.dispose();
                onError(th);
            }
        }

        @Override // oO0OOOoo.InterfaceC33031OooOO0
        public final U poll() throws Exception {
            T tPoll = this.f116286OooOoO0.poll();
            if (tPoll == null) {
                return null;
            }
            U uApply = this.f119469OooOoOO.apply(tPoll);
            o00Oo0.OooO00o(uApply, "The mapper function returned a null value.");
            return uApply;
        }
    }

    public C33018OooOO0O(AbstractC33498OooOOO0 abstractC33498OooOOO0, InterfaceC32331OooO0OO interfaceC32331OooO0OO) {
        super(abstractC33498OooOOO0);
        this.f119468OooOo = interfaceC32331OooO0OO;
    }

    @Override // oO0OooOO.AbstractC33498OooOOO0
    public final void OooO0OO(InterfaceC33499OooOOOO<? super U> interfaceC33499OooOOOO) {
        this.f119410OooOo0o.OooO0O0(new OooO00o(interfaceC33499OooOOOO, this.f119468OooOo));
    }
}

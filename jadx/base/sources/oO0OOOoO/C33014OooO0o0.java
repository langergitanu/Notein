package oO0OOOoO;

import com.google.firebase.inappmessaging.internal.C22760OoooOOo;
import o0o0OO0.C30416Oooo0OO;
import oO00o0O0.AbstractC32340OooO00o;
import oO0OooOO.InterfaceC33499OooOOOO;

/* JADX INFO: renamed from: oO0OOOoO.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33014OooO0o0<T> extends AbstractC33009OooO00o<T, T> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final C22760OoooOOo f119448OooOo;

    /* JADX INFO: renamed from: oO0OOOoO.OooO0o0$OooO00o */
    public static final class OooO00o<T> extends AbstractC32340OooO00o<T, T> {

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public final C22760OoooOOo f119449OooOoOO;

        public OooO00o(InterfaceC33499OooOOOO interfaceC33499OooOOOO, C22760OoooOOo c22760OoooOOo) {
            super(interfaceC33499OooOOOO);
            this.f119449OooOoOO = c22760OoooOOo;
        }

        @Override // oO0OOOoo.InterfaceC33027OooO0o
        public final int OooO0O0(int i) {
            return 0;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // oO0OooOO.InterfaceC33499OooOOOO
        public final void onNext(T t) {
            InterfaceC33499OooOOOO<? super R> interfaceC33499OooOOOO = this.f116284OooOo0o;
            try {
                if (this.f119449OooOoOO.test(t)) {
                    interfaceC33499OooOOOO.onNext((Object) t);
                }
            } catch (Throwable th) {
                C30416Oooo0OO.OooO00o(th);
                this.f116283OooOo.dispose();
                onError(th);
            }
        }

        @Override // oO0OOOoo.InterfaceC33031OooOO0
        public final T poll() throws Exception {
            T tPoll;
            do {
                tPoll = this.f116286OooOoO0.poll();
                if (tPoll == null) {
                    break;
                }
            } while (!this.f119449OooOoOO.test(tPoll));
            return tPoll;
        }
    }

    public C33014OooO0o0(C33017OooOO0 c33017OooOO0, C22760OoooOOo c22760OoooOOo) {
        super(c33017OooOO0);
        this.f119448OooOo = c22760OoooOOo;
    }

    @Override // oO0OooOO.AbstractC33498OooOOO0
    public final void OooO0OO(InterfaceC33499OooOOOO<? super T> interfaceC33499OooOOOO) {
        this.f119410OooOo0o.OooO0O0(new OooO00o(interfaceC33499OooOOOO, this.f119448OooOo));
    }
}

package oOo00ooo;

import java.util.Objects;
import oO00o.AbstractC32316OooO0OO;
import oO00o.InterfaceC32319OooO0o0;
import oO00oO00.InterfaceC32403OooO0OO;
import oO00oO0O.AbstractC32405OooO00o;
import oO0o0OO.C33669o000oOoO;

/* JADX INFO: renamed from: oOo00ooo.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34581OooO0o<T, U> extends AbstractC34577OooO00o<T, U> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final InterfaceC32403OooO0OO<? super T, ? extends U> f123862OooO0O0;

    /* JADX INFO: renamed from: oOo00ooo.OooO0o$OooO00o */
    public static final class OooO00o<T, U> extends AbstractC32405OooO00o<T, U> {

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public final InterfaceC32403OooO0OO<? super T, ? extends U> f123863OooOoOO;

        public OooO00o(InterfaceC32319OooO0o0<? super U> interfaceC32319OooO0o0, InterfaceC32403OooO0OO<? super T, ? extends U> interfaceC32403OooO0OO) {
            super(interfaceC32319OooO0o0);
            this.f123863OooOoOO = interfaceC32403OooO0OO;
        }

        @Override // oOo00ooO.InterfaceC34571OooO0OO
        public final int OooO0O0(int i) {
            return 0;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // oO00o.InterfaceC32319OooO0o0
        public final void onNext(T t) {
            if (this.f116508OooOoO) {
                return;
            }
            InterfaceC32319OooO0o0<? super R> interfaceC32319OooO0o0 = this.f116507OooOo0o;
            try {
                U uApply = this.f123863OooOoOO.apply(t);
                Objects.requireNonNull(uApply, "The mapper function returned a null value.");
                interfaceC32319OooO0o0.onNext((Object) uApply);
            } catch (Throwable th) {
                C33669o000oOoO.OooO0O0(th);
                this.f116506OooOo.dispose();
                onError(th);
            }
        }

        @Override // oOo00ooO.InterfaceC34575OooO0oO
        public final U poll() throws Throwable {
            T tPoll = this.f116509OooOoO0.poll();
            if (tPoll == null) {
                return null;
            }
            U uApply = this.f123863OooOoOO.apply(tPoll);
            Objects.requireNonNull(uApply, "The mapper function returned a null value.");
            return uApply;
        }
    }

    public C34581OooO0o(AbstractC32316OooO0OO abstractC32316OooO0OO, InterfaceC32403OooO0OO interfaceC32403OooO0OO) {
        super(abstractC32316OooO0OO);
        this.f123862OooO0O0 = interfaceC32403OooO0OO;
    }

    @Override // oO00o.AbstractC32316OooO0OO
    public final void OooO0OO(InterfaceC32319OooO0o0<? super U> interfaceC32319OooO0o0) {
        this.f123831OooO00o.OooO00o(new OooO00o(interfaceC32319OooO0o0, this.f123862OooO0O0));
    }
}

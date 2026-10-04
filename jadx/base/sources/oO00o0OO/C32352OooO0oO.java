package oO00o0OO;

import java.util.concurrent.atomic.AtomicReference;
import o0Oo0oOo.o00Oo0;
import o0o0OO0.C30416Oooo0OO;
import oO00o00o.InterfaceC32331OooO0OO;
import oO0OooOO.AbstractC33485OooO;
import oO0OooOO.AbstractC33487OooO0O0;
import oO0OooOO.InterfaceC33488OooO0OO;
import oO0OooOO.InterfaceC33489OooO0Oo;
import oO0OooOO.InterfaceC33495OooOO0O;
import ooOOo0.EnumC35109OooO0O0;

/* JADX INFO: renamed from: oO00o0OO.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32352OooO0oO<T> extends AbstractC33487OooO0O0 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final InterfaceC32331OooO0OO<? super T, ? extends InterfaceC33489OooO0Oo> f116306OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final AbstractC33485OooO f116307OooOo0o;

    /* JADX INFO: renamed from: oO00o0OO.OooO0oO$OooO00o */
    public static final class OooO00o<T> extends AtomicReference<oO0OOO00.OooO0O0> implements InterfaceC33495OooOO0O<T>, InterfaceC33488OooO0OO, oO0OOO00.OooO0O0 {
        private static final long serialVersionUID = -2177128922851101253L;

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final InterfaceC32331OooO0OO<? super T, ? extends InterfaceC33489OooO0Oo> f116308OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final InterfaceC33488OooO0OO f116309OooOo0o;

        public OooO00o(InterfaceC33488OooO0OO interfaceC33488OooO0OO, InterfaceC32331OooO0OO<? super T, ? extends InterfaceC33489OooO0Oo> interfaceC32331OooO0OO) {
            this.f116309OooOo0o = interfaceC33488OooO0OO;
            this.f116308OooOo = interfaceC32331OooO0OO;
        }

        @Override // oO0OooOO.InterfaceC33495OooOO0O
        public final void OooO00o(oO0OOO00.OooO0O0 oooO0O0) {
            EnumC35109OooO0O0.OooO0OO(this, oooO0O0);
        }

        @Override // oO0OOO00.OooO0O0
        public final void dispose() {
            EnumC35109OooO0O0.OooO00o(this);
        }

        @Override // oO0OooOO.InterfaceC33495OooOO0O
        public final void onComplete() {
            this.f116309OooOo0o.onComplete();
        }

        @Override // oO0OooOO.InterfaceC33495OooOO0O
        public final void onError(Throwable th) {
            this.f116309OooOo0o.onError(th);
        }

        @Override // oO0OooOO.InterfaceC33495OooOO0O
        public final void onSuccess(T t) {
            try {
                InterfaceC33489OooO0Oo interfaceC33489OooO0OoApply = this.f116308OooOo.apply(t);
                o00Oo0.OooO00o(interfaceC33489OooO0OoApply, "The mapper returned a null CompletableSource");
                InterfaceC33489OooO0Oo interfaceC33489OooO0Oo = interfaceC33489OooO0OoApply;
                if (EnumC35109OooO0O0.OooO0O0(get())) {
                    return;
                }
                interfaceC33489OooO0Oo.OooO00o(this);
            } catch (Throwable th) {
                C30416Oooo0OO.OooO00o(th);
                onError(th);
            }
        }
    }

    public C32352OooO0oO(AbstractC33485OooO abstractC33485OooO, InterfaceC32331OooO0OO interfaceC32331OooO0OO) {
        this.f116307OooOo0o = abstractC33485OooO;
        this.f116306OooOo = interfaceC32331OooO0OO;
    }

    @Override // oO0OooOO.AbstractC33487OooO0O0
    public final void OooO0o0(InterfaceC33488OooO0OO interfaceC33488OooO0OO) {
        OooO00o oooO00o = new OooO00o(interfaceC33488OooO0OO, this.f116306OooOo);
        interfaceC33488OooO0OO.OooO00o(oooO00o);
        this.f116307OooOo0o.OooO00o(oooO00o);
    }
}

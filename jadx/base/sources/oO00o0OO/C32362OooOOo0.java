package oO00o0OO;

import o0o0OO0.C30416Oooo0OO;
import oO00o0.OooO00o;
import oO00o00o.InterfaceC32330OooO0O0;
import oO0OooOO.AbstractC33485OooO;
import oO0OooOO.InterfaceC33495OooOO0O;
import ooOOo0.EnumC35109OooO0O0;
import ooOOo0.EnumC35110OooO0OO;

/* JADX INFO: renamed from: oO00o0OO.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32362OooOOo0<T> extends AbstractC32346OooO00o<T, T> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final OooO00o.OooO0OO f116345OooOo;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final InterfaceC32330OooO0O0<? super Throwable> f116346OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final InterfaceC32330OooO0O0<? super T> f116347OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final OooO00o.OooO0O0 f116348OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final OooO00o.OooO0O0 f116349OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final OooO00o.OooO0O0 f116350OooOoo0;

    /* JADX INFO: renamed from: oO00o0OO.OooOOo0$OooO00o */
    public static final class OooO00o<T> implements InterfaceC33495OooOO0O<T>, oO0OOO00.OooO0O0 {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final C32362OooOOo0<T> f116351OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final InterfaceC33495OooOO0O<? super T> f116352OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public oO0OOO00.OooO0O0 f116353OooOoO0;

        public OooO00o(InterfaceC33495OooOO0O<? super T> interfaceC33495OooOO0O, C32362OooOOo0<T> c32362OooOOo0) {
            this.f116352OooOo0o = interfaceC33495OooOO0O;
            this.f116351OooOo = c32362OooOOo0;
        }

        @Override // oO0OooOO.InterfaceC33495OooOO0O
        public final void OooO00o(oO0OOO00.OooO0O0 oooO0O0) {
            InterfaceC33495OooOO0O<? super T> interfaceC33495OooOO0O = this.f116352OooOo0o;
            if (EnumC35109OooO0O0.OooO0o0(this.f116353OooOoO0, oooO0O0)) {
                try {
                    this.f116351OooOo.f116345OooOo.getClass();
                    this.f116353OooOoO0 = oooO0O0;
                    interfaceC33495OooOO0O.OooO00o(this);
                } catch (Throwable th) {
                    C30416Oooo0OO.OooO00o(th);
                    oooO0O0.dispose();
                    this.f116353OooOoO0 = EnumC35109OooO0O0.f126092OooOo0o;
                    interfaceC33495OooOO0O.OooO00o(EnumC35110OooO0OO.f126094OooOo0o);
                    interfaceC33495OooOO0O.onError(th);
                }
            }
        }

        public final void OooO0O0() {
            try {
                this.f116351OooOo.f116350OooOoo0.getClass();
            } catch (Throwable th) {
                C30416Oooo0OO.OooO00o(th);
                oO0OOO0O.OooO00o.OooO0O0(th);
            }
        }

        public final void OooO0OO(Throwable th) {
            try {
                this.f116351OooOo.f116346OooOoO.accept(th);
            } catch (Throwable th2) {
                C30416Oooo0OO.OooO00o(th2);
                th = new oO00o00O.OooO00o(th, th2);
            }
            this.f116353OooOoO0 = EnumC35109OooO0O0.f126092OooOo0o;
            this.f116352OooOo0o.onError(th);
            OooO0O0();
        }

        @Override // oO0OOO00.OooO0O0
        public final void dispose() {
            try {
                this.f116351OooOo.f116349OooOoo.getClass();
            } catch (Throwable th) {
                C30416Oooo0OO.OooO00o(th);
                oO0OOO0O.OooO00o.OooO0O0(th);
            }
            this.f116353OooOoO0.dispose();
            this.f116353OooOoO0 = EnumC35109OooO0O0.f126092OooOo0o;
        }

        @Override // oO0OooOO.InterfaceC33495OooOO0O
        public final void onComplete() {
            oO0OOO00.OooO0O0 oooO0O0 = this.f116353OooOoO0;
            EnumC35109OooO0O0 enumC35109OooO0O0 = EnumC35109OooO0O0.f126092OooOo0o;
            if (oooO0O0 == enumC35109OooO0O0) {
                return;
            }
            try {
                this.f116351OooOo.f116348OooOoOO.getClass();
                this.f116353OooOoO0 = enumC35109OooO0O0;
                this.f116352OooOo0o.onComplete();
                OooO0O0();
            } catch (Throwable th) {
                C30416Oooo0OO.OooO00o(th);
                OooO0OO(th);
            }
        }

        @Override // oO0OooOO.InterfaceC33495OooOO0O
        public final void onError(Throwable th) {
            if (this.f116353OooOoO0 == EnumC35109OooO0O0.f126092OooOo0o) {
                oO0OOO0O.OooO00o.OooO0O0(th);
            } else {
                OooO0OO(th);
            }
        }

        @Override // oO0OooOO.InterfaceC33495OooOO0O
        public final void onSuccess(T t) {
            oO0OOO00.OooO0O0 oooO0O0 = this.f116353OooOoO0;
            EnumC35109OooO0O0 enumC35109OooO0O0 = EnumC35109OooO0O0.f126092OooOo0o;
            if (oooO0O0 == enumC35109OooO0O0) {
                return;
            }
            try {
                this.f116351OooOo.f116347OooOoO0.accept(t);
                this.f116353OooOoO0 = enumC35109OooO0O0;
                this.f116352OooOo0o.onSuccess(t);
                OooO0O0();
            } catch (Throwable th) {
                C30416Oooo0OO.OooO00o(th);
                OooO0OO(th);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32362OooOOo0(AbstractC33485OooO abstractC33485OooO, InterfaceC32330OooO0O0 interfaceC32330OooO0O0, InterfaceC32330OooO0O0 interfaceC32330OooO0O02) {
        super(abstractC33485OooO);
        OooO00o.OooO0OO oooO0OO = oO00o0.OooO00o.f116238OooO0Oo;
        OooO00o.OooO0O0 oooO0O0 = oO00o0.OooO00o.f116237OooO0OO;
        this.f116345OooOo = oooO0OO;
        this.f116347OooOoO0 = interfaceC32330OooO0O0;
        this.f116346OooOoO = interfaceC32330OooO0O02;
        this.f116348OooOoOO = oooO0O0;
        this.f116350OooOoo0 = oooO0O0;
        this.f116349OooOoo = oooO0O0;
    }

    @Override // oO0OooOO.AbstractC33485OooO
    public final void OooO0OO(InterfaceC33495OooOO0O<? super T> interfaceC33495OooOO0O) {
        this.f116290OooOo0o.OooO00o(new OooO00o(interfaceC33495OooOO0O, this));
    }
}

package oO00o0OO;

import o0Oo0oOo.o00Oo0;
import o0o0OO0.C30416Oooo0OO;
import oO00o00o.InterfaceC32331OooO0OO;
import oO0OooOO.AbstractC33485OooO;
import oO0OooOO.InterfaceC33495OooOO0O;
import ooOOo0.EnumC35109OooO0O0;

/* JADX INFO: renamed from: oO00o0OO.OooOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32357OooOOO<T, R> extends AbstractC32346OooO00o<T, R> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final InterfaceC32331OooO0OO<? super T, ? extends R> f116323OooOo;

    /* JADX INFO: renamed from: oO00o0OO.OooOOO$OooO00o */
    public static final class OooO00o<T, R> implements InterfaceC33495OooOO0O<T>, oO0OOO00.OooO0O0 {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final InterfaceC32331OooO0OO<? super T, ? extends R> f116324OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final InterfaceC33495OooOO0O<? super R> f116325OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public oO0OOO00.OooO0O0 f116326OooOoO0;

        public OooO00o(InterfaceC33495OooOO0O<? super R> interfaceC33495OooOO0O, InterfaceC32331OooO0OO<? super T, ? extends R> interfaceC32331OooO0OO) {
            this.f116325OooOo0o = interfaceC33495OooOO0O;
            this.f116324OooOo = interfaceC32331OooO0OO;
        }

        @Override // oO0OooOO.InterfaceC33495OooOO0O
        public final void OooO00o(oO0OOO00.OooO0O0 oooO0O0) {
            if (EnumC35109OooO0O0.OooO0o0(this.f116326OooOoO0, oooO0O0)) {
                this.f116326OooOoO0 = oooO0O0;
                this.f116325OooOo0o.OooO00o(this);
            }
        }

        @Override // oO0OOO00.OooO0O0
        public final void dispose() {
            oO0OOO00.OooO0O0 oooO0O0 = this.f116326OooOoO0;
            this.f116326OooOoO0 = EnumC35109OooO0O0.f126092OooOo0o;
            oooO0O0.dispose();
        }

        @Override // oO0OooOO.InterfaceC33495OooOO0O
        public final void onComplete() {
            this.f116325OooOo0o.onComplete();
        }

        @Override // oO0OooOO.InterfaceC33495OooOO0O
        public final void onError(Throwable th) {
            this.f116325OooOo0o.onError(th);
        }

        @Override // oO0OooOO.InterfaceC33495OooOO0O
        public final void onSuccess(T t) {
            InterfaceC33495OooOO0O<? super R> interfaceC33495OooOO0O = this.f116325OooOo0o;
            try {
                R rApply = this.f116324OooOo.apply(t);
                o00Oo0.OooO00o(rApply, "The mapper returned a null item");
                interfaceC33495OooOO0O.onSuccess(rApply);
            } catch (Throwable th) {
                C30416Oooo0OO.OooO00o(th);
                interfaceC33495OooOO0O.onError(th);
            }
        }
    }

    public C32357OooOOO(AbstractC33485OooO abstractC33485OooO, InterfaceC32331OooO0OO interfaceC32331OooO0OO) {
        super(abstractC33485OooO);
        this.f116323OooOo = interfaceC32331OooO0OO;
    }

    @Override // oO0OooOO.AbstractC33485OooO
    public final void OooO0OO(InterfaceC33495OooOO0O<? super R> interfaceC33495OooOO0O) {
        this.f116290OooOo0o.OooO00o(new OooO00o(interfaceC33495OooOO0O, this.f116323OooOo));
    }
}

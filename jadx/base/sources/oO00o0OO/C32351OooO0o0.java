package oO00o0OO;

import o0o0OO0.C30416Oooo0OO;
import oO00o00o.InterfaceC32332OooO0Oo;
import oO0OooOO.AbstractC33485OooO;
import oO0OooOO.InterfaceC33495OooOO0O;
import ooOOo0.EnumC35109OooO0O0;

/* JADX INFO: renamed from: oO00o0OO.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32351OooO0o0<T> extends AbstractC32346OooO00o<T, T> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final InterfaceC32332OooO0Oo<? super T> f116302OooOo;

    /* JADX INFO: renamed from: oO00o0OO.OooO0o0$OooO00o */
    public static final class OooO00o<T> implements InterfaceC33495OooOO0O<T>, oO0OOO00.OooO0O0 {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final InterfaceC32332OooO0Oo<? super T> f116303OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final InterfaceC33495OooOO0O<? super T> f116304OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public oO0OOO00.OooO0O0 f116305OooOoO0;

        public OooO00o(InterfaceC33495OooOO0O<? super T> interfaceC33495OooOO0O, InterfaceC32332OooO0Oo<? super T> interfaceC32332OooO0Oo) {
            this.f116304OooOo0o = interfaceC33495OooOO0O;
            this.f116303OooOo = interfaceC32332OooO0Oo;
        }

        @Override // oO0OooOO.InterfaceC33495OooOO0O
        public final void OooO00o(oO0OOO00.OooO0O0 oooO0O0) {
            if (EnumC35109OooO0O0.OooO0o0(this.f116305OooOoO0, oooO0O0)) {
                this.f116305OooOoO0 = oooO0O0;
                this.f116304OooOo0o.OooO00o(this);
            }
        }

        @Override // oO0OOO00.OooO0O0
        public final void dispose() {
            oO0OOO00.OooO0O0 oooO0O0 = this.f116305OooOoO0;
            this.f116305OooOoO0 = EnumC35109OooO0O0.f126092OooOo0o;
            oooO0O0.dispose();
        }

        @Override // oO0OooOO.InterfaceC33495OooOO0O
        public final void onComplete() {
            this.f116304OooOo0o.onComplete();
        }

        @Override // oO0OooOO.InterfaceC33495OooOO0O
        public final void onError(Throwable th) {
            this.f116304OooOo0o.onError(th);
        }

        @Override // oO0OooOO.InterfaceC33495OooOO0O
        public final void onSuccess(T t) {
            InterfaceC33495OooOO0O<? super T> interfaceC33495OooOO0O = this.f116304OooOo0o;
            try {
                if (this.f116303OooOo.test(t)) {
                    interfaceC33495OooOO0O.onSuccess(t);
                } else {
                    interfaceC33495OooOO0O.onComplete();
                }
            } catch (Throwable th) {
                C30416Oooo0OO.OooO00o(th);
                interfaceC33495OooOO0O.onError(th);
            }
        }
    }

    public C32351OooO0o0(AbstractC33485OooO abstractC33485OooO, InterfaceC32332OooO0Oo interfaceC32332OooO0Oo) {
        super(abstractC33485OooO);
        this.f116302OooOo = interfaceC32332OooO0Oo;
    }

    @Override // oO0OooOO.AbstractC33485OooO
    public final void OooO0OO(InterfaceC33495OooOO0O<? super T> interfaceC33495OooOO0O) {
        this.f116290OooOo0o.OooO00o(new OooO00o(interfaceC33495OooOO0O, this.f116302OooOo));
    }
}

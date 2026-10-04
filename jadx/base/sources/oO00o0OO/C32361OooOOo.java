package oO00o0OO;

import java.util.concurrent.atomic.AtomicReference;
import oO0OooOO.AbstractC33485OooO;
import oO0OooOO.AbstractC33500OooOOOo;
import oO0OooOO.InterfaceC33495OooOO0O;
import ooOOo0.C35112OooO0o0;
import ooOOo0.EnumC35109OooO0O0;

/* JADX INFO: renamed from: oO00o0OO.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32361OooOOo<T> extends AbstractC32346OooO00o<T, T> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final AbstractC33500OooOOOo f116340OooOo;

    /* JADX INFO: renamed from: oO00o0OO.OooOOo$OooO00o */
    public static final class OooO00o<T> extends AtomicReference<oO0OOO00.OooO0O0> implements InterfaceC33495OooOO0O<T>, oO0OOO00.OooO0O0 {
        private static final long serialVersionUID = 8571289934935992137L;

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final InterfaceC33495OooOO0O<? super T> f116341OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final C35112OooO0o0 f116342OooOo0o = new C35112OooO0o0();

        public OooO00o(InterfaceC33495OooOO0O<? super T> interfaceC33495OooOO0O) {
            this.f116341OooOo = interfaceC33495OooOO0O;
        }

        @Override // oO0OooOO.InterfaceC33495OooOO0O
        public final void OooO00o(oO0OOO00.OooO0O0 oooO0O0) {
            EnumC35109OooO0O0.OooO0Oo(this, oooO0O0);
        }

        @Override // oO0OOO00.OooO0O0
        public final void dispose() {
            EnumC35109OooO0O0.OooO00o(this);
            C35112OooO0o0 c35112OooO0o0 = this.f116342OooOo0o;
            c35112OooO0o0.getClass();
            EnumC35109OooO0O0.OooO00o(c35112OooO0o0);
        }

        @Override // oO0OooOO.InterfaceC33495OooOO0O
        public final void onComplete() {
            this.f116341OooOo.onComplete();
        }

        @Override // oO0OooOO.InterfaceC33495OooOO0O
        public final void onError(Throwable th) {
            this.f116341OooOo.onError(th);
        }

        @Override // oO0OooOO.InterfaceC33495OooOO0O
        public final void onSuccess(T t) {
            this.f116341OooOo.onSuccess(t);
        }
    }

    /* JADX INFO: renamed from: oO00o0OO.OooOOo$OooO0O0 */
    public static final class OooO0O0<T> implements Runnable {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final AbstractC33485OooO f116343OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final OooO00o f116344OooOo0o;

        public OooO0O0(OooO00o oooO00o, AbstractC33485OooO abstractC33485OooO) {
            this.f116344OooOo0o = oooO00o;
            this.f116343OooOo = abstractC33485OooO;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f116343OooOo.OooO00o(this.f116344OooOo0o);
        }
    }

    public C32361OooOOo(C32360OooOOOo c32360OooOOOo, AbstractC33500OooOOOo abstractC33500OooOOOo) {
        super(c32360OooOOOo);
        this.f116340OooOo = abstractC33500OooOOOo;
    }

    @Override // oO0OooOO.AbstractC33485OooO
    public final void OooO0OO(InterfaceC33495OooOO0O<? super T> interfaceC33495OooOO0O) {
        OooO00o oooO00o = new OooO00o(interfaceC33495OooOO0O);
        interfaceC33495OooOO0O.OooO00o(oooO00o);
        oO0OOO00.OooO0O0 OooO0O02 = this.f116340OooOo.OooO0O0(new OooO0O0(oooO00o, this.f116290OooOo0o));
        C35112OooO0o0 c35112OooO0o0 = oooO00o.f116342OooOo0o;
        c35112OooO0o0.getClass();
        EnumC35109OooO0O0.OooO0OO(c35112OooO0o0, OooO0O02);
    }
}

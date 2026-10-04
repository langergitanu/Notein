package oO00o0OO;

import java.util.concurrent.atomic.AtomicReference;
import oO0OooOO.AbstractC33485OooO;
import oO0OooOO.InterfaceC33495OooOO0O;
import ooOOo0.EnumC35109OooO0O0;

/* JADX INFO: renamed from: oO00o0OO.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32363OooOOoo<T> extends AbstractC32346OooO00o<T, T> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final AbstractC33485OooO f116354OooOo;

    /* JADX INFO: renamed from: oO00o0OO.OooOOoo$OooO00o */
    public static final class OooO00o<T> extends AtomicReference<oO0OOO00.OooO0O0> implements InterfaceC33495OooOO0O<T>, oO0OOO00.OooO0O0 {
        private static final long serialVersionUID = -2223459372976438024L;

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final AbstractC33485OooO f116355OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final InterfaceC33495OooOO0O<? super T> f116356OooOo0o;

        /* JADX INFO: renamed from: oO00o0OO.OooOOoo$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C20221OooO00o<T> implements InterfaceC33495OooOO0O<T> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final OooO00o f116357OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final InterfaceC33495OooOO0O<? super T> f116358OooOo0o;

            public C20221OooO00o(InterfaceC33495OooOO0O interfaceC33495OooOO0O, OooO00o oooO00o) {
                this.f116358OooOo0o = interfaceC33495OooOO0O;
                this.f116357OooOo = oooO00o;
            }

            @Override // oO0OooOO.InterfaceC33495OooOO0O
            public final void OooO00o(oO0OOO00.OooO0O0 oooO0O0) {
                EnumC35109OooO0O0.OooO0Oo(this.f116357OooOo, oooO0O0);
            }

            @Override // oO0OooOO.InterfaceC33495OooOO0O
            public final void onComplete() {
                this.f116358OooOo0o.onComplete();
            }

            @Override // oO0OooOO.InterfaceC33495OooOO0O
            public final void onError(Throwable th) {
                this.f116358OooOo0o.onError(th);
            }

            @Override // oO0OooOO.InterfaceC33495OooOO0O
            public final void onSuccess(T t) {
                this.f116358OooOo0o.onSuccess(t);
            }
        }

        public OooO00o(InterfaceC33495OooOO0O interfaceC33495OooOO0O, AbstractC33485OooO abstractC33485OooO) {
            this.f116356OooOo0o = interfaceC33495OooOO0O;
            this.f116355OooOo = abstractC33485OooO;
        }

        @Override // oO0OooOO.InterfaceC33495OooOO0O
        public final void OooO00o(oO0OOO00.OooO0O0 oooO0O0) {
            if (EnumC35109OooO0O0.OooO0Oo(this, oooO0O0)) {
                this.f116356OooOo0o.OooO00o(this);
            }
        }

        @Override // oO0OOO00.OooO0O0
        public final void dispose() {
            EnumC35109OooO0O0.OooO00o(this);
        }

        @Override // oO0OooOO.InterfaceC33495OooOO0O
        public final void onComplete() {
            oO0OOO00.OooO0O0 oooO0O0 = get();
            if (oooO0O0 == EnumC35109OooO0O0.f126092OooOo0o || !compareAndSet(oooO0O0, null)) {
                return;
            }
            this.f116355OooOo.OooO00o(new C20221OooO00o(this.f116356OooOo0o, this));
        }

        @Override // oO0OooOO.InterfaceC33495OooOO0O
        public final void onError(Throwable th) {
            this.f116356OooOo0o.onError(th);
        }

        @Override // oO0OooOO.InterfaceC33495OooOO0O
        public final void onSuccess(T t) {
            this.f116356OooOo0o.onSuccess(t);
        }
    }

    public C32363OooOOoo(AbstractC33485OooO abstractC33485OooO, AbstractC33485OooO abstractC33485OooO2) {
        super(abstractC33485OooO);
        this.f116354OooOo = abstractC33485OooO2;
    }

    @Override // oO0OooOO.AbstractC33485OooO
    public final void OooO0OO(InterfaceC33495OooOO0O<? super T> interfaceC33495OooOO0O) {
        this.f116290OooOo0o.OooO00o(new OooO00o(interfaceC33495OooOO0O, this.f116354OooOo));
    }
}

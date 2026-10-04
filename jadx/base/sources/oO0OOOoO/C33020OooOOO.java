package oO0OOOoO;

import oO0OooOO.InterfaceC33499OooOOOO;
import ooOOo0.C35112OooO0o0;

/* JADX INFO: renamed from: oO0OOOoO.OooOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33020OooOOO<T> extends AbstractC33009OooO00o<T, T> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final C33017OooOO0 f119472OooOo;

    /* JADX INFO: renamed from: oO0OOOoO.OooOOO$OooO00o */
    public static final class OooO00o<T> implements InterfaceC33499OooOOOO<T> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final C33017OooOO0 f119473OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final InterfaceC33499OooOOOO<? super T> f119474OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public boolean f119475OooOoO = true;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final C35112OooO0o0 f119476OooOoO0 = new C35112OooO0o0();

        public OooO00o(InterfaceC33499OooOOOO interfaceC33499OooOOOO, C33017OooOO0 c33017OooOO0) {
            this.f119474OooOo0o = interfaceC33499OooOOOO;
            this.f119473OooOo = c33017OooOO0;
        }

        @Override // oO0OooOO.InterfaceC33499OooOOOO
        public final void OooO00o(oO0OOO00.OooO0O0 oooO0O0) {
            this.f119476OooOoO0.OooO0O0(oooO0O0);
        }

        @Override // oO0OooOO.InterfaceC33499OooOOOO
        public final void onComplete() {
            if (!this.f119475OooOoO) {
                this.f119474OooOo0o.onComplete();
            } else {
                this.f119475OooOoO = false;
                this.f119473OooOo.OooO0O0(this);
            }
        }

        @Override // oO0OooOO.InterfaceC33499OooOOOO
        public final void onError(Throwable th) {
            this.f119474OooOo0o.onError(th);
        }

        @Override // oO0OooOO.InterfaceC33499OooOOOO
        public final void onNext(T t) {
            if (this.f119475OooOoO) {
                this.f119475OooOoO = false;
            }
            this.f119474OooOo0o.onNext(t);
        }
    }

    public C33020OooOOO(C33014OooO0o0 c33014OooO0o0, C33017OooOO0 c33017OooOO0) {
        super(c33014OooO0o0);
        this.f119472OooOo = c33017OooOO0;
    }

    @Override // oO0OooOO.AbstractC33498OooOOO0
    public final void OooO0OO(InterfaceC33499OooOOOO<? super T> interfaceC33499OooOOOO) {
        OooO00o oooO00o = new OooO00o(interfaceC33499OooOOOO, this.f119472OooOo);
        interfaceC33499OooOOOO.OooO00o(oooO00o.f119476OooOoO0);
        this.f119410OooOo0o.OooO0O0(oooO00o);
    }
}

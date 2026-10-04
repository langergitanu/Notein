package oO00o0OO;

import oO0OooOO.AbstractC33485OooO;
import oO0OooOO.AbstractC33487OooO0O0;
import oO0OooOO.InterfaceC33488OooO0OO;
import oO0OooOO.InterfaceC33495OooOO0O;
import ooOOo0.EnumC35109OooO0O0;

/* JADX INFO: renamed from: oO00o0OO.OooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32354OooOO0<T> extends AbstractC33485OooO<T> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final AbstractC33487OooO0O0 f116315OooOo0o;

    /* JADX INFO: renamed from: oO00o0OO.OooOO0$OooO00o */
    public static final class OooO00o<T> implements InterfaceC33488OooO0OO, oO0OOO00.OooO0O0 {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public oO0OOO00.OooO0O0 f116316OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final InterfaceC33495OooOO0O<? super T> f116317OooOo0o;

        public OooO00o(InterfaceC33495OooOO0O<? super T> interfaceC33495OooOO0O) {
            this.f116317OooOo0o = interfaceC33495OooOO0O;
        }

        @Override // oO0OooOO.InterfaceC33488OooO0OO
        public final void OooO00o(oO0OOO00.OooO0O0 oooO0O0) {
            if (EnumC35109OooO0O0.OooO0o0(this.f116316OooOo, oooO0O0)) {
                this.f116316OooOo = oooO0O0;
                this.f116317OooOo0o.OooO00o(this);
            }
        }

        @Override // oO0OOO00.OooO0O0
        public final void dispose() {
            this.f116316OooOo.dispose();
            this.f116316OooOo = EnumC35109OooO0O0.f126092OooOo0o;
        }

        @Override // oO0OooOO.InterfaceC33488OooO0OO
        public final void onComplete() {
            this.f116316OooOo = EnumC35109OooO0O0.f126092OooOo0o;
            this.f116317OooOo0o.onComplete();
        }

        @Override // oO0OooOO.InterfaceC33488OooO0OO
        public final void onError(Throwable th) {
            this.f116316OooOo = EnumC35109OooO0O0.f126092OooOo0o;
            this.f116317OooOo0o.onError(th);
        }
    }

    public C32354OooOO0(AbstractC33487OooO0O0 abstractC33487OooO0O0) {
        this.f116315OooOo0o = abstractC33487OooO0O0;
    }

    @Override // oO0OooOO.AbstractC33485OooO
    public final void OooO0OO(InterfaceC33495OooOO0O<? super T> interfaceC33495OooOO0O) {
        this.f116315OooOo0o.OooO00o(new OooO00o(interfaceC33495OooOO0O));
    }
}

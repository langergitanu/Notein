package oO00o0OO;

import oO0OOOoo.InterfaceC33025OooO0OO;
import oO0OooOO.AbstractC33502OooOOo0;
import oO0OooOO.InterfaceC33495OooOO0O;
import oO0OooOO.InterfaceC33501OooOOo;
import ooOOo0.EnumC35109OooO0O0;

/* JADX INFO: renamed from: oO00o0OO.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32356OooOO0o<T> extends AbstractC33502OooOOo0<Boolean> implements InterfaceC33025OooO0OO<Boolean> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C32351OooO0o0 f116320OooOo0o;

    /* JADX INFO: renamed from: oO00o0OO.OooOO0o$OooO00o */
    public static final class OooO00o<T> implements InterfaceC33495OooOO0O<T>, oO0OOO00.OooO0O0 {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public oO0OOO00.OooO0O0 f116321OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final InterfaceC33501OooOOo<? super Boolean> f116322OooOo0o;

        public OooO00o(InterfaceC33501OooOOo<? super Boolean> interfaceC33501OooOOo) {
            this.f116322OooOo0o = interfaceC33501OooOOo;
        }

        @Override // oO0OooOO.InterfaceC33495OooOO0O
        public final void OooO00o(oO0OOO00.OooO0O0 oooO0O0) {
            if (EnumC35109OooO0O0.OooO0o0(this.f116321OooOo, oooO0O0)) {
                this.f116321OooOo = oooO0O0;
                this.f116322OooOo0o.OooO00o(this);
            }
        }

        @Override // oO0OOO00.OooO0O0
        public final void dispose() {
            this.f116321OooOo.dispose();
            this.f116321OooOo = EnumC35109OooO0O0.f126092OooOo0o;
        }

        @Override // oO0OooOO.InterfaceC33495OooOO0O
        public final void onComplete() {
            this.f116321OooOo = EnumC35109OooO0O0.f126092OooOo0o;
            this.f116322OooOo0o.onSuccess(Boolean.TRUE);
        }

        @Override // oO0OooOO.InterfaceC33495OooOO0O
        public final void onError(Throwable th) {
            this.f116321OooOo = EnumC35109OooO0O0.f126092OooOo0o;
            this.f116322OooOo0o.onError(th);
        }

        @Override // oO0OooOO.InterfaceC33495OooOO0O
        public final void onSuccess(T t) {
            this.f116321OooOo = EnumC35109OooO0O0.f126092OooOo0o;
            this.f116322OooOo0o.onSuccess(Boolean.FALSE);
        }
    }

    public C32356OooOO0o(C32351OooO0o0 c32351OooO0o0) {
        this.f116320OooOo0o = c32351OooO0o0;
    }

    @Override // oO0OOOoo.InterfaceC33025OooO0OO
    public final C32355OooOO0O OooO0OO() {
        return new C32355OooOO0O(this.f116320OooOo0o);
    }

    @Override // oO0OooOO.AbstractC33502OooOOo0
    public final void OooO0o0(InterfaceC33501OooOOo<? super Boolean> interfaceC33501OooOOo) {
        this.f116320OooOo0o.OooO00o(new OooO00o(interfaceC33501OooOOo));
    }
}

package o0O0oooO;

import oO0OO0oo.C32929OooO00o;
import oO0OO0oo.InterfaceC32931OooO0OO;
import oO0OoOO0.C33287OooO0o0;
import oO0Ooooo.InterfaceC33522OooO00o;

/* JADX INFO: renamed from: o0O0oooO.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26266OooOOOo extends AbstractC26251OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C26269OooOOoo f89723OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C26266OooOOOo f89724OooO0O0 = this;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final InterfaceC32931OooO0OO<InterfaceC33522OooO00o> f89725OooO0OO = C32929OooO00o.OooO00o(new OooO00o());

    /* JADX INFO: renamed from: o0O0oooO.OooOOOo$OooO00o */
    public static final class OooO00o<T> implements InterfaceC32931OooO0OO<T> {
        @Override // oO00ooO0.InterfaceC32462OooO00o
        public final T get() {
            return (T) new C33287OooO0o0();
        }
    }

    public C26266OooOOOo(C26269OooOOoo c26269OooOOoo) {
        this.f89723OooO00o = c26269OooOOoo;
    }

    @Override // oO0OOooo.C33157OooO00o.InterfaceC20302OooO00o
    public final C26264OooOOO0 OooO00o() {
        return new C26264OooOOO0(this.f89723OooO00o, this.f89724OooO0O0);
    }

    @Override // oO0OOooo.C33159OooO0OO.InterfaceC20303OooO0OO
    public final InterfaceC33522OooO00o OooO0O0() {
        return this.f89725OooO0OO.get();
    }
}

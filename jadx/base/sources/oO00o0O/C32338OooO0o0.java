package oO00o0O;

import o0o0OO0.C30416Oooo0OO;
import oO00o0.OooO00o;
import oO0OooOO.AbstractC33487OooO0O0;
import oO0OooOO.InterfaceC33488OooO0OO;

/* JADX INFO: renamed from: oO00o0O.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32338OooO0o0 extends AbstractC33487OooO0O0 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final OooO00o.OooOO0 f116273OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C32337OooO0o f116274OooOo0o;

    /* JADX INFO: renamed from: oO00o0O.OooO0o0$OooO00o */
    public final class OooO00o implements InterfaceC33488OooO0OO {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final InterfaceC33488OooO0OO f116276OooOo0o;

        public OooO00o(InterfaceC33488OooO0OO interfaceC33488OooO0OO) {
            this.f116276OooOo0o = interfaceC33488OooO0OO;
        }

        @Override // oO0OooOO.InterfaceC33488OooO0OO
        public final void OooO00o(oO0OOO00.OooO0O0 oooO0O0) {
            this.f116276OooOo0o.OooO00o(oooO0O0);
        }

        @Override // oO0OooOO.InterfaceC33488OooO0OO
        public final void onComplete() {
            this.f116276OooOo0o.onComplete();
        }

        @Override // oO0OooOO.InterfaceC33488OooO0OO
        public final void onError(Throwable th) {
            InterfaceC33488OooO0OO interfaceC33488OooO0OO = this.f116276OooOo0o;
            try {
                C32338OooO0o0.this.f116273OooOo.getClass();
                interfaceC33488OooO0OO.onComplete();
            } catch (Throwable th2) {
                C30416Oooo0OO.OooO00o(th2);
                interfaceC33488OooO0OO.onError(new oO00o00O.OooO00o(th, th2));
            }
        }
    }

    public C32338OooO0o0(C32337OooO0o c32337OooO0o) {
        OooO00o.OooOO0 oooOO02 = oO00o0.OooO00o.f116239OooO0o;
        this.f116274OooOo0o = c32337OooO0o;
        this.f116273OooOo = oooOO02;
    }

    @Override // oO0OooOO.AbstractC33487OooO0O0
    public final void OooO0o0(InterfaceC33488OooO0OO interfaceC33488OooO0OO) {
        this.f116274OooOo0o.OooO00o(new OooO00o(interfaceC33488OooO0OO));
    }
}

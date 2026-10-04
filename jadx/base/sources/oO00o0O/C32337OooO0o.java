package oO00o0O;

import o0o0OO0.C30416Oooo0OO;
import oO00o0.OooO00o;
import oO00o00o.InterfaceC32329OooO00o;
import oO00o00o.InterfaceC32330OooO0O0;
import oO0OooOO.AbstractC33487OooO0O0;
import oO0OooOO.InterfaceC33488OooO0OO;
import ooOOo0.EnumC35109OooO0O0;
import ooOOo0.EnumC35110OooO0OO;

/* JADX INFO: renamed from: oO00o0O.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32337OooO0o extends AbstractC33487OooO0O0 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final OooO00o.OooO0OO f116263OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final AbstractC33487OooO0O0 f116264OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final InterfaceC32329OooO00o f116265OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final InterfaceC32330OooO0O0<? super Throwable> f116266OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final OooO00o.OooO0O0 f116267OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final OooO00o.OooO0O0 f116268OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final OooO00o.OooO0O0 f116269OooOoo0;

    /* JADX INFO: renamed from: oO00o0O.OooO0o$OooO00o */
    public final class OooO00o implements InterfaceC33488OooO0OO, oO0OOO00.OooO0O0 {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public oO0OOO00.OooO0O0 f116270OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final InterfaceC33488OooO0OO f116271OooOo0o;

        public OooO00o(InterfaceC33488OooO0OO interfaceC33488OooO0OO) {
            this.f116271OooOo0o = interfaceC33488OooO0OO;
        }

        @Override // oO0OooOO.InterfaceC33488OooO0OO
        public final void OooO00o(oO0OOO00.OooO0O0 oooO0O0) {
            InterfaceC33488OooO0OO interfaceC33488OooO0OO = this.f116271OooOo0o;
            try {
                C32337OooO0o.this.f116263OooOo.getClass();
                if (EnumC35109OooO0O0.OooO0o0(this.f116270OooOo, oooO0O0)) {
                    this.f116270OooOo = oooO0O0;
                    interfaceC33488OooO0OO.OooO00o(this);
                }
            } catch (Throwable th) {
                C30416Oooo0OO.OooO00o(th);
                oooO0O0.dispose();
                this.f116270OooOo = EnumC35109OooO0O0.f126092OooOo0o;
                interfaceC33488OooO0OO.OooO00o(EnumC35110OooO0OO.f126094OooOo0o);
                interfaceC33488OooO0OO.onError(th);
            }
        }

        @Override // oO0OOO00.OooO0O0
        public final void dispose() {
            try {
                C32337OooO0o.this.f116268OooOoo.getClass();
            } catch (Throwable th) {
                C30416Oooo0OO.OooO00o(th);
                oO0OOO0O.OooO00o.OooO0O0(th);
            }
            this.f116270OooOo.dispose();
        }

        @Override // oO0OooOO.InterfaceC33488OooO0OO
        public final void onComplete() {
            InterfaceC33488OooO0OO interfaceC33488OooO0OO = this.f116271OooOo0o;
            C32337OooO0o c32337OooO0o = C32337OooO0o.this;
            if (this.f116270OooOo == EnumC35109OooO0O0.f126092OooOo0o) {
                return;
            }
            try {
                c32337OooO0o.f116265OooOoO.run();
                c32337OooO0o.f116267OooOoOO.getClass();
                interfaceC33488OooO0OO.onComplete();
                try {
                    c32337OooO0o.f116269OooOoo0.getClass();
                } catch (Throwable th) {
                    C30416Oooo0OO.OooO00o(th);
                    oO0OOO0O.OooO00o.OooO0O0(th);
                }
            } catch (Throwable th2) {
                C30416Oooo0OO.OooO00o(th2);
                interfaceC33488OooO0OO.onError(th2);
            }
        }

        @Override // oO0OooOO.InterfaceC33488OooO0OO
        public final void onError(Throwable th) {
            C32337OooO0o c32337OooO0o = C32337OooO0o.this;
            if (this.f116270OooOo == EnumC35109OooO0O0.f126092OooOo0o) {
                oO0OOO0O.OooO00o.OooO0O0(th);
                return;
            }
            try {
                c32337OooO0o.f116266OooOoO0.accept(th);
                c32337OooO0o.f116267OooOoOO.getClass();
            } catch (Throwable th2) {
                C30416Oooo0OO.OooO00o(th2);
                th = new oO00o00O.OooO00o(th, th2);
            }
            this.f116271OooOo0o.onError(th);
            try {
                c32337OooO0o.f116269OooOoo0.getClass();
            } catch (Throwable th3) {
                C30416Oooo0OO.OooO00o(th3);
                oO0OOO0O.OooO00o.OooO0O0(th3);
            }
        }
    }

    public C32337OooO0o(AbstractC33487OooO0O0 abstractC33487OooO0O0, InterfaceC32330OooO0O0 interfaceC32330OooO0O0, InterfaceC32329OooO00o interfaceC32329OooO00o) {
        OooO00o.OooO0OO oooO0OO = oO00o0.OooO00o.f116238OooO0Oo;
        OooO00o.OooO0O0 oooO0O0 = oO00o0.OooO00o.f116237OooO0OO;
        this.f116264OooOo0o = abstractC33487OooO0O0;
        this.f116263OooOo = oooO0OO;
        this.f116266OooOoO0 = interfaceC32330OooO0O0;
        this.f116265OooOoO = interfaceC32329OooO00o;
        this.f116267OooOoOO = oooO0O0;
        this.f116269OooOoo0 = oooO0O0;
        this.f116268OooOoo = oooO0O0;
    }

    @Override // oO0OooOO.AbstractC33487OooO0O0
    public final void OooO0o0(InterfaceC33488OooO0OO interfaceC33488OooO0OO) {
        this.f116264OooOo0o.OooO00o(new OooO00o(interfaceC33488OooO0OO));
    }
}

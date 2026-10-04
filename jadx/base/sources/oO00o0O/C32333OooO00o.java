package oO00o0O;

import java.util.concurrent.atomic.AtomicInteger;
import oO0OooOO.AbstractC33487OooO0O0;
import oO0OooOO.InterfaceC33488OooO0OO;
import oO0OooOO.InterfaceC33489OooO0Oo;
import ooOOo0.C35112OooO0o0;
import ooOOo0.EnumC35109OooO0O0;

/* JADX INFO: renamed from: oO00o0O.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32333OooO00o extends AbstractC33487OooO0O0 {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final InterfaceC33489OooO0Oo[] f116255OooOo0o;

    /* JADX INFO: renamed from: oO00o0O.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C20217OooO00o extends AtomicInteger implements InterfaceC33488OooO0OO {
        private static final long serialVersionUID = -7965400327305809232L;

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final InterfaceC33489OooO0Oo[] f116256OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final InterfaceC33488OooO0OO f116257OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final C35112OooO0o0 f116258OooOoO = new C35112OooO0o0();

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public int f116259OooOoO0;

        public C20217OooO00o(InterfaceC33488OooO0OO interfaceC33488OooO0OO, InterfaceC33489OooO0Oo[] interfaceC33489OooO0OoArr) {
            this.f116257OooOo0o = interfaceC33488OooO0OO;
            this.f116256OooOo = interfaceC33489OooO0OoArr;
        }

        @Override // oO0OooOO.InterfaceC33488OooO0OO
        public final void OooO00o(oO0OOO00.OooO0O0 oooO0O0) {
            C35112OooO0o0 c35112OooO0o0 = this.f116258OooOoO;
            c35112OooO0o0.getClass();
            EnumC35109OooO0O0.OooO0OO(c35112OooO0o0, oooO0O0);
        }

        public final void OooO0O0() {
            C35112OooO0o0 c35112OooO0o0 = this.f116258OooOoO;
            if (!c35112OooO0o0.OooO00o() && getAndIncrement() == 0) {
                while (!c35112OooO0o0.OooO00o()) {
                    int i = this.f116259OooOoO0;
                    this.f116259OooOoO0 = i + 1;
                    InterfaceC33489OooO0Oo[] interfaceC33489OooO0OoArr = this.f116256OooOo;
                    if (i == interfaceC33489OooO0OoArr.length) {
                        this.f116257OooOo0o.onComplete();
                        return;
                    } else {
                        interfaceC33489OooO0OoArr[i].OooO00o(this);
                        if (decrementAndGet() == 0) {
                            return;
                        }
                    }
                }
            }
        }

        @Override // oO0OooOO.InterfaceC33488OooO0OO
        public final void onComplete() {
            OooO0O0();
        }

        @Override // oO0OooOO.InterfaceC33488OooO0OO
        public final void onError(Throwable th) {
            this.f116257OooOo0o.onError(th);
        }
    }

    public C32333OooO00o(InterfaceC33489OooO0Oo[] interfaceC33489OooO0OoArr) {
        this.f116255OooOo0o = interfaceC33489OooO0OoArr;
    }

    @Override // oO0OooOO.AbstractC33487OooO0O0
    public final void OooO0o0(InterfaceC33488OooO0OO interfaceC33488OooO0OO) {
        C20217OooO00o c20217OooO00o = new C20217OooO00o(interfaceC33488OooO0OO, this.f116255OooOo0o);
        interfaceC33488OooO0OO.OooO00o(c20217OooO00o.f116258OooOoO);
        c20217OooO00o.OooO0O0();
    }
}

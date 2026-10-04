package OooOooO;

import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0OOo.EnumC33692OooO0OO;
import oO0o0Oo.C33772OooooOo;
import oO0o0Oo.C33773Oooooo;

/* JADX INFO: renamed from: OooOooO.OooOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20735OooOOO implements InterfaceC20736OooOOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C33772OooooOo f59578OooO00o;

    public C20735OooOOO() {
        EnumC33692OooO0OO enumC33692OooO0OO = EnumC33692OooO0OO.f121452OooOo0o;
        this.f59578OooO00o = C33773Oooooo.OooO0O0(0, 16, 1);
    }

    @Override // OooOooO.InterfaceC20736OooOOO0
    public final boolean OooO00o(InterfaceC20734OooOO0o interfaceC20734OooOO0o) {
        return this.f59578OooO00o.OooO0Oo(interfaceC20734OooOO0o);
    }

    @Override // OooOooO.InterfaceC20736OooOOO0
    public final C33772OooooOo OooO0O0() {
        return this.f59578OooO00o;
    }

    @Override // OooOooO.InterfaceC20736OooOOO0
    public final Object OooO0OO(InterfaceC20734OooOO0o interfaceC20734OooOO0o, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        Object objEmit = this.f59578OooO00o.emit(interfaceC20734OooOO0o, abstractC32479OooO0OO);
        return objEmit == EnumC32485OooO00o.f116726OooOo0o ? objEmit : C32460OooOooO.f116667OooO00o;
    }
}

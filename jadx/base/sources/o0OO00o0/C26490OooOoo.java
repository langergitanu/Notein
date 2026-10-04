package o0OO00o0;

import o0000oOO.AbstractC24338OooO0o0;
import o0O0oooO.C26322o0000o;
import o0OOo0Oo.InterfaceC27295OooOO0O;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.C33649OoooOOo;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OO00o0.OooOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26490OooOoo implements InterfaceC27295OooOO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0000o0O.OooOO0<AbstractC24338OooO0o0> f91060OooO00o;

    public C26490OooOoo(o0000o0O.OooOO0<AbstractC24338OooO0o0> ds) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(ds, "ds");
        this.f91060OooO00o = ds;
        C34406OooO00o.f123390OooO00o.OooO00o("CustomOperateRepoImpl init", new Object[0]);
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        C33609OooO0oo.OooO0OO(C33633Oooo0.OooO00o(ExecutorC33873OooO0O0.f122045OooOoO0), null, null, new OooOo(this, null), 3);
    }

    @Override // o0OOo0Oo.InterfaceC27295OooOO0O
    public final Object OooO00o(boolean z, AbstractC32476OooO abstractC32476OooO) throws Throwable {
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C26487OooOoO(this, z, null), abstractC32476OooO);
        return objOooO0o == EnumC32485OooO00o.f116726OooOo0o ? objOooO0o : C32460OooOooO.f116667OooO00o;
    }

    @Override // o0OOo0Oo.InterfaceC27295OooOO0O
    public final Object OooO0O0(C26322o0000o c26322o0000o) throws Throwable {
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C26489OooOoOO(this, null), c26322o0000o);
        return objOooO0o == EnumC32485OooO00o.f116726OooOo0o ? objOooO0o : C32460OooOooO.f116667OooO00o;
    }

    @Override // o0OOo0Oo.InterfaceC27295OooOO0O
    public final C26486OooOo0o OooO0OO() {
        return new C26486OooOo0o(this.f91060OooO00o.getData(), 0);
    }
}

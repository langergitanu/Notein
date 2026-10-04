package OoooOOo;

import OooOo.C20483OooOo0O;
import OoooOOo.C21212OooOoO0;
import o00oO0O.InterfaceC25543Ooooooo;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: OoooOOo.OooOoOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21213OooOoOO extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<Object, C32460OooOooO> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C21212OooOoO0 f61550OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21213OooOoOO(C21212OooOoO0 c21212OooOoO0) {
        super(1);
        this.f61550OooOo0o = c21212OooOoO0;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final C32460OooOooO invoke(Object obj) {
        C21212OooOoO0 c21212OooOoO0 = this.f61550OooOo0o;
        c21212OooOoO0.getClass();
        synchronized (c21212OooOoO0.f61533OooO0o) {
            C21212OooOoO0.OooO00o oooO00o = c21212OooOoO0.f61536OooO0oo;
            kotlin.jvm.internal.OooOOO0.OooO0Oo(oooO00o);
            InterfaceC25543Ooooooo interfaceC25543Ooooooo = oooO00o.f61539OooO0O0;
            kotlin.jvm.internal.OooOOO0.OooO0Oo(interfaceC25543Ooooooo);
            int i = oooO00o.f61541OooO0Oo;
            C20483OooOo0O<Object> c20483OooOo0O = oooO00o.f61540OooO0OO;
            if (c20483OooOo0O == null) {
                c20483OooOo0O = new C20483OooOo0O<>((Object) null);
                oooO00o.f61540OooO0OO = c20483OooOo0O;
                oooO00o.f61542OooO0o.OooO(interfaceC25543Ooooooo, c20483OooOo0O);
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            }
            oooO00o.OooO0OO(obj, i, interfaceC25543Ooooooo, c20483OooOo0O);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}

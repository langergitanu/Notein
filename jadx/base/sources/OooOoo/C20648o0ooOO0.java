package OooOoo;

import OooOoOO.C20529OooOOOO;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: OooOoo.o0ooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20648o0ooOO0 extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<Long, C32460OooOooO> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ float f59184OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C20649o0ooOoO f59185OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ InterfaceC32507OooOO0o<Float, C32460OooOooO> f59186OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C20648o0ooOO0(C20649o0ooOoO c20649o0ooOoO, float f, InterfaceC32507OooOO0o<? super Float, C32460OooOooO> interfaceC32507OooOO0o) {
        super(1);
        this.f59185OooOo0o = c20649o0ooOoO;
        this.f59184OooOo = f;
        this.f59186OooOoO0 = interfaceC32507OooOO0o;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final C32460OooOooO invoke(Long l) {
        long jLongValue = l.longValue();
        C20649o0ooOoO c20649o0ooOoO = this.f59185OooOo0o;
        if (c20649o0ooOoO.f59191OooO00o == Long.MIN_VALUE) {
            c20649o0ooOoO.f59191OooO00o = jLongValue;
        }
        C20529OooOOOO c20529OooOOOO = new C20529OooOOOO(c20649o0ooOoO.f59194OooO0Oo);
        long jOooO0O0 = this.f59184OooOo == 0.0f ? C20649o0ooOoO.f59189OooO0o.OooO0O0(new C20529OooOOOO(c20649o0ooOoO.f59194OooO0Oo), C20649o0ooOoO.f59190OooO0o0, c20649o0ooOoO.f59192OooO0O0) : oO0O00O.OooO00o.OooO0OO((jLongValue - c20649o0ooOoO.f59191OooO00o) / r2);
        OooOoOO.o0ooOOo<C20529OooOOOO> o0ooooo2 = C20649o0ooOoO.f59189OooO0o;
        C20529OooOOOO c20529OooOOOO2 = C20649o0ooOoO.f59190OooO0o0;
        float f = ((C20529OooOOOO) o0ooooo2.OooO0o0(jOooO0O0, c20529OooOOOO, c20529OooOOOO2, c20649o0ooOoO.f59192OooO0O0)).f58643OooO00o;
        c20649o0ooOoO.f59192OooO0O0 = (C20529OooOOOO) o0ooooo2.OooO0Oo(jOooO0O0, c20529OooOOOO, c20529OooOOOO2, c20649o0ooOoO.f59192OooO0O0);
        c20649o0ooOoO.f59191OooO00o = jLongValue;
        float f2 = c20649o0ooOoO.f59194OooO0Oo - f;
        c20649o0ooOoO.f59194OooO0Oo = f;
        this.f59186OooOoO0.invoke(Float.valueOf(f2));
        return C32460OooOooO.f116667OooO00o;
    }
}

package o0000o0O;

import Oooo0.C20840Oooo0oO;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o0OOo.C33702OooOOO;

/* JADX INFO: loaded from: classes.dex */
public final class o00Ooo extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<Throwable, C32460OooOooO> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C24301o00ooo<Object> f81777OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C20840Oooo0oO f81778OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C24270OooOooo f81779OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00Ooo(C20840Oooo0oO c20840Oooo0oO, C24301o00ooo c24301o00ooo, C24270OooOooo c24270OooOooo) {
        super(1);
        this.f81778OooOo0o = c20840Oooo0oO;
        this.f81777OooOo = c24301o00ooo;
        this.f81779OooOoO0 = c24270OooOooo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final C32460OooOooO invoke(Throwable th) {
        C32460OooOooO c32460OooOooO;
        Throwable th2 = th;
        this.f81778OooOo0o.invoke(th2);
        C24301o00ooo<Object> c24301o00ooo = this.f81777OooOo;
        c24301o00ooo.f81793OooO0OO.OooOOOo(false, th2);
        do {
            Object objOooO0O0 = C33702OooOOO.OooO0O0(c24301o00ooo.f81793OooO0OO.OooO0oo());
            if (objOooO0O0 != null) {
                this.f81779OooOoO0.invoke(objOooO0O0, th2);
                c32460OooOooO = C32460OooOooO.f116667OooO00o;
            } else {
                c32460OooOooO = null;
            }
        } while (c32460OooOooO != null);
        return C32460OooOooO.f116667OooO00o;
    }
}

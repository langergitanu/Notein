package o0O0oooO;

import kotlin.coroutines.Continuation;
import o0OOO00o.C26989OooO0Oo;
import o0OOO00o.C26990OooO0o0;
import oO00ooO.C32460OooOooO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.C33769Ooooo0o;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: loaded from: classes9.dex */
public final class o000O00 implements InterfaceC33721OooO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33721OooO0o f90318OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f90319OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object f90320OooOoO0;

    public /* synthetic */ o000O00(InterfaceC33721OooO0o interfaceC33721OooO0o, Object obj, int i) {
        this.f90319OooOo0o = i;
        this.f90318OooOo = interfaceC33721OooO0o;
        this.f90320OooOoO0 = obj;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO interfaceC33723OooO0oO, Continuation continuation) {
        switch (this.f90319OooOo0o) {
            case 0:
                Object objCollect = ((C33769Ooooo0o) this.f90318OooOo).f121747OooOo0o.collect(new o000Oo0(interfaceC33723OooO0oO, (C26320o0000OoO) this.f90320OooOoO0), continuation);
                if (objCollect != EnumC32485OooO00o.f116726OooOo0o) {
                    break;
                }
                break;
            default:
                Object objCollect2 = this.f90318OooOo.collect(new C26989OooO0Oo(interfaceC33723OooO0oO, (C26990OooO0o0) this.f90320OooOoO0), continuation);
                if (objCollect2 != EnumC32485OooO00o.f116726OooOo0o) {
                    break;
                }
                break;
        }
        return C32460OooOooO.f116667OooO00o;
    }
}

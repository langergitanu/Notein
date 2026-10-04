package o0o0OOO;

import kotlin.coroutines.Continuation;
import o0oOo0Oo.C30970OooO0o;
import oO00ooO.C32460OooOooO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.C33769Ooooo0o;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: loaded from: classes10.dex */
public final class o00000OO implements InterfaceC33721OooO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C33769Ooooo0o f109069OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f109070OooOo0o;

    public /* synthetic */ o00000OO(C33769Ooooo0o c33769Ooooo0o, int i) {
        this.f109070OooOo0o = i;
        this.f109069OooOo = c33769Ooooo0o;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO interfaceC33723OooO0oO, Continuation continuation) {
        switch (this.f109070OooOo0o) {
            case 0:
                Object objCollect = this.f109069OooOo.f121747OooOo0o.collect(new o00000O(interfaceC33723OooO0oO), continuation);
                if (objCollect != EnumC32485OooO00o.f116726OooOo0o) {
                    break;
                }
                break;
            default:
                Object objCollect2 = this.f109069OooOo.f121747OooOo0o.collect(new C30970OooO0o(interfaceC33723OooO0oO), continuation);
                if (objCollect2 != EnumC32485OooO00o.f116726OooOo0o) {
                    break;
                }
                break;
        }
        return C32460OooOooO.f116667OooO00o;
    }
}

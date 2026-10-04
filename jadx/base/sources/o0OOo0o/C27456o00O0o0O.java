package o0OOo0o;

import kotlin.coroutines.Continuation;
import o0Ooooo.C29692OooOooo;
import oO00ooO.C32460OooOooO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.C33769Ooooo0o;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: o0OOo0o.o00O0o0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27456o00O0o0O implements InterfaceC33721OooO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33721OooO0o f96100OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f96101OooOo0o;

    public /* synthetic */ C27456o00O0o0O(InterfaceC33721OooO0o interfaceC33721OooO0o, int i) {
        this.f96101OooOo0o = i;
        this.f96100OooOo = interfaceC33721OooO0o;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO interfaceC33723OooO0oO, Continuation continuation) {
        switch (this.f96101OooOo0o) {
            case 0:
                Object objCollect = ((o0OOO0OO.OooOo) this.f96100OooOo).collect(new C27454o00O0o0(interfaceC33723OooO0oO), continuation);
                if (objCollect != EnumC32485OooO00o.f116726OooOo0o) {
                    break;
                }
                break;
            default:
                Object objCollect2 = ((C33769Ooooo0o) this.f96100OooOo).f121747OooOo0o.collect(new C29692OooOooo(interfaceC33723OooO0oO), continuation);
                if (objCollect2 != EnumC32485OooO00o.f116726OooOo0o) {
                    break;
                }
                break;
        }
        return C32460OooOooO.f116667OooO00o;
    }
}

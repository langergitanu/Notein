package o0OOO00o;

import kotlin.coroutines.Continuation;
import o0O0oooO.o000O0;
import o0OOo0o.C27590o00ooOO0;
import oO00ooO.C32460OooOooO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.C33769Ooooo0o;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: loaded from: classes9.dex */
public final class OooOOO implements InterfaceC33721OooO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33721OooO0o f93869OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f93870OooOo0o;

    public /* synthetic */ OooOOO(InterfaceC33721OooO0o interfaceC33721OooO0o, int i) {
        this.f93870OooOo0o = i;
        this.f93869OooOo = interfaceC33721OooO0o;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO interfaceC33723OooO0oO, Continuation continuation) {
        switch (this.f93870OooOo0o) {
            case 0:
                Object objCollect = this.f93869OooOo.collect(new OooOOO0(interfaceC33723OooO0oO), continuation);
                if (objCollect != EnumC32485OooO00o.f116726OooOo0o) {
                    break;
                }
                break;
            case 1:
                Object objCollect2 = this.f93869OooOo.collect(new C27590o00ooOO0(interfaceC33723OooO0oO), continuation);
                if (objCollect2 != EnumC32485OooO00o.f116726OooOo0o) {
                    break;
                }
                break;
            default:
                Object objCollect3 = ((C33769Ooooo0o) this.f93869OooOo).f121747OooOo0o.collect(new o000O0(interfaceC33723OooO0oO), continuation);
                if (objCollect3 != EnumC32485OooO00o.f116726OooOo0o) {
                    break;
                }
                break;
        }
        return C32460OooOooO.f116667OooO00o;
    }
}

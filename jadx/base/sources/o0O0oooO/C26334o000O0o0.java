package o0O0oooO;

import kotlin.coroutines.Continuation;
import oO00ooO.C32460OooOooO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.C33769Ooooo0o;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: o0O0oooO.o000O0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26334o000O0o0 implements InterfaceC33721OooO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33721OooO0o f90348OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f90349OooOo0o;

    public /* synthetic */ C26334o000O0o0(InterfaceC33721OooO0o interfaceC33721OooO0o, int i) {
        this.f90349OooOo0o = i;
        this.f90348OooOo = interfaceC33721OooO0o;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO interfaceC33723OooO0oO, Continuation continuation) {
        switch (this.f90349OooOo0o) {
            case 0:
                Object objCollect = ((C33769Ooooo0o) this.f90348OooOo).f121747OooOo0o.collect(new o000O0O0(interfaceC33723OooO0oO), continuation);
                if (objCollect != EnumC32485OooO00o.f116726OooOo0o) {
                    break;
                }
                break;
            default:
                Object objCollect2 = this.f90348OooOo.collect(new o0OOO0O0.OooOO0(interfaceC33723OooO0oO), continuation);
                if (objCollect2 != EnumC32485OooO00o.f116726OooOo0o) {
                    break;
                }
                break;
        }
        return C32460OooOooO.f116667OooO00o;
    }
}

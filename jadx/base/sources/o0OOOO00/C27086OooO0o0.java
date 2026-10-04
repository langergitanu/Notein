package o0OOOO00;

import kotlin.coroutines.Continuation;
import o0o0O0o0.C30310OooOOo0;
import oO00ooO.C32460OooOooO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.C33769Ooooo0o;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: o0OOOO00.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27086OooO0o0 implements InterfaceC33721OooO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33721OooO0o f94344OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f94345OooOo0o;

    public /* synthetic */ C27086OooO0o0(InterfaceC33721OooO0o interfaceC33721OooO0o, int i) {
        this.f94345OooOo0o = i;
        this.f94344OooOo = interfaceC33721OooO0o;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO interfaceC33723OooO0oO, Continuation continuation) {
        switch (this.f94345OooOo0o) {
            case 0:
                Object objCollect = this.f94344OooOo.collect(new C27085OooO0Oo(interfaceC33723OooO0oO), continuation);
                if (objCollect != EnumC32485OooO00o.f116726OooOo0o) {
                    break;
                }
                break;
            default:
                Object objCollect2 = ((C33769Ooooo0o) this.f94344OooOo).f121747OooOo0o.collect(new C30310OooOOo0(interfaceC33723OooO0oO), continuation);
                if (objCollect2 != EnumC32485OooO00o.f116726OooOo0o) {
                    break;
                }
                break;
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
